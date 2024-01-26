/* 1 */ package f;public final class tJ0 extends fZ { public final boolean i2() { if (this.Fp0) return false; 
/* 2 */     long l1 = zm0.u20 - this.wf, l2 = (this.Vk ? 500L : 720L); return (l1 > l2); }
/*   */ 
/*   */   
/*   */   public final long wf;
/*   */   public KI Il0;
/*   */   public a4 Wz0;
/*   */   public boolean Vk;
/*   */   public boolean Fp0;
/*   */   public boolean Lt;
/*   */   
/*   */   public tJ0(KI paramKI, xr0 paramxr0, a4 parama4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*   */     char c;
/*   */     this.wf = zm0.zg();
/*   */     this.Il0 = paramKI;
/*   */     this.Wz0 = parama4;
/*   */     this.Vk = paramBoolean1;
/*   */     this.Fp0 = paramBoolean2;
/*   */     this.Lt = paramBoolean3;
/*   */     if (!paramBoolean3 && (parama4.Wi() & 0x200) != 0) {
/*   */       int i = paramxr0.Ka() + 1;
/*   */       xr0 xr01;
/*   */       (xr01 = paramKI.G1(i, paramxr0.hA0())).TL0(new tJ0(paramKI, this, parama4, paramBoolean1, paramBoolean2, true));
/*   */     } 
/*   */     if ((parama4.Wi() & 0x1) != 0) {
/*   */       c = 'ڇ';
/*   */     } else if (!paramBoolean1) {
/*   */       c = 'څ';
/*   */     } else {
/*   */       c = 'چ';
/*   */     } 
/*   */     if (c > '\000')
/*   */       km.pm0.TC0(c); 
/*   */   }
/*   */   
/*   */   public final void tU(tH paramtH, int paramInt1, int paramInt2, int paramInt3) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getstatic f/zm0.u20 : J
/*   */     //   4: aload_0
/*   */     //   5: getfield wf : J
/*   */     //   8: lsub
/*   */     //   9: lstore #5
/*   */     //   11: getfield Vk : Z
/*   */     //   14: ifeq -> 41
/*   */     //   17: lload #5
/*   */     //   19: ldc2_w 380
/*   */     //   22: lcmp
/*   */     //   23: ifge -> 29
/*   */     //   26: goto -> 84
/*   */     //   29: lload #5
/*   */     //   31: ldc2_w 440
/*   */     //   34: lcmp
/*   */     //   35: ifge -> 105
/*   */     //   38: goto -> 99
/*   */     //   41: lload #5
/*   */     //   43: ldc2_w 60
/*   */     //   46: lcmp
/*   */     //   47: ifge -> 53
/*   */     //   50: goto -> 105
/*   */     //   53: lload #5
/*   */     //   55: ldc2_w 120
/*   */     //   58: lcmp
/*   */     //   59: ifge -> 65
/*   */     //   62: goto -> 99
/*   */     //   65: lload #5
/*   */     //   67: ldc2_w 600
/*   */     //   70: lcmp
/*   */     //   71: ifge -> 77
/*   */     //   74: goto -> 84
/*   */     //   77: aload_0
/*   */     //   78: getfield Fp0 : Z
/*   */     //   81: ifeq -> 90
/*   */     //   84: iconst_2
/*   */     //   85: istore #5
/*   */     //   87: goto -> 108
/*   */     //   90: lload #5
/*   */     //   92: ldc2_w 660
/*   */     //   95: lcmp
/*   */     //   96: ifge -> 105
/*   */     //   99: iconst_1
/*   */     //   100: istore #5
/*   */     //   102: goto -> 108
/*   */     //   105: iconst_0
/*   */     //   106: istore #5
/*   */     //   108: aload_0
/*   */     //   109: aload_1
/*   */     //   110: getstatic f/Xc0.Nn0 : F
/*   */     //   113: invokevirtual og0 : (F)V
/*   */     //   116: getfield Wz0 : Lf/a4;
/*   */     //   119: dup
/*   */     //   120: astore #6
/*   */     //   122: getfield up0 : S
/*   */     //   125: sipush #256
/*   */     //   128: iand
/*   */     //   129: ifeq -> 317
/*   */     //   132: aload #6
/*   */     //   134: iload #5
/*   */     //   136: iconst_2
/*   */     //   137: imul
/*   */     //   138: istore #5
/*   */     //   140: getfield pn0 : [Lf/pe0;
/*   */     //   143: dup
/*   */     //   144: astore #6
/*   */     //   146: ifnull -> 170
/*   */     //   149: iload #5
/*   */     //   151: aload #6
/*   */     //   153: arraylength
/*   */     //   154: if_icmplt -> 160
/*   */     //   157: goto -> 170
/*   */     //   160: aload #6
/*   */     //   162: iload #5
/*   */     //   164: aaload
/*   */     //   165: astore #6
/*   */     //   167: goto -> 173
/*   */     //   170: aconst_null
/*   */     //   171: astore #6
/*   */     //   173: aload #6
/*   */     //   175: ifnonnull -> 179
/*   */     //   178: return
/*   */     //   179: iload_2
/*   */     //   180: ifeq -> 314
/*   */     //   183: aload_1
/*   */     //   184: aload #6
/*   */     //   186: dup
/*   */     //   187: dup
/*   */     //   188: iload #4
/*   */     //   190: iload_3
/*   */     //   191: i2f
/*   */     //   192: fstore #6
/*   */     //   194: bipush #16
/*   */     //   196: isub
/*   */     //   197: i2f
/*   */     //   198: fstore #7
/*   */     //   200: getfield H0 : I
/*   */     //   203: i2f
/*   */     //   204: fstore #8
/*   */     //   206: getfield Vn0 : I
/*   */     //   209: i2f
/*   */     //   210: fstore #9
/*   */     //   212: fload #6
/*   */     //   214: fload #7
/*   */     //   216: fload #8
/*   */     //   218: fload #9
/*   */     //   220: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*   */     //   223: getstatic f/Xc0.jE : I
/*   */     //   226: ifle -> 314
/*   */     //   229: getstatic f/km.xn : Lf/Xc0;
/*   */     //   232: aload_0
/*   */     //   233: dup
/*   */     //   234: getfield Wz0 : Lf/a4;
/*   */     //   237: getfield h : I
/*   */     //   240: istore #8
/*   */     //   242: getfield Il0 : Lf/KI;
/*   */     //   245: getfield E10 : B
/*   */     //   248: sipush #10000
/*   */     //   251: imul
/*   */     //   252: iload #8
/*   */     //   254: iadd
/*   */     //   255: istore #8
/*   */     //   257: getfield iH : Lf/Ut0;
/*   */     //   260: iload #5
/*   */     //   262: ldc 65536
/*   */     //   264: imul
/*   */     //   265: iload #8
/*   */     //   267: iadd
/*   */     //   268: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   271: checkcast f/Ui0
/*   */     //   274: dup
/*   */     //   275: astore #8
/*   */     //   277: ifnull -> 314
/*   */     //   280: aload_1
/*   */     //   281: aload #8
/*   */     //   283: aload_1
/*   */     //   284: aload #8
/*   */     //   286: fload #7
/*   */     //   288: aload #8
/*   */     //   290: fload #6
/*   */     //   292: aload_1
/*   */     //   293: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   296: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*   */     //   299: invokevirtual aR : (F)V
/*   */     //   302: invokevirtual Zq0 : (F)V
/*   */     //   305: invokevirtual Ne : (Lf/JX;)V
/*   */     //   308: getstatic f/Xc0.Nn0 : F
/*   */     //   311: invokevirtual og0 : (F)V
/*   */     //   314: iinc #5, 1
/*   */     //   317: aload_0
/*   */     //   318: getfield Wz0 : Lf/a4;
/*   */     //   321: dup
/*   */     //   322: astore #6
/*   */     //   324: getfield up0 : S
/*   */     //   327: sipush #512
/*   */     //   330: iand
/*   */     //   331: ifeq -> 542
/*   */     //   334: aload_0
/*   */     //   335: iload #5
/*   */     //   337: iconst_4
/*   */     //   338: imul
/*   */     //   339: istore #5
/*   */     //   341: getfield Lt : Z
/*   */     //   344: ifeq -> 353
/*   */     //   347: iconst_2
/*   */     //   348: istore #7
/*   */     //   350: goto -> 356
/*   */     //   353: iconst_0
/*   */     //   354: istore #7
/*   */     //   356: aload #6
/*   */     //   358: iload #5
/*   */     //   360: iload #7
/*   */     //   362: iadd
/*   */     //   363: istore #6
/*   */     //   365: getfield pn0 : [Lf/pe0;
/*   */     //   368: dup
/*   */     //   369: astore #7
/*   */     //   371: ifnull -> 395
/*   */     //   374: iload #6
/*   */     //   376: aload #7
/*   */     //   378: arraylength
/*   */     //   379: if_icmplt -> 385
/*   */     //   382: goto -> 395
/*   */     //   385: aload #7
/*   */     //   387: iload #6
/*   */     //   389: aaload
/*   */     //   390: astore #6
/*   */     //   392: goto -> 398
/*   */     //   395: aconst_null
/*   */     //   396: astore #6
/*   */     //   398: aload #6
/*   */     //   400: ifnonnull -> 404
/*   */     //   403: return
/*   */     //   404: iload_2
/*   */     //   405: ifeq -> 539
/*   */     //   408: aload_1
/*   */     //   409: aload #6
/*   */     //   411: dup
/*   */     //   412: dup
/*   */     //   413: iload #4
/*   */     //   415: iload_3
/*   */     //   416: i2f
/*   */     //   417: fstore #6
/*   */     //   419: bipush #16
/*   */     //   421: isub
/*   */     //   422: i2f
/*   */     //   423: fstore #7
/*   */     //   425: getfield H0 : I
/*   */     //   428: i2f
/*   */     //   429: fstore #8
/*   */     //   431: getfield Vn0 : I
/*   */     //   434: i2f
/*   */     //   435: fstore #9
/*   */     //   437: fload #6
/*   */     //   439: fload #7
/*   */     //   441: fload #8
/*   */     //   443: fload #9
/*   */     //   445: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*   */     //   448: getstatic f/Xc0.jE : I
/*   */     //   451: ifle -> 539
/*   */     //   454: getstatic f/km.xn : Lf/Xc0;
/*   */     //   457: aload_0
/*   */     //   458: dup
/*   */     //   459: getfield Wz0 : Lf/a4;
/*   */     //   462: getfield h : I
/*   */     //   465: istore #8
/*   */     //   467: getfield Il0 : Lf/KI;
/*   */     //   470: getfield E10 : B
/*   */     //   473: sipush #10000
/*   */     //   476: imul
/*   */     //   477: iload #8
/*   */     //   479: iadd
/*   */     //   480: istore #8
/*   */     //   482: getfield iH : Lf/Ut0;
/*   */     //   485: iload #5
/*   */     //   487: ldc 65536
/*   */     //   489: imul
/*   */     //   490: iload #8
/*   */     //   492: iadd
/*   */     //   493: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   496: checkcast f/Ui0
/*   */     //   499: dup
/*   */     //   500: astore #8
/*   */     //   502: ifnull -> 539
/*   */     //   505: aload_1
/*   */     //   506: aload #8
/*   */     //   508: aload_1
/*   */     //   509: aload #8
/*   */     //   511: fload #7
/*   */     //   513: aload #8
/*   */     //   515: fload #6
/*   */     //   517: aload_1
/*   */     //   518: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   521: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*   */     //   524: invokevirtual aR : (F)V
/*   */     //   527: invokevirtual Zq0 : (F)V
/*   */     //   530: invokevirtual Ne : (Lf/JX;)V
/*   */     //   533: getstatic f/Xc0.Nn0 : F
/*   */     //   536: invokevirtual og0 : (F)V
/*   */     //   539: iinc #5, 1
/*   */     //   542: iload_2
/*   */     //   543: ifeq -> 547
/*   */     //   546: return
/*   */     //   547: aload_0
/*   */     //   548: dup
/*   */     //   549: getfield Wz0 : Lf/a4;
/*   */     //   552: astore_2
/*   */     //   553: getfield Lt : Z
/*   */     //   556: ifeq -> 565
/*   */     //   559: iconst_2
/*   */     //   560: istore #6
/*   */     //   562: goto -> 568
/*   */     //   565: iconst_0
/*   */     //   566: istore #6
/*   */     //   568: aload_2
/*   */     //   569: iload #5
/*   */     //   571: iload #6
/*   */     //   573: iadd
/*   */     //   574: istore_2
/*   */     //   575: getfield pn0 : [Lf/pe0;
/*   */     //   578: dup
/*   */     //   579: astore #6
/*   */     //   581: ifnull -> 602
/*   */     //   584: iload_2
/*   */     //   585: aload #6
/*   */     //   587: arraylength
/*   */     //   588: if_icmplt -> 594
/*   */     //   591: goto -> 602
/*   */     //   594: aload #6
/*   */     //   596: iload_2
/*   */     //   597: aaload
/*   */     //   598: astore_2
/*   */     //   599: goto -> 604
/*   */     //   602: aconst_null
/*   */     //   603: astore_2
/*   */     //   604: aload_2
/*   */     //   605: ifnull -> 642
/*   */     //   608: aload_1
/*   */     //   609: aload_2
/*   */     //   610: dup
/*   */     //   611: dup
/*   */     //   612: iload #4
/*   */     //   614: iload_3
/*   */     //   615: i2f
/*   */     //   616: fstore_2
/*   */     //   617: i2f
/*   */     //   618: fstore #6
/*   */     //   620: getfield H0 : I
/*   */     //   623: i2f
/*   */     //   624: fstore #7
/*   */     //   626: getfield Vn0 : I
/*   */     //   629: i2f
/*   */     //   630: fstore #8
/*   */     //   632: fload_2
/*   */     //   633: fload #6
/*   */     //   635: fload #7
/*   */     //   637: fload #8
/*   */     //   639: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*   */     //   642: getstatic f/Xc0.jE : I
/*   */     //   645: ifle -> 749
/*   */     //   648: aload_0
/*   */     //   649: dup
/*   */     //   650: dup
/*   */     //   651: getstatic f/km.xn : Lf/Xc0;
/*   */     //   654: astore_0
/*   */     //   655: getfield Wz0 : Lf/a4;
/*   */     //   658: getfield h : I
/*   */     //   661: istore_2
/*   */     //   662: getfield Il0 : Lf/KI;
/*   */     //   665: getfield E10 : B
/*   */     //   668: sipush #10000
/*   */     //   671: imul
/*   */     //   672: iload_2
/*   */     //   673: iadd
/*   */     //   674: istore_2
/*   */     //   675: getfield Lt : Z
/*   */     //   678: ifeq -> 687
/*   */     //   681: iconst_2
/*   */     //   682: istore #6
/*   */     //   684: goto -> 690
/*   */     //   687: iconst_0
/*   */     //   688: istore #6
/*   */     //   690: aload_0
/*   */     //   691: iload #5
/*   */     //   693: iload #6
/*   */     //   695: iadd
/*   */     //   696: istore_0
/*   */     //   697: getfield iH : Lf/Ut0;
/*   */     //   700: iload_0
/*   */     //   701: ldc 65536
/*   */     //   703: imul
/*   */     //   704: iload_2
/*   */     //   705: iadd
/*   */     //   706: invokevirtual Z6 : (I)Ljava/lang/Object;
/*   */     //   709: checkcast f/Ui0
/*   */     //   712: dup
/*   */     //   713: astore_0
/*   */     //   714: ifnull -> 749
/*   */     //   717: aload_1
/*   */     //   718: aload_0
/*   */     //   719: aload_1
/*   */     //   720: aload_0
/*   */     //   721: iload #4
/*   */     //   723: aload_0
/*   */     //   724: iload_3
/*   */     //   725: aload_1
/*   */     //   726: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   729: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*   */     //   732: i2f
/*   */     //   733: invokevirtual aR : (F)V
/*   */     //   736: i2f
/*   */     //   737: invokevirtual Zq0 : (F)V
/*   */     //   740: invokevirtual Ne : (Lf/JX;)V
/*   */     //   743: getstatic f/Xc0.Nn0 : F
/*   */     //   746: invokevirtual og0 : (F)V
/*   */     //   749: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 5
/*   */     //   #3	-> 122
/*   */     //   #4	-> 140
/*   */     //   #5	-> 200
/*   */     //   #6	-> 206
/*   */     //   #7	-> 220
/*   */     //   #8	-> 223
/*   */     //   #9	-> 237
/*   */     //   #10	-> 242
/*   */     //   #11	-> 245
/*   */     //   #12	-> 257
/*   */     //   #13	-> 268
/*   */     //   #14	-> 293
/*   */     //   #15	-> 324
/*   */     //   #16	-> 341
/*   */     //   #17	-> 365
/*   */     //   #18	-> 425
/*   */     //   #19	-> 431
/*   */     //   #20	-> 445
/*   */     //   #21	-> 448
/*   */     //   #22	-> 462
/*   */     //   #23	-> 467
/*   */     //   #24	-> 470
/*   */     //   #25	-> 482
/*   */     //   #26	-> 493
/*   */     //   #27	-> 518
/*   */     //   #28	-> 575
/*   */     //   #29	-> 587
/*   */     //   #30	-> 620
/*   */     //   #31	-> 626
/*   */     //   #32	-> 639
/*   */     //   #33	-> 642
/*   */     //   #34	-> 658
/*   */     //   #35	-> 662
/*   */     //   #36	-> 665
/*   */     //   #37	-> 675
/*   */     //   #38	-> 697
/*   */     //   #39	-> 706
/*   */     //   #40	-> 726
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */