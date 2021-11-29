import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from './funcionarios/funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionariosService {

  constructor(private http : HttpClient) {

  }

  salvar(funcionario : Funcionario) : Observable<Funcionario>{
    return this.http.post<Funcionario>('http://localhost:8080/api/funcionario', funcionario)
  }

}
