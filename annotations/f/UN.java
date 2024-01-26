/* 1 */ package f;public final class UN { public final void kJ(NC0 paramNC0, float paramFloat) { float f1 = this.rq; float f2; f1 = (f2 = paramNC0.x) * this.eY + f1; float f3 = this.Lm; float f4; f3 = (f4 = paramNC0.y) * this.ue0 + f3; float f5 = this.f8; f2 = this.NU * f2 + f5; f5 = this.tC; f4 = this.sx0 * f4 + f5; int i = this.JS + 1; arrayOfFloat[this.JS] = f1; arrayOfFloat[i++] = f3; arrayOfFloat[i++] = paramFloat; arrayOfFloat[i] = f2; int j; this.JS = (j = i + 1) + 1; float[] arrayOfFloat; (arrayOfFloat = this.cG)[j] = f4; }
/*   */ 
/*   */   
/*   */   public static final NC0[] ub;
/*   */   public pe0 XF0;
/*   */   public float[] cG = new float[80];
/*   */   public int JS = 0;
/*   */   public NC0 Xr0;
/*   */   public NC0 uj;
/*   */   public int rq = 0;
/*   */   public int Lm = 0;
/*   */   public int eY = 75;
/*   */   public int ue0 = 75;
/*   */   public float f8;
/*   */   public float tC;
/*   */   public float NU;
/*   */   public float sx0;
/*   */   public float com8;
/*   */   public float zE;
/*   */   public boolean wJ0 = false;
/*   */   public Color M6 = Color.WHITE.cpy();
/*   */   
/*   */   public UN() {
/*   */     bK();
/*   */   }
/*   */   
/*   */   static {
/*   */     this(0.5F, 1.0F);
/*   */     NC0 nC0;
/*   */     (new NC0[9])[0] = nC0;
/*   */     this(1.0F, 1.0F);
/*   */     (new NC0[9])[1] = nC0;
/*   */     this(1.0F, 0.5F);
/*   */     (new NC0[9])[2] = nC0;
/*   */     this(1.0F, 0.0F);
/*   */     (new NC0[9])[3] = nC0;
/*   */     this(0.5F, 0.0F);
/*   */     (new NC0[9])[4] = nC0;
/*   */     this(0.0F, 0.0F);
/*   */     (new NC0[9])[5] = nC0;
/*   */     this(0.0F, 0.5F);
/*   */     (new NC0[9])[6] = nC0;
/*   */     this(0.0F, 1.0F);
/*   */     (new NC0[9])[7] = nC0;
/*   */     this(0.5F, 1.0F);
/*   */     ub = new NC0[] { null, null, null, null, null, null, null, null, nC0 };
/*   */   }
/*   */   
/*   */   public final void bK() {
/*   */     this.JS = 0;
/*   */     float f1 = 90.0F;
/*   */     this.wJ0 = true;
/*   */     float f2;
/*   */     if ((f2 = this.zE) >= 1.0F)
/*   */       f2 = 0.99999F; 
/*   */     this.com8 = f1 - f2 * 360.0F % 360.0F;
/*   */     this.uj = new NC0(nx0.Tu0(this.com8) + 0.5F, nx0.nH(this.com8) + 0.5F);
/*   */     boolean bool = false;
/*   */     if (this.wJ0) {
/*   */       byte b = 0;
/*   */       NC0[] arrayOfNC0;
/*   */       while (!bool && b < (arrayOfNC0 = ub).length) {
/*   */         int i = b + 1;
/*   */         NC0 nC02 = arrayOfNC0[b];
/*   */         int k = i + 1;
/*   */         NC0 nC01 = arrayOfNC0[i];
/*   */         NC0 nC03 = arrayOfNC0[k];
/*   */         NC0 nC04 = this.uj;
/*   */         bool = wV(nC02, nC01, nC03, nC04);
/*   */         int j = k;
/*   */       } 
/*   */     } else {
/*   */       byte b = 8;
/*   */       while (!bool && b > 0) {
/*   */         int i = b + -1;
/*   */         NC0 nC02 = ub[b];
/*   */         int k = i + -1;
/*   */         NC0 nC01 = ub[i];
/*   */         NC0 nC03 = ub[k];
/*   */         NC0 nC04 = this.uj;
/*   */         boolean bool1 = wV(nC02, nC01, nC03, nC04);
/*   */         int j = k;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean wV(NC0 paramNC01, NC0 paramNC02, NC0 paramNC03, NC0 paramNC04) {
/*   */     this();
/*   */     NC0 nC0;
/*   */     this.Xr0 = new NC0(0.5F, 0.5F);
/*   */     float f = this.M6.toFloatBits();
/*   */     kJ(this.Xr0, f);
/*   */     kJ(paramNC01, f);
/*   */     if (Y4.xB(this.Xr0, paramNC04, paramNC01, paramNC02, nC0)) {
/*   */       kJ(nC0, f);
/*   */       kJ(nC0, f);
/*   */     } else {
/*   */       if (Y4.xB(this.Xr0, paramNC04, paramNC02, paramNC03, nC0)) {
/*   */         kJ(paramNC02, f);
/*   */         kJ(nC0, f);
/*   */         return true;
/*   */       } 
/*   */       kJ(paramNC02, f);
/*   */       kJ(paramNC03, f);
/*   */       return false;
/*   */     } 
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */