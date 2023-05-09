package clubdeportivo;

import empleados.Futbolista;

public class Clubdeportivo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Futbolista f=new Futbolista(2, "Di", "Estefano", 16, 9, "Delantero");
        f.entrenar();
        f.concentrarse();
        f.viajar();
        System.out.println(f.toString());
        System.out.println("Hola mundo");
        
        
        Futbolista f2=new Futbolista(1, "Casillas", "Topo", 34, 1, "PorteroTopo");
        f2.entrenar();
        f2.viajar();
        
        Futbolista f3=new Futbolista(2, "Hierro", "Fernando", 34, 4, "DestrozaPiernas");
        f2.entrenar();
        f2.viajar();
        
        
        
        
    }

}
