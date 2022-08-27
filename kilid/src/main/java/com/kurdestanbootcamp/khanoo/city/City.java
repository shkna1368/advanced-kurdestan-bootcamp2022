package com.kurdestanbootcamp.khanoo.city;


import com.kurdestanbootcamp.khanoo.common.BaseEntity;
import com.kurdestanbootcamp.khanoo.house.Type;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name = "tbl_file_city")
@Data
@Audited
public class City extends BaseEntity {


    @NotNull
    @Column(name = "title")
    private String title;







}
