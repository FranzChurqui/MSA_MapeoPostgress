package bo.gob.ruat.infrastructure.adapter.primary.rest.Usuario.dto;

import java.io.IOException;

import bo.gob.ruat.application.port.primary.usuario.IUsuarioUseCase;
import bo.gob.ruat.domain.Entity.UsuarioEntity;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("usuarios/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioRest {
    @Inject
    IUsuarioUseCase iUsuarioUseCase;
 
    @GET
    @Path("/consulta-usuario")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response buscarUsuario(@QueryParam("identificador") Long pIdentificador){

        //UsuarioEntity usuarioEntity = iUsuarioUseCase.buscarUsuario(pIdentificador);
        return Response.ok(null).build();


    }
}