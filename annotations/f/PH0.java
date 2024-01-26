/*  1 */ package f;public final class PH0 extends Qa0 implements r60 { public static final DecimalFormat JV = new DecimalFormat("#0.0"); public final rh K00; public Un Kh; public final Y bH; public final j40 uI0; public LPT3 Hr0; public Un sn; public Un CN; public dQ bI0; public Ip t1; public boolean Gs; public Un[][] si; public int COM2; public int Ct; public byte xH0; public final Bf xk; public PH0(Bf paramBf, int paramInt, j40 paramj40, byte paramByte) { super(false, false); U90 u90; G9 g9; Ns0 ns0; rh rh1; boolean bool; this.Gs = false; this.xk = paramBf; Y y = km.u4.Ak().u60(paramInt); this.uI0 = paramj40; this.xH0 = paramByte; TG0(this::close); this(); if (paramj40 != null) { g9.zf(paramj40); g9.hC(false); g9.Gq0(rG0.M5(paramj40)); }  this(); this(); this.K00 = rh1; if (y == null) { close(); js.N2().ln0(Ml0.OH0(6003)); return; }  this.Hr0 = y.Ng(); int i; if ((i = W6()) < 1) { close(); js.N2().ln0(Ml0.OH0(6005)); return; }  short s = y.oD0(); if (this.Hr0.E10() > 0 && km.u4.vC().ry0(km.u4.IQ().S00()) != 100) { bool = true; } else { bool = false; }  if ((i == 1 || s == 1) && !bool) { rh1.l4(1); wg(true); return; }  if (km.XU()) { Xu("multi-use-item"); rh1.Xu("mobile-valueadjuster-50"); } else { Xu("seed-plant-dialog"); Lo(y.tH0()); }  ns0.Tm0(y); rh1.fn(Math.min(s, i)); this.bI0 = new dQ(OF()); rh1.Te0(() -> this.bI0.E1(OF())); this.t1 = new Ip(); this(Ml0.OH0(1410)); this.sn = un1; Un un1; (un1 = new Un()).tW(() -> wg(false)); this(Ml0.OH0(53)); this.CN = un1; (un1 = new Un()).tW(this::close); this(Ml0.OH0(8118)); this.Kh = un1; (un1 = new Un()).tW(() -> this.K00.l4(W6())); arrayOfUn[0] = rh1.mc0; Un un2 = this.sn; arrayOfUn[1] = un2; Un un3 = this.CN; Un[] arrayOfUn; (arrayOfUn = new Un[3])[2] = un3; (this.si = new Un[3][3])[0] = arrayOfUn; (arrayOfUn = new Un[3])[0] = rh1.Xx; (new Un[3])[1] = un2; (new Un[3])[2] = un3; (new Un[3][3])[1] = arrayOfUn; (arrayOfUn = new Un[3])[0] = this.Kh; (new Un[3])[1] = un2; (new Un[3])[2] = un3; (new Un[3][3])[2] = arrayOfUn; this.COM2 = 1; this.Ct = 1; if (paramj40 != null) { dQ dQ1; arrayOfString[0] = y.tH0(); String[] arrayOfString; (arrayOfString = new String[2])[1] = paramj40.m(); this(Ml0.sB(8045, arrayOfString)); u90 = ip.d7().Aq(15); u90 = R10.aj0(this.t1.mE0(), new JG0[] { g9, ns0 }, u90, 15);
/*    */       
/*  3 */       u90 = R10.aj0(this.t1.mE0(), new JG0[] { dQ1 }, u90, 15);
/*    */       
/*  5 */       u90 = R10.aj0(this.t1.mE0(), new JG0[] { rh1, this.Kh }, u90, 15);
/*    */       
/*    */       Ip ip;
/*  8 */       (ip = this.t1).WN(R10.aj0(this.t1.mE0(), new JG0[] { this.bI0 }, u90, 15).ee0(this.t1.d7().Mg(new JG0[] { this.sn, this.CN })).Em0()); this.t1.rK0(this.t1.mE0().ee0(this.t1.d7().Em0().Ya(g9).Em0().Ya(ns0).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { dQ1 }).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { rh1, this.Kh }).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { this.bI0 }).Em0()).ee0(this.t1.mE0().Ya(this.sn).Ya(this.CN))); } else { dQ dQ1; this(Ml0.Go(8046, u90.tH0())); U90 u901 = ip.d7().Aq(15);
/*  9 */       u901 = R10.aj0(this.t1.mE0(), new JG0[] { ns0 }, u901, 15);
/*    */       
/* 11 */       u901 = R10.aj0(this.t1.mE0(), new JG0[] { dQ1 }, u901, 15);
/*    */       
/* 13 */       u901 = R10.aj0(this.t1.mE0(), new JG0[] { rh1, this.Kh }, u901, 15);
/*    */       
/*    */       Ip ip;
/* 16 */       (ip = this.t1).WN(R10.aj0(this.t1.mE0(), new JG0[] { this.bI0 }, u901, 15).ee0(this.t1.d7().Mg(new JG0[] { this.sn, this.CN })).Em0()); this.t1.rK0(this.t1.mE0().ee0(this.t1.d7().Em0().Ya(ns0).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { dQ1 }).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { rh1, this.Kh }).Em0()).ee0(this.t1.d7().Em0().Mg(new JG0[] { this.bI0 }).Em0()).ee0(this.t1.mE0().Ya(this.sn).Ya(this.CN))); }  J8(this.t1); this.Gs = true; VA0.c90(sD()); } public final boolean i2(oa0 paramoa0) { int i; if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { int j; if (h1.J20(j = paramoa0.GG0, BM.Oq)) { j = this.COM2; Un arrayOfUn[], arrayOfUn1[][]; if ((i = this.Ct - 1) < 0 || i >= (arrayOfUn1 = this.si).length || j < 0 || j >= (arrayOfUn = arrayOfUn1[i]).length) {  } else {  }  if (arrayOfUn[j] != null) { this.Ct = i; this.COM2 = j; VA0.c90(sD()); }  return true; }  if (h1.J20(j, BM.M8)) { j = this.COM2; Un arrayOfUn1[][], arrayOfUn[]; if ((i = this.Ct + 1) < 0 || i >= (arrayOfUn1 = this.si).length || j < 0 || j >= (arrayOfUn = arrayOfUn1[i]).length) {  } else {  }  if (arrayOfUn[j] != null) { this.Ct = i; this.COM2 = j; VA0.c90(sD()); }  return true; }  if (h1.J20(j, BM.ni)) { j = this.COM2 - 1; Un arrayOfUn1[][], arrayOfUn[]; if ((i = this.Ct) < 0 || i >= (arrayOfUn1 = this.si).length || j < 0 || j >= (arrayOfUn = arrayOfUn1[i]).length) {  } else {  }  if (arrayOfUn[j] != null) { this.Ct = i; this.COM2 = j; VA0.c90(sD()); }  return true; }  if (h1.J20(j, BM.N70)) { j = this.COM2 + 1; Un arrayOfUn[], arrayOfUn1[][]; if ((i = this.Ct) < 0 || i >= (arrayOfUn1 = this.si).length || j < 0 || j >= (arrayOfUn = arrayOfUn1[i]).length) {  } else {  }  if (arrayOfUn[j] != null) { this.Ct = i; this.COM2 = j; VA0.c90(sD()); }  return true; }
/* 17 */        if (h1.J20(j, BM.bC)) { if (sD() != null)
/*    */         {
/*    */           
/* 20 */           hm.Fz0((sD()).TG0.oh0); }  return true; }
/* 21 */        if (h1.J20(j, BM.lc)) { close(); return true; }  }  return super.i2(i); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     Ip ip;
/*    */     if ((ip = this.t1) == null) {
/*    */       super.d40();
/*    */       return;
/*    */     } 
/*    */     VA0.c90(ip);
/*    */     if (km.XU()) {
/*    */       QI();
/*    */       this.t1.mM();
/*    */       this.t1.js0(et.Wi0);
/*    */     } else {
/*    */       super.d40();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void close() {
/*    */     pA pA;
/*    */     PH0 pH0;
/*    */     if ((pH0 = (pA = pA.Dg0).qn0) != null) {
/*    */       pH0.ra0();
/*    */       pA.qn0 = null;
/*    */     } 
/*    */     Bf bf;
/*    */     if ((bf = this.xk) != null)
/*    */       kJ(); 
/*    */   }
/*    */   
/*    */   public final Un sD() {
/*    */     int j = this.COM2;
/*    */     Un arrayOfUn[], arrayOfUn1[][];
/*    */     int i;
/*    */     if ((i = this.Ct) < 0 || i >= (arrayOfUn1 = this.si).length || j < 0 || j >= (arrayOfUn = this[i]).length) {
/*    */       arrayOfUn = null;
/*    */       return (Un)this;
/*    */     } 
/*    */     Un un = this[j];
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final void wg(boolean paramBoolean) {
/*    */     R8 r8 = km.u4;
/*    */     short s2 = this.bH.Lh.p1;
/*    */     int i = this.bH.Lh.Wy, j = 0;
/*    */     r8 = km.u4;
/*    */     s2 = this.bH.Lh.p1;
/*    */     i = this.bH.Lh.Wy;
/*    */     j = ((Qh0)r8).Jg;
/*    */     j40 j401;
/*    */     int k = (((j401 = this.uI0) == null) ? this.K00 : this.K00).T8;
/*    */     short s1 = (short)k;
/*    */     byte b = this.xH0;
/*    */     r8.ps0(s2, i, j, s1, b, (byte)0, paramBoolean);
/*    */     close();
/*    */   }
/*    */   
/*    */   public final int W6() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield bH : Lf/Y;
/*    */     //   4: getfield Bp0 : Lf/LPT3;
/*    */     //   7: dup
/*    */     //   8: dup
/*    */     //   9: astore_1
/*    */     //   10: iconst_0
/*    */     //   11: istore_2
/*    */     //   12: getfield bj0 : S
/*    */     //   15: invokestatic l90 : (S)S
/*    */     //   18: istore_3
/*    */     //   19: getfield el : Lf/hR;
/*    */     //   22: dup
/*    */     //   23: astore #4
/*    */     //   25: aload_1
/*    */     //   26: dup
/*    */     //   27: dup
/*    */     //   28: getfield Kp : B
/*    */     //   31: istore #5
/*    */     //   33: getfield lh : I
/*    */     //   36: istore #6
/*    */     //   38: getfield C90 : B
/*    */     //   41: istore #7
/*    */     //   43: ifnull -> 144
/*    */     //   46: aload_1
/*    */     //   47: aload_0
/*    */     //   48: getfield uI0 : Lf/j40;
/*    */     //   51: getfield Zs : Lf/Q90;
/*    */     //   54: iconst_m1
/*    */     //   55: invokevirtual Ue : (I)S
/*    */     //   58: istore_1
/*    */     //   59: getfield lA : S
/*    */     //   62: dup
/*    */     //   63: istore_3
/*    */     //   64: aload_0
/*    */     //   65: getfield uI0 : Lf/j40;
/*    */     //   68: getfield Zs : Lf/Q90;
/*    */     //   71: aload #4
/*    */     //   73: invokevirtual Uu0 : (Lf/hR;)S
/*    */     //   76: istore_0
/*    */     //   77: ifle -> 123
/*    */     //   80: sipush #510
/*    */     //   83: iload_1
/*    */     //   84: isub
/*    */     //   85: i2d
/*    */     //   86: iload_3
/*    */     //   87: i2d
/*    */     //   88: dup2
/*    */     //   89: dstore_3
/*    */     //   90: ddiv
/*    */     //   91: invokestatic ceil : (D)D
/*    */     //   94: d2i
/*    */     //   95: dup
/*    */     //   96: istore_1
/*    */     //   97: ifle -> 102
/*    */     //   100: iload_1
/*    */     //   101: istore_2
/*    */     //   102: iload_2
/*    */     //   103: sipush #252
/*    */     //   106: iload_0
/*    */     //   107: isub
/*    */     //   108: i2d
/*    */     //   109: dload_3
/*    */     //   110: ddiv
/*    */     //   111: invokestatic ceil : (D)D
/*    */     //   114: d2i
/*    */     //   115: dup
/*    */     //   116: istore_0
/*    */     //   117: if_icmple -> 722
/*    */     //   120: goto -> 139
/*    */     //   123: iload_0
/*    */     //   124: i2d
/*    */     //   125: iload_3
/*    */     //   126: iconst_m1
/*    */     //   127: imul
/*    */     //   128: i2d
/*    */     //   129: ddiv
/*    */     //   130: invokestatic ceil : (D)D
/*    */     //   133: d2i
/*    */     //   134: dup
/*    */     //   135: istore_0
/*    */     //   136: ifle -> 722
/*    */     //   139: iload_0
/*    */     //   140: istore_2
/*    */     //   141: goto -> 722
/*    */     //   144: iload #5
/*    */     //   146: ifeq -> 185
/*    */     //   149: aload_0
/*    */     //   150: getfield uI0 : Lf/j40;
/*    */     //   153: getfield Zs : Lf/Q90;
/*    */     //   156: getfield od : B
/*    */     //   159: dup
/*    */     //   160: istore_0
/*    */     //   161: bipush #100
/*    */     //   163: if_icmplt -> 168
/*    */     //   166: iconst_1
/*    */     //   167: ireturn
/*    */     //   168: bipush #100
/*    */     //   170: iload_0
/*    */     //   171: isub
/*    */     //   172: i2d
/*    */     //   173: iload #5
/*    */     //   175: i2d
/*    */     //   176: ddiv
/*    */     //   177: invokestatic ceil : (D)D
/*    */     //   180: d2i
/*    */     //   181: istore_2
/*    */     //   182: goto -> 722
/*    */     //   185: iload #6
/*    */     //   187: ifeq -> 256
/*    */     //   190: aload_0
/*    */     //   191: getstatic f/km.u4 : Lf/R8;
/*    */     //   194: dup
/*    */     //   195: astore_1
/*    */     //   196: getfield fF0 : Lf/BF;
/*    */     //   199: aload_1
/*    */     //   200: getfield Lz : Lf/fH0;
/*    */     //   203: getfield bv : B
/*    */     //   206: invokevirtual ry0 : (B)B
/*    */     //   209: iconst_0
/*    */     //   210: bipush #99
/*    */     //   212: invokestatic Uw0 : (III)I
/*    */     //   215: i2b
/*    */     //   216: istore_1
/*    */     //   217: getfield uI0 : Lf/j40;
/*    */     //   220: getfield VP : Lf/UD0;
/*    */     //   223: getfield eb : Lf/Es;
/*    */     //   226: iload_1
/*    */     //   227: iconst_1
/*    */     //   228: iadd
/*    */     //   229: invokevirtual GJ : (I)I
/*    */     //   232: aload_0
/*    */     //   233: getfield uI0 : Lf/j40;
/*    */     //   236: getfield Zs : Lf/Q90;
/*    */     //   239: getfield pA : I
/*    */     //   242: isub
/*    */     //   243: i2d
/*    */     //   244: iload #6
/*    */     //   246: i2d
/*    */     //   247: ddiv
/*    */     //   248: invokestatic ceil : (D)D
/*    */     //   251: d2i
/*    */     //   252: istore_2
/*    */     //   253: goto -> 722
/*    */     //   256: iload_3
/*    */     //   257: sipush #1194
/*    */     //   260: if_icmpne -> 289
/*    */     //   263: getstatic f/km.u4 : Lf/R8;
/*    */     //   266: getfield Lz : Lf/fH0;
/*    */     //   269: getfield wm0 : B
/*    */     //   272: dup
/*    */     //   273: istore_0
/*    */     //   274: bipush #8
/*    */     //   276: if_icmplt -> 281
/*    */     //   279: iconst_0
/*    */     //   280: ireturn
/*    */     //   281: bipush #8
/*    */     //   283: iload_0
/*    */     //   284: isub
/*    */     //   285: istore_2
/*    */     //   286: goto -> 722
/*    */     //   289: iload_3
/*    */     //   290: sipush #1120
/*    */     //   293: if_icmpne -> 324
/*    */     //   296: getstatic f/km.u4 : Lf/R8;
/*    */     //   299: getfield Lz : Lf/fH0;
/*    */     //   302: getfield m4 : B
/*    */     //   305: dup
/*    */     //   306: istore_0
/*    */     //   307: getstatic f/Bz.Np0 : I
/*    */     //   310: dup
/*    */     //   311: istore_1
/*    */     //   312: if_icmplt -> 317
/*    */     //   315: iconst_0
/*    */     //   316: ireturn
/*    */     //   317: iload_1
/*    */     //   318: iload_0
/*    */     //   319: isub
/*    */     //   320: istore_2
/*    */     //   321: goto -> 722
/*    */     //   324: aload_1
/*    */     //   325: getfield Pa0 : S
/*    */     //   328: dup
/*    */     //   329: istore_3
/*    */     //   330: ifgt -> 627
/*    */     //   333: aload_1
/*    */     //   334: getfield xp0 : B
/*    */     //   337: ifeq -> 343
/*    */     //   340: goto -> 627
/*    */     //   343: iload #7
/*    */     //   345: ifle -> 559
/*    */     //   348: aload_1
/*    */     //   349: iconst_0
/*    */     //   350: invokevirtual default : (Z)Lf/dv;
/*    */     //   353: getstatic f/dv.hV : Lf/dv;
/*    */     //   356: if_acmpne -> 452
/*    */     //   359: aload_0
/*    */     //   360: getfield uI0 : Lf/j40;
/*    */     //   363: getfield Zs : Lf/Q90;
/*    */     //   366: getfield En0 : [S
/*    */     //   369: astore_1
/*    */     //   370: iconst_0
/*    */     //   371: istore_3
/*    */     //   372: iload_3
/*    */     //   373: aload_1
/*    */     //   374: arraylength
/*    */     //   375: if_icmpge -> 722
/*    */     //   378: aload_0
/*    */     //   379: aload_1
/*    */     //   380: iload_3
/*    */     //   381: saload
/*    */     //   382: invokestatic cw : ()Lf/yk0;
/*    */     //   385: swap
/*    */     //   386: invokevirtual mP : (S)Lf/WD;
/*    */     //   389: astore #4
/*    */     //   391: getfield uI0 : Lf/j40;
/*    */     //   394: getfield Zs : Lf/Q90;
/*    */     //   397: iload_3
/*    */     //   398: aload #4
/*    */     //   400: getfield nul : B
/*    */     //   403: invokevirtual Vk0 : (IB)B
/*    */     //   406: aload_0
/*    */     //   407: getfield uI0 : Lf/j40;
/*    */     //   410: getfield Zs : Lf/Q90;
/*    */     //   413: getfield rI0 : [B
/*    */     //   416: iload_3
/*    */     //   417: baload
/*    */     //   418: isub
/*    */     //   419: i2d
/*    */     //   420: iload #7
/*    */     //   422: i2d
/*    */     //   423: ddiv
/*    */     //   424: invokestatic ceil : (D)D
/*    */     //   427: d2i
/*    */     //   428: iload_2
/*    */     //   429: sipush #9999
/*    */     //   432: invokestatic Uw0 : (III)I
/*    */     //   435: i2s
/*    */     //   436: dup
/*    */     //   437: istore #4
/*    */     //   439: iload_2
/*    */     //   440: if_icmple -> 446
/*    */     //   443: iload #4
/*    */     //   445: istore_2
/*    */     //   446: iinc #3, 1
/*    */     //   449: goto -> 372
/*    */     //   452: aload_1
/*    */     //   453: iconst_0
/*    */     //   454: invokevirtual default : (Z)Lf/dv;
/*    */     //   457: getstatic f/dv.Vx0 : Lf/dv;
/*    */     //   460: if_acmpne -> 554
/*    */     //   463: aload_0
/*    */     //   464: dup
/*    */     //   465: dup
/*    */     //   466: getfield uI0 : Lf/j40;
/*    */     //   469: getfield Zs : Lf/Q90;
/*    */     //   472: astore_1
/*    */     //   473: getfield xH0 : B
/*    */     //   476: aload_1
/*    */     //   477: getfield En0 : [S
/*    */     //   480: swap
/*    */     //   481: saload
/*    */     //   482: invokestatic cw : ()Lf/yk0;
/*    */     //   485: swap
/*    */     //   486: invokevirtual mP : (S)Lf/WD;
/*    */     //   489: astore_1
/*    */     //   490: getfield uI0 : Lf/j40;
/*    */     //   493: getfield Zs : Lf/Q90;
/*    */     //   496: aload_1
/*    */     //   497: aload_0
/*    */     //   498: getfield xH0 : B
/*    */     //   501: istore_1
/*    */     //   502: getfield nul : B
/*    */     //   505: iload_1
/*    */     //   506: swap
/*    */     //   507: invokevirtual Vk0 : (IB)B
/*    */     //   510: aload_0
/*    */     //   511: dup
/*    */     //   512: getfield uI0 : Lf/j40;
/*    */     //   515: getfield Zs : Lf/Q90;
/*    */     //   518: astore_0
/*    */     //   519: getfield xH0 : B
/*    */     //   522: aload_0
/*    */     //   523: getfield rI0 : [B
/*    */     //   526: swap
/*    */     //   527: baload
/*    */     //   528: isub
/*    */     //   529: i2d
/*    */     //   530: iload #7
/*    */     //   532: i2d
/*    */     //   533: ddiv
/*    */     //   534: invokestatic ceil : (D)D
/*    */     //   537: d2i
/*    */     //   538: iload_2
/*    */     //   539: sipush #9999
/*    */     //   542: invokestatic Uw0 : (III)I
/*    */     //   545: i2s
/*    */     //   546: dup
/*    */     //   547: istore_0
/*    */     //   548: ifle -> 722
/*    */     //   551: goto -> 139
/*    */     //   554: iconst_1
/*    */     //   555: istore_2
/*    */     //   556: goto -> 722
/*    */     //   559: aload_0
/*    */     //   560: getfield Hr0 : Lf/LPT3;
/*    */     //   563: dup
/*    */     //   564: astore_1
/*    */     //   565: getfield KD0 : S
/*    */     //   568: dup
/*    */     //   569: istore_3
/*    */     //   570: ifeq -> 722
/*    */     //   573: aload_0
/*    */     //   574: getfield uI0 : Lf/j40;
/*    */     //   577: getfield Zs : Lf/Q90;
/*    */     //   580: dup
/*    */     //   581: astore_0
/*    */     //   582: getfield k0 : Lf/nV;
/*    */     //   585: getfield NF : Lf/XZ;
/*    */     //   588: aload_1
/*    */     //   589: getfield h3 : Lf/XZ;
/*    */     //   592: if_acmpne -> 602
/*    */     //   595: aload_0
/*    */     //   596: getfield Bl0 : S
/*    */     //   599: goto -> 611
/*    */     //   602: aload_0
/*    */     //   603: getfield Bl0 : S
/*    */     //   606: sipush #255
/*    */     //   609: swap
/*    */     //   610: isub
/*    */     //   611: i2d
/*    */     //   612: iload_3
/*    */     //   613: i2d
/*    */     //   614: ddiv
/*    */     //   615: invokestatic ceil : (D)D
/*    */     //   618: d2i
/*    */     //   619: dup
/*    */     //   620: istore_0
/*    */     //   621: ifle -> 722
/*    */     //   624: goto -> 139
/*    */     //   627: aload_0
/*    */     //   628: getfield uI0 : Lf/j40;
/*    */     //   631: dup
/*    */     //   632: astore #4
/*    */     //   634: getfield Zs : Lf/Q90;
/*    */     //   637: getfield u0 : B
/*    */     //   640: ifeq -> 652
/*    */     //   643: aload_1
/*    */     //   644: getfield xp0 : B
/*    */     //   647: ifeq -> 652
/*    */     //   650: iconst_1
/*    */     //   651: istore_2
/*    */     //   652: iload_3
/*    */     //   653: ifle -> 722
/*    */     //   656: aload_1
/*    */     //   657: getfield Rv0 : Z
/*    */     //   660: ifeq -> 681
/*    */     //   663: aload #4
/*    */     //   665: getfield Fq0 : Lf/Sf;
/*    */     //   668: getstatic f/hR.Gg : Lf/hR;
/*    */     //   671: invokevirtual Mm : (Lf/hR;)S
/*    */     //   674: iload_3
/*    */     //   675: imul
/*    */     //   676: bipush #100
/*    */     //   678: idiv
/*    */     //   679: i2s
/*    */     //   680: istore_3
/*    */     //   681: aload_0
/*    */     //   682: getfield uI0 : Lf/j40;
/*    */     //   685: getfield Fq0 : Lf/Sf;
/*    */     //   688: getstatic f/hR.Gg : Lf/hR;
/*    */     //   691: invokevirtual Mm : (Lf/hR;)S
/*    */     //   694: aload_0
/*    */     //   695: getfield uI0 : Lf/j40;
/*    */     //   698: getfield Zs : Lf/Q90;
/*    */     //   701: getfield Hq0 : S
/*    */     //   704: isub
/*    */     //   705: i2d
/*    */     //   706: iload_3
/*    */     //   707: i2d
/*    */     //   708: ddiv
/*    */     //   709: invokestatic ceil : (D)D
/*    */     //   712: d2i
/*    */     //   713: iload_2
/*    */     //   714: sipush #9999
/*    */     //   717: invokestatic Uw0 : (III)I
/*    */     //   720: i2s
/*    */     //   721: istore_2
/*    */     //   722: iload_2
/*    */     //   723: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 12
/*    */     //   #3	-> 15
/*    */     //   #4	-> 19
/*    */     //   #5	-> 28
/*    */     //   #6	-> 33
/*    */     //   #7	-> 38
/*    */     //   #8	-> 48
/*    */     //   #9	-> 51
/*    */     //   #10	-> 55
/*    */     //   #11	-> 59
/*    */     //   #12	-> 65
/*    */     //   #13	-> 68
/*    */     //   #14	-> 73
/*    */     //   #15	-> 153
/*    */     //   #16	-> 156
/*    */     //   #17	-> 177
/*    */     //   #18	-> 196
/*    */     //   #19	-> 200
/*    */     //   #20	-> 203
/*    */     //   #21	-> 206
/*    */     //   #22	-> 220
/*    */     //   #23	-> 223
/*    */     //   #24	-> 229
/*    */     //   #25	-> 236
/*    */     //   #26	-> 239
/*    */     //   #27	-> 248
/*    */     //   #28	-> 266
/*    */     //   #29	-> 269
/*    */     //   #30	-> 296
/*    */     //   #31	-> 299
/*    */     //   #32	-> 302
/*    */     //   #33	-> 307
/*    */     //   #34	-> 325
/*    */     //   #35	-> 334
/*    */     //   #36	-> 350
/*    */     //   #37	-> 363
/*    */     //   #38	-> 366
/*    */     //   #39	-> 374
/*    */     //   #40	-> 394
/*    */     //   #41	-> 400
/*    */     //   #42	-> 403
/*    */     //   #43	-> 410
/*    */     //   #44	-> 413
/*    */     //   #45	-> 417
/*    */     //   #46	-> 424
/*    */     //   #47	-> 469
/*    */     //   #48	-> 473
/*    */     //   #49	-> 477
/*    */     //   #50	-> 481
/*    */     //   #51	-> 482
/*    */     //   #52	-> 493
/*    */     //   #53	-> 498
/*    */     //   #54	-> 502
/*    */     //   #55	-> 507
/*    */     //   #56	-> 515
/*    */     //   #57	-> 519
/*    */     //   #58	-> 523
/*    */     //   #59	-> 527
/*    */     //   #60	-> 534
/*    */     //   #61	-> 565
/*    */     //   #62	-> 574
/*    */     //   #63	-> 577
/*    */     //   #64	-> 582
/*    */     //   #65	-> 585
/*    */     //   #66	-> 589
/*    */     //   #67	-> 596
/*    */     //   #68	-> 615
/*    */     //   #69	-> 634
/*    */     //   #70	-> 637
/*    */     //   #71	-> 644
/*    */     //   #72	-> 657
/*    */     //   #73	-> 665
/*    */     //   #74	-> 668
/*    */     //   #75	-> 685
/*    */     //   #76	-> 688
/*    */     //   #77	-> 698
/*    */     //   #78	-> 701
/*    */     //   #79	-> 709
/*    */   }
/*    */   
/*    */   public final String OF() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: new java/lang/StringBuilder
/*    */     //   6: dup
/*    */     //   7: astore_1
/*    */     //   8: invokespecial <init> : ()V
/*    */     //   11: getfield K00 : Lf/rh;
/*    */     //   14: getfield T8 : I
/*    */     //   17: istore_2
/*    */     //   18: getfield bH : Lf/Y;
/*    */     //   21: getfield Bp0 : Lf/LPT3;
/*    */     //   24: astore_3
/*    */     //   25: getfield Hr0 : Lf/LPT3;
/*    */     //   28: getfield el : Lf/hR;
/*    */     //   31: dup
/*    */     //   32: astore #4
/*    */     //   34: ifnull -> 175
/*    */     //   37: aload_0
/*    */     //   38: dup
/*    */     //   39: dup
/*    */     //   40: getfield uI0 : Lf/j40;
/*    */     //   43: getfield Zs : Lf/Q90;
/*    */     //   46: aload #4
/*    */     //   48: invokevirtual Uu0 : (Lf/hR;)S
/*    */     //   51: istore #5
/*    */     //   53: getfield uI0 : Lf/j40;
/*    */     //   56: getfield Zs : Lf/Q90;
/*    */     //   59: iconst_m1
/*    */     //   60: invokevirtual Ue : (I)S
/*    */     //   63: sipush #510
/*    */     //   66: swap
/*    */     //   67: isub
/*    */     //   68: istore #6
/*    */     //   70: getfield Hr0 : Lf/LPT3;
/*    */     //   73: getfield lA : S
/*    */     //   76: iload_2
/*    */     //   77: imul
/*    */     //   78: aload_0
/*    */     //   79: getfield uI0 : Lf/j40;
/*    */     //   82: getfield Zs : Lf/Q90;
/*    */     //   85: iconst_m1
/*    */     //   86: invokevirtual Ue : (I)S
/*    */     //   89: ineg
/*    */     //   90: iload #6
/*    */     //   92: invokestatic Uw0 : (III)I
/*    */     //   95: dup
/*    */     //   96: istore #6
/*    */     //   98: ifle -> 109
/*    */     //   101: sipush #252
/*    */     //   104: iload #5
/*    */     //   106: isub
/*    */     //   107: istore #5
/*    */     //   109: iload #6
/*    */     //   111: iload #5
/*    */     //   113: ineg
/*    */     //   114: iload #5
/*    */     //   116: invokestatic Uw0 : (III)I
/*    */     //   119: dup
/*    */     //   120: istore #5
/*    */     //   122: aload_1
/*    */     //   123: ldc_w '\\n'
/*    */     //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   129: aload #4
/*    */     //   131: getfield It0 : B
/*    */     //   134: sipush #1817
/*    */     //   137: iadd
/*    */     //   138: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   144: astore #4
/*    */     //   146: ifle -> 157
/*    */     //   149: ldc_w ' +'
/*    */     //   152: astore #6
/*    */     //   154: goto -> 162
/*    */     //   157: ldc_w ' '
/*    */     //   160: astore #6
/*    */     //   162: aload #4
/*    */     //   164: aload #6
/*    */     //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   169: iload #5
/*    */     //   171: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   174: pop
/*    */     //   175: aload_0
/*    */     //   176: getfield Hr0 : Lf/LPT3;
/*    */     //   179: getfield lh : I
/*    */     //   182: iload_2
/*    */     //   183: imul
/*    */     //   184: dup
/*    */     //   185: istore #4
/*    */     //   187: ifeq -> 430
/*    */     //   190: aload_0
/*    */     //   191: iload #4
/*    */     //   193: aload_0
/*    */     //   194: getfield uI0 : Lf/j40;
/*    */     //   197: getfield VP : Lf/UD0;
/*    */     //   200: getfield eb : Lf/Es;
/*    */     //   203: dup
/*    */     //   204: astore #5
/*    */     //   206: getstatic f/km.u4 : Lf/R8;
/*    */     //   209: dup
/*    */     //   210: astore #6
/*    */     //   212: getfield fF0 : Lf/BF;
/*    */     //   215: aload #6
/*    */     //   217: getfield Lz : Lf/fH0;
/*    */     //   220: getfield bv : B
/*    */     //   223: invokevirtual ry0 : (B)B
/*    */     //   226: iconst_0
/*    */     //   227: bipush #100
/*    */     //   229: invokestatic Uw0 : (III)I
/*    */     //   232: i2b
/*    */     //   233: dup
/*    */     //   234: istore #6
/*    */     //   236: iconst_1
/*    */     //   237: iadd
/*    */     //   238: invokevirtual GJ : (I)I
/*    */     //   241: aload_0
/*    */     //   242: getfield uI0 : Lf/j40;
/*    */     //   245: getfield Zs : Lf/Q90;
/*    */     //   248: getfield pA : I
/*    */     //   251: isub
/*    */     //   252: istore #7
/*    */     //   254: iconst_0
/*    */     //   255: iload #7
/*    */     //   257: invokestatic Uw0 : (III)I
/*    */     //   260: istore #8
/*    */     //   262: getfield uI0 : Lf/j40;
/*    */     //   265: getfield Zs : Lf/Q90;
/*    */     //   268: getfield pA : I
/*    */     //   271: iload #8
/*    */     //   273: iadd
/*    */     //   274: istore #9
/*    */     //   276: bipush #100
/*    */     //   278: istore #10
/*    */     //   280: iload #10
/*    */     //   282: ifle -> 310
/*    */     //   285: aload #5
/*    */     //   287: iload #10
/*    */     //   289: invokevirtual GJ : (I)I
/*    */     //   292: iload #9
/*    */     //   294: if_icmpgt -> 300
/*    */     //   297: goto -> 313
/*    */     //   300: iload #10
/*    */     //   302: iconst_1
/*    */     //   303: isub
/*    */     //   304: i2b
/*    */     //   305: istore #10
/*    */     //   307: goto -> 280
/*    */     //   310: iconst_1
/*    */     //   311: istore #10
/*    */     //   313: iload #10
/*    */     //   315: aload_0
/*    */     //   316: getfield uI0 : Lf/j40;
/*    */     //   319: getfield Zs : Lf/Q90;
/*    */     //   322: getfield od : B
/*    */     //   325: dup
/*    */     //   326: istore #5
/*    */     //   328: isub
/*    */     //   329: iload #6
/*    */     //   331: iload #5
/*    */     //   333: isub
/*    */     //   334: iconst_0
/*    */     //   335: swap
/*    */     //   336: invokestatic Uw0 : (III)I
/*    */     //   339: dup
/*    */     //   340: istore #5
/*    */     //   342: aload_1
/*    */     //   343: ldc_w '\\n'
/*    */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   349: invokestatic getInstance : ()Ljava/text/NumberFormat;
/*    */     //   352: iload #8
/*    */     //   354: i2l
/*    */     //   355: invokevirtual format : (J)Ljava/lang/String;
/*    */     //   358: ldc_w 101422
/*    */     //   361: swap
/*    */     //   362: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   368: pop
/*    */     //   369: ifle -> 397
/*    */     //   372: aload_1
/*    */     //   373: iload #5
/*    */     //   375: aload_1
/*    */     //   376: ldc_w '\\n'
/*    */     //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   382: pop
/*    */     //   383: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   386: ldc_w 101423
/*    */     //   389: swap
/*    */     //   390: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   396: pop
/*    */     //   397: iload #6
/*    */     //   399: bipush #100
/*    */     //   401: if_icmpge -> 430
/*    */     //   404: iload #7
/*    */     //   406: iload #4
/*    */     //   408: if_icmpge -> 430
/*    */     //   411: aload_1
/*    */     //   412: dup
/*    */     //   413: ldc_w '\\n'
/*    */     //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   419: pop
/*    */     //   420: ldc_w 101424
/*    */     //   423: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   429: pop
/*    */     //   430: aload_0
/*    */     //   431: getfield Hr0 : Lf/LPT3;
/*    */     //   434: getfield bj0 : S
/*    */     //   437: invokestatic l90 : (S)S
/*    */     //   440: dup
/*    */     //   441: istore #4
/*    */     //   443: sipush #1194
/*    */     //   446: if_icmpne -> 476
/*    */     //   449: aload_1
/*    */     //   450: ldc_w '\\n'
/*    */     //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   456: iload_2
/*    */     //   457: iconst_3
/*    */     //   458: imul
/*    */     //   459: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   462: sipush #4020
/*    */     //   465: swap
/*    */     //   466: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   472: pop
/*    */     //   473: goto -> 509
/*    */     //   476: iload #4
/*    */     //   478: sipush #1120
/*    */     //   481: if_icmpne -> 509
/*    */     //   484: aload_1
/*    */     //   485: ldc_w '\\n'
/*    */     //   488: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   491: iload_2
/*    */     //   492: bipush #60
/*    */     //   494: imul
/*    */     //   495: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   498: sipush #4021
/*    */     //   501: swap
/*    */     //   502: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   508: pop
/*    */     //   509: aload_3
/*    */     //   510: getfield Pa0 : S
/*    */     //   513: dup
/*    */     //   514: istore #4
/*    */     //   516: ifgt -> 526
/*    */     //   519: aload_3
/*    */     //   520: getfield xp0 : B
/*    */     //   523: ifeq -> 658
/*    */     //   526: iload #4
/*    */     //   528: ifle -> 621
/*    */     //   531: aload_3
/*    */     //   532: aload_0
/*    */     //   533: getfield uI0 : Lf/j40;
/*    */     //   536: getfield Fq0 : Lf/Sf;
/*    */     //   539: getstatic f/hR.Gg : Lf/hR;
/*    */     //   542: invokevirtual Mm : (Lf/hR;)S
/*    */     //   545: istore #5
/*    */     //   547: getfield Rv0 : Z
/*    */     //   550: ifeq -> 564
/*    */     //   553: iload #5
/*    */     //   555: iload #4
/*    */     //   557: imul
/*    */     //   558: bipush #100
/*    */     //   560: idiv
/*    */     //   561: i2s
/*    */     //   562: istore #4
/*    */     //   564: aload_1
/*    */     //   565: iload #4
/*    */     //   567: iload_2
/*    */     //   568: iload #5
/*    */     //   570: aload_0
/*    */     //   571: getfield uI0 : Lf/j40;
/*    */     //   574: getfield Zs : Lf/Q90;
/*    */     //   577: getfield Hq0 : S
/*    */     //   580: isub
/*    */     //   581: istore #4
/*    */     //   583: imul
/*    */     //   584: iconst_0
/*    */     //   585: iload #4
/*    */     //   587: invokestatic Uw0 : (III)I
/*    */     //   590: new java/lang/StringBuilder
/*    */     //   593: dup
/*    */     //   594: invokespecial <init> : ()V
/*    */     //   597: ldc_w '+'
/*    */     //   600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   603: swap
/*    */     //   604: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   607: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   610: sipush #1426
/*    */     //   613: swap
/*    */     //   614: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   620: pop
/*    */     //   621: aload_0
/*    */     //   622: getfield uI0 : Lf/j40;
/*    */     //   625: getfield Zs : Lf/Q90;
/*    */     //   628: getfield u0 : B
/*    */     //   631: ifeq -> 658
/*    */     //   634: aload_3
/*    */     //   635: getfield xp0 : B
/*    */     //   638: ifeq -> 658
/*    */     //   641: aload_1
/*    */     //   642: ldc_w '\\n'
/*    */     //   645: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   648: sipush #3523
/*    */     //   651: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   657: pop
/*    */     //   658: aload_0
/*    */     //   659: getfield Hr0 : Lf/LPT3;
/*    */     //   662: dup
/*    */     //   663: astore_3
/*    */     //   664: getfield KD0 : S
/*    */     //   667: dup
/*    */     //   668: istore #4
/*    */     //   670: ifeq -> 807
/*    */     //   673: aload_0
/*    */     //   674: getfield uI0 : Lf/j40;
/*    */     //   677: getfield Zs : Lf/Q90;
/*    */     //   680: dup
/*    */     //   681: astore_0
/*    */     //   682: getfield k0 : Lf/nV;
/*    */     //   685: getfield NF : Lf/XZ;
/*    */     //   688: aload_3
/*    */     //   689: getfield h3 : Lf/XZ;
/*    */     //   692: if_acmpne -> 702
/*    */     //   695: iload #4
/*    */     //   697: iconst_m1
/*    */     //   698: imul
/*    */     //   699: i2s
/*    */     //   700: istore #4
/*    */     //   702: iload #4
/*    */     //   704: aload_0
/*    */     //   705: getfield Bl0 : S
/*    */     //   708: istore_0
/*    */     //   709: ifle -> 718
/*    */     //   712: sipush #255
/*    */     //   715: iload_0
/*    */     //   716: isub
/*    */     //   717: istore_0
/*    */     //   718: iload #4
/*    */     //   720: iload_2
/*    */     //   721: imul
/*    */     //   722: iload_0
/*    */     //   723: ineg
/*    */     //   724: iload_0
/*    */     //   725: invokestatic Uw0 : (III)I
/*    */     //   728: dup
/*    */     //   729: istore_0
/*    */     //   730: iconst_1
/*    */     //   731: if_icmpge -> 738
/*    */     //   734: iload_0
/*    */     //   735: iconst_m1
/*    */     //   736: imul
/*    */     //   737: istore_0
/*    */     //   738: iload #4
/*    */     //   740: aload_1
/*    */     //   741: iload_0
/*    */     //   742: i2d
/*    */     //   743: ldc2_w 255.0
/*    */     //   746: ddiv
/*    */     //   747: ldc2_w 100.0
/*    */     //   750: dmul
/*    */     //   751: dstore_2
/*    */     //   752: ldc_w '\\n'
/*    */     //   755: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   758: sipush #1811
/*    */     //   761: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   767: astore_0
/*    */     //   768: ifle -> 779
/*    */     //   771: ldc_w ' +'
/*    */     //   774: astore #4
/*    */     //   776: goto -> 784
/*    */     //   779: ldc_w ' -'
/*    */     //   782: astore #4
/*    */     //   784: aload_0
/*    */     //   785: aload #4
/*    */     //   787: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   790: getstatic f/PH0.JV : Ljava/text/DecimalFormat;
/*    */     //   793: dload_2
/*    */     //   794: invokevirtual format : (D)Ljava/lang/String;
/*    */     //   797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   800: ldc_w '%'
/*    */     //   803: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   806: pop
/*    */     //   807: aload_1
/*    */     //   808: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   811: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 14
/*    */     //   #2	-> 18
/*    */     //   #3	-> 21
/*    */     //   #4	-> 25
/*    */     //   #5	-> 28
/*    */     //   #6	-> 40
/*    */     //   #7	-> 43
/*    */     //   #8	-> 48
/*    */     //   #9	-> 56
/*    */     //   #10	-> 60
/*    */     //   #11	-> 70
/*    */     //   #12	-> 73
/*    */     //   #13	-> 79
/*    */     //   #14	-> 82
/*    */     //   #15	-> 86
/*    */     //   #16	-> 92
/*    */     //   #17	-> 131
/*    */     //   #18	-> 138
/*    */     //   #19	-> 179
/*    */     //   #20	-> 194
/*    */     //   #21	-> 197
/*    */     //   #22	-> 200
/*    */     //   #23	-> 206
/*    */     //   #24	-> 212
/*    */     //   #25	-> 217
/*    */     //   #26	-> 220
/*    */     //   #27	-> 223
/*    */     //   #28	-> 245
/*    */     //   #29	-> 248
/*    */     //   #30	-> 257
/*    */     //   #31	-> 265
/*    */     //   #32	-> 268
/*    */     //   #33	-> 289
/*    */     //   #34	-> 316
/*    */     //   #35	-> 319
/*    */     //   #36	-> 322
/*    */     //   #37	-> 336
/*    */     //   #38	-> 434
/*    */     //   #39	-> 437
/*    */     //   #40	-> 510
/*    */     //   #41	-> 520
/*    */     //   #42	-> 533
/*    */     //   #43	-> 536
/*    */     //   #44	-> 539
/*    */     //   #45	-> 547
/*    */     //   #46	-> 560
/*    */     //   #47	-> 574
/*    */     //   #48	-> 577
/*    */     //   #49	-> 587
/*    */     //   #50	-> 625
/*    */     //   #51	-> 628
/*    */     //   #52	-> 635
/*    */     //   #53	-> 642
/*    */     //   #54	-> 664
/*    */     //   #55	-> 674
/*    */     //   #56	-> 677
/*    */     //   #57	-> 682
/*    */     //   #58	-> 685
/*    */     //   #59	-> 689
/*    */     //   #60	-> 705
/*    */     //   #61	-> 725
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */