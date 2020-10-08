package com.kpaydeveloper.aplikasiComplete.repositori;

import com.kpaydeveloper.aplikasiComplete.dto.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
