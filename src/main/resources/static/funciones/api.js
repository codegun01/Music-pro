


const apiIndiceEconomico = () => {
    
fetch('https://mindicador.cl/api').then(function(response) {
return response.json();
}).then(function(dailyIndicators) {
    document.getElementById("uf").innerHTML =  dailyIndicators.uf.valor;
    document.getElementById("dolar").innerHTML = dailyIndicators.dolar.valor;
    document.getElementById("dolar2").innerHTML = dailyIndicators.dolar_intercambio.valor;
    document.getElementById("euro").innerHTML = dailyIndicators.euro.valor;
    
}).catch(function(error) {
    console.log('Requestfailed', error);
});
    
}






