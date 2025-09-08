//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{


//1       Obtenemos la clase:

        Class<?> clasePersona = Persona.class;

//2    Imprimimos los contructores de la clase:

        System.out.println("Constructores de la clase Persona:");
        Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();

        for (Constructor<?> c : constructores) {
            System.out.println(c);
        }

// 3    Instanciamos un objeto:


        Constructor<?> constructor = clasePersona.getConstructor(String.class, int.class);
        Object persona = constructor.newInstance("Nahuel", 27);



//4  Cambiamos el valor de nombre en ejecucion:

        Field campoNombre = clasePersona.getDeclaredField("nombre");

        campoNombre.setAccessible(true);
        campoNombre.set(persona, "TITO");

//5  Utilizamos un metodo que muestre la informacion:

        Method metodoMuestra = clasePersona.getMethod("MostrarInfo");

        metodoMuestra.invoke(persona);


//6  Modificamos el encapsulamiento:

        Method metodoSaludar = clasePersona.getDeclaredMethod("Saludar");

        metodoSaludar.setAccessible(true);

        String saludar = (String) metodoSaludar.invoke(persona);
        System.out.println("Saludo (con Reflection): " + saludar);


    }
    }
