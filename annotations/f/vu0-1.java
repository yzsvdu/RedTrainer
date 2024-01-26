package f;

public final class vu0 implements mX, VK0 {
  public final VI tj;
  
  public final XD U8;
  
  public final Ll kn;
  
  public final uE0 d9;
  
  public final float EF0;
  
  public final float ez;
  
  public final float Ul0;
  
  public final float CV;
  
  public final int Du0;
  
  public final int dr0;
  
  public final int mk0;
  
  public vu0(VI paramVI, UU paramUU, String paramString, uE0 paramuE0, pRn parampRn, int paramInt) {
    this.tj = paramVI;
    this.U8 = paramUU;
    this.kn = Ll.F10(paramString);
    this.d9 = paramuE0;
    this.EF0 = parampRn.pT();
    this.ez = parampRn.bf();
    this.Ul0 = parampRn.x3();
    this.CV = parampRn.Zg0();
    this.Du0 = paramUU.AK0();
    this.dr0 = paramUU.Ro0();
    this.mk0 = paramInt;
  }
  
  public vu0(vu0 paramvu0, pRn parampRn) {
    this.tj = paramvu0.tj;
    this.U8 = paramvu0.U8;
    this.kn = paramvu0.kn;
    this.d9 = paramvu0.d9;
    float f = paramvu0.EF0;
    this.EF0 = parampRn.pT() * f;
    f = paramvu0.ez;
    this.ez = parampRn.bf() * f;
    f = paramvu0.Ul0;
    this.Ul0 = parampRn.x3() * f;
    f = paramvu0.CV;
    this.CV = parampRn.Zg0() * f;
    this.Du0 = paramvu0.Du0;
    this.dr0 = paramvu0.dr0;
    this.mk0 = paramvu0.mk0;
  }
  
  public final int Vb() {
    return this.Du0;
  }
  
  public final int wu0() {
    return this.dr0;
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
    int i = this.Du0;
    int j = this.dr0;
    W8(paramuP, paramInt1, paramInt2, i, j);
  }
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 0;
    if (paramfB0 != null)
      if (this.mk0 < 0 || paramfB0.Oo0(this.kn)) {
        i = paramfB0.Fj0(this.kn);
      } else {
        i = this.mk0;
      }  
    this.U8.MC(i, null, paramInt1, paramInt2, paramInt3, paramInt4, this, paramfB0);
  }
  
  public final uE0 mJ0() {
    return this.d9;
  }
  
  public final mX rv0(pRn parampRn) {
    return new vu0(this, parampRn);
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vu0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */