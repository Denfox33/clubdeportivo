package empleados;

public class Futbolista extends Persona{
    
    protected int dorsal;
    protected String demarcacion;
    
    //da error por que te obliga a usar supers ( constructor de la clase persona
    //automaticamente pone el resto heredados de la clase persona
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion ) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //getters setters PROPIOS DE LA CLASE
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    public void jugarPartido(){
        System.out.println("Estoy jugando partido");
    
    }
    
    public void entrenar(){
        System.out.println("Estoy entrenando");
    
    }
    
    @Override
    public String toString(){
        String res=super.toString()+"\n";
        
        res+="Dorsal: "+this.dorsal+"\n"+
        "Demarcacion: "+this.demarcacion+"\n";
        
        return res;
    
    }
    
    
    
    
    
    

}
