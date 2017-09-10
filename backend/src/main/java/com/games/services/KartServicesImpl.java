package com.games.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.dao.KartDao;
import com.games.model.Kart;
 

 
@Service("kartServicesImpl")
@Transactional
public  class KartServicesImpl implements KartServices{
 
    @Autowired
    private KartDao kartdao; 
     
    public void saveKart(Kart kart) {
        kartdao.saveKart(kart);
    }
 
    public List<Kart> findAllKart() {
        return kartdao.findAllKart();
    }
 
    public void deleteKartById(int kid) {
        kartdao.deleteKartById(kid);
    }

	
	public Kart findKartById(int kid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateKart(Kart kart) {
		// TODO Auto-generated method stub
		
	}
}