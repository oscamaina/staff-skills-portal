package com.portal.controller;

import com.portal.model.Staff;
import com.portal.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    private final StaffRepository repository;

    public StaffController(StaffRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return repository.findAll();
    }

    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return repository.save(staff);
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staffDetails) {
        return repository.findById(id).map(staff -> {
            staff.setFullName(staffDetails.getFullName());
            staff.setEmail(staffDetails.getEmail());
            return repository.save(staff);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
