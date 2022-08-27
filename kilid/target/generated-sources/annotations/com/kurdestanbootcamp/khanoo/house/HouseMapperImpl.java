package com.kurdestanbootcamp.khanoo.house;

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
public class HouseMapperImpl implements HouseMapper {

    @Override
    public House toHouse(HouseDTO houseDTO) {
        if ( houseDTO == null ) {
            return null;
        }

        House house = new House();

        house.setLocation( convertLocationDtoToLocation( houseDTO.getLocationDTO() ) );
        house.setId( houseDTO.getId() );
        house.setVersion( houseDTO.getVersion() );
        house.setCreatedDate( houseDTO.getCreatedDate() );
        house.setCreatedBy( houseDTO.getCreatedBy() );
        house.setLastModifiedDate( houseDTO.getLastModifiedDate() );
        house.setLastModifiedBy( houseDTO.getLastModifiedBy() );
        house.setBuildingDate( houseDTO.getBuildingDate() );
        house.setRoomCount( houseDTO.getRoomCount() );
        house.setMetrazh( houseDTO.getMetrazh() );
        house.setTabaqe( houseDTO.getTabaqe() );
        house.setVahed( houseDTO.getVahed() );
        house.setType( houseDTO.getType() );
        house.setCity( houseDTO.getCity() );

        return house;
    }

    @Override
    public HouseDTO toHouseDTO(House house) {
        if ( house == null ) {
            return null;
        }

        HouseDTO houseDTO = new HouseDTO();

        houseDTO.setLocationDTO( convertlLocationToLocationDTO( house.getLocation() ) );
        houseDTO.setId( house.getId() );
        houseDTO.setVersion( house.getVersion() );
        houseDTO.setCreatedDate( house.getCreatedDate() );
        houseDTO.setCreatedBy( house.getCreatedBy() );
        houseDTO.setLastModifiedDate( house.getLastModifiedDate() );
        houseDTO.setLastModifiedBy( house.getLastModifiedBy() );
        houseDTO.setBuildingDate( house.getBuildingDate() );
        houseDTO.setRoomCount( house.getRoomCount() );
        houseDTO.setMetrazh( house.getMetrazh() );
        houseDTO.setTabaqe( house.getTabaqe() );
        houseDTO.setVahed( house.getVahed() );
        houseDTO.setType( house.getType() );
        houseDTO.setCity( house.getCity() );

        return houseDTO;
    }

    @Override
    public List<HouseDTO> toHouseDTOS(List<House> houses) {
        if ( houses == null ) {
            return null;
        }

        List<HouseDTO> list = new ArrayList<HouseDTO>( houses.size() );
        for ( House house : houses ) {
            list.add( toHouseDTO( house ) );
        }

        return list;
    }

    @Override
    public List<House> toHouse(List<HouseDTO> houseDTOS) {
        if ( houseDTOS == null ) {
            return null;
        }

        List<House> list = new ArrayList<House>( houseDTOS.size() );
        for ( HouseDTO houseDTO : houseDTOS ) {
            list.add( toHouse( houseDTO ) );
        }

        return list;
    }
}
