/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package modelo;


/**
 *
 * @author User
 */

public class Filtro {



    private int id;

    private String carnet;

    private String nombres;

    private String apellidos;

    private int edad;

    private String universidad;

    private boolean estado;



    public Filtro() {

    }



    public Filtro(int id, String carnet, String nombres, String apellidos, int edad, String universidad, boolean estado) {

        this.id = id;

        this.carnet = carnet;

        this.nombres = nombres;

        this.apellidos = apellidos;

        this.edad = edad;

        this.universidad = universidad;

        this.estado = estado;

    }



    public Filtro(String carnet, String nombres, String apellidos, String universidad, boolean estado) {

        this.carnet = carnet;

        this.nombres = nombres;

        this.apellidos = apellidos;

        this.universidad = universidad;

        this.estado = estado;

    }



    public Filtro(String universidad, boolean estado) {

        this.universidad = universidad;

        this.estado = estado;

    }

    public Filtro(int aInt, String string, String string0, String string1, int aInt0, String string2, String string3, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Filtro(String text, String text0, String text1, String toString, String text2, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getUniversidad() {

        return universidad;

    }



    public void setUniversidad(String universidad) {

        this.universidad = universidad;

    }



    public String getCarnet() {

        return carnet;

    }



    public void setCarnet(String carnet) {

        this.carnet = carnet;

    }



    public String getNombres() {

        return nombres;

    }



    public void setNombres(String nombres) {

        this.nombres = nombres;

    }



    public String getApellidos() {

        return apellidos;

    }



    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }



    public int getEdad() {

        return edad;

    }



    public void setEdad(int edad) {

        this.edad = edad;

    }



    public boolean getEstado() {

        return estado;

    }



    public void setEstado(boolean estado) {

        this.estado = estado;

    }



}