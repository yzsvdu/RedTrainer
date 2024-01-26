/* 1 */ package f;public final class Tm extends ny { public final void UX(boolean paramBoolean) { float f2 = f1 * -this.gV / 2.0F, f1 = this.gV / 2.0F * f1; float f3, f4 = (f1 = this.nUl) * -((f3 = this.oA) / 2.0F); f3 = this.nUl * f3 / 2.0F; float f5 = this.Ce0, f6 = this.l6; this.yE.PG(f2, f1, f4, f3, f5, f6); eo eo1 = this.H, eo2 = this.ec.JL(eo1).zT(this.yF), eo3 = this.nj0; this.ex.Cj(eo1, eo2, eo3); Matrix4 matrix4 = this.yE; this.VD0.getClass(); this.VD0.Qw(matrix4.Z0);
/* 2 */     Matrix4.jq(this.VD0.Z0, this.ex.Z0); matrix4 = this.VD0; this.AA.getClass(); this.AA
/* 3 */       .Qw(matrix4.Z0);
/* 4 */     Matrix4.O4(this.AA.Z0); this.dR.FW(this.AA); }
/*   */ 
/*   */   
/*   */   public float nUl;
/*   */   public final eo ec;
/*   */   
/*   */   public Tm() {
/*   */     eo eo1;
/*   */     this.nUl = 1.0F;
/*   */     this();
/*   */     this.ec = this;
/*   */     this.Ce0 = 0.0F;
/*   */   }
/*   */   
/*   */   public Tm(float paramFloat1, float paramFloat2) {
/*   */     eo eo1;
/*   */     this.nUl = 1.0F;
/*   */     this();
/*   */     this.ec = this;
/*   */     this.gV = paramFloat1;
/*   */     this.oA = paramFloat2;
/*   */     this.Ce0 = 0.0F;
/*   */     En();
/*   */   }
/*   */   
/*   */   public final void En() {
/*   */     UX(true);
/*   */   }
/*   */   
/*   */   public final void Wt(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*   */     if (paramBoolean) {
/*   */       this.nj0.TG0(0.0F, -1.0F, 0.0F);
/*   */       this.yF.TG0(0.0F, 0.0F, 1.0F);
/*   */     } else {
/*   */       this.nj0.TG0(0.0F, 1.0F, 0.0F);
/*   */       this.yF.TG0(0.0F, 0.0F, -1.0F);
/*   */     } 
/*   */     float f = this.nUl * paramFloat1 / 2.0F;
/*   */     this.H.TG0(f, this.nUl * paramFloat2 / 2.0F, 0.0F);
/*   */     this.gV = paramFloat1;
/*   */     this.oA = paramFloat2;
/*   */     UX(true);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */