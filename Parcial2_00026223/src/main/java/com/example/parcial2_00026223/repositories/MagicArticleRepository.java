package com.example.parcial2_00026223.repositories;

import com.example.parcial2_00026223.domain.entities.MagicArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MagicArticleRepository extends JpaRepository<MagicArticle, UUID> {
}
