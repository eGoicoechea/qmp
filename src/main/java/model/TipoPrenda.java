package model;

public enum TipoPrenda {
    ZAPATO(Categoria.CALZADO,0, 20),

    ZAPATILLA(Categoria.CALZADO,15, 30),

    CAMISA(Categoria.PARTE_SUPERIOR,0,20),

    CHOMBA(Categoria.PARTE_SUPERIOR,20,40),

	REMERA(Categoria.PARTE_SUPERIOR, 20,40),

    BLUSA(Categoria.PARTE_SUPERIOR,20,40),

    POLLERA(Categoria.PARTE_INFERIOR,20,40),

    PANTALON(Categoria.PARTE_INFERIOR,0,20),

    SOMBRERO(Categoria.ACCESORIO,0,20),

    ANTEOJOS(Categoria.ACCESORIO,0,100);
    
    private Categoria categoria;
    private double tMaxima;
    private double tMinima;


    TipoPrenda(Categoria categoria,int tMinima, int tMaxima) {
        this.categoria = categoria;
        this.tMaxima = tMaxima;
        this.tMinima = tMinima;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public double gettMaxima(){return tMaxima;}
    public double gettMinima(){return tMinima;}
}
