package com.kurdestanbootcamp.khanoo.house;


import com.kurdestanbootcamp.khanoo.city.CityMapper;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Geometries;
import org.geolatte.geom.Point;
import org.geolatte.geom.crs.CoordinateReferenceSystems;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = CityMapper.class)
public interface HouseMapper {



    @Mappings({
            @Mapping(source = "locationDTO", target = "location", qualifiedByName = "locationDtoToLocation")})
    House toHouse(HouseDTO houseDTO);

    @Mappings({
            @Mapping(source = "location", target = "locationDTO", qualifiedByName = "locationToLocationDTO")})
    HouseDTO toHouseDTO(House house);

    List<HouseDTO> toHouseDTOS(List<House> houses);

    List<House> toHouse(List<HouseDTO> houseDTOS);






    @Named("locationDtoToLocation")
    default  Point<G2D> convertLocationDtoToLocation(LocationDTO locationDTO) {
        Point<G2D> candidPoint= Geometries.mkPoint(new G2D(locationDTO.getLng(), locationDTO.getLat()), CoordinateReferenceSystems.WGS84);
       return  candidPoint;
    }

 @Named("locationToLocationDTO")
    default  LocationDTO  convertlLocationToLocationDTO(Point<G2D> point) {
        G2D g2D=   point.getPosition();
       LocationDTO locationDTO=new LocationDTO();
       locationDTO.setLat(g2D.getLat());
       locationDTO.setLng(g2D.getLon());
       return  locationDTO;
    }



}
