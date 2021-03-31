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
