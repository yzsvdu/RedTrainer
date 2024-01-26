package f;

public abstract class KI implements iq0 {
  public byte E10;
  
  public byte cA;
  
  public byte VZ;
  
  public byte Xw;
  
  public final Ae0 l1;
  
  public int Fk0;
  
  public int nT;
  
  public vF UZ = vF.IQ;
  
  public xm Eo = xm.jQ;
  
  public yE0 Cd;
  
  public boolean lpT1 = false;
  
  public xr0[] hc = new xr0[4];
  
  public KI(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    this.E10 = paramByte1;
    this.cA = paramByte2;
    this.VZ = paramByte3;
    this.Xw = paramByte4;
    this.l1 = GG.kz0().xD(this);
  }
  
  public final xr0 vW(xr0 paramxr0, short paramShort1, short paramShort2, byte paramByte, int paramInt) {
    xr0 xr01;
    if (paramxr0 == null || paramInt == 0)
      return paramxr0; 
    if (paramInt < 0) {
      paramByte = LF.IW(paramByte);
      paramInt = Math.abs(paramInt);
    } 
    switch (paramByte) {
      default:
        throw new RuntimeException("Invalid direction");
      case 3:
        paramShort1 = (short)(paramShort1 + 1);
        break;
      case 2:
        paramShort1 = (short)(paramShort1 - 1);
        break;
      case 1:
        paramShort2 = (short)(paramShort2 - 1);
        break;
      case 0:
        paramShort2 = (short)(paramShort2 + 1);
        break;
    } 
    if (paramxr0.Y00()) {
      paramxr0 = paramxr0.Cx(paramByte);
    } else {
      float f = paramxr0.i00();
      xr01 = U30(paramShort1, paramShort2, f);
    } 
    int i = paramInt - 1;
    return vW(xr01, paramShort1, paramShort2, paramByte, i);
  }
  
  public final byte m6() {
    return this.E10;
  }
  
  public final short Xg0() {
    return Qx.mF(this.cA, this.VZ);
  }
  
  public final boolean XC() {
    return (this.l1 != null);
  }
  
  public abstract String xc0();
  
  public final byte eM() {
    return this.Xw;
  }
  
  public abstract short zu();
  
  public abstract boolean J4();
  
  public abstract xr0 v50(int paramInt1, int paramInt2, int paramInt3);
  
  public xr0 U30(short paramShort1, short paramShort2, float paramFloat) {
    return v50(paramShort1, paramShort2, 0);
  }
  
  public final xr0 G1(int paramInt1, int paramInt2) {
    return v50(paramInt1, paramInt2, 0);
  }
  
  public xr0 v4(byte paramByte, short paramShort1, short paramShort2) {
    return null;
  }
  
  public xr0 XG0(float paramFloat1, float paramFloat2, float paramFloat3) {
    return null;
  }
  
  public final xr0 COm3(xr0 paramxr0, byte paramByte, int paramInt) {
    if (paramxr0 == null || paramInt == 0)
      return paramxr0; 
    short s = paramxr0.Ka();
    return vW(paramxr0, s, paramxr0.hA0(), paramByte, paramInt);
  }
  
  public int cp0() {
    return 0;
  }
  
  public int kf0() {
    return 0;
  }
  
  public boolean zV() {
    return this instanceof pI;
  }
  
  public boolean o50() {
    return false;
  }
  
  public boolean A8() {
    return false;
  }
  
  public void gx0(xr0 paramxr0) {}
  
  public HV rH0() {
    return null;
  }
  
  public void dispose() {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */