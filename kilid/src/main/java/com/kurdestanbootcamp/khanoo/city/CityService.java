package com.kurdestanbootcamp.khanoo.city;


import com.kurdestanbootcamp.khanoo.common.exception.NotFoundException;
import com.kurdestanbootcamp.khanoo.file_attachment.FileAttachment;
import com.kurdestanbootcamp.khanoo.file_attachment.FileAttachmentRepository;
import com.kurdestanbootcamp.khanoo.file_attachment.IFileAttchmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService implements ICityService {

  private  final CityRepository repository;




    @Override
    public City save(City city) {

        return repository.save(city);
    }


    @Override
    public void delete(Long id) {


        repository.deleteById(id);
    }

    @Override
    public City getById(Long id) {
        Optional<City> optionalCity=repository.findById(id);

        if (!optionalCity.isPresent()){

            throw new NotFoundException("Not Found");
        }


        return optionalCity.get();
    }

    @Override
    public List<City> getAll() {
        return (List<City>) repository.findAll();
    }




}
