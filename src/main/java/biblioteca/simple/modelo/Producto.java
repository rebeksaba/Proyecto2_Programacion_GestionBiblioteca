package biblioteca.simple.modelo;

public abstract class Producto {

    protected int id;
    protected String titulo;
    protected String anho;
    protected Formato formato;


    //Constructor para recibir objetos de la base de datos
    protected Producto(int id, String titulo, String anho, Formato formato) {
        this.id = id;
        this.titulo = titulo;
        this.anho = anho;
        this.formato = formato;
    }

    //Constructor para crear nuevos productos desde la aplicación
    protected Producto(String titulo, String anho, Formato formato) {
        this.id = id;
        this.titulo = titulo;
        this.anho = anho;
        this.formato = formato;
    }

    protected int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnho() {
        return anho;
    }

    protected Formato getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anho='" + anho + '\'' +
                ", formato=" + formato +
                '}';
    }
}
