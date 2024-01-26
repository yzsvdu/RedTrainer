/*  1 */ package f;public final class H30 implements iq0 { public final int ud0; public vF0 i3; public vF0 yF; public int d60; public int u2; public final int CH; public static void BL0(H30 paramH30, boolean paramBoolean) { if (!paramH30.Ml0) { if (paramBoolean) { paramH30
/*  2 */           .kV += 90.0F; } else { paramH30.kV -= 90.0F; }  if (nx0.JC0(360.0F, paramH30.kV) || paramH30.kV > 360.0F) paramH30.kV = 0.0F;  float f; if ((f = paramH30.kV) < 0.0F) paramH30.kV = f + 360.0F;  }  } public final int GE; public float kV; public boolean Ml0; public final Texture nF0; public final Texture of; public H30(Vf paramVf, int paramInt, ZH paramZH1, ZH paramZH2) { Texture texture1; Texture texture2; this.kV = 0.0F; this.Ml0 = false; this.ud0 = paramInt; int i = paramInt % 4 + 2; this.u2 = paramInt = paramInt / 4 + 1; this.CH = i; this.GE = paramInt; this(paramZH1); this.nF0 = new Texture(); this(paramZH2); this.of = new Texture(); (this.i3 = new vF0()).l80(); this.i3.ZH0().Yo(new Texture[] { texture1 }); paramVf.J8(this.i3); (this.yF = new vF0()).l80(); this.yF.ZH0().Yo(new Texture[] { texture2 }); paramVf.J8(this.yF); pG(); } public final void update() { int i = this.d60, j = this.u2; float f = this.js.CJ; int k = 0; int m = this.js.nH0(); Vf vf;
/*  3 */     if (this == (vf = this.js)
/*  4 */       .Fu0) {
/*  5 */       i = vf.DJ0;
/*  6 */       j = vf.U9;
/*  7 */       f = vf.CJ * 1.1F; k = (int)((vf.CJ * -32) * 0.05D);
/*  8 */     }  int n = 32;
/*  9 */     n = vf.CJ * n;
/* 10 */     this.i3.Tm(n, vf.CJ * 32); i = this.js.RS(); j = i * 32;
/* 11 */     i = j * this.js.CJ + i + k + m;
/* 12 */     n = this.js.e3(); int i1 = j * 32;
/*    */     
/* 14 */     this.i3.ME(i, i1 * this.js.CJ + n + k);
/*    */     
/* 16 */     this.i3.TS
/* 17 */       .V1 = f;
/*    */     
/* 19 */     this.i3.TS.JW = this.kV;
/* 20 */     i = 32;
/* 21 */     i = this.js.CJ * i;
/* 22 */     this.yF.Tm(i, this.js.CJ * 32); i = this.js.RS();
/* 23 */     i = j * this.js.CJ + i + k + m;
/* 24 */     j = this.js.e3();
/*    */     
/* 26 */     this.yF.ME(i, i1 * this.js.CJ + j + k);
/*    */     
/* 28 */     rH
/* 29 */       .V1 = f;
/*    */     
/* 31 */     rH.JW = this.kV;
/*    */     
/*    */     rH rH;
/* 34 */     (rH = this.yF.TS).FB0(this.js.NJ0); }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     this.nF0.dispose();
/*    */     this.of.dispose();
/*    */   }
/*    */   
/*    */   public final void pG() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield js : Lf/Vf;
/*    */     //   4: getfield i5 : I
/*    */     //   7: dup
/*    */     //   8: istore_1
/*    */     //   9: ifne -> 115
/*    */     //   12: aload_0
/*    */     //   13: getfield ud0 : I
/*    */     //   16: dup
/*    */     //   17: istore_1
/*    */     //   18: iconst_1
/*    */     //   19: if_icmpeq -> 96
/*    */     //   22: iload_1
/*    */     //   23: iconst_5
/*    */     //   24: if_icmpeq -> 80
/*    */     //   27: iload_1
/*    */     //   28: bipush #8
/*    */     //   30: if_icmpeq -> 64
/*    */     //   33: iload_1
/*    */     //   34: bipush #10
/*    */     //   36: if_icmpeq -> 47
/*    */     //   39: aload_0
/*    */     //   40: iconst_1
/*    */     //   41: putfield Ml0 : Z
/*    */     //   44: goto -> 643
/*    */     //   47: aload_0
/*    */     //   48: dup
/*    */     //   49: dup
/*    */     //   50: bipush #6
/*    */     //   52: putfield d60 : I
/*    */     //   55: iconst_2
/*    */     //   56: putfield u2 : I
/*    */     //   59: ldc 180.0
/*    */     //   61: goto -> 109
/*    */     //   64: aload_0
/*    */     //   65: dup
/*    */     //   66: dup
/*    */     //   67: iconst_5
/*    */     //   68: putfield d60 : I
/*    */     //   71: iconst_5
/*    */     //   72: putfield u2 : I
/*    */     //   75: ldc 90.0
/*    */     //   77: goto -> 109
/*    */     //   80: aload_0
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: iconst_1
/*    */     //   84: putfield d60 : I
/*    */     //   87: iconst_1
/*    */     //   88: putfield u2 : I
/*    */     //   91: ldc 90.0
/*    */     //   93: goto -> 109
/*    */     //   96: aload_0
/*    */     //   97: dup
/*    */     //   98: dup
/*    */     //   99: iconst_1
/*    */     //   100: putfield d60 : I
/*    */     //   103: iconst_4
/*    */     //   104: putfield u2 : I
/*    */     //   107: ldc 270.0
/*    */     //   109: putfield kV : F
/*    */     //   112: goto -> 643
/*    */     //   115: iload_1
/*    */     //   116: iconst_1
/*    */     //   117: if_icmpne -> 263
/*    */     //   120: aload_0
/*    */     //   121: getfield ud0 : I
/*    */     //   124: dup
/*    */     //   125: istore_1
/*    */     //   126: ifeq -> 247
/*    */     //   129: iload_1
/*    */     //   130: iconst_1
/*    */     //   131: if_icmpeq -> 231
/*    */     //   134: iload_1
/*    */     //   135: iconst_4
/*    */     //   136: if_icmpeq -> 64
/*    */     //   139: iload_1
/*    */     //   140: iconst_5
/*    */     //   141: if_icmpeq -> 214
/*    */     //   144: iload_1
/*    */     //   145: bipush #9
/*    */     //   147: if_icmpeq -> 198
/*    */     //   150: iload_1
/*    */     //   151: bipush #13
/*    */     //   153: if_icmpeq -> 182
/*    */     //   156: iload_1
/*    */     //   157: bipush #15
/*    */     //   159: if_icmpeq -> 165
/*    */     //   162: goto -> 39
/*    */     //   165: aload_0
/*    */     //   166: dup
/*    */     //   167: dup
/*    */     //   168: bipush #6
/*    */     //   170: putfield d60 : I
/*    */     //   173: iconst_2
/*    */     //   174: putfield u2 : I
/*    */     //   177: ldc 270.0
/*    */     //   179: goto -> 109
/*    */     //   182: aload_0
/*    */     //   183: dup
/*    */     //   184: dup
/*    */     //   185: iconst_4
/*    */     //   186: putfield d60 : I
/*    */     //   189: iconst_0
/*    */     //   190: putfield u2 : I
/*    */     //   193: ldc 180.0
/*    */     //   195: goto -> 109
/*    */     //   198: aload_0
/*    */     //   199: dup
/*    */     //   200: dup
/*    */     //   201: iconst_2
/*    */     //   202: putfield d60 : I
/*    */     //   205: iconst_0
/*    */     //   206: putfield u2 : I
/*    */     //   209: ldc 270.0
/*    */     //   211: goto -> 109
/*    */     //   214: aload_0
/*    */     //   215: dup
/*    */     //   216: dup
/*    */     //   217: bipush #6
/*    */     //   219: putfield d60 : I
/*    */     //   222: iconst_4
/*    */     //   223: putfield u2 : I
/*    */     //   226: ldc 180.0
/*    */     //   228: goto -> 109
/*    */     //   231: aload_0
/*    */     //   232: dup
/*    */     //   233: dup
/*    */     //   234: iconst_1
/*    */     //   235: putfield d60 : I
/*    */     //   238: iconst_3
/*    */     //   239: putfield u2 : I
/*    */     //   242: ldc 270.0
/*    */     //   244: goto -> 109
/*    */     //   247: aload_0
/*    */     //   248: dup
/*    */     //   249: dup
/*    */     //   250: iconst_3
/*    */     //   251: putfield d60 : I
/*    */     //   254: iconst_5
/*    */     //   255: putfield u2 : I
/*    */     //   258: ldc 180.0
/*    */     //   260: goto -> 109
/*    */     //   263: iload_1
/*    */     //   264: iconst_2
/*    */     //   265: if_icmpne -> 437
/*    */     //   268: aload_0
/*    */     //   269: getfield ud0 : I
/*    */     //   272: dup
/*    */     //   273: istore_1
/*    */     //   274: ifeq -> 96
/*    */     //   277: iload_1
/*    */     //   278: tableswitch default -> 324, 6 -> 421, 7 -> 406, 8 -> 391, 9 -> 376, 10 -> 360, 11 -> 344, 12 -> 327, 13 -> 47
/*    */     //   324: goto -> 39
/*    */     //   327: aload_0
/*    */     //   328: dup
/*    */     //   329: dup
/*    */     //   330: bipush #6
/*    */     //   332: putfield d60 : I
/*    */     //   335: iconst_3
/*    */     //   336: putfield u2 : I
/*    */     //   339: ldc 270.0
/*    */     //   341: goto -> 109
/*    */     //   344: aload_0
/*    */     //   345: dup
/*    */     //   346: dup
/*    */     //   347: iconst_3
/*    */     //   348: putfield d60 : I
/*    */     //   351: iconst_5
/*    */     //   352: putfield u2 : I
/*    */     //   355: ldc 90.0
/*    */     //   357: goto -> 109
/*    */     //   360: aload_0
/*    */     //   361: dup
/*    */     //   362: dup
/*    */     //   363: iconst_3
/*    */     //   364: putfield d60 : I
/*    */     //   367: iconst_0
/*    */     //   368: putfield u2 : I
/*    */     //   371: ldc 90.0
/*    */     //   373: goto -> 109
/*    */     //   376: aload_0
/*    */     //   377: dup
/*    */     //   378: dup
/*    */     //   379: iconst_5
/*    */     //   380: putfield d60 : I
/*    */     //   383: iconst_0
/*    */     //   384: putfield u2 : I
/*    */     //   387: fconst_0
/*    */     //   388: goto -> 109
/*    */     //   391: aload_0
/*    */     //   392: dup
/*    */     //   393: dup
/*    */     //   394: iconst_1
/*    */     //   395: putfield d60 : I
/*    */     //   398: iconst_1
/*    */     //   399: putfield u2 : I
/*    */     //   402: fconst_0
/*    */     //   403: goto -> 109
/*    */     //   406: aload_0
/*    */     //   407: dup
/*    */     //   408: dup
/*    */     //   409: iconst_1
/*    */     //   410: putfield d60 : I
/*    */     //   413: iconst_3
/*    */     //   414: putfield u2 : I
/*    */     //   417: fconst_0
/*    */     //   418: goto -> 109
/*    */     //   421: aload_0
/*    */     //   422: dup
/*    */     //   423: dup
/*    */     //   424: iconst_2
/*    */     //   425: putfield d60 : I
/*    */     //   428: iconst_5
/*    */     //   429: putfield u2 : I
/*    */     //   432: ldc 180.0
/*    */     //   434: goto -> 109
/*    */     //   437: iload_1
/*    */     //   438: iconst_3
/*    */     //   439: if_icmpne -> 643
/*    */     //   442: aload_0
/*    */     //   443: getfield ud0 : I
/*    */     //   446: tableswitch default -> 520, 0 -> 627, 1 -> 231, 2 -> 520, 3 -> 520, 4 -> 421, 5 -> 520, 6 -> 520, 7 -> 344, 8 -> 612, 9 -> 165, 10 -> 595, 11 -> 520, 12 -> 579, 13 -> 563, 14 -> 547
/*    */     //   520: aload_0
/*    */     //   521: dup
/*    */     //   522: dup2
/*    */     //   523: dup2
/*    */     //   524: getfield CH : I
/*    */     //   527: putfield d60 : I
/*    */     //   530: getfield GE : I
/*    */     //   533: putfield u2 : I
/*    */     //   536: fconst_0
/*    */     //   537: putfield kV : F
/*    */     //   540: iconst_1
/*    */     //   541: putfield Ml0 : Z
/*    */     //   544: goto -> 643
/*    */     //   547: aload_0
/*    */     //   548: dup
/*    */     //   549: dup
/*    */     //   550: iconst_1
/*    */     //   551: putfield d60 : I
/*    */     //   554: iconst_1
/*    */     //   555: putfield u2 : I
/*    */     //   558: ldc 180.0
/*    */     //   560: goto -> 109
/*    */     //   563: aload_0
/*    */     //   564: dup
/*    */     //   565: dup
/*    */     //   566: iconst_4
/*    */     //   567: putfield d60 : I
/*    */     //   570: iconst_0
/*    */     //   571: putfield u2 : I
/*    */     //   574: ldc 270.0
/*    */     //   576: goto -> 109
/*    */     //   579: aload_0
/*    */     //   580: dup
/*    */     //   581: dup
/*    */     //   582: iconst_1
/*    */     //   583: putfield d60 : I
/*    */     //   586: iconst_2
/*    */     //   587: putfield u2 : I
/*    */     //   590: ldc 180.0
/*    */     //   592: goto -> 109
/*    */     //   595: aload_0
/*    */     //   596: dup
/*    */     //   597: dup
/*    */     //   598: bipush #6
/*    */     //   600: putfield d60 : I
/*    */     //   603: iconst_4
/*    */     //   604: putfield u2 : I
/*    */     //   607: ldc 270.0
/*    */     //   609: goto -> 109
/*    */     //   612: aload_0
/*    */     //   613: dup
/*    */     //   614: dup
/*    */     //   615: iconst_3
/*    */     //   616: putfield d60 : I
/*    */     //   619: iconst_0
/*    */     //   620: putfield u2 : I
/*    */     //   623: fconst_0
/*    */     //   624: goto -> 109
/*    */     //   627: aload_0
/*    */     //   628: dup
/*    */     //   629: dup
/*    */     //   630: iconst_5
/*    */     //   631: putfield d60 : I
/*    */     //   634: iconst_0
/*    */     //   635: putfield u2 : I
/*    */     //   638: ldc 270.0
/*    */     //   640: goto -> 109
/*    */     //   643: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 13
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */