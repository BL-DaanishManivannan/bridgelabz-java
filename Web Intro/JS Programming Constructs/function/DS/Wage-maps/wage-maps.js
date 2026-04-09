const WAGE_PER_HOUR = 20;
const MAX_HRS = 160;
const MAX_DAYS = 20;

function getWorkingHours(empCheck) {
    return empCheck === 2 ? 8 : empCheck === 1 ? 4 : 0;
}

function calcDailyWage(hours) {
    return hours * WAGE_PER_HOUR;
}

let totalHours = 0;
let totalDays = 0;
let empDailyWageMap = new Map();

while (totalHours < MAX_HRS && totalDays < MAX_DAYS) {
    totalDays++;

    let empCheck = Math.floor(Math.random() * 3);
    let hours = getWorkingHours(empCheck);

    totalHours += hours;
    empDailyWageMap.set(totalDays, calcDailyWage(hours));
}

// Compute total
let totalWage = Array.from(empDailyWageMap.values())
    .reduce((sum, w) => sum + w, 0);

console.log(empDailyWageMap);
console.log("Total Wage:", totalWage);