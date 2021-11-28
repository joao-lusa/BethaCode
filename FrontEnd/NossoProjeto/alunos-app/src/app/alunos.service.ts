import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from './alunos/aluno';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

  constructor(private http: HttpClient) { }

  salvar(aluno: Aluno): Observable<Aluno>{
      return this.http.post<Aluno>('http://localhost:8080/api/alunos', aluno);
  }

  getAlunos() : Observable<Aluno[]>{
      return this.http.get<Aluno[]>('http://localhost:8080/api/alunos');
  }

  getAlunoById(codigoDoId: number) : Observable<Aluno>{
      return this.http.get<Aluno>(`http://localhost:8080/api/alunos/${codigoDoId}`);
  }

  atualizar(aluno: Aluno): Observable<any>{
      return this.http.put<Aluno>(`http://localhost:8080/api/alunos/${aluno.id}`, aluno);
  }  

  deletar(aluno: Aluno): Observable<any>{
    return this.http.delete<any>(`http://localhost:8080/api/alunos/${aluno.id}`);
}    

  
}
