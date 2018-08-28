import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'olam-shop';
  
  currentTab = 1;
  changeTab(tab) {
    this.currentTab = tab;
  }
  isTabSelected(tab) {
    return this.currentTab === tab;
  }
  
  items = [
    {
      name: "Cotton",
      price: 1000.00,
      description: 'first quality & soft',
      canBuy: true,
      image: 'assets/images/cotton.jpeg'
    },
    { 
      name: "Coffee",
      price: 500.00,
      description: 'yummy',
      canBuy: true,
      image: 'assets/images/coffee.jpeg'
    }
  ]

}
