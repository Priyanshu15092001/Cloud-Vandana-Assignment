const card = document.querySelector(".profile-card");

card.addEventListener("mousemove", (event) => {
    const { left, top, width, height } = card.getBoundingClientRect();
    const x = (event.clientX - left - width / 2) / 20;
    const y = (event.clientY - top - height / 2) / 20;

    card.style.transform = `perspective(1000px) rotateX(${-y}deg) rotateY(${x}deg)`;
});

card.addEventListener("mouseleave", () => {
    card.style.transform = "perspective(1000px) rotateX(0deg) rotateY(0deg)";
});
