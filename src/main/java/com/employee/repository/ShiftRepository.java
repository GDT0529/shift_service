package com.employee.repository;

import com.employee.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource
public interface ShiftRepository extends JpaRepository<Shift, Long> {
    // Expose a search method to find products by name at /shiftTimes/search/findByUserId?userId=example
    @RestResource(path = "findByUserId")
    List<Shift> findByUserId(@Param("userId") Long userId);
}
