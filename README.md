# Proyecto de Gestión de URLs con Descarga y Compresión

Este proyecto de Java con la biblioteca JavaFX y el patrón Observer-Listener permite a los usuarios ingresar direcciones URL, almacenarlas en un listado junto con una cadena única generada aleatoriamente, y observar eventos en la clase `DownloaderAndZipper` cada vez que se añade un elemento al listado.

## Funcionalidades

### 1. Capturar URLs y Cadena Aleatoria

- La aplicación permite al usuario ingresar direcciones URL.
- Asocia cada URL con una cadena única generada aleatoriamente de 20 caracteres.

### 2. Clase DownloaderAndZipper

- Escucha la lista de URLs y muestra mensajes en la consola cada vez que se añade un elemento.
- Si la URL está vacía, imprime "Se va a proceder a descargar y comprimir los ficheros".
- Si la URL no está vacía, imprime "{url} encolado como {cadenaÚnica}".

## Uso de la Aplicación

1. Ejecuta la aplicación.
2. Introduce una URL cuando se solicite, o escribe 'exit' para salir.
3. La aplicación almacenará la URL junto con una cadena aleatoria única.
4. La clase `DownloaderAndZipper` imprimirá mensajes según las condiciones especificadas.

## Tecnologías Utilizadas

- Java
- JavaFX
- Patrón Observer-Listener

## Cómo Ejecutar el Proyecto

Asegúrate de tener Java y JavaFX instalados. Luego, puedes clonar el proyecto y ejecutarlo localmente.

```bash
git clone https://tu-repositorio.git
cd tu-proyecto
# Asegúrate de tener las dependencias necesarias instaladas
# Ejecutar la aplicación
./gradlew run
