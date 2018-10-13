
var speed=0;

function A() {
    if (speed<=0)
       speed=1;
       else
        speed=speed*2;

    var image=document.getElementById("object");
    /*image.style.left=image.offsetLeft+55;
var hi= image.getBoundingClientRect().left;*/
    image.style.position = "absolute";
    var x=image.getBoundingClientRect().left-(55.54*speed);
    image.style.left=x+"px";

}

function B() {
    speed=0;
    var image=document.getElementById("object");
    /*image.style.left=image.offsetLeft+55;
var hi= image.getBoundingClientRect().left;*/
    image.style.position = "absolute";
    var y=image.getBoundingClientRect().left+55.54;
    image.style.left=y+"px";

}

function Speed() {
    document.getElementById("Speed").value=speed;

}