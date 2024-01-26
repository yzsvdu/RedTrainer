/*  1 */ package f;public class gH0 extends hO { public static final Color BQ = new Color(-185273089); public static final short[] Fr = new short[0]; public final Qj0 LN; public int oj0; public int za; public boolean Jx0; public final LinkedList Hr0; public Un[][] Dz0; public Un[] Ov; public int pRN; public rY vA; public g0 dc; public cr0 m; public Ip v80; public rS COM5; public final ym0 iX; public final ym0 H6; public byte pJ; public final ArrayList xd0; public byte y2; public byte xz; public int tX; public final void const(int paramInt) { Un[] arrayOfUn; if ((arrayOfUn = this.Ov) == null || arrayOfUn.length == 0) return;  if (paramInt >= arrayOfUn.length) paramInt = 0;  this.pRN = paramInt; VA0.c90(arrayOfUn[paramInt]); this.COM5.ai(this.Ov[paramInt]); } public final boolean RW(int paramInt) { Aq aq; Un[] arrayOfUn; if ((arrayOfUn = this.Ov) == null || arrayOfUn[this.pRN] == null) return true;  if (h1.J20(paramInt, BM.bC)) { if ((aq = this.pe) == Aq.Md || aq == Aq.im0) return true;  hm.Fz0((this.Ov[this.pRN]).TG0.oh0); } else { Aq aq1; if (h1.J20(aq, BM.lc)) { Un un; if (this.pe == Aq.Md) return true;  int i; byte b; for (aq = null, i = (arrayOfUn = this.Ov).length, b = 0; b < i; ) { Un un1; if ((un1 = arrayOfUn[b]) == this.iX || un1 == this.H6 || this.xd0.contains(un1)) un = un1;  b++; }  if (un != null) { hm.Fz0(un.TG0.oh0); } else if (((aq1 = this.pe) == Aq.vV || aq1 == Aq.oi) && (this.pJ & 0x2) != 0) { C40(127); }  } else { int i; if (h1.J20(aq1, BM.ni)) { if ((i = this.pRN) > 0) const(i - 1);  } else if (h1.J20(i, BM.N70) && (i = this.pRN + 1) < this.Ov.length) { const(i); }  }  }  return true; } public final boolean Cs0() { if (!this.vA.bA0()) return false;  if (!CC0() && this.tX == 0) { C40((byte)0); return true; }  return false; } public final boolean CC0() { String str; if ((str = this.Hr0.poll()) != null) { if (this.pe.Q20 && str
/*  2 */         .trim().isEmpty() && this.Hr0.isEmpty()) { dm(); return true; }  Aq aq; if ((aq = this.pe) == Aq.Md || aq == Aq.im0 || aq == Aq.yx0)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*  9 */         this
/* 10 */           .vA.E1(str); dm(); return true; }  this.vA.R.add(new Rb(str)); rY rY1; if ((rY1 = this.vA).rW < 1) { byte b; rY1.jT = 500; if (this.Hr0.isEmpty()) { b = 200; } else { b = 100; }  rY1.rW = b; }  dm(); return true; }  return false; }
/*    */   public final void U70() { if (!this.vA.bA0()) return;  if (!CC0()) C40((byte)0);  }
/* 12 */   public void dm() { if (!this.vA.bA0()) { Nq0(-1); return; }  if (!this.Hr0.isEmpty()) { Nq0(0); return; }  if (this.Vd0) { Nq0(-1); return; }  switch (this.pe.ordinal()) { default: Nq0(0); return;case 38: case 46: U70(); return;case 31: case 42: case 50: Nq0(9); return;case 26: case 30: Nq0(8); return;case 13: Nq0(6); return;case 11: case 14: case 45: case 47: Nq0(5); return;case 10: Nq0(7); return;case 5: case 34: case 41: break; }  Nq0(1); } public final void Nq0(int paramInt) { Un[] arrayOfUn; boolean bool; this.dc.Hb(); this.m.Hb(); if (paramInt < 0) { arrayOfUn = null; } else { arrayOfUn = this.Dz0[paramInt]; }  byte b; for (this.Ov = arrayOfUn, b = 0; b < this.Dz0.length; ) { Un[] arrayOfUn1; for (bool = false; bool < (arrayOfUn1 = this.Dz0[b]).length; ) { boolean bool1; Un un = arrayOfUn1[bool]; if (b == paramInt) { bool1 = true; } else { bool1 = false; }  un.wI0(bool1); if (b == paramInt) { this.dc.Ya(this.Dz0[b][bool]); this.m.Ya(this.Dz0[b][bool]); }  bool++; }  b++; }  rS rS2 = this.COM5; if (this.Ov != null) { bool = true; } else { bool = false; }  rS2.wI0(bool); this.tX = paramInt; rS rS1 = this.COM5; rS1 = this.COM5; String str; if ((this.P80 == -1) ? (str = "scrollpane-transparent").equals(rS1.cl) : (str = "scrollpane").equals(rS1.cl)) { rS1.Xu(str); rS1.cZ(); }  Aq aq; if ((aq = this.pe) == Aq.ny0) { const(1); } else if (aq == Aq.vV || aq == Aq.id0) { int i; s10 s10 = s10.hU; byte b1 = this.y2; ss ss; if ((ss = (ss)(s10.vw0[b1]).ix.Ha0(this.xz)) == null) { i = 0; }
/* 13 */       else { i = i.DH0; }
/* 14 */        const(i); } else { const(0); }  if (km.Lpt1.Y80(h1.o5)) { RW(h1.o5); } else if (km.Lpt1.Y80(h1.nUL)) { RW(h1.nUL); }  d40(); } public final void Lf0(zB0 paramzB0) { if (paramzB0.ph0 == Aq.oi) { byte b; Un[] arrayOfUn; for (this.pJ = paramzB0.so, this.Dz0[9] = new Un[paramzB0.KK.length], b = 0; b < (arrayOfUn = this.Dz0[9]).length; ) { ym0 ym01; String str; this(); arrayOfUn[b] = ym01; Un un = this.Dz0[9][b]; LPT1[] arrayOfLPT1 = paramzB0.nC0; int i; if ((i = paramzB0.pF | paramzB0.KK[b]) == 0) { str = ""; } else { str = qf0.Sz(str, arrayOfLPT1); }  un.s6(str); this.Dz0[9][b].tW(() -> C40(paramByte)); this.dc.Ya(this.Dz0[9][b]); this.m.Ya(this.Dz0[9][b]); b = (byte)(b + 1); }  }  this.xc = paramzB0.L7; this.pe = paramzB0.ph0; this.Vd0 = false; Nq0(-1); }
/*    */   public void V90(throws paramthrows) { if (this.Ov == null && this.vA.bA0())
/*    */       dm();  this.LN.wI0(true); super.V90(paramthrows); }
/*    */   public final boolean bm() { byte b; vh0 vh0; if ((vh0 = km.a3) == null || (b = vh0.eA) == 3 || b == 4)
/* 18 */       return false;  Pw pw; if (((pw = km.wI0).Uc0 != null)) return false;  if (!this.Jx0) { float f1 = pw.dG() / 2.0F + 120.0F - 20.0F; float f2 = (this.LN.er0 + 15); float f3 = km.wI0.dG() / 2.0F + 20.0F + 120.0F; float f4 = (this.LN.er0 + 15); float f5 = this.oj0 - 32.0F, f6 = this.za; Color color = BQ; pw.fO.x = f1; pw.fO.y = f2; pw.O1.x = f3; pw.O1.y = f4; pw.me0.x = f5; pw.me0.y = f6; pw.z50.set(color); return true; }  return false; }
/*    */ 
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     this.LN.Tm(km.wI0.dG(), 240);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     Xg0(km.wI0.dG(), km.wI0.k1());
/*    */     if (!this.Jx0) {
/*    */       int i;
/*    */       if ((i = km.wI0.k1()) > 720) {
/*    */         i = (int)((i - 720) * 0.25D);
/*    */       } else {
/*    */         i = 0;
/*    */       } 
/*    */       this.LN.mM();
/*    */       this.LN.Tm(Math.max(600, Math.min(km.wI0.dG() / 2, 900)), Math.max(this.LN.HC, 150));
/*    */       this.LN.QJ0(et.kL0, 0, i);
/*    */     } else {
/*    */       this.LN.mM();
/*    */       Qj0 qj0;
/*    */       rY rY1;
/*    */       (qj0 = this.LN).Tm((rY1 = this.vA).xY + qj0.px + qj0.EA, rY1.HC + qj0.X20 + qj0.WU);
/*    */       int i = this.oj0;
/*    */       this.LN.ME(i, this.za);
/*    */     } 
/*    */     if (km.XU()) {
/*    */       if (this.tX == 0) {
/*    */         this.COM5.Tm(50, 100);
/*    */         this.COM5.js0(et.t9);
/*    */       } else {
/*    */         this.COM5.Tm(400, 475);
/*    */         this.COM5.js0(et.COM2);
/*    */       } 
/*    */     } else if (this.tX == 0) {
/*    */       this.COM5.mM();
/*    */       this.COM5.ME(this.LN.Xq() - 60, this.LN.yR() - 60);
/*    */       this.iX.mM();
/*    */     } else {
/*    */       this.COM5.mM();
/*    */       this.COM5.QJ0(et.F30, 0, -200);
/*    */     } 
/*    */     if (this.tX != 0) {
/*    */       Un[][] arrayOfUn;
/*    */       int i;
/*    */       byte b;
/*    */       for (i = (arrayOfUn = this.Dz0).length, b = 0; b < i; ) {
/*    */         Un[] arrayOfUn1;
/*    */         int j;
/*    */         byte b1;
/*    */         for (j = (arrayOfUn1 = arrayOfUn[b]).length, b1 = 0; b1 < j; ) {
/*    */           arrayOfUn1[b1].uh0(240, 80);
/*    */           arrayOfUn1[b1].RI(240, 80);
/*    */           b1++;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     this.vA.C70(et.Em);
/*    */   }
/*    */   
/*    */   public final boolean Eq() {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void SB0(int paramInt1, int paramInt2) {
/*    */     this.oj0 = paramInt1;
/*    */     this.za = paramInt2;
/*    */   }
/*    */   
/*    */   public gH0(byte paramByte1, int paramInt, Aq paramAq, String paramString, short[] paramArrayOfshort1, short[] paramArrayOfshort2, byte paramByte2, byte paramByte3, byte paramByte4, String... paramVarArgs) {
/*    */     super(paramByte1, paramAq);
/*    */     LinkedList linkedList;
/*    */     ArrayList arrayList;
/*    */     Ip ip;
/*    */     this.oj0 = -99999;
/*    */     this.za = -99999;
/*    */     this();
/*    */     this.Hr0 = linkedList;
/*    */     this();
/*    */     this.xd0 = arrayList;
/*    */     this.tX = 0;
/*    */     this.P80 = paramInt;
/*    */     this.y2 = paramByte2;
/*    */     this.xz = paramByte3;
/*    */     this.pJ = paramByte4;
/*    */     if (paramArrayOfshort1 == null)
/*    */       paramArrayOfshort1 = Fr; 
/*    */     if (paramArrayOfshort2 == null || paramArrayOfshort2.length < paramArrayOfshort1.length)
/*    */       paramArrayOfshort2 = new short[paramArrayOfshort1.length]; 
/*    */     (this.LN = new Qj0(this)).Zf0(true);
/*    */     rY rY1 = new rY();
/*    */     if (paramAq == Aq.xf0) {
/*    */       paramInt = 775;
/*    */     } else {
/*    */       paramInt = 0;
/*    */     } 
/*    */     this(this, paramInt);
/*    */     this.vA = rY1;
/*    */     rY1.Zf0(true);
/*    */     String[] arrayOfString2;
/*    */     byte b2;
/*    */     for (paramInt = (arrayOfString2 = paramString.split("\n\n", -1)).length, b2 = 0; b2 < paramInt; ) {
/*    */       String str;
/*    */       if (!(str = arrayOfString2[b2]).isEmpty() || paramAq.CO()) {
/*    */         if (str.endsWith("\n"))
/*    */           str = str.trim(); 
/*    */         this.Hr0.add(str);
/*    */       } 
/*    */       b2++;
/*    */     } 
/*    */     if (km.XU()) {
/*    */       Xu("messagebox-mobile");
/*    */     } else {
/*    */       Xu("messagebox-bubble");
/*    */     } 
/*    */     this.LN.Xu("npc-interaction-popup");
/*    */     if (paramAq == Aq.Ws) {
/*    */       this.vA.Xu("labelanimation-braille");
/*    */     } else {
/*    */       this.vA.Xu("labelanimation");
/*    */     } 
/*    */     this.Dz0 = new Un[10][];
/*    */     this();
/*    */     this.v80 = new Ip();
/*    */     this.dc = ip.mE0();
/*    */     this.m = this.v80.d7();
/*    */     this();
/*    */     this.iX = ym01;
/*    */     ym01.Xu("button-ok");
/*    */     ym0 ym01;
/*    */     (ym01 = new ym0()).tW(this::U70);
/*    */     this.dc.Ya(ym01);
/*    */     this.m.Ya(ym01);
/*    */     Un[] arrayOfUn1;
/*    */     (arrayOfUn1 = new Un[1])[0] = ym01;
/*    */     this.Dz0[0] = arrayOfUn1;
/*    */     this(Ml0.OH0(50));
/*    */     (ym01 = new ym0()).tW(() -> {
/*    */           if (!this.vA.bA0())
/*    */             return; 
/*    */           if (this.pe == Aq.QR) {
/*    */             C40((byte)0);
/*    */             return;
/*    */           } 
/*    */           C40((byte)1);
/*    */         });
/*    */     this(Ml0.OH0(51));
/*    */     this.H6 = ym02;
/*    */     ym0 ym02;
/*    */     (ym02 = new ym0()).tW(() -> {
/*    */           if (!this.vA.bA0())
/*    */             return; 
/*    */           if (this.pe == Aq.QR) {
/*    */             C40((byte)1);
/*    */             return;
/*    */           } 
/*    */           C40((byte)0);
/*    */         });
/*    */     this.dc.Mg(new JG0[] { ym01, ym02 });
/*    */     this.m.Mg(new JG0[] { ym01, ym02 });
/*    */     (this.COM5 = new rS()).zG0(2);
/*    */     byte b;
/*    */     Un[] arrayOfUn2;
/*    */     for ((arrayOfUn2 = new Un[2])[0] = ym01, (new Un[2])[1] = ym02, this.Dz0[1] = arrayOfUn2, this.Dz0[2] = new Un[0], this.Dz0[3] = new Un[0], this.Dz0[4] = new Un[0], this.Dz0[5] = new Un[paramArrayOfshort1.length + 1], b = 0; b < paramArrayOfshort1.length + 1; ) {
/*    */       this();
/*    */       this.Dz0[5][b] = ym02;
/*    */       if (b < paramArrayOfshort1.length) {
/*    */         if (paramAq == Aq.y50) {
/*    */           Fy0 fy0;
/*    */           this();
/*    */           UD0 uD0;
/*    */           if ((uD0 = On.v30().lpT3(paramArrayOfshort1[b])) == null) {
/*    */             fy0.s6("???");
/*    */           } else {
/*    */             fy0.s6(uD0.wp());
/*    */             fy0.zY().sm(um0.TK0().lb(uD0.Uf(), false, (byte)0));
/*    */             fy0.zY().Ii0(2.0F);
/*    */           } 
/*    */           if (km.Nr()) {
/*    */             fy0.Xu("button-monster-select");
/*    */             fy0.Tm(fy0.kG0(), 72);
/*    */           } 
/*    */           this.Dz0[5][b] = fy0;
/*    */         } else {
/*    */           LPT3 lPT3 = Of.b20().On0(paramArrayOfshort1[b]);
/*    */           if (paramAq == Aq.k60) {
/*    */             this.Dz0[5][b].s6(lPT3.getName() + " - $" + lPT3.ms());
/*    */           } else if (paramAq == Aq.D90) {
/*    */             this();
/*    */             StringBuilder stringBuilder;
/*    */             this.Dz0[5][b].s6((stringBuilder = new StringBuilder()).append(paramArrayOfshort2[b]).append("x ").append(lPT3.getName()).toString());
/*    */           } else {
/*    */             this.Dz0[5][b].s6(lPT3.getName());
/*    */           } 
/*    */         } 
/*    */       } else {
/*    */         this.Dz0[5][b].s6(Ml0.OH0(53));
/*    */         this.xd0.add(this.Dz0[5][b]);
/*    */       } 
/*    */       b1 = (byte)(b + 1);
/*    */       this.Dz0[5][b].tW(() -> C40(paramByte));
/*    */       this.dc.Ya(this.Dz0[5][b]);
/*    */       this.m.Ya(this.Dz0[5][b]);
/*    */       b = b1;
/*    */     } 
/*    */     for (this.Dz0[6] = new Un[paramArrayOfshort1.length + 1], b = 0; b < paramArrayOfshort1.length + 1; ) {
/*    */       this();
/*    */       this.Dz0[6][b] = ym02;
/*    */       if (b < paramArrayOfshort1.length) {
/*    */         if (paramAq == Aq.r7) {
/*    */           MZ mZ = fV.Gv0().PJ0(paramArrayOfshort1[b]);
/*    */         } else {
/*    */           ym02 = null;
/*    */         } 
/*    */         if (ym02 == null) {
/*    */           this.Dz0[6][b].s6(B40.df("??? - ").append(paramArrayOfshort1[b]).toString());
/*    */         } else {
/*    */           this.Dz0[6][b].s6(ym02.iL0());
/*    */         } 
/*    */       } else {
/*    */         this.Dz0[6][b].s6(Ml0.OH0(53));
/*    */         this.xd0.add(this.Dz0[6][b]);
/*    */       } 
/*    */       b1 = (byte)(b + 1);
/*    */       this.Dz0[6][b].tW(() -> C40(paramByte));
/*    */       this.dc.Ya(this.Dz0[6][b]);
/*    */       this.m.Ya(this.Dz0[6][b]);
/*    */       b = b1;
/*    */     } 
/*    */     Un[][] arrayOfUn;
/*    */     for (this.Dz0[7] = new Un[6], b = 0; b < (arrayOfUn2 = (arrayOfUn = this.Dz0)[7]).length; ) {
/*    */       ym0 ym03;
/*    */       this();
/*    */       arrayOfUn2[b] = ym03;
/*    */       if (b != 5) {
/*    */         short s = 0;
/*    */         switch (b + 1) {
/*    */           case 5:
/*    */             s = (short)(9999 - km.u4.IQ().Wn());
/*    */             break;
/*    */           case 4:
/*    */             s = 500;
/*    */             break;
/*    */           case 3:
/*    */             s = 250;
/*    */             break;
/*    */           case 2:
/*    */             s = 100;
/*    */             break;
/*    */           case 1:
/*    */             s = 50;
/*    */             break;
/*    */         } 
/*    */         this.Dz0[7][b].s6(NumberFormat.getInstance().format(s) + " COINS - $" + NumberFormat.getInstance().format((s * 5)));
/*    */       } else {
/*    */         this.Dz0[7][b].s6(Ml0.OH0(53));
/*    */         this.xd0.add(this.Dz0[7][b]);
/*    */       } 
/*    */       b1 = (byte)(b + 1);
/*    */       this.Dz0[7][b].tW(() -> C40(paramByte));
/*    */       this.dc.Ya(this.Dz0[7][b]);
/*    */       this.m.Ya(this.Dz0[7][b]);
/*    */       b = b1;
/*    */     } 
/*    */     for (b1[8] = new Un[paramArrayOfshort1.length + 1], b = 0; b < paramArrayOfshort1.length + 1; ) {
/*    */       ym0 ym03;
/*    */       this();
/*    */       this.Dz0[8][b] = ym03;
/*    */       if (b < paramArrayOfshort1.length) {
/*    */         int i;
/*    */         if ((i = paramAq.ordinal()) == 26 || i == 30) {
/*    */           UD0 uD0;
/*    */           if ((uD0 = On.v30().lpT3(paramArrayOfshort1[b])) == null) {
/*    */             this.Dz0[8][b].s6("???");
/*    */           } else {
/*    */             String str;
/*    */             Un un = this.Dz0[8][b];
/*    */             StringBuilder stringBuilder = (new StringBuilder()).append(uD0.wp());
/*    */             if (paramAq != Aq.vi0) {
/*    */               str = N.Gl0(B40.df(" - "), paramArrayOfshort2[b], " COINS");
/*    */             } else {
/*    */               str = "";
/*    */             } 
/*    */             un.s6(stringBuilder.append(str).toString());
/*    */           } 
/*    */         } 
/*    */       } else {
/*    */         this.Dz0[8][b].s6(Ml0.OH0(53));
/*    */         this.xd0.add(this.Dz0[8][b]);
/*    */       } 
/*    */       byte b3 = (byte)(b + 1);
/*    */       this.Dz0[8][b].tW(() -> C40(paramByte));
/*    */       this.dc.Ya(this.Dz0[8][b]);
/*    */       this.m.Ya(this.Dz0[8][b]);
/*    */       b = b3;
/*    */     } 
/*    */     String[] arrayOfString1;
/*    */     byte b1;
/*    */     for (arrayOfString1 = s10.JD().Nj(paramByte2, paramByte3, paramVarArgs), this.Dz0[9] = new Un[arrayOfString1.length], b1 = 0; b1 < (arrayOfUn2 = this.Dz0[9]).length; ) {
/*    */       ym0 ym03;
/*    */       this();
/*    */       arrayOfUn2[b1] = ym03;
/*    */       this.Dz0[9][b1].s6(arrayOfString1[b1]);
/*    */       byte b3 = (byte)(b1 + 1);
/*    */       this.Dz0[9][b1].tW(() -> C40(paramByte));
/*    */       this.dc.Ya(this.Dz0[9][b1]);
/*    */       this.m.Ya(this.Dz0[9][b1]);
/*    */       b1 = b3;
/*    */     } 
/*    */     this.v80.rK0(this.dc);
/*    */     this.v80.WN(this.m);
/*    */     this.COM5.Gz0(this.v80);
/*    */     this.LN.Zf0(true);
/*    */     this.LN.rK0(this.LN.d7().Ya(this.vA).Aq(140));
/*    */     this.LN.WN(this.LN.mE0().Ya(this.vA).ee0(this.LN.mE0()));
/*    */     this.LN.wI0(false);
/*    */     this.COM5.wI0(false);
/*    */     J8(this.LN);
/*    */     J8(this.COM5);
/*    */     CC0();
/*    */     if (paramAq == Aq.Md || paramAq == Aq.im0)
/*    */       A1.H().ac0(() -> UB0.Kg0.fN(()), 1000L); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */