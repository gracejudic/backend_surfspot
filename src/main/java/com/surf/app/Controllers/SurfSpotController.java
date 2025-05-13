package com.surf.app.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.surf.app.Models.SurfSpot;
import com.surf.app.Services.SurfSpotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
@RequestMapping("/api")
public class SurfSpotController {
    private final SurfSpotService surfSpotService;

    public SurfSpotController(SurfSpotService surfSpotService) {
        this.surfSpotService = surfSpotService;
    }

    @GetMapping("/spots/{id}")
    public SurfSpot getSurfSpotById(@PathVariable Long id) {
        return surfSpotService.getSurfSpotById(id);
    }
    
    @GetMapping("/spots")
    public List<SurfSpot> getALlSurfSpot() {
        return surfSpotService.getAllSurfSpot();
    }
    
}
