

async function registrarUsuario(){
    let datos = {}
    datos.nombre = document.getElementById('nombreform').value;
    datos.apellido = document.getElementById('usuarioform').value;
    datos.email = document.getElementById('emailform').value;
    datos.rol = document.getElementById('roles').value;
    datos.password = document.getElementById('passwordform').value;
    
    const request = await fetch("/api/usuario" ,{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    
}