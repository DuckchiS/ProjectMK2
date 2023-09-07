package com.example.projectfinal.repository;

import com.example.projectfinal.entity.Predict_Sale;
import com.example.projectfinal.entity.Sale_Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Predict_SaleRepository extends JpaRepository<Predict_Sale, Integer> {

}