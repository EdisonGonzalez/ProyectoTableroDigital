package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PerfilEmpleado;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Empleado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-08T16:20:10.585Z")

public class Empleado   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("apellido")
  private String apellido = null;

  @JsonProperty("codigo")
  private Integer codigo = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("nivel")
  private Integer nivel = null;

  @JsonProperty("estadoEmpleado")
  private Integer estadoEmpleado = null;

  @JsonProperty("perfil")
  private PerfilEmpleado perfil = null;

  @JsonProperty("counselor")
  private String counselor = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("correo")
  private String correo = null;

  @JsonProperty("banderaActivo")
  private Boolean banderaActivo = null;

  public Empleado id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^([\\d]){6,10}") @Size(min=6,max=10) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Empleado nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^([A-ZÁÉÍÓÚa-zñáéíóú]{1}[a-zñáéíóú]+([\\s]{0,1})){1,3}$") @Size(min=2) 
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Empleado apellido(String apellido) {
    this.apellido = apellido;
    return this;
  }

  /**
   * Get apellido
   * @return apellido
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^([A-ZÁÉÍÓÚa-zñáéíóú]{1}[a-zñáéíóú]+([\\s]{0,1})){1,3}$") @Size(min=2) 
  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Empleado codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(value = "")


  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public Empleado telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^([\\d]){7,10}") @Size(min=7,max=10) 
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Empleado nivel(Integer nivel) {
    this.nivel = nivel;
    return this;
  }

  /**
   * Get nivel
   * minimum: 0
   * maximum: 13
   * @return nivel
  **/
  @ApiModelProperty(value = "")

@Min(0) @Max(13) 
  public Integer getNivel() {
    return nivel;
  }

  public void setNivel(Integer nivel) {
    this.nivel = nivel;
  }

  public Empleado estadoEmpleado(Integer estadoEmpleado) {
    this.estadoEmpleado = estadoEmpleado;
    return this;
  }

  /**
   * Estado del empleado
   * @return estadoEmpleado
  **/
  @ApiModelProperty(value = "Estado del empleado")


  public Integer getEstadoEmpleado() {
    return estadoEmpleado;
  }

  public void setEstadoEmpleado(Integer estadoEmpleado) {
    this.estadoEmpleado = estadoEmpleado;
  }

  public Empleado perfil(PerfilEmpleado perfil) {
    this.perfil = perfil;
    return this;
  }

  /**
   * Get perfil
   * @return perfil
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerfilEmpleado getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEmpleado perfil) {
    this.perfil = perfil;
  }

  public Empleado counselor(String counselor) {
    this.counselor = counselor;
    return this;
  }

  /**
   * Get counselor
   * @return counselor
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^([A-ZÁÉÍÓÚa-zñáéíóú]{1}[a-zñáéíóú]+([\\s]{0,1})){1,3}$") @Size(min=2) 
  public String getCounselor() {
    return counselor;
  }

  public void setCounselor(String counselor) {
    this.counselor = counselor;
  }

  public Empleado avatar(String avatar) {
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

  public Empleado correo(String correo) {
    this.correo = correo;
    return this;
  }

  /**
   * Get correo
   * @return correo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$") 
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Empleado banderaActivo(Boolean banderaActivo) {
    this.banderaActivo = banderaActivo;
    return this;
  }

  /**
   * Get banderaActivo
   * @return banderaActivo
  **/
  @ApiModelProperty(value = "")


  public Boolean isBanderaActivo() {
    return banderaActivo;
  }

  public void setBanderaActivo(Boolean banderaActivo) {
    this.banderaActivo = banderaActivo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empleado empleado = (Empleado) o;
    return Objects.equals(this.id, empleado.id) &&
        Objects.equals(this.nombre, empleado.nombre) &&
        Objects.equals(this.apellido, empleado.apellido) &&
        Objects.equals(this.codigo, empleado.codigo) &&
        Objects.equals(this.telefono, empleado.telefono) &&
        Objects.equals(this.nivel, empleado.nivel) &&
        Objects.equals(this.estadoEmpleado, empleado.estadoEmpleado) &&
        Objects.equals(this.perfil, empleado.perfil) &&
        Objects.equals(this.counselor, empleado.counselor) &&
        Objects.equals(this.avatar, empleado.avatar) &&
        Objects.equals(this.correo, empleado.correo) &&
        Objects.equals(this.banderaActivo, empleado.banderaActivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellido, codigo, telefono, nivel, estadoEmpleado, perfil, counselor, avatar, correo, banderaActivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empleado {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    nivel: ").append(toIndentedString(nivel)).append("\n");
    sb.append("    estadoEmpleado: ").append(toIndentedString(estadoEmpleado)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
    sb.append("    counselor: ").append(toIndentedString(counselor)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
    sb.append("    banderaActivo: ").append(toIndentedString(banderaActivo)).append("\n");
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

