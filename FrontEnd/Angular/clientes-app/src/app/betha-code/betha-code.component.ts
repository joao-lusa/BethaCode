import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-betha-code',
  templateUrl: './betha-code.component.html',
  styleUrls: ['./betha-code.component.css']
})
export class BethaCodeComponent implements OnInit {
  nomeScript: string;
  constructor() { 
    this.nomeScript= "João Lucas Pereira Rafael - programador junior"
  }

  ngOnInit(): void {
  }

}
