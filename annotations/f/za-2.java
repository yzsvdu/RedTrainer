/*  1 */ package f;public final class za { public byte TA0; public lpt1 GJ; public NC0 mo0; public NC0 DY; public NC0 KC; public int Fs; public float prn; private void Zm0(Jo paramJo) { if (++this.Fs > 3) this.Fs = 0;  this.s8 -= 90.0F; zk0 zk01 = paramJo.Ae; this
/*  2 */       .TS
/*    */ 
/*    */       
/*  5 */       .JL(this.pm.cOm3); this.xG0 = this.prn; km.pm0.bL((byte)4, (short)1627); m4(); } public float s8; public NC0 X60; public NC0 T4; public Jo zL; public zk0 or; public eo TS; public float xG0; public za(gC0 paramgC0, byte paramByte) { NC0 nC0; eo eo1; byte b2; this(); this.mo0 = nC0; this(); this.DY = nC0; this.KC = null; this(); this.X60 = nC0; this(); this.T4 = nC0; this.zL = null; this.or = null; this(); this.TS = eo1; this.xG0 = 0.0F; this.TA0 = paramByte; eI eI = eI.Lj(); byte b1 = 4; if (paramByte == 1) { b2 = 121; } else { b2 = 120; }  eI.getClass(); this.GJ = lpt11; lpt1 lpt11; (lpt11 = eI.Yp0(b1, b2, false)).Yr0 = false; paramgC0.kc(lpt11); if (paramByte != 0) { if (paramByte != 1) { if (paramByte == 2) this.mo0.CE(13.0F, 75.0F);  } else { this.mo0.CE(9.0F, 58.0F); this.Fs = 1; float f = -90; this.s8 = f; }  } else { this.mo0.CE(14.0F, 32.0F); }  this.DY.ON(this.mo0); n(); } public final void if0(Jo paramJo, short paramShort1, short paramShort2) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield mo0 : Lf/NC0;
/*    */     //   4: iload_3
/*    */     //   5: iload_2
/*    */     //   6: i2f
/*    */     //   7: fstore #4
/*    */     //   9: i2f
/*    */     //   10: fstore #5
/*    */     //   12: fload #4
/*    */     //   14: fload #5
/*    */     //   16: invokevirtual RM : (FF)Z
/*    */     //   19: ifeq -> 99
/*    */     //   22: aload_0
/*    */     //   23: dup
/*    */     //   24: dup
/*    */     //   25: getfield mo0 : Lf/NC0;
/*    */     //   28: astore #6
/*    */     //   30: getfield Fs : I
/*    */     //   33: aload #6
/*    */     //   35: invokevirtual cA : (ILf/NC0;)Z
/*    */     //   38: ifeq -> 66
/*    */     //   41: aload_0
/*    */     //   42: dup
/*    */     //   43: dup
/*    */     //   44: getfield mo0 : Lf/NC0;
/*    */     //   47: astore #6
/*    */     //   49: getfield Fs : I
/*    */     //   52: iconst_1
/*    */     //   53: iadd
/*    */     //   54: aload #6
/*    */     //   56: invokevirtual cA : (ILf/NC0;)Z
/*    */     //   59: ifeq -> 66
/*    */     //   62: iconst_1
/*    */     //   63: goto -> 67
/*    */     //   66: iconst_0
/*    */     //   67: ifeq -> 87
/*    */     //   70: aload_1
/*    */     //   71: getfield pm : Lf/d7;
/*    */     //   74: aload_0
/*    */     //   75: aload_1
/*    */     //   76: <illegal opcode> run : (Lf/za;Lf/Jo;)Ljava/lang/Runnable;
/*    */     //   81: invokevirtual nZ : (Ljava/lang/Runnable;)V
/*    */     //   84: goto -> 99
/*    */     //   87: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   90: iconst_1
/*    */     //   91: iconst_4
/*    */     //   92: sipush #1628
/*    */     //   95: fconst_0
/*    */     //   96: invokevirtual bA0 : (ZBSF)V
/*    */     //   99: aload_0
/*    */     //   100: getfield X60 : Lf/NC0;
/*    */     //   103: fload #4
/*    */     //   105: fload #5
/*    */     //   107: invokevirtual RM : (FF)Z
/*    */     //   110: ifeq -> 129
/*    */     //   113: aload_1
/*    */     //   114: getfield pm : Lf/d7;
/*    */     //   117: aload_0
/*    */     //   118: aload_1
/*    */     //   119: iload_2
/*    */     //   120: iload_3
/*    */     //   121: <illegal opcode> run : (Lf/za;Lf/Jo;SS)Ljava/lang/Runnable;
/*    */     //   126: invokevirtual nZ : (Ljava/lang/Runnable;)V
/*    */     //   129: aload_0
/*    */     //   130: getfield T4 : Lf/NC0;
/*    */     //   133: fload #4
/*    */     //   135: fload #5
/*    */     //   137: invokevirtual RM : (FF)Z
/*    */     //   140: ifeq -> 159
/*    */     //   143: aload_1
/*    */     //   144: getfield pm : Lf/d7;
/*    */     //   147: aload_0
/*    */     //   148: aload_1
/*    */     //   149: iload_2
/*    */     //   150: iload_3
/*    */     //   151: <illegal opcode> run : (Lf/za;Lf/Jo;SS)Ljava/lang/Runnable;
/*    */     //   156: invokevirtual nZ : (Ljava/lang/Runnable;)V
/*    */     //   159: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 25
/*    */     //   #2	-> 71
/*    */     //   #3	-> 76
/*    */     //   #4	-> 96
/*    */     //   #5	-> 100
/*    */     //   #6	-> 114
/*    */     //   #7	-> 121
/*    */     //   #8	-> 144
/*    */     //   #9	-> 151 } public final void n() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield KC : Lf/NC0;
/*    */     //   4: dup
/*    */     //   5: astore_1
/*    */     //   6: ifnull -> 12
/*    */     //   9: goto -> 17
/*    */     //   12: aload_0
/*    */     //   13: getfield mo0 : Lf/NC0;
/*    */     //   16: astore_1
/*    */     //   17: aload_0
/*    */     //   18: getfield DY : Lf/NC0;
/*    */     //   21: aload_1
/*    */     //   22: invokevirtual UL : (Lf/NC0;)Z
/*    */     //   25: ifne -> 219
/*    */     //   28: aload_0
/*    */     //   29: ldc 10.0
/*    */     //   31: fstore_2
/*    */     //   32: getfield DY : Lf/NC0;
/*    */     //   35: dup
/*    */     //   36: astore_3
/*    */     //   37: getfield y : F
/*    */     //   40: dup
/*    */     //   41: fstore #4
/*    */     //   43: aload_1
/*    */     //   44: getfield y : F
/*    */     //   47: dup
/*    */     //   48: fstore #5
/*    */     //   50: fcmpg
/*    */     //   51: ifge -> 85
/*    */     //   54: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   57: getfield Qy : F
/*    */     //   60: fload_2
/*    */     //   61: fmul
/*    */     //   62: fload #4
/*    */     //   64: fadd
/*    */     //   65: dup
/*    */     //   66: fstore_2
/*    */     //   67: aload_1
/*    */     //   68: aload_3
/*    */     //   69: fload_2
/*    */     //   70: putfield y : F
/*    */     //   73: getfield y : F
/*    */     //   76: dup
/*    */     //   77: fstore_2
/*    */     //   78: fcmpl
/*    */     //   79: iflt -> 219
/*    */     //   82: goto -> 121
/*    */     //   85: fload #4
/*    */     //   87: fload #5
/*    */     //   89: fcmpl
/*    */     //   90: ifle -> 129
/*    */     //   93: fload #4
/*    */     //   95: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   98: getfield Qy : F
/*    */     //   101: fload_2
/*    */     //   102: fmul
/*    */     //   103: fsub
/*    */     //   104: dup
/*    */     //   105: fstore_2
/*    */     //   106: aload_1
/*    */     //   107: aload_3
/*    */     //   108: fload_2
/*    */     //   109: putfield y : F
/*    */     //   112: getfield y : F
/*    */     //   115: dup
/*    */     //   116: fstore_2
/*    */     //   117: fcmpg
/*    */     //   118: ifgt -> 219
/*    */     //   121: aload_3
/*    */     //   122: fload_2
/*    */     //   123: putfield y : F
/*    */     //   126: goto -> 219
/*    */     //   129: aload_3
/*    */     //   130: getfield x : F
/*    */     //   133: dup
/*    */     //   134: fstore #4
/*    */     //   136: aload_1
/*    */     //   137: getfield x : F
/*    */     //   140: dup
/*    */     //   141: fstore #5
/*    */     //   143: fcmpg
/*    */     //   144: ifge -> 178
/*    */     //   147: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   150: getfield Qy : F
/*    */     //   153: fload_2
/*    */     //   154: fmul
/*    */     //   155: fload #4
/*    */     //   157: fadd
/*    */     //   158: dup
/*    */     //   159: fstore_2
/*    */     //   160: aload_1
/*    */     //   161: aload_3
/*    */     //   162: fload_2
/*    */     //   163: putfield x : F
/*    */     //   166: getfield x : F
/*    */     //   169: dup
/*    */     //   170: fstore_2
/*    */     //   171: fcmpl
/*    */     //   172: iflt -> 219
/*    */     //   175: goto -> 214
/*    */     //   178: fload #4
/*    */     //   180: fload #5
/*    */     //   182: fcmpl
/*    */     //   183: ifle -> 219
/*    */     //   186: fload #4
/*    */     //   188: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   191: getfield Qy : F
/*    */     //   194: fload_2
/*    */     //   195: fmul
/*    */     //   196: fsub
/*    */     //   197: dup
/*    */     //   198: fstore_2
/*    */     //   199: aload_1
/*    */     //   200: aload_3
/*    */     //   201: fload_2
/*    */     //   202: putfield x : F
/*    */     //   205: getfield x : F
/*    */     //   208: dup
/*    */     //   209: fstore_2
/*    */     //   210: fcmpg
/*    */     //   211: ifgt -> 219
/*    */     //   214: aload_3
/*    */     //   215: fload_2
/*    */     //   216: putfield x : F
/*    */     //   219: aload_0
/*    */     //   220: getfield DY : Lf/NC0;
/*    */     //   223: aload_1
/*    */     //   224: invokevirtual UL : (Lf/NC0;)Z
/*    */     //   227: ifeq -> 321
/*    */     //   230: aload_0
/*    */     //   231: getfield KC : Lf/NC0;
/*    */     //   234: ifnull -> 245
/*    */     //   237: aload_0
/*    */     //   238: aconst_null
/*    */     //   239: putfield KC : Lf/NC0;
/*    */     //   242: goto -> 321
/*    */     //   245: aload_0
/*    */     //   246: getfield zL : Lf/Jo;
/*    */     //   249: dup
/*    */     //   250: astore_1
/*    */     //   251: ifnull -> 321
/*    */     //   254: aload_0
/*    */     //   255: dup
/*    */     //   256: aload_1
/*    */     //   257: getfield pm : Lf/d7;
/*    */     //   260: dup
/*    */     //   261: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   264: pop
/*    */     //   265: getstatic f/eo.Zero : Lf/eo;
/*    */     //   268: astore_1
/*    */     //   269: aconst_null
/*    */     //   270: iconst_0
/*    */     //   271: aload_1
/*    */     //   272: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   275: getfield zL : Lf/Jo;
/*    */     //   278: getfield Ae : Lf/zk0;
/*    */     //   281: getfield pm : Lf/d7;
/*    */     //   284: dup
/*    */     //   285: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   288: pop
/*    */     //   289: aconst_null
/*    */     //   290: iconst_0
/*    */     //   291: aload_1
/*    */     //   292: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   295: aconst_null
/*    */     //   296: putfield zL : Lf/Jo;
/*    */     //   299: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   302: iconst_4
/*    */     //   303: sipush #1627
/*    */     //   306: invokevirtual RO : (BS)V
/*    */     //   309: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   312: iconst_1
/*    */     //   313: iconst_4
/*    */     //   314: sipush #1628
/*    */     //   317: fconst_0
/*    */     //   318: invokevirtual bA0 : (ZBSF)V
/*    */     //   321: aload_0
/*    */     //   322: getfield prn : F
/*    */     //   325: aload_0
/*    */     //   326: getfield s8 : F
/*    */     //   329: invokestatic JC0 : (FF)Z
/*    */     //   332: ifne -> 527
/*    */     //   335: aload_0
/*    */     //   336: getfield prn : F
/*    */     //   339: dup
/*    */     //   340: fstore_1
/*    */     //   341: aload_0
/*    */     //   342: getfield s8 : F
/*    */     //   345: dup
/*    */     //   346: fstore_2
/*    */     //   347: fcmpg
/*    */     //   348: ifge -> 378
/*    */     //   351: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   354: getfield Qy : F
/*    */     //   357: ldc_w 180.0
/*    */     //   360: fmul
/*    */     //   361: fload_1
/*    */     //   362: fadd
/*    */     //   363: dup
/*    */     //   364: fstore_1
/*    */     //   365: fload_2
/*    */     //   366: aload_0
/*    */     //   367: fload_1
/*    */     //   368: putfield prn : F
/*    */     //   371: fcmpl
/*    */     //   372: iflt -> 407
/*    */     //   375: goto -> 402
/*    */     //   378: fload_1
/*    */     //   379: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   382: getfield Qy : F
/*    */     //   385: ldc_w 180.0
/*    */     //   388: fmul
/*    */     //   389: fsub
/*    */     //   390: dup
/*    */     //   391: fstore_1
/*    */     //   392: fload_2
/*    */     //   393: aload_0
/*    */     //   394: fload_1
/*    */     //   395: putfield prn : F
/*    */     //   398: fcmpg
/*    */     //   399: ifgt -> 407
/*    */     //   402: aload_0
/*    */     //   403: fload_2
/*    */     //   404: putfield prn : F
/*    */     //   407: aload_0
/*    */     //   408: new f/eo
/*    */     //   411: dup
/*    */     //   412: dup
/*    */     //   413: dup2
/*    */     //   414: dup2
/*    */     //   415: astore_1
/*    */     //   416: aload_0
/*    */     //   417: aload_1
/*    */     //   418: aload_0
/*    */     //   419: aload_1
/*    */     //   420: invokespecial <init> : ()V
/*    */     //   423: getfield GJ : Lf/lpt1;
/*    */     //   426: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   429: aload_1
/*    */     //   430: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   433: pop
/*    */     //   434: ldc_w 4.0
/*    */     //   437: invokevirtual uu : (F)Lf/eo;
/*    */     //   440: pop
/*    */     //   441: getfield TS : Lf/eo;
/*    */     //   444: dup
/*    */     //   445: dup
/*    */     //   446: getfield x : F
/*    */     //   449: fstore_2
/*    */     //   450: getfield z : F
/*    */     //   453: fstore_3
/*    */     //   454: getfield y : F
/*    */     //   457: fstore #4
/*    */     //   459: fload_2
/*    */     //   460: fload_3
/*    */     //   461: fload #4
/*    */     //   463: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   466: ldc_w -0.25
/*    */     //   469: invokevirtual uu : (F)Lf/eo;
/*    */     //   472: pop
/*    */     //   473: new f/eo
/*    */     //   476: dup
/*    */     //   477: astore_2
/*    */     //   478: fconst_0
/*    */     //   479: fconst_0
/*    */     //   480: fconst_1
/*    */     //   481: invokespecial <init> : (FFF)V
/*    */     //   484: getfield y : F
/*    */     //   487: fstore_3
/*    */     //   488: getfield z : F
/*    */     //   491: putfield y : F
/*    */     //   494: fload_3
/*    */     //   495: putfield z : F
/*    */     //   498: aload_2
/*    */     //   499: aload_0
/*    */     //   500: getfield prn : F
/*    */     //   503: aload_0
/*    */     //   504: getfield xG0 : F
/*    */     //   507: fsub
/*    */     //   508: fneg
/*    */     //   509: invokevirtual vS : (Lf/eo;F)V
/*    */     //   512: getfield or : Lf/zk0;
/*    */     //   515: getfield pm : Lf/d7;
/*    */     //   518: aload_0
/*    */     //   519: getfield GJ : Lf/lpt1;
/*    */     //   522: iconst_0
/*    */     //   523: aload_1
/*    */     //   524: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   527: aload_0
/*    */     //   528: getfield prn : F
/*    */     //   531: aload_0
/*    */     //   532: getfield s8 : F
/*    */     //   535: invokestatic JC0 : (FF)Z
/*    */     //   538: ifeq -> 724
/*    */     //   541: aload_0
/*    */     //   542: getfield or : Lf/zk0;
/*    */     //   545: dup
/*    */     //   546: astore_1
/*    */     //   547: ifnull -> 724
/*    */     //   550: aload_1
/*    */     //   551: dup
/*    */     //   552: getfield pm : Lf/d7;
/*    */     //   555: getfield zF : Lf/eo;
/*    */     //   558: astore_1
/*    */     //   559: iconst_0
/*    */     //   560: istore_2
/*    */     //   561: getfield HW : Lf/G5;
/*    */     //   564: dup
/*    */     //   565: astore_3
/*    */     //   566: getfield g50 : B
/*    */     //   569: tableswitch default -> 600, 0 -> 618, 1 -> 613, 2 -> 608, 3 -> 603
/*    */     //   600: goto -> 620
/*    */     //   603: iconst_0
/*    */     //   604: istore_2
/*    */     //   605: goto -> 620
/*    */     //   608: iconst_1
/*    */     //   609: istore_2
/*    */     //   610: goto -> 620
/*    */     //   613: iconst_3
/*    */     //   614: istore_2
/*    */     //   615: goto -> 620
/*    */     //   618: iconst_2
/*    */     //   619: istore_2
/*    */     //   620: aload_0
/*    */     //   621: dup
/*    */     //   622: aload_3
/*    */     //   623: aload_1
/*    */     //   624: aload_0
/*    */     //   625: aload_1
/*    */     //   626: aload_0
/*    */     //   627: getfield DY : Lf/NC0;
/*    */     //   630: getfield x : F
/*    */     //   633: fstore_1
/*    */     //   634: getfield x : F
/*    */     //   637: ldc_w 4.0
/*    */     //   640: fmul
/*    */     //   641: fload_1
/*    */     //   642: fadd
/*    */     //   643: invokestatic round : (F)I
/*    */     //   646: i2s
/*    */     //   647: istore_1
/*    */     //   648: getfield DY : Lf/NC0;
/*    */     //   651: getfield y : F
/*    */     //   654: fstore_3
/*    */     //   655: getfield y : F
/*    */     //   658: ldc_w 4.0
/*    */     //   661: fmul
/*    */     //   662: fload_3
/*    */     //   663: fadd
/*    */     //   664: invokestatic round : (F)I
/*    */     //   667: i2s
/*    */     //   668: istore_3
/*    */     //   669: iconst_0
/*    */     //   670: iload_1
/*    */     //   671: iload_3
/*    */     //   672: iconst_0
/*    */     //   673: iload_2
/*    */     //   674: invokevirtual Zh : (ZSSBB)V
/*    */     //   677: getfield or : Lf/zk0;
/*    */     //   680: getfield pm : Lf/d7;
/*    */     //   683: dup
/*    */     //   684: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   687: pop
/*    */     //   688: getstatic f/eo.Zero : Lf/eo;
/*    */     //   691: astore_1
/*    */     //   692: aconst_null
/*    */     //   693: iconst_0
/*    */     //   694: aload_1
/*    */     //   695: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   698: aconst_null
/*    */     //   699: putfield or : Lf/zk0;
/*    */     //   702: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   705: iconst_4
/*    */     //   706: sipush #1627
/*    */     //   709: invokevirtual RO : (BS)V
/*    */     //   712: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   715: iconst_1
/*    */     //   716: iconst_4
/*    */     //   717: sipush #1628
/*    */     //   720: fconst_0
/*    */     //   721: invokevirtual bA0 : (ZBSF)V
/*    */     //   724: aload_0
/*    */     //   725: dup
/*    */     //   726: dup2
/*    */     //   727: dup2
/*    */     //   728: getfield X60 : Lf/NC0;
/*    */     //   731: aload_0
/*    */     //   732: getfield mo0 : Lf/NC0;
/*    */     //   735: invokevirtual ON : (Lf/NC0;)Lf/NC0;
/*    */     //   738: dup
/*    */     //   739: dup2
/*    */     //   740: ldc_w -1.0
/*    */     //   743: fstore_1
/*    */     //   744: fconst_0
/*    */     //   745: fstore_2
/*    */     //   746: getfield x : F
/*    */     //   749: fload_1
/*    */     //   750: fadd
/*    */     //   751: putfield x : F
/*    */     //   754: getfield y : F
/*    */     //   757: fload_2
/*    */     //   758: fadd
/*    */     //   759: putfield y : F
/*    */     //   762: getfield X60 : Lf/NC0;
/*    */     //   765: dup
/*    */     //   766: dup
/*    */     //   767: dup2
/*    */     //   768: aload_0
/*    */     //   769: dup
/*    */     //   770: getfield mo0 : Lf/NC0;
/*    */     //   773: astore_1
/*    */     //   774: getfield Fs : I
/*    */     //   777: bipush #90
/*    */     //   779: imul
/*    */     //   780: i2f
/*    */     //   781: fstore_2
/*    */     //   782: getfield x : F
/*    */     //   785: aload_1
/*    */     //   786: getfield x : F
/*    */     //   789: fsub
/*    */     //   790: putfield x : F
/*    */     //   793: getfield y : F
/*    */     //   796: aload_1
/*    */     //   797: getfield y : F
/*    */     //   800: fsub
/*    */     //   801: putfield y : F
/*    */     //   804: fload_2
/*    */     //   805: invokevirtual Nr : (F)Lf/NC0;
/*    */     //   808: aload_1
/*    */     //   809: invokevirtual f80 : (Lf/NC0;)Lf/NC0;
/*    */     //   812: pop
/*    */     //   813: getfield T4 : Lf/NC0;
/*    */     //   816: aload_0
/*    */     //   817: getfield mo0 : Lf/NC0;
/*    */     //   820: invokevirtual ON : (Lf/NC0;)Lf/NC0;
/*    */     //   823: dup
/*    */     //   824: dup2
/*    */     //   825: fconst_1
/*    */     //   826: fstore_1
/*    */     //   827: fconst_0
/*    */     //   828: fstore_2
/*    */     //   829: getfield x : F
/*    */     //   832: fload_1
/*    */     //   833: fadd
/*    */     //   834: putfield x : F
/*    */     //   837: getfield y : F
/*    */     //   840: fload_2
/*    */     //   841: fadd
/*    */     //   842: putfield y : F
/*    */     //   845: getfield T4 : Lf/NC0;
/*    */     //   848: dup
/*    */     //   849: dup
/*    */     //   850: dup2
/*    */     //   851: aload_0
/*    */     //   852: dup
/*    */     //   853: getfield mo0 : Lf/NC0;
/*    */     //   856: astore_1
/*    */     //   857: getfield Fs : I
/*    */     //   860: bipush #90
/*    */     //   862: imul
/*    */     //   863: i2f
/*    */     //   864: fstore_2
/*    */     //   865: getfield x : F
/*    */     //   868: aload_1
/*    */     //   869: getfield x : F
/*    */     //   872: fsub
/*    */     //   873: putfield x : F
/*    */     //   876: getfield y : F
/*    */     //   879: aload_1
/*    */     //   880: getfield y : F
/*    */     //   883: fsub
/*    */     //   884: putfield y : F
/*    */     //   887: fload_2
/*    */     //   888: invokevirtual Nr : (F)Lf/NC0;
/*    */     //   891: aload_1
/*    */     //   892: invokevirtual f80 : (Lf/NC0;)Lf/NC0;
/*    */     //   895: pop
/*    */     //   896: getfield GJ : Lf/lpt1;
/*    */     //   899: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   902: aload_0
/*    */     //   903: getstatic f/eo.Y : Lf/eo;
/*    */     //   906: astore_1
/*    */     //   907: getfield prn : F
/*    */     //   910: aload_1
/*    */     //   911: swap
/*    */     //   912: invokevirtual Rn0 : (Lf/eo;F)V
/*    */     //   915: getfield GJ : Lf/lpt1;
/*    */     //   918: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   921: aload_0
/*    */     //   922: getfield DY : Lf/NC0;
/*    */     //   925: dup
/*    */     //   926: astore_0
/*    */     //   927: getfield x : F
/*    */     //   930: ldc_w 0.5
/*    */     //   933: fadd
/*    */     //   934: ldc_w 0.25
/*    */     //   937: fmul
/*    */     //   938: aload_0
/*    */     //   939: getfield y : F
/*    */     //   942: ldc_w 0.5
/*    */     //   945: fadd
/*    */     //   946: ldc_w 0.25
/*    */     //   949: fmul
/*    */     //   950: ldc_w 0.75
/*    */     //   953: swap
/*    */     //   954: invokevirtual bb0 : (FFF)V
/*    */     //   957: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 57
/*    */     //   #2	-> 70
/*    */     //   #3	-> 98
/*    */     //   #4	-> 109
/*    */     //   #5	-> 150
/*    */     //   #6	-> 163
/*    */     //   #7	-> 191
/*    */     //   #8	-> 202
/*    */     //   #9	-> 257
/*    */     //   #10	-> 261
/*    */     //   #11	-> 265
/*    */     //   #12	-> 275
/*    */     //   #13	-> 278
/*    */     //   #14	-> 281
/*    */     //   #15	-> 285
/*    */     //   #16	-> 292
/*    */     //   #17	-> 296
/*    */     //   #18	-> 318
/*    */     //   #19	-> 322
/*    */     //   #20	-> 354
/*    */     //   #21	-> 368
/*    */     //   #22	-> 382
/*    */     //   #23	-> 395
/*    */     //   #24	-> 515
/*    */     //   #25	-> 519
/*    */     //   #26	-> 552
/*    */     //   #27	-> 555
/*    */     //   #28	-> 561
/*    */     //   #29	-> 566
/*    */     //   #30	-> 627
/*    */     //   #31	-> 680
/*    */     //   #32	-> 684
/*    */     //   #33	-> 688
/*    */     //   #34	-> 699
/*    */     //   #35	-> 721
/*    */     //   #36	-> 728
/*    */     //   #37	-> 746
/*    */     //   #38	-> 762
/*    */     //   #39	-> 782
/*    */     //   #40	-> 786
/*    */     //   #41	-> 805
/*    */     //   #42	-> 813
/*    */     //   #43	-> 829
/*    */     //   #44	-> 845
/*    */     //   #45	-> 865
/*    */     //   #46	-> 869
/*    */     //   #47	-> 888
/*  5 */     //   #48	-> 896 } public final boolean cA(int paramInt, NC0 paramNC0) { if (paramInt > 3) paramInt = 0;  this(); NC0 nC0; short[][] arrayOfShort; if (this.TA0 == 1) { arrayOfShort = gC0.Mo0; } else { arrayOfShort = gC0.xr; }  int i; byte b; for (i = arrayOfShort.length, b = 0; b < i; ) { short[] arrayOfShort1 = arrayOfShort[b]; float f2 = paramNC0.x; float f1 = arrayOfShort1[0]; f2 = arrayOfShort1[1]; nC0.x = f1 = f2 + f1; nC0.y = f2 = paramNC0.y + f2; if (paramInt != 0) { f1 = (paramInt * 90); nC0.x = f1 - paramNC0.x; nC0.y = f2 - paramNC0.y; nC0.Nr(f1).f80(paramNC0); }
/*    */ 
/*    */       
/*    */       xr0 xr0;
/*  9 */       if ((xr0 = this.OA.im0.v50(Math.round(nC0.x), Math.round(nC0.y), 0)) == null || xr0
/* 10 */         .OB0() != 44) return false;  b++; }  return true; } public final void Ep(Jo paramJo, short paramShort1, short paramShort2, boolean paramBoolean) { if (this.TA0 == 1) { b1 = 4; } else { b1 = 5; }  int i = 0; this(); byte b; byte b1; eo eo2; NC0 nC03; label61: while (i < b1) { NC0 nC04; float f; NC0 nC06; short[] arrayOfShort1, arrayOfShort2; int j = i + 1; this(); if (paramBoolean) { f = -j; } else { f = j; }  nC04.x = f; nC04.y = 0.0F; nC04.Nr((this.Fs * 90)); nC04.x = Math.round(nC04.x); nC04.y = Math.round(nC04.y); NC0 nC05; (nC05 = this.mo0).getClass(); nC05 = (new NC0(nC05)).f80(nC04); int k; if ((k = this.Fs) > 3)
/*    */         k = 0;  this(); byte b2; if ((b2 = this.TA0) == 1) { arrayOfShort2 = gC0.nt[0]; } else { arrayOfShort2 = gC0.hE[0]; }  if (b2 == 1) { arrayOfShort1 = gC0.nt[1]; } else { arrayOfShort1 = gC0.hE[1]; }
/*    */        for (short s = arrayOfShort2[0]; s <= arrayOfShort1[0]; ) { for (short s1 = arrayOfShort2[1]; s1 <= arrayOfShort1[1]; ) { float f7 = nC05.x; f7 = s; float f8 = s1; nC06.x = f7 += f7; nC06.y = f8 = nC05.y + f8; if (k != 0) { f7 = (k * 90); nC06.x = f7 - nC05.x; nC06.y = f8 - nC05.y; nC06.Nr(f7).f80(nC05); }
/* 13 */            xr0 xr0; if ((xr0 = this.OA.im0.v50(Math.round(nC06.x), Math.round(nC06.y), 0)) == null || xr0
/* 14 */             .OB0() != 44) { if (false) break label61;  nC03 = nC04; i = j; continue; }  s1++; }  s++; }  continue; }  if (i < 1)
/* 15 */       return;  NC0 nC02; (nC02 = this.mo0).getClass();
/*    */     
/* 17 */     nC02 = (new NC0(nC02)).f80(nC03); float f1; NC0 nC01; float f2 = (f1 = paramShort1) - (nC01 = this.mo0).x, f3 = paramShort2; eo eo1 = (new eo(f2, f3 - nC01.y, 0.0F)).uu(0.25F);
/*    */ 
/*    */ 
/*    */     
/* 21 */     this(paramJo.Ae.pm.cOm3); this(); this.GJ.mh.on0(eo3); eo3.uu(4.0F); float f4 = eo2.x, f5 = eo2.z, f6 = eo2.y; eo eo3; (eo3 = new eo()).uD(f4, f5, f6).uu(-0.25F); f4 = (new eo()).y; (new eo()).y = f5 = (new eo()).z; (new eo()).z = f4;
/* 22 */     (new eo()).TG0((new eo()).x, f5, f4);
/* 23 */     this.zL = paramJo;
/* 24 */     paramJo.pm
/* 25 */       .KC(this.GJ, false, eo1);
/* 26 */     paramJo.Ae
/* 27 */       .pm
/* 28 */       .KC(this.GJ, false, eo2); if ((b1 == i)) { nC0.getClass(); nC0
/* 29 */         .x = nC02.x; NC0 nC0; (nC0 = this.mo0).y = nC02.y;
/*    */       
/* 31 */       short s3 = (short)(int)(f1 + nC03.x), s4 = (short)(int)(f3 + nC03.y);
/*    */       
/* 33 */       b = this.zL.HW.g50;
/* 34 */       paramJo.HW.Zh(false, s3, s4, (byte)0, b);
/*    */ 
/*    */       
/* 37 */       float f7 = this.mo0.x; short s1 = (short)Math.round(eo2.x * 4.0F + f7); float f8 = this.mo0.y; short s2 = (short)Math.round(eo2.y * 4.0F + f8);
/*    */ 
/*    */       
/* 40 */       s4 = paramJo.Ae.HW.g50;
/* 41 */       paramJo.Ae.HW.Zh(false, s1, s2, (byte)0, s4); } else { this.KC = b; }  km.pm0.bL((byte)4, (short)1627); m4(); }
/*    */ 
/*    */   
/*    */   public final void m4() {
/*    */     km.u4.hB0 = ((paramBoolean, paramInt) -> {
/*    */         vh0 vh0;
/*    */         if ((vh0 = km.a3) == null || vh0.Jr0() == null || km.a3.Jr0().Xg0() != this.OA.h20())
/*    */           return false; 
/*    */         if (!nx0.JC0(this.prn, this.s8) || !this.DY.UL(this.mo0) || this.KC != null)
/*    */           return true; 
/*    */       });
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */