package com.example.backend.Controller.Services;

import com.example.backend.Model.Entities.*;
import com.example.backend.Model.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    
    public Optional<Sale> findSaleById(Long id) {
        return saleRepository.findById(id);
    }

    public List<Sale> findAllSales() {
        return saleRepository.findAll();
    }

    public Sale createSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public Sale updateSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }
}
