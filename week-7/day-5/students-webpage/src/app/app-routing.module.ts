import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { StudentsComponent } from './students/students.component';
import { TeachersComponent } from './teachers/teachers.component';

const routes: Routes = [
  { path: 'students', component: StudentsComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: 'teachers', component: TeachersComponent}, 
  { path: '', redirectTo: '/homepage', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
