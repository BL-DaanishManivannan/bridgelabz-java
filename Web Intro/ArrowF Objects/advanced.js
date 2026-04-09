const { addressBook } = require("../phase2-array-crud/addressBook");

// UC6 - Count
let count = addressBook.reduce((acc) => acc + 1, 0);
console.log("Count:", count);

// UC7 - Duplicate check
function isDuplicate(name) {
    return addressBook.filter(c => c.firstName === name).length > 1;
}