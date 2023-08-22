public class Yate extends Embarcacion{
    private int camarotes;
    private boolean posibilidadCompra;
    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int camarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.camarotes = camarotes;
        this.posibilidadCompra = camarotes > 7;
    }

    public  boolean posibilidadCompra(){
        return posibilidadCompra;
    }
}

