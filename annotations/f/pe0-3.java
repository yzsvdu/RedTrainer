/* 1 */ package f;public class pe0 { public final void vh(pe0 parampe0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.G3 = parampe0.G3;
/* 2 */     Y9(parampe0.jg() + paramInt1, Math.round(parampe0.WT * parampe0.G3.getHeight()) + paramInt2, paramInt3, paramInt4); }
/*   */ 
/*   */   
/*   */   public Texture G3;
/*   */   public float mP;
/*   */   public float WT;
/*   */   public float zV;
/*   */   public float bh0;
/*   */   public int H0;
/*   */   public int Vn0;
/*   */   
/*   */   public pe0() {}
/*   */   
/*   */   public pe0(Texture paramTexture) {
/*   */     if (paramTexture != null) {
/*   */       this.G3 = paramTexture;
/*   */       int i = paramTexture.getWidth();
/*   */       int j = paramTexture.getHeight();
/*   */       Y9(0, 0, i, j);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("texture cannot be null.");
/*   */   }
/*   */   
/*   */   public pe0(Texture paramTexture, int paramInt1, int paramInt2) {
/*   */     this.G3 = paramTexture;
/*   */     Y9(0, 0, paramInt1, paramInt2);
/*   */   }
/*   */   
/*   */   public pe0(Texture paramTexture, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.G3 = paramTexture;
/*   */     Y9(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */   }
/*   */   
/*   */   public pe0(Texture paramTexture, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.G3 = paramTexture;
/*   */     Nj0(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */   }
/*   */   
/*   */   public pe0(pe0 parampe0) {
/*   */     rz0(parampe0);
/*   */   }
/*   */   
/*   */   public pe0(pe0 parampe0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     vh(parampe0, paramInt1, paramInt2, paramInt3, paramInt4);
/*   */   }
/*   */   
/*   */   public final void Y9(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     float f1 = 1.0F / this.G3.getWidth();
/*   */     float f2 = 1.0F / this.G3.getHeight();
/*   */     float f3 = paramInt1 * f1;
/*   */     float f4 = paramInt2 * f2;
/*   */     f1 = (paramInt1 + paramInt3) * f1;
/*   */     f2 = (paramInt2 + paramInt4) * f2;
/*   */     Nj0(f3, f4, f1, f2);
/*   */     this.H0 = Math.abs(paramInt3);
/*   */     this.Vn0 = Math.abs(paramInt4);
/*   */   }
/*   */   
/*   */   public void Nj0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     int i = this.G3.getWidth();
/*   */     int j = this.G3.getHeight();
/*   */     float f1;
/*   */     this.H0 = Math.round(Math.abs(paramFloat3 - paramFloat1) * (f1 = i));
/*   */     float f2;
/*   */     int k = Math.round(Math.abs(paramFloat4 - paramFloat2) * (f2 = j));
/*   */     if (this.H0 == 1 && k == 1) {
/*   */       paramFloat2 = paramFloat1 + (paramFloat1 = 0.25F / f1);
/*   */       paramFloat3 -= paramFloat1;
/*   */       paramFloat4 = paramFloat2 + (paramFloat1 = 0.25F / f2);
/*   */       paramFloat1 = paramFloat4 - paramFloat1;
/*   */       paramFloat4 = paramFloat1;
/*   */       paramFloat2 = paramFloat4;
/*   */       paramFloat1 = paramFloat2;
/*   */     } 
/*   */     this.mP = paramFloat1;
/*   */     this.WT = paramFloat2;
/*   */     this.zV = paramFloat3;
/*   */     this.bh0 = paramFloat4;
/*   */   }
/*   */   
/*   */   public final void rz0(pe0 parampe0) {
/*   */     this.G3 = parampe0.G3;
/*   */     float f1 = parampe0.mP;
/*   */     float f2 = parampe0.WT;
/*   */     float f3 = parampe0.zV;
/*   */     float f4 = parampe0.bh0;
/*   */     Nj0(f1, f2, f3, f4);
/*   */   }
/*   */   
/*   */   public final Texture rP() {
/*   */     return this.G3;
/*   */   }
/*   */   
/*   */   public final int jg() {
/*   */     return Math.round(this.mP * this.G3.getWidth());
/*   */   }
/*   */   
/*   */   public final int hW() {
/*   */     return this.H0;
/*   */   }
/*   */   
/*   */   public final int qY() {
/*   */     return this.Vn0;
/*   */   }
/*   */   
/*   */   public void zt0(boolean paramBoolean1, boolean paramBoolean2) {
/*   */     if (paramBoolean1) {
/*   */       float f = this.mP;
/*   */       this.mP = this.zV;
/*   */       this.zV = f;
/*   */     } 
/*   */     if (paramBoolean2) {
/*   */       float f = this.WT;
/*   */       this.WT = this.bh0;
/*   */       this.bh0 = f;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pe0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */