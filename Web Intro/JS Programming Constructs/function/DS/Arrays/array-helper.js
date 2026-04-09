let wages = [0, 160, 80, 160, 0, 80];

// UC7A - Total using reduce
let total = wages.reduce((sum, w) => sum + w, 0);
console.log("Total:", total);

// UC7B - Map day-wise
let mapDay = wages.map((w, i) => `Day ${i+1} = ${w}`);
console.log(mapDay);

// UC7C - Filter full time (160)
let fullTime = wages.filter(w => w === 160);
console.log("Full Time:", fullTime);

// UC7D - Find first full time
let firstFull = wages.find(w => w === 160);
console.log("First Full Time:", firstFull);

// UC7E - Every full time?
console.log("All Full Time:", wages.every(w => w === 160));

// UC7F - Any part time (80)?
console.log("Any Part Time:", wages.some(w => w === 80));

// UC7G - Days worked
let daysWorked = wages.reduce((count, w) => w > 0 ? count + 1 : count, 0);
console.log("Days Worked:", daysWorked);