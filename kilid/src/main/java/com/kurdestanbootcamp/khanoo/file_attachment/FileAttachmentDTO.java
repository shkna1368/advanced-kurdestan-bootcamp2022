package com.kurdestanbootcamp.khanoo.file_attachment;



import com.kurdestanbootcamp.khanoo.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class FileAttachmentDTO extends BaseDTO {



    @ApiModelProperty(required = true,hidden = false)
    private String personalImage;


    @ApiModelProperty(required = true,hidden = false)
    private String lastLicenseImage;


    /*@ApiModelProperty(required = true,hidden = false)
    private EmployeeDTO employee;*/



}
