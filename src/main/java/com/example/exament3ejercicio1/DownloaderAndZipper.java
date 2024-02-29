package com.example.exament3ejercicio1;

import javafx.collections.ListChangeListener;

public class DownloaderAndZipper implements ListChangeListener<UrlInfo> {

    // Método invocado cuando se detecta un cambio en la lista de URLs.
    @Override
    public void onChanged(Change<? extends UrlInfo> change) {
        // Se itera sobre los cambios en la lista.
        while (change.next()) {
            if (change.wasAdded()) {
                // Se itera sobre los elementos añadidos.
                for (UrlInfo urlInfo : change.getAddedSubList()) {
                    // Se obtienen la URL y la cadena única asociada.
                    String url = urlInfo.getUrl();
                    String uniqueId = urlInfo.getUniqueId();

                    // Se verifica si la URL está vacía.
                    if (url.isEmpty()) {
                        System.out.println("Se va a proceder a descargar y comprimir los ficheros");
                    } else {
                        // Se imprime un mensaje indicando que la URL fue encolada junto con la cadena única.
                        System.out.println(url + " encolado como " + uniqueId);
                    }
                }
            }
        }
    }
}
