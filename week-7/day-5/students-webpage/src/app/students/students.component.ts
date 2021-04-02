import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { MessageService } from '../message.service';
// import { STUDENTS } from '../mock-students';


// This is known as a decorator
// it provides metadata for this component
@Component({
  // this selector is referenced in app.component.html
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css'],
})
export class StudentsComponent implements OnInit {
  // students = STUDENTS; 
  students?: Student[]; 

  getStudents(): void {
    this.studentService.getStudents()
    .subscribe(students => this.students = students);
  }

  selectedStudent?: Student;

  // the constructor creates an instance of an object
  // instances are built from the blueprint described in classes
  constructor(private studentService: StudentService, 
    private messageService: MessageService) {}

  ngOnInit(): void {
    console.log("hello from student component!");
    this.getStudents();
  }

  onSelect(student: Student): void {
    this.selectedStudent = student; 
    this.messageService
    .add(`StudentComponent: Selected student id=${student.id}`);
  }
  
}
