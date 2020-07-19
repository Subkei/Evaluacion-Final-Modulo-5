package cl.awakelab.ultimoproyecto.modelo;

import javax.persistence.*;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLI_SEQ")
    @SequenceGenerator(sequenceName = "cliente_seq", allocationSize = 1, name = "CLI_SEQ")
	
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "telefono", nullable = true)
	private int telefono;

	@Column(name = "correoelectronico", nullable = true)
	private String correoelectronico;

	@Column(name = "rubro", nullable = true)
	private String rubro;

	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	public Cliente() {
		super();
	}

	public Cliente(int id,String nombre, int telefono, String correoelectronico, String rubro,
			String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	
	public String getRubro() {
		return rubro;
	}
	
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correoelectronico=" + correoelectronico + ", rubro=" + rubro + ", direccion=" + direccion + "]";
	}
	
	
	
}
