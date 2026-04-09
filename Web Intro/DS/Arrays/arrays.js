// UC1 - Array creation
let arr = ["Bulldog", "Beagle", "Labrador"];

// UC2 - Push & Pop
arr.push("Poodle");
arr.pop();

// UC3 - Shift & Unshift
arr.unshift("Golden Retriever");
arr.shift();

// UC4 - Splice
arr.splice(1, 1, "Pug");

// UC5 - Slice
let newArr = arr.slice(1, 3);

console.log(arr);
console.log(newArr);