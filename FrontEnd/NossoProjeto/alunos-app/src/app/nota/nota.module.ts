import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NotaRoutingModule } from './nota-routing.module';
import { NotaFormComponent } from './nota-form/nota-form.component';
import { NotaListaComponent } from './nota-lista/nota-lista.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [NotaFormComponent, NotaListaComponent],
  imports: [
    CommonModule,
    NotaRoutingModule,
    FormsModule,
    RouterModule
  ], exports: [
    NotaFormComponent,
    NotaListaComponent
  ]
})
export class NotaModule { }
