

const url = "/api/clientes";

fetch(url)
.then(res => res.json())
.then(data => {
    let most = "";
    data.forEach(clientes => {
        most += `<tr>
                    <td data-label="S.No">${clientes.idCliente}</td>
                    <td data-label="Name">${clientes.nombre}</td>
                    <td data-label="Name">${clientes.email}</td>
                    <td data-label="Marks%">${clientes.direccion}</td>
                    <td data-label="Marks%">${clientes.telefono}</td>
                    <td data-label="Staus">
                        <a href="" class="usuario__delete" onclick="eliminarCliente(${clientes.idCliente})"><span class="material-symbols-outlined">delete</span></a>
                        <a href="" class="usuario__edit"><span class="material-symbols-outlined">edit</span></a>
                    </td>
                 </tr>`
    })
    document.getElementById('table__cliente').innerHTML = most;
})



async function eliminarCliente(id){
    if(!confirm("¿Desea eliminar este usuario?" + id)){
        return;
    }
    const request = await fetch("/api/clientes/" + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    
    location.reload();
}
