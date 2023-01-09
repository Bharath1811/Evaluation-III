package com.masai.webapp.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.masai.webapp.example.entity.Fir;

@Repository
@EnableJpaRepositories
public interface FirRepository extends JpaRepository<Fir, Integer>{

}
