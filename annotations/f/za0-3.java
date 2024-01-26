package f;

public final class za0 extends LW implements QJ {
  public short bE;
  
  public short By;
  
  public il[][][] nv0;
  
  public za0(short paramShort1, short paramShort2, Cy paramCy, LW paramLW) {
    super(paramLW);
    int i = this.ar0;
    this.nv0 = new il[this.gP.length][i][this.Rc0];
    for (i = 0; i < this.gP.length; i = (byte)(i + 1)) {
      short s;
      for (s = 0; s < this.ar0; s = (short)(s + 1)) {
        short s1;
        for (s1 = 0; s1 < this.Rc0; s1 = (short)(s1 + 1)) {
          NZ nZ;
          this(paramCy, this, s, s1, i);
          this.nv0[i][s][s1] = nZ;
        } 
      } 
    } 
    this.bE = (short)(paramShort1 * this.ar0);
    this.By = (short)(paramShort2 * this.Rc0);
  }
  
  public final il p9(byte paramByte, short paramShort1, short paramShort2) {
    il[][][] arrayOfIl;
    if ((arrayOfIl = this.nv0) != null)
      return (paramShort1 < 0 || paramShort2 < 0 || paramByte >= arrayOfIl.length || paramShort1 >= this.ar0 || paramShort2 >= this.Rc0) ? null : arrayOfIl[paramByte][paramShort1][paramShort2]; 
    throw new RuntimeException("Not properly init");
  }
  
  public final short Dh0() {
    return this.bE;
  }
  
  public final short static() {
    return this.By;
  }
  
  public final Bs gT() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/za0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */