import {ProductService} from './product.service';
import {Injectable} from '@angular/core';
import {Resolve} from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProductsResolverService implements Resolve<any>{

  constructor(private productService: ProductService) {}

  resolve() {
    return this.productService.loadAllProducts();
  }

}
