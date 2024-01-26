/* 1 */ package f;public final class dh implements ob { public Ou0[] COm1; public fQ z00; public int Ro0; public boolean yQ; public static Ou0 dt0(Ou0 paramOu01, int paramInt1, float paramFloat, Ou0[] paramArrayOfOu0, int paramInt2, boolean paramBoolean, Ou0 paramOu02) { if (paramInt2 == 3) { paramInt2 = paramArrayOfOu0.length; float f1 = 1.0F - paramFloat; float f2, f3 = (f2 = paramFloat * paramFloat) * paramFloat; paramOu01.hH(paramArrayOfOu0[paramInt1]).cm0((f3 * 3.0F - f2 * 6.0F + 4.0F) * 0.16666667F); if (paramBoolean || paramInt1 > 0) paramOu01.WX(paramOu02.hH(paramArrayOfOu0[(paramInt2 + paramInt1 - 1) % paramInt2]).cm0(f1 * f1 * f1 * 0.16666667F));  if (paramBoolean || paramInt1 < paramInt2 - 1) { paramFloat = f3 * -3.0F; paramFloat = f2 * 3.0F + paramFloat; paramOu01.WX(paramOu02.hH(paramArrayOfOu0[(paramInt1 + 1) % paramInt2]).cm0((paramFloat * 3.0F + paramFloat + 1.0F) * 0.16666667F)); }  if (paramBoolean || paramInt1 < paramInt2 - 2) paramOu01.WX(paramOu02.hH(paramArrayOfOu0[(paramInt1 + 2) % paramInt2]).cm0(f3 * 0.16666667F));  return paramOu01; }
/* 2 */      throw new IllegalArgumentException(); } public int hq0; public Ou0 ku; public Ou0 ze; public Ou0 df; public final Ou0 Il(float paramFloat, eo parameo) { int i; float f = paramFloat * (i = this.hq0); if (paramFloat >= 1.0F) { i--; } else { i = (int)f; }  f -= i; boolean bool; if (!(bool = this.yQ)) i += (int)(this.Ro0 * 0.5F);  Ou0[] arrayOfOu0 = this.COm1; i = this.Ro0; Ou0 ou0 = this.ku; return dt0(parameo, i, f, this, i, bool, ou0); }
/*   */ 
/*   */   
/*   */   public dh() {}
/*   */   
/*   */   public dh(Ou0[] paramArrayOfOu0, int paramInt, boolean paramBoolean) {
/*   */     xl(paramArrayOfOu0, paramInt, paramBoolean);
/*   */   }
/*   */   
/*   */   public final void xl(Ou0[] paramArrayOfOu0, int paramInt, boolean paramBoolean) {
/*   */     if (this.ku == null)
/*   */       this.ku = paramArrayOfOu0[0].b3(); 
/*   */     if (this.ze == null)
/*   */       this.ze = paramArrayOfOu0[0].b3(); 
/*   */     if (this.df == null)
/*   */       this.df = paramArrayOfOu0[0].b3(); 
/*   */     this.COm1 = paramArrayOfOu0;
/*   */     this.Ro0 = paramInt;
/*   */     this.yQ = paramBoolean;
/*   */     if (paramBoolean) {
/*   */       i = paramArrayOfOu0.length;
/*   */     } else {
/*   */       i = paramArrayOfOu0.length - paramInt;
/*   */     } 
/*   */     this.hq0 = i;
/*   */     fQ fQ1;
/*   */     if ((fQ1 = this.z00) == null) {
/*   */       this(i);
/*   */       this.z00 = fQ1;
/*   */     } else {
/*   */       fQ1.clear();
/*   */       this.z00.ZY(this.hq0);
/*   */     } 
/*   */     for (int i = 0; i < this.hq0; i++) {
/*   */       int j;
/*   */       fQ1 = this.z00;
/*   */       Ou0 ou02 = paramArrayOfOu0[0].b3();
/*   */       if (paramBoolean) {
/*   */         j = i;
/*   */       } else {
/*   */         float f = i;
/*   */         j = (int)(paramInt * 0.5F + f);
/*   */       } 
/*   */       Ou0 ou01 = this.ku;
/*   */       fQ1.Com3(dt0(ou02, j, 0.0F, paramArrayOfOu0, paramInt, paramBoolean, ou01));
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dh.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */