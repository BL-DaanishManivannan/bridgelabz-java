const { addressBook } = require("../phase2-array-crud/addressBook");

// UC8 - Search by city
function searchByCity(city) {
    return addressBook.filter(c => c.city === city);
}

// UC9 - View by city
function viewByCity(city) {
    return addressBook.filter(c => c.city === city);
}

// UC10 - Count by city
function countByCity(city) {
    return addressBook.filter(c => c.city === city).length;
}

module.exports = { searchByCity, viewByCity, countByCity };