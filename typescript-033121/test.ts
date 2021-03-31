export {};
let helloWorld = "hello World";
console.log(helloWorld);

const obj = { width: 10, height: 15};
const area = obj.width * obj.height;

console.log(area);

// interfaces are how we define the shape of our objects
// they are the templates of our objects
interface User {
    name: string;
    id: number; 
}

const user: User = {
    name: "Hayes",
    id: 0,
}

const otherUser: User = {
    name: "Lionel",
    id: 1, 
}

// variable: type = value/literal; 
let completed: boolean = false; 
let decimal: number = 6; 
// let big: bigint = 100n; 
let color: string = "blue"; 
// below is not allowed! 
// color = 4; 

let numArray: string[] = ["1", "2", "3"];
let list: Array<number> = [1, 2, 3]; 

let myTuple: [string, number];
myTuple = ["hello", 10]; 
// below will not work as it doesn't follow the order
// myTuple = [10, "hello"]; 

enum Color {
    Red = 1,
    Green = 2,
    Blue = 4 
}

enum Day {
    MONDAY = "This is monday",
    TUESDAY = "This is tuesday",
    WEDNESDAY = "This is wednesday",
    THURSDAY =  "This is thursday", 
    FRIDAY = "This is friday",
    SATURDAY = "This is saturday",
    SUNDAY = "This is sunday"
}

enum Planet {

}

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

let myDay: Day = Day.WEDNESDAY;
console.log(myDay);


let c: Color = Color.Green;
let myColor: Color = Color.Blue;

console.log(c);
console.log(`This is my color: ${myColor}`);

let notSure: unknown; 
notSure = "maybe a string instead"; 

console.log(notSure);

// declare function getValue(key: string): any; 
// const str: string = getValue("myString");

// any allows us to avoid the static type checking
// think of it as an offswitch for typescript
let looselyTyped: any = 4;
// looselyTyped.ifItExists(); 
// looselyTyped.toFixed();

let strictlyTyped: unknown = 4; 
// typescript will check for properties on strictlytyped
// thus the line below will not work
// strictlyTyped.toFixed(); 

function warnUser(): void {
    console.log("This is mywarning message"); 
}

warnUser();
