package com.company.certification.retotest.util.properties;

import com.company.certification.retotest.exceptions.RetoException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RetoProperties {

    private static Properties prop = null;

    private RetoProperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/reto.properties"));
            } catch (IOException e) {
                throw new RetoException(e);
            }
        }
    }



}
