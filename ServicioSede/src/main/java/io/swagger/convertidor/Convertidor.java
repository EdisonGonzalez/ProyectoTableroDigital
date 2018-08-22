
//Convierte una lista de sedes(Entidad) a sedes(modelo)
package io.swagger.convertidor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.swagger.entity.SedeHb;
import io.swagger.model.Sede;


@Component("convertidor")
public class Convertidor {
	public List<Sede> convertirLista (List<SedeHb> sedes){
		
		List<Sede> mSedes = new ArrayList<>();
		
		for(SedeHb sede: sedes) {
			mSedes.add(new Sede(sede));
			
		}
		return mSedes;
	}
}
