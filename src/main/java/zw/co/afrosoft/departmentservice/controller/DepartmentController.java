package zw.co.afrosoft.departmentservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.departmentservice.domain.Department;
import zw.co.afrosoft.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentservice;
    @Autowired
    public DepartmentController(DepartmentService departmentservice) {
        this.departmentservice = departmentservice;
    }
    @PostMapping("/")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return new ResponseEntity<>(departmentservice.saveDepartment(department),
                HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside the findDepartmentById of the DepartmentController");
        return new ResponseEntity<>(departmentservice.getDepartmentById(departmentId),
                HttpStatus.FOUND);
    }
}
