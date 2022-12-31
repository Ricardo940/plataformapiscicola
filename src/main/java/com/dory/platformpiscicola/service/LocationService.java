package com.dory.platformpiscicola.service;

import com.dory.platformpiscicola.persistence.entity.Municipio;
import com.dory.platformpiscicola.persistence.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private MunicipioRepository municipioRepository;

    public ArrayList<Municipio> getMunicipiosByDepartamento(int idDepartamento){
        return municipioRepository.findMunicipioByIdDepartamento(idDepartamento);
    }
}
