package com.kurdestanbootcamp.khanoo.file_attachment;


import com.kurdestanbootcamp.khanoo.house.House;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileAttachmentRepository extends PagingAndSortingRepository<FileAttachment,Long> {

FileAttachment findByHouse(House house);
}
