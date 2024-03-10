package com.example.pma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pma.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // This interface inherits basic CRUD operations from JpaRepository
    // You can add custom query methods here if needed
}
