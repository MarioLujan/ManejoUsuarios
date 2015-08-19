/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.fing.manejousuarios.datos;

/**
 * --------Documentacion interna---------
 * Clase que se encarga de manejar los usuarios del sistema
 * @author Mario Alberto Lujan Llanas
 * @version 1.0
 */
public class Usuario {
        //Realidad --> Programacion = Mapeo
    private Integer id;
    private String nombre;
    private String primerApellido;
    private Integer edad;

    /**
     * Metodo que regresa el identificador unico de cada usuario-------------
     * el metodo throws es para avisar al usuario que tendremos una excepcion--
     * una excepcion es un evento anomalo posible de controlar-----------
     * 
     * @throws NullPointerException cuando no exista el usuario en la BD
     * @return the id (numero entero)
     */
    public Integer getId() throws NullPointerException{
        if(this.id == null){
            throw new NullPointerException(
                    String.format("El usuario %s No existe", this.nombre));
        }
        return id;
    }

    /**
     * @param id que se asignara al usuario al ser guardado en la BD
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
