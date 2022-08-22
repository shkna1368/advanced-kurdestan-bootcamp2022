package com.kurdestanbootcamp.khanoo.city;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-22T06:48:27+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City toCity(CityDTO cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        City city = new City();

        city.setId( cityDTO.getId() );
        city.setVersion( cityDTO.getVersion() );
        city.setCreatedDate( cityDTO.getCreatedDate() );
        city.setCreatedBy( cityDTO.getCreatedBy() );
        city.setLastModifiedDate( cityDTO.getLastModifiedDate() );
        city.setLastModifiedBy( cityDTO.getLastModifiedBy() );
        city.setTitle( cityDTO.getTitle() );

        return city;
    }

    @Override
    public CityDTO toCityDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( city.getId() );
        cityDTO.setVersion( city.getVersion() );
        cityDTO.setCreatedDate( city.getCreatedDate() );
        cityDTO.setCreatedBy( city.getCreatedBy() );
        cityDTO.setLastModifiedDate( city.getLastModifiedDate() );
        cityDTO.setLastModifiedBy( city.getLastModifiedBy() );
        cityDTO.setTitle( city.getTitle() );

        return cityDTO;
    }

    @Override
    public List<CityDTO> toCityDTOs(List<City> cities) {
        if ( cities == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( cities.size() );
        for ( City city : cities ) {
            list.add( toCityDTO( city ) );
        }

        return list;
    }
}
