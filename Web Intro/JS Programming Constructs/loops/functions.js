// UC16 - Temperature conversion
function toF(c) {
    return (c * 9/5) + 32;
}

function toC(f) {
    return (f - 32) * 5/9;
}

console.log(toF(0));
console.log(toC(32));

// UC17 - Palindrome
function isPalindrome(num) {
    let rev = num.toString().split('').reverse().join('');
    return num.toString() === rev;
}

console.log(isPalindrome(121));

// UC18 - Prime + Palindrome
function isPrime(num) {
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return num > 1;
}

let number = 131;

console.log("Prime:", isPrime(number));
console.log("Palindrome:", isPalindrome(number));