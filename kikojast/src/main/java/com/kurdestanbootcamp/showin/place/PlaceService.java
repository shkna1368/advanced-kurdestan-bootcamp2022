package com.kurdestanbootcamp.showin.place;

import com.kurdestanbootcamp.showin.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlaceService implements IPlaceService {

  private  final PlaceRepository repository;

    @Override
    public Place save(Place place) {



        return repository.save(place);
    }

    @Override
    public Place update(Place place) {
      Place lastPlace=  getById(place.getId());

      lastPlace.setType(place.getType());
      lastPlace.setEndService(place.getEndService());
      lastPlace.setAddress(place.getAddress());
      lastPlace.setTitle(place.getTitle());
      lastPlace.setLocation(place.getLocation());






        return repository.save(lastPlace);
    }


    @Override
    public void delete(Long id) {


        repository.deleteById(id);
    }

    @Override
    public Place getById(Long id) {
        Optional<Place> optionalHouse=repository.findById(id);

        if (!optionalHouse.isPresent()){

            throw new NotFoundException("Not Found");
        }


        return optionalHouse.get();
    }

    @Override
    public List<Place> getAll() {
        return (List<Place>) repository.findAll();
    }




}
