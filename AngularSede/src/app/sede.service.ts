import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {Sede} from './sede';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({ 'Accept': 'application/json', 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class SedeService {
  //private sedeUrl = 'api/sede';  // URL to web api
  private sedeUrl ='http://localhost:8080/v2/sede';
  constructor( private http: HttpClient) { }
  
  /** GET sede by id. Will 404 if id not found */
  getSedeId(nombreSede:string,id: number): Observable<any> {    
    const url = `${this.sedeUrl}/${nombreSede}/${id}`;
    console.log("URL construida con el id de la sede: "+url);
    
    return this.http.get<Sede>(url,httpOptions);
  }


  /**
 * Handle Http operation that failed.
 * Let the app continue.
 * @param operation - name of the operation that failed
 * @param result - optional value to return as the observable result
 */
private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {

    // TODO: send the error to remote logging infrastructure
    console.error(error); // log to console instead

    // TODO: better job of transforming error for user consumption
    console.log(`${operation} failed: ${error.message}`);

    // Let the app keep running by returning an empty result.
    return of(result as T);
  };
}

/** GET heroes from the server */
getSedes (): Observable<Sede[]> {
  return this.http.get<Sede[]>(this.sedeUrl);
}
   


  

}
