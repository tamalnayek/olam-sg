import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css']
})
export class CartBadgeComponent implements OnInit {

  itemsCount = 0;

  constructor(private cartService: CartService) { }

  ngOnInit() {
    this.cartService.getCartStream()
      .subscribe(e => {
        this.itemsCount++;
      })
  }

}
