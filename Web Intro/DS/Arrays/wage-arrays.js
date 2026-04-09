const WAGE_PER_HOUR = 20;
const MAX_HRS = 160;
const MAX_DAYS = 20;

function getWorkingHours(empCheck) {
    switch (empCheck) {
        case 1: return 4;
        case 2: return 8;
        default: return 0;
    }
}

function calcDailyWage(hours) {
    return hours * WAGE_PER_HOUR;
}

let totalHours = 0;
let totalDays = 0;
let empDailyWageArr = [];

while (totalHours < MAX_HRS && totalDays < MAX_DAYS) {
    totalDays++;
    let empCheck = Math.floor(Math.random() * 3);
    let hours = getWorkingHours(empCheck);

    totalHours += hours;
    empDailyWageArr.push(calcDailyWage(hours));
}

let totalWage = empDailyWageArr.reduce((a, b) => a + b, 0);

console.log("Daily Wages:", empDailyWageArr);
console.log("Total Wage:", totalWage);