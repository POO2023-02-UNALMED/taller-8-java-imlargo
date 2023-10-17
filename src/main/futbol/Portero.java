package futbol;

public class Portero extends Futbolista{
    
    public byte dorsal;
    public short golesRecibidos;

    public Portero(String nombre, int edad,short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.dorsal = dorsal;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " + golesRecibidos;
    }
    
    @Override
    public int compareTo(Futbolista futbolista){
        Portero portero = (Portero)futbolista;
        int diferenciaGoles = (portero.golesRecibidos - this.golesRecibidos);
        return Math.abs(diferenciaGoles);

    }
    
    @Override
    public int compareTo(Object object){
        return 0;
    }

    public short getGolesRecibidos() {
        return this.golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
 
    @Override
    public boolean jugarConLasManos(){
        return true;
    }   
}