import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ContractService } from '../contract.service';

@Component({
  selector: 'app-contract-confirmation-form',
  templateUrl: './contract-confirmation-form.component.html',
  styleUrls: ['./contract-confirmation-form.component.scss']
})
export class ContractConfirmationFormComponent implements OnInit {

  contractForm: FormGroup;
  disabled = false;
  companyList = [
    { code: '001', name: 'olam-cn' },
    { code: '002', name: 'olam-sg' },
    { code: '003', name: 'olam-in' }
  ];

  productList = [
    { code: 'cf', name: 'coffee' },
    { code: 'ct', name: 'cotton' },
    { code: 'gr', name: 'grains' }
  ];

  countryList = [
    { code: 'sg', name: 'singapore' },
    { code: 'in', name: 'india' },
    { code: 'qr', name: 'qatar' }
  ];

  marketList = [
    { code: 'm1', name: 'market-1' },
    { code: 'm2', name: 'market-2' },
    { code: 'm3', name: 'market-3' }
  ];

  constructor(private fb: FormBuilder, private contractService: ContractService) { }

  ngOnInit() {
    this.disabled = false;
    this.contractForm = this.fb.group({
      company: ['002'],
      product: ['cf'],
      country: ['in'],
      market: ['m1'],
      quantity: ['', [Validators.required]],
      price: ['0', [Validators.required]],
      trader: ['MATHEW'],
      order: ['']
    });
  }

  handleFormSubmit(event) {
    event.preventDefault();
    if (this.contractForm.valid) {
      let formData = this.contractForm.value;
      let order = this.contractService.submitContract(formData);
      this.contractForm.get('order').setValue(order.orderId);
      this.disabled = true;
    }
  }

}
