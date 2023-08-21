public class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int fila, int columna, double tarifaPorHora) {
        espacios = new Carro[fila][columna];
        this.tarifaPorHora = tarifaPorHora;
    }
    public boolean parquearCarro(int fila, int columna, Carro carro){
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length) {
            return false;
        }

        if (espacios[fila][columna] == null) {
            espacios[fila][columna] = carro;
            return true;
        }

        return false; // Espacio ocupado
    }

    public double cobrarPorTiempo(Carro carro, int horas){
        return tarifaPorHora * horas;
    }

    public void mostrarEstadoParqueadero(){
        for (int i = 0; i < espacios.length; i++){
            for (int j = 0; j < espacios[0].length; j++){
                if (espacios[i][j] == null ){
                    System.out.print(" ");

                }
                else{
                    System.out.print("X");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
