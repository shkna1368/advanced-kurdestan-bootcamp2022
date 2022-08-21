package com.kurdestanbootcamp.khanoo.house;

import com.kurdestanbootcamp.khanoo.city.ICityService;
import com.kurdestanbootcamp.khanoo.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HouseService implements IHouseService{

  private  final HouseRepository repository;
  private  final ICityService cityService;




    @Override
    public House save(House house) {

        house.setCity(cityService.getById(house.getCity().getId()));

        return repository.save(house);
    }

    @Override
    public House update(House house) {

         House lastHouse=getById(house.getId());

         lastHouse.setCity(cityService.getById(house.getCity().getId()));
         lastHouse.setType(house.getType());
         lastHouse.setTabaqe(house.getTabaqe());
         lastHouse.setMetrazh(house.getMetrazh());
         lastHouse.setRoomCount(house.getRoomCount());
         lastHouse.setBuildingDate(house.getBuildingDate());



        return repository.save(lastHouse);
    }


    @Override
    public void delete(Long id) {


        repository.deleteById(id);
    }

    @Override
    public House getById(Long id) {
        Optional<House> optionalHouse=repository.findById(id);

        if (!optionalHouse.isPresent()){

            throw new NotFoundException("Not Found");
        }


        return optionalHouse.get();
    }

    @Override
    public List<House> getAll() {
        return (List<House>) repository.findAll();
    }




}
