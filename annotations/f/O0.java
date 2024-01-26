/*    */ package f;public abstract class O0 extends mc {
/*    */   public void qb0() {
/*  3 */     hm.Fz0(this.TG0.oh0);
/*  4 */     this.jl = 100; short s;
/*  5 */     if ((s = this.hC0) < 1) { s6(""); this
/*  6 */         .z4 = null; zn(); return; }
/*    */     
/*  8 */     LPT3 lPT3 = Of.eH.On0(s); if (this.op0 > -1) { s6(this.op0 + "x"); } else { s6(""); }  if (lPT3
/*  9 */       .c3 != null)
/*    */     { pQ pQ;
/* 11 */       this(lPT3, this.lx, true, true, "");
/* 12 */       this.z4 = pQ; zn(); } else { this
/*    */         
/* 14 */         .z4 = rG0.kh0(lPT3); zn(); }
/*    */   
/*    */   }
/*    */   
/*    */   public static final Ll kC0 = Ll.F10("dragActive");
/*    */   public static final Ll SF0 = Ll.F10("dropOk");
/*    */   public static final Ll PH = Ll.F10("dropBlocked");
/*    */   public Ik0 Ex;
/*    */   public boolean os;
/*    */   public short Oa0;
/*    */   public short hC0;
/*    */   public int Fc;
/*    */   public short op0;
/*    */   public byte lx;
/*    */   public boolean zz0;
/*    */   public Runnable Tw0;
/*    */   public int gc = 6;
/*    */   public int x80 = 4;
/*    */   public int KW = 24;
/*    */   public int m40 = 24;
/*    */   
/*    */   public O0(short paramShort1, int paramInt, short paramShort2, short paramShort3, boolean paramBoolean) {
/*    */     super("", "");
/*    */     Xu("item-slot");
/*    */     this.Oa0 = paramShort3;
/*    */     this.hC0 = paramShort1;
/*    */     this.Fc = paramInt;
/*    */     this.op0 = paramShort2;
/*    */     this.zz0 = paramBoolean;
/*    */     qb0();
/*    */     t4();
/*    */   }
/*    */   
/*    */   public boolean i2(oa0 paramoa0) {
/*    */     Runnable runnable;
/*    */     if (paramoa0.Cz0() && paramoa0.cz0 == 4 && paramoa0.vl == 0) {
/*    */       if ((runnable = this.Tw0) != null)
/*    */         run(); 
/*    */       return true;
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void bm0(Runnable paramRunnable) {
/*    */     this.Tw0 = paramRunnable;
/*    */   }
/*    */   
/*    */   public void t4() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield hC0 : S
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: ifne -> 17
/*    */     //   9: aload_0
/*    */     //   10: getfield hC0 : Lf/rH;
/*    */     //   13: invokevirtual H : ()V
/*    */     //   16: return
/*    */     //   17: iload_1
/*    */     //   18: ifge -> 652
/*    */     //   21: iload_1
/*    */     //   22: iconst_m1
/*    */     //   23: imul
/*    */     //   24: i2s
/*    */     //   25: invokestatic cw : ()Lf/yk0;
/*    */     //   28: swap
/*    */     //   29: invokevirtual mP : (S)Lf/WD;
/*    */     //   32: dup
/*    */     //   33: astore_1
/*    */     //   34: ifnull -> 642
/*    */     //   37: aload_1
/*    */     //   38: aconst_null
/*    */     //   39: aconst_null
/*    */     //   40: invokevirtual Wt : (Lf/Q90;Lf/Mx;)Lf/Ht0;
/*    */     //   43: invokevirtual ordinal : ()I
/*    */     //   46: tableswitch default -> 132, 0 -> 567, 1 -> 540, 2 -> 513, 3 -> 486, 4 -> 459, 5 -> 432, 6 -> 405, 7 -> 378, 8 -> 351, 9 -> 132, 10 -> 324, 11 -> 297, 12 -> 270, 13 -> 243, 14 -> 216, 15 -> 189, 16 -> 162, 17 -> 135
/*    */     //   132: goto -> 595
/*    */     //   135: aload_0
/*    */     //   136: getfield hC0 : Lf/rH;
/*    */     //   139: iconst_1
/*    */     //   140: anewarray f/U70
/*    */     //   143: dup
/*    */     //   144: iconst_0
/*    */     //   145: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   148: sipush #5328
/*    */     //   151: iconst_0
/*    */     //   152: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   155: aastore
/*    */     //   156: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   159: goto -> 591
/*    */     //   162: aload_0
/*    */     //   163: getfield hC0 : Lf/rH;
/*    */     //   166: iconst_1
/*    */     //   167: anewarray f/U70
/*    */     //   170: dup
/*    */     //   171: iconst_0
/*    */     //   172: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   175: sipush #5329
/*    */     //   178: iconst_0
/*    */     //   179: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   182: aastore
/*    */     //   183: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   186: goto -> 591
/*    */     //   189: aload_0
/*    */     //   190: getfield hC0 : Lf/rH;
/*    */     //   193: iconst_1
/*    */     //   194: anewarray f/U70
/*    */     //   197: dup
/*    */     //   198: iconst_0
/*    */     //   199: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   202: sipush #5334
/*    */     //   205: iconst_0
/*    */     //   206: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   209: aastore
/*    */     //   210: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   213: goto -> 591
/*    */     //   216: aload_0
/*    */     //   217: getfield hC0 : Lf/rH;
/*    */     //   220: iconst_1
/*    */     //   221: anewarray f/U70
/*    */     //   224: dup
/*    */     //   225: iconst_0
/*    */     //   226: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   229: sipush #5330
/*    */     //   232: iconst_0
/*    */     //   233: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   236: aastore
/*    */     //   237: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   240: goto -> 591
/*    */     //   243: aload_0
/*    */     //   244: getfield hC0 : Lf/rH;
/*    */     //   247: iconst_1
/*    */     //   248: anewarray f/U70
/*    */     //   251: dup
/*    */     //   252: iconst_0
/*    */     //   253: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   256: sipush #5351
/*    */     //   259: iconst_0
/*    */     //   260: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   263: aastore
/*    */     //   264: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   267: goto -> 591
/*    */     //   270: aload_0
/*    */     //   271: getfield hC0 : Lf/rH;
/*    */     //   274: iconst_1
/*    */     //   275: anewarray f/U70
/*    */     //   278: dup
/*    */     //   279: iconst_0
/*    */     //   280: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   283: sipush #5349
/*    */     //   286: iconst_0
/*    */     //   287: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   290: aastore
/*    */     //   291: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   294: goto -> 591
/*    */     //   297: aload_0
/*    */     //   298: getfield hC0 : Lf/rH;
/*    */     //   301: iconst_1
/*    */     //   302: anewarray f/U70
/*    */     //   305: dup
/*    */     //   306: iconst_0
/*    */     //   307: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   310: sipush #5422
/*    */     //   313: iconst_0
/*    */     //   314: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   317: aastore
/*    */     //   318: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   321: goto -> 591
/*    */     //   324: aload_0
/*    */     //   325: getfield hC0 : Lf/rH;
/*    */     //   328: iconst_1
/*    */     //   329: anewarray f/U70
/*    */     //   332: dup
/*    */     //   333: iconst_0
/*    */     //   334: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   337: sipush #5388
/*    */     //   340: iconst_0
/*    */     //   341: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   344: aastore
/*    */     //   345: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   348: goto -> 591
/*    */     //   351: aload_0
/*    */     //   352: getfield hC0 : Lf/rH;
/*    */     //   355: iconst_1
/*    */     //   356: anewarray f/U70
/*    */     //   359: dup
/*    */     //   360: iconst_0
/*    */     //   361: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   364: sipush #5401
/*    */     //   367: iconst_0
/*    */     //   368: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   371: aastore
/*    */     //   372: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   375: goto -> 591
/*    */     //   378: aload_0
/*    */     //   379: getfield hC0 : Lf/rH;
/*    */     //   382: iconst_1
/*    */     //   383: anewarray f/U70
/*    */     //   386: dup
/*    */     //   387: iconst_0
/*    */     //   388: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   391: sipush #5392
/*    */     //   394: iconst_0
/*    */     //   395: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   398: aastore
/*    */     //   399: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   402: goto -> 591
/*    */     //   405: aload_0
/*    */     //   406: getfield hC0 : Lf/rH;
/*    */     //   409: iconst_1
/*    */     //   410: anewarray f/U70
/*    */     //   413: dup
/*    */     //   414: iconst_0
/*    */     //   415: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   418: sipush #5403
/*    */     //   421: iconst_0
/*    */     //   422: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   425: aastore
/*    */     //   426: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   429: goto -> 591
/*    */     //   432: aload_0
/*    */     //   433: getfield hC0 : Lf/rH;
/*    */     //   436: iconst_1
/*    */     //   437: anewarray f/U70
/*    */     //   440: dup
/*    */     //   441: iconst_0
/*    */     //   442: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   445: sipush #5350
/*    */     //   448: iconst_0
/*    */     //   449: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   452: aastore
/*    */     //   453: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   456: goto -> 591
/*    */     //   459: aload_0
/*    */     //   460: getfield hC0 : Lf/rH;
/*    */     //   463: iconst_1
/*    */     //   464: anewarray f/U70
/*    */     //   467: dup
/*    */     //   468: iconst_0
/*    */     //   469: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   472: sipush #5353
/*    */     //   475: iconst_0
/*    */     //   476: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   479: aastore
/*    */     //   480: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   483: goto -> 591
/*    */     //   486: aload_0
/*    */     //   487: getfield hC0 : Lf/rH;
/*    */     //   490: iconst_1
/*    */     //   491: anewarray f/U70
/*    */     //   494: dup
/*    */     //   495: iconst_0
/*    */     //   496: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   499: sipush #5333
/*    */     //   502: iconst_0
/*    */     //   503: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   506: aastore
/*    */     //   507: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   510: goto -> 591
/*    */     //   513: aload_0
/*    */     //   514: getfield hC0 : Lf/rH;
/*    */     //   517: iconst_1
/*    */     //   518: anewarray f/U70
/*    */     //   521: dup
/*    */     //   522: iconst_0
/*    */     //   523: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   526: sipush #5421
/*    */     //   529: iconst_0
/*    */     //   530: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   533: aastore
/*    */     //   534: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   537: goto -> 591
/*    */     //   540: aload_0
/*    */     //   541: getfield hC0 : Lf/rH;
/*    */     //   544: iconst_1
/*    */     //   545: anewarray f/U70
/*    */     //   548: dup
/*    */     //   549: iconst_0
/*    */     //   550: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   553: sipush #5335
/*    */     //   556: iconst_0
/*    */     //   557: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   560: aastore
/*    */     //   561: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   564: goto -> 591
/*    */     //   567: aload_0
/*    */     //   568: getfield hC0 : Lf/rH;
/*    */     //   571: iconst_1
/*    */     //   572: anewarray f/U70
/*    */     //   575: dup
/*    */     //   576: iconst_0
/*    */     //   577: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   580: sipush #5420
/*    */     //   583: iconst_0
/*    */     //   584: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   587: aastore
/*    */     //   588: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   591: pop
/*    */     //   592: goto -> 620
/*    */     //   595: aload_0
/*    */     //   596: getfield hC0 : Lf/rH;
/*    */     //   599: iconst_1
/*    */     //   600: anewarray f/U70
/*    */     //   603: dup
/*    */     //   604: iconst_0
/*    */     //   605: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   608: iconst_0
/*    */     //   609: iconst_0
/*    */     //   610: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   613: aastore
/*    */     //   614: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   617: goto -> 591
/*    */     //   620: aload_0
/*    */     //   621: dup
/*    */     //   622: getfield hC0 : Lf/rH;
/*    */     //   625: aload_0
/*    */     //   626: dup
/*    */     //   627: getfield KW : I
/*    */     //   630: istore_1
/*    */     //   631: getfield m40 : I
/*    */     //   634: iload_1
/*    */     //   635: swap
/*    */     //   636: invokevirtual tL : (II)V
/*    */     //   639: goto -> 694
/*    */     //   642: aload_0
/*    */     //   643: getfield hC0 : Lf/rH;
/*    */     //   646: invokevirtual H : ()V
/*    */     //   649: goto -> 712
/*    */     //   652: aload_0
/*    */     //   653: dup
/*    */     //   654: dup
/*    */     //   655: getfield hC0 : Lf/rH;
/*    */     //   658: iconst_1
/*    */     //   659: anewarray f/U70
/*    */     //   662: dup
/*    */     //   663: iconst_0
/*    */     //   664: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   667: iload_1
/*    */     //   668: iconst_0
/*    */     //   669: invokevirtual SJ0 : (SZ)Lf/U70;
/*    */     //   672: aastore
/*    */     //   673: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   676: pop
/*    */     //   677: getfield hC0 : Lf/rH;
/*    */     //   680: aload_0
/*    */     //   681: dup
/*    */     //   682: getfield KW : I
/*    */     //   685: istore_1
/*    */     //   686: getfield m40 : I
/*    */     //   689: iload_1
/*    */     //   690: swap
/*    */     //   691: invokevirtual tL : (II)V
/*    */     //   694: getfield hC0 : Lf/rH;
/*    */     //   697: aload_0
/*    */     //   698: dup
/*    */     //   699: getfield gc : I
/*    */     //   702: istore_0
/*    */     //   703: getfield x80 : I
/*    */     //   706: iload_0
/*    */     //   707: swap
/*    */     //   708: invokevirtual zT : (II)Lf/JG0;
/*    */     //   711: pop
/*    */     //   712: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 10
/*    */     //   #2	-> 13
/*    */     //   #3	-> 40
/*    */     //   #4	-> 43
/*    */     //   #5	-> 136
/*    */     //   #6	-> 140
/*    */     //   #7	-> 145
/*    */     //   #8	-> 152
/*    */     //   #9	-> 155
/*    */     //   #10	-> 163
/*    */     //   #11	-> 167
/*    */     //   #12	-> 172
/*    */     //   #13	-> 179
/*    */     //   #14	-> 182
/*    */     //   #15	-> 190
/*    */     //   #16	-> 194
/*    */     //   #17	-> 199
/*    */     //   #18	-> 206
/*    */     //   #19	-> 209
/*    */     //   #20	-> 217
/*    */     //   #21	-> 221
/*    */     //   #22	-> 226
/*    */     //   #23	-> 233
/*    */     //   #24	-> 236
/*    */     //   #25	-> 244
/*    */     //   #26	-> 248
/*    */     //   #27	-> 253
/*    */     //   #28	-> 260
/*    */     //   #29	-> 263
/*    */     //   #30	-> 271
/*    */     //   #31	-> 275
/*    */     //   #32	-> 280
/*    */     //   #33	-> 287
/*    */     //   #34	-> 290
/*    */     //   #35	-> 298
/*    */     //   #36	-> 302
/*    */     //   #37	-> 307
/*    */     //   #38	-> 314
/*    */     //   #39	-> 317
/*    */     //   #40	-> 325
/*    */     //   #41	-> 329
/*    */     //   #42	-> 334
/*    */     //   #43	-> 341
/*    */     //   #44	-> 344
/*    */     //   #45	-> 352
/*    */     //   #46	-> 356
/*    */     //   #47	-> 361
/*    */     //   #48	-> 368
/*    */     //   #49	-> 371
/*    */     //   #50	-> 379
/*    */     //   #51	-> 383
/*    */     //   #52	-> 388
/*    */     //   #53	-> 395
/*    */     //   #54	-> 398
/*    */     //   #55	-> 406
/*    */     //   #56	-> 410
/*    */     //   #57	-> 415
/*    */     //   #58	-> 422
/*    */     //   #59	-> 425
/*    */     //   #60	-> 433
/*    */     //   #61	-> 437
/*    */     //   #62	-> 442
/*    */     //   #63	-> 449
/*    */     //   #64	-> 452
/*    */     //   #65	-> 460
/*    */     //   #66	-> 464
/*    */     //   #67	-> 469
/*    */     //   #68	-> 476
/*    */     //   #69	-> 479
/*    */     //   #70	-> 487
/*    */     //   #71	-> 491
/*    */     //   #72	-> 496
/*    */     //   #73	-> 503
/*    */     //   #74	-> 506
/*    */     //   #75	-> 514
/*    */     //   #76	-> 518
/*    */     //   #77	-> 523
/*    */     //   #78	-> 530
/*    */     //   #79	-> 533
/*    */     //   #80	-> 541
/*    */     //   #81	-> 545
/*    */     //   #82	-> 550
/*    */     //   #83	-> 557
/*    */     //   #84	-> 560
/*    */     //   #85	-> 568
/*    */     //   #86	-> 572
/*    */     //   #87	-> 577
/*    */     //   #88	-> 584
/*    */     //   #89	-> 587
/*    */     //   #90	-> 596
/*    */     //   #91	-> 600
/*    */     //   #92	-> 605
/*    */     //   #93	-> 610
/*    */     //   #94	-> 613
/*    */     //   #95	-> 622
/*    */     //   #96	-> 627
/*    */     //   #97	-> 643
/*    */     //   #98	-> 646
/*    */     //   #99	-> 655
/*    */     //   #100	-> 659
/*    */     //   #101	-> 664
/*    */     //   #102	-> 669
/*    */     //   #103	-> 672
/*    */     //   #104	-> 677
/*    */     //   #105	-> 682
/*    */     //   #106	-> 694
/*    */     //   #107	-> 699
/*    */   }
/*    */   
/*    */   public void lE(int paramInt1, int paramInt2) {
/*    */     this.gc = paramInt1;
/*    */     this.x80 = paramInt2;
/*    */   }
/*    */   
/*    */   public final void E20() {
/*    */     this.KW = 48;
/*    */     this.m40 = 48;
/*    */   }
/*    */   
/*    */   public final void Zt0() {
/*    */     this.zz0 = false;
/*    */   }
/*    */   
/*    */   public void LPt2(byte paramByte, short paramShort1, short paramShort2) {
/*    */     this.hC0 = paramShort1;
/*    */     if (paramShort1 <= 0)
/*    */       paramShort2 = 0; 
/*    */     this.op0 = paramShort2;
/*    */     this.lx = paramByte;
/*    */     qb0();
/*    */     t4();
/*    */   }
/*    */   
/*    */   public void Tm0(Y paramY) {}
/*    */   
/*    */   public final void an0(Ik0 paramIk0) {
/*    */     this.Ex = paramIk0;
/*    */   }
/*    */   
/*    */   public final void xJ(boolean paramBoolean1, boolean paramBoolean2) {
/*    */     boolean bool;
/*    */     Sa0 sa0 = this.O;
/*    */     Ll ll2 = SF0;
/*    */     if (paramBoolean1 && paramBoolean2) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     gf0(ll2, bool);
/*    */     Ll ll1 = PH;
/*    */     if (paramBoolean1 && !paramBoolean2) {
/*    */       paramBoolean2 = true;
/*    */     } else {
/*    */       paramBoolean2 = false;
/*    */     } 
/*    */     gf0(ll1, paramBoolean2);
/*    */   }
/*    */   
/*    */   public void R60(throws paramthrows) {
/*    */     if (!this.os)
/*    */       super.R60(paramthrows); 
/*    */   }
/*    */   
/*    */   public void Ve(throws paramthrows, int paramInt1, int paramInt2, int paramInt3) {}
/*    */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/O0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */