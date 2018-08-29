import {ProductService} from '../product.service';
import {Component, OnInit} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-product-view',
  templateUrl: './product-view.component.html',
  styleUrls: ['./product-view.component.css']
})
export class ProductViewComponent implements OnInit {

  id = '';
  product:any = {};

  constructor(
    private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute) {}

  ngOnInit() {

    this.route.params.subscribe(params => {
      this.id = params['productId'];

      this.productService.loadProduct(this.id)
        .subscribe(product => {
          this.product = product;
        });

    });

  }

}
