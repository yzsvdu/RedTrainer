/* 1 */ package f;public final class pRN extends XD { public final void MC(int paramInt1, pRN parampRN, int paramInt2, int paramInt3, int paramInt4, int paramInt5, vu0 paramvu0, fB0 paramfB0) { C7 c71; float f3 = this.En0, f4 = this.Ah, f5 = this.VE0, f6 = this.RW, f7 = this.iN, f8 = this.Fm0, f9 = this.F10, f10 = this.G7; if (parampRN != null) { float f = paramInt1 / this.z00; f3 = yf0(f3, parampRN.En0, f); f4 = yf0(f4, parampRN.Ah, f); f5 = yf0(f5, parampRN.VE0, f); f6 = yf0(f6, parampRN.RW, f); f7 = yf0(f7, parampRN.iN, f); f8 = yf0(f8, parampRN.Fm0, f); f9 = yf0(f9, parampRN.F10, f); f10 = yf0(f10, parampRN.G7, f); }  float f1 = f3 * paramvu0.EF0, f2 = f4 * paramvu0.ez; f3 = f5 * paramvu0.Ul0; f4 = f6 * paramvu0.CV; tw tw; C7 c72; if ((c72 = (tw = (tw)paramvu0.tj).Ma)
/* 2 */       .JJ == null)
/* 3 */     { C7 c7; this(c72); c72.JJ = c7; }  c72.prn *= f1; c72.cu0 *= f2; c72.ew0 *= f3; c72.JS *= f4; tw
/* 4 */       .Ma = c72.JJ; int i = (int)(paramInt4 * f7), j = (int)(paramInt5 * f8); 
/* 5 */     try { int k = paramInt2 + (int)((paramInt4 - i) * f9); this.L7.W8(paramfB0, k, paramInt3 + (int)((paramInt5 - j) * f10), i, j); return; } finally { ((tw)paramvu0.tj).w1(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final mX L7;
/*   */   public final float En0;
/*   */   public final float Ah;
/*   */   public final float VE0;
/*   */   public final float RW;
/*   */   public final float iN;
/*   */   public final float Fm0;
/*   */   public final float F10;
/*   */   public final float G7;
/*   */   
/*   */   public pRN(int paramInt, mX parammX, pRn parampRn, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     if (paramInt >= 0) {
/*   */       this.z00 = paramInt;
/*   */       this.L7 = parammX;
/*   */       this.En0 = parampRn.pT();
/*   */       this.Ah = parampRn.bf();
/*   */       this.VE0 = parampRn.x3();
/*   */       this.RW = parampRn.Zg0();
/*   */       this.iN = paramFloat1;
/*   */       this.Fm0 = paramFloat2;
/*   */       this.F10 = paramFloat3;
/*   */       this.G7 = paramFloat4;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("duration");
/*   */   }
/*   */   
/*   */   public static float yf0(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     return NUL.df(paramFloat2, paramFloat1, paramFloat3, paramFloat1);
/*   */   }
/*   */   
/*   */   public final int AK0() {
/*   */     return this.L7.Vb();
/*   */   }
/*   */   
/*   */   public final int Ro0() {
/*   */     return this.L7.wu0();
/*   */   }
/*   */   
/*   */   public final pRN Ag0() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pRN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */