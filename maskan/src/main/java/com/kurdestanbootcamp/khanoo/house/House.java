package com.kurdestanbootcamp.khanoo.house;


import com.kurdestanbootcamp.khanoo.city.City;
import com.kurdestanbootcamp.khanoo.common.BaseEntity;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name = "tbl_file_house")
@Data
@Audited
public class House extends BaseEntity {



    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "buildingDate")
    private Date buildingDate;

    @NotNull
    @Column(name = "last_license_image")
    private Integer roomCount;


    @NotNull
    @Column(name = "metrazh")
    private Integer metrazh;




    @NotNull
    @Column(name = "tabaqe")
    private Integer tabaqe;


    @NotNull
    @Column(name = "vahed")
    private Integer vahed;




    @NotNull
    @Column(name = "type")
    @Enumerated
    private Type type;


    @Column(name = "adv_location")
    private Point<G2D> location;



   @ManyToOne
    private City city;







}
