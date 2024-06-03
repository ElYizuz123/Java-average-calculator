
package tap_u1p4;

import java.io.Serializable;


public class Alumno implements Serializable{
    private String numControl;
    private String nombre;
    private int calificacioon;
    private String genero;
    private String carrera;

    public Alumno(String numControl, String nombre, int calificacioon, String genero, String carrera) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.calificacioon = calificacioon;
        this.genero = genero;
        this.carrera = carrera;
    }

    public Alumno() {
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacioon() {
        return calificacioon;
    }

    public void setCalificacioon(int calificacioon) {
        this.calificacioon = calificacioon;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numControl=" + numControl + ", nombre=" + nombre + ", calificacioon=" + calificacioon + ", genero=" + genero + ", carrera=" + carrera + '}';
    }
    
}
