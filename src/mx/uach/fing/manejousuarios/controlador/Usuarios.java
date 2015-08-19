package mx.uach.fing.manejousuarios.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 * Clase que se encarga de manejar el proceso de altas, bajas, cambios y
 * consultas de los usuarios DAO: Data Access Object, consta de crear interfaces
 * para poder acceder a los datos
 *
 * @author Mario Alberto Lujan Llanas
 */
public class Usuarios {

    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        return usuarios;
    }

}
