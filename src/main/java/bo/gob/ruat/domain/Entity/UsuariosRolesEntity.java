package bo.gob.ruat.domain.Entity;

public class UsuariosRolesEntity {
    private Long numSec;
    private Long numSecEntUsuario;
    private String rolEnpRol;
    private String estado;
    public Long getNumSec() {
        return numSec;
    }
    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }
    public Long getNumSecEntUsuario() {
        return numSecEntUsuario;
    }
    public void setNumSecEntUsuario(Long numSecEntUsuario) {
        this.numSecEntUsuario = numSecEntUsuario;
    }
    public String getRolEnpRol() {
        return rolEnpRol;
    }
    public void setRolEnpRol(String rolEnpRol) {
        this.rolEnpRol = rolEnpRol;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    

}
