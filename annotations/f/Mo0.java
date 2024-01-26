/*  1 */ package f;public final class Mo0 extends jp0 { public static final ik cOM2 = C00.gd(Mo0.class); public Ah[][] Su0 = null; public int N60 = 0; public boolean Et; public lw fG0; public Mo0(BE paramBE) { super(paramBE); } public final void L00() { super.L00(); this.wg = yE0.a0; this.DE0 = new wI0(); String str1 = Lpt3.La0(); String str2 = Lpt3.h40(); wI0 wI0 = this.DE0; this(str1, str2, wI0); xh xh; Color color2; eo eo; (new xh()).Ug0 = 1; (new xh()).hX = 5; (new xh()).xu = 16; this.E40 = new K70(new Lpt3(xh, this.DE0), new lt()); Color color1 = Color.BLACK.cpy(); this(269509375); Color color3 = Color.WHITE.cpy(); this(-0.14440918F, -0.8474426F, -0.0038757324F); this.fG0 = new lw(new Color(-1112031745), new Color(1936946175), this, color2, color3, eo); } public final boolean rS(byte paramByte, eo parameo, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { lpt1 lpt1; boolean bool; int i = this.w6 ^ true; vh0 vh0; if ((vh0 = km.a3) == null) i = 1;  if (i == 0) { KI kI; if (!(kI = vh0.Jr0() instanceof Cy)) return true;  me me; if ((kI = kI) == null || (((me = this.oo0) == null) ? 0 : me.h20()) != ((Cy)kI).br0
/*  2 */         .Ga) i = 1;  }  if (i != 0) { UB0.Kg0.fN(new UC(this, paramByte, parameo, paramInt, paramBoolean1, paramBoolean2, paramBoolean3)); return true; }  float f = Float.MAX_VALUE; vh0 = null; if (paramByte != 4) { bool = true; } else { bool = false; }  for (Hc0 hc0 = this.wN.r30(); hc0.hasNext();) { for (Hc0 hc01 = ((Ah)hc0.next()).W7.r30(); hc01.hasNext(); ) { lpt1 lpt11 = (lpt1)hc01.next(); if ((paramBoolean1 && !lpt11.Zl0.contains("door") && (paramBoolean2 || !lpt11.Zl0.contains("badgegate")) && (paramBoolean2 || !lpt11.Zl0.contains("elevator"))) || (paramBoolean3 && !paramBoolean2 && paramBoolean1 && lpt11.Zl0.contains("badgegate"))) continue;  Eb eb; parameo.y = (eb = lpt11.Of).pp0.y; if (lpt11.Zl0.equals("p_door") || lpt11.Zl0.equals("kk_door3")) { Eb eb1; this(eb); (new Eb()).kX((new Eb()).pp0.uD(0.0F, 0.0F, 0.125F), eb1.s60.Tz(0.0F, 0.0F, 0.125F)); eb = eb1; }  eo3.getClass();
/*  3 */         float f3 = parameo.x, f4 = parameo.y, f5 = parameo.z; eo eo3; (eo3 = this.dH0.pp0).TG0(f3, f4, f5)
/*  4 */           .ky0(0.125F); eo2.getClass();
/*  5 */         float f2 = parameo.x; f4 = parameo.y; f5 = parameo.z; eo eo2; (eo2 = this.dH0.s60).TG0(f2, f4, f5)
/*  6 */           .r9(0.125F); eo eo1 = this.dH0.pp0; this.dH0.kX(eo1, this.dH0.s60);
/*    */         
/*  8 */         float f1 = lpt11.Of.sD.x;
/*  9 */         f4 = lpt11.Of.sD.y;
/* 10 */         f5 = lpt11.Of.sD.z;
/* 11 */         if ((eb.r10(this.dH0) || parameo.Kw0() || !paramBoolean1) && (!bool || paramInt < lpt11.lz.Z8) && (f1 = parameo.Cl0(f1, f4, f5)) < f) { f = f1; lpt1 = lpt11; }  }  }  if (lpt1 != null) { eo eo1; float f1; boolean bool1; switch (paramByte)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         default:
/* 20 */           return true;case 4: this(); lpt1.mh.on0(this); if (paramInt == 1) { if ((f1 = this.y) <= -90000.0F) this.y = f1 + 100000.0F;  } else if ((f1 = this.y) > -90000.0F) { this.y = f1 - 100000.0F; }  lpt1.mh.b8(this);case 3: lpt1.uq();case 2: lpt1.k = 1.0E8F; lpt1.rd(paramInt, false, null);case 0: case 1: break; }  if (paramBoolean1 && paramBoolean2 && paramInt == 0) { lpt1.k = 1.0E8F; } else { lpt1.k = 1.0F; }  if (f1 == 1) { bool1 = true; } else { bool1 = false; }  lpt1.rd(paramInt, bool1, null); if (paramInt == 0 && paramBoolean1 && paramBoolean3) { (So.k60().L5().PL(Wz0.gq(((jp0)this).To0, 7, 1.5F).a(((jp0)this).To0.el0 / 2.0F)).PL(Wz0.gq(((jp0)this).To0, 6, 1.5F).a(((jp0)this).To0.IG0 + 10.0F)).Kr()).C00 = ((jp0)this).RC; ((jp0)this).wI = (So)So.k60().L5().PL(Wz0.gq(((jp0)this).To0, 7, 1.5F).a(((jp0)this).To0.el0 / 2.0F)).PL(Wz0.gq(((jp0)this).To0, 6, 1.5F).a(((jp0)this).To0.IG0 + 10.0F)).Kr().mg(km.wI0.pB0); }  if (paramBoolean1) { short s; byte b = 4; if (paramInt == 0) { bool1 = true; } else { bool1 = false; }  fn fn; if ((fn = lpt1.NT) == null) { s = -1; } else { s = s.oO; }  if (s != 2) { if (s != 3) { if (bool1) { s = 1540; } else { s = 1541; }  } else { s = 1499; }  } else { s = 1543; }  if (paramBoolean2 && bool1) return false;  if (s > 0) km.pm0.bA0(true, b, s, 0.0F);  }  }  return false; } public final void YR(Cy paramCy) { if (!this.w6) { int i; lw lw1; if (paramCy.br0.kJ() || paramCy.xk0.sa0 == 56 || (paramCy.br0.d8 & 0xFF) == 202) { i = 1; } else { i = 0; }  if (i) { i = 39; km.mI0.AN.r70.WE0[i].getClass(); i = L70.gq.Rr0() * 60; i = eA0.W70(L70.gq.Zi0() % 3600 / 60 + i); lw1 = (km.mI0.AN.r70.WE0[i]).R10[i]; } else { lw1 = this.fG0; }  this.Cc0 = lw1; tJ(); }  if (this.E4) yB(paramCy.Cd, this.w6 ^ true);  Hb0(); if (!this.w6)
/* 21 */       tJ();  L70 l70; if (this.N60 != (l70 = L70.gq).CE0()) { Hc0 hc0; for (this.N60 = l70.CE0(), hc0 = this.wN.r30(); hasNext();) { for (Hc0 hc01 = ((Ah)next()).W7.r30(); hc01.hasNext();) { if ((fn = (lpt1 = (lpt1)hc01.next()).NT) != null && fn.r1 == 8) { lpt1.uq(); switch (Zk0.yE(L70.gq.CE0())) { default: continue;case 3: case 4: lpt1
/* 22 */                   .rd(3, true, null); continue;case 2: lpt1.rd(2, true, null); continue;case 1: lpt1.rd(1, true, null); continue;case 0: break; }  lpt1.rd(0, true, null); }  }  }  }  } public final void yB(yE0 paramyE0, boolean paramBoolean) { if ((!Bz.WZ && (Bz.fn || km.D70(8))) || !this.E4) paramyE0 = yE0.ne;  ParticleEffectExt particleEffectExt; if ((((particleEffectExt = this.j40) != null && paramBoolean) || paramyE0 == null || this.wg != paramyE0) && particleEffectExt != null) if (paramBoolean) { this.Zg.pf0(); this.j40 = null; } else if (!particleEffectExt.isComplete()) { Hc0 hc0 = this.j40.getControllers().r30(); while (hc0.hasNext()) ((RegularEmitter)((ParticleController)hc0.next()).emitter).setEmissionMode(RegularEmitter.EmissionMode.EnabledUntilCycleEnd);  }   if (Bz.fn && UB0.PU.j2(93) && this.j40 != null) { this.Zg.pf0(); this.j40 = null; }  this.Zg.iy(); this.wg = paramyE0; if ((particleEffectExt = this.j40) != null && particleEffectExt.isComplete()) this.j40 = null;  if (paramBoolean) return;  if (this.j40 == null && paramyE0 != null) { int i; if ((i = paramyE0.ordinal()) != 7 && i != 17) if (i != 41) { ParticleEffectExt particleEffectExt1; kg0 kg0; String str; if (i != 27) { if (i != 28) { switch (i) { default: switch (i) { default: return;case 43: case 44: kg0 = this.Zg; str = "weather/heavy_snow"; break;case 45: break; } case 25: kg0 = this.Zg; str = "weather/hail"; break;case 22: (this.j40 = this.Zg.gi0("weather/heavy_rain")).start(); this.Zg.L40(this.j40); this.YK = particleEffectExt1 = this.Zg.gi0("weather/thunder"); this.Zg.L40(this);case 21: kg0 = ((jp0)this).Zg; str = "weather/heavy_rain"; break;case 24: case 20: kg0 = ((jp0)this).Zg; str = "weather/rain"; break;case 23: kg0 = ((jp0)this).Zg; str = "weather/snow"; break; }  } else { kg0 = ((jp0)this).Zg; str = "weather/sandstorm"; }  } else { kg0 = ((jp0)this).Zg; str = "weather/ash"; }  (((jp0)this).j40 = kg0.gi0(str)).start(); ((jp0)this).Zg.L40(((jp0)this).j40); }   }  } public final void Ap0() { vh0 vh0; if ((vh0 = km.a3) == null || vh0.Ct == null || !km.u4.sU || !(km.a3.Jr0() instanceof hB0)) return;  super.Ap0(); k1(); hB0 hB0 = (hB0)km.a3.Jr0(); float f1 = this.lPT1.r, f2 = this.lPT1.g, f3 = this.lPT1.b, f4 = this.lPT1.a; UB0.go.glClearColor(f1, f2, f3, f4); UB0.go.glClear(16640); eo eo = km.a3.Ct.pm.cOm3; Cy cy; if ((cy = this.K60) == null || cy != hB0 || (cy.IY && ud.Bp().yF() >= 255)) { boolean bool1; L70.gq.oh0.jn0 = 0L; if ((cy = this.K60) != null && cy.IY) { cy.IY = false; cy.t8(); }  this.K60 = hB0; lF0 lF0; this.Su0 = new Ah[(lF0 = hB0.xk0).X7][lF0.cB0];
/* 23 */       Wx0.i4
/* 24 */         .TV(); for (Hc0 hc02 = this.wN.r30(); hc02.hasNext(); ((Ah)hc02.next()).dispose()); this.wN.clear(); this.l1
/* 25 */         .aB0
/* 26 */         .vO(); this.XT = -1; this.G50 = -1; if (km.MR == null && km.wI0
/* 27 */         .K00 == null)
/*    */       
/* 29 */       { bool1 = hB0.E10;
/* 30 */         km.pm0.Wk0(bool1, hB0.zu()); }  if (hB0
/* 31 */         .br0
/* 32 */         .kJ() || 
/* 33 */         hB0.xk0.sa0 == 56 || (
/* 34 */         hB0.br0
/* 35 */         .d8 & 0xFF) == 202) { bool1 = true; } else { bool1 = false; }
/* 36 */        Xi.WB = bool1;
/* 37 */       ((s20)this.l1.aB0)
/*    */         
/* 39 */         .HC0
/* 40 */         .t9(); qA0 qA0;
/* 41 */       (qA0 = h3.AZ.iC()).getClass(); for (; qA0.hasNext(); ((lpt1)qA0.next()).Ea0()); for (Hc0 hc01 = h3.jS.r30(); hc01.hasNext(); ((Iq)hc01.next()).dispose()); h3.jS.clear(); h3.AZ.clear();
/* 42 */       km.iE0.Hf0(); }  me me; if ((((me = this.oo0) == null) ? 0 : me.h20()) != 
/* 43 */       hB0.br0
/* 44 */       .Ga || (
/* 45 */       km.D70(1) && 
/* 46 */       UB0.PU.Ak(129) && UB0.PU.j2(92))) { if ((me = this.oo0) != null) { me.dispose(); this.oo0 = null; }
/* 47 */        switch (hB0.br0
/* 48 */         .Ga) { default: this(hB0); this.oo0 = me; break;case 248: super(hB0); this.oo0 = me; break;case 180: super(hB0); this.oo0 = me; break;case 173: super(hB0); this.oo0 = me; break;case 141: super(hB0); this.oo0 = me; break;case 139: super(hB0); this.oo0 = me; break;case 135: super(hB0); this.oo0 = me; break;case 80: super(hB0, this.DE0); this.oo0 = me; break;case 61: super(hB0); this.oo0 = me; break; }  }  int i = 0, j = 0; boolean bool; int k;
/* 49 */     if ((bool = hB0.et0) > 0 && (
/* 50 */       k = hB0.ey) > 0)
/*    */     { lF0 lF0;
/*    */       
/* 53 */       i = (int)((eo.x - (lF0 = hB0.xk0).ju) / bool); j = (int)((eo.y - lF0.km0) / k); }  if (this.XT != i || this.G50 != j) { this.XT = i; this.G50 = j; }  HV hV; if (this.Lz0 != (
/* 54 */       hV = hB0.eX)) this
/* 55 */         .Lz0 = hV; 
/* 56 */     System.nanoTime(); bool = false; byte b;
/* 57 */     for (k = Math.max(0, i - (b = 1)); k <= i + b; ) { for (int m = Math.max(0, j - b); m <= j + b; ) { QJ qJ; if (k >= 0 && m >= 0 && (qJ = hB0.C20(k, m)) != null && this.Su0[k][m] == null) { iy0 iy0 = hB0.GF(k, m); this(iy0, (yU)qJ.gT()); Ah ah; (ah = new Ah()).ej0(this.Cc0); lF0 lF0; if ((lF0 = this.l1.Sk(iy0.F70)) != null) { float f5 = (k * 8 + 4); f5 = lF0.ju * 0.25F + f5; float f6 = lF0.Dk(k, m), f7 = (m * 8 + 4); ah.w3.Tz(f5, f6, lF0.km0 * 0.25F + f7); }  ah.hj0(); this.Su0[k][m] = ah; this.wN.Com3(ah); D d; (d = D.N2)
/* 58 */             .vt
/* 59 */             .d();
/* 60 */           if (D.hS() && D.N2.l00 != null) {
/* 61 */             JG0 jG0; if ((jG0 = d.ni) != null) d.hp.Ct(jG0, true);  d.ni = null; d.du0(); d
/* 62 */               .l00.dispose(); d.hp.Ct(d.l00, true);
/* 63 */           }  ah.K9
/* 64 */             .OU = 1.0F;
/* 65 */           ah.K9.Zr0 = 1.0F; ah.K9.gE0 = 1.0F; bool = true; }  m++; }  k++; }  if (bool && 
/* 66 */       km.D70(1))
/*    */     
/* 68 */     { System.nanoTime();
/* 69 */       cOM2.getClass(); }  this
/* 70 */       .E40.mx0(zf0()); PL0(); Pw.Zo("PSYS.draw"); this.Zg.begin(); this.Zg.iy(); this.Zg.ZK0(); this.Zg.end(); Pw.yy0("PSYS.draw"); this.E40.tx0(this.Zg);
/* 71 */     if ((hB0.Cd == 
/* 72 */       yE0.RG || hB0
/* 73 */       .lpT1) && 
/* 74 */       km.u4
/* 75 */       .Ta0 != 7) { this
/* 76 */         .fY.JL(this.To0.I70); this.fY.y += 0.25F; if (this.Bu0 < 1.0F) this.Bu0 = 1.0F;  if (this.Bu0 > 5.0F) this.Bu0 = 5.0F;  this.T60.mh.WU(); eo eo1 = this.To0.I70, eo2 = this.To0.H, eo3 = this.To0.nj0; this.T60.mh.Cj(eo1, eo2, eo3); this.T60.mh.b8(this.fY); this.T60.mh.N8(eo.X, 90.0F); this.T60.mh.GJ(this.Bu0 * 1.25F, this.Bu0 * 1.25F, this.Bu0 * 1.25F); this.E40.Ly0(); this.E40.tx0(this.T60); }  this.E40.end(); km.iE0.getClass(); }
/*    */ 
/*    */   
/*    */   public final void rJ() {}
/*    */   
/*    */   public final void YB(Jo paramJo, Ih0 paramIh0, boolean paramBoolean) {
/*    */     int i, m;
/*    */     eo eo2 = paramJo.pm.cOm3;
/*    */     if (this.qK0) {
/*    */       if (this.sf0 == null)
/*    */         this.sf0 = eo2; 
/*    */       eo2 = this.sf0;
/*    */     } 
/*    */     float f4 = eo2.z * 0.25F + 0.1F;
/*    */     this.tM.TG0(eo2.x * 0.25F, f4, eo2.y * 0.25F + 0.1F);
/*    */     eo eo1 = this.tM;
/*    */     tr tr;
/*    */     int k;
/*    */     if ((k = (tr = tr.Jv).hn0) % 2 == 0) {
/*    */       m = tr.fm;
/*    */     } else {
/*    */       m = -tr.fm;
/*    */     } 
/*    */     float f8 = m * 0.02F;
/*    */     if (k % 2 == 0) {
/*    */       i = tr.Am;
/*    */     } else {
/*    */       i = -i.Am;
/*    */     } 
/*    */     eo1.uD(f8, 0.0F, i * 0.02F);
/*    */     float f3 = wJ0.Nf0.tJ0(), f6 = wJ0.Nf0.yc0();
/*    */     this.tM.Tz(f3, 0.0F, f6);
/*    */     paramIh0.Ce0 = 0.5F;
/*    */     f3 = 100.0F;
/*    */     switch (this.wg.ordinal()) {
/*    */       case 35:
/*    */         f3 = paramIh0.el0 + 4.5F;
/*    */         break;
/*    */       case 28:
/*    */         f3 = paramIh0.el0 + 3.0F;
/*    */         break;
/*    */       case 27:
/*    */       case 37:
/*    */         f3 = paramIh0.el0 + 5.0F;
/*    */         break;
/*    */       case 25:
/*    */       case 32:
/*    */         f3 = paramIh0.el0 + 2.5F;
/*    */         break;
/*    */       case 21:
/*    */       case 24:
/*    */       case 43:
/*    */       case 44:
/*    */         f3 = paramIh0.el0 + 6.0F;
/*    */         break;
/*    */     } 
/*    */     if (!this.w6 || this.K60 == null)
/*    */       paramIh0.l6 = f3; 
/*    */     int j;
/*    */     if ((j = (f6 = paramIh0.l6) cmp f3) != 0)
/*    */       if (j > 0) {
/*    */         paramIh0.l6 = Math.max(f6 - UB0.M60.Qy * 15.0F, f3);
/*    */       } else {
/*    */         paramIh0.l6 = Math.min(UB0.M60.Qy * 15.0F + f6, f3);
/*    */       }  
/*    */     hB0 hB0 = (hB0)km.a3.Jr0();
/*    */     G5 g5 = paramJo.HW;
/*    */     byte b = 0;
/*    */     Cy cy;
/*    */     if ((cy = this.K60) != null)
/*    */       b = cy.br0.et; 
/*    */     if (!this.Et)
/*    */       if (h1.hR && nx0.JC0(paramIh0.Bj, 15.0F)) {
/*    */         paramIh0.Bj = 10.5F;
/*    */       } else if (!h1.hR && !nx0.JC0(paramIh0.Bj, 15.0F)) {
/*    */         paramIh0.Bj = 15.0F;
/*    */       }  
/*    */     float f7 = 0.0F;
/*    */     if (b == 3 || b == 13) {
/*    */       paramIh0.IG0 = -25.0F;
/*    */       f7 = 0.75F;
/*    */     } 
/*    */     if (b == 2) {
/*    */       paramIh0.IG0 = -35.0F;
/*    */       paramIh0.el0 = 10.0F;
/*    */     } 
/*    */     if (!this.w6) {
/*    */       if (!this.Et)
/*    */         paramIh0.Bj = 15.0F; 
/*    */       paramIh0.el0 = 12.5F;
/*    */       paramIh0.IG0 = -56.0F;
/*    */       paramIh0.Mp = 0.0F;
/*    */       if (hB0 != null && g5.LB0) {
/*    */         xr0 xr0;
/*    */         if ((xr0 = g5.CJ0()).Kn() > 90.0F && xr0.Kn() < 270.0F) {
/*    */           paramIh0.IG0 = 10.0F;
/*    */           paramIh0.Mp = -25.0F;
/*    */         } else if (xr0.Kn() > 0.0F && xr0.Kn() <= 90.0F) {
/*    */           paramIh0.Mp = -45.0F;
/*    */           paramIh0.IG0 = -15.0F;
/*    */         } else if (xr0.Kn() >= 270.0F) {
/*    */           paramIh0.Mp = 45.0F;
/*    */           paramIh0.IG0 = -25.0F;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     float f1 = this.tM.x, f2 = this.tM.y, f5 = this.tM.z;
/*    */     paramIh0.rE0(f1, f2, f5, 0.0F, f7, 0.0F);
/*    */     paramIh0.abstract(true);
/*    */     if (this.wJ) {
/*    */       this.Z5.l6 = 1000.0F;
/*    */       this.Z5.Ce0 = 0.1F;
/*    */       this.Z5.Bj = paramIh0.Bj;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void xL() {
/*    */     super.xL();
/*    */     wJ0.Nf0.dz();
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.l1.aB0.vO();
/*    */     me me;
/*    */     if ((me = this.oo0) != null)
/*    */       dispose(); 
/*    */   }
/*    */   
/*    */   public final void Kh() {
/*    */     super.Kh();
/*    */     if (km.a3 == null)
/*    */       return; 
/*    */     k1();
/*    */   }
/*    */   
/*    */   public final void ek() {
/*    */     BJ0(this.To0.Bj - 1.0F);
/*    */   }
/*    */   
/*    */   public final void k0() {
/*    */     BJ0(this.To0.Bj + 1.0F);
/*    */   }
/*    */   
/*    */   public final void CH(double paramDouble) {}
/*    */   
/*    */   public final void BJ0(float paramFloat) {
/*    */     this.To0.Bj = paramFloat;
/*    */     this.Et = true;
/*    */   }
/*    */   
/*    */   public final float x0() {
/*    */     return 15.0F;
/*    */   }
/*    */   
/*    */   public final void Xv0() {
/*    */     this.To0.Bj = 15.0F;
/*    */     this.Et = false;
/*    */   }
/*    */   
/*    */   public final String XX() {
/*    */     String str = "\n\nMapHeader:";
/*    */     str = zw.vz(zw.vz(zw.vz(zw.vz(str, "\nID: ").append(this.K60.br0.Ga).toString(), "\nMatrix: ").append(this.K60.xk0.sa0).toString(), "\nTilesetID: ").append(this.K60.br0.COm4).toString(), "\nLight ID: ").append(this.K60.br0.P2.YI0).toString();
/*    */     if (this.K60 != null && this.Cc0 != null)
/*    */       str = zw.vz(str, "\nClearColor: ").append(this.Cc0.Jb0).toString(); 
/*    */     if (this.K60 != null)
/*    */       return zw.vz(str, "\n\nCameras:\nPosition: ").append(this.To0.Ah).append("\nTarget: ").append(this.To0.I70).append("\nDIST: ").append(this.To0.el0).append("\nYAW: ").append(this.To0.IG0).append("\nPITCH: ").append(this.To0.Mp).toString(); 
/*    */     return str;
/*    */   }
/*    */   
/*    */   public final void j00(short[] paramArrayOfshort) {
/*    */     super.j00(paramArrayOfshort);
/*    */     int i = this.w6 ^ true;
/*    */     Cy cy = (Cy)km.a3.Jr0();
/*    */     me me2;
/*    */     if ((((me2 = this.oo0) == null) ? 0 : me2.h20()) != cy.br0.Ga)
/*    */       i = 1; 
/*    */     if (i != 0) {
/*    */       UB0.Kg0.fN(() -> j00(paramArrayOfshort));
/*    */       return;
/*    */     } 
/*    */     me me1;
/*    */     if ((me1 = this.oo0) != null)
/*    */       Ad0(paramArrayOfshort); 
/*    */   }
/*    */   
/*    */   public final void Rx0(boolean paramBoolean) {
/*    */     this.B5.JL(km.a3.Ct.J.lpt8);
/*    */     for (Hc0 hc0 = this.wN.r30(); hc0.hasNext();) {
/*    */       for (Hc0 hc01 = ((Ah)hc0.next()).W7.r30(); hc01.hasNext(); ) {
/*    */         lpt1 lpt1 = (lpt1)hc01.next();
/*    */         this.dH0.pp0.JL(this.B5).ky0(0.125F);
/*    */         this.dH0.s60.JL(this.B5).r9(0.125F);
/*    */         eo eo = this.dH0.pp0;
/*    */         this.dH0.kX(eo, this.dH0.s60);
/*    */         if (lpt1.Zl0.equalsIgnoreCase("pc01") && lpt1.Of.r10(this.dH0)) {
/*    */           String str;
/*    */           if (paramBoolean) {
/*    */             str = "pc_moni_on";
/*    */           } else {
/*    */             str = "pc_moni_off";
/*    */           } 
/*    */           lpt1.co0(str, false, null);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void k1() {
/*    */     Jo jo = km.a3.Ct;
/*    */     if (this.wI != null) {
/*    */       Xi.z6.JL(this.To0.H).zy0(this.To0.I70);
/*    */     } else if (jo != null) {
/*    */       tr.Jv.WR();
/*    */       /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/wJ0}, name=null}, name=FE0, descriptor=Ljava/util/LinkedList;}} */
/*    */       wJ0 wJ0;
/*    */       long l;
/*    */       if (((wJ0 = wJ0.Nf0).NuL <= (l = zm0.u20) && l - wJ0.rs > wJ0.Gb && l - wJ0.vM > 100L)) {
/*    */         LinkedList linkedList;
/*    */         try {
/*    */         
/*    */         } finally {
/*    */           this = null;
/*    */           /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */         } 
/*    */       } 
/*    */       YB(jo, this.To0, true);
/*    */       if (this.wJ) {
/*    */         Xi.z6.JL(this.Z5.H).zy0(this.Z5.I70);
/*    */       } else {
/*    */         Xi.z6.JL(this.To0.H).zy0(this.To0.I70);
/*    */       } 
/*    */     } 
/*    */     if (!this.w6) {
/*    */       boolean bool;
/*    */       R8 r8;
/*    */       if ((r8 = km.u4).GG0) {
/*    */         this.GG0 = false;
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool) {
/*    */         km.a3.Ct.J.Jg0 = false;
/*    */         km.a3.Ct.pm.Kk(new nl[] { nl.Dn0 });
/*    */       } else {
/*    */         D80();
/*    */       } 
/*    */       ud.Bp().Xk(500, false);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */