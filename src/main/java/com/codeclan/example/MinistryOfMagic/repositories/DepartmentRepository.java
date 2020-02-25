package com.codeclan.example.MinistryOfMagic.repositories;


import com.codeclan.example.MinistryOfMagic.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
