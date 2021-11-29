import { Component, OnInit } from '@angular/core';
import { FuncionariosService } from 'src/app/funcionarios.service';
import { Funcionario } from '../funcionario';

@Component({
  selector: 'app-funcionarios-form',
  templateUrl: './funcionarios-form.component.html',
  styleUrls: ['./funcionarios-form.component.css']
})
export class FuncionariosFormComponent implements OnInit {

  funcionario : Funcionario;
  sucesso: boolean = false;
  errosApi: String[];

  constructor(private service: FuncionariosService) { 
    this.funcionario = new Funcionario();
  }

  ngOnInit(): void {
  }

  gravarFuncionario(){
    this.service
      .salvar(this.funcionario)
      .subscribe(response=>{
        this.sucesso = true;
        this.errosApi = null;
        this.funcionario = response;
      }, errorResponse => {
        this.errosApi = errorResponse.error.erros;
        this.sucesso = false;
      })
  }

}
