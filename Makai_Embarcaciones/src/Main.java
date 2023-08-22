public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Arturo", "Calle", "PNS9846352");
        Velero velero1 = new Velero(capitan1, 1000, 0, 2022, 15, 5);

        Capitan capitan2 = new Capitan("Maria", "Lopez", "PNS73653691");
        Yate yate1 = new Yate(capitan2, 2000, 0, 2023, 20, 8);

        System.out.println("Monto de alquiler del velero: USD$" + velero1.calcularAlquiler());
        System.out.println("¿El yate se puede comprar? " + yate1.posibilidadCompra());
    }

}