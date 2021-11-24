import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AlunosRoutingModule } from './alunos-routing.module';
import { AlunosFormComponent } from './alunos-form/alunos-form.component';


@NgModule({
  declarations: [AlunosFormComponent],
  imports: [
    CommonModule,
    AlunosRoutingModule
  ], exports:[
    AlunosFormComponent
  ]
})
export class AlunosModule { }
