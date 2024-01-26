/*  1 */ package f;public final class v90 extends cj { public nf gB; public kg0 dD0; public lpt1 W50; public UA0 tl; public oq LPT8; public UA0 ip0; public oq Zc0; public final void Wy() { super.Wy(); this.YL.IG0 = 0.0F; this.YL.el0 = 0.65F; this.YL.I70.TG0(0.0F, 0.0F, -1.8F); this.YL.mP(0.0F, 0.0F, 0.0F); Ih0 ih0; (ih0 = this.YL).Bj = 50.0F; this(ih0); gd gd; this.gB = new nf(100, gd); (this.dD0 = new kg0(this.YL))
/*    */       
/*  3 */       .vF = new ig(km.mI0.AN.TI.B8("/a/1/8/9"));
/*  4 */     this.dD0
/*  5 */       .SJ0
/*  6 */       .B9();
/*  7 */     this.RK0.Com3(this.gB); this.RK0.Com3(gd); this.RK0.Com3(this.dD0); } public zh0[] yE0; public ParticleEffectExt PU; public uX MK; public j40 ty0; public short Lr0; public So Ne0; public boolean t60; public v90(j40 paramj40, uX paramuX) { super(false); this.ty0 = paramj40; this.MK = paramuX; this.Lr0 = paramj40.qI0(); } public final void QA0() { q10.Rs.TG0(0.0F, 0.0F, -0.4F); q10.HF.TG0(0.0F, 0.0F, -0.4F); String str = "special/egg"; this.dD0.getClass(); try { particleEffectExt = this.dD0.PW("particle/" + str + ".vfx").copy(); } catch (Exception exception) { kg0.Zn.info("Couldn't load preload VFX " + particleEffectExt, exception); this(); }  this.PU = particleEffectExt; this.RK0.Com3(particleEffectExt); Wo wo = km.mI0.AN; eI eI = eI.Lj(); int[] arrayOfInt; (arrayOfInt = new int[3])[0] = 6; (new int[3])[1] = 7; (new int[3])[2] = 9; eI.getClass(); eI.L4(new ig(wo.TI.B8("/a/1/8/9")), 8, arrayOfInt).nl((String)(this.W50 = eI.L4(new ig(wo.TI.B8("/a/1/8/9")), 8, arrayOfInt)).lz.get(0), true); this.W50.k = 2.0F; int i = this.ty0.Zs.Vf0(); float f3 = 1.0F; byte b1 = 1; if (um0.Kt0
/*    */ 
/*    */       
/* 10 */       .rE0(this.ty0.s5(), i, false, this.ty0.Zs.tm0()))
/*    */     
/*    */     { 
/*    */       
/* 14 */       zh0[] arrayOfZh01 = um0.Kt0.H9(this.ty0.s5(), i, false, this.ty0.Zs.tm0());
/*    */       
/*    */       pe0[] arrayOfPe0;
/*    */       byte b;
/* 18 */       for (arrayOfPe0 = new pe0[i = (this.yE0 = um0.Kt0.H9(this.ty0.s5(), i, false, this.ty0.Zs.tm0())).length], b = 0; b < i; ) { arrayOfPe0[b] = arrayOfZh01[b].Uu0(); arrayOfZh01[b].lu(this); b++; }  this.LPT8 = oq.wU(arrayOfPe0[0]);
/* 19 */       f3 = 64.0F / (arrayOfPe0[0]).Vn0 * f3; } else { b1 = 2;
/*    */ 
/*    */ 
/*    */       
/* 23 */       this.tl = uA01; UA0 uA01; (uA01 = um0.Kt0.vt(this.ty0.s5(), i, false, this.ty0.Zs.tm0())).Zz(b1); this.RK0.Com3(this.tl); this.LPT8 = oq.wU(this.tl.OB0()); }
/*    */     
/* 25 */     i = um0.xJ0;
/*    */ 
/*    */     
/* 28 */     UA0 uA0 = um0.Kt0.vt(this.ty0.s5(), i, false, this.ty0.Zs.tm0()); this.RK0.Com3(uA0); um0 um0;
/*    */     zh0[] arrayOfZh0;
/* 30 */     if ((arrayOfZh0 = (um0 = um0.Kt0).O3) == null) {
/* 31 */       U70 u70; zh0 zh02; this(new r0(um0)); byte b; zh0[] arrayOfZh01; for (um0.O3 = new zh0[6], b = 0; b < (arrayOfZh01 = um0.O3).length; ) { this(u70, b * 32, 0, 32, 32); arrayOfZh01[b] = zh02; b++; }  zh01 = zh02;
/* 32 */     }  this(); ParticleEffectExt particleEffectExt; fQ fQ; zh0 zh01; int j; byte b2; for (j = zh01.length, b2 = 0; b2 < j; ) { fQ.Com3(zh01[b2].Uu0()); b2++; }  this.Zc0 = oq.wU(zh01[0].Uu0()); eo eo1; (eo1 = this.YL.I70).getClass();
/*    */ 
/*    */     
/* 35 */     eo3
/* 36 */       .getClass();
/* 37 */     float f5 = eo1.x, f6 = eo1.y, f7 = eo1.z; eo eo3; (eo3 = this.LPT8.PL).TG0(f5, f6, f7);
/* 38 */     this.LPT8.Ka0 = false;
/* 39 */     this.LPT8
/* 40 */       .PL
/* 41 */       .Tz(0.0F, -0.2F, 0.2F); this.LPT8.m20(f3 * 0.0125F / b1); (eo1 = (new eo(eo1)).Tz(-0.07F, 0.325F, 0.2F)).uD(0.0F, 0.3F, 0.0F);
/* 42 */     eo2
/* 43 */       .getClass();
/* 44 */     float f1 = eo1.x, f2 = eo1.y, f4 = eo1.z; eo eo2; (eo2 = this.Zc0.PL).TG0(f1, f2, f4);
/* 45 */     this.Zc0.Ka0 = false;
/* 46 */     this.Zc0.m20(0.0125F); this.az = 0.0F; nW(UB0.M60.fG0(), UB0.M60.dL()); String[] arrayOfString; (arrayOfString = new String[1])[0] = this.ty0.m(); this.MK
/*    */       
/* 48 */       .jq(Ml0.tG((byte)2, F40.wI, 260, 0, arrayOfString).replaceAll("\n", "")); km.pm0.bL((byte)2, (short)1010); km.pm0.Wk0((byte)2, (short)1011); boolean bool = false;
/*    */     kf kf;
/* 50 */     if ((kf = km.wI0.js0.BA) != null) kf
/* 51 */         .wI0(bool);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     So so1 = (So)((So)So.k60().eC().Vq(0.925F)).L5().PL(Wz0.gq(this.Zc0, 2, 0.125F).a(this.Zc0.PL.y + 0.1F)).PL(Wz0.gq(this.Zc0, 5, 0.125F).a(1.0F)).Kr().L5().PL(Wz0.gq(this.Zc0, 2, 0.125F).a(this.Zc0.PL.y - 0.05F)).PL(Wz0.gq(this.Zc0, 5, 0.125F).a(1.25F)).PL(Wz0.gq(this.Zc0, 6, 0.125F).a(1.0F)).Kr().L5().PL(Wz0.gq(this.Zc0, 2, 0.125F).a(this.Zc0.PL.y)).PL(Wz0.gq(this.Zc0, 6, 0.125F).a(1.25F)).Kr().Kr().Ck0(1, 0.925F);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     So so2 = (So)So.k60().eC().PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x - 0.02F)).PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x + 0.02F)).Kr().Ck0(4, 0.0F);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 73 */     So so3 = (So)So.k60().eC().PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x - 0.04F)).PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x + 0.04F)).Kr().Ck0(10, 0.0F);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 79 */     So so4 = (So)So.k60().eC().PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x - 0.06F)).PL(Wz0.gq(this.Zc0, 1, 0.05F).a(this.Zc0.PL.x + 0.06F)).Kr().Ck0(10, 0.0F), so5 = So.k60(); so5.eC().Zo0(so1).Zo0((So)so2.Vq(0.55F)).Zo0(so3).Zo0(so4)
/*    */ 
/*    */       
/* 82 */       .PL(Wz0.gq(this.Zc0, 1, 0.125F).a(this.Zc0.PL.x)).Kr(); this.Ne0.mg(this.Rv0); }
/*    */ 
/*    */   
/*    */   public final boolean ng() {
/*    */     if (this.az > 11.0F || this.MK.MI0)
/*    */       return true; 
/*    */   }
/*    */   
/*    */   public final void update() {
/*    */     super.update();
/*    */     if (this.MK.Bo0 == null) {
/*    */       uX uX1 = this.MK;
/*    */       js js;
/*    */       FO fO;
/*    */       if ((fO = (js = js.vu0).iV) != null)
/*    */         fO.ra0(); 
/*    */       js.iV = uX1;
/*    */       js.si(uX1, 0);
/*    */     } 
/*    */     this.W50.j10(this.az, null);
/*    */     UA0 uA02;
/*    */     if ((uA02 = this.tl) != null)
/*    */       UB0.Kg0.fN(uA02); 
/*    */     UA0 uA01;
/*    */     if ((uA01 = this.ip0) != null)
/*    */       UB0.Kg0.fN(this); 
/*    */   }
/*    */   
/*    */   public final void tc0() {
/*    */     zh0 zh01;
/*    */     this.pK.tx0(this.W50);
/*    */     byte b = 0;
/*    */     float f;
/*    */     if ((f = this.az) > 3.9F) {
/*    */       b = 5;
/*    */     } else if (f > 2.8F) {
/*    */       b = 4;
/*    */     } else if (f > 2.6F) {
/*    */       b = 3;
/*    */     } else if (f > 1.5F) {
/*    */       b = 2;
/*    */     } else if (f > 1.3F) {
/*    */       b = 1;
/*    */     } 
/*    */     um0 um0;
/*    */     zh0[] arrayOfZh0;
/*    */     if ((arrayOfZh0 = (um0 = um0.Kt0).O3) == null) {
/*    */       U70 u70;
/*    */       zh0 zh02;
/*    */       this(new r0(um0));
/*    */       byte b1;
/*    */       zh0[] arrayOfZh01;
/*    */       for (um0.O3 = new zh0[6], b1 = 0; b1 < (arrayOfZh01 = um0.O3).length; ) {
/*    */         this(u70, b1 * 32, 0, 32, 32);
/*    */         arrayOfZh01[b1] = zh02;
/*    */         b1++;
/*    */       } 
/*    */       zh01 = zh02;
/*    */     } 
/*    */     this.Zc0.rv0(zh01[b].Uu0());
/*    */     So so;
/*    */     if ((so = this.Ne0) != null && so.DD() && !this.PU.isInitialized() && this.Ne0.DD() && !this.PU.isInitialized()) {
/*    */       this.dD0.L40(this.PU);
/*    */       this.PU.init();
/*    */       this.PU.start();
/*    */       String str = (String)this.W50.lz.get(0);
/*    */       boolean bool = false;
/*    */       lpt1 lpt11;
/*    */       NY nY;
/*    */       HashMap hashMap;
/*    */       if ((hashMap = (lpt11 = this.W50).hI) != null && (nY = (NY)hashMap.get(str)) != null) {
/*    */         nY.lp0 = bool;
/*    */         lpt11.Qv0 = nY;
/*    */         lpt11.gE0 = 0.0F;
/*    */       } 
/*    */       float f1 = 16.0F;
/*    */       rf rf;
/*    */       if ((rf = this.W50.f2) != null) {
/*    */         float f2 = 0.0F;
/*    */         KI0 kI01 = rf.lY(str, 1, f1, null);
/*    */         KI0 kI02;
/*    */         if ((kI02 = rf.hm) == null || kI02.lV == 0) {
/*    */           rf.zm0(kI01, f2);
/*    */         } else {
/*    */           if ((kI02 = rf.Ys0) != null)
/*    */             rf.EI0.free(kI02); 
/*    */           rf.Ys0 = kI01;
/*    */           rf.Nul = f2;
/*    */           if ((kI01 = rf.hm).lV < 0)
/*    */             kI01.lV = 1; 
/*    */         } 
/*    */       } 
/*    */       f1 = -4.0F;
/*    */       if ((rf = this.W50.f2) != null) {
/*    */         float f2 = 0.0F;
/*    */         KI0 kI01 = rf.lY(str, 1, f1, null);
/*    */         KI0 kI02;
/*    */         if ((kI02 = rf.hm) == null || kI02.lV == 0) {
/*    */           rf.zm0(kI01, f2);
/*    */         } else {
/*    */           if ((kI02 = rf.Ys0) != null)
/*    */             rf.EI0.free(kI02); 
/*    */           rf.Ys0 = kI01;
/*    */           rf.Nul = f2;
/*    */           if ((kI01 = rf.hm).lV < 0)
/*    */             kI01.lV = 1; 
/*    */         } 
/*    */       } 
/*    */       this.Ne0 = null;
/*    */     } 
/*    */     if (this.az > 8.0F && !this.t60) {
/*    */       this.t60 = true;
/*    */       lpt1 lpt11;
/*    */       String str = (String)(lpt11 = this.W50).lz.get(0);
/*    */       boolean bool = false;
/*    */       NY nY;
/*    */       HashMap hashMap;
/*    */       if ((hashMap = this.W50.hI) != null && (nY = (NY)hashMap.get(str)) != null) {
/*    */         nY.lp0 = bool;
/*    */         lpt11.Qv0 = nY;
/*    */         lpt11.gE0 = 0.0F;
/*    */       } 
/*    */       byte b1 = 2;
/*    */       if ((nY = this.W50.Qv0) != null)
/*    */         for (Hc0 hc0 = nY.x7.r30(); hc0.hasNext();)
/*    */           ((xX)hc0.next()).gB = b1;  
/*    */     } 
/*    */     if ((so = this.Ne0) != null && !so.DD()) {
/*    */       this.Zc0.Yv0(0.0F, 0.0F, 0.0F, 0.0F);
/*    */       this.Zc0.m40();
/*    */       this.gB.Zx(this.Zc0);
/*    */     } else {
/*    */       this.LPT8.m40();
/*    */       this.gB.Zx(this.LPT8);
/*    */       short s;
/*    */       if (this.az > 8.0F && (s = this.Lr0) > 0) {
/*    */         D0.MJ0(s);
/*    */         this.Lr0 = 0;
/*    */         this.LPT8.Yv0(0.0F, 0.0F, 0.0F, 0.0F);
/*    */         String[] arrayOfString;
/*    */         (arrayOfString = new String[1])[0] = this.ty0.m();
/*    */         this.MK.jq(Ml0.tG((byte)2, F40.wI, 260, 1, arrayOfString));
/*    */       } 
/*    */     } 
/*    */     this.gB.Js0();
/*    */     this.dD0.update();
/*    */     this.dD0.begin();
/*    */     this.dD0.ZK0();
/*    */     this.dD0.end();
/*    */     this.pK.tx0(this.dD0);
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.MK.ra0();
/*    */     km.pm0.Wk0((byte)0, (short)0);
/*    */     this.W50.Ea0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/v90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */