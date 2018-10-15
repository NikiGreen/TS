var speed=0;
var position=0;
var i1=11;
var i2=-13;

function A() {
    if (speed <= 0)
        speed = 1;
    else
        speed = speed * 2;
    var image=document.getElementById("object");
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left-(58*speed)>290){
        position+=speed;
        var x=image.getBoundingClientRect().left-(57.5*speed);
    } else {
        /*alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам сбросить скорость или вернутся назад!!!");*/
        document.getElementById('for_generate' ).remove();
        area_plus();
        position+=speed;
    }
    image.style.left=x+"px";
    Speed(speed);
}

function R() {
    speed = -1;

    var image=document.getElementById("object");
    image.style.position = "absolute";
    if(image.getBoundingClientRect().left+58.56*Math.abs(speed)<1600){
        position+=speed;
        var y=image.getBoundingClientRect().left+58.56*Math.abs(speed);
    } else {
        alert("Вы пытаетесь покинуть зону пригодную для перемещения марсохода!!! \nРекомендуем вам начать движение вперёд!!!");
        document.getElementById('for_generate' ).remove();
        area_minus();
        position+=speed;
    }
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

function area_plus() {
    var em1=document.createElement('tr');
    em1.id="for_generate";
    var i;
    for(i=i1+23;i>=i1+1;i--){
        var em2=document.createElement('th');
        em2.innerHTML = i;
        document.getElementById('main_table').appendChild(em1);
        document.getElementById('for_generate').appendChild(em2);}
    i1+=23;
}
function area_minus() {
    i1-=23;
    var em1=document.createElement('tr');
    em1.id="for_generate";
    var i;
    for(i=i1;i>=i1-22;i--){
        var em2=document.createElement('th');
        em2.innerHTML = i;
        document.getElementById('main_table').appendChild(em1);
        document.getElementById('for_generate').appendChild(em2);}

}