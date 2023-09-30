

const url = "/api/productos";

fetch(url)
.then(res => res.json())
.then(data => {
    let most = "";
    data.forEach(producto => {
        console.log(producto);
        most += `<tr>
                    <td data-label="S.No">${producto.idProducto}</td>
                    <td data-label="Name">${producto.marca}</td>
                    <td data-label="Last-name">$${producto.precioCosto}</td>
                    <td data-label="Marks%">$${producto.precioVenta}</td>
                    <td data-label="Marks%"id="dolar">${cambioPesoDolar(producto.precioVenta)}</td>
                    <td data-label="Marks%">${producto.descripcion}</td>
                    
                    <td data-label="Staus">
                        <a href="#" class="usuario__delete" onclick="eliminarProducto(${producto.idProducto})"><span class="material-symbols-outlined">delete</span></a>
                        <a href="" class="usuario__edit"><span class="material-symbols-outlined">edit</span></a>
                    </td>
                 </tr>`
    });
    
    document.getElementById("tableProductos").innerHTML = most;
    
    
});



async function eliminarProducto(id){
    if(!confirm("¿Desea eliminar este usuario?" + id)){
        return;
    }
    const request = await fetch("/api/productos/" + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    
    location.reload();
}

const cambioPesoDolar = (peso) =>{
    let dolar = document.getElementById('preDolar').value;
    let resultado = peso/dolar;
    console.log(resultado);
    return resultado.toLocaleString('en-US',{style:'currency', currency:'USD', minimumFractionDigits:2});
     
}








const indicadorEco = () => {
    
const url3 = "https://mindicador.cl/api"; 
fetch(url3)
.then(res => res.json())
.then(data => {      
      document.getElementById('preDolar').value =  data.dolar.valor;  
});

}

indicadorEco();

