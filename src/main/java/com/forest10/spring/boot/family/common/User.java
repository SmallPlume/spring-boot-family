package com.forest10.spring.boot.family.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author Forest10
 * @date 2018/10/23 14:04
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class User implements Serializable {

    private String name;
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CreateTime;
    private LocalDate dTime;

}
