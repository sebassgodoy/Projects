package POO;

public class Tabla extends Persona {
  public static void main(String[] args) {
    Persona pers1 = new Persona("Sebastian", 24);
    System.out.println(pers1);
    System.out.println("contador personas: " + Persona.getContadorPersonas());

    Persona pers2 = new Persona();
    pers2.setNombre("Veronica");
    pers2.setEdad(45);
    System.out.println(pers2);

    System.out.println("contador personas: " + Persona.getContadorPersonas());

  }
}