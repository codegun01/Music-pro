

async function registrarProducto(){
    let datos = {}
    datos.marca = document.getElementById('marca').value;
    datos.precioCosto = document.getElementById('precio_costo').value;
    datos.precioVenta = document.getElementById('precio_venta').value;
    datos.descripcion = document.getElementById('categorias').value;
    
    const request = await fetch("/api/productos" ,{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    
}