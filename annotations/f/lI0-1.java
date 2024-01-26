/*  1 */ package f;public final class lI0 extends lpt1 { public final void M70(eo parameo) { if (this.cOM5 != null) { float f6, f9; Matrix4 matrix4 = this.su; eo2.getClass(); float f5 = parameo.x, f7 = parameo.y, f8 = parameo.z; eo eo2, eo1 = (eo2 = MJ0).TG0(f5, f7, f8); boolean bool;
/*  2 */       if (bool = this.p7) { f8 = 0.25F; } else { f8 = 0.0F; }  if (bool) { f9 = 0.0F; } else { f9 = -0.2F; }  if (bool) { f6 = -0.15F; } else { f6 = -0.0F; }  matrix4.Jo(eo1.Tz(f8, f9, f6)); this.cOM5.setTransform(this.su); }  this.mh.Rn0(eo.X, -25.0F); float f4; if ((f4 = this.uk0 / this.s) > 0.5F) f4 = 1.0F - f4;  if (this.p7) { eo1.getClass();
/*  3 */       f3 = parameo.x; float f5 = parameo.y, f6 = parameo.z; eo eo1; (eo1 = MJ0).TG0(f3, f5, f6)
/*  4 */         .uD(-0.25F, 0.05F, 0.0F); } else { eo1.getClass();
/*  5 */       f3 = f3.x; float f5 = f3.y, f6 = f3.z; eo eo1; (eo1 = MJ0).TG0(f3, f5, f6)
/*  6 */         .uD(0.0F, 0.15F, -0.075F); }  if (this.ky != null) { eo eo1; (eo1 = bP).JL(MJ0); bP.uD(0.0F, 0.1F, 0.025F); this.ky.mh.WU(); this.ky.mh.b8(eo1); this.ky.mh.GJ(-f4 * 0.1F + 1.0F, -f4 * 0.1F + 1.0F, 1.0F); }  if (this.vc0) { f3 = MJ0.z; MJ0.z = f4 * 0.05F + f3; }  this.mh.b8(MJ0); float f3; this
/*    */       
/*  8 */       .package = this.package + (f3 = UB0.M60.Qy); this.uk0 = f3; if ((f3 = this.uk0 + f3) > this.s) { this.uk0 = 0.0F; this.s = xi0.A90(4000, 6000) / 1000.0F; }  if (this.package >= this.gK / 1000.0F) { this.package = 0.0F; this.gK = xi0.A90(3000, 5000); }
/*    */      L70 l70; int i;
/* 10 */     if ((i = (l70 = L70.gq).Rr0()) >= 6 && i < 17) { i = 2; } else { i = 4; }  if (i != this
/* 11 */       .yi)
/* 12 */     { int j; if ((j = l70.Rr0()) >= 6 && j < 17) { j = 2; } else { j = 4; }  this
/* 13 */         .yi = j; if (j == 2) { ((T0)this.xl0.get(1)).Ng0(qo.iu0); } else { ((T0)this.xl0.get(1)).Tz0(this.xt0); }  }  float f2; if ((f2 = this.package * 1000.0F / this.gK) > 0.5F) f2 = 1.0F - f2;  Color color = Color.WHITE; float f1 = this.g * f2 * 0.5F; this.Sw0.vF0.set(this.r * f2 * 0.5F, f1, this.b * f2 * 0.5F, 1.0F); this.xt0.vF0.set(f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, 0.1F); }
/*    */ 
/*    */   
/*    */   public static final eo MJ0 = new eo();
/*    */   public static final eo bP = new eo();
/*    */   public float package;
/*    */   public float uk0;
/*    */   public int gK;
/*    */   public float s;
/*    */   public qo xt0;
/*    */   public qo Sw0;
/*    */   public int yi;
/*    */   public boolean p7;
/*    */   public kg0 U50;
/*    */   public ParticleEffectExt cOM5;
/*    */   public Matrix4 su;
/*    */   public boolean vc0;
/*    */   
/*    */   public lI0(cf0 paramcf0, boolean paramBoolean1, boolean paramBoolean2, lpt1 paramlpt1) {
/*    */     super(paramcf0, str, f, null);
/*    */     qo qo1;
/*    */     float f;
/*    */     Jx0(true);
/*    */     this.p7 = paramBoolean1;
/*    */     this.vc0 = paramBoolean2;
/*    */     this.ky = paramlpt1;
/*    */     if (paramlpt1 != null) {
/*    */       ((T0)paramlpt1.xl0.get(0)).Tz0(new zc(1.0F));
/*    */       ((T0)paramlpt1.xl0.get(0)).Tz0(new LPT9(LPT9.It0, 0.01F));
/*    */       paramlpt1.Jx0(true);
/*    */     } 
/*    */     this(qo.cu0, Color.ORANGE.cpy().mul(0.2F));
/*    */     this.Sw0 = new qo();
/*    */     ((T0)this.xl0.get(1)).Tz0(qo1);
/*    */     this(qo.iu0, new Color(0.81F, 0.81F, 0.81F, 0.1F));
/*    */     this.xt0 = new qo();
/*    */     ((T0)this.xl0.get(1)).Tz0(qo1);
/*    */     if (paramBoolean2) {
/*    */       String str1;
/*    */       kg0 kg01 = km.wI0.Kh().eA0();
/*    */       if (paramBoolean1) {
/*    */         str1 = "special/pumpking";
/*    */       } else {
/*    */         str1 = "special/pumpkin_haze";
/*    */       } 
/*    */       ParticleEffectExt particleEffectExt = kg01.gi0(str1);
/*    */       this.U50.L40(particleEffectExt);
/*    */       this.cOM5.start();
/*    */       this.su = new Matrix4();
/*    */     } 
/*    */     this.gK = xi0.A90(3000, 5000);
/*    */     this.s = xi0.A90(4000, 6000) / 1000.0F;
/*    */   }
/*    */   
/*    */   public final void Ea0() {
/*    */     ParticleEffectExt particleEffectExt;
/*    */     if ((particleEffectExt = this.cOM5) != null) {
/*    */       this.U50.Ow0(particleEffectExt);
/*    */       this.cOM5.dispose();
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */