package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ent_usuarios_roles", schema="hexagonal_schema", catalog="hexagonal")
public class UsuarioRolJPA extends PanacheEntityBase {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ent_usuario_rol_sec")
	@SequenceGenerator(name = "ent_usuario_rol_sec", schema = "hexagonal_schema", sequenceName = "ent_usuario_rol_sec", initialValue = 1000, allocationSize = 1)    
    @Id
    @Column(name = "num_sec", nullable = false)
    private long numsec;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="nsec_ent_usuario", referencedColumnName = "num_sec" , nullable = false)
    private UsuarioJPA usuarioJPA;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="rol_enp_rol", referencedColumnName = "rol" , nullable = false)
    private RolJPA rolJPA;

    @Column(name="estado", nullable = false, length=2)
    private String estado;

    public long getNumsec() {
        return numsec;
    }

    public void setNumsec(long numsec) {
        this.numsec = numsec;
    }

    public UsuarioJPA getUsuarioJPA() {
        return usuarioJPA;
    }

    public void setUsuarioJPA(UsuarioJPA usuarioJPA) {
        this.usuarioJPA = usuarioJPA;
    }

    public RolJPA getRolJPA() {
        return rolJPA;
    }

    public void setRolJPA(RolJPA rolJPA) {
        this.rolJPA = rolJPA;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public UsuarioRolJPA() {
    }

    public UsuarioRolJPA(long numsec, UsuarioJPA usuarioJPA, RolJPA rolJPA, String estado) {
        this.numsec = numsec;
        this.usuarioJPA = usuarioJPA;
        this.rolJPA = rolJPA;
        this.estado = estado;
    }




}
