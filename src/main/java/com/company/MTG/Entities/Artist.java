package com.company.MTG.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @Getter @Setter
    @Column(name = "artist_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @Column(name="first_name")
    private String firstName;

    @Getter @Setter
    @Column(name="last_name")
    private String lastName;

}
