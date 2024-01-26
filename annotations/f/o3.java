/*  1 */ package f;public final class o3 extends jo0 { public final void VG() { kt kt = null; of of; int i; if (this.o70 != null && (
/*    */       
/*  3 */       i = (of = (of)this.nV).lm) > 0) {
/*    */ 
/*    */       
/*  6 */       String str = of.F2.PH0.toString(); kt kt1;
/*  7 */       if ((kt1 = this.aU.O7) != null) kt = kt1.Ww(str);  if (kt == null) try { kt = this.o70.Nj0(str, i, this.aU.O7); } catch (Exception exception)
/*  8 */         { Logger.getLogger(o3.class.getName()).log(Level.SEVERE, "Exception while collecting auto completion results", exception); }  
/*  9 */     }  this.aU
/* 10 */       .O7 = kt; MQ[] arrayOfMQ;
/* 11 */     if ((arrayOfMQ = this.aU.rw) != null) for (int j = arrayOfMQ.length; i < j; ) { arrayOfMQ[i].kR(); i++; }   this
/* 12 */       .xA0 = false; bm0(); }
/*    */ 
/*    */   
/*    */   public final fD aU;
/*    */   public final Ga j50;
/*    */   public boolean xA0;
/*    */   public CF0 o70;
/*    */   
/*    */   public o3(of paramof) {
/*    */     super(paramof);
/*    */     fD fD1;
/*    */     mK0 mK0;
/*    */     this();
/*    */     this.aU = fD1;
/*    */     this(fD1);
/*    */     this.j50 = ga;
/*    */     J8(ga);
/*    */     this(this);
/*    */     Ga ga;
/*    */     (ga = new Ga()).rS(mK0);
/*    */   }
/*    */   
/*    */   public final String TI() {
/*    */     return "editfieldautocompletionwindow";
/*    */   }
/*    */   
/*    */   public final void mg0() {
/*    */     this.aU.O7 = null;
/*    */     MQ[] arrayOfMQ;
/*    */     if ((arrayOfMQ = this.aU.rw) != null) {
/*    */       int i;
/*    */       byte b;
/*    */       for (i = arrayOfMQ.length, b = 0; b < i; ) {
/*    */         arrayOfMQ[b].kR();
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     bm0();
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield cz0 : I
/*    */     //   4: invokestatic Wm0 : (I)Z
/*    */     //   7: ifeq -> 572
/*    */     //   10: aload_0
/*    */     //   11: getfield xA0 : Z
/*    */     //   14: ifeq -> 445
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual oO : ()Z
/*    */     //   21: ifeq -> 443
/*    */     //   24: aload_1
/*    */     //   25: getfield GG0 : I
/*    */     //   28: invokestatic Nk : (I)I
/*    */     //   31: dup
/*    */     //   32: istore_2
/*    */     //   33: iconst_3
/*    */     //   34: if_icmpeq -> 434
/*    */     //   37: iload_2
/*    */     //   38: bipush #66
/*    */     //   40: if_icmpeq -> 336
/*    */     //   43: iload_2
/*    */     //   44: bipush #111
/*    */     //   46: if_icmpeq -> 288
/*    */     //   49: iload_2
/*    */     //   50: bipush #123
/*    */     //   52: if_icmpeq -> 434
/*    */     //   55: iload_2
/*    */     //   56: bipush #92
/*    */     //   58: if_icmpeq -> 434
/*    */     //   61: iload_2
/*    */     //   62: bipush #93
/*    */     //   64: if_icmpeq -> 434
/*    */     //   67: iload_2
/*    */     //   68: tableswitch default -> 100, 19 -> 434, 20 -> 434, 21 -> 103, 22 -> 103
/*    */     //   100: goto -> 105
/*    */     //   103: iconst_0
/*    */     //   104: ireturn
/*    */     //   105: aload_1
/*    */     //   106: getfield cz0 : I
/*    */     //   109: bipush #9
/*    */     //   111: if_icmpne -> 126
/*    */     //   114: aload_1
/*    */     //   115: getfield Z9 : C
/*    */     //   118: ifeq -> 126
/*    */     //   121: iconst_1
/*    */     //   122: istore_2
/*    */     //   123: goto -> 128
/*    */     //   126: iconst_0
/*    */     //   127: istore_2
/*    */     //   128: iload_2
/*    */     //   129: ifne -> 141
/*    */     //   132: aload_1
/*    */     //   133: getfield GG0 : I
/*    */     //   136: bipush #67
/*    */     //   138: if_icmpne -> 443
/*    */     //   141: aload_0
/*    */     //   142: getfield j50 : Lf/Ga;
/*    */     //   145: getfield go : I
/*    */     //   148: dup
/*    */     //   149: istore_1
/*    */     //   150: iflt -> 235
/*    */     //   153: aload_0
/*    */     //   154: dup
/*    */     //   155: getfield nV : Lf/JG0;
/*    */     //   158: checkcast f/of
/*    */     //   161: aload_0
/*    */     //   162: getfield aU : Lf/fD;
/*    */     //   165: getfield O7 : Lf/kt;
/*    */     //   168: dup
/*    */     //   169: checkcast f/TW
/*    */     //   172: getfield FD0 : [Ljava/lang/String;
/*    */     //   175: iload_1
/*    */     //   176: aaload
/*    */     //   177: astore_1
/*    */     //   178: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   181: pop
/*    */     //   182: aload_1
/*    */     //   183: invokevirtual Zh : (Ljava/lang/String;)V
/*    */     //   186: getfield aU : Lf/fD;
/*    */     //   189: dup
/*    */     //   190: aconst_null
/*    */     //   191: putfield O7 : Lf/kt;
/*    */     //   194: getfield rw : [Lf/MQ;
/*    */     //   197: dup
/*    */     //   198: astore_1
/*    */     //   199: ifnull -> 226
/*    */     //   202: aload_1
/*    */     //   203: arraylength
/*    */     //   204: istore_2
/*    */     //   205: iconst_0
/*    */     //   206: istore_3
/*    */     //   207: iload_3
/*    */     //   208: iload_2
/*    */     //   209: if_icmpge -> 226
/*    */     //   212: aload_1
/*    */     //   213: iload_3
/*    */     //   214: aaload
/*    */     //   215: invokeinterface kR : ()V
/*    */     //   220: iinc #3, 1
/*    */     //   223: goto -> 207
/*    */     //   226: aload_0
/*    */     //   227: invokevirtual bm0 : ()V
/*    */     //   230: iconst_1
/*    */     //   231: istore_1
/*    */     //   232: goto -> 237
/*    */     //   235: iconst_0
/*    */     //   236: istore_1
/*    */     //   237: iload_1
/*    */     //   238: ifne -> 286
/*    */     //   241: aload_0
/*    */     //   242: getfield aU : Lf/fD;
/*    */     //   245: dup
/*    */     //   246: aconst_null
/*    */     //   247: putfield O7 : Lf/kt;
/*    */     //   250: getfield rw : [Lf/MQ;
/*    */     //   253: dup
/*    */     //   254: astore_1
/*    */     //   255: ifnull -> 282
/*    */     //   258: aload_1
/*    */     //   259: arraylength
/*    */     //   260: istore_2
/*    */     //   261: iconst_0
/*    */     //   262: istore_3
/*    */     //   263: iload_3
/*    */     //   264: iload_2
/*    */     //   265: if_icmpge -> 282
/*    */     //   268: aload_1
/*    */     //   269: iload_3
/*    */     //   270: aaload
/*    */     //   271: invokeinterface kR : ()V
/*    */     //   276: iinc #3, 1
/*    */     //   279: goto -> 263
/*    */     //   282: aload_0
/*    */     //   283: invokevirtual bm0 : ()V
/*    */     //   286: iconst_0
/*    */     //   287: ireturn
/*    */     //   288: aload_0
/*    */     //   289: getfield aU : Lf/fD;
/*    */     //   292: dup
/*    */     //   293: aconst_null
/*    */     //   294: putfield O7 : Lf/kt;
/*    */     //   297: getfield rw : [Lf/MQ;
/*    */     //   300: dup
/*    */     //   301: astore_1
/*    */     //   302: ifnull -> 329
/*    */     //   305: aload_1
/*    */     //   306: arraylength
/*    */     //   307: istore_2
/*    */     //   308: iconst_0
/*    */     //   309: istore_3
/*    */     //   310: iload_3
/*    */     //   311: iload_2
/*    */     //   312: if_icmpge -> 329
/*    */     //   315: aload_1
/*    */     //   316: iload_3
/*    */     //   317: aaload
/*    */     //   318: invokeinterface kR : ()V
/*    */     //   323: iinc #3, 1
/*    */     //   326: goto -> 310
/*    */     //   329: aload_0
/*    */     //   330: invokevirtual bm0 : ()V
/*    */     //   333: goto -> 443
/*    */     //   336: aload_0
/*    */     //   337: getfield j50 : Lf/Ga;
/*    */     //   340: getfield go : I
/*    */     //   343: dup
/*    */     //   344: istore_1
/*    */     //   345: iflt -> 430
/*    */     //   348: aload_0
/*    */     //   349: dup
/*    */     //   350: getfield nV : Lf/JG0;
/*    */     //   353: checkcast f/of
/*    */     //   356: aload_0
/*    */     //   357: getfield aU : Lf/fD;
/*    */     //   360: getfield O7 : Lf/kt;
/*    */     //   363: dup
/*    */     //   364: checkcast f/TW
/*    */     //   367: getfield FD0 : [Ljava/lang/String;
/*    */     //   370: iload_1
/*    */     //   371: aaload
/*    */     //   372: astore_1
/*    */     //   373: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   376: pop
/*    */     //   377: aload_1
/*    */     //   378: invokevirtual Zh : (Ljava/lang/String;)V
/*    */     //   381: getfield aU : Lf/fD;
/*    */     //   384: dup
/*    */     //   385: aconst_null
/*    */     //   386: putfield O7 : Lf/kt;
/*    */     //   389: getfield rw : [Lf/MQ;
/*    */     //   392: dup
/*    */     //   393: astore_1
/*    */     //   394: ifnull -> 421
/*    */     //   397: aload_1
/*    */     //   398: arraylength
/*    */     //   399: istore_2
/*    */     //   400: iconst_0
/*    */     //   401: istore_3
/*    */     //   402: iload_3
/*    */     //   403: iload_2
/*    */     //   404: if_icmpge -> 421
/*    */     //   407: aload_1
/*    */     //   408: iload_3
/*    */     //   409: aaload
/*    */     //   410: invokeinterface kR : ()V
/*    */     //   415: iinc #3, 1
/*    */     //   418: goto -> 402
/*    */     //   421: aload_0
/*    */     //   422: invokevirtual bm0 : ()V
/*    */     //   425: iconst_1
/*    */     //   426: istore_0
/*    */     //   427: goto -> 432
/*    */     //   430: iconst_0
/*    */     //   431: istore_0
/*    */     //   432: iload_0
/*    */     //   433: ireturn
/*    */     //   434: aload_0
/*    */     //   435: getfield j50 : Lf/Ga;
/*    */     //   438: aload_1
/*    */     //   439: invokevirtual i2 : (Lf/oa0;)Z
/*    */     //   442: pop
/*    */     //   443: iconst_1
/*    */     //   444: ireturn
/*    */     //   445: aload_1
/*    */     //   446: getfield GG0 : I
/*    */     //   449: invokestatic Nk : (I)I
/*    */     //   452: dup
/*    */     //   453: istore_2
/*    */     //   454: bipush #19
/*    */     //   456: if_icmpeq -> 550
/*    */     //   459: iload_2
/*    */     //   460: bipush #20
/*    */     //   462: if_icmpeq -> 550
/*    */     //   465: iload_2
/*    */     //   466: bipush #62
/*    */     //   468: if_icmpeq -> 532
/*    */     //   471: iload_2
/*    */     //   472: bipush #93
/*    */     //   474: if_icmpeq -> 550
/*    */     //   477: iload_2
/*    */     //   478: bipush #111
/*    */     //   480: if_icmpeq -> 485
/*    */     //   483: iconst_0
/*    */     //   484: ireturn
/*    */     //   485: aload_0
/*    */     //   486: getfield aU : Lf/fD;
/*    */     //   489: dup
/*    */     //   490: aconst_null
/*    */     //   491: putfield O7 : Lf/kt;
/*    */     //   494: getfield rw : [Lf/MQ;
/*    */     //   497: dup
/*    */     //   498: astore_1
/*    */     //   499: ifnull -> 526
/*    */     //   502: aload_1
/*    */     //   503: arraylength
/*    */     //   504: istore_2
/*    */     //   505: iconst_0
/*    */     //   506: istore_3
/*    */     //   507: iload_3
/*    */     //   508: iload_2
/*    */     //   509: if_icmpge -> 526
/*    */     //   512: aload_1
/*    */     //   513: iload_3
/*    */     //   514: aaload
/*    */     //   515: invokeinterface kR : ()V
/*    */     //   520: iinc #3, 1
/*    */     //   523: goto -> 507
/*    */     //   526: aload_0
/*    */     //   527: invokevirtual bm0 : ()V
/*    */     //   530: iconst_0
/*    */     //   531: ireturn
/*    */     //   532: aload_1
/*    */     //   533: getfield com8 : I
/*    */     //   536: bipush #36
/*    */     //   538: iand
/*    */     //   539: ifeq -> 548
/*    */     //   542: aload_0
/*    */     //   543: invokevirtual VG : ()V
/*    */     //   546: iconst_1
/*    */     //   547: ireturn
/*    */     //   548: iconst_0
/*    */     //   549: ireturn
/*    */     //   550: aload_0
/*    */     //   551: dup
/*    */     //   552: dup2
/*    */     //   553: getfield j50 : Lf/Ga;
/*    */     //   556: aload_1
/*    */     //   557: invokevirtual i2 : (Lf/oa0;)Z
/*    */     //   560: pop
/*    */     //   561: iconst_1
/*    */     //   562: putfield xA0 : Z
/*    */     //   565: invokevirtual bm0 : ()V
/*    */     //   568: getfield xA0 : Z
/*    */     //   571: ireturn
/*    */     //   572: aload_0
/*    */     //   573: aload_1
/*    */     //   574: invokespecial i2 : (Lf/oa0;)Z
/*    */     //   577: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 4
/*    */     //   #3	-> 11
/*    */     //   #4	-> 25
/*    */     //   #5	-> 28
/*    */     //   #6	-> 106
/*    */     //   #7	-> 133
/*    */     //   #8	-> 142
/*    */     //   #9	-> 145
/*    */     //   #10	-> 155
/*    */     //   #11	-> 158
/*    */     //   #12	-> 162
/*    */     //   #13	-> 165
/*    */     //   #14	-> 169
/*    */     //   #15	-> 172
/*    */     //   #16	-> 176
/*    */     //   #17	-> 178
/*    */     //   #18	-> 183
/*    */     //   #19	-> 186
/*    */     //   #20	-> 191
/*    */     //   #21	-> 194
/*    */     //   #22	-> 227
/*    */     //   #23	-> 242
/*    */     //   #24	-> 247
/*    */     //   #25	-> 250
/*    */     //   #26	-> 283
/*    */     //   #27	-> 289
/*    */     //   #28	-> 294
/*    */     //   #29	-> 297
/*    */     //   #30	-> 330
/*    */     //   #31	-> 337
/*    */     //   #32	-> 340
/*    */     //   #33	-> 350
/*    */     //   #34	-> 353
/*    */     //   #35	-> 357
/*    */     //   #36	-> 360
/*    */     //   #37	-> 364
/*    */     //   #38	-> 367
/*    */     //   #39	-> 371
/*    */     //   #40	-> 373
/*    */     //   #41	-> 378
/*    */     //   #42	-> 381
/*    */     //   #43	-> 386
/*    */     //   #44	-> 389
/*    */     //   #45	-> 422
/*    */     //   #46	-> 435
/*    */     //   #47	-> 446
/*    */     //   #48	-> 449
/*    */     //   #49	-> 486
/*    */     //   #50	-> 491
/*    */     //   #51	-> 494
/*    */     //   #52	-> 527
/*    */     //   #53	-> 533
/*    */     //   #54	-> 543
/*    */     //   #55	-> 562
/*    */     //   #56	-> 568
/*    */   }
/*    */   
/*    */   public final void bm0() {
/*    */     if (this.aU.pu() > 0) {
/*    */       OQ();
/*    */     } else {
/*    */       this.xA0 = false;
/*    */       throws throws;
/*    */       if ((throws = this.Bo0) != null)
/*    */         throws.Ek(this); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/o3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */