package f;

public final class J7 extends Ij0 implements Runnable {
  public final io jR;
  
  public final int gf0;
  
  public J7(hu paramhu, io paramio, int paramInt) {
    super(paramhu);
    this.jR = paramio;
    this.gf0 = paramInt;
    tW(this);
  }
  
  public final String TI() {
    return "submenubtn";
  }
  
  public final void run() {
    int i = this.gf0;
    this.jR.qp(i, this.ct0, this, true);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */