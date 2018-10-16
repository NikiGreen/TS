function main_table() {/*Функция создания таблицы при загрузке страницы*/
    var i;
        for(i=11;i>=-11;i--){
        var o=document.createElement('th');
        o.innerHTML = i;
        o.id=i;
        document.getElementById('for_generate').appendChild(o);}
    var ner=document.getElementById(position).getBoundingClientRect();
    var image=document.getElementById("object");
    image.style.left=ner.left+"px";image.style.right=ner.right+"px";image.style.top=ner.top+"px";image.style.bottom=ner.bottom+"px";

}
