//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monlau.model;

public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(Integer id, String nombre, Double precio) {
        this.precio = precio;
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Producto{id=" + this.id + ", nombre='" + this.nombre + "', precio=" + this.precio + "}";
    }
}
