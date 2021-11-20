import {NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AlunosFormComponent } from './alunos-form/alunos-form.component';

const routes: Routes = [
  {path: 'alunosForm', component: AlunosFormComponent}
];
  
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AlunosRoutingModule { }
