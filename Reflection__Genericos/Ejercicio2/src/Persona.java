public class Persona {

   private String nombre;
   private int edad;

   public Persona(String nombre, int edad) {
       this.nombre = nombre;
       this.edad = edad;
   }

   public String Saludar() {
       return this.nombre;
   }


  public void MostrarInfo() {
      System.out.println("Nombre: " + this.nombre + "-" + " Edad: " + this.edad);
  }
}
