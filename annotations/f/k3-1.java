/*     */ package f;public final class k3 extends cj { public static final eo RP = new eo(-2.25F, 0.0F, 0.8F); public nf COm7; public kg0 dS; public ParticleEffectExt[] DX; public j40[] qL; public UA0[] z0; public JX N6; public Texture[] cOM3; public Texture b; public Color[] TX; public Color Nul = Color.WHITE.cpy(); public int rK0; public int hF; public int EM; public int Fd; public int od0; public float Rv0; public boolean Hs0; public du0 mV; public short Kx; public byte Tu; public uT[] Fk; public So FE0; public ParticleEffectExt LPT7; public ParticleEffectExt le;
/*     */   public k3(byte paramByte) { super(true); }
/*     */   public static void kC(uT paramuT, int paramInt, sh paramsh) { F4 f4;
/*   4 */     if ((f4 = (F4)paramuT.Os0.cOM1(F4.Qr0)) != null) f4.A8 = paramuT.IC;  } private void vI0(int paramInt, sh paramsh) { this.Fd++; this.Rv0 = 0.0F; this.Hs0 = false; this.FE0 = null; } public final synchronized em() { return new by0(0); } public final void Wy() { super.Wy(); this.YL.el0 = 2.0F; this.YL.I70.TG0(0.0F, -1.0F, -2.25F); this.YL.mP(0.0F, 0.5F, 1.0F); this(this.YL); gd gd; du0 du01; boolean bool2, bool1; JX jX; this.COm7 = new nf(100, gd); (this.dS = new kg0(this.YL)).fA0(km.mI0.AN); this.dS.SJ0.B9(); this(); this.N6 = new JX(); this.RK0.Com3(jX); this.RK0.Com3(this.COm7); this.RK0.Com3(gd); this.RK0.Com3(this.dS); this(); this.mV = new du0(); js.vu0
/*     */       
/*   6 */       .si(du01, js.vu0.Ub());
/*   7 */     this.mV.mM(); this.mV.BA(); lr lr2;
/*   8 */     if ((lr2 = km.pm0.kR) != null)
/*   9 */     { bool2 = lr2.LE(); } else { bool2 = false; }  this
/*  10 */       .Kx = bool2; lr lr1;
/*  11 */     if ((lr1 = km.pm0.kR) != null)
/*  12 */     { bool1 = lr1.jA(); } else { bool1 = false; }  this
/*  13 */       .Tu = bool1; nW(UB0.M60.fG0(), UB0.M60.dL()); } public final void nW(int paramInt1, int paramInt2) { super.nW(paramInt1, paramInt2); this.N6.qZ.ZA0(this.r9, this.hr); } public final void Jy() { super.Jy(); byte b = this.Tu; km.pm0.U00(b, this.Kx, false, true); this.mV.ra0(); } public final boolean pT(oa0 paramoa0) { int i; if ((B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (h1.J20(paramoa0.GG0, BM.bC) || h1.J20(paramoa0.GG0, BM.lc))) || (B8.Pg(i = paramoa0.cz0) && paramoa0.vl == 0 && i == 3)) { h70 h70; String str = Ml0.OH0(6150); Runnable runnable = this::Ws; du0 du01 = this.mV; this(this, runnable, du01); js.vu0.si(h70, js.vu0.Ub()); return true; }  return false; } public final void QA0() { Texture texture; interface.ZZ().getClass(); Texture[] arrayOfTexture; int j; byte b2; for (this.cOM3 = arrayOfTexture, j = (arrayOfTexture = interface.A5()).length, b2 = 0; b2 < j; ) { Texture texture1 = arrayOfTexture[b2]; this.rK0 = texture1.getWidth() + this.rK0; this.hF = texture1.getHeight(); b2++; }  String[] arrayOfString; (arrayOfString = new String[j = 1])[0] = "hof"; interface interface; (interface = interface.ZZ()).getClass(); byte b = 0; while (true) { if (b < j) { String str = De0.AT("data/sprites/textures/", arrayOfString[b], ".png"); hZ hZ = UB0.vj0.aP(str); if (q00.Dz) { try { hZ.Yc().close(); } catch (Exception exception) {} } else {  }  if (hZ.L0()) try { Texture texture1; this(UB0.vj0.aP(str)); break; } catch (Exception exception) {}  b++; continue; }  texture = interface.xo; break; }  this.b = texture; int i; j40[] arrayOfJ402 = new j40[i = km.u4.z2.Lg0.size()]; System.arraycopy(km.u4.z2.zc0(), 0, arrayOfJ402, 0, i); j40[] arrayOfJ401; this.DX = new ParticleEffectExt[(arrayOfJ401 = this.qL).length]; this.Fk = new uT[arrayOfJ401.length]; this.z0 = new UA0[arrayOfJ401.length]; this.TX = new Color[arrayOfJ401.length]; (this.LPT7 = this.dS.gi0("special/hof")).init(); (this.le = this.dS.gi0("special/hof_party_trail")).init(); for (byte b1 = 0; b1 < (arrayOfJ402 = this.qL).length; ) { j40 j401; if ((j401 = arrayOfJ402[b1]) != null) { Ht0 ht01, ht02; if ((b = (ht01 = j401.rG()).zm0) == 
/*  14 */           (ht02 = Ht0.Ku)
/*  15 */           .zm0 && b != 
/*  16 */           (j401.OH())
/*  17 */           .zm0)
/*  18 */           ht01 = j401.OH();  if (ht01 != Ht0.P00 && ht01 != Ht0.CW) ht02 = ht01;
/*     */ 
/*     */         
/*  21 */         short s = j401.Zs.Vf0();
/*     */         
/*  23 */         this.z0[b1] = um0.Kt0.vt(j401.s5(), s, false, j401.Zs.tm0()); this.z0[b1].Zz(4.0F); this.RK0.Com3(this.z0[b1]); uT uT1; (uT1 = uT.NI(this.z0[b1])).WQ(0.25F, 0.0F, 1.0F); uT.NI(this.z0[b1])
/*  24 */           .W5(eo.Z, this.YL.nj0);
/*  25 */         if (j401.Zs.da()) { f2 = 0.0125F; } else { f2 = 0.01F; }  uT1
/*  26 */           .ys = f2;
/*  27 */         uT1.zO(f2); uT1.Gz(); this.Fk[b1] = uT1; pRn pRn;
/*  28 */         (pRn = (pRn)Rs.OS.get(ht02))
/*  29 */           .getClass();
/*  30 */         float f1 = (pRn.fk & 0xFF) / 255.0F, f2 = (pRn.Ff0 & 0xFF) / 255.0F, f3 = (pRn.ls & 0xFF) / 255.0F; this.TX[b1] = new Color((pRn.Ge & 0xFF) / 255.0F, f1, f2, f3);
/*  31 */         this.DX[b1] = this.dS
/*     */ 
/*     */           
/*  34 */           .gi0(B40.df("special/type_").append(ht02.zm0).toString()); this.RK0.Com3(this.DX[b1]); }  b1++; }  } public final void Tn0() { this.Rv0 += this.Km; if (this.Fd == 0) { if (!this.Hs0) { km.pm0.U00((byte)2, (short)1016, true, true); this.Nul.set(Color.BLACK); this.FE0 = so; (Wz0.gq(this.Nul, 0, 1.0F).qY(new float[] { 0.5F, 0.5F, 0.5F, 1.0F })).st = (i0)Quad.INOUT; So so; (so = So.k60()).PL(Wz0.gq(this.Nul, 0, 1.0F).qY(new float[] { 0.5F, 0.5F, 0.5F, 1.0F })); this.FE0.mg(super.Rv0); this.Hs0 = true; }  if (this.Rv0 > 1.0F) { this.Fd++; this.Rv0 = 0.0F; this.Hs0 = false; this.FE0 = null; }  }  if (this.Fd == 1) { int i; j40[] arrayOfJ40; if ((i = this.od0) < (arrayOfJ40 = this.qL).length) { float[] arrayOfFloat; if (!this.Hs0) { vF0 vF0; String str4, str3; uT uT1 = this.Fk[i]; float f = 1.0F; j40 j401; if ((j401 = arrayOfJ40[i]).Zs.da()) { f = nx0.SA0(0.6F, 0.5F, 1.0F); if (j401.Zs.tm0()) { Color color1 = dM.d10; uT1.Os0.Tz0(new F4(F4.Qr0, color1, 3.0F)); uT1.IC = 3.0F; } else { Color color1 = dM.N1; uT1.Os0.Tz0(new F4(F4.Qr0, color1, 2.25F)); uT1.IC = 2.25F; }  }  Q90 q901; D0.lPt1((q901 = j401.Zs).Cw0, f, 0.0F, q901.da()); du0 du01 = this.mV; G30 g30 = super.Rv0; du01.w40.Dv0.kp0(); SA sA = du01.w40.Dv0; this(64, 64, 0); if (!j401.Zs.YC() && j401.s5() >= 0) { interface interface = interface.ZZ(); vF0.TS.Pn(new pe0[] { interface.ar0[j401.s5()] }); vF0.TS.V1 = 4.0F; }  du01.w40
/*  35 */             .Ho0 = true;
/*  36 */           du01.w40.TG0 = true;
/*  37 */           sA.RT
/*  38 */             .fu(); sA.yh0(); sA.Dl0(15.0F); (sA.IR(j401.m()))
/*  39 */             .ss = Integer.valueOf(2);
/*  40 */           (sA.IR(j401.m()).fJ(32.0F))
/*  41 */             .Ox.wP();
/*     */           
/*  43 */           ((sA.IR(j401.Hn())).Ox.S7(vF0))
/*  44 */             .Ox.wP();
/*  45 */           this();
/*  46 */           StringBuilder stringBuilder = pv.X9(59, stringBuilder, " ");
/*  47 */           if (j401.Zs.YC())
/*  48 */           { str4 = "???"; }
/*     */           else
/*     */           
/*  51 */           { str4 = Byte.toString(j401.Zs.od); }  (sA.IR(stringBuilder.append(str4).toString()))
/*  52 */             .Ox.wP();
/*  53 */           this();
/*     */ 
/*     */           
/*  56 */           (sA.IR(pv.X9(1807, stringBuilder, " ").append(j401.Zs.lG()).toString()).fa0(25.0F))
/*  57 */             .ss = Integer.valueOf(2);
/*  58 */           (sA.IR(pv.X9(1807, stringBuilder, " ").append(j401.Zs.lG()).toString()).fa0(25.0F)).Ox.wP();
/*  59 */           String str2 = Ml0.OH0(1872); Q90 q902;
/*     */           byte b1;
/*  61 */           if ((b1 = (q902 = j401.Zs).YH0) != -1)
/*  62 */           { int j; byte b; if ((b = q902.UK0) == 0) { j = (b1 & 0xFF) - 88 + 140000; } else { j = b * 1000 + 140000 + (j & 0xFF); }  if (q902
/*  63 */               .wl()) { j = 1884; }
/*     */             
/*  65 */             else if (!Ml0.nW.return(j) || 
/*  66 */               j401.Zs
/*  67 */               .sq0 == 0)
/*     */             
/*  69 */             { j = j401.Zs.UK0 + 250000; }
/*  70 */              str3 = Ml0.Go(1877, Ml0.OH0(j)); } else { str2 = Ml0.OH0(1874); str3 = Ml0.OH0(1876); }
/*     */ 
/*     */           
/*  73 */           String str5 = Ml0.Go(1875, j401.Zs.sq0 + "");
/*     */           byte b2;
/*  75 */           if ((b2 = j401.Zs.sq0) == -1)
/*  76 */           { str2 = Ml0.OH0(1873); str5 = ""; } else if (b2 < 1) { str5 = ""; }  if (j401
/*  77 */             .Zs.YC()) {
/*  78 */             str2 = Ml0.OH0(1874); str5 = "";
/*     */           } 
/*     */           
/*  81 */           String str1 = Ml0.Go(1878, (new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")).format(Long.valueOf(j401.Zs.Ck * 1000L))); String[] arrayOfString; (arrayOfString = new String[5])[0] = ""; (new String[5])[1] = str2; (new String[5])[2] = str5; (new String[5])[3] = str3; (new String[5])[4] = str1; (sA.IR(Ml0.sB(1870, arrayOfString)).fa0(25.0F))
/*  82 */             .ss = Integer.valueOf(2);
/*  83 */           du01.w40.mM(); du01.w40
/*     */             
/*  85 */             .ME(-du01.w40.xY, 0); YA0 yA0;
/*  86 */           (yA0 = du01.w40)
/*  87 */             .db0 = new I(yA0, pRn.TRANSPARENT);
/*  88 */           Quad quad = Quad.INOUT; So.k60()
/*     */             
/*  90 */             .PL(Wz0.gq(du01.w40, 3, 1.0F).n20(0.0F, 0.0F)).mg(g30); du01.w40
/*  91 */             .db0
/*  92 */             .sz(pRn.WHITE, 1200);
/*  93 */           this.dS.strictfp(); this.dS.L40(this.le); this.le.start(); this.dS.L40(this.DX[this.od0]); this.DX[this.od0].start(); (uT1.G10()).a = 0.0F; Color color = this.TX[this.od0]; (Wz0.gq(uT1, 9, 0.5F).a(1.0F))
/*  94 */             .st = (i0)quad;
/*  95 */           (Wz0.gq(uT1, 4, 0.5F).qw0(0.0F, 0.125F, 1.5F))
/*  96 */             .st = (i0)quad;
/*  97 */           arrayOfFloat[0] = color.r; arrayOfFloat[1] = color.g; arrayOfFloat[2] = color.b; (arrayOfFloat = new float[4])[3] = color.a; (Wz0.gq(this.Nul, 0, 0.5F).qY(new float[4]))
/*  98 */             .st = (i0)quad;
/*  99 */           So.fD().PL(Wz0.gq(uT1, 9, 0.5F).a(1.0F)).PL(Wz0.gq(uT1, 4, 0.5F).qw0(0.0F, 0.125F, 1.5F)).PL(Wz0.gq(this.Nul, 0, 0.5F).qY(new float[4])).mg(super.Rv0); this.Hs0 = true; } else if (this.Rv0 > 4.0F) { this
/* 100 */             .od0 = arrayOfFloat + 1; this.Rv0 = 0.0F; this.Hs0 = false; this.FE0 = null; }  } else if (this
/* 101 */         .FE0 == null) { this.dS.strictfp(); Quad quad = Quad.INOUT;
/*     */         
/* 103 */         (Wz0.gq(this.Fk[this.od0 - 1], 4, 0.5F).qw0(0.0F, 0.0F, 0.0F))
/* 104 */           .st = (i0)quad;
/* 105 */         arrayOfFloat[0] = color.r; arrayOfFloat[1] = color.g; float[] arrayOfFloat; Color color; (arrayOfFloat = new float[4])[2] = (color = this.Nul).b; (Wz0.gq(this.Nul, 0, 0.5F).qY(new float[] { 0, 0, 0, 0.0F
/* 106 */             }))st = (i0)quad;
/* 107 */         this.FE0 = so; So so; (so = So.k60().L5().PL(Wz0.gq(this.Fk[this.od0 - 1], 9, 0.5F).a(0.0F)).PL(Wz0.gq(this.Fk[this.od0 - 1], 4, 0.5F).qw0(0.0F, 0.0F, 0.0F)).PL(Wz0.gq(this.Nul, 0, 0.5F).qY(new float[] { 0, 0, 0, 0.0F })).Kr().PL(Wz0.OC(this::vI0))).mg(super.Rv0); }  }  if (this.Fd == 2) { if (!this.Hs0) { this.dS.strictfp(); this.dS.L40(this.LPT7); this.LPT7.start(); this.mV
/* 108 */           .w40
/* 109 */           .ra0(); du0 du01;
/* 110 */         (du01 = this.mV).getClass();
/*     */         Jo jo;
/* 112 */         if ((jo = km.a3.Ct) != null)
/* 113 */         { float f; du01.Cl0
/* 114 */             .Ho0 = true;
/* 115 */           du01.Cl0.TG0 = true;
/* 116 */           sA
/* 117 */             .RT
/* 118 */             .R7(); sA.Dl0(15.0F);
/* 119 */           String[] arrayOfString = Ml0.EH0;
/* 120 */           (sA.IR(Ml0.tG((byte)2, F40.ef0, 32, 4, arrayOfString)).Xs0())
/* 121 */             .Ox.wP();
/*     */           SA sA;
/* 123 */           nJ0 nJ0 = (sA = du01.Cl0.Dv0).fe(jo.ED0, "trainer-name"); if (km.XU()) { f = 10.0F; } else { f = 150.0F; }  (nJ0.fa0(f))
/* 124 */             .Ox.wP();
/* 125 */           (sA.S7(new JG0()).sV())
/* 126 */             .Ox.wP();
/*     */ 
/*     */ 
/*     */           
/* 130 */           (sA.IR(Ml0.Go(1603, NumberFormat.getInstance().format((km.u4.Lz.SZ / 3600)))))
/* 131 */             .Ox.wP();
/* 132 */           YA0 yA0 = du01.Cl0;
/* 133 */           du01.si(yA0, du01.Ub());
/*     */           
/* 135 */           du01.Ea0 = jo.Eh0; (du01.Uc0 = new Dn0(du01, jo))
/* 136 */             .Ng0 = lPT9.jR;
/* 137 */           (new Dn0(du01, jo)).Dd = 2;
/* 138 */           du01.Cl0.mM(); }  this
/* 139 */           .Nul.set(1.0F, 1.0F, 1.0F, 0.0F); (this.FE0 = So.k60()).eC(); uT[] arrayOfUT2; for (byte b1 = 0; b1 < (arrayOfUT2 = this.Fk).length; ) { uT uT1; (uT1 = arrayOfUT2[b1]).hA0(1.0F, 1.0F, 1.0F, 1.0F); arrayOfUT2[b1].Bp(1.0F, 1.0F, 1.0F, 1.0F); eo eo1; float f5 = (eo1 = RP).x; float f6; f5 = (f6 = b1) * 1.0F + f5; if (b1 > 2) { f7 = 0.3F; } else { f7 = 0.0F; }  f5 += f7; float f7 = eo1.y + 5.0F, f8 = eo1.z; uT1.WQ(f5, f7, f8);
/*     */           
/*     */           F4 f4;
/* 142 */           if ((f4 = (F4)uT1.Os0.cOM1(F4.Qr0)) != null) f4.A8 = 0.0F;
/*     */           
/* 144 */           ((Wz0)Wz0.xX.al()).sn0(null, -1, 0.0F);
/* 145 */           this.FE0.PL((Wz0)((Wz0)Wz0.xX.al()).Vq(0.1F)); So so = this.FE0; Wz0 wz0 = Wz0.gq(uT1, 4, 0.1F); f6 = eo1.x; f6 = f6 * 0.8F + f6; if (b1 > 2) { f7 = 0.3F; } else { f7 = 0.0F; }  float f1 = f6 + f7, f2 = eo1.y, f3 = eo1.z; (wz0.qw0(f1, f2, f3))
/* 146 */             .st = (i0)Quad.INOUT;
/* 147 */           so.PL(wz0.qw0(f1, f2, f3)); b1++; }  this.FE0.Kr(); this.FE0.L5(); uT[] arrayOfUT1; int i; byte b2; for (i = (arrayOfUT1 = this.Fk).length, b2 = 0; b2 < i; ) { uT uT1 = arrayOfUT1[b2]; this.FE0.eC(); (Wz0.gq(uT1, 11, 0.3F).a(0.0F))
/* 148 */             .st = (i0)Quad.INOUT;
/* 149 */           this.FE0.PL(Wz0.gq(uT1, 11, 0.3F).a(0.0F)); this.FE0.PL(Wz0.OC(uT1::kC)); this.FE0.Kr(); b2++; }  this.FE0.Kr(); this.FE0.L5(); (Wz0.gq(this.Nul, 0, 0.5F).qY(new float[] { 1.0F, 1.0F, 1.0F, 1.0F
/* 150 */             }))st = (i0)Quad.INOUT;
/* 151 */         this.FE0.PL(Wz0.gq(this.Nul, 0, 0.5F).qY(new float[] { 1.0F, 1.0F, 1.0F, 1.0F })); this.FE0.Kr(); this.FE0.mg(super.Rv0); this.Hs0 = true; }  if (this.Rv0 > 10.0F) { this
/* 152 */           .Fd++; this.Rv0 = 0.0F; this.Hs0 = false; this.FE0 = null; }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   public final void S50() {
/*     */     super.S50();
/*     */     this.Fd = 0;
/*     */     this.Rv0 = 0.0F;
/*     */     this.od0 = 0;
/*     */     this.Hs0 = false;
/*     */   }
/*     */   
/*     */   public final void update() {
/*     */     super.update();
/*     */     int i;
/*     */     int j;
/*     */     UA0[] arrayOfUA0;
/*     */     if ((i = this.Fd) == 1 && (j = this.od0) < (arrayOfUA0 = this.z0).length) {
/*     */       arrayOfUA0[j].run();
/*     */       this.Fk[this.od0].SG0(this.Km);
/*     */       this.Fk[this.od0].Gz();
/*     */     } else if (i == 2) {
/*     */       UA0[] arrayOfUA01;
/*     */       for (i = 0; i < (arrayOfUA01 = this.z0).length; i++) {
/*     */         arrayOfUA01[i].run();
/*     */         this.Fk[i].SG0(this.Km);
/*     */         this.Fk[i].Gz();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean ng() {
/*     */     return (this.Fd == 3);
/*     */   }
/*     */   
/*     */   public final void Ws() {
/*     */     this.Fd = 3;
/*     */   }
/*     */   
/*     */   public final void tc0() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: dup
/*     */     //   2: getfield N6 : Lf/JX;
/*     */     //   5: invokevirtual Tx : ()V
/*     */     //   8: getfield Fd : I
/*     */     //   11: dup
/*     */     //   12: istore_1
/*     */     //   13: ifne -> 19
/*     */     //   16: goto -> 257
/*     */     //   19: iload_1
/*     */     //   20: iconst_2
/*     */     //   21: if_icmpne -> 252
/*     */     //   24: aload_0
/*     */     //   25: dup
/*     */     //   26: getfield N6 : Lf/JX;
/*     */     //   29: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   32: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*     */     //   35: getfield cOM3 : [Lcom/badlogic/gdx/graphics/Texture;
/*     */     //   38: dup
/*     */     //   39: astore_1
/*     */     //   40: arraylength
/*     */     //   41: iconst_1
/*     */     //   42: if_icmpne -> 74
/*     */     //   45: aload_0
/*     */     //   46: aload_1
/*     */     //   47: iconst_0
/*     */     //   48: aaload
/*     */     //   49: astore_1
/*     */     //   50: getfield N6 : Lf/JX;
/*     */     //   53: aload_1
/*     */     //   54: aload_0
/*     */     //   55: dup
/*     */     //   56: getfield r9 : I
/*     */     //   59: i2f
/*     */     //   60: fstore_0
/*     */     //   61: getfield hr : I
/*     */     //   64: i2f
/*     */     //   65: fstore_1
/*     */     //   66: fconst_0
/*     */     //   67: fconst_0
/*     */     //   68: fload_0
/*     */     //   69: fload_1
/*     */     //   70: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*     */     //   73: return
/*     */     //   74: aload_0
/*     */     //   75: fconst_1
/*     */     //   76: fstore_1
/*     */     //   77: getfield rK0 : I
/*     */     //   80: dup
/*     */     //   81: istore_2
/*     */     //   82: iconst_1
/*     */     //   83: if_icmpge -> 88
/*     */     //   86: iconst_1
/*     */     //   87: istore_2
/*     */     //   88: aload_0
/*     */     //   89: dup
/*     */     //   90: iload_2
/*     */     //   91: i2f
/*     */     //   92: fstore_2
/*     */     //   93: getfield hr : I
/*     */     //   96: i2f
/*     */     //   97: fstore_3
/*     */     //   98: getfield hF : I
/*     */     //   101: dup
/*     */     //   102: istore #4
/*     */     //   104: iconst_1
/*     */     //   105: if_icmpge -> 111
/*     */     //   108: iconst_1
/*     */     //   109: istore #4
/*     */     //   111: aload_0
/*     */     //   112: fload_1
/*     */     //   113: fload_3
/*     */     //   114: iload #4
/*     */     //   116: i2f
/*     */     //   117: fdiv
/*     */     //   118: fload_2
/*     */     //   119: fmul
/*     */     //   120: invokestatic max : (FF)F
/*     */     //   123: f2i
/*     */     //   124: istore_1
/*     */     //   125: getstatic f/zm0.Tg : J
/*     */     //   128: ldc2_w 22000000
/*     */     //   131: ldiv
/*     */     //   132: iload_1
/*     */     //   133: i2l
/*     */     //   134: lrem
/*     */     //   135: l2i
/*     */     //   136: ineg
/*     */     //   137: putfield EM : I
/*     */     //   140: aload_0
/*     */     //   141: getfield EM : I
/*     */     //   144: aload_0
/*     */     //   145: getfield r9 : I
/*     */     //   148: if_icmpge -> 295
/*     */     //   151: aload_0
/*     */     //   152: getfield cOM3 : [Lcom/badlogic/gdx/graphics/Texture;
/*     */     //   155: dup
/*     */     //   156: astore_1
/*     */     //   157: arraylength
/*     */     //   158: istore_2
/*     */     //   159: iconst_0
/*     */     //   160: istore_3
/*     */     //   161: iload_3
/*     */     //   162: iload_2
/*     */     //   163: if_icmpge -> 140
/*     */     //   166: aload_0
/*     */     //   167: dup
/*     */     //   168: dup2
/*     */     //   169: aload_1
/*     */     //   170: iload_3
/*     */     //   171: aaload
/*     */     //   172: dup
/*     */     //   173: astore #4
/*     */     //   175: invokevirtual getWidth : ()I
/*     */     //   178: i2f
/*     */     //   179: fstore #5
/*     */     //   181: getfield hr : I
/*     */     //   184: i2f
/*     */     //   185: aload #4
/*     */     //   187: invokevirtual getHeight : ()I
/*     */     //   190: i2f
/*     */     //   191: fdiv
/*     */     //   192: fload #5
/*     */     //   194: fmul
/*     */     //   195: fconst_1
/*     */     //   196: swap
/*     */     //   197: invokestatic max : (FF)F
/*     */     //   200: f2i
/*     */     //   201: istore #5
/*     */     //   203: getfield N6 : Lf/JX;
/*     */     //   206: aload #4
/*     */     //   208: aload_0
/*     */     //   209: iload #5
/*     */     //   211: aload_0
/*     */     //   212: getfield EM : I
/*     */     //   215: i2f
/*     */     //   216: fstore #4
/*     */     //   218: i2f
/*     */     //   219: fstore #6
/*     */     //   221: getfield hr : I
/*     */     //   224: i2f
/*     */     //   225: fstore #7
/*     */     //   227: fload #4
/*     */     //   229: fconst_0
/*     */     //   230: fload #6
/*     */     //   232: fload #7
/*     */     //   234: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*     */     //   237: getfield EM : I
/*     */     //   240: iload #5
/*     */     //   242: iadd
/*     */     //   243: putfield EM : I
/*     */     //   246: iinc #3, 1
/*     */     //   249: goto -> 161
/*     */     //   252: iload_1
/*     */     //   253: iconst_1
/*     */     //   254: if_icmpne -> 295
/*     */     //   257: aload_0
/*     */     //   258: dup
/*     */     //   259: getfield N6 : Lf/JX;
/*     */     //   262: aload_0
/*     */     //   263: getfield Nul : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   266: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*     */     //   269: getfield N6 : Lf/JX;
/*     */     //   272: aload_0
/*     */     //   273: getfield b : Lcom/badlogic/gdx/graphics/Texture;
/*     */     //   276: aload_0
/*     */     //   277: dup
/*     */     //   278: getfield r9 : I
/*     */     //   281: i2f
/*     */     //   282: fstore_1
/*     */     //   283: getfield hr : I
/*     */     //   286: i2f
/*     */     //   287: fstore_2
/*     */     //   288: fconst_0
/*     */     //   289: fconst_0
/*     */     //   290: fload_1
/*     */     //   291: fload_2
/*     */     //   292: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*     */     //   295: aload_0
/*     */     //   296: dup
/*     */     //   297: dup2
/*     */     //   298: getfield N6 : Lf/JX;
/*     */     //   301: invokevirtual end : ()V
/*     */     //   304: invokevirtual Tn0 : ()V
/*     */     //   307: getfield COm7 : Lf/nf;
/*     */     //   310: invokevirtual Js0 : ()V
/*     */     //   313: getfield Fd : I
/*     */     //   316: dup
/*     */     //   317: istore_1
/*     */     //   318: iconst_1
/*     */     //   319: if_icmpeq -> 359
/*     */     //   322: iload_1
/*     */     //   323: iconst_2
/*     */     //   324: if_icmpeq -> 330
/*     */     //   327: goto -> 385
/*     */     //   330: iconst_0
/*     */     //   331: istore_1
/*     */     //   332: iload_1
/*     */     //   333: aload_0
/*     */     //   334: getfield Fk : [Lf/uT;
/*     */     //   337: dup
/*     */     //   338: astore_2
/*     */     //   339: arraylength
/*     */     //   340: if_icmpge -> 385
/*     */     //   343: aload_0
/*     */     //   344: getfield pK : Lf/K70;
/*     */     //   347: aload_2
/*     */     //   348: iload_1
/*     */     //   349: aaload
/*     */     //   350: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   353: iinc #1, 1
/*     */     //   356: goto -> 332
/*     */     //   359: aload_0
/*     */     //   360: getfield od0 : I
/*     */     //   363: dup
/*     */     //   364: istore_1
/*     */     //   365: aload_0
/*     */     //   366: getfield Fk : [Lf/uT;
/*     */     //   369: dup
/*     */     //   370: astore_2
/*     */     //   371: arraylength
/*     */     //   372: if_icmpge -> 385
/*     */     //   375: aload_0
/*     */     //   376: getfield pK : Lf/K70;
/*     */     //   379: aload_2
/*     */     //   380: iload_1
/*     */     //   381: aaload
/*     */     //   382: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   385: aload_0
/*     */     //   386: dup
/*     */     //   387: dup
/*     */     //   388: dup2
/*     */     //   389: getfield dS : Lf/kg0;
/*     */     //   392: aload_0
/*     */     //   393: getfield Km : F
/*     */     //   396: invokevirtual TY : (F)V
/*     */     //   399: getfield dS : Lf/kg0;
/*     */     //   402: invokevirtual begin : ()V
/*     */     //   405: getfield dS : Lf/kg0;
/*     */     //   408: invokevirtual ZK0 : ()V
/*     */     //   411: getfield dS : Lf/kg0;
/*     */     //   414: invokevirtual end : ()V
/*     */     //   417: getfield pK : Lf/K70;
/*     */     //   420: aload_0
/*     */     //   421: getfield dS : Lf/kg0;
/*     */     //   424: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   427: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 77
/*     */     //   #2	-> 93
/*     */     //   #3	-> 98
/*     */     //   #4	-> 120
/*     */     //   #5	-> 125
/*     */     //   #6	-> 131
/*     */     //   #7	-> 175
/*     */     //   #8	-> 259
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/k3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */