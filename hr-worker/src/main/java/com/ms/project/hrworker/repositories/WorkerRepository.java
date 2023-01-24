package com.ms.project.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.project.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
