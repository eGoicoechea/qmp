package model;

import java.util.ArrayList;
import java.util.List;

public class Usuarie {
    List<Prenda> prendasDelUsuarie = new ArrayList<>();
    Ciudad ciudad;

    Sugerencia getSugerencia(){
        return GeneradorDeSugerencias.getInstance().generarSugerencias(prendasDelUsuarie,ciudad.getCLima()).get(0);
    }
}
