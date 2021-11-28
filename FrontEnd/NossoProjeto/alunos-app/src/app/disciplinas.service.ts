import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Disciplina } from './disciplinas/discipliana';

@Injectable({
  providedIn: 'root'
})
export class DisciplinasService {

  constructor( private http: HttpClient) { }

  salvar(disciplina: Disciplina) : Observable<Disciplina>{
    return this.http.post<Disciplina>('http://localhost:8080/api/diciplinas', disciplina);
  }

  getDisciplinas() : Observable<Disciplina[]>{
    return this. http .get<Disciplina[]>('http://localhost:8080/api/diciplinas');
  }

  getDisciplinasById(id: number) : Observable<Disciplina>{
    return this.http.get<Disciplina>(`http://localhost:8080/api/diciplinas/${id}`)
  }
  atualizar(disciplina: Disciplina) : Observable<any>{
    return this.http.put<Disciplina>(`http://localhost:8080/api/diciplinas/${disciplina.id}`, disciplina)
  }
  deletar(disciplina: Disciplina) : Observable<any>{
    return this.http.delete<any>(`http://localhost:8080/api/diciplinas/${disciplina.id}`)
  }
}
