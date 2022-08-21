package com.kurdestanbootcamp.khanoo.city;

import com.kurdestanbootcamp.khanoo.file_attachment.FileAttachment;

import java.util.List;

public interface ICityService {
    City save(City city);
    void delete(Long id);
    City getById(Long id);
    List<City> getAll();



}
