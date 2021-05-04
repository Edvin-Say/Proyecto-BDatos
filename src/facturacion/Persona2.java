/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author DELL
 */
public class Persona2 { 

    protected String id; 
    protected String cui;
    protected String apellidos;
    protected String nombre;
    protected String direccion;
    protected String fechanaci;
    protected String telefono;
    protected String fechacontrato;
    protected String genero;
    protected String estadocivil;
    protected String email;
    protected String cargo;
    protected String horario;
    protected String salario;
    protected String estado;
    
    public Persona2(String id, String cui, String apellidos, String nombre, String direccion, String fechanaci, String telefono, String fechacontrato, String genero, String estadocivil, String email, String cargo, String horario, String salario, String estado) {
        this.id = id;
        this.cui = cui;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechanaci = fechanaci;
        this.telefono = telefono;
        this.fechacontrato = fechacontrato;
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.email = email;
        this.cargo = cargo;
        this.horario = horario;
        this.salario = salario;
        this.estado = estado;
    }
    
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechacontrato() {
        return fechacontrato;
    }

    public void setFechacontrato(String fechacontrato) {
        this.fechacontrato = fechacontrato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }        
    
}
