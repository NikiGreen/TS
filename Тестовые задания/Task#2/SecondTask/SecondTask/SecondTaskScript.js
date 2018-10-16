var speed=0;
var position=0;
var i1=11;

function A() {/*Функция перемещения вперёд*/
    if (speed <= 0)
        speed = 1;
    else
        speed = speed * 2;
    position+=speed;
    var image=document.getElementById("object");
    image.style.position = "absolute";
        if(position<=i1){

        var ner=document.getElementById(position).getBoundingClientRect();

        image.style.left=ner.left+"px";image.style.right=ner.right+"px";image.style.top=ner.top+"px";image.style.bottom=ner.bottom+"px";
    } else {
        document.getElementById('for_generate' ).remove();
        area_plus();
    }Speed(speed);
}

function R() {/*Функция перемещения назад*/
    speed = -1;
    position+=speed;
    var image=document.getElementById("object");
    image.style.position = "absolute";
    if(position>i1-23){
        var ner=document.getElementById(position).getBoundingClientRect();

        image.style.left=ner.left+"px";image.style.right=ner.right+"px";image.style.top=ner.top+"px";image.style.bottom=ner.bottom+"px";
    } else {
        document.getElementById('for_generate' ).remove();
        area_minus();
    }Speed(speed);
}

function Speed(speed) {/*Функция отображения скорости*/
    document.getElementById("Speed").value="Скорость= "+speed;
}

function Position() {/*Функция отображения позиции*/
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

function area_plus() {/*Функция генерации поля при выходе за границы в сторону+*/
    while(position>i1+23)
    i1+=23;
    var em1=document.createElement('tr');
    em1.id="for_generate";
    var i;
    for(i=i1+23;i>=i1+1;i--){
        var em2=document.createElement('th');
        em2.innerHTML = i;
        em2.id=i;
        document.getElementById('main_table').appendChild(em1);
        document.getElementById('for_generate').appendChild(em2);}
    var ner=document.getElementById(position).getBoundingClientRect();
    var image=document.getElementById("object");
    image.style.left=ner.left+"px";image.style.right=ner.right+"px";image.style.top=ner.top+"px";image.style.bottom=ner.bottom+"px";
    image.width=ner.offsetWidth;
    image.height=ner.offsetHeight;
    i1+=23;
}
function area_minus() {/*Функция генерации поля при выходе за границы в сторону-*/
    var em1=document.createElement('tr');
    em1.id="for_generate";
    var i;
    for(i=i1-23;i>=i1-45;i--){
        var em2=document.createElement('th');
        em2.innerHTML = i;
        em2.id=i;
        document.getElementById('main_table').appendChild(em1);
        document.getElementById('for_generate').appendChild(em2);}
    var ner=document.getElementById(position).getBoundingClientRect();
    var image=document.getElementById("object");
    image.style.left=ner.left+"px";image.style.right=ner.right+"px";image.style.top=ner.top+"px";image.style.bottom=ner.bottom+"px";
    image.width=ner.offsetWidth;
    image.height=ner.offsetHeight;
    i1-=23;
}