package zw.co.afrosoft.departmentservice.service;

import org.springframework.http.ResponseEntity;
import zw.co.afrosoft.departmentservice.domain.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
