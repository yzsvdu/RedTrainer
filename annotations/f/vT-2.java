/*  1 */ package f;public class vT extends Un { public static final pRn KW = new pRn(1358954495); public static final pRn bI0 = new pRn(-1); public j40 Uh; public hm0 kS; public final Rj fP; public final Rj Us0; public final Rj Ls0; public final mE0 tE0; public final tn0 Eu; public final mE0 LJ0; public final mE0 z40; public final int xt; public final int B70; public final rH js0; public vT(String paramString, int paramInt1, int paramInt2) { super(""); byte b1; mE0 mE02; byte b2; float f; this.js0 = new rH(this); this.xt = paramInt1; this.B70 = paramInt2; this(this, paramString); this.fP = rj2; Rj rj2; (rj2 = new Rj()).Xu("label"); this(this); this.Us0 = rj1; Rj rj1; (rj1 = new Rj()).Xu("label"); this(this); this.Ls0 = rj3; Rj rj3; (rj3 = new Rj()).Xu("label"); this(this, 0, 0); this.tE0 = mE01; mE0 mE01; (mE01 = new mE0()).wI0(false); rH rH1 = (new mE0()).ZH0(); if (km.XU()) { b1 = 16; } else { b1 = 12; }  if (km.XU()) { b2 = 16; } else { b2 = 10; }  rH1.tL(b1, b2); mE01.ZH0().sm(new zh0[] { h90.Kw0().ol() }); this(this); this.Eu = tn01; tn0 tn01; (tn01 = new tn0()).Xu("progressbar"); this(this, 16, 16); this.LJ0 = new mE0(); this(this, 16, 16); this.z40 = mE03; mE0 mE03; rH rH2 = (mE03 = new mE0()).ZH0(); if (km.XU()) { f = 1.5F; } else { f = 1.0F; }  rH2.Ii0(f); J8(rj2); J8(rj1); J8(rj3); J8(mE01); J8(tn01); J8(mE02); J8(mE03); tn01.Xu("monsterframe-hp-progressbar"); } public final void EG0(j40 paramj40) { this.Uh = paramj40; this.kS = null; if (paramj40 == null) { this.fP.E1(""); this
/*  2 */         .Ls0.E1("");
/*  3 */       this.tE0.wI0(false);
/*  4 */       o3(0, 0); sk0(false); AY((byte)0);
/*  5 */       this.js0
/*  6 */         .H(); } else { String str = paramj40.m(); this
/*  7 */         .fP.E1(str);
/*  8 */       if (paramj40.Zs.YC()) { this
/*  9 */           .Ls0.E1("");
/* 10 */         this.tE0.wI0(false);
/* 11 */         o3(0, 0); AY((byte)0); sk0(false); } else { StringBuilder stringBuilder; this();
/*    */ 
/*    */ 
/*    */         
/* 15 */         String str1 = pv.X9(59, stringBuilder, " ").append(paramj40.Zs.od).toString();
/* 16 */         this.Ls0.E1(str1);
/*    */         
/* 18 */         boolean bool = paramj40.Zs.BM();
/* 19 */         this.tE0.wI0(bool);
/*    */ 
/*    */ 
/*    */         
/* 23 */         o3(paramj40.Zs.Hq0, paramj40.Fq0.Mm(hR.Gg)); Q90 q90;
/* 24 */         if ((q90 = paramj40.Zs) == null) {
/* 25 */           this.LJ0
/* 26 */             .TS
/* 27 */             .H(); this.LJ0
/* 28 */             .z4 = null;
/* 29 */           this.LJ0.zn();
/*    */         } else {
/* 31 */           AY(q90.u0);
/*    */         }  }
/*    */ 
/*    */       
/* 35 */       short s = paramj40.Zs.Vf0(); byte b = paramj40.s5();
/*    */       
/* 37 */       this.js0.sm(um0.Kt0.lb(s, paramj40.Zs.da(), b));
/* 38 */       this.js0
/* 39 */         .tL(36, 36);
/* 40 */       this.js0
/* 41 */         .zT(6, 3); }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void gt0(hm0 paramhm0)
/*    */   {
/*    */     this.Uh = null;
/*    */     this.kS = paramhm0;
/*    */     if (paramhm0 == null || paramhm0.ih() == 0)
/* 52 */     { this
/* 53 */         .fP.E1("");
/* 54 */       this.Ls0.E1("");
/* 55 */       this.tE0.wI0(false);
/* 56 */       o3(0, 0); sk0(false); AY((byte)0);
/* 57 */       this.js0
/* 58 */         .H(); return; }  String str2 = paramhm0.I9(); this.fP.E1(str2); this(); zh0[] arrayOfZh0; StringBuilder stringBuilder; boolean bool; String str1 = pv.X9(59, stringBuilder, " ").append(paramhm0.Hk()).toString(); this.Ls0.E1(str1); if (paramhm0.K0.y6 > 0) { bool = true; } else { bool = false; }  this.tE0.wI0(bool); this.Eu.wI0(true); jd0 jd0; float f; if ((f = (float)LF.ri((jd0 = paramhm0.K0).ta.Hq0, jd0.hp0)) <= 0.0F) { this.Us0.E1(Ml0.Go(5230, "0")); this.Eu.Nu(0.0F); this.js0.O3 = new pRn(1358954495); } else { this.js0.O3 = null; tn0 tn01 = this.Eu; tn01 = this.Eu; tn01 = this.Eu; String str; if ((f >= 50.0F) ? (str = "monsterframe-hp-progressbar").equals(tn01.cl) : ((f >= 25.0F) ? (str = "monsterframe-hp-progressbar-orange").equals(tn01.cl) : (str = "monsterframe-hp-progressbar-red").equals(tn01.cl))) { tn01.Xu(str); tn01.cZ(); }  this.Eu.Nu(f / 100.0F); this.Us0.E1(Ml0.Go(5230, NumberFormat.getInstance().format(f))); }  Q90 q90; if ((q90 = paramhm0.K0.ta) == null) { this.LJ0.TS.H(); this.LJ0.z4 = null; this.LJ0.zn(); } else { AY(q90.u0); }  rH rH1 = this.js0; if (paramhm0.bh0 != 0) { short s = paramhm0.Jx(); s = um0.HZ(paramhm0.iQ(), s); byte b = paramhm0.hE(); arrayOfZh0 = um0.Kt0.lb(s, paramhm0.JF(), b); } else { jd0 jd01; (jd01 = ((hm0)arrayOfZh0).K0).getClass(); short s = jd01.ta.Cw0; s = um0.HZ(jd01.IH0, s); byte b = jd01.Ih0; arrayOfZh0 = um0.Kt0.lb(s, false, b); }  rH1.sm(arrayOfZh0); this.js0.tL(36, 36); this.js0.zT(8, 3); } public final void d40() { mE0 mE01; int j, i = this.xt; uh0(i, this.B70); i = this.xt; RI(i, this.B70); i = this.xt; Tm(i, this.B70); this.fP.mM(); this.Us0.mM(); this.Ls0.mM(); this.LJ0.mM(); this.tE0.mM(); if (km.XU()) { this.js0.tL(72, 72); this.js0.zT(0, -6); this.fP.ME(this.Kd + 65, this.er0 - 3); this.Us0.ME(this.Kd + 65, this.er0 + 50); this.Eu.Tm(230, 25); this.Eu.ME(this.Kd + 65, this.er0 + 25); this.Ls0.ME(this.Kd + 230, this.er0 - 3); this.tE0.ME(this.Kd + 45, this.er0 + 30); int k = this.tE0.Kd + 2; this.LJ0.ME(k, this.tE0.er0); mE01 = this.z40; i = this.fP.Xq() + 2; j = this.er0 + 2; } else { ((vT)super).fP.ME(this.Kd + 45, this.er0 - 3); ((vT)super).Us0.ME(this.Kd + 45, this.er0 + 20); ((vT)super).Eu.Tm(150, 8); ((vT)super).Eu.ME(this.Kd + 48, this.er0 + 18); ((vT)super).Ls0.ME(this.Kd + 150, this.er0 - 3); i = this.Kd; ((vT)super).tE0.ME(i, this.er0); ((vT)super).tE0.TS.zT(-14, -17); ((vT)super).z40.ME(((vT)super).fP.Xq() + 2, this.er0 + 2); mE01 = ((vT)super).LJ0; i = this.Kd + 190; j = this.er0 + 28; }  ME(i, j); }
/*    */ 
/*    */   
/*    */   public final void o3(int paramInt1, int paramInt2) {
/*    */     if (paramInt2 == 0) {
/*    */       this.Us0.E1("");
/*    */       this.Eu.Nu(0.0F);
/*    */       this.Eu.wI0(false);
/*    */       return;
/*    */     } 
/*    */     this.Eu.wI0(true);
/*    */     tn0 tn01 = this.Eu;
/*    */     tn01 = this.Eu;
/*    */     tn01 = this.Eu;
/*    */     double d;
/*    */     String str;
/*    */     if (((d = LF.ri(paramInt1, paramInt2)) >= 50.0D) ? (str = "monsterframe-hp-progressbar").equals(tn01.cl) : ((d >= 25.0D) ? (str = "monsterframe-hp-progressbar-orange").equals(tn01.cl) : (str = "monsterframe-hp-progressbar-red").equals(tn01.cl))) {
/*    */       tn01.Xu(str);
/*    */       tn01.cZ();
/*    */     } 
/*    */     if (d <= 0.0D) {
/*    */       this.js0.O3 = KW;
/*    */     } else {
/*    */       this.js0.O3 = null;
/*    */     } 
/*    */     this.Eu.Nu((float)(d / 100.0D));
/*    */     String[] arrayOfString;
/*    */     (arrayOfString = new String[3])[0] = paramInt1 + "";
/*    */     (new String[3])[1] = paramInt2 + "";
/*    */     (new String[3])[2] = NumberFormat.getInstance().format(d);
/*    */     this.Us0.E1(Ml0.sB(5231, this));
/*    */   }
/*    */   
/*    */   public final void Nc(byte paramByte) {
/*    */     if (paramByte >= 0) {
/*    */       this.z40.TS.Pn(new pe0[] { (interface.ZZ()).ar0[paramByte] });
/*    */     } else {
/*    */       this.z40.TS.H();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Zq0() {
/*    */     this.Ls0.E1("");
/*    */   }
/*    */   
/*    */   public final int AW() {
/*    */     return this.xt;
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     return this.B70;
/*    */   }
/*    */   
/*    */   public boolean i2(oa0 paramoa0) {
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.GG0 == 66)
/*    */       return false; 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void sk0(boolean paramBoolean) {
/*    */     super.sk0(paramBoolean);
/*    */     if (km.Nr())
/*    */       return; 
/*    */     if (!paramBoolean) {
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */     this.js0.O3 = bI0;
/*    */     for (Hc0 hc0 = this.Li0.r30(); hc0.hasNext(); ) {
/*    */       I i;
/*    */       JG0 jG0 = (JG0)hc0.next();
/*    */       if (paramBoolean) {
/*    */         Ja0 ja0;
/*    */         this(this);
/*    */         this(ja0, bI0);
/*    */       } else {
/*    */         Ja0 ja0;
/*    */         this(this);
/*    */         this(ja0, KW);
/*    */       } 
/*    */       ((JG0)i).db0 = i;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     this.js0.Iq();
/*    */     this.tE0.ME(this.Kd + 45, this.er0 + 45);
/*    */     mE0 mE01;
/*    */     if ((mE01 = this.tE0).dP)
/*    */       super.R60(paramthrows); 
/*    */   }
/*    */   
/*    */   public final void AY(byte paramByte) {
/*    */     if ((paramByte = Q90.Ft(paramByte)) != Byte.MIN_VALUE) {
/*    */       if (paramByte != 16) {
/*    */         if (paramByte != 32) {
/*    */           if (paramByte != 64) {
/*    */             if (paramByte != 7) {
/*    */               if (paramByte != 8) {
/*    */                 this.LJ0.TS.H();
/*    */                 this.LJ0.z4 = null;
/*    */                 this.LJ0.zn();
/*    */               } else {
/*    */                 this.LJ0.z4 = Ml0.OH0(5221);
/*    */                 this.LJ0.zn();
/*    */                 this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0((byte)8) });
/*    */               } 
/*    */             } else {
/*    */               this.LJ0.z4 = Ml0.OH0(5220);
/*    */               this.LJ0.zn();
/*    */               this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0((byte)7) });
/*    */             } 
/*    */           } else {
/*    */             this.LJ0.z4 = Ml0.OH0(5224);
/*    */             this.LJ0.zn();
/*    */             this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0((byte)64) });
/*    */           } 
/*    */         } else {
/*    */           this.LJ0.z4 = Ml0.OH0(5223);
/*    */           this.LJ0.zn();
/*    */           this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0((byte)32) });
/*    */         } 
/*    */       } else {
/*    */         this.LJ0.z4 = Ml0.OH0(5222);
/*    */         this.LJ0.zn();
/*    */         this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0((byte)16) });
/*    */       } 
/*    */     } else {
/*    */       this.LJ0.z4 = Ml0.OH0(5225);
/*    */       this.LJ0.zn();
/*    */       this.LJ0.TS.Pn(new pe0[] { interface.ZZ().vn0(-128) });
/*    */     } 
/*    */     MJ0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */