import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {


  @Input('value') item;
  @Output() buy = new EventEmitter();

  currentTab = 1;

  reviews = [
    { stars: 5, author: 'who@email.com', body: 'sample review-1' },
    { stars: 3, author: 'who@email.com', body: 'sample review-2' }
  ];

  changeTab(tab) {
    this.currentTab = tab;
  }
  isTabSelected(tab) {
    return this.currentTab === tab;
  }
  handleNewReview(event) {
    this.reviews.push(event.formData);
  }
  handleBuyBtnClick(event) {
    this.buy.emit(this.item);
  }

}
