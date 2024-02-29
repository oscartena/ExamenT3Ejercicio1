package com.example.exament3ejercicio1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea una lista observable para almacenar UrlInfo.
        ObservableList<UrlInfo> urlList = FXCollections.observableArrayList();

        // Se crea una instancia de DownloaderAndZipper, que actuará como observador de la lista de URL.
        DownloaderAndZipper downloaderAndZipper = new DownloaderAndZipper();
        urlList.addListener(downloaderAndZipper);

        // Se utiliza un objeto Scanner para recibir la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Se inicia un bucle para solicitar URLs al usuario hasta que ingresen "exit".
        while (true) {
            System.out.print("Introduce una URL (o 'exit' para salir): ");
            String url = scanner.nextLine();

            // Si la URL ingresada es "exit", se sale del bucle.
            if ("exit".equalsIgnoreCase(url)) {
                break;
            }

            // Se crea un nuevo objeto UrlInfo con la URL ingresada y una cadena aleatoria única.
            urlList.add(new UrlInfo(url, generarCadenaAleatoria()));
        }

        // Se cierra el objeto Scanner.
        scanner.close();
    }

    // Método privado para generar una cadena aleatoria de 20 caracteres a partir de letras minúsculas.
    private static String generarCadenaAleatoria() {
        final String CARACTERES = "abcdefghijklmnopqrstuvwxyz";
        final int LONGITUD = 20;
        StringBuilder cadenaAleatoria = new StringBuilder();

        // Se genera la cadena aleatoria seleccionando caracteres al azar de la lista de caracteres.
        for (int i = 0; i < LONGITUD; i++) {
            int indiceAleatorio = (int) (CARACTERES.length() * Math.random());
            cadenaAleatoria.append(CARACTERES.charAt(indiceAleatorio));
        }

        // Se devuelve la cadena aleatoria generada.
        return cadenaAleatoria.toString();
    }
}

// Clase auxiliar UrlInfo que almacena información sobre una URL y una cadena única asociada.
class UrlInfo {
    private String url;
    private String uniqueId;

    // Constructor que toma una URL y una cadena única como parámetros.
    public UrlInfo(String url, String uniqueId) {
        this.url = url;
        this.uniqueId = uniqueId;
    }

    // Método getter para obtener la URL.
    public String getUrl() {
        return url;
    }

    // Método getter para obtener la cadena única.
    public String getUniqueId() {
        return uniqueId;
    }
}
