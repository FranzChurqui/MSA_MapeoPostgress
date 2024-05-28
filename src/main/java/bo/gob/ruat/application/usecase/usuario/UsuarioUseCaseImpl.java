package bo.gob.ruat.application.usecase.usuario;

import bo.gob.ruat.application.port.primary.usuario.IUsuarioUseCase;
import bo.gob.ruat.application.port.secondary.usuario.IUsuarioRepository;
import bo.gob.ruat.domain.Entity.UsuarioEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@RequestScoped
public class UsuarioUseCaseImpl implements IUsuarioUseCase{
    
    @Inject 
    IUsuarioRepository iUsuarioRepository;
    
    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public UsuarioEntity buscarUsuario(Long identificador) {
         
        UsuarioEntity vUsuarioEntity = iUsuarioRepository.getUsuario(identificador);       
        return vUsuarioEntity;
    }
   
}