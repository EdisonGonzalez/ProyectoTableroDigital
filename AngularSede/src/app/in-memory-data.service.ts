import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const sede = [{id: 1, activacion: true, avatar: "Avatar Ruta n", direccion: "Medellin", 
            telefono: "034 555 1234", nombre: "Ruta n"},
                  
            {id: 2, activacion: true, avatar: "Avatar Ruta n", direccion: "Mede", 
            telefono: " 555 1234", nombre: " n"},

            {id: 3, activacion: true, avatar: "Avatar Ruta n", direccion: "llin", 
            telefono: "034  1234", nombre: "Ruta"},

            {id: 4, activacion: true, avatar: "Avatar Ruta n", direccion: "dellin", 
            telefono: "034 555 ", nombre: "Rutan"},

            {id: 5, activacion: true, avatar: "Avatar Ruta n", direccion: "Mede", 
            telefono: "034 534", nombre: "R"},
          
          ];
    return {sede};
  }
}