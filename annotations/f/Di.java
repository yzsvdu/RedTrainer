package f;

import java.lang.reflect.Field;

public abstract class Di {
  public static Field MW;
  
  static {
    try {
      (MW = ClassLoader.class.getDeclaredField("loadedLibraryNames")).setAccessible(true);
    } catch (Exception exception) {}
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */