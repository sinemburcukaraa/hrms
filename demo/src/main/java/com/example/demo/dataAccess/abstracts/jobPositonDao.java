package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.concretes.jobposition;

public interface jobPositonDao extends JpaRepository<jobposition, Integer>{

}
