package bo.gob.ruat.domain.Entity;

public class RolParametricaEntity {

    private String rol;
    private Long   numSecLogTrans;
    private String tipoInstitucion;
    private String codigoAplicacion;
    private String descripcion;
    private String nivelCriticidad;
    private String tipoHabilitacion;
    private int orden;
    private String estado;

    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Long getNumSecLogTrans() {
        return numSecLogTrans;
    }
    public void setNumSecLogTrans(Long numSecLogTrans) {
        this.numSecLogTrans = numSecLogTrans;
    }
    public String getTipoInstitucion() {
        return tipoInstitucion;
    }
    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
    public String getCodigoAplicacion() {
        return codigoAplicacion;
    }
    public void setCodigoAplicacion(String codigoAplicacion) {
        this.codigoAplicacion = codigoAplicacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNivelCriticidad() {
        return nivelCriticidad;
    }
    public void setNivelCriticidad(String nivelCriticidad) {
        this.nivelCriticidad = nivelCriticidad;
    }
    public String getTipoHabilitacion() {
        return tipoHabilitacion;
    }
    public void setTipoHabilitacion(String tipoHabilitacion) {
        this.tipoHabilitacion = tipoHabilitacion;
    }
    public int getOrden() {
        return orden;
    }
    public void setOrden(int orden) {
        this.orden = orden;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
