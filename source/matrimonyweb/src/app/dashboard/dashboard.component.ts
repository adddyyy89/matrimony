import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  private title: string;
  private total_members: number;

  private router: Router;
  constructor(router: Router) {
    this.router = router;
  }

  ngOnInit() {
    this.title = 'Dashboard';
    this.total_members = 10;
  }

  contactus() {
    this.router.navigate(['contactus']);
  }

}
