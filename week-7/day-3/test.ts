export {};
let helloWorld = "hello World";
console.log(helloWorld);

const obj = { width: 10, height: 15 };
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
};

const otherUser: User = {
  name: "Lionel",
  id: 1,
};

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
  Blue = 4,
}

enum Day {
  MONDAY = "This is monday",
  TUESDAY = "This is tuesday",
  WEDNESDAY = "This is wednesday",
  THURSDAY = "This is thursday",
  FRIDAY = "This is friday",
  SATURDAY = "This is saturday",
  SUNDAY = "This is sunday",
}

enum Planet {}

enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST,
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

let someValue: unknown = "this is a string";
// since unknown does not have the prop length,
// the line below is illegal
// let strLength: number = someValue.length;

// let strLength: number = (someValue as string).length;
let strLength: number = (<string>someValue).length;

interface LabeledValue {
  // size: number;
  label: string;
}

// note that we can use interfaces
// to define constraints for parameters
// the interface only cares about the propery label
// any object that we pass in as an argument
// can have any amount of extra properties on it
function printLabel(labeledObj: LabeledValue) {
  console.log(labeledObj.label);
}

let myObj = { color: "red", size: 10, label: "size 10 object" };
printLabel(myObj);

interface square {
  color?: string;
  width: number;
}

// as we can see, we technically do not need to define
// a property for color 
// let mySquare: square = { width: 100 };
let mySquare: square = { width: 100, color: "red" };




interface Point {
    readonly x: number;
    readonly y: number; 
}

let p1: Point = {x: 10, y: 20};
// p1.x = 5; 

let readOnlyArray: ReadonlyArray<number> = [1, 2, 3, 4]; 
//  readOnlyArray[0] = 2; 
//  readOnlyArray.push(5); 

interface SearchFunc {
    (source: string, subString: string): boolean; 
}

let mySearch: SearchFunc; 

mySearch = function (source: string, subString: string) {
    let result = source.search(subString); 
    return result > -1; 
}

// it doesn't matter what we call the parameters,
// they will always have a type association via the interface
// the function will always need to return a boolean
let otherSearch:SearchFunc = function (src, sb) {
    return true; 
}

interface ClockInterface {
    currentTime: Date;
    setTime(d: Date): void; 
}

class Clock implements ClockInterface {
    currentTime: Date = new Date();
    // setTime can now have a concrete implementation
    // this means it will have a method body
    // a method is a function on an object
    setTime(d: Date) {
        this.currentTime = d; 
    }
    constructor(h: number, m: number) {}
}



interface Shape {
    color: string;
}

interface Square extends Shape  {
    // the property color is inherited from shape
    // color: string; 
    sideLength: number; 
}

let square = {} as Square;
// you can declare square like below as well
// let square: Square;

square.color = "blue";
square.sideLength = 10; 

console.log(square);

interface PenStroke {
    penWidth: number; 
}

interface StrokedSquare extends Shape, PenStroke {
    sideLength: number; 
}

let strokedSquare: StrokedSquare = {
    color: "blue",
    sideLength: 10,
    penWidth: 5.0, 
}

function add(x: number, y:number): number {
    return x + y; 
}

let y = (x):number => x * 2; 

console.log(add(5, 3));
console.log(y(5));

function buildName(firstName: string, lastName: string) {
    return `${firstName} ${lastName}`; 
}

// below will throw an error
// too few arguments
// let result = buildName("Bob"); 
let result = buildName("Bob", "Adams");

function defaultName(firstName: string, lastName = "Smith") {
    return firstName + " " + lastName; 
}

let defaultResult = defaultName("Bob");
console.log(defaultResult);

function restName(firstName: string, ...restOfName: string[]) {
    return firstName + " " + restOfName.join(" "); 
}

let employeeName = restName("Joseph", "Samuel", "Lucas", "MacKinzie");

console.log(employeeName);


function padLeft(value:string, padding: string | number) {
    if (typeof padding === "number") {
        return Array(padding + 1).join(" ") + value; 
    }
    if (typeof padding === "string") {
        return padding + value;
    }

    throw new Error(`Expected string or number, got '${typeof padding}'`);
}

console.log(padLeft("Hello world", 4)); 