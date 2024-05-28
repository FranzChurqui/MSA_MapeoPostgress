package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ent_usuarios", schema = "hexagonal_schema", catalog="hexagonal")
public class UsuarioJPA extends PanacheEntityBase{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ent_usuario_sec")
	@SequenceGenerator(name = "ent_usuario_sec", schema = "hexagonal_schema", sequenceName = "ent_usuario_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec; 

	@Column(name = "login", nullable = false, length = 30)
	private String login;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

    @Column(name = "primer_apellido", nullable = false, length = 50)
	private String primerApellido;

    @Column(name = "segundo_apellido", nullable = false, length = 50)
	private String segundoApellido;

	@Column(name = "doc_identidad", nullable = false, length = 13)
	private String docIdentidad;

    @Column(name = "tipo_documento", nullable = true, length = 3)
	private String tipoDocumento;

    @Column(name = "expedido", nullable = true, length = 2)
	private String expedido;

    @Column(name = "tipo_usuario", nullable = true, length = 50)
	private String tipoUsuario;

    @Column(name = "tipo_institucion", nullable = true, length = 50)
	private String tipoInstitucion;

    @Column(name= "correo_electronico", nullable = true, length = 50)
    private String correoElectronico;
    
    @Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;

    @Column(name = "celular", nullable = true, length = 8)
	private String celular;

    @Column(name = "fecha_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;

    @Column(name = "estado", nullable = false, length=2)
	private String estado;

    @OneToMany(mappedBy = "usuarioJPA", fetch = FetchType.LAZY)
    private Collection <UsuarioRolJPA> usuarioRolByNsec;

   

    public Long getNumSec() {
        return numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getExpedido() {
        return expedido;
    }

    public void setExpedido(String expedido) {
        this.expedido = expedido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    public UsuarioJPA() {
    }

    public UsuarioJPA(Long numSec, String login, String nombre, String primerApellido, String segundoApellido,
            String docIdentidad, String tipoDocumento, String expedido, String tipoUsuario, String tipoInstitucion,
            String correoElectronico, LocalDateTime fecha, String celular, LocalDate fechaNacimiento, String estado) {
        this.numSec = numSec;
        this.login = login;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.docIdentidad = docIdentidad;
        this.tipoDocumento = tipoDocumento;
        this.expedido = expedido;
        this.tipoUsuario = tipoUsuario;
        this.tipoInstitucion = tipoInstitucion;
        this.correoElectronico = correoElectronico;
        this.fecha = fecha;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }



    

}
