import {ProductService} from '../product.service';
import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: any = [];

  constructor(private productService: ProductService, private route: ActivatedRoute) {}

  ngOnInit() {

    //    this.productService.loadAllProducts()
    //      .subscribe(response => {
    //        this.products = response;
//      });
    
    this.route.data.subscribe(data => {
      this.products = data.products;
    });


  }

  deleteProduct(id, event) {
    event.preventDefault();
    this.productService.deleteProduct(id)
      .subscribe(e => {
        this.products = this.products.filter(p => p.id !== id);
      });
  }

}
