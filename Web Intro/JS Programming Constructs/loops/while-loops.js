// UC14 - Powers of 2 till 256
let i = 0;

while (2 ** i <= 256) {
    console.log(2 ** i);
    i++;
}

// UC15 - Gambler simulation
let money = 100;
let goal = 200;

while (money > 0 && money < goal) {
    money += Math.random() < 0.5 ? 1 : -1;
}

console.log("Final Money:", money);