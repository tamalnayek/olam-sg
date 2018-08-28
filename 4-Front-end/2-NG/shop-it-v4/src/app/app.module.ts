import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { ItemComponent } from './item/item.component';
import { ReviewComponent } from './review/review.component';
import { ReviewFormComponent } from './review-form/review-form.component';
import { ViewCartComponent } from './view-cart/view-cart.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ItemListComponent } from './item-list/item-list.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { CartBadgeComponent } from './cart-badge/cart-badge.component';
import { StatusComponent } from './status/status.component';

let routes: Routes = [
  { path: '', component: DashboardComponent },
  { path: 'items', component: ItemListComponent },
  { path: 'cart', component: ViewCartComponent },
  { path: '**', component: NotFoundComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    ItemComponent,
    ReviewComponent,
    ReviewFormComponent,
    ViewCartComponent,
    DashboardComponent,
    ItemListComponent,
    NotFoundComponent,
    CartBadgeComponent,
    StatusComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
