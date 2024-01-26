/*  1 */ package f;public final class zx extends X00 { public final void W2(float paramFloat1, float paramFloat2, boolean paramBoolean) { NC0 nC02; float f2 = (nC02 = this.So0).x, f3 = this.So0.y, f1 = nC03.x, f4 = nC03.y; We0 we0; float f5 = (we0 = this.u7).eb, f6 = this.u7.bM; nC02.x = f5; nC02
/*  2 */       .y = f6; NC0 nC03;
/*  3 */     (nC03 = this.DD0).x = 0.0F;
/*  4 */     this.DD0.y = 0.0F; if (!paramBoolean)
/*    */     { boolean bool; We0 we01;
/*  6 */       float f = (we01 = this.WK).eb - paramFloat1;
/*  7 */       f *= f; if ((this.WK.bM - paramFloat2) * (this.WK.bM - paramFloat2) + f <= we01.X9 * we01.X9) { bool = true; } else { bool = false; }  if (!bool)
/*  8 */       { boolean bool1; float f8; f5 = (paramFloat1 - f5) / (f8 = we0.X9); nC03
/*  9 */           .x = f5;
/* 10 */         nC03.y = f8; float f7 = f5 * f5;
/* 11 */         if ((f7 = (float)Math.sqrt(((paramFloat2 - f6) / f8 * (f8 = (paramFloat2 - f6) / f8) + f7))) > 1.0F) {
/* 12 */           f7 = 1.0F / f7; this.DD0
/*    */             
/* 14 */             .x = this.DD0.x * f7; this.DD0.y *= f7;
/*    */         }  We0 we02;
/* 16 */         f8 = (we02 = this.u7).eb - paramFloat1;
/* 17 */         f8 *= f8; if ((this.u7.bM - paramFloat2) * (this.u7.bM - paramFloat2) + f8 <= we02.X9 * we02.X9) { bool1 = true; } else { bool1 = false; }  if (bool1)
/* 18 */         { this.So0
/* 19 */             .x = paramFloat1;
/* 20 */           this.So0.y = paramFloat2; }
/*    */         else
/* 22 */         { NC0 nC0; paramFloat2 = (nC0 = this.So0.ON(this.DD0)).x * (nC0 = this.So0.ON(this.DD0)).x; if ((paramFloat2 = (float)Math.sqrt(((this.So0.ON(this.DD0)).y * (this.So0.ON(this.DD0)).y + paramFloat2))) != 0.0F) { nC0
/* 23 */               .x /= paramFloat2; nC0.y /= paramFloat2; }
/* 24 */            We0 we03; float f11 = (we03 = this.u7).X9;
/* 25 */           nC0.x = f8 = nC0.x * f11; nC0.y = f11;
/* 26 */           float f9 = we03.eb, f10 = we03.bM;
/* 27 */           nC0.x = f8 + f9; nC0.y = (f11 = nC0.y * f11) + f10; }  }  }  NC0 nC01; if (f1 != 
/* 28 */       (nC01 = this.DD0).x || f4 != nC01.y) {
/*    */       jj jj;
/* 30 */       if (kZ(jj = (jj)Lp0.vu0(jj.class).obtain())) { this.DD0
/* 31 */           .x = f1;
/* 32 */         this.DD0.y = f4;
/* 33 */         this.So0
/* 34 */           .x = f2;
/* 35 */         this.So0.y = f3; }
/* 36 */        Lp0.Lj0(jj);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public qH V;
/*    */   public boolean Ik0;
/*    */   public boolean ox0;
/*    */   public float BQ;
/*    */   public final We0 u7;
/*    */   public final We0 mj;
/*    */   public final We0 WK;
/*    */   public final NC0 So0;
/*    */   public final NC0 DD0;
/*    */   
/*    */   public zx(float paramFloat, Mw paramMw) {
/*    */     this(paramFloat, (qH)paramMw.Q1(qH.class));
/*    */   }
/*    */   
/*    */   public zx(float paramFloat, Mw paramMw, String paramString) {
/*    */     this(paramFloat, (qH)paramMw.Oz0(qH.class, paramString));
/*    */   }
/*    */   
/*    */   public zx(float paramFloat, qH paramqH) {
/*    */     NC0 nC0;
/*    */     this.ox0 = true;
/*    */     this.u7 = new We0(0.0F, 0.0F, 0.0F);
/*    */     this.mj = new We0(0.0F, 0.0F, 0.0F);
/*    */     this.WK = new We0(0.0F, 0.0F, 0.0F);
/*    */     this();
/*    */     this.So0 = new NC0();
/*    */     this.DD0 = new NC0();
/*    */     if (paramFloat >= 0.0F) {
/*    */       this.BQ = paramFloat;
/*    */       nC0.CE(c4() / 2.0F, ke0() / 2.0F);
/*    */       m4(paramqH);
/*    */       paramFloat = DB0();
/*    */       qp0(paramFloat, d6());
/*    */       Na0(new NE0(this));
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("deadzoneRadius must be > 0");
/*    */   }
/*    */   
/*    */   public final void m4(qH paramqH) {
/*    */     if (paramqH != null) {
/*    */       this.V = paramqH;
/*    */       dD0();
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("style cannot be null");
/*    */   }
/*    */   
/*    */   public final eF0 QI0(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*    */     boolean bool;
/*    */     if (paramBoolean && this.iG0 != i80.s0)
/*    */       return null; 
/*    */     if (!this.Yo0)
/*    */       return null; 
/*    */     We0 we0;
/*    */     paramFloat1 = (we0 = this.mj).eb - paramFloat1;
/*    */     paramFloat1 *= paramFloat1;
/*    */     if ((this.mj.bM - paramFloat2) * (this.mj.bM - paramFloat2) + paramFloat1 <= we0.X9 * we0.X9) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (!bool)
/*    */       this = null; 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final void OD() {
/*    */     float f2, f3, f4 = Math.min(f2 = this.ZP / 2.0F, f3 = this.xr0 / 2.0F);
/*    */     we0.eb = f2;
/*    */     we0.bM = f3;
/*    */     We0 we0;
/*    */     (we0 = this.mj).X9 = f4;
/*    */     ES eS;
/*    */     if ((eS = this.V.Yx0) != null) {
/*    */       uB uB;
/*    */       f4 = f4 - Math.max((uB = (uB)eS).uz, uB.B90) / 2.0F;
/*    */     } 
/*    */     this.u7.eb = f2;
/*    */     this.u7.bM = f3;
/*    */     this.u7.X9 = f4;
/*    */     float f1 = this.BQ;
/*    */     this.WK.eb = f2;
/*    */     this.WK.bM = f3;
/*    */     this.WK.X9 = f1;
/*    */     this.So0.x = f2;
/*    */     this.So0.y = f3;
/*    */     this.DD0.x = 0.0F;
/*    */     this.DD0.y = 0.0F;
/*    */   }
/*    */   
/*    */   public final void cD(JX paramJX, float paramFloat) {
/*    */     kn0();
/*    */     Color color;
/*    */     float f2 = (color = this.As0).r, f3 = this.As0.g, f4 = this.As0.b;
/*    */     paramFloat = color.a * paramFloat;
/*    */     paramJX.implements(f2, f3, f4, paramFloat);
/*    */     paramFloat = this.bs;
/*    */     float f1 = this.kl;
/*    */     f2 = this.ZP;
/*    */     f3 = this.xr0;
/*    */     ES eS2;
/*    */     if ((eS2 = this.V.TJ0) != null)
/*    */       eS2.JD(paramJX, paramFloat, f1, f2, f3); 
/*    */     ES eS1;
/*    */     if ((eS1 = this.V.Yx0) != null) {
/*    */       uB uB;
/*    */       float f6;
/*    */       paramFloat = this.So0.x - (f6 = (uB = (uB)eS1).uz) / 2.0F + paramFloat;
/*    */       float f5;
/*    */       eS1.JD(paramJX, paramFloat, this.So0.y - (f5 = this.B90) / 2.0F + f1, f6, f5);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final float DB0() {
/*    */     float f;
/*    */     ES eS;
/*    */     if ((eS = this.V.TJ0) != null) {
/*    */       f = ((uB)this).uz;
/*    */     } else {
/*    */       f = 0.0F;
/*    */     } 
/*    */     return f;
/*    */   }
/*    */   
/*    */   public final float d6() {
/*    */     float f;
/*    */     ES eS;
/*    */     if ((eS = this.V.TJ0) != null) {
/*    */       f = ((uB)this).B90;
/*    */     } else {
/*    */       f = 0.0F;
/*    */     } 
/*    */     return f;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */