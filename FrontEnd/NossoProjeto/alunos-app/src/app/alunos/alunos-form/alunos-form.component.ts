import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AlunosService } from 'src/app/alunos.service';
import { Aluno } from '../aluno';

@Component({
  selector: 'app-alunos-form',
  templateUrl: './alunos-form.component.html',
  styleUrls: ['./alunos-form.component.css']
})
export class AlunosFormComponent implements OnInit {

  aluno: Aluno;
  sucesso: boolean = false;
  errosApi: String[];
  id: number;

  constructor(private servicoDeAlunos: AlunosService,
              private minhaRota: Router,
              private rotaPassada: ActivatedRoute) {
      this.aluno = new Aluno();
   }

  ngOnInit(): void {
      let params : Observable<Params> = this.rotaPassada.params;

      params
        .subscribe(urlParams => {
              this.id = urlParams['id'];
              if (this.id){
                  this.servicoDeAlunos
                      .getAlunoById(this.id)
                      .subscribe(respostaSucesso => {
                          this.aluno = respostaSucesso;
                      }, respostaComErro => {
                          this.aluno = new Aluno();
                      })
              }
        });
  }

  gravarAluno(){
      if (this.id){
            this.servicoDeAlunos
                .atualizar(this.aluno)
                .subscribe( respostaComSucesso => {
                      this.sucesso = true;
                      this.errosApi = null;
                }, respostaComErro => {
                      this.sucesso = false;
                      this.errosApi = respostaComErro.error.erros;
                })
      }else{
          this.servicoDeAlunos
              .salvar(this.aluno)
              .subscribe( respostaComSucesso => {
                    this.sucesso = true;
                    this.errosApi = null;
                    this.aluno = respostaComSucesso;
              }, respostaComErro => {
                    this.sucesso = false;
                    this.errosApi = respostaComErro.error.erros;
              })
        }
  }

  voltarParaListagem(){
      this.minhaRota.navigate(['/alunosLista']);
  }

}
