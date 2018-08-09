package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Perfil, es donde se encuentran los 3 tips de objetivo de cada empleado
 */
@ApiModel(description = "Perfil, es donde se encuentran los 3 tips de objetivo de cada empleado")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-08T16:20:10.585Z")

public class PerfilEmpleado   {
  @JsonProperty("descripcionGeneral")
  private String descripcionGeneral = null;

  public PerfilEmpleado descripcionGeneral(String descripcionGeneral) {
    this.descripcionGeneral = descripcionGeneral;
    return this;
  }

  /**
   * Get descripcionGeneral
   * @return descripcionGeneral
  **/
  @ApiModelProperty(value = "")


  public String getDescripcionGeneral() {
    return descripcionGeneral;
  }

  public void setDescripcionGeneral(String descripcionGeneral) {
    this.descripcionGeneral = descripcionGeneral;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilEmpleado perfilEmpleado = (PerfilEmpleado) o;
    return Objects.equals(this.descripcionGeneral, perfilEmpleado.descripcionGeneral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcionGeneral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilEmpleado {\n");
    
    sb.append("    descripcionGeneral: ").append(toIndentedString(descripcionGeneral)).append("\n");
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

