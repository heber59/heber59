
package parcial2poo;
import java.util.Scanner;
public class Parcial2poo {

    public static void main(String[] args) {
        metodos m1= new metodos();
        Scanner sn = new Scanner(System.in);
        int opc;
        boolean salir=false;
        m1.carroz=30;
        m1.clapiz=60;
        m1.calgodon=15;
        m1.cte=100;
        do{
     System.out.println ("bienvenido a mercardigital");
     System.out.println ("tenemos los siguientes productos");
     System.out.println("1. arroz $3500 , la cantidad de inventario es "+m1.carroz);
     System.out.println("2. lapiz $800 , la cantidad de inventario es "+m1.clapiz);
     System.out.println("3. algodon $1000, la cantidad de inventario es "+m1.calgodon);
     System.out.println("4. te $500, la cantidad de inventario es "+m1.cte);
     System.out.println("5. hacer pedido");
     System.out.println("6.salir");
     opc=sn.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("cuanto desea comprar");
                    m1.vender_arroz(sn.nextInt());
                }
                case 2 -> {
                    System.out.println("cuanto desea comprar");
                    m1.vender_lapiz(sn.nextInt());
                }
                case 3 -> {
                    System.out.println("cuanto desea comprar");
                    m1.vender_algodon(sn.nextInt());
                }
                case 4 -> {
                    System.out.println("cuanto desea comprar");
                    m1.vender_te(sn.nextInt());
                }
                case 5 -> {
                    System.out.println("1.arroz");
                    System.out.println("2.lapiz");
                    System.out.println("3.algodon");
                    System.out.println("4. te");
                    m1.hacer_pedido(sn.nextInt());
                }
                case 6 -> {
                    m1.estadisticas();
                    salir=true;
                }
                default -> { 
                    
                }
            }
    }
        while(!salir);
    
    }  
}
