package model;

import java.util.List;

public class GeneradorDeSugerencias {
    private static final GeneradorDeSugerencias generadorDeSugerencias = new GeneradorDeSugerencias();
    private GeneradorDeSugerencias (){
    }
    public GeneradorDeSugerencias getInstance(){
        return generadorDeSugerencias;
    }
    public List<Sugerencia> generarSugerencias(List<Prenda> prendas,Clima clima){
        double temperatura = clima.getTemperatura();
        List<Prenda> parteSuperior = prendas.forEach(prenda-> prenda.cumpleCon(Categoria.PARTE_SUPERIOR,temperatura));
        List<Prenda> parteInferior = prendas.forEach(prenda-> prenda.cumpleCon(Categoria.PARTE_INFERIOR,temperatura));
        List<Prenda> calzado = prendas.forEach(prenda-> prenda.cumpleCon(Categoria.CALZADO,temperatura));
        List<Prenda> accesorios = prendas.forEach(prenda-> prenda.cumpleCon(Categoria.ACCESORIO,temperatura));

        return this.generarLasSugerenciasCon(parteSuperior,parteInferior,calzado,accesorios);
    }

    List<Sugerencia> generarLasSugerenciasCon(  List<Prenda> parteSuperior,  List<Prenda> parteInferior,  List<Prenda> calzado,   List<Prenda> accesorios){
    }
}
