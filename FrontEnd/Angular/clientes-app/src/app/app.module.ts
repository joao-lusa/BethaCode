import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AlunosModule } from './alunos/alunos.module';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BethaCodeComponent } from './betha-code/betha-code.component';

@NgModule({
  declarations: [
    AppComponent,
    BethaCodeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AlunosModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
