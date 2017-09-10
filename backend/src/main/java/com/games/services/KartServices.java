package com.games.services;

import java.util.List;

import com.games.model.Kart;
public interface KartServices {

	void saveKart(Kart kart);
	
	
	
	List<Kart> findAllKart();
	 
    void deleteKartById(int kid);
 
    Kart findKartById(int kid);
 
    void updateKart(Kart kart);
}
	
