package com.kpaydeveloper.aplikasiComplete.repositori;

import com.kpaydeveloper.aplikasiComplete.dto.entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
