//hacemos un request a nuestro servicio usando ajax con json

$.ajax({
    url:'direccion',
    type:'get',
    success:function(json){
    console.log("numero de elementos encontrados"+json.length);
    for(var i=0;i<json.length;i++){
    $("#elementos").append("<li>"+json[i].municipio+"</li>");
    $("#tablita").append("<tr><td>"+json[i].id+"</td><td>"+json[i].numero+"</td><td>"+json[i].calle+"</td><td>"+json[i].cp+"</td><td>"+json[i].municipio+"</td></tr>");
     }
    }

    });




$("#guardarDireccion").click(function() {
    //aplicamos el metodo post usando la url del servicio
var numero=$("#numero").val();
var calle=$("#calle").val();
var cp=$("#cp").val();
var municipio=$("#municipio").val();

$.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function (json){
console.log(json.id);
});
}
);

$("#buscarPorId").click(function() {
    //aplicamos el metodo post usando la url del servicio
var id=$("#id").val();


$.get("direccion/"+id,function (json){
console.log(jason.municipio);
$("#numero2").val(json.numero);
$("#calle2").val(json.calle);
$("#cp2").val(json.cp);
$("#municipio2").val(json.municipio);
});
}
);
