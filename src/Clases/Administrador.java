package Clases;

import java.util.List;

public class Administrador extends Usuario{
    public Administrador(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, listaVuelos);
    }
}
