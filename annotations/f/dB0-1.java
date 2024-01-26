/* 1 */ package f;public final class dB0 extends lpt1 { public final void Ud0(float paramFloat1, float paramFloat2) { if (this.GD0) { this.mh.Rn0(eo.X, -180.0F); this.mh.N8(eo.Y, 180.0F); }  eo eo1; (eo1 = Us0).JL(this.prn); if (this.E) { paramFloat2 = this.Fv0 / this.UP; if (this.dL) paramFloat2 = 1.0F - paramFloat2;  paramFloat2 = eo1.y; eo1.y = W2.Vi0.kb(paramFloat2) * 0.75F + paramFloat2; }  this.mh.b8(eo1); float f3; this
/* 2 */       .aUx = paramFloat2 = this.aUx + (f3 = UB0.M60.Qy); this.Fv0 = f3; if ((f3 = this.Fv0 + f3) > this.UP) { this.Fv0 = 0.0F; this.dL ^= 0x1; }  if (paramFloat2 >= this.YH / 1000.0F) { this.aUx = 0.0F; this.YH = xi0.A90(1000, 2500); }  byte b; if ((b = 4) != this.pR) { this.pR = b; ((T0)this.xl0.get(1)).Tz0(this.GL0); }  float f2; if ((f2 = this.aUx * 1000.0F / this.YH) > 0.5F) f2 = 1.0F - f2;  Color color = Color.WHITE; float f1 = this.g * f2 * 0.5F; this.fG0.vF0.set(this.r * f2 * 0.5F, f1, this.b * f2 * 0.5F, 1.0F); this.GL0.vF0.set(f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, 0.1F); }
/*   */ 
/*   */   
/*   */   public static final eo Us0 = new eo();
/*   */   public float aUx;
/*   */   public float Fv0;
/*   */   public boolean dL;
/*   */   public int YH;
/*   */   public float UP;
/*   */   public qo GL0;
/*   */   public qo fG0;
/*   */   public int pR;
/*   */   public boolean E;
/*   */   public boolean GD0;
/*   */   public eo prn;
/*   */   
/*   */   public dB0(cf0 paramcf0, kg0 paramkg0, float paramFloat1, float paramFloat2, eo parameo, boolean paramBoolean) {
/*   */     super(paramcf0, "PumpkinObject", paramFloat1, null);
/*   */     qo qo1;
/*   */     qo qo2;
/*   */     Jx0(true);
/*   */     this.E = true;
/*   */     this.prn = parameo;
/*   */     this.GD0 = paramBoolean;
/*   */     ((zP)this.vC0.get(0)).nH.TG0(paramFloat1, paramFloat1, paramFloat1);
/*   */     if (paramBoolean) {
/*   */       float f1 = parameo.x;
/*   */       float f2 = -parameo.y;
/*   */       paramFloat1 = parameo.z;
/*   */       this.prn = new eo(f1, f2, paramFloat1);
/*   */       this.dL = true;
/*   */     } 
/*   */     o6();
/*   */     float f = 1.0F;
/*   */     if (paramBoolean) {
/*   */       qo qo3;
/*   */       f = 0.25F;
/*   */       this(qo.A80, new Color(0.45250002F, 0.45250002F, 0.45250002F, 0.1F));
/*   */       this.GL0 = new qo();
/*   */       ((T0)this.xl0.get(0)).Tz0(qo3);
/*   */     } 
/*   */     this(qo.cu0, Color.ORANGE.cpy().mul(f * 0.2F));
/*   */     this.fG0 = new qo();
/*   */     ((T0)this.xl0.get(1)).Tz0(qo2);
/*   */     this(qo.iu0, new Color(f * 0.21F + 0.6F, f * 0.21F + 0.6F, f * 0.21F + 0.6F, 0.1F));
/*   */     this.GL0 = new qo();
/*   */     ((T0)this.xl0.get(1)).Tz0(this);
/*   */     this.YH = xi0.A90(3000, 5000);
/*   */     this.UP = paramFloat2;
/*   */   }
/*   */   
/*   */   public final void Ea0() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */