//te 500 - algodon 1000
package parcial2poo;
import java.util.Scanner;
public class metodos {
    Scanner sn = new Scanner(System.in);
    int acumuladora,acumuladorb,acumuladorc,acumuladord,contadora;
    int carroz,ca,op,clapiz,cte,calgodon;
    double dtotal,pc,promventas;
   public void vender_arroz(int cantidad){
        this.carroz=this.carroz-cantidad;
        acumuladora=acumuladora+cantidad;
        contadora=contadora+1;
        if(carroz>=5){
          pc=0;
         pc=cantidad*3500*0.04;
         pc=pc+(3500*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println("la cantidad de arroz que queda es de :"+carroz);
         dtotal=dtotal+pc;
        }
        else if(carroz>0 & carroz<10){
         System.out.println("se requiere hacer pedido al provedor");  
         pc=0;
         pc=cantidad*3500*0.04;
         pc=pc+(3500*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println(carroz);
         dtotal=dtotal+pc;
       }else if (carroz <=0){
           System.out.println("no se puede tomar orden por falta de inventario");
           this.carroz=this.carroz+cantidad;
       }
   }
      public void vender_lapiz(int cantidad){
        this.clapiz=this.clapiz-cantidad;
        acumuladorb=acumuladorb+cantidad;
        contadora=contadora+1;
       if(clapiz>=20){
          pc=0;
         pc=cantidad*800*0.16;
         pc=pc+(800*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println("la cantidad de lapices que quedan es de :"+clapiz); 
         dtotal=dtotal+pc;
        }
        else if(clapiz>0 & clapiz<20){
           System.out.println("se requiere hacer pedido al provedor");  
            pc=0;
         pc=cantidad*800*0.16;
         pc=pc+(800*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println(clapiz);
         dtotal=dtotal+pc;
       }else if (clapiz <=0){
           System.out.println("no se puede tomar orden por falta de inventario"); 
           this.clapiz=this.clapiz+cantidad;
       }
    
    }
      public void vender_algodon(int cantidad){
        this.calgodon=this.calgodon-cantidad;
        acumuladorc=acumuladorc+cantidad;
        contadora=contadora+1;
       if(calgodon>=15){
          pc=0;
         pc=cantidad*1000*0.16;
         pc=pc+(1000*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println("la cantidad de algodon que queda es de :"+calgodon);  
         dtotal=dtotal+pc;
        }
        else if(calgodon>0 & calgodon<15){
           System.out.println("se requiere hacer pedido al provedor");  
            pc=0;
         pc=cantidad*500*0.12;
         pc=pc+(500*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println(calgodon);
         dtotal=dtotal+pc;
       }else if (calgodon<=0){
           System.out.println("no se puede tomar orden por falta de inventario");  
           this.calgodon=this.calgodon+cantidad;
       }
      }
      public void vender_te(int cantidad){
        this.cte=this.cte-cantidad;
        acumuladord=acumuladord+cantidad;
        contadora=contadora+1;
       if(cte>=10){
          pc=0;
         pc=cantidad*500*0.04;
         pc=pc+(500*cantidad);
         System.out.println("el precio de su compra es:"+pc);
         System.out.println("la cantidad de te que queda es de :"+cte);  
         dtotal=dtotal+pc;
        }
        else if(cte>0 & cte<10){
           System.out.println("se requiere hacer pedido al provedor");  
            pc=0;
       pc=cantidad*500*0.04;
       pc=pc+(500*cantidad);
       System.out.println("el precio de su compra es:"+pc);
       System.out.println(cte);
       dtotal=dtotal+pc;
       }else if (cte<=0){
           System.out.println("no se puede tomar orden por falta de inventario");  
           this.cte=this.cte+cantidad;
       }
      }
   public void hacer_pedido(int op){
       int cantidad;
       System.out.println("cuanto desea ordenar");
               
       cantidad=sn.nextInt();
        switch (op) {
            case 1 -> {
                carroz=cantidad+carroz;
                System.out.println("la nueva cantidad en inventario de arroz es de: "+carroz);
            }
            case 2 -> {
                clapiz=cantidad+clapiz;
                System.out.println("la nueva cantidad en inventario de lapiz es de: "+clapiz);
            }
            case 3 -> {
                calgodon=cantidad+calgodon;
                System.out.println("la nueva cantidad de inventario de algodon es de: "+calgodon);
            }
            case 4 -> {
                cte=cantidad+cte;
                System.out.println("la nueva cantidad de inventario de te es de: "+cte);
            }
            default -> {
                System.out.println("error de digitacion");
            }
        }
   }
    public void estadisticas(){
        
        if (acumuladora>acumuladorb & acumuladora>acumuladorc & acumuladora>acumuladord){
            System.out.println("el producto mas vendido es arroz");
        }
        else if (acumuladorb>acumuladora & acumuladorb>acumuladorc & acumuladorb>acumuladord){
            System.out.println("el producto mas vendido es lapiz");
        }
        else if (acumuladorc>acumuladora & acumuladorc>acumuladorb & acumuladorc>acumuladord){
            System.out.println("el producto mas vendido es algodon");
        }
        else if (acumuladord>acumuladora & acumuladord>acumuladorc & acumuladord>acumuladorb){
            System.out.println("el producto mas vendido es te");
        }
        
        
        
        
    if (acumuladora<acumuladorb & acumuladora<acumuladorc & acumuladora<acumuladord){
            System.out.println("el producto menos vendido es arroz");
        }
        else if (acumuladorb<acumuladora & acumuladorb<acumuladorc & acumuladorb<acumuladord){
            System.out.println("el producto menos vendido es lapiz");
        }
        else if (acumuladorc<acumuladora & acumuladorc<acumuladorb & acumuladorc<acumuladord){
            System.out.println("el producto menos vendido es algodon");
        }
        else if (acumuladord<acumuladora & acumuladord<acumuladorc & acumuladord<acumuladorb){
            System.out.println("el producto menos vendido es te");
        }
        System.out.println("el dinero total es: "+dtotal);
        promventas=dtotal/contadora;
        System.out.println("el promedio de ventas es de: "+promventas);
}
    //mas vendido - menos vendido-cantidad total de dinero-totalventasdia/cantidad de ventas
      // arroz-lapiz-algodon-te
      // falta las estadisticas-mas vendido,menos vendido, ventas del dia,promedio ventas
   
    
}
