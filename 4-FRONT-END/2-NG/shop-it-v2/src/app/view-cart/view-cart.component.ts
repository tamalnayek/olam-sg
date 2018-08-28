import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {

  @Input() cart;

  itemLines = [];
  totalAmount = 0.0;

  constructor() { }

  ngOnInit() {
  }

  ngDoCheck() {
    let keys = Object.keys(this.cart);
    if (keys) {
      this.itemLines = [];
      keys.forEach(key => {
        let line = this.cart[key];
        this.itemLines = this.itemLines.concat(line);
        this.totalAmount = line.item.price * line.qty;
      })
    }
  }

}
