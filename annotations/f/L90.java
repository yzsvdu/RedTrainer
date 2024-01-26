/*  1 */ package f;public final class L90 extends me { public boolean ft0; public ArrayList yu0; public int c90; public int xp; public final boolean HL(byte paramByte, int paramInt1, int paramInt2) { switch (paramByte) { case 3: paramInt1++; break;case 2: paramInt1--; break;case 1: paramInt2--; break;case 0: paramInt2++; break; }  xr0 xr0 = this.im0.v50(paramInt1, paramInt2, 0); vh0 vh0; G5 g5;
/*    */     Jo jo;
/*  3 */     if ((jo = (vh0 = km.a3).Ct) != null && 
/*  4 */       (g5 = jo.HW)
/*  5 */       .mm == paramInt1 && g5
/*  6 */       .Yu0 == paramInt2) return false; 
/*  7 */     return vh0.bk((byte)0, this) ^ true; } public float rT; public yq Xh0; public L90(pI parampI) { super(parampI); lz lz; this.ft0 = false; this.c90 = 27; this.xp = 47; this.rT = 0.0F; this.Xh0 = new yq(); this.yu0 = new ArrayList(); if (parampI.Xg0() == 32) { this(); (new lz()).ak0 = 13; (new lz()).ho0 = 15; (new lz()).YR = 15; (new lz()).Pz = 63; (new lz()).d00 = 1; (new lz()).D10 = new short[] { 52, 53, 155 }; this.yu0.add(this); this(); (new lz()).ak0 = 16; (new lz()).ho0 = 18; (new lz()).YR = 15; (new lz()).Pz = 63; (new lz()).d00 = 0; (new lz()).D10 = new short[] { 52, 53, 155 }; this.yu0.add(this); } else if (parampI.Xg0() == 33) { this(); (new lz()).ak0 = 13; (new lz()).ho0 = 15; (new lz()).YR = 7; (new lz()).Pz = 63; (new lz()).d00 = 1; (new lz()).D10 = new short[] { 52, 53 }; ((L90)super).yu0.add(this); this(); (new lz()).ak0 = 16; (new lz()).ho0 = 18; (new lz()).YR = 7; (new lz()).Pz = 63; (new lz()).d00 = 0; (new lz()).D10 = new short[] { 52, 53 }; ((L90)super).yu0.add(this); } else if (parampI.Xg0() == 34) { this(); (new lz()).ak0 = 11; (new lz()).ho0 = 15; (new lz()).YR = 10; (new lz()).Pz = 63; (new lz()).d00 = 1; (new lz()).D10 = new short[] { 52, 53, 44 }; (new lz()).GJ0 = 6; ((L90)super).yu0.add(this); this(); (new lz()).ak0 = 16; (new lz()).ho0 = 20; (new lz()).YR = 10; (new lz()).Pz = 63; (new lz()).d00 = 0; (new lz()).D10 = new short[] { 52, 53, 44 }; (new lz()).GJ0 = 6; ((L90)super).yu0.add(this); } else if (parampI.Xg0() == 254) { this(); (new lz()).ak0 = 10; (new lz()).ho0 = 14; (new lz()).YR = 24; (new lz()).Pz = 180; (new lz()).d00 = 1; (new lz()).D10 = new short[] { 62 }; (new lz()).GJ0 = 6; nl nl1 = nl.EA0; nl nl2 = nl.BI0; nl nl3 = nl.I30; nl nl4 = nl.d00; ((L90)super).yu0.add(this); this(); this.ak0 = 16; this.ho0 = 20; this.YR = 24; this.Pz = 180; this.d00 = 0; this.D10 = new short[] { 62 }; this.GJ0 = 6; this.Ax0 = nl1; this.B6 = nl2; this.jM = nl3; (lz = new lz()).i1 = nl4; ((L90)super).yu0.add(this); ((L90)super).c90 = 48; ((L90)super).xp = 57; super.jb(); }  } public final void Ic0(float paramFloat) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup2
/*    */     //   3: fload_1
/*    */     //   4: invokespecial Ic0 : (F)V
/*    */     //   7: getfield rT : F
/*    */     //   10: fload_1
/*    */     //   11: fadd
/*    */     //   12: putfield rT : F
/*    */     //   15: getfield yu0 : Ljava/util/ArrayList;
/*    */     //   18: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   21: astore_1
/*    */     //   22: aload_1
/*    */     //   23: invokeinterface hasNext : ()Z
/*    */     //   28: ifeq -> 639
/*    */     //   31: aload_1
/*    */     //   32: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   37: checkcast f/lz
/*    */     //   40: dup
/*    */     //   41: astore_2
/*    */     //   42: getfield Ky0 : Ljava/util/ArrayList;
/*    */     //   45: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   48: astore_3
/*    */     //   49: aload_3
/*    */     //   50: invokeinterface hasNext : ()Z
/*    */     //   55: ifeq -> 22
/*    */     //   58: aload_0
/*    */     //   59: aload_2
/*    */     //   60: aload_3
/*    */     //   61: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   66: checkcast f/Kr0
/*    */     //   69: dup
/*    */     //   70: astore #4
/*    */     //   72: aconst_null
/*    */     //   73: astore #5
/*    */     //   75: getfield HW : Lf/G5;
/*    */     //   78: dup
/*    */     //   79: getfield mm : S
/*    */     //   82: istore #6
/*    */     //   84: getfield Yu0 : S
/*    */     //   87: istore #7
/*    */     //   89: getfield d00 : B
/*    */     //   92: iload #6
/*    */     //   94: iload #7
/*    */     //   96: invokevirtual HL : (BII)Z
/*    */     //   99: ifeq -> 166
/*    */     //   102: aload_0
/*    */     //   103: aload #4
/*    */     //   105: getfield HW : Lf/G5;
/*    */     //   108: dup
/*    */     //   109: getfield mm : S
/*    */     //   112: istore #6
/*    */     //   114: getfield Yu0 : S
/*    */     //   117: istore #7
/*    */     //   119: iconst_m1
/*    */     //   120: iload #6
/*    */     //   122: iload #7
/*    */     //   124: invokevirtual HL : (BII)Z
/*    */     //   127: ifeq -> 166
/*    */     //   130: aload #4
/*    */     //   132: getfield pm : Lf/d7;
/*    */     //   135: getfield n3 : Z
/*    */     //   138: ifne -> 382
/*    */     //   141: aload_2
/*    */     //   142: getfield d00 : B
/*    */     //   145: ifne -> 157
/*    */     //   148: aload_2
/*    */     //   149: getfield B6 : Lf/nl;
/*    */     //   152: astore #5
/*    */     //   154: goto -> 382
/*    */     //   157: aload_2
/*    */     //   158: getfield Ax0 : Lf/nl;
/*    */     //   161: astore #5
/*    */     //   163: goto -> 382
/*    */     //   166: aload #4
/*    */     //   168: getfield pm : Lf/d7;
/*    */     //   171: getfield ew0 : Ljava/util/LinkedList;
/*    */     //   174: invokeinterface isEmpty : ()Z
/*    */     //   179: ifeq -> 382
/*    */     //   182: aload_2
/*    */     //   183: getfield d00 : B
/*    */     //   186: ifne -> 281
/*    */     //   189: aload_0
/*    */     //   190: aload #4
/*    */     //   192: getfield HW : Lf/G5;
/*    */     //   195: dup
/*    */     //   196: getfield mm : S
/*    */     //   199: istore #6
/*    */     //   201: getfield Yu0 : S
/*    */     //   204: istore #7
/*    */     //   206: iconst_3
/*    */     //   207: iload #6
/*    */     //   209: iload #7
/*    */     //   211: invokevirtual HL : (BII)Z
/*    */     //   214: ifeq -> 235
/*    */     //   217: aload #4
/*    */     //   219: getfield HW : Lf/G5;
/*    */     //   222: getfield mm : S
/*    */     //   225: aload_2
/*    */     //   226: getfield ho0 : S
/*    */     //   229: if_icmpgt -> 235
/*    */     //   232: goto -> 376
/*    */     //   235: aload_0
/*    */     //   236: aload #4
/*    */     //   238: getfield HW : Lf/G5;
/*    */     //   241: dup
/*    */     //   242: getfield mm : S
/*    */     //   245: istore #6
/*    */     //   247: getfield Yu0 : S
/*    */     //   250: istore #7
/*    */     //   252: iconst_2
/*    */     //   253: iload #6
/*    */     //   255: iload #7
/*    */     //   257: invokevirtual HL : (BII)Z
/*    */     //   260: ifeq -> 382
/*    */     //   263: aload #4
/*    */     //   265: getfield HW : Lf/G5;
/*    */     //   268: getfield mm : S
/*    */     //   271: aload_2
/*    */     //   272: getfield ak0 : S
/*    */     //   275: if_icmplt -> 382
/*    */     //   278: goto -> 324
/*    */     //   281: aload_0
/*    */     //   282: aload #4
/*    */     //   284: getfield HW : Lf/G5;
/*    */     //   287: dup
/*    */     //   288: getfield mm : S
/*    */     //   291: istore #6
/*    */     //   293: getfield Yu0 : S
/*    */     //   296: istore #7
/*    */     //   298: iconst_2
/*    */     //   299: iload #6
/*    */     //   301: iload #7
/*    */     //   303: invokevirtual HL : (BII)Z
/*    */     //   306: ifeq -> 333
/*    */     //   309: aload #4
/*    */     //   311: getfield HW : Lf/G5;
/*    */     //   314: getfield mm : S
/*    */     //   317: aload_2
/*    */     //   318: getfield ak0 : S
/*    */     //   321: if_icmplt -> 333
/*    */     //   324: aload_2
/*    */     //   325: getfield jM : Lf/nl;
/*    */     //   328: astore #5
/*    */     //   330: goto -> 382
/*    */     //   333: aload_0
/*    */     //   334: aload #4
/*    */     //   336: getfield HW : Lf/G5;
/*    */     //   339: dup
/*    */     //   340: getfield mm : S
/*    */     //   343: istore #6
/*    */     //   345: getfield Yu0 : S
/*    */     //   348: istore #7
/*    */     //   350: iconst_3
/*    */     //   351: iload #6
/*    */     //   353: iload #7
/*    */     //   355: invokevirtual HL : (BII)Z
/*    */     //   358: ifeq -> 382
/*    */     //   361: aload #4
/*    */     //   363: getfield HW : Lf/G5;
/*    */     //   366: getfield mm : S
/*    */     //   369: aload_2
/*    */     //   370: getfield ho0 : S
/*    */     //   373: if_icmpgt -> 382
/*    */     //   376: aload_2
/*    */     //   377: getfield i1 : Lf/nl;
/*    */     //   380: astore #5
/*    */     //   382: aload #5
/*    */     //   384: ifnull -> 404
/*    */     //   387: aload #4
/*    */     //   389: getfield pm : Lf/d7;
/*    */     //   392: iconst_1
/*    */     //   393: anewarray f/nl
/*    */     //   396: dup
/*    */     //   397: iconst_0
/*    */     //   398: aload #5
/*    */     //   400: aastore
/*    */     //   401: invokevirtual Kk : ([Lf/nl;)V
/*    */     //   404: aload #4
/*    */     //   406: getfield pm : Lf/d7;
/*    */     //   409: getfield n3 : Z
/*    */     //   412: ifne -> 49
/*    */     //   415: aload #4
/*    */     //   417: getfield HW : Lf/G5;
/*    */     //   420: dup
/*    */     //   421: astore #5
/*    */     //   423: getfield Yu0 : S
/*    */     //   426: dup
/*    */     //   427: istore #6
/*    */     //   429: aload_2
/*    */     //   430: getfield Pz : S
/*    */     //   433: if_icmplt -> 439
/*    */     //   436: goto -> 448
/*    */     //   439: iload #6
/*    */     //   441: aload_2
/*    */     //   442: getfield YR : S
/*    */     //   445: if_icmpgt -> 487
/*    */     //   448: aload #5
/*    */     //   450: aload_2
/*    */     //   451: dup
/*    */     //   452: dup
/*    */     //   453: getfield ak0 : S
/*    */     //   456: aload_2
/*    */     //   457: getfield ho0 : S
/*    */     //   460: invokestatic A90 : (II)I
/*    */     //   463: i2s
/*    */     //   464: istore #5
/*    */     //   466: invokevirtual Z80 : ()S
/*    */     //   469: istore #6
/*    */     //   471: getfield d00 : B
/*    */     //   474: istore #7
/*    */     //   476: iconst_0
/*    */     //   477: iload #5
/*    */     //   479: iload #6
/*    */     //   481: iconst_0
/*    */     //   482: iload #7
/*    */     //   484: invokevirtual Zh : (ZSSBB)V
/*    */     //   487: aload_0
/*    */     //   488: getfield rT : F
/*    */     //   491: ldc 0.1
/*    */     //   493: fcmpl
/*    */     //   494: ifle -> 49
/*    */     //   497: getstatic f/zm0.u20 : J
/*    */     //   500: aload_0
/*    */     //   501: getfield Xh0 : Lf/yq;
/*    */     //   504: aload #4
/*    */     //   506: getfield Jg : I
/*    */     //   509: invokevirtual Ns0 : (I)J
/*    */     //   512: lsub
/*    */     //   513: ldc2_w 10000
/*    */     //   516: lcmp
/*    */     //   517: ifle -> 49
/*    */     //   520: bipush #20
/*    */     //   522: invokestatic qX : (I)I
/*    */     //   525: ifne -> 49
/*    */     //   528: aload_0
/*    */     //   529: getfield Xh0 : Lf/yq;
/*    */     //   532: dup
/*    */     //   533: astore #5
/*    */     //   535: aload #4
/*    */     //   537: getfield Jg : I
/*    */     //   540: istore #6
/*    */     //   542: getstatic f/zm0.u20 : J
/*    */     //   545: lstore #7
/*    */     //   547: iload #6
/*    */     //   549: invokevirtual KD0 : (I)I
/*    */     //   552: dup
/*    */     //   553: istore #6
/*    */     //   555: iconst_1
/*    */     //   556: istore #9
/*    */     //   558: ifge -> 580
/*    */     //   561: aload #5
/*    */     //   563: iload #6
/*    */     //   565: ineg
/*    */     //   566: iconst_1
/*    */     //   567: isub
/*    */     //   568: istore #6
/*    */     //   570: getfield vU : [J
/*    */     //   573: iload #6
/*    */     //   575: laload
/*    */     //   576: pop2
/*    */     //   577: iconst_0
/*    */     //   578: istore #9
/*    */     //   580: iload #9
/*    */     //   582: aload #5
/*    */     //   584: getfield vU : [J
/*    */     //   587: iload #6
/*    */     //   589: lload #7
/*    */     //   591: lastore
/*    */     //   592: ifeq -> 604
/*    */     //   595: aload #5
/*    */     //   597: dup
/*    */     //   598: getfield z70 : Z
/*    */     //   601: invokevirtual xt0 : (Z)V
/*    */     //   604: getstatic f/km.si0 : Lf/My;
/*    */     //   607: aload #4
/*    */     //   609: getfield Jg : I
/*    */     //   612: getstatic f/F40.wI : Lf/F40;
/*    */     //   615: aload_0
/*    */     //   616: getfield c90 : I
/*    */     //   619: aload_0
/*    */     //   620: getfield xp : I
/*    */     //   623: invokestatic A90 : (II)I
/*    */     //   626: sipush #159
/*    */     //   629: swap
/*    */     //   630: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*    */     //   633: invokevirtual uB : (ILjava/lang/String;)V
/*    */     //   636: goto -> 49
/*    */     //   639: aload_0
/*    */     //   640: getfield rT : F
/*    */     //   643: ldc 0.1
/*    */     //   645: fcmpl
/*    */     //   646: ifle -> 654
/*    */     //   649: aload_0
/*    */     //   650: fconst_0
/*    */     //   651: putfield rT : F
/*    */     //   654: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 75
/*    */     //   #2	-> 79
/*    */     //   #3	-> 84
/*    */     //   #4	-> 89
/*    */     //   #5	-> 105
/*    */     //   #6	-> 109
/*    */     //   #7	-> 114
/*    */     //   #8	-> 124
/*    */     //   #9	-> 132
/*    */     //   #10	-> 135
/*    */     //   #11	-> 142
/*    */     //   #12	-> 168
/*    */     //   #13	-> 171
/*    */     //   #14	-> 174
/*    */     //   #15	-> 183
/*    */     //   #16	-> 192
/*    */     //   #17	-> 196
/*    */     //   #18	-> 201
/*    */     //   #19	-> 211
/*    */     //   #20	-> 219
/*    */     //   #21	-> 222
/*    */     //   #22	-> 226
/*    */     //   #23	-> 238
/*    */     //   #24	-> 242
/*    */     //   #25	-> 247
/*    */     //   #26	-> 257
/*    */     //   #27	-> 265
/*    */     //   #28	-> 268
/*    */     //   #29	-> 272
/*    */     //   #30	-> 284
/*    */     //   #31	-> 288
/*    */     //   #32	-> 293
/*    */     //   #33	-> 303
/*    */     //   #34	-> 311
/*    */     //   #35	-> 314
/*    */     //   #36	-> 318
/*    */     //   #37	-> 336
/*    */     //   #38	-> 340
/*    */     //   #39	-> 345
/*    */     //   #40	-> 355
/*    */     //   #41	-> 363
/*    */     //   #42	-> 366
/*    */     //   #43	-> 370
/*    */     //   #44	-> 389
/*    */     //   #45	-> 393
/*    */     //   #46	-> 406
/*    */     //   #47	-> 409
/*    */     //   #48	-> 417
/*    */     //   #49	-> 423
/*    */     //   #50	-> 430
/*    */     //   #51	-> 497
/*    */     //   #52	-> 501
/*    */     //   #53	-> 506
/*    */     //   #54	-> 509
/*    */     //   #55	-> 537
/*    */     //   #56	-> 542
/*    */     //   #57	-> 549
/*    */     //   #58	-> 570
/*    */     //   #59	-> 604
/*    */     //   #60	-> 609
/*  7 */     //   #61	-> 612 } public final void Ad0(short[] paramArrayOfshort) { if (paramArrayOfshort.length < 1) return;  if (paramArrayOfshort[0] == 308) jb();  } public final void jb() { if (this.ft0) return;  int i; Iterator<lz> iterator; for (i = 1024, this.ft0 = true, iterator = this.yu0.iterator(); iterator.hasNext();) { for (s = (lz = iterator.next()).YR; s <= lz.Pz - 10; ) { G5 g5; dE0 dE0; byte b1 = this.im0.E10; byte b2 = this.im0.cA; byte b3 = this.im0.VZ; short s1 = (short)xi0.A90(lz.ak0, lz.ho0); byte b4 = lz.d00; this(b1, b2, b3, false, s1, s, (byte)0, b4); int j = i++ | Integer.MIN_VALUE; b3 = this.im0.E10; s1 = lz.D10[xi0.qX(lz.D10.length)];
/*  8 */         b4 = lz.d00; this(j, b3, s1, b4, g5); km.a3
/*  9 */           .KO
/* 10 */           .put(Integer.valueOf(j), dE0);
/* 11 */         lz.Ky0.add(dE0); s = (short)(xi0.A90(0, 2) + lz.GJ0 + s); }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/L90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */