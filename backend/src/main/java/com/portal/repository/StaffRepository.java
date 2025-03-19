package com.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portal.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
