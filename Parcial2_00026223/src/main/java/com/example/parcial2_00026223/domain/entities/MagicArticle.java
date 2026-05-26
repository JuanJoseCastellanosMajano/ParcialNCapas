package com.example.parcial2_00026223.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;
import java.util.UUID;

@Entity
@Table(name = "magic_article")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MagicArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "articleName")
    private String name;

    @Column(name = "type")
    private Type;

    @Column(name = "price")
    private Double price;

    @Column(name = "provider")
    private MagicProvider magicProvider;



}
