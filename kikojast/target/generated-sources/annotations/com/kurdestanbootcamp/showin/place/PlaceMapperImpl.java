package com.kurdestanbootcamp.showin.place;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-27T07:05:29+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class PlaceMapperImpl implements PlaceMapper {

    @Override
    public Place toHouse(PlaceDTO placeDTO) {
        if ( placeDTO == null ) {
            return null;
        }

        Place place = new Place();

        place.setLocation( convertLocationDtoToLocation( placeDTO.getLocationDTO() ) );
        place.setId( placeDTO.getId() );
        place.setVersion( placeDTO.getVersion() );
        place.setCreatedDate( placeDTO.getCreatedDate() );
        place.setCreatedBy( placeDTO.getCreatedBy() );
        place.setLastModifiedDate( placeDTO.getLastModifiedDate() );
        place.setLastModifiedBy( placeDTO.getLastModifiedBy() );
        place.setTitle( placeDTO.getTitle() );
        place.setStartService( placeDTO.getStartService() );
        place.setEndService( placeDTO.getEndService() );
        place.setAddress( placeDTO.getAddress() );
        place.setType( placeDTO.getType() );

        return place;
    }

    @Override
    public PlaceDTO toHouseDTO(Place place) {
        if ( place == null ) {
            return null;
        }

        PlaceDTO placeDTO = new PlaceDTO();

        placeDTO.setLocationDTO( convertlLocationToLocationDTO( place.getLocation() ) );
        placeDTO.setId( place.getId() );
        placeDTO.setVersion( place.getVersion() );
        placeDTO.setCreatedDate( place.getCreatedDate() );
        placeDTO.setCreatedBy( place.getCreatedBy() );
        placeDTO.setLastModifiedDate( place.getLastModifiedDate() );
        placeDTO.setLastModifiedBy( place.getLastModifiedBy() );
        placeDTO.setTitle( place.getTitle() );
        placeDTO.setStartService( place.getStartService() );
        placeDTO.setEndService( place.getEndService() );
        placeDTO.setAddress( place.getAddress() );
        placeDTO.setType( place.getType() );

        return placeDTO;
    }

    @Override
    public List<PlaceDTO> toHouseDTOS(List<Place> places) {
        if ( places == null ) {
            return null;
        }

        List<PlaceDTO> list = new ArrayList<PlaceDTO>( places.size() );
        for ( Place place : places ) {
            list.add( toHouseDTO( place ) );
        }

        return list;
    }

    @Override
    public List<Place> toHouse(List<PlaceDTO> placeDTOS) {
        if ( placeDTOS == null ) {
            return null;
        }

        List<Place> list = new ArrayList<Place>( placeDTOS.size() );
        for ( PlaceDTO placeDTO : placeDTOS ) {
            list.add( toHouse( placeDTO ) );
        }

        return list;
    }
}
