package biblioteca.simple.app;

import biblioteca.simple.modelo.Formato;
import biblioteca.simple.modelo.Libro;
import biblioteca.simple.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   private static final Catalogo catalogo = new Catalogo();

   private static final List<Usuario> usuarios =new ArrayList<>();

   private static final Scanner sc = new Scanner (System.in);

    private static void main(String[] args) {
        cargarDatos();
        menu();
    }

    private static void cargarDatos(){
        catalogo.alta(new Libro(1, "El Quijote", "1605", Formato.FISICO, """));
    }





}
