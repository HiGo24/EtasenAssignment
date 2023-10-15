package com.TickerData.EtasensAssignment.repository;

import com.TickerData.EtasensAssignment.model.TickerMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerRepository extends JpaRepository<TickerMain,Integer>
{


}
