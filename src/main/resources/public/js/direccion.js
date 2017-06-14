//hacemos un request a nuestro servicio usando ajax con json
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
});
}
);
