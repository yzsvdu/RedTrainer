/*   1 */ package f;public final class vH extends Wl { public static final eo xC = new eo(5.0F, 3.02F, 1.0F); public static final eo Zu = new eo(3.0F, 3.02F, 4.0F); public static final eo Lu = new eo(3.5F, 3.25F, 4.0F); public static final eo AUX = new eo(3.5F, 3.4F, 2.5F); public static boolean cb = false; public K70 H3; public fo0 H2; public nf kl0; public gd JQ; public qo f2; public Ih0 fq; public float MZ; public float St; public e2 Xh = new e2(500); public ArrayList Ji0 = new ArrayList(); public boolean gD0 = false; public lpt1 IO; public lpt1 COM7; public lpt1 Yh0; public G30 dr0; public float Ge0 = 1.0F; public So jW; public So iD; public long ZH; public yI We; public kg0 jv0; public kg0 nv0; public final ConcurrentHashMap Wt = new ConcurrentHashMap<>(); public kg0 Mz; public Mx Ga = Mx.LM; public So gr0; public boolean a3; public boolean zg0; public boolean i1; public Texture qc; public NC0 FH0 = new NC0(); public NC0 Kt = new NC0(); public float vp = 0.0F; public Color cH0 = Color.BLACK.cpy(); public float[] Pz = new float[] { 0.0F, 0.0F, 0.0F, 0.0F }; public boolean m60 = false; public long z00 = 0L; public ParticleEffectExt fG; public int sL = -1; public boolean xo = true; public Hd0 Cb; public boolean r30 = false; public String LpT3 = ""; public boolean I1 = false; private void LPt9() { String str; if (!this.LpT3.isEmpty()) { str = this.LpT3; Runnable runnable = this::qM; this.LW.RV(this, "", runnable); } else { ((Wl)this).AJ0 = No0.OH0; }  } private void qM() { this.AJ0 = No0.OH0; } private void YE(int paramInt, sh paramsh) { byte b = this.P2.hG0();
/*     */     
/*   3 */     Wl.IL(this.P2.cl[b]); } private void dG0(int paramInt, sh paramsh) { (this.P2.wB(this.P2.hG0())).C10 = true; } private void Bn(int paramInt, sh paramsh) { (this.P2.wB(this.P2.nI())).C10 = true; } public static void sH(eo parameo, int paramInt, sh paramsh) { eo2.getClass(); float f3 = parameo.x, f4 = parameo.y, f5 = parameo.z; eo eo2; (eo2 = q10.Rs).TG0(f3, f4, f5); eo1.getClass(); float f1 = parameo.x, f2 = parameo.y; f4 = parameo.z; eo eo1; (eo1 = q10.HF).TG0(f1, f2, f4); } private void Qk(int paramInt, sh paramsh) { byte b = this.P2.nI(); Wl.IL(this.P2.cl[b]); } public static boolean bi(hm0 paramhm0) { return (paramhm0 != null && paramhm0.rF0 != null); } public static boolean Wf(hm0 paramhm0) { return (paramhm0 != null && paramhm0.rF0 != null); } public vH(kf paramkf, Gp0 paramGp0) { super(paramkf, paramGp0); } public final void z70(boolean paramBoolean) { Ih0 ih0; (ih0 = this.fq).Ce0 = 0.1F; this.fq.IG0 = -10.0F; this.fq.Bj = 50.0F; if (paramBoolean) { ih0.el0 = 3.0F; ih0.nq0(3.5F, 3.0F, -0.5F); this.fq.Mp = 15.0F; this.fq.mP(4.0F, 3.0F, 1.0F); } else { ih0.el0 = 3.0F; ih0.nq0(4.0F, 3.0F, -2.0F); this.fq.Mp = 0.0F; this.fq.mP(4.0F, 3.0F, -3.0F); }  this.fq.abstract(true); } public final void Kg0(No0 paramNo0) { int i; if ((i = paramNo0.ordinal()) != 1) { if (i != 4) { if (i != 6) { if (i != 7) { if (i != 12) { if (i != 13) { if (i != 16) { if (i != 17) return;  this.Ji0.clear(); this.jW = So.k60(); i = 0; byte b = this.P2.hG0(); hm0[] arrayOfHm0; int j; byte b1; for (j = (arrayOfHm0 = this.P2.cl[b]).length, b1 = 0; b1 < j; ) { this.jW.eC(); if (arrayOfHm0[b1] != null && i == 0) { i = 1; this.jW.PL(Wz0.OC(this::YE)); }  b1++; }  } else { this.gD0 = false; this.jW = So.k60().L5(); i = 0; Gp0 gp0; while (i < (gp0 = this.P2)
/*   4 */                     .ta0.length) {
/*     */                     hm0[] arrayOfHm0;
/*     */                     int j;
/*     */                     byte b;
/*   8 */                     for (j = (arrayOfHm0 = gp0.cl[i]).length, b = 0; b < j; ) { hm0 hm0; if ((hm0 = arrayOfHm0[b]) != null)
/*   9 */                       { uT[] arrayOfUT = hm0.m10; hm0.qf = arrayOfUT; hm0.rF0 = null; hm0.eq0 = null; hm0.lG0(); }  b++; }
/*  10 */                      QZ qZ; (qZ = this.P2.wB(i))
/*  11 */                       .C10 = false; List list;
/*  12 */                     if (this.P2.sQ() && (list = qZ.lK()) != null) for (uT uT : list) { (Wz0.gq(uT, 9, 0.5F).a(0.0F))
/*  13 */                           .st = (i0)Quad.IN;
/*  14 */                         this.jW.PL(Wz0.gq(uT, 9, 0.5F).a(0.0F)); }   i = (byte)(i + 1);
/*  15 */                   }  km.wI0.K7
/*  16 */                     .LW
/*  17 */                     .r50();
/*  18 */                   km.wI0.K7
/*  19 */                     .LW
/*  20 */                     .K9(false);
/*     */                   
/*  22 */                   this.jW = (So)this.jW.Kr().mg(this.dr0); return; }  } else { this.gD0 = true; this.jW = so; So so; this
/*     */                   
/*  24 */                   .jW = (So)(so = So.k60()).mg(this.dr0); return; }  } else { this.gD0 = true; this.jW = So.k60(); if (!this.P2.wB(this.P2.nI()).lJ0()) { i = 0; (this.P2.wB(this.P2.nI()))
/*  25 */                   .C10 = true;
/*  26 */                 this.jW.L5(); byte b = this.P2.nI(); hm0[] arrayOfHm0;
/*     */                 int j;
/*     */                 byte b1;
/*  29 */                 for (j = (arrayOfHm0 = this.P2.cl[b]).length, b1 = 0; b1 < j; ) { hm0 hm0; if ((hm0 = arrayOfHm0[b1]) != null)
/*     */                   
/*     */                   { 
/*  32 */                     this
/*  33 */                       .jW.eC().PL(Wz0.aG(7, uT).n20(0.0F, 0.0F)).PL(Wz0.aG(8, uT).qY(new float[] { 1.0F, 1.0F, 1.0F, 1.0F })).PL(Wz0.aG(10, uT).qY(new float[] { 1.0F, 1.0F, 1.0F, 1.0F })).Kr(); float f4 = eo1.x, f5 = eo1.y + 0.65F, f6 = eo1.z; So so = this.jW.eC().PL(Wz0.gq(uT, 4, 0.1F).qw0(f4, f5, f6)).PL(Wz0.OC(eo1::sH)).PL(Wz0.gq(uT, 7, 1.0F).n20(1.2F, 1.2F)).L5().PL(Wz0.gq(uT, 7, 0.25F).n20(1.0F, 1.0F)).PL(Wz0.gq(uT, 11, 0.25F).a(0.0F)).Kr(); Wz0 wz0 = Wz0.gq(uT, 4, 0.5F); uT uT; eo eo1; f4 = (eo1 = V1.w3((uT = hm0.rF0).He0, (uT = hm0.rF0).He0)).x; f5 = (V1.w3((uT = hm0.rF0).He0, (uT = hm0.rF0).He0)).y; f6 = (V1.w3((uT = hm0.rF0).He0, (uT = hm0.rF0).He0)).z; float f7 = i * 0.1F, f8 = ((i > 2) ? -1 : true); so.PL(wz0.qw0(f4, f5, f7 * f8 + f6)).Kr(); i++; }  b1++; }  this.jW.L5(); for (uT uT : this.P2.wB(this.P2.nI()).lK())
/*     */                 
/*     */                 { 
/*  36 */                   float f = eo1.y - 0.025F;
/*     */                   eo eo1;
/*  38 */                   this.jW.PL(Wz0.gq(uT, 4, 1.0F).qw0((eo1 = uT.He0).x - 0.5F, f, eo1.z + 0.85F)); }  this.jW.Kr(); this.jW.Kr();
/*  39 */                 km.wI0.K7
/*  40 */                   .LW
/*  41 */                   .r50();
/*  42 */                 km.wI0.K7
/*  43 */                   .LW
/*  44 */                   .K9(false); }  this
/*     */                 
/*  46 */                 .jW = (So)this.jW.mg(this.dr0); return; }  } else { Lw lw; this.Ji0.clear(); this.P2.wB(this.P2.hG0()).ub(0, 0, true); this.St = 0.0F; (this.jW = So.k60()).L5(); this.jW.PL(Wz0.OC(this::dG0)); this(); byte b = this.P2.hG0(); hm0[] arrayOfHm0;
/*     */             int j;
/*     */             byte b1;
/*  49 */             for (j = (arrayOfHm0 = this.P2.cl[b]).length, b1 = 0; b1 < j; ) { hm0 hm0; if ((hm0 = arrayOfHm0[b1]) != null) { Hd0 hd0; ET eT = this.P2.wB(this.P2.hG0()).PN(); this(this.P2, hm0, true, eT); (new Hd0())
/*  50 */                   .ki0 = true;
/*  51 */                 short s = hm0.Jx(); if (hm0.JF()) s = (short)(s * -1);  if (!lw.Ye0(s)) hd0
/*  52 */                     .cF0 = false;  this
/*  53 */                   .Cb = hd0; this.jW.Zo0(hd0.mW()); }  b1++; }  }  this.jW.Kr(); } else { this
/*     */             
/*  55 */             .jW = (So)So.k60().L5().PL(Wz0.gq(this.fq, 9, 1.0F).qw0(2.75F, 3.0F, 3.0F)).PL(Wz0.gq(this.fq, 4, 1.0F).qw0(3.75F, 2.75F, 4.0F)).Kr().mg(this.dr0); return; }  } else if (!this.P2.wB(this.P2.nI()).lJ0()) { Lw lw; this.Ji0.clear(); this.St = 0.0F; (this.jW = So.k60())
/*     */           
/*  57 */           .PL(wb.A50((short)1382, false)); this.jW.eC(); List list; if ((list = this.P2.wB(this.P2.nI()).lK()) != null) { this.jW.L5(); for (uT uT : list)
/*     */           { eo eo1;
/*  59 */             float f4 = (eo1 = uT.He0).x + 0.5F, f5 = uT.He0.y; (Wz0.gq(uT, 4, 1.0F).qw0(f4, f5, eo1.z - 1.0F))
/*  60 */               .st = (i0)Quad.IN;
/*  61 */             this.jW.PL(Wz0.gq(uT, 4, 1.0F).qw0(f4, f5, eo1.z - 1.0F)); }  this.jW.Kr(); }  this.jW.PL(Wz0.OC(this::Bn)); this.jW.Kr(); this.jW.L5(); this(); byte b = this.P2.nI(); hm0[] arrayOfHm0;
/*     */         int j;
/*     */         byte b1;
/*  64 */         for (j = (arrayOfHm0 = this.P2.cl[b]).length, b1 = 0; b1 < j; ) { hm0 hm0; if ((hm0 = arrayOfHm0[b1]) != null) { Hd0 hd0; ET eT = this.P2.wB(this.P2.nI()).PN(); this(this.P2, hm0, false, eT); (new Hd0())
/*  65 */               .ki0 = true;
/*  66 */             short s = hm0.Jx(); if (hm0.JF()) s = (short)(s * -1);  if (!lw.Ye0(s)) hd0
/*  67 */                 .cF0 = false;  this
/*  68 */               .Cb = hd0; this.jW.Zo0(hd0.mW()); }  b1++; }  this.jW.Kr(); this.LW.r50(); this.LW.K9(false); } else { return; }  float f1 = Lu.x, f2 = Lu.y, f3 = Lu.z; f1 = AUX.x; f2 = AUX.y; f3 = AUX.z; this.jW.L5().PL(Wz0.gq(this.fq, 9, 1.0F).qw0(f1, f2, f3)).PL(Wz0.gq(this.fq, 4, 1.0F).qw0(f1, f2, f3)).Kr()
/*     */         
/*  70 */         .mg(this.dr0); } else if (!this.r30) { ArrayList<uT> arrayList; this.r30 = true; this.jW = So.k60(); this(); if (this.P2.wB(this.P2.nI()).lJ0()) { hm0[] arrayOfHm0; z70(true); Gp0 gp0; if ((gp0 = this.P2)
/*  71 */           .dd == 
/*  72 */           rK.bh)
/*     */         
/*  74 */         { arrayOfHm0 = (hm0[])Stream.<hm0[]>of(gp0.cl).flatMap(Stream::of).filter(vH::Wf).toArray(vH::ST); } else { byte b1 = arrayOfHm0.nI();
/*     */ 
/*     */           
/*  77 */           arrayOfHm0 = (hm0[])Stream.<hm0>of(((Gp0)arrayOfHm0).cl[b1]).filter(vH::bi).toArray(vH::Yu0); }  int j; byte b; for (j = arrayOfHm0.length, b = 0; b < j; ) { (arrayOfHm0[b])
/*  78 */             .rF0
/*  79 */             .hA0(0.0F, 0.0F, 0.0F, 0.75F);
/*     */           
/*  81 */           arrayList.add((arrayOfHm0[b]).rF0); b++; }  this.jW.L5().PL(Wz0.gq(this.fq, 5, 1.0F).a(0.0F)).Kr().PL(Wz0.OC(this::Qk)); } else { if (this.P2.wB(this.P2.nI()).lK() != null) { this.jW.L5(); for (Iterator<uT> iterator1 = this.P2.wB(this.P2.nI()).lK().iterator(); iterator1.hasNext(); ) { ((uT)iterator1.next()).hA0(0.0F, 0.0F, 0.0F, 1.0F); arrayList.add(iterator1.next()); }  this.jW.Kr(); }  z70(false); }  float f1 = Lu.x, f2 = Lu.y, f3 = Lu.z; f1 = AUX.x; f2 = AUX.y; f3 = AUX.z; So so; (so = this.jW.L5()).PL(Wz0.gq(this.fq, 9, 1.0F).qw0(f1, f2, f3)).PL(Wz0.gq(this.fq, 4, 1.0F).qw0(f1, f2, f3)); for (Iterator<uT> iterator = arrayList.iterator(); iterator.hasNext(); so.PL(Wz0.gq(iterator.next(), 10, 1.5F).qY(new float[] { 0.0F, 0.0F, 0.0F, 0.0F }))); so.Kr(); this
/*     */         
/*  83 */         .jW = (So)this.jW.mg(this.dr0); }  } public final void update() { kf kf1; String str; byte b5; kf kf2; mJ mJ; byte b4; hm0 hm0; byte b3; hm0[] arrayOfHm02; byte b2; hm0[] arrayOfHm01; rK rK1; byte b1; Runnable runnable; No0 no0; int i; c90 c90; byte b; if (this.P2.JS) { km.u4.UW(); this.AJ0 = No0.yn0; wB0(); Wl wl; if ((wl = km.wI0.K7) != null && (kf1 = this.LW) != null) a1();  km.pm0.NR(); return; }  ((vH)super).dr0.cOm4(UB0.M60.Qy * ((vH)super).Ge0); So so; if ((so = ((vH)super).jW) != null && !so.DD()) return;  ((vH)super).jW = null; rK rK2; if (((Wl)this).P2.dd != (rK2 = rK.Lpt9)) if (!((Wl)this).AJ0.nUl || !((Wl)this).LW.pa() || ((vH)super).jW != null) { So so1; if ((so1 = ((vH)super).iD) != null) { so1.fr0 = true; ((vH)super).iD = null; float f1 = AUX.x, f2 = AUX.y, f3 = AUX.z; f1 = Lu.x; f2 = Lu.y; f3 = Lu.z; So.k60().L5().PL(Wz0.gq(((vH)super).fq, 4, 0.5F).qw0(f1, f2, f3)).PL(Wz0.gq(((vH)super).fq, 9, 0.5F).qw0(f1, f2, f3)).Kr().mg(((vH)super).dr0); }  ((vH)super).ZH = System.currentTimeMillis(); } else if (System.currentTimeMillis() - ((vH)super).ZH >= 20000L && ((vH)super).iD == null) { super.S80(); ((vH)super).iD.mg(((vH)super).dr0); }   switch (((Wl)this).AJ0.ordinal()) { default: return;case 17: if (((Wl)this).LW.kv() || !((Wl)this).LW.pa()) return;  for (b5 = 0; b5 < ((Wl)this).P2.wI(((Wl)this).P2.hG0()); ) { ((Wl)this).LW.Oh(((Wl)this).P2.hG0(), b5).CX(true); b5 = (byte)(b5 + 1); }  ((Wl)this).LW.K9(false); ((Wl)this).AJ0 = No0.JJ;case 16: i = 0; if ((c90 = (kf2 = ((Wl)this).LW).rB) != null) c90.nu = i;  if (c90 != null && !c90.nu) { kf2.jf0(c90); kf2.rB.dispose(); kf2.rB = null; }  super.Kg0(((Wl)this).AJ0); ((Wl)this).AJ0 = No0.DU;case 14: case 15: if (((Wl)this).LW.pa()) { SI0 sI0; if ((sI0 = ((Wl)this).P2.W.poll()) != null) sI0.p4(((Wl)this).LW);  if (((Wl)this).P2.uy0) { ((Wl)this).AJ0 = No0.yn0; return; }  } case 13: super.Kg0(((Wl)this).AJ0); ((Wl)this).LW.KB0(); if (!((Wl)this).P2.sQ()) { if ((kf2 = ((Wl)this).LW).rB == null) { c90 c902; this(kf2.AD); kf2.rB = new c90(); kf2.si(c902, kf2.Ub()); }  boolean bool = true; c90 c901; if ((c901 = ((Wl)this).LW.rB) != null) c901.nu = bool;  }  ((Wl)this).AJ0 = No0.on;case 12: super.Kg0(((Wl)this).AJ0); ((Wl)this).LW.mP(); ((Wl)this).AJ0 = No0.Xp0;case 11: ((Wl)this).P2.wB(((Wl)this).P2.hG0()).Oi(); ((Wl)this).AJ0 = No0.JJ;case 10: if (((vH)super).Cb != null) ((vH)super).Cb = null;  while (((Wl)this).LW.pa()) { SI0 sI0; if ((sI0 = ((Wl)this).P2.W.poll()) != null || (sI0 = ((Wl)this).P2.Oq0.poll()) != null) sI0.p4(((Wl)this).LW);  if (sI0 == null) break;  }  if (((Wl)this).LW.pa()) { km.u4.UW(); return; } case 9: if (((Wl)this).Zk == null && ((Wl)this).LW.pa() && !((Wl)this).LW.kv()) { if (((vH)super).z00 > 0L && cb) km.u4.oD(B40.df("Server Desync Length ").append(System.currentTimeMillis() - ((vH)super).z00).append(" ms").toString(), ZY.ih);  ((vH)super).z00 = 0L; ((Wl)this).Zk = ((Wl)this).P2.N00(); } else if (cb && !((Wl)this).LW.kv() && ((vH)super).z00 < 1L && ((Wl)this).P2.N00() != null) { ((vH)super).z00 = System.currentTimeMillis(); }  b4 = mJ.FI0; if ((mJ = ((Wl)this).Zk) != null && (hm0 = ((Wl)this).P2.N0(b4, mJ.md)) != null) { Uc0 uc0; if (((Wl)this).P2.Vg()) { uc0 = km.u4.s40(((Wl)this).P2.Q3); } else { uc0 = km.u4.z2; }  if (uc0 != null) { if (uc0.de0(hm0.ih()) == null) { System.out.println(B40.df("Null slot: ").append(((Wl)this).Zk.FI0).append(" ").append(((Wl)this).Zk.md).toString()); } else { ((Wl)this).LW.finally(((Wl)this).Zk); }  } else { System.out.println(B40.df("Null container: ").append(((Wl)this).P2.Vg()).append(" / ").append(km.u4.z2).toString()); }  ((Wl)this).Zk = null; }  if (((Wl)this).LW.pa()) { SI0 sI0; if ((sI0 = ((Wl)this).P2.W.poll()) != null) { sI0.p4(((Wl)this).LW); if (!((vH)super).xo) { hm0[][] arrayOfHm0; byte b6; for (i = (arrayOfHm0 = ((Wl)this).P2.cl).length, b6 = 0; b6 < i; ) { hm0[] arrayOfHm03; int j; byte b7; for (j = (arrayOfHm03 = arrayOfHm0[b6]).length, b7 = 0; b7 < j; ) { hm0 hm01; if ((hm01 = arrayOfHm03[b7]) != null) hm01.Nd0();  b7++; }  b6++; }  ((vH)super).xo = true; }  } else if (((vH)super).xo && ((Wl)this).Zk == null && ((Wl)this).LW.kv()) { hm0[][] arrayOfHm0; byte b6; for (i = (arrayOfHm0 = ((Wl)this).P2.cl).length, b6 = 0; b6 < i; ) { hm0[] arrayOfHm03; int j; byte b7; for (j = (arrayOfHm03 = arrayOfHm0[b6]).length, b7 = 0; b7 < j; ) { hm0 hm01; if ((hm01 = arrayOfHm03[b7]) != null) hm01.xz0();  b7++; }  b6++; }  ((vH)super).xo = false; }  }  if (((Wl)this).P2.uy0 && ((Wl)this)
/*  84 */           .LW.pa()) { ((Wl)this)
/*  85 */             .AJ0 = No0.yn0; return; } 
/*  86 */       case 8: b3 = ((Wl)this).P2.hG0();
/*     */ 
/*     */         
/*  89 */         for (i = (arrayOfHm02 = ((Wl)this).P2.cl[b3]).length, b = 0; b < i; ) { hm0 hm01; if ((hm01 = arrayOfHm02[b]) != null && 
/*  90 */             !hm01.K0.AL() && hm01
/*  91 */             .K0.j20())
/*     */           { x70 x70;
/*  93 */             this(((Wl)this).P2, null, hm01);
/*  94 */             ((Wl)this).LW.YP
/*  95 */               .add(x70); }  b++; }  ((Wl)this)
/*  96 */           .LW.ny(false, true); Lpt1();
/*  97 */         ((Wl)this).AJ0 = No0.JJ;case 7: if (((Wl)this)
/*  98 */           .LW.kv() || !((Wl)this).LW.pa()) return;  if (((Wl)this).P2.wB(((Wl)this).P2.hG0()).lJ0()) { ((Wl)this).LW.ny(false, true); Lpt1(); ((Wl)this)
/*  99 */             .AJ0 = No0.JJ; } else { super
/* 100 */             .Kg0(((Wl)this).AJ0);
/* 101 */           ((Wl)this).AJ0 = No0.Cg;
/* 102 */           ((Wl)this).LW.Kq(((Wl)this).P2.wB(((Wl)this).P2.hG0()).FM(((Wl)this).P2)); }  for (b2 = 0; b2 < ((Wl)this).P2.wI(((Wl)this).P2.hG0()); ) { i = ((Wl)this).P2.hG0();
/*     */ 
/*     */           
/* 105 */           hm0 hm01 = ((Wl)this).P2.cl[i][b2];
/* 106 */           ((Wl)this).LW
/* 107 */             .Oh(((Wl)this).P2.hG0(), b2).Cg0(hm01); b2 = (byte)(b2 + 1); } case 6: ((Wl)this)
/* 108 */           .AJ0 = No0.Bp0;
/* 109 */       case 5: b2 = ((Wl)this).P2.nI();
/*     */ 
/*     */         
/* 112 */         for (i = (arrayOfHm01 = ((Wl)this).P2.cl[b2]).length, b = 0; b < i; ) { hm0 hm01; if ((hm01 = arrayOfHm01[b]) != null && 
/* 113 */             !hm01.K0.AL() && hm01
/* 114 */             .K0.j20())
/*     */           { x70 x70;
/* 116 */             this(((Wl)this).P2, null, hm01);
/* 117 */             ((Wl)this).LW.YP
/* 118 */               .add(x70); }  b++; }
/*     */         
/* 120 */         if ((rK1 = ((Wl)this).P2.dd) == 
/* 121 */           rK.Lpt9) { ((Wl)this)
/* 122 */             .AJ0 = No0.aL0; } else if (rK1 == 
/* 123 */           rK.bh) { ((Wl)this)
/* 124 */             .AJ0 = No0.ch0; } else { ((Wl)this)
/*     */             
/* 126 */             .AJ0 = No0.xa0; }  super
/* 127 */           .Kg0(((Wl)this).AJ0); ((Wl)this).LW.ny(true, true);case 4: if (((Wl)this).P2.wB(((Wl)this).P2.nI()).lJ0())
/* 128 */         { rK rK; if ((rK = ((Wl)this).P2.dd) == rK1) { ((Wl)this)
/*     */               
/* 130 */               .AJ0 = No0.aL0; } else if (rK == 
/* 131 */             rK.bh) { ((Wl)this)
/* 132 */               .AJ0 = No0.ch0; } else { ((Wl)this)
/*     */               
/* 134 */               .AJ0 = No0.xa0; }  super
/* 135 */             .Kg0(((Wl)this).AJ0); ((Wl)this).LW.ny(true, true); } else { super.Kg0(((Wl)this).AJ0); ((Wl)this)
/* 136 */             .AJ0 = No0.am;
/* 137 */           ((Wl)this).P2.wB(((Wl)this).P2.nI()).ub(0, 0, false); ((Wl)this).LW.Kq(((Wl)this).P2.wB(((Wl)this).P2.nI()).FM(((Wl)this).P2)); }  for (b1 = 0; b1 < ((Wl)this).P2.wI(((Wl)this).P2.nI()); ) { i = ((Wl)this).P2.nI();
/*     */ 
/*     */           
/* 140 */           hm0 hm01 = ((Wl)this).P2.cl[i][b1];
/* 141 */           ((Wl)this).LW
/* 142 */             .Oh(((Wl)this).P2.nI(), b1).Cg0(hm01); b1 = (byte)(b1 + 1); } case 2: ((Wl)this)
/* 143 */           .AJ0 = No0.vy0;
/* 144 */         if (((Wl)this).P2.wB(((Wl)this).P2.nI()).lJ0()) { b1 = ((Wl)this).P2.nI();
/*     */           
/*     */           hm0[] arrayOfHm0;
/* 147 */           for (i = (arrayOfHm0 = ((Wl)this).P2.cl[b1]).length, b = 0; b < i; ) { hm0 hm01; if ((hm01 = arrayOfHm0[b]) != null && 
/* 148 */               !hm01.K0.AL() && hm01
/* 149 */               .K0.j20())
/*     */             { x70 x70;
/* 151 */               this(((Wl)this).P2, null, hm01);
/* 152 */               ((Wl)this).LW.YP
/* 153 */                 .add(x70); }  b++; }  }  ((Wl)this)
/* 154 */           .P2.wB(((Wl)this).P2.nI()).synchronized(); str = ((Wl)this).P2.wB(((Wl)this).P2.nI()).DP(); runnable = this::LPt9; ((Wl)this).LW.RV(this, "", runnable);case 1: break; }  ((vH)super).LpT3 = ((Wl)this).P2.wB(((Wl)this).P2.nI()).dn(((Wl)this).P2); super
/* 155 */       .Kg0(((Wl)this).AJ0);
/*     */     Mn mn;
/* 157 */     if ((mn = ((Wl)this).P2.Ja) == 
/* 158 */       Mn.VK) { no0 = No0.L10; } else if (no0 == Mn.JY) { no0 = No0.zI0; } else { no0 = No0.DU; }  ((Wl)this)
/* 159 */       .AJ0 = no0; }
/*     */ 
/*     */   
/*     */   public final void S80() {
/*     */     So so;
/*     */     if ((so = this.iD) != null)
/*     */       so.fr0 = true; 
/*     */     eo eo1;
/*     */     float f4 = (eo1 = Lu).x, f5 = Lu.y, f6 = Lu.z;
/*     */     eo eo2;
/*     */     f5 = (eo2 = AUX).x;
/*     */     f6 = AUX.y;
/*     */     float f7 = AUX.z;
/*     */     (Wz0.aG(4, this.fq).qw0(f5, f6, f7)).st = (i0)Sine.INOUT;
/*     */     f5 = eo2.x - 0.5F;
/*     */     f6 = eo2.y;
/*     */     f5 = eo1.x - 0.5F;
/*     */     f6 = eo1.y;
/*     */     f7 = eo1.z;
/*     */     f5 = eo2.x;
/*     */     f6 = eo2.y;
/*     */     f7 = eo2.z;
/*     */     f5 = eo1.x;
/*     */     f6 = eo1.y;
/*     */     f7 = eo1.z;
/*     */     f5 = eo2.x + 0.75F;
/*     */     f6 = eo2.y;
/*     */     f5 = eo1.x + 0.75F;
/*     */     f6 = eo1.y;
/*     */     f5 = eo2.x;
/*     */     f6 = eo2.y;
/*     */     f7 = eo2.z;
/*     */     f5 = eo1.x;
/*     */     f6 = eo1.y;
/*     */     f7 = eo1.z;
/*     */     f5 = eo2.x - 1.0F;
/*     */     f6 = eo2.y + 0.1F;
/*     */     f7 = eo2.z;
/*     */     f5 = eo1.x - 0.5F;
/*     */     f6 = eo1.y;
/*     */     f7 = eo1.z;
/*     */     f5 = eo2.x - 1.0F;
/*     */     f6 = eo2.y + 0.25F;
/*     */     f7 = eo2.z;
/*     */     f5 = eo1.x - 0.5F;
/*     */     f6 = eo1.y + 0.25F;
/*     */     f7 = eo1.z;
/*     */     float f3 = eo2.x;
/*     */     f5 = eo2.y;
/*     */     f6 = eo2.z;
/*     */     float f1 = eo1.x, f2 = eo1.y;
/*     */     f3 = eo1.z;
/*     */     this.iD = (So)So.k60().PL(Wz0.aG(7, this.fq).a(3.0F)).PL(Wz0.aG(9, this.fq).qw0(f4, f5, f6)).PL(Wz0.aG(4, this.fq).qw0(f5, f6, f7)).L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, eo2.z + 0.5F)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, f7)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, f7)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, f7)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, eo2.z - 2.0F)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, eo1.z - 2.0F)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, f7)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, f7)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, f7)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, f7)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f5, f6, f7)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f5, f6, f7)).Kr().L5().PL(Wz0.gq(this.fq, 4, 5.0F).qw0(f3, f5, f6)).PL(Wz0.gq(this.fq, 9, 5.0F).qw0(f1, f2, f3)).Kr().Ck0(255, 0.0F);
/*     */   }
/*     */   
/*     */   public final Ih0 go() {
/*     */     return this.fq;
/*     */   }
/*     */   
/*     */   public final void dispose() {
/*     */     super.dispose();
/*     */     Hd0 hd0;
/*     */     if ((hd0 = this.Cb) != null && !hd0.i5) {
/*     */       So so;
/*     */       if ((so = hd0.synchronized) != null)
/*     */         so.fr0 = true; 
/*     */       for (Hc0 hc0 = hd0.lPT1.r30(); hc0.hasNext(); ((iq0)hc0.next()).dispose());
/*     */     } 
/*     */     yI yI1;
/*     */     Texture texture;
/*     */     if ((texture = (yI1 = this.We).AJ) != null) {
/*     */       texture.dispose();
/*     */       yI1.AJ = null;
/*     */     } 
/*     */     yI1.Z80 = null;
/*     */     this.COM7.Ea0();
/*     */     this.Yh0.Ea0();
/*     */     this.IO.Ea0();
/*     */     this.H3.dispose();
/*     */     this.kl0.dispose();
/*     */     this.JQ.dispose();
/*     */     this.jv0.dispose();
/*     */     this.Mz.dispose();
/*     */     this.nv0.dispose();
/*     */   }
/*     */   
/*     */   public final void Wa() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield P2 : Lf/Gp0;
/*     */     //   4: getfield rx : Lf/ky;
/*     */     //   7: getstatic f/ky.cC : Lf/ky;
/*     */     //   10: if_acmpne -> 18
/*     */     //   13: iconst_1
/*     */     //   14: istore_1
/*     */     //   15: goto -> 20
/*     */     //   18: iconst_0
/*     */     //   19: istore_1
/*     */     //   20: iconst_0
/*     */     //   21: istore_2
/*     */     //   22: iload_2
/*     */     //   23: aload_0
/*     */     //   24: getfield P2 : Lf/Gp0;
/*     */     //   27: invokevirtual H3 : ()B
/*     */     //   30: if_icmpge -> 214
/*     */     //   33: aload_0
/*     */     //   34: getfield P2 : Lf/Gp0;
/*     */     //   37: iload_2
/*     */     //   38: invokevirtual wB : (B)Lf/QZ;
/*     */     //   41: dup
/*     */     //   42: astore_3
/*     */     //   43: getfield Fu : B
/*     */     //   46: aload_0
/*     */     //   47: getfield P2 : Lf/Gp0;
/*     */     //   50: invokevirtual nI : ()B
/*     */     //   53: if_icmpeq -> 77
/*     */     //   56: aload_0
/*     */     //   57: getfield P2 : Lf/Gp0;
/*     */     //   60: dup
/*     */     //   61: astore #4
/*     */     //   63: getfield ka0 : Z
/*     */     //   66: ifeq -> 90
/*     */     //   69: aload #4
/*     */     //   71: invokevirtual sQ : ()Z
/*     */     //   74: ifeq -> 90
/*     */     //   77: aload_0
/*     */     //   78: getfield P2 : Lf/Gp0;
/*     */     //   81: iload_2
/*     */     //   82: invokevirtual wB : (B)Lf/QZ;
/*     */     //   85: fconst_0
/*     */     //   86: fconst_0
/*     */     //   87: invokevirtual s6 : (FF)V
/*     */     //   90: aload_3
/*     */     //   91: getfield Fu : B
/*     */     //   94: aload_0
/*     */     //   95: getfield P2 : Lf/Gp0;
/*     */     //   98: invokevirtual hG0 : ()B
/*     */     //   101: if_icmpne -> 117
/*     */     //   104: aload_0
/*     */     //   105: getfield P2 : Lf/Gp0;
/*     */     //   108: iload_2
/*     */     //   109: invokevirtual wB : (B)Lf/QZ;
/*     */     //   112: iconst_0
/*     */     //   113: iconst_0
/*     */     //   114: invokevirtual kO : (II)V
/*     */     //   117: iconst_0
/*     */     //   118: istore_3
/*     */     //   119: iload_3
/*     */     //   120: aload_0
/*     */     //   121: getfield P2 : Lf/Gp0;
/*     */     //   124: dup
/*     */     //   125: astore #4
/*     */     //   127: getfield cl : [[Lf/hm0;
/*     */     //   130: iload_2
/*     */     //   131: aaload
/*     */     //   132: arraylength
/*     */     //   133: if_icmpge -> 206
/*     */     //   136: aload #4
/*     */     //   138: iload_2
/*     */     //   139: iload_3
/*     */     //   140: invokevirtual N0 : (BB)Lf/hm0;
/*     */     //   143: dup
/*     */     //   144: astore #4
/*     */     //   146: ifnonnull -> 152
/*     */     //   149: goto -> 198
/*     */     //   152: iload_1
/*     */     //   153: aload #4
/*     */     //   155: invokevirtual t30 : ()V
/*     */     //   158: ifeq -> 198
/*     */     //   161: aload_0
/*     */     //   162: getfield P2 : Lf/Gp0;
/*     */     //   165: getfield rx : Lf/ky;
/*     */     //   168: iload_3
/*     */     //   169: invokevirtual cF : (I)Z
/*     */     //   172: ifne -> 198
/*     */     //   175: aload #4
/*     */     //   177: dup
/*     */     //   178: dup
/*     */     //   179: iconst_0
/*     */     //   180: putfield El0 : Z
/*     */     //   183: invokevirtual Nd0 : ()V
/*     */     //   186: getfield rF0 : Lf/uT;
/*     */     //   189: fconst_0
/*     */     //   190: fconst_0
/*     */     //   191: fconst_0
/*     */     //   192: ldc_w 0.6
/*     */     //   195: invokevirtual hA0 : (FFFF)V
/*     */     //   198: iload_3
/*     */     //   199: iconst_1
/*     */     //   200: iadd
/*     */     //   201: i2b
/*     */     //   202: istore_3
/*     */     //   203: goto -> 119
/*     */     //   206: iload_2
/*     */     //   207: iconst_1
/*     */     //   208: iadd
/*     */     //   209: i2b
/*     */     //   210: istore_2
/*     */     //   211: goto -> 22
/*     */     //   214: aload_0
/*     */     //   215: getstatic f/lx0.XD0 : Lf/lx0;
/*     */     //   218: astore_2
/*     */     //   219: getfield P2 : Lf/Gp0;
/*     */     //   222: getfield i0 : Lf/yi;
/*     */     //   225: dup
/*     */     //   226: astore_3
/*     */     //   227: ifnull -> 235
/*     */     //   230: aload_3
/*     */     //   231: getfield Qd0 : Lf/lx0;
/*     */     //   234: astore_2
/*     */     //   235: getstatic f/km.a3 : Lf/vh0;
/*     */     //   238: invokevirtual Jr0 : ()Lf/KI;
/*     */     //   241: instanceof f/pI
/*     */     //   244: ifeq -> 318
/*     */     //   247: getstatic f/km.a3 : Lf/vh0;
/*     */     //   250: invokevirtual Jr0 : ()Lf/KI;
/*     */     //   253: checkcast f/Cy
/*     */     //   256: getfield br0 : Lf/Ws0;
/*     */     //   259: getfield cC : S
/*     */     //   262: iconst_5
/*     */     //   263: ishr
/*     */     //   264: bipush #31
/*     */     //   266: iand
/*     */     //   267: iconst_1
/*     */     //   268: iadd
/*     */     //   269: istore_2
/*     */     //   270: getstatic f/lx0.US : [Lf/lx0;
/*     */     //   273: dup
/*     */     //   274: astore_3
/*     */     //   275: arraylength
/*     */     //   276: istore #4
/*     */     //   278: iconst_0
/*     */     //   279: istore #5
/*     */     //   281: iload #5
/*     */     //   283: iload #4
/*     */     //   285: if_icmpge -> 314
/*     */     //   288: aload_3
/*     */     //   289: iload #5
/*     */     //   291: aaload
/*     */     //   292: dup
/*     */     //   293: astore #6
/*     */     //   295: getfield y9 : I
/*     */     //   298: iload_2
/*     */     //   299: if_icmpne -> 308
/*     */     //   302: aload #6
/*     */     //   304: astore_2
/*     */     //   305: goto -> 318
/*     */     //   308: iinc #5, 1
/*     */     //   311: goto -> 281
/*     */     //   314: getstatic f/lx0.XD0 : Lf/lx0;
/*     */     //   317: astore_2
/*     */     //   318: aload_0
/*     */     //   319: getfield sL : I
/*     */     //   322: dup
/*     */     //   323: istore_3
/*     */     //   324: ifle -> 363
/*     */     //   327: getstatic f/lx0.US : [Lf/lx0;
/*     */     //   330: dup
/*     */     //   331: iload_3
/*     */     //   332: swap
/*     */     //   333: arraylength
/*     */     //   334: irem
/*     */     //   335: aaload
/*     */     //   336: astore_2
/*     */     //   337: getstatic f/km.u4 : Lf/R8;
/*     */     //   340: new java/lang/StringBuilder
/*     */     //   343: dup
/*     */     //   344: invokespecial <init> : ()V
/*     */     //   347: ldc_w 'BG IS NOW '
/*     */     //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   353: aload_2
/*     */     //   354: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   357: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   360: invokevirtual Pq : (Ljava/lang/String;)V
/*     */     //   363: iload_1
/*     */     //   364: ifeq -> 392
/*     */     //   367: aload_0
/*     */     //   368: getfield We : Lf/yI;
/*     */     //   371: bipush #86
/*     */     //   373: istore_3
/*     */     //   374: getfield VC0 : Lf/S;
/*     */     //   377: iload_3
/*     */     //   378: invokevirtual Em0 : (I)Lf/T7;
/*     */     //   381: iconst_0
/*     */     //   382: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*     */     //   385: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*     */     //   388: astore_3
/*     */     //   389: goto -> 499
/*     */     //   392: aload_2
/*     */     //   393: aload_0
/*     */     //   394: dup
/*     */     //   395: getfield We : Lf/yI;
/*     */     //   398: astore_3
/*     */     //   399: getfield P2 : Lf/Gp0;
/*     */     //   402: getfield i0 : Lf/yi;
/*     */     //   405: astore #4
/*     */     //   407: getfield nb0 : I
/*     */     //   410: dup
/*     */     //   411: istore #5
/*     */     //   413: ifle -> 419
/*     */     //   416: goto -> 482
/*     */     //   419: aload #4
/*     */     //   421: ifnonnull -> 430
/*     */     //   424: iconst_0
/*     */     //   425: istore #5
/*     */     //   427: goto -> 482
/*     */     //   430: aload #4
/*     */     //   432: invokevirtual ordinal : ()I
/*     */     //   435: dup
/*     */     //   436: istore #4
/*     */     //   438: iconst_3
/*     */     //   439: if_icmpeq -> 478
/*     */     //   442: iload #4
/*     */     //   444: iconst_4
/*     */     //   445: if_icmpeq -> 471
/*     */     //   448: iload #4
/*     */     //   450: iconst_5
/*     */     //   451: if_icmpeq -> 471
/*     */     //   454: iload #4
/*     */     //   456: bipush #10
/*     */     //   458: if_icmpeq -> 464
/*     */     //   461: goto -> 424
/*     */     //   464: bipush #6
/*     */     //   466: istore #5
/*     */     //   468: goto -> 482
/*     */     //   471: bipush #14
/*     */     //   473: istore #5
/*     */     //   475: goto -> 482
/*     */     //   478: bipush #15
/*     */     //   480: istore #5
/*     */     //   482: aload_3
/*     */     //   483: getfield VC0 : Lf/S;
/*     */     //   486: iload #5
/*     */     //   488: invokevirtual Em0 : (I)Lf/T7;
/*     */     //   491: iconst_0
/*     */     //   492: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*     */     //   495: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*     */     //   498: astore_3
/*     */     //   499: aload_2
/*     */     //   500: dup
/*     */     //   501: aload_0
/*     */     //   502: getfield We : Lf/yI;
/*     */     //   505: dup
/*     */     //   506: astore #4
/*     */     //   508: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   511: pop
/*     */     //   512: getfield Ei : I
/*     */     //   515: istore #5
/*     */     //   517: getfield bn : Z
/*     */     //   520: ifeq -> 534
/*     */     //   523: getstatic f/L70.gq : Lf/L70;
/*     */     //   526: invokevirtual fu : ()B
/*     */     //   529: istore #6
/*     */     //   531: goto -> 537
/*     */     //   534: iconst_0
/*     */     //   535: istore #6
/*     */     //   537: aload_2
/*     */     //   538: dup
/*     */     //   539: aload_0
/*     */     //   540: aload #4
/*     */     //   542: iload #5
/*     */     //   544: iload #6
/*     */     //   546: iadd
/*     */     //   547: istore_2
/*     */     //   548: getfield VC0 : Lf/S;
/*     */     //   551: iload_2
/*     */     //   552: invokevirtual Em0 : (I)Lf/T7;
/*     */     //   555: iconst_0
/*     */     //   556: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*     */     //   559: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*     */     //   562: astore_2
/*     */     //   563: new f/fQ
/*     */     //   566: dup
/*     */     //   567: astore #4
/*     */     //   569: iconst_1
/*     */     //   570: invokespecial <init> : (I)V
/*     */     //   573: getfield We : Lf/yI;
/*     */     //   576: dup
/*     */     //   577: astore #5
/*     */     //   579: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   582: pop
/*     */     //   583: getfield nl : I
/*     */     //   586: istore #6
/*     */     //   588: getfield bn : Z
/*     */     //   591: ifeq -> 605
/*     */     //   594: getstatic f/L70.gq : Lf/L70;
/*     */     //   597: invokevirtual fu : ()B
/*     */     //   600: istore #7
/*     */     //   602: goto -> 608
/*     */     //   605: iconst_0
/*     */     //   606: istore #7
/*     */     //   608: aload_0
/*     */     //   609: dup
/*     */     //   610: aload_3
/*     */     //   611: aload_0
/*     */     //   612: aload_3
/*     */     //   613: aload #4
/*     */     //   615: aload #5
/*     */     //   617: iload #6
/*     */     //   619: iload #7
/*     */     //   621: iadd
/*     */     //   622: istore #5
/*     */     //   624: getfield VC0 : Lf/S;
/*     */     //   627: iload #5
/*     */     //   629: invokevirtual Em0 : (I)Lf/T7;
/*     */     //   632: iconst_0
/*     */     //   633: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*     */     //   636: invokestatic yn : (Ljava/nio/ByteBuffer;)Lf/PK;
/*     */     //   639: invokevirtual Com3 : (Ljava/lang/Object;)V
/*     */     //   642: invokestatic Lj : ()Lf/eI;
/*     */     //   645: astore #5
/*     */     //   647: getfield Nt : [Lf/hC;
/*     */     //   650: iconst_0
/*     */     //   651: aaload
/*     */     //   652: aload #5
/*     */     //   654: aload_3
/*     */     //   655: getfield Qo0 : Lf/Wd;
/*     */     //   658: astore #5
/*     */     //   660: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   663: pop
/*     */     //   664: aload #5
/*     */     //   666: aconst_null
/*     */     //   667: fconst_1
/*     */     //   668: iconst_1
/*     */     //   669: iconst_0
/*     */     //   670: iconst_0
/*     */     //   671: invokestatic Gy : (Lf/hC;Lf/Wd;Lf/fQ;FZZZ)Lf/lpt1;
/*     */     //   674: putfield COM7 : Lf/lpt1;
/*     */     //   677: invokestatic Lj : ()Lf/eI;
/*     */     //   680: astore #5
/*     */     //   682: getfield Nt : [Lf/hC;
/*     */     //   685: iconst_0
/*     */     //   686: aaload
/*     */     //   687: aload #5
/*     */     //   689: aload_3
/*     */     //   690: getfield Qo0 : Lf/Wd;
/*     */     //   693: astore_3
/*     */     //   694: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   697: pop
/*     */     //   698: aload_3
/*     */     //   699: aconst_null
/*     */     //   700: fconst_1
/*     */     //   701: iconst_1
/*     */     //   702: iconst_0
/*     */     //   703: iconst_0
/*     */     //   704: invokestatic Gy : (Lf/hC;Lf/Wd;Lf/fQ;FZZZ)Lf/lpt1;
/*     */     //   707: putfield Yh0 : Lf/lpt1;
/*     */     //   710: getfield P2 : Lf/Gp0;
/*     */     //   713: getfield rx : Lf/ky;
/*     */     //   716: getstatic f/ky.JH0 : Lf/ky;
/*     */     //   719: if_acmpeq -> 828
/*     */     //   722: aload_0
/*     */     //   723: dup
/*     */     //   724: aload_2
/*     */     //   725: invokestatic Lj : ()Lf/eI;
/*     */     //   728: astore_3
/*     */     //   729: getfield Nt : [Lf/hC;
/*     */     //   732: iconst_0
/*     */     //   733: aaload
/*     */     //   734: aload_3
/*     */     //   735: aload_2
/*     */     //   736: getfield Qo0 : Lf/Wd;
/*     */     //   739: astore_2
/*     */     //   740: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   743: pop
/*     */     //   744: aload_2
/*     */     //   745: aload #4
/*     */     //   747: fconst_1
/*     */     //   748: iconst_1
/*     */     //   749: iconst_0
/*     */     //   750: iconst_0
/*     */     //   751: invokestatic Gy : (Lf/hC;Lf/Wd;Lf/fQ;FZZZ)Lf/lpt1;
/*     */     //   754: dup
/*     */     //   755: dup
/*     */     //   756: aload_0
/*     */     //   757: swap
/*     */     //   758: putfield IO : Lf/lpt1;
/*     */     //   761: fconst_2
/*     */     //   762: putfield k : F
/*     */     //   765: iconst_0
/*     */     //   766: iconst_1
/*     */     //   767: aconst_null
/*     */     //   768: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*     */     //   771: pop
/*     */     //   772: getfield IO : Lf/lpt1;
/*     */     //   775: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   778: ldc_w 8.0
/*     */     //   781: invokevirtual implements : (F)V
/*     */     //   784: getfield IO : Lf/lpt1;
/*     */     //   787: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   790: ldc 3.0
/*     */     //   792: ldc 2.5
/*     */     //   794: ldc 3.0
/*     */     //   796: invokevirtual bb0 : (FFF)V
/*     */     //   799: getstatic f/vH.Lu : Lf/eo;
/*     */     //   802: ldc 3.5
/*     */     //   804: ldc 3.25
/*     */     //   806: ldc 4.0
/*     */     //   808: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   811: pop
/*     */     //   812: getstatic f/vH.AUX : Lf/eo;
/*     */     //   815: ldc 3.5
/*     */     //   817: ldc 3.4
/*     */     //   819: ldc 2.5
/*     */     //   821: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   824: pop
/*     */     //   825: goto -> 987
/*     */     //   828: aload_0
/*     */     //   829: dup
/*     */     //   830: dup2
/*     */     //   831: invokestatic Lj : ()Lf/eI;
/*     */     //   834: astore_2
/*     */     //   835: new f/ig
/*     */     //   838: dup
/*     */     //   839: aload_2
/*     */     //   840: swap
/*     */     //   841: getstatic f/km.mI0 : Lf/P1;
/*     */     //   844: getfield AN : Lf/Wo;
/*     */     //   847: getfield TI : Lf/RD;
/*     */     //   850: ldc_w '/a/1/8/9'
/*     */     //   853: invokevirtual B8 : (Ljava/lang/String;)Lf/T7;
/*     */     //   856: invokespecial <init> : (Lf/T7;)V
/*     */     //   859: iconst_3
/*     */     //   860: newarray int
/*     */     //   862: dup
/*     */     //   863: dup2
/*     */     //   864: astore_2
/*     */     //   865: iconst_0
/*     */     //   866: bipush #6
/*     */     //   868: iastore
/*     */     //   869: iconst_1
/*     */     //   870: bipush #7
/*     */     //   872: iastore
/*     */     //   873: iconst_2
/*     */     //   874: bipush #9
/*     */     //   876: iastore
/*     */     //   877: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   880: pop
/*     */     //   881: bipush #8
/*     */     //   883: aload_2
/*     */     //   884: invokestatic L4 : (Lf/S;I[I)Lf/lpt1;
/*     */     //   887: dup
/*     */     //   888: dup
/*     */     //   889: aload_0
/*     */     //   890: swap
/*     */     //   891: putfield IO : Lf/lpt1;
/*     */     //   894: getfield lz : Lf/fQ;
/*     */     //   897: iconst_0
/*     */     //   898: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   901: checkcast java/lang/String
/*     */     //   904: iconst_1
/*     */     //   905: invokevirtual nl : (Ljava/lang/String;Z)V
/*     */     //   908: getfield IO : Lf/lpt1;
/*     */     //   911: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   914: ldc 4.0
/*     */     //   916: invokevirtual implements : (F)V
/*     */     //   919: getstatic f/vH.AUX : Lf/eo;
/*     */     //   922: fconst_0
/*     */     //   923: fconst_0
/*     */     //   924: fconst_2
/*     */     //   925: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   928: pop
/*     */     //   929: getstatic f/vH.Lu : Lf/eo;
/*     */     //   932: fconst_0
/*     */     //   933: fconst_0
/*     */     //   934: fconst_0
/*     */     //   935: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   938: pop
/*     */     //   939: getfield IO : Lf/lpt1;
/*     */     //   942: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   945: fconst_0
/*     */     //   946: fconst_0
/*     */     //   947: fconst_0
/*     */     //   948: invokevirtual bb0 : (FFF)V
/*     */     //   951: getfield COM7 : Lf/lpt1;
/*     */     //   954: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   957: ldc_w 999.0
/*     */     //   960: ldc_w 999.0
/*     */     //   963: ldc_w 999.0
/*     */     //   966: invokevirtual bb0 : (FFF)V
/*     */     //   969: getfield Yh0 : Lf/lpt1;
/*     */     //   972: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   975: ldc_w 999.0
/*     */     //   978: ldc_w 999.0
/*     */     //   981: ldc_w 999.0
/*     */     //   984: invokevirtual bb0 : (FFF)V
/*     */     //   987: iload_1
/*     */     //   988: ifeq -> 1020
/*     */     //   991: aload_0
/*     */     //   992: dup
/*     */     //   993: getfield COM7 : Lf/lpt1;
/*     */     //   996: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   999: ldc_w 8.0
/*     */     //   1002: invokevirtual implements : (F)V
/*     */     //   1005: getfield Yh0 : Lf/lpt1;
/*     */     //   1008: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   1011: ldc_w 8.0
/*     */     //   1014: invokevirtual implements : (F)V
/*     */     //   1017: goto -> 1046
/*     */     //   1020: aload_0
/*     */     //   1021: dup
/*     */     //   1022: getfield COM7 : Lf/lpt1;
/*     */     //   1025: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   1028: ldc_w 16.0
/*     */     //   1031: invokevirtual implements : (F)V
/*     */     //   1034: getfield Yh0 : Lf/lpt1;
/*     */     //   1037: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   1040: ldc_w 16.0
/*     */     //   1043: invokevirtual implements : (F)V
/*     */     //   1046: aload_0
/*     */     //   1047: dup
/*     */     //   1048: dup2
/*     */     //   1049: getfield COM7 : Lf/lpt1;
/*     */     //   1052: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   1055: ldc 3.0
/*     */     //   1057: ldc 2.5
/*     */     //   1059: ldc 4.0
/*     */     //   1061: invokevirtual bb0 : (FFF)V
/*     */     //   1064: getfield Yh0 : Lf/lpt1;
/*     */     //   1067: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   1070: ldc_w 5.25
/*     */     //   1073: ldc 2.5
/*     */     //   1075: fconst_1
/*     */     //   1076: invokevirtual bb0 : (FFF)V
/*     */     //   1079: iconst_0
/*     */     //   1080: istore_1
/*     */     //   1081: getfield dr0 : Lf/G30;
/*     */     //   1084: astore_2
/*     */     //   1085: getfield P2 : Lf/Gp0;
/*     */     //   1088: getfield cl : [[Lf/hm0;
/*     */     //   1091: dup
/*     */     //   1092: astore_3
/*     */     //   1093: arraylength
/*     */     //   1094: istore #4
/*     */     //   1096: iconst_0
/*     */     //   1097: istore #5
/*     */     //   1099: iload #5
/*     */     //   1101: iload #4
/*     */     //   1103: if_icmpge -> 1247
/*     */     //   1106: aload_3
/*     */     //   1107: iload #5
/*     */     //   1109: aaload
/*     */     //   1110: dup
/*     */     //   1111: astore #6
/*     */     //   1113: arraylength
/*     */     //   1114: istore #7
/*     */     //   1116: iconst_0
/*     */     //   1117: istore #8
/*     */     //   1119: iload #8
/*     */     //   1121: iload #7
/*     */     //   1123: if_icmpge -> 1241
/*     */     //   1126: aload #6
/*     */     //   1128: iload #8
/*     */     //   1130: aaload
/*     */     //   1131: dup
/*     */     //   1132: astore #9
/*     */     //   1134: ifnull -> 1235
/*     */     //   1137: aload #9
/*     */     //   1139: invokevirtual Jx : ()S
/*     */     //   1142: sipush #1023
/*     */     //   1145: if_icmpne -> 1196
/*     */     //   1148: aload_0
/*     */     //   1149: dup
/*     */     //   1150: getfield f2 : Lf/qo;
/*     */     //   1153: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1156: fconst_1
/*     */     //   1157: ldc_w 0.7
/*     */     //   1160: ldc_w 0.7
/*     */     //   1163: fconst_0
/*     */     //   1164: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1167: pop
/*     */     //   1168: iconst_1
/*     */     //   1169: istore_1
/*     */     //   1170: getfield Pz : [F
/*     */     //   1173: dup
/*     */     //   1174: dup2
/*     */     //   1175: iconst_0
/*     */     //   1176: ldc_w 0.23
/*     */     //   1179: fastore
/*     */     //   1180: iconst_1
/*     */     //   1181: fconst_0
/*     */     //   1182: fastore
/*     */     //   1183: iconst_2
/*     */     //   1184: ldc_w 0.65
/*     */     //   1187: fastore
/*     */     //   1188: iconst_3
/*     */     //   1189: ldc_w 0.35
/*     */     //   1192: fastore
/*     */     //   1193: goto -> 1241
/*     */     //   1196: aload #9
/*     */     //   1198: invokevirtual Jx : ()S
/*     */     //   1201: sipush #1002
/*     */     //   1204: if_icmpne -> 1235
/*     */     //   1207: aload_0
/*     */     //   1208: getfield f2 : Lf/qo;
/*     */     //   1211: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1214: ldc_w 0.12
/*     */     //   1217: ldc_w 0.12
/*     */     //   1220: ldc_w 0.21
/*     */     //   1223: ldc_w 0.5
/*     */     //   1226: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1229: pop
/*     */     //   1230: iconst_1
/*     */     //   1231: istore_1
/*     */     //   1232: goto -> 1241
/*     */     //   1235: iinc #8, 1
/*     */     //   1238: goto -> 1119
/*     */     //   1241: iinc #5, 1
/*     */     //   1244: goto -> 1099
/*     */     //   1247: iload_1
/*     */     //   1248: ifeq -> 1261
/*     */     //   1251: aload_0
/*     */     //   1252: dup
/*     */     //   1253: iconst_1
/*     */     //   1254: putfield m60 : Z
/*     */     //   1257: iconst_1
/*     */     //   1258: putfield I1 : Z
/*     */     //   1261: aload_0
/*     */     //   1262: dup
/*     */     //   1263: invokestatic k60 : ()Lf/So;
/*     */     //   1266: invokevirtual L5 : ()Lf/So;
/*     */     //   1269: putfield jW : Lf/So;
/*     */     //   1272: getfield IO : Lf/lpt1;
/*     */     //   1275: getfield xl0 : Lf/fQ;
/*     */     //   1278: invokevirtual r30 : ()Lf/Hc0;
/*     */     //   1281: astore_1
/*     */     //   1282: aload_1
/*     */     //   1283: invokevirtual hasNext : ()Z
/*     */     //   1286: ifeq -> 1360
/*     */     //   1289: aload_0
/*     */     //   1290: aload_1
/*     */     //   1291: invokevirtual next : ()Ljava/lang/Object;
/*     */     //   1294: checkcast f/T0
/*     */     //   1297: astore_3
/*     */     //   1298: getfield jW : Lf/So;
/*     */     //   1301: aload_3
/*     */     //   1302: bipush #10
/*     */     //   1304: fconst_0
/*     */     //   1305: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*     */     //   1308: iconst_4
/*     */     //   1309: newarray float
/*     */     //   1311: dup
/*     */     //   1312: dup
/*     */     //   1313: astore_3
/*     */     //   1314: aload_0
/*     */     //   1315: getfield Pz : [F
/*     */     //   1318: dup
/*     */     //   1319: astore #4
/*     */     //   1321: aload_3
/*     */     //   1322: aload #4
/*     */     //   1324: aload_3
/*     */     //   1325: aload #4
/*     */     //   1327: aload_3
/*     */     //   1328: aload #4
/*     */     //   1330: iconst_0
/*     */     //   1331: faload
/*     */     //   1332: iconst_0
/*     */     //   1333: swap
/*     */     //   1334: fastore
/*     */     //   1335: iconst_1
/*     */     //   1336: faload
/*     */     //   1337: iconst_1
/*     */     //   1338: swap
/*     */     //   1339: fastore
/*     */     //   1340: iconst_2
/*     */     //   1341: faload
/*     */     //   1342: iconst_2
/*     */     //   1343: swap
/*     */     //   1344: fastore
/*     */     //   1345: iconst_3
/*     */     //   1346: faload
/*     */     //   1347: iconst_3
/*     */     //   1348: swap
/*     */     //   1349: fastore
/*     */     //   1350: invokevirtual qY : ([F)Lf/Wz0;
/*     */     //   1353: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*     */     //   1356: pop
/*     */     //   1357: goto -> 1282
/*     */     //   1360: aload_0
/*     */     //   1361: dup
/*     */     //   1362: dup2
/*     */     //   1363: getfield jW : Lf/So;
/*     */     //   1366: invokevirtual Kr : ()Lf/So;
/*     */     //   1369: aload_2
/*     */     //   1370: invokevirtual mg : (Lf/G30;)Lf/sh;
/*     */     //   1373: pop
/*     */     //   1374: getfield P2 : Lf/Gp0;
/*     */     //   1377: getfield e30 : Lf/Mx;
/*     */     //   1380: invokevirtual Sd : (Lf/Mx;)V
/*     */     //   1383: getfield P2 : Lf/Gp0;
/*     */     //   1386: ifnonnull -> 1392
/*     */     //   1389: goto -> 1564
/*     */     //   1392: iconst_0
/*     */     //   1393: istore_1
/*     */     //   1394: iload_1
/*     */     //   1395: aload_0
/*     */     //   1396: getfield P2 : Lf/Gp0;
/*     */     //   1399: invokevirtual H3 : ()B
/*     */     //   1402: if_icmpge -> 1564
/*     */     //   1405: aload_0
/*     */     //   1406: getfield P2 : Lf/Gp0;
/*     */     //   1409: iload_1
/*     */     //   1410: invokevirtual a0 : (B)Lf/PE;
/*     */     //   1413: dup
/*     */     //   1414: astore_2
/*     */     //   1415: ifnonnull -> 1421
/*     */     //   1418: goto -> 1556
/*     */     //   1421: aload_2
/*     */     //   1422: getfield Dq0 : B
/*     */     //   1425: ifle -> 1436
/*     */     //   1428: aload_0
/*     */     //   1429: iload_1
/*     */     //   1430: sipush #191
/*     */     //   1433: invokevirtual yw0 : (BS)V
/*     */     //   1436: aload_2
/*     */     //   1437: getfield Vn : B
/*     */     //   1440: ifle -> 1451
/*     */     //   1443: aload_0
/*     */     //   1444: iload_1
/*     */     //   1445: sipush #390
/*     */     //   1448: invokevirtual yw0 : (BS)V
/*     */     //   1451: aload_2
/*     */     //   1452: getfield Y20 : B
/*     */     //   1455: ifle -> 1466
/*     */     //   1458: aload_0
/*     */     //   1459: iload_1
/*     */     //   1460: sipush #446
/*     */     //   1463: invokevirtual yw0 : (BS)V
/*     */     //   1466: aload_2
/*     */     //   1467: getfield Fy0 : B
/*     */     //   1470: ifle -> 1481
/*     */     //   1473: aload_0
/*     */     //   1474: iload_1
/*     */     //   1475: sipush #519
/*     */     //   1478: invokevirtual yw0 : (BS)V
/*     */     //   1481: aload_2
/*     */     //   1482: getfield I6 : B
/*     */     //   1485: ifle -> 1496
/*     */     //   1488: aload_0
/*     */     //   1489: iload_1
/*     */     //   1490: sipush #518
/*     */     //   1493: invokevirtual yw0 : (BS)V
/*     */     //   1496: aload_2
/*     */     //   1497: getfield prn : B
/*     */     //   1500: ifle -> 1511
/*     */     //   1503: aload_0
/*     */     //   1504: iload_1
/*     */     //   1505: sipush #520
/*     */     //   1508: invokevirtual yw0 : (BS)V
/*     */     //   1511: aload_2
/*     */     //   1512: getfield prn : B
/*     */     //   1515: ifle -> 1526
/*     */     //   1518: aload_0
/*     */     //   1519: iload_1
/*     */     //   1520: sipush #520
/*     */     //   1523: invokevirtual yw0 : (BS)V
/*     */     //   1526: aload_2
/*     */     //   1527: getfield h30 : B
/*     */     //   1530: ifle -> 1541
/*     */     //   1533: aload_0
/*     */     //   1534: iload_1
/*     */     //   1535: sipush #366
/*     */     //   1538: invokevirtual yw0 : (BS)V
/*     */     //   1541: aload_2
/*     */     //   1542: getfield Au : Z
/*     */     //   1545: ifeq -> 1556
/*     */     //   1548: aload_0
/*     */     //   1549: iload_1
/*     */     //   1550: sipush #-551
/*     */     //   1553: invokevirtual yw0 : (BS)V
/*     */     //   1556: iload_1
/*     */     //   1557: iconst_1
/*     */     //   1558: iadd
/*     */     //   1559: i2b
/*     */     //   1560: istore_1
/*     */     //   1561: goto -> 1394
/*     */     //   1564: aload_0
/*     */     //   1565: getfield P2 : Lf/Gp0;
/*     */     //   1568: invokevirtual sQ : ()Z
/*     */     //   1571: ifeq -> 1584
/*     */     //   1574: aload_0
/*     */     //   1575: getfield P2 : Lf/Gp0;
/*     */     //   1578: invokevirtual RM : ()Z
/*     */     //   1581: ifeq -> 1617
/*     */     //   1584: aload_0
/*     */     //   1585: getfield P2 : Lf/Gp0;
/*     */     //   1588: dup
/*     */     //   1589: astore_1
/*     */     //   1590: getfield k5 : Z
/*     */     //   1593: ifne -> 1617
/*     */     //   1596: aload_1
/*     */     //   1597: getfield rx : Lf/ky;
/*     */     //   1600: getstatic f/ky.JH0 : Lf/ky;
/*     */     //   1603: if_acmpne -> 1609
/*     */     //   1606: goto -> 1617
/*     */     //   1609: aload_0
/*     */     //   1610: getstatic f/No0.Nw0 : Lf/No0;
/*     */     //   1613: putfield AJ0 : Lf/No0;
/*     */     //   1616: return
/*     */     //   1617: aload_0
/*     */     //   1618: dup
/*     */     //   1619: dup2
/*     */     //   1620: getfield fq : Lf/Ih0;
/*     */     //   1623: getfield I70 : Lf/eo;
/*     */     //   1626: getstatic f/vH.Lu : Lf/eo;
/*     */     //   1629: invokevirtual JL : (Lf/eo;)Lf/eo;
/*     */     //   1632: pop
/*     */     //   1633: getfield fq : Lf/Ih0;
/*     */     //   1636: dup
/*     */     //   1637: dup
/*     */     //   1638: dup2
/*     */     //   1639: ldc_w 50.0
/*     */     //   1642: putfield Bj : F
/*     */     //   1645: ldc 3.0
/*     */     //   1647: putfield el0 : F
/*     */     //   1650: ldc_w -10.0
/*     */     //   1653: putfield IG0 : F
/*     */     //   1656: ldc_w 0.1
/*     */     //   1659: putfield Ce0 : F
/*     */     //   1662: getstatic f/vH.AUX : Lf/eo;
/*     */     //   1665: dup
/*     */     //   1666: dup
/*     */     //   1667: getfield x : F
/*     */     //   1670: fstore_1
/*     */     //   1671: getfield y : F
/*     */     //   1674: fstore_2
/*     */     //   1675: getfield z : F
/*     */     //   1678: fstore_3
/*     */     //   1679: fload_1
/*     */     //   1680: fload_2
/*     */     //   1681: fload_3
/*     */     //   1682: invokevirtual mP : (FFF)V
/*     */     //   1685: getfield fq : Lf/Ih0;
/*     */     //   1688: iconst_1
/*     */     //   1689: invokevirtual abstract : (Z)V
/*     */     //   1692: getfield P2 : Lf/Gp0;
/*     */     //   1695: invokevirtual sQ : ()Z
/*     */     //   1698: ifeq -> 1874
/*     */     //   1701: aload_0
/*     */     //   1702: getfield P2 : Lf/Gp0;
/*     */     //   1705: dup
/*     */     //   1706: astore_1
/*     */     //   1707: getfield Ja : Lf/Mn;
/*     */     //   1710: getfield fQ : Z
/*     */     //   1713: ifeq -> 1874
/*     */     //   1716: aload_1
/*     */     //   1717: dup
/*     */     //   1718: aload_0
/*     */     //   1719: iconst_1
/*     */     //   1720: putfield gD0 : Z
/*     */     //   1723: invokevirtual nI : ()B
/*     */     //   1726: invokevirtual wB : (B)Lf/QZ;
/*     */     //   1729: invokevirtual lK : ()Ljava/util/List;
/*     */     //   1732: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1737: astore_1
/*     */     //   1738: aload_1
/*     */     //   1739: invokeinterface hasNext : ()Z
/*     */     //   1744: ifeq -> 1794
/*     */     //   1747: aload_1
/*     */     //   1748: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1753: checkcast f/uT
/*     */     //   1756: dup
/*     */     //   1757: getfield He0 : Lf/eo;
/*     */     //   1760: dup
/*     */     //   1761: astore_2
/*     */     //   1762: getfield x : F
/*     */     //   1765: ldc_w 0.95
/*     */     //   1768: fsub
/*     */     //   1769: aload_2
/*     */     //   1770: dup
/*     */     //   1771: getfield y : F
/*     */     //   1774: ldc_w 0.025
/*     */     //   1777: fsub
/*     */     //   1778: fstore_2
/*     */     //   1779: getfield z : F
/*     */     //   1782: ldc_w 1.69
/*     */     //   1785: fadd
/*     */     //   1786: fload_2
/*     */     //   1787: swap
/*     */     //   1788: invokevirtual WQ : (FFF)V
/*     */     //   1791: goto -> 1738
/*     */     //   1794: aload_0
/*     */     //   1795: getfield P2 : Lf/Gp0;
/*     */     //   1798: dup
/*     */     //   1799: invokevirtual hG0 : ()B
/*     */     //   1802: invokevirtual wB : (B)Lf/QZ;
/*     */     //   1805: invokevirtual lK : ()Ljava/util/List;
/*     */     //   1808: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1813: astore_1
/*     */     //   1814: aload_1
/*     */     //   1815: invokeinterface hasNext : ()Z
/*     */     //   1820: ifeq -> 1870
/*     */     //   1823: aload_1
/*     */     //   1824: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1829: checkcast f/uT
/*     */     //   1832: dup
/*     */     //   1833: getfield He0 : Lf/eo;
/*     */     //   1836: dup
/*     */     //   1837: astore_2
/*     */     //   1838: getfield x : F
/*     */     //   1841: ldc_w 2.35
/*     */     //   1844: fsub
/*     */     //   1845: aload_2
/*     */     //   1846: dup
/*     */     //   1847: getfield y : F
/*     */     //   1850: ldc_w 0.025
/*     */     //   1853: fsub
/*     */     //   1854: fstore_2
/*     */     //   1855: getfield z : F
/*     */     //   1858: ldc_w 1.62
/*     */     //   1861: fadd
/*     */     //   1862: fload_2
/*     */     //   1863: swap
/*     */     //   1864: invokevirtual WQ : (FFF)V
/*     */     //   1867: goto -> 1814
/*     */     //   1870: aload_0
/*     */     //   1871: invokevirtual wB0 : ()V
/*     */     //   1874: aload_0
/*     */     //   1875: dup
/*     */     //   1876: getfield LW : Lf/kf;
/*     */     //   1879: iconst_1
/*     */     //   1880: iconst_1
/*     */     //   1881: invokevirtual ny : (ZZ)V
/*     */     //   1884: getfield P2 : Lf/Gp0;
/*     */     //   1887: getfield dd : Lf/rK;
/*     */     //   1890: getstatic f/rK.Lpt9 : Lf/rK;
/*     */     //   1893: if_acmpeq -> 1905
/*     */     //   1896: aload_0
/*     */     //   1897: getfield LW : Lf/kf;
/*     */     //   1900: iconst_0
/*     */     //   1901: iconst_1
/*     */     //   1902: invokevirtual ny : (ZZ)V
/*     */     //   1905: iconst_0
/*     */     //   1906: istore_1
/*     */     //   1907: iload_1
/*     */     //   1908: aload_0
/*     */     //   1909: getfield P2 : Lf/Gp0;
/*     */     //   1912: invokevirtual H3 : ()B
/*     */     //   1915: if_icmpge -> 2088
/*     */     //   1918: aload_0
/*     */     //   1919: getfield P2 : Lf/Gp0;
/*     */     //   1922: dup
/*     */     //   1923: astore_2
/*     */     //   1924: getfield Ja : Lf/Mn;
/*     */     //   1927: getstatic f/Mn.VK : Lf/Mn;
/*     */     //   1930: if_acmpne -> 1954
/*     */     //   1933: aload_2
/*     */     //   1934: invokevirtual sQ : ()Z
/*     */     //   1937: ifne -> 1954
/*     */     //   1940: iload_1
/*     */     //   1941: aload_0
/*     */     //   1942: getfield P2 : Lf/Gp0;
/*     */     //   1945: invokevirtual hG0 : ()B
/*     */     //   1948: if_icmpne -> 1954
/*     */     //   1951: goto -> 2080
/*     */     //   1954: aload_0
/*     */     //   1955: getfield P2 : Lf/Gp0;
/*     */     //   1958: getfield Ja : Lf/Mn;
/*     */     //   1961: getstatic f/Mn.JY : Lf/Mn;
/*     */     //   1964: if_acmpne -> 1970
/*     */     //   1967: goto -> 2080
/*     */     //   1970: iconst_0
/*     */     //   1971: istore_2
/*     */     //   1972: iload_2
/*     */     //   1973: aload_0
/*     */     //   1974: getfield P2 : Lf/Gp0;
/*     */     //   1977: dup
/*     */     //   1978: astore_3
/*     */     //   1979: getfield cl : [[Lf/hm0;
/*     */     //   1982: iload_1
/*     */     //   1983: aaload
/*     */     //   1984: arraylength
/*     */     //   1985: if_icmpge -> 2080
/*     */     //   1988: iload_1
/*     */     //   1989: aload_0
/*     */     //   1990: dup
/*     */     //   1991: aload_3
/*     */     //   1992: iload_1
/*     */     //   1993: iload_2
/*     */     //   1994: invokevirtual N0 : (BB)Lf/hm0;
/*     */     //   1997: astore_3
/*     */     //   1998: getfield LW : Lf/kf;
/*     */     //   2001: iload_1
/*     */     //   2002: iload_2
/*     */     //   2003: invokevirtual Oh : (BB)Lf/Hj;
/*     */     //   2006: aload_3
/*     */     //   2007: invokevirtual Cg0 : (Lf/hm0;)V
/*     */     //   2010: getfield P2 : Lf/Gp0;
/*     */     //   2013: invokevirtual hG0 : ()B
/*     */     //   2016: if_icmpne -> 2060
/*     */     //   2019: aload_0
/*     */     //   2020: getfield P2 : Lf/Gp0;
/*     */     //   2023: dup
/*     */     //   2024: astore_3
/*     */     //   2025: getfield dd : Lf/rK;
/*     */     //   2028: getstatic f/rK.Lpt9 : Lf/rK;
/*     */     //   2031: if_acmpne -> 2048
/*     */     //   2034: aload_3
/*     */     //   2035: dup
/*     */     //   2036: invokevirtual hG0 : ()B
/*     */     //   2039: invokevirtual wB : (B)Lf/QZ;
/*     */     //   2042: invokevirtual Oi : ()V
/*     */     //   2045: goto -> 2072
/*     */     //   2048: aload_3
/*     */     //   2049: iload_1
/*     */     //   2050: invokevirtual wB : (B)Lf/QZ;
/*     */     //   2053: iconst_1
/*     */     //   2054: putfield C10 : Z
/*     */     //   2057: goto -> 2072
/*     */     //   2060: aload_0
/*     */     //   2061: getfield P2 : Lf/Gp0;
/*     */     //   2064: iload_1
/*     */     //   2065: invokevirtual wB : (B)Lf/QZ;
/*     */     //   2068: iconst_1
/*     */     //   2069: putfield C10 : Z
/*     */     //   2072: iload_2
/*     */     //   2073: iconst_1
/*     */     //   2074: iadd
/*     */     //   2075: i2b
/*     */     //   2076: istore_2
/*     */     //   2077: goto -> 1972
/*     */     //   2080: iload_1
/*     */     //   2081: iconst_1
/*     */     //   2082: iadd
/*     */     //   2083: i2b
/*     */     //   2084: istore_1
/*     */     //   2085: goto -> 1907
/*     */     //   2088: aload_0
/*     */     //   2089: getfield P2 : Lf/Gp0;
/*     */     //   2092: getfield Ja : Lf/Mn;
/*     */     //   2095: dup
/*     */     //   2096: astore_1
/*     */     //   2097: getstatic f/Mn.VK : Lf/Mn;
/*     */     //   2100: if_acmpne -> 2131
/*     */     //   2103: aload_0
/*     */     //   2104: dup
/*     */     //   2105: dup
/*     */     //   2106: getstatic f/No0.L10 : Lf/No0;
/*     */     //   2109: putfield AJ0 : Lf/No0;
/*     */     //   2112: getfield LW : Lf/kf;
/*     */     //   2115: iconst_1
/*     */     //   2116: iconst_0
/*     */     //   2117: invokevirtual ny : (ZZ)V
/*     */     //   2120: getfield LW : Lf/kf;
/*     */     //   2123: iconst_0
/*     */     //   2124: iconst_0
/*     */     //   2125: invokevirtual ny : (ZZ)V
/*     */     //   2128: goto -> 2173
/*     */     //   2131: aload_1
/*     */     //   2132: getstatic f/Mn.JY : Lf/Mn;
/*     */     //   2135: if_acmpne -> 2166
/*     */     //   2138: aload_0
/*     */     //   2139: dup
/*     */     //   2140: dup
/*     */     //   2141: getstatic f/No0.zI0 : Lf/No0;
/*     */     //   2144: putfield AJ0 : Lf/No0;
/*     */     //   2147: getfield LW : Lf/kf;
/*     */     //   2150: iconst_1
/*     */     //   2151: iconst_0
/*     */     //   2152: invokevirtual ny : (ZZ)V
/*     */     //   2155: getfield LW : Lf/kf;
/*     */     //   2158: iconst_0
/*     */     //   2159: iconst_0
/*     */     //   2160: invokevirtual ny : (ZZ)V
/*     */     //   2163: goto -> 2173
/*     */     //   2166: aload_0
/*     */     //   2167: getstatic f/No0.JJ : Lf/No0;
/*     */     //   2170: putfield AJ0 : Lf/No0;
/*     */     //   2173: aload_0
/*     */     //   2174: invokevirtual Lpt1 : ()V
/*     */     //   2177: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 4
/*     */     //   #2	-> 7
/*     */     //   #3	-> 43
/*     */     //   #4	-> 47
/*     */     //   #5	-> 63
/*     */     //   #6	-> 71
/*     */     //   #7	-> 91
/*     */     //   #8	-> 95
/*     */     //   #9	-> 127
/*     */     //   #10	-> 131
/*     */     //   #11	-> 132
/*     */     //   #12	-> 165
/*     */     //   #13	-> 169
/*     */     //   #14	-> 180
/*     */     //   #15	-> 186
/*     */     //   #16	-> 195
/*     */     //   #17	-> 222
/*     */     //   #18	-> 231
/*     */     //   #19	-> 235
/*     */     //   #20	-> 256
/*     */     //   #21	-> 259
/*     */     //   #22	-> 270
/*     */     //   #23	-> 319
/*     */     //   #24	-> 374
/*     */     //   #25	-> 378
/*     */     //   #26	-> 382
/*     */     //   #27	-> 385
/*     */     //   #28	-> 395
/*     */     //   #29	-> 402
/*     */     //   #30	-> 407
/*     */     //   #31	-> 432
/*     */     //   #32	-> 483
/*     */     //   #33	-> 488
/*     */     //   #34	-> 492
/*     */     //   #35	-> 495
/*     */     //   #36	-> 502
/*     */     //   #37	-> 512
/*     */     //   #38	-> 523
/*     */     //   #39	-> 526
/*     */     //   #40	-> 548
/*     */     //   #41	-> 556
/*     */     //   #42	-> 559
/*     */     //   #43	-> 563
/*     */     //   #44	-> 583
/*     */     //   #45	-> 594
/*     */     //   #46	-> 597
/*     */     //   #47	-> 624
/*     */     //   #48	-> 633
/*     */     //   #49	-> 636
/*     */     //   #50	-> 639
/*     */     //   #51	-> 660
/*     */     //   #52	-> 671
/*     */     //   #53	-> 674
/*     */     //   #54	-> 694
/*     */     //   #55	-> 704
/*     */     //   #56	-> 707
/*     */     //   #57	-> 713
/*     */     //   #58	-> 716
/*     */     //   #59	-> 740
/*     */     //   #60	-> 751
/*     */     //   #61	-> 758
/*     */     //   #62	-> 768
/*     */     //   #63	-> 772
/*     */     //   #64	-> 847
/*     */     //   #65	-> 850
/*     */     //   #66	-> 1081
/*     */     //   #67	-> 1085
/*     */     //   #68	-> 1088
/*     */     //   #69	-> 1093
/*     */     //   #70	-> 1374
/*     */     //   #71	-> 1377
/*     */     //   #72	-> 1380
/*     */     //   #73	-> 1383
/*     */     //   #74	-> 1422
/*     */     //   #75	-> 1433
/*     */     //   #76	-> 1437
/*     */     //   #77	-> 1448
/*     */     //   #78	-> 1452
/*     */     //   #79	-> 1463
/*     */     //   #80	-> 1467
/*     */     //   #81	-> 1478
/*     */     //   #82	-> 1482
/*     */     //   #83	-> 1493
/*     */     //   #84	-> 1497
/*     */     //   #85	-> 1508
/*     */     //   #86	-> 1512
/*     */     //   #87	-> 1523
/*     */     //   #88	-> 1527
/*     */     //   #89	-> 1538
/*     */     //   #90	-> 1542
/*     */     //   #91	-> 1553
/*     */     //   #92	-> 1565
/*     */     //   #93	-> 1590
/*     */     //   #94	-> 1597
/*     */     //   #95	-> 1600
/*     */     //   #96	-> 1613
/*     */     //   #97	-> 1620
/*     */     //   #98	-> 1689
/*     */     //   #99	-> 1692
/*     */     //   #100	-> 1707
/*     */     //   #101	-> 1710
/*     */     //   #102	-> 1720
/*     */     //   #103	-> 1757
/*     */     //   #104	-> 1762
/*     */     //   #105	-> 1771
/*     */     //   #106	-> 1779
/*     */     //   #107	-> 1788
/*     */     //   #108	-> 1833
/*     */     //   #109	-> 1838
/*     */     //   #110	-> 1847
/*     */     //   #111	-> 1855
/*     */     //   #112	-> 1864
/*     */     //   #113	-> 1887
/*     */     //   #114	-> 1890
/*     */     //   #115	-> 1924
/*     */     //   #116	-> 1927
/*     */     //   #117	-> 1958
/*     */     //   #118	-> 1961
/*     */     //   #119	-> 1979
/*     */     //   #120	-> 1983
/*     */     //   #121	-> 1984
/*     */     //   #122	-> 1998
/*     */     //   #123	-> 2003
/*     */     //   #124	-> 2025
/*     */     //   #125	-> 2028
/*     */     //   #126	-> 2054
/*     */     //   #127	-> 2061
/*     */     //   #128	-> 2069
/*     */     //   #129	-> 2089
/*     */     //   #130	-> 2092
/*     */     //   #131	-> 2097
/*     */     //   #132	-> 2109
/*     */     //   #133	-> 2112
/*     */     //   #134	-> 2144
/*     */     //   #135	-> 2147
/*     */     //   #136	-> 2170
/*     */     //   #137	-> 2174
/*     */   }
/*     */   
/*     */   public final void hY() {
/*     */     int i = UB0.M60.fG0(), j = UB0.M60.dL();
/*     */     if (km.XU()) {
/*     */       int k;
/*     */       cx0 cx01 = this.Ez;
/*     */       Y00 y002;
/*     */       if ((y002 = km.wI0.pY) != null) {
/*     */         k = y002.E80.rS;
/*     */       } else {
/*     */         k = UB0.M60.fG0();
/*     */       } 
/*     */       cx01.af = k;
/*     */       cx01 = this.Ez;
/*     */       Y00 y001;
/*     */       float f1 = (((y001 = km.wI0.pY) != null) ? y001.E80.Z : UB0.M60.dL());
/*     */       cx01.sf0 = f1;
/*     */       this.uU = true;
/*     */     } else {
/*     */       cf.IX(h1.Ju0, false);
/*     */       this.Ez.af = cf.hf0;
/*     */       this.Ez.sf0 = cf.G30;
/*     */       this.uU = false;
/*     */     } 
/*     */     cx0.dA = ((i - (int)cx0.af) / 2);
/*     */     cx0 cx0;
/*     */     (cx0 = this.Ez).zA0 = (j - (int)cx0.sf0 - 50);
/*     */     if ((cx0 = this.gt).af == 0.0F && cx0.sf0 == 0.0F && this.gr0 == null && !km.XU()) {
/*     */       cx0.af = 1.0F;
/*     */       cx0.sf0 = 1.0F;
/*     */       float f1;
/*     */       cx0.dA = (f1 = i) / 2.0F;
/*     */       float f2;
/*     */       (cx0 = this.gt).zA0 = (f2 = j) / 2.0F;
/*     */       float f3 = this.Ez.af;
/*     */       Quint quint = Quint.IN;
/*     */       cx0 cx01;
/*     */       f2 = (f1 - (cx01 = this.Ez).af) / 2.0F;
/*     */       (Wz0.gq(this.gt, 3, 0.5F).n20(f2, f2 - cx01.sf0 - 50.0F)).st = (i0)quint;
/*     */       this.gr0 = (So)So.k60().L5().PL(Wz0.gq(this.gt, 6, 0.5F).n20(f3, this.Ez.sf0)).PL(Wz0.gq(this.gt, 3, 0.5F).n20(f2, f2 - cx01.sf0 - 50.0F)).Kr().mg(this.dr0);
/*     */     } else if (this.gr0 == null) {
/*     */       this.gt.af = (cx0 = this.Ez).af;
/*     */       this.gt.sf0 = cx0.sf0;
/*     */       this.gt.dA = cx0.dA;
/*     */       this.gt.zA0 = cx0.zA0;
/*     */       if (km.XU()) {
/*     */         this.gt.dA = 0.0F;
/*     */         this.gt.zA0 = 0.0F;
/*     */       } 
/*     */     } 
/*     */     this.fq.gV = (cx0 = this.gt).af;
/*     */     this.fq.oA = cx0.sf0;
/*     */     this.fq.abstract(false);
/*     */     Math.min((cx0 = this.Ez).af / 256.0F, cx0.sf0 / 200.0F);
/*     */     float f = 1.0F;
/*     */     if (this.fk == null) {
/*     */       Tm tm;
/*     */       float f1 = i;
/*     */       this(f1, j);
/*     */       this.fk = tm;
/*     */     } 
/*     */     if (this.gr0 == null) {
/*     */       this.fk.nUl = f;
/*     */       this.fk.Wt(256.0F, 200.0F, false);
/*     */       this.fk.UX(true);
/*     */       this.yn0.d60(this.fk.VD0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void s2(byte paramByte1, float paramFloat, byte paramByte2) {
/*     */     if (this.P2.wB(paramByte1).lK() != null) {
/*     */       this.gD0 = true;
/*     */       byte b = 0;
/*     */       this.jW = So.k60().L5();
/*     */       for (uT uT : this.P2.wB(paramByte1).lK()) {
/*     */         eo eo2;
/*     */         b++;
/*     */         if (b != paramByte2)
/*     */           continue; 
/*     */         if (paramByte1 == this.P2.nI()) {
/*     */           eo2 = xC;
/*     */         } else {
/*     */           eo2 = Zu;
/*     */         } 
/*     */         uT.WI0(eo2);
/*     */         uT.He0.Tz(paramFloat, -0.025F, 0.0F);
/*     */         uT.hA0(0.0F, 0.0F, 0.0F, 0.0F);
/*     */         float f1 = uT.He0.x + 1.5F, f2 = uT.He0.y, f3 = uT.He0.z;
/*     */         eo eo1;
/*     */         f1 = (eo1 = uT.He0).x + 0.5F;
/*     */         f2 = uT.He0.y;
/*     */         (Wz0.gq(uT, 4, 0.5F).qw0(f1, f2, eo1.z + 1.0F)).st = (i0)Quad.IN;
/*     */         this.jW.PL(Wz0.aG(4, uT).qw0(f1, f2, f3)).L5().PL(Wz0.gq(uT, 4, 0.5F).qw0(f1, f2, eo1.z + 1.0F)).Kr();
/*     */       } 
/*     */       this.jW.Kr().mg(this.dr0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void bt0() {
/*     */     this.ZH = System.currentTimeMillis();
/*     */     So so;
/*     */     if ((so = this.iD) != null) {
/*     */       so.fr0 = true;
/*     */       this.iD = null;
/*     */       float f1 = AUX.x, f2 = AUX.y, f3 = AUX.z;
/*     */       f1 = Lu.x;
/*     */       f2 = Lu.y;
/*     */       f3 = Lu.z;
/*     */       So.k60().L5().PL(Wz0.gq(this.fq, 4, 0.5F).qw0(f1, f2, f3)).PL(Wz0.gq(this.fq, 9, 0.5F).qw0(f1, f2, f3)).Kr().mg(this.dr0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void wB0() {
/*     */     this.ZH = System.currentTimeMillis();
/*     */     So so;
/*     */     if ((so = this.iD) != null) {
/*     */       so.fr0 = true;
/*     */       this.iD = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final kg0 gH0() {
/*     */     return this.jv0;
/*     */   }
/*     */   
/*     */   public final void yw0(byte paramByte, short paramShort) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: aload_0
/*     */     //   2: getfield P2 : Lf/Gp0;
/*     */     //   5: iload_1
/*     */     //   6: invokevirtual a0 : (B)Lf/PE;
/*     */     //   9: astore_3
/*     */     //   10: aconst_null
/*     */     //   11: astore #4
/*     */     //   13: ifge -> 44
/*     */     //   16: iload_1
/*     */     //   17: ifne -> 31
/*     */     //   20: iload_2
/*     */     //   21: sipush #10000
/*     */     //   24: iadd
/*     */     //   25: i2s
/*     */     //   26: istore #5
/*     */     //   28: goto -> 60
/*     */     //   31: iload_2
/*     */     //   32: iconst_m1
/*     */     //   33: imul
/*     */     //   34: sipush #10000
/*     */     //   37: isub
/*     */     //   38: i2s
/*     */     //   39: istore #5
/*     */     //   41: goto -> 60
/*     */     //   44: iload_1
/*     */     //   45: ifne -> 54
/*     */     //   48: iload_2
/*     */     //   49: istore #5
/*     */     //   51: goto -> 60
/*     */     //   54: iload_2
/*     */     //   55: iconst_m1
/*     */     //   56: imul
/*     */     //   57: i2s
/*     */     //   58: istore #5
/*     */     //   60: aload_3
/*     */     //   61: ifnull -> 693
/*     */     //   64: iload_2
/*     */     //   65: lookupswitch default -> 156, -551 -> 674, -543 -> 610, 191 -> 416, 366 -> 383, 390 -> 313, 446 -> 280, 518 -> 247, 519 -> 214, 520 -> 181, 1046 -> 159
/*     */     //   156: goto -> 693
/*     */     //   159: aload_3
/*     */     //   160: getfield c9 : Z
/*     */     //   163: ifeq -> 693
/*     */     //   166: aload_0
/*     */     //   167: getfield nv0 : Lf/kg0;
/*     */     //   170: ldc_w 'custom/big_chicken_flap'
/*     */     //   173: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   176: astore #4
/*     */     //   178: goto -> 693
/*     */     //   181: aload_3
/*     */     //   182: getfield prn : B
/*     */     //   185: ifle -> 693
/*     */     //   188: iload_1
/*     */     //   189: aload_0
/*     */     //   190: dup
/*     */     //   191: getfield nv0 : Lf/kg0;
/*     */     //   194: astore_1
/*     */     //   195: ldc_w 'field_effects/pledge_swamp_'
/*     */     //   198: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   201: astore_2
/*     */     //   202: getfield P2 : Lf/Gp0;
/*     */     //   205: invokevirtual hG0 : ()B
/*     */     //   208: if_icmpne -> 647
/*     */     //   211: goto -> 640
/*     */     //   214: aload_3
/*     */     //   215: getfield Fy0 : B
/*     */     //   218: ifle -> 693
/*     */     //   221: iload_1
/*     */     //   222: aload_0
/*     */     //   223: dup
/*     */     //   224: getfield nv0 : Lf/kg0;
/*     */     //   227: astore_1
/*     */     //   228: ldc_w 'field_effects/pledge_field_of_fire_'
/*     */     //   231: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   234: astore_2
/*     */     //   235: getfield P2 : Lf/Gp0;
/*     */     //   238: invokevirtual hG0 : ()B
/*     */     //   241: if_icmpne -> 647
/*     */     //   244: goto -> 640
/*     */     //   247: aload_3
/*     */     //   248: getfield I6 : B
/*     */     //   251: ifle -> 693
/*     */     //   254: iload_1
/*     */     //   255: aload_0
/*     */     //   256: dup
/*     */     //   257: getfield nv0 : Lf/kg0;
/*     */     //   260: astore_1
/*     */     //   261: ldc_w 'field_effects/pledge_rainbow_'
/*     */     //   264: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   267: astore_2
/*     */     //   268: getfield P2 : Lf/Gp0;
/*     */     //   271: invokevirtual hG0 : ()B
/*     */     //   274: if_icmpne -> 647
/*     */     //   277: goto -> 640
/*     */     //   280: aload_3
/*     */     //   281: getfield Y20 : B
/*     */     //   284: ifle -> 693
/*     */     //   287: iload_1
/*     */     //   288: aload_0
/*     */     //   289: dup
/*     */     //   290: getfield nv0 : Lf/kg0;
/*     */     //   293: astore_1
/*     */     //   294: ldc_w 'field_effects/stealth_rock_'
/*     */     //   297: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   300: astore_2
/*     */     //   301: getfield P2 : Lf/Gp0;
/*     */     //   304: invokevirtual hG0 : ()B
/*     */     //   307: if_icmpne -> 647
/*     */     //   310: goto -> 640
/*     */     //   313: aload_3
/*     */     //   314: getfield Vn : B
/*     */     //   317: dup
/*     */     //   318: istore_2
/*     */     //   319: iconst_1
/*     */     //   320: if_icmpeq -> 357
/*     */     //   323: iload_2
/*     */     //   324: iconst_2
/*     */     //   325: if_icmpeq -> 331
/*     */     //   328: goto -> 693
/*     */     //   331: iload_1
/*     */     //   332: aload_0
/*     */     //   333: dup
/*     */     //   334: getfield nv0 : Lf/kg0;
/*     */     //   337: astore_1
/*     */     //   338: ldc_w 'field_effects/toxic_spikes_'
/*     */     //   341: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   344: astore_2
/*     */     //   345: getfield P2 : Lf/Gp0;
/*     */     //   348: invokevirtual hG0 : ()B
/*     */     //   351: if_icmpne -> 526
/*     */     //   354: goto -> 519
/*     */     //   357: iload_1
/*     */     //   358: aload_0
/*     */     //   359: dup
/*     */     //   360: getfield nv0 : Lf/kg0;
/*     */     //   363: astore_1
/*     */     //   364: ldc_w 'field_effects/toxic_spikes_'
/*     */     //   367: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   370: astore_2
/*     */     //   371: getfield P2 : Lf/Gp0;
/*     */     //   374: invokevirtual hG0 : ()B
/*     */     //   377: if_icmpne -> 583
/*     */     //   380: goto -> 576
/*     */     //   383: aload_3
/*     */     //   384: getfield h30 : B
/*     */     //   387: ifle -> 693
/*     */     //   390: iload_1
/*     */     //   391: aload_0
/*     */     //   392: dup
/*     */     //   393: getfield nv0 : Lf/kg0;
/*     */     //   396: astore_1
/*     */     //   397: ldc_w 'field_effects/tailwind_'
/*     */     //   400: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   403: astore_2
/*     */     //   404: getfield P2 : Lf/Gp0;
/*     */     //   407: invokevirtual hG0 : ()B
/*     */     //   410: if_icmpne -> 647
/*     */     //   413: goto -> 640
/*     */     //   416: aload_3
/*     */     //   417: getfield Dq0 : B
/*     */     //   420: dup
/*     */     //   421: istore_2
/*     */     //   422: iconst_1
/*     */     //   423: if_icmpeq -> 553
/*     */     //   426: iload_2
/*     */     //   427: iconst_2
/*     */     //   428: if_icmpeq -> 496
/*     */     //   431: iload_2
/*     */     //   432: iconst_3
/*     */     //   433: if_icmpeq -> 439
/*     */     //   436: goto -> 693
/*     */     //   439: iload_1
/*     */     //   440: aload_0
/*     */     //   441: dup
/*     */     //   442: getfield nv0 : Lf/kg0;
/*     */     //   445: astore_1
/*     */     //   446: ldc_w 'field_effects/spikes_'
/*     */     //   449: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   452: astore_2
/*     */     //   453: getfield P2 : Lf/Gp0;
/*     */     //   456: invokevirtual hG0 : ()B
/*     */     //   459: if_icmpne -> 469
/*     */     //   462: ldc_w 'allied'
/*     */     //   465: astore_3
/*     */     //   466: goto -> 473
/*     */     //   469: ldc_w 'enemy'
/*     */     //   472: astore_3
/*     */     //   473: aload_1
/*     */     //   474: aload_2
/*     */     //   475: aload_3
/*     */     //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   479: ldc_w '_field_l3'
/*     */     //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   485: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   488: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   491: astore #4
/*     */     //   493: goto -> 693
/*     */     //   496: iload_1
/*     */     //   497: aload_0
/*     */     //   498: dup
/*     */     //   499: getfield nv0 : Lf/kg0;
/*     */     //   502: astore_1
/*     */     //   503: ldc_w 'field_effects/spikes_'
/*     */     //   506: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   509: astore_2
/*     */     //   510: getfield P2 : Lf/Gp0;
/*     */     //   513: invokevirtual hG0 : ()B
/*     */     //   516: if_icmpne -> 526
/*     */     //   519: ldc_w 'allied'
/*     */     //   522: astore_3
/*     */     //   523: goto -> 530
/*     */     //   526: ldc_w 'enemy'
/*     */     //   529: astore_3
/*     */     //   530: aload_1
/*     */     //   531: aload_2
/*     */     //   532: aload_3
/*     */     //   533: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   536: ldc_w '_field_l2'
/*     */     //   539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   542: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   545: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   548: astore #4
/*     */     //   550: goto -> 693
/*     */     //   553: iload_1
/*     */     //   554: aload_0
/*     */     //   555: dup
/*     */     //   556: getfield nv0 : Lf/kg0;
/*     */     //   559: astore_1
/*     */     //   560: ldc_w 'field_effects/spikes_'
/*     */     //   563: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   566: astore_2
/*     */     //   567: getfield P2 : Lf/Gp0;
/*     */     //   570: invokevirtual hG0 : ()B
/*     */     //   573: if_icmpne -> 583
/*     */     //   576: ldc_w 'allied'
/*     */     //   579: astore_3
/*     */     //   580: goto -> 587
/*     */     //   583: ldc_w 'enemy'
/*     */     //   586: astore_3
/*     */     //   587: aload_1
/*     */     //   588: aload_2
/*     */     //   589: aload_3
/*     */     //   590: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   593: ldc_w '_field_l1'
/*     */     //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   599: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   602: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   605: astore #4
/*     */     //   607: goto -> 693
/*     */     //   610: aload_3
/*     */     //   611: getfield ax0 : B
/*     */     //   614: ifle -> 693
/*     */     //   617: iload_1
/*     */     //   618: aload_0
/*     */     //   619: dup
/*     */     //   620: getfield nv0 : Lf/kg0;
/*     */     //   623: astore_1
/*     */     //   624: ldc_w 'field_effects/healing_field_'
/*     */     //   627: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   630: astore_2
/*     */     //   631: getfield P2 : Lf/Gp0;
/*     */     //   634: invokevirtual hG0 : ()B
/*     */     //   637: if_icmpne -> 647
/*     */     //   640: ldc_w 'allied'
/*     */     //   643: astore_3
/*     */     //   644: goto -> 651
/*     */     //   647: ldc_w 'enemy'
/*     */     //   650: astore_3
/*     */     //   651: aload_1
/*     */     //   652: aload_2
/*     */     //   653: aload_3
/*     */     //   654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   657: ldc_w '_field'
/*     */     //   660: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   663: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   666: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   669: astore #4
/*     */     //   671: goto -> 693
/*     */     //   674: aload_3
/*     */     //   675: getfield Au : Z
/*     */     //   678: ifeq -> 693
/*     */     //   681: aload_0
/*     */     //   682: getfield nv0 : Lf/kg0;
/*     */     //   685: ldc_w 'field_effects/maelstrom'
/*     */     //   688: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*     */     //   691: astore #4
/*     */     //   693: aload_0
/*     */     //   694: getfield Wt : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   697: iload #5
/*     */     //   699: invokestatic valueOf : (S)Ljava/lang/Short;
/*     */     //   702: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   705: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*     */     //   708: dup
/*     */     //   709: astore_1
/*     */     //   710: ifnull -> 734
/*     */     //   713: aload_0
/*     */     //   714: dup
/*     */     //   715: getfield nv0 : Lf/kg0;
/*     */     //   718: aload_1
/*     */     //   719: invokevirtual Ow0 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;)V
/*     */     //   722: getfield Wt : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   725: iload #5
/*     */     //   727: invokestatic valueOf : (S)Ljava/lang/Short;
/*     */     //   730: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   733: pop
/*     */     //   734: aload #4
/*     */     //   736: ifnull -> 768
/*     */     //   739: aload_0
/*     */     //   740: dup
/*     */     //   741: aload #4
/*     */     //   743: invokevirtual start : ()V
/*     */     //   746: getfield nv0 : Lf/kg0;
/*     */     //   749: aload #4
/*     */     //   751: invokevirtual L40 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;)V
/*     */     //   754: getfield Wt : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   757: iload #5
/*     */     //   759: invokestatic valueOf : (S)Ljava/lang/Short;
/*     */     //   762: aload #4
/*     */     //   764: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   767: pop
/*     */     //   768: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 160
/*     */     //   #2	-> 167
/*     */     //   #3	-> 182
/*     */     //   #4	-> 191
/*     */     //   #5	-> 195
/*     */     //   #6	-> 202
/*     */     //   #7	-> 215
/*     */     //   #8	-> 224
/*     */     //   #9	-> 228
/*     */     //   #10	-> 235
/*     */     //   #11	-> 248
/*     */     //   #12	-> 257
/*     */     //   #13	-> 261
/*     */     //   #14	-> 268
/*     */     //   #15	-> 281
/*     */     //   #16	-> 290
/*     */     //   #17	-> 294
/*     */     //   #18	-> 301
/*     */     //   #19	-> 314
/*     */     //   #20	-> 334
/*     */     //   #21	-> 338
/*     */     //   #22	-> 345
/*     */     //   #23	-> 364
/*     */     //   #24	-> 371
/*     */     //   #25	-> 384
/*     */     //   #26	-> 393
/*     */     //   #27	-> 397
/*     */     //   #28	-> 404
/*     */     //   #29	-> 417
/*     */     //   #30	-> 442
/*     */     //   #31	-> 446
/*     */     //   #32	-> 453
/*     */     //   #33	-> 503
/*     */     //   #34	-> 510
/*     */     //   #35	-> 560
/*     */     //   #36	-> 567
/*     */     //   #37	-> 611
/*     */     //   #38	-> 620
/*     */     //   #39	-> 624
/*     */     //   #40	-> 631
/*     */     //   #41	-> 675
/*     */     //   #42	-> 682
/*     */   }
/*     */   
/*     */   public final void qg0(byte paramByte, short paramShort) {
/*     */     if (paramShort < 0) {
/*     */       if (paramByte == 0) {
/*     */         paramShort = (short)(paramShort + 10000);
/*     */       } else {
/*     */         paramShort = (short)(paramShort * -1 - 10000);
/*     */       } 
/*     */     } else if (paramByte != 0) {
/*     */       paramShort = (short)(paramShort * -1);
/*     */     } 
/*     */     ParticleEffectExt particleEffectExt;
/*     */     if ((particleEffectExt = (ParticleEffectExt)this.Wt.get(Short.valueOf(paramShort))) != null) {
/*     */       this.nv0.Ow0(particleEffectExt);
/*     */       this.Wt.remove(Short.valueOf(paramShort));
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void Sd(Mx paramMx) {
/*     */     if (paramMx == this.Ga)
/*     */       return; 
/*     */     ParticleEffectExt particleEffectExt = null;
/*     */     this(this.f2);
/*     */     qo qo1;
/*     */     Xi xi = km.wI0.iJ0;
/*     */     boolean bool = false;
/*     */     G30 g30 = this.dr0;
/*     */     switch (paramMx.ordinal()) {
/*     */       case 8:
/*     */         qo1.vF0.set(0.12F, 0.12F, 0.21F, 0.5F);
/*     */         bool = true;
/*     */         break;
/*     */       case 5:
/*     */         particleEffectExt = this.Mz.gi0("weather/snowbattle");
/*     */         break;
/*     */       case 4:
/*     */         particleEffectExt = this.Mz.gi0("weather/fogbattle");
/*     */         break;
/*     */       case 3:
/*     */         particleEffectExt = this.Mz.gi0("weather/sandstormbattle");
/*     */         break;
/*     */       case 2:
/*     */       case 6:
/*     */       case 7:
/*     */         particleEffectExt = this.Mz.gi0("weather/rainbattle");
/*     */         break;
/*     */       case 1:
/*     */         qo1.vF0.set(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         bool = true;
/*     */         break;
/*     */     } 
/*     */     if (!this.I1) {
/*     */       Color color;
/*     */       float[] arrayOfFloat;
/*     */       if (bool) {
/*     */         this.m60 = true;
/*     */         arrayOfFloat[0] = color.r;
/*     */         arrayOfFloat[1] = color.g;
/*     */         arrayOfFloat[2] = color.b;
/*     */         (arrayOfFloat = new float[4])[3] = (color = qo1.vF0).a;
/*     */         this.jW = (So)So.k60().L5().PL(Wz0.gq(this.f2.vF0, 0, 1.4F).qY(new float[4])).Kr().mg(g30);
/*     */       } else {
/*     */         if (arrayOfFloat != null)
/*     */           arrayOfFloat.Iy((qo)color); 
/*     */         this.m60 = false;
/*     */       } 
/*     */       switch (paramMx.ordinal()) {
/*     */         default:
/*     */           this.Pz[0] = 0.0F;
/*     */           this.Pz[1] = 0.0F;
/*     */           this.Pz[2] = 0.0F;
/*     */           this.Pz[3] = 0.0F;
/*     */           break;
/*     */         case 2:
/*     */         case 3:
/*     */         case 4:
/*     */         case 5:
/*     */         case 6:
/*     */         case 7:
/*     */           this.Pz[0] = 0.0F;
/*     */           this.Pz[1] = 0.0F;
/*     */           this.Pz[2] = 0.0F;
/*     */           this.Pz[3] = 0.35F;
/*     */           break;
/*     */         case 1:
/*     */           this.Pz[0] = 1.0F;
/*     */           this.Pz[1] = 1.0F;
/*     */           this.Pz[2] = 0.7F;
/*     */           this.Pz[3] = 0.17F;
/*     */           break;
/*     */       } 
/*     */     } 
/*     */     if (this.fG != null)
/*     */       this.Mz.strictfp(); 
/*     */     if (particleEffectExt != null) {
/*     */       particleEffectExt.start();
/*     */       this.Mz.L40(particleEffectExt);
/*     */       this.fG = particleEffectExt;
/*     */     } 
/*     */     Hc0 hc0;
/*     */     for (this.jW = So.k60().L5(), hc0 = this.IO.xl0.r30(); hc0.hasNext(); ) {
/*     */       T0 t0 = (T0)hc0.next();
/*     */       arrayOfFloat1[0] = arrayOfFloat2[0];
/*     */       arrayOfFloat1[1] = arrayOfFloat2[1];
/*     */       arrayOfFloat1[2] = arrayOfFloat2[2];
/*     */       float[] arrayOfFloat1, arrayOfFloat2;
/*     */       (arrayOfFloat1 = new float[4])[3] = (arrayOfFloat2 = this.Pz)[3];
/*     */       this.jW.PL(Wz0.gq(t0, 10, 1.0F).qY(new float[4]));
/*     */     } 
/*     */     for (hc0 = this.COM7.xl0.r30(); hc0.hasNext(); ) {
/*     */       T0 t0 = (T0)hc0.next();
/*     */       arrayOfFloat1[0] = arrayOfFloat2[0];
/*     */       arrayOfFloat1[1] = arrayOfFloat2[1];
/*     */       arrayOfFloat1[2] = arrayOfFloat2[2];
/*     */       float[] arrayOfFloat1, arrayOfFloat2;
/*     */       (arrayOfFloat1 = new float[4])[3] = (arrayOfFloat2 = this.Pz)[3];
/*     */       this.jW.PL(Wz0.gq(t0, 10, 1.0F).qY(new float[4]));
/*     */     } 
/*     */     for (hc0 = this.Yh0.xl0.r30(); hc0.hasNext(); ) {
/*     */       T0 t0 = (T0)hc0.next();
/*     */       arrayOfFloat1[0] = arrayOfFloat2[0];
/*     */       arrayOfFloat1[1] = arrayOfFloat2[1];
/*     */       arrayOfFloat1[2] = arrayOfFloat2[2];
/*     */       float[] arrayOfFloat1, arrayOfFloat2;
/*     */       (arrayOfFloat1 = new float[4])[3] = (arrayOfFloat2 = this.Pz)[3];
/*     */       this.jW.PL(Wz0.gq(t0, 10, 1.0F).qY(new float[4]));
/*     */     } 
/*     */     this.jW.Kr().mg(g30);
/*     */     this.Ga = paramMx;
/*     */   }
/*     */   
/*     */   public final void t9(So paramSo) {
/*     */     So so;
/*     */     if ((so = this.iD) != null) {
/*     */       so.fr0 = true;
/*     */       this.iD = null;
/*     */     } 
/*     */     this.jW = paramSo;
/*     */   }
/*     */   
/*     */   public final void zt0(boolean paramBoolean1, boolean paramBoolean2) {
/*     */     byte b;
/*     */     lpt1 lpt11;
/*     */     if (paramBoolean1) {
/*     */       lpt11 = this.COM7;
/*     */     } else {
/*     */       lpt11 = this.Yh0;
/*     */     } 
/*     */     float f = 0.015F;
/*     */     if ((paramBoolean2 && !paramBoolean1) || (!paramBoolean2 && paramBoolean1))
/*     */       f = -0.015F; 
/*     */     Gp0 gp0 = this.P2;
/*     */     if (paramBoolean1) {
/*     */       b = gp0.hG0();
/*     */     } else {
/*     */       b = gp0.nI();
/*     */     } 
/*     */     hm0[] arrayOfHm0 = gp0.cl[b];
/*     */     So so;
/*     */     byte b1;
/*     */     for (so = So.fD(), b1 = 0; b1 < arrayOfHm0.length; ) {
/*     */       hm0 hm0;
/*     */       if ((hm0 = arrayOfHm0[b1]) != null) {
/*     */         if (!(hm0.El0 = this.P2.rx.cF(b1))) {
/*     */           hm0.Nd0();
/*     */         } else {
/*     */           hm0.xz0();
/*     */         } 
/*     */         if ((hm0 = arrayOfHm0[b1]).El0) {
/*     */           so.PL(Wz0.gq(hm0.rF0, 10, 0.5F).qY(new float[] { 1.0F, 1.0F, 1.0F, 0.0F }));
/*     */         } else {
/*     */           so.PL(Wz0.gq(hm0.rF0, 10, 0.5F).qY(new float[] { 0.0F, 0.0F, 0.0F, 0.6F }));
/*     */         } 
/*     */       } 
/*     */       b1++;
/*     */     } 
/*     */     so.PL(Wz0.gq(lpt11, 1, 0.5F).a(f));
/*     */     so.mg(this.dr0);
/*     */   }
/*     */   
/*     */   public final void fV() {
/*     */     this.We = km.mI0.AN.Do0;
/*     */     this.yn0 = new tH(0);
/*     */     this();
/*     */     lt lt;
/*     */     qo qo1;
/*     */     Ih0 ih0;
/*     */     gd gd1;
/*     */     this.H3 = new K70(new by0(0), lt);
/*     */     this.H2 = new fo0();
/*     */     this(qo.iu0, 1.0F, 1.0F, 1.0F, 0.8F);
/*     */     this.f2 = new qo();
/*     */     this.H2.Tz0(qo1);
/*     */     this();
/*     */     this.fq = new Ih0();
/*     */     this(ih0);
/*     */     this.JQ = new gd();
/*     */     this.kl0 = new nf(100, gd1);
/*     */     (this.jv0 = new kg0(this.fq)).fA0(km.mI0.AN);
/*     */     (this.Mz = new kg0(this.fq)).fA0(km.mI0.AN);
/*     */     (this.nv0 = new kg0(this.fq)).fA0(km.mI0.AN);
/*     */     this.dr0 = new G30();
/*     */     hY();
/*     */     z70(this.P2.wB(this.P2.nI()).lJ0());
/*     */   }
/*     */   
/*     */   public final void CH() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield Xh : Lf/e2;
/*     */     //   4: invokevirtual Po0 : ()Z
/*     */     //   7: ifeq -> 36
/*     */     //   10: aload_0
/*     */     //   11: getfield m60 : Z
/*     */     //   14: ifne -> 36
/*     */     //   17: getstatic f/km.wI0 : Lf/Pw;
/*     */     //   20: getfield iJ0 : Lf/Xi;
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: ifnull -> 36
/*     */     //   28: aload_1
/*     */     //   29: aload_0
/*     */     //   30: getfield f2 : Lf/qo;
/*     */     //   33: invokevirtual Iy : (Lf/qo;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield gr0 : Lf/So;
/*     */     //   40: dup
/*     */     //   41: astore_1
/*     */     //   42: ifnull -> 61
/*     */     //   45: aload_1
/*     */     //   46: invokevirtual DD : ()Z
/*     */     //   49: ifeq -> 57
/*     */     //   52: aload_0
/*     */     //   53: aconst_null
/*     */     //   54: putfield gr0 : Lf/So;
/*     */     //   57: aload_0
/*     */     //   58: invokevirtual hY : ()V
/*     */     //   61: aload_0
/*     */     //   62: getfield gt : Lf/cx0;
/*     */     //   65: invokestatic lf0 : (Lf/cx0;)Z
/*     */     //   68: pop
/*     */     //   69: getstatic f/h1.bp0 : Z
/*     */     //   72: ifne -> 105
/*     */     //   75: aload_0
/*     */     //   76: getfield P2 : Lf/Gp0;
/*     */     //   79: getfield rx : Lf/ky;
/*     */     //   82: getstatic f/ky.JH0 : Lf/ky;
/*     */     //   85: if_acmpne -> 91
/*     */     //   88: goto -> 105
/*     */     //   91: getstatic f/UB0.go : Lf/hj0;
/*     */     //   94: sipush #256
/*     */     //   97: invokeinterface glClear : (I)V
/*     */     //   102: goto -> 128
/*     */     //   105: getstatic f/UB0.go : Lf/hj0;
/*     */     //   108: fconst_0
/*     */     //   109: fconst_0
/*     */     //   110: fconst_0
/*     */     //   111: fconst_1
/*     */     //   112: invokeinterface glClearColor : (FFFF)V
/*     */     //   117: getstatic f/UB0.go : Lf/hj0;
/*     */     //   120: sipush #16640
/*     */     //   123: invokeinterface glClear : (I)V
/*     */     //   128: getstatic f/km.wI0 : Lf/Pw;
/*     */     //   131: getfield K00 : Lf/jA0;
/*     */     //   134: ifnonnull -> 2091
/*     */     //   137: getstatic f/km.MR : Lf/Gp0;
/*     */     //   140: ifnonnull -> 146
/*     */     //   143: goto -> 2091
/*     */     //   146: aload_0
/*     */     //   147: dup
/*     */     //   148: getfield gt : Lf/cx0;
/*     */     //   151: dup
/*     */     //   152: astore_1
/*     */     //   153: getfield dA : F
/*     */     //   156: f2i
/*     */     //   157: aload_1
/*     */     //   158: getfield zA0 : F
/*     */     //   161: f2i
/*     */     //   162: aload_1
/*     */     //   163: dup
/*     */     //   164: getfield af : F
/*     */     //   167: f2i
/*     */     //   168: istore_1
/*     */     //   169: getfield sf0 : F
/*     */     //   172: f2i
/*     */     //   173: iload_1
/*     */     //   174: swap
/*     */     //   175: invokestatic com8 : (IIII)V
/*     */     //   178: getfield qc : Lcom/badlogic/gdx/graphics/Texture;
/*     */     //   181: ifnull -> 421
/*     */     //   184: aload_0
/*     */     //   185: getfield i1 : Z
/*     */     //   188: ifeq -> 421
/*     */     //   191: aload_0
/*     */     //   192: getfield zg0 : Z
/*     */     //   195: ifeq -> 421
/*     */     //   198: aload_0
/*     */     //   199: getfield vp : F
/*     */     //   202: dup
/*     */     //   203: fstore_1
/*     */     //   204: aload_0
/*     */     //   205: getfield Kt : Lf/NC0;
/*     */     //   208: dup
/*     */     //   209: astore_2
/*     */     //   210: getfield x : F
/*     */     //   213: dup
/*     */     //   214: fstore_3
/*     */     //   215: fcmpl
/*     */     //   216: ifle -> 231
/*     */     //   219: aload_2
/*     */     //   220: fload_3
/*     */     //   221: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   224: getfield Qy : F
/*     */     //   227: fadd
/*     */     //   228: putfield x : F
/*     */     //   231: fload_1
/*     */     //   232: aload_2
/*     */     //   233: getfield y : F
/*     */     //   236: dup
/*     */     //   237: fstore_1
/*     */     //   238: fcmpl
/*     */     //   239: ifle -> 254
/*     */     //   242: aload_2
/*     */     //   243: fload_1
/*     */     //   244: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   247: getfield Qy : F
/*     */     //   250: fadd
/*     */     //   251: putfield y : F
/*     */     //   254: aload_0
/*     */     //   255: dup
/*     */     //   256: dup
/*     */     //   257: dup2
/*     */     //   258: dup2
/*     */     //   259: dup2
/*     */     //   260: getfield gt : Lf/cx0;
/*     */     //   263: invokestatic lf0 : (Lf/cx0;)Z
/*     */     //   266: pop
/*     */     //   267: getfield fk : Lf/Tm;
/*     */     //   270: dup
/*     */     //   271: fconst_1
/*     */     //   272: putfield nUl : F
/*     */     //   275: ldc_w 256.0
/*     */     //   278: ldc_w 200.0
/*     */     //   281: iconst_0
/*     */     //   282: invokevirtual Wt : (FFZ)V
/*     */     //   285: getfield fk : Lf/Tm;
/*     */     //   288: iconst_1
/*     */     //   289: invokevirtual UX : (Z)V
/*     */     //   292: getfield yn0 : Lf/tH;
/*     */     //   295: aload_0
/*     */     //   296: getfield fk : Lf/Tm;
/*     */     //   299: getfield VD0 : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   302: invokevirtual d60 : (Lcom/badlogic/gdx/math/Matrix4;)V
/*     */     //   305: getfield yn0 : Lf/tH;
/*     */     //   308: invokevirtual Tx : ()V
/*     */     //   311: getfield yn0 : Lf/tH;
/*     */     //   314: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   317: pop
/*     */     //   318: new com/badlogic/gdx/graphics/Color
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   328: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*     */     //   331: dup
/*     */     //   332: astore_1
/*     */     //   333: aload_0
/*     */     //   334: getfield cH0 : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   337: getfield a : F
/*     */     //   340: putfield a : F
/*     */     //   343: getfield yn0 : Lf/tH;
/*     */     //   346: aload_1
/*     */     //   347: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*     */     //   350: getfield yn0 : Lf/tH;
/*     */     //   353: aload_0
/*     */     //   354: dup
/*     */     //   355: getfield qc : Lcom/badlogic/gdx/graphics/Texture;
/*     */     //   358: astore_1
/*     */     //   359: getfield Kt : Lf/NC0;
/*     */     //   362: aload_1
/*     */     //   363: swap
/*     */     //   364: dup
/*     */     //   365: getfield x : F
/*     */     //   368: ldc_w 100.0
/*     */     //   371: fmul
/*     */     //   372: aload_0
/*     */     //   373: getfield FH0 : Lf/NC0;
/*     */     //   376: dup
/*     */     //   377: astore_1
/*     */     //   378: getfield x : F
/*     */     //   381: fmul
/*     */     //   382: f2i
/*     */     //   383: istore_2
/*     */     //   384: getfield y : F
/*     */     //   387: ldc_w 100.0
/*     */     //   390: fmul
/*     */     //   391: aload_1
/*     */     //   392: getfield y : F
/*     */     //   395: fmul
/*     */     //   396: f2i
/*     */     //   397: istore_1
/*     */     //   398: fconst_0
/*     */     //   399: fconst_0
/*     */     //   400: iload_2
/*     */     //   401: iload_1
/*     */     //   402: sipush #256
/*     */     //   405: sipush #200
/*     */     //   408: invokevirtual oS : (Lcom/badlogic/gdx/graphics/Texture;FFIIII)V
/*     */     //   411: getfield yn0 : Lf/tH;
/*     */     //   414: invokevirtual end : ()V
/*     */     //   417: invokestatic Kw0 : ()Lf/cx0;
/*     */     //   420: pop
/*     */     //   421: aload_0
/*     */     //   422: dup
/*     */     //   423: dup2
/*     */     //   424: dup2
/*     */     //   425: getfield H3 : Lf/K70;
/*     */     //   428: aload_0
/*     */     //   429: getfield fq : Lf/Ih0;
/*     */     //   432: invokevirtual mx0 : (Lf/ny;)V
/*     */     //   435: getfield MZ : F
/*     */     //   438: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   441: getfield Qy : F
/*     */     //   444: dup
/*     */     //   445: fstore_1
/*     */     //   446: fadd
/*     */     //   447: dup
/*     */     //   448: fstore_2
/*     */     //   449: putfield MZ : F
/*     */     //   452: getfield St : F
/*     */     //   455: fload_1
/*     */     //   456: fadd
/*     */     //   457: putfield St : F
/*     */     //   460: getfield IO : Lf/lpt1;
/*     */     //   463: fload_2
/*     */     //   464: aconst_null
/*     */     //   465: invokevirtual j10 : (FLf/lw;)V
/*     */     //   468: getstatic f/h1.bp0 : Z
/*     */     //   471: ifeq -> 481
/*     */     //   474: aload_0
/*     */     //   475: getfield zg0 : Z
/*     */     //   478: ifeq -> 494
/*     */     //   481: aload_0
/*     */     //   482: getfield P2 : Lf/Gp0;
/*     */     //   485: getfield rx : Lf/ky;
/*     */     //   488: getstatic f/ky.JH0 : Lf/ky;
/*     */     //   491: if_acmpne -> 512
/*     */     //   494: aload_0
/*     */     //   495: getfield H3 : Lf/K70;
/*     */     //   498: aload_0
/*     */     //   499: dup
/*     */     //   500: getfield IO : Lf/lpt1;
/*     */     //   503: astore_1
/*     */     //   504: getfield H2 : Lf/fo0;
/*     */     //   507: aload_1
/*     */     //   508: swap
/*     */     //   509: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*     */     //   512: aload_0
/*     */     //   513: getfield a3 : Z
/*     */     //   516: ifne -> 555
/*     */     //   519: aload_0
/*     */     //   520: dup
/*     */     //   521: getfield H3 : Lf/K70;
/*     */     //   524: aload_0
/*     */     //   525: dup
/*     */     //   526: getfield COM7 : Lf/lpt1;
/*     */     //   529: astore_1
/*     */     //   530: getfield H2 : Lf/fo0;
/*     */     //   533: aload_1
/*     */     //   534: swap
/*     */     //   535: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*     */     //   538: getfield H3 : Lf/K70;
/*     */     //   541: aload_0
/*     */     //   542: dup
/*     */     //   543: getfield Yh0 : Lf/lpt1;
/*     */     //   546: astore_1
/*     */     //   547: getfield H2 : Lf/fo0;
/*     */     //   550: aload_1
/*     */     //   551: swap
/*     */     //   552: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*     */     //   555: aload_0
/*     */     //   556: dup
/*     */     //   557: dup
/*     */     //   558: dup2
/*     */     //   559: dup2
/*     */     //   560: dup2
/*     */     //   561: dup2
/*     */     //   562: dup2
/*     */     //   563: dup2
/*     */     //   564: dup2
/*     */     //   565: getfield H3 : Lf/K70;
/*     */     //   568: invokevirtual end : ()V
/*     */     //   571: getfield H3 : Lf/K70;
/*     */     //   574: aload_0
/*     */     //   575: getfield fq : Lf/Ih0;
/*     */     //   578: invokevirtual mx0 : (Lf/ny;)V
/*     */     //   581: getfield jv0 : Lf/kg0;
/*     */     //   584: invokevirtual update : ()V
/*     */     //   587: getfield jv0 : Lf/kg0;
/*     */     //   590: invokevirtual begin : ()V
/*     */     //   593: getfield jv0 : Lf/kg0;
/*     */     //   596: invokevirtual ZK0 : ()V
/*     */     //   599: getfield jv0 : Lf/kg0;
/*     */     //   602: invokevirtual end : ()V
/*     */     //   605: getfield H3 : Lf/K70;
/*     */     //   608: aload_0
/*     */     //   609: getfield jv0 : Lf/kg0;
/*     */     //   612: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   615: getfield Mz : Lf/kg0;
/*     */     //   618: invokevirtual update : ()V
/*     */     //   621: getfield Mz : Lf/kg0;
/*     */     //   624: invokevirtual begin : ()V
/*     */     //   627: getfield Mz : Lf/kg0;
/*     */     //   630: invokevirtual ZK0 : ()V
/*     */     //   633: getfield Mz : Lf/kg0;
/*     */     //   636: invokevirtual end : ()V
/*     */     //   639: getfield H3 : Lf/K70;
/*     */     //   642: aload_0
/*     */     //   643: getfield Mz : Lf/kg0;
/*     */     //   646: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   649: getfield nv0 : Lf/kg0;
/*     */     //   652: invokevirtual update : ()V
/*     */     //   655: getfield nv0 : Lf/kg0;
/*     */     //   658: invokevirtual begin : ()V
/*     */     //   661: getfield nv0 : Lf/kg0;
/*     */     //   664: invokevirtual ZK0 : ()V
/*     */     //   667: getfield nv0 : Lf/kg0;
/*     */     //   670: invokevirtual end : ()V
/*     */     //   673: getfield H3 : Lf/K70;
/*     */     //   676: aload_0
/*     */     //   677: getfield nv0 : Lf/kg0;
/*     */     //   680: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   683: iconst_0
/*     */     //   684: istore_1
/*     */     //   685: iload_1
/*     */     //   686: aload_0
/*     */     //   687: getfield P2 : Lf/Gp0;
/*     */     //   690: invokevirtual H3 : ()B
/*     */     //   693: if_icmpge -> 840
/*     */     //   696: aload_0
/*     */     //   697: getfield P2 : Lf/Gp0;
/*     */     //   700: iload_1
/*     */     //   701: invokevirtual wB : (B)Lf/QZ;
/*     */     //   704: invokevirtual lK : ()Ljava/util/List;
/*     */     //   707: ifnull -> 832
/*     */     //   710: aload_0
/*     */     //   711: getfield P2 : Lf/Gp0;
/*     */     //   714: iload_1
/*     */     //   715: invokevirtual wB : (B)Lf/QZ;
/*     */     //   718: invokevirtual lJ0 : ()Z
/*     */     //   721: ifeq -> 734
/*     */     //   724: aload_0
/*     */     //   725: getfield gD0 : Z
/*     */     //   728: ifne -> 734
/*     */     //   731: goto -> 832
/*     */     //   734: aload_0
/*     */     //   735: dup
/*     */     //   736: getfield P2 : Lf/Gp0;
/*     */     //   739: iload_1
/*     */     //   740: invokevirtual wB : (B)Lf/QZ;
/*     */     //   743: invokevirtual zV : ()V
/*     */     //   746: getfield P2 : Lf/Gp0;
/*     */     //   749: iload_1
/*     */     //   750: invokevirtual wB : (B)Lf/QZ;
/*     */     //   753: invokevirtual lK : ()Ljava/util/List;
/*     */     //   756: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   761: astore_2
/*     */     //   762: aload_2
/*     */     //   763: invokeinterface hasNext : ()Z
/*     */     //   768: ifeq -> 832
/*     */     //   771: aload_0
/*     */     //   772: aload_2
/*     */     //   773: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   778: checkcast f/uT
/*     */     //   781: dup
/*     */     //   782: dup
/*     */     //   783: dup2
/*     */     //   784: astore_3
/*     */     //   785: aload_0
/*     */     //   786: getfield fq : Lf/Ih0;
/*     */     //   789: dup
/*     */     //   790: getfield H : Lf/eo;
/*     */     //   793: astore #4
/*     */     //   795: getfield nj0 : Lf/eo;
/*     */     //   798: aload #4
/*     */     //   800: swap
/*     */     //   801: invokevirtual si : (Lf/eo;Lf/eo;)V
/*     */     //   804: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   807: getfield Qy : F
/*     */     //   810: invokevirtual SG0 : (F)V
/*     */     //   813: ldc_w 0.01
/*     */     //   816: invokevirtual zO : (F)V
/*     */     //   819: invokevirtual Gz : ()V
/*     */     //   822: getfield H3 : Lf/K70;
/*     */     //   825: aload_3
/*     */     //   826: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   829: goto -> 762
/*     */     //   832: iload_1
/*     */     //   833: iconst_1
/*     */     //   834: iadd
/*     */     //   835: i2b
/*     */     //   836: istore_1
/*     */     //   837: goto -> 685
/*     */     //   840: aload_0
/*     */     //   841: getfield LW : Lf/kf;
/*     */     //   844: getfield gs0 : Ljava/util/ArrayList;
/*     */     //   847: astore_1
/*     */     //   848: iconst_0
/*     */     //   849: istore_2
/*     */     //   850: iload_2
/*     */     //   851: aload_0
/*     */     //   852: getfield P2 : Lf/Gp0;
/*     */     //   855: invokevirtual H3 : ()B
/*     */     //   858: if_icmpge -> 1723
/*     */     //   861: iconst_0
/*     */     //   862: istore_3
/*     */     //   863: iload_3
/*     */     //   864: aload_0
/*     */     //   865: getfield P2 : Lf/Gp0;
/*     */     //   868: dup
/*     */     //   869: astore #4
/*     */     //   871: getfield cl : [[Lf/hm0;
/*     */     //   874: iload_2
/*     */     //   875: aaload
/*     */     //   876: arraylength
/*     */     //   877: if_icmpge -> 1715
/*     */     //   880: aload #4
/*     */     //   882: iload_2
/*     */     //   883: iload_3
/*     */     //   884: invokevirtual N0 : (BB)Lf/hm0;
/*     */     //   887: dup
/*     */     //   888: astore #4
/*     */     //   890: ifnull -> 1707
/*     */     //   893: aload_0
/*     */     //   894: getfield P2 : Lf/Gp0;
/*     */     //   897: iload_2
/*     */     //   898: invokevirtual wB : (B)Lf/QZ;
/*     */     //   901: invokevirtual lJ0 : ()Z
/*     */     //   904: ifeq -> 1707
/*     */     //   907: aload #4
/*     */     //   909: getfield rF0 : Lf/uT;
/*     */     //   912: ifnonnull -> 918
/*     */     //   915: goto -> 1707
/*     */     //   918: aload #4
/*     */     //   920: getfield FJ : Lf/UA0;
/*     */     //   923: dup
/*     */     //   924: astore #5
/*     */     //   926: ifnull -> 937
/*     */     //   929: getstatic f/UB0.Kg0 : Lf/Q50;
/*     */     //   932: aload #5
/*     */     //   934: invokevirtual fN : (Ljava/lang/Runnable;)V
/*     */     //   937: aload #4
/*     */     //   939: getfield eq0 : Lf/uT;
/*     */     //   942: ifnull -> 1000
/*     */     //   945: getstatic f/um0.Kt0 : Lf/um0;
/*     */     //   948: dup
/*     */     //   949: astore #5
/*     */     //   951: getfield Z2 : Lf/U70;
/*     */     //   954: dup
/*     */     //   955: astore #6
/*     */     //   957: ifnull -> 963
/*     */     //   960: goto -> 992
/*     */     //   963: aload #5
/*     */     //   965: new f/U70
/*     */     //   968: dup
/*     */     //   969: astore #6
/*     */     //   971: new f/iI
/*     */     //   974: dup
/*     */     //   975: astore #7
/*     */     //   977: aload #5
/*     */     //   979: invokespecial <init> : (Lf/um0;)V
/*     */     //   982: aload #7
/*     */     //   984: invokespecial <init> : (Lf/N50;)V
/*     */     //   987: aload #6
/*     */     //   989: putfield Z2 : Lf/U70;
/*     */     //   992: aload #6
/*     */     //   994: getstatic f/zm0.u20 : J
/*     */     //   997: putfield mk : J
/*     */     //   1000: aload #4
/*     */     //   1002: getfield Xn : [Lf/uT;
/*     */     //   1005: astore #5
/*     */     //   1007: iconst_0
/*     */     //   1008: istore #6
/*     */     //   1010: iload #6
/*     */     //   1012: aload #5
/*     */     //   1014: arraylength
/*     */     //   1015: if_icmpge -> 1707
/*     */     //   1018: aload #5
/*     */     //   1020: iload #6
/*     */     //   1022: aaload
/*     */     //   1023: dup
/*     */     //   1024: astore #7
/*     */     //   1026: ifnonnull -> 1032
/*     */     //   1029: goto -> 1701
/*     */     //   1032: aload_1
/*     */     //   1033: iload_2
/*     */     //   1034: iload_3
/*     */     //   1035: aload #7
/*     */     //   1037: dup
/*     */     //   1038: aload_0
/*     */     //   1039: aload #7
/*     */     //   1041: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   1044: getfield Qy : F
/*     */     //   1047: invokevirtual SG0 : (F)V
/*     */     //   1050: getfield fq : Lf/Ih0;
/*     */     //   1053: dup
/*     */     //   1054: getfield H : Lf/eo;
/*     */     //   1057: astore #8
/*     */     //   1059: getfield nj0 : Lf/eo;
/*     */     //   1062: aload #8
/*     */     //   1064: swap
/*     */     //   1065: invokevirtual si : (Lf/eo;Lf/eo;)V
/*     */     //   1068: getfield He0 : Lf/eo;
/*     */     //   1071: dup
/*     */     //   1072: invokestatic w3 : (Lf/eo;Lf/eo;)Lf/eo;
/*     */     //   1075: astore #8
/*     */     //   1077: invokestatic Vs0 : (BB)Lf/mJ;
/*     */     //   1080: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   1083: ifeq -> 1135
/*     */     //   1086: aload #4
/*     */     //   1088: aload #7
/*     */     //   1090: getfield ys : F
/*     */     //   1093: ldc_w 5.0E-4
/*     */     //   1096: fadd
/*     */     //   1097: fstore #9
/*     */     //   1099: new f/uT
/*     */     //   1102: dup
/*     */     //   1103: astore #10
/*     */     //   1105: fload #9
/*     */     //   1107: dup
/*     */     //   1108: aload #10
/*     */     //   1110: dup
/*     */     //   1111: aload #7
/*     */     //   1113: invokespecial <init> : (Lf/uT;)V
/*     */     //   1116: fconst_1
/*     */     //   1117: fconst_1
/*     */     //   1118: fconst_0
/*     */     //   1119: fconst_1
/*     */     //   1120: invokevirtual hA0 : (FFFF)V
/*     */     //   1123: invokevirtual Kk0 : (FF)V
/*     */     //   1126: invokevirtual Si : ()Z
/*     */     //   1129: ifeq -> 1263
/*     */     //   1132: goto -> 1228
/*     */     //   1135: aload_0
/*     */     //   1136: getfield P2 : Lf/Gp0;
/*     */     //   1139: getfield cl : [[Lf/hm0;
/*     */     //   1142: iload_2
/*     */     //   1143: aaload
/*     */     //   1144: arraylength
/*     */     //   1145: iconst_1
/*     */     //   1146: if_icmple -> 1329
/*     */     //   1149: iload_2
/*     */     //   1150: iload_3
/*     */     //   1151: invokestatic Vs0 : (BB)Lf/mJ;
/*     */     //   1154: aload_0
/*     */     //   1155: getfield LW : Lf/kf;
/*     */     //   1158: getfield Yv0 : Lf/mJ;
/*     */     //   1161: if_acmpne -> 1329
/*     */     //   1164: aload #7
/*     */     //   1166: getfield ys : F
/*     */     //   1169: ldc_w 5.0E-4
/*     */     //   1172: fadd
/*     */     //   1173: fstore #9
/*     */     //   1175: new f/uT
/*     */     //   1178: dup
/*     */     //   1179: dup
/*     */     //   1180: astore #10
/*     */     //   1182: aload #7
/*     */     //   1184: invokespecial <init> : (Lf/uT;)V
/*     */     //   1187: getstatic com/badlogic/gdx/graphics/Color.CYAN : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1190: astore #11
/*     */     //   1192: getfield native : Lf/s5;
/*     */     //   1195: dup
/*     */     //   1196: astore #12
/*     */     //   1198: ifnull -> 1212
/*     */     //   1201: aload #12
/*     */     //   1203: getfield lx : Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1206: aload #11
/*     */     //   1208: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1211: pop
/*     */     //   1212: aload #4
/*     */     //   1214: aload #10
/*     */     //   1216: fload #9
/*     */     //   1218: dup
/*     */     //   1219: invokevirtual Kk0 : (FF)V
/*     */     //   1222: invokevirtual Si : ()Z
/*     */     //   1225: ifeq -> 1263
/*     */     //   1228: aload #10
/*     */     //   1230: aload #8
/*     */     //   1232: getfield x : F
/*     */     //   1235: aload #8
/*     */     //   1237: dup
/*     */     //   1238: getfield y : F
/*     */     //   1241: ldc_w 0.005
/*     */     //   1244: fadd
/*     */     //   1245: fstore #9
/*     */     //   1247: getfield z : F
/*     */     //   1250: ldc_w 0.02
/*     */     //   1253: fsub
/*     */     //   1254: fload #9
/*     */     //   1256: swap
/*     */     //   1257: invokevirtual WQ : (FFF)V
/*     */     //   1260: goto -> 1295
/*     */     //   1263: aload #10
/*     */     //   1265: aload #8
/*     */     //   1267: getfield x : F
/*     */     //   1270: aload #8
/*     */     //   1272: dup
/*     */     //   1273: getfield y : F
/*     */     //   1276: ldc_w 0.015
/*     */     //   1279: fadd
/*     */     //   1280: fstore #9
/*     */     //   1282: getfield z : F
/*     */     //   1285: ldc_w 0.005
/*     */     //   1288: fsub
/*     */     //   1289: fload #9
/*     */     //   1291: swap
/*     */     //   1292: invokevirtual WQ : (FFF)V
/*     */     //   1295: aload_0
/*     */     //   1296: aload #10
/*     */     //   1298: dup
/*     */     //   1299: aload_0
/*     */     //   1300: getfield fq : Lf/Ih0;
/*     */     //   1303: dup
/*     */     //   1304: getfield H : Lf/eo;
/*     */     //   1307: astore #9
/*     */     //   1309: getfield nj0 : Lf/eo;
/*     */     //   1312: aload #9
/*     */     //   1314: swap
/*     */     //   1315: invokevirtual si : (Lf/eo;Lf/eo;)V
/*     */     //   1318: invokevirtual Gz : ()V
/*     */     //   1321: getfield H3 : Lf/K70;
/*     */     //   1324: aload #10
/*     */     //   1326: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   1329: aload #4
/*     */     //   1331: getfield Cs0 : Z
/*     */     //   1334: ifne -> 1692
/*     */     //   1337: aload #5
/*     */     //   1339: iload #6
/*     */     //   1341: aaload
/*     */     //   1342: aload #4
/*     */     //   1344: getfield rF0 : Lf/uT;
/*     */     //   1347: if_acmpne -> 1692
/*     */     //   1350: aload_0
/*     */     //   1351: getfield P2 : Lf/Gp0;
/*     */     //   1354: getfield cl : [[Lf/hm0;
/*     */     //   1357: iload_2
/*     */     //   1358: aaload
/*     */     //   1359: arraylength
/*     */     //   1360: iconst_5
/*     */     //   1361: if_icmpge -> 1692
/*     */     //   1364: aload #7
/*     */     //   1366: invokevirtual G10 : ()Lcom/badlogic/gdx/graphics/Color;
/*     */     //   1369: getfield a : F
/*     */     //   1372: fconst_0
/*     */     //   1373: fcmpl
/*     */     //   1374: ifle -> 1692
/*     */     //   1377: iload_2
/*     */     //   1378: aload_0
/*     */     //   1379: aload #4
/*     */     //   1381: aload #7
/*     */     //   1383: aload #8
/*     */     //   1385: getfield y : F
/*     */     //   1388: ldc_w 3.1
/*     */     //   1391: fsub
/*     */     //   1392: fconst_2
/*     */     //   1393: fdiv
/*     */     //   1394: fstore #9
/*     */     //   1396: getfield FC0 : Lf/eo;
/*     */     //   1399: getfield x : F
/*     */     //   1402: ldc_w 0.01
/*     */     //   1405: fdiv
/*     */     //   1406: fload #9
/*     */     //   1408: fadd
/*     */     //   1409: fstore #9
/*     */     //   1411: new f/uT
/*     */     //   1414: dup
/*     */     //   1415: astore #10
/*     */     //   1417: aload #7
/*     */     //   1419: invokespecial <init> : (Lf/uT;)V
/*     */     //   1422: getstatic f/um0.Kt0 : Lf/um0;
/*     */     //   1425: astore #11
/*     */     //   1427: invokevirtual Jx : ()S
/*     */     //   1430: istore #12
/*     */     //   1432: getfield P2 : Lf/Gp0;
/*     */     //   1435: invokevirtual hG0 : ()B
/*     */     //   1438: if_icmpne -> 1447
/*     */     //   1441: iconst_1
/*     */     //   1442: istore #13
/*     */     //   1444: goto -> 1450
/*     */     //   1447: iconst_0
/*     */     //   1448: istore #13
/*     */     //   1450: aload #11
/*     */     //   1452: iload #12
/*     */     //   1454: iload #13
/*     */     //   1456: iconst_0
/*     */     //   1457: iconst_0
/*     */     //   1458: iconst_0
/*     */     //   1459: iconst_0
/*     */     //   1460: invokestatic EY : (SZZBZZ)I
/*     */     //   1463: istore #12
/*     */     //   1465: getfield MI : Lf/Ut0;
/*     */     //   1468: dup
/*     */     //   1469: astore #13
/*     */     //   1471: ifnull -> 1505
/*     */     //   1474: aload #13
/*     */     //   1476: iload #12
/*     */     //   1478: invokevirtual return : (I)Z
/*     */     //   1481: ifne -> 1487
/*     */     //   1484: goto -> 1505
/*     */     //   1487: aload #11
/*     */     //   1489: getfield MI : Lf/Ut0;
/*     */     //   1492: iload #12
/*     */     //   1494: invokevirtual Z6 : (I)Ljava/lang/Object;
/*     */     //   1497: checkcast f/eo
/*     */     //   1500: astore #11
/*     */     //   1502: goto -> 1510
/*     */     //   1505: getstatic f/um0.YA : Lf/eo;
/*     */     //   1508: astore #11
/*     */     //   1510: iload_2
/*     */     //   1511: aload_0
/*     */     //   1512: new f/eo
/*     */     //   1515: dup
/*     */     //   1516: astore #12
/*     */     //   1518: aload #8
/*     */     //   1520: invokespecial <init> : (Lf/eo;)V
/*     */     //   1523: getfield P2 : Lf/Gp0;
/*     */     //   1526: invokevirtual hG0 : ()B
/*     */     //   1529: if_icmpne -> 1538
/*     */     //   1532: fconst_0
/*     */     //   1533: fstore #8
/*     */     //   1535: goto -> 1543
/*     */     //   1538: ldc_w -0.075
/*     */     //   1541: fstore #8
/*     */     //   1543: iload_2
/*     */     //   1544: aload_0
/*     */     //   1545: fconst_0
/*     */     //   1546: fstore #13
/*     */     //   1548: getfield P2 : Lf/Gp0;
/*     */     //   1551: invokevirtual hG0 : ()B
/*     */     //   1554: if_icmpne -> 1571
/*     */     //   1557: aload #11
/*     */     //   1559: getfield y : F
/*     */     //   1562: ldc_w 0.65
/*     */     //   1565: fadd
/*     */     //   1566: fstore #11
/*     */     //   1568: goto -> 1606
/*     */     //   1571: aload #11
/*     */     //   1573: getstatic f/um0.YA : Lf/eo;
/*     */     //   1576: if_acmpeq -> 1595
/*     */     //   1579: aload #11
/*     */     //   1581: getfield y : F
/*     */     //   1584: fconst_0
/*     */     //   1585: fcmpg
/*     */     //   1586: ifge -> 1595
/*     */     //   1589: ldc_w 0.7
/*     */     //   1592: goto -> 1598
/*     */     //   1595: ldc_w 0.8
/*     */     //   1598: aload #11
/*     */     //   1600: getfield y : F
/*     */     //   1603: fadd
/*     */     //   1604: fstore #11
/*     */     //   1606: aload_0
/*     */     //   1607: aload #10
/*     */     //   1609: dup
/*     */     //   1610: dup2
/*     */     //   1611: dup2
/*     */     //   1612: fload #9
/*     */     //   1614: aload #10
/*     */     //   1616: aload #12
/*     */     //   1618: fload #8
/*     */     //   1620: fload #13
/*     */     //   1622: fload #11
/*     */     //   1624: invokevirtual uD : (FFF)Lf/eo;
/*     */     //   1627: dup
/*     */     //   1628: astore #8
/*     */     //   1630: ldc_w 2.6
/*     */     //   1633: putfield y : F
/*     */     //   1636: fconst_1
/*     */     //   1637: fconst_1
/*     */     //   1638: fconst_1
/*     */     //   1639: ldc_w 0.25
/*     */     //   1642: invokevirtual Bp : (FFFF)V
/*     */     //   1645: ldc_w 0.015
/*     */     //   1648: fmul
/*     */     //   1649: dup
/*     */     //   1650: invokevirtual Kk0 : (FF)V
/*     */     //   1653: aload #8
/*     */     //   1655: invokevirtual WI0 : (Lf/eo;)V
/*     */     //   1658: getfield Qi : Lf/TG0;
/*     */     //   1661: getstatic f/eo.X : Lf/eo;
/*     */     //   1664: ldc_w -90.0
/*     */     //   1667: invokevirtual eY : (Lf/eo;F)V
/*     */     //   1670: iconst_0
/*     */     //   1671: putfield ir : Z
/*     */     //   1674: fconst_0
/*     */     //   1675: fconst_0
/*     */     //   1676: fconst_0
/*     */     //   1677: fconst_1
/*     */     //   1678: invokevirtual hA0 : (FFFF)V
/*     */     //   1681: invokevirtual Gz : ()V
/*     */     //   1684: getfield H3 : Lf/K70;
/*     */     //   1687: aload #10
/*     */     //   1689: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   1692: aload_0
/*     */     //   1693: getfield H3 : Lf/K70;
/*     */     //   1696: aload #7
/*     */     //   1698: invokevirtual tx0 : (Lf/tk;)V
/*     */     //   1701: iinc #6, 1
/*     */     //   1704: goto -> 1010
/*     */     //   1707: iload_3
/*     */     //   1708: iconst_1
/*     */     //   1709: iadd
/*     */     //   1710: i2b
/*     */     //   1711: istore_3
/*     */     //   1712: goto -> 863
/*     */     //   1715: iload_2
/*     */     //   1716: iconst_1
/*     */     //   1717: iadd
/*     */     //   1718: i2b
/*     */     //   1719: istore_2
/*     */     //   1720: goto -> 850
/*     */     //   1723: aload_0
/*     */     //   1724: getfield Ji0 : Ljava/util/ArrayList;
/*     */     //   1727: dup
/*     */     //   1728: astore_1
/*     */     //   1729: ifnull -> 2032
/*     */     //   1732: aload_1
/*     */     //   1733: invokevirtual size : ()I
/*     */     //   1736: ifle -> 2032
/*     */     //   1739: aload_0
/*     */     //   1740: getfield Ji0 : Ljava/util/ArrayList;
/*     */     //   1743: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   1746: astore_1
/*     */     //   1747: aload_1
/*     */     //   1748: invokeinterface hasNext : ()Z
/*     */     //   1753: ifeq -> 2032
/*     */     //   1756: aload_0
/*     */     //   1757: aload_1
/*     */     //   1758: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1763: checkcast f/oq
/*     */     //   1766: dup
/*     */     //   1767: dup
/*     */     //   1768: astore_2
/*     */     //   1769: aload_0
/*     */     //   1770: aload_2
/*     */     //   1771: invokevirtual m40 : ()V
/*     */     //   1774: getfield fq : Lf/Ih0;
/*     */     //   1777: dup
/*     */     //   1778: getfield H : Lf/eo;
/*     */     //   1781: astore_3
/*     */     //   1782: getfield nj0 : Lf/eo;
/*     */     //   1785: astore #4
/*     */     //   1787: getstatic f/Xf.yH0 : Lf/eo;
/*     */     //   1790: dup
/*     */     //   1791: astore #5
/*     */     //   1793: aload_3
/*     */     //   1794: dup
/*     */     //   1795: dup
/*     */     //   1796: aload #5
/*     */     //   1798: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1801: pop
/*     */     //   1802: getfield x : F
/*     */     //   1805: fstore_3
/*     */     //   1806: getfield y : F
/*     */     //   1809: fstore #6
/*     */     //   1811: getfield z : F
/*     */     //   1814: fstore #7
/*     */     //   1816: fload_3
/*     */     //   1817: fload #6
/*     */     //   1819: fload #7
/*     */     //   1821: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   1824: aload_2
/*     */     //   1825: getfield PL : Lf/eo;
/*     */     //   1828: invokevirtual zy0 : (Lf/eo;)Lf/eo;
/*     */     //   1831: invokevirtual WC0 : ()Lf/eo;
/*     */     //   1834: pop
/*     */     //   1835: getstatic f/Xf.kR : Lf/eo;
/*     */     //   1838: dup
/*     */     //   1839: astore_3
/*     */     //   1840: aload #4
/*     */     //   1842: dup
/*     */     //   1843: dup
/*     */     //   1844: aload_3
/*     */     //   1845: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1848: pop
/*     */     //   1849: getfield x : F
/*     */     //   1852: fstore_3
/*     */     //   1853: getfield y : F
/*     */     //   1856: fstore #4
/*     */     //   1858: getfield z : F
/*     */     //   1861: fstore #6
/*     */     //   1863: fload_3
/*     */     //   1864: fload #4
/*     */     //   1866: fload #6
/*     */     //   1868: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   1871: aload #5
/*     */     //   1873: invokevirtual Nz : (Lf/eo;)Lf/eo;
/*     */     //   1876: invokevirtual WC0 : ()Lf/eo;
/*     */     //   1879: pop
/*     */     //   1880: getstatic f/Xf.bJ0 : Lf/eo;
/*     */     //   1883: dup
/*     */     //   1884: astore_3
/*     */     //   1885: aload #5
/*     */     //   1887: dup
/*     */     //   1888: dup
/*     */     //   1889: aload_3
/*     */     //   1890: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1893: pop
/*     */     //   1894: getfield x : F
/*     */     //   1897: fstore_3
/*     */     //   1898: getfield y : F
/*     */     //   1901: fstore #4
/*     */     //   1903: getfield z : F
/*     */     //   1906: fstore #6
/*     */     //   1908: fload_3
/*     */     //   1909: fload #4
/*     */     //   1911: fload #6
/*     */     //   1913: invokevirtual TG0 : (FFF)Lf/eo;
/*     */     //   1916: getstatic f/Xf.kR : Lf/eo;
/*     */     //   1919: invokevirtual Nz : (Lf/eo;)Lf/eo;
/*     */     //   1922: invokevirtual WC0 : ()Lf/eo;
/*     */     //   1925: pop
/*     */     //   1926: getfield wz : Lf/TG0;
/*     */     //   1929: aload #5
/*     */     //   1931: getstatic f/Xf.kR : Lf/eo;
/*     */     //   1934: dup
/*     */     //   1935: astore_3
/*     */     //   1936: getfield x : F
/*     */     //   1939: fstore #4
/*     */     //   1941: getstatic f/Xf.bJ0 : Lf/eo;
/*     */     //   1944: dup
/*     */     //   1945: astore #6
/*     */     //   1947: aload_3
/*     */     //   1948: aload #5
/*     */     //   1950: aload #6
/*     */     //   1952: aload_3
/*     */     //   1953: aload #5
/*     */     //   1955: aload #6
/*     */     //   1957: getfield x : F
/*     */     //   1960: fstore_3
/*     */     //   1961: getfield x : F
/*     */     //   1964: fstore #5
/*     */     //   1966: getfield y : F
/*     */     //   1969: fstore #6
/*     */     //   1971: getfield y : F
/*     */     //   1974: fstore #7
/*     */     //   1976: getfield y : F
/*     */     //   1979: fstore #8
/*     */     //   1981: getfield z : F
/*     */     //   1984: fstore #9
/*     */     //   1986: getfield z : F
/*     */     //   1989: fstore #10
/*     */     //   1991: getfield z : F
/*     */     //   1994: fstore #11
/*     */     //   1996: iconst_0
/*     */     //   1997: fload #4
/*     */     //   1999: fload_3
/*     */     //   2000: fload #5
/*     */     //   2002: fload #6
/*     */     //   2004: fload #7
/*     */     //   2006: fload #8
/*     */     //   2008: fload #9
/*     */     //   2010: fload #10
/*     */     //   2012: fload #11
/*     */     //   2014: invokevirtual hE0 : (ZFFFFFFFFF)Lf/TG0;
/*     */     //   2017: pop
/*     */     //   2018: iconst_0
/*     */     //   2019: putfield Ka0 : Z
/*     */     //   2022: getfield kl0 : Lf/nf;
/*     */     //   2025: aload_2
/*     */     //   2026: invokevirtual Zx : (Lf/oq;)V
/*     */     //   2029: goto -> 1747
/*     */     //   2032: aload_0
/*     */     //   2033: getfield NC0 : Lf/dw;
/*     */     //   2036: dup
/*     */     //   2037: astore_1
/*     */     //   2038: ifnull -> 2056
/*     */     //   2041: aload_1
/*     */     //   2042: aload_0
/*     */     //   2043: dup
/*     */     //   2044: getfield kl0 : Lf/nf;
/*     */     //   2047: astore_1
/*     */     //   2048: getfield fq : Lf/Ih0;
/*     */     //   2051: aload_1
/*     */     //   2052: swap
/*     */     //   2053: invokevirtual Al : (Lf/nf;Lf/Ih0;)V
/*     */     //   2056: aload_0
/*     */     //   2057: dup
/*     */     //   2058: getfield kl0 : Lf/nf;
/*     */     //   2061: invokevirtual Js0 : ()V
/*     */     //   2064: getfield H3 : Lf/K70;
/*     */     //   2067: invokevirtual end : ()V
/*     */     //   2070: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   2073: invokevirtual fG0 : ()I
/*     */     //   2076: istore_1
/*     */     //   2077: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   2080: invokevirtual dL : ()I
/*     */     //   2083: istore_2
/*     */     //   2084: iconst_0
/*     */     //   2085: iconst_0
/*     */     //   2086: iload_1
/*     */     //   2087: iload_2
/*     */     //   2088: invokestatic com8 : (IIII)V
/*     */     //   2091: aload_0
/*     */     //   2092: getfield u4 : Lf/wb;
/*     */     //   2095: dup
/*     */     //   2096: astore_1
/*     */     //   2097: ifnull -> 2199
/*     */     //   2100: aload_1
/*     */     //   2101: iconst_0
/*     */     //   2102: invokevirtual tF0 : (Z)Z
/*     */     //   2105: ifeq -> 2117
/*     */     //   2108: aload_0
/*     */     //   2109: getfield LW : Lf/kf;
/*     */     //   2112: iconst_0
/*     */     //   2113: iconst_0
/*     */     //   2114: invokevirtual ny : (ZZ)V
/*     */     //   2117: aload_0
/*     */     //   2118: getfield u4 : Lf/wb;
/*     */     //   2121: iconst_1
/*     */     //   2122: invokevirtual tF0 : (Z)Z
/*     */     //   2125: ifeq -> 2137
/*     */     //   2128: aload_0
/*     */     //   2129: getfield LW : Lf/kf;
/*     */     //   2132: iconst_1
/*     */     //   2133: iconst_0
/*     */     //   2134: invokevirtual ny : (ZZ)V
/*     */     //   2137: aload_0
/*     */     //   2138: dup
/*     */     //   2139: getfield u4 : Lf/wb;
/*     */     //   2142: invokevirtual Ba : ()V
/*     */     //   2145: getfield u4 : Lf/wb;
/*     */     //   2148: invokevirtual cw : ()Z
/*     */     //   2151: ifeq -> 2199
/*     */     //   2154: aload_0
/*     */     //   2155: getfield u4 : Lf/wb;
/*     */     //   2158: iconst_0
/*     */     //   2159: invokevirtual tF0 : (Z)Z
/*     */     //   2162: ifeq -> 2174
/*     */     //   2165: aload_0
/*     */     //   2166: getfield LW : Lf/kf;
/*     */     //   2169: iconst_0
/*     */     //   2170: iconst_1
/*     */     //   2171: invokevirtual ny : (ZZ)V
/*     */     //   2174: aload_0
/*     */     //   2175: getfield u4 : Lf/wb;
/*     */     //   2178: iconst_1
/*     */     //   2179: invokevirtual tF0 : (Z)Z
/*     */     //   2182: ifeq -> 2194
/*     */     //   2185: aload_0
/*     */     //   2186: getfield LW : Lf/kf;
/*     */     //   2189: iconst_1
/*     */     //   2190: iconst_1
/*     */     //   2191: invokevirtual ny : (ZZ)V
/*     */     //   2194: aload_0
/*     */     //   2195: aconst_null
/*     */     //   2196: putfield u4 : Lf/wb;
/*     */     //   2199: aload_0
/*     */     //   2200: new java/util/ArrayList
/*     */     //   2203: dup
/*     */     //   2204: astore_1
/*     */     //   2205: invokespecial <init> : ()V
/*     */     //   2208: getfield iK : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   2211: invokevirtual entrySet : ()Ljava/util/Set;
/*     */     //   2214: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2219: astore_2
/*     */     //   2220: aload_2
/*     */     //   2221: invokeinterface hasNext : ()Z
/*     */     //   2226: ifeq -> 2275
/*     */     //   2229: aload_2
/*     */     //   2230: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2235: checkcast java/util/Map$Entry
/*     */     //   2238: dup
/*     */     //   2239: astore_3
/*     */     //   2240: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2245: checkcast f/wb
/*     */     //   2248: dup
/*     */     //   2249: astore #4
/*     */     //   2251: ifnull -> 2220
/*     */     //   2254: aload #4
/*     */     //   2256: dup
/*     */     //   2257: invokevirtual Ba : ()V
/*     */     //   2260: invokevirtual cw : ()Z
/*     */     //   2263: ifeq -> 2220
/*     */     //   2266: aload_1
/*     */     //   2267: aload_3
/*     */     //   2268: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   2271: pop
/*     */     //   2272: goto -> 2220
/*     */     //   2275: aload_1
/*     */     //   2276: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   2279: astore_1
/*     */     //   2280: aload_1
/*     */     //   2281: invokeinterface hasNext : ()Z
/*     */     //   2286: ifeq -> 2316
/*     */     //   2289: aload_0
/*     */     //   2290: aload_1
/*     */     //   2291: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2296: checkcast java/util/Map$Entry
/*     */     //   2299: astore_2
/*     */     //   2300: getfield iK : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   2303: aload_2
/*     */     //   2304: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   2309: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   2312: pop
/*     */     //   2313: goto -> 2280
/*     */     //   2316: iconst_3
/*     */     //   2317: invokestatic D70 : (I)Z
/*     */     //   2320: ifeq -> 3010
/*     */     //   2323: getstatic f/Bz.fn : Z
/*     */     //   2326: ifeq -> 3010
/*     */     //   2329: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2332: bipush #31
/*     */     //   2334: invokevirtual j2 : (I)Z
/*     */     //   2337: ifeq -> 2360
/*     */     //   2340: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2343: bipush #59
/*     */     //   2345: invokevirtual Ak : (I)Z
/*     */     //   2348: ifeq -> 2360
/*     */     //   2351: aload_0
/*     */     //   2352: iconst_1
/*     */     //   2353: iconst_1
/*     */     //   2354: invokevirtual zt0 : (ZZ)V
/*     */     //   2357: goto -> 3010
/*     */     //   2360: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2363: bipush #30
/*     */     //   2365: invokevirtual j2 : (I)Z
/*     */     //   2368: ifeq -> 2399
/*     */     //   2371: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2374: bipush #59
/*     */     //   2376: invokevirtual Ak : (I)Z
/*     */     //   2379: ifeq -> 2399
/*     */     //   2382: aload_0
/*     */     //   2383: dup
/*     */     //   2384: dup
/*     */     //   2385: getfield sL : I
/*     */     //   2388: iconst_1
/*     */     //   2389: iadd
/*     */     //   2390: putfield sL : I
/*     */     //   2393: invokevirtual Wa : ()V
/*     */     //   2396: goto -> 3010
/*     */     //   2399: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2402: bipush #92
/*     */     //   2404: invokevirtual j2 : (I)Z
/*     */     //   2407: ifeq -> 2434
/*     */     //   2410: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2413: bipush #59
/*     */     //   2415: invokevirtual Ak : (I)Z
/*     */     //   2418: ifeq -> 2434
/*     */     //   2421: new f/O5
/*     */     //   2424: dup
/*     */     //   2425: invokespecial <init> : ()V
/*     */     //   2428: putstatic f/O5.AU : Lf/O5;
/*     */     //   2431: goto -> 3010
/*     */     //   2434: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2437: bipush #7
/*     */     //   2439: invokevirtual j2 : (I)Z
/*     */     //   2442: ifeq -> 2568
/*     */     //   2445: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2448: bipush #59
/*     */     //   2450: invokevirtual Ak : (I)Z
/*     */     //   2453: ifeq -> 2568
/*     */     //   2456: aload_0
/*     */     //   2457: dup
/*     */     //   2458: dup2
/*     */     //   2459: getfield fq : Lf/Ih0;
/*     */     //   2462: getfield I70 : Lf/eo;
/*     */     //   2465: getstatic f/vH.Lu : Lf/eo;
/*     */     //   2468: dup
/*     */     //   2469: astore_1
/*     */     //   2470: invokevirtual JL : (Lf/eo;)Lf/eo;
/*     */     //   2473: pop
/*     */     //   2474: getfield fq : Lf/Ih0;
/*     */     //   2477: dup
/*     */     //   2478: dup
/*     */     //   2479: dup2
/*     */     //   2480: ldc_w 50.0
/*     */     //   2483: putfield Bj : F
/*     */     //   2486: ldc_w -5.0
/*     */     //   2489: putfield IG0 : F
/*     */     //   2492: ldc 3.0
/*     */     //   2494: putfield el0 : F
/*     */     //   2497: ldc_w 0.1
/*     */     //   2500: putfield Ce0 : F
/*     */     //   2503: getstatic f/vH.AUX : Lf/eo;
/*     */     //   2506: dup
/*     */     //   2507: dup2
/*     */     //   2508: aload_1
/*     */     //   2509: swap
/*     */     //   2510: ldc_w 3.45
/*     */     //   2513: putfield y : F
/*     */     //   2516: ldc_w 3.2
/*     */     //   2519: putfield y : F
/*     */     //   2522: getfield x : F
/*     */     //   2525: fstore_1
/*     */     //   2526: getfield y : F
/*     */     //   2529: fstore_2
/*     */     //   2530: getfield z : F
/*     */     //   2533: fstore_3
/*     */     //   2534: fload_1
/*     */     //   2535: fload_2
/*     */     //   2536: fload_3
/*     */     //   2537: invokevirtual mP : (FFF)V
/*     */     //   2540: getfield fq : Lf/Ih0;
/*     */     //   2543: iconst_1
/*     */     //   2544: invokevirtual abstract : (Z)V
/*     */     //   2547: getfield iD : Lf/So;
/*     */     //   2550: dup
/*     */     //   2551: astore_1
/*     */     //   2552: ifnull -> 2560
/*     */     //   2555: aload_1
/*     */     //   2556: iconst_1
/*     */     //   2557: putfield fr0 : Z
/*     */     //   2560: aload_0
/*     */     //   2561: aconst_null
/*     */     //   2562: putfield iD : Lf/So;
/*     */     //   2565: goto -> 3010
/*     */     //   2568: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2571: bipush #31
/*     */     //   2573: invokevirtual j2 : (I)Z
/*     */     //   2576: ifeq -> 2774
/*     */     //   2579: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2582: bipush #59
/*     */     //   2584: invokevirtual Ak : (I)Z
/*     */     //   2587: ifeq -> 2774
/*     */     //   2590: aload_0
/*     */     //   2591: dup
/*     */     //   2592: invokestatic currentTimeMillis : ()J
/*     */     //   2595: ldc2_w 120000
/*     */     //   2598: ladd
/*     */     //   2599: putfield ZH : J
/*     */     //   2602: getfield iD : Lf/So;
/*     */     //   2605: dup
/*     */     //   2606: astore_1
/*     */     //   2607: ifnull -> 2712
/*     */     //   2610: aload_0
/*     */     //   2611: aload_1
/*     */     //   2612: iconst_1
/*     */     //   2613: putfield fr0 : Z
/*     */     //   2616: aconst_null
/*     */     //   2617: putfield iD : Lf/So;
/*     */     //   2620: invokestatic k60 : ()Lf/So;
/*     */     //   2623: invokevirtual L5 : ()Lf/So;
/*     */     //   2626: aload_0
/*     */     //   2627: getfield fq : Lf/Ih0;
/*     */     //   2630: iconst_4
/*     */     //   2631: ldc_w 0.5
/*     */     //   2634: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*     */     //   2637: getstatic f/vH.AUX : Lf/eo;
/*     */     //   2640: dup
/*     */     //   2641: dup
/*     */     //   2642: getfield x : F
/*     */     //   2645: fstore_1
/*     */     //   2646: getfield y : F
/*     */     //   2649: fstore_2
/*     */     //   2650: getfield z : F
/*     */     //   2653: fstore_3
/*     */     //   2654: fload_1
/*     */     //   2655: fload_2
/*     */     //   2656: fload_3
/*     */     //   2657: invokevirtual qw0 : (FFF)Lf/Wz0;
/*     */     //   2660: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*     */     //   2663: aload_0
/*     */     //   2664: getfield fq : Lf/Ih0;
/*     */     //   2667: bipush #9
/*     */     //   2669: ldc_w 0.5
/*     */     //   2672: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*     */     //   2675: getstatic f/vH.Lu : Lf/eo;
/*     */     //   2678: dup
/*     */     //   2679: dup
/*     */     //   2680: getfield x : F
/*     */     //   2683: fstore_1
/*     */     //   2684: getfield y : F
/*     */     //   2687: fstore_2
/*     */     //   2688: getfield z : F
/*     */     //   2691: fstore_3
/*     */     //   2692: fload_1
/*     */     //   2693: fload_2
/*     */     //   2694: fload_3
/*     */     //   2695: invokevirtual qw0 : (FFF)Lf/Wz0;
/*     */     //   2698: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*     */     //   2701: invokevirtual Kr : ()Lf/So;
/*     */     //   2704: aload_0
/*     */     //   2705: getfield dr0 : Lf/G30;
/*     */     //   2708: invokevirtual mg : (Lf/G30;)Lf/sh;
/*     */     //   2711: pop
/*     */     //   2712: iconst_0
/*     */     //   2713: istore_1
/*     */     //   2714: iload_1
/*     */     //   2715: aload_0
/*     */     //   2716: getfield P2 : Lf/Gp0;
/*     */     //   2719: invokevirtual H3 : ()B
/*     */     //   2722: if_icmpge -> 3010
/*     */     //   2725: iconst_0
/*     */     //   2726: istore_2
/*     */     //   2727: iload_2
/*     */     //   2728: aload_0
/*     */     //   2729: getfield P2 : Lf/Gp0;
/*     */     //   2732: dup
/*     */     //   2733: astore_3
/*     */     //   2734: getfield cl : [[Lf/hm0;
/*     */     //   2737: iload_1
/*     */     //   2738: aaload
/*     */     //   2739: arraylength
/*     */     //   2740: if_icmpge -> 2766
/*     */     //   2743: aload_3
/*     */     //   2744: iload_1
/*     */     //   2745: iload_2
/*     */     //   2746: invokevirtual N0 : (BB)Lf/hm0;
/*     */     //   2749: dup
/*     */     //   2750: astore_3
/*     */     //   2751: ifnull -> 2758
/*     */     //   2754: aload_3
/*     */     //   2755: invokevirtual Vb : ()V
/*     */     //   2758: iload_2
/*     */     //   2759: iconst_1
/*     */     //   2760: iadd
/*     */     //   2761: i2b
/*     */     //   2762: istore_2
/*     */     //   2763: goto -> 2727
/*     */     //   2766: iload_1
/*     */     //   2767: iconst_1
/*     */     //   2768: iadd
/*     */     //   2769: i2b
/*     */     //   2770: istore_1
/*     */     //   2771: goto -> 2714
/*     */     //   2774: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2777: bipush #8
/*     */     //   2779: invokevirtual j2 : (I)Z
/*     */     //   2782: ifeq -> 2863
/*     */     //   2785: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2788: bipush #59
/*     */     //   2790: invokevirtual Ak : (I)Z
/*     */     //   2793: ifeq -> 2863
/*     */     //   2796: getstatic f/km.wI0 : Lf/Pw;
/*     */     //   2799: getfield pB0 : Lf/G30;
/*     */     //   2802: dup
/*     */     //   2803: astore_1
/*     */     //   2804: iconst_0
/*     */     //   2805: istore_2
/*     */     //   2806: getfield x : Ljava/util/ArrayList;
/*     */     //   2809: invokevirtual size : ()I
/*     */     //   2812: istore_3
/*     */     //   2813: iload_2
/*     */     //   2814: iload_3
/*     */     //   2815: if_icmpge -> 2839
/*     */     //   2818: aload_1
/*     */     //   2819: getfield x : Ljava/util/ArrayList;
/*     */     //   2822: iload_2
/*     */     //   2823: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   2826: checkcast f/sh
/*     */     //   2829: iconst_1
/*     */     //   2830: putfield fr0 : Z
/*     */     //   2833: iinc #2, 1
/*     */     //   2836: goto -> 2813
/*     */     //   2839: aload_0
/*     */     //   2840: getfield jW : Lf/So;
/*     */     //   2843: dup
/*     */     //   2844: astore_1
/*     */     //   2845: ifnull -> 2853
/*     */     //   2848: aload_1
/*     */     //   2849: iconst_1
/*     */     //   2850: putfield fr0 : Z
/*     */     //   2853: aload_0
/*     */     //   2854: getstatic f/No0.Nw0 : Lf/No0;
/*     */     //   2857: invokevirtual Kg0 : (Lf/No0;)V
/*     */     //   2860: goto -> 3010
/*     */     //   2863: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2866: bipush #9
/*     */     //   2868: invokevirtual j2 : (I)Z
/*     */     //   2871: ifeq -> 2895
/*     */     //   2874: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2877: bipush #59
/*     */     //   2879: invokevirtual Ak : (I)Z
/*     */     //   2882: ifeq -> 2895
/*     */     //   2885: aload_0
/*     */     //   2886: getstatic f/No0.xa0 : Lf/No0;
/*     */     //   2889: invokevirtual Kg0 : (Lf/No0;)V
/*     */     //   2892: goto -> 3010
/*     */     //   2895: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2898: bipush #10
/*     */     //   2900: invokevirtual j2 : (I)Z
/*     */     //   2903: ifeq -> 2934
/*     */     //   2906: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2909: bipush #59
/*     */     //   2911: invokevirtual Ak : (I)Z
/*     */     //   2914: ifeq -> 2934
/*     */     //   2917: aload_0
/*     */     //   2918: dup
/*     */     //   2919: getstatic f/No0.Bp0 : Lf/No0;
/*     */     //   2922: dup
/*     */     //   2923: astore_1
/*     */     //   2924: putfield AJ0 : Lf/No0;
/*     */     //   2927: aload_1
/*     */     //   2928: invokevirtual Kg0 : (Lf/No0;)V
/*     */     //   2931: goto -> 3010
/*     */     //   2934: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2937: bipush #11
/*     */     //   2939: invokevirtual j2 : (I)Z
/*     */     //   2942: ifeq -> 2972
/*     */     //   2945: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2948: bipush #59
/*     */     //   2950: invokevirtual Ak : (I)Z
/*     */     //   2953: ifeq -> 2972
/*     */     //   2956: aload_0
/*     */     //   2957: dup
/*     */     //   2958: getfield P2 : Lf/Gp0;
/*     */     //   2961: invokevirtual nI : ()B
/*     */     //   2964: fconst_0
/*     */     //   2965: iconst_0
/*     */     //   2966: invokevirtual s2 : (BFB)V
/*     */     //   2969: goto -> 3010
/*     */     //   2972: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2975: bipush #46
/*     */     //   2977: invokevirtual j2 : (I)Z
/*     */     //   2980: ifeq -> 3010
/*     */     //   2983: getstatic f/UB0.PU : Lf/aY;
/*     */     //   2986: bipush #59
/*     */     //   2988: invokevirtual Ak : (I)Z
/*     */     //   2991: ifeq -> 3010
/*     */     //   2994: aload_0
/*     */     //   2995: dup
/*     */     //   2996: invokevirtual S80 : ()V
/*     */     //   2999: getfield iD : Lf/So;
/*     */     //   3002: aload_0
/*     */     //   3003: getfield dr0 : Lf/G30;
/*     */     //   3006: invokevirtual mg : (Lf/G30;)Lf/sh;
/*     */     //   3009: pop
/*     */     //   3010: aload_0
/*     */     //   3011: invokestatic Kw0 : ()Lf/cx0;
/*     */     //   3014: pop
/*     */     //   3015: getfield AJ0 : Lf/No0;
/*     */     //   3018: dup
/*     */     //   3019: astore_1
/*     */     //   3020: getstatic f/No0.Bp0 : Lf/No0;
/*     */     //   3023: if_acmpeq -> 3049
/*     */     //   3026: aload_1
/*     */     //   3027: getstatic f/No0.Cg : Lf/No0;
/*     */     //   3030: if_acmpeq -> 3049
/*     */     //   3033: aload_0
/*     */     //   3034: getfield P2 : Lf/Gp0;
/*     */     //   3037: getfield dd : Lf/rK;
/*     */     //   3040: getstatic f/rK.Lpt9 : Lf/rK;
/*     */     //   3043: if_acmpeq -> 3049
/*     */     //   3046: goto -> 3236
/*     */     //   3049: invokestatic Nr : ()Z
/*     */     //   3052: ifeq -> 3063
/*     */     //   3055: aload_0
/*     */     //   3056: getfield gt : Lf/cx0;
/*     */     //   3059: invokestatic lf0 : (Lf/cx0;)Z
/*     */     //   3062: pop
/*     */     //   3063: aload_0
/*     */     //   3064: dup
/*     */     //   3065: dup2
/*     */     //   3066: dup2
/*     */     //   3067: getfield gt : Lf/cx0;
/*     */     //   3070: getfield sf0 : F
/*     */     //   3073: ldc_w 133.0
/*     */     //   3076: fdiv
/*     */     //   3077: fconst_1
/*     */     //   3078: swap
/*     */     //   3079: fdiv
/*     */     //   3080: fstore_1
/*     */     //   3081: getfield fk : Lf/Tm;
/*     */     //   3084: dup
/*     */     //   3085: fload_1
/*     */     //   3086: putfield nUl : F
/*     */     //   3089: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   3092: invokevirtual fG0 : ()I
/*     */     //   3095: i2f
/*     */     //   3096: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   3099: invokevirtual dL : ()I
/*     */     //   3102: i2f
/*     */     //   3103: iconst_1
/*     */     //   3104: invokevirtual Wt : (FFZ)V
/*     */     //   3107: getstatic f/UB0.M60 : Lf/w70;
/*     */     //   3110: invokevirtual dL : ()I
/*     */     //   3113: i2f
/*     */     //   3114: fload_1
/*     */     //   3115: fmul
/*     */     //   3116: aload_0
/*     */     //   3117: getfield gt : Lf/cx0;
/*     */     //   3120: dup
/*     */     //   3121: astore_2
/*     */     //   3122: getfield zA0 : F
/*     */     //   3125: fload_1
/*     */     //   3126: fmul
/*     */     //   3127: fsub
/*     */     //   3128: fstore_3
/*     */     //   3129: getfield fk : Lf/Tm;
/*     */     //   3132: fload_3
/*     */     //   3133: aload_2
/*     */     //   3134: getfield dA : F
/*     */     //   3137: fneg
/*     */     //   3138: fload_1
/*     */     //   3139: fmul
/*     */     //   3140: fstore_1
/*     */     //   3141: fneg
/*     */     //   3142: ldc_w 80.0
/*     */     //   3145: fadd
/*     */     //   3146: fstore_2
/*     */     //   3147: getfield H : Lf/eo;
/*     */     //   3150: fload_1
/*     */     //   3151: fload_2
/*     */     //   3152: fconst_0
/*     */     //   3153: invokevirtual Tz : (FFF)Lf/eo;
/*     */     //   3156: pop
/*     */     //   3157: getfield fk : Lf/Tm;
/*     */     //   3160: iconst_1
/*     */     //   3161: invokevirtual UX : (Z)V
/*     */     //   3164: getfield yn0 : Lf/tH;
/*     */     //   3167: aload_0
/*     */     //   3168: getfield fk : Lf/Tm;
/*     */     //   3171: getfield VD0 : Lcom/badlogic/gdx/math/Matrix4;
/*     */     //   3174: invokevirtual d60 : (Lcom/badlogic/gdx/math/Matrix4;)V
/*     */     //   3177: getfield yn0 : Lf/tH;
/*     */     //   3180: invokevirtual Tx : ()V
/*     */     //   3183: iconst_0
/*     */     //   3184: istore_1
/*     */     //   3185: iload_1
/*     */     //   3186: aload_0
/*     */     //   3187: getfield P2 : Lf/Gp0;
/*     */     //   3190: invokevirtual H3 : ()B
/*     */     //   3193: if_icmpge -> 3219
/*     */     //   3196: iload_1
/*     */     //   3197: aload_0
/*     */     //   3198: getfield P2 : Lf/Gp0;
/*     */     //   3201: iload_1
/*     */     //   3202: invokevirtual wB : (B)Lf/QZ;
/*     */     //   3205: aload_0
/*     */     //   3206: getfield yn0 : Lf/tH;
/*     */     //   3209: invokevirtual Ll0 : (Lf/tH;)V
/*     */     //   3212: iconst_1
/*     */     //   3213: iadd
/*     */     //   3214: i2b
/*     */     //   3215: istore_1
/*     */     //   3216: goto -> 3185
/*     */     //   3219: aload_0
/*     */     //   3220: getfield yn0 : Lf/tH;
/*     */     //   3223: invokevirtual end : ()V
/*     */     //   3226: invokestatic Nr : ()Z
/*     */     //   3229: ifeq -> 3236
/*     */     //   3232: invokestatic Kw0 : ()Lf/cx0;
/*     */     //   3235: pop
/*     */     //   3236: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 20
/*     */     //   #2	-> 30
/*     */     //   #3	-> 79
/*     */     //   #4	-> 82
/*     */     //   #5	-> 131
/*     */     //   #6	-> 137
/*     */     //   #7	-> 224
/*     */     //   #8	-> 228
/*     */     //   #9	-> 247
/*     */     //   #10	-> 251
/*     */     //   #11	-> 289
/*     */     //   #12	-> 292
/*     */     //   #13	-> 441
/*     */     //   #14	-> 449
/*     */     //   #15	-> 485
/*     */     //   #16	-> 488
/*     */     //   #17	-> 807
/*     */     //   #18	-> 810
/*     */     //   #19	-> 844
/*     */     //   #20	-> 852
/*     */     //   #21	-> 871
/*     */     //   #22	-> 875
/*     */     //   #23	-> 876
/*     */     //   #24	-> 909
/*     */     //   #25	-> 920
/*     */     //   #26	-> 939
/*     */     //   #27	-> 945
/*     */     //   #28	-> 951
/*     */     //   #29	-> 965
/*     */     //   #30	-> 994
/*     */     //   #31	-> 997
/*     */     //   #32	-> 1002
/*     */     //   #33	-> 1014
/*     */     //   #34	-> 1044
/*     */     //   #35	-> 1047
/*     */     //   #36	-> 1068
/*     */     //   #37	-> 1072
/*     */     //   #38	-> 1077
/*     */     //   #39	-> 1090
/*     */     //   #40	-> 1099
/*     */     //   #41	-> 1120
/*     */     //   #42	-> 1139
/*     */     //   #43	-> 1143
/*     */     //   #44	-> 1144
/*     */     //   #45	-> 1158
/*     */     //   #46	-> 1166
/*     */     //   #47	-> 1175
/*     */     //   #48	-> 1187
/*     */     //   #49	-> 1192
/*     */     //   #50	-> 1219
/*     */     //   #51	-> 1331
/*     */     //   #52	-> 1341
/*     */     //   #53	-> 1344
/*     */     //   #54	-> 1351
/*     */     //   #55	-> 1354
/*     */     //   #56	-> 1358
/*     */     //   #57	-> 1359
/*     */     //   #58	-> 1411
/*     */     //   #59	-> 1422
/*     */     //   #60	-> 1427
/*     */     //   #61	-> 1460
/*     */     //   #62	-> 1465
/*     */     //   #63	-> 1478
/*     */     //   #64	-> 1512
/*     */     //   #65	-> 1523
/*     */     //   #66	-> 1658
/*     */     //   #67	-> 1678
/*     */     //   #68	-> 1787
/*     */     //   #69	-> 1802
/*     */     //   #70	-> 1825
/*     */     //   #71	-> 1835
/*     */     //   #72	-> 1849
/*     */     //   #73	-> 1873
/*     */     //   #74	-> 1894
/*     */     //   #75	-> 1916
/*     */     //   #76	-> 2014
/*     */     //   #77	-> 2019
/*     */     //   #78	-> 2022
/*     */     //   #79	-> 2092
/*     */     //   #80	-> 2109
/*     */     //   #81	-> 2114
/*     */     //   #82	-> 2129
/*     */     //   #83	-> 2134
/*     */     //   #84	-> 2166
/*     */     //   #85	-> 2171
/*     */     //   #86	-> 2186
/*     */     //   #87	-> 2191
/*     */     //   #88	-> 2421
/*     */     //   #89	-> 2434
/*     */     //   #90	-> 2544
/*     */     //   #91	-> 2547
/*     */     //   #92	-> 2557
/*     */     //   #93	-> 2562
/*     */     //   #94	-> 2613
/*     */     //   #95	-> 2617
/*     */     //   #96	-> 2705
/*     */     //   #97	-> 2708
/*     */     //   #98	-> 2734
/*     */     //   #99	-> 2738
/*     */     //   #100	-> 2739
/*     */     //   #101	-> 2799
/*     */     //   #102	-> 2806
/*     */     //   #103	-> 2809
/*     */     //   #104	-> 2830
/*     */     //   #105	-> 2840
/*     */     //   #106	-> 2850
/*     */     //   #107	-> 2854
/*     */     //   #108	-> 2924
/*     */     //   #109	-> 2928
/*     */     //   #110	-> 3003
/*     */     //   #111	-> 3006
/*     */     //   #112	-> 3015
/*     */     //   #113	-> 3037
/*     */     //   #114	-> 3040
/*     */     //   #115	-> 3147
/*     */     //   #116	-> 3153
/*     */     //   #117	-> 3157
/*     */     //   #118	-> 3161
/*     */     //   #119	-> 3164
/*     */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */