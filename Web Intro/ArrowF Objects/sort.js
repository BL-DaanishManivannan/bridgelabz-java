const { addressBook } = require("../phase2-array-crud/addressBook");

// UC11 - Sort by name
function sortByName() {
    return addressBook.sort((a, b) => a.firstName.localeCompare(b.firstName));
}

// UC12 - Sort by city/state/zip
function sortByCity() {
    return addressBook.sort((a, b) => a.city.localeCompare(b.city));
}

function sortByState() {
    return addressBook.sort((a, b) => a.state.localeCompare(b.state));
}

function sortByZip() {
    return addressBook.sort((a, b) => a.zip.localeCompare(b.zip));
}

module.exports = { sortByName, sortByCity, sortByState, sortByZip };