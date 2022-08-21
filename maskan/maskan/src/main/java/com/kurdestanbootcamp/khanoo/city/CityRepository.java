package com.kurdestanbootcamp.khanoo.city;

import com.kurdestanbootcamp.khanoo.house.House;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City,Long> {


}
