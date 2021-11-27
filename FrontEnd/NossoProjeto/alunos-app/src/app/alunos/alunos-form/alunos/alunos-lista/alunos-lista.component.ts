import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Aluno } from '../../Alunos';
import { AlunosService } from '../../alunos.service';

@Component({
  selector: 'app-alunos-lista',
  templateUrl: './alunos-lista.component.html',
  styleUrls: ['./alunos-lista.component.css']
})
export class AlunosListaComponent implements OnInit {

  alunos : Aluno[] = [];
  alunosSelecionado: Aluno;
  mensagemSucesso: String;
  mensagemErro: String;

  constructor( private servicoDoAluno : AlunosService,
              private minhaRota : Router) { }

  ngOnInit(): void {
    this.servicoDoAluno
      .getAlunos()
      .subscribe(respostaComSucesso => {
        this.alunos = respostaComSucesso
      })
  }

  NovoCadastro(){
    this.minhaRota.navigate(['/alunosForm'])
  }

  preparaDelecao(aluno: Aluno){
    this.alunosSelecionado = aluno;
  }

  deletarAluno(){
    this
      .servicoDoAluno
      .deletar(this.alunosSelecionado)
      .subscribe(
        respostaComSucesso => {
          this.mensagemSucesso = 'Cliente deletado com sucesso!'
          this.mensagemErro = null;
          this.ngOnInit();
        },
        respostaComErro => {
          this.mensagemErro = "Ocorreu um erro ao deletar o aluno!"
          this.mensagemSucesso = null;
        }
      )
  }

}
