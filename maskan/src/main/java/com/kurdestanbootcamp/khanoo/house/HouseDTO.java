package com.kurdestanbootcamp.khanoo.house;

import com.kurdestanbootcamp.khanoo.city.City;
import com.kurdestanbootcamp.khanoo.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class HouseDTO extends BaseDTO {



    @ApiModelProperty(required = true,hidden = false)
    private Date buildingDate;

    @ApiModelProperty(required = true,hidden = false)
    private Integer roomCount;


    @ApiModelProperty(required = true,hidden = false)
    private Integer metrazh;



    @ApiModelProperty(required = true,hidden = false)
    private Integer tabaqe;

    @ApiModelProperty(required = true,hidden = false)
    private Integer vahed;



    @ApiModelProperty(required = true,hidden = false)
    private Type type;



    @ApiModelProperty(required = true,hidden = false)
    private City city;



    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;




}
