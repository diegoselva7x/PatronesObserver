package org.patrones;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        //TODO: implementar compresión RAR
        System.out.println("Comprimiendo " + fileName + " usando compresión RAR.");
    }
}