package mcuca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nombre;

	private String apellidos;
	
	private String domicilio;
	
	private Integer telefono;

	protected Cliente() {
	}

	public Cliente(String nombre, String apellidos, String domicilio, Integer telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public Integer getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return String.format("Cliente[id=%d, nombre='%s', apellidos='%s', domicilio='%s', telefono=%d]", id,
				nombre, apellidos, domicilio, telefono);
	}

}
