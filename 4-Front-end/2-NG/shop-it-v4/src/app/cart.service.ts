import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cart = {}

  cartStream = new Subject();

  constructor() { }

  getCart() {
    return this.cart;
  }

  getCartStream() {
    return this.cartStream;
  }

  addToCart(item) {
    let id = item.id;
    let name = item.name;
    let itemLine = this.cart[id || name];
    if (itemLine) {
      itemLine = Object.assign({}, itemLine, { qty: itemLine.qty + 1 })
    } else {
      itemLine = { item, qty: 1 }
      this.cartStream.next(item);
    }
    this.cart = Object.assign({}, this.cart, { [id || name]: itemLine })
  }

}
