import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ExamesRoutingModule } from './exames-routing.module';
import { ExamesFormComponent } from './exames-form/exames-form.component';


@NgModule({
  declarations: [ExamesFormComponent],
  imports: [
    CommonModule,
    ExamesRoutingModule
  ], exports :[
    ExamesFormComponent
  ]
})
export class ExamesModule { }
