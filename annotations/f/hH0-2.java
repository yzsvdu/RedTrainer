package f;

public final class hH0 extends yU implements QJ {
  public short w1;
  
  public short Mk;
  
  public l5[][][] KF;
  
  public hH0(short paramShort1, short paramShort2, Cy paramCy, yU paramyU, lF0 paramlF0) {
    super(paramyU);
    int i = this.ar0;
    this.KF = new l5[this.nK.length][i][this.Rc0];
    for (i = 0; i < this.nK.length; i = (byte)(i + 1)) {
      short s;
      for (s = 0; s < this.ar0; s = (short)(s + 1)) {
        short s1;
        for (s1 = 0; s1 < this.Rc0; s1 = (short)(s1 + 1)) {
          l5 l51;
          this(paramCy, this, s, s1, i);
          this.KF[i][s][s1] = l51;
        } 
      } 
    } 
    this.w1 = (short)(paramShort1 * this.ar0 + paramlF0.ju);
    this.Mk = (short)(paramShort2 * this.Rc0 + paramlF0.km0);
  }
  
  public final il p9(byte paramByte, short paramShort1, short paramShort2) {
    l5[][][] arrayOfL5;
    if ((arrayOfL5 = this.KF) != null)
      return (paramShort1 < 0 || paramShort2 < 0 || paramByte >= arrayOfL5.length || paramShort1 >= this.ar0 || paramShort2 >= this.Rc0) ? null : arrayOfL5[paramByte][paramShort1][paramShort2]; 
    throw new RuntimeException("Not properly init");
  }
  
  public final short Dh0() {
    return this.w1;
  }
  
  public final short static() {
    return this.Mk;
  }
  
  public final Bs gT() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */