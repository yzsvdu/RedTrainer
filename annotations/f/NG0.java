/* 1 */ package f;public final class NG0 extends static { public uT H40; public lpt1 F6; public byte lx; public short cOM7; public LJ T; public U70 u3 = null; public Texture Iu0; public IB R5; public boolean Xb0 = false; public final void fH(boolean paramBoolean1, boolean paramBoolean2) { this.catch = paramBoolean1; if (!paramBoolean1 && paramBoolean2) { this
/* 2 */         .Ic = zm0.u20 + 2500L; } else if (!paramBoolean2) { this.Ic = 0L; }  } public boolean gb = false; public int cI; public int dw0; public boolean catch = false; public long Ic = 0L; public NG0(Jo paramJo) { super(paramJo); } public final boolean t0(tH paramtH, int paramInt, boolean paramBoolean) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield gb : Z
/*   */     //   4: ifeq -> 30
/*   */     //   7: aload_0
/*   */     //   8: getfield cOM7 : S
/*   */     //   11: sipush #285
/*   */     //   14: if_icmpne -> 30
/*   */     //   17: getstatic f/zm0.u20 : J
/*   */     //   20: ldc2_w 60
/*   */     //   23: ldiv
/*   */     //   24: ldc2_w 8
/*   */     //   27: lrem
/*   */     //   28: l2i
/*   */     //   29: istore_2
/*   */     //   30: aload_0
/*   */     //   31: iconst_0
/*   */     //   32: putfield Xb0 : Z
/*   */     //   35: getstatic f/h1.X2 : Z
/*   */     //   38: ifne -> 49
/*   */     //   41: aload_0
/*   */     //   42: getfield lx : B
/*   */     //   45: iconst_4
/*   */     //   46: if_icmpne -> 144
/*   */     //   49: getstatic f/km.mI0 : Lf/P1;
/*   */     //   52: getfield yE : Lf/BE;
/*   */     //   55: ifnull -> 144
/*   */     //   58: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   61: aload_0
/*   */     //   62: dup
/*   */     //   63: getfield lx : B
/*   */     //   66: istore #4
/*   */     //   68: getfield cOM7 : S
/*   */     //   71: iload #4
/*   */     //   73: swap
/*   */     //   74: iconst_0
/*   */     //   75: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   78: dup
/*   */     //   79: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   82: pop
/*   */     //   83: instanceof f/Yq0
/*   */     //   86: ifne -> 144
/*   */     //   89: getstatic f/km.mI0 : Lf/P1;
/*   */     //   92: getfield yE : Lf/BE;
/*   */     //   95: iload_2
/*   */     //   96: aload_0
/*   */     //   97: dup
/*   */     //   98: getfield lx : B
/*   */     //   101: istore #4
/*   */     //   103: getfield cOM7 : S
/*   */     //   106: istore #5
/*   */     //   108: i2s
/*   */     //   109: istore #6
/*   */     //   111: iload #4
/*   */     //   113: iload #5
/*   */     //   115: iload #6
/*   */     //   117: invokevirtual JA0 : (BSS)Lf/U70;
/*   */     //   120: dup
/*   */     //   121: aload_0
/*   */     //   122: swap
/*   */     //   123: putfield u3 : Lf/U70;
/*   */     //   126: ifnull -> 135
/*   */     //   129: iconst_1
/*   */     //   130: istore #4
/*   */     //   132: goto -> 138
/*   */     //   135: iconst_0
/*   */     //   136: istore #4
/*   */     //   138: aload_0
/*   */     //   139: iload #4
/*   */     //   141: putfield Xb0 : Z
/*   */     //   144: aload_0
/*   */     //   145: getfield Xb0 : Z
/*   */     //   148: ifne -> 188
/*   */     //   151: aload_0
/*   */     //   152: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   155: aload_0
/*   */     //   156: dup
/*   */     //   157: getfield lx : B
/*   */     //   160: istore #4
/*   */     //   162: getfield cOM7 : S
/*   */     //   165: iload #4
/*   */     //   167: swap
/*   */     //   168: iconst_0
/*   */     //   169: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   172: dup
/*   */     //   173: astore #4
/*   */     //   175: iload_2
/*   */     //   176: aload_0
/*   */     //   177: aload #4
/*   */     //   179: putfield T : Lf/LJ;
/*   */     //   182: invokevirtual LT : (I)Lf/U70;
/*   */     //   185: putfield u3 : Lf/U70;
/*   */     //   188: aload_0
/*   */     //   189: getfield u3 : Lf/U70;
/*   */     //   192: dup
/*   */     //   193: astore_2
/*   */     //   194: ifnonnull -> 199
/*   */     //   197: iconst_1
/*   */     //   198: ireturn
/*   */     //   199: aload_0
/*   */     //   200: dup
/*   */     //   201: dup
/*   */     //   202: dup2
/*   */     //   203: aload_2
/*   */     //   204: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   207: putfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   210: getfield ao : Lf/eo;
/*   */     //   213: dup
/*   */     //   214: astore_2
/*   */     //   215: getfield x : F
/*   */     //   218: f2i
/*   */     //   219: putfield cI : I
/*   */     //   222: aload_2
/*   */     //   223: getfield y : F
/*   */     //   226: f2i
/*   */     //   227: putfield dw0 : I
/*   */     //   230: getfield Xb0 : Z
/*   */     //   233: ifne -> 363
/*   */     //   236: aload_0
/*   */     //   237: getfield gb : Z
/*   */     //   240: ifeq -> 246
/*   */     //   243: goto -> 363
/*   */     //   246: aload_0
/*   */     //   247: getfield T : Lf/LJ;
/*   */     //   250: dup
/*   */     //   251: astore_2
/*   */     //   252: ifnull -> 263
/*   */     //   255: aload_2
/*   */     //   256: invokevirtual cOM3 : ()B
/*   */     //   259: iconst_m1
/*   */     //   260: if_icmpeq -> 477
/*   */     //   263: aload_1
/*   */     //   264: aload_0
/*   */     //   265: dup
/*   */     //   266: sipush #255
/*   */     //   269: aload_1
/*   */     //   270: invokevirtual xS : (ILf/tH;)V
/*   */     //   273: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   276: dup
/*   */     //   277: astore_1
/*   */     //   278: aload_0
/*   */     //   279: dup
/*   */     //   280: dup2
/*   */     //   281: dup2
/*   */     //   282: getfield cI : I
/*   */     //   285: aload_1
/*   */     //   286: invokevirtual getWidth : ()I
/*   */     //   289: bipush #16
/*   */     //   291: isub
/*   */     //   292: iconst_2
/*   */     //   293: idiv
/*   */     //   294: isub
/*   */     //   295: i2f
/*   */     //   296: fstore_1
/*   */     //   297: getfield dw0 : I
/*   */     //   300: aload_0
/*   */     //   301: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   304: invokevirtual getHeight : ()I
/*   */     //   307: bipush #16
/*   */     //   309: isub
/*   */     //   310: isub
/*   */     //   311: i2f
/*   */     //   312: fstore_0
/*   */     //   313: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   316: invokevirtual getWidth : ()I
/*   */     //   319: i2f
/*   */     //   320: fstore_2
/*   */     //   321: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   324: invokevirtual getHeight : ()I
/*   */     //   327: i2f
/*   */     //   328: fstore #4
/*   */     //   330: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   333: invokevirtual getWidth : ()I
/*   */     //   336: istore #5
/*   */     //   338: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   341: invokevirtual getHeight : ()I
/*   */     //   344: istore #6
/*   */     //   346: fload_1
/*   */     //   347: fload_0
/*   */     //   348: fload_2
/*   */     //   349: fload #4
/*   */     //   351: iload #5
/*   */     //   353: iload #6
/*   */     //   355: iload_3
/*   */     //   356: iconst_0
/*   */     //   357: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*   */     //   360: goto -> 477
/*   */     //   363: aload_1
/*   */     //   364: aload_0
/*   */     //   365: dup
/*   */     //   366: sipush #255
/*   */     //   369: aload_1
/*   */     //   370: invokevirtual xS : (ILf/tH;)V
/*   */     //   373: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   376: dup
/*   */     //   377: astore_1
/*   */     //   378: aload_0
/*   */     //   379: dup
/*   */     //   380: dup2
/*   */     //   381: dup2
/*   */     //   382: getfield cI : I
/*   */     //   385: i2f
/*   */     //   386: ldc 0.5
/*   */     //   388: fadd
/*   */     //   389: aload_1
/*   */     //   390: invokevirtual getWidth : ()I
/*   */     //   393: i2f
/*   */     //   394: ldc 0.75
/*   */     //   396: fmul
/*   */     //   397: ldc 16.0
/*   */     //   399: fsub
/*   */     //   400: fconst_2
/*   */     //   401: fdiv
/*   */     //   402: fsub
/*   */     //   403: fstore_1
/*   */     //   404: getfield dw0 : I
/*   */     //   407: i2f
/*   */     //   408: aload_0
/*   */     //   409: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   412: invokevirtual getHeight : ()I
/*   */     //   415: i2f
/*   */     //   416: ldc 0.75
/*   */     //   418: fmul
/*   */     //   419: ldc 16.0
/*   */     //   421: fsub
/*   */     //   422: fsub
/*   */     //   423: fstore_0
/*   */     //   424: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   427: invokevirtual getWidth : ()I
/*   */     //   430: i2f
/*   */     //   431: ldc 0.75
/*   */     //   433: fmul
/*   */     //   434: fstore_2
/*   */     //   435: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   438: invokevirtual getHeight : ()I
/*   */     //   441: i2f
/*   */     //   442: ldc 0.75
/*   */     //   444: fmul
/*   */     //   445: fstore #4
/*   */     //   447: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   450: invokevirtual getWidth : ()I
/*   */     //   453: istore #5
/*   */     //   455: getfield Iu0 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   458: invokevirtual getHeight : ()I
/*   */     //   461: istore #6
/*   */     //   463: fload_1
/*   */     //   464: fload_0
/*   */     //   465: fload_2
/*   */     //   466: fload #4
/*   */     //   468: iload #5
/*   */     //   470: iload #6
/*   */     //   472: iload_3
/*   */     //   473: iconst_0
/*   */     //   474: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*   */     //   477: iconst_1
/*   */     //   478: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 17
/*   */     //   #2	-> 23
/*   */     //   #3	-> 58
/*   */     //   #4	-> 63
/*   */     //   #5	-> 75
/*   */     //   #6	-> 79
/*   */     //   #7	-> 83
/*   */     //   #8	-> 89
/*   */     //   #9	-> 152
/*   */     //   #10	-> 157
/*   */     //   #11	-> 169
/*   */     //   #12	-> 179 } public final boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { // Byte code:
/*   */     //   0: getstatic f/km.mI0 : Lf/P1;
/*   */     //   3: getfield AN : Lf/Wo;
/*   */     //   6: ifnonnull -> 11
/*   */     //   9: iconst_1
/*   */     //   10: ireturn
/*   */     //   11: aload_0
/*   */     //   12: getfield gb : Z
/*   */     //   15: ifeq -> 42
/*   */     //   18: aload_0
/*   */     //   19: getfield cOM7 : S
/*   */     //   22: sipush #285
/*   */     //   25: if_icmpne -> 42
/*   */     //   28: getstatic f/zm0.u20 : J
/*   */     //   31: ldc2_w 60
/*   */     //   34: ldiv
/*   */     //   35: ldc2_w 8
/*   */     //   38: lrem
/*   */     //   39: l2i
/*   */     //   40: istore #4
/*   */     //   42: aload_0
/*   */     //   43: dup
/*   */     //   44: invokestatic IV : ()Lf/hX;
/*   */     //   47: astore #5
/*   */     //   49: getfield lx : B
/*   */     //   52: istore #6
/*   */     //   54: getfield cOM7 : S
/*   */     //   57: iload #6
/*   */     //   59: aload #5
/*   */     //   61: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   64: pop
/*   */     //   65: invokestatic aR : (IB)Z
/*   */     //   68: ifeq -> 123
/*   */     //   71: aload_0
/*   */     //   72: getfield F6 : Lf/lpt1;
/*   */     //   75: ifnonnull -> 92
/*   */     //   78: aload_0
/*   */     //   79: invokestatic IV : ()Lf/hX;
/*   */     //   82: aload_0
/*   */     //   83: getfield cOM7 : S
/*   */     //   86: invokevirtual eg : (I)Lf/lpt1;
/*   */     //   89: putfield F6 : Lf/lpt1;
/*   */     //   92: aload_0
/*   */     //   93: aload_1
/*   */     //   94: aload_2
/*   */     //   95: aload_0
/*   */     //   96: dup
/*   */     //   97: getfield F6 : Lf/lpt1;
/*   */     //   100: aload_0
/*   */     //   101: getfield ao : Lf/eo;
/*   */     //   104: invokevirtual M70 : (Lf/eo;)V
/*   */     //   107: getfield F6 : Lf/lpt1;
/*   */     //   110: aload_3
/*   */     //   111: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   114: aload_2
/*   */     //   115: aload_3
/*   */     //   116: iconst_0
/*   */     //   117: iconst_1
/*   */     //   118: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*   */     //   121: iconst_1
/*   */     //   122: ireturn
/*   */     //   123: aload_0
/*   */     //   124: getfield gb : Z
/*   */     //   127: ifeq -> 340
/*   */     //   130: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   133: aload_0
/*   */     //   134: dup
/*   */     //   135: getfield lx : B
/*   */     //   138: istore #5
/*   */     //   140: getfield cOM7 : S
/*   */     //   143: iload #5
/*   */     //   145: swap
/*   */     //   146: iconst_0
/*   */     //   147: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   150: dup
/*   */     //   151: astore #5
/*   */     //   153: iload #4
/*   */     //   155: aload_0
/*   */     //   156: aload #5
/*   */     //   158: putfield T : Lf/LJ;
/*   */     //   161: invokevirtual LT : (I)Lf/U70;
/*   */     //   164: dup
/*   */     //   165: astore #4
/*   */     //   167: aload_0
/*   */     //   168: aload #4
/*   */     //   170: putfield u3 : Lf/U70;
/*   */     //   173: ifnonnull -> 178
/*   */     //   176: iconst_1
/*   */     //   177: ireturn
/*   */     //   178: aload_0
/*   */     //   179: getfield H40 : Lf/uT;
/*   */     //   182: ifnonnull -> 212
/*   */     //   185: aload_0
/*   */     //   186: new f/pe0
/*   */     //   189: dup
/*   */     //   190: astore #5
/*   */     //   192: aload #4
/*   */     //   194: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   197: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   200: bipush #32
/*   */     //   202: bipush #32
/*   */     //   204: aload #5
/*   */     //   206: invokestatic xz : (IILf/pe0;)Lf/uT;
/*   */     //   209: putfield H40 : Lf/uT;
/*   */     //   212: aload_0
/*   */     //   213: dup
/*   */     //   214: dup
/*   */     //   215: dup2
/*   */     //   216: dup2
/*   */     //   217: getfield u3 : Lf/U70;
/*   */     //   220: getstatic f/zm0.u20 : J
/*   */     //   223: putfield mk : J
/*   */     //   226: getfield H40 : Lf/uT;
/*   */     //   229: getstatic f/Xi.WB : Z
/*   */     //   232: invokevirtual lM : (Z)V
/*   */     //   235: getfield H40 : Lf/uT;
/*   */     //   238: ldc 0.011
/*   */     //   240: invokevirtual zO : (F)V
/*   */     //   243: getfield H40 : Lf/uT;
/*   */     //   246: invokevirtual Gz : ()V
/*   */     //   249: getfield H40 : Lf/uT;
/*   */     //   252: aload_0
/*   */     //   253: getfield u3 : Lf/U70;
/*   */     //   256: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   259: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   262: getfield H40 : Lf/uT;
/*   */     //   265: astore #4
/*   */     //   267: invokevirtual DE0 : ()B
/*   */     //   270: iconst_3
/*   */     //   271: if_icmpne -> 280
/*   */     //   274: iconst_1
/*   */     //   275: istore #5
/*   */     //   277: goto -> 283
/*   */     //   280: iconst_0
/*   */     //   281: istore #5
/*   */     //   283: aload_0
/*   */     //   284: aload_1
/*   */     //   285: aload_2
/*   */     //   286: dup
/*   */     //   287: aload_0
/*   */     //   288: dup
/*   */     //   289: dup
/*   */     //   290: aload #4
/*   */     //   292: iload #5
/*   */     //   294: iconst_0
/*   */     //   295: invokevirtual fp : (ZZ)V
/*   */     //   298: getfield H40 : Lf/uT;
/*   */     //   301: aload_0
/*   */     //   302: getfield ao : Lf/eo;
/*   */     //   305: invokevirtual WI0 : (Lf/eo;)V
/*   */     //   308: getfield H40 : Lf/uT;
/*   */     //   311: aload_0
/*   */     //   312: getfield Yk0 : Lf/eo;
/*   */     //   315: aload_0
/*   */     //   316: getfield K70 : Lf/ny;
/*   */     //   319: getfield nj0 : Lf/eo;
/*   */     //   322: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   325: getfield H40 : Lf/uT;
/*   */     //   328: aload_3
/*   */     //   329: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   332: aload_3
/*   */     //   333: iconst_0
/*   */     //   334: iconst_0
/*   */     //   335: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*   */     //   338: iconst_1
/*   */     //   339: ireturn
/*   */     //   340: aload_0
/*   */     //   341: getstatic f/km.mI0 : Lf/P1;
/*   */     //   344: getfield AN : Lf/Wo;
/*   */     //   347: aload_0
/*   */     //   348: getfield cOM7 : S
/*   */     //   351: invokevirtual AuX : (S)Lf/IB;
/*   */     //   354: dup
/*   */     //   355: astore #4
/*   */     //   357: putfield R5 : Lf/IB;
/*   */     //   360: aload #4
/*   */     //   362: getfield CV : B
/*   */     //   365: ifeq -> 374
/*   */     //   368: iconst_1
/*   */     //   369: istore #4
/*   */     //   371: goto -> 377
/*   */     //   374: iconst_0
/*   */     //   375: istore #4
/*   */     //   377: iload #4
/*   */     //   379: ifeq -> 391
/*   */     //   382: aload_0
/*   */     //   383: aload_1
/*   */     //   384: aload_2
/*   */     //   385: aload_3
/*   */     //   386: iconst_0
/*   */     //   387: iconst_0
/*   */     //   388: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*   */     //   391: aload_0
/*   */     //   392: getfield R5 : Lf/IB;
/*   */     //   395: dup
/*   */     //   396: astore_1
/*   */     //   397: getfield TN : B
/*   */     //   400: dup
/*   */     //   401: istore #4
/*   */     //   403: iconst_1
/*   */     //   404: if_icmpeq -> 509
/*   */     //   407: iload #4
/*   */     //   409: iconst_2
/*   */     //   410: if_icmpeq -> 416
/*   */     //   413: goto -> 773
/*   */     //   416: aload_2
/*   */     //   417: invokestatic vY : ()Lf/zp0;
/*   */     //   420: aload_0
/*   */     //   421: getfield R5 : Lf/IB;
/*   */     //   424: getfield Ce : S
/*   */     //   427: invokevirtual B70 : (I)Lf/lpt1;
/*   */     //   430: dup
/*   */     //   431: aload_3
/*   */     //   432: swap
/*   */     //   433: dup
/*   */     //   434: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   437: aload_0
/*   */     //   438: dup
/*   */     //   439: getfield ao : Lf/eo;
/*   */     //   442: astore_1
/*   */     //   443: getfield V4 : Lf/TG0;
/*   */     //   446: aload_1
/*   */     //   447: swap
/*   */     //   448: getstatic f/static.fO : Lf/eo;
/*   */     //   451: fconst_1
/*   */     //   452: fconst_1
/*   */     //   453: fconst_1
/*   */     //   454: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   457: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   460: pop
/*   */     //   461: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   464: aload_0
/*   */     //   465: getfield R5 : Lf/IB;
/*   */     //   468: dup
/*   */     //   469: astore_0
/*   */     //   470: getfield lPT6 : B
/*   */     //   473: i2f
/*   */     //   474: ldc_w 64.0
/*   */     //   477: fdiv
/*   */     //   478: aload_0
/*   */     //   479: dup
/*   */     //   480: getfield pu : B
/*   */     //   483: i2f
/*   */     //   484: ldc_w 64.0
/*   */     //   487: fdiv
/*   */     //   488: fstore_0
/*   */     //   489: getfield dg0 : B
/*   */     //   492: i2f
/*   */     //   493: ldc_w 64.0
/*   */     //   496: fdiv
/*   */     //   497: fload_0
/*   */     //   498: swap
/*   */     //   499: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   502: pop
/*   */     //   503: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   506: goto -> 773
/*   */     //   509: aload_1
/*   */     //   510: aload_0
/*   */     //   511: dup
/*   */     //   512: invokevirtual DE0 : ()B
/*   */     //   515: istore_1
/*   */     //   516: getfield R90 : I
/*   */     //   519: iload_1
/*   */     //   520: invokevirtual Pz : (IB)Lf/U70;
/*   */     //   523: dup
/*   */     //   524: astore_1
/*   */     //   525: aload_0
/*   */     //   526: aload_1
/*   */     //   527: putfield u3 : Lf/U70;
/*   */     //   530: ifnonnull -> 535
/*   */     //   533: iconst_1
/*   */     //   534: ireturn
/*   */     //   535: aload_0
/*   */     //   536: getfield H40 : Lf/uT;
/*   */     //   539: ifnonnull -> 568
/*   */     //   542: aload_0
/*   */     //   543: new f/pe0
/*   */     //   546: dup
/*   */     //   547: astore #4
/*   */     //   549: aload_1
/*   */     //   550: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   553: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   556: bipush #32
/*   */     //   558: bipush #32
/*   */     //   560: aload #4
/*   */     //   562: invokestatic xz : (IILf/pe0;)Lf/uT;
/*   */     //   565: putfield H40 : Lf/uT;
/*   */     //   568: aload_0
/*   */     //   569: dup
/*   */     //   570: dup
/*   */     //   571: getfield u3 : Lf/U70;
/*   */     //   574: getstatic f/zm0.u20 : J
/*   */     //   577: putfield mk : J
/*   */     //   580: getfield H40 : Lf/uT;
/*   */     //   583: getstatic f/Xi.WB : Z
/*   */     //   586: invokevirtual lM : (Z)V
/*   */     //   589: getfield R5 : Lf/IB;
/*   */     //   592: getfield Tp0 : B
/*   */     //   595: iconst_2
/*   */     //   596: if_icmpne -> 634
/*   */     //   599: aload_0
/*   */     //   600: dup
/*   */     //   601: dup
/*   */     //   602: getfield H40 : Lf/uT;
/*   */     //   605: ldc_w 0.022
/*   */     //   608: invokevirtual zO : (F)V
/*   */     //   611: getfield H40 : Lf/uT;
/*   */     //   614: invokevirtual Gz : ()V
/*   */     //   617: getfield ao : Lf/eo;
/*   */     //   620: dup
/*   */     //   621: getfield y : F
/*   */     //   624: ldc_w 0.16
/*   */     //   627: fadd
/*   */     //   628: putfield y : F
/*   */     //   631: goto -> 650
/*   */     //   634: aload_0
/*   */     //   635: dup
/*   */     //   636: getfield H40 : Lf/uT;
/*   */     //   639: ldc 0.011
/*   */     //   641: invokevirtual zO : (F)V
/*   */     //   644: getfield H40 : Lf/uT;
/*   */     //   647: invokevirtual Gz : ()V
/*   */     //   650: aload_0
/*   */     //   651: dup
/*   */     //   652: dup
/*   */     //   653: getfield H40 : Lf/uT;
/*   */     //   656: aload_0
/*   */     //   657: getfield u3 : Lf/U70;
/*   */     //   660: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   663: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   666: getfield H40 : Lf/uT;
/*   */     //   669: astore_1
/*   */     //   670: getfield R5 : Lf/IB;
/*   */     //   673: getfield a30 : B
/*   */     //   676: dup
/*   */     //   677: istore #4
/*   */     //   679: iconst_5
/*   */     //   680: if_icmpeq -> 703
/*   */     //   683: iload #4
/*   */     //   685: bipush #12
/*   */     //   687: if_icmpeq -> 703
/*   */     //   690: iload #4
/*   */     //   692: bipush #13
/*   */     //   694: if_icmpeq -> 703
/*   */     //   697: iconst_1
/*   */     //   698: istore #4
/*   */     //   700: goto -> 706
/*   */     //   703: iconst_0
/*   */     //   704: istore #4
/*   */     //   706: iload #4
/*   */     //   708: ifne -> 725
/*   */     //   711: aload_0
/*   */     //   712: invokevirtual DE0 : ()B
/*   */     //   715: iconst_3
/*   */     //   716: if_icmpne -> 725
/*   */     //   719: iconst_1
/*   */     //   720: istore #4
/*   */     //   722: goto -> 728
/*   */     //   725: iconst_0
/*   */     //   726: istore #4
/*   */     //   728: aload_2
/*   */     //   729: aload_0
/*   */     //   730: dup
/*   */     //   731: dup
/*   */     //   732: aload_1
/*   */     //   733: iload #4
/*   */     //   735: iconst_0
/*   */     //   736: invokevirtual fp : (ZZ)V
/*   */     //   739: getfield H40 : Lf/uT;
/*   */     //   742: aload_0
/*   */     //   743: getfield ao : Lf/eo;
/*   */     //   746: invokevirtual WI0 : (Lf/eo;)V
/*   */     //   749: getfield H40 : Lf/uT;
/*   */     //   752: aload_0
/*   */     //   753: getfield Yk0 : Lf/eo;
/*   */     //   756: aload_0
/*   */     //   757: getfield K70 : Lf/ny;
/*   */     //   760: getfield nj0 : Lf/eo;
/*   */     //   763: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   766: getfield H40 : Lf/uT;
/*   */     //   769: aload_3
/*   */     //   770: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   773: iconst_1
/*   */     //   774: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 28
/*   */     //   #2	-> 34
/*   */     //   #3	-> 118
/*   */     //   #4	-> 124
/*   */     //   #5	-> 130
/*   */     //   #6	-> 135
/*   */     //   #7	-> 147
/*   */     //   #8	-> 158
/*   */     //   #9	-> 220
/*   */     //   #10	-> 223
/*   */     //   #11	-> 226
/*   */     //   #12	-> 295
/*   */     //   #13	-> 298
/*   */     //   #14	-> 335
/*   */     //   #15	-> 341
/*   */     //   #16	-> 362
/*   */     //   #17	-> 388
/*   */     //   #18	-> 392
/*   */     //   #19	-> 397
/*   */     //   #20	-> 417
/*   */     //   #21	-> 424
/*   */     //   #22	-> 427
/*   */     //   #23	-> 470
/*   */     //   #24	-> 480
/*   */     //   #25	-> 489
/*   */     //   #26	-> 499
/*   */     //   #27	-> 574
/*   */     //   #28	-> 577
/*   */     //   #29	-> 580
/*   */     //   #30	-> 592
/*   */     //   #31	-> 602
/*   */     //   #32	-> 673
/*   */     //   #33	-> 712
/*   */     //   #34	-> 736
/* 2 */     //   #35	-> 739 } public final int zv() { return 16; } public final int e60() { return 32; } public final boolean nc0() { return (this.catch && zm0.u20 > this.Ic); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */