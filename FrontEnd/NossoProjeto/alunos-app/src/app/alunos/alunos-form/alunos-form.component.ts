import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { url } from 'inspector';
import { Observable } from 'rxjs';
import { Aluno } from './Alunos';
import { AlunosService } from './alunos.service';

@Component({
  selector: 'app-alunos-form',
  templateUrl: './alunos-form.component.html',
  styleUrls: ['./alunos-form.component.css']
})
export class AlunosFormComponent implements OnInit {

  aluno: Aluno;
  sucesso: boolean = false
  errosApi: String[];
  id : number;

  constructor( private servicoDeAlunos: AlunosService,
              private minhaRota : Router,
              private activatedRoute: ActivatedRoute) {
    this.aluno = new Aluno();
   }

  ngOnInit(): void {
    let params : Observable<Params> = this.activatedRoute.params;
    params.subscribe(urlParams => {
      this.id = urlParams['id'];
      if(this.id){
        this.servicoDeAlunos
          .getAlunosById(this.id)
          .subscribe(response => this.aluno = response,
                      erroResponse =>this.aluno = new Aluno())
      }
    })
  }

  gravarAluno(){
    if(this.id){
      this.servicoDeAlunos
          .atualizar(this.aluno)
          .subscribe(respostaComSucesso => {
            this.sucesso=true;
            this.errosApi = null;
          }, respostaComErro => {
            this.sucesso = false;
            this.errosApi = ['Erro ao atualizar o cliente!']
          })
    }else{
      this.servicoDeAlunos
      .salvar(this.aluno)
      .subscribe(respostaComSucesso =>{
        this.sucesso =true;
        this.errosApi = null;
        this.aluno = respostaComSucesso;
      }, respostaDeErro =>{
        this.sucesso = false;
        this.errosApi = respostaDeErro.error.erros;
      })
    }
  }

  volarParaListagem(){
    this.minhaRota.navigate(['/alunosLista'])
  }
}
