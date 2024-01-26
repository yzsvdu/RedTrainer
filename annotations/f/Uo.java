package f;

public final class Uo extends me {
  public lpt1[] o80 = new lpt1[3];
  
  public Uo(hB0 paramhB0) {
    super(paramhB0);
    eI.Lj().getClass();
    lpt1 lpt11 = eI.Yp0((byte)4, 141, false);
    lpt1[] arrayOfLpt1;
    for (byte b = 0; b < (arrayOfLpt1 = this.o80).length; b = (byte)(b + 1)) {
      lpt1 lpt12;
      if (b == 0) {
        lpt12 = lpt11;
      } else {
        lpt12 = lpt11.ro0();
      } 
      arrayOfLpt1[b] = lpt12;
      if (b == 0) {
        (this.o80[b]).mh.bb0(2.05F, 0.0F, 1.025F);
      } else if (b == 1) {
        (this.o80[b]).mh.bb0(2.2F, 0.0F, 1.025F);
      } else {
        (this.o80[b]).mh.bb0(2.125F, 0.0F, 1.1F);
      } 
      kc(this.o80[b]);
    } 
  }
  
  public final void Ic0(float paramFloat) {
    super.Ic0(paramFloat);
  }
  
  public final void Ad0(short[] paramArrayOfshort) {
    if (paramArrayOfshort.length < 1)
      return; 
    if (paramArrayOfshort[0] == 4706) {
      short s = paramArrayOfshort[1];
      lpt1[] arrayOfLpt1;
      for (short s1 = 0; s1 < (arrayOfLpt1 = this.o80).length; s1 = (short)(s1 + 1)) {
        boolean bool;
        if (s1 < s) {
          bool = true;
        } else {
          bool = false;
        } 
        Hc0 hc0 = (arrayOfLpt1[s1]).xl0.r30();
        while (hc0.hasNext()) {
          float f;
          T0 t0 = (T0)hc0.next();
          zc zc = new zc();
          if (bool) {
            f = 1.0F;
          } else {
            f = 0.0F;
          } 
          this(f);
          t0.Tz0(zc);
        } 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */