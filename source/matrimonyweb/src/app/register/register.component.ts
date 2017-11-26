import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterDataComponent } from './registerdata.component';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent extends RegisterDataComponent implements OnInit {

  private title: string;
  private error: string;

  private firstname: string;
  private lastname: string;
  private mobileno: number;
  private genderId: number;
  private addressLine1: string;
  private addressLine2: string;
  private place: string;
  private maritalStatusId: number;
  private dob: string;
  private email: string;
  private pincode: string;
  private physicaldisability: string;

  private isvalid: boolean;

  private router: Router;

  constructor(router: Router) {
    super();
    this.router = router;
  }

  ngOnInit() {
    this.title = 'Register';
    this.error = '';
  }

  public updateGenderId(genderId) {
    this.genderId = genderId;
  }

  public updateMaritalStatusId(maritalStatusId) {
    this.maritalStatusId = maritalStatusId;
  }

  public register() {
    this.isvalid = true;
    if (this.firstname == null) {
      this.error = 'first name is blank.';
      this.isvalid = false;
    }if (this.lastname == null) {
      this.error += 'last name is blank.';
      this.isvalid = false;
    }if (this.mobileno == null) {
      this.error += 'mobile name is blank.';
      this.isvalid = false;
    }if (this.email == null) {
      this.error += 'email name is blank.';
      this.isvalid = false;
    }if (this.genderId === 0) {
      this.error += 'gender is blank.';
      this.isvalid = false;
    }if (this.dob == null) {
      this.error += 'date of birth is blank.';
      this.isvalid = false;
    }if (this.addressLine1 == null) {
      this.error += 'addressline1 is blank.';
      this.isvalid = false;
    }if (this.place == null) {
      this.error += 'place is blank.';
      this.isvalid = false;
    }if (this.pincode == null) {
      this.error += 'pincode is blank.';
      this.isvalid = false;
    }
    if (this.isvalid) {

      console.log('First Name: ' + this.firstname);
      console.log('Last Name: ' + this.lastname);
      console.log('Mobile No: ' + this.mobileno);
      console.log('Email Id: ' + this.email);
      console.log('Gender: ' + this.genderId);
      console.log('Date of Birth: ' + this.dob);
      console.log('Primary Address Line: ' + this.addressLine1);
      console.log('Place: ' + this.place);
      console.log('Pincode: ' + this.pincode);
      console.log('Marital Status: ' + this.maritalStatusId);
      console.log('Physical Disability: ' + this.physicaldisability);

      this.router.navigate(['dashboard']);
    }
  }
}
