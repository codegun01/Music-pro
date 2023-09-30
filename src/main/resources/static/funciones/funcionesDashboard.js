
const url = "/api/usuario";
const url3 = "/api/clientes";


fetch(url)
.then(res => res.json())
.then(data => {
    let most = "";
    var cont = 0;
    data.forEach(usuario => {
                usuario.nombre;
                        cont++;
                       
    });
    console.log("Total de Clientes: " + cont);
    document.getElementById('cant__usuarios').innerHTML = cont;
});


fetch(url3)
.then(res => res.json())
.then(data => {
    let contadorCliente = 0;
    data.forEach(cliente => {
        contadorCliente ++;
        cliente.nombre;
        
    });
    
    console.log(contadorCliente);
    document.getElementById('cant__clientes').innerHTML = contadorCliente;
});





const url2 = "/api/productos";


fetch(url2)
.then(res => res.json())
.then(data => {
    let cantGuitar = 0;
    let cantBajos = 0;
    let cantPiano = 0;
    let cantPercusion = 0;
    let cantAmplificador = 0;
    let cantAccesorios = 0;
    let totalProductos = 0;
    let totalPrecios = 0;
    let totalGuitar = 0;
    let totalBajos = 0;
    let totalPiano = 0;
    let totalPercusion = 0;
    let totalAmplificador = 0;
    let totalAccesorios = 0;
    
    
    data.forEach(producto => {
        totalProductos++;
        totalPrecios += producto.precioCosto;
        console.log(producto);
        if(producto.descripcion == "Guitarra"){
            cantGuitar++;
            totalGuitar += producto.precioCosto; 
        }else if(producto.descripcion == "Piano"){
            cantPiano++;
            totalPiano += producto.precioCosto;
        }else if(producto.descripcion == "Percusion"){
            cantPercusion++;
            totalPercusion += producto.precioCosto;
        }else if(producto.descripcion == "Bajos"){
            cantBajos++;
            totalBajos += producto.precioCosto;
        }else if(producto.descripcion == "Amplificadores"){
            cantAmplificador++;
            totalAmplificador += producto.precioCosto;
        }else{
            cantAccesorios++;
            totalAccesorios += producto.precioCosto;
        }
    });
    console.log(totalProductos);
    console.log(totalPrecios);
    console.log(totalGuitar);
    document.getElementById("cant__guitar").innerHTML = cantGuitar;
    document.getElementById("cant__bajos").innerHTML = cantBajos;
    document.getElementById("cant__pianos").innerHTML = cantPiano;
    document.getElementById("cant__percusion").innerHTML = cantPercusion;
    document.getElementById("cant__amplificadores").innerHTML = cantAmplificador;
    document.getElementById("cant__accesorios").innerHTML = cantAccesorios;
    document.getElementById("total__productos").innerHTML = totalProductos;
    document.getElementById("total__stock").innerHTML = "$" + totalPrecios;
    document.getElementById("tot__guitar").innerHTML = "$" + totalGuitar;
    document.getElementById("tot__bajos").innerHTML = "$" + totalBajos;
    document.getElementById("tot__percusion").innerHTML = "$" + totalPercusion;
    document.getElementById("tot__ampli").innerHTML = "$" + totalAmplificador;
    document.getElementById("tot__acce").innerHTML = "$" + totalAccesorios;
    document.getElementById("tot__pianos").innerHTML = "$" + totalPiano;
    
});


