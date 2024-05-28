package bo.gob.ruat.infrastructure.adapter.primary.rest.Usuario.dto.response;

public class UsuarioResponse {
    private String  login;
    private String nombresApellidos;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getNombresApellidos() {
        return nombresApellidos;
    }
    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }
    public UsuarioResponse() {
    }

    

}
