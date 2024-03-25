/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.khalilul.pembayaran.repository;

import com.khalilul.pembayaran.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author khalilulrahman
 */
@Repository
public interface PembayaranRepositori extends JpaRepository<Pembayaran, Long> {
}
