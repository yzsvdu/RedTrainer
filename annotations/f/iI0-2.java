/* 1 */ package f;public final class iI0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { Gp0 gp0; if ((gp0 = km.MR) == null) return;  cOm4 cOm4; if ((cOm4 = gp0.f70(this.fE0)) == null) return;  jd0 jd0; if ((jd0 = cOm4.gc) == null)
/* 2 */       return;  byte b = cOm4.Mb0;
/*   */     hm0 hm01;
/* 4 */     if ((hm01 = Arrays.stream(gp0.cl[b]).filter(paramhm0 -> (paramhm0.ih() != this.fE0)).findFirst().orElse(null)) == null) return;  arrayOfString[0] = this.Pm0; arrayOfString[1] = jd0.Qe(); String[] arrayOfString; (arrayOfString = new String[3])[2] = hm01.coM1(); paramkf.Kq(Ml0.sB(16804143, arrayOfString)); }
/*   */ 
/*   */   
/*   */   public final String Pm0;
/*   */   public final int fE0;
/*   */   
/*   */   public iI0(String paramString, int paramInt) {
/*   */     this.Pm0 = paramString;
/*   */     this.fE0 = paramInt;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return -22;
/*   */   }
/*   */   
/*   */   public final boolean Lt() {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */