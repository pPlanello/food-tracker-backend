package com.pplanello.foodtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "cooked_food")
public class CookedFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "createdOn", nullable = false)
    private LocalDateTime createdOn;

}
