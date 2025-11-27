package com.example;

public class EjerciciosActividad1 {
    public static void main(String[] args) {
        // --- Declaración de variables ---       
        int numero = 10;
        System.out.println("El numero es: " + numero);

        double pi = 3.1416;
        System.out.println("El valor de pi es: " + pi);

        String despedida = "Hasta luego!";
        System.out.println(despedida);

        // --- Tipos de datos primitivos ---       
        byte diasSemana = 7;
        short temperatura = 35;
        int poblacion = 1000000;
        long distanciaTierraSol = 149600000L;
        float alturaPromedio = 1.75f;
        double pesoPromedio = 70.5;
        boolean mañanaNoHayClases = true;
        char UltimaLetraAbecedario = 'Z';
        System.out.println("Días en una semana: " + diasSemana);
        System.out.println("Temperatura máxima: " + temperatura);
        System.out.println("Población de la ciudad: " + poblacion);
        System.out.println("Distancia de la Tierra al Sol: " + distanciaTierraSol + " km");
        System.out.println("Altura promedio: " + alturaPromedio + " m");
        System.out.println("Peso promedio: " + pesoPromedio + " kg");
        System.out.println("¿Mañana no hay clases? " + mañanaNoHayClases);
        System.out.println("Última letra del abecedario: " + UltimaLetraAbecedario);

        // --- Tipos de datos no primitivos ---
        String mensaje = "Programación en Java";
        System.out.println(mensaje);

        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        System.out.println("Arreglo: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        Persona p = new Persona("Valentina", 20);
        System.out.println("Persona: " + p.nombre + " - Edad: " + p.edad);


        // --- Operadores aritméticos ---
        int a = 12, b2 = 4;
        System.out.println("Suma: " + (a + b2));
        System.out.println("Resta: " + (a - b2));
        System.out.println("Multiplicación: " + (a * b2));
        System.out.println("División: " + (a / b2));
        System.out.println("Módulo: " + (a % b2));

        System.out.println("División entera: " + (7 / 2));
        System.out.println("División decimal: " + (7 / 2.0));

        int inc = 5;
        inc++;
        System.out.println("Incremento: " + inc);
        inc--;
        System.out.println("Decremento: " + inc);


        // --- Operadores de asignación ---
        int x = 10;
        x += 5;
        System.out.println("x += 5 -> " + x);
        x -= 3;
        System.out.println("x -= 3 -> " + x);

        int y = 6;
        y *= 2;
        System.out.println("y *= 2 -> " + y);
        y /= 3;
        System.out.println("y /= 3 -> " + y);

        int z = 10;
        z %= 4;
        System.out.println("z %= 4 -> " + z);


        // --- Operadores de comparación ---
        int n1 = 8, n2 = 12;
        System.out.println("== : " + (n1 == n2));
        System.out.println("!= : " + (n1 != n2));
        System.out.println("> : " + (n1 > n2));
        System.out.println("< : " + (n1 < n2));
        System.out.println(">= : " + (n1 >= n2));
        System.out.println("<= : " + (n1 <= n2));

        if (n1 < n2) {
            System.out.println("n1 es menor que n2");
        }


        // --- Operadores lógicos ---
        boolean v1 = true, v2 = false;

        System.out.println("&& : " + (v1 && v2));
        System.out.println("|| : " + (v1 || v2));
        System.out.println("!v1 : " + (!v1));

        boolean comp = (v1 || v2) && (!v2);
        System.out.println("Condición compuesta: " + comp);


        // --- If ---
        int edad = 20;
        int edad2 = 18;

        if (edad > edad2) {
            System.out.println("Edad es mayor");
        }

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int num = 45;
        if (num < 20) {
            System.out.println("Pequeño");
        } else if (num <= 50) {
            System.out.println("Mediano");
        } else {
            System.out.println("Grande");
        }


        // --- Switch ---
        String dia = "Lunes";
        switch (dia) {
            case "Lunes": System.out.println("1"); break;
            case "Martes": System.out.println("2"); break;
            case "Miércoles": System.out.println("3"); break;
            case "Jueves": System.out.println("4"); break;
            case "Viernes": System.out.println("5"); break;
            case "Sábado": System.out.println("6"); break;
            case "Domingo": System.out.println("7"); break;
            default: System.out.println("Día no válido");
        }

        int nota = 4;
        switch (nota) {
            case 1: System.out.println("Insuficiente"); break;
            case 2: System.out.println("Aceptable"); break;
            case 3: System.out.println("Bueno"); break;
            case 4: System.out.println("Muy bueno"); break;
            case 5: System.out.println("Excelente"); break;
            default: System.out.println("Nota inválida");
        }

        int estacion = 2;
        switch (estacion) {
            case 1: System.out.println("Primavera"); break;
            case 2: System.out.println("Verano"); break;
            case 3: System.out.println("Otoño"); break;
            case 4: System.out.println("Invierno"); break;
            default: System.out.println("Número inválido");
        }


        // --- Otros ejemplos ---
        int numeroEval = -5;
        if (numeroEval > 0) {
            System.out.println("Positivo");
        } else if (numeroEval < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        String contraseña = "1234";
        if (contraseña.equals("1234")) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}


// Clase usada en los ejercicios
class Persona {
    String nombre;
    int edad;

    Persona(String n, int e) {
        nombre = n;
        edad = e;
    }
}