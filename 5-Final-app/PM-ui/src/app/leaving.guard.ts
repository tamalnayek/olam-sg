import {Injectable} from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router, CanDeactivate} from '@angular/router';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LeavingGuard implements CanDeactivate<any>{

  constructor(private router: Router) {}

  canDeactivate(
    component: any,
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<boolean> | boolean {

    return confirm(`Are you sure?`);

  }
}
