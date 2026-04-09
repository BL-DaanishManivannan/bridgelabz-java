// UC11 - Powers of 2
let n = 5;

for (let i = 0; i <= n; i++) {
    console.log(2 ** i);
}

// UC12 - Prime check
let num = 7;
let isPrime = true;

for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) isPrime = false;
}

console.log("Is Prime:", isPrime);

// UC13 - Factorial
let fact = 1;

for (let i = 1; i <= 5; i++) {
    fact *= i;
}

console.log("Factorial:", fact);