package com.ozmic.spockitdemo.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Movie {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

}
