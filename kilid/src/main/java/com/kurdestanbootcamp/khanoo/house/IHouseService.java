package com.kurdestanbootcamp.khanoo.house;

import com.kurdestanbootcamp.khanoo.city.City;

import java.util.List;

public interface IHouseService {
    House save(House house);
    House update(House house);
    void delete(Long id);
    House getById(Long id);
    List<House> getAll();



}
