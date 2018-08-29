import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {AuthGuard} from './auth.guard';
import {DashboardComponent} from './dashboard/dashboard.component';
import {LeavingGuard} from './leaving.guard';
import {ProductListComponent} from './product-list/product-list.component';
import {RouterModule, Routes} from '@angular/router';
import {NotFoundComponent} from './not-found/not-found.component';
import {ProductFormComponent} from './product-form/product-form.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {GridModule, PDFModule} from '@progress/kendo-angular-grid';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ProductViewComponent} from './product-view/product-view.component';

import {ProductsResolverService} from './products-resolver.service';
import {LoginComponent} from './login/login.component';




const routes: Routes = [
  {path: '', component: DashboardComponent},
  {
    path: 'all',
    component: ProductListComponent,
    resolve: {
      products: ProductsResolverService
    },
    canActivateChild: [AuthGuard],
    children: [
      {path: 'edit/:productId', component: ProductFormComponent},
      {path: 'view/:productId', component: ProductViewComponent},
    ]
  },
  {
    path: 'new',
    component: ProductFormComponent,
    canActivate: [AuthGuard],
    canDeactivate: [LeavingGuard]
  },
  {path: 'login', component: LoginComponent},
  {path: '**', component: NotFoundComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ProductListComponent,
    NotFoundComponent,
    ProductFormComponent,
    ProductViewComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    GridModule,
    PDFModule,
    BrowserAnimationsModule
  ],
  providers: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
