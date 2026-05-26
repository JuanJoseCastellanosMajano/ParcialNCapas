package com.example.parcial2_00026223.services;

import com.example.parcial2_00026223.domain.entities.MagicArticle;
import com.example.parcial2_00026223.domain.entities.MagicProvider;

import java.util.UUID;

public interface MagicArticleService {

    void createArticle(MagicArticle magicArticle);

    MagicArticle getMagicArticleByFilter(String name, MagicProvider magicProvider, Enum type, Double price);

    MagicArticle getMagicArticleById(UUID id);

    void updateMagicArticle(UUID id, MagicArticle magicArticle);

    void deleteMagicArticleById(UUID id);
}
