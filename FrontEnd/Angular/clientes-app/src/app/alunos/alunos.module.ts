import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunosComponent } from './alunos.component';



@NgModule({
  declarations: [
    AlunosComponent
  ],
  imports: [
    CommonModule
  ], exports:[
    AlunosComponent
  ]
})
export class AlunosModule { }
