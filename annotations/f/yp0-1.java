package f;

public abstract class yp0 {
  public long Gt = System.currentTimeMillis();
  
  public abstract boolean Ie();
  
  public abstract void wL();
  
  public abstract int zE();
  
  public boolean xA0() {
    return (System.currentTimeMillis() - this.Gt > 90000L);
  }
  
  public void Tn0() {
    this.Gt = System.currentTimeMillis();
  }
  
  public boolean iQ() {
    return this instanceof e80;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */