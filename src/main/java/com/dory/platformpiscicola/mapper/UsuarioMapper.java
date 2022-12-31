package com.dory.platformpiscicola.mapper;

import com.dory.platformpiscicola.controller.dto.UsuarioRegisterDTO;
import com.dory.platformpiscicola.persistence.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "apellidos", target = "apellidos"),
            @Mapping(source = "idTipoUsuario", target = "idTipoUsuario")
    })
    Usuario userRegisterDTOToUser(UsuarioRegisterDTO userRegisterDTO);
}
