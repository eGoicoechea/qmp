package model;

import java.util.ArrayList;
import java.util.List;

public class Sugerencia {
    List<Prenda> parteSuperior = new ArrayList<>();
    List<Prenda> parteInferior = new ArrayList<>();
    List<Prenda> calzado = new ArrayList<>();
    List<Prenda> accesorios = new ArrayList<>();

    public Sugerencia(List<Prenda> parteSuperior,List<Prenda> parteInferior,List<Prenda> calzado,List<Prenda> accesorios){
        if(parteSuperior.todasSonDeCatSuperior){
            this.parteSuperior = parteSuperior;
        }else{
            throw new PrendaNoCorrespondiente("La prenda no es de categoria parte superior");
        }
        if(parteInferior.todasSonDeCatInferior){
            this.parteInferior = parteInferior;
        }else{
            throw new PrendaNoCorrespondiente("La prenda no es de categoria parte inferior");
        }
        if(calzado.todosSonDeCatCalzado){
            this.parteInferior = parteInferior;
        }else{
            throw new PrendaNoCorrespondiente("La prenda no es de categoria calzado");
        }
        if(calzado.todosSonDeCatAccesorio || calzado.isEmpty()){
            this.accesorios = accesorios;
        }
    }
}
