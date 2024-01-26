package f;

public abstract class MF {
  public static final ik vt0 = C00.gd(MF.class);
  
  public static Thread ik;
  
  public static void KQ() {
    if (ik == Thread.currentThread())
      return; 
    throw new RuntimeException();
  }
  
  public static void u10() {
    if (ik != Thread.currentThread()) {
      RuntimeException runtimeException;
      this();
      vt0.warn("Should be done on main thread", runtimeException);
    } 
  }
  
  public static boolean yl0() {
    return (ik == Thread.currentThread());
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */