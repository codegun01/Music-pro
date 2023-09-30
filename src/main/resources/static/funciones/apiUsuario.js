



const url = "/api/usuario";


fetch(url)
.then(res => res.json())
.then(data => {
    let most = "";
    var cont = 0;
    data.forEach(usuario => {
                        cont++;
                        most += ` <tr>
                            <td data-label="S.No">${usuario.idUsuario}</td>
                            <td data-label="Name">${usuario.nombre} ${usuario.apellido}</td>
                            <td data-label="Age">${usuario.email}</td>
                            <td data-label="Marks%">${usuario.rol}</td>
                            <td data-label="Staus">
                                <a href="#" class="usuario__delete" onclick="eliminarUsuario(${usuario.idUsuario})" ><span class="material-symbols-outlined">delete</span></a>
                                <a href="" class="usuario__edit"><span class="material-symbols-outlined">edit</span></a>
                            </td>
                           </tr>`;

    });
            
    document.getElementById('usuario').innerHTML = most;
    console.log("Total de Clientes: " + cont);
    document.getElementById('cont__usuarios').innerHTML = cont;
});




async function eliminarUsuario(id){
    if(!confirm("¿Desea eliminar este usuario?")){
        return;
    }
    const request = await fetch("/api/usuario/" + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    
    location.reload();
}







