package f;

public abstract class u60 implements qd0 {
  public eF0 DX;
  
  public abstract boolean Zf();
  
  public final void reset() {
    this.DX = null;
  }
  
  public final String toString() {
    String str;
    int i;
    if ((i = (str = u60.class.getName()).lastIndexOf('.')) != -1)
      str = substring(i + 1); 
    if (endsWith("Action"))
      str = substring(0, length() - 6); 
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/u60.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */