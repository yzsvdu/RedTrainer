package f;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface Fj extends FileFilter, FilenameFilter {
  boolean accept(File paramFile);
  
  boolean accept(File paramFile, String paramString);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fj.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */