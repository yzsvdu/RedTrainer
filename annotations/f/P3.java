package f;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class P3 {
  public static final ConcurrentHashMap bx = new ConcurrentHashMap<>();
  
  public static final P3 lF = new P3();
  
  public static List XP(Class<?> paramClass) {
    return bx.computeIfAbsent(paramClass, P3::b);
  }
  
  public final synchronized void gL(JG0 paramJG0) {
    ((List<JG0>)bx.computeIfAbsent(paramJG0.getClass(), P3::ft0)).add(paramJG0);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/P3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */