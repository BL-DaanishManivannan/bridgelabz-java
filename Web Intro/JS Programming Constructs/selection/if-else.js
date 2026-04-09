// UC6 - Min & Max of 5 random 3-digit numbers
let numbers = [];

for (let i = 0; i < 5; i++) {
    numbers.push(Math.floor(Math.random() * 900) + 100);
}

console.log("Numbers:", numbers);
console.log("Min:", Math.min(...numbers));
console.log("Max:", Math.max(...numbers));

// UC7 - Leap Year
let year = 2024;
let isLeap = (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
console.log("Leap Year:", isLeap);

// UC8 - Coin Flip
console.log(Math.random() < 0.5 ? "Heads" : "Tails");