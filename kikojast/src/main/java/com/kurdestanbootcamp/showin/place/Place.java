package com.kurdestanbootcamp.showin.place;


import com.kurdestanbootcamp.showin.common.BaseEntity;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_place")
@Data
@Audited
public class Place extends BaseEntity {




    @NotNull
    @Column(name = "title")
    private String title;




    @NotNull
    @Column(name = "start_service")
    private Integer startService;






    @NotNull
    @Column(name = "end_service")
    private Integer endService;



    @NotNull
    @Column(name = "address")
    private String address;



    @NotNull
    @Column(name = "type")
    @Enumerated
    private Type type;






    @Column(name = "place_location")
    private Point<G2D> location;









}
