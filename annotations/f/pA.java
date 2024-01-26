/*  1 */ package f;public final class pA extends Ks0 { public static pA Dg0; public js wC0; public finally Qp0; public final wu TF; public final Un Jb0; public final NR jc0; public final ug Qn0; public int Rx; public int WX; public Hy yb0; public int LPt8; public int DL; public N0 Rz0; public int M8; public int Db; public wg0 iA0; public int uP; public int dM; public wg0 Mc; public fr s9; public hI0 hG; public YC dS; public ir YA0; public A QI0; public Gz vm0; public UH0 S9; public GV cl; public TQ sC0; public c5 Z; public Oi bP; public A8 LU; public XK0 Gu0; public h2 OU; public rg hJ; public wv BX; public xJ0 WH; public Bk0 FL; public Kf AL; public Wg Qx; public tR yI0; public ve yq0; public VF0 L90; public ld0 SM; public gO dk0; public Id0 Y5; public nq WU; public dG0 Uo; public qt0 Zr0; public nUL HX; public ep aV; public Zr M20; public OC0 fe; public Gz0 AD0; public je G0; public XF er0; public BH fw; public wX lPt8; public Ea0 L60; public bZ A0; public t1 tX; public yH0 af0; public Bx0 vx0; public AH fJ0; public PH0 qn0; public Fq0 so0; public qO Tq0; public Ut0 rB0; public dQ ma0; public IN cI; public ux Od0; public hJ0 QV; public HashMap zR; public lU La0; public pL0 qB; public B80 KI0; public pA(js paramjs) { wu wu1; ug ug1; this.Rx = -1; this.WX = -1; this.LPt8 = -1; this.DL = -1; this.M8 = -1; this.Db = -1; this.uP = -1; this.dM = -1; this.er0 = null; this.rB0 = new Ut0(); this.ma0 = null; this.cI = null; this.Od0 = null; this.QV = null; this.zR = new HashMap<>(); Xu("hudgui"); this.wC0 = paramjs; this.Qp0 = new finally(); Vo0(new I(this, pRn.WHITE)); this(); this.Jb0 = un; Un un; (un = new Un()).Xu("chatframe-hidden"); this(un, this); this.TF = new wu(); if (h1.mD0 || km.XU()) { wu1.CQ(false); un.wI0(true); } else { wu1.CQ(true); un.wI0(false); }  un.tW(new oe0(this)); this(this, false); this.jc0 = nR; (this.WH = new xJ0(this)).Q60(km.XU()); this(); this.Qn0 = new ug(); this.OU = new h2(); this.fe = new OC0(); NR nR; (nR = new NR()).mM(); if (km.XU()) { nR.Ol0(km.wI0.dG() - nR.kG0(), km.wI0.k1() - nR.kz0()); } else { nR.Ol0(km.wI0.dG() - nR.kG0(), km.wI0.k1() / 2 - nR.kz0() / 2); }  this.FL = new Bk0(); J8(this.OU); J8(nR); if (km.Nr()) { J8(this.fe); J8(this.Qp0); }  J8(this.FL); J8(this.WH); J8(wu1); J8(un); J8(ug1); Dg0 = this; } public static pA Wd() { return Dg0; } private void cQ(short[] paramArrayOfshort, Px0 paramPx0, byte paramByte, j40 paramj40) { XF xF; if ((xF = this.er0) != null) { xF.ra0(); this.er0 = null; }  if (paramArrayOfshort == null)
/*  2 */       return;  (this.er0 = new XF(this, paramPx0, paramByte, paramj40, paramArrayOfshort)).RI(640, 480); this.er0.Tm(640, 480); int i = RS();
/*    */     
/*  4 */     i = JO.Se0(qF(), this.er0.xY, 2, i);
/*  5 */     int j = e3();
/*    */ 
/*    */     
/*  8 */     this.er0.ME(i, (Hy() - this.er0.HC) / 2 + j);
/*  9 */     J8(this.er0); } private void rK0(P4 paramP4) { Zr zr; if ((zr = this.M20) != null) { zr.ra0(); this.M20 = null; return; }  if (paramP4 != null) { this(paramP4); this.M20 = new Zr(); J8(zr); this.M20.mM(); this.M20.ME(km.wI0.dG() / 2 - this.M20.xY / 2, km.wI0.k1() / 2 - this.M20.HC / 2); }  } private void nN(ZH paramZH, byte paramByte) { if (!this.dP) wI0(true);  this(paramZH); Texture texture1, texture2; paramZH.dispose(); TQ tQ2; if ((tQ2 = this.sC0) != null) { if ((texture1 = tQ2.BV) != null) dispose();  tQ2.BV = texture2; tQ2.yc.E1(Ml0.Go(70, paramByte + "")); tQ2.Ni.TS.Yo(new Texture[] { texture2 }); tQ2.FB0.s6(Ml0.OH0(69)); tQ2.FB0.sk0(true); tQ2.L8.Be0("", false); tQ2.L8.sk0(true); tQ2.L8.xI0(); VA0.c90(tQ2.L8); tQ2.N60 = System.currentTimeMillis(); tQ2.i40 = 45000L; return; }  this(texture2, paramByte); ((pA)super).sC0 = new TQ(); super.J8(this); TQ tQ1; (tQ1 = ((pA)super).sC0).getClass();
/* 10 */     if (km.XU()) { this.L8.BA(); } else if (!this.L8.p3()) { VA0.c90(this.L8); }  } private void g3(byte paramByte1, String paramString, int paramInt1, int paramInt2, int paramInt3, byte paramByte2, ky paramky, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte3, byte paramByte4, byte paramByte5) { if (this.WU != null) { km.u4.lx0(paramByte1, OI0.Rd0.Vv); return; }  this(this, paramByte1, paramString, paramInt1, paramInt2, paramInt3, paramByte2, paramky, paramBoolean1, paramBoolean2, paramBoolean3, paramByte3, paramByte4, paramByte5); AUx aUx; this.WU = aUx; J8(aUx); } public static void wg() { km.u4.e20.W3(new gJ0()); } private void Zd0() { ve ve1; if ((ve1 = this.yq0) != null) { if (!ve1.Oh0) km.u4.Pq(Ml0.OH0(5523));  VA0.c90(this.yq0); return; }  boolean bool = true; km.u4.e20.W3(new jD(bool)); } private void bc0() { ve ve1; if ((ve1 = this.yq0) != null) { if (ve1.Oh0) km.u4.Pq(Ml0.OH0(5523));  VA0.c90(this.yq0); return; }  boolean bool = false; km.u4.e20.W3(new jD(bool)); } public static void rI0() { js.vu0.s8(false, km.a3.bm(10), -1, -1); } private void lb() { HT hT2; if ((hT2 = (HT)vC0.Bv0(this, HT.class)) != null) { VA0.c90(hT2); return; }  vh0 vh0; if ((vh0 = km.a3) == null || vh0.Jr0() == null || (km.a3.Jr0()).Xw < 0) { km.u4.Pq(Ml0.OH0(6002)); return; }  this(); HT hT1; J8(this); }
/* 11 */   public final void dp0() { wu wu1; (wu1 = this.TF).getClass(); if (!km.XU()) { wu1.Im0 = false; int i = km.wI0.k1() - wu1.HC + h1.Ba0; wu1.yN(h1.Ke0, h1.CR); wu1.ME(h1.S9, i); wu1.Im0 = true; }  this.WH.kV(); this.Qn0.Tb0(); if (km.XU()) { if (h1.Wo) { this.jc0.js0(et.T90); } else { this.jc0.js0(et.dw0); }  } else { this.jc0.ME(km.wI0.dG() - this.jc0.xY, km.wI0.k1() / 2 - this.jc0.HC / 2); }  this
/* 12 */       .TF.Ui0(h1.JF); this.Qp0.MJ0(); }
/*    */   public final void nk(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { if (this.kM != 0) { UB0.Kg0.fN(() -> nk(paramInt1, paramInt2, paramBoolean1, paramBoolean2, paramBoolean3)); return; }  hI0 hI01; if ((hI01 = this.hG) != null) { hI01.ra0(); this.hG = null; }  (this.hG = new hI0(this, paramInt1, paramInt2, paramBoolean1, paramBoolean2, paramBoolean3)).wI0(true); this.hG.mM(); paramInt1 = RS(); paramInt1 = JO.Se0(qF(), this.hG.xY, 2, paramInt1); paramInt2 = e3(); this.hG.ME(paramInt1, (Hy() - this.hG.HC) / 2 + paramInt2); J8(this.hG); }
/*    */   public final void Yd() { if (this.hG != null) { if (km.XU()) km.wI0.iJ0.Zq0(true, -1);  hI0 hI01; int i; if ((i = (hI01 = this.hG).Hk0) != 0 && hI01.W0 != 0) { String str; Qz0 qz0 = km.kH0; LPT1[] arrayOfLPT1 = new LPT1[0]; if (i == 0) { str = ""; } else { str = qf0.Sz(str, arrayOfLPT1); }  Aq aq = Aq.ur; int j = this.hG.W0; Ku0 ku0 = null; qz0.getClass(); qz0.wV(new zB0(str, aq, j, ku0)); }  this.hG.ra0(); this.hG = null; }  }
/* 15 */   public final void IA0(boolean paramBoolean) { ir ir1; if ((ir1 = this.YA0) != null) { ir1.ra0(); this.YA0 = null; return; }  if (!paramBoolean) return;  (this.YA0 = new ir(this)).Tm(640, 480); this.YA0.ME(km.wI0.dG() / 2 - this.YA0.xY / 2, km.wI0.k1() / 2 - this.YA0.HC / 2); J8(this.YA0); } public final void dj0(boolean paramBoolean, Tl0 paramTl0) { qt0 qt01; if ((qt01 = this.Zr0) != null) { qt01.ra0(); this.Zr0 = null; ro.l10 = 0; wJ0.Nf0.dz(); }  if (!paramBoolean) return;  (this.Zr0 = new qt0(paramTl0)).uh0(285, 50); this.Zr0.Tm(285, 50); this.Zr0.ME(60, km.wI0.k1() / 3 - this.Zr0.HC / 2); J8(this.Zr0); VA0.c90(this.Zr0); } public final void SR(boolean paramBoolean1, byte paramByte, boolean paramBoolean2, String[] paramArrayOfString, int[] paramArrayOfint) { dG0 dG01; if ((dG01 = this.Uo) != null) { dG01.ra0(); this.Uo = null; }  if (!paramBoolean1) return;  (this.Uo = new dG0(paramByte, paramBoolean2, paramArrayOfString, paramArrayOfint)).uh0(285, 50); this.Uo.Tm(285, 50); this.Uo.ME(60, km.wI0.k1() / 3 - this.Uo.HC / 2); J8(this.Uo); } public final void cJ0() { N0 n02; if ((n02 = this.Rz0) != null) { this.M8 = n02.Kd; this.Db = n02.er0; n02.ra0(); this.Rz0 = null; return; }  (this.Rz0 = new N0(this)).RI(480, 300); this.Rz0.Tm(480, 300); int i; N0 n01; if ((i = this.M8) > 0 && this.Db > 0 && i <= km.wI0.dG() - this.Rz0.xY && this.Db <= km.wI0.k1() - (n01 = this.Rz0).HC) { int j = this.M8; n01.ME(j, this.Db); } else { this.Rz0.ME(km.wI0.dG() / 2 - this.Rz0.xY / 2, km.wI0.k1() / 2 - this.Rz0.HC / 2); }
/* 16 */      J8(this.Rz0); } public final void WW(boolean paramBoolean) { Id0 id0; if ((id0 = this.Y5) != null) { id0.ra0(); this.Y5 = null; }  if (!paramBoolean) return;  (this.Y5 = new Id0()).uh0(210, 50); this.Y5.Tm(210, 50); this.Y5.ME(km.wI0.dG() / 2 - this.Y5.xY / 2, km.wI0.k1() / 2 - this.Y5.HC / 2); J8(this.Y5); } public final void cd0(boolean paramBoolean) { Wg wg; if ((wg = this.Qx) != null) { wg.ra0(); this.Qx = null; }  if (!paramBoolean) return;  (this.Qx = new Wg()).ME(km.wI0.dG() / 2 - this.Qx.xY / 2, km.wI0.k1() / 2 - this.Qx.HC / 2); J8(this.Qx); } public final void ni(boolean paramBoolean) { Oi oi1; wv wv1; if ((wv1 = this.BX) != null) { wv1.ra0(); this.BX = null; return; }  Oi oi2; if ((oi2 = this.bP) != null) { oi2.ra0(); this.bP = null; return; }  if (!paramBoolean) return;  if (km.u4.Wn0 == null) { if (oi2 != null) oi2.ra0();  this(); this.bP = this; J8(this); return; }  (((pA)super).BX = new wv((pA)this)).RI(485, 300); ((pA)super).BX.Tm(485, 300); ((pA)super).BX.ME(km.wI0.dG() / 2 - ((pA)super).BX.xY / 2, km.wI0.k1() / 2 - ((pA)super).BX.HC / 2); super.J8(((pA)super).BX); } public final void Sc() { ld0 ld01; if ((ld01 = this.SM) != null) { ld01.ra0(); this.SM = null; }  } public final void IL0(boolean paramBoolean) { XK0 xK02; if ((xK02 = this.Gu0) != null) { xK02.ra0(); this.Gu0 = null; return; }  if (!paramBoolean) return;  this(this); XK0 xK01; this.Gu0 = xK01; J8(xK01); } public final void Ou0() { nUL nUL1; if ((nUL1 = this.HX) != null) { nUL1.ra0(); this.HX = null; return; }  (this.HX = new nUL(this)).RI(470, 320); this.HX.Tm(470, 320); this.HX.ME(km.wI0.dG() / 2 - this.HX.xY / 2, km.wI0.k1() / 2 - this.HX.HC / 2); J8(this.HX); } public final void ft() { je je1; if ((je1 = this.G0) != null) { je1.ra0(); this.G0 = null; return; }  this(this); this.G0 = je1; J8(je1); } public final void Um(int paramInt) { M60 m60; if ((m60 = (M60)this.rB0.Z6(paramInt)) == null) return;  this.Rx = m60.Kd; this.WX = m60.er0; this.rB0.remove(paramInt); m60.ra0(); } public final void cf() { wg0 wg02; if ((wg02 = this.iA0) != null) { this.uP = wg02.Kd; this.dM = wg02.er0; wg02.ra0(); this.iA0 = null; return; }  (this.iA0 = new wg0(this, false)).uh0(350, 200); this.iA0.Tm(350, 200); wg0 wg01; int i; if ((i = this.uP) > 0 && this.dM > 0 && i <= km.wI0.dG() - this.iA0.xY && this.dM <= km.wI0.k1() - (wg01 = this.iA0).HC) { int j = this.uP; wg01.ME(j, this.dM); } else { this.iA0.ME(km.wI0.dG() / 2 - this.iA0.xY / 2, km.wI0.k1() / 2 - this.iA0.HC / 2); }  J8(this.iA0); } public final void e30() { c5 c51; if ((c51 = this.Z) != null) { c51.ra0(); this.Z = null; return; }  this(this); this.Z = new c5(); J8(c51); this.Z.mM(); this.Z.js0(et.Wi0); } public final void f50(byte paramByte1, String paramString, int paramInt1, int paramInt2, int paramInt3, byte paramByte2, ky paramky, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte3, byte paramByte4, byte paramByte5) { // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: aload_2
/*    */     //   6: iload_3
/*    */     //   7: iload #4
/*    */     //   9: iload #5
/*    */     //   11: iload #6
/*    */     //   13: aload #7
/*    */     //   15: iload #8
/*    */     //   17: iload #9
/*    */     //   19: iload #10
/*    */     //   21: iload #11
/*    */     //   23: iload #12
/*    */     //   25: iload #13
/*    */     //   27: <illegal opcode> run : (Lf/pA;BLjava/lang/String;IIIBLf/ky;ZZZBBB)Ljava/lang/Runnable;
/*    */     //   32: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   35: return } public final void mv0(ZH paramZH, byte paramByte) { // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: aload_1
/*    */     //   5: iload_2
/*    */     //   6: <illegal opcode> run : (Lf/pA;Lf/ZH;B)Ljava/lang/Runnable;
/*    */     //   11: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   14: return } public final void Z20() { UB0.Kg0.fN(() -> { TQ tQ; if ((tQ = this.sC0) != null) ra0();  }); } public final void mp(P4 paramP4) { // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: aload_1
/*    */     //   5: <illegal opcode> run : (Lf/pA;Lf/P4;)Ljava/lang/Runnable;
/*    */     //   10: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   13: return } public final gO Ol() { return this.dk0; } public final void uq0() { Hy hy; if ((hy = this.yb0) != null) { this.LPt8 = hy.Kd; this.DL = hy.er0; hy.ra0(); this.yb0 = null; }  }
/* 17 */   public final void RQ() { Hy hy2; if ((hy2 = this.yb0) != null) { this.LPt8 = hy2.Kd; this.DL = hy2.er0; hy2.ra0(); this.yb0 = null; return; }  R8 r8; if ((r8 = km.u4) == null) return;  qc0 qc0; if ((qc0 = r8.OK) == null) return;  (this.yb0 = new Hy(this, qc0)).RI(600, 400); this.yb0.Tm(600, 400); Hy hy1; if (this.LPt8 > 0 && this.DL > 0 && this.Rx <= km.wI0.dG() - this.yb0.xY && this.DL <= km.wI0.k1() - (hy1 = this.yb0).HC) { int i = this.LPt8; hy1.ME(i, this.DL); } else { this.yb0.ME(km.wI0.dG() / 2 - this.yb0.xY / 2, km.wI0.k1() / 2 - this.yb0.HC / 2); }
/* 18 */      J8(this.yb0); VA0.c90(this.yb0); } public final void sW(boolean paramBoolean) { A8 a82; if ((a82 = this.LU) != null) { a82.ra0(); this.LU = null; }  if (!paramBoolean)
/*    */       return;  this(this); A8 a81; this.LU = new A8(); J8(a81); this.LU.mM(); this.LU.ME(km.wI0.dG() / 2 - this.LU.xY / 2, km.wI0.k1() / 2 - this.LU.HC / 2); }
/*    */   public final void gk0() { boolean bool; if (this.aV == null) { bool = true; } else { bool = false; }  p10(bool); }
/*    */   public final void p10(boolean paramBoolean) { ep ep2; if ((ep2 = this.aV) != null) { ep2.ra0(); this.aV = null; }  if (!paramBoolean)
/*    */       return;  this(this); ep ep1; this.aV = new ep(); J8(ep1); this.aV.mM(); this.aV.ME(km.wI0.dG() / 2 - this.aV.xY / 2, km.wI0.k1() / 2 - this.aV.HC / 2); }
/*    */   public final void du() { UH0 uH0; if ((uH0 = this.S9) != null) { uH0.ra0(); this.S9 = null; }  }
/*    */   public final void h() { Gz gz; if ((gz = this.vm0) != null) { gz.ra0(); this.vm0 = null; }  }
/*    */   public final boolean jf0(JG0 paramJG0) { if (paramJG0 == this.WU) { this.WU = null; } else if (paramJG0 == this.sC0) { this.sC0 = null; }  xJ0 xJ01; String str; if ((xJ01 = this.WH) != null && this.iA0 == paramJG0 && !km.XU() && !(str = "hotkeybar").equals(xJ01.cl)) { xJ01.Xu(str); xJ01.cZ(); }  return super.jf0(paramJG0); }
/*    */   public final void V90(throws paramthrows) { if (km.XU()) { boolean bool1, bool2; boolean bool = this.wC0.B5(); if (this.wC0.BA != null) { bool1 = true; } else { bool1 = false; }  NR nR = this.jc0; if (!bool && !bool1) { bool2 = true; } else { bool2 = false; }  nR.CQ(bool2); xJ0 xJ01 = this.WH; if (!bool && !bool1) { bool2 = true; } else { bool2 = false; }  xJ01.CQ(bool2); this.Jb0.wI0(bool ^ true); Bk0 bk0 = this.FL; if (!bool && !bool1) { bool2 = true; } else { bool2 = false; }  bk0.wI0(bool2); ug ug1 = this.Qn0; if (!bool && !bool1) { bool1 = true; }
/*    */       else { bool1 = false; }
/*    */        ug1.CQ(bool1); if (bool) { this.OU.wI0(false); }
/*    */       else if (km.D70(1)) { this.OU.No(); }
/*    */        }
/*    */     else { h2 h21; if ((h21 = this.OU) != null)
/*    */         h21.No();  }
/*    */      /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/ak}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/ak}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/R8}, name=null}, name=lR, descriptor=Lf/ak;}} */ R8 r8; if ((r8 = km.u4) != null && !r8.lR.isEmpty()) { ak ak; IN iN; try { ak ak1; (ak1 = r8.lR).getClass(); Iterator iterator; if (((DA0)(iterator = (new Ux(ak1)).iterator())).hasNext()) { RR rR = (RR)((D70)iterator).Zp(); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/ak}, name=null} */ }
/*    */         else { /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/ak}, name=null} */ iterator = null; }
/*    */          return; }
/* 36 */       finally { this = null;
/*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/IN}, name=null} */ }
/*    */        }
/*    */     
/*    */     Object object = null; }
/*    */ 
/*    */   
/*    */   public final xJ0 JN() {
/*    */     return this.WH;
/*    */   }
/*    */   
/*    */   public final void Yv0(String paramString) {
/*    */     if ((kC0)this.zR.get(paramString) != null)
/*    */       return; 
/*    */     this(paramString);
/*    */     J8(kC0);
/*    */     kC0 kC0;
/*    */     (kC0 = new kC0()).mM();
/*    */     (new kC0()).ME(km.wI0.dG() / 2 - kC0.xY / 2, km.wI0.k1() / 2 - kC0.HC / 2);
/*    */     VA0.c90((new kC0()).cv0);
/*    */     this.zR.put(paramString, kC0);
/*    */   }
/*    */   
/*    */   public final void zt0() {
/*    */     t1 t11;
/*    */     if ((t11 = this.tX) != null) {
/*    */       t11.ra0();
/*    */       this.tX = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void B10() {
/*    */     Fq0 fq0;
/*    */     if ((fq0 = this.so0) != null) {
/*    */       fq0.ra0();
/*    */       this.so0 = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Nr(Bf paramBf, int paramInt, j40 paramj40, byte paramByte) {
/*    */     PH0 pH0;
/*    */     if ((pH0 = this.qn0) != null) {
/*    */       pH0.ra0();
/*    */       this.qn0 = null;
/*    */     } 
/*    */     this(paramBf, paramInt, paramj40, paramByte);
/*    */     this.qn0 = new PH0();
/*    */     if (!pH0.Gs) {
/*    */       pH0.ra0();
/*    */       this.qn0 = null;
/*    */       return;
/*    */     } 
/*    */     J8(pH0);
/*    */     this.qn0.mM();
/*    */     this.qn0.ME(km.wI0.dG() / 2 - this.qn0.xY / 2, km.wI0.k1() / 2 - this.qn0.HC / 2);
/*    */   }
/*    */   
/*    */   public final void J8(JG0 paramJG0) {
/*    */     boolean bool;
/*    */     wu wu1;
/*    */     of of;
/*    */     if ((wu1 = this.TF) != null && (of = wu1.b00) != null && of.p3()) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     si(paramJG0, Ub());
/*    */     xJ0 xJ01;
/*    */     if ((xJ01 = this.WH) == null)
/*    */       return; 
/*    */     String str;
/*    */     if (this.iA0 == paramJG0 && !km.XU() && !(str = "hotkeybar-frame-visible").equals(xJ01.cl)) {
/*    */       xJ01.Xu(str);
/*    */       xJ01.cZ();
/*    */     } 
/*    */     if (bool) {
/*    */       VA0.c90(this.TF.b00);
/*    */     } else {
/*    */       Af(paramJG0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     int i;
/*    */     byte b;
/*    */     et et;
/*    */     finally finally1;
/*    */     if ((finally1 = this.Qp0).fr0 != null && finally1.dP) {
/*    */       i = -finally1.HC;
/*    */     } else {
/*    */       i = 0;
/*    */     } 
/*    */     if (km.XU()) {
/*    */       b = -96;
/*    */     } else {
/*    */       b = 4;
/*    */     } 
/*    */     for (Iterator<kD0> iterator = this.zR.values().iterator(); iterator.hasNext();) {
/*    */       if ((kD0 = iterator.next()).ab0.dP && kD0.dP) {
/*    */         kD0.QJ0(et.dw0, b, i);
/*    */         i -= kD0.Hy();
/*    */       } 
/*    */     } 
/*    */     hJ0 hJ01;
/*    */     if ((hJ01 = this.QV) != null && hJ01.dP) {
/*    */       hJ01.QJ0(et.dw0, b, i);
/*    */       i -= hJ01.Hy();
/*    */     } 
/*    */     ve ve1;
/*    */     if ((ve1 = this.yq0) != null && ve1.dP && ve1.ab0.dP) {
/*    */       ve1.QJ0(et.dw0, b, i);
/*    */       ve1.Hy();
/*    */     } 
/*    */     h2 h21;
/*    */     if ((h21 = this.OU) != null) {
/*    */       h21.mM();
/*    */       this.OU.ME(0, 0);
/*    */     } 
/*    */     OC0 oC0;
/*    */     if ((oC0 = this.fe) != null) {
/*    */       oC0.mM();
/*    */       this.fe.ME(0, 0);
/*    */     } 
/*    */     ux ux1;
/*    */     if ((ux1 = this.Od0) != null)
/*    */       ux1.mM(); 
/*    */     this.Jb0.mM();
/*    */     Un un = this.Jb0;
/*    */     if (km.XU()) {
/*    */       et = et.Em;
/*    */     } else {
/*    */       et = et.T90;
/*    */     } 
/*    */     un.js0(et);
/*    */     this.WH.mM();
/*    */     this.Qn0.mM();
/*    */   }
/*    */   
/*    */   public final void BI0(j40 paramj40, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     Kf kf;
/*    */     if ((kf = this.AL) != null) {
/*    */       kf.ra0();
/*    */       this.AL = null;
/*    */     } 
/*    */     if (!paramBoolean1)
/*    */       return; 
/*    */     (this.AL = new Kf(paramBoolean2, paramj40)).RI(440, 500);
/*    */     this.AL.Tm(440, 500);
/*    */     this.AL.ME(km.wI0.dG() / 2 - this.AL.xY / 2, km.wI0.k1() / 2 - this.AL.HC / 2);
/*    */     J8(this.AL);
/*    */   }
/*    */   
/*    */   public final void A4(j40 paramj40, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     A a2;
/*    */     if ((a2 = this.QI0) != null) {
/*    */       a2.ra0();
/*    */       this.QI0 = null;
/*    */     } 
/*    */     if (!paramBoolean1)
/*    */       return; 
/*    */     if (this.dk0 != null)
/*    */       paramBoolean2 = true; 
/*    */     this(paramj40, paramBoolean2);
/*    */     A a1;
/*    */     this.QI0 = new A();
/*    */     J8(this);
/*    */     VA0.c90(this.QI0);
/*    */   }
/*    */   
/*    */   public final void zj0(short[] paramArrayOfshort, Px0 paramPx0, byte paramByte, j40 paramj40) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: aload_1
/*    */     //   5: aload_2
/*    */     //   6: iload_3
/*    */     //   7: aload #4
/*    */     //   9: <illegal opcode> run : (Lf/pA;[SLf/Px0;BLf/j40;)Ljava/lang/Runnable;
/*    */     //   14: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   17: return
/*    */   }
/*    */   
/*    */   public final B3 Em() {
/*    */     this(Ml0.OH0(1126));
/*    */     String str = Ml0.OH0(1649);
/*    */     b32.mD(this, () -> Ou0());
/*    */     str = Ml0.OH0(1120);
/*    */     b32.mD(this, () -> ni(true));
/*    */     str = Ml0.OH0(1113);
/*    */     B3 b32;
/*    */     (b32 = new B3()).mD(this, this::lb);
/*    */     (new B3()).mD(Ml0.OH0(1121), pA::rI0);
/*    */     js.vu0.getClass();
/*    */     B3 b31 = js.uN();
/*    */     (new B3()).aV.add(this);
/*    */     return new B3();
/*    */   }
/*    */   
/*    */   public final B3 vj() {
/*    */     this(Ml0.OH0(1126));
/*    */     String str = Ml0.OH0(5500);
/*    */     b3.mD(this, this::bc0);
/*    */     str = Ml0.OH0(9150);
/*    */     b3.mD(this, this::Zd0);
/*    */     str = Ml0.OH0(1128);
/*    */     B3 b3;
/*    */     (b3 = new B3()).mD(this, this::gk0);
/*    */     (new B3()).mD(Ml0.OH0(5670), pA::wg);
/*    */     return new B3();
/*    */   }
/*    */   
/*    */   public final void U10(boolean paramBoolean, R2 paramR2) {
/*    */     fr fr2;
/*    */     if ((fr2 = this.s9) != null) {
/*    */       if ((runnable = fr2.XM) != null)
/*    */         runnable.run(); 
/*    */       this.s9.ra0();
/*    */       this.s9 = null;
/*    */       return;
/*    */     } 
/*    */     if (runnable == null)
/*    */       return; 
/*    */     this(this, paramR2);
/*    */     Runnable runnable;
/*    */     fr fr1;
/*    */     this.s9 = fr1;
/*    */     J8(fr1);
/*    */   }
/*    */   
/*    */   public final void u30(JG0 paramJG0, j40 paramj40) {
/*    */     Qd0(paramj40, paramJG0, 1, false);
/*    */   }
/*    */   
/*    */   public final M60 Qd0(j40 paramj40, JG0 paramJG0, int paramInt, boolean paramBoolean) {
/*    */     if (paramj40 == null)
/*    */       return null; 
/*    */     M60 m602;
/*    */     if ((m602 = (M60)this.rB0.Z6(paramj40.Jg)) != null) {
/*    */       VA0.c90(m602);
/*    */       return m602;
/*    */     } 
/*    */     int j, k;
/*    */     if (!this.rB0.isEmpty() && (j = this.Rx) > 0 && (k = this.WX) > 0) {
/*    */       this.WX = k + 48;
/*    */       this.Rx = j + 28;
/*    */     } 
/*    */     this(this, paramj40, paramInt, true, paramBoolean);
/*    */     M60 m601;
/*    */     (new M60()).FX = paramJG0;
/*    */     int i;
/*    */     if ((i = this.Rx) > 0 && this.WX > 0 && i <= km.wI0.dG() - m601.xY && this.WX <= km.wI0.k1() - m601.HC) {
/*    */       i = this.Rx;
/*    */       m601.ME(i, this.WX);
/*    */     } else {
/*    */       m601.ME(km.wI0.dG() / 2 - m601.xY / 2, km.wI0.k1() / 2 - m601.HC / 2);
/*    */     } 
/*    */     this.Rx = m601.Kd;
/*    */     this.WX = m601.er0;
/*    */     this.rB0.A3(paramj40.Jg, m601);
/*    */     J8(m601);
/*    */     return m601;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */