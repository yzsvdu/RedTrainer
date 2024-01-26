package f;

public final class ST extends kw0 implements Runnable {
  public final io LH;
  
  public final int fI0;
  
  public ST(aP paramaP, io paramio, int paramInt1, U70 paramU70, int paramInt2, int paramInt3) {
    super(paramaP, paramaP.QJ(), paramU70, paramInt2, paramInt3);
    this.LH = paramio;
    this.fI0 = paramInt1;
    tW(this);
  }
  
  public final void run() {
    int i = this.fI0;
    JG0 jG0;
    if ((jG0 = this.LH.qp(i, this.Ng, this, true)) != null)
      Ev0(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ST.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */