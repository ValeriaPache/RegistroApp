package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {

    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.debug("Debug Message: Sistema en modo de depuración.");
        logger.info("Info Message: Aplicación iniciada correctamente.");
        logger.warn("Warn Message: Cuidado, posible problema.");
        logger.error("Error Message: Ocurrió un error inesperado.");
        logger.fatal("Fatal Message: Error crítico, terminando la aplicación.");
    }
}
