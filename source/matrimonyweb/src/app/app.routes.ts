import { Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ContactUsComponent } from './contact-us/contact-us.component';

export const AppRoutes: Routes = [
    {
      path: '',
      component: LoginComponent
    },
    {
      path: 'register',
      component: RegisterComponent
    },
    {
      path: 'dashboard',
      component: DashboardComponent
    },
    {
      path: 'contactus',
      component: ContactUsComponent
    }
  ];
