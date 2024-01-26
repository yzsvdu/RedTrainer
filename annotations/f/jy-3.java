/* 1 */ package f;public final class jy extends GS implements Np0 { public static void Cu(hm0 paramhm0) { hR[] arrayOfHR; int i; byte b; for (i = (arrayOfHR = hR.h40).length, b = 0; b < i; ) { hR hR1 = arrayOfHR[b];
/*   */       byte b1, arrayOfByte[], b2;
/* 3 */       if ((b2 = (arrayOfByte = paramhm0.wt)[b1 = hR1.dL]) < 0) arrayOfByte[b1] = (byte)(b2 * -1); 
/* 4 */       b++; }  paramhm0
/* 5 */       .K0
/* 6 */       .pO();
/* 7 */     km.wI0.K7
/* 8 */       .LW
/* 9 */       .t80(new QE0(paramhm0, true)); }
/*   */ 
/*   */   
/*   */   public final byte COm3;
/*   */   public final hR bs0;
/*   */   
/*   */   public jy(byte paramByte) {
/*   */     if (paramByte != 4 && paramByte != 6) {
/*   */       this.COm3 = paramByte;
/*   */       this.bs0 = null;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException();
/*   */   }
/*   */   
/*   */   public jy(hR paramhR, byte paramByte) {
/*   */     if (paramByte == 4 || paramByte == 6) {
/*   */       this.COm3 = paramByte;
/*   */       this.bs0 = paramhR;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException();
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 86;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield COm3 : B
/*   */     //   4: tableswitch default -> 96, 0 -> 661, 1 -> 615, 2 -> 597, 3 -> 564, 4 -> 511, 5 -> 493, 6 -> 455, 7 -> 437, 8 -> 368, 9 -> 317, 10 -> 344, 11 -> 293, 12 -> 275, 13 -> 208, 14 -> 190, 15 -> 166, 16 -> 148, 17 -> 117, 18 -> 99
/*   */     //   96: goto -> 707
/*   */     //   99: aload #7
/*   */     //   101: aload_2
/*   */     //   102: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   105: ldc 200513
/*   */     //   107: swap
/*   */     //   108: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   111: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   114: goto -> 707
/*   */     //   117: aload #7
/*   */     //   119: dup
/*   */     //   120: aload_2
/*   */     //   121: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   124: ldc 16807043
/*   */     //   126: swap
/*   */     //   127: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   130: astore_0
/*   */     //   131: aload_2
/*   */     //   132: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   137: astore_1
/*   */     //   138: aload_0
/*   */     //   139: ldc ''
/*   */     //   141: aload_1
/*   */     //   142: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   145: goto -> 707
/*   */     //   148: aload #7
/*   */     //   150: aload_1
/*   */     //   151: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   154: ldc 16807042
/*   */     //   156: swap
/*   */     //   157: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   160: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   163: goto -> 707
/*   */     //   166: aload #7
/*   */     //   168: dup
/*   */     //   169: aload_2
/*   */     //   170: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   173: ldc 16807041
/*   */     //   175: swap
/*   */     //   176: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   179: astore_0
/*   */     //   180: aload_2
/*   */     //   181: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   186: astore_1
/*   */     //   187: goto -> 138
/*   */     //   190: aload #7
/*   */     //   192: aload_1
/*   */     //   193: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   196: ldc 16807040
/*   */     //   198: swap
/*   */     //   199: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   202: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   205: goto -> 707
/*   */     //   208: aload #7
/*   */     //   210: aload_2
/*   */     //   211: aload #7
/*   */     //   213: dup
/*   */     //   214: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   217: astore_0
/*   */     //   218: bipush #14
/*   */     //   220: istore_3
/*   */     //   221: getfield AD : Lf/Gp0;
/*   */     //   224: sipush #369
/*   */     //   227: aload_2
/*   */     //   228: invokevirtual ex : (ILf/hm0;)I
/*   */     //   231: istore #4
/*   */     //   233: iconst_1
/*   */     //   234: anewarray java/lang/String
/*   */     //   237: dup
/*   */     //   238: astore #5
/*   */     //   240: aload_2
/*   */     //   241: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   244: iconst_0
/*   */     //   245: swap
/*   */     //   246: aastore
/*   */     //   247: iconst_2
/*   */     //   248: aload_0
/*   */     //   249: iload_3
/*   */     //   250: iload #4
/*   */     //   252: aload #5
/*   */     //   254: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   257: astore_0
/*   */     //   258: aload_1
/*   */     //   259: <illegal opcode> run : (Lf/hm0;Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   264: astore_1
/*   */     //   265: aload_0
/*   */     //   266: ldc ''
/*   */     //   268: aload_1
/*   */     //   269: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   272: goto -> 707
/*   */     //   275: aload #7
/*   */     //   277: aload_2
/*   */     //   278: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   281: ldc 16807035
/*   */     //   283: swap
/*   */     //   284: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   287: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   290: goto -> 707
/*   */     //   293: aload #7
/*   */     //   295: dup
/*   */     //   296: aload_2
/*   */     //   297: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   300: ldc 16807034
/*   */     //   302: swap
/*   */     //   303: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   306: astore_0
/*   */     //   307: aload_2
/*   */     //   308: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   313: astore_1
/*   */     //   314: goto -> 138
/*   */     //   317: aload #7
/*   */     //   319: aload_2
/*   */     //   320: dup
/*   */     //   321: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   324: ldc 16807032
/*   */     //   326: swap
/*   */     //   327: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   330: astore_0
/*   */     //   331: <illegal opcode> run : (Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   336: astore_1
/*   */     //   337: aload_0
/*   */     //   338: ldc ''
/*   */     //   340: aload_1
/*   */     //   341: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   344: aload #7
/*   */     //   346: dup
/*   */     //   347: aload_2
/*   */     //   348: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   351: ldc 16807033
/*   */     //   353: swap
/*   */     //   354: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   357: astore_0
/*   */     //   358: aload_2
/*   */     //   359: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   364: astore_1
/*   */     //   365: goto -> 138
/*   */     //   368: aload #7
/*   */     //   370: dup
/*   */     //   371: aload_2
/*   */     //   372: aload #7
/*   */     //   374: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   377: astore_0
/*   */     //   378: bipush #14
/*   */     //   380: istore_3
/*   */     //   381: getfield AD : Lf/Gp0;
/*   */     //   384: sipush #651
/*   */     //   387: aload_1
/*   */     //   388: aload_2
/*   */     //   389: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
/*   */     //   392: istore #4
/*   */     //   394: iconst_2
/*   */     //   395: anewarray java/lang/String
/*   */     //   398: dup
/*   */     //   399: astore #5
/*   */     //   401: aload_2
/*   */     //   402: aload #5
/*   */     //   404: aload_1
/*   */     //   405: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   408: iconst_0
/*   */     //   409: swap
/*   */     //   410: aastore
/*   */     //   411: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   414: iconst_1
/*   */     //   415: swap
/*   */     //   416: aastore
/*   */     //   417: iconst_2
/*   */     //   418: aload_0
/*   */     //   419: iload_3
/*   */     //   420: iload #4
/*   */     //   422: aload #5
/*   */     //   424: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   427: astore_0
/*   */     //   428: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   433: astore_1
/*   */     //   434: goto -> 265
/*   */     //   437: aload #7
/*   */     //   439: aload_2
/*   */     //   440: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   443: ldc 200499
/*   */     //   445: swap
/*   */     //   446: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   449: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   452: goto -> 707
/*   */     //   455: aload #7
/*   */     //   457: iconst_2
/*   */     //   458: anewarray java/lang/String
/*   */     //   461: dup
/*   */     //   462: astore_1
/*   */     //   463: aload_0
/*   */     //   464: aload_1
/*   */     //   465: aload_2
/*   */     //   466: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   469: iconst_0
/*   */     //   470: swap
/*   */     //   471: aastore
/*   */     //   472: getfield bs0 : Lf/hR;
/*   */     //   475: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   478: iconst_1
/*   */     //   479: swap
/*   */     //   480: aastore
/*   */     //   481: ldc 200488
/*   */     //   483: aload_1
/*   */     //   484: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   487: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   490: goto -> 707
/*   */     //   493: aload #7
/*   */     //   495: aload_2
/*   */     //   496: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   499: ldc 200489
/*   */     //   501: swap
/*   */     //   502: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   505: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   508: goto -> 707
/*   */     //   511: aload #7
/*   */     //   513: dup
/*   */     //   514: iconst_2
/*   */     //   515: anewarray java/lang/String
/*   */     //   518: dup
/*   */     //   519: astore_1
/*   */     //   520: aload_0
/*   */     //   521: aload_1
/*   */     //   522: aload_2
/*   */     //   523: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   526: iconst_0
/*   */     //   527: swap
/*   */     //   528: aastore
/*   */     //   529: getfield bs0 : Lf/hR;
/*   */     //   532: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   535: iconst_1
/*   */     //   536: swap
/*   */     //   537: aastore
/*   */     //   538: ldc 200488
/*   */     //   540: aload_1
/*   */     //   541: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   544: invokevirtual cr : (Ljava/lang/String;)V
/*   */     //   547: new f/rv
/*   */     //   550: dup
/*   */     //   551: aload_2
/*   */     //   552: invokespecial <init> : (Lf/hm0;)V
/*   */     //   555: invokevirtual O3 : ()Lf/wb;
/*   */     //   558: invokevirtual t80 : (Lf/wb;)V
/*   */     //   561: goto -> 707
/*   */     //   564: aload #7
/*   */     //   566: dup
/*   */     //   567: aload_2
/*   */     //   568: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   571: ldc 200489
/*   */     //   573: swap
/*   */     //   574: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   577: invokevirtual cr : (Ljava/lang/String;)V
/*   */     //   580: new f/rv
/*   */     //   583: dup
/*   */     //   584: aload_2
/*   */     //   585: invokespecial <init> : (Lf/hm0;)V
/*   */     //   588: invokevirtual O3 : ()Lf/wb;
/*   */     //   591: invokevirtual t80 : (Lf/wb;)V
/*   */     //   594: goto -> 707
/*   */     //   597: aload #7
/*   */     //   599: aload_2
/*   */     //   600: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   603: ldc 200416
/*   */     //   605: swap
/*   */     //   606: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   609: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   612: goto -> 707
/*   */     //   615: aload #7
/*   */     //   617: dup
/*   */     //   618: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   621: astore_0
/*   */     //   622: bipush #14
/*   */     //   624: istore_1
/*   */     //   625: getfield AD : Lf/Gp0;
/*   */     //   628: bipush #15
/*   */     //   630: aload_2
/*   */     //   631: invokevirtual ex : (ILf/hm0;)I
/*   */     //   634: istore_3
/*   */     //   635: iconst_1
/*   */     //   636: anewarray java/lang/String
/*   */     //   639: dup
/*   */     //   640: astore #4
/*   */     //   642: aload_2
/*   */     //   643: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   646: iconst_0
/*   */     //   647: swap
/*   */     //   648: aastore
/*   */     //   649: iconst_2
/*   */     //   650: aload_0
/*   */     //   651: iload_1
/*   */     //   652: iload_3
/*   */     //   653: aload #4
/*   */     //   655: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   658: goto -> 704
/*   */     //   661: aload #7
/*   */     //   663: dup
/*   */     //   664: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   667: astore_0
/*   */     //   668: bipush #14
/*   */     //   670: istore_1
/*   */     //   671: getfield AD : Lf/Gp0;
/*   */     //   674: bipush #24
/*   */     //   676: aload_2
/*   */     //   677: invokevirtual ex : (ILf/hm0;)I
/*   */     //   680: istore_3
/*   */     //   681: iconst_1
/*   */     //   682: anewarray java/lang/String
/*   */     //   685: dup
/*   */     //   686: astore #4
/*   */     //   688: aload_2
/*   */     //   689: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   692: iconst_0
/*   */     //   693: swap
/*   */     //   694: aastore
/*   */     //   695: iconst_2
/*   */     //   696: aload_0
/*   */     //   697: iload_1
/*   */     //   698: iload_3
/*   */     //   699: aload #4
/*   */     //   701: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   704: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   707: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 102
/*   */     //   #3	-> 139
/*   */     //   #4	-> 151
/*   */     //   #5	-> 221
/*   */     //   #6	-> 228
/*   */     //   #7	-> 254
/*   */     //   #8	-> 259
/*   */     //   #9	-> 266
/*   */     //   #10	-> 278
/*   */     //   #11	-> 338
/*   */     //   #12	-> 348
/*   */     //   #13	-> 381
/*   */     //   #14	-> 389
/*   */     //   #15	-> 424
/*   */     //   #16	-> 428
/*   */     //   #17	-> 625
/*   */     //   #18	-> 631
/*   */     //   #19	-> 655
/*   */     //   #20	-> 664
/*   */     //   #21	-> 671
/*   */     //   #22	-> 677
/*   */     //   #23	-> 701
/*   */     //   #24	-> 704
/*   */   }
/*   */   
/*   */   public final boolean Lt() {
/*   */     return !(this.COm3 == 2);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */