package io.swagger.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.entity.SedeHb;

@Repository("repositorio")
public interface SedeRepositorio extends JpaRepository<SedeHb, Serializable> {
	
	public abstract SedeHb findById(long id);
	
	public abstract SedeHb findByNombreSede(String nombreSede);
	
	public abstract List <SedeHb> findByNombreSedeAndTelefono(String nombreSede, int telefono);
	
	public abstract SedeHb findByNombreSedeAndId (String nombreSede, long id);
	
}
