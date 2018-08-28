import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.css']
})
export class StatusComponent implements OnInit {

  message = '';

  constructor(private cartService: CartService) { }

  ngOnInit() {
    this.cartService.getCartStream()
      .subscribe(e => {
        this.message = "New Item added to cart";
        setTimeout(() => {
          this.message = ''
        }, 3000)
      })
  }

}
