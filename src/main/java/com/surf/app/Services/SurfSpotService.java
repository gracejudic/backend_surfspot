package com.surf.app.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.surf.app.Models.SurfSpot;
import com.surf.app.Repositories.SurfSpotRepository;


@Service
public class SurfSpotService {

    // return un spot 
    // return une listé dé spots
    private final SurfSpotRepository surfSpotRepository;

    public SurfSpotService(SurfSpotRepository surfSpotRepository) {
        this.surfSpotRepository = surfSpotRepository;
    }

    public SurfSpot getSurfSpotById(Long id) {
        return surfSpotRepository.findById(id).orElseThrow(()-> new RuntimeException("eeeuuuh"));
    }

    public List<SurfSpot> getAllSurfSpot() {
        return surfSpotRepository.findAll();
    }

    
}
