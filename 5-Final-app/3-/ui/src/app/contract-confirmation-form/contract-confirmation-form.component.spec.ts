import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractConfirmationFormComponent } from './contract-confirmation-form.component';

describe('ContractConfirmationFormComponent', () => {
  let component: ContractConfirmationFormComponent;
  let fixture: ComponentFixture<ContractConfirmationFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContractConfirmationFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractConfirmationFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
