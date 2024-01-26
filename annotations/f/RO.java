/*   */ package f;public final class RO extends uB implements Nv0 { public Ui0 LH0; public RO() {} public final void JD(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { Color color;
/* 2 */     float f2 = (color = this.LH0.Kd0).toFloatBits(); this.LH0
/*   */       
/* 4 */       .vr(mul(paramJX.Bm)); this.LH0.yc(0.0F); float f1 = 1.0F; this
/* 5 */       .c30 = 1.0F;
/* 6 */     this.ch0 = f1; this.eL = true; Ui0 ui0;
/* 7 */     (ui0 = this.LH0).t50(paramFloat1, paramFloat2, paramFloat3, paramFloat4); this.LH0.Ne(paramJX);
/*   */     
/* 9 */     Color.abgr8888ToColor(this.LH0.Kd0, f2); this.LH0.KJ[2] = f2; this.LH0.KJ[7] = f2; this.LH0.KJ[12] = f2; this.LH0.KJ[17] = f2; } public RO(Ui0 paramUi0) { AE(paramUi0); } public RO(RO paramRO) { super(paramRO); AE(paramRO.LH0); } public final void MF(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) { Color color; float f = (color = this.LH0.Kd0).toFloatBits(); this.LH0.vr(mul(paramJX.Bm)); this.LH0.qi(paramFloat3, paramFloat4); this.LH0.yc(paramFloat9); this.c30 = paramFloat7; this.ch0 = paramFloat8; this.eL = true; Ui0 ui0; (ui0 = this.LH0).t50(paramFloat1, paramFloat2, paramFloat5, paramFloat6); this.LH0.Ne(paramJX); Color.abgr8888ToColor(this.LH0.Kd0, f); this.LH0.KJ[2] = f; this.LH0.KJ[7] = f; this.LH0.KJ[12] = f; this.LH0.KJ[17] = f; }
/*   */ 
/*   */   
/*   */   public final void AE(Ui0 paramUi0) {
/*   */     this.LH0 = paramUi0;
/*   */     this.uz = paramUi0.i2();
/*   */     this.B90 = paramUi0.Lv0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RO.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */