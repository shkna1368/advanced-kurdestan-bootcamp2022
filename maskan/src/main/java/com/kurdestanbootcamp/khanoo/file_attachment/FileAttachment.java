package com.kurdestanbootcamp.khanoo.file_attachment;


import com.kurdestanbootcamp.khanoo.common.BaseEntity;
import com.kurdestanbootcamp.khanoo.house.House;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_file_attachments")
@Data
@Audited
public class FileAttachment extends BaseEntity {


    @NotNull
    @Column(name = "personal_image")
    private String personalImage;


    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;



}
