package com.kpaydeveloper.aplikasiComplete.repositori;

import com.kpaydeveloper.aplikasiComplete.dto.entity.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
