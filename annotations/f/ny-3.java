/* 1 */ package f;public abstract class ny { public final eo H; public final eo yF; public final eo nj0; public final Matrix4 yE; public final Matrix4 ex; public final Matrix4 VD0; public final Matrix4 AA; public float Ce0; public void nq0(float paramFloat1, float paramFloat2, float paramFloat3) { this.com1.TG0(paramFloat1, paramFloat2, paramFloat3).zy0(this.H).WC0(); if (!this.com1.Kw0()) { if (Math.abs((paramFloat1 = this.com1.h3(this.nj0)) - 1.0F) < 1.0E-9F) { this.nj0.JL(this.yF).uu(-1.0F); } else if (Math.abs(paramFloat1 + 1.0F) < 1.0E-9F) { this.nj0.JL(this.yF); }  this.yF.JL(this.com1); this.com1.JL(this.yF).Nz(this.nj0); this.nj0.JL(this.com1).Nz(this.yF).WC0(); }  } public float l6; public float gV; public float oA; public final ZQ dR; public final eo com1; public final p10 H90; public ny() { eo eo2; Matrix4 matrix4; ZQ zQ; eo eo1; p10 p101; eo eo3; eo eo4; this(); this.H = this; this(0.0F, 0.0F, -1.0F); this.yF = this; this(0.0F, 1.0F, 0.0F); this.nj0 = this; this(); this.yE = this; this(); this.ex = this; this(); this.VD0 = this; this(); this.AA = this; this.Ce0 = 1.0F; this.l6 = 100.0F; this.gV = 0.0F; this.oA = 0.0F; this(); this.dR = this; this(); this.com1 = this; this(); this(); this(eo3, eo4); this.H90 = this; } public abstract void En(); public final void Ff(eo parameo, float paramFloat) { this.yF.vS(parameo, paramFloat); this.nj0.vS(parameo, paramFloat); } public final void e20(eo parameo1, eo parameo2, float paramFloat) { eo1.getClass(); float f2 = parameo1.x, f4 = parameo1.y, f5 = parameo1.z; eo eo1; (eo1 = this.com1).TG0(f2, f4, f5); this
/* 2 */       .com1.zy0(this.H); jy(this.com1); Ff(parameo2, paramFloat); this.com1.vS(parameo2, paramFloat); float f1 = -this.com1.x; f2 = -this.com1.y; float f3 = -this.com1.z;
/* 3 */     this.H.Tz(f1, f2, f3); }
/*   */ 
/*   */   
/*   */   public void jy(eo parameo) {
/*   */     getClass();
/*   */     float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z;
/*   */     eo eo1;
/*   */     (eo1 = this.H).Tz(f1, f2, f3);
/*   */   }
/*   */   
/*   */   public final void Ix0(eo parameo, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     float f = parameo.x - paramFloat1;
/*   */     parameo.x = f * 2.0F / paramFloat3 - 1.0F;
/*   */     parameo.y = (UB0.M60.dL() - parameo.y - paramFloat2) * 2.0F / paramFloat4 - 1.0F;
/*   */     parameo.z = parameo.z * 2.0F - 1.0F;
/*   */     parameo.qf(this.AA);
/*   */   }
/*   */   
/*   */   public final eo w8(eo parameo) {
/*   */     float f1 = UB0.M60.fG0();
/*   */     float f2 = UB0.M60.dL();
/*   */     jf0(parameo, 0.0F, 0.0F, f1, f2);
/*   */     return parameo;
/*   */   }
/*   */   
/*   */   public final void jf0(eo parameo, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     parameo.qf(this.VD0);
/*   */     parameo.x = (parameo.x + 1.0F) * paramFloat3 / 2.0F + paramFloat1;
/*   */     parameo.y = (parameo.y + 1.0F) * paramFloat4 / 2.0F + paramFloat2;
/*   */     parameo.z = (parameo.z + 1.0F) / 2.0F;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ny.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */