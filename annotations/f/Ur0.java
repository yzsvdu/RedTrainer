/* 1 */ package f;public abstract class Ur0 { public final void qD0(NC0 paramNC0) { float f2 = paramNC0.x; this.cOm2.TG0(f2, paramNC0.y, 1.0F); float f1 = this.G80; f2 = this.Cn0; float f3 = this.QQ, f4 = this.o6; this.Xe.Ix0(this.cOm2, f1, f2, f3, f4); f1 = this.cOm2.x; f2 = this.cOm2.y; paramNC0.x = f1; paramNC0.y = f2; }
/*   */ 
/*   */   
/*   */   public ny Xe;
/*   */   public float w00;
/*   */   public float ow;
/*   */   public int G80;
/*   */   public int Cn0;
/*   */   public int QQ;
/*   */   public int o6;
/*   */   public final eo cOm2;
/*   */   
/*   */   public Ur0() {
/*   */     eo eo1;
/*   */     this();
/*   */     this.cOm2 = this;
/*   */   }
/*   */   
/*   */   public void wO(boolean paramBoolean) {
/*   */     int i = this.Cn0;
/*   */     int j = this.QQ;
/*   */     int k = this.o6;
/*   */     ou0.com8(this.G80, i, j, k);
/*   */     float f1 = this.w00;
/*   */     ny ny1;
/*   */     float f2 = this.ow;
/*   */     if (paramBoolean) {
/*   */       float f = f1 / 2.0F;
/*   */       ny1.H.TG0(f, f2 / 2.0F, 0.0F);
/*   */     } 
/*   */     this.Xe.En();
/*   */   }
/*   */   
/*   */   public final void DR(Matrix4 paramMatrix4, cx0 paramcx01, cx0 paramcx02) {
/*   */     float f1 = this.Cn0;
/*   */     float f2 = this.QQ;
/*   */     float f3 = this.o6;
/*   */     Ye0.V5(this.Xe, this.G80, f1, f2, f3, paramMatrix4, paramcx01, paramcx02);
/*   */   }
/*   */   
/*   */   public final void a20(ny paramny) {
/*   */     this.Xe = paramny;
/*   */   }
/*   */   
/*   */   public final void KI(float paramFloat1, float paramFloat2) {
/*   */     this.w00 = paramFloat1;
/*   */     this.ow = paramFloat2;
/*   */   }
/*   */   
/*   */   public final void yU(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.G80 = paramInt1;
/*   */     this.Cn0 = paramInt2;
/*   */     this.QQ = paramInt3;
/*   */     this.o6 = paramInt4;
/*   */   }
/*   */   
/*   */   public void cOM2(int paramInt1, int paramInt2) {
/*   */     wO(true);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ur0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */