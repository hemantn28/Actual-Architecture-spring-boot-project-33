package com.example.demo.repository;

import com.example.demo.model.King;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KingRepository extends JpaRepository<King, Integer> {
}
