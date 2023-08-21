public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 2500);

        Carro carro1 = new Carro("MNN969", "RANGER XLT 2007", "FORD");
        Carro carro2 = new Carro("MRN725", "COROLLA 2022", "Toyota");

        parqueadero.parquearCarro(2,3,carro1);
        parqueadero.parquearCarro(1,8,carro2);
        System.out.println("Ocupación parqueadero");
        parqueadero.mostrarEstadoParqueadero();

        int horasParqueado = 5;
        double factura = parqueadero.cobrarPorTiempo(carro1, horasParqueado);
        System.out.println("Total facturado por " + horasParqueado + " horas de parqueadero para el vehículo: " + carro1.getPlaca() + " = $" + factura );
    }
}