
$("#boton1").click(function(){
    var idProduct = $('#texto').val();
    getOne(idProduct);
});

function getOne(idProduct){
    $.ajax({
        url: "http://localhost:8181/api/products/" + idProduct,
        method: "GET",
        dataType: 'json',
        header: {
            "Accept": "application/json"
        },
        contentType: "application/x-www-form-urlencoded",
        data: {id: idProduct},
        success: function(data){
            $("#resultados").html(JSON.stringify(data));
        },

        error: function(error){
            console.log(error)
        }
    });
};