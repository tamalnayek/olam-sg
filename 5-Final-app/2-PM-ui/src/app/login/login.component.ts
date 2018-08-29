import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;

  constructor(private fb: FormBuilder, private router: Router) {}

  ngOnInit() {
    this.loginForm = this.fb.group({
      userName: [''],
      password: ['']
    });
  }

  doLogin() {
    const user = this.loginForm.value;
    if (user.userName === "olam" && user.password === "shhh") {
      localStorage.setItem('auth-token', '234asda67as87asd786sad6');
      this.router.navigate(['all'])
    }
  }

}
