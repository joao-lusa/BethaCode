import { Component, OnInit } from '@angular/core';
import { AlunosService } from 'src/app/alunos.service';
import { Aluno } from 'src/app/alunos/aluno';
import { DisciplinasService } from 'src/app/disciplinas.service';
import { Disciplina } from 'src/app/disciplinas/discipliana';
import { Nota } from '../nota';

@Component({
  selector: 'app-nota-form',
  templateUrl: './nota-form.component.html',
  styleUrls: ['./nota-form.component.css']
})
export class NotaFormComponent implements OnInit {

  alunos: Aluno[] = [];
  disciplinas : Disciplina[] = [];
  nota: Nota;

  constructor(private servicoAluno: AlunosService,
              private servicoDisciplina: DisciplinasService ) {
    this.nota = new Nota();
  }

  ngOnInit(): void {
    this.servicoAluno
      .getAlunos()
      .subscribe(respostaComSucesso => {
        this.alunos = respostaComSucesso;
      })

    this.servicoDisciplina
      .getDisciplinas()
      .subscribe(respostaComSucesso => {
        this.disciplinas = respostaComSucesso;
      })
  }

  gravarNota(){
    console.log('Gravando Nota!!');
    console.log(this.nota)
  }

}
