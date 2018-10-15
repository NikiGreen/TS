var speed=0;

function A() {
    if (speed <= 0)
        speed = 1;
    else
        speed = speed * 2;

    var image=document.getElementById("object");
    /*image.style.left=image.offsetLeft+55;
var hi= image.getBoundingClientRect().left;*/
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left-(55.75*speed)>290)
    var x=image.getBoundingClientRect().left-(55.75*speed);else
        alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам сбросить скорость или вернутся назад!!!");
    image.style.left=x+"px";
    Speed(speed);

}

function R() {
    speed = -1;
    var image=document.getElementById("object");
    /*image.style.left=image.offsetLeft+55;
var hi= image.getBoundingClientRect().left;*/
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left+55.75*Math.abs(speed)<1600)
    var y=image.getBoundingClientRect().left+55.75*Math.abs(speed);else
        alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам начать движение вперёд!!!");
    image.style.left=y+"px";
    Speed(speed);
}

function Speed(speed) {
    document.getElementById("Speed").value="Скорость= "+speed;
}

function Position() {
    var pos=document.getElementById("object");
    document.getElementById("Position").value="Позиция ="+pos.getBoundingClientRect().left+"px";
}

function forA() {
    A();
    Position();
}

function forR() {
    R();
    Position();
}