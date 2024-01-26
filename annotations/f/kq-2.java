/*    */ package f;
/*  2 */ public final class kq extends JG0 implements r60 { public final String QE; public final Ip si0; public final Un y8; public final Un kv0; public OZ RO; public W1 Rs; public dQ NY; public dQ pM; public OZ s3; public W1 x2; public OZ Cl; public W1 Ka; public dQ[] uP; public ge0[] pc0; public final dQ P1; private boolean j9(int paramInt) { return (this.pc0[paramInt]).TG0.nm0(); } public final dQ iA; public final dQ wH0; public final dQ hN; public final dQ bk0; public final dQ Hm0; public final rh mt; public final rh T90; public final ge0 za; public final ge0 AK; public final ge0 jZ; public final ge0 sb0; public boolean kn; public boolean v20; public W1 Cm; public kq(String paramString) { dQ dQ1; dQ dQ2; int j; dQ dQ3; ArrayList<Uh0> arrayList; OZ oZ; boolean bool; this.kn = false; this.QE = paramString; Xu("duel-confirm-widget"); (this.si0 = new Ip()).GH0(); (new Ip()).Xu("duel-confirm-panel"); this(Ml0.Go(220, paramString)); (new dQ()).Xu("label-title"); this(Ml0.OH0(221)); (new dQ()).Xu("label-title"); this.RO = new OZ(); ky[] arrayOfKy = ky.jG; byte b4 = 4; int k; for (k = 0; k < b4; k++) { ky ky = arrayOfKy[k]; this.RO.i3(Ml0.OH0(ky.wm())); }  (this.Rs = new W1(this.RO)).Z30(0); this.Rs.D30(this::lJ0); (this.Hm0 = new dQ(Ml0.OH0(234))).Xu("label-title"); int[] arrayOfInt; if (IntStream.of(arrayOfInt = Stream.of(km.u4.s40(aq0.LI).zc0()).filter(Objects::nonNull).mapToInt(kq::WA0).toArray()).anyMatch(kq::UJ)) { j = 50; } else if ((j = (int)(Math.ceil(Math.abs(LF.JV(j) / 5)) * 5.0D)) < 5) { j = 5; }  (this.T90 = new rh(new zT(0, 50, j))).pR(5); (new rh(new zT(0, 50, j))).wB0(0, Ml0.OH0(61)); (new rh(new zT(0, 50, j))).Xu("valueadjuster"); (new rh(new zT(0, 50, j))).mM(); (this.wH0 = new dQ(Ml0.OH0(232))).Xu("label-title"); this(); this.AK = ge02; ge0 ge02; (ge02 = new ge0()).tW(this::ZN); (this.P1 = new dQ(Ml0.OH0(223))).Xu("label-title"); byte b2 = 15; this(new zT(0, 120, 60)); this.mt = rh1; rh rh1; (rh1 = new rh()).pR(b2); (new rh()).wB0(0, Ml0.OH0(61)); (new rh()).Xu("valueadjuster"); for (byte b3 = 0; b3 <= 8; b3++) { String str; rh rh2 = this.mt; int m = b3 * b2; if (b3 == 0) { str = Ml0.OH0(61); } else { str = Ml0.Go(226, String.valueOf(m)); }  rh2.wB0(m, str); }  (this.iA = new dQ(Ml0.OH0(228))).Xu("label-title"); this.za = new ge0(); (this.hN = new dQ(Ml0.OH0(231))).Xu("label-title"); this(); this.jZ = ge01; ge0 ge01; (ge01 = new ge0()).tW(this::AI0); (this.bk0 = new dQ(Ml0.OH0(233))).Xu("label-title"); this.sb0 = new ge0(); (this.NY = new dQ(Ml0.OH0(224))).Xu("label-title"); this.s3 = new OZ(); byte b = km.u4.vC().K70(); DO[] arrayOfDO; k = (arrayOfDO = DO.AUX).length; byte b5; for (b5 = 0; b5 < k; b5++) { DO dO; if ((dO = arrayOfDO[b5]).WE0() <= b) this.s3.i3(dO);  }  (this.x2 = new W1(this.s3)).COm6(DO.fm0); this.x2.D30(this::T6); (this.pM = new dQ(Ml0.OH0(225))).Xu("label-title"); (this.Cl = new OZ()).i3(Ml0.OH0(229)); this.Cl.i3(Ml0.OH0(230)); (this.Ka = new W1(this.Cl)).Z30(0); this.Ka.D30(this::p00); CC0[] arrayOfCC01; this.pc0 = new ge0[(arrayOfCC01 = CC0.Uq0).length]; this.uP = new dQ[arrayOfCC01.length]; CC0[] arrayOfCC02; for (byte b1 = 0; b1 < (arrayOfCC02 = CC0.Uq0).length; b1++) { ge0 ge03; dQ dQ4; CC0 cC0 = arrayOfCC02[b1]; this(); this.pc0[b1] = ge03; this.pc0[b1].tW(() -> this.kn = true); this(Ml0.OH0(cC0.hw())); this.uP[b1] = dQ4; this.uP[b1].Xu("label-title"); this.pc0[b1].Gq0(Ml0.OH0(cC0.O20())); this.pc0[b1].Pb0(100); this.uP[b1].Gq0(Ml0.OH0(cC0.O20())); this.uP[b1].Pb0(100); }  this(Ml0.OH0(227)); (new dQ()).Xu("label-title"); this(); (new ArrayList<>()).add(new Uh0(null)); g2 g2 = km.u4.Um(); for (b5 = 0; b5 < super.Gc(km.u4.IQ().Sy0()); b5 = (byte)(b5 + 1)) { super super; if ((super = g2.LPT5(b5)).com6()) { Uh0 uh0; this(super); arrayList.add(uh0); }  }  this(arrayList); (this.Cm = new W1(oZ)).Xu("combobox"); this.Cm.Z30(0); W1 w12 = this.Cm; if (arrayList.size() > 1) { bool = true; } else { bool = false; }  w12.sk0(bool); ZN(); this(Ml0.OH0(122)); this.y8 = un; Un un; (un = new Un()).tW(() -> { ra0(); Com1(); }); this(Ml0.OH0(53)); this.kv0 = un; (un = new Un()).tW(this::ra0); W1 w11 = this.Cm; arrayOfJG02[0] = this.hN; arrayOfJG02[1] = this.jZ; arrayOfJG02[2] = this.bk0; JG0[] arrayOfJG02; (arrayOfJG02 = new JG0[4])[3] = this.sb0; et et; U90 u902 = this.si0.d7().ee0(this.si0.mE0().Mg(new JG0[] { dQ2 })).ee0(this.si0.mE0().Mg(new JG0[] { dQ1, this.Rs })).ee0(this.si0.mE0().Mg(new JG0[] { this.Hm0, this.T90 })).ee0(this.si0.mE0().Ya(dQ3).lW(et = et.Lp, w11)).ee0(this.si0.mE0().Mg(new JG0[] { this.wH0, this.AK })).ee0(this.si0.mE0().Mg(new JG0[] { this.NY, this.x2 })).ee0(this.si0.mE0().Mg(new JG0[] { this.P1, this.mt })).ee0(this.si0.mE0().Mg(new JG0[4])).ee0(this.si0.mE0().Mg(new JG0[] { this.iA, this.za })); arrayOfJG01[0] = this.hN; arrayOfJG01[1] = this.jZ; arrayOfJG01[2] = this.bk0; JG0[] arrayOfJG01; (arrayOfJG01 = new JG0[4])[3] = this.sb0; u902.ee0(this.si0.mE0().Mg(new JG0[] { this.pM, this.Ka })); U90 u901; (u901 = this.si0.mE0().ee0(this.si0.d7().Ya(dQ2)).ee0(this.si0.d7().Ya(dQ1).Ya(this.Rs)).ee0(this.si0.d7().Mg(new JG0[] { this.Hm0, this.T90 })).ee0(this.si0.d7().Ya(dQ3).lW(et, this.Cm)).ee0(this.si0.d7().Mg(new JG0[] { this.wH0, this.AK })).ee0(this.si0.d7().Ya(this.NY).Ya(this.x2)).ee0(this.si0.d7().Ya(this.P1).Ya(this.mt)).ee0(this.si0.d7().Mg(new JG0[4])).ee0(this.si0.d7().Mg(new JG0[] { this.iA, this.za }))).ee0(this.si0.d7().Ya(this.pM).Ya(this.Ka)); ge0[] arrayOfGe0; for (int i = 0; i < (arrayOfGe0 = this.pc0).length; i++) { int m; if ((m = i + 2) <= arrayOfGe0.length) { dQ[] arrayOfDQ; arrayOfJG0[0] = (arrayOfDQ = this.uP)[i]; arrayOfJG0[1] = arrayOfGe01[i]; int n; arrayOfJG0[2] = arrayOfDQ[n = i + 1]; JG0[] arrayOfJG0; ge0[] arrayOfGe01; (arrayOfJG0 = new JG0[4])[3] = (arrayOfGe01 = this.pc0)[n]; u902.ee0(this.si0.mE0().Mg(new JG0[4])); u901.ee0(this.si0.d7().Mg(new JG0[] { this.uP[i], this.pc0[i] }).Aq(6).Mg(new JG0[] { this.uP[n], this.pc0[n] })); i = m; continue; }  u902.ee0(this.si0.mE0().Mg(new JG0[] { this.uP[i], this.pc0[i] })); u901.ee0(this.si0.d7().Mg(new JG0[] { this.uP[i], this.pc0[i] }).Em0()); }  u902.ee0(this.si0.d7().Mg(new JG0[] { this.y8, this.kv0 })).Em0(); u901.ee0(this.si0.mE0().Ya(this.y8).Ya(this.kv0)); this.si0.WN(u902); this.si0.rK0(u901); J8(this.si0); } private void p00() { ge0[] arrayOfGe0; W1 w1; if ((w1 = this.Ka).dP && w1.Wa0
/*  3 */       .go == 1)
/*  4 */     { dQ[] arrayOfDQ; int j; byte b; for (j = (arrayOfDQ = this.uP).length, b = 0; b < j; ) { arrayOfDQ[b].wI0(true); b++; }  for (int i = (arrayOfGe0 = this.pc0).length; j < i; ) { this[j].wI0(true); j++; }  } else { dQ[] arrayOfDQ; int j; byte b; for (j = (arrayOfDQ = ((kq)super).uP).length, b = 0; b < j; ) { arrayOfDQ[b].wI0(false); b++; }  for (int i = (arrayOfGe0 = ((kq)super).pc0).length; j < i; ) { this[j].wI0(false); j++; }  }  } private void T6() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield x2 : Lf/W1;
/*    */     //   4: invokevirtual WW : ()Ljava/lang/Object;
/*    */     //   7: getstatic f/DO.JO : Lf/DO;
/*    */     //   10: if_acmpne -> 136
/*    */     //   13: aload_0
/*    */     //   14: dup
/*    */     //   15: getfield jZ : Lf/ge0;
/*    */     //   18: iconst_0
/*    */     //   19: invokevirtual sk0 : (Z)V
/*    */     //   22: getfield jZ : Lf/ge0;
/*    */     //   25: iconst_1
/*    */     //   26: istore_1
/*    */     //   27: getfield TG0 : Lf/protected;
/*    */     //   30: iload_1
/*    */     //   31: invokevirtual Fx0 : (Z)V
/*    */     //   34: iconst_0
/*    */     //   35: istore_1
/*    */     //   36: iload_1
/*    */     //   37: getstatic f/CC0.Uq0 : [Lf/CC0;
/*    */     //   40: dup
/*    */     //   41: astore_2
/*    */     //   42: arraylength
/*    */     //   43: if_icmpge -> 187
/*    */     //   46: aload_2
/*    */     //   47: iload_1
/*    */     //   48: aaload
/*    */     //   49: dup
/*    */     //   50: astore_2
/*    */     //   51: getstatic f/CC0.T2 : Lf/CC0;
/*    */     //   54: if_acmpeq -> 109
/*    */     //   57: aload_2
/*    */     //   58: getstatic f/CC0.b50 : Lf/CC0;
/*    */     //   61: if_acmpne -> 67
/*    */     //   64: goto -> 109
/*    */     //   67: aload_2
/*    */     //   68: getstatic f/CC0.pq : Lf/CC0;
/*    */     //   71: if_acmpeq -> 81
/*    */     //   74: aload_2
/*    */     //   75: getstatic f/CC0.X2 : Lf/CC0;
/*    */     //   78: if_acmpne -> 130
/*    */     //   81: aload_0
/*    */     //   82: dup
/*    */     //   83: getfield pc0 : [Lf/ge0;
/*    */     //   86: iload_1
/*    */     //   87: aaload
/*    */     //   88: iconst_0
/*    */     //   89: invokevirtual sk0 : (Z)V
/*    */     //   92: getfield pc0 : [Lf/ge0;
/*    */     //   95: iload_1
/*    */     //   96: aaload
/*    */     //   97: iconst_0
/*    */     //   98: istore_2
/*    */     //   99: getfield TG0 : Lf/protected;
/*    */     //   102: iload_2
/*    */     //   103: invokevirtual Fx0 : (Z)V
/*    */     //   106: goto -> 130
/*    */     //   109: aload_0
/*    */     //   110: dup
/*    */     //   111: getfield pc0 : [Lf/ge0;
/*    */     //   114: iload_1
/*    */     //   115: aaload
/*    */     //   116: iconst_0
/*    */     //   117: invokevirtual sk0 : (Z)V
/*    */     //   120: getfield pc0 : [Lf/ge0;
/*    */     //   123: iload_1
/*    */     //   124: aaload
/*    */     //   125: iconst_1
/*    */     //   126: istore_2
/*    */     //   127: goto -> 99
/*    */     //   130: iinc #1, 1
/*    */     //   133: goto -> 36
/*    */     //   136: aload_0
/*    */     //   137: dup
/*    */     //   138: dup
/*    */     //   139: getfield jZ : Lf/ge0;
/*    */     //   142: iconst_1
/*    */     //   143: invokevirtual sk0 : (Z)V
/*    */     //   146: getfield jZ : Lf/ge0;
/*    */     //   149: astore_1
/*    */     //   150: getfield v20 : Z
/*    */     //   153: aload_1
/*    */     //   154: getfield TG0 : Lf/protected;
/*    */     //   157: swap
/*    */     //   158: invokevirtual Fx0 : (Z)V
/*    */     //   161: iconst_0
/*    */     //   162: istore_1
/*    */     //   163: iload_1
/*    */     //   164: getstatic f/CC0.Uq0 : [Lf/CC0;
/*    */     //   167: arraylength
/*    */     //   168: if_icmpge -> 187
/*    */     //   171: aload_0
/*    */     //   172: getfield pc0 : [Lf/ge0;
/*    */     //   175: iload_1
/*    */     //   176: aaload
/*    */     //   177: iconst_1
/*    */     //   178: invokevirtual sk0 : (Z)V
/*    */     //   181: iinc #1, 1
/*    */     //   184: goto -> 163
/*    */     //   187: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 31
/*    */     //   #3	-> 37
/*    */     //   #4	-> 99
/*    */     //   #5	-> 103
/*    */     //   #6	-> 111
/*    */     //   #7	-> 154
/*    */     //   #8	-> 158
/*  4 */     //   #9	-> 164 } private void AI0() { this.v20 = this.jZ.TG0.nm0(); } public static int WA0(j40 paramj40) { return paramj40.Zs.od; } private void lJ0() { W1 w1; if (!(w1 = this.x2).dP) if (this.Rs.Wa0.go != 0) { w1
/*  5 */           .COm6(DO.u); } else { w1.COm6(DO.fm0); }   } public final void ZN() { if (this.kn) return;  boolean bool = this.AK.TG0.nm0(); this.P1.wI0(bool); this.mt.wI0(bool); this.NY.wI0(bool); this.x2.wI0(bool); this.pM.wI0(bool); this.Ka.wI0(bool); W1 w1; if ((w1 = this.Ka).dP && w1.Wa0
/*  6 */       .go == 1)
/*  7 */     { dQ[] arrayOfDQ; int i; byte b; for (i = (arrayOfDQ = this.uP).length, b = 0; b < i; ) { arrayOfDQ[b].wI0(bool); b++; }  ge0[] arrayOfGe0; for (i = (arrayOfGe0 = this.pc0).length, b = 0; b < i; ) { arrayOfGe0[b].wI0(bool); b++; }  } else { dQ[] arrayOfDQ; int i; byte b; for (i = (arrayOfDQ = this.uP).length, b = 0; b < i; ) { arrayOfDQ[b].wI0(false); b++; }  ge0[] arrayOfGe0; for (i = (arrayOfGe0 = this.pc0).length, b = 0; b < i; ) { arrayOfGe0[b].wI0(false); b++; }  }  this.iA.wI0(bool); this.za.wI0(bool); this.hN.wI0(bool); this.jZ.wI0(bool); this.jZ
/*  8 */       .TG0
/*  9 */       .Fx0(bool);
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.v20 = this.jZ.TG0.nm0(); this.bk0.wI0(bool); this.sb0.wI0(bool); this.sb0
/* 14 */       .TG0
/* 15 */       .Fx0(bool); if (!bool) { bool = false; ge0[] arrayOfGe0; while (bool < (
/* 16 */         arrayOfGe0 = this.pc0).length) { (arrayOfGe0[bool])
/* 17 */           .TG0
/* 18 */           .Fx0(false); bool++; }  } else { bool = false; ge0[] arrayOfGe0; while (bool < (
/* 19 */         arrayOfGe0 = this.pc0).length)
/* 20 */       { boolean bool1 = (CC0.Jo0((byte)bool)).Uy0;
/* 21 */         (arrayOfGe0[bool]).TG0
/* 22 */           .Fx0(bool1); bool++; }  }  } public final void Com1() { ky ky = ky.jG[this.Rs.Wa0.go]; boolean bool1 = false, bool2 = false, bool3 = false; byte b2 = 0; byte b3 = (byte)this.T90.T8; DO dO = DO.u; byte b4 = 0; if (this.AK.TG0.nm0()) { bool1 = this.za.TG0.nm0(); b2 = (byte)this.mt.T8; dO = (DO)this.x2.WW(); bool2 = this.jZ.TG0.nm0(); bool3 = this.sb0.TG0.nm0(); CC0[] arrayOfCC0; if ((arrayOfCC0 = (CC0[])IntStream.range(0, this.pc0.length).filter(this::j9).mapToObj(kq::i60).toArray(kq::uq)).length < 1) { b4 = 0; } else { byte b; int i; byte b5; for (b = 0, i = b4.length, b5 = 0; b5 < i; ) { b = (byte)(b | (byte)(1 << (b4[b5]).jt0)); b5++; }  b4 = b; }  }  R8 r8 = km.u4; String str = this.QE;
/* 23 */     byte b1 = ((Uh0)this.Cm.WW()).aj0;
/* 24 */     r8.e20
/* 25 */       .W3(new Gf0(str, ky, bool1, bool2, bool3, b2, b3, dO, b4, b1)); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     this.si0.mM();
/*    */     mM();
/*    */     qB0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     VA0.c90(this.y8);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       int i;
/*    */       if (h1.J20(i = paramoa0.GG0, BM.ni)) {
/*    */         VA0.c90(this.y8);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.N70)) {
/*    */         VA0.c90(this.kv0);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.bC)) {
/*    */         if (this.y8.p3()) {
/*    */           hm.Fz0(this.y8.TG0.oh0);
/*    */         } else if (this.kv0.p3()) {
/*    */           hm.Fz0(this.kv0.TG0.oh0);
/*    */         } 
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.lc)) {
/*    */         hm.Fz0(this.kv0.TG0.oh0);
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */