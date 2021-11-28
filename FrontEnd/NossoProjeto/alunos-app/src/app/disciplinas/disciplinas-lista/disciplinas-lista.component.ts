import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DisciplinasService } from 'src/app/disciplinas.service';
import { Disciplina } from '../discipliana';

@Component({
  selector: 'app-disciplinas-lista',
  templateUrl: './disciplinas-lista.component.html',
  styleUrls: ['./disciplinas-lista.component.css']
})
export class DisciplinasListaComponent implements OnInit {

  disciplinas: Disciplina[] = [];
  disciplinaSelecionada: Disciplina;
  mensagemSucesso: string;
  mensagemErro: string;

  constructor(
              private service: DisciplinasService,
              private router: Router 
              ) { }

  ngOnInit(): void {
    this.service
    .getDisciplinas()
    .subscribe(respostaDeSucesso => this.disciplinas = respostaDeSucesso)
  }

  novoCadastro(){
    this.router.navigate(['/disciplinaForm'])
  }

  preparaDelecao(disciplina : Disciplina){
    this.disciplinaSelecionada = disciplina;
  }

  deletarAluno(){
    this.service
    .deletar(this.disciplinaSelecionada)
    .subscribe(
      respostaSucesso =>{
        this.mensagemSucesso = 'Disciplina foi deletada com Sucesso!'
        this.mensagemErro = null;
        this.ngOnInit();
      }, respostaErro => {
        this.mensagemErro = 'Ocorreu algum erro ao deletar a Disciplina'
        this.mensagemSucesso = null;
      }
    )
  }
}
