package com.games.dao;

import java.util.List;

import com.games.model.Kart;




 
public interface KartDao {
 
    void saveKart(Kart kart);
     
    List<Kart> findAllKart();
     
    void deleteKartById(int kid );
     
    Kart findKartById(int kid);
     
    void updateKart(Kart kart);
}