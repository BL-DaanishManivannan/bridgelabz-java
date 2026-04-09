// UC1 - Generate single digit random
console.log(Math.floor(Math.random() * 10));

// UC2 - Dice number (1–6)
console.log(Math.floor(Math.random() * 6) + 1);

// UC3 - Sum of two dice
let dice1 = Math.floor(Math.random() * 6) + 1;
let dice2 = Math.floor(Math.random() * 6) + 1;
console.log("Sum:", dice1 + dice2);