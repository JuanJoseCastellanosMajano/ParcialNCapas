package com.example.parcial2_00026223.services.impl;

import com.example.parcial2_00026223.domain.entities.MagicArticle;
import com.example.parcial2_00026223.domain.entities.MagicProvider;
import com.example.parcial2_00026223.repositories.MagicArticleRepository;
import com.example.parcial2_00026223.services.MagicArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class MagicArticleServiceImplementation implements MagicArticleService {
    private final MagicArticleRepository magicArticleRepository;


    @Override
    public void createArticle(MagicArticle magicArticle) {
        MagicArticleRepository.save(MagicArticle);
    }

    @Override
    public MagicArticle getMagicArticleByFilter(String name, MagicProvider magicProvider, Enum type, Double price) {
        return MagicArticleRepository.getMagicFilterBy;
    }

    @Override
    public MagicArticle getMagicArticleById(UUID id) {
        return null;
    }

    @Override
    public void updateMagicArticle(UUID id, MagicArticle magicArticle) {

        MagicArticle existMagicArticle = MagicArticleRepository.getMagicArticleById(id);
        existMagicArticle.setName(MagicArticle.getName());
        existMagicArticle.setPrice(MagicArticle.getPrice());
        existMagicArticle.setMagicProvider(MagicArticle.getMagicProvider);
        existMagicArticle.setType(MagicArticle.getType);
        MagicArticleRepository.save(existMagicArticle);
    }

    @Override
    public void deleteMagicArticleById(UUID id) {

    }
}
}
