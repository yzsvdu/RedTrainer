/*    */ package f;public final class DC0 { public final void Ja(g paramg) { a4[] arrayOfA4; int i; byte b;
/*  2 */     for (i = (arrayOfA4 = this.wR.g3).length, b = 0; b < i; ) {
/*  3 */       a4 a4; int j = (a4 = arrayOfA4[b]).h;
/*  4 */       Ps0 ps0 = Ps0.Ov0;
/*    */       
/*    */       wt0 wt0;
/*  7 */       if ((wt0 = (wt0)ps0.np.get(Integer.valueOf(this.Um.in() * 10000 + j))) != null)
/*  8 */       { short s2; if (((s2 = wt0.mV) & 0x200) != 0) { s2 = 24; } else if ((s2 & 0x100) != 0) { s2 = 12; } else { s2 = 8; }
/*  9 */          int k = wt0.sG; pe0[] arrayOfPe0; byte b2;
/* 10 */         for (arrayOfPe0 = new pe0[s2], b2 = 0; b2 < k; ) { arrayOfPe0[b2] = paramg.Fm0(); b2++; }
/* 11 */          short s1 = wt0.mV;
/* 12 */         a4.pn0 = arrayOfPe0; a4.up0 = s1; }  for (byte b1 = 0; b1 < 2; ) {
/* 13 */         pe0 pe0 = paramg.Fm0();
/* 14 */         a4.qd0[b1] = pe0; b1++;
/* 15 */       }  int[] arrayOfInt; if ((arrayOfInt = a4.W6)[0] >= 1 || arrayOfInt[1] >= 1) for (byte b2 = 0; b2 < a4.Lh.length; ) { for (byte b3 = 0; b3 < a4.W6[b2]; ) { a4.qt0[b2][b3] = paramg.Fm0(); b3++; }  b2++; }   b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final int ny;
/*    */   public Wf QQ;
/*    */   public f1[] dt0;
/*    */   public final DC0 uF0;
/*    */   public final aE wR;
/*    */   public final boolean DD;
/*    */   public final s40 Um;
/*    */   
/*    */   public DC0(int paramInt, s40 params40, DC0 paramDC0) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: iload_1
/*    */     //   2: aload_2
/*    */     //   3: dup
/*    */     //   4: aload_0
/*    */     //   5: aload_2
/*    */     //   6: aload_0
/*    */     //   7: aload_3
/*    */     //   8: aload_0
/*    */     //   9: iload_1
/*    */     //   10: aload_0
/*    */     //   11: dup
/*    */     //   12: invokespecial <init> : ()V
/*    */     //   15: bipush #16
/*    */     //   17: anewarray f/f1
/*    */     //   20: putfield dt0 : [Lf/f1;
/*    */     //   23: putfield ny : I
/*    */     //   26: putfield uF0 : Lf/DC0;
/*    */     //   29: putfield Um : Lf/s40;
/*    */     //   32: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*    */     //   35: astore #4
/*    */     //   37: invokevirtual bV : ()Lf/uq;
/*    */     //   40: getstatic f/uq.sK : I
/*    */     //   43: invokevirtual nz : (I)I
/*    */     //   46: istore #5
/*    */     //   48: bipush #24
/*    */     //   50: imul
/*    */     //   51: iload #5
/*    */     //   53: iadd
/*    */     //   54: istore #5
/*    */     //   56: invokevirtual in : ()B
/*    */     //   59: iconst_1
/*    */     //   60: if_icmpne -> 72
/*    */     //   63: iload_1
/*    */     //   64: bipush #57
/*    */     //   66: if_icmple -> 72
/*    */     //   69: iinc #5, 8
/*    */     //   72: aload #4
/*    */     //   74: dup
/*    */     //   75: dup
/*    */     //   76: iload #5
/*    */     //   78: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   81: pop
/*    */     //   82: invokevirtual get : ()B
/*    */     //   85: pop
/*    */     //   86: invokevirtual get : ()B
/*    */     //   89: ifle -> 98
/*    */     //   92: iconst_1
/*    */     //   93: istore #5
/*    */     //   95: goto -> 101
/*    */     //   98: iconst_0
/*    */     //   99: istore #5
/*    */     //   101: iload #5
/*    */     //   103: aload_0
/*    */     //   104: iload #5
/*    */     //   106: putfield DD : Z
/*    */     //   109: ifeq -> 151
/*    */     //   112: aload_3
/*    */     //   113: ifnull -> 119
/*    */     //   116: goto -> 151
/*    */     //   119: new java/lang/RuntimeException
/*    */     //   122: dup
/*    */     //   123: new java/lang/StringBuilder
/*    */     //   126: dup
/*    */     //   127: invokespecial <init> : ()V
/*    */     //   130: ldc 'Tileset: '
/*    */     //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   135: iload_1
/*    */     //   136: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   139: ldc ' is a sub tileset, but is being used as a main.'
/*    */     //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   144: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   147: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   150: athrow
/*    */     //   151: aload #4
/*    */     //   153: dup
/*    */     //   154: invokevirtual get : ()B
/*    */     //   157: pop
/*    */     //   158: invokevirtual get : ()B
/*    */     //   161: iconst_1
/*    */     //   162: if_icmpne -> 171
/*    */     //   165: iconst_2
/*    */     //   166: istore #6
/*    */     //   168: goto -> 174
/*    */     //   171: iconst_1
/*    */     //   172: istore #6
/*    */     //   174: aload_2
/*    */     //   175: aload #4
/*    */     //   177: dup
/*    */     //   178: dup
/*    */     //   179: invokevirtual getInt : ()I
/*    */     //   182: invokestatic tx0 : (I)I
/*    */     //   185: istore #7
/*    */     //   187: invokevirtual getInt : ()I
/*    */     //   190: invokestatic tx0 : (I)I
/*    */     //   193: istore #8
/*    */     //   195: invokevirtual getInt : ()I
/*    */     //   198: invokestatic tx0 : (I)I
/*    */     //   201: istore #9
/*    */     //   203: invokevirtual in : ()B
/*    */     //   206: iconst_1
/*    */     //   207: if_icmpne -> 232
/*    */     //   210: aload #4
/*    */     //   212: dup
/*    */     //   213: invokevirtual getInt : ()I
/*    */     //   216: invokestatic tx0 : (I)I
/*    */     //   219: istore #10
/*    */     //   221: invokevirtual getInt : ()I
/*    */     //   224: invokestatic tx0 : (I)I
/*    */     //   227: istore #11
/*    */     //   229: goto -> 251
/*    */     //   232: aload #4
/*    */     //   234: dup
/*    */     //   235: invokevirtual getInt : ()I
/*    */     //   238: invokestatic tx0 : (I)I
/*    */     //   241: istore #11
/*    */     //   243: invokevirtual getInt : ()I
/*    */     //   246: invokestatic tx0 : (I)I
/*    */     //   249: istore #10
/*    */     //   251: iload #11
/*    */     //   253: ifle -> 276
/*    */     //   256: iload #11
/*    */     //   258: aload #4
/*    */     //   260: invokevirtual limit : ()I
/*    */     //   263: if_icmpge -> 276
/*    */     //   266: invokestatic cOM2 : ()Lf/xk0;
/*    */     //   269: iload_1
/*    */     //   270: iload #11
/*    */     //   272: aload_2
/*    */     //   273: invokevirtual gc : (IILf/s40;)V
/*    */     //   276: iload #10
/*    */     //   278: iload #9
/*    */     //   280: isub
/*    */     //   281: bipush #16
/*    */     //   283: idiv
/*    */     //   284: dup
/*    */     //   285: istore #11
/*    */     //   287: iflt -> 577
/*    */     //   290: iload #11
/*    */     //   292: sipush #640
/*    */     //   295: if_icmpgt -> 577
/*    */     //   298: iload #5
/*    */     //   300: ifne -> 316
/*    */     //   303: aload_2
/*    */     //   304: invokevirtual in : ()B
/*    */     //   307: iconst_1
/*    */     //   308: if_icmpne -> 316
/*    */     //   311: sipush #512
/*    */     //   314: istore #11
/*    */     //   316: iconst_0
/*    */     //   317: istore #5
/*    */     //   319: iload #5
/*    */     //   321: aload_0
/*    */     //   322: getfield dt0 : [Lf/f1;
/*    */     //   325: dup
/*    */     //   326: astore #12
/*    */     //   328: arraylength
/*    */     //   329: if_icmpge -> 409
/*    */     //   332: aload_0
/*    */     //   333: aload #12
/*    */     //   335: iload #5
/*    */     //   337: invokestatic nG0 : ()Lf/aM0;
/*    */     //   340: iload #6
/*    */     //   342: iload #8
/*    */     //   344: aload_2
/*    */     //   345: invokevirtual Fo0 : (IILf/s40;)Lf/f1;
/*    */     //   348: aastore
/*    */     //   349: getfield dt0 : [Lf/f1;
/*    */     //   352: iload #5
/*    */     //   354: aaload
/*    */     //   355: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   358: pop
/*    */     //   359: iinc #8, 32
/*    */     //   362: invokestatic Oj0 : ()Lf/L70;
/*    */     //   365: invokevirtual fu : ()B
/*    */     //   368: iconst_1
/*    */     //   369: if_icmpeq -> 403
/*    */     //   372: aload_0
/*    */     //   373: getfield dt0 : [Lf/f1;
/*    */     //   376: iload #5
/*    */     //   378: aload_2
/*    */     //   379: invokevirtual in : ()B
/*    */     //   382: invokestatic Oj0 : ()Lf/L70;
/*    */     //   385: invokevirtual fu : ()B
/*    */     //   388: iload_1
/*    */     //   389: aload_0
/*    */     //   390: getfield dt0 : [Lf/f1;
/*    */     //   393: iload #5
/*    */     //   395: aaload
/*    */     //   396: iload #5
/*    */     //   398: swap
/*    */     //   399: invokestatic Ts : (IIIILf/f1;)Lf/f1;
/*    */     //   402: aastore
/*    */     //   403: iinc #5, 1
/*    */     //   406: goto -> 319
/*    */     //   409: aload_0
/*    */     //   410: new f/Wf
/*    */     //   413: dup
/*    */     //   414: astore #5
/*    */     //   416: iload #7
/*    */     //   418: bipush #16
/*    */     //   420: bipush #80
/*    */     //   422: iload #6
/*    */     //   424: aload #4
/*    */     //   426: invokespecial <init> : (IIIILjava/nio/ByteBuffer;)V
/*    */     //   429: aload #5
/*    */     //   431: putfield QQ : Lf/Wf;
/*    */     //   434: new f/aE
/*    */     //   437: dup
/*    */     //   438: astore #5
/*    */     //   440: aload #4
/*    */     //   442: aload_0
/*    */     //   443: aload #5
/*    */     //   445: aload_2
/*    */     //   446: dup
/*    */     //   447: invokevirtual in : ()B
/*    */     //   450: istore_0
/*    */     //   451: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*    */     //   454: astore #6
/*    */     //   456: iload #9
/*    */     //   458: iload_1
/*    */     //   459: aload_3
/*    */     //   460: iload #11
/*    */     //   462: iload_0
/*    */     //   463: aload #6
/*    */     //   465: invokespecial <init> : (IILf/DC0;IBLjava/nio/ByteBuffer;)V
/*    */     //   468: aload #5
/*    */     //   470: putfield wR : Lf/aE;
/*    */     //   473: iload #10
/*    */     //   475: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   478: pop
/*    */     //   479: invokevirtual Zb : ()[Lf/a4;
/*    */     //   482: dup
/*    */     //   483: astore_0
/*    */     //   484: arraylength
/*    */     //   485: istore_1
/*    */     //   486: iconst_0
/*    */     //   487: istore_3
/*    */     //   488: iload_3
/*    */     //   489: iload_1
/*    */     //   490: if_icmpge -> 576
/*    */     //   493: aload_2
/*    */     //   494: aload_0
/*    */     //   495: iload_3
/*    */     //   496: aaload
/*    */     //   497: astore #5
/*    */     //   499: invokevirtual in : ()B
/*    */     //   502: iconst_1
/*    */     //   503: if_icmpne -> 533
/*    */     //   506: aload #5
/*    */     //   508: aload #4
/*    */     //   510: dup
/*    */     //   511: invokevirtual get : ()B
/*    */     //   514: istore #5
/*    */     //   516: invokevirtual get : ()B
/*    */     //   519: istore #6
/*    */     //   521: iload #5
/*    */     //   523: iconst_0
/*    */     //   524: iconst_0
/*    */     //   525: iload #6
/*    */     //   527: invokevirtual Pd : (BBBB)V
/*    */     //   530: goto -> 570
/*    */     //   533: aload #5
/*    */     //   535: aload #4
/*    */     //   537: dup
/*    */     //   538: dup2
/*    */     //   539: invokevirtual get : ()B
/*    */     //   542: istore #5
/*    */     //   544: invokevirtual get : ()B
/*    */     //   547: istore #6
/*    */     //   549: invokevirtual get : ()B
/*    */     //   552: istore #7
/*    */     //   554: invokevirtual get : ()B
/*    */     //   557: istore #8
/*    */     //   559: iload #5
/*    */     //   561: iload #6
/*    */     //   563: iload #7
/*    */     //   565: iload #8
/*    */     //   567: invokevirtual Pd : (BBBB)V
/*    */     //   570: iinc #3, 1
/*    */     //   573: goto -> 488
/*    */     //   576: return
/*    */     //   577: new java/lang/RuntimeException
/*    */     //   580: dup
/*    */     //   581: ldc 'Invalid tile count of '
/*    */     //   583: iload #11
/*    */     //   585: ldc ' for tileset '
/*    */     //   587: iload_1
/*    */     //   588: invokestatic KK : (Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
/*    */     //   591: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   594: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 581
/*    */     //   #2	-> 591
/*    */   }
/*    */   
/*    */   public final void else(ByteBuffer paramByteBuffer, g paramg, DC0 paramDC0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield wR : Lf/aE;
/*    */     //   4: getfield g3 : [Lf/a4;
/*    */     //   7: dup
/*    */     //   8: astore #4
/*    */     //   10: arraylength
/*    */     //   11: istore #5
/*    */     //   13: iconst_0
/*    */     //   14: istore #6
/*    */     //   16: iload #6
/*    */     //   18: iload #5
/*    */     //   20: if_icmpge -> 2517
/*    */     //   23: aload_0
/*    */     //   24: aload #4
/*    */     //   26: iload #6
/*    */     //   28: aaload
/*    */     //   29: dup
/*    */     //   30: astore #7
/*    */     //   32: getfield h : I
/*    */     //   35: istore #8
/*    */     //   37: getstatic f/Ps0.Ov0 : Lf/Ps0;
/*    */     //   40: astore #9
/*    */     //   42: getfield Um : Lf/s40;
/*    */     //   45: aload #9
/*    */     //   47: getfield np : Ljava/util/HashMap;
/*    */     //   50: swap
/*    */     //   51: invokevirtual in : ()B
/*    */     //   54: sipush #10000
/*    */     //   57: imul
/*    */     //   58: iload #8
/*    */     //   60: iadd
/*    */     //   61: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   64: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   67: checkcast f/wt0
/*    */     //   70: dup
/*    */     //   71: astore #8
/*    */     //   73: ifnull -> 530
/*    */     //   76: aload #8
/*    */     //   78: dup
/*    */     //   79: aload_1
/*    */     //   80: aload_0
/*    */     //   81: getfield dt0 : [Lf/f1;
/*    */     //   84: astore #9
/*    */     //   86: invokevirtual duplicate : ()Ljava/nio/ByteBuffer;
/*    */     //   89: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
/*    */     //   92: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/*    */     //   95: astore #10
/*    */     //   97: getfield ft : I
/*    */     //   100: istore #11
/*    */     //   102: iconst_2
/*    */     //   103: istore #12
/*    */     //   105: getfield mV : S
/*    */     //   108: dup
/*    */     //   109: istore #13
/*    */     //   111: sipush #512
/*    */     //   114: iand
/*    */     //   115: ifeq -> 125
/*    */     //   118: bipush #24
/*    */     //   120: istore #13
/*    */     //   122: goto -> 145
/*    */     //   125: iload #13
/*    */     //   127: sipush #256
/*    */     //   130: iand
/*    */     //   131: ifeq -> 141
/*    */     //   134: bipush #12
/*    */     //   136: istore #13
/*    */     //   138: goto -> 145
/*    */     //   141: bipush #8
/*    */     //   143: istore #13
/*    */     //   145: aload #10
/*    */     //   147: dup
/*    */     //   148: iload #11
/*    */     //   150: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   153: pop
/*    */     //   154: iconst_1
/*    */     //   155: invokestatic va0 : (Ljava/nio/ByteBuffer;I)I
/*    */     //   158: ifle -> 173
/*    */     //   161: iload #11
/*    */     //   163: aload #10
/*    */     //   165: invokestatic sf : (ILjava/nio/ByteBuffer;)[B
/*    */     //   168: astore #10
/*    */     //   170: goto -> 192
/*    */     //   173: aload #10
/*    */     //   175: iload #13
/*    */     //   177: iload #12
/*    */     //   179: imul
/*    */     //   180: bipush #32
/*    */     //   182: imul
/*    */     //   183: newarray byte
/*    */     //   185: dup
/*    */     //   186: astore #10
/*    */     //   188: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
/*    */     //   191: pop
/*    */     //   192: aload #10
/*    */     //   194: aload #8
/*    */     //   196: getfield Nb : [B
/*    */     //   199: astore #11
/*    */     //   201: arraylength
/*    */     //   202: iconst_2
/*    */     //   203: idiv
/*    */     //   204: iconst_2
/*    */     //   205: idiv
/*    */     //   206: bipush #8
/*    */     //   208: imul
/*    */     //   209: bipush #16
/*    */     //   211: idiv
/*    */     //   212: iconst_2
/*    */     //   213: idiv
/*    */     //   214: bipush #8
/*    */     //   216: idiv
/*    */     //   217: dup
/*    */     //   218: istore #12
/*    */     //   220: anewarray f/ZH
/*    */     //   223: astore #13
/*    */     //   225: bipush #16
/*    */     //   227: istore #14
/*    */     //   229: sipush #128
/*    */     //   232: istore #15
/*    */     //   234: iconst_0
/*    */     //   235: istore #16
/*    */     //   237: iload #16
/*    */     //   239: iload #12
/*    */     //   241: if_icmpge -> 477
/*    */     //   244: iload #16
/*    */     //   246: aload #13
/*    */     //   248: new f/ZH
/*    */     //   251: dup
/*    */     //   252: astore #17
/*    */     //   254: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   257: astore #18
/*    */     //   259: iload #14
/*    */     //   261: dup
/*    */     //   262: aload #18
/*    */     //   264: invokespecial <init> : (IILf/Uc;)V
/*    */     //   267: iload #16
/*    */     //   269: aload #17
/*    */     //   271: aastore
/*    */     //   272: iconst_0
/*    */     //   273: istore #17
/*    */     //   275: iconst_0
/*    */     //   276: istore #18
/*    */     //   278: iload #15
/*    */     //   280: imul
/*    */     //   281: istore #19
/*    */     //   283: iload #19
/*    */     //   285: istore #20
/*    */     //   287: iload #20
/*    */     //   289: iload #19
/*    */     //   291: iload #15
/*    */     //   293: iadd
/*    */     //   294: if_icmpge -> 471
/*    */     //   297: aload #10
/*    */     //   299: iload #20
/*    */     //   301: aload #9
/*    */     //   303: aload #11
/*    */     //   305: iload #20
/*    */     //   307: bipush #32
/*    */     //   309: idiv
/*    */     //   310: aload #11
/*    */     //   312: arraylength
/*    */     //   313: irem
/*    */     //   314: baload
/*    */     //   315: aaload
/*    */     //   316: astore #21
/*    */     //   318: baload
/*    */     //   319: dup
/*    */     //   320: istore #22
/*    */     //   322: bipush #15
/*    */     //   324: iand
/*    */     //   325: dup
/*    */     //   326: istore #23
/*    */     //   328: iload #22
/*    */     //   330: iconst_4
/*    */     //   331: ishr
/*    */     //   332: bipush #15
/*    */     //   334: iand
/*    */     //   335: istore #22
/*    */     //   337: ifle -> 367
/*    */     //   340: aload #13
/*    */     //   342: iload #16
/*    */     //   344: aaload
/*    */     //   345: aload #21
/*    */     //   347: getfield LPT2 : [I
/*    */     //   350: iload #23
/*    */     //   352: iaload
/*    */     //   353: istore #23
/*    */     //   355: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   358: iload #17
/*    */     //   360: iload #18
/*    */     //   362: iload #23
/*    */     //   364: invokevirtual YO : (III)V
/*    */     //   367: iload #22
/*    */     //   369: ifle -> 405
/*    */     //   372: aload #13
/*    */     //   374: iload #16
/*    */     //   376: aaload
/*    */     //   377: aload #21
/*    */     //   379: iload #17
/*    */     //   381: iconst_1
/*    */     //   382: iadd
/*    */     //   383: istore #21
/*    */     //   385: getfield LPT2 : [I
/*    */     //   388: iload #22
/*    */     //   390: iaload
/*    */     //   391: istore #22
/*    */     //   393: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   396: iload #21
/*    */     //   398: iload #18
/*    */     //   400: iload #22
/*    */     //   402: invokevirtual YO : (III)V
/*    */     //   405: iload #17
/*    */     //   407: iconst_2
/*    */     //   408: iadd
/*    */     //   409: dup
/*    */     //   410: istore #17
/*    */     //   412: bipush #8
/*    */     //   414: irem
/*    */     //   415: ifne -> 465
/*    */     //   418: iload #18
/*    */     //   420: iconst_1
/*    */     //   421: iadd
/*    */     //   422: dup
/*    */     //   423: istore #18
/*    */     //   425: bipush #8
/*    */     //   427: irem
/*    */     //   428: ifne -> 437
/*    */     //   431: iinc #18, -8
/*    */     //   434: goto -> 440
/*    */     //   437: iinc #17, -8
/*    */     //   440: iload #17
/*    */     //   442: iload #14
/*    */     //   444: if_icmpne -> 465
/*    */     //   447: iload #18
/*    */     //   449: bipush #8
/*    */     //   451: iadd
/*    */     //   452: istore #17
/*    */     //   454: iconst_0
/*    */     //   455: istore #18
/*    */     //   457: iload #18
/*    */     //   459: iload #17
/*    */     //   461: istore #18
/*    */     //   463: istore #17
/*    */     //   465: iinc #20, 1
/*    */     //   468: goto -> 287
/*    */     //   471: iinc #16, 1
/*    */     //   474: goto -> 237
/*    */     //   477: aload #8
/*    */     //   479: iload #12
/*    */     //   481: putfield sG : I
/*    */     //   484: iconst_0
/*    */     //   485: istore #8
/*    */     //   487: iload #8
/*    */     //   489: iload #12
/*    */     //   491: if_icmpge -> 530
/*    */     //   494: aload #13
/*    */     //   496: iload #8
/*    */     //   498: aload_2
/*    */     //   499: dup
/*    */     //   500: dup
/*    */     //   501: aload #13
/*    */     //   503: iload #8
/*    */     //   505: aaload
/*    */     //   506: astore #9
/*    */     //   508: monitorenter
/*    */     //   509: aconst_null
/*    */     //   510: aload #9
/*    */     //   512: invokevirtual EI0 : (Ljava/lang/String;Lf/ZH;)Lf/cx0;
/*    */     //   515: pop
/*    */     //   516: monitorexit
/*    */     //   517: aaload
/*    */     //   518: invokevirtual dispose : ()V
/*    */     //   521: iinc #8, 1
/*    */     //   524: goto -> 487
/*    */     //   527: aload_2
/*    */     //   528: monitorexit
/*    */     //   529: athrow
/*    */     //   530: iconst_2
/*    */     //   531: anewarray f/ZH
/*    */     //   534: dup
/*    */     //   535: dup
/*    */     //   536: astore #8
/*    */     //   538: new f/ZH
/*    */     //   541: dup
/*    */     //   542: astore #9
/*    */     //   544: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   547: astore #10
/*    */     //   549: bipush #16
/*    */     //   551: bipush #16
/*    */     //   553: aload #10
/*    */     //   555: invokespecial <init> : (IILf/Uc;)V
/*    */     //   558: iconst_0
/*    */     //   559: aload #9
/*    */     //   561: aastore
/*    */     //   562: new f/ZH
/*    */     //   565: dup
/*    */     //   566: astore #9
/*    */     //   568: bipush #16
/*    */     //   570: bipush #16
/*    */     //   572: aload #10
/*    */     //   574: invokespecial <init> : (IILf/Uc;)V
/*    */     //   577: iconst_1
/*    */     //   578: aload #9
/*    */     //   580: aastore
/*    */     //   581: iconst_2
/*    */     //   582: iconst_4
/*    */     //   583: multianewarray[[Lf/ZH; 2
/*    */     //   587: astore #9
/*    */     //   589: iconst_2
/*    */     //   590: iconst_4
/*    */     //   591: multianewarray[[[Lf/ZH; 2
/*    */     //   595: astore #10
/*    */     //   597: iconst_0
/*    */     //   598: istore #11
/*    */     //   600: iconst_0
/*    */     //   601: istore #12
/*    */     //   603: iload #12
/*    */     //   605: iconst_2
/*    */     //   606: if_icmpge -> 1583
/*    */     //   609: iconst_1
/*    */     //   610: istore #13
/*    */     //   612: iconst_0
/*    */     //   613: istore #14
/*    */     //   615: iload #14
/*    */     //   617: iconst_4
/*    */     //   618: if_icmpge -> 1521
/*    */     //   621: aload_0
/*    */     //   622: aload #7
/*    */     //   624: getfield Lh : [[Lf/uI0;
/*    */     //   627: iload #12
/*    */     //   629: aaload
/*    */     //   630: iload #14
/*    */     //   632: aaload
/*    */     //   633: astore #15
/*    */     //   635: getfield DD : Z
/*    */     //   638: ifeq -> 797
/*    */     //   641: aload #15
/*    */     //   643: invokevirtual Eu0 : ()I
/*    */     //   646: aload_0
/*    */     //   647: getfield uF0 : Lf/DC0;
/*    */     //   650: dup
/*    */     //   651: astore #16
/*    */     //   653: getfield wR : Lf/aE;
/*    */     //   656: getfield g3 : [Lf/a4;
/*    */     //   659: arraylength
/*    */     //   660: if_icmplt -> 730
/*    */     //   663: aload #15
/*    */     //   665: dup
/*    */     //   666: aload_0
/*    */     //   667: getfield QQ : Lf/Wf;
/*    */     //   670: astore #16
/*    */     //   672: invokevirtual Eu0 : ()I
/*    */     //   675: aload_0
/*    */     //   676: getfield uF0 : Lf/DC0;
/*    */     //   679: getfield wR : Lf/aE;
/*    */     //   682: getfield g3 : [Lf/a4;
/*    */     //   685: arraylength
/*    */     //   686: isub
/*    */     //   687: istore #17
/*    */     //   689: invokevirtual EL0 : ()B
/*    */     //   692: bipush #6
/*    */     //   694: if_icmplt -> 712
/*    */     //   697: aload_0
/*    */     //   698: getfield dt0 : [Lf/f1;
/*    */     //   701: aload #15
/*    */     //   703: invokevirtual EL0 : ()B
/*    */     //   706: aaload
/*    */     //   707: astore #18
/*    */     //   709: goto -> 783
/*    */     //   712: aload_0
/*    */     //   713: getfield uF0 : Lf/DC0;
/*    */     //   716: getfield dt0 : [Lf/f1;
/*    */     //   719: aload #15
/*    */     //   721: invokevirtual EL0 : ()B
/*    */     //   724: aaload
/*    */     //   725: astore #18
/*    */     //   727: goto -> 783
/*    */     //   730: aload #15
/*    */     //   732: dup
/*    */     //   733: aload #16
/*    */     //   735: getfield QQ : Lf/Wf;
/*    */     //   738: astore #16
/*    */     //   740: invokevirtual Eu0 : ()I
/*    */     //   743: istore #17
/*    */     //   745: invokevirtual EL0 : ()B
/*    */     //   748: bipush #6
/*    */     //   750: if_icmplt -> 768
/*    */     //   753: aload_0
/*    */     //   754: getfield dt0 : [Lf/f1;
/*    */     //   757: aload #15
/*    */     //   759: invokevirtual EL0 : ()B
/*    */     //   762: aaload
/*    */     //   763: astore #18
/*    */     //   765: goto -> 783
/*    */     //   768: aload_0
/*    */     //   769: getfield uF0 : Lf/DC0;
/*    */     //   772: getfield dt0 : [Lf/f1;
/*    */     //   775: aload #15
/*    */     //   777: invokevirtual EL0 : ()B
/*    */     //   780: aaload
/*    */     //   781: astore #18
/*    */     //   783: aload #16
/*    */     //   785: iload #17
/*    */     //   787: aload #18
/*    */     //   789: invokevirtual kl0 : (ILf/f1;)Lf/ZH;
/*    */     //   792: astore #16
/*    */     //   794: goto -> 873
/*    */     //   797: aload #15
/*    */     //   799: invokevirtual Eu0 : ()I
/*    */     //   802: aload_0
/*    */     //   803: getfield wR : Lf/aE;
/*    */     //   806: getfield g3 : [Lf/a4;
/*    */     //   809: arraylength
/*    */     //   810: if_icmplt -> 849
/*    */     //   813: aload_3
/*    */     //   814: getfield QQ : Lf/Wf;
/*    */     //   817: aload #15
/*    */     //   819: invokevirtual Eu0 : ()I
/*    */     //   822: aload_0
/*    */     //   823: getfield wR : Lf/aE;
/*    */     //   826: getfield g3 : [Lf/a4;
/*    */     //   829: arraylength
/*    */     //   830: isub
/*    */     //   831: aload_3
/*    */     //   832: getfield dt0 : [Lf/f1;
/*    */     //   835: aload #15
/*    */     //   837: invokevirtual EL0 : ()B
/*    */     //   840: aaload
/*    */     //   841: invokevirtual kl0 : (ILf/f1;)Lf/ZH;
/*    */     //   844: astore #16
/*    */     //   846: goto -> 873
/*    */     //   849: aload_0
/*    */     //   850: getfield QQ : Lf/Wf;
/*    */     //   853: aload #15
/*    */     //   855: invokevirtual Eu0 : ()I
/*    */     //   858: aload_0
/*    */     //   859: getfield dt0 : [Lf/f1;
/*    */     //   862: aload #15
/*    */     //   864: invokevirtual EL0 : ()B
/*    */     //   867: aaload
/*    */     //   868: invokevirtual kl0 : (ILf/f1;)Lf/ZH;
/*    */     //   871: astore #16
/*    */     //   873: aload #16
/*    */     //   875: ifnull -> 1108
/*    */     //   878: aload #15
/*    */     //   880: iconst_0
/*    */     //   881: istore #13
/*    */     //   883: getfield vx0 : S
/*    */     //   886: dup
/*    */     //   887: istore #17
/*    */     //   889: sipush #1024
/*    */     //   892: iand
/*    */     //   893: ifeq -> 902
/*    */     //   896: iconst_1
/*    */     //   897: istore #18
/*    */     //   899: goto -> 905
/*    */     //   902: iconst_0
/*    */     //   903: istore #18
/*    */     //   905: iload #18
/*    */     //   907: ifne -> 933
/*    */     //   910: iload #17
/*    */     //   912: sipush #2048
/*    */     //   915: iand
/*    */     //   916: ifeq -> 925
/*    */     //   919: iconst_1
/*    */     //   920: istore #17
/*    */     //   922: goto -> 928
/*    */     //   925: iconst_0
/*    */     //   926: istore #17
/*    */     //   928: iload #17
/*    */     //   930: ifeq -> 1108
/*    */     //   933: new f/ZH
/*    */     //   936: dup
/*    */     //   937: astore #17
/*    */     //   939: aload #16
/*    */     //   941: invokevirtual TU : ()Lf/Uc;
/*    */     //   944: astore #18
/*    */     //   946: bipush #8
/*    */     //   948: bipush #8
/*    */     //   950: aload #18
/*    */     //   952: invokespecial <init> : (IILf/Uc;)V
/*    */     //   955: iconst_0
/*    */     //   956: istore #18
/*    */     //   958: iload #18
/*    */     //   960: bipush #8
/*    */     //   962: if_icmpge -> 1099
/*    */     //   965: iconst_0
/*    */     //   966: istore #19
/*    */     //   968: iload #19
/*    */     //   970: bipush #8
/*    */     //   972: if_icmpge -> 1093
/*    */     //   975: aload #15
/*    */     //   977: getfield vx0 : S
/*    */     //   980: dup
/*    */     //   981: istore #20
/*    */     //   983: sipush #1024
/*    */     //   986: iand
/*    */     //   987: ifeq -> 996
/*    */     //   990: iconst_1
/*    */     //   991: istore #21
/*    */     //   993: goto -> 999
/*    */     //   996: iconst_0
/*    */     //   997: istore #21
/*    */     //   999: iload #21
/*    */     //   1001: ifeq -> 1016
/*    */     //   1004: bipush #8
/*    */     //   1006: iload #18
/*    */     //   1008: isub
/*    */     //   1009: iconst_1
/*    */     //   1010: isub
/*    */     //   1011: istore #21
/*    */     //   1013: goto -> 1020
/*    */     //   1016: iload #18
/*    */     //   1018: istore #21
/*    */     //   1020: iload #20
/*    */     //   1022: sipush #2048
/*    */     //   1025: iand
/*    */     //   1026: ifeq -> 1035
/*    */     //   1029: iconst_1
/*    */     //   1030: istore #20
/*    */     //   1032: goto -> 1038
/*    */     //   1035: iconst_0
/*    */     //   1036: istore #20
/*    */     //   1038: iload #20
/*    */     //   1040: ifeq -> 1055
/*    */     //   1043: bipush #8
/*    */     //   1045: iload #19
/*    */     //   1047: isub
/*    */     //   1048: iconst_1
/*    */     //   1049: isub
/*    */     //   1050: istore #20
/*    */     //   1052: goto -> 1059
/*    */     //   1055: iload #19
/*    */     //   1057: istore #20
/*    */     //   1059: aload #17
/*    */     //   1061: aload #16
/*    */     //   1063: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   1066: iload #21
/*    */     //   1068: iload #20
/*    */     //   1070: invokevirtual Fl : (II)I
/*    */     //   1073: istore #20
/*    */     //   1075: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   1078: iload #18
/*    */     //   1080: iload #19
/*    */     //   1082: iload #20
/*    */     //   1084: invokevirtual YO : (III)V
/*    */     //   1087: iinc #19, 1
/*    */     //   1090: goto -> 968
/*    */     //   1093: iinc #18, 1
/*    */     //   1096: goto -> 958
/*    */     //   1099: aload #16
/*    */     //   1101: invokevirtual dispose : ()V
/*    */     //   1104: aload #17
/*    */     //   1106: astore #16
/*    */     //   1108: aload #16
/*    */     //   1110: aload #9
/*    */     //   1112: iload #12
/*    */     //   1114: aaload
/*    */     //   1115: iload #14
/*    */     //   1117: aload #16
/*    */     //   1119: aastore
/*    */     //   1120: ifnull -> 1151
/*    */     //   1123: aload #8
/*    */     //   1125: iload #12
/*    */     //   1127: aaload
/*    */     //   1128: aload #16
/*    */     //   1130: iload #14
/*    */     //   1132: dup
/*    */     //   1133: iconst_2
/*    */     //   1134: irem
/*    */     //   1135: bipush #8
/*    */     //   1137: imul
/*    */     //   1138: istore #16
/*    */     //   1140: iconst_2
/*    */     //   1141: idiv
/*    */     //   1142: bipush #8
/*    */     //   1144: imul
/*    */     //   1145: iload #16
/*    */     //   1147: swap
/*    */     //   1148: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   1151: aload_0
/*    */     //   1152: aload #15
/*    */     //   1154: aload #10
/*    */     //   1156: iload #12
/*    */     //   1158: aaload
/*    */     //   1159: astore #16
/*    */     //   1161: getstatic f/xk0.Sj0 : Lf/xk0;
/*    */     //   1164: astore #17
/*    */     //   1166: invokevirtual Eu0 : ()I
/*    */     //   1169: istore #18
/*    */     //   1171: getfield DD : Z
/*    */     //   1174: ifeq -> 1209
/*    */     //   1177: aload #15
/*    */     //   1179: invokevirtual Eu0 : ()I
/*    */     //   1182: aload_0
/*    */     //   1183: getfield uF0 : Lf/DC0;
/*    */     //   1186: dup
/*    */     //   1187: astore #19
/*    */     //   1189: getfield wR : Lf/aE;
/*    */     //   1192: getfield g3 : [Lf/a4;
/*    */     //   1195: arraylength
/*    */     //   1196: if_icmpgt -> 1209
/*    */     //   1199: aload #19
/*    */     //   1201: getfield ny : I
/*    */     //   1204: istore #19
/*    */     //   1206: goto -> 1215
/*    */     //   1209: aload_0
/*    */     //   1210: getfield ny : I
/*    */     //   1213: istore #19
/*    */     //   1215: aload_0
/*    */     //   1216: getfield DD : Z
/*    */     //   1219: ifeq -> 1260
/*    */     //   1222: aload #15
/*    */     //   1224: invokevirtual Eu0 : ()I
/*    */     //   1227: aload_0
/*    */     //   1228: getfield uF0 : Lf/DC0;
/*    */     //   1231: dup
/*    */     //   1232: astore #20
/*    */     //   1234: getfield wR : Lf/aE;
/*    */     //   1237: getfield g3 : [Lf/a4;
/*    */     //   1240: arraylength
/*    */     //   1241: if_icmpgt -> 1260
/*    */     //   1244: aload #20
/*    */     //   1246: getfield dt0 : [Lf/f1;
/*    */     //   1249: aload #15
/*    */     //   1251: invokevirtual EL0 : ()B
/*    */     //   1254: aaload
/*    */     //   1255: astore #15
/*    */     //   1257: goto -> 1272
/*    */     //   1260: aload_0
/*    */     //   1261: getfield dt0 : [Lf/f1;
/*    */     //   1264: aload #15
/*    */     //   1266: invokevirtual EL0 : ()B
/*    */     //   1269: aaload
/*    */     //   1270: astore #15
/*    */     //   1272: aload #17
/*    */     //   1274: aload_0
/*    */     //   1275: getfield Um : Lf/s40;
/*    */     //   1278: astore #17
/*    */     //   1280: getfield Pf0 : [Lf/Lu0;
/*    */     //   1283: dup
/*    */     //   1284: astore #20
/*    */     //   1286: arraylength
/*    */     //   1287: istore #21
/*    */     //   1289: iconst_0
/*    */     //   1290: istore #22
/*    */     //   1292: iload #22
/*    */     //   1294: iload #21
/*    */     //   1296: if_icmpge -> 1491
/*    */     //   1299: aload #20
/*    */     //   1301: iload #22
/*    */     //   1303: aaload
/*    */     //   1304: dup
/*    */     //   1305: astore #23
/*    */     //   1307: getfield su0 : I
/*    */     //   1310: ifne -> 1316
/*    */     //   1313: goto -> 1485
/*    */     //   1316: iload #19
/*    */     //   1318: aload #23
/*    */     //   1320: getfield YJ0 : I
/*    */     //   1323: if_icmpne -> 1485
/*    */     //   1326: aload #17
/*    */     //   1328: invokevirtual in : ()B
/*    */     //   1331: aload #23
/*    */     //   1333: getfield bz : B
/*    */     //   1336: if_icmpne -> 1485
/*    */     //   1339: iload #18
/*    */     //   1341: aload #23
/*    */     //   1343: getfield ez0 : I
/*    */     //   1346: if_icmplt -> 1485
/*    */     //   1349: iload #18
/*    */     //   1351: aload #23
/*    */     //   1353: getfield zf : I
/*    */     //   1356: if_icmpge -> 1485
/*    */     //   1359: aload #23
/*    */     //   1361: getfield iC : Ljava/util/HashMap;
/*    */     //   1364: aload #15
/*    */     //   1366: getfield YQ : I
/*    */     //   1369: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1372: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1375: checkcast f/zM
/*    */     //   1378: dup
/*    */     //   1379: astore #17
/*    */     //   1381: ifnonnull -> 1455
/*    */     //   1384: aload #23
/*    */     //   1386: new f/zM
/*    */     //   1389: dup
/*    */     //   1390: astore #17
/*    */     //   1392: aload_1
/*    */     //   1393: aload #23
/*    */     //   1395: dup
/*    */     //   1396: dup
/*    */     //   1397: dup2
/*    */     //   1398: getfield su0 : I
/*    */     //   1401: istore #19
/*    */     //   1403: getfield wa : I
/*    */     //   1406: istore #20
/*    */     //   1408: getfield ez0 : I
/*    */     //   1411: istore #21
/*    */     //   1413: getfield YB : I
/*    */     //   1416: istore #22
/*    */     //   1418: getfield vA0 : I
/*    */     //   1421: istore #23
/*    */     //   1423: iload #19
/*    */     //   1425: aload #15
/*    */     //   1427: iload #20
/*    */     //   1429: iload #21
/*    */     //   1431: iload #22
/*    */     //   1433: iload #23
/*    */     //   1435: invokespecial <init> : (Ljava/nio/ByteBuffer;ILf/f1;IIII)V
/*    */     //   1438: getfield iC : Ljava/util/HashMap;
/*    */     //   1441: aload #15
/*    */     //   1443: getfield YQ : I
/*    */     //   1446: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1449: aload #17
/*    */     //   1451: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1454: pop
/*    */     //   1455: aload #17
/*    */     //   1457: getfield Qs : [[Lf/ZH;
/*    */     //   1460: dup
/*    */     //   1461: astore #15
/*    */     //   1463: ifnonnull -> 1469
/*    */     //   1466: goto -> 1491
/*    */     //   1469: aload #15
/*    */     //   1471: iload #18
/*    */     //   1473: aload #17
/*    */     //   1475: getfield Yb : I
/*    */     //   1478: isub
/*    */     //   1479: aaload
/*    */     //   1480: astore #15
/*    */     //   1482: goto -> 1494
/*    */     //   1485: iinc #22, 1
/*    */     //   1488: goto -> 1292
/*    */     //   1491: aconst_null
/*    */     //   1492: astore #15
/*    */     //   1494: aload #10
/*    */     //   1496: iload #12
/*    */     //   1498: aload #16
/*    */     //   1500: iload #14
/*    */     //   1502: aload #15
/*    */     //   1504: aastore
/*    */     //   1505: aaload
/*    */     //   1506: iload #14
/*    */     //   1508: aaload
/*    */     //   1509: ifnull -> 1515
/*    */     //   1512: iconst_1
/*    */     //   1513: istore #11
/*    */     //   1515: iinc #14, 1
/*    */     //   1518: goto -> 615
/*    */     //   1521: iload #13
/*    */     //   1523: ifeq -> 1545
/*    */     //   1526: aload_2
/*    */     //   1527: dup
/*    */     //   1528: aconst_null
/*    */     //   1529: astore #13
/*    */     //   1531: monitorenter
/*    */     //   1532: aconst_null
/*    */     //   1533: aload #13
/*    */     //   1535: invokevirtual EI0 : (Ljava/lang/String;Lf/ZH;)Lf/cx0;
/*    */     //   1538: pop
/*    */     //   1539: goto -> 1564
/*    */     //   1542: aload_2
/*    */     //   1543: monitorexit
/*    */     //   1544: athrow
/*    */     //   1545: aload_2
/*    */     //   1546: dup
/*    */     //   1547: aload #8
/*    */     //   1549: iload #12
/*    */     //   1551: aaload
/*    */     //   1552: astore #13
/*    */     //   1554: monitorenter
/*    */     //   1555: aconst_null
/*    */     //   1556: aload #13
/*    */     //   1558: invokevirtual EI0 : (Ljava/lang/String;Lf/ZH;)Lf/cx0;
/*    */     //   1561: goto -> 1538
/*    */     //   1564: aload #8
/*    */     //   1566: iload #12
/*    */     //   1568: aload_2
/*    */     //   1569: monitorexit
/*    */     //   1570: aaload
/*    */     //   1571: invokevirtual dispose : ()V
/*    */     //   1574: iinc #12, 1
/*    */     //   1577: goto -> 603
/*    */     //   1580: aload_2
/*    */     //   1581: monitorexit
/*    */     //   1582: athrow
/*    */     //   1583: iload #11
/*    */     //   1585: ifeq -> 2436
/*    */     //   1588: aload #7
/*    */     //   1590: getfield qt0 : [[Lf/pe0;
/*    */     //   1593: ifnull -> 1599
/*    */     //   1596: goto -> 2436
/*    */     //   1599: aload #7
/*    */     //   1601: iconst_2
/*    */     //   1602: newarray int
/*    */     //   1604: putfield W6 : [I
/*    */     //   1607: iconst_0
/*    */     //   1608: istore #8
/*    */     //   1610: iload #8
/*    */     //   1612: aload #7
/*    */     //   1614: getfield Lh : [[Lf/uI0;
/*    */     //   1617: arraylength
/*    */     //   1618: if_icmpge -> 1701
/*    */     //   1621: iconst_0
/*    */     //   1622: istore #11
/*    */     //   1624: iload #11
/*    */     //   1626: aload #7
/*    */     //   1628: getfield Lh : [[Lf/uI0;
/*    */     //   1631: iload #8
/*    */     //   1633: aaload
/*    */     //   1634: arraylength
/*    */     //   1635: if_icmpge -> 1695
/*    */     //   1638: aload #10
/*    */     //   1640: iload #8
/*    */     //   1642: aaload
/*    */     //   1643: dup
/*    */     //   1644: astore #12
/*    */     //   1646: ifnull -> 1689
/*    */     //   1649: aload #12
/*    */     //   1651: iload #11
/*    */     //   1653: aaload
/*    */     //   1654: dup
/*    */     //   1655: astore #12
/*    */     //   1657: ifnonnull -> 1663
/*    */     //   1660: goto -> 1689
/*    */     //   1663: aload #12
/*    */     //   1665: arraylength
/*    */     //   1666: aload #7
/*    */     //   1668: getfield W6 : [I
/*    */     //   1671: dup
/*    */     //   1672: astore #13
/*    */     //   1674: iload #8
/*    */     //   1676: iaload
/*    */     //   1677: if_icmple -> 1689
/*    */     //   1680: aload #13
/*    */     //   1682: aload #12
/*    */     //   1684: arraylength
/*    */     //   1685: iload #8
/*    */     //   1687: swap
/*    */     //   1688: iastore
/*    */     //   1689: iinc #11, 1
/*    */     //   1692: goto -> 1624
/*    */     //   1695: iinc #8, 1
/*    */     //   1698: goto -> 1610
/*    */     //   1701: aload #7
/*    */     //   1703: iconst_2
/*    */     //   1704: anewarray [Lf/ZH;
/*    */     //   1707: astore #8
/*    */     //   1709: iconst_2
/*    */     //   1710: anewarray [Lf/pe0;
/*    */     //   1713: putfield qt0 : [[Lf/pe0;
/*    */     //   1716: iconst_0
/*    */     //   1717: istore #11
/*    */     //   1719: iload #11
/*    */     //   1721: aload #7
/*    */     //   1723: getfield Lh : [[Lf/uI0;
/*    */     //   1726: arraylength
/*    */     //   1727: if_icmpge -> 1820
/*    */     //   1730: aload #7
/*    */     //   1732: aload #8
/*    */     //   1734: iload #11
/*    */     //   1736: aload #7
/*    */     //   1738: getfield W6 : [I
/*    */     //   1741: iload #11
/*    */     //   1743: iaload
/*    */     //   1744: dup
/*    */     //   1745: istore #12
/*    */     //   1747: anewarray f/ZH
/*    */     //   1750: aastore
/*    */     //   1751: getfield qt0 : [[Lf/pe0;
/*    */     //   1754: iload #11
/*    */     //   1756: iload #12
/*    */     //   1758: anewarray f/pe0
/*    */     //   1761: aastore
/*    */     //   1762: iconst_0
/*    */     //   1763: istore #12
/*    */     //   1765: iload #12
/*    */     //   1767: aload #7
/*    */     //   1769: getfield W6 : [I
/*    */     //   1772: iload #11
/*    */     //   1774: iaload
/*    */     //   1775: if_icmpge -> 1814
/*    */     //   1778: aload #8
/*    */     //   1780: iload #11
/*    */     //   1782: aaload
/*    */     //   1783: iload #12
/*    */     //   1785: new f/ZH
/*    */     //   1788: dup
/*    */     //   1789: astore #13
/*    */     //   1791: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   1794: astore #14
/*    */     //   1796: bipush #16
/*    */     //   1798: bipush #16
/*    */     //   1800: aload #14
/*    */     //   1802: invokespecial <init> : (IILf/Uc;)V
/*    */     //   1805: aload #13
/*    */     //   1807: aastore
/*    */     //   1808: iinc #12, 1
/*    */     //   1811: goto -> 1765
/*    */     //   1814: iinc #11, 1
/*    */     //   1817: goto -> 1719
/*    */     //   1820: aload #7
/*    */     //   1822: getfield W6 : [I
/*    */     //   1825: dup
/*    */     //   1826: astore #11
/*    */     //   1828: iconst_0
/*    */     //   1829: iaload
/*    */     //   1830: iconst_1
/*    */     //   1831: if_icmpge -> 1845
/*    */     //   1834: aload #11
/*    */     //   1836: iconst_1
/*    */     //   1837: iaload
/*    */     //   1838: iconst_1
/*    */     //   1839: if_icmpge -> 1845
/*    */     //   1842: goto -> 2436
/*    */     //   1845: iconst_0
/*    */     //   1846: istore #11
/*    */     //   1848: iload #11
/*    */     //   1850: aload #7
/*    */     //   1852: getfield Lh : [[Lf/uI0;
/*    */     //   1855: dup
/*    */     //   1856: astore #12
/*    */     //   1858: arraylength
/*    */     //   1859: if_icmpge -> 2436
/*    */     //   1862: aload #7
/*    */     //   1864: getfield MF : [I
/*    */     //   1867: iload #11
/*    */     //   1869: aload #12
/*    */     //   1871: iload #11
/*    */     //   1873: aaload
/*    */     //   1874: iconst_0
/*    */     //   1875: aaload
/*    */     //   1876: invokevirtual Eu0 : ()I
/*    */     //   1879: iastore
/*    */     //   1880: iconst_0
/*    */     //   1881: istore #12
/*    */     //   1883: iload #12
/*    */     //   1885: aload #7
/*    */     //   1887: getfield Lh : [[Lf/uI0;
/*    */     //   1890: iload #11
/*    */     //   1892: aaload
/*    */     //   1893: arraylength
/*    */     //   1894: if_icmpge -> 2364
/*    */     //   1897: aload #10
/*    */     //   1899: iload #11
/*    */     //   1901: aaload
/*    */     //   1902: iload #12
/*    */     //   1904: aaload
/*    */     //   1905: ifnonnull -> 2026
/*    */     //   1908: iconst_0
/*    */     //   1909: istore #13
/*    */     //   1911: iload #13
/*    */     //   1913: aload #7
/*    */     //   1915: getfield W6 : [I
/*    */     //   1918: iload #11
/*    */     //   1920: iaload
/*    */     //   1921: if_icmpge -> 2358
/*    */     //   1924: aload #9
/*    */     //   1926: iload #11
/*    */     //   1928: aaload
/*    */     //   1929: iload #12
/*    */     //   1931: aaload
/*    */     //   1932: ifnull -> 2020
/*    */     //   1935: aload #8
/*    */     //   1937: iload #11
/*    */     //   1939: aaload
/*    */     //   1940: dup
/*    */     //   1941: astore #14
/*    */     //   1943: iload #13
/*    */     //   1945: aaload
/*    */     //   1946: ifnonnull -> 1976
/*    */     //   1949: aload #14
/*    */     //   1951: new f/ZH
/*    */     //   1954: dup
/*    */     //   1955: astore #14
/*    */     //   1957: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   1960: astore #15
/*    */     //   1962: bipush #16
/*    */     //   1964: bipush #16
/*    */     //   1966: aload #15
/*    */     //   1968: invokespecial <init> : (IILf/Uc;)V
/*    */     //   1971: iload #13
/*    */     //   1973: aload #14
/*    */     //   1975: aastore
/*    */     //   1976: aload #8
/*    */     //   1978: iload #11
/*    */     //   1980: aaload
/*    */     //   1981: iload #13
/*    */     //   1983: aaload
/*    */     //   1984: iload #12
/*    */     //   1986: dup
/*    */     //   1987: aload #9
/*    */     //   1989: iload #11
/*    */     //   1991: aaload
/*    */     //   1992: iload #12
/*    */     //   1994: aaload
/*    */     //   1995: astore #14
/*    */     //   1997: iconst_2
/*    */     //   1998: irem
/*    */     //   1999: bipush #8
/*    */     //   2001: imul
/*    */     //   2002: istore #15
/*    */     //   2004: iconst_2
/*    */     //   2005: idiv
/*    */     //   2006: bipush #8
/*    */     //   2008: imul
/*    */     //   2009: istore #16
/*    */     //   2011: aload #14
/*    */     //   2013: iload #15
/*    */     //   2015: iload #16
/*    */     //   2017: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   2020: iinc #13, 1
/*    */     //   2023: goto -> 1911
/*    */     //   2026: iconst_0
/*    */     //   2027: istore #13
/*    */     //   2029: iload #13
/*    */     //   2031: aload #7
/*    */     //   2033: getfield W6 : [I
/*    */     //   2036: iload #11
/*    */     //   2038: iaload
/*    */     //   2039: if_icmpge -> 2358
/*    */     //   2042: aload #7
/*    */     //   2044: aload #10
/*    */     //   2046: iload #11
/*    */     //   2048: aaload
/*    */     //   2049: iload #12
/*    */     //   2051: aaload
/*    */     //   2052: dup
/*    */     //   2053: iload #13
/*    */     //   2055: swap
/*    */     //   2056: arraylength
/*    */     //   2057: irem
/*    */     //   2058: aaload
/*    */     //   2059: astore #14
/*    */     //   2061: iconst_0
/*    */     //   2062: istore #15
/*    */     //   2064: getfield Lh : [[Lf/uI0;
/*    */     //   2067: iload #11
/*    */     //   2069: aaload
/*    */     //   2070: iload #12
/*    */     //   2072: aaload
/*    */     //   2073: dup
/*    */     //   2074: astore #16
/*    */     //   2076: getfield vx0 : S
/*    */     //   2079: dup
/*    */     //   2080: istore #17
/*    */     //   2082: sipush #1024
/*    */     //   2085: iand
/*    */     //   2086: ifeq -> 2095
/*    */     //   2089: iconst_1
/*    */     //   2090: istore #18
/*    */     //   2092: goto -> 2098
/*    */     //   2095: iconst_0
/*    */     //   2096: istore #18
/*    */     //   2098: iload #18
/*    */     //   2100: ifne -> 2126
/*    */     //   2103: iload #17
/*    */     //   2105: sipush #2048
/*    */     //   2108: iand
/*    */     //   2109: ifeq -> 2118
/*    */     //   2112: iconst_1
/*    */     //   2113: istore #17
/*    */     //   2115: goto -> 2121
/*    */     //   2118: iconst_0
/*    */     //   2119: istore #17
/*    */     //   2121: iload #17
/*    */     //   2123: ifeq -> 2303
/*    */     //   2126: new f/ZH
/*    */     //   2129: dup
/*    */     //   2130: astore #15
/*    */     //   2132: aload #14
/*    */     //   2134: invokevirtual TU : ()Lf/Uc;
/*    */     //   2137: astore #17
/*    */     //   2139: bipush #8
/*    */     //   2141: bipush #8
/*    */     //   2143: aload #17
/*    */     //   2145: invokespecial <init> : (IILf/Uc;)V
/*    */     //   2148: iconst_0
/*    */     //   2149: istore #17
/*    */     //   2151: iload #17
/*    */     //   2153: bipush #8
/*    */     //   2155: if_icmpge -> 2292
/*    */     //   2158: iconst_0
/*    */     //   2159: istore #18
/*    */     //   2161: iload #18
/*    */     //   2163: bipush #8
/*    */     //   2165: if_icmpge -> 2286
/*    */     //   2168: aload #16
/*    */     //   2170: getfield vx0 : S
/*    */     //   2173: dup
/*    */     //   2174: istore #19
/*    */     //   2176: sipush #1024
/*    */     //   2179: iand
/*    */     //   2180: ifeq -> 2189
/*    */     //   2183: iconst_1
/*    */     //   2184: istore #20
/*    */     //   2186: goto -> 2192
/*    */     //   2189: iconst_0
/*    */     //   2190: istore #20
/*    */     //   2192: iload #20
/*    */     //   2194: ifeq -> 2209
/*    */     //   2197: bipush #8
/*    */     //   2199: iload #17
/*    */     //   2201: isub
/*    */     //   2202: iconst_1
/*    */     //   2203: isub
/*    */     //   2204: istore #20
/*    */     //   2206: goto -> 2213
/*    */     //   2209: iload #17
/*    */     //   2211: istore #20
/*    */     //   2213: iload #19
/*    */     //   2215: sipush #2048
/*    */     //   2218: iand
/*    */     //   2219: ifeq -> 2228
/*    */     //   2222: iconst_1
/*    */     //   2223: istore #19
/*    */     //   2225: goto -> 2231
/*    */     //   2228: iconst_0
/*    */     //   2229: istore #19
/*    */     //   2231: iload #19
/*    */     //   2233: ifeq -> 2248
/*    */     //   2236: bipush #8
/*    */     //   2238: iload #18
/*    */     //   2240: isub
/*    */     //   2241: iconst_1
/*    */     //   2242: isub
/*    */     //   2243: istore #19
/*    */     //   2245: goto -> 2252
/*    */     //   2248: iload #18
/*    */     //   2250: istore #19
/*    */     //   2252: aload #15
/*    */     //   2254: aload #14
/*    */     //   2256: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   2259: iload #20
/*    */     //   2261: iload #19
/*    */     //   2263: invokevirtual Fl : (II)I
/*    */     //   2266: istore #19
/*    */     //   2268: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   2271: iload #17
/*    */     //   2273: iload #18
/*    */     //   2275: iload #19
/*    */     //   2277: invokevirtual YO : (III)V
/*    */     //   2280: iinc #18, 1
/*    */     //   2283: goto -> 2161
/*    */     //   2286: iinc #17, 1
/*    */     //   2289: goto -> 2151
/*    */     //   2292: iconst_1
/*    */     //   2293: istore #14
/*    */     //   2295: aload #15
/*    */     //   2297: iload #14
/*    */     //   2299: istore #15
/*    */     //   2301: astore #14
/*    */     //   2303: aload #8
/*    */     //   2305: iload #11
/*    */     //   2307: aaload
/*    */     //   2308: iload #13
/*    */     //   2310: aaload
/*    */     //   2311: dup
/*    */     //   2312: astore #16
/*    */     //   2314: ifnull -> 2342
/*    */     //   2317: aload #16
/*    */     //   2319: aload #14
/*    */     //   2321: iload #12
/*    */     //   2323: dup
/*    */     //   2324: iconst_2
/*    */     //   2325: irem
/*    */     //   2326: bipush #8
/*    */     //   2328: imul
/*    */     //   2329: istore #16
/*    */     //   2331: iconst_2
/*    */     //   2332: idiv
/*    */     //   2333: bipush #8
/*    */     //   2335: imul
/*    */     //   2336: iload #16
/*    */     //   2338: swap
/*    */     //   2339: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   2342: iload #15
/*    */     //   2344: ifeq -> 2352
/*    */     //   2347: aload #14
/*    */     //   2349: invokevirtual dispose : ()V
/*    */     //   2352: iinc #13, 1
/*    */     //   2355: goto -> 2029
/*    */     //   2358: iinc #12, 1
/*    */     //   2361: goto -> 1883
/*    */     //   2364: iconst_0
/*    */     //   2365: istore #12
/*    */     //   2367: iload #12
/*    */     //   2369: aload #7
/*    */     //   2371: getfield W6 : [I
/*    */     //   2374: iload #11
/*    */     //   2376: iaload
/*    */     //   2377: if_icmpge -> 2430
/*    */     //   2380: aload #8
/*    */     //   2382: iload #11
/*    */     //   2384: aload_2
/*    */     //   2385: dup
/*    */     //   2386: dup
/*    */     //   2387: aload #8
/*    */     //   2389: iload #11
/*    */     //   2391: aaload
/*    */     //   2392: iload #12
/*    */     //   2394: aaload
/*    */     //   2395: astore #13
/*    */     //   2397: monitorenter
/*    */     //   2398: aconst_null
/*    */     //   2399: aload #13
/*    */     //   2401: invokevirtual EI0 : (Ljava/lang/String;Lf/ZH;)Lf/cx0;
/*    */     //   2404: pop
/*    */     //   2405: monitorexit
/*    */     //   2406: aaload
/*    */     //   2407: iload #12
/*    */     //   2409: aaload
/*    */     //   2410: dup
/*    */     //   2411: astore #13
/*    */     //   2413: ifnull -> 2421
/*    */     //   2416: aload #13
/*    */     //   2418: invokevirtual dispose : ()V
/*    */     //   2421: iinc #12, 1
/*    */     //   2424: goto -> 2367
/*    */     //   2427: aload_2
/*    */     //   2428: monitorexit
/*    */     //   2429: athrow
/*    */     //   2430: iinc #11, 1
/*    */     //   2433: goto -> 1848
/*    */     //   2436: aload #9
/*    */     //   2438: arraylength
/*    */     //   2439: istore #7
/*    */     //   2441: iconst_0
/*    */     //   2442: istore #8
/*    */     //   2444: iload #8
/*    */     //   2446: iload #7
/*    */     //   2448: if_icmpge -> 2511
/*    */     //   2451: aload #9
/*    */     //   2453: iload #8
/*    */     //   2455: aaload
/*    */     //   2456: dup
/*    */     //   2457: astore #10
/*    */     //   2459: ifnonnull -> 2465
/*    */     //   2462: goto -> 2505
/*    */     //   2465: aload #10
/*    */     //   2467: arraylength
/*    */     //   2468: istore #11
/*    */     //   2470: iconst_0
/*    */     //   2471: istore #12
/*    */     //   2473: iload #12
/*    */     //   2475: iload #11
/*    */     //   2477: if_icmpge -> 2505
/*    */     //   2480: aload #10
/*    */     //   2482: iload #12
/*    */     //   2484: aaload
/*    */     //   2485: dup
/*    */     //   2486: astore #13
/*    */     //   2488: ifnonnull -> 2494
/*    */     //   2491: goto -> 2499
/*    */     //   2494: aload #13
/*    */     //   2496: invokevirtual dispose : ()V
/*    */     //   2499: iinc #12, 1
/*    */     //   2502: goto -> 2473
/*    */     //   2505: iinc #8, 1
/*    */     //   2508: goto -> 2444
/*    */     //   2511: iinc #6, 1
/*    */     //   2514: goto -> 16
/*    */     //   2517: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 10
/*    */     //   #3	-> 32
/*    */     //   #4	-> 37
/*    */     //   #5	-> 42
/*    */     //   #6	-> 47
/*    */     //   #7	-> 51
/*    */     //   #8	-> 81
/*    */     //   #9	-> 97
/*    */     //   #10	-> 105
/*    */     //   #11	-> 150
/*    */     //   #12	-> 196
/*    */     //   #13	-> 201
/*    */     //   #14	-> 347
/*    */     //   #15	-> 352
/*    */     //   #16	-> 355
/*    */     //   #17	-> 364
/*    */     //   #18	-> 376
/*    */     //   #19	-> 385
/*    */     //   #20	-> 390
/*    */     //   #21	-> 393
/*    */     //   #22	-> 402
/*    */     //   #23	-> 414
/*    */     //   #24	-> 481
/*    */     //   #25	-> 505
/*    */     //   #26	-> 512
/*    */     //   #27	-> 517
/*    */     //   #28	-> 624
/*    */     //   #29	-> 629
/*    */     //   #30	-> 656
/*    */     //   #31	-> 659
/*    */     //   #32	-> 667
/*    */     //   #33	-> 682
/*    */     //   #34	-> 685
/*    */     //   #35	-> 689
/*    */     //   #36	-> 806
/*    */     //   #37	-> 809
/*    */     //   #38	-> 814
/*    */     //   #39	-> 826
/*    */     //   #40	-> 829
/*    */     //   #41	-> 832
/*    */     //   #42	-> 883
/*    */     //   #43	-> 933
/*    */     //   #44	-> 977
/*    */     //   #45	-> 1063
/*    */     //   #46	-> 1075
/*    */     //   #47	-> 1101
/*    */     //   #48	-> 1161
/*    */     //   #49	-> 1166
/*    */     //   #50	-> 1192
/*    */     //   #51	-> 1195
/*    */     //   #52	-> 1201
/*    */     //   #53	-> 1237
/*    */     //   #54	-> 1240
/*    */     //   #55	-> 1246
/*    */     //   #56	-> 1280
/*    */     //   #57	-> 1286
/*    */     //   #58	-> 1361
/*    */     //   #59	-> 1366
/*    */     //   #60	-> 1369
/*    */     //   #61	-> 1443
/*    */     //   #62	-> 1446
/*    */     //   #63	-> 1457
/*    */     //   #64	-> 1504
/*    */     //   #65	-> 1535
/*    */     //   #66	-> 1551
/*    */     //   #67	-> 1558
/*    */     //   #68	-> 1570
/*    */     //   #69	-> 1590
/*    */     //   #70	-> 2076
/*    */     //   #71	-> 2126
/*    */     //   #72	-> 2170
/*    */     //   #73	-> 2256
/*    */     //   #74	-> 2268
/*    */     //   #75	-> 2307
/*    */     //   #76	-> 2401
/*    */     //   #77	-> 2406
/*    */     //   #78	-> 2438
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   510	515	527	finally
/*    */     //   1533	1538	1542	finally
/*    */     //   1556	1564	1580	finally
/*    */     //   2399	2404	2427	finally
/*    */   }
/*    */   
/*    */   public final a4[] Ti0() {
/*    */     return this.wR.g3;
/*    */   }
/*    */   
/*    */   public final int CoM9() {
/*    */     return this.wR.g3.length;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */