package f;

public abstract class xc {
  public cR X10;
  
  public xc(cR paramcR) {
    LB(paramcR, "style");
    this.X10 = paramcR;
  }
  
  public static void LB(Object paramObject, String paramString) {
    if (paramObject != null)
      return; 
    throw new NullPointerException(paramString);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */