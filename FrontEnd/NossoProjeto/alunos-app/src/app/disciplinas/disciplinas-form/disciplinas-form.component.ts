import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DisciplinasService } from 'src/app/disciplinas.service';
import { Disciplina } from '../discipliana';

@Component({
  selector: 'app-disciplinas-form',
  templateUrl: './disciplinas-form.component.html',
  styleUrls: ['./disciplinas-form.component.css']
})
export class DisciplinasFormComponent implements OnInit {

  disciplina: Disciplina;
  sucesso: boolean = false;
  erroApi: string[];
  id: number;

  constructor(private service : DisciplinasService,
              private router : Router,
              private activatedRoute : ActivatedRoute) {
      this.disciplina = new Disciplina();   
   }

  ngOnInit(): void {
    let params : Observable<Params> = this.activatedRoute.params;
    params.subscribe(urlParams =>{
      this.id = urlParams['id'];
      if(this.id){
        this.service
          .getDisciplinasById(this.id)
          .subscribe(respostaComSucesso => this.disciplina = respostaComSucesso,
                      respostaComErro => this.disciplina = new Disciplina());
      }
    })
  }

  gravarDisciplina(){
    if(this.id){ 
      this.service
        .atualizar(this.disciplina)
        .subscribe(respostaComSucesso =>{
          this.sucesso = true;
          this.erroApi = null;
        }, respostaErro =>{
          this.erroApi = ['Erro ao atualizar a Disciplina!']
        })
    }else{
      this.service
      .salvar(this.disciplina)
      .subscribe(respostaSucesso => {
        this.sucesso = true;
        this.erroApi= null;
        this.disciplina = respostaSucesso;
      }), respostaErro => {
        this.erroApi = respostaErro.console.error;
        this.sucesso = false; 
      }
    }   
  }

  voltarParaListagem(){
    this.router.navigate(['/disciplinaLista'])
  }
}
