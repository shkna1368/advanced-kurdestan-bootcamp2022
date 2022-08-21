package com.kurdestanbootcamp.khanoo.file_attachment;

import com.kurdestanbootcamp.khanoo.common.exception.NotFoundException;
import com.kurdestanbootcamp.khanoo.house.House;
import com.kurdestanbootcamp.khanoo.house.IHouseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FileAttachmentService implements IFileAttchmentService {

  private  final FileAttachmentRepository repository;
  private  final IHouseService houseService;



    @Override
    public FileAttachment save(FileAttachment fileAttachment) {
     Long houseId=  fileAttachment.getHouse().getId();
     House house=  houseService.getById(houseId);
     fileAttachment.setHouse(house);
        return repository.save(fileAttachment);
    }


    @Override
    public void delete(Long id) {


        repository.deleteById(id);
    }

    @Override
    public FileAttachment getById(Long id) {
        Optional<FileAttachment> optionalFileAttachment=repository.findById(id);

        if (!optionalFileAttachment.isPresent()){

            throw new NotFoundException("Not Found");
        }


        return optionalFileAttachment.get();
    }

    @Override
    public List<FileAttachment> getAll() {
        return (List<FileAttachment>) repository.findAll();
    }

    @Override
    public FileAttachment getByEmployeeId(Long empId) {

      House house=  houseService.getById(empId);
        return repository.findByHouse(house);
    }


}
