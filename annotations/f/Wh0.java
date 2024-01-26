/*  1 */ package f;public final class Wh0 extends lpt1 { public final void wP(float paramFloat) { this.Nr0 = paramFloat; tc tc1; if ((tc1 = this.qm0) == null || zm0.u20 - 
/*  2 */       tc1.pm
/*  3 */       .HQ < 500L) return;  this
/*  4 */       .mh.on0(this.ad0);
/*  5 */     eo1
/*  6 */       .y = f1;
/*  7 */     eo1
/*  8 */       .y = f1; eo eo1; float f1; eo eo2; float f2; if (!nx0.JC0(this.ad0.y, this.kV.y) && (((f1 = (eo1 = this.ad0).y) < (f2 = (eo2 = this.kV).y)) ? ((f1 = UB0.M60.Qy * 2.5F + f1) >= (f1 = eo2.y)) : (f1 > f2 && (f1 -= UB0.M60.Qy * 2.5F) <= (f1 = eo2.y)))) { eo1.y = f1; lPt4(); }
/*  9 */      eo1
/* 10 */       .x = f1;
/* 11 */     eo1
/* 12 */       .x = f1; if (!nx0.JC0(this.ad0.x, this.kV.x) && (((f1 = (eo1 = this.ad0).x) < (f2 = (eo2 = this.kV).x)) ? ((f1 = UB0.M60.Qy * 2.5F + f1) >= (f1 = eo2.x)) : (f1 > f2 && (f1 -= UB0.M60.Qy * 2.5F) <= (f1 = eo2.x)))) { eo1.x = f1; lPt4(); }
/* 13 */      eo1
/* 14 */       .z = f1;
/* 15 */     eo1
/* 16 */       .z = f1; if (!nx0.JC0(this.ad0.z, this.kV.z) && (((f1 = (eo1 = this.ad0).z) < (f2 = (eo2 = this.kV).z)) ? ((f1 = UB0.M60.Qy * 2.5F + f1) >= (f1 = eo2.z)) : (f1 > f2 && (f1 -= UB0.M60.Qy * 2.5F) <= (f1 = eo2.z)))) { eo1.z = f1; lPt4(); }  this.mh.b8(this.ad0); C50(); }
/*    */ 
/*    */   
/*    */   public byte Ds;
/*    */   public short[][] hE0;
/*    */   public float Nr0;
/*    */   public eo ad0;
/*    */   public eo kV;
/*    */   public tc qm0;
/*    */   
/*    */   public Wh0(aG0 paramaG0, lpt1 paramlpt1, byte paramByte, short[][] paramArrayOfshort) {
/*    */     super(paramlpt1);
/*    */     this.Ds = paramByte;
/*    */     this.hE0 = paramArrayOfshort;
/*    */     this.ad0 = new eo();
/*    */     this.kV = new eo();
/*    */     float f1 = paramArrayOfshort[paramByte][0] * 0.25F + 0.125F;
/*    */     float f2 = paramArrayOfshort[paramByte][2] * 2.5F;
/*    */     float f3 = paramArrayOfshort[paramByte][1] * 0.25F + 0.125F;
/*    */     this.mh.bb0(f1, f2, f3);
/*    */   }
/*    */   
/*    */   public final void js() {
/*    */     this.mh.on0(this.ad0);
/*    */     this.kV.JL(this.ad0);
/*    */   }
/*    */   
/*    */   public final boolean Re(ny paramny) {
/*    */     return (this.mh.Z0[13] > this.Nr0) ? false : super.Re(paramny);
/*    */   }
/*    */   
/*    */   public final void lPt4() {
/*    */     tc tc1;
/*    */     if ((tc1 = this.qm0) != null) {
/*    */       short s1 = this.hE0[this.Ds][0], s2 = this.hE0[this.Ds][1];
/*    */       byte b1 = (byte)this.hE0[this.Ds][2];
/*    */       byte b2 = tc1.HW.g50;
/*    */       tc1.HW.Zh(false, s1, s2, b1, b2);
/*    */       this.qm0.pm.getClass();
/*    */       eo eo1 = eo.Zero;
/*    */       this.qm0.pm.KC(null, false, this);
/*    */       this.qm0 = null;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */