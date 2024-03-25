/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khalilul.produk.service;

import com.khalilul.produk.entity.Produk;
import com.khalilul.produk.repository.ProdukRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author khalilulrahman
 */
@Service
public class ProdukService {
    @Autowired
    
    private ProdukRepository produkRepository;
    
    public List<Produk> getAll(){
        return produkRepository.findAll();
    }
    
    public void insert(Produk produk){
        produkRepository.save(produk);
    }

     public Produk getById(Long id) {
        Optional<Produk> produkOptional = produkRepository.findById(id);
        return produkOptional.orElse(null);
    }

    public void update(Long id, Produk produk) {
        produk.setId(id); 
        produkRepository.save(produk);
    }

    public void delete(Long id) {
        produkRepository.deleteById(id);
    }

    
}
