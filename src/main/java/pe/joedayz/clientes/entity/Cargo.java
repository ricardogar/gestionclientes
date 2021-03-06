package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Cargos")
@NamedQueries({
		@NamedQuery(name = "Cargo.findAll", query = "SELECT t FROM Cargo t")})
public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "Codigo")
	private Short codigo;
	@Column(name = "Descripcion")
	private String descripcion;

	public Cargo() {
	}

	public Cargo(Short codigo) {
		this.codigo = codigo;
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Cargo)) {
			return false;
		}
		Cargo other = (Cargo) object;
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Cargo[ codigo=" + codigo + " ]";
	}

}
