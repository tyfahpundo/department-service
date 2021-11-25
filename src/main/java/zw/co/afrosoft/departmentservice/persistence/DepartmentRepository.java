package zw.co.afrosoft.departmentservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.departmentservice.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
