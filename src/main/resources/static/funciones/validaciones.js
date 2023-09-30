const nombreC = document.getElementById('nombreContact');
const telC = document.getElementById('telefonoContact');
const mailC = document.getElementById('emailContact');


const validarFormContact = () => {
    if(nombreC.value != '' && telC.value != '' && mailC != ''){
        alert("Tu mensaje ha sido enviado gracias!!");
        return true;
    }else{
        alert("Debe completar los Datos");
        nombreC.focus();
        return false;
    }

}


const usuarioF = document.getElementById('usuario');
const passwordF = document.getElementById('password');

const validarUsuario = () => {
    
    if(usuarioF.value == 'admin' && passwordF.value == '1234'){
        return true
    }
    
    alert("El usuario o la contraseña son incorrectas");
    limpiarInputs();
    return false;



}


const nom = document.getElementById('nombreform');
const usuario = document.getElementById('usuarioform');
const email = document.getElementById('emailform');
const contrasena = document.getElementById('passwordform');

const validarCrearUsuario = () => {
    if(nom.value != '' && usuario.value && email.value != "" && contrasena.value != ""){
        alert("Datos enviados con exito al servidor");
        return true;
    }

    alert("Debe completar todos los campos");
    return false;

}


const limpiarInputs = () => {
    usuarioF.value = "";
    passwordF.value = "";
}