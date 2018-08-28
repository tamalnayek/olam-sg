import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'olam-shop';
  cart = {};
  cartItemsCount = 0;
  isCartOpen = false;
  items = [
    {
      id: 111,
      name: "Coffee",
      price: 500.00,
      description: 'yummy',
      canBuy: true,
      image: 'assets/images/coffee.jpeg',
      make_date: Date.now(),
      format: 'yyyy'
    },
    {
      id: 222,
      name: "Cotton",
      price: 1000.00,
      description: 'first quality & soft',
      canBuy: true,
      image: 'assets/images/cotton.jpeg',
      make_date: Date.now(),
      format: 'yyyy'
    },
  ]

  addToCart(item) {
    let id = item.id;
    let itemLine = this.cart[id];
    if (itemLine) {
      itemLine = Object.assign({}, itemLine, { qty: itemLine.qty + 1 })
    } else {
      itemLine = { item, qty: 1 }
      this.cartItemsCount++;
    }
    this.cart = Object.assign({}, this.cart, { [id]: itemLine })
  }

  toggleCart(event) {
    event.preventDefault();
    this.isCartOpen = !this.isCartOpen
  }

}
