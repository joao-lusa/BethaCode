import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AlunosRoutingModule } from './alunos-routing.module';
import { AlunosFormComponent } from './alunos-form/alunos-form.component';
import { FormsModule } from '@angular/forms';
import { AlunosListaComponent } from './alunos-lista/alunos-lista.component';


@NgModule({
  declarations: [AlunosFormComponent, AlunosListaComponent],
  imports: [
    CommonModule,
    AlunosRoutingModule,
    FormsModule
  ], exports:[
    AlunosFormComponent,
    AlunosListaComponent
  ]
})
export class AlunosModule { }
