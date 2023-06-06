package com.pranav.ApplicationSpringboot.Service;

import com.pranav.ApplicationSpringboot.Entity.Department;
import com.pranav.ApplicationSpringboot.Error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

    public List<Department> fetchDepartmentByName(String departmentName);
}
