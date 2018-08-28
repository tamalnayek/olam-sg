import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CartService } from '../cart.service';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {


  @Input('value') item;
  @Output() buy = new EventEmitter();

  currentTab = 1;

  reviews: any = [];

  constructor(private cartService: CartService, private itemService: ItemService) { }

  changeTab(tab) {
    this.currentTab = tab;
    if (this.currentTab === 3) {
      this.itemService.getReviews(this.item.id)
        .subscribe(response => {
          this.reviews = response;
        })
    }
  }
  isTabSelected(tab) {
    return this.currentTab === tab;
  }
  handleNewReview(event) {
    this.itemService.submitNewReview(this.item.id, event.formData)
      .subscribe(e => {
        this.reviews.push(event.formData)
      });
  }
  handleBuyBtnClick(event) {
    this.cartService.addToCart(this.item);
  }

}
