import { Component, OnInit, Input } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {


  itemLines = [];
  totalAmount = 0.0;

  constructor(private cartService: CartService) { }

  ngOnInit() {
  }

  ngDoCheck() {
    let cart = this.cartService.getCart();
    let keys = Object.keys(cart);
    if (keys) {
      this.itemLines = [];
      keys.forEach(key => {
        let line = cart[key];
        this.itemLines = this.itemLines.concat(line);
        this.totalAmount = line.item.price * line.qty;
      })
    }
  }

}
