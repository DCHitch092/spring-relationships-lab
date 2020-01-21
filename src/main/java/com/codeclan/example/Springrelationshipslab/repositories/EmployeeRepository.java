package com.codeclan.example.Springrelationshipslab.repositories;

import com.codeclan.example.Springrelationshipslab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
