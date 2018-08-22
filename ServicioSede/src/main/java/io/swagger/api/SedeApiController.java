package io.swagger.api;

import java.util.List;
import io.swagger.model.Sede;
import io.swagger.service.SedeService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.entity.SedeHb;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-08T15:00:25.418Z")

@Controller
public class SedeApiController implements SedeApi {
	
	

    private static final Logger log = LoggerFactory.getLogger(SedeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private boolean ok;
    
    
    private static final Log logger = LogFactory.getLog(SedeApiController.class); 
    
    @Autowired
    @Qualifier("servicio")	
    SedeService service;

    @org.springframework.beans.factory.annotation.Autowired
    public SedeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

  //----------------------------------------
    //--------     Crear una sede     ------
    public ResponseEntity<Void> addSede(@ApiParam(value = "Objeto sede que debe agregarse a la base" ,required=true )  @Valid @RequestBody Sede body) {
        String accept = request.getHeader("Accept");
        
        //Se verifivca que el id enviado sea igual a 0, para crear una sede nueva, en caso contrario
        // se da una respuesta mala a la peticion 
        if(body.getId() != 0) {
        	logger.warn("SE INTENTA CREAR UNA SEDE CON ID DIFERENTE DE CERO");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
        // Con el modelo de sede que llega en la peticion se crea la entidad de tipo sede, la cual esta mapeada con 
        // la tabla de la base de datos.
        SedeHb sedeEn = new SedeHb(body);
        
        // ok es la bandera que indica si el proceso de creacion de la sede es exitoso o no 
        ok = service.crear(sedeEn);
      
        if (ok) {
        	logger.info("SEDE CREADA CORRECTAMENTE");
        	return new ResponseEntity<Void>(HttpStatus.OK);
        	
        }else {
        	logger.warn("NO SE PUDO CREAR LA SEDE");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
        
        
    }

    public ResponseEntity<Void> createSedeWithArrayInput(@ApiParam(value = "Lista de sedes " ,required=true )  @Valid @RequestBody List<Sede> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    
    
    //----------------------------------------
    //--------     Eliminar una sede     -----
    public ResponseEntity<Void> deleteSedeId(@ApiParam(value = "Sede a ser eliminada",required=true) @PathVariable("sedename") String sedename, @PathVariable("id") long id) {
        String accept = request.getHeader("Accept");
        
      //Se verifica si la sede esta activa antes de proceder a eliminarla
        if(!service.obtenerActivacionByNombreAndId(sedename,id)) {
        	logger.warn("LA SEDE A ELIMINAR NO EXITE O YA ESTA ELIMINADA");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
     // ok es la bandera que indica si el proceso de borrar la sede es exitoso o no 
        ok = service.borrar(sedename, id);
        
        if (ok) {
        	logger.info("SEDE ELIMINADA CORRECTAMENTE");
        	return new ResponseEntity<Void>(HttpStatus.OK);
        	
        }else {
        	logger.warn("ERROR ELIMINANDO LA SEDE");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }        
        
    }

    // -------------- Obtener una sede por nombre y id ---------------------- //
    
    public ResponseEntity<Sede> getSedeByName(@ApiParam(value = "El nombre necesario para hacer la busqueda",required=true) @PathVariable("sedename") String sedename, @PathVariable("id") long id ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            
            	//Se verifica si la sede esta activa antes de proceder a eliminarla
        	
                Sede sede = service.obtenerByNombreAndId(sedename, id);
                if(sede == null) {
                	logger.warn("LA SEDE A BUSCAR NO EXITE");
            		return new ResponseEntity<Sede>(HttpStatus.BAD_REQUEST);
                }
                
            	if(!sede.getActivacion()) {
            		logger.warn("LA SEDE A BUSCAR NO ESTA ACTIVA");
            		return new ResponseEntity<Sede>(HttpStatus.BAD_REQUEST);
            	}
            	
            	logger.info("SE ENCUENTRA LA SEDE POR NOMBRE Y ID CORRECTAMENTE");
                return new ResponseEntity<Sede>(sede, HttpStatus.OK);
            
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Sede>(objectMapper.readValue("<Sede>  <id>123456789</id>  <nombreSede>aeiou</nombreSede>  <direccion>aeiou</direccion>  <telefono>aeiou</telefono>  <avatar>aeiou</avatar>  <activacion>true</activacion></Sede>", Sede.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Sede>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        logger.warn("ERROR EN EL ACCEPT DEL HEADER O APPLICATION/JSON");
        return new ResponseEntity<Sede>(HttpStatus.BAD_REQUEST);
    }
    
    
    // ---------------- Obtener todas las sedes --------------//
    public ResponseEntity<List<Sede>> getSedes(){
    	String accept = request.getHeader("Accept");
    	if (accept != null && accept.contains("application/json")) {
            try {
            	 List<Sede> sedes = service.obtener();
            	 logger.info("SE OBTIENE LA LISTA DE LAS SEDES ACTIVAS CORRECTAMETNE");
                return new ResponseEntity<List<Sede>>(sedes, HttpStatus.OK);
            } catch (Exception e) {
				// TODO: handle exception
            	logger.info("ERROR OBTENIENDO LAS SEDES ACTIVAS");
                return new ResponseEntity<List<Sede>>(HttpStatus.BAD_REQUEST);
			}
//            finally {
//            
//            }
        }else {
        	logger.warn("ERROR EN EL ACCEPT DEL HEADER O APPLICATION/JSON");
        	return new ResponseEntity<List<Sede>>(HttpStatus.BAD_REQUEST);
        }
    	
    }
    
    //------------ Actualizar sede -----------//
    
    public ResponseEntity<Void> updateSede(@ApiParam(value = "id de la sede a actualizar",required=true) @PathVariable("id") long id,@ApiParam(value = "Objeto sede necesario para añadir a la base" ,required=true )  @Valid @RequestBody Sede body) {
        String accept = request.getHeader("Accept");
        
      //Se verifivca que el id enviado sea diferente a 0, para modificar/actualizar una sede, y no tener el error
      // de crear una nueva, en caso contrario se da una respuesta mala a la peticion 
        if(id == 0 || id != body.getId() || !body.getActivacion() ) {
        	logger.warn("ERROR: SE INTENTA CREAR UNA SEDE. ID EN PATH NO COINCIDE CON ID EN BODY. SEDE NO EXISTE. SE INTENTA "
        			+ "DESACTIVAR UNA SEDE ");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
        //Se verifica si la sede esta activa antes de proceder a modificar algun campo 
        if(!service.obtenerActivacionById(id)) {
        	logger.warn("ERROR: SEDE NO EXISTE O NO ESTA ACTIVA");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
        // Con el modelo de sede que llega en la peticion se crea la entidad de tipo sede, la cual esta mapeada con 
        // la tabla de la base de datos.        
        
        SedeHb sedeEn = new SedeHb(body);
        
        // ok es la bandera que indica si el proceso de creacion de la sede es exitoso o no 
        ok = service.actualizar(sedeEn);
        
        if (ok) {
        	logger.info("SEDE ACTUALIZADA CORRECTAMENTE");
        	return new ResponseEntity<Void>(HttpStatus.OK);
        	
        }else {
        	
        	logger.warn("ERROR: LA SEDE NO SE PUDO ACTUALIZAR CORRECTAMENTE");
        	return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        
        
        
    }

}



//System.out.println("--------------------------------");
//System.out.println("-------------sedeEn---------------");
//System.out.println(sedeEn);
//
// 
//System.out.println("--------------------------------");
//System.out.println("-------------body---------------");
//System.out.println(body);
//
//System.out.println("--------------------------------");
//System.out.println("-------------ok---------------");
//System.out.println("ok: "+ok);
