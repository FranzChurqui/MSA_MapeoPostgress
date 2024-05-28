package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.util.Collection;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="enp_roles", schema="hexagonal_schema", catalog="hexagonal")
public class RolJPA extends PanacheEntityBase{
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name="rol", nullable = false, length = 30)
    private String rol;

    @Column (name="nsec_ent_log_trans", nullable = false)
    private Long secuenciaUsuario;

    @Column(name="tipo_institucion", nullable = false, length=50)
    private String tipoInstitucion;

    @Column(name="cod_aplicacion", nullable= false, length=50)
    private String codigoAplicacion;

    @Column(name="descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name="nivel_criticidad", nullable = false, length = 2)
    private String nivelCriticidad;

    @Column(name="habilitacion_menu", nullable = false, length = 2)
    private String habilitacionMenu;

    @Column(name="tipo_habilitacion", nullable= false, length = 2)
    private String tipoHabilitacion;

    @Column(name = "orden", nullable =false)
    private short orden;

    @Column(name ="estado", nullable = false, length = 2)
    private String estado;

    @OneToMany(mappedBy = "rolJPA", fetch = FetchType.LAZY)
    private Collection <UsuarioRolJPA> UsuarioRolByNumSec;


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getSecuenciaUsuario() {
        return secuenciaUsuario;
    }

    public void setSecuenciaUsuario(Long secuenciaUsuario) {
        this.secuenciaUsuario = secuenciaUsuario;
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

    public String getHabilitacionMenu() {
        return habilitacionMenu;
    }

    public void setHabilitacionMenu(String habilitacionMenu) {
        this.habilitacionMenu = habilitacionMenu;
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

    public void setOrden(short orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public RolJPA() {
    }

    public RolJPA(String rol, Long secuenciaUsuario, String tipoInstitucion, String codigoAplicacion,
            String descripcion, String nivelCriticidad, String habilitacionMenu, String tipoHabilitacion, short orden,
            String estado) {
        this.rol = rol;
        this.secuenciaUsuario = secuenciaUsuario;
        this.tipoInstitucion = tipoInstitucion;
        this.codigoAplicacion = codigoAplicacion;
        this.descripcion = descripcion;
        this.nivelCriticidad = nivelCriticidad;
        this.habilitacionMenu = habilitacionMenu;
        this.tipoHabilitacion = tipoHabilitacion;
        this.orden = orden;
        this.estado = estado;
    }


    

}
