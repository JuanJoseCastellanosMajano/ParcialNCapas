package com.example.parcial2_00026223.services;

import com.example.parcial2_00026223.domain.entities.MagicArticle;
import com.example.parcial2_00026223.domain.entities.MagicProvider;

import java.util.List;
import java.util.UUID;

public interface MagicProviderService {

    void createProvider(MagicProvider magicProvider);

    MagicProvider getMagicProviderById(UUID id);

    void updateMagicProviderById(UUID id);

    void deleteMagicArticleById(UUID id);


}
