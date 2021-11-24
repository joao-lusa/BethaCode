import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FuncionariosRoutingModule } from './funcionarios-routing.module';
import { FuncionariosFormComponent } from './funcionarios-form/funcionarios-form.component';


@NgModule({
  declarations: [FuncionariosFormComponent],
  imports: [
    CommonModule,
    FuncionariosRoutingModule
  ], exports: [
    FuncionariosFormComponent
  ]
})
export class FuncionariosModule { }
