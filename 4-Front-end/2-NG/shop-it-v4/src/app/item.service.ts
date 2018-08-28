import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http: HttpClient) { }

  getProducts() {
    //let promise = fetch('http://localhost:8080/v2/api/products')// micro-service
    //return promise.then(response => response.json());

    let stream = this.http.get('http://localhost:8080/v1/api/products');
    return stream;

  }

  getReviews(productId) {
    let stream = this.http.get(`http://localhost:8080/v1/api/products/${productId}/reviews`);
    return stream;
  }

  submitNewReview(productId, reviewData) {
    let apiUrl = `http://localhost:8080/v1/api/products/${productId}/reviews`;
    return this.http.post(apiUrl, reviewData);
  }


}
