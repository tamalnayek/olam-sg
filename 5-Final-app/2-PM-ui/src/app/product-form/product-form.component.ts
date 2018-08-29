import {ProductService} from '../product.service';
import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router, ActivatedRouteSnapshot, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;

  id = '';
  editing = false;

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute) {}

  ngOnInit() {
    this.productForm = this.fb.group({
      id: ['', [Validators.required, Validators.minLength(3)]],
      name: ['', [Validators.required]],
      price: ['', [Validators.required, Validators.min(100)]],
      date: [''],
      description: ['']
    });

    // static route params
    //this.id = this.route.snapshot.params['productId'];

    //dynamic route params
    this.route.params.subscribe(params => {
      this.id = params['productId'];
      if (this.id) {
        this.productService.loadProduct(this.id)
          .subscribe(product => {
            this.productForm.patchValue(product);
            this.editing = true;
          });
      }
    });

  }

  handleForm() {
    if (this.productForm.valid) {
      const product = this.productForm.value;
      if (this.editing) {
        this.productService.updateProduct(this.id, product)
          .subscribe(response => {
            this.router.navigate(['all']);
          });
      } else {
        this.productService.saveNewProduct(product)
          .subscribe(response => {
            this.router.navigate(['all']);
          });
      }
    }
  }

}
