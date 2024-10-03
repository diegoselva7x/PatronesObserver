package org.patrones;

import java.util.ArrayList;
import java.util.List;

public interface FileComponent {
    void showDetails();
    void add(FileComponent file);
    void remove(FileComponent file);
}