const password = document.querySelector("#password");

password.addEventListener("input", () => {
    let pattern = /^(?=.*[A-Z])(?=.*\d)(?=.*[@#$%^&+=]).{8,}$/;

    if (pattern.test(password.value)) {
        password.style.border = "2px solid green";
    } else {
        password.style.border = "2px solid red";
    }
});