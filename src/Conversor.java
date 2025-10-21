// Crear Interfaz para el conversor
// Importamos Swing para la interfaz gráfica
import javax.swing.*;

// Clase principal del conversor
public class Conversor {

    // Método principal: arranca el programa
    public static void main(String[] args) {
        // Llamamos al método que crea la interfaz
        crearVentana();
    }

    // Método que crea la ventana y sus componentes
    private static void crearVentana() {
        // Creamos la ventana principal
        JFrame ventana = new JFrame("Conversor de pulgadas a centímetros");

        // Creamos los elementos de la interfaz
        JLabel etiqueta = new JLabel("Introduce pulgadas:");
        JTextField campo = new JTextField(10);
        JButton boton = new JButton("Convertir");
        JLabel resultado = new JLabel("Resultado: ");

        // Acción del botón (cuando se pulsa llama al método convertir)
        boton.addActionListener(e -> convertir(campo, resultado));

        // Creamos un panel y añadimos los elementos
        JPanel panel = new JPanel();
        panel.add(etiqueta);
        panel.add(campo);
        panel.add(boton);
        panel.add(resultado);

        // Añadimos el panel a la ventana
        ventana.add(panel);

        // Ajustes básicos
        ventana.setSize(400, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    // Método que realiza la conversión
    private static void convertir(JTextField campo, JLabel resultado) {
        try {
            // Convertimos el texto a número
            double pulgadas = Double.parseDouble(campo.getText());
            // Calculamos los centímetros
            double cm = pulgadas * 2.54;
            // Mostramos el resultado en la etiqueta
            resultado.setText("Resultado: " + cm + " cm");
        } catch (NumberFormatException ex) {
            // Si el usuario mete algo que no es un número, mostramos aviso
            resultado.setText("Introduce un número válido");
        }
    }
}
