// UC4 - 5 random 2-digit numbers → sum & avg
let sum = 0;

for (let i = 0; i < 5; i++) {
    let num = Math.floor(Math.random() * 90) + 10;
    sum += num;
}

console.log("Sum:", sum);
console.log("Average:", sum / 5);

// UC5 - Unit Conversion
// 42 inches to feet
console.log("42 inches in feet:", 42 / 12);

// Plot area
let area = 60 * 40; // feet
console.log("Area in sq ft:", area);

// 25 plots in acres
console.log("Area in acres:", (area * 25) / 43560);