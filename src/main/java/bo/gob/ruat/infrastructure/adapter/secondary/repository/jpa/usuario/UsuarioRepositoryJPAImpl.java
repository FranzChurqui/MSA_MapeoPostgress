package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.usuario;


import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.UsuarioJPA;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepositoryJPAImpl implements PanacheRepository <UsuarioJPA> {

}
