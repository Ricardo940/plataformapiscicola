package com.dory.platformpiscicola.controller;

import com.dory.platformpiscicola.persistence.entity.Municipio;
import com.dory.platformpiscicola.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/municipios/{idDepartamento}")
    public List<Municipio> getMunicipios(@PathVariable int idDepartamento){
        return locationService.getMunicipiosByDepartamento(idDepartamento);
    }
}
