package f;

public final class Ut extends l5 {
  public short Mq;
  
  public xr0[] catch = new xr0[4];
  
  public eo mC0 = new eo();
  
  public float ay;
  
  public Ut(Cy paramCy, short paramShort1, short paramShort2, byte paramByte, short paramShort3, short paramShort4) {
    super(paramCy, null, paramShort1, paramShort2, paramByte);
    this.Mq = paramShort3;
    this.EC0 = paramShort4;
  }
  
  public final boolean Y00() {
    return true;
  }
  
  public final float i00() {
    return this.mC0.y;
  }
  
  public final float Kn() {
    return this.ay;
  }
  
  public final byte OB0() {
    return (byte)this.Mq;
  }
  
  public final short lK() {
    return this.Mq;
  }
  
  public final short nH() {
    return this.EC0;
  }
  
  public final xr0 Cx(byte paramByte) {
    return (paramByte < 0 || paramByte > 3) ? null : this.catch[paramByte];
  }
  
  public final void vV(byte paramByte, il paramil) {
    if (paramil == null)
      return; 
    this.catch[paramByte] = paramil;
  }
  
  public final eo j5() {
    return this.mC0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ut.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */