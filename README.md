# 🧮 Conversor de Pulgadas a Centímetros

Actividad 2 – Módulo **Desarrollo de Interfaces**

---

## 🎯 Objetivo
En esta segunda actividad he mejorado el ejercicio del conversor de pulgadas a centímetros.  
El objetivo era aplicar pequeñas mejoras de estructura en el código y trabajar el aspecto visual de la interfaz para que resultara más clara, moderna y agradable.

---

## 🧩 Mejoras realizadas

### 🔹 Separación en métodos
Decidí dividir el código en dos métodos para que fuera más fácil de entender y mantener:
- **crearVentana()** → donde se construye toda la parte visual.
- **convertir()** → donde se hace el cálculo matemático.

Así el programa queda más ordenado: uno se encarga del diseño y otro de la lógica.

---

### 🔹 Uso de un Listener
Añadí un **ActionListener** al botón “Convertir”.  
Esto significa que cuando el usuario pulsa el botón, el programa “escucha” ese clic y llama automáticamente al método `convertir()`.  
Con esto logré que el funcionamiento quedara separado del diseño, tal y como se hace en programas reales.

---

### 🔹 Mejoras visuales y diseño

En esta parte quise que la ventana se viera más moderna y agradable.  
Para conseguirlo, fui cambiando varios detalles siguiendo lo que aprendí:

#### 1. Colores (RGB)
Aprendí que los colores se crean con tres números que representan **rojo, verde y azul (RGB)**, con valores del 0 al 255.  
Por ejemplo:
- `new Color(255, 255, 255)` es blanco,
- `new Color(0, 0, 0)` es negro,
- `new Color(230, 240, 255)` es un azul muy suave.

Usé tonos claros en el fondo, como azul o gris suave, porque dan sensación de limpieza y no cansan la vista.  
También probé a poner el botón con un color algo más fuerte (como azul medio) y el texto blanco, para que destacara visualmente.

#### 2. Cambio de fuente
Cambié la fuente a **Segoe UI** o **Verdana**, que son más actuales y se parecen a las que usan las interfaces modernas de Windows y Mac.  
El botón lo puse en **negrita** para que resaltara más.

#### 3. Márgenes y espaciado
Aprendí que los márgenes se crean con `EmptyBorder`, donde se puede poner el espacio en píxeles en cada lado.  
Por ejemplo:
```java
panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
```
### 4. Centrado de la ventana

Configuré la ventana para que se abra centrada en pantalla usando:
````java
ventana.setLocationRelativeTo(null);
````

Así siempre aparece en el centro, y no en una esquina como pasa por defecto.

--- 
🧠 Resultado final

Después de todos estos cambios, la aplicación se ve mucho más limpia:
los textos son legibles, los colores suaves, el botón resalta lo justo y todo está bien centrado.
El resultado final es una interfaz sencilla pero cuidada, con un código ordenado y fácil de entender.

✍️ Autor

Santiago Lafuente Hernández
Estudiante de 2º DAM – Módulo Desarrollo de Interfaces