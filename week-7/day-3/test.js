"use strict";
exports.__esModule = true;
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
// p1.x = 5; 
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
function padLeft(value, padding) {
    if (typeof padding === "number") {
        return Array(padding + 1).join(" ") + value;
    }
    if (typeof padding === "string") {
        return padding + value;
    }
    throw new Error("Expected string or number, got '" + typeof padding + "'");
}
console.log(padLeft("Hello world", "hey"));
