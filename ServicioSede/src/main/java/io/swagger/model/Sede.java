package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.entity.SedeHb;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sede
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-08T15:00:25.418Z")

public class Sede   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nombreSede")
  private String nombreSede = null;

  @JsonProperty("direccion")
  private String direccion = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("activacion")
  private Boolean activacion = null;

  public Sede id(Long id) {
    this.id = id;
    return this;
  }
  
  
  public Sede() {}
  
  public Sede( SedeHb sede) {
	this.id = sede.getId();
	this.nombreSede = sede.getNombreSede();
	this.direccion = sede.getDireccion();
	this.telefono = sede.getTelefono();
	this.avatar = sede.getAvatar();
	this.activacion = sede.getActivacion();
	  
  }

  public Sede(Long id, String nombreSede, String direccion, String telefono, String avatar, Boolean activacion) {
	
	this.id = id;
	this.nombreSede = nombreSede;
	this.direccion = direccion;
	this.telefono = telefono;
	this.avatar = avatar;
	this.activacion = activacion;
}


/**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Sede nombreSede(String nombreSede) {
    this.nombreSede = nombreSede;
    return this;
  }

  /**
   * Get nombreSede
   * @return nombreSede
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^([A-ZÁÉÍÓÚa-zñáéíóú0-9]+[\\s]{0,1}){1,3}$") 
  public String getNombreSede() {
    return nombreSede;
  }

  public void setNombreSede(String nombreSede) {
    this.nombreSede = nombreSede;
  }

  public Sede direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * Get direccion
   * @return direccion
  **/
  @ApiModelProperty(value = "")


  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Sede telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^([\\d]{7,10})$") 
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Sede avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(value = "")


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Sede activacion(Boolean activacion) {
    this.activacion = activacion;
    return this;
  }

  /**
   * Get activacion
   * @return activacion
  **/
  @ApiModelProperty(value = "")


  public Boolean isActivacion() {
    return activacion;
  }

  public void setActivacion(Boolean activacion) {
    this.activacion = activacion;
  }
  
  public Boolean getActivacion() {
	return activacion;
}


@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sede sede = (Sede) o;
    return Objects.equals(this.id, sede.id) &&
        Objects.equals(this.nombreSede, sede.nombreSede) &&
        Objects.equals(this.direccion, sede.direccion) &&
        Objects.equals(this.telefono, sede.telefono) &&
        Objects.equals(this.avatar, sede.avatar) &&
        Objects.equals(this.activacion, sede.activacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombreSede, direccion, telefono, avatar, activacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sede {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombreSede: ").append(toIndentedString(nombreSede)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    activacion: ").append(toIndentedString(activacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

