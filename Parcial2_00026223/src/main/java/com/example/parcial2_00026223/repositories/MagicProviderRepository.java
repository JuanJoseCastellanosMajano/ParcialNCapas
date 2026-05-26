package com.example.parcial2_00026223.repositories;

import com.example.parcial2_00026223.domain.entities.MagicProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MagicProviderRepository extends JpaRepository<MagicProvider, UUID> {
}
