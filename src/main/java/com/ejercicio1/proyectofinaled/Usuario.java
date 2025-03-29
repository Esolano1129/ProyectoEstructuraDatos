package com.ejercicio1.proyectofinaled;

public class Usuario {

    private String Usuario;
    private String contrasena;

    public void Usuario() {
        Usuario = "";
        contrasena = "";
    }

    public Usuario() {
    }

    public Usuario(String Usuario, String contrasena) {
        this.Usuario = Usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void imprimirUsuario(){
        System.out.println(this.Usuario);
        System.out.println(this.contrasena);
    }
    
    public String usuarioToString(){
        String respuesta = "user: " +this.Usuario + " password: " + this.contrasena;
        return respuesta;
    }

}
