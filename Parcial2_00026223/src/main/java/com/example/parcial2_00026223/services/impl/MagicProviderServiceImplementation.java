package com.example.parcial2_00026223.services.impl;


import com.example.parcial2_00026223.domain.entities.MagicArticle;
import com.example.parcial2_00026223.domain.entities.MagicProvider;
import com.example.parcial2_00026223.repositories.MagicArticleRepository;
import com.example.parcial2_00026223.services.MagicProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MagicProviderServiceImplementation implements MagicProviderService {
    @Override
    public void createProvider(MagicProvider magicProvider) {
        MagicArticleRepository.save(MagicProvider);
    }

    @Override
    public MagicProvider getMagicProviderById(UUID id) {
        return null;
    }

    @Override
    public void updateMagicProviderById(UUID id MagicProvider magicprovider) {
        MagicProvider existMagicProvider =getMagicProviderById(id);
        existMagicProvider.setName(MagicProvider.getName());
        existMagicProvider.setPrice(Magicprovider.getType());
    }

    @Override
    public void deleteMagicArticleById(UUID id) {

    }
}
