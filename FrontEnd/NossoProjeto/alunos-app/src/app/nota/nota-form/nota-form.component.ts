import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/alunos/aluno';

@Component({
  selector: 'app-nota-form',
  templateUrl: './nota-form.component.html',
  styleUrls: ['./nota-form.component.css']
})
export class NotaFormComponent implements OnInit {

  alunos: Aluno[]

  constructor() { }

  ngOnInit(): void {
  }

}
