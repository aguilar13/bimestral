//hacemos un request a nuestro servicio usando ajax con json
$("#guardarDireccion").click(function() {
    //aplicamos el metodo post usando la url del servicio
$.post("direccion/12/calle 13/55130/Ecatepunk",function(json) {
console.log(json.id);

});
}
);
