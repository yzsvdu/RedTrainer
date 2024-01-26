/*  1 */ package f;public abstract class D0 { public static qw0 nq0 = new qw0(); public static void MJ0(short paramShort) { lPt1(paramShort, 1.0F, 0.0F, false); } public static void lPt1(short paramShort, float paramFloat1, float paramFloat2, boolean paramBoolean) { // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: iload_0
/*    */     //   4: fload_1
/*    */     //   5: fload_2
/*    */     //   6: iload_3
/*    */     //   7: <illegal opcode> run : (SFFZ)Ljava/lang/Runnable;
/*    */     //   12: invokevirtual fN : (Ljava/lang/Runnable;)V
/*  1 */     //   15: return } public static int BR(short paramShort) { E4 e4 = km.mI0.AN.gL0(); if (paramShort < 0 || paramShort >= 
/*  2 */       (e4.S80.fM0[3]).kC0) paramShort = 1;
/*    */ 
/*    */     
/*  5 */     int i = ej.pi0; ej ej; eJ[] arrayOfEJ; return ((paramShort = ((cV)(e4.S80.fM0[3]).Dw[paramShort]).Ak) >= (arrayOfEJ = e4.K60.rb0).length || (ej = (new YG0(arrayOfEJ[paramShort])).bk()) == null) ? 0 : (ej.b40 * 1000 / ej.LPT5 / 8 * i); } public static byte[] g00(short paramShort) { if (nq0.Fb(paramShort)) { byte[] arrayOfByte; if ((arrayOfByte = ((rq)nq0.Z90(paramShort)).YL0.iy0()) == null || arrayOfByte.length < 5 || arrayOfByte[0] != 82 || arrayOfByte[1] != 73 || arrayOfByte[2] != 70 || arrayOfByte[3] != 70) arrayOfByte = null;  if (arrayOfByte != null) return arrayOfByte;  }  E4 e4 = km.mI0.AN.gL0(); if (paramShort < 0 || paramShort >= 
/*    */       
/*  7 */       (e4.S80.fM0[3]).kC0) paramShort = 1;
/*    */     
/*  9 */     paramShort = ((cV)(e4.S80.fM0[3]).Dw[paramShort]).Ak; int i = 1;
/* 10 */     int j = ej.LPT5, k = ej.b40; if (ej.lV == 0) { j = 16; k *= 2; }  byteBuffer.putInt(1179011410); byteBuffer.putInt(m - 8); byteBuffer.putInt(1163280727); byteBuffer.putInt(544501094); byteBuffer.putInt(16); byteBuffer.putShort((short)1); byteBuffer.putShort((short)i); byteBuffer.putInt(ej.pi0); byteBuffer.putInt(ej.pi0 * i * (i = j / 8)); byteBuffer.putShort((short)i); byteBuffer.putShort((short)j); byteBuffer.putInt(1635017060); int m; ByteBuffer byteBuffer; (byteBuffer = ByteBuffer.allocate(m = k + 44).order(ByteOrder.LITTLE_ENDIAN)).putInt(k);
/* 11 */     if ((i = ej.lV) != 0) { if (i != 1) { if (i == 2) { byteBuffer
/* 12 */             .putShort((short)ej.fv); ej.Od0.position(0); i = ej.Od0.limit(); j = 0;
/* 13 */           this(); z z;
/* 14 */           for (z.qh = ej.fv, (z = new z()).eA = ej.Yx; j < i; ) { j++; ej.Ap0(m, z); byteBuffer.putShort((short)z.qh); ej.Ap0((byte)(((m = ej.Od0.get()) & 0xF0) >> 4), z); byteBuffer.putShort((short)z.qh); }  }  } else { ej
/* 15 */           .Od0.position(0); for (i = 0; i < ej.Od0.limit() / 2; ) { byteBuffer.putShort(ej.Od0.getShort()); i++; }  }  } else { ej.Od0.position(0); for (i = 0; i < ej.Od0.limit(); ) { byteBuffer.putShort((short)(ej.Od0.get() << 8)); i++; }  }  ej ej; return ((ej = (new YG0(e4.K60.rb0[paramShort])).bk()) == null) ? null : byteBuffer
/* 16 */       .array(); }
/*    */ 
/*    */   
/*    */   public static void Jt0(short paramShort, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: fconst_1
/*    */     //   1: fstore #4
/*    */     //   3: getstatic f/vR.aG0 : Lf/vR;
/*    */     //   6: dup
/*    */     //   7: astore #5
/*    */     //   9: invokevirtual Sq : ()F
/*    */     //   12: getstatic f/VD0.PB : F
/*    */     //   15: fcmpg
/*    */     //   16: ifgt -> 22
/*    */     //   19: goto -> 657
/*    */     //   22: iload_0
/*    */     //   23: aload #5
/*    */     //   25: iconst_1
/*    */     //   26: istore #5
/*    */     //   28: invokevirtual Sq : ()F
/*    */     //   31: fload #4
/*    */     //   33: fmul
/*    */     //   34: fstore #4
/*    */     //   36: sipush #1051
/*    */     //   39: if_icmpeq -> 623
/*    */     //   42: iload_0
/*    */     //   43: tableswitch default -> 68, 1000 -> 156, 1001 -> 150, 1002 -> 143
/*    */     //   68: iload_0
/*    */     //   69: tableswitch default -> 112, 1019 -> 239, 1020 -> 219, 1021 -> 199, 1022 -> 192, 1023 -> 185, 1024 -> 170, 1025 -> 163
/*    */     //   112: iload_0
/*    */     //   113: tableswitch default -> 140, 1047 -> 300, 1048 -> 280, 1049 -> 259
/*    */     //   140: goto -> 320
/*    */     //   143: sipush #646
/*    */     //   146: istore_0
/*    */     //   147: goto -> 320
/*    */     //   150: bipush #93
/*    */     //   152: istore_0
/*    */     //   153: goto -> 320
/*    */     //   156: sipush #357
/*    */     //   159: istore_0
/*    */     //   160: goto -> 320
/*    */     //   163: sipush #151
/*    */     //   166: istore_0
/*    */     //   167: goto -> 320
/*    */     //   170: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   173: iconst_1
/*    */     //   174: iconst_2
/*    */     //   175: sipush #2047
/*    */     //   178: fload_2
/*    */     //   179: invokevirtual bA0 : (ZBSF)V
/*    */     //   182: goto -> 657
/*    */     //   185: sipush #487
/*    */     //   188: istore_0
/*    */     //   189: goto -> 320
/*    */     //   192: sipush #622
/*    */     //   195: istore_0
/*    */     //   196: goto -> 320
/*    */     //   199: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   202: iconst_2
/*    */     //   203: iconst_1
/*    */     //   204: sipush #456
/*    */     //   207: iconst_1
/*    */     //   208: fload_2
/*    */     //   209: ldc 0.6
/*    */     //   211: fconst_1
/*    */     //   212: iconst_0
/*    */     //   213: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   216: goto -> 657
/*    */     //   219: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   222: iconst_2
/*    */     //   223: sipush #1802
/*    */     //   226: iconst_m1
/*    */     //   227: iconst_1
/*    */     //   228: fload_2
/*    */     //   229: ldc 0.6
/*    */     //   231: fconst_1
/*    */     //   232: iconst_0
/*    */     //   233: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   236: goto -> 657
/*    */     //   239: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   242: iconst_2
/*    */     //   243: sipush #1813
/*    */     //   246: iconst_m1
/*    */     //   247: iconst_1
/*    */     //   248: fload_2
/*    */     //   249: ldc 0.6
/*    */     //   251: fconst_1
/*    */     //   252: iconst_0
/*    */     //   253: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   256: goto -> 657
/*    */     //   259: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   262: iconst_2
/*    */     //   263: sipush #1864
/*    */     //   266: iconst_m1
/*    */     //   267: iconst_1
/*    */     //   268: fload_2
/*    */     //   269: ldc_w 0.7
/*    */     //   272: fconst_1
/*    */     //   273: iconst_0
/*    */     //   274: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   277: goto -> 657
/*    */     //   280: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   283: iconst_2
/*    */     //   284: iconst_1
/*    */     //   285: sipush #231
/*    */     //   288: iconst_1
/*    */     //   289: fload_2
/*    */     //   290: ldc 0.6
/*    */     //   292: fconst_1
/*    */     //   293: iconst_0
/*    */     //   294: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   297: goto -> 657
/*    */     //   300: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   303: iconst_2
/*    */     //   304: iconst_1
/*    */     //   305: sipush #374
/*    */     //   308: iconst_1
/*    */     //   309: fload_2
/*    */     //   310: ldc 0.6
/*    */     //   312: fconst_1
/*    */     //   313: iconst_0
/*    */     //   314: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   317: goto -> 657
/*    */     //   320: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   323: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   326: pop
/*    */     //   327: getstatic f/Dp0.Ro0 : Lf/Dp0;
/*    */     //   330: dup
/*    */     //   331: astore #6
/*    */     //   333: getstatic f/Dp0.uM : Lf/Dp0;
/*    */     //   336: if_acmpeq -> 579
/*    */     //   339: aload #6
/*    */     //   341: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   344: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   347: pop
/*    */     //   348: getstatic f/Dp0.QG : Lf/Dp0;
/*    */     //   351: if_acmpne -> 357
/*    */     //   354: goto -> 579
/*    */     //   357: iload_0
/*    */     //   358: invokestatic g00 : (S)[B
/*    */     //   361: dup
/*    */     //   362: astore #5
/*    */     //   364: ifnonnull -> 370
/*    */     //   367: goto -> 657
/*    */     //   370: fload_2
/*    */     //   371: new f/ry
/*    */     //   374: dup
/*    */     //   375: astore #6
/*    */     //   377: aload #5
/*    */     //   379: new java/lang/StringBuilder
/*    */     //   382: dup
/*    */     //   383: invokespecial <init> : ()V
/*    */     //   386: ldc_w 'cry-'
/*    */     //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   392: iload_0
/*    */     //   393: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   396: ldc_w '.wav'
/*    */     //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   402: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   405: astore_0
/*    */     //   406: arraylength
/*    */     //   407: istore #7
/*    */     //   409: aload_0
/*    */     //   410: aload #5
/*    */     //   412: iload #7
/*    */     //   414: invokespecial <init> : (Ljava/lang/String;[BI)V
/*    */     //   417: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   420: getfield Et0 : Lf/gk;
/*    */     //   423: dup
/*    */     //   424: astore_0
/*    */     //   425: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   428: pop
/*    */     //   429: new f/hf0
/*    */     //   432: dup
/*    */     //   433: astore #5
/*    */     //   435: fload #4
/*    */     //   437: aload #5
/*    */     //   439: aload #6
/*    */     //   441: aload_0
/*    */     //   442: getfield Sp0 : Ljava/util/List;
/*    */     //   445: invokespecial <init> : (Lf/ry;Ljava/util/List;)V
/*    */     //   448: aconst_null
/*    */     //   449: astore_0
/*    */     //   450: putfield import : F
/*    */     //   453: fconst_1
/*    */     //   454: fcmpl
/*    */     //   455: dup
/*    */     //   456: istore #7
/*    */     //   458: ifeq -> 467
/*    */     //   461: aload #5
/*    */     //   463: fload_2
/*    */     //   464: invokevirtual Ch0 : (F)V
/*    */     //   467: fload_1
/*    */     //   468: fconst_1
/*    */     //   469: fcmpl
/*    */     //   470: ifeq -> 490
/*    */     //   473: aload #5
/*    */     //   475: getfield Mz : Z
/*    */     //   478: ifeq -> 484
/*    */     //   481: goto -> 490
/*    */     //   484: aload #5
/*    */     //   486: fload_1
/*    */     //   487: putfield NuL : F
/*    */     //   490: iload_3
/*    */     //   491: ifeq -> 563
/*    */     //   494: fload_1
/*    */     //   495: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   498: getfield Et0 : Lf/gk;
/*    */     //   501: dup
/*    */     //   502: astore_0
/*    */     //   503: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   506: pop
/*    */     //   507: new f/hf0
/*    */     //   510: dup
/*    */     //   511: astore_1
/*    */     //   512: fload #4
/*    */     //   514: aload_1
/*    */     //   515: aload #6
/*    */     //   517: aload_0
/*    */     //   518: getfield Sp0 : Ljava/util/List;
/*    */     //   521: invokespecial <init> : (Lf/ry;Ljava/util/List;)V
/*    */     //   524: ldc_w 0.5
/*    */     //   527: fmul
/*    */     //   528: putfield import : F
/*    */     //   531: ldc_w 0.5
/*    */     //   534: fmul
/*    */     //   535: fstore_0
/*    */     //   536: aload_1
/*    */     //   537: getfield Mz : Z
/*    */     //   540: ifeq -> 546
/*    */     //   543: goto -> 551
/*    */     //   546: aload_1
/*    */     //   547: fload_0
/*    */     //   548: putfield NuL : F
/*    */     //   551: iload #7
/*    */     //   553: ifeq -> 561
/*    */     //   556: aload_1
/*    */     //   557: fload_2
/*    */     //   558: invokevirtual Ch0 : (F)V
/*    */     //   561: aload_1
/*    */     //   562: astore_0
/*    */     //   563: aload_0
/*    */     //   564: aload #5
/*    */     //   566: invokevirtual Ix0 : ()V
/*    */     //   569: ifnull -> 657
/*    */     //   572: aload_0
/*    */     //   573: invokevirtual Ix0 : ()V
/*    */     //   576: goto -> 657
/*    */     //   579: iload_3
/*    */     //   580: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   583: iconst_2
/*    */     //   584: iconst_1
/*    */     //   585: iload_0
/*    */     //   586: iconst_1
/*    */     //   587: fload_2
/*    */     //   588: fload_1
/*    */     //   589: fconst_1
/*    */     //   590: iconst_0
/*    */     //   591: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   594: ifeq -> 657
/*    */     //   597: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   600: fload_1
/*    */     //   601: ldc_w 0.5
/*    */     //   604: fmul
/*    */     //   605: fstore_1
/*    */     //   606: iconst_2
/*    */     //   607: iload #5
/*    */     //   609: iload_0
/*    */     //   610: iconst_1
/*    */     //   611: fload_2
/*    */     //   612: fload_1
/*    */     //   613: ldc_w 0.5
/*    */     //   616: iconst_0
/*    */     //   617: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   620: goto -> 657
/*    */     //   623: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   626: iconst_2
/*    */     //   627: sipush #1489
/*    */     //   630: iconst_m1
/*    */     //   631: iconst_1
/*    */     //   632: fload_2
/*    */     //   633: fconst_1
/*    */     //   634: fconst_1
/*    */     //   635: iconst_0
/*    */     //   636: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   639: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   642: iconst_2
/*    */     //   643: sipush #1436
/*    */     //   646: iconst_m1
/*    */     //   647: iconst_1
/*    */     //   648: fload_2
/*    */     //   649: fconst_1
/*    */     //   650: fconst_1
/*    */     //   651: sipush #400
/*    */     //   654: invokevirtual g8 : (BSSZFFFI)V
/*    */     //   657: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 3
/*    */     //   #2	-> 327
/*    */     //   #3	-> 333
/*    */     //   #4	-> 420
/*    */     //   #5	-> 425
/*    */     //   #6	-> 429
/*    */     //   #7	-> 450
/*    */     //   #8	-> 464
/*    */     //   #9	-> 475
/*    */     //   #10	-> 495
/*    */     //   #11	-> 498
/*    */     //   #12	-> 503
/*    */     //   #13	-> 507
/*    */     //   #14	-> 528
/*    */     //   #15	-> 537
/*    */     //   #16	-> 558
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */