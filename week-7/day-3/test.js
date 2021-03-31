"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
/*
---------------------
INTRO & DEFINING TYPES
---------------------
*/
console.log("\n---------\nINTRO & DEFINING TYPES\n---------\n");
var helloWorld = "hello World";
console.log(helloWorld);
var obj = { width: 10, height: 15 };
var area = obj.width * obj.height;
console.log(area);
var user = {
    name: "Hayes",
    id: 0
};
var otherUser = {
    name: "Lionel",
    id: 1
};
/*
---------------------
TYPES
---------------------
*/
console.log("\n---------\nTYPES\n---------\n");
// variable: type = value/literal;
var completed = false;
var decimal = 6;
// let big: bigint = 100n;
var color = "blue";
// below is not allowed!
// color = 4;
var numArray = ["1", "2", "3"];
var list = [1, 2, 3];
var myTuple;
myTuple = ["hello", 10];
// below will not work as it doesn't follow the order
// myTuple = [10, "hello"];
var Color;
(function (Color) {
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["Blue"] = 4] = "Blue";
})(Color || (Color = {}));
var Day;
(function (Day) {
    Day["MONDAY"] = "This is monday";
    Day["TUESDAY"] = "This is tuesday";
    Day["WEDNESDAY"] = "This is wednesday";
    Day["THURSDAY"] = "This is thursday";
    Day["FRIDAY"] = "This is friday";
    Day["SATURDAY"] = "This is saturday";
    Day["SUNDAY"] = "This is sunday";
})(Day || (Day = {}));
var Planet;
(function (Planet) {
})(Planet || (Planet = {}));
var Direction;
(function (Direction) {
    Direction[Direction["NORTH"] = 0] = "NORTH";
    Direction[Direction["SOUTH"] = 1] = "SOUTH";
    Direction[Direction["EAST"] = 2] = "EAST";
    Direction[Direction["WEST"] = 3] = "WEST";
})(Direction || (Direction = {}));
var myDay = Day.WEDNESDAY;
console.log(myDay);
var c = Color.Green;
var myColor = Color.Blue;
console.log(c);
console.log("This is my color: " + myColor);
var notSure;
notSure = "maybe a string instead";
console.log(notSure);
// declare function getValue(key: string): any;
// const str: string = getValue("myString");
// any allows us to avoid the static type checking
// think of it as an offswitch for typescript
var looselyTyped = 4;
// looselyTyped.ifItExists();
// looselyTyped.toFixed();
var strictlyTyped = 4;
// typescript will check for properties on strictlytyped
// thus the line below will not work
// strictlyTyped.toFixed();
function warnUser() {
    console.log("This is mywarning message");
}
warnUser();
var someValue = "this is a string";
// since unknown does not have the prop length,
// the line below is illegal
// let strLength: number = someValue.length;
// let strLength: number = (someValue as string).length;
var strLength = someValue.length;
/*
---------------------
INTERFACES
---------------------
*/
console.log("\n---------\nINTERFACES\n---------\n");
// note that we can use interfaces
// to define constraints for parameters
// the interface only cares about the propery label
// any object that we pass in as an argument
// can have any amount of extra properties on it
function printLabel(labeledObj) {
    console.log(labeledObj.label);
}
var myObj = { color: "red", size: 10, label: "size 10 object" };
printLabel(myObj);
// as we can see, we technically do not need to define
// a property for color
// let mySquare: square = { width: 100 };
var mySquare = { width: 100, color: "red" };
var p1 = { x: 10, y: 20 };
var collection = {
    numbers: [1, 2, 3]
};
var newNumbers = collection.numbers.map(function (x) { return x; });
var readOnlyArray = [1, 2, 3, 4];
var mySearch;
mySearch = function (source, subString) {
    var result = source.search(subString);
    return result > -1;
};
// it doesn't matter what we call the parameters,
// they will always have a type association via the interface
// the function will always need to return a boolean
var otherSearch = function (src, sb) {
    return true;
};
var Clock = /** @class */ (function () {
    function Clock(h, m) {
        this.currentTime = new Date();
    }
    // setTime can now have a concrete implementation
    // this means it will have a method body
    // a method is a function on an object
    Clock.prototype.setTime = function (d) {
        this.currentTime = d;
    };
    return Clock;
}());
var square = {};
// you can declare square like below as well
// let square: Square;
square.color = "blue";
square.sideLength = 10;
console.log(square);
var strokedSquare = {
    color: "blue",
    sideLength: 10,
    penWidth: 5.0
};
/*
---------------------
FUNCTIONS
---------------------
*/
console.log("\n---------\nFUNCTIONS\n---------\n");
function add(x, y) {
    return x + y;
}
var y = function (x) { return x * 2; };
console.log(add(5, 3));
console.log(y(5));
function buildName(firstName, lastName) {
    return firstName + " " + lastName;
}
// below will throw an error
// too few arguments
// let result = buildName("Bob");
var result = buildName("Bob", "Adams");
function defaultName(firstName, lastName) {
    if (lastName === void 0) { lastName = "Smith"; }
    return firstName + " " + lastName;
}
var defaultResult = defaultName("Bob");
console.log(defaultResult);
function restName(firstName) {
    var restOfName = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        restOfName[_i - 1] = arguments[_i];
    }
    return firstName + " " + restOfName.join(" ");
}
var employeeName = restName("Joseph", "Samuel", "Lucas", "MacKinzie");
console.log(employeeName);
/*
---------------------
Unions and Intersections
---------------------
*/
console.log("\n---------\nUNIONS & INTERSECTIONS\n---------\n");
function padLeft(value, padding) {
    if (typeof padding === "number") {
        return Array(padding + 1).join(" ") + value;
    }
    if (typeof padding === "string") {
        return padding + value;
    }
    throw new Error("Expected string or number, got '" + typeof padding + "'");
}
console.log("print out of the function 'padLeft()' \nwith a number passed in: " + padLeft("Hello world", 4) + "\n");
console.log("print out of the function 'padLeft()' \nwith a string passed in: " + padLeft("Hello world", "Yo! "));
var myStudentWorker = {
    name: "Joe",
    age: 31,
    employeeId: "ID3241"
};
/*
---------------------
CLASSES
---------------------
*/
console.log("\n---------\nCLASSES\n---------\n");
/**
 * Classes are data structures that represent
 * blueprints for objects with certain qualities
 * and functionalities related to inheritance
 * and other OOP concepts
 */
var Animal = /** @class */ (function () {
    function Animal(name, nickName) {
        this.name = name;
        this.nickName = nickName;
    }
    Animal.prototype.move = function (distanceInMeters) {
        if (distanceInMeters === void 0) { distanceInMeters = 0; }
        console.log(this.name + " moved " + distanceInMeters + "m.");
    };
    return Animal;
}());
/**
 * class Snake is extending class Animal
 * thus inheriting its properties
 */
var Snake = /** @class */ (function (_super) {
    __extends(Snake, _super);
    function Snake(name, nickName) {
        return _super.call(this, name, nickName) || this;
    }
    Snake.prototype.move = function (distanceInMeters) {
        if (distanceInMeters === void 0) { distanceInMeters = 5; }
        console.log("Slithering...");
        _super.prototype.move.call(this, distanceInMeters);
    };
    return Snake;
}(Animal));
/**
 * instantiating a new snake object
 * note the "new" keyword; this is used
 * whenever we call the class's constructor.
 *  */
var sam = new Snake("Sammy the Python", "SammyWammy");
console.log(sam);
/**
 * The line below is illegal!
 * Member nickName is private!
 */
// console.log(sam.nickName);
sam.move();
