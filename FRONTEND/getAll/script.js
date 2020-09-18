$("#boton1").click(function(){
    getAll();
});

function getAll(){
    $.ajax({
        url: "http://localhost:8181/api/products",
        method: "GET",
        header: {
            "Accept": "application/json"
        },
        contentType: "application/x-www-form-urlencoded",

        success: function(data){
            $("#resultados").html(JSON.stringify(data));
        },

        error: function(error){
            console.log(error)
        }
    });
};