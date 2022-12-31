package com.dory.platformpiscicola.persistence.repository;

import com.dory.platformpiscicola.persistence.entity.Municipio;
import com.dory.platformpiscicola.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface MunicipioRepository extends CrudRepository<Municipio, Integer> {

    public ArrayList<Municipio> findMunicipioByIdDepartamento(int id);

}
