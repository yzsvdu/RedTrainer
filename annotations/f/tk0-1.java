/*   */ package f;public final class tk0 implements Runnable { private void Km(short paramShort) {
/* 2 */     short s = this.UD0.Y.iq0();
/* 3 */     km.u4.e20
/* 4 */       .W3(new BK0((byte)0, s, paramShort));
/*   */   }
/*   */   
/*   */   public tk0(hI0 paramhI0) {}
/*   */   
/*   */   public final void run() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield UD0 : Lf/hI0;
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: getfield Y : Lf/i;
/*   */     //   9: ifnonnull -> 13
/*   */     //   12: return
/*   */     //   13: aload_1
/*   */     //   14: dup
/*   */     //   15: getfield T70 : Lf/rh;
/*   */     //   18: getfield T8 : I
/*   */     //   21: i2s
/*   */     //   22: istore_1
/*   */     //   23: getfield QA : Lf/Vq0;
/*   */     //   26: invokevirtual nv0 : ()I
/*   */     //   29: ifne -> 469
/*   */     //   32: aload_0
/*   */     //   33: getfield UD0 : Lf/hI0;
/*   */     //   36: dup
/*   */     //   37: astore_2
/*   */     //   38: getfield Y : Lf/i;
/*   */     //   41: dup
/*   */     //   42: astore_3
/*   */     //   43: getfield BC : Lf/LPT3;
/*   */     //   46: dup
/*   */     //   47: astore #4
/*   */     //   49: ifnull -> 100
/*   */     //   52: aload #4
/*   */     //   54: getfield c3 : Lf/wc;
/*   */     //   57: ifnull -> 100
/*   */     //   60: aload_2
/*   */     //   61: new f/Xo
/*   */     //   64: dup
/*   */     //   65: astore_1
/*   */     //   66: aload_0
/*   */     //   67: getfield UD0 : Lf/hI0;
/*   */     //   70: getfield Y : Lf/i;
/*   */     //   73: invokespecial <init> : (Lf/i;)V
/*   */     //   76: getfield qV : Lf/Xo;
/*   */     //   79: ifnonnull -> 516
/*   */     //   82: aload_2
/*   */     //   83: dup
/*   */     //   84: dup
/*   */     //   85: aload_1
/*   */     //   86: putfield qV : Lf/Xo;
/*   */     //   89: invokevirtual Ub : ()I
/*   */     //   92: aload_1
/*   */     //   93: swap
/*   */     //   94: invokevirtual si : (Lf/JG0;I)V
/*   */     //   97: goto -> 516
/*   */     //   100: aload_3
/*   */     //   101: getfield Lc0 : Lf/Ud0;
/*   */     //   104: dup
/*   */     //   105: astore_2
/*   */     //   106: getstatic f/Ud0.GA : Lf/Ud0;
/*   */     //   109: if_acmpne -> 230
/*   */     //   112: aload_3
/*   */     //   113: getfield wS : Ljava/util/ArrayList;
/*   */     //   116: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   119: astore_2
/*   */     //   120: aload_2
/*   */     //   121: invokeinterface hasNext : ()Z
/*   */     //   126: ifeq -> 350
/*   */     //   129: aload_2
/*   */     //   130: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   135: checkcast f/S3
/*   */     //   138: dup
/*   */     //   139: astore_3
/*   */     //   140: getfield cO : S
/*   */     //   143: iload_1
/*   */     //   144: imul
/*   */     //   145: dup
/*   */     //   146: istore #4
/*   */     //   148: i2l
/*   */     //   149: iload #4
/*   */     //   151: i2s
/*   */     //   152: dup
/*   */     //   153: istore #4
/*   */     //   155: i2l
/*   */     //   156: lcmp
/*   */     //   157: ifeq -> 183
/*   */     //   160: getstatic f/km.u4 : Lf/R8;
/*   */     //   163: aload_0
/*   */     //   164: getfield UD0 : Lf/hI0;
/*   */     //   167: getfield Y : Lf/i;
/*   */     //   170: getfield Lc0 : Lf/Ud0;
/*   */     //   173: getfield uP : I
/*   */     //   176: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   179: invokevirtual Pq : (Ljava/lang/String;)V
/*   */     //   182: return
/*   */     //   183: getstatic f/km.u4 : Lf/R8;
/*   */     //   186: dup
/*   */     //   187: getfield jG0 : Lf/yM;
/*   */     //   190: invokevirtual gN : (Lf/yM;)Lf/zr0;
/*   */     //   193: aload_3
/*   */     //   194: getfield Oz0 : S
/*   */     //   197: iconst_m1
/*   */     //   198: swap
/*   */     //   199: iload #4
/*   */     //   201: invokevirtual vH0 : (BSS)Z
/*   */     //   204: ifne -> 120
/*   */     //   207: getstatic f/km.u4 : Lf/R8;
/*   */     //   210: aload_0
/*   */     //   211: getfield UD0 : Lf/hI0;
/*   */     //   214: getfield Y : Lf/i;
/*   */     //   217: getfield Lc0 : Lf/Ud0;
/*   */     //   220: getfield uP : I
/*   */     //   223: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   226: invokevirtual Pq : (Ljava/lang/String;)V
/*   */     //   229: return
/*   */     //   230: getstatic f/km.u4 : Lf/R8;
/*   */     //   233: dup
/*   */     //   234: astore_3
/*   */     //   235: ifnull -> 309
/*   */     //   238: aload_3
/*   */     //   239: getfield Lz : Lf/fH0;
/*   */     //   242: ifnonnull -> 248
/*   */     //   245: goto -> 309
/*   */     //   248: aload_2
/*   */     //   249: invokevirtual ordinal : ()I
/*   */     //   252: dup
/*   */     //   253: istore_2
/*   */     //   254: ifeq -> 296
/*   */     //   257: iload_2
/*   */     //   258: iconst_1
/*   */     //   259: if_icmpeq -> 283
/*   */     //   262: iload_2
/*   */     //   263: iconst_2
/*   */     //   264: if_icmpeq -> 270
/*   */     //   267: goto -> 309
/*   */     //   270: getstatic f/km.u4 : Lf/R8;
/*   */     //   273: getfield Lz : Lf/fH0;
/*   */     //   276: getfield NC0 : I
/*   */     //   279: istore_2
/*   */     //   280: goto -> 311
/*   */     //   283: getstatic f/km.u4 : Lf/R8;
/*   */     //   286: getfield Lz : Lf/fH0;
/*   */     //   289: getfield aY : S
/*   */     //   292: istore_2
/*   */     //   293: goto -> 311
/*   */     //   296: getstatic f/km.u4 : Lf/R8;
/*   */     //   299: getfield Lz : Lf/fH0;
/*   */     //   302: getfield Ii : I
/*   */     //   305: istore_2
/*   */     //   306: goto -> 311
/*   */     //   309: iconst_0
/*   */     //   310: istore_2
/*   */     //   311: iload_2
/*   */     //   312: aload_0
/*   */     //   313: getfield UD0 : Lf/hI0;
/*   */     //   316: getfield Y : Lf/i;
/*   */     //   319: invokevirtual SK0 : ()I
/*   */     //   322: iload_1
/*   */     //   323: imul
/*   */     //   324: if_icmpge -> 350
/*   */     //   327: getstatic f/km.u4 : Lf/R8;
/*   */     //   330: aload_0
/*   */     //   331: getfield UD0 : Lf/hI0;
/*   */     //   334: getfield Y : Lf/i;
/*   */     //   337: getfield Lc0 : Lf/Ud0;
/*   */     //   340: getfield uP : I
/*   */     //   343: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   346: invokevirtual Pq : (Ljava/lang/String;)V
/*   */     //   349: return
/*   */     //   350: iload_1
/*   */     //   351: bipush #99
/*   */     //   353: if_icmple -> 425
/*   */     //   356: getstatic f/js.vu0 : Lf/js;
/*   */     //   359: new f/h70
/*   */     //   362: dup
/*   */     //   363: aload_0
/*   */     //   364: iload_1
/*   */     //   365: iconst_2
/*   */     //   366: anewarray java/lang/String
/*   */     //   369: dup
/*   */     //   370: astore_2
/*   */     //   371: aload_0
/*   */     //   372: aload_2
/*   */     //   373: iload_1
/*   */     //   374: invokestatic valueOf : (I)Ljava/lang/String;
/*   */     //   377: iconst_0
/*   */     //   378: swap
/*   */     //   379: aastore
/*   */     //   380: getfield UD0 : Lf/hI0;
/*   */     //   383: getfield Y : Lf/i;
/*   */     //   386: invokevirtual WQ : ()Ljava/lang/String;
/*   */     //   389: iconst_1
/*   */     //   390: swap
/*   */     //   391: aastore
/*   */     //   392: sipush #1938
/*   */     //   395: aload_2
/*   */     //   396: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   399: astore_1
/*   */     //   400: <illegal opcode> run : (Lf/tk0;S)Ljava/lang/Runnable;
/*   */     //   405: astore_2
/*   */     //   406: aload_1
/*   */     //   407: aload_0
/*   */     //   408: getfield UD0 : Lf/hI0;
/*   */     //   411: getfield kK : Lf/Un;
/*   */     //   414: aload_2
/*   */     //   415: swap
/*   */     //   416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Lf/JG0;)V
/*   */     //   419: invokevirtual uh : (Lf/h70;)V
/*   */     //   422: goto -> 455
/*   */     //   425: getstatic f/km.u4 : Lf/R8;
/*   */     //   428: aload_0
/*   */     //   429: getfield UD0 : Lf/hI0;
/*   */     //   432: getfield Y : Lf/i;
/*   */     //   435: invokevirtual iq0 : ()S
/*   */     //   438: istore_2
/*   */     //   439: getfield e20 : Lf/c4;
/*   */     //   442: new f/BK0
/*   */     //   445: dup
/*   */     //   446: iconst_0
/*   */     //   447: iload_2
/*   */     //   448: iload_1
/*   */     //   449: invokespecial <init> : (BSS)V
/*   */     //   452: invokevirtual W3 : (Lf/Bi;)V
/*   */     //   455: aload_0
/*   */     //   456: getfield UD0 : Lf/hI0;
/*   */     //   459: getfield T70 : Lf/rh;
/*   */     //   462: iconst_1
/*   */     //   463: invokevirtual l4 : (I)V
/*   */     //   466: goto -> 516
/*   */     //   469: aload_0
/*   */     //   470: dup
/*   */     //   471: getstatic f/km.u4 : Lf/R8;
/*   */     //   474: aload_0
/*   */     //   475: getfield UD0 : Lf/hI0;
/*   */     //   478: getfield Y : Lf/i;
/*   */     //   481: invokevirtual Vy0 : ()I
/*   */     //   484: istore_0
/*   */     //   485: getfield e20 : Lf/c4;
/*   */     //   488: new f/sE0
/*   */     //   491: dup
/*   */     //   492: iload_0
/*   */     //   493: iload_1
/*   */     //   494: invokespecial <init> : (IS)V
/*   */     //   497: invokevirtual W3 : (Lf/Bi;)V
/*   */     //   500: getfield UD0 : Lf/hI0;
/*   */     //   503: getfield kK : Lf/Un;
/*   */     //   506: invokevirtual xI0 : ()V
/*   */     //   509: getfield UD0 : Lf/hI0;
/*   */     //   512: aconst_null
/*   */     //   513: invokevirtual xl : (Lf/i;)V
/*   */     //   516: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */     //   #2	-> 15
/*   */     //   #3	-> 18
/*   */     //   #4	-> 23
/*   */     //   #5	-> 26
/*   */     //   #6	-> 38
/*   */     //   #7	-> 43
/*   */     //   #8	-> 54
/*   */     //   #9	-> 61
/*   */     //   #10	-> 70
/*   */     //   #11	-> 73
/*   */     //   #12	-> 76
/*   */     //   #13	-> 86
/*   */     //   #14	-> 89
/*   */     //   #15	-> 101
/*   */     //   #16	-> 106
/*   */     //   #17	-> 113
/*   */     //   #18	-> 116
/*   */     //   #19	-> 140
/*   */     //   #20	-> 160
/*   */     //   #21	-> 167
/*   */     //   #22	-> 170
/*   */     //   #23	-> 173
/*   */     //   #24	-> 176
/*   */     //   #25	-> 187
/*   */     //   #26	-> 190
/*   */     //   #27	-> 194
/*   */     //   #28	-> 201
/*   */     //   #29	-> 207
/*   */     //   #30	-> 214
/*   */     //   #31	-> 217
/*   */     //   #32	-> 220
/*   */     //   #33	-> 223
/*   */     //   #34	-> 230
/*   */     //   #35	-> 239
/*   */     //   #36	-> 249
/*   */     //   #37	-> 273
/*   */     //   #38	-> 276
/*   */     //   #39	-> 283
/*   */     //   #40	-> 286
/*   */     //   #41	-> 289
/*   */     //   #42	-> 296
/*   */     //   #43	-> 299
/*   */     //   #44	-> 302
/*   */     //   #45	-> 313
/*   */     //   #46	-> 316
/*   */     //   #47	-> 319
/*   */     //   #48	-> 334
/*   */     //   #49	-> 337
/*   */     //   #50	-> 340
/*   */     //   #51	-> 343
/*   */     //   #52	-> 356
/*   */     //   #53	-> 359
/*   */     //   #54	-> 383
/*   */     //   #55	-> 386
/*   */     //   #56	-> 411
/*   */     //   #57	-> 416
/*   */     //   #58	-> 432
/*   */     //   #59	-> 435
/*   */     //   #60	-> 439
/*   */     //   #61	-> 442
/*   */     //   #62	-> 456
/*   */     //   #63	-> 459
/*   */     //   #64	-> 463
/*   */     //   #65	-> 478
/*   */     //   #66	-> 481
/*   */     //   #67	-> 485
/*   */     //   #68	-> 488
/*   */     //   #69	-> 500
/*   */     //   #70	-> 503
/*   */     //   #71	-> 506
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */