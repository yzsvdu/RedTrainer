/*  1 */ package f;public final class FG extends c3 { public final void JD(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { float f1 = paramJX.lPt6; paramJX
/*    */       
/*  3 */       .HK0(paramJX.Bm.mul(this.U5));
/*    */     
/*    */     pe0 pe0;
/*  6 */     float f2, f3 = (pe0 = this.E00).H0 * (f2 = this.a3); int i, j; float f4, f5; byte b; float f6, f7;
/*  7 */     for (i = (int)(paramFloat3 / f3), j = (int)(paramFloat4 / f2), f4 = paramFloat3 - f3 * i, f5 = paramFloat4 - (f2 = this.E00.Vn0 * f2) * j, b = 0, f7 = paramFloat2, f6 = paramFloat1; b < i; ) { float f11; for (byte b1 = 0; b1 < j; ) { paramJX
/*  8 */           .Yo0(pe0, f6, f11, f3, f2); f11 += f2; b1++; }  f6 += f3; b++; float f10 = f11; }
/*  9 */      Texture texture = pe0.G3;
/* 10 */     float f8 = pe0.mP;
/* 11 */     float f9 = pe0.bh0; if (f4 > 0.0F)
/* 12 */     { f7 = f4 / texture.getWidth() * this.a3 + f8; float f; byte b1;
/* 13 */       for (f = pe0.WT, b1 = 0; b1 < j; ) { paramJX
/* 14 */           .WE0(texture, f6, paramFloat2, f4, f2, f8, f9, f7, f); paramFloat2 += f2; b1++; }  if (f5 > 0.0F) { float f10 = f9 - f5 / texture.getHeight() * this.a3; paramJX.WE0(texture, f6, paramFloat2, f4, f5, f8, f9, f7, f10); }  f7 = paramFloat2; }  if (f5 > 0.0F)
/* 15 */     { paramFloat2 = pe0.zV;
/* 16 */       for (float f = f9 - f5 / texture.getHeight() * this.a3; j < i; ) { paramJX.WE0(texture, paramFloat1, f7, f3, f5, f8, f9, paramFloat2, f); paramFloat1 += f3; j++; }  }  paramJX.og0(f1); }
/*    */ 
/*    */   
/*    */   public final Color U5;
/*    */   public float a3;
/*    */   
/*    */   public FG() {
/*    */     Color color;
/*    */     this(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     this.U5 = this;
/*    */     this.a3 = 1.0F;
/*    */   }
/*    */   
/*    */   public FG(pe0 parampe0) {
/*    */     super(parampe0);
/*    */     Color color;
/*    */     this(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     this.U5 = this;
/*    */     this.a3 = 1.0F;
/*    */   }
/*    */   
/*    */   public FG(c3 paramc3) {
/*    */     super(paramc3);
/*    */     Color color;
/*    */     this(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     this.U5 = this;
/*    */     this.a3 = 1.0F;
/*    */   }
/*    */   
/*    */   public final void MF(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public final ES rG(Color paramColor) {
/*    */     this(this);
/*    */     fG.U5.set(paramColor);
/*    */     fG.e = this.e;
/*    */     fG.jM = this.jM;
/*    */     fG.Ji = this.Ji;
/*    */     FG fG;
/*    */     (fG = new FG()).Xm0 = this.Xm0;
/*    */     return new FG();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FG.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */