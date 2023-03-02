public class Main {
    public static void main(String[] args) {
        //Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        //y “b”.
        int numeroInicio = 5;
        int numeroFin = 14;
        int aux = numeroInicio;

        while (aux <= numeroFin){
            System.out.println(aux);
            aux ++;
        }

        //A lo anterior, solo muestre los números pares
        aux = numeroInicio;

        while (aux <= numeroFin){
            if (aux % 2 == 0){
                System.out.println(aux);
            }
            aux ++;
        }

        //A lo anterior, con una variable extra, elija si se deben mostrar los números
        //pares o impares

        System.out.println("ingrese opcion 1 para numeros pares y 2 para impares");
        int opcion = 2;
        aux = numeroInicio;


        while (aux <= numeroFin){
            if ((opcion == 1) && (aux%2 == 0)){
                System.out.println(aux);
            } else if ((opcion == 2) && (aux%2 != 0)){
                System.out.println(aux);
            }
            aux ++;
        }

        //Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        int i;
        for (i=14; i>=5; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        float salario = 150000;
        int cantVehiculos = 2;
        int cantViviencas = 2;
        boolean aeronave = false;
        boolean embarcacion = false;
        boolean activos = false;

        if ((salario>= 489083) || (cantVehiculos >= 3) || (cantViviencas >=3) || (aeronave) || (activos) || (embarcacion)){
            System.out.println("usted pertenece al sector de ingresos altos");
        } else{
            System.out.println("no pertenece al sector de ingresos altos");
        }

    }
}