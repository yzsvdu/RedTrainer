package f;

public final class xP extends yp0 {
  public byte w20;
  
  public short Qd0;
  
  public boolean qm = false;
  
  public xP(byte paramByte, short paramShort) {
    this.w20 = paramByte;
    this.Qd0 = paramShort;
  }
  
  public final boolean Ie() {
    return this.qm;
  }
  
  public final void wL() {
    if (this.qm)
      return; 
    this.qm = true;
    byte b = this.w20;
    km.pm0.bL(b, this.Qd0);
  }
  
  public final int zE() {
    return 1;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */