import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DiscipinasFormComponent } from './discipinas-form/discipinas-form.component';


const routes: Routes = [
  {path: 'discipilasForm', component: DiscipinasFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DisciplinasRoutingModule { }
