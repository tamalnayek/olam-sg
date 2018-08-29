import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {}

  loadAllProducts() {
    const apiUrl = 'http://localhost:8080/v1/api/products';
    return this.http.get(apiUrl);
  }

  loadProduct(id) {
    const apiUrl = `http://localhost:8080/v1/api/products/${id}`;
    return this.http.get(apiUrl);
  }
  
  saveNewProduct(product) {
    const apiUrl = 'http://localhost:8080/v1/api/products';
    return this.http.post(apiUrl, product);
  }
  
  updateProduct(id, product) {
    const apiUrl = `http://localhost:8080/v1/api/products/${id}`;
    return this.http.put(apiUrl, product);
  }

  deleteProduct(id){
     const apiUrl = `http://localhost:8080/v1/api/products/${id}`;
    return this.http.delete(apiUrl);
  }

}
