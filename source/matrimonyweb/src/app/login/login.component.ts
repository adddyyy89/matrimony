import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private title: string;
  private error: string;

  public username: string;
  public password: string;

  constructor(private router : Router) {
  }

  ngOnInit() {
    this.error = '';
    this.title = 'Login Component';
  }

  public loginSubmit() {
    if(this.username == 'admin' && this.password == 'admin'){
      this.router.navigate(['dashboard']);
    } else {
      this.error = 'invalid credentials';
    }
  }
}
