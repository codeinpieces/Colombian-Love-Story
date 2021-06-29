public class Personaje {
    String nombre;
    byte edad;
    int estadoDeSalud;
    void setNombre(String s){
        this.nombre=s;
    }
    String getNombre(){
        return this.nombre;
    }
    void setEdad(byte b){
        this.edad=b;
    }
    byte getEdad(){
        return this.edad;
    }
    void setEstadoDeSalud(int i){
        this.estadoDeSalud=i;
    }
    int getEstadoDeSalud(){
        return this.estadoDeSalud;
    }
    public Personaje(String s, byte b, int i){
        this.nombre=s;
        this.edad=b;
        this.estadoDeSalud=i;
    }
    public Personaje(String s){
        this.nombre=s;
        this.edad=24;
        this.estadoDeSalud=0;
    }
}
