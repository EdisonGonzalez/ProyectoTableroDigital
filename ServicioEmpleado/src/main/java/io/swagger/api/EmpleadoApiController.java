package io.swagger.api;

import io.swagger.model.Empleado;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-08T16:20:10.585Z")

@Controller
public class EmpleadoApiController implements EmpleadoApi {

    private static final Logger log = LoggerFactory.getLogger(EmpleadoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmpleadoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> actualizarEmpleado(@ApiParam(value = "Nombre que necesita ser actualizado",required=true) @PathVariable("nombreEmpleado") String nombreEmpleado,@ApiParam(value = "Objeto empleado actualizado" ,required=true )  @Valid @RequestBody Empleado cuerpo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearEmpleado(@ApiParam(value = "Objeto empleado creado" ,required=true )  @Valid @RequestBody Empleado cuerpo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearEmpleadosConArregloEntrada(@ApiParam(value = "Lista de objeto empleado" ,required=true )  @Valid @RequestBody List<Empleado> cuerpo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> eliminarEmpleado(@ApiParam(value = "El nombre que debe borrarse",required=true) @PathVariable("nombreEmpleado") String nombreEmpleado) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Empleado> obtenerEmpleadoPorNombre(@ApiParam(value = "El nombre que debe buscarse. Usar empleado1 para probar.",required=true) @PathVariable("nombreEmpleado") String nombreEmpleado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Empleado>(objectMapper.readValue("<empleado>  <id>aeiou</id>  <nombre>aeiou</nombre>  <apellido>aeiou</apellido>  <codigo>123</codigo>  <telefono>aeiou</telefono>  <nivel>123</nivel>  <estadoEmpleado>123</estadoEmpleado>  <counselor>aeiou</counselor>  <avatar>aeiou</avatar>  <correo>aeiou</correo>  <banderaActivo>true</banderaActivo></empleado>", Empleado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Empleado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Empleado>(objectMapper.readValue("{  \"codigo\" : 0,  \"counselor\" : \"counselor\",  \"estadoEmpleado\" : 1,  \"apellido\" : \"apellido\",  \"correo\" : \"correo\",  \"id\" : \"id\",  \"avatar\" : \"avatar\",  \"telefono\" : \"telefono\",  \"banderaActivo\" : true,  \"nombre\" : \"nombre\",  \"nivel\" : 7,  \"perfil\" : {    \"descripcionGeneral\" : \"descripcionGeneral\"  }}", Empleado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Empleado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Empleado>(HttpStatus.NOT_IMPLEMENTED);
    }

}
