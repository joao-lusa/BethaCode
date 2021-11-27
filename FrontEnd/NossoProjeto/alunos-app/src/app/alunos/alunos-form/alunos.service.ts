import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from './Alunos';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

  constructor( private http : HttpClient) { }

  salvar(aluno : Aluno) : Observable<Aluno>{
    return this.http.post<Aluno>('http://localhost:8080/api/alunos', aluno);
  }

  getAlunos(): Observable<Aluno[]>{
    return this.http.get<Aluno[]>('http://localhost:8080/api/alunos');
  }

  getAlunosById(id: number) : Observable<Aluno>{
    return this.http.get<Aluno>(`http://localhost:8080/api/alunos/${id}`);
  }

  atualizar(aluno : Aluno) : Observable<any>{
    return this.http.put<Aluno>(`http://localhost:8080/api/alunos${aluno.id}`, aluno);
  }
  
  deletar(aluno : Aluno) : Observable<any>{
    return this.http.delete<any>(`http://localhost:8080/api/alunos${aluno.id}`);
  }

}
