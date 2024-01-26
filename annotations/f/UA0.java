/*  1 */ package f;public final class UA0 implements iq0, Runnable { public vJ IV; public ek0 wG0; public LD Xy; public jJ mA; public Y3 tt0; public jJ pI0; public boolean cj0; public COm1 AE; public Tm pC0; public K70 N90; public Y00 hl; public pe0 n2; public COm1 Oj; public uT[] kA0; public float Nx0; public int Nh0; public final COm1 od0(int paramInt) { COm1 cOm1; if ((cOm1 = this.AE) != null) return cOm1;  Uc uc = Uc.xi0; this(1024, 1024, uc, 2, true); oF0 oF0; byte b = 10; int i = 0, j = this.pI0.su(paramInt), k = 0; while (true) { ZH zH; NC0 nC0; int m; if ((m = (int)Math.floor((i * 0.6F))) >= j) { this.Xy.VE0(); this.AE = oF0.aN(cu0.Fh, cu0.Fh); oF0.dispose(); return this.AE; }  Uc uc1 = Uc.xi0; this(192, 128, uc1); jJ jJ1 = this.pI0; Y3 y3 = this.tt0; jJ jJ2 = this.mA; LD lD = this.Xy; ek0 ek01 = this.wG0; vJ vJ1 = this.IV; this(96.0F, 112.0F); if (paramInt >= 0) { yA0 yA0; if (paramInt < (yA0 = jJ1.UP)
/*  2 */           .gr) { Fi fi; nG0[] arrayOfNG0; int n; short s1; short s2; for (arrayOfNG0 = (fi = yA0.Py[paramInt]).AE0, n = 0, s1 = -1, s2 = 0; s2 < fi.Nr0; ) { short s3 = (arrayOfNG0[s2]).Zr0; short s4; if ((s4 = (arrayOfNG0[s2]).Ri.BK0) != s1) n = 0;  if (m < s3) { m = n + m; jJ1.dj(paramInt, s2, m, y3, jJ2, lD, ek01, vJ1, zH, nC0); break; }  m -= s3; n += s3; s2 = (short)(s2 + 1); s1 = s4; }  }  } else { jJ1
/*  3 */           .getClass(); }  oF0.EI0(Integer.toString(k++), zH); zH.dispose(); i += b; }  } public boolean of; public boolean P6; public boolean bL; public boolean NJ; public int S00; public int YM; public boolean K5; public float vF0; public float rS; public int BU; public int B30; public fQ Kz; public eO Wo; public NC0 fW; public UA0(vJ paramvJ, ek0 paramek0, LD paramLD, jJ paramjJ1, Y3 paramY3, jJ paramjJ2) { fQ fQ1; eO eO1; NC0 nC0; this.cj0 = false; this.Nx0 = 1.0F; this.Nh0 = 0; this.of = true; this.P6 = true; this.bL = true; this.NJ = true; this.YM = 0; this.K5 = false; this.vF0 = 0.0F; this.rS = 1.0F; this.BU = 192; this.B30 = 128; this(); this.Kz = this; this(); this.Wo = this; this(0.0F, 0.0F); this.fW = this; this.IV = paramvJ; this.wG0 = paramek0; this.Xy = paramLD; this.mA = paramjJ1; this.tt0 = paramY3; this.pI0 = paramjJ2; } public final void Zz(float paramFloat) { if (this.hl == null) { this.Nx0 = nx0.SA0(paramFloat, 1.0F, 4.0F); return; }  throw new IllegalStateException(); } public final COm1 dZ() { return od0(this.Nh0); } public final pe0 OB0() { if (this.hl == null) { Y00 y00; Ql ql; X3 x3; float f2; int i = (int)(this.BU * (f2 = this.Nx0)); this(Uc.xi0, i, (int)(this.B30 * f2), false); this.hl = new Y00(); ((Texture)y00.P10()).setFilter(cu0.Fh, cu0.Fh); this(); this(ql); this.N90 = new K70(x3, UA0::jJ); float f1; this(this.BU * (f1 = this.Nx0), this.B30 * f1); this.pC0 = tm; Tm tm; (tm = new Tm()).Wt(this.BU * (f1 = this.Nx0), this.B30 * f1, true); f1 = this.B30 * 0.75F * this.Nx0 / 2.0F; if (this.tt0 == null) f1 = 0.0F;  this.pC0.H.TG0(0.0F, f1, 0.1F); this.pC0.nq0(0.0F, f1, 0.0F); this.pC0.UX(true); (this.n2 = new pe0((Texture)this.hl.P10())).zt0(true, false); if (this.Oj == null) { NC0 nC01, nC02; oF0 oF0; fQ fQ1; this(); this(); i = this.Xy.ql.RM; this(); char c; LD lD2; for (c = Character.MIN_VALUE; c < (lD2 = this.Xy).ql.RM; ) { cx0 cx0; lD2.rb0(c, nC01, nC02); float f3 = nC01.x, f4 = nC01.y; this(0.0F, 0.0F, f3, f4); fQ1.Com3(cx0); c++; }  int j, k, m, n, i1; for (i = 256, c = 'Ѐ', j = 0, k = 0, m = 0, n = 0, i1 = i - 1; i1 >= 0; ) { cx0 cx0; int i2 = (int)(cx0 = (cx0)fQ1.Hc(i1)).af, i3 = (int)((cx0)fQ1.Hc(i1)).sf0; i3 += 4; if (m + (i2 += 4) > i) { if ((n += i3) > c - i3) break;  m = 0; }  cx0.dA = m; cx0.zA0 = n; j = Math.max(j, m += i2); k = Math.max(k, n + i3); i1--; }  Uc uc = Uc.xi0; this(j, k, uc, 1, false); LD lD1; for (byte b2 = 0; b2 < (lD1 = this.Xy).ql.RM; ) { lD1.rb0(b2, nC01, nC02); this((int)nC01.x, (int)nC01.y, Uc.xi0); ek0 ek01 = this.wG0; this.Xy
/*  4 */             .D20(b2, ek01, this.IV, zH, nC02);
/*  5 */           oF0.EI0(Integer.toString(b2), zH); ZH zH; (zH = new ZH()).dispose(); b2++; }  this.Oj = oF0.aN(cu0.Fh, cu0.Fh); oF0.dispose(); this
/*    */           
/*  7 */           .kA0 = new uT[this.Xy.ql.RM]; byte b1 = 0; while (b1 < 
/*  8 */           this.Xy.ql.RM)
/*    */         
/*    */         { 
/*    */           
/* 12 */           float f = m * 0.05F; uT uT1; (uT1 = uT.AM((pe0)this.Oj.ui0.get(b1))).WQ(0.0F, 0.0F, f); uT.AM((pe0)this.Oj.ui0.get(b1)).Gz(); this.kA0[b1] = uT1; b1++; }  }  }
/* 13 */      return this.n2; }
/*    */ 
/*    */   
/*    */   public final void run() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield cj0 : Z
/*    */     //   4: ifne -> 1255
/*    */     //   7: aload_0
/*    */     //   8: getfield K5 : Z
/*    */     //   11: ifne -> 102
/*    */     //   14: aload_0
/*    */     //   15: dup
/*    */     //   16: dup
/*    */     //   17: getfield pI0 : Lf/jJ;
/*    */     //   20: aload_0
/*    */     //   21: getfield Nh0 : I
/*    */     //   24: invokevirtual su : (I)I
/*    */     //   27: putfield S00 : I
/*    */     //   30: getfield of : Z
/*    */     //   33: ifne -> 72
/*    */     //   36: aload_0
/*    */     //   37: getfield mA : Lf/jJ;
/*    */     //   40: ifnull -> 72
/*    */     //   43: aload_0
/*    */     //   44: dup
/*    */     //   45: getfield pI0 : Lf/jJ;
/*    */     //   48: aload_0
/*    */     //   49: getfield Nh0 : I
/*    */     //   52: invokevirtual su : (I)I
/*    */     //   55: aload_0
/*    */     //   56: getfield mA : Lf/jJ;
/*    */     //   59: aload_0
/*    */     //   60: getfield Nh0 : I
/*    */     //   63: invokevirtual su : (I)I
/*    */     //   66: invokestatic min : (II)I
/*    */     //   69: putfield S00 : I
/*    */     //   72: aload_0
/*    */     //   73: getfield P6 : Z
/*    */     //   76: ifeq -> 95
/*    */     //   79: aload_0
/*    */     //   80: getfield S00 : I
/*    */     //   83: invokestatic qX : (I)I
/*    */     //   86: i2f
/*    */     //   87: ldc_w 60.0
/*    */     //   90: fdiv
/*    */     //   91: fstore_1
/*    */     //   92: goto -> 97
/*    */     //   95: fconst_0
/*    */     //   96: fstore_1
/*    */     //   97: aload_0
/*    */     //   98: fload_1
/*    */     //   99: putfield vF0 : F
/*    */     //   102: aload_0
/*    */     //   103: getfield bL : Z
/*    */     //   106: ifeq -> 137
/*    */     //   109: aload_0
/*    */     //   110: getfield NJ : Z
/*    */     //   113: ifeq -> 137
/*    */     //   116: aload_0
/*    */     //   117: dup
/*    */     //   118: getfield vF0 : F
/*    */     //   121: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   124: getfield Qy : F
/*    */     //   127: aload_0
/*    */     //   128: getfield rS : F
/*    */     //   131: fmul
/*    */     //   132: swap
/*    */     //   133: fadd
/*    */     //   134: putfield vF0 : F
/*    */     //   137: aload_0
/*    */     //   138: getfield vF0 : F
/*    */     //   141: ldc_w 60.0
/*    */     //   144: fmul
/*    */     //   145: f2d
/*    */     //   146: invokestatic floor : (D)D
/*    */     //   149: d2i
/*    */     //   150: istore_1
/*    */     //   151: iload_1
/*    */     //   152: aload_0
/*    */     //   153: getfield S00 : I
/*    */     //   156: dup
/*    */     //   157: istore_2
/*    */     //   158: if_icmplt -> 182
/*    */     //   161: aload_0
/*    */     //   162: getfield of : Z
/*    */     //   165: ifeq -> 175
/*    */     //   168: iload_1
/*    */     //   169: iload_2
/*    */     //   170: isub
/*    */     //   171: istore_1
/*    */     //   172: goto -> 151
/*    */     //   175: iload_2
/*    */     //   176: iconst_1
/*    */     //   177: isub
/*    */     //   178: istore_1
/*    */     //   179: goto -> 151
/*    */     //   182: aload_0
/*    */     //   183: dup
/*    */     //   184: iconst_1
/*    */     //   185: putfield NJ : Z
/*    */     //   188: getfield K5 : Z
/*    */     //   191: ifeq -> 456
/*    */     //   194: aload_0
/*    */     //   195: dup
/*    */     //   196: getfield pI0 : Lf/jJ;
/*    */     //   199: astore_2
/*    */     //   200: getfield Nh0 : I
/*    */     //   203: dup
/*    */     //   204: istore_3
/*    */     //   205: aload_0
/*    */     //   206: dup
/*    */     //   207: dup
/*    */     //   208: getfield YM : I
/*    */     //   211: istore #4
/*    */     //   213: getfield tt0 : Lf/Y3;
/*    */     //   216: astore #5
/*    */     //   218: getfield mA : Lf/jJ;
/*    */     //   221: astore #6
/*    */     //   223: iflt -> 443
/*    */     //   226: iload_3
/*    */     //   227: aload_2
/*    */     //   228: getfield UP : Lf/yA0;
/*    */     //   231: dup
/*    */     //   232: astore #7
/*    */     //   234: getfield gr : S
/*    */     //   237: if_icmplt -> 243
/*    */     //   240: goto -> 448
/*    */     //   243: aload #7
/*    */     //   245: getfield Py : [Lf/Fi;
/*    */     //   248: iload_3
/*    */     //   249: aaload
/*    */     //   250: dup
/*    */     //   251: astore #7
/*    */     //   253: getfield AE0 : [Lf/nG0;
/*    */     //   256: astore #8
/*    */     //   258: iconst_0
/*    */     //   259: istore #9
/*    */     //   261: iconst_m1
/*    */     //   262: istore #10
/*    */     //   264: iconst_0
/*    */     //   265: istore #11
/*    */     //   267: iload_1
/*    */     //   268: istore #12
/*    */     //   270: iload #11
/*    */     //   272: aload #7
/*    */     //   274: getfield Nr0 : I
/*    */     //   277: if_icmpge -> 439
/*    */     //   280: aload #8
/*    */     //   282: iload #11
/*    */     //   284: aaload
/*    */     //   285: dup
/*    */     //   286: getfield Zr0 : S
/*    */     //   289: istore #13
/*    */     //   291: getfield Ri : Lf/w2;
/*    */     //   294: getfield BK0 : S
/*    */     //   297: dup
/*    */     //   298: istore #14
/*    */     //   300: iload #10
/*    */     //   302: if_icmpeq -> 308
/*    */     //   305: iconst_0
/*    */     //   306: istore #9
/*    */     //   308: iload #4
/*    */     //   310: iload #13
/*    */     //   312: if_icmplt -> 368
/*    */     //   315: iload #12
/*    */     //   317: iload #13
/*    */     //   319: if_icmpge -> 325
/*    */     //   322: goto -> 368
/*    */     //   325: iload #11
/*    */     //   327: iload #9
/*    */     //   329: iload #13
/*    */     //   331: iload #12
/*    */     //   333: iload #13
/*    */     //   335: iload #4
/*    */     //   337: iload #13
/*    */     //   339: isub
/*    */     //   340: istore #4
/*    */     //   342: isub
/*    */     //   343: istore #9
/*    */     //   345: iadd
/*    */     //   346: istore #10
/*    */     //   348: iconst_1
/*    */     //   349: iadd
/*    */     //   350: i2s
/*    */     //   351: istore #11
/*    */     //   353: iload #14
/*    */     //   355: iload #9
/*    */     //   357: iload #10
/*    */     //   359: istore #9
/*    */     //   361: istore #12
/*    */     //   363: istore #10
/*    */     //   365: goto -> 270
/*    */     //   368: iload #4
/*    */     //   370: iload #13
/*    */     //   372: if_icmpge -> 381
/*    */     //   375: iconst_1
/*    */     //   376: istore #7
/*    */     //   378: goto -> 384
/*    */     //   381: iconst_0
/*    */     //   382: istore #7
/*    */     //   384: iload #12
/*    */     //   386: iload #13
/*    */     //   388: if_icmpge -> 397
/*    */     //   391: iconst_1
/*    */     //   392: istore #8
/*    */     //   394: goto -> 400
/*    */     //   397: iconst_0
/*    */     //   398: istore #8
/*    */     //   400: iload #7
/*    */     //   402: iload #8
/*    */     //   404: if_icmpeq -> 410
/*    */     //   407: goto -> 439
/*    */     //   410: aload_2
/*    */     //   411: iload #9
/*    */     //   413: dup
/*    */     //   414: iload #4
/*    */     //   416: iadd
/*    */     //   417: istore_2
/*    */     //   418: iload #12
/*    */     //   420: iadd
/*    */     //   421: istore #4
/*    */     //   423: iload_3
/*    */     //   424: iload #11
/*    */     //   426: iload_2
/*    */     //   427: iload #4
/*    */     //   429: aload #5
/*    */     //   431: aload #6
/*    */     //   433: invokevirtual COM7 : (IIIILf/Y3;Lf/jJ;)Z
/*    */     //   436: goto -> 449
/*    */     //   439: iconst_0
/*    */     //   440: goto -> 449
/*    */     //   443: aload_2
/*    */     //   444: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   447: pop
/*    */     //   448: iconst_1
/*    */     //   449: ifeq -> 456
/*    */     //   452: iconst_0
/*    */     //   453: goto -> 467
/*    */     //   456: aload_0
/*    */     //   457: dup
/*    */     //   458: iconst_1
/*    */     //   459: putfield K5 : Z
/*    */     //   462: iload_1
/*    */     //   463: putfield YM : I
/*    */     //   466: iconst_1
/*    */     //   467: ifeq -> 1255
/*    */     //   470: aload_0
/*    */     //   471: getfield AE : Lf/COm1;
/*    */     //   474: ifnull -> 480
/*    */     //   477: goto -> 1255
/*    */     //   480: aload_0
/*    */     //   481: dup
/*    */     //   482: dup
/*    */     //   483: dup2
/*    */     //   484: invokevirtual OB0 : ()Lf/pe0;
/*    */     //   487: pop
/*    */     //   488: getfield hl : Lf/Y00;
/*    */     //   491: astore_1
/*    */     //   492: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   495: aload_1
/*    */     //   496: getfield EE0 : I
/*    */     //   499: ldc_w 36160
/*    */     //   502: swap
/*    */     //   503: invokeinterface glBindFramebuffer : (II)V
/*    */     //   508: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   511: aload_1
/*    */     //   512: getfield E80 : Lf/wl0;
/*    */     //   515: dup
/*    */     //   516: getfield rS : I
/*    */     //   519: istore_1
/*    */     //   520: getfield Z : I
/*    */     //   523: istore_2
/*    */     //   524: iconst_0
/*    */     //   525: iconst_0
/*    */     //   526: iload_1
/*    */     //   527: iload_2
/*    */     //   528: invokeinterface glViewport : (IIII)V
/*    */     //   533: getstatic f/UB0.go : Lf/hj0;
/*    */     //   536: fconst_0
/*    */     //   537: fconst_0
/*    */     //   538: fconst_0
/*    */     //   539: fconst_0
/*    */     //   540: invokeinterface glClearColor : (FFFF)V
/*    */     //   545: getstatic f/UB0.go : Lf/hj0;
/*    */     //   548: sipush #16384
/*    */     //   551: invokeinterface glClear : (I)V
/*    */     //   556: getfield N90 : Lf/K70;
/*    */     //   559: aload_0
/*    */     //   560: getfield pC0 : Lf/Tm;
/*    */     //   563: invokevirtual mx0 : (Lf/ny;)V
/*    */     //   566: getfield N90 : Lf/K70;
/*    */     //   569: astore_1
/*    */     //   570: getfield Nh0 : I
/*    */     //   573: dup
/*    */     //   574: istore_2
/*    */     //   575: aload_0
/*    */     //   576: dup
/*    */     //   577: dup
/*    */     //   578: dup2
/*    */     //   579: getfield Wo : Lf/eO;
/*    */     //   582: aload_0
/*    */     //   583: getfield Kz : Lf/fQ;
/*    */     //   586: invokevirtual freeAll : (Lf/fQ;)V
/*    */     //   589: getfield Kz : Lf/fQ;
/*    */     //   592: invokevirtual clear : ()V
/*    */     //   595: getfield fW : Lf/NC0;
/*    */     //   598: dup
/*    */     //   599: dup
/*    */     //   600: astore_3
/*    */     //   601: fconst_0
/*    */     //   602: putfield x : F
/*    */     //   605: fconst_0
/*    */     //   606: putfield y : F
/*    */     //   609: getfield pI0 : Lf/jJ;
/*    */     //   612: astore #4
/*    */     //   614: getfield YM : I
/*    */     //   617: istore #5
/*    */     //   619: iflt -> 760
/*    */     //   622: iload_2
/*    */     //   623: aload #4
/*    */     //   625: getfield UP : Lf/yA0;
/*    */     //   628: dup
/*    */     //   629: astore #6
/*    */     //   631: getfield gr : S
/*    */     //   634: if_icmplt -> 640
/*    */     //   637: goto -> 766
/*    */     //   640: aload #6
/*    */     //   642: getfield Py : [Lf/Fi;
/*    */     //   645: iload_2
/*    */     //   646: aaload
/*    */     //   647: dup
/*    */     //   648: astore #6
/*    */     //   650: getfield AE0 : [Lf/nG0;
/*    */     //   653: astore #7
/*    */     //   655: iconst_0
/*    */     //   656: istore #8
/*    */     //   658: iconst_m1
/*    */     //   659: istore #9
/*    */     //   661: iconst_0
/*    */     //   662: istore #10
/*    */     //   664: iload #10
/*    */     //   666: aload #6
/*    */     //   668: getfield Nr0 : I
/*    */     //   671: if_icmpge -> 766
/*    */     //   674: aload #7
/*    */     //   676: iload #10
/*    */     //   678: aaload
/*    */     //   679: dup
/*    */     //   680: getfield Zr0 : S
/*    */     //   683: istore #11
/*    */     //   685: getfield Ri : Lf/w2;
/*    */     //   688: getfield BK0 : S
/*    */     //   691: dup
/*    */     //   692: istore #12
/*    */     //   694: iload #9
/*    */     //   696: if_icmpeq -> 702
/*    */     //   699: iconst_0
/*    */     //   700: istore #8
/*    */     //   702: iload #5
/*    */     //   704: iload #11
/*    */     //   706: if_icmpge -> 732
/*    */     //   709: aload #4
/*    */     //   711: iload #8
/*    */     //   713: iload #5
/*    */     //   715: iadd
/*    */     //   716: istore #4
/*    */     //   718: iload_2
/*    */     //   719: iload #10
/*    */     //   721: iload #4
/*    */     //   723: aload_0
/*    */     //   724: aload_3
/*    */     //   725: invokevirtual lPt3 : (IIILf/UA0;Lf/NC0;)Z
/*    */     //   728: pop
/*    */     //   729: goto -> 766
/*    */     //   732: iload #10
/*    */     //   734: iload #8
/*    */     //   736: iload #11
/*    */     //   738: iload #5
/*    */     //   740: iload #11
/*    */     //   742: isub
/*    */     //   743: istore #5
/*    */     //   745: iadd
/*    */     //   746: istore #8
/*    */     //   748: iconst_1
/*    */     //   749: iadd
/*    */     //   750: i2s
/*    */     //   751: istore #10
/*    */     //   753: iload #12
/*    */     //   755: istore #9
/*    */     //   757: goto -> 664
/*    */     //   760: aload #4
/*    */     //   762: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   765: pop
/*    */     //   766: aload_0
/*    */     //   767: getfield Kz : Lf/fQ;
/*    */     //   770: astore_2
/*    */     //   771: iconst_0
/*    */     //   772: istore_3
/*    */     //   773: iload_3
/*    */     //   774: aload_2
/*    */     //   775: getfield Z8 : I
/*    */     //   778: if_icmpge -> 1240
/*    */     //   781: aload_2
/*    */     //   782: iload_3
/*    */     //   783: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   786: checkcast f/Hr0
/*    */     //   789: dup
/*    */     //   790: astore #4
/*    */     //   792: getfield bx0 : I
/*    */     //   795: dup
/*    */     //   796: istore #5
/*    */     //   798: ifge -> 804
/*    */     //   801: goto -> 1234
/*    */     //   804: aload #4
/*    */     //   806: aload_0
/*    */     //   807: getfield kA0 : [Lf/uT;
/*    */     //   810: iload #5
/*    */     //   812: aaload
/*    */     //   813: dup
/*    */     //   814: dup
/*    */     //   815: astore #5
/*    */     //   817: aload #4
/*    */     //   819: getfield K90 : I
/*    */     //   822: i2f
/*    */     //   823: aload_0
/*    */     //   824: getfield Nx0 : F
/*    */     //   827: dup
/*    */     //   828: fstore #6
/*    */     //   830: fmul
/*    */     //   831: iload_3
/*    */     //   832: aload #4
/*    */     //   834: getfield tK : I
/*    */     //   837: i2f
/*    */     //   838: fload #6
/*    */     //   840: fmul
/*    */     //   841: fstore #6
/*    */     //   843: i2f
/*    */     //   844: ldc_w 1.0E-4
/*    */     //   847: fmul
/*    */     //   848: fload #6
/*    */     //   850: swap
/*    */     //   851: invokevirtual WQ : (FFF)V
/*    */     //   854: invokevirtual Gz : ()V
/*    */     //   857: getfield K8 : Lf/w2;
/*    */     //   860: dup
/*    */     //   861: astore #6
/*    */     //   863: ifnull -> 915
/*    */     //   866: aload #6
/*    */     //   868: getfield Vf0 : S
/*    */     //   871: dup
/*    */     //   872: istore #6
/*    */     //   874: ifeq -> 915
/*    */     //   877: aload #5
/*    */     //   879: dup
/*    */     //   880: iload #6
/*    */     //   882: ldc_w 65535
/*    */     //   885: iand
/*    */     //   886: i2f
/*    */     //   887: ldc_w 65535.0
/*    */     //   890: fdiv
/*    */     //   891: ldc_w -360.0
/*    */     //   894: fmul
/*    */     //   895: fstore #6
/*    */     //   897: getfield Qi : Lf/TG0;
/*    */     //   900: getstatic f/eo.Z : Lf/eo;
/*    */     //   903: fload #6
/*    */     //   905: invokevirtual eY : (Lf/eo;F)V
/*    */     //   908: iconst_0
/*    */     //   909: putfield ir : Z
/*    */     //   912: goto -> 924
/*    */     //   915: aload #5
/*    */     //   917: dup
/*    */     //   918: fconst_0
/*    */     //   919: fstore #6
/*    */     //   921: goto -> 897
/*    */     //   924: aload #4
/*    */     //   926: aload #5
/*    */     //   928: invokevirtual Gz : ()V
/*    */     //   931: iconst_0
/*    */     //   932: istore #6
/*    */     //   934: iconst_0
/*    */     //   935: istore #7
/*    */     //   937: getfield K8 : Lf/w2;
/*    */     //   940: dup
/*    */     //   941: astore #8
/*    */     //   943: ifnull -> 1121
/*    */     //   946: aload #8
/*    */     //   948: getfield dF : I
/*    */     //   951: dup
/*    */     //   952: istore #9
/*    */     //   954: sipush #4096
/*    */     //   957: if_icmpne -> 971
/*    */     //   960: aload #8
/*    */     //   962: getfield r3 : I
/*    */     //   965: sipush #4096
/*    */     //   968: if_icmpeq -> 1121
/*    */     //   971: aload_0
/*    */     //   972: aload #5
/*    */     //   974: getfield FC0 : Lf/eo;
/*    */     //   977: astore #6
/*    */     //   979: getfield Nx0 : F
/*    */     //   982: dup
/*    */     //   983: fstore #7
/*    */     //   985: iload #9
/*    */     //   987: i2f
/*    */     //   988: fmul
/*    */     //   989: ldc_w 4096.0
/*    */     //   992: fdiv
/*    */     //   993: dup
/*    */     //   994: fstore #9
/*    */     //   996: aload #6
/*    */     //   998: fload #7
/*    */     //   1000: aload #8
/*    */     //   1002: aload #6
/*    */     //   1004: fload #9
/*    */     //   1006: putfield x : F
/*    */     //   1009: getfield r3 : I
/*    */     //   1012: i2f
/*    */     //   1013: fmul
/*    */     //   1014: ldc_w 4096.0
/*    */     //   1017: fdiv
/*    */     //   1018: dup
/*    */     //   1019: fstore #6
/*    */     //   1021: putfield y : F
/*    */     //   1024: fconst_0
/*    */     //   1025: fcmpg
/*    */     //   1026: ifge -> 1035
/*    */     //   1029: iconst_1
/*    */     //   1030: istore #7
/*    */     //   1032: goto -> 1038
/*    */     //   1035: iconst_0
/*    */     //   1036: istore #7
/*    */     //   1038: fload #6
/*    */     //   1040: fconst_0
/*    */     //   1041: fcmpg
/*    */     //   1042: ifge -> 1051
/*    */     //   1045: iconst_1
/*    */     //   1046: istore #6
/*    */     //   1048: goto -> 1054
/*    */     //   1051: iconst_0
/*    */     //   1052: istore #6
/*    */     //   1054: iload #7
/*    */     //   1056: aload #5
/*    */     //   1058: iload #7
/*    */     //   1060: iload #6
/*    */     //   1062: invokevirtual fp : (ZZ)V
/*    */     //   1065: ifeq -> 1084
/*    */     //   1068: aload #5
/*    */     //   1070: getfield FC0 : Lf/eo;
/*    */     //   1073: dup
/*    */     //   1074: getfield x : F
/*    */     //   1077: ldc_w -1.0
/*    */     //   1080: fmul
/*    */     //   1081: putfield x : F
/*    */     //   1084: iload #6
/*    */     //   1086: ifeq -> 1105
/*    */     //   1089: aload #5
/*    */     //   1091: getfield FC0 : Lf/eo;
/*    */     //   1094: dup
/*    */     //   1095: getfield y : F
/*    */     //   1098: ldc_w -1.0
/*    */     //   1101: fmul
/*    */     //   1102: putfield y : F
/*    */     //   1105: aload #5
/*    */     //   1107: dup
/*    */     //   1108: dup
/*    */     //   1109: getfield He0 : Lf/eo;
/*    */     //   1112: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   1115: invokevirtual Gz : ()V
/*    */     //   1118: goto -> 1159
/*    */     //   1121: aload #5
/*    */     //   1123: dup
/*    */     //   1124: dup
/*    */     //   1125: dup2
/*    */     //   1126: iconst_0
/*    */     //   1127: iconst_0
/*    */     //   1128: invokevirtual fp : (ZZ)V
/*    */     //   1131: getfield FC0 : Lf/eo;
/*    */     //   1134: dup
/*    */     //   1135: aload_0
/*    */     //   1136: getfield Nx0 : F
/*    */     //   1139: dup
/*    */     //   1140: fstore #8
/*    */     //   1142: putfield x : F
/*    */     //   1145: fload #8
/*    */     //   1147: putfield y : F
/*    */     //   1150: getfield He0 : Lf/eo;
/*    */     //   1153: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   1156: invokevirtual Gz : ()V
/*    */     //   1159: iload #7
/*    */     //   1161: aload #4
/*    */     //   1163: aload #5
/*    */     //   1165: getfield Jb : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1168: astore #7
/*    */     //   1170: getfield Vb : F
/*    */     //   1173: fstore #8
/*    */     //   1175: ifeq -> 1182
/*    */     //   1178: iconst_1
/*    */     //   1179: goto -> 1183
/*    */     //   1182: iconst_m1
/*    */     //   1183: i2f
/*    */     //   1184: fstore #9
/*    */     //   1186: iload #6
/*    */     //   1188: aload #4
/*    */     //   1190: fload #8
/*    */     //   1192: fload #9
/*    */     //   1194: fmul
/*    */     //   1195: fstore #4
/*    */     //   1197: getfield EG : F
/*    */     //   1200: fstore #6
/*    */     //   1202: ifeq -> 1209
/*    */     //   1205: iconst_m1
/*    */     //   1206: goto -> 1210
/*    */     //   1209: iconst_1
/*    */     //   1210: i2f
/*    */     //   1211: fstore #8
/*    */     //   1213: aload_1
/*    */     //   1214: aload #7
/*    */     //   1216: fload #6
/*    */     //   1218: fload #8
/*    */     //   1220: fmul
/*    */     //   1221: fload #4
/*    */     //   1223: swap
/*    */     //   1224: fconst_0
/*    */     //   1225: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1228: pop
/*    */     //   1229: aload #5
/*    */     //   1231: invokevirtual tx0 : (Lf/tk;)V
/*    */     //   1234: iinc #3, 1
/*    */     //   1237: goto -> 773
/*    */     //   1240: aload_0
/*    */     //   1241: dup
/*    */     //   1242: getfield N90 : Lf/K70;
/*    */     //   1245: invokevirtual end : ()V
/*    */     //   1248: getfield hl : Lf/Y00;
/*    */     //   1251: invokevirtual end : ()V
/*    */     //   1254: return
/*    */     //   1255: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 124
/*    */     //   #3	-> 128
/*    */     //   #4	-> 228
/*    */     //   #5	-> 234
/*    */     //   #6	-> 444
/*    */     //   #7	-> 471
/*    */     //   #8	-> 492
/*    */     //   #9	-> 496
/*    */     //   #10	-> 503
/*    */     //   #11	-> 508
/*    */     //   #12	-> 533
/*    */     //   #13	-> 570
/*    */     //   #14	-> 579
/*    */     //   #15	-> 602
/*    */     //   #16	-> 606
/*    */     //   #17	-> 609
/*    */     //   #18	-> 625
/*    */     //   #19	-> 631
/*    */     //   #20	-> 762
/*    */     //   #21	-> 775
/*    */     //   #22	-> 897
/*    */     //   #23	-> 928
/*    */     //   #24	-> 1242
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     if (this.cj0)
/*    */       return; 
/*    */     this.cj0 = true;
/*    */     COm1 cOm12;
/*    */     if ((cOm12 = this.AE) != null)
/*    */       cOm12.dispose(); 
/*    */     Y00 y00;
/*    */     if ((y00 = this.hl) != null)
/*    */       y00.dispose(); 
/*    */     UB0.Kg0.fN(new yK0(this));
/*    */     COm1 cOm11;
/*    */     if ((cOm11 = this.Oj) != null)
/*    */       dispose(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */