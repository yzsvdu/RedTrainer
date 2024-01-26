package f;

import java.util.HashMap;

public final class Am0 extends zp {
  public static final HashMap hX = new HashMap<>();
  
  public Xo0 er0;
  
  public Am0(Xo0 paramXo0) {
    super(34067);
    this.er0 = paramXo0;
    oc(paramXo0);
    if (paramXo0.k50())
      Wd(UB0.Kg0, this); 
  }
  
  public Am0(RD0 paramRD01, RD0 paramRD02, RD0 paramRD03, RD0 paramRD04, RD0 paramRD05, RD0 paramRD06) {
    this(paramRD01, paramRD02, paramRD03, paramRD04, paramRD05, paramRD06, false);
  }
  
  public Am0(RD0 paramRD01, RD0 paramRD02, RD0 paramRD03, RD0 paramRD04, RD0 paramRD05, RD0 paramRD06, boolean paramBoolean) {
    this(this, bu02, bu03, bu04, bu05, bu06);
  }
  
  public Am0(ZH paramZH1, ZH paramZH2, ZH paramZH3, ZH paramZH4, ZH paramZH5, ZH paramZH6) {
    this(paramZH1, paramZH2, paramZH3, paramZH4, paramZH5, paramZH6, false);
  }
  
  public Am0(ZH paramZH1, ZH paramZH2, ZH paramZH3, ZH paramZH4, ZH paramZH5, ZH paramZH6, boolean paramBoolean) {
    this(aB1, aB2, aB3, aB4, aB5, aB6);
  }
  
  public Am0(int paramInt1, int paramInt2, int paramInt3, Uc paramUc) {
    this(paramInt3, paramInt2, paramUc);
    AB aB1;
    AB aB2;
    ZH zH1;
    AB aB3;
    ZH zH2;
    AB aB4;
    ZH zH3;
    AB aB5;
    ZH zH4;
    AB aB6;
    ZH zH5;
    this(zH1, null, false, true);
    this(paramInt3, paramInt2, paramUc);
    this(zH2, null, false, true);
    this(paramInt1, paramInt3, paramUc);
    this(zH3, null, false, true);
    this(paramInt1, paramInt3, paramUc);
    this(zH4, null, false, true);
    this(paramInt1, paramInt2, paramUc);
    this(zH4, null, false, true);
    this(paramInt1, paramInt2, paramUc);
    this(zH5, null, false, true);
    this(this, aB3, aB4, aB5, aB2, aB6);
  }
  
  public Am0(Bu0 paramBu01, Bu0 paramBu02, Bu0 paramBu03, Bu0 paramBu04, Bu0 paramBu05, Bu0 paramBu06) {
    this(paramBu01, paramBu02, paramBu03, paramBu04, paramBu05, paramBu06);
    TH0 tH0;
    this(this);
  }
  
  public static void Wd(x paramx, Am0 paramAm0) {
    HashMap<?, fQ> hashMap;
    fQ fQ;
    if ((fQ = (hashMap = hX).get(paramx)) == null)
      this(); 
    fQ.Com3(paramAm0);
    hashMap.put(paramx, fQ);
  }
  
  public final void oc(Xo0 paramXo0) {
    if (!paramXo0.aF0())
      paramXo0.zr0(); 
    bind();
    cu0 cu0 = this.minFilter;
    unsafeSetFilter(cu0, this.magFilter, true);
    A00 a00 = this.uWrap;
    unsafeSetWrap(a00, this.vWrap, true);
    unsafeSetAnisotropicFilter(this.anisotropicFilterLevel, true);
    paramXo0.QI();
    UB0.go.glBindTexture(this.glTarget, 0);
  }
  
  public final void dispose() {
    if (this.glHandle == 0)
      return; 
    delete();
    HashMap<?, ?> hashMap;
    if (this.er0.k50() && (hashMap = hX).get(UB0.Kg0) != null)
      ((fQ)hashMap.get(UB0.Kg0)).Ct(this, true); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Am0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */