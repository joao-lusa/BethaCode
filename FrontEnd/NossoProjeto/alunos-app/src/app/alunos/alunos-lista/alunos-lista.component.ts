import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AlunosService } from 'src/app/alunos.service';
import { Aluno } from '../aluno';

@Component({
  selector: 'app-alunos-lista',
  templateUrl: './alunos-lista.component.html',
  styleUrls: ['./alunos-lista.component.css']
})
export class AlunosListaComponent implements OnInit {

  alunos: Aluno[] = [];
  alunoSelecionado: Aluno;
  mensagemSucesso: string;
  mensagemErro: string;

  constructor(private servicoDeAlunos: AlunosService,
              private minhaRota : Router) { }

  ngOnInit(): void {
      this.servicoDeAlunos
          .getAlunos()
          .subscribe(respostaComSucesso => {
              this.alunos = respostaComSucesso;
          })
  }

  novoCadastro(){
      this.minhaRota.navigate(['/alunosForm'])
  }

  preparaDelecao(aluno: Aluno){
      this.alunoSelecionado = aluno;
  }

  deletarAluno(){
      this.servicoDeAlunos
          .deletar(this.alunoSelecionado)
          .subscribe(
                respostaSucesso => {
                    this.mensagemSucesso = 'Aluno deletado com sucesso!';
                    this.mensagemErro = null;
                    this.ngOnInit();
                },
                respostaErro => {
                    this.mensagemSucesso = null;
                    this.mensagemErro = 'Ocorreu um erro ao deletar o aluno!';
                }
          )
  }

}
