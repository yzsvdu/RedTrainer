/*    */ package f;public final class rH { public JG0 Du0; public int Cf0 = 0; public int Tn = 0; public int Ej = 0; public int WB0 = 0; public float V1 = 1.0F; public boolean Ni = false; public boolean vU = false; public int yE = 250; public int[] HZ = null; public int vn0 = 0; public boolean w70 = false; public boolean VL0 = false; public float JW = 0.0F; public Color bG0 = Color.WHITE.cpy(); public float is = 0.0F; public float Vy = 1.25F; public pRn O3; public Texture[] tG0; public pe0[] xv; public int xB0 = 10; public U70[] cM0; public zh0[] lc; public rH(JG0 paramJG0) { this.Du0 = paramJG0; } public final int Ax0() { zh0[] arrayOfZh0; Texture[] arrayOfTexture; pe0[] arrayOfPe0; U70[] arrayOfU70; return ((arrayOfTexture = this.tG0) != null) ? arrayOfTexture.length : (((arrayOfPe0 = this.xv) != null) ? arrayOfPe0.length : (((arrayOfU70 = this.cM0) != null) ? arrayOfU70.length : (((arrayOfZh0 = this.lc) != null) ? this.length : 0))); } public final void LH(int paramInt1, int paramInt2, int paramInt3) { // Byte code:
/*    */     //   0: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   3: getfield C50 : Lf/JX;
/*    */     //   6: dup
/*    */     //   7: astore #4
/*    */     //   9: getfield J30 : Lf/Rm0;
/*    */     //   12: dup
/*    */     //   13: astore #5
/*    */     //   15: ifnonnull -> 25
/*    */     //   18: aload #4
/*    */     //   20: getfield fe : Lf/Rm0;
/*    */     //   23: astore #5
/*    */     //   25: aload_0
/*    */     //   26: aload #5
/*    */     //   28: checkcast f/rR
/*    */     //   31: astore #5
/*    */     //   33: getfield is : F
/*    */     //   36: fconst_0
/*    */     //   37: fcmpl
/*    */     //   38: ifle -> 47
/*    */     //   41: iconst_1
/*    */     //   42: istore #6
/*    */     //   44: goto -> 50
/*    */     //   47: iconst_0
/*    */     //   48: istore #6
/*    */     //   50: iload #6
/*    */     //   52: ifeq -> 100
/*    */     //   55: aload #5
/*    */     //   57: aload_0
/*    */     //   58: aload #5
/*    */     //   60: aload_0
/*    */     //   61: aload #5
/*    */     //   63: aload_0
/*    */     //   64: aload #4
/*    */     //   66: invokevirtual ot : ()V
/*    */     //   69: getfield is : F
/*    */     //   72: invokevirtual Ws0 : (F)V
/*    */     //   75: getfield bG0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   78: invokevirtual cn0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   81: getfield Vy : F
/*    */     //   84: fstore #7
/*    */     //   86: getfield AE0 : I
/*    */     //   89: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   92: swap
/*    */     //   93: fload #7
/*    */     //   95: invokeinterface glUniform1f : (IF)V
/*    */     //   100: aload_0
/*    */     //   101: getfield tG0 : [Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   104: dup
/*    */     //   105: astore #7
/*    */     //   107: ifnull -> 171
/*    */     //   110: aload_0
/*    */     //   111: aload #7
/*    */     //   113: iload_1
/*    */     //   114: aaload
/*    */     //   115: dup
/*    */     //   116: astore_1
/*    */     //   117: invokevirtual bind : ()V
/*    */     //   120: getfield O3 : Lf/pRn;
/*    */     //   123: dup
/*    */     //   124: astore #7
/*    */     //   126: ifnull -> 140
/*    */     //   129: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   132: getfield zn : Lf/tw;
/*    */     //   135: astore #8
/*    */     //   137: goto -> 153
/*    */     //   140: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   143: getfield zn : Lf/tw;
/*    */     //   146: astore #8
/*    */     //   148: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   151: astore #7
/*    */     //   153: iload #6
/*    */     //   155: aload #8
/*    */     //   157: getfield Ma : Lf/C7;
/*    */     //   160: aload #7
/*    */     //   162: invokevirtual dJ0 : (Lf/pRn;)V
/*    */     //   165: ifeq -> 456
/*    */     //   168: goto -> 438
/*    */     //   171: aload_0
/*    */     //   172: getfield xv : [Lf/pe0;
/*    */     //   175: dup
/*    */     //   176: astore #7
/*    */     //   178: ifnull -> 367
/*    */     //   181: aload_0
/*    */     //   182: aload #7
/*    */     //   184: iload_1
/*    */     //   185: aaload
/*    */     //   186: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   189: dup
/*    */     //   190: astore #7
/*    */     //   192: invokevirtual bind : ()V
/*    */     //   195: getfield O3 : Lf/pRn;
/*    */     //   198: dup
/*    */     //   199: astore #8
/*    */     //   201: ifnull -> 215
/*    */     //   204: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   207: getfield zn : Lf/tw;
/*    */     //   210: astore #9
/*    */     //   212: goto -> 228
/*    */     //   215: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   218: getfield zn : Lf/tw;
/*    */     //   221: astore #9
/*    */     //   223: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   226: astore #8
/*    */     //   228: iload #6
/*    */     //   230: aload #9
/*    */     //   232: getfield Ma : Lf/C7;
/*    */     //   235: aload #8
/*    */     //   237: invokevirtual dJ0 : (Lf/pRn;)V
/*    */     //   240: ifeq -> 262
/*    */     //   243: aload #5
/*    */     //   245: aload #7
/*    */     //   247: dup
/*    */     //   248: invokevirtual getWidth : ()I
/*    */     //   251: istore #7
/*    */     //   253: invokevirtual getHeight : ()I
/*    */     //   256: iload #7
/*    */     //   258: swap
/*    */     //   259: invokevirtual iu0 : (II)V
/*    */     //   262: aload_0
/*    */     //   263: getfield xv : [Lf/pe0;
/*    */     //   266: iload_1
/*    */     //   267: aaload
/*    */     //   268: dup
/*    */     //   269: astore_1
/*    */     //   270: aload_0
/*    */     //   271: dup
/*    */     //   272: getfield Ej : I
/*    */     //   275: i2f
/*    */     //   276: aload_0
/*    */     //   277: getfield V1 : F
/*    */     //   280: dup
/*    */     //   281: fstore_0
/*    */     //   282: fmul
/*    */     //   283: f2i
/*    */     //   284: istore #7
/*    */     //   286: getfield WB0 : I
/*    */     //   289: i2f
/*    */     //   290: fload_0
/*    */     //   291: fmul
/*    */     //   292: f2i
/*    */     //   293: istore_0
/*    */     //   294: getfield WT : F
/*    */     //   297: aload_1
/*    */     //   298: getfield bh0 : F
/*    */     //   301: fcmpl
/*    */     //   302: ifle -> 309
/*    */     //   305: iconst_1
/*    */     //   306: goto -> 310
/*    */     //   309: iconst_0
/*    */     //   310: iconst_1
/*    */     //   311: ixor
/*    */     //   312: dup
/*    */     //   313: istore #8
/*    */     //   315: ifeq -> 324
/*    */     //   318: aload_1
/*    */     //   319: iconst_0
/*    */     //   320: iconst_1
/*    */     //   321: invokevirtual zt0 : (ZZ)V
/*    */     //   324: iload #8
/*    */     //   326: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   329: getfield C50 : Lf/JX;
/*    */     //   332: aload_1
/*    */     //   333: iload_0
/*    */     //   334: iload #7
/*    */     //   336: iload_3
/*    */     //   337: iload_2
/*    */     //   338: i2f
/*    */     //   339: fstore_0
/*    */     //   340: i2f
/*    */     //   341: fstore_2
/*    */     //   342: i2f
/*    */     //   343: fstore_3
/*    */     //   344: i2f
/*    */     //   345: fstore #7
/*    */     //   347: fload_0
/*    */     //   348: fload_2
/*    */     //   349: fload_3
/*    */     //   350: fload #7
/*    */     //   352: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*    */     //   355: ifeq -> 687
/*    */     //   358: aload_1
/*    */     //   359: iconst_0
/*    */     //   360: iconst_1
/*    */     //   361: invokevirtual zt0 : (ZZ)V
/*    */     //   364: goto -> 687
/*    */     //   367: aload_0
/*    */     //   368: getfield cM0 : [Lf/U70;
/*    */     //   371: dup
/*    */     //   372: astore #7
/*    */     //   374: ifnull -> 491
/*    */     //   377: aload_0
/*    */     //   378: aload #7
/*    */     //   380: iload_1
/*    */     //   381: aaload
/*    */     //   382: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   385: dup
/*    */     //   386: astore_1
/*    */     //   387: invokevirtual bind : ()V
/*    */     //   390: getfield O3 : Lf/pRn;
/*    */     //   393: dup
/*    */     //   394: astore #7
/*    */     //   396: ifnull -> 410
/*    */     //   399: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   402: getfield zn : Lf/tw;
/*    */     //   405: astore #8
/*    */     //   407: goto -> 423
/*    */     //   410: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   413: getfield zn : Lf/tw;
/*    */     //   416: astore #8
/*    */     //   418: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   421: astore #7
/*    */     //   423: iload #6
/*    */     //   425: aload #8
/*    */     //   427: getfield Ma : Lf/C7;
/*    */     //   430: aload #7
/*    */     //   432: invokevirtual dJ0 : (Lf/pRn;)V
/*    */     //   435: ifeq -> 456
/*    */     //   438: aload #5
/*    */     //   440: aload_1
/*    */     //   441: dup
/*    */     //   442: invokevirtual getWidth : ()I
/*    */     //   445: istore #7
/*    */     //   447: invokevirtual getHeight : ()I
/*    */     //   450: iload #7
/*    */     //   452: swap
/*    */     //   453: invokevirtual iu0 : (II)V
/*    */     //   456: aload_0
/*    */     //   457: aload_1
/*    */     //   458: aload_0
/*    */     //   459: dup
/*    */     //   460: getfield Ej : I
/*    */     //   463: i2f
/*    */     //   464: aload_0
/*    */     //   465: getfield V1 : F
/*    */     //   468: dup
/*    */     //   469: fstore_0
/*    */     //   470: fmul
/*    */     //   471: f2i
/*    */     //   472: istore_1
/*    */     //   473: getfield WB0 : I
/*    */     //   476: i2f
/*    */     //   477: fload_0
/*    */     //   478: fmul
/*    */     //   479: f2i
/*    */     //   480: istore_0
/*    */     //   481: iload_2
/*    */     //   482: iload_3
/*    */     //   483: iload_1
/*    */     //   484: iload_0
/*    */     //   485: invokevirtual COm1 : (Lcom/badlogic/gdx/graphics/Texture;IIII)V
/*    */     //   488: goto -> 687
/*    */     //   491: aload_0
/*    */     //   492: getfield lc : [Lf/zh0;
/*    */     //   495: dup
/*    */     //   496: astore #7
/*    */     //   498: ifnull -> 687
/*    */     //   501: aload_0
/*    */     //   502: aload #7
/*    */     //   504: iload_1
/*    */     //   505: aaload
/*    */     //   506: invokevirtual Uu0 : ()Lf/pe0;
/*    */     //   509: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   512: dup
/*    */     //   513: astore #7
/*    */     //   515: invokevirtual bind : ()V
/*    */     //   518: getfield O3 : Lf/pRn;
/*    */     //   521: dup
/*    */     //   522: astore #8
/*    */     //   524: ifnull -> 538
/*    */     //   527: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   530: getfield zn : Lf/tw;
/*    */     //   533: astore #9
/*    */     //   535: goto -> 551
/*    */     //   538: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   541: getfield zn : Lf/tw;
/*    */     //   544: astore #9
/*    */     //   546: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   549: astore #8
/*    */     //   551: iload #6
/*    */     //   553: aload #9
/*    */     //   555: getfield Ma : Lf/C7;
/*    */     //   558: aload #8
/*    */     //   560: invokevirtual dJ0 : (Lf/pRn;)V
/*    */     //   563: ifeq -> 585
/*    */     //   566: aload #5
/*    */     //   568: aload #7
/*    */     //   570: dup
/*    */     //   571: invokevirtual getWidth : ()I
/*    */     //   574: istore #7
/*    */     //   576: invokevirtual getHeight : ()I
/*    */     //   579: iload #7
/*    */     //   581: swap
/*    */     //   582: invokevirtual iu0 : (II)V
/*    */     //   585: aload_0
/*    */     //   586: getfield lc : [Lf/zh0;
/*    */     //   589: iload_1
/*    */     //   590: aaload
/*    */     //   591: invokevirtual Uu0 : ()Lf/pe0;
/*    */     //   594: dup
/*    */     //   595: astore_1
/*    */     //   596: aload_0
/*    */     //   597: dup
/*    */     //   598: getfield Ej : I
/*    */     //   601: i2f
/*    */     //   602: aload_0
/*    */     //   603: getfield V1 : F
/*    */     //   606: dup
/*    */     //   607: fstore_0
/*    */     //   608: fmul
/*    */     //   609: f2i
/*    */     //   610: istore #7
/*    */     //   612: getfield WB0 : I
/*    */     //   615: i2f
/*    */     //   616: fload_0
/*    */     //   617: fmul
/*    */     //   618: f2i
/*    */     //   619: istore_0
/*    */     //   620: getfield WT : F
/*    */     //   623: aload_1
/*    */     //   624: getfield bh0 : F
/*    */     //   627: fcmpl
/*    */     //   628: ifle -> 635
/*    */     //   631: iconst_1
/*    */     //   632: goto -> 636
/*    */     //   635: iconst_0
/*    */     //   636: iconst_1
/*    */     //   637: ixor
/*    */     //   638: dup
/*    */     //   639: istore #8
/*    */     //   641: ifeq -> 650
/*    */     //   644: aload_1
/*    */     //   645: iconst_0
/*    */     //   646: iconst_1
/*    */     //   647: invokevirtual zt0 : (ZZ)V
/*    */     //   650: iload #8
/*    */     //   652: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   655: getfield C50 : Lf/JX;
/*    */     //   658: aload_1
/*    */     //   659: iload_0
/*    */     //   660: iload #7
/*    */     //   662: iload_3
/*    */     //   663: iload_2
/*    */     //   664: i2f
/*    */     //   665: fstore_0
/*    */     //   666: i2f
/*    */     //   667: fstore_2
/*    */     //   668: i2f
/*    */     //   669: fstore_3
/*    */     //   670: i2f
/*    */     //   671: fstore #7
/*    */     //   673: fload_0
/*    */     //   674: fload_2
/*    */     //   675: fload_3
/*    */     //   676: fload #7
/*    */     //   678: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*    */     //   681: ifeq -> 687
/*    */     //   684: goto -> 358
/*    */     //   687: iload #6
/*    */     //   689: ifeq -> 703
/*    */     //   692: aload #5
/*    */     //   694: aload #4
/*    */     //   696: invokevirtual ot : ()V
/*    */     //   699: fconst_0
/*    */     //   700: invokevirtual Ws0 : (F)V
/*    */     //   703: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 9
/*    */     //   #2	-> 20
/*    */     //   #3	-> 28
/*    */     //   #4	-> 86
/*    */     //   #5	-> 89
/*    */     //   #6	-> 101
/*    */     //   #7	-> 120
/*    */     //   #8	-> 140
/*    */     //   #9	-> 157
/*    */     //   #10	-> 162
/*    */     //   #11	-> 172
/*    */     //   #12	-> 186
/*    */     //   #13	-> 192
/*    */     //   #14	-> 195
/*    */     //   #15	-> 215
/*    */     //   #16	-> 232
/*    */     //   #17	-> 237
/*    */     //   #18	-> 248
/*    */     //   #19	-> 294
/*    */     //   #20	-> 298
/*    */     //   #21	-> 321
/*    */     //   #22	-> 368
/*    */     //   #23	-> 390
/*    */     //   #24	-> 410
/*    */     //   #25	-> 427
/*    */     //   #26	-> 432
/*    */     //   #27	-> 442
/*    */     //   #28	-> 509
/*    */     //   #29	-> 515
/*    */     //   #30	-> 518
/*    */     //   #31	-> 538
/*    */     //   #32	-> 555
/*    */     //   #33	-> 560
/*    */     //   #34	-> 571
/*    */     //   #35	-> 620
/*    */     //   #36	-> 624
/*    */     //   #37	-> 647
/*  1 */     //   #38	-> 696 } public final void COm1(Texture paramTexture, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (this.VL0) this
/*  2 */         .JW = (float)((long)(zm0.u20 / 1.2D) % 360L);  float f1 = paramInt1, f2 = paramInt2, f3 = (paramInt3 / 2), f4 = (paramInt4 / 2), f5 = paramInt3, f6 = paramInt4, f7 = this.JW; int i = paramTexture.getWidth(), j = paramTexture.getHeight(); km.wI0.C50.BE(paramTexture, f1, f2, f3, f4, f5, f6, 1.0F, 1.0F, f7, 0, 0, i, j, true); }
/*    */   public final void tL(int paramInt1, int paramInt2) { this.Ni = true; this.Ej = paramInt1; this.WB0 = paramInt2; }
/*  4 */   public final JG0 zT(int paramInt1, int paramInt2) { this.Cf0 = paramInt1; this.Tn = paramInt2; return this.Du0; } public final void uE0(et paramet) { hY.Kj0[paramet.ordinal()]; int i = this.Du0.qF(); this.Cf0 = paramet.Sp(i, e00()); i = this.Du0.Hy(); this.Tn = paramet.nV(i, cA()); } public final int vG() { return this.Cf0; } public final int bB() { return this.Tn; } public final int e00() { return (this.tG0 == null && this.xv == null && this.cM0 == null && this.lc == null) ? 0 : (int)(this.Ej * this.V1); } public final JG0 Pn(pe0... paramVarArgs) { H(); pe0 pe01; if (paramVarArgs == null || paramVarArgs.length == 0 || (pe01 = paramVarArgs[0]) == null) return this.Du0;  this.xv = paramVarArgs; if (!this.Ni) { this.Ej = pe01.H0; this.WB0 = pe01.Vn0; }  return this.Du0; } public final int cA() { return (this.tG0 == null && this.xv == null && this.cM0 == null && this.lc == null) ? 0 : (int)(this.WB0 * this.V1); } public final void EV(int paramInt) { this.yE = paramInt; } public final void s8(int[] paramArrayOfint) { if (paramArrayOfint.length == Ax0()) { this.HZ = paramArrayOfint; this.vn0 = 0; for (byte b = 0; b < paramArrayOfint.length; b++) this.vn0 += paramArrayOfint[b];  return; }  throw new RuntimeException(); } public final void h(boolean paramBoolean) { this.VL0 = paramBoolean; } public final void FB0(pRn parampRn) { if (parampRn == null) { this.O3 = parampRn; } else { this.O3 = pRn.WHITE.o10(parampRn); }  } public final boolean AX() { return (Ax0() < 1); } public final void H() { MF.u10(); this.tG0 = null; this.xv = null; this.cM0 = null; this.lc = null; } public final JG0 qt(U70... paramVarArgs) { H(); U70 u70; if (paramVarArgs == null || paramVarArgs.length == 0 || (u70 = paramVarArgs[0]) == null) return this.Du0;  this.cM0 = paramVarArgs; if (!this.Ni) { this.Ej = u70.HA0().getWidth(); this.WB0 = this.cM0[0].HA0().getHeight(); }  return this.Du0; } public final void Iq() { if (this.w70 && zm0.u20 / 500L % 2L == 0L) return;  int i = 0; int j; if ((j = Ax0()) < 1) return;  if ((this.Du0.O.z60(Ap.b00) || this.vU) && j > 1) if (this.HZ != null)
/*    */       { int k; byte b; int[] arrayOfInt;
/*  6 */         for (j = (int)(zm0.u20 % this.vn0), k = 0, b = 0; b < (arrayOfInt = this.HZ).length; ) { if (j < (k += arrayOfInt[b])) { i = b; break; }  b++; }
/*    */          }
/*  8 */       else { i = (int)(zm0.u20 / this.yE % j); }   co(i); } public final void co(int paramInt) { if (paramInt >= Ax0()) paramInt = 0;  if (this.xB0 == 1) { paramInt = this.Du0.Kd; paramInt = this.Du0.xY / 2 + paramInt - e00() / 2; int i = this.Du0.er0; LH(paramInt, paramInt, this.Du0.HC / 2 + i - cA() / 2); } else { paramInt = this.Du0.Kd + this.Cf0;
/*    */       
/* 10 */       LH(paramInt, paramInt, this.Du0.er0 + this.Tn); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void sG0(int paramInt1, int paramInt2) {
/*    */     boolean bool = false;
/*    */     if (Ax0() <= 0)
/*    */       return; 
/*    */     float f;
/*    */     paramInt1 -= (int)(this.Ej * (f = this.V1)) / 2;
/*    */     LH(bool, paramInt1, paramInt2 - (int)(this.WB0 * f) / 2);
/*    */   }
/*    */   
/*    */   public final void zy0() {
/*    */     this.xB0 = 1;
/*    */   }
/*    */   
/*    */   public final void Ii0(float paramFloat) {
/*    */     this.V1 = paramFloat;
/*    */   }
/*    */   
/*    */   public final void Ef() {
/*    */     this.Cf0 = -this.Ej / 2;
/*    */     this.Tn = -this.WB0 / 2;
/*    */   }
/*    */   
/*    */   public final void HY() {
/*    */     this.vU = true;
/*    */   }
/*    */   
/*    */   public final void Yo(Texture... paramVarArgs) {
/*    */     H();
/*    */     Texture texture;
/*    */     if (paramVarArgs.length == 0 || (texture = paramVarArgs[0]) == null)
/*    */       return; 
/*    */     this.tG0 = paramVarArgs;
/*    */     if (!this.Ni) {
/*    */       this.Ej = texture.getWidth();
/*    */       this.WB0 = paramVarArgs[0].getHeight();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void sm(zh0... paramVarArgs) {
/*    */     H();
/*    */     zh0 zh01;
/*    */     if (paramVarArgs == null || paramVarArgs.length == 0 || (zh01 = paramVarArgs[0]) == null)
/*    */       return; 
/*    */     this.lc = paramVarArgs;
/*    */     if (!this.Ni) {
/*    */       this.Ej = (zh01.Uu0()).H0;
/*    */       this.WB0 = (this.lc[0].Uu0()).Vn0;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void fc0(UA0... paramVarArgs) {
/*    */     H();
/*    */     if (paramVarArgs.length == 0 || paramVarArgs[0] == null)
/*    */       return; 
/*    */     pe0[] arrayOfPe01;
/*    */     if ((arrayOfPe01 = this.xv) == null || arrayOfPe01.length != paramVarArgs.length)
/*    */       this.xv = new pe0[paramVarArgs.length]; 
/*    */     pe0[] arrayOfPe02;
/*    */     for (byte b = 0; b < (arrayOfPe02 = this.xv).length; ) {
/*    */       arrayOfPe02[b] = paramVarArgs[b].OB0();
/*    */       b++;
/*    */     } 
/*    */     if (!this.Ni) {
/*    */       pe0 pe01;
/*    */       this.Ej = (pe01 = arrayOfPe02[0]).H0;
/*    */       this.WB0 = this.Vn0;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */