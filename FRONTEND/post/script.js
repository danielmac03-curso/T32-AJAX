$("#boton1").click(function(){
    var nomProduct = $('#nom').val();
    var detailProduct = $('#detail').val();
    post(nomProduct, detailProduct);
});


function post(nomProduct, detailProduct){
    $.ajax({
        url: "http://localhost:8181/api/products/",
        type: "POST",
        dataType: 'json',
        headers: {
            "Accept": "application/json",
            'Content-Type': 'application/json' 
        },
        contentType: "application/x-www-form-urlencoded",

        data: JSON.stringify({"name": nomProduct, "detail": detailProduct}),
       
        success: alert("Product Posted in DB"),
 
        error: function(error){
            console.log(error)
        }
    });
};

