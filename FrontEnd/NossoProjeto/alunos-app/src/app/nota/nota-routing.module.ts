import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NotaFormComponent } from './nota-form/nota-form.component';
import { NotaListaComponent } from './nota-lista/nota-lista.component';


const routes: Routes = [
  {path: 'notasForm', component: NotaFormComponent},
  {path: 'notasForm/:id', component: NotaFormComponent},
  {path: 'notasLita', component: NotaListaComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NotaRoutingModule { }
