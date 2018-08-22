package io.swagger.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.model.Sede;


@Entity
@Table(name = "sede")
public class SedeHb implements Serializable{
	
	/**
	 * 
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="nombresede")
	private String nombreSede;
	
	@Column(name ="direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name ="avatar")
	private String avatar;
	
	@Column(name = "activacion")
	private Boolean activacion;
		
	public SedeHb() {}	
	
	public SedeHb(Sede sede) {
		this.id = sede.getId();
		this.nombreSede = sede.getNombreSede();
		this.direccion = sede.getDireccion();
		this.telefono = sede.getTelefono();
		this.avatar = sede.getAvatar();
		this.activacion = sede.getActivacion();
		
	}	
	
	
	
	public SedeHb(long id, String nombreSede, String direccion, String telefono, String avatar, Boolean activacion) {
		
		this.id = id;
		this.nombreSede = nombreSede;
		this.direccion = direccion;
		this.telefono = telefono;
		this.avatar = avatar;
		this.activacion = activacion;
	}




	public long getId() {		
		return id;
	}
	
	
	
	
	public String getNombreSede() {
		return nombreSede;
	}
	
	public void setNombreSede(String nombreSede) {		
		this.nombreSede = nombreSede;
	}
	
	
	public String getDireccion() {
		return nombreSede;
	}
	
	public void setDireccion(String direccion) {		
		this.direccion = direccion;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	
	
	public String getAvatar() {
		return avatar;
	}
	
	public void setAvatar(String avatar) {		
		this.avatar = avatar;
	}	
	
	
	public Boolean getActivacion() {
		return activacion;
	}
	
	public void setActivacion(Boolean activacion) {
		this.activacion =activacion;
	}

	@Override
	public String toString() {
		return "SedeHb [id=" + id + ", nombreSede=" + nombreSede + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", avatar=" + avatar + ", activacion=" + activacion + "]";
	}
	
	
	
	
	
}



