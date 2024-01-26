package f;

public abstract class Kt implements synchronized {
  public fQ aH0;
  
  public Kt() {
    fQ fQ1;
    this();
    this.aH0 = this;
  }
  
  public abstract R40 xj(Xw0 paramXw0);
  
  public final void dispose() {
    Hc0 hc0 = this.aH0.r30();
    while (hc0.hasNext())
      ((R40)hc0.next()).dispose(); 
    this.aH0.clear();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Kt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */