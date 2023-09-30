
const url = "api/productos";

fetch(url)
.then(res => res.json())
.then(data => {
    let guitar = '';
    let piano = '';
    let percusion = '';
    let accesorios = '';
    let bajos = '';
    let amplificadores = '';
    
    data.forEach(productos => {
        console.log(productos);
        if(productos.descripcion == "Piano"){
            piano += `<div class="cards">
                        <img src="img/piano_1.PNG" alt="" class="img__card">
                        <div class="cont__card">
                            <h3 class="titulo__card">${productos.marca}</h3>
                            <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                            <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card" value="${productos.idProducto}" >Agregar</a>
                        </div>
                       </div>`
        }else if(productos.descripcion == "Bajos"){
            bajos += `<div class="cards">
                        <img src="img/bajo__cinco.PNG" alt="" class="img__card">
                        <div class="cont__card">
                            <h3 class="titulo__card">${productos.marca}</h3>
                            <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                            <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card">Agregar</a>
                        </div>
                      </div>`;
        }else if(productos.descripcion == "Percusion"){
            percusion += `<div class="cards">
                            <img src="img/bateria_1.PNG" alt="" class="img__card">
                            <div class="cont__card">
                                <h3 class="titulo__card">${productos.marca}</h3>
                                <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                                <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card">Agregar</a>
                            </div>
                          </div>`;
        }else if(productos.descripcion == "Guitarra"){
            guitar += `<div class="cards">
                        <img src="img/guitarra_cuerpo_solido.PNG" alt="" class="img__card">
                        <div class="cont__card">
                            <h3 class="titulo__card">${productos.marca}</h3>
                            <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                            <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card">Agregar</a>
                        </div>
                       </div>`;
        }else if(productos.descripcion == "Amplificadores"){
            amplificadores += ` <div class="cards">
                                    <img src="img/amplificador_2.PNG" alt="" class="img__card">
                                    <div class="cont__card">
                                        <h3 class="titulo__card">${productos.marca}</h3>
                                        <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                                        <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card">Agregar</a>
                                    </div>
                                </div>`;
        }else if(productos.descripcion == "Accesorios"){
            accesorios += `<div class="cards">
                                <img src="img/audi_others_1.PNG" alt="" class="img__card">
                                <div class="cont__card">
                                    <h3 class="titulo__card">${productos.marca}</h3>
                                    <p class="card__precio"><span>$ ${productos.precioVenta}</span></p>
                                    <a href="assets/comprar.html?id=${productos.idProducto}" class="btn__card">Agregar</a>
                                </div>
                            </div>`;
        }
    })
    document.getElementById('cont__pianos').innerHTML = piano;
    document.getElementById('bajos').innerHTML = bajos;
    document.getElementById('percusion').innerHTML = percusion;
    document.getElementById('guitarras').innerHTML = guitar;
    document.getElementById('amplificadores').innerHTML = amplificadores;
    document.getElementById('accesorios').innerHTML = accesorios;
})