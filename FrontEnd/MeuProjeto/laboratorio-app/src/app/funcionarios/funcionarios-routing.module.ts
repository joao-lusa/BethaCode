import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FuncionariosFormComponent } from './funcionarios-form/funcionarios-form.component';


const routes: Routes = [
  {path: 'funcionarioForm', component: FuncionariosFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FuncionariosRoutingModule { }
