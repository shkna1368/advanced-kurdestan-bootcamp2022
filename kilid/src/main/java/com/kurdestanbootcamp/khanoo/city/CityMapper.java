package com.kurdestanbootcamp.khanoo.city;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    City toCity(CityDTO cityDTO);
    CityDTO toCityDTO(City city);



    List<CityDTO> toCityDTOs(List<City> cities);

}
