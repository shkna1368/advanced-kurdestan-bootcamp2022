package com.kurdestanbootcamp.showin.file_attachment;


import com.kurdestanbootcamp.showin.common.BaseEntity;
import com.kurdestanbootcamp.showin.place.Place;
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
    @JoinColumn(name = "place_id")
    private Place place;



}
