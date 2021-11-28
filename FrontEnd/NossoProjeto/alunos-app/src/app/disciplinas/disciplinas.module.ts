import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DisciplinasRoutingModule } from './disciplinas-routing.module';
import { DisciplinasFormComponent } from './disciplinas-form/disciplinas-form.component';
import { FormsModule } from '@angular/forms';
import { DisciplinasListaComponent } from './disciplinas-lista/disciplinas-lista.component';


@NgModule({
  declarations: [DisciplinasFormComponent, DisciplinasListaComponent],
  imports: [
    CommonModule,
    DisciplinasRoutingModule,
    FormsModule
  ], exports: [
    DisciplinasFormComponent,
    DisciplinasListaComponent
  ]
})
export class DisciplinasModule { }
