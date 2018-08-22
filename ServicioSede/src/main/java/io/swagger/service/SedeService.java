package io.swagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.swagger.convertidor.Convertidor;
import io.swagger.entity.SedeHb;
import io.swagger.repository.SedeRepositorio;


import io.swagger.model.Sede;
@Service("servicio")
public class SedeService {

	@Autowired
	@Qualifier("repositorio")
	private SedeRepositorio repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(SedeHb sede) {
		try {
			
			repositorio.save(sede);
			return true;
		} catch (Exception e) {
			// TODO: handle exception			
			return false;
		}
		
	}
	
	
	public boolean actualizar(SedeHb sede) {
		
		try {
			
			repositorio.save(sede);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			
			return false;
		}
	}
	
	public boolean borrar(String nombreSede, long id) {

		try {
			SedeHb sede = repositorio.findByNombreSedeAndId(nombreSede, id);
			if (sede == null) {
				return false;
			}
			sede.setActivacion(false);
			repositorio.save(sede);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			
			return false;
		}
	}
	
	public List<Sede> obtener(){
			
		List<SedeHb> sedesEn = repositorio.findAll();
		List<SedeHb> sedesEn2=new ArrayList<>();
		
		for(SedeHb sede:sedesEn) {
			if(sede.getActivacion()) {
				sedesEn2.add(sede);
			}
		}
		return convertidor.convertirLista(sedesEn2);
	}
	
	public Sede obtenerByNombreAndId(String nombreSede, long id) {
		 SedeHb sede = repositorio.findByNombreSedeAndId(nombreSede, id);
		return new Sede(sede);
	}
	
	public boolean obtenerActivacionById(long id) {
		SedeHb sede = repositorio.findById(id);
		if (sede == null) {
			return false;
		}
		return sede.getActivacion();
	}
	
	public boolean obtenerActivacionByNombreAndId(String nombreSede, long id) {
		SedeHb sede = repositorio.findByNombreSedeAndId(nombreSede, id);
		if (sede == null) {
			return false;
		}
		return sede.getActivacion();
	}
}
