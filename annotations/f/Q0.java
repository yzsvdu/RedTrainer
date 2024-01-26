/* 1 */ package f;public final class Q0 implements Serializable { public final void t10(eo parameo1, eo parameo2, eo parameo3) { getClass(); float f1 = parameo1.x, f2 = parameo1.y, f5 = parameo1.z;
/* 2 */     f1 = parameo2.x; f2 = parameo2.y; f5 = parameo2.z;
/* 3 */     f1 = parameo2.x - parameo3.x; f2 = parameo2.y - parameo3.y; float f3 = parameo2.z - parameo3.z; eo eo1; float f4;
/* 4 */     f5 = (f4 = ((eo1 = this.YB0).TG0(f1, f2, f5).uD(f1, f2, f5)).y) * f3; f5 -= f6 * f2; float f6 = (f6 = ((eo1 = this.YB0).TG0(f1, f2, f5).uD(f1, f2, f5)).z) * f1, f7 = ((eo1 = this.YB0).TG0(f1, f2, f5).uD(f1, f2, f5)).x; f2 = f6 - f7 * f3; (eo1 = this.YB0).TG0(f1, f2, f5).uD(f1, f2, f5).TG0(f5, f2, f7 * f2 - f4 * f1)
/* 5 */       .WC0(); this.e00 = -parameo1.h3(this.YB0); }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = -1240652082930747866L;
/*   */   public final eo YB0;
/*   */   public float e00;
/*   */   
/*   */   public Q0() {
/*   */     eo eo1;
/*   */     this();
/*   */     this.YB0 = this;
/*   */     this.e00 = 0.0F;
/*   */   }
/*   */   
/*   */   public Q0(eo parameo, float paramFloat) {
/*   */     this();
/*   */     this.YB0 = eo1;
/*   */     this.e00 = 0.0F;
/*   */     eo eo1;
/*   */     (eo1 = new eo()).JL(parameo).WC0();
/*   */     this.e00 = paramFloat;
/*   */   }
/*   */   
/*   */   public Q0(eo parameo1, eo parameo2) {
/*   */     this();
/*   */     this.YB0 = eo1;
/*   */     this.e00 = 0.0F;
/*   */     eo1.JL(parameo1).WC0();
/*   */     eo eo1;
/*   */     this.e00 = -(eo1 = new eo()).h3(parameo2);
/*   */   }
/*   */   
/*   */   public Q0(eo parameo1, eo parameo2, eo parameo3) {
/*   */     eo eo1;
/*   */     this();
/*   */     this.YB0 = this;
/*   */     this.e00 = 0.0F;
/*   */     t10(parameo1, parameo2, parameo3);
/*   */   }
/*   */   
/*   */   public final Ov bE0(eo parameo) {
/*   */     float f;
/*   */     return ((f = this.YB0.h3(parameo) + this.e00) == 0.0F) ? Ov.A50 : ((f < 0.0F) ? Ov.RJ : Ov.La);
/*   */   }
/*   */   
/*   */   public final Ov K1(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     paramFloat1 = this.YB0.x * paramFloat1;
/*   */     paramFloat1 = this.YB0.y * paramFloat2 + paramFloat1;
/*   */     float f;
/*   */     return ((f = this.YB0.z * paramFloat3 + paramFloat1 + this.e00) == 0.0F) ? Ov.A50 : ((f < 0.0F) ? Ov.RJ : Ov.La);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.YB0.toString() + ", " + this.e00;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */