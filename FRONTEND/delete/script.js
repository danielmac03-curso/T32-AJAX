
$("#boton1").click(function(){
    var idProduct = $('#texto').val();
    borrar(idProduct);
});

function borrar(idProduct){
    $.ajax({
        url: "http://localhost:8181/api/products/" + idProduct,
        method: "DELETE",
        dataType: 'json',
        header: {
            "Accept": "application/json"
        },
        contentType: "application/x-www-form-urlencoded",
        data: {id: idProduct},
        success: alert("Eliminado correctamente"),

        error: function(error){
            console.log(error)
        }
    });
};