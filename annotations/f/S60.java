/*  1 */ package f;public final class S60 extends Cc { public QB0 nh0; public eF0 Fl; public final cx0 GI0; public final cx0 Fb; public final cx0 uh; public final cx0 continue; public final cx0 Qt; public final cx0 rz0; public Nh0 S70; public boolean h50; public boolean Cf; public boolean FL0; public boolean Ui; public float LY; public float kB; public float s90; public float Gs; public float OH0; public float nn; public boolean Ad0; public boolean hf0; public final NC0 PH; public boolean Ll; public final void sF() { cx0 cx01; float f2 = (cx01 = this.GI0).dA, f3 = (this.h50 ? (int)this.s90 : false), f1 = f2 - f3; f2 = cx01.zA0; int i = (int)(this.Cf ? (this.nn - this.Gs) : this.nn); f2 -= i; this.Fl.i6(f1, f2); eF0 eF01; if (eF01 = this.Fl instanceof I90) { cx0 cx03, cx02; (cx02 = this.GI0).dA -= f1; this.zA0 -= f2; this.rz0.af = this.af; this.rz0.sf0 = this.sf0; ((c)eF01).U40 = cx03; }  } public boolean ip; public boolean lPt4; public float xz0; public float sx; public float Uw; public float Vj; public boolean ia0; public boolean WY; public float An; public float qr0; public float ks0; public float q0; public boolean kd; public boolean oP; public float IQ; public float Wt; public float TR; public boolean KY; public boolean uy0; public int aF; public S60(eF0 parameF0) { this(); QB0 qB0; this(parameF0, this); } public S60(eF0 parameF0, Mw paramMw) { this(parameF0, (QB0)paramMw.Q1(QB0.class)); } public S60(eF0 parameF0, Mw paramMw, String paramString) { this(parameF0, (QB0)paramMw.Oz0(QB0.class, paramString)); } public S60(eF0 parameF0, QB0 paramQB0) { cx0 cx01; NC0 nC0; this(); this.GI0 = cx01; this(); this.Fb = cx01; this(); this.uh = cx01; this(); this.continue = cx01; this(); this.Qt = cx01; this(); this.rz0 = cx01; this.FL0 = true; this.Ui = true; this(); this.PH = nC0; this.Ll = true; this.ip = true; this.lPt4 = true; this.sx = 1.0F; this.Vj = 1.0F; this.ia0 = true; this.WY = true; this.An = 1.0F; this.kd = true; this.oP = true; this.IQ = 50.0F; this.Wt = 30.0F; this.TR = 200.0F; this.KY = true; this.uy0 = true; this.aF = -1; if (paramQB0 != null) { this.nh0 = paramQB0; mb(parameF0); qp0(150.0F, 150.0F); aX(); Nh0 nh0 = bv0(); Na0(this); vF0(); return; }  throw new IllegalArgumentException("style cannot be null."); } public final void aX() { this(this); vf vf; if (!this.Zg.mB(vf, true)) this.Zg.Com3(vf);  } public final void vF0() { this(this); X x; Na0(x); } public final void Zj0() { float f; if (!this.KY) return;  if (this.kd) { f = nx0.SA0(this.LY, -(f = this.IQ), this.OH0 + f); } else { f = nx0.SA0(this.LY, 0.0F, this.OH0); }  this.LY = f; if (this
/*  2 */       .oP) { f = nx0.SA0(this.kB, -(f = this.IQ), this.nn + f); } else { f = nx0.SA0(this.kB, 0.0F, this.nn); }  this
/*  3 */       .kB = f; } public final void La(float paramFloat) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: fload_1
/*    */     //   4: invokespecial La : (F)V
/*    */     //   7: getfield S70 : Lf/Nh0;
/*    */     //   10: getfield gq : Lf/YG;
/*    */     //   13: getfield Sj0 : Z
/*    */     //   16: istore_2
/*    */     //   17: iconst_0
/*    */     //   18: istore_3
/*    */     //   19: getfield xz0 : F
/*    */     //   22: dup
/*    */     //   23: fstore #4
/*    */     //   25: fconst_0
/*    */     //   26: fcmpl
/*    */     //   27: ifle -> 87
/*    */     //   30: aload_0
/*    */     //   31: getfield Ll : Z
/*    */     //   34: ifeq -> 87
/*    */     //   37: iload_2
/*    */     //   38: ifne -> 87
/*    */     //   41: aload_0
/*    */     //   42: getfield Ad0 : Z
/*    */     //   45: ifne -> 87
/*    */     //   48: aload_0
/*    */     //   49: getfield hf0 : Z
/*    */     //   52: ifne -> 87
/*    */     //   55: aload_0
/*    */     //   56: getfield Uw : F
/*    */     //   59: fload_1
/*    */     //   60: fsub
/*    */     //   61: dup
/*    */     //   62: aload_0
/*    */     //   63: swap
/*    */     //   64: putfield Uw : F
/*    */     //   67: fconst_0
/*    */     //   68: fcmpg
/*    */     //   69: ifgt -> 85
/*    */     //   72: aload_0
/*    */     //   73: fload #4
/*    */     //   75: fload_1
/*    */     //   76: fsub
/*    */     //   77: fconst_0
/*    */     //   78: swap
/*    */     //   79: invokestatic max : (FF)F
/*    */     //   82: putfield xz0 : F
/*    */     //   85: iconst_1
/*    */     //   86: istore_3
/*    */     //   87: aload_0
/*    */     //   88: getfield qr0 : F
/*    */     //   91: fconst_0
/*    */     //   92: fcmpl
/*    */     //   93: ifle -> 258
/*    */     //   96: aload_0
/*    */     //   97: dup
/*    */     //   98: dup2
/*    */     //   99: dup2
/*    */     //   100: dup2
/*    */     //   101: dup2
/*    */     //   102: invokevirtual eB0 : ()V
/*    */     //   105: getfield qr0 : F
/*    */     //   108: aload_0
/*    */     //   109: getfield An : F
/*    */     //   112: fdiv
/*    */     //   113: fstore_3
/*    */     //   114: getfield LY : F
/*    */     //   117: fstore #4
/*    */     //   119: getfield ks0 : F
/*    */     //   122: fload_3
/*    */     //   123: fload_1
/*    */     //   124: fload #4
/*    */     //   126: invokestatic R0 : (FFFF)F
/*    */     //   129: putfield LY : F
/*    */     //   132: getfield kB : F
/*    */     //   135: fstore #4
/*    */     //   137: getfield q0 : F
/*    */     //   140: fload_3
/*    */     //   141: fload_1
/*    */     //   142: fload #4
/*    */     //   144: invokestatic R0 : (FFFF)F
/*    */     //   147: putfield kB : F
/*    */     //   150: invokevirtual Zj0 : ()V
/*    */     //   153: getfield LY : F
/*    */     //   156: dup
/*    */     //   157: fstore_3
/*    */     //   158: aload_0
/*    */     //   159: getfield IQ : F
/*    */     //   162: dup
/*    */     //   163: fstore #4
/*    */     //   165: fneg
/*    */     //   166: dup
/*    */     //   167: fstore #5
/*    */     //   169: fcmpl
/*    */     //   170: ifne -> 178
/*    */     //   173: aload_0
/*    */     //   174: fconst_0
/*    */     //   175: putfield ks0 : F
/*    */     //   178: fload_3
/*    */     //   179: aload_0
/*    */     //   180: getfield OH0 : F
/*    */     //   183: fload #4
/*    */     //   185: fadd
/*    */     //   186: fcmpl
/*    */     //   187: iflt -> 195
/*    */     //   190: aload_0
/*    */     //   191: fconst_0
/*    */     //   192: putfield ks0 : F
/*    */     //   195: aload_0
/*    */     //   196: getfield kB : F
/*    */     //   199: dup
/*    */     //   200: fstore_3
/*    */     //   201: fload #5
/*    */     //   203: fcmpl
/*    */     //   204: ifne -> 212
/*    */     //   207: aload_0
/*    */     //   208: fconst_0
/*    */     //   209: putfield q0 : F
/*    */     //   212: fload_3
/*    */     //   213: aload_0
/*    */     //   214: getfield nn : F
/*    */     //   217: fload #4
/*    */     //   219: fadd
/*    */     //   220: fcmpl
/*    */     //   221: iflt -> 229
/*    */     //   224: aload_0
/*    */     //   225: fconst_0
/*    */     //   226: putfield q0 : F
/*    */     //   229: aload_0
/*    */     //   230: getfield qr0 : F
/*    */     //   233: fload_1
/*    */     //   234: fsub
/*    */     //   235: dup
/*    */     //   236: aload_0
/*    */     //   237: swap
/*    */     //   238: putfield qr0 : F
/*    */     //   241: fconst_0
/*    */     //   242: fcmpg
/*    */     //   243: ifgt -> 256
/*    */     //   246: aload_0
/*    */     //   247: dup
/*    */     //   248: fconst_0
/*    */     //   249: putfield ks0 : F
/*    */     //   252: fconst_0
/*    */     //   253: putfield q0 : F
/*    */     //   256: iconst_1
/*    */     //   257: istore_3
/*    */     //   258: aload_0
/*    */     //   259: getfield ip : Z
/*    */     //   262: ifeq -> 559
/*    */     //   265: aload_0
/*    */     //   266: getfield qr0 : F
/*    */     //   269: fconst_0
/*    */     //   270: fcmpg
/*    */     //   271: ifgt -> 559
/*    */     //   274: iload_2
/*    */     //   275: ifne -> 559
/*    */     //   278: aload_0
/*    */     //   279: getfield Ad0 : Z
/*    */     //   282: ifeq -> 327
/*    */     //   285: aload_0
/*    */     //   286: getfield h50 : Z
/*    */     //   289: ifeq -> 559
/*    */     //   292: aload_0
/*    */     //   293: getfield OH0 : F
/*    */     //   296: aload_0
/*    */     //   297: getfield Fb : Lf/cx0;
/*    */     //   300: getfield af : F
/*    */     //   303: aload_0
/*    */     //   304: getfield uh : Lf/cx0;
/*    */     //   307: getfield af : F
/*    */     //   310: fsub
/*    */     //   311: fdiv
/*    */     //   312: aload_0
/*    */     //   313: getfield GI0 : Lf/cx0;
/*    */     //   316: getfield af : F
/*    */     //   319: ldc_w 0.1
/*    */     //   322: fmul
/*    */     //   323: fcmpl
/*    */     //   324: ifle -> 559
/*    */     //   327: aload_0
/*    */     //   328: getfield hf0 : Z
/*    */     //   331: ifeq -> 376
/*    */     //   334: aload_0
/*    */     //   335: getfield Cf : Z
/*    */     //   338: ifeq -> 559
/*    */     //   341: aload_0
/*    */     //   342: getfield nn : F
/*    */     //   345: aload_0
/*    */     //   346: getfield continue : Lf/cx0;
/*    */     //   349: getfield sf0 : F
/*    */     //   352: aload_0
/*    */     //   353: getfield Qt : Lf/cx0;
/*    */     //   356: getfield sf0 : F
/*    */     //   359: fsub
/*    */     //   360: fdiv
/*    */     //   361: aload_0
/*    */     //   362: getfield GI0 : Lf/cx0;
/*    */     //   365: getfield sf0 : F
/*    */     //   368: ldc_w 0.1
/*    */     //   371: fmul
/*    */     //   372: fcmpl
/*    */     //   373: ifle -> 559
/*    */     //   376: aload_0
/*    */     //   377: getfield s90 : F
/*    */     //   380: dup
/*    */     //   381: fstore #4
/*    */     //   383: aload_0
/*    */     //   384: getfield LY : F
/*    */     //   387: dup
/*    */     //   388: fstore #5
/*    */     //   390: fcmpl
/*    */     //   391: ifeq -> 466
/*    */     //   394: fload #4
/*    */     //   396: fload #5
/*    */     //   398: fcmpg
/*    */     //   399: ifge -> 432
/*    */     //   402: fload #5
/*    */     //   404: fload_1
/*    */     //   405: ldc 200.0
/*    */     //   407: fmul
/*    */     //   408: fload #5
/*    */     //   410: fload #4
/*    */     //   412: fsub
/*    */     //   413: ldc_w 7.0
/*    */     //   416: fmul
/*    */     //   417: fload_1
/*    */     //   418: fmul
/*    */     //   419: invokestatic max : (FF)F
/*    */     //   422: fload #4
/*    */     //   424: fadd
/*    */     //   425: invokestatic min : (FF)F
/*    */     //   428: fstore_3
/*    */     //   429: goto -> 459
/*    */     //   432: fload #5
/*    */     //   434: fload #4
/*    */     //   436: fload_1
/*    */     //   437: ldc 200.0
/*    */     //   439: fmul
/*    */     //   440: fload #4
/*    */     //   442: fload #5
/*    */     //   444: fsub
/*    */     //   445: ldc_w 7.0
/*    */     //   448: fmul
/*    */     //   449: fload_1
/*    */     //   450: fmul
/*    */     //   451: invokestatic max : (FF)F
/*    */     //   454: fsub
/*    */     //   455: invokestatic max : (FF)F
/*    */     //   458: fstore_3
/*    */     //   459: aload_0
/*    */     //   460: fload_3
/*    */     //   461: putfield s90 : F
/*    */     //   464: iconst_1
/*    */     //   465: istore_3
/*    */     //   466: aload_0
/*    */     //   467: getfield Gs : F
/*    */     //   470: dup
/*    */     //   471: fstore #4
/*    */     //   473: aload_0
/*    */     //   474: getfield kB : F
/*    */     //   477: dup
/*    */     //   478: fstore #5
/*    */     //   480: fcmpl
/*    */     //   481: ifeq -> 601
/*    */     //   484: fload #4
/*    */     //   486: fload #5
/*    */     //   488: fcmpg
/*    */     //   489: ifge -> 522
/*    */     //   492: fload #5
/*    */     //   494: fload_1
/*    */     //   495: ldc 200.0
/*    */     //   497: fmul
/*    */     //   498: fload #5
/*    */     //   500: fload #4
/*    */     //   502: fsub
/*    */     //   503: ldc_w 7.0
/*    */     //   506: fmul
/*    */     //   507: fload_1
/*    */     //   508: fmul
/*    */     //   509: invokestatic max : (FF)F
/*    */     //   512: fload #4
/*    */     //   514: fadd
/*    */     //   515: invokestatic min : (FF)F
/*    */     //   518: fstore_3
/*    */     //   519: goto -> 549
/*    */     //   522: fload #5
/*    */     //   524: fload #4
/*    */     //   526: fload_1
/*    */     //   527: ldc 200.0
/*    */     //   529: fmul
/*    */     //   530: fload #4
/*    */     //   532: fload #5
/*    */     //   534: fsub
/*    */     //   535: ldc_w 7.0
/*    */     //   538: fmul
/*    */     //   539: fload_1
/*    */     //   540: fmul
/*    */     //   541: invokestatic max : (FF)F
/*    */     //   544: fsub
/*    */     //   545: invokestatic max : (FF)F
/*    */     //   548: fstore_3
/*    */     //   549: aload_0
/*    */     //   550: fload_3
/*    */     //   551: putfield Gs : F
/*    */     //   554: iconst_1
/*    */     //   555: istore_3
/*    */     //   556: goto -> 601
/*    */     //   559: aload_0
/*    */     //   560: getfield s90 : F
/*    */     //   563: aload_0
/*    */     //   564: getfield LY : F
/*    */     //   567: dup
/*    */     //   568: fstore #4
/*    */     //   570: fcmpl
/*    */     //   571: ifeq -> 580
/*    */     //   574: aload_0
/*    */     //   575: fload #4
/*    */     //   577: putfield s90 : F
/*    */     //   580: aload_0
/*    */     //   581: getfield Gs : F
/*    */     //   584: aload_0
/*    */     //   585: getfield kB : F
/*    */     //   588: dup
/*    */     //   589: fstore #4
/*    */     //   591: fcmpl
/*    */     //   592: ifeq -> 601
/*    */     //   595: aload_0
/*    */     //   596: fload #4
/*    */     //   598: putfield Gs : F
/*    */     //   601: iload_2
/*    */     //   602: ifne -> 903
/*    */     //   605: aload_0
/*    */     //   606: getfield kd : Z
/*    */     //   609: ifeq -> 754
/*    */     //   612: aload_0
/*    */     //   613: getfield h50 : Z
/*    */     //   616: ifeq -> 754
/*    */     //   619: aload_0
/*    */     //   620: getfield LY : F
/*    */     //   623: dup
/*    */     //   624: fstore_2
/*    */     //   625: fconst_0
/*    */     //   626: fcmpg
/*    */     //   627: ifge -> 682
/*    */     //   630: aload_0
/*    */     //   631: dup
/*    */     //   632: dup2
/*    */     //   633: invokevirtual eB0 : ()V
/*    */     //   636: getfield LY : F
/*    */     //   639: fstore_2
/*    */     //   640: getfield Wt : F
/*    */     //   643: fstore_3
/*    */     //   644: getfield TR : F
/*    */     //   647: fload_3
/*    */     //   648: fsub
/*    */     //   649: fload_2
/*    */     //   650: fneg
/*    */     //   651: fmul
/*    */     //   652: aload_0
/*    */     //   653: getfield IQ : F
/*    */     //   656: fdiv
/*    */     //   657: fload_3
/*    */     //   658: fadd
/*    */     //   659: fload_1
/*    */     //   660: fmul
/*    */     //   661: fload_2
/*    */     //   662: fadd
/*    */     //   663: dup
/*    */     //   664: aload_0
/*    */     //   665: swap
/*    */     //   666: putfield LY : F
/*    */     //   669: fconst_0
/*    */     //   670: fcmpl
/*    */     //   671: ifle -> 752
/*    */     //   674: aload_0
/*    */     //   675: fconst_0
/*    */     //   676: putfield LY : F
/*    */     //   679: goto -> 752
/*    */     //   682: fload_2
/*    */     //   683: aload_0
/*    */     //   684: getfield OH0 : F
/*    */     //   687: fcmpl
/*    */     //   688: ifle -> 754
/*    */     //   691: aload_0
/*    */     //   692: dup
/*    */     //   693: invokevirtual eB0 : ()V
/*    */     //   696: getfield LY : F
/*    */     //   699: dup
/*    */     //   700: fstore_2
/*    */     //   701: aload_0
/*    */     //   702: dup
/*    */     //   703: getfield Wt : F
/*    */     //   706: fstore_3
/*    */     //   707: getfield TR : F
/*    */     //   710: fload_3
/*    */     //   711: fsub
/*    */     //   712: aload_0
/*    */     //   713: getfield OH0 : F
/*    */     //   716: dup
/*    */     //   717: fstore #4
/*    */     //   719: fload_2
/*    */     //   720: fsub
/*    */     //   721: fneg
/*    */     //   722: fmul
/*    */     //   723: aload_0
/*    */     //   724: getfield IQ : F
/*    */     //   727: fdiv
/*    */     //   728: fload_3
/*    */     //   729: fadd
/*    */     //   730: fload_1
/*    */     //   731: fmul
/*    */     //   732: fsub
/*    */     //   733: dup
/*    */     //   734: fstore_2
/*    */     //   735: fload #4
/*    */     //   737: aload_0
/*    */     //   738: fload_2
/*    */     //   739: putfield LY : F
/*    */     //   742: fcmpg
/*    */     //   743: ifge -> 752
/*    */     //   746: aload_0
/*    */     //   747: fload #4
/*    */     //   749: putfield LY : F
/*    */     //   752: iconst_1
/*    */     //   753: istore_3
/*    */     //   754: aload_0
/*    */     //   755: getfield oP : Z
/*    */     //   758: ifeq -> 903
/*    */     //   761: aload_0
/*    */     //   762: getfield Cf : Z
/*    */     //   765: ifeq -> 903
/*    */     //   768: aload_0
/*    */     //   769: getfield kB : F
/*    */     //   772: dup
/*    */     //   773: fstore_2
/*    */     //   774: fconst_0
/*    */     //   775: fcmpg
/*    */     //   776: ifge -> 831
/*    */     //   779: aload_0
/*    */     //   780: dup
/*    */     //   781: dup2
/*    */     //   782: invokevirtual eB0 : ()V
/*    */     //   785: getfield kB : F
/*    */     //   788: fstore_2
/*    */     //   789: getfield Wt : F
/*    */     //   792: fstore_3
/*    */     //   793: getfield TR : F
/*    */     //   796: fload_3
/*    */     //   797: fsub
/*    */     //   798: fload_2
/*    */     //   799: fneg
/*    */     //   800: fmul
/*    */     //   801: aload_0
/*    */     //   802: getfield IQ : F
/*    */     //   805: fdiv
/*    */     //   806: fload_3
/*    */     //   807: fadd
/*    */     //   808: fload_1
/*    */     //   809: fmul
/*    */     //   810: fload_2
/*    */     //   811: fadd
/*    */     //   812: dup
/*    */     //   813: aload_0
/*    */     //   814: swap
/*    */     //   815: putfield kB : F
/*    */     //   818: fconst_0
/*    */     //   819: fcmpl
/*    */     //   820: ifle -> 901
/*    */     //   823: aload_0
/*    */     //   824: fconst_0
/*    */     //   825: putfield kB : F
/*    */     //   828: goto -> 901
/*    */     //   831: fload_2
/*    */     //   832: aload_0
/*    */     //   833: getfield nn : F
/*    */     //   836: fcmpl
/*    */     //   837: ifle -> 903
/*    */     //   840: aload_0
/*    */     //   841: dup
/*    */     //   842: invokevirtual eB0 : ()V
/*    */     //   845: getfield kB : F
/*    */     //   848: dup
/*    */     //   849: fstore_2
/*    */     //   850: aload_0
/*    */     //   851: dup
/*    */     //   852: getfield Wt : F
/*    */     //   855: fstore_3
/*    */     //   856: getfield TR : F
/*    */     //   859: fload_3
/*    */     //   860: fsub
/*    */     //   861: aload_0
/*    */     //   862: getfield nn : F
/*    */     //   865: dup
/*    */     //   866: fstore #4
/*    */     //   868: fload_2
/*    */     //   869: fsub
/*    */     //   870: fneg
/*    */     //   871: fmul
/*    */     //   872: aload_0
/*    */     //   873: getfield IQ : F
/*    */     //   876: fdiv
/*    */     //   877: fload_3
/*    */     //   878: fadd
/*    */     //   879: fload_1
/*    */     //   880: fmul
/*    */     //   881: fsub
/*    */     //   882: dup
/*    */     //   883: fstore_1
/*    */     //   884: fload #4
/*    */     //   886: aload_0
/*    */     //   887: fload_1
/*    */     //   888: putfield kB : F
/*    */     //   891: fcmpg
/*    */     //   892: ifge -> 901
/*    */     //   895: aload_0
/*    */     //   896: fload #4
/*    */     //   898: putfield kB : F
/*    */     //   901: iconst_1
/*    */     //   902: istore_3
/*    */     //   903: iload_3
/*    */     //   904: ifeq -> 932
/*    */     //   907: aload_0
/*    */     //   908: getfield ih0 : Lf/Zy;
/*    */     //   911: dup
/*    */     //   912: astore_0
/*    */     //   913: ifnull -> 932
/*    */     //   916: aload_0
/*    */     //   917: getfield Pp : Z
/*    */     //   920: ifeq -> 932
/*    */     //   923: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   926: getfield AW : Lf/MJ0;
/*    */     //   929: invokevirtual df0 : ()V
/*    */     //   932: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 10
/*    */     //   #2	-> 13
/*    */     //   #3	-> 19
/*    */     //   #4	-> 461
/*    */     //   #5	-> 467
/*    */     //   #6	-> 551
/*    */     //   #7	-> 560
/*    */     //   #8	-> 577
/*    */     //   #9	-> 581
/*    */     //   #10	-> 598
/*    */     //   #11	-> 606
/*    */     //   #12	-> 676
/*    */     //   #13	-> 684
/*    */     //   #14	-> 749
/*    */     //   #15	-> 755
/*    */     //   #16	-> 825
/*    */     //   #17	-> 833
/*    */     //   #18	-> 898
/*    */     //   #19	-> 908
/*    */     //   #20	-> 917
/*    */     //   #21	-> 923
/*    */     //   #22	-> 926
/*  3 */     //   #23	-> 929 } public final void QY() { boolean bool1, bool2; ES eS1 = qB0.Qn0, eS3 = qB0.T30; float f2 = 0.0F, f3 = 0.0F, f4 = 0.0F, f5 = 0.0F; QB0 qB0; ES eS2; if ((eS2 = (qB0 = this.nh0).ch0) != null) { f2 = ((uB)eS2).e; f3 = ((uB)eS2).jM; f4 = ((uB)eS2).Ji;
/*  4 */       f5 = ((uB)eS2).Xm0; }
/*  5 */      float f1 = this.ZP;
/*  6 */     float f6 = this.xr0;
/*  7 */     f4 = f1 - f2 - f3; float f7 = (f6 -= f4) - f5; this.GI0.jG(f2, f5, f4, f7); if (this.Fl == null) return;  f4 = 0.0F; f7 = 0.0F; if (eS1 != null)
/*  8 */       f4 = ((uB)eS1).B90;  ES eS4;
/*  9 */     if ((eS4 = this.nh0.xf0) != null)
/*    */     {
/* 11 */       f4 = Math.max(f4, ((uB)eS4).B90); }  if (eS3 != null)
/* 12 */       f7 = ((uB)eS3).uz; 
/* 13 */     if ((eS4 = this.nh0.Ro) != null)
/*    */     {
/* 15 */       f7 = Math.max(f7, ((uB)eS4).uz); }  eF0 eF02; if (eF02 = this.Fl instanceof vh) { f8 = ((vh)eF02).DB0(); f9 = ((vh)eF02).d6(); }
/* 16 */     else { f8 = f8.ZP;
/* 17 */       f9 = f8.xr0; }  cx0 cx01; float f10; if (f8 > (
/* 18 */       f10 = (cx01 = this.GI0).af)) { bool1 = true; } else { bool1 = false; }  this.h50 = bool1; float f11; if (f9 > (f11 = cx01.sf0)) { bool2 = true; } else { bool2 = false; }  this.Cf = bool2; if (bool2) { cx01.af = f10 -= f7; if (!this.FL0) cx01.dA += f7;  if (!bool1 && f8 > f10) this.h50 = true;  }  if (this.h50) { cx01.sf0 = f10 = f11 - f4; if (this.Ui) cx01.zA0 += f4;  this.Cf = true; cx01.af -= f7; if (!bool2 && f9 > f10 && !this.FL0) cx01.dA += f7;  }  float f8 = Math.max(cx01.af, f8); this.OH0 = f10 = f8 - (cx01 = this.GI0).af; float f9; this.nn = (f9 = Math.max(this.GI0.sf0, f9)) - cx01.sf0; this
/* 19 */       .LY = nx0.SA0(this.LY, 0.0F, f10);
/*    */     
/* 21 */     this.kB = nx0.SA0(this.kB, 0.0F, this.nn);
/* 22 */     if (this.h50) if (eS1 != null) { f10 = (cx01 = this.GI0).dA; if (!this.Ui) f5 = f6 - f4;  this.Fb.jG(f10, f5, cx01.af, f4); if (this.uy0) { this.uh
/*    */             
/* 24 */             .af = Math.max(((uB)eS1).uz, (int)(this.Fb.af * this.GI0.af / f8)); } else { this.uh
/*    */             
/* 26 */             .af = ((uB)eS1).uz; }  cx0 cx02; if ((cx02 = this.uh).af > f8) cx02.af = 0.0F;  cx02
/*    */           
/* 28 */           .sf0 = ((uB)eS1).B90; float f = this.Fb.dA; f5 = this.Fb.af - cx02.af;
/* 29 */         if ((f6 = this.OH0) == 0.0F) { f6 = 0.0F; } else { f6 = nx0.SA0(this.LY / f6, 0.0F, 1.0F); }  cx02
/* 30 */           .dA = f + (int)(f5 * f6); this.uh.zA0 = this.Fb.zA0; } else { this.Fb.jG(0.0F, 0.0F, 0.0F, 0.0F); this.uh.jG(0.0F, 0.0F, 0.0F, 0.0F); }   if (this.Cf) if (eS3 != null) { if (this.FL0) { f12 = f1 - f3 - f7; } else { f12 = f2; }  cx0 cx03; f5 = (cx03 = this.GI0).zA0; float f12 = cx03.sf0; this.continue.jG(f12, f5, f7, f12); cx0 cx02; (cx02 = this.Qt)
/*    */           
/* 32 */           .af = ((uB)(eS3 = eS3)).uz; if (this.uy0) { cx02
/*    */             
/* 34 */             .sf0 = Math.max(((uB)eS3).B90, (int)(this.continue.sf0 * this.GI0.sf0 / f9)); } else { cx02
/*    */             
/* 36 */             .sf0 = ((uB)eS3).B90; }  if ((cx02 = this.Qt).sf0 > f9) cx02.sf0 = 0.0F;  if (this.FL0)
/* 37 */           f2 = f1 - f3 - ((uB)eS3).uz;  cx02
/* 38 */           .dA = f2; f1 = this.continue.zA0; float f13 = this.continue.sf0 - cx02.sf0; f2 = 1.0F;
/* 39 */         if ((f3 = this.nn) == 0.0F) { f3 = 0.0F; } else { f3 = nx0.SA0(this.kB / f3, 0.0F, 1.0F); }  cx02
/* 40 */           .zA0 = f1 + (int)((f2 - f3) * f13); } else { this.continue.jG(0.0F, 0.0F, 0.0F, 0.0F); this.Qt.jG(0.0F, 0.0F, 0.0F, 0.0F); }   sF(); eF0 eF01; if (eF01 = this.Fl instanceof vh) { eF01.qp0(f8, f9); ((vh)this.Fl).kn0(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final float DB0() {
/*    */     float f = 0.0F;
/*    */     eF0 eF01;
/*    */     if (eF01 = this.Fl instanceof vh) {
/*    */       f = ((vh)eF01).DB0();
/*    */     } else if (eF01 != null) {
/*    */       f = eF01.ZP;
/*    */     } 
/*    */     ES eS;
/*    */     if ((eS = this.nh0.ch0) != null) {
/*    */       uB uB;
/*    */       f = Math.max(f + (uB = (uB)eS).e + uB.jM, uB.uz);
/*    */     } 
/*    */     if (this.Cf) {
/*    */       float f1 = 0.0F;
/*    */       QB0 qB0;
/*    */       ES eS2;
/*    */       if ((eS2 = (qB0 = this.nh0).T30) != null)
/*    */         f1 = ((uB)eS2).uz; 
/*    */       ES eS1;
/*    */       if ((eS1 = qB0.Ro) != null)
/*    */         f1 = Math.max(f1, ((uB)eS1).uz); 
/*    */       f += f1;
/*    */     } 
/*    */     return f;
/*    */   }
/*    */   
/*    */   public final float d6() {
/*    */     float f = 0.0F;
/*    */     eF0 eF01;
/*    */     if (eF01 = this.Fl instanceof vh) {
/*    */       f = ((vh)eF01).d6();
/*    */     } else if (eF01 != null) {
/*    */       f = eF01.xr0;
/*    */     } 
/*    */     ES eS;
/*    */     if ((eS = this.nh0.ch0) != null) {
/*    */       uB uB;
/*    */       f = Math.max(f + (uB = (uB)eS).Ji + uB.Xm0, uB.B90);
/*    */     } 
/*    */     if (this.h50) {
/*    */       float f1 = 0.0F;
/*    */       QB0 qB0;
/*    */       ES eS2;
/*    */       if ((eS2 = (qB0 = this.nh0).Qn0) != null)
/*    */         f1 = ((uB)eS2).B90; 
/*    */       ES eS1;
/*    */       if ((eS1 = qB0.xf0) != null)
/*    */         f1 = Math.max(f1, ((uB)eS1).B90); 
/*    */       f += f1;
/*    */     } 
/*    */     return f;
/*    */   }
/*    */   
/*    */   public final float OI() {
/*    */     return 0.0F;
/*    */   }
/*    */   
/*    */   public final float Mb() {
/*    */     return 0.0F;
/*    */   }
/*    */   
/*    */   public final void mb(eF0 parameF0) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.Fl) != this) {
/*    */       if (eF01 != null)
/*    */         Td(eF01, true); 
/*    */       this.Fl = parameF0;
/*    */       if (parameF0 != null)
/*    */         super.gx0(parameF0); 
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("widget cannot be the ScrollPane.");
/*    */   }
/*    */   
/*    */   public final void gx0(eF0 parameF0) {
/*    */     throw new UnsupportedOperationException("Use ScrollPane#setWidget.");
/*    */   }
/*    */   
/*    */   public final boolean Td(eF0 parameF0, boolean paramBoolean) {
/*    */     if (parameF0 != null) {
/*    */       if (parameF0 != this.Fl)
/*    */         return false; 
/*    */       this.Fl = null;
/*    */       return super.Td(parameF0, paramBoolean);
/*    */     } 
/*    */     throw new IllegalArgumentException("actor cannot be null.");
/*    */   }
/*    */   
/*    */   public final eF0 PA(int paramInt, boolean paramBoolean) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = super.PA(paramInt, paramBoolean)) == this.Fl)
/*    */       this.Fl = null; 
/*    */     return eF01;
/*    */   }
/*    */   
/*    */   public final eF0 QI0(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*    */     if (paramFloat1 < 0.0F || paramFloat1 >= this.ZP || paramFloat2 < 0.0F || paramFloat2 >= this.xr0)
/*    */       return null; 
/*    */     if (paramBoolean && this.iG0 == i80.s0 && this.Yo0) {
/*    */       if (this.h50 && this.Ad0 && this.Fb.ob0(paramFloat1, paramFloat2))
/*    */         return this; 
/*    */       if (this.Cf && this.hf0 && this.continue.ob0(paramFloat1, paramFloat2))
/*    */         return this; 
/*    */     } 
/*    */     return super.QI0(paramFloat1, paramFloat2, paramBoolean);
/*    */   }
/*    */   
/*    */   public final Nh0 bv0() {
/*    */     return new Nh0(this);
/*    */   }
/*    */   
/*    */   public final void eB0() {
/*    */     this.xz0 = this.sx;
/*    */     this.Uw = this.Vj;
/*    */   }
/*    */   
/*    */   public final void cD(JX paramJX, float paramFloat) {
/*    */     boolean bool;
/*    */     if (this.Fl == null)
/*    */       return; 
/*    */     kn0();
/*    */     Matrix4 matrix42 = Ug();
/*    */     Matrix4 matrix43 = paramJX.q0;
/*    */     this.g0.getClass();
/*    */     this.g0.Qw(matrix43.Z0);
/*    */     if (paramJX.V10)
/*    */       paramJX.ot(); 
/*    */     paramJX.q0.getClass();
/*    */     paramJX.q0.Qw(matrix42.Z0);
/*    */     if (paramJX.V10)
/*    */       paramJX.A6(); 
/*    */     if (this.h50) {
/*    */       cx0 cx02 = this.uh;
/*    */       float f8 = this.Fb.dA, f9 = this.Fb.af - cx02.af;
/*    */       float f10;
/*    */       if ((f10 = this.OH0) == 0.0F) {
/*    */         f10 = 0.0F;
/*    */       } else {
/*    */         f10 = nx0.SA0(this.s90 / f10, 0.0F, 1.0F);
/*    */       } 
/*    */       cx02.dA = f8 + (int)(f9 * f10);
/*    */     } 
/*    */     if (this.Cf) {
/*    */       cx0 cx02 = this.Qt;
/*    */       float f8 = this.continue.zA0, f9 = this.continue.sf0 - cx02.sf0, f10 = 1.0F;
/*    */       float f11;
/*    */       if ((f11 = this.nn) == 0.0F) {
/*    */         f11 = 0.0F;
/*    */       } else {
/*    */         f11 = nx0.SA0(this.Gs / f11, 0.0F, 1.0F);
/*    */       } 
/*    */       cx02.zA0 = f8 + (int)((f10 - f11) * f9);
/*    */     } 
/*    */     sF();
/*    */     Color color;
/*    */     float f2 = (color = this.As0).a * paramFloat;
/*    */     if (this.nh0.ch0 != null) {
/*    */       float f8 = color.r, f9 = color.g, f10 = color.b;
/*    */       paramJX.implements(f8, f9, f10, f2);
/*    */       f8 = this.ZP;
/*    */       f9 = this.xr0;
/*    */       this.nh0.ch0.JD(paramJX, 0.0F, 0.0F, f8, f9);
/*    */     } 
/*    */     paramJX.ot();
/*    */     cx0 cx01;
/*    */     float f5 = (cx01 = this.GI0).dA, f6 = this.GI0.zA0, f4 = cx01.sf0;
/*    */     float f7;
/*    */     Zy zy;
/*    */     if ((f7 = this.GI0.af) <= 0.0F || f4 <= 0.0F || (zy = this.ih0) == null) {
/*    */       bool = false;
/*    */     } else {
/*    */       cx03.dA = f5;
/*    */       cx03.zA0 = f6;
/*    */       cx03.af = f7;
/*    */       cx0 cx03;
/*    */       (cx03 = cx0.Ot0).sf0 = bool;
/*    */       Matrix4 matrix4 = ((JX)zy.Fv0).q0;
/*    */       zy.MT.DR(matrix4, cx03, cx02);
/*    */       cx0 cx02;
/*    */       if (Ye0.lf0(cx02 = (cx0)Lp0.vu0(cx0.class).obtain())) {
/*    */         bool = true;
/*    */       } else {
/*    */         Lp0.Lj0(bool);
/*    */         bool = false;
/*    */       } 
/*    */     } 
/*    */     if (bool) {
/*    */       Oi(paramJX, paramFloat);
/*    */       paramJX.ot();
/*    */       Lp0.Lj0(Ye0.Kw0());
/*    */     } 
/*    */     paramFloat = color.r;
/*    */     float f3 = color.g;
/*    */     f5 = color.b;
/*    */     paramJX.implements(paramFloat, f3, f5, f2);
/*    */     if (this.Ll)
/*    */       f2 = W2.Vi0.kb(this.xz0 / this.sx) * f2; 
/*    */     paramFloat = color.r;
/*    */     float f1 = color.g;
/*    */     f3 = color.b;
/*    */     if (f2 > 0.0F) {
/*    */       boolean bool1, bool2;
/*    */       paramJX.implements(paramFloat, f1, f3, f2);
/*    */       if (this.h50 && this.uh.af > 0.0F) {
/*    */         bool1 = true;
/*    */       } else {
/*    */         bool1 = false;
/*    */       } 
/*    */       if (this.Cf && this.Qt.sf0 > 0.0F) {
/*    */         bool2 = true;
/*    */       } else {
/*    */         bool2 = false;
/*    */       } 
/*    */       ES eS;
/*    */       if (bool1 && bool2 && (eS = this.nh0.YA) != null) {
/*    */         cx0 cx02;
/*    */         float f = (cx02 = this.Fb).dA + cx02.af;
/*    */         f3 = this.Fb.zA0;
/*    */         f5 = this.continue.af;
/*    */         f6 = this.continue.zA0;
/*    */         eS.JD(paramJX, f, f3, f5, f6);
/*    */       } 
/*    */       if (bool1) {
/*    */         ES eS1;
/*    */         if ((eS1 = this.nh0.xf0) != null) {
/*    */           float f8 = this.Fb.dA, f9 = this.Fb.zA0;
/*    */           f3 = this.Fb.af;
/*    */           f5 = this.Fb.sf0;
/*    */           eS1.JD(paramJX, f8, f9, f3, f5);
/*    */         } 
/*    */         if ((eS1 = this.nh0.Qn0) != null) {
/*    */           float f8 = this.uh.dA, f9 = this.uh.zA0;
/*    */           f3 = this.uh.af;
/*    */           f5 = this.uh.sf0;
/*    */           eS1.JD(paramJX, f8, f9, f3, f5);
/*    */         } 
/*    */       } 
/*    */       if (bool2) {
/*    */         ES eS1;
/*    */         if ((eS1 = this.nh0.Ro) != null) {
/*    */           float f8 = this.continue.dA, f9 = this.continue.zA0, f10 = this.continue.af;
/*    */           f3 = this.continue.sf0;
/*    */           eS1.JD(paramJX, f8, f9, f10, f3);
/*    */         } 
/*    */         if ((eS1 = this.nh0.T30) != null) {
/*    */           float f8 = this.Qt.dA, f9 = this.Qt.zA0, f10 = this.Qt.af;
/*    */           f3 = this.Qt.sf0;
/*    */           eS1.JD(paramJX, f8, f9, f10, f3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     Matrix4 matrix41 = this.g0;
/*    */     if (paramJX.V10)
/*    */       paramJX.ot(); 
/*    */     paramJX.q0.getClass();
/*    */     paramJX.q0.Qw(this.Z0);
/*    */     if (paramJX.V10)
/*    */       paramJX.A6(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */