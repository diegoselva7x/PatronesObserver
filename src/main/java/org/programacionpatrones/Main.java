package org.programacionpatrones;

import org.patrones.*;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de Observer
        File file1 = new File("File1.txt");
        FileObserver observer1 = new FileObserver("Observer1");
        file1.addObserver(observer1);

        //Observer en archivos


        // Notificar al observador sobre un cambio
        file1.change();

        // Ejemplo de Strategy
        CompressionStrategy zipStrategy = new ZipCompression();
        CompressionStrategy rarStrategy = new RarCompression();
        CompressionStrategy sevenZipStrategy = new SevenZipCompression();

        UploadFile awsStrategy = new AWSCloud();
        UploadFile googleStrategy = new GoogleCloud();

        zipStrategy.compress("File2.txt");
        rarStrategy.compress("File3.txt");
        sevenZipStrategy.compress("File 7Zip");

        awsStrategy.upload("File1.txt");
        googleStrategy.upload("File2.txt");


        // Ejemplo de Composite
        Folder folder = new Folder("MiCarpeta");
        folder.add(new File("File4.txt"));
        folder.add(new File("File5.txt"));
        FolderObserver folderObserver = new FolderObserver("Observer del folder");
        FolderObserver folderObserver2 = new FolderObserver("Observer2 del folder");

        folder.addObserver(folderObserver);
        folder.addObserver(folderObserver2);

        Folder subFolder = new Folder("SubCarpeta");
        subFolder.add(new File("File6.txt"));

        folder.add(subFolder);
        subFolder.addObserver(folderObserver);
        subFolder.change();

        folder.showDetails();
        folder.change();
    }

}