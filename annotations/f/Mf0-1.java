/* 1 */ package f;public class Mf0 extends Ur0 { public void cOM2(int paramInt1, int paramInt2) { boolean bool = true; float f1 = this.jw0, f2 = this.TH, f3 = paramInt1, f4 = paramInt2; int j = Math.round(nC0.y); NC0 nC0; int k; if ((k = Math.round((nC0 = this.NC.lPt6(f1, f2, f3, f4)).x)) < paramInt1) { float f5 = j / f2, f6 = f2 / j; f6 = (paramInt1 - k) * f6; float f7; if ((f7 = this.gc) > 0.0F) f6 = Math.min(f6, f7 - this.jw0);  f1 += f6; k = Math.round(f6 * f5) + k; }  if (j < paramInt2) { float f5 = k / f1, f6 = f1 / k; f6 = (paramInt2 - j) * f6; float f7; if ((f7 = this.fp) > 0.0F) f6 = Math.min(f6, f7 - this.TH);  f2 += f6; j = Math.round(f6 * f5) + j; }  this.w00 = f1; this.ow = f2;
/* 2 */     int i = (paramInt1 - k) / 2; yU(i, (paramInt2 - j) / 2, k, j); wO(bool); }
/*   */ 
/*   */   
/*   */   public float jw0;
/*   */   public float TH;
/*   */   public float gc;
/*   */   public float fp;
/*   */   public uv0 NC = QJ0.qf;
/*   */   
/*   */   public Mf0(float paramFloat1, float paramFloat2) {
/*   */     this();
/*   */     Tm tm;
/*   */     this(paramFloat1, paramFloat2, 0.0F, 0.0F, this);
/*   */   }
/*   */   
/*   */   public Mf0(float paramFloat1, float paramFloat2, ny paramny) {
/*   */     this(paramFloat1, paramFloat2, 0.0F, 0.0F, paramny);
/*   */   }
/*   */   
/*   */   public Mf0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this();
/*   */     Tm tm;
/*   */     this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this);
/*   */   }
/*   */   
/*   */   public Mf0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, ny paramny) {
/*   */     this.jw0 = paramFloat1;
/*   */     this.TH = paramFloat2;
/*   */     this.gc = paramFloat3;
/*   */     this.fp = paramFloat4;
/*   */     a20(paramny);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mf0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */