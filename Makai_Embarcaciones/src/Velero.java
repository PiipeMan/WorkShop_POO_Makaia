public class Velero extends Embarcacion{
    private int mastiles;
    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int mastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public  boolean esGrande(){
        return mastiles > 4;
    }
}
