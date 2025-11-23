package biblioteca.simple.modelo;

import biblioteca.simple.contratos.Prestable;

public class Videojuego extends Producto  implements Prestable {

    // Atributos propios de un videojuego
    private String genero;
    private String plataforma;
    private boolean multijugador;
    private boolean prestado;
    private Usuario prestadoA;

    // Constructor usado cuando el objeto proviene de una base de datos
    // (ya tiene un id asignado)
    public Videojuego(int id, String titulo, String anho, Formato formato, String genero, String plataforma, boolean multijugador) {
        // Llama al constructor de la superclase Producto con id
        super(id, titulo, anho, formato);
        this.genero = genero;
        this.plataforma = plataforma;
        this.multijugador = multijugador;

    }

    // Constructor para crear un videojuego nuevo desde la aplicación
    // (el id se generará después o lo asignará la BD)
    public Videojuego(String titulo, String anho, Formato formato, String genero, String plataforma, boolean multijugador) {
        // Llama al constructor de Producto que no tiene id
        super(titulo, anho, formato);
        this.genero = genero;
        this.plataforma = plataforma;
        this.multijugador = multijugador;

    }

    // Métodos getter para acceder a los atributos propios

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public boolean isMultijugador() {
        return multijugador; }



    @Override public void prestar(Usuario u) {
        if (prestado) throw new IllegalStateException("Ya prestada");
        prestado = true;
        this.prestadoA = u;
    }

    @Override public void devolver() { prestado = false; this.prestadoA = null; }
    @Override public boolean estaPrestado() { return prestado; }

    // Sobrescribimos toString() para representar toda la información
    // del videojuego en forma de texto (útil al imprimir por consola)
    @Override
    public String toString() {
        return "Videojuego{" +
                "genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", multijugador=" + multijugador +
                ", formato=" + formato +
                ", anho='" + anho + '\'' +
                ", titulo='" + titulo + '\'' +
                ", id=" + id +
                '}';

    }
}
