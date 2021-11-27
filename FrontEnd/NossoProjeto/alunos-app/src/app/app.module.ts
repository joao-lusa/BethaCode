import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { TemplateModule } from './template/template.module';
import { HomeComponent } from './home/home.component'
import { AlunosModule } from './alunos/alunos.module';
import { DisciplinasModule } from './disciplinas/disciplinas.module';
import { AlunosService } from './alunos/alunos-form/alunos.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TemplateModule,
    AlunosModule,
    DisciplinasModule
  ],
  providers: [
    AlunosService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
