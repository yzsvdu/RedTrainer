/* 1 */ package f;public class Ui0 extends pe0 { public final void Ne(JX paramJX) { Texture texture = this.G3; if (this.eL) { this.eL = false; float arrayOfFloat[] = this.KJ, f1 = -this.Uy0, f3 = f1 + this.z30; float f2, f4 = (f2 = -this.W50) + this.a40, f5 = this.zZ - f1, f6 = this.oD - f2; float f7; if ((f7 = this.c30) != 1.0F || this.ch0 != 1.0F) { f1 *= f7; f3 = f2 * (f2 = this.ch0); f4 = f3 * f7; f2 = f4 * f2; f2 = f3; f3 = f4; f4 = f2; }  if ((f7 = this.FM) != 0.0F) { f2 = nx0.nH(this.FM); f3 = f1 * (f1 = nx0.Tu0(f7)); f7 = f1 * f2; float f8 = f2 * f1, f9 = f2 * f2, f10 = f3 * f1, f11 = f3 * f2; f1 = f4 * f2; f2 = f3 - f9 + f5; f3 = f8 + f7 + f6; arrayOfFloat[0] = f2; arrayOfFloat[1] = f3; f4 = f3 - f1 + f5; f7 = f1 + f7 + f6; arrayOfFloat[5] = f4; arrayOfFloat[6] = f7; f1 = f10 - f1 + f5; arrayOfFloat[10] = f1; arrayOfFloat[11] = f5; arrayOfFloat[15] = f1 - f4 + f2; arrayOfFloat[16] = (f5 = (f1 = f4 * f1) + f11 + f6) - f7 - f3; } else { float f = f1 + f5; f1 = f2 + f6; f2 = f3 + f5; f3 = f4 + f6; arrayOfFloat[0] = f; arrayOfFloat[1] = f1; arrayOfFloat[5] = f; arrayOfFloat[6] = f3; arrayOfFloat[10] = f2; arrayOfFloat[11] = f3; arrayOfFloat[15] = f2; arrayOfFloat[16] = f1; }  }  paramJX
/* 2 */       .xu(texture, this.KJ, 20); }
/*   */ 
/*   */   
/*   */   public final float[] KJ = new float[20];
/*   */   public final Color Kd0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
/*   */   public float zZ;
/*   */   public float oD;
/*   */   public float z30;
/*   */   public float a40;
/*   */   public float Uy0;
/*   */   public float W50;
/*   */   public float FM;
/*   */   public float c30 = 1.0F;
/*   */   public float ch0 = 1.0F;
/*   */   public boolean eL = true;
/*   */   
/*   */   public Ui0() {
/*   */     fn0(1.0F, 1.0F, 1.0F);
/*   */   }
/*   */   
/*   */   public Ui0(Texture paramTexture) {
/*   */     this(paramTexture, 0, 0, i, j);
/*   */   }
/*   */   
/*   */   public Ui0(Texture paramTexture, int paramInt1, int paramInt2) {
/*   */     this(paramTexture, 0, 0, paramInt1, paramInt2);
/*   */   }
/*   */   
/*   */   public Ui0(Texture paramTexture, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     if (paramTexture != null) {
/*   */       this.G3 = paramTexture;
/*   */       Y9(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */       fn0(1.0F, 1.0F, 1.0F);
/*   */       Kf(Math.abs(paramInt3), Math.abs(paramInt4));
/*   */       qi(this.z30 / 2.0F, this.a40 / 2.0F);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("texture cannot be null.");
/*   */   }
/*   */   
/*   */   public Ui0(pe0 parampe0) {
/*   */     rz0(parampe0);
/*   */     fn0(1.0F, 1.0F, 1.0F);
/*   */     Kf(parampe0.hW(), parampe0.qY());
/*   */     qi(this.z30 / 2.0F, this.a40 / 2.0F);
/*   */   }
/*   */   
/*   */   public Ui0(pe0 parampe0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     vh(parampe0, paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     fn0(1.0F, 1.0F, 1.0F);
/*   */     Kf(Math.abs(paramInt3), Math.abs(paramInt4));
/*   */     qi(this.z30 / 2.0F, this.a40 / 2.0F);
/*   */   }
/*   */   
/*   */   public Ui0(Ui0 paramUi0) {
/*   */     bw(paramUi0);
/*   */   }
/*   */   
/*   */   public final void bw(Ui0 paramUi0) {
/*   */     if (paramUi0 != null) {
/*   */       System.arraycopy(paramUi0.KJ, 0, this.KJ, 0, 20);
/*   */       this.G3 = paramUi0.G3;
/*   */       this.mP = paramUi0.mP;
/*   */       this.WT = paramUi0.WT;
/*   */       this.zV = paramUi0.zV;
/*   */       this.bh0 = paramUi0.bh0;
/*   */       this.zZ = paramUi0.zZ;
/*   */       this.oD = paramUi0.oD;
/*   */       this.z30 = paramUi0.z30;
/*   */       this.a40 = paramUi0.a40;
/*   */       this.H0 = paramUi0.H0;
/*   */       this.Vn0 = paramUi0.Vn0;
/*   */       this.Uy0 = paramUi0.Uy0;
/*   */       this.W50 = paramUi0.W50;
/*   */       this.FM = paramUi0.FM;
/*   */       this.c30 = paramUi0.c30;
/*   */       this.ch0 = paramUi0.ch0;
/*   */       this.Kd0.set(paramUi0.Kd0);
/*   */       this.eL = paramUi0.eL;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("sprite cannot be null.");
/*   */   }
/*   */   
/*   */   public void t50(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.zZ = paramFloat1;
/*   */     this.oD = paramFloat2;
/*   */     this.z30 = paramFloat3;
/*   */     this.a40 = paramFloat4;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     float f = paramFloat1 + paramFloat3;
/*   */     paramFloat3 = paramFloat2 + paramFloat4;
/*   */     this.KJ[0] = paramFloat1;
/*   */     this.KJ[1] = paramFloat2;
/*   */     this.KJ[5] = paramFloat1;
/*   */     this.KJ[6] = paramFloat3;
/*   */     this.KJ[10] = f;
/*   */     this.KJ[11] = paramFloat3;
/*   */     this.KJ[15] = f;
/*   */     this.KJ[16] = paramFloat2;
/*   */   }
/*   */   
/*   */   public void Kf(float paramFloat1, float paramFloat2) {
/*   */     this.z30 = paramFloat1;
/*   */     this.a40 = paramFloat2;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     float f1;
/*   */     paramFloat1 = (f1 = this.zZ) + paramFloat1;
/*   */     float f2;
/*   */     paramFloat2 = (f2 = this.oD) + paramFloat2;
/*   */     this.KJ[0] = f1;
/*   */     this.KJ[1] = f2;
/*   */     this.KJ[5] = f1;
/*   */     this.KJ[6] = paramFloat2;
/*   */     this.KJ[10] = paramFloat1;
/*   */     this.KJ[11] = paramFloat2;
/*   */     this.KJ[15] = paramFloat1;
/*   */     this.KJ[16] = f2;
/*   */   }
/*   */   
/*   */   public void Hc0(float paramFloat1, float paramFloat2) {
/*   */     this.zZ = paramFloat1;
/*   */     this.oD = paramFloat2;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     float f1 = paramFloat1 + this.z30;
/*   */     float f2 = paramFloat2 + this.a40;
/*   */     this.KJ[0] = paramFloat1;
/*   */     this.KJ[1] = paramFloat2;
/*   */     this.KJ[5] = paramFloat1;
/*   */     this.KJ[6] = f2;
/*   */     this.KJ[10] = f1;
/*   */     this.KJ[11] = f2;
/*   */     this.KJ[15] = f1;
/*   */     this.KJ[16] = paramFloat2;
/*   */   }
/*   */   
/*   */   public void aR(float paramFloat) {
/*   */     this.zZ = paramFloat;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     float f = paramFloat + this.z30;
/*   */     this.KJ[0] = paramFloat;
/*   */     this.KJ[5] = paramFloat;
/*   */     this.KJ[10] = f;
/*   */     this.KJ[15] = f;
/*   */   }
/*   */   
/*   */   public void Zq0(float paramFloat) {
/*   */     this.oD = paramFloat;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     float f = paramFloat + this.a40;
/*   */     this.KJ[1] = paramFloat;
/*   */     this.KJ[6] = f;
/*   */     this.KJ[11] = f;
/*   */     this.KJ[16] = paramFloat;
/*   */   }
/*   */   
/*   */   public final void SK0(float paramFloat1, float paramFloat2) {
/*   */     this.zZ += paramFloat1;
/*   */     this.oD += paramFloat2;
/*   */     if (this.eL)
/*   */       return; 
/*   */     if (this.FM != 0.0F || this.c30 != 1.0F || this.ch0 != 1.0F) {
/*   */       this.eL = true;
/*   */       return;
/*   */     } 
/*   */     this.KJ[0] = this.KJ[0] + paramFloat1;
/*   */     this.KJ[1] = this.KJ[1] + paramFloat2;
/*   */     this.KJ[5] = this.KJ[5] + paramFloat1;
/*   */     this.KJ[6] = this.KJ[6] + paramFloat2;
/*   */     this.KJ[10] = this.KJ[10] + paramFloat1;
/*   */     this.KJ[11] = this.KJ[11] + paramFloat2;
/*   */     this.KJ[15] = this.KJ[15] + paramFloat1;
/*   */     this.KJ[16] = this.KJ[16] + paramFloat2;
/*   */   }
/*   */   
/*   */   public final void vr(Color paramColor) {
/*   */     this.Kd0.set(paramColor);
/*   */     float f = paramColor.toFloatBits();
/*   */     this.KJ[2] = f;
/*   */     this.KJ[7] = f;
/*   */     this.KJ[12] = f;
/*   */     this.KJ[17] = f;
/*   */   }
/*   */   
/*   */   public final void t(float paramFloat) {
/*   */     this.Kd0.a = paramFloat;
/*   */     float f = this.Kd0.toFloatBits();
/*   */     this.KJ[2] = f;
/*   */     this.KJ[7] = f;
/*   */     this.KJ[12] = f;
/*   */     this.KJ[17] = f;
/*   */   }
/*   */   
/*   */   public void qi(float paramFloat1, float paramFloat2) {
/*   */     this.Uy0 = paramFloat1;
/*   */     this.W50 = paramFloat2;
/*   */     this.eL = true;
/*   */   }
/*   */   
/*   */   public final void yc(float paramFloat) {
/*   */     this.FM = paramFloat;
/*   */     this.eL = true;
/*   */   }
/*   */   
/*   */   public final void Zk(float paramFloat) {
/*   */     this.c30 = paramFloat;
/*   */     this.ch0 = paramFloat;
/*   */     this.eL = true;
/*   */   }
/*   */   
/*   */   public float Vw() {
/*   */     return this.zZ;
/*   */   }
/*   */   
/*   */   public float UT() {
/*   */     return this.oD;
/*   */   }
/*   */   
/*   */   public float i2() {
/*   */     return this.z30;
/*   */   }
/*   */   
/*   */   public float Lv0() {
/*   */     return this.a40;
/*   */   }
/*   */   
/*   */   public float fd0() {
/*   */     return this.Uy0;
/*   */   }
/*   */   
/*   */   public float final() {
/*   */     return this.W50;
/*   */   }
/*   */   
/*   */   public final void Nj0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     super.Nj0(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */     this.KJ[3] = paramFloat1;
/*   */     this.KJ[4] = paramFloat4;
/*   */     this.KJ[8] = paramFloat1;
/*   */     this.KJ[9] = paramFloat2;
/*   */     this.KJ[13] = paramFloat3;
/*   */     this.KJ[14] = paramFloat2;
/*   */     this.KJ[18] = paramFloat3;
/*   */     this.KJ[19] = paramFloat4;
/*   */   }
/*   */   
/*   */   public void zt0(boolean paramBoolean1, boolean paramBoolean2) {
/*   */     super.zt0(paramBoolean1, paramBoolean2);
/*   */     float[] arrayOfFloat = this.KJ;
/*   */     if (paramBoolean1) {
/*   */       float f = this[3];
/*   */       this[3] = this[13];
/*   */       this[13] = f;
/*   */       f = this[8];
/*   */       this[8] = this[18];
/*   */       this[18] = f;
/*   */     } 
/*   */     if (paramBoolean2) {
/*   */       float f = this[4];
/*   */       this[4] = this[14];
/*   */       this[14] = f;
/*   */       f = this[9];
/*   */       this[9] = this[19];
/*   */       this[19] = f;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void fn0(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     this.Kd0.set(paramFloat1, paramFloat2, paramFloat3, 1.0F);
/*   */     float f = this.Kd0.toFloatBits();
/*   */     this.KJ[2] = f;
/*   */     this.KJ[7] = f;
/*   */     this.KJ[12] = f;
/*   */     this.KJ[17] = f;
/*   */   }
/*   */   
/*   */   public void Xq() {
/*   */     float f = this.KJ[4];
/*   */     this.KJ[4] = this.KJ[19];
/*   */     this.KJ[19] = this.KJ[14];
/*   */     this.KJ[14] = this.KJ[9];
/*   */     this.KJ[9] = f;
/*   */     f = this.KJ[3];
/*   */     this.KJ[3] = this.KJ[18];
/*   */     this.KJ[18] = this.KJ[13];
/*   */     this.KJ[13] = this.KJ[8];
/*   */     this.KJ[8] = f;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ui0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */