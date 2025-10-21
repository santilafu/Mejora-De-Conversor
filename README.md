# 🧮 Conversor de Pulgadas a Centímetros

Actividad 2 – Módulo **Desarrollo de Interfaces**

---

## 🎯 Objetivo
Mejorar el código del primer ejercicio añadiendo:
1. Separación del programa en **dos métodos** (`crearVentana()` y `convertir()`).
2. Uso de un **listener (ActionListener)** para ejecutar el método `convertir()` cuando se pulsa el botón.
3. Pequeñas mejoras visuales para hacer la interfaz más agradable.

---

## 🧠 Descripción
El programa muestra una ventana con un campo donde introducir una medida en pulgadas.  
Cuando el usuario pulsa el botón **“Convertir”**, el sistema calcula los centímetros (1 pulgada = 2.54 cm)  
y muestra el resultado en pantalla.

---

## 💻 Código base

```java
import javax.swing.*;
import java.awt.*;

public class Conversor {

    public static void main(String[] args) {
        crearVentana(); // Llama al método que genera la interfaz
    }

    // Método que crea la ventana y sus componentes
    private static void crearVentana() {
        JFrame ventana = new JFrame("Conversor de pulgadas a centímetros");

        // Creamos los elementos de la interfaz
        JLabel etiqueta = new JLabel("Introduce pulgadas:");
        JTextField campo = new JTextField(10);
        JButton boton = new JButton("Convertir");
        JLabel resultado = new JLabel("Resultado: ");

        // Escuchador que llama al segundo método cuando se pulsa el botón
        boton.addActionListener(e -> convertir(campo, resultado));

        // Diseño visual (más bonito)
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(etiqueta);
        panel.add(campo);
        panel.add(boton);
        panel.add(resultado);

        ventana.add(panel);
        ventana.setSize(350, 160);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centra la ventana en pantalla
        ventana.setVisible(true);
    }

    // Método que realiza la conversión
    private static void convertir(JTextField campo, JLabel resultado) {
        try {
            double pulgadas = Double.parseDouble(campo.getText());
            double cm = pulgadas * 2.54;
            resultado.setText("Resultado: " + String.format("%.2f cm", cm));
        } catch (NumberFormatException ex) {
            resultado.setText("Introduce un número válido");
        }
    }
}
