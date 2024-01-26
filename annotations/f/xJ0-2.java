/* 1 */ package f;public final class xJ0 extends Wr { public final SE0[] sN; public pA uj; public SE0 fr; public final void kX(short[] paramArrayOfshort, int[] paramArrayOfint) { if (paramArrayOfshort.length > 0 && paramArrayOfint.length > 0) { byte b; SE0[] arrayOfSE0; for (b = 0; b < (arrayOfSE0 = this.sN).length; ) { boolean bool1 = false, bool2 = true; (arrayOfSE0[b]).COm8 = bool1; (arrayOfSE0[b])
/* 2 */           .lW = bool2;
/* 3 */         arrayOfSE0[b].Kh(0, (short)0, false); b++; }  for (b = 0; b < paramArrayOfshort.length; ) { short s = paramArrayOfshort[b]; this.sN[b].Kh(paramArrayOfint[b], s, false); s = 1; (this.sN[b])
/* 4 */           .COm8 = true;
/* 5 */         (this.sN[b]).lW = s; b++; }  } else { byte b = 0; SE0[] arrayOfSE0; while (b < (
/* 6 */         arrayOfSE0 = this.sN).length) { short s2 = 0; int i = 0; switch (b) { case 8: s2 = EC.l4; i = EC.VA0; break;case 7: s2 = EC.PU; i = EC.w1; break;case 6: s2 = EC.ef0; i = EC.NV; break;case 5: s2 = EC.Y90; i = EC.FX; break;case 4: s2 = EC.Hc0; i = EC.yc; break;case 3: s2 = EC.Qj; i = EC.Y60; break;case 2: s2 = EC.LS; i = EC.Fj; break;case 1: s2 = EC.fr; i = EC.ie; break;case 0: s2 = EC.nF; i = EC.xM; break; }  short s1 = 0; sE0
/* 7 */           .COm8 = false;
/* 8 */         sE0.lW = s1; SE0 sE0;
/* 9 */         (sE0 = arrayOfSE0[b]).Kh(i, s2, true); s1 = (short)(b + 1); }  }  } public SE0 VJ; public boolean ti; public boolean SU; public xJ0(pA parampA) { Ip ip; Ez ez; Ik0 ik0; this.ti = true; this.SU = false; this(); (new Ip()).Xu("content"); this.uj = parampA; this.sN = new SE0[9]; this(this); SE0[] arrayOfSE0; for (short s = 0; s < (arrayOfSE0 = this.sN).length; s = (short)(s + 1)) { nr nr; short s1 = 0; int i = 0; switch (s) { case 8: s1 = EC.l4; i = EC.VA0; break;case 7: s1 = EC.PU; i = EC.w1; break;case 6: s1 = EC.ef0; i = EC.NV; break;case 5: s1 = EC.Y90; i = EC.FX; break;case 4: s1 = EC.Hc0; i = EC.yc; break;case 3: s1 = EC.Qj; i = EC.Y60; break;case 2: s1 = EC.LS; i = EC.Fj; break;case 1: s1 = EC.fr; i = EC.ie; break;case 0: s1 = EC.nF; i = EC.xM; break; }  this(this, this, s1, i, s); arrayOfSE0[s] = nr; this.sN[s].an0(ik0); ip.J8(this.sN[s]); }  if (km.u4.q10()) kX(km.u4.YV(), km.u4.mL0());  if (km.XU()) { ip.rK0(ip.mE0().Mg((JG0[])this.sN)); ip.WN(ip.d7().Mg((JG0[])this.sN)); } else { ip.rK0(ip.d7().Mg((JG0[])this.sN)); ip.WN(ip.mE0().Mg((JG0[])this.sN)); }  J8(ip); Xu("hotkeybar"); this(this); HM(ez); EP(1); jJ0(false); No(false); } public final void d40() { super.d40(); kV(); } public final void kV() { if (km.XU()) { if (h1.Wo) { js0(et.dw0); } else { js0(et.T90); }  this.dy = false; this.fs0 = false; EP(1); } else if (h1.mG >= 0 && h1.yc >= 0) { ME(Math.min(h1.mG, km.wI0.dG() - this.xY), Math.min(h1.yc, km.wI0.k1() - this.HC)); }  this.SU = true; }
/*   */ 
/*   */   
/*   */   public final void EX(nY paramnY) {}
/*   */   
/*   */   public final boolean i2(oa0 paramoa0) {
/*   */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*   */       boolean bool = false;
/*   */       int i;
/*   */       if (h1.J20(i = paramoa0.GG0, BM.Ul)) {
/*   */         bool = this.sN[0].ld();
/*   */       } else if (h1.J20(i, BM.Vv0)) {
/*   */         bool = this.sN[1].ld();
/*   */       } else if (h1.J20(i, BM.lpT3)) {
/*   */         bool = this.sN[2].ld();
/*   */       } else if (h1.J20(i, BM.WN)) {
/*   */         bool = this.sN[3].ld();
/*   */       } else if (h1.J20(i, BM.Vs)) {
/*   */         bool = this.sN[4].ld();
/*   */       } else if (h1.J20(i, BM.jA)) {
/*   */         bool = this.sN[5].ld();
/*   */       } else if (h1.J20(i, BM.Um0)) {
/*   */         bool = this.sN[6].ld();
/*   */       } else if (h1.J20(i, BM.Km)) {
/*   */         bool = this.sN[7].ld();
/*   */       } else if (h1.J20(i, BM.Hg)) {
/*   */         bool = this.sN[8].ld();
/*   */       } 
/*   */       if (bool)
/*   */         return true; 
/*   */     } 
/*   */     return super.i2(paramoa0);
/*   */   }
/*   */   
/*   */   public final void r4(oa0 paramoa0) {
/*   */     if (this.fr != null) {
/*   */       int j = paramoa0.aK;
/*   */       int i = paramoa0.aK;
/*   */       JG0 jG0;
/*   */       if (jG0 = this.uj.Va0(j, paramoa0.gk0) instanceof SE0 || jG0 = Va0(i, paramoa0.gk0) instanceof SE0) {
/*   */         Ys((SE0)jG0);
/*   */       } else {
/*   */         Ys(null);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final byte dk0(short paramShort) {
/*   */     SE0[] arrayOfSE0;
/*   */     for (byte b = 0; b < (arrayOfSE0 = this.sN).length; ) {
/*   */       if ((arrayOfSE0[b]).hC0 == paramShort)
/*   */         return b; 
/*   */       b = (byte)(b + 1);
/*   */     } 
/*   */     return -1;
/*   */   }
/*   */   
/*   */   public final boolean Rj(short paramShort1, short paramShort2) {
/*   */     if (paramShort1 == paramShort2)
/*   */       return false; 
/*   */     boolean bool;
/*   */     byte b;
/*   */     SE0[] arrayOfSE0;
/*   */     for (bool = false, b = 0; b < (arrayOfSE0 = this.sN).length; ) {
/*   */       SE0 sE0;
/*   */       if ((sE0 = arrayOfSE0[b]).hC0 == paramShort1) {
/*   */         sE0.Kh(0, paramShort2, true);
/*   */         bool = true;
/*   */       } 
/*   */       b = (byte)(b + 1);
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final void Q60(boolean paramBoolean) {
/*   */     this.ti = paramBoolean;
/*   */     if (!paramBoolean && !km.XU()) {
/*   */       this.dy = true;
/*   */     } else {
/*   */       this.dy = false;
/*   */     } 
/*   */     this.fs0 = false;
/*   */   }
/*   */   
/*   */   public final void Ys(SE0 paramSE0) {
/*   */     SE0 sE0;
/*   */     if (paramSE0 != (sE0 = this.VJ)) {
/*   */       if (sE0 != null)
/*   */         sE0.xJ(false, false); 
/*   */       this.VJ = paramSE0;
/*   */       if (paramSE0 != null) {
/*   */         boolean bool = true;
/*   */         if (paramSE0 != this.fr)
/*   */           paramSE0.getClass(); 
/*   */         paramSE0.xJ(bool, true);
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */