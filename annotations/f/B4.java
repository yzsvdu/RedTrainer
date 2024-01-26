/* 1 */ package f;public final class B4 implements Closeable { public static final ik Xw = C00.gd(B4.class); public final long Z6; public final HashMap ji0; public volatile Xv U70; public final void sY(Ax0 paramAx0) { this.B20 = paramAx0; if (this.U70 != null) this.U70.getClass();  } public ep0 B20; public Thread W0; public B4() { HashMap<Object, Object> hashMap; this(); this.ji0 = this; this.B20 = null; this.W0 = null; this.Z6 = 515852628178239489L; } private void Dv0() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield U70 : Lf/Xv;
/*   */     //   4: invokevirtual COm1 : ()Lf/wV;
/*   */     //   7: dup
/*   */     //   8: astore_1
/*   */     //   9: getfield nH0 : I
/*   */     //   12: iconst_3
/*   */     //   13: if_icmpeq -> 632
/*   */     //   16: aload_1
/*   */     //   17: getfield BV : Lf/Sl0;
/*   */     //   20: dup
/*   */     //   21: astore_1
/*   */     //   22: ldc 'evt'
/*   */     //   24: astore_2
/*   */     //   25: aconst_null
/*   */     //   26: astore_3
/*   */     //   27: getfield Zo : Ljava/util/HashMap;
/*   */     //   30: aload_2
/*   */     //   31: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   34: astore_2
/*   */     //   35: getstatic f/Sl0.lB0 : Lf/sT;
/*   */     //   38: aload_2
/*   */     //   39: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   42: ifeq -> 48
/*   */     //   45: goto -> 53
/*   */     //   48: aload_2
/*   */     //   49: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   52: astore_3
/*   */     //   53: aload_3
/*   */     //   54: ifnonnull -> 62
/*   */     //   57: iconst_1
/*   */     //   58: istore_2
/*   */     //   59: goto -> 129
/*   */     //   62: bipush #7
/*   */     //   64: invokestatic s6 : (I)[I
/*   */     //   67: dup
/*   */     //   68: astore_2
/*   */     //   69: arraylength
/*   */     //   70: istore #4
/*   */     //   72: iconst_0
/*   */     //   73: istore #5
/*   */     //   75: iload #5
/*   */     //   77: iload #4
/*   */     //   79: if_icmpge -> 126
/*   */     //   82: aload_2
/*   */     //   83: iload #5
/*   */     //   85: iaload
/*   */     //   86: dup
/*   */     //   87: istore #6
/*   */     //   89: bipush #7
/*   */     //   91: if_icmpeq -> 120
/*   */     //   94: iload #6
/*   */     //   96: invokestatic qA : (I)Ljava/lang/String;
/*   */     //   99: aload_3
/*   */     //   100: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   103: ifeq -> 120
/*   */     //   106: iload #6
/*   */     //   108: istore_2
/*   */     //   109: goto -> 129
/*   */     //   112: astore_1
/*   */     //   113: goto -> 643
/*   */     //   116: astore_1
/*   */     //   117: goto -> 643
/*   */     //   120: iinc #5, 1
/*   */     //   123: goto -> 75
/*   */     //   126: bipush #7
/*   */     //   128: istore_2
/*   */     //   129: aload_1
/*   */     //   130: ldc 'nonce'
/*   */     //   132: astore_3
/*   */     //   133: aconst_null
/*   */     //   134: astore #4
/*   */     //   136: getfield Zo : Ljava/util/HashMap;
/*   */     //   139: aload_3
/*   */     //   140: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   143: astore_3
/*   */     //   144: getstatic f/Sl0.lB0 : Lf/sT;
/*   */     //   147: dup
/*   */     //   148: astore #5
/*   */     //   150: aload_3
/*   */     //   151: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   154: ifeq -> 160
/*   */     //   157: goto -> 166
/*   */     //   160: aload_3
/*   */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   164: astore #4
/*   */     //   166: iload_2
/*   */     //   167: invokestatic yE : (I)I
/*   */     //   170: tableswitch default -> 212, 0 -> 318, 1 -> 212, 2 -> 250, 3 -> 244, 4 -> 238, 5 -> 232, 6 -> 215
/*   */     //   212: goto -> 352
/*   */     //   215: getstatic f/B4.Xw : Lf/ik;
/*   */     //   218: aload_1
/*   */     //   219: ldc 'evt'
/*   */     //   221: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   224: pop
/*   */     //   225: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   228: pop
/*   */     //   229: goto -> 352
/*   */     //   232: getstatic f/B4.Xw : Lf/ik;
/*   */     //   235: goto -> 225
/*   */     //   238: getstatic f/B4.Xw : Lf/ik;
/*   */     //   241: goto -> 225
/*   */     //   244: getstatic f/B4.Xw : Lf/ik;
/*   */     //   247: goto -> 225
/*   */     //   250: aload #4
/*   */     //   252: ifnull -> 352
/*   */     //   255: aload_0
/*   */     //   256: getfield ji0 : Ljava/util/HashMap;
/*   */     //   259: aload #4
/*   */     //   261: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*   */     //   264: ifne -> 270
/*   */     //   267: goto -> 352
/*   */     //   270: aload #5
/*   */     //   272: aload_1
/*   */     //   273: aload_0
/*   */     //   274: getfield ji0 : Ljava/util/HashMap;
/*   */     //   277: aload #4
/*   */     //   279: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   282: invokestatic Av : (Ljava/lang/Object;)V
/*   */     //   285: ldc 'data'
/*   */     //   287: invokevirtual rO : (Ljava/lang/String;)Lf/Sl0;
/*   */     //   290: ldc 'message'
/*   */     //   292: astore_1
/*   */     //   293: getfield Zo : Ljava/util/HashMap;
/*   */     //   296: aload_1
/*   */     //   297: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   300: dup
/*   */     //   301: astore_1
/*   */     //   302: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   305: ifeq -> 311
/*   */     //   308: goto -> 316
/*   */     //   311: aload_1
/*   */     //   312: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   315: pop
/*   */     //   316: aconst_null
/*   */     //   317: athrow
/*   */     //   318: aload #4
/*   */     //   320: ifnull -> 352
/*   */     //   323: aload_0
/*   */     //   324: getfield ji0 : Ljava/util/HashMap;
/*   */     //   327: aload #4
/*   */     //   329: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*   */     //   332: ifne -> 338
/*   */     //   335: goto -> 352
/*   */     //   338: aload_0
/*   */     //   339: getfield ji0 : Ljava/util/HashMap;
/*   */     //   342: aload #4
/*   */     //   344: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   347: invokestatic Av : (Ljava/lang/Object;)V
/*   */     //   350: aconst_null
/*   */     //   351: athrow
/*   */     //   352: aload_0
/*   */     //   353: getfield B20 : Lf/ep0;
/*   */     //   356: ifnull -> 0
/*   */     //   359: aload_1
/*   */     //   360: ldc 'cmd'
/*   */     //   362: astore_2
/*   */     //   363: getfield Zo : Ljava/util/HashMap;
/*   */     //   366: aload_2
/*   */     //   367: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*   */     //   370: ifeq -> 0
/*   */     //   373: aload_1
/*   */     //   374: ldc 'cmd'
/*   */     //   376: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   379: ldc 'DISPATCH'
/*   */     //   381: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   384: ifeq -> 0
/*   */     //   387: aload_1
/*   */     //   388: dup
/*   */     //   389: ldc 'data'
/*   */     //   391: invokevirtual rO : (Ljava/lang/String;)Lf/Sl0;
/*   */     //   394: astore_1
/*   */     //   395: ldc 'evt'
/*   */     //   397: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   400: astore_2
/*   */     //   401: bipush #7
/*   */     //   403: invokestatic s6 : (I)[I
/*   */     //   406: dup
/*   */     //   407: astore_3
/*   */     //   408: arraylength
/*   */     //   409: istore #4
/*   */     //   411: iconst_0
/*   */     //   412: istore #5
/*   */     //   414: iload #5
/*   */     //   416: iload #4
/*   */     //   418: if_icmpge -> 458
/*   */     //   421: aload_3
/*   */     //   422: iload #5
/*   */     //   424: iaload
/*   */     //   425: dup
/*   */     //   426: istore #6
/*   */     //   428: bipush #7
/*   */     //   430: if_icmpeq -> 452
/*   */     //   433: iload #6
/*   */     //   435: invokestatic qA : (I)Ljava/lang/String;
/*   */     //   438: aload_2
/*   */     //   439: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   442: ifeq -> 452
/*   */     //   445: goto -> 462
/*   */     //   448: astore_1
/*   */     //   449: goto -> 618
/*   */     //   452: iinc #5, 1
/*   */     //   455: goto -> 414
/*   */     //   458: bipush #7
/*   */     //   460: istore #6
/*   */     //   462: iload #6
/*   */     //   464: invokestatic yE : (I)I
/*   */     //   467: dup
/*   */     //   468: istore_2
/*   */     //   469: iconst_3
/*   */     //   470: if_icmpeq -> 604
/*   */     //   473: iload_2
/*   */     //   474: iconst_4
/*   */     //   475: if_icmpeq -> 587
/*   */     //   478: iload_2
/*   */     //   479: iconst_5
/*   */     //   480: if_icmpeq -> 486
/*   */     //   483: goto -> 0
/*   */     //   486: aload_1
/*   */     //   487: ldc 'user'
/*   */     //   489: invokevirtual rO : (Ljava/lang/String;)Lf/Sl0;
/*   */     //   492: dup
/*   */     //   493: dup2
/*   */     //   494: ldc 'username'
/*   */     //   496: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   499: pop
/*   */     //   500: ldc 'discriminator'
/*   */     //   502: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   505: pop
/*   */     //   506: ldc 'id'
/*   */     //   508: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   511: invokestatic parseLong : (Ljava/lang/String;)J
/*   */     //   514: pop2
/*   */     //   515: ldc 'avatar'
/*   */     //   517: astore_2
/*   */     //   518: getfield Zo : Ljava/util/HashMap;
/*   */     //   521: aload_2
/*   */     //   522: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   525: astore_2
/*   */     //   526: getstatic f/Sl0.lB0 : Lf/sT;
/*   */     //   529: dup
/*   */     //   530: astore_3
/*   */     //   531: aload_2
/*   */     //   532: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   535: ifeq -> 541
/*   */     //   538: goto -> 546
/*   */     //   541: aload_2
/*   */     //   542: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   545: pop
/*   */     //   546: aload_3
/*   */     //   547: aload_1
/*   */     //   548: aload_0
/*   */     //   549: getfield B20 : Lf/ep0;
/*   */     //   552: astore_1
/*   */     //   553: ldc 'secret'
/*   */     //   555: astore_2
/*   */     //   556: getfield Zo : Ljava/util/HashMap;
/*   */     //   559: aload_2
/*   */     //   560: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   563: dup
/*   */     //   564: astore_2
/*   */     //   565: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   568: ifeq -> 574
/*   */     //   571: goto -> 579
/*   */     //   574: aload_2
/*   */     //   575: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   578: pop
/*   */     //   579: aload_1
/*   */     //   580: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   583: pop
/*   */     //   584: goto -> 0
/*   */     //   587: aload_0
/*   */     //   588: getfield B20 : Lf/ep0;
/*   */     //   591: aload_1
/*   */     //   592: ldc 'secret'
/*   */     //   594: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   597: pop
/*   */     //   598: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   601: goto -> 583
/*   */     //   604: aload_0
/*   */     //   605: getfield B20 : Lf/ep0;
/*   */     //   608: aload_1
/*   */     //   609: ldc 'secret'
/*   */     //   611: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   614: pop
/*   */     //   615: goto -> 598
/*   */     //   618: getstatic f/B4.Xw : Lf/ik;
/*   */     //   621: ldc 'Exception when handling event: '
/*   */     //   623: aload_1
/*   */     //   624: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   629: goto -> 0
/*   */     //   632: aload_0
/*   */     //   633: getfield U70 : Lf/Xv;
/*   */     //   636: iconst_5
/*   */     //   637: putfield mj : I
/*   */     //   640: goto -> 703
/*   */     //   643: aload_1
/*   */     //   644: instanceof java/io/IOException
/*   */     //   647: ifeq -> 664
/*   */     //   650: getstatic f/B4.Xw : Lf/ik;
/*   */     //   653: ldc 'Reading thread encountered an IOException'
/*   */     //   655: aload_1
/*   */     //   656: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   661: goto -> 675
/*   */     //   664: getstatic f/B4.Xw : Lf/ik;
/*   */     //   667: ldc 'Reading thread encountered an JSONException'
/*   */     //   669: aload_1
/*   */     //   670: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   675: aload_0
/*   */     //   676: dup
/*   */     //   677: getfield U70 : Lf/Xv;
/*   */     //   680: iconst_5
/*   */     //   681: putfield mj : I
/*   */     //   684: getfield B20 : Lf/ep0;
/*   */     //   687: dup
/*   */     //   688: astore_0
/*   */     //   689: ifnull -> 703
/*   */     //   692: aload_0
/*   */     //   693: checkcast f/Ax0
/*   */     //   696: getfield Ay0 : Lf/r9;
/*   */     //   699: aconst_null
/*   */     //   700: putfield a4 : Lf/B4;
/*   */     //   703: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 17
/*   */     //   #3	-> 22
/*   */     //   #4	-> 27
/*   */     //   #5	-> 31
/*   */     //   #6	-> 35
/*   */     //   #7	-> 64
/*   */     //   #8	-> 69
/*   */     //   #9	-> 130
/*   */     //   #10	-> 136
/*   */     //   #11	-> 144
/*   */     //   #12	-> 167
/*   */     //   #13	-> 293
/*   */     //   #14	-> 302
/*   */     //   #15	-> 317
/*   */     //   #16	-> 363
/*   */     //   #17	-> 374
/*   */     //   #18	-> 403
/*   */     //   #19	-> 408
/*   */     //   #20	-> 464
/*   */     //   #21	-> 518
/*   */     //   #22	-> 526
/*   */     //   #23	-> 549
/*   */     //   #24	-> 556
/*   */     //   #25	-> 565
/*   */     //   #26	-> 580
/*   */     //   #27	-> 637
/*   */     //   #28	-> 644
/*   */     //   #29	-> 681
/*   */     //   #30	-> 684
/*   */     //   #31	-> 696
/*   */     //   #32	-> 700
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   0	7	116	java/io/IOException
/*   */     //   0	7	112	f/m8
/*   */     //   9	12	116	java/io/IOException
/*   */     //   9	12	112	f/m8
/*   */     //   16	20	116	java/io/IOException
/*   */     //   16	20	112	f/m8
/*   */     //   22	24	116	java/io/IOException
/*   */     //   22	24	112	f/m8
/*   */     //   27	34	116	java/io/IOException
/*   */     //   27	34	112	f/m8
/*   */     //   35	42	116	java/io/IOException
/*   */     //   35	42	112	f/m8
/*   */     //   48	52	116	java/io/IOException
/*   */     //   48	52	112	f/m8
/*   */     //   62	67	116	java/io/IOException
/*   */     //   62	67	112	f/m8
/*   */     //   69	70	116	java/io/IOException
/*   */     //   69	70	112	f/m8
/*   */     //   82	86	116	java/io/IOException
/*   */     //   82	86	112	f/m8
/*   */     //   94	103	116	java/io/IOException
/*   */     //   94	103	112	f/m8
/*   */     //   129	132	116	java/io/IOException
/*   */     //   129	132	112	f/m8
/*   */     //   136	143	116	java/io/IOException
/*   */     //   136	143	112	f/m8
/*   */     //   144	147	116	java/io/IOException
/*   */     //   144	147	112	f/m8
/*   */     //   150	154	116	java/io/IOException
/*   */     //   150	154	112	f/m8
/*   */     //   160	164	116	java/io/IOException
/*   */     //   160	164	112	f/m8
/*   */     //   166	170	116	java/io/IOException
/*   */     //   166	170	112	f/m8
/*   */     //   215	224	116	java/io/IOException
/*   */     //   215	224	112	f/m8
/*   */     //   225	228	116	java/io/IOException
/*   */     //   225	228	112	f/m8
/*   */     //   232	250	116	java/io/IOException
/*   */     //   232	250	112	f/m8
/*   */     //   255	264	116	java/io/IOException
/*   */     //   255	264	112	f/m8
/*   */     //   270	292	116	java/io/IOException
/*   */     //   270	292	112	f/m8
/*   */     //   293	300	116	java/io/IOException
/*   */     //   293	300	112	f/m8
/*   */     //   302	305	116	java/io/IOException
/*   */     //   302	305	112	f/m8
/*   */     //   311	315	116	java/io/IOException
/*   */     //   311	315	112	f/m8
/*   */     //   323	332	116	java/io/IOException
/*   */     //   323	332	112	f/m8
/*   */     //   338	350	116	java/io/IOException
/*   */     //   338	350	112	f/m8
/*   */     //   352	356	116	java/io/IOException
/*   */     //   352	356	112	f/m8
/*   */     //   359	362	116	java/io/IOException
/*   */     //   359	362	112	f/m8
/*   */     //   363	370	116	java/io/IOException
/*   */     //   363	370	112	f/m8
/*   */     //   373	384	116	java/io/IOException
/*   */     //   373	384	112	f/m8
/*   */     //   387	394	448	java/lang/Exception
/*   */     //   395	400	448	java/lang/Exception
/*   */     //   401	406	448	java/lang/Exception
/*   */     //   408	409	448	java/lang/Exception
/*   */     //   421	425	448	java/lang/Exception
/*   */     //   433	442	448	java/lang/Exception
/*   */     //   462	467	448	java/lang/Exception
/*   */     //   486	499	448	java/lang/Exception
/*   */     //   500	505	448	java/lang/Exception
/*   */     //   506	514	448	java/lang/Exception
/*   */     //   515	517	448	java/lang/Exception
/*   */     //   518	525	448	java/lang/Exception
/*   */     //   526	529	448	java/lang/Exception
/*   */     //   531	535	448	java/lang/Exception
/*   */     //   541	545	448	java/lang/Exception
/*   */     //   546	552	448	java/lang/Exception
/*   */     //   553	555	448	java/lang/Exception
/*   */     //   556	563	448	java/lang/Exception
/*   */     //   565	568	448	java/lang/Exception
/*   */     //   574	578	448	java/lang/Exception
/*   */     //   579	583	448	java/lang/Exception
/*   */     //   587	597	448	java/lang/Exception
/*   */     //   598	614	448	java/lang/Exception
/*   */     //   618	636	116	java/io/IOException
/*   */     //   618	636	112	f/m8
/*   */     //   637	643	116	java/io/IOException
/*   */     //   637	643	112	f/m8 } public final void st(int... paramVarArgs) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: aload_0
/*   */     //   2: dup
/*   */     //   3: dup
/*   */     //   4: dup2
/*   */     //   5: iconst_0
/*   */     //   6: invokevirtual ra0 : (Z)V
/*   */     //   9: getfield ji0 : Ljava/util/HashMap;
/*   */     //   12: invokevirtual clear : ()V
/*   */     //   15: aconst_null
/*   */     //   16: putfield U70 : Lf/Xv;
/*   */     //   19: getfield Z6 : J
/*   */     //   22: lstore_2
/*   */     //   23: getfield ji0 : Ljava/util/HashMap;
/*   */     //   26: astore #4
/*   */     //   28: getstatic f/Xv.ze : Lf/ik;
/*   */     //   31: pop
/*   */     //   32: arraylength
/*   */     //   33: ifne -> 44
/*   */     //   36: iconst_1
/*   */     //   37: newarray int
/*   */     //   39: dup
/*   */     //   40: astore_1
/*   */     //   41: iconst_0
/*   */     //   42: iconst_4
/*   */     //   43: iastore
/*   */     //   44: iconst_4
/*   */     //   45: invokestatic s6 : (I)[I
/*   */     //   48: arraylength
/*   */     //   49: dup
/*   */     //   50: istore #5
/*   */     //   52: anewarray f/Xv
/*   */     //   55: astore #6
/*   */     //   57: iconst_0
/*   */     //   58: istore #7
/*   */     //   60: iload #7
/*   */     //   62: aconst_null
/*   */     //   63: astore #8
/*   */     //   65: bipush #10
/*   */     //   67: if_icmpge -> 382
/*   */     //   70: aload_0
/*   */     //   71: aload #4
/*   */     //   73: iload #7
/*   */     //   75: invokestatic fK : (I)Ljava/lang/String;
/*   */     //   78: dup
/*   */     //   79: astore #8
/*   */     //   81: getstatic f/Xv.ze : Lf/ik;
/*   */     //   84: ldc 'Searching for IPC: %s'
/*   */     //   86: iconst_1
/*   */     //   87: anewarray java/lang/Object
/*   */     //   90: dup
/*   */     //   91: iconst_0
/*   */     //   92: aload #8
/*   */     //   94: aastore
/*   */     //   95: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   98: pop
/*   */     //   99: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   102: pop
/*   */     //   103: invokestatic Ws0 : (Lf/B4;Ljava/util/HashMap;Ljava/lang/String;)Lf/s80;
/*   */     //   106: dup
/*   */     //   107: dup
/*   */     //   108: astore #8
/*   */     //   110: iconst_1
/*   */     //   111: new f/Sl0
/*   */     //   114: dup
/*   */     //   115: invokespecial <init> : ()V
/*   */     //   118: ldc 'v'
/*   */     //   120: iconst_1
/*   */     //   121: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   124: swap
/*   */     //   125: invokevirtual t : (Ljava/lang/Object;Ljava/lang/String;)Lf/Sl0;
/*   */     //   128: lload_2
/*   */     //   129: ldc 'client_id'
/*   */     //   131: astore #9
/*   */     //   133: invokestatic toString : (J)Ljava/lang/String;
/*   */     //   136: aload #9
/*   */     //   138: invokevirtual t : (Ljava/lang/Object;Ljava/lang/String;)Lf/Sl0;
/*   */     //   141: invokevirtual Rf : (ILf/Sl0;)V
/*   */     //   144: invokevirtual COm1 : ()Lf/wV;
/*   */     //   147: dup
/*   */     //   148: astore #9
/*   */     //   150: getfield BV : Lf/Sl0;
/*   */     //   153: ldc 'data'
/*   */     //   155: invokevirtual rO : (Ljava/lang/String;)Lf/Sl0;
/*   */     //   158: ldc_w 'config'
/*   */     //   161: invokevirtual rO : (Ljava/lang/String;)Lf/Sl0;
/*   */     //   164: ldc_w 'api_endpoint'
/*   */     //   167: invokevirtual SI : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   170: astore #10
/*   */     //   172: iconst_4
/*   */     //   173: invokestatic s6 : (I)[I
/*   */     //   176: dup
/*   */     //   177: astore #11
/*   */     //   179: arraylength
/*   */     //   180: istore #12
/*   */     //   182: iconst_0
/*   */     //   183: istore #13
/*   */     //   185: iload #13
/*   */     //   187: iload #12
/*   */     //   189: if_icmpge -> 236
/*   */     //   192: aload #11
/*   */     //   194: iload #13
/*   */     //   196: iaload
/*   */     //   197: dup
/*   */     //   198: istore #14
/*   */     //   200: invokestatic aU : (I)Ljava/lang/String;
/*   */     //   203: dup
/*   */     //   204: astore #15
/*   */     //   206: ifnull -> 230
/*   */     //   209: aload #15
/*   */     //   211: aload #10
/*   */     //   213: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   216: ifeq -> 230
/*   */     //   219: goto -> 239
/*   */     //   222: pop
/*   */     //   223: goto -> 376
/*   */     //   226: pop
/*   */     //   227: goto -> 376
/*   */     //   230: iinc #13, 1
/*   */     //   233: goto -> 185
/*   */     //   236: iconst_4
/*   */     //   237: istore #14
/*   */     //   239: aload #8
/*   */     //   241: dup
/*   */     //   242: iload #14
/*   */     //   244: putfield Ru : I
/*   */     //   247: getstatic f/Xv.ze : Lf/ik;
/*   */     //   250: dup
/*   */     //   251: astore #10
/*   */     //   253: ldc_w 'Found a valid client (%s) with packet: %s'
/*   */     //   256: iconst_2
/*   */     //   257: anewarray java/lang/Object
/*   */     //   260: dup
/*   */     //   261: dup
/*   */     //   262: aload #9
/*   */     //   264: swap
/*   */     //   265: iload #14
/*   */     //   267: iconst_0
/*   */     //   268: istore #9
/*   */     //   270: invokestatic fD : (I)Ljava/lang/String;
/*   */     //   273: iload #9
/*   */     //   275: swap
/*   */     //   276: aastore
/*   */     //   277: iconst_1
/*   */     //   278: istore #9
/*   */     //   280: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   283: iload #9
/*   */     //   285: swap
/*   */     //   286: aastore
/*   */     //   287: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   290: pop
/*   */     //   291: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   294: pop
/*   */     //   295: getfield Ru : I
/*   */     //   298: dup
/*   */     //   299: istore #9
/*   */     //   301: aload_1
/*   */     //   302: iconst_0
/*   */     //   303: iaload
/*   */     //   304: dup
/*   */     //   305: istore #11
/*   */     //   307: if_icmpeq -> 343
/*   */     //   310: iconst_4
/*   */     //   311: iload #11
/*   */     //   313: if_icmpne -> 319
/*   */     //   316: goto -> 343
/*   */     //   319: aload #8
/*   */     //   321: aload #6
/*   */     //   323: dup
/*   */     //   324: iload #9
/*   */     //   326: invokestatic yE : (I)I
/*   */     //   329: aload #8
/*   */     //   331: aastore
/*   */     //   332: iconst_3
/*   */     //   333: aload #8
/*   */     //   335: aastore
/*   */     //   336: iconst_0
/*   */     //   337: putfield Ru : I
/*   */     //   340: goto -> 376
/*   */     //   343: aload #10
/*   */     //   345: ldc_w 'Found preferred client: %s'
/*   */     //   348: iconst_1
/*   */     //   349: anewarray java/lang/Object
/*   */     //   352: dup
/*   */     //   353: iload #9
/*   */     //   355: iconst_0
/*   */     //   356: istore #9
/*   */     //   358: invokestatic fD : (I)Ljava/lang/String;
/*   */     //   361: iload #9
/*   */     //   363: swap
/*   */     //   364: aastore
/*   */     //   365: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   368: invokeinterface info : (Ljava/lang/String;)V
/*   */     //   373: goto -> 382
/*   */     //   376: iinc #7, 1
/*   */     //   379: goto -> 60
/*   */     //   382: aload #8
/*   */     //   384: ifnonnull -> 563
/*   */     //   387: iconst_1
/*   */     //   388: istore_2
/*   */     //   389: iload_2
/*   */     //   390: aload_1
/*   */     //   391: arraylength
/*   */     //   392: if_icmpge -> 547
/*   */     //   395: aload #6
/*   */     //   397: aload_1
/*   */     //   398: iload_2
/*   */     //   399: iaload
/*   */     //   400: dup
/*   */     //   401: istore_3
/*   */     //   402: getstatic f/Xv.ze : Lf/ik;
/*   */     //   405: iconst_1
/*   */     //   406: anewarray java/lang/Object
/*   */     //   409: dup
/*   */     //   410: astore #4
/*   */     //   412: iload_3
/*   */     //   413: invokestatic fD : (I)Ljava/lang/String;
/*   */     //   416: iconst_0
/*   */     //   417: swap
/*   */     //   418: aastore
/*   */     //   419: ldc_w 'Looking for client build: %s'
/*   */     //   422: aload #4
/*   */     //   424: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   427: pop
/*   */     //   428: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   431: pop
/*   */     //   432: invokestatic yE : (I)I
/*   */     //   435: aaload
/*   */     //   436: ifnull -> 541
/*   */     //   439: iload_3
/*   */     //   440: aload #6
/*   */     //   442: iload_3
/*   */     //   443: aload #6
/*   */     //   445: iload_3
/*   */     //   446: invokestatic yE : (I)I
/*   */     //   449: aaload
/*   */     //   450: astore #8
/*   */     //   452: invokestatic yE : (I)I
/*   */     //   455: aconst_null
/*   */     //   456: aastore
/*   */     //   457: iconst_4
/*   */     //   458: if_icmpne -> 500
/*   */     //   461: iconst_0
/*   */     //   462: istore_1
/*   */     //   463: iload_1
/*   */     //   464: iload #5
/*   */     //   466: if_icmpge -> 506
/*   */     //   469: aload #6
/*   */     //   471: iload_1
/*   */     //   472: aaload
/*   */     //   473: aload #8
/*   */     //   475: if_acmpne -> 494
/*   */     //   478: aload #6
/*   */     //   480: iload_1
/*   */     //   481: aload #8
/*   */     //   483: iconst_4
/*   */     //   484: invokestatic s6 : (I)[I
/*   */     //   487: iload_1
/*   */     //   488: iaload
/*   */     //   489: putfield Ru : I
/*   */     //   492: aconst_null
/*   */     //   493: aastore
/*   */     //   494: iinc #1, 1
/*   */     //   497: goto -> 463
/*   */     //   500: aload #8
/*   */     //   502: iload_3
/*   */     //   503: putfield Ru : I
/*   */     //   506: getstatic f/Xv.ze : Lf/ik;
/*   */     //   509: iconst_1
/*   */     //   510: anewarray java/lang/Object
/*   */     //   513: dup
/*   */     //   514: astore_1
/*   */     //   515: aload #8
/*   */     //   517: getfield Ru : I
/*   */     //   520: invokestatic fD : (I)Ljava/lang/String;
/*   */     //   523: iconst_0
/*   */     //   524: swap
/*   */     //   525: aastore
/*   */     //   526: ldc_w 'Found preferred client: %s'
/*   */     //   529: aload_1
/*   */     //   530: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   533: invokeinterface info : (Ljava/lang/String;)V
/*   */     //   538: goto -> 547
/*   */     //   541: iinc #2, 1
/*   */     //   544: goto -> 389
/*   */     //   547: aload #8
/*   */     //   549: ifnull -> 555
/*   */     //   552: goto -> 563
/*   */     //   555: new f/AG
/*   */     //   558: dup
/*   */     //   559: invokespecial <init> : ()V
/*   */     //   562: athrow
/*   */     //   563: iconst_0
/*   */     //   564: istore_1
/*   */     //   565: iload_1
/*   */     //   566: iload #5
/*   */     //   568: if_icmpge -> 641
/*   */     //   571: iload_1
/*   */     //   572: iconst_3
/*   */     //   573: if_icmpne -> 579
/*   */     //   576: goto -> 635
/*   */     //   579: aload #6
/*   */     //   581: iload_1
/*   */     //   582: aaload
/*   */     //   583: dup
/*   */     //   584: astore_2
/*   */     //   585: ifnull -> 635
/*   */     //   588: aload_2
/*   */     //   589: checkcast f/s80
/*   */     //   592: dup
/*   */     //   593: dup
/*   */     //   594: getstatic f/s80.YW : Lf/ik;
/*   */     //   597: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   600: pop
/*   */     //   601: new f/Sl0
/*   */     //   604: dup
/*   */     //   605: astore_2
/*   */     //   606: invokespecial <init> : ()V
/*   */     //   609: iconst_3
/*   */     //   610: aload_2
/*   */     //   611: invokevirtual Rf : (ILf/Sl0;)V
/*   */     //   614: iconst_4
/*   */     //   615: putfield mj : I
/*   */     //   618: getfield oo0 : Ljava/io/RandomAccessFile;
/*   */     //   621: invokevirtual close : ()V
/*   */     //   624: goto -> 635
/*   */     //   627: pop
/*   */     //   628: getstatic f/Xv.ze : Lf/ik;
/*   */     //   631: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   634: pop
/*   */     //   635: iinc #1, 1
/*   */     //   638: goto -> 565
/*   */     //   641: aload_0
/*   */     //   642: dup
/*   */     //   643: aload #8
/*   */     //   645: dup
/*   */     //   646: iconst_3
/*   */     //   647: putfield mj : I
/*   */     //   650: putfield U70 : Lf/Xv;
/*   */     //   653: getstatic f/B4.Xw : Lf/ik;
/*   */     //   656: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   659: pop
/*   */     //   660: getfield B20 : Lf/ep0;
/*   */     //   663: dup
/*   */     //   664: astore_1
/*   */     //   665: ifnull -> 688
/*   */     //   668: aload_1
/*   */     //   669: checkcast f/Ax0
/*   */     //   672: dup
/*   */     //   673: astore_1
/*   */     //   674: getfield Ay0 : Lf/r9;
/*   */     //   677: dup
/*   */     //   678: aload_1
/*   */     //   679: getfield Fx0 : Lf/B4;
/*   */     //   682: putfield a4 : Lf/B4;
/*   */     //   685: invokevirtual Hf0 : ()V
/*   */     //   688: aload_0
/*   */     //   689: invokevirtual jt0 : ()V
/*   */     //   692: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 32
/*   */     //   #2	-> 45
/*   */     //   #3	-> 48
/*   */     //   #4	-> 121
/*   */     //   #5	-> 129
/*   */     //   #6	-> 150
/*   */     //   #7	-> 153
/*   */     //   #8	-> 173
/*   */     //   #9	-> 179
/*   */     //   #10	-> 244
/*   */     //   #11	-> 484
/*   */     //   #12	-> 488
/*   */     //   #13	-> 594
/*   */     //   #14	-> 628
/*   */     //   #15	-> 650
/*   */     //   #16	-> 674
/*   */     //   #17	-> 679
/*   */     //   #18	-> 689
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   70	78	226	java/io/IOException
/*   */     //   70	78	222	f/m8
/*   */     //   81	98	226	java/io/IOException
/*   */     //   81	98	222	f/m8
/*   */     //   99	102	226	java/io/IOException
/*   */     //   99	102	222	f/m8
/*   */     //   103	106	226	java/io/IOException
/*   */     //   103	106	222	f/m8
/*   */     //   111	120	226	java/io/IOException
/*   */     //   111	120	222	f/m8
/*   */     //   121	131	226	java/io/IOException
/*   */     //   121	131	222	f/m8
/*   */     //   133	147	226	java/io/IOException
/*   */     //   133	147	222	f/m8
/*   */     //   150	170	226	java/io/IOException
/*   */     //   150	170	222	f/m8
/*   */     //   172	176	226	java/io/IOException
/*   */     //   172	176	222	f/m8
/*   */     //   179	180	226	java/io/IOException
/*   */     //   179	180	222	f/m8
/*   */     //   192	197	226	java/io/IOException
/*   */     //   192	197	222	f/m8
/*   */     //   200	203	226	java/io/IOException
/*   */     //   200	203	222	f/m8
/*   */     //   209	216	226	java/io/IOException
/*   */     //   209	216	222	f/m8
/*   */     //   239	250	226	java/io/IOException
/*   */     //   239	250	222	f/m8
/*   */     //   253	260	226	java/io/IOException
/*   */     //   253	260	222	f/m8
/*   */     //   270	277	226	java/io/IOException
/*   */     //   270	277	222	f/m8
/*   */     //   280	290	226	java/io/IOException
/*   */     //   280	290	222	f/m8
/*   */     //   291	294	226	java/io/IOException
/*   */     //   291	294	222	f/m8
/*   */     //   295	298	226	java/io/IOException
/*   */     //   295	298	222	f/m8
/*   */     //   301	304	226	java/io/IOException
/*   */     //   301	304	222	f/m8
/*   */     //   319	332	226	java/io/IOException
/*   */     //   319	332	222	f/m8
/*   */     //   333	352	226	java/io/IOException
/*   */     //   333	352	222	f/m8
/*   */     //   358	376	226	java/io/IOException
/*   */     //   358	376	222	f/m8
/*   */     //   588	600	627	java/io/IOException
/*   */     //   601	604	627	java/io/IOException
/* 1 */     //   606	627	627	java/io/IOException } public final void cz(wq paramwq) { ra0(true); paramwq.lPt5().toString(); Xw.getClass();
/*   */     
/* 3 */     String str = "activity"; this.U70.Rf(2, (new Sl0()).t("SET_ACTIVITY", "cmd").t((new Sl0()).ze0(Integer.parseInt(ManagementFactory.getRuntimeMXBean().getName().substring(0, ManagementFactory.getRuntimeMXBean().getName().indexOf('@')))).t(paramwq.lPt5(), this), "args")); } public final void close() { ra0(true); try { Sl0 sl0; ((s80)this.U70).getClass(); s80.YW.getClass(); this(); ((s80)this.U70).Rf(3, this); this.U70.mj = 4; ((s80)this.U70).oo0.close(); } catch (IOException iOException) { Xw.getClass(); }  } public final void ra0(boolean paramBoolean) { Object[] arrayOfObject; if (paramBoolean) { int i; if (this.U70 == null) { i = 1; } else { i = this.U70.mj; }  if (i != 3) { (arrayOfObject = new Object[1])[0] = Long.valueOf(this.Z6); throw new IllegalStateException(String.format("IPCClient (ID: %d) is not connected!", arrayOfObject)); }  }  if (arrayOfObject == null) { int i; if (this
/* 4 */         .U70 == null) { i = 1; }
/* 5 */       else { i = this.U70.mj; }  if (i == 3) {
/* 6 */         Object[] arrayOfObject1; (arrayOfObject1 = new Object[1])[0] = Long.valueOf(this.Z6); throw new IllegalStateException(String.format("IPCClient (ID: %d) is already connected!", arrayOfObject1));
/*   */       }  }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void jt0() {
/*   */     this.W0 = new Thread(this::Dv0);
/*   */     Xw.getClass();
/*   */     this.W0.start();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */