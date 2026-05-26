package com.example.parcial2_00026223.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class MagicProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "providerName")
    private String name;

    @Column(name = "type")
    private Enum type;


}
