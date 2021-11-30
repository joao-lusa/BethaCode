import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Nota } from './nota/nota';
import { NotaBusca } from './nota/nota-lista/notaBusca';

@Injectable({
  providedIn: 'root'
})
export class NotaService {

  apiURL: string = environment.apiURLBase + '/api/notas'

  constructor(private http: HttpClient) { }

  salvar(nota: Nota) : Observable<Nota>{
    return this.http.post<Nota>(this.apiURL, nota)
  }
  buscar(nome: string): Observable<NotaBusca[]>{
    if(!nome){
      nome="";
    }

    const httpParams = new HttpParams().set("nome", nome);
    const urlDeBusca = this.apiURL + '?' + httpParams.toString()
    return this.http.get<any>(urlDeBusca);
  }
}
