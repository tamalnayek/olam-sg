import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent {

  items: any = []

  // dependecy injection
  constructor(private itemService: ItemService) { }

  ngOnInit() {
    this.itemService.getProducts()
      .subscribe(response => {
        this.items = response;
      });
  }


}
