package f;

public final class bS extends yJ0 implements Runnable {
  public final io IC;
  
  public final int jQ;
  
  public bS(fa0 paramfa0, io paramio, int paramInt, Jo paramJo) {
    super(paramfa0, str, bool, paramJo);
    boolean bool;
    this.IC = paramio;
    this.jQ = paramInt;
    tW(this);
  }
  
  public final void run() {
    int i = this.jQ;
    this.IC.qp(i, this.Bg, this, true);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */