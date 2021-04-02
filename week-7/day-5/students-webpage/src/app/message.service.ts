import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  messages: String[] = []; 

  // this function adds a message
  // to our array
  add(message: string) {
    this.messages.push(message); 
  }

  // this clears our array
  clear() {
    this.messages = []; 
  }

  constructor() { }
}
