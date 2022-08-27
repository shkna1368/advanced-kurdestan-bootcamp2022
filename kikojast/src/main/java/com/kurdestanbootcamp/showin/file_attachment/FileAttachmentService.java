package com.kurdestanbootcamp.showin.file_attachment;

import com.kurdestanbootcamp.showin.common.exception.NotFoundException;
import com.kurdestanbootcamp.showin.place.Place;
import com.kurdestanbootcamp.showin.place.IPlaceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FileAttachmentService implements IFileAttchmentService {

  private  final FileAttachmentRepository repository;
  private  final IPlaceService placeService;


    @Override
    public FileAttachment save(FileAttachment fileAttachment) {
     Long houseId=  fileAttachment.getPlace().getId();
     Place place =  placeService.getById(houseId);
     fileAttachment.setPlace(place);
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
    public FileAttachment getByPlaceId(Long empId) {

      Place place =  placeService.getById(empId);
        return repository.findByPlace(place);
    }


}
