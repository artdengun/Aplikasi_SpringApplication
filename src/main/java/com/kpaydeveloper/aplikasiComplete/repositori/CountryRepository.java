package com.kpaydeveloper.aplikasiComplete.repositori;

import com.kpaydeveloper.aplikasiComplete.dto.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
