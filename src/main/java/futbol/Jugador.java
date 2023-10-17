package futbol;

public class Jugador extends Futbolista{
    
    public byte dorsal;
    public short golesMarcados;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.dorsal = dorsal;
        this.golesMarcados = golesMarcados;
    }
    
    public Jugador(){
        super();
        this.dorsal = 7;
        this.golesMarcados = 289;
    }

    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + golesMarcados;
    }

    @Override
    public int compareTo(Futbolista futbolista){
        int diferenciaEdad = futbolista.getEdad() - this.getEdad();
        return Math.abs(diferenciaEdad);
    }

    @Override
    public int compareTo(Object object){
        return 0;
    }

    public short getGolesMarcados() {
        return this.golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public boolean jugarConLasManos(){
        return false;
    }

}
