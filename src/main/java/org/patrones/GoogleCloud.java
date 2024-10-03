package org.patrones;

public class GoogleCloud implements UploadFile{
    @Override
    public void upload(String fileName) {
        System.out.println("Documento "+ fileName +" ha sido subido a Google Cloud");
    }
}
