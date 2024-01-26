package f;

import java.io.File;

public abstract class Hx implements Fj {
  public abstract boolean accept(File paramFile);
  
  public boolean accept(File paramFile, String paramString) {
    return accept(new File(paramFile, paramString));
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */