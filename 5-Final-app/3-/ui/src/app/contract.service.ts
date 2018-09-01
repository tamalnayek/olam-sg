import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ContractService {

  constructor(private http: HttpClient) { }

  submitContract(contract) {
    //const apiUrl = "http://localhost:8080/contract";
    // return this.http.post(apiUrl, contract);
    return { orderId: 123 };
  }

}
