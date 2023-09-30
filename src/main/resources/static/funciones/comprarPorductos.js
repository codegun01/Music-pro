
const getUrl = new URLSearchParams(window.location.search);
id = getUrl.get('id');
console.log(id);
const url = "/api/productos"; 

fetch(url)
.then(res => res.json())
.then(data => {
    console.log(data);
    let titulo = '';
    let precioPeso = '';
    let marca = '';
    let btnComprar = "";
    let cambioDolar = 0;
    data.forEach( productos => {
        if(productos.idProducto == id){
            console.log(productos);
            titulo = productos.descripcion;
            precioPeso = productos.precioVenta;
            marca = productos.marca;
            btnComprar = `<button class="btn__comprar" onclick="comprarProducto(${productos.idProducto})">COMPRAR</button>`;
        }
    })
    document.getElementById('titulo__container').innerHTML = titulo;
    document.getElementById('precio__pesos').innerHTML = "Precio: $ " + precioPeso;
    document.getElementById('precio__dolar').innerHTML = "Precio en dolares: " + precioDolares(precioPeso);
    document.getElementById('titulo__des').innerHTML = marca;
    document.getElementById("btn__comprar").innerHTML = btnComprar;
    imagenProductos(titulo);
});



fetch('https://mindicador.cl/api').then(function(response) {
return response.json();
}).then(function(dailyIndicators) {
    document.getElementById('dolar__referente').innerHTML = "Valor dolar: $" + dailyIndicators.dolar.valor;
    let dolar = document.getElementById("dolar2");
    dolar.value = dailyIndicators.dolar_intercambio.valor;
    
    
}).catch(function(error) {
    console.log('Requestfailed', error);
});


const precioDolares = (pesos) => {
    let dolar = document.getElementById("dolar2");
    let resultado = pesos / dolar.value;
    return resultado.toLocaleString('en-US',{style:'currency', currency:'USD', minimumFractionDigits:2});
}


const imagenProductos = (imagen) => {
    let imagenes = ['../img/guitarra_cuerpo_solido.PNG',
                    '../img/bajo_2.PNG',
                    '../img/piano_1.PNG',
                    '../img/amplificador_2.PNG',
                    '../img/bateria_1.PNG',
                    '../img/mixers_other_3.PNG'];
        
    let index =  document.getElementById('imagen');
    if(imagen == "Guitarra"){
        index.src = imagenes[0];
    }else if(imagen == "Bajos"){
        index.src = imagenes[1];
    }else if(imagen == "Piano"){
        index.src = imagenes[2];
    }else if(imagen == "Amplificadores"){
        index.src = imagenes[3];
    }else if(imagen == "Percusion"){
        index.src = imagenes[4];
    }else{
        index.src = imagenes[5];
    }
    
    
    
}

var cont = 0;
async function comprarProducto(id){
    if(!confirm("¿Desea agregar este producto al carrito de compra? " + id)){
        return;
    }
    const request = await fetch("/api/productos/" + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    cont++;
    document.getElementById("contador").innerHTML = cont;
}
