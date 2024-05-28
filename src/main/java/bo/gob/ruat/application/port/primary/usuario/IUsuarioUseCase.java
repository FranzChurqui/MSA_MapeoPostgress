package bo.gob.ruat.application.port.primary.usuario;

import bo.gob.ruat.domain.Entity.UsuarioEntity;

public interface IUsuarioUseCase {
    UsuarioEntity buscarUsuario (Long identificador);
}
