/* 1 */ package f;public final class S10 extends xk { public final boolean i2() { if (this.kd || this.yz == 2)
/*   */     {
/* 3 */       return 
/* 4 */         (zm0.u20 - this.fi0 > 750L); } 
/*   */     return (zm0.u20 - this.fi0 > 1500L); }
/*   */ 
/*   */   
/*   */   public final long fi0 = zm0.zg();
/*   */   public final int yz;
/*   */   public final byte rt;
/*   */   public final byte Lpt5;
/*   */   public final boolean kd;
/*   */   public uT y70;
/*   */   
/*   */   public S10(int paramInt, byte paramByte1, byte paramByte2, boolean paramBoolean) {
/*   */     this.yz = paramInt;
/*   */     this.rt = paramByte1;
/*   */     this.Lpt5 = paramByte2;
/*   */     this.kd = paramBoolean;
/*   */   }
/*   */   
/*   */   public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: bipush #19
/*   */     //   3: istore #7
/*   */     //   5: getfield yz : I
/*   */     //   8: invokestatic yE : (I)I
/*   */     //   11: dup
/*   */     //   12: istore #8
/*   */     //   14: ifeq -> 60
/*   */     //   17: iload #8
/*   */     //   19: iconst_1
/*   */     //   20: if_icmpeq -> 53
/*   */     //   23: iload #8
/*   */     //   25: iconst_2
/*   */     //   26: if_icmpeq -> 32
/*   */     //   29: goto -> 78
/*   */     //   32: aload_0
/*   */     //   33: getfield kd : Z
/*   */     //   36: ifeq -> 46
/*   */     //   39: bipush #39
/*   */     //   41: istore #7
/*   */     //   43: goto -> 78
/*   */     //   46: bipush #29
/*   */     //   48: istore #7
/*   */     //   50: goto -> 78
/*   */     //   53: bipush #33
/*   */     //   55: istore #7
/*   */     //   57: goto -> 78
/*   */     //   60: aload_0
/*   */     //   61: getfield kd : Z
/*   */     //   64: ifeq -> 74
/*   */     //   67: bipush #23
/*   */     //   69: istore #7
/*   */     //   71: goto -> 78
/*   */     //   74: bipush #19
/*   */     //   76: istore #7
/*   */     //   78: aload_0
/*   */     //   79: getfield kd : Z
/*   */     //   82: ifne -> 285
/*   */     //   85: aload_0
/*   */     //   86: getfield yz : I
/*   */     //   89: iconst_2
/*   */     //   90: if_icmpne -> 96
/*   */     //   93: goto -> 285
/*   */     //   96: aload_0
/*   */     //   97: iload #7
/*   */     //   99: aload_0
/*   */     //   100: getfield rt : B
/*   */     //   103: iadd
/*   */     //   104: istore #7
/*   */     //   106: getfield y70 : Lf/uT;
/*   */     //   109: dup
/*   */     //   110: astore #8
/*   */     //   112: ifnull -> 199
/*   */     //   115: getstatic f/zm0.u20 : J
/*   */     //   118: aload_0
/*   */     //   119: getfield fi0 : J
/*   */     //   122: lsub
/*   */     //   123: dup2
/*   */     //   124: lstore #4
/*   */     //   126: ldc2_w 500
/*   */     //   129: lcmp
/*   */     //   130: ifle -> 161
/*   */     //   133: aload #8
/*   */     //   135: lload #4
/*   */     //   137: ldc2_w 500
/*   */     //   140: lsub
/*   */     //   141: l2f
/*   */     //   142: ldc 1000.0
/*   */     //   144: swap
/*   */     //   145: fsub
/*   */     //   146: ldc 1000.0
/*   */     //   148: fdiv
/*   */     //   149: fconst_1
/*   */     //   150: fmul
/*   */     //   151: fstore #4
/*   */     //   153: fconst_1
/*   */     //   154: fconst_1
/*   */     //   155: fconst_1
/*   */     //   156: fload #4
/*   */     //   158: invokevirtual Bp : (FFFF)V
/*   */     //   161: aload_1
/*   */     //   162: aload_0
/*   */     //   163: dup
/*   */     //   164: dup
/*   */     //   165: getfield y70 : Lf/uT;
/*   */     //   168: getstatic f/Xi.WB : Z
/*   */     //   171: invokevirtual lM : (Z)V
/*   */     //   174: getfield y70 : Lf/uT;
/*   */     //   177: aload_3
/*   */     //   178: dup
/*   */     //   179: getfield H : Lf/eo;
/*   */     //   182: astore_0
/*   */     //   183: getfield nj0 : Lf/eo;
/*   */     //   186: aload_0
/*   */     //   187: swap
/*   */     //   188: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   191: getfield y70 : Lf/uT;
/*   */     //   194: aload_2
/*   */     //   195: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   198: return
/*   */     //   199: aload_1
/*   */     //   200: aload_0
/*   */     //   201: dup
/*   */     //   202: dup2
/*   */     //   203: invokestatic vY : ()Lf/zp0;
/*   */     //   206: iload #7
/*   */     //   208: iconst_2
/*   */     //   209: invokevirtual mF0 : (IB)[Lf/pe0;
/*   */     //   212: iconst_0
/*   */     //   213: aaload
/*   */     //   214: invokestatic AM : (Lf/pe0;)Lf/uT;
/*   */     //   217: dup
/*   */     //   218: aload_0
/*   */     //   219: swap
/*   */     //   220: putfield y70 : Lf/uT;
/*   */     //   223: ldc 0.01275
/*   */     //   225: invokevirtual zO : (F)V
/*   */     //   228: getfield y70 : Lf/uT;
/*   */     //   231: getstatic f/Xi.WB : Z
/*   */     //   234: invokevirtual lM : (Z)V
/*   */     //   237: getfield y70 : Lf/uT;
/*   */     //   240: fload #4
/*   */     //   242: fload #6
/*   */     //   244: fload #5
/*   */     //   246: ldc 0.06
/*   */     //   248: fadd
/*   */     //   249: fstore_0
/*   */     //   250: ldc 0.025
/*   */     //   252: fadd
/*   */     //   253: fload_0
/*   */     //   254: swap
/*   */     //   255: invokevirtual WQ : (FFF)V
/*   */     //   258: getfield y70 : Lf/uT;
/*   */     //   261: aload_3
/*   */     //   262: dup
/*   */     //   263: getfield H : Lf/eo;
/*   */     //   266: astore_0
/*   */     //   267: getfield nj0 : Lf/eo;
/*   */     //   270: aload_0
/*   */     //   271: swap
/*   */     //   272: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   275: getfield y70 : Lf/uT;
/*   */     //   278: aload_2
/*   */     //   279: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   282: goto -> 637
/*   */     //   285: aload_0
/*   */     //   286: iconst_0
/*   */     //   287: istore #8
/*   */     //   289: getfield Lpt5 : B
/*   */     //   292: dup
/*   */     //   293: istore #9
/*   */     //   295: aload_0
/*   */     //   296: getfield rt : B
/*   */     //   299: dup
/*   */     //   300: istore #10
/*   */     //   302: if_icmpne -> 331
/*   */     //   305: iload #10
/*   */     //   307: iconst_1
/*   */     //   308: if_icmpeq -> 325
/*   */     //   311: iload #10
/*   */     //   313: ifne -> 319
/*   */     //   316: goto -> 325
/*   */     //   319: iconst_1
/*   */     //   320: istore #8
/*   */     //   322: goto -> 475
/*   */     //   325: iconst_0
/*   */     //   326: istore #8
/*   */     //   328: goto -> 475
/*   */     //   331: iload #9
/*   */     //   333: tableswitch default -> 364, 0 -> 454, 1 -> 422, 2 -> 396, 3 -> 367
/*   */     //   364: goto -> 475
/*   */     //   367: iload #10
/*   */     //   369: iconst_1
/*   */     //   370: if_icmpne -> 379
/*   */     //   373: iconst_5
/*   */     //   374: istore #8
/*   */     //   376: goto -> 475
/*   */     //   379: iload #10
/*   */     //   381: ifne -> 387
/*   */     //   384: goto -> 440
/*   */     //   387: iload #10
/*   */     //   389: iconst_2
/*   */     //   390: if_icmpne -> 475
/*   */     //   393: goto -> 319
/*   */     //   396: iload #10
/*   */     //   398: iconst_1
/*   */     //   399: if_icmpne -> 405
/*   */     //   402: goto -> 460
/*   */     //   405: iload #10
/*   */     //   407: ifne -> 413
/*   */     //   410: goto -> 428
/*   */     //   413: iload #10
/*   */     //   415: iconst_3
/*   */     //   416: if_icmpne -> 475
/*   */     //   419: goto -> 319
/*   */     //   422: iload #10
/*   */     //   424: iconst_3
/*   */     //   425: if_icmpne -> 434
/*   */     //   428: iconst_2
/*   */     //   429: istore #8
/*   */     //   431: goto -> 475
/*   */     //   434: iload #10
/*   */     //   436: iconst_2
/*   */     //   437: if_icmpne -> 446
/*   */     //   440: iconst_3
/*   */     //   441: istore #8
/*   */     //   443: goto -> 475
/*   */     //   446: iload #10
/*   */     //   448: ifne -> 475
/*   */     //   451: goto -> 325
/*   */     //   454: iload #10
/*   */     //   456: iconst_3
/*   */     //   457: if_icmpne -> 466
/*   */     //   460: iconst_4
/*   */     //   461: istore #8
/*   */     //   463: goto -> 475
/*   */     //   466: iload #10
/*   */     //   468: iconst_2
/*   */     //   469: if_icmpne -> 475
/*   */     //   472: goto -> 373
/*   */     //   475: aload_0
/*   */     //   476: iload #7
/*   */     //   478: iload #8
/*   */     //   480: iadd
/*   */     //   481: istore #7
/*   */     //   483: getfield y70 : Lf/uT;
/*   */     //   486: dup
/*   */     //   487: astore #8
/*   */     //   489: ifnull -> 558
/*   */     //   492: aload_1
/*   */     //   493: aload_0
/*   */     //   494: dup
/*   */     //   495: dup
/*   */     //   496: aload #8
/*   */     //   498: getstatic f/Xi.WB : Z
/*   */     //   501: invokevirtual lM : (Z)V
/*   */     //   504: getfield y70 : Lf/uT;
/*   */     //   507: aload_3
/*   */     //   508: dup
/*   */     //   509: getfield H : Lf/eo;
/*   */     //   512: astore_1
/*   */     //   513: getfield nj0 : Lf/eo;
/*   */     //   516: aload_1
/*   */     //   517: swap
/*   */     //   518: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   521: getfield y70 : Lf/uT;
/*   */     //   524: getstatic f/zm0.u20 : J
/*   */     //   527: aload_0
/*   */     //   528: getfield fi0 : J
/*   */     //   531: lsub
/*   */     //   532: l2f
/*   */     //   533: ldc 750.0
/*   */     //   535: swap
/*   */     //   536: fsub
/*   */     //   537: ldc 750.0
/*   */     //   539: fdiv
/*   */     //   540: fconst_1
/*   */     //   541: fmul
/*   */     //   542: fstore_0
/*   */     //   543: fconst_1
/*   */     //   544: fconst_1
/*   */     //   545: fconst_1
/*   */     //   546: fload_0
/*   */     //   547: invokevirtual Bp : (FFFF)V
/*   */     //   550: getfield y70 : Lf/uT;
/*   */     //   553: aload_2
/*   */     //   554: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   557: return
/*   */     //   558: aload_0
/*   */     //   559: dup
/*   */     //   560: dup
/*   */     //   561: invokestatic vY : ()Lf/zp0;
/*   */     //   564: iload #7
/*   */     //   566: iconst_2
/*   */     //   567: invokevirtual mF0 : (IB)[Lf/pe0;
/*   */     //   570: iconst_0
/*   */     //   571: aaload
/*   */     //   572: astore_1
/*   */     //   573: iconst_1
/*   */     //   574: iconst_1
/*   */     //   575: aload_1
/*   */     //   576: invokestatic xz : (IILf/pe0;)Lf/uT;
/*   */     //   579: dup
/*   */     //   580: aload_0
/*   */     //   581: swap
/*   */     //   582: putfield y70 : Lf/uT;
/*   */     //   585: ldc 0.25
/*   */     //   587: invokevirtual zO : (F)V
/*   */     //   590: getfield y70 : Lf/uT;
/*   */     //   593: getstatic f/Xi.WB : Z
/*   */     //   596: invokevirtual lM : (Z)V
/*   */     //   599: getfield y70 : Lf/uT;
/*   */     //   602: fload #4
/*   */     //   604: fload #6
/*   */     //   606: fload #5
/*   */     //   608: ldc 0.05
/*   */     //   610: fadd
/*   */     //   611: fstore_0
/*   */     //   612: ldc 0.0225
/*   */     //   614: fadd
/*   */     //   615: fload_0
/*   */     //   616: swap
/*   */     //   617: invokevirtual WQ : (FFF)V
/*   */     //   620: getfield y70 : Lf/uT;
/*   */     //   623: aload_3
/*   */     //   624: dup
/*   */     //   625: getfield H : Lf/eo;
/*   */     //   628: astore_0
/*   */     //   629: getfield nj0 : Lf/eo;
/*   */     //   632: aload_0
/*   */     //   633: swap
/*   */     //   634: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   637: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 115
/*   */     //   #2	-> 119
/*   */     //   #3	-> 524
/*   */     //   #4	-> 528
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */