var speed=0;
var position=0;

function A() {
    if (speed <= 0)
        speed = 1;
    else
        speed = speed * 2;
    var image=document.getElementById("object");
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left-(55.75*speed)>290){
        position+=speed;
        var x=image.getBoundingClientRect().left-(55.75*speed);
    } else {
        alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам сбросить скорость или вернутся назад!!!");

       /* var prompt  =   document.getElementById('for_generate');
        prompt.innerHTML = "<th>\"1\"</th>";*/


        /*var i;
        for(i=11;i>=-12;i--){
            var o=document.createElement('th')
        o.innerHTML = i;
        document.getElementById('main_table').appendChild(o)}*/
    }
    image.style.left=x+"px";
    Speed(speed);
}

function R() {
    speed = -1;

    var image=document.getElementById("object");
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left+55.75*Math.abs(speed)<1600){
        position+=speed;
        var y=image.getBoundingClientRect().left+55.75*Math.abs(speed);
    } else
        alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам начать движение вперёд!!!");
    image.style.left=y+"px";
    Speed(speed);
}

function Speed(speed) {
    document.getElementById("Speed").value="Скорость= "+speed;
}

function Position() {
    var pos=document.getElementById("object");
    // document.getElementById("Position").value="Позиция ="+pos.getBoundingClientRect().left+"px";
    document.getElementById("Position").value="Позиция ="+position;
}

function forA() {
    A();
    Position();
}

function forR() {
    R();
    Position();
}