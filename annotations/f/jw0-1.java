/*  1 */ package f;public final class jw0 extends n3 { public dQ[] Q10; private void ji(super paramsuper, bv parambv) { if (parambv == bv.Gg)
/*  2 */     { VH vH; char c = 'ऺ'; byte b = 20; Tx tx = paramsuper::Ll;
/*  3 */       this(Ml0.OH0(c), b, tx);
/*    */       
/*  5 */       this.n90.si(this, this.n90.Ub()); }  } public jw0(gO paramgO) { super(paramgO, -1); lp0(null); } public final void lp0(String[] paramArrayOfString) { g2 g2 = km.u4.Mg0; byte b = 0; while (b < super.Gc(km.u4.Lz.wm0)) { super super; byte b1; for (super = g2.LPT5(b), b1 = 0; b1 < 6; ) {
/*    */         j40 j40;
/*  7 */         if ((j40 = km.u4.s40(aq0.LI).de0(super.Ss[b1])) == null)
/*    */         {
/*  9 */           j40 = km.u4.s40(aq0.XJ0).de0(super.Ss[b1]); }  int i = b % 3 * 3; i = Math.floorDiv(b, 3) * 18 + i; i = b1 % 3 + i; i = Math.floorDiv(b1, 3) * 9 + i;
/*    */         
/*    */         FK fK;
/* 12 */         (fK = ((FK[])this.f9)[i])
/* 13 */           .L70 = j40;
/* 14 */         ((FK[])this.f9)[i].un((((FK[])this.f9)[i]).MQ);
/*    */         
/*    */         if (j40 != null)
/* 17 */         { short s = j40.Zs.Vf0(); byte b2 = j40.s5();
/*    */           
/* 19 */           fK.Ax(um0.Kt0.lb(s, j40.Zs.da(), b2)[0]); } else { fK
/* 20 */             .db0 = null;
/* 21 */           fK.Ax(null);
/* 22 */           fK.z4 = null; fK.zn(); }  fK
/* 23 */           .TG0
/* 24 */           .Fx0(false); b1 = (byte)(b1 + 1);
/*    */       } 
/* 26 */       if (!super.Z5.isEmpty()) { this.Q10[b]
/*    */           
/* 28 */           .E1(super.Z5); } else { this.Q10[b].E1(Ml0.Go(2360, Integer.toString(b + 1))); }  b = (byte)(b + 1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static void Ll(super paramsuper, String paramString) {
/*    */     R8 r8 = km.u4;
/*    */     byte b = paramsuper.Nd0;
/*    */     r8.e20.W3(new Ky0(b, paramString));
/*    */   }
/*    */   
/*    */   public final void a5() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getstatic f/km.u4 : Lf/R8;
/*    */     //   5: getfield Lz : Lf/fH0;
/*    */     //   8: getfield wm0 : B
/*    */     //   11: invokestatic Gc : (B)B
/*    */     //   14: dup
/*    */     //   15: istore_1
/*    */     //   16: bipush #6
/*    */     //   18: imul
/*    */     //   19: anewarray f/FK
/*    */     //   22: putfield f9 : [Lf/Zq;
/*    */     //   25: iload_1
/*    */     //   26: anewarray f/dQ
/*    */     //   29: putfield Q10 : [Lf/dQ;
/*    */     //   32: new f/lPT3
/*    */     //   35: dup
/*    */     //   36: astore_2
/*    */     //   37: aload_0
/*    */     //   38: invokespecial <init> : (Lf/jw0;)V
/*    */     //   41: new f/cr0
/*    */     //   44: dup
/*    */     //   45: dup
/*    */     //   46: astore_3
/*    */     //   47: aload_0
/*    */     //   48: invokespecial <init> : (Lf/Ip;)V
/*    */     //   51: new f/g0
/*    */     //   54: dup
/*    */     //   55: astore #4
/*    */     //   57: aload_0
/*    */     //   58: invokespecial <init> : (Lf/Ip;)V
/*    */     //   61: new f/g0
/*    */     //   64: dup
/*    */     //   65: astore #5
/*    */     //   67: aload_0
/*    */     //   68: invokespecial <init> : (Lf/Ip;)V
/*    */     //   71: new f/cr0
/*    */     //   74: dup
/*    */     //   75: astore #6
/*    */     //   77: aload_0
/*    */     //   78: invokespecial <init> : (Lf/Ip;)V
/*    */     //   81: invokevirtual Em0 : ()Lf/U90;
/*    */     //   84: pop
/*    */     //   85: iconst_0
/*    */     //   86: istore #7
/*    */     //   88: iload #7
/*    */     //   90: iload_1
/*    */     //   91: if_icmpge -> 534
/*    */     //   94: iconst_3
/*    */     //   95: dup
/*    */     //   96: istore #8
/*    */     //   98: anewarray f/Qv0
/*    */     //   101: astore #9
/*    */     //   103: new f/cr0
/*    */     //   106: dup
/*    */     //   107: astore #10
/*    */     //   109: aload_0
/*    */     //   110: invokespecial <init> : (Lf/Ip;)V
/*    */     //   113: new f/g0
/*    */     //   116: dup
/*    */     //   117: astore #11
/*    */     //   119: aload #10
/*    */     //   121: aload_0
/*    */     //   122: dup
/*    */     //   123: dup
/*    */     //   124: aload #11
/*    */     //   126: aload_0
/*    */     //   127: invokespecial <init> : (Lf/Ip;)V
/*    */     //   130: getstatic f/km.u4 : Lf/R8;
/*    */     //   133: getfield Mg0 : Lf/g2;
/*    */     //   136: iload #7
/*    */     //   138: invokevirtual LPT5 : (B)Lf/super;
/*    */     //   141: astore #12
/*    */     //   143: getfield Q10 : [Lf/dQ;
/*    */     //   146: iload #7
/*    */     //   148: new f/dQ
/*    */     //   151: dup
/*    */     //   152: astore #13
/*    */     //   154: invokespecial <init> : ()V
/*    */     //   157: aload #13
/*    */     //   159: aastore
/*    */     //   160: getfield Q10 : [Lf/dQ;
/*    */     //   163: iload #7
/*    */     //   165: aaload
/*    */     //   166: ldc 'label-battle-box'
/*    */     //   168: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   171: getfield Q10 : [Lf/dQ;
/*    */     //   174: iload #7
/*    */     //   176: aaload
/*    */     //   177: aload_0
/*    */     //   178: aload #12
/*    */     //   180: <illegal opcode> yb0 : (Lf/jw0;Lf/super;)Lf/tC0;
/*    */     //   185: invokevirtual lPt3 : (Lf/tC0;)V
/*    */     //   188: new f/g0
/*    */     //   191: dup
/*    */     //   192: aload_0
/*    */     //   193: invokespecial <init> : (Lf/Ip;)V
/*    */     //   196: iconst_1
/*    */     //   197: anewarray f/JG0
/*    */     //   200: dup
/*    */     //   201: aload_0
/*    */     //   202: getfield Q10 : [Lf/dQ;
/*    */     //   205: iload #7
/*    */     //   207: aaload
/*    */     //   208: iconst_0
/*    */     //   209: swap
/*    */     //   210: aastore
/*    */     //   211: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   214: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   217: pop
/*    */     //   218: new f/cr0
/*    */     //   221: dup
/*    */     //   222: aload_0
/*    */     //   223: invokespecial <init> : (Lf/Ip;)V
/*    */     //   226: iconst_1
/*    */     //   227: anewarray f/JG0
/*    */     //   230: dup
/*    */     //   231: aload_0
/*    */     //   232: getfield Q10 : [Lf/dQ;
/*    */     //   235: iload #7
/*    */     //   237: aaload
/*    */     //   238: iconst_0
/*    */     //   239: swap
/*    */     //   240: aastore
/*    */     //   241: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   244: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   247: pop
/*    */     //   248: iconst_0
/*    */     //   249: istore #13
/*    */     //   251: iconst_0
/*    */     //   252: istore #14
/*    */     //   254: iload #14
/*    */     //   256: bipush #6
/*    */     //   258: if_icmpge -> 442
/*    */     //   261: new f/FK
/*    */     //   264: dup
/*    */     //   265: astore #15
/*    */     //   267: aload_0
/*    */     //   268: aload #15
/*    */     //   270: aload_2
/*    */     //   271: aload_0
/*    */     //   272: iload #14
/*    */     //   274: dup
/*    */     //   275: iload #7
/*    */     //   277: dup
/*    */     //   278: aload #15
/*    */     //   280: aload_0
/*    */     //   281: getfield n90 : Lf/gO;
/*    */     //   284: aload_0
/*    */     //   285: getstatic f/km.u4 : Lf/R8;
/*    */     //   288: getstatic f/aq0.XJ0 : Lf/aq0;
/*    */     //   291: invokevirtual s40 : (Lf/aq0;)Lf/Uc0;
/*    */     //   294: aload #12
/*    */     //   296: iload #14
/*    */     //   298: invokespecial <init> : (Lf/gO;Lf/n3;Lf/Uc0;Lf/super;B)V
/*    */     //   301: iconst_3
/*    */     //   302: irem
/*    */     //   303: iconst_3
/*    */     //   304: imul
/*    */     //   305: istore #16
/*    */     //   307: iconst_3
/*    */     //   308: invokestatic floorDiv : (II)I
/*    */     //   311: bipush #18
/*    */     //   313: imul
/*    */     //   314: iload #16
/*    */     //   316: iadd
/*    */     //   317: istore #16
/*    */     //   319: iconst_3
/*    */     //   320: irem
/*    */     //   321: iload #16
/*    */     //   323: iadd
/*    */     //   324: istore #16
/*    */     //   326: iconst_3
/*    */     //   327: invokestatic floorDiv : (II)I
/*    */     //   330: bipush #9
/*    */     //   332: imul
/*    */     //   333: iload #16
/*    */     //   335: iadd
/*    */     //   336: istore #16
/*    */     //   338: getfield f9 : [Lf/Zq;
/*    */     //   341: checkcast [Lf/FK;
/*    */     //   344: iload #16
/*    */     //   346: aload #15
/*    */     //   348: aastore
/*    */     //   349: putfield dw0 : Lf/ab0;
/*    */     //   352: iload #16
/*    */     //   354: <illegal opcode> run : (Lf/jw0;I)Ljava/lang/Runnable;
/*    */     //   359: putfield n0 : Ljava/lang/Runnable;
/*    */     //   362: iload #13
/*    */     //   364: iconst_1
/*    */     //   365: iadd
/*    */     //   366: dup
/*    */     //   367: istore #16
/*    */     //   369: iload #8
/*    */     //   371: aload #9
/*    */     //   373: iload #13
/*    */     //   375: aload #15
/*    */     //   377: aastore
/*    */     //   378: irem
/*    */     //   379: ifne -> 428
/*    */     //   382: aload #11
/*    */     //   384: aload #10
/*    */     //   386: iconst_0
/*    */     //   387: istore #13
/*    */     //   389: new f/g0
/*    */     //   392: dup
/*    */     //   393: aload #9
/*    */     //   395: swap
/*    */     //   396: aload_0
/*    */     //   397: invokespecial <init> : (Lf/Ip;)V
/*    */     //   400: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   403: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   406: pop
/*    */     //   407: new f/cr0
/*    */     //   410: dup
/*    */     //   411: aload #9
/*    */     //   413: swap
/*    */     //   414: aload_0
/*    */     //   415: invokespecial <init> : (Lf/Ip;)V
/*    */     //   418: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   421: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   424: pop
/*    */     //   425: goto -> 432
/*    */     //   428: iload #16
/*    */     //   430: istore #13
/*    */     //   432: iload #14
/*    */     //   434: iconst_1
/*    */     //   435: iadd
/*    */     //   436: i2b
/*    */     //   437: istore #14
/*    */     //   439: goto -> 254
/*    */     //   442: aload #6
/*    */     //   444: aload #5
/*    */     //   446: aload #10
/*    */     //   448: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   451: pop
/*    */     //   452: aload #11
/*    */     //   454: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   457: pop
/*    */     //   458: iload #7
/*    */     //   460: iconst_1
/*    */     //   461: iadd
/*    */     //   462: dup
/*    */     //   463: istore #7
/*    */     //   465: iconst_3
/*    */     //   466: irem
/*    */     //   467: dup
/*    */     //   468: istore #8
/*    */     //   470: ifle -> 481
/*    */     //   473: aload #6
/*    */     //   475: bipush #25
/*    */     //   477: invokevirtual Aq : (I)Lf/U90;
/*    */     //   480: pop
/*    */     //   481: iload #8
/*    */     //   483: ifne -> 526
/*    */     //   486: aload_3
/*    */     //   487: aload #4
/*    */     //   489: aload_3
/*    */     //   490: aload #5
/*    */     //   492: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   495: pop
/*    */     //   496: aload #6
/*    */     //   498: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   501: pop
/*    */     //   502: invokevirtual Em0 : ()Lf/U90;
/*    */     //   505: pop
/*    */     //   506: new f/g0
/*    */     //   509: dup
/*    */     //   510: astore #5
/*    */     //   512: aload_0
/*    */     //   513: invokespecial <init> : (Lf/Ip;)V
/*    */     //   516: new f/cr0
/*    */     //   519: dup
/*    */     //   520: astore #6
/*    */     //   522: aload_0
/*    */     //   523: invokespecial <init> : (Lf/Ip;)V
/*    */     //   526: iload #7
/*    */     //   528: i2b
/*    */     //   529: istore #7
/*    */     //   531: goto -> 88
/*    */     //   534: iload_1
/*    */     //   535: bipush #30
/*    */     //   537: if_icmpge -> 623
/*    */     //   540: getstatic f/gm.By0 : Z
/*    */     //   543: ifeq -> 623
/*    */     //   546: aload #4
/*    */     //   548: aload_0
/*    */     //   549: aload_3
/*    */     //   550: aload_0
/*    */     //   551: aload_3
/*    */     //   552: new f/Un
/*    */     //   555: dup
/*    */     //   556: astore_1
/*    */     //   557: aload_0
/*    */     //   558: aload_1
/*    */     //   559: sipush #4018
/*    */     //   562: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   565: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   568: getfield n90 : Lf/gO;
/*    */     //   571: dup
/*    */     //   572: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   575: pop
/*    */     //   576: <illegal opcode> run : (Lf/gO;)Ljava/lang/Runnable;
/*    */     //   581: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   584: bipush #15
/*    */     //   586: invokevirtual Aq : (I)Lf/U90;
/*    */     //   589: pop
/*    */     //   590: iconst_1
/*    */     //   591: anewarray f/JG0
/*    */     //   594: dup
/*    */     //   595: iconst_0
/*    */     //   596: aload_1
/*    */     //   597: aastore
/*    */     //   598: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   601: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   604: pop
/*    */     //   605: iconst_1
/*    */     //   606: anewarray f/JG0
/*    */     //   609: dup
/*    */     //   610: iconst_0
/*    */     //   611: aload_1
/*    */     //   612: aastore
/*    */     //   613: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   616: invokevirtual Em0 : ()Lf/U90;
/*    */     //   619: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   622: pop
/*    */     //   623: aload_0
/*    */     //   624: dup
/*    */     //   625: aload_3
/*    */     //   626: invokevirtual Em0 : ()Lf/U90;
/*    */     //   629: pop
/*    */     //   630: new f/cr0
/*    */     //   633: dup
/*    */     //   634: aload_0
/*    */     //   635: invokespecial <init> : (Lf/Ip;)V
/*    */     //   638: iconst_1
/*    */     //   639: anewarray f/U90
/*    */     //   642: dup
/*    */     //   643: iconst_0
/*    */     //   644: aload #4
/*    */     //   646: aastore
/*    */     //   647: invokevirtual cOM8 : ([Lf/U90;)Lf/U90;
/*    */     //   650: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   653: new f/g0
/*    */     //   656: dup
/*    */     //   657: aload_0
/*    */     //   658: invokespecial <init> : (Lf/Ip;)V
/*    */     //   661: iconst_1
/*    */     //   662: anewarray f/U90
/*    */     //   665: dup
/*    */     //   666: iconst_0
/*    */     //   667: aload_3
/*    */     //   668: aastore
/*    */     //   669: invokevirtual cOM8 : ([Lf/U90;)Lf/U90;
/*    */     //   672: invokevirtual WN : (Lf/U90;)V
/*    */     //   675: invokestatic XU : ()Z
/*    */     //   678: ifeq -> 689
/*    */     //   681: aload_0
/*    */     //   682: getfield Xz0 : Lf/U90;
/*    */     //   685: invokevirtual Em0 : ()Lf/U90;
/*    */     //   688: pop
/*    */     //   689: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 8
/*    */     //   #3	-> 11
/*    */     //   #4	-> 22
/*    */     //   #5	-> 26
/*    */     //   #6	-> 41
/*    */     //   #7	-> 51
/*    */     //   #8	-> 71
/*    */     //   #9	-> 81
/*    */     //   #10	-> 103
/*    */     //   #11	-> 113
/*    */     //   #12	-> 130
/*    */     //   #13	-> 133
/*    */     //   #14	-> 138
/*    */     //   #15	-> 188
/*    */     //   #16	-> 197
/*    */     //   #17	-> 218
/*    */     //   #18	-> 227
/*    */     //   #19	-> 281
/*    */     //   #20	-> 285
/*    */     //   #21	-> 338
/*    */     //   #22	-> 341
/*    */     //   #23	-> 348
/*    */     //   #24	-> 349
/*    */     //   #25	-> 354
/*    */     //   #26	-> 359
/*    */     //   #27	-> 377
/*    */     //   #28	-> 389
/*    */     //   #29	-> 400
/*    */     //   #30	-> 407
/*    */     //   #31	-> 418
/*    */     //   #32	-> 506
/*    */     //   #33	-> 516
/*    */     //   #34	-> 540
/*    */     //   #35	-> 568
/*    */     //   #36	-> 572
/*    */     //   #37	-> 630
/*    */     //   #38	-> 639
/*    */     //   #39	-> 653
/*    */     //   #40	-> 662
/*    */     //   #41	-> 682
/*    */     //   #42	-> 685
/*    */   }
/*    */   
/*    */   public final void H0(int paramInt) {
/*    */     super.H0(paramInt);
/*    */     ((rS)this.fr0.fr0).ai(((FK[])this.f9)[paramInt]);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     int i;
/*    */     if (B8.Pg(i = paramoa0.cz0)) {
/*    */       rS rS;
/*    */       if (i == 3) {
/*    */         if (this.n90.gO() && (rS = this.n90.Uj).Bo0 != null)
/*    */           rS.Bo0.xr.Sh0(rS.ez0); 
/*    */       } else if (rS == 4 && (rS = this.n90.Uj).Bo0 != null) {
/*    */         rS.Bo0.xr.Sh0(rS.ez0);
/*    */         rS.Bo0.xr.K90(rS.ez0);
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void EX(nY paramnY) {}
/*    */   
/*    */   public final int Gz0() {
/*    */     return 9;
/*    */   }
/*    */   
/*    */   public final Zq[] MY() {
/*    */     return this.f9;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */