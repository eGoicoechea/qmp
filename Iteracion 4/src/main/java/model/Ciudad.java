package model;

public class Ciudad {
    String ubicacion;
    Clima clima;

    Clima getClima(){
        if(clima == null){
            clima = ProvedoorClima.getWeather(ubicacion);
        }
        return clima;
    }
}
