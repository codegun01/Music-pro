const mostrarHora = () => {
    let fecha = new Date();
    let dia = fecha.getDay();
    let diaCurrent = fecha.getDate()
    let mes = fecha.getMonth();

    const diaSemana = ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'];
    const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];


    document.getElementById('fecha').innerHTML = `${diaSemana[dia]}, ${diaCurrent} de ${meses[mes]} ${fecha.getFullYear()}`;
    document.getElementById('date__hour').style.color = 'dodgerblue';
    document.getElementById('date__hour').style.fontWeight = '400';
    document.getElementById('date__hour').style.fontSize = '15px';

    let hr = formatoHora(fecha.getHours());
    let min = formatoHora(fecha.getMinutes());
    let sec = formatoHora(fecha.getSeconds());

    document.getElementById('hora').innerHTML = `${hr}:${min}:${sec}`;

    
}

setInterval(mostrarHora, 1000)

const formatoHora = (hora) => {

    if(hora < 10){
        hora = '0'+ hora;
    }

    return hora;
}