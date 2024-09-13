package com.employee.repository;

import com.employee.entity.ShiftRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource
public interface ShiftRecordRepository extends JpaRepository<ShiftRecord, Long> {
}
