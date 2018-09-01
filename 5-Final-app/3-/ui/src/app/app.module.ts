import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ContractConfirmationFormComponent } from './contract-confirmation-form/contract-confirmation-form.component';

import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from './auth.guard';

const routes: Routes = [
  { path: '', pathMatch: "full", redirectTo: 'login' },
  { path: 'login', component: LoginComponent },
  {
    path: 'contract',
    canActivate: [AuthGuard],
    component: ContractConfirmationFormComponent
  }
];


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ContractConfirmationFormComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
