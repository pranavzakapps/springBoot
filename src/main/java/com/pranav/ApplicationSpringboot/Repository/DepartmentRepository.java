package com.pranav.ApplicationSpringboot.Repository;

import com.pranav.ApplicationSpringboot.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public Department findByDepartmentName(String departmentName);

    public List<Department> findByDepartmentNameIgnoreCase(String departmentName);
}
