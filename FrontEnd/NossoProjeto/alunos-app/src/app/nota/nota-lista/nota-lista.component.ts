import { Component, OnInit } from '@angular/core';
import { NotaService } from 'src/app/nota.service';
import { NotaBusca } from './notaBusca';

@Component({
  selector: 'app-nota-lista',
  templateUrl: './nota-lista.component.html',
  styleUrls: ['./nota-lista.component.css']
})
export class NotaListaComponent implements OnInit {

  nome: string;
  listaDeNotas: NotaBusca[];
  message: string;

  constructor(private servicoDeNota: NotaService) { }

  ngOnInit(): void {
  }

  consultarNotas(){
    this.message = null;
    this.servicoDeNota
        .buscar(this.nome)
        .subscribe(respostaComSucesso => {
          console.log(respostaComSucesso);
          this.listaDeNotas = respostaComSucesso;
          if(this.listaDeNotas.length <= 0){
            this.message = "Nenhum registro foi encontrado!"
          }
        })

  }

}
