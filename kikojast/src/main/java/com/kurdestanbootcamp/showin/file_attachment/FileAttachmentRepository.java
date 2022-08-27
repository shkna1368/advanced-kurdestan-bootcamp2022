package com.kurdestanbootcamp.showin.file_attachment;


import com.kurdestanbootcamp.showin.place.Place;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileAttachmentRepository extends PagingAndSortingRepository<FileAttachment,Long> {

FileAttachment findByPlace(Place place);
}
