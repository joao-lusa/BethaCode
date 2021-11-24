import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DisciplinasRoutingModule } from './disciplinas-routing.module';
import { DiscipinasFormComponent } from './discipinas-form/discipinas-form.component';


@NgModule({
  declarations: [DiscipinasFormComponent],
  imports: [
    CommonModule,
    DisciplinasRoutingModule
  ], exports:[
    DiscipinasFormComponent
  ]
})
export class DisciplinasModule { }
