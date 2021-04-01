import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { STUDENTS } from '../mock-students';

// This is known as a decorator
// it provides metadata for this component
@Component({
  // this selector is referenced in app.component.html
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css'],
})
export class StudentsComponent implements OnInit {
  students = STUDENTS; 

  selectedStudent?: Student;

  constructor() {}

  ngOnInit(): void {}

  onSelect(student: Student): void {
    this.selectedStudent = student; 
  }
  
}
