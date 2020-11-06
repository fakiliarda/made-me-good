package com.yaf.mademegood.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author arda.fakili
 * @date 4.11.2020 15:22
 */

@Entity
@Table(name = "disease")
@ToString
public class Disease {


    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @NonNull
    private String name;

    @Getter
    @Setter
    @NonNull
    private String declaration;

    @Getter
    @Setter
    @NonNull
    private String category;

    @Getter
    @Setter
    private String explanation;





}
