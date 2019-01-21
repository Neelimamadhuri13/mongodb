package com.stackroute.MuzixApplicationTest1.domain;

import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.lang.annotation.Documented;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Tracks")
public class Track {
    @Id
    @ApiModelProperty(notes = "The database generated track Id")
    private int id;
    @ApiModelProperty(notes = "Name of track")
    private String name;
    @ApiModelProperty(notes = "Comment of track")
    private String comments;

}
