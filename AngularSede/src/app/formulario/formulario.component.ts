import { Component, OnInit, Input } from '@angular/core';
import {Sede} from '../sede';
import{SedeService} from '../sede.service';
import { error } from '../../../node_modules/protractor';



@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  constructor(private sedeService: SedeService) { }

  ngOnInit() {
    
  }
  title = 'Adminstracion-sede';
  sede: Sede;
  sede2: Sede ={
    id: 1,
    activacion: true,
    avatar: "string",
    direccion: "medellin",
    telefono: "034- 444 1234",
    nombreSede: "Ruta N"
  };

  

  enviar(nombreSede:string, id:string):void{
    id = id.trim();
    nombreSede = nombreSede.trim();
    if(!id || !nombreSede ){return; }
    this.sedeService.getSedeId(nombreSede,+id)
        .subscribe( (data:Sede )=> {
          this.sede = { id: data['id'], nombreSede: data['nombreSede'],
             direccion: data['direccion'], telefono: data['telefono'], 
             avatar: data['avatar'], activacion: data['activacion']}  
            console.log(data);
        }
        );
  }
  
  

  
}
