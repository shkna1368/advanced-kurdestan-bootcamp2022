package com.kurdestanbootcamp.khanoo.city;

import com.kurdestanbootcamp.khanoo.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CityDTO extends BaseDTO {



    @ApiModelProperty(required = true,hidden = false)
    private String title;






}
