/* 1 */ package f;public final class WD { public final Ht0 Wt(Q90 paramQ90, Mx paramMx) { Ht0 ht0; hR[] arrayOfHR; if (paramQ90 != null) { int i; if ((i = this.HA) == 237) { if ((ht0 = paramQ90.GJ0) == null) { byte b; byte b1; for (b = 0, i = (arrayOfHR = hR.Tt0).length, b1 = 0; b1 < i; ) {
/* 2 */             hR hR1; if (!(hR1 = arrayOfHR[b1]).NT)
/*   */             {
/* 4 */               b = (byte)(b | paramQ90.Hc(hR1) % 2 << hR1.dL); }  b1++;
/* 5 */           }  ht0 = Ht0.COm7[(byte)(b * 15 / 63)]; }  return this; }  if (i == 363)
/*   */       {
/*   */         
/* 8 */         return (Of.eH.On0(dx.l90(paramQ90.p10()))).de0; }  }  if (((WD)super)
/* 9 */       .HA == 311 && arrayOfHR != null) { switch (arrayOfHR.ordinal()) { default: return Ht0.Ku;case 3: return Ht0.vi0;case 5: return Ht0.y30;case 2: case 6: case 7: return Ht0.Bo;case 1: break; }  return Ht0.QS; }  return ((WD)super).wJ0; }
/*   */ 
/*   */   
/*   */   public static final Comparator Fw0 = Comparator.comparing(WD::cW);
/*   */   public static final uj[] Xl = new uj[0];
/*   */   public static final hR[] zg = new hR[0];
/*   */   public final short HA;
/*   */   public Ht0 wJ0;
/*   */   public YB0 Iq = YB0.tI0;
/*   */   public short Di0;
/*   */   public byte Jp0;
/*   */   public byte nul;
/*   */   public byte VT;
/*   */   public byte XT;
/*   */   public byte Pv0;
/*   */   public byte EZ;
/*   */   public byte DD;
/*   */   public byte[] cOM8 = new byte[3];
/*   */   public byte[] gx = new byte[3];
/*   */   public byte[] ZG0 = new byte[3];
/*   */   public hR[] sK0;
/*   */   public hR[] pr0;
/*   */   public byte ha;
/*   */   public byte I80;
/*   */   public boolean Zo;
/*   */   public byte oV;
/*   */   public short f50;
/*   */   public boolean WS;
/*   */   public uj[] A2;
/*   */   public int iz;
/*   */   public int hR;
/*   */   
/*   */   public WD(short paramShort) {
/*   */     hR[] arrayOfHR = zg;
/*   */     this.pr0 = this;
/*   */     this.ha = 0;
/*   */     this.I80 = 0;
/*   */     this.Zo = false;
/*   */     this.oV = 0;
/*   */     this.WS = false;
/*   */     this.A2 = Xl;
/*   */     this.HA = paramShort;
/*   */     this.iz = paramShort + 110000;
/*   */     this.hR = paramShort + 120000;
/*   */   }
/*   */   
/*   */   public WD(short paramShort, Ht0 paramHt0) {
/*   */     hR[] arrayOfHR = zg;
/*   */     this.pr0 = this;
/*   */     this.ha = 0;
/*   */     this.I80 = 0;
/*   */     this.Zo = false;
/*   */     this.oV = 0;
/*   */     this.WS = false;
/*   */     this.A2 = Xl;
/*   */     this.HA = paramShort;
/*   */     this.iz = paramShort + 110000;
/*   */     this.hR = paramShort + 120000;
/*   */     this.Di0 = 0;
/*   */     this.wJ0 = paramHt0;
/*   */     this.Jp0 = 0;
/*   */     this.nul = 0;
/*   */     this.DD = 0;
/*   */   }
/*   */   
/*   */   public final short xF0() {
/*   */     return this.HA;
/*   */   }
/*   */   
/*   */   public final Ht0 Fn(Q90 paramQ90) {
/*   */     return Wt(paramQ90, null);
/*   */   }
/*   */   
/*   */   public final short Xw() {
/*   */     return this.Di0;
/*   */   }
/*   */   
/*   */   public final byte eg0() {
/*   */     return this.Jp0;
/*   */   }
/*   */   
/*   */   public final byte Ot() {
/*   */     return this.nul;
/*   */   }
/*   */   
/*   */   public final String cW() {
/*   */     return Ml0.OH0(this.iz);
/*   */   }
/*   */   
/*   */   public final boolean Ve0(short paramShort) {
/*   */     return ((this.f50 & paramShort) != 0);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return Ml0.OH0(this.iz);
/*   */   }
/*   */   
/*   */   public final gr0 EE0() {
/*   */     Z4 z4 = Z4.T0;
/*   */     return (gr0)this.TF.Z90(this.HA);
/*   */   }
/*   */   
/*   */   public final boolean Pj0() {
/*   */     short s;
/*   */     if ((s = this.HA) > 559 || s < -1)
/*   */       return true; 
/*   */   }
/*   */   
/*   */   public final boolean w50() {
/*   */     return (this.HA > 0 && !Pj0());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */