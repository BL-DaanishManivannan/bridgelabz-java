const name = document.querySelector("#name");
const email = document.querySelector("#email");
const phone = document.querySelector("#phone");

// Name validation
name.addEventListener("input", () => {
    let pattern = /^[A-Z][a-z]{2,}$/;
    if (!pattern.test(name.value)) {
        name.style.border = "2px solid red";
    } else {
        name.style.border = "2px solid green";
    }
});

// Email validation
email.addEventListener("input", () => {
    let pattern = /^[a-zA-Z0-9]+@[a-z]+\.[a-z]{2,}$/;
    email.style.border = pattern.test(email.value) ? "green" : "red";
});

// Phone validation
phone.addEventListener("input", () => {
    let pattern = /^\d{2}\s\d{10}$/;
    phone.style.border = pattern.test(phone.value) ? "green" : "red";
});