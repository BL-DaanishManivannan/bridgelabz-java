const Contact = require("../phase1-class-validation/contact");

let addressBook = [];

// Add
function addContact(contact) {
    addressBook.push(contact);
}

// Edit
function editContact(name, newCity) {
    let contact = addressBook.find(c => c.firstName === name);
    if (contact) contact.city = newCity;
}

// Delete
function deleteContact(name) {
    addressBook = addressBook.filter(c => c.firstName !== name);
}

module.exports = { addressBook, addContact, editContact, deleteContact };