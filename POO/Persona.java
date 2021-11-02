package POO;
class Persona {
private int idPersona;
private String nombre;
private int edad;
private static int contadorPersonas;
public Persona () {
}
public Persona (String nombre, int edad){
  this.idPersona = ++contadorPersonas;
  this.nombre = nombre;
  this.edad = edad;
}
public int getIdPersona(){
  return this.idPersona;
}
public String getNombre(){
  return this.nombre;
}
public void setNombre(String nombre){
this.nombre = nombre;
}
public int getEdad(){
  return this.edad = edad;
}
public void setEdad(int edad){
  this.edad = edad;
}
public static int getContadorPersonas(){
  return contadorPersonas;
}
public String toString() {
  return "idPersona: "  + idPersona + "\nNombre: " + nombre + "\nEdad: " + edad + "\nPersona n°: " + contadorPersonas;
}
}
