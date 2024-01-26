/* 1 */ package f;public final class L70 implements Runnable { public final byte fu() { byte b; if ((b = this.l0) > -1) return b;  if (this.Jt0 > -1) { boolean bool; e2 e21; (e21 = this.az).getClass(); if (System.currentTimeMillis() < e21.jn0) { bool = false; } else { bool = true; }  if (!bool)
/* 2 */         return this.Jt0;  }  this
/* 3 */       .az.Po0(); return this.Jt0 = (byte)((new GregorianCalendar(TimeZone.getTimeZone("UTC"))).get(2) % 4); }
/*   */ 
/*   */   
/*   */   public static final L70 gq = new L70();
/*   */   public e2 oh0;
/*   */   public e2 az;
/*   */   public int Vo0;
/*   */   public int wU;
/*   */   public int bV;
/*   */   public int Bf;
/*   */   public byte Uv0;
/*   */   public byte Jt0;
/*   */   public byte l0;
/*   */   public final ArrayList ND;
/*   */   public final ArrayList nf;
/*   */   
/*   */   public L70() {
/*   */     e2 e21;
/*   */     ArrayList arrayList;
/*   */     this(30000);
/*   */     this.oh0 = this;
/*   */     this(30000);
/*   */     this.az = this;
/*   */     this.bV = 2;
/*   */     this.Bf = 0;
/*   */     this.Uv0 = -1;
/*   */     this.Jt0 = -1;
/*   */     this.l0 = -1;
/*   */     this();
/*   */     this.ND = this;
/*   */     this();
/*   */     this.nf = this;
/*   */   }
/*   */   
/*   */   public static L70 Oj0() {
/*   */     return gq;
/*   */   }
/*   */   
/*   */   public final int Zi0() {
/*   */     byte b;
/*   */     return ((b = this.Uv0) > 0 && b < 25) ? (b * 3600) : (((int)(System.currentTimeMillis() / 1000L) - this.wU - this.Vo0) * 4);
/*   */   }
/*   */   
/*   */   public final int Rr0() {
/*   */     byte b;
/*   */     return ((b = this.Uv0) > 0 && b < 25) ? b : (Zi0() % 86400 / 3600);
/*   */   }
/*   */   
/*   */   public final void run() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual Rr0 : ()I
/*   */     //   4: dup
/*   */     //   5: istore_1
/*   */     //   6: iconst_4
/*   */     //   7: if_icmpge -> 79
/*   */     //   10: aload_0
/*   */     //   11: iconst_5
/*   */     //   12: istore_1
/*   */     //   13: getfield bV : I
/*   */     //   16: iload_1
/*   */     //   17: if_icmpne -> 23
/*   */     //   20: goto -> 365
/*   */     //   23: aload_0
/*   */     //   24: dup
/*   */     //   25: dup
/*   */     //   26: iload_1
/*   */     //   27: putfield bV : I
/*   */     //   30: getfield ND : Ljava/util/ArrayList;
/*   */     //   33: dup
/*   */     //   34: astore_2
/*   */     //   35: monitorenter
/*   */     //   36: getfield ND : Ljava/util/ArrayList;
/*   */     //   39: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   42: astore_1
/*   */     //   43: aload_1
/*   */     //   44: invokeinterface hasNext : ()Z
/*   */     //   49: ifeq -> 69
/*   */     //   52: aload_1
/*   */     //   53: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   58: checkcast java/lang/Runnable
/*   */     //   61: invokeinterface run : ()V
/*   */     //   66: goto -> 43
/*   */     //   69: aload_2
/*   */     //   70: monitorexit
/*   */     //   71: goto -> 365
/*   */     //   74: astore_0
/*   */     //   75: aload_0
/*   */     //   76: aload_2
/*   */     //   77: monitorexit
/*   */     //   78: athrow
/*   */     //   79: iload_1
/*   */     //   80: bipush #11
/*   */     //   82: if_icmpge -> 154
/*   */     //   85: aload_0
/*   */     //   86: iconst_1
/*   */     //   87: istore_1
/*   */     //   88: getfield bV : I
/*   */     //   91: iload_1
/*   */     //   92: if_icmpne -> 98
/*   */     //   95: goto -> 365
/*   */     //   98: aload_0
/*   */     //   99: dup
/*   */     //   100: dup
/*   */     //   101: iload_1
/*   */     //   102: putfield bV : I
/*   */     //   105: getfield ND : Ljava/util/ArrayList;
/*   */     //   108: dup
/*   */     //   109: astore_2
/*   */     //   110: monitorenter
/*   */     //   111: getfield ND : Ljava/util/ArrayList;
/*   */     //   114: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   117: astore_1
/*   */     //   118: aload_1
/*   */     //   119: invokeinterface hasNext : ()Z
/*   */     //   124: ifeq -> 144
/*   */     //   127: aload_1
/*   */     //   128: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   133: checkcast java/lang/Runnable
/*   */     //   136: invokeinterface run : ()V
/*   */     //   141: goto -> 118
/*   */     //   144: aload_2
/*   */     //   145: monitorexit
/*   */     //   146: goto -> 365
/*   */     //   149: astore_0
/*   */     //   150: aload_0
/*   */     //   151: aload_2
/*   */     //   152: monitorexit
/*   */     //   153: athrow
/*   */     //   154: iload_1
/*   */     //   155: bipush #18
/*   */     //   157: if_icmpge -> 229
/*   */     //   160: aload_0
/*   */     //   161: iconst_2
/*   */     //   162: istore_1
/*   */     //   163: getfield bV : I
/*   */     //   166: iload_1
/*   */     //   167: if_icmpne -> 173
/*   */     //   170: goto -> 365
/*   */     //   173: aload_0
/*   */     //   174: dup
/*   */     //   175: dup
/*   */     //   176: iload_1
/*   */     //   177: putfield bV : I
/*   */     //   180: getfield ND : Ljava/util/ArrayList;
/*   */     //   183: dup
/*   */     //   184: astore_2
/*   */     //   185: monitorenter
/*   */     //   186: getfield ND : Ljava/util/ArrayList;
/*   */     //   189: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   192: astore_1
/*   */     //   193: aload_1
/*   */     //   194: invokeinterface hasNext : ()Z
/*   */     //   199: ifeq -> 219
/*   */     //   202: aload_1
/*   */     //   203: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   208: checkcast java/lang/Runnable
/*   */     //   211: invokeinterface run : ()V
/*   */     //   216: goto -> 193
/*   */     //   219: aload_2
/*   */     //   220: monitorexit
/*   */     //   221: goto -> 365
/*   */     //   224: astore_0
/*   */     //   225: aload_0
/*   */     //   226: aload_2
/*   */     //   227: monitorexit
/*   */     //   228: athrow
/*   */     //   229: iload_1
/*   */     //   230: bipush #21
/*   */     //   232: if_icmpge -> 304
/*   */     //   235: aload_0
/*   */     //   236: iconst_3
/*   */     //   237: istore_1
/*   */     //   238: getfield bV : I
/*   */     //   241: iload_1
/*   */     //   242: if_icmpne -> 248
/*   */     //   245: goto -> 365
/*   */     //   248: aload_0
/*   */     //   249: dup
/*   */     //   250: dup
/*   */     //   251: iload_1
/*   */     //   252: putfield bV : I
/*   */     //   255: getfield ND : Ljava/util/ArrayList;
/*   */     //   258: dup
/*   */     //   259: astore_1
/*   */     //   260: monitorenter
/*   */     //   261: getfield ND : Ljava/util/ArrayList;
/*   */     //   264: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   267: astore_2
/*   */     //   268: aload_2
/*   */     //   269: invokeinterface hasNext : ()Z
/*   */     //   274: ifeq -> 294
/*   */     //   277: aload_2
/*   */     //   278: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   283: checkcast java/lang/Runnable
/*   */     //   286: invokeinterface run : ()V
/*   */     //   291: goto -> 268
/*   */     //   294: aload_1
/*   */     //   295: monitorexit
/*   */     //   296: goto -> 365
/*   */     //   299: astore_0
/*   */     //   300: aload_0
/*   */     //   301: aload_1
/*   */     //   302: monitorexit
/*   */     //   303: athrow
/*   */     //   304: aload_0
/*   */     //   305: iconst_4
/*   */     //   306: istore_1
/*   */     //   307: getfield bV : I
/*   */     //   310: iload_1
/*   */     //   311: if_icmpne -> 317
/*   */     //   314: goto -> 365
/*   */     //   317: aload_0
/*   */     //   318: dup
/*   */     //   319: dup
/*   */     //   320: iload_1
/*   */     //   321: putfield bV : I
/*   */     //   324: getfield ND : Ljava/util/ArrayList;
/*   */     //   327: dup
/*   */     //   328: astore_1
/*   */     //   329: monitorenter
/*   */     //   330: getfield ND : Ljava/util/ArrayList;
/*   */     //   333: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   336: astore_2
/*   */     //   337: aload_2
/*   */     //   338: invokeinterface hasNext : ()Z
/*   */     //   343: ifeq -> 363
/*   */     //   346: aload_2
/*   */     //   347: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   352: checkcast java/lang/Runnable
/*   */     //   355: invokeinterface run : ()V
/*   */     //   360: goto -> 337
/*   */     //   363: aload_1
/*   */     //   364: monitorexit
/*   */     //   365: aload_0
/*   */     //   366: getfield Bf : I
/*   */     //   369: aload_0
/*   */     //   370: invokevirtual Zi0 : ()I
/*   */     //   373: ldc 604800
/*   */     //   375: irem
/*   */     //   376: ldc 86400
/*   */     //   378: idiv
/*   */     //   379: if_icmpeq -> 494
/*   */     //   382: aload_0
/*   */     //   383: dup
/*   */     //   384: dup2
/*   */     //   385: invokevirtual Zi0 : ()I
/*   */     //   388: ldc 604800
/*   */     //   390: irem
/*   */     //   391: ldc 86400
/*   */     //   393: idiv
/*   */     //   394: putfield Bf : I
/*   */     //   397: getfield ND : Ljava/util/ArrayList;
/*   */     //   400: dup
/*   */     //   401: astore_1
/*   */     //   402: monitorenter
/*   */     //   403: getfield ND : Ljava/util/ArrayList;
/*   */     //   406: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   409: astore_2
/*   */     //   410: aload_2
/*   */     //   411: invokeinterface hasNext : ()Z
/*   */     //   416: ifeq -> 436
/*   */     //   419: aload_2
/*   */     //   420: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   425: checkcast java/lang/Runnable
/*   */     //   428: invokeinterface run : ()V
/*   */     //   433: goto -> 410
/*   */     //   436: aload_0
/*   */     //   437: dup
/*   */     //   438: aload_1
/*   */     //   439: monitorexit
/*   */     //   440: getfield nf : Ljava/util/ArrayList;
/*   */     //   443: dup
/*   */     //   444: astore_2
/*   */     //   445: monitorenter
/*   */     //   446: getfield nf : Ljava/util/ArrayList;
/*   */     //   449: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   452: astore_1
/*   */     //   453: aload_1
/*   */     //   454: invokeinterface hasNext : ()Z
/*   */     //   459: ifeq -> 479
/*   */     //   462: aload_1
/*   */     //   463: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   468: checkcast java/lang/Runnable
/*   */     //   471: invokeinterface run : ()V
/*   */     //   476: goto -> 453
/*   */     //   479: aload_2
/*   */     //   480: monitorexit
/*   */     //   481: goto -> 494
/*   */     //   484: astore_0
/*   */     //   485: aload_0
/*   */     //   486: aload_2
/*   */     //   487: monitorexit
/*   */     //   488: athrow
/*   */     //   489: astore_0
/*   */     //   490: aload_0
/*   */     //   491: aload_1
/*   */     //   492: monitorexit
/*   */     //   493: athrow
/*   */     //   494: aload_0
/*   */     //   495: dup
/*   */     //   496: getfield az : Lf/e2;
/*   */     //   499: invokevirtual Po0 : ()Z
/*   */     //   502: pop
/*   */     //   503: new java/util/GregorianCalendar
/*   */     //   506: dup
/*   */     //   507: ldc 'UTC'
/*   */     //   509: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
/*   */     //   512: invokespecial <init> : (Ljava/util/TimeZone;)V
/*   */     //   515: iconst_2
/*   */     //   516: invokevirtual get : (I)I
/*   */     //   519: iconst_4
/*   */     //   520: irem
/*   */     //   521: i2b
/*   */     //   522: putfield Jt0 : B
/*   */     //   525: return
/*   */     //   526: astore_0
/*   */     //   527: aload_0
/*   */     //   528: aload_1
/*   */     //   529: monitorexit
/*   */     //   530: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 13
/*   */     //   #2	-> 30
/*   */     //   #3	-> 88
/*   */     //   #4	-> 105
/*   */     //   #5	-> 163
/*   */     //   #6	-> 180
/*   */     //   #7	-> 238
/*   */     //   #8	-> 255
/*   */     //   #9	-> 307
/*   */     //   #10	-> 324
/*   */     //   #11	-> 366
/*   */     //   #12	-> 370
/*   */     //   #13	-> 385
/*   */     //   #14	-> 394
/*   */     //   #15	-> 397
/*   */     //   #16	-> 440
/*   */     //   #17	-> 492
/*   */     //   #18	-> 496
/*   */     //   #19	-> 529
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   36	42	74	finally
/*   */     //   43	49	74	finally
/*   */     //   52	74	74	finally
/*   */     //   75	78	74	finally
/*   */     //   111	117	149	finally
/*   */     //   118	124	149	finally
/*   */     //   127	149	149	finally
/*   */     //   150	153	149	finally
/*   */     //   186	192	224	finally
/*   */     //   193	199	224	finally
/*   */     //   202	224	224	finally
/*   */     //   225	228	224	finally
/*   */     //   261	267	299	finally
/*   */     //   268	274	299	finally
/*   */     //   277	299	299	finally
/*   */     //   300	303	299	finally
/*   */     //   330	336	526	finally
/*   */     //   337	343	526	finally
/*   */     //   346	365	526	finally
/*   */     //   403	409	489	finally
/*   */     //   410	416	489	finally
/*   */     //   419	440	489	finally
/*   */     //   446	452	484	finally
/*   */     //   453	459	484	finally
/*   */     //   462	484	484	finally
/*   */     //   485	488	484	finally
/*   */     //   490	493	489	finally
/*   */     //   527	530	526	finally
/*   */   }
/*   */   
/*   */   public final void kX(byte paramByte) {
/*   */     if (paramByte < -1 || paramByte > 3)
/*   */       paramByte = -1; 
/*   */     this.l0 = paramByte;
/*   */     if ((fu() != paramByte))
/*   */       synchronized (this.ND) {
/*   */         for (Iterator<Runnable> iterator = this.ND.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run());
/*   */         /* monitor exit ThisExpression{ObjectType{java/util/ArrayList}} */
/*   */       }  
/*   */   }
/*   */   
/*   */   public final int Er0() {
/*   */     return this.bV;
/*   */   }
/*   */   
/*   */   public final int CE0() {
/*   */     int i;
/*   */     return ((i = Rr0()) < 6) ? 5 : ((i < 11) ? 1 : ((i < 18) ? 2 : ((i < 21) ? 3 : 4)));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/L70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */