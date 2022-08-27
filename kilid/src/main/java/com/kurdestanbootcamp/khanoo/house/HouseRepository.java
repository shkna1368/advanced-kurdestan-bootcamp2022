package com.kurdestanbootcamp.khanoo.house;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Geometry;
import org.geolatte.geom.Point;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface HouseRepository extends PagingAndSortingRepository<House,Long> {


    @Query("SELECT vl, distance(vl.location, ?1) as distance from House vl order by distance")
    List<Tuple> findAllWithDistance(Point<G2D> refPnt);


    @Query("SELECT vl from House vl where  distance(vl.location, ?1) < ?2")
    List<House> findAllWithDistance3(Point<G2D> refPnt, double dist);


    @Query("SELECT vl, distance(vl.location, ?1) as distance from House vl  order by distance" )
    List<Tuple> findNearest(Point<G2D> refPnt, Pageable page);


    @Query("SELECT v1 FROM House AS v1 WHERE  within(v1.location, :filter)=TRUE ")
    List<House> findWithin(@Param("filter") Geometry filter);
}
