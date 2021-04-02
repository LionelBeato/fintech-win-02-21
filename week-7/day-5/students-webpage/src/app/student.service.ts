import { Injectable } from '@angular/core';
import { Student } from './student';
import { STUDENTS } from './mock-students';

import {Observable, of } from 'rxjs'; 
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  // this is a basic get function that returns STUDENTS
  // note the return type is an array of type Student
  getStudents(): Observable<Student[]> {
    this.messageService.add("StudentService: fetched service");
    return of(STUDENTS);
  }

  constructor(private messageService: MessageService) { }
}
