let myMap = new Map();

// UC8 - Set values
myMap.set("name", "Daanish");
myMap.set("role", "Developer");

// Get values
console.log(myMap.get("name"));

// Iterate
for (let [key, value] of myMap) {
    console.log(key, value);
}

// Check
console.log(myMap.has("role"));

// Delete
myMap.delete("role");