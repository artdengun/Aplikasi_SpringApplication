package com.kpaydeveloper.aplikasiComplete.repositori;

import com.kpaydeveloper.aplikasiComplete.dto.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
