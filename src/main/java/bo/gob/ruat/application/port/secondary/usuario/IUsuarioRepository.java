package bo.gob.ruat.application.port.secondary.usuario;

import bo.gob.ruat.domain.Entity.UsuarioEntity;

public interface IUsuarioRepository {
    UsuarioEntity getUsuario (Long numSecUsuario);
}
