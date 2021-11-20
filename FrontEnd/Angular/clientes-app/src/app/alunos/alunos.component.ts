import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.css']
})
export class AlunosComponent implements OnInit {

  alunos: Aluno[];

  constructor() {
    let aluno1 = new Aluno("João Lucas", 19, "Sombrio");
    let aluno2 = new Aluno("Pedro Rafael", 17, "Araranguá");
    let aluno3 = new Aluno("Leonarno", 18, "Itajaí");
    this.alunos = [aluno1, aluno2, aluno3];

  }

  ngOnInit(): void {
  }

}

class Aluno{
  constructor(
      public nome: string,
      public idade: number,
      public endereco: string
    ){
      this.nome = nome;
      this.idade = idade;
      this.endereco = endereco;
    }
}