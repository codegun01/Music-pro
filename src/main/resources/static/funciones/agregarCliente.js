

async function registrarCliente(){
    let datos = {}
    datos.nombre = document.getElementById('nombre').value;
    datos.direccion = document.getElementById('direccion').value;
    datos.email = document.getElementById('email').value;
    datos.telefono = document.getElementById('telefono').value;
    
    
    const request = await fetch("/api/clientes" ,{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    
}

