package com.investree.demo.repository;

import com.investree.demo.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepo extends JpaRepository<Transaksi,Long> {
}
