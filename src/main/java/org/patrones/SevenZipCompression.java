package org.patrones;

public class SevenZipCompression implements CompressionStrategy{
    public void compress(String fileName) {
        System.out.println("Comprimiendo " + fileName + " usando compresión 7ZIP.");
    }
}
