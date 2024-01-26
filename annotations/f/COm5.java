/* 1 */ package f;public final class COm5 extends Ui0 { public final void zt0(boolean paramBoolean1, boolean paramBoolean2) { float f10; if (this.Hj0.Kf0) { super.zt0(paramBoolean2, paramBoolean1); } else { super.zt0(paramBoolean1, paramBoolean2); }  float f3 = fd0(), f4 = final(), f6 = p702.rd, f7 = p702.jh0, f8 = this.z30; P70 p702; boolean bool;
/* 2 */     if (bool = (p702 = this.Hj0).Kf0)
/* 3 */     { f10 = p702.OD; } else { f10 = p702.ZF0; }  f8 /= f10;
/* 4 */     float f9 = this.a40; if (bool)
/* 5 */     { f10 = p702.ZF0; } else { f10 = p702.OD; }  float f2 = f9 / f10; p702
/* 6 */       .rd = this.Ou0; p702.jh0 = this.protected; p702.zt0(paramBoolean1, paramBoolean2); this.Ou0 = f3 = p701.rd; this.protected = f5; float f1 = f3 * f8; p701.jh0 = f2; f1 -= f6; P70 p701; float f5; SK0(f1, (f2 = (f5 = (p701 = this.Hj0).jh0) * f2) - f7); qi(f3, f4); }
/*   */ 
/*   */   
/*   */   public final P70 Hj0;
/*   */   public float Ou0;
/*   */   public float protected;
/*   */   
/*   */   public COm5(P70 paramP70) {
/*   */     float f1;
/*   */     float f2;
/*   */     float f3;
/*   */     this.Hj0 = new P70(paramP70);
/*   */     this.Ou0 = paramP70.rd;
/*   */     this.protected = paramP70.jh0;
/*   */     rz0(paramP70);
/*   */     qi(paramP70.H3 / 2.0F, paramP70.gp0 / 2.0F);
/*   */     int i = paramP70.hW();
/*   */     int j = paramP70.qY();
/*   */     if (paramP70.Kf0) {
/*   */       Xq();
/*   */       f1 = paramP70.rd;
/*   */       f2 = paramP70.jh0;
/*   */       f3 = j;
/*   */       float f = i;
/*   */       super.t50(f1, f2, f3, f);
/*   */     } else {
/*   */       f1 = f1.rd;
/*   */       f2 = f1.jh0;
/*   */       f3 = f2;
/*   */       float f = f3;
/*   */       super.t50(f1, f2, f3, f);
/*   */     } 
/*   */     fn0(1.0F, 1.0F, 1.0F);
/*   */   }
/*   */   
/*   */   public COm5(COm5 paramCOm5) {
/*   */     this.Hj0 = paramCOm5.Hj0;
/*   */     this.Ou0 = paramCOm5.Ou0;
/*   */     this.protected = paramCOm5.protected;
/*   */     bw(paramCOm5);
/*   */   }
/*   */   
/*   */   public final void Hc0(float paramFloat1, float paramFloat2) {
/*   */     P70 p70;
/*   */     paramFloat1 += (p70 = this.Hj0).rd;
/*   */     super.Hc0(paramFloat1, paramFloat2 + this.jh0);
/*   */   }
/*   */   
/*   */   public final void aR(float paramFloat) {
/*   */     super.aR(paramFloat + this.Hj0.rd);
/*   */   }
/*   */   
/*   */   public final void Zq0(float paramFloat) {
/*   */     super.Zq0(paramFloat + this.Hj0.jh0);
/*   */   }
/*   */   
/*   */   public final void t50(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     int i;
/*   */     int j;
/*   */     paramFloat3 /= p70.H3;
/*   */     paramFloat4 /= p70.gp0;
/*   */     float f2 = this.Ou0 * paramFloat3;
/*   */     P70 p70;
/*   */     float f3 = this.protected * paramFloat4;
/*   */     boolean bool;
/*   */     if (bool = this.Hj0.Kf0) {
/*   */       j = p70.OD;
/*   */     } else {
/*   */       j = p70.ZF0;
/*   */     } 
/*   */     if (bool) {
/*   */       i = p70.ZF0;
/*   */     } else {
/*   */       i = i.OD;
/*   */     } 
/*   */     float f1 = paramFloat1 + f2;
/*   */     paramFloat1 = paramFloat2 + f3;
/*   */     f1 = j * paramFloat3;
/*   */     paramFloat2 = i * paramFloat4;
/*   */     super.t50(f1, paramFloat1, f1, paramFloat2);
/*   */   }
/*   */   
/*   */   public final void Kf(float paramFloat1, float paramFloat2) {
/*   */     float f = Vw();
/*   */     t50(f, UT(), paramFloat1, paramFloat2);
/*   */   }
/*   */   
/*   */   public final void qi(float paramFloat1, float paramFloat2) {
/*   */     P70 p70;
/*   */     paramFloat1 -= (p70 = this.Hj0).rd;
/*   */     super.qi(paramFloat1, paramFloat2 - this.jh0);
/*   */   }
/*   */   
/*   */   public final float Vw() {
/*   */     return this.zZ - this.Hj0.rd;
/*   */   }
/*   */   
/*   */   public final float UT() {
/*   */     return this.oD - this.Hj0.jh0;
/*   */   }
/*   */   
/*   */   public final float fd0() {
/*   */     return this.Uy0 + this.Hj0.rd;
/*   */   }
/*   */   
/*   */   public final float final() {
/*   */     return this.W50 + this.Hj0.jh0;
/*   */   }
/*   */   
/*   */   public final float i2() {
/*   */     float f2, f1 = this.z30;
/*   */     P70 p70;
/*   */     if ((p70 = this.Hj0).Kf0) {
/*   */       f2 = p70.OD;
/*   */     } else {
/*   */       f2 = p70.ZF0;
/*   */     } 
/*   */     return f1 / f2 * p70.H3;
/*   */   }
/*   */   
/*   */   public final float Lv0() {
/*   */     float f2, f1 = this.a40;
/*   */     P70 p70;
/*   */     if ((p70 = this.Hj0).Kf0) {
/*   */       f2 = p70.ZF0;
/*   */     } else {
/*   */       f2 = p70.OD;
/*   */     } 
/*   */     return f1 / f2 * p70.gp0;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.Hj0.Pk;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COm5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */