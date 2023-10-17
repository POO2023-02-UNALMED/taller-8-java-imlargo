package futbol;

public abstract class Futbolista implements Comparable<Object>{

    private final String posicion;
    private int edad;
    private String nombre;

    public Futbolista(String nombre, int edad, String posicion) {
        this.posicion = posicion;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    @Override
    public String toString(){
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }

    public abstract boolean jugarConLasManos();

    public boolean equals(Futbolista futbolista){
        if (this == futbolista) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Futbolista futbolista){
        return 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return this.posicion;
    }
}