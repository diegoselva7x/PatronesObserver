package org.patrones;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Comprimiendo " + fileName + " usando compresión ZIP.");
    }
}