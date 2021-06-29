import java.util.*;
public class App {
    static int op;
    static Scanner en=new Scanner(System.in);
    static Personaje prota;
    public static void main(String[] args) throws Exception { 
        System.out.println("Ingrese nombre: ");
        String s=en.next();
        prota=new Personaje(s);
        menuInicial();
    }
    static void menuInicial(){
        System.out.println("Seleccione una opción");
       String aux="1 - Saber tu nombre \n2 - Saber tu edad \n3 - Saber tu estado de salud";
       System.out.println(aux);
       while(true){
           op=en.nextInt();
           if(op==1||op==2||op==3){
               break;
           }
           else{
               System.out.println("Ingrese opcion valida");
               System.out.println(aux);
           }
       }
       switch(op){
           case 1:
           System.out.println(prota.getNombre());
           menuInicial();
           break;
           case 2:
           System.out.println(prota.getEdad());
           menuInicial();
           break;
           case 3:
           System.out.println(prota.getEstadoDeSalud());
           menuInicial();
           break;
       }
    }
}
