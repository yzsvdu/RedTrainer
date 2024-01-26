/*  1 */ package f;public final class qq0 extends kf { public final void d40() { super.d40(); int j = km.wI0.dG() / 2 - 400, k = (km.wI0.k1() - 500) / 4; this.W00.Tm(800, 115); int m; this.W00.ME(j, m = k + 336); this
/*  2 */       .n00.Tm(800, 115); this.n00
/*  3 */       .ME(j, m);
/*  4 */     this.FD0.Tm(800, 115); this.FD0
/*  5 */       .ME(j, m);
/*  6 */     this.gh0.Tm(800, 115); this.gh0
/*  7 */       .ME(j, m);
/*  8 */     this.If0.C70(et.Em); Ip ip; this.If0
/*    */ 
/*    */       
/* 11 */       .ME((ip = this.W00).Kd + 10, ip.er0 + 20);
/* 12 */     this.Nm0.Tm(800, 115); this.Nm0
/* 13 */       .ME(j, m);
/* 14 */     this.Sh0.mM(); this.Sh0.uh0(128, 24); this.Sh0
/*    */ 
/*    */ 
/*    */       
/* 18 */       .ME(this.Nm0.m40() - this.Sh0.xY, this.Nm0.mD() - this.Sh0.HC);
/* 19 */     this.ln
/* 20 */       .ME(j, k - 26);
/* 21 */     m = j + 5; int n = k - 11; this.hV
/* 22 */       .ME(m, n);
/* 23 */     m = j + 10; m = this.hV.Td0() + m; this.d
/* 24 */       .ME(m, k - 18);
/* 25 */     this.M80
/* 26 */       .ME(j + 792 - this.M80.Td0(), n); j = 0; WJ0[] arrayOfWJ0; while (j < (
/* 27 */       arrayOfWJ0 = this.rM).length) { boolean bool; n = km.wI0.dG() / 2 + 104; int i1 = (this.rM[j]).GA * 84 + k; WJ0 wJ02; (wJ02 = arrayOfWJ0[j])
/* 28 */         .hO
/* 29 */         .ME(n, i1); JG0 jG02;
/* 30 */       (arrayOfWJ0[j]).gP
/*    */ 
/*    */         
/* 33 */         .ME((jG02 = wJ02.hO).Kd + 150, jG02.er0 + 12);
/* 34 */       (arrayOfWJ0[j]).Ok
/*    */ 
/*    */         
/* 37 */         .ME((jG02 = wJ02.hO).Kd + 5, jG02.er0 + 12);
/* 38 */       (arrayOfWJ0[j]).X9
/*    */ 
/*    */         
/* 41 */         .ME((jG02 = wJ02.hO).Kd + 40, jG02.er0 + 30);
/* 42 */       (arrayOfWJ0[j]).LPT2
/*    */ 
/*    */         
/* 45 */         .ME((jG02 = wJ02.hO).Kd + 80, jG02.er0 + 30);
/* 46 */       (arrayOfWJ0[j]).YO
/*    */ 
/*    */         
/* 49 */         .ME((jG02 = wJ02.hO).Kd + 220, jG02.er0 + 44);
/* 50 */       (arrayOfWJ0[j]).si
/*    */ 
/*    */         
/* 53 */         .ME((jG02 = wJ02.hO).Kd + 2, jG02.er0 + 67);
/* 54 */       (arrayOfWJ0[j]).p90
/*    */ 
/*    */         
/* 57 */         .ME((jG02 = wJ02.hO).Kd + 12, jG02.er0 + 20); JG0 jG01;
/* 58 */       (arrayOfWJ0[j]).bZ
/*    */ 
/*    */         
/* 61 */         .ME((jG01 = wJ02.hO).Kd + 40, jG01.er0 + 70);
/* 62 */       WJ0 wJ01 = this.rM[j]; if (!this.Jj && this.b7 == -1) { bool = true; } else { bool = false; }  wJ01.Se(bool); j = (byte)(j + 1); }  mc[] arrayOfMc; for (j = 0; j < (arrayOfMc = this.Uq0).length; ) { arrayOfMc[j].uh0(200, 50); this.Uq0[j].Tm(200, 50); j++; }  rb0[] arrayOfRb0; for (j = 0; j < (arrayOfRb0 = this.S3).length; ) { int i1 = k + 120; arrayOfRb0[j]
/* 63 */         .ME(km.wI0.dG() / 2 + 100, (this.rM[j]).GA * 72 + i1); j = (byte)(j + 1); }
/* 64 */      int i = km.wI0.dG() / 2 - this.tR.Td0() / 2; this.tR
/* 65 */       .ME(i, k + 420);
/* 66 */     this.tR.mM(); }
/*    */ 
/*    */   
/*    */   public CQ RE;
/*    */   public dQ hV;
/*    */   public coM8 d;
/*    */   public dQ M80;
/*    */   public JG0 ln;
/*    */   public short dl0 = -1;
/*    */   public WJ0[] rM;
/*    */   public rb0[] S3;
/*    */   public dQ tR;
/*    */   public long c3 = 0L;
/*    */   public boolean rc = true;
/*    */   public boolean Jj;
/*    */   public int WG0 = -1;
/*    */   public byte b7 = -1;
/*    */   public long Pd0 = 0L;
/*    */   public byte synchronized = 0;
/*    */   
/*    */   public qq0(js paramjs, CQ paramCQ) {
/*    */     super(paramjs, paramCQ);
/*    */     this.RE = paramCQ;
/*    */     Xu("contestgui");
/*    */     if (!paramCQ.h2() && !paramCQ.sQ()) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     this.Jj = b;
/*    */     this.rM = new WJ0[paramCQ.H3()];
/*    */     byte b;
/*    */     for (b = 0; b < paramCQ.H3(); b++)
/*    */       this.rM[b] = new WJ0(this, (byte)b); 
/*    */     this.S3 = new rb0[paramCQ.H3()];
/*    */     for (b = 0; b < paramCQ.H3(); b++) {
/*    */       byte b1;
/*    */       this.S3[b] = new rb0(this.RE.N0(b1 = (byte)b, (byte)0), this.RE.wB(b1).K5());
/*    */       J8(this.S3[b]);
/*    */       this.S3[b].wI0(false);
/*    */     } 
/*    */     (this.tR = new dQ()).Xu("contestresulttext");
/*    */     J8(this.tR);
/*    */     this.tR.wI0(false);
/*    */     (this.ln = new JG0()).Xu("contest-frame");
/*    */     this.ln.Tm(800, 28);
/*    */     this.W00.Xu("contest-panel");
/*    */     this.Nm0.Xu("contest-panel");
/*    */     this.Sh0.Xu("contest-button-return");
/*    */     this.ec.Xu("contest-button");
/*    */     this.hV = new dQ(Ml0.OH0(1136));
/*    */     this.d = (new coM8(5)).Ml0((short)21, (short)0);
/*    */     (this.M80 = new dQ()).C70(et.COM2);
/*    */     J8(this.ln);
/*    */     J8(this.hV);
/*    */     J8(this.d);
/*    */     J8(this.M80);
/*    */     K9(false);
/*    */   }
/*    */   
/*    */   public final void ax() {
/*    */     (this.ec = new mc("", "")).Xu("contest-button");
/*    */     this.ec.tW(new cOM4(this));
/*    */     Un[] arrayOfUn;
/*    */     (arrayOfUn = new Un[1])[0] = this.ec;
/*    */     this.eO = new Un[1];
/*    */     Oi0(arrayOfUn, 1);
/*    */     al0(false);
/*    */     K9(false);
/*    */     this.W00.WN(this.W00.AUX(new JG0[] { this.ec }));
/*    */     this.W00.rK0(this.W00.vo0(new JG0[] { this.ec }));
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (!km.wI0.oq0)
/*    */       return super.i2(paramoa0); 
/*    */     if (this.b7 != -1 && B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (h1.J20(paramoa0.GG0, BM.bC) || h1.J20(paramoa0.GG0, BM.lc)))
/*    */       return true; 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: aload_1
/*    */     //   3: invokespecial V90 : (Lf/throws;)V
/*    */     //   6: getfield b7 : B
/*    */     //   9: dup
/*    */     //   10: istore_1
/*    */     //   11: ifge -> 17
/*    */     //   14: goto -> 549
/*    */     //   17: iload_1
/*    */     //   18: tableswitch default -> 48, 0 -> 458, 1 -> 318, 2 -> 166, 3 -> 51
/*    */     //   48: goto -> 549
/*    */     //   51: aload_0
/*    */     //   52: getfield tR : Lf/dQ;
/*    */     //   55: getfield db0 : Lf/I;
/*    */     //   58: dup
/*    */     //   59: astore_1
/*    */     //   60: getfield en : Z
/*    */     //   63: ifeq -> 69
/*    */     //   66: goto -> 549
/*    */     //   69: aload_0
/*    */     //   70: aload_1
/*    */     //   71: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   74: bipush #100
/*    */     //   76: invokevirtual sz : (Lf/pRn;I)V
/*    */     //   79: ldc ''
/*    */     //   81: astore_1
/*    */     //   82: ldc ''
/*    */     //   84: astore_2
/*    */     //   85: getfield RE : Lf/CQ;
/*    */     //   88: aload_0
/*    */     //   89: getfield synchronized : B
/*    */     //   92: invokevirtual wB : (B)Lf/QZ;
/*    */     //   95: dup
/*    */     //   96: astore_3
/*    */     //   97: ifnull -> 105
/*    */     //   100: aload_3
/*    */     //   101: invokevirtual dy : ()Ljava/lang/String;
/*    */     //   104: astore_1
/*    */     //   105: aload_0
/*    */     //   106: getfield RE : Lf/CQ;
/*    */     //   109: aload_0
/*    */     //   110: getfield synchronized : B
/*    */     //   113: iconst_0
/*    */     //   114: invokevirtual N0 : (BB)Lf/hm0;
/*    */     //   117: dup
/*    */     //   118: astore_3
/*    */     //   119: ifnull -> 127
/*    */     //   122: aload_3
/*    */     //   123: invokevirtual fA : ()Ljava/lang/String;
/*    */     //   126: astore_2
/*    */     //   127: aload_0
/*    */     //   128: getfield tR : Lf/dQ;
/*    */     //   131: iconst_4
/*    */     //   132: anewarray java/lang/String
/*    */     //   135: dup
/*    */     //   136: dup
/*    */     //   137: dup2
/*    */     //   138: astore_3
/*    */     //   139: iconst_0
/*    */     //   140: ldc ''
/*    */     //   142: aastore
/*    */     //   143: iconst_1
/*    */     //   144: ldc ''
/*    */     //   146: aastore
/*    */     //   147: iconst_2
/*    */     //   148: aload_1
/*    */     //   149: aastore
/*    */     //   150: iconst_3
/*    */     //   151: aload_2
/*    */     //   152: aastore
/*    */     //   153: ldc_w 311003
/*    */     //   156: aload_3
/*    */     //   157: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   160: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   163: goto -> 549
/*    */     //   166: aload_0
/*    */     //   167: getfield tR : Lf/dQ;
/*    */     //   170: getfield db0 : Lf/I;
/*    */     //   173: dup
/*    */     //   174: astore_1
/*    */     //   175: getfield en : Z
/*    */     //   178: ifeq -> 184
/*    */     //   181: goto -> 549
/*    */     //   184: aload_0
/*    */     //   185: aload_1
/*    */     //   186: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   189: bipush #100
/*    */     //   191: invokevirtual sz : (Lf/pRn;I)V
/*    */     //   194: getfield tR : Lf/dQ;
/*    */     //   197: ldc_w 311002
/*    */     //   200: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   203: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   206: iconst_0
/*    */     //   207: istore_1
/*    */     //   208: iconst_0
/*    */     //   209: istore_2
/*    */     //   210: iload_2
/*    */     //   211: iconst_4
/*    */     //   212: if_icmpge -> 258
/*    */     //   215: aload_0
/*    */     //   216: getfield S3 : [Lf/rb0;
/*    */     //   219: iload_2
/*    */     //   220: aaload
/*    */     //   221: dup
/*    */     //   222: astore_3
/*    */     //   223: iconst_1
/*    */     //   224: invokevirtual zx : (Z)Z
/*    */     //   227: ifeq -> 243
/*    */     //   230: aload_3
/*    */     //   231: iconst_0
/*    */     //   232: invokevirtual zx : (Z)Z
/*    */     //   235: ifeq -> 243
/*    */     //   238: iconst_1
/*    */     //   239: istore_3
/*    */     //   240: goto -> 245
/*    */     //   243: iconst_0
/*    */     //   244: istore_3
/*    */     //   245: iload_3
/*    */     //   246: ifeq -> 252
/*    */     //   249: iinc #1, 1
/*    */     //   252: iinc #2, 1
/*    */     //   255: goto -> 210
/*    */     //   258: iconst_0
/*    */     //   259: istore_2
/*    */     //   260: iload_2
/*    */     //   261: iconst_4
/*    */     //   262: if_icmpge -> 294
/*    */     //   265: aload_0
/*    */     //   266: getfield S3 : [Lf/rb0;
/*    */     //   269: iload_2
/*    */     //   270: aaload
/*    */     //   271: iconst_0
/*    */     //   272: invokevirtual zx : (Z)Z
/*    */     //   275: ifne -> 288
/*    */     //   278: aload_0
/*    */     //   279: getfield S3 : [Lf/rb0;
/*    */     //   282: iload_2
/*    */     //   283: aaload
/*    */     //   284: iconst_0
/*    */     //   285: invokevirtual Y6 : (Z)V
/*    */     //   288: iinc #2, 1
/*    */     //   291: goto -> 260
/*    */     //   294: iload_1
/*    */     //   295: iconst_4
/*    */     //   296: if_icmpne -> 549
/*    */     //   299: aload_0
/*    */     //   300: dup
/*    */     //   301: dup
/*    */     //   302: getstatic f/zm0.u20 : J
/*    */     //   305: putfield Pd0 : J
/*    */     //   308: iconst_3
/*    */     //   309: putfield b7 : B
/*    */     //   312: getfield tR : Lf/dQ;
/*    */     //   315: goto -> 447
/*    */     //   318: aload_0
/*    */     //   319: getfield tR : Lf/dQ;
/*    */     //   322: getfield db0 : Lf/I;
/*    */     //   325: dup
/*    */     //   326: astore_1
/*    */     //   327: getfield en : Z
/*    */     //   330: ifeq -> 336
/*    */     //   333: goto -> 549
/*    */     //   336: aload_0
/*    */     //   337: aload_1
/*    */     //   338: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   341: bipush #100
/*    */     //   343: invokevirtual sz : (Lf/pRn;I)V
/*    */     //   346: getfield tR : Lf/dQ;
/*    */     //   349: ldc_w 311001
/*    */     //   352: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   355: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   358: iconst_0
/*    */     //   359: istore_1
/*    */     //   360: iconst_0
/*    */     //   361: istore_2
/*    */     //   362: iload_2
/*    */     //   363: iconst_4
/*    */     //   364: if_icmpge -> 402
/*    */     //   367: aload_0
/*    */     //   368: getfield S3 : [Lf/rb0;
/*    */     //   371: iload_2
/*    */     //   372: aaload
/*    */     //   373: iconst_1
/*    */     //   374: invokevirtual zx : (Z)Z
/*    */     //   377: ifne -> 393
/*    */     //   380: aload_0
/*    */     //   381: getfield S3 : [Lf/rb0;
/*    */     //   384: iload_2
/*    */     //   385: aaload
/*    */     //   386: iconst_1
/*    */     //   387: invokevirtual Y6 : (Z)V
/*    */     //   390: goto -> 396
/*    */     //   393: iinc #1, 1
/*    */     //   396: iinc #2, 1
/*    */     //   399: goto -> 362
/*    */     //   402: iload_1
/*    */     //   403: iconst_4
/*    */     //   404: if_icmpne -> 549
/*    */     //   407: aload_0
/*    */     //   408: dup
/*    */     //   409: getfield b7 : B
/*    */     //   412: iconst_1
/*    */     //   413: iadd
/*    */     //   414: i2b
/*    */     //   415: putfield b7 : B
/*    */     //   418: iconst_0
/*    */     //   419: istore_1
/*    */     //   420: iload_1
/*    */     //   421: iconst_4
/*    */     //   422: if_icmpge -> 443
/*    */     //   425: aload_0
/*    */     //   426: getfield S3 : [Lf/rb0;
/*    */     //   429: iload_1
/*    */     //   430: aaload
/*    */     //   431: getstatic f/zm0.u20 : J
/*    */     //   434: putfield oD0 : J
/*    */     //   437: iinc #1, 1
/*    */     //   440: goto -> 420
/*    */     //   443: aload_0
/*    */     //   444: getfield tR : Lf/dQ;
/*    */     //   447: getfield db0 : Lf/I;
/*    */     //   450: bipush #100
/*    */     //   452: invokevirtual oC0 : (I)V
/*    */     //   455: goto -> 549
/*    */     //   458: aload_0
/*    */     //   459: dup
/*    */     //   460: getfield tR : Lf/dQ;
/*    */     //   463: getfield db0 : Lf/I;
/*    */     //   466: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   469: bipush #100
/*    */     //   471: invokevirtual sz : (Lf/pRn;I)V
/*    */     //   474: getfield tR : Lf/dQ;
/*    */     //   477: ldc_w 311000
/*    */     //   480: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   483: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   486: getstatic f/zm0.u20 : J
/*    */     //   489: aload_0
/*    */     //   490: getfield Pd0 : J
/*    */     //   493: ldc2_w 2000
/*    */     //   496: ladd
/*    */     //   497: lcmp
/*    */     //   498: ifle -> 549
/*    */     //   501: aload_0
/*    */     //   502: dup
/*    */     //   503: dup
/*    */     //   504: getfield tR : Lf/dQ;
/*    */     //   507: getfield db0 : Lf/I;
/*    */     //   510: bipush #100
/*    */     //   512: invokevirtual oC0 : (I)V
/*    */     //   515: getfield b7 : B
/*    */     //   518: iconst_1
/*    */     //   519: iadd
/*    */     //   520: i2b
/*    */     //   521: putfield b7 : B
/*    */     //   524: iconst_0
/*    */     //   525: istore_1
/*    */     //   526: iload_1
/*    */     //   527: iconst_4
/*    */     //   528: if_icmpge -> 549
/*    */     //   531: aload_0
/*    */     //   532: getfield S3 : [Lf/rb0;
/*    */     //   535: iload_1
/*    */     //   536: aaload
/*    */     //   537: getstatic f/zm0.u20 : J
/*    */     //   540: putfield oD0 : J
/*    */     //   543: iinc #1, 1
/*    */     //   546: goto -> 526
/*    */     //   549: aload_0
/*    */     //   550: getfield RE : Lf/CQ;
/*    */     //   553: getfield T20 : S
/*    */     //   556: dup
/*    */     //   557: istore_1
/*    */     //   558: iconst_1
/*    */     //   559: if_icmpge -> 564
/*    */     //   562: iconst_1
/*    */     //   563: istore_1
/*    */     //   564: iload_1
/*    */     //   565: aload_0
/*    */     //   566: getfield WG0 : I
/*    */     //   569: if_icmpeq -> 690
/*    */     //   572: aload_0
/*    */     //   573: iload_1
/*    */     //   574: putfield WG0 : I
/*    */     //   577: iconst_3
/*    */     //   578: anewarray java/lang/String
/*    */     //   581: dup
/*    */     //   582: dup2
/*    */     //   583: astore_2
/*    */     //   584: iconst_0
/*    */     //   585: ldc ''
/*    */     //   587: aastore
/*    */     //   588: iconst_1
/*    */     //   589: ldc ''
/*    */     //   591: aastore
/*    */     //   592: new java/lang/StringBuilder
/*    */     //   595: dup
/*    */     //   596: iload_1
/*    */     //   597: swap
/*    */     //   598: invokespecial <init> : ()V
/*    */     //   601: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   604: ldc ''
/*    */     //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   609: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   612: iconst_2
/*    */     //   613: swap
/*    */     //   614: aastore
/*    */     //   615: ldc_w 310266
/*    */     //   618: aload_2
/*    */     //   619: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   622: ldc_w '\\n'
/*    */     //   625: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   628: dup
/*    */     //   629: astore_1
/*    */     //   630: arraylength
/*    */     //   631: iconst_2
/*    */     //   632: if_icmpge -> 652
/*    */     //   635: iconst_2
/*    */     //   636: anewarray java/lang/String
/*    */     //   639: dup
/*    */     //   640: dup
/*    */     //   641: astore_1
/*    */     //   642: iconst_0
/*    */     //   643: ldc_w 'ERROR'
/*    */     //   646: aastore
/*    */     //   647: iconst_1
/*    */     //   648: ldc_w '--'
/*    */     //   651: aastore
/*    */     //   652: aload_0
/*    */     //   653: dup
/*    */     //   654: dup
/*    */     //   655: aload_1
/*    */     //   656: dup
/*    */     //   657: iconst_0
/*    */     //   658: aaload
/*    */     //   659: invokevirtual toUpperCase : ()Ljava/lang/String;
/*    */     //   662: astore_0
/*    */     //   663: iconst_0
/*    */     //   664: aload_0
/*    */     //   665: aastore
/*    */     //   666: getfield M80 : Lf/dQ;
/*    */     //   669: aload_0
/*    */     //   670: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   673: getfield ec : Lf/mc;
/*    */     //   676: aload_1
/*    */     //   677: iconst_0
/*    */     //   678: aaload
/*    */     //   679: invokevirtual s6 : (Ljava/lang/String;)V
/*    */     //   682: getfield ec : Lf/mc;
/*    */     //   685: ldc ''
/*    */     //   687: invokevirtual Ep0 : (Ljava/lang/String;)V
/*    */     //   690: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 55
/*    */     //   #3	-> 60
/*    */     //   #4	-> 71
/*    */     //   #5	-> 170
/*    */     //   #6	-> 175
/*    */     //   #7	-> 186
/*    */     //   #8	-> 224
/*    */     //   #9	-> 232
/*    */     //   #10	-> 266
/*    */     //   #11	-> 302
/*    */     //   #12	-> 305
/*    */     //   #13	-> 322
/*    */     //   #14	-> 327
/*    */     //   #15	-> 338
/*    */     //   #16	-> 431
/*    */     //   #17	-> 434
/*    */     //   #18	-> 444
/*    */     //   #19	-> 447
/*    */     //   #20	-> 452
/*    */     //   #21	-> 463
/*    */     //   #22	-> 466
/*    */     //   #23	-> 486
/*    */     //   #24	-> 490
/*    */     //   #25	-> 507
/*    */     //   #26	-> 512
/*    */     //   #27	-> 537
/*    */     //   #28	-> 540
/*    */     //   #29	-> 550
/*    */     //   #30	-> 553
/*    */     //   #31	-> 566
/*    */   }
/*    */   
/*    */   public final void ny(boolean paramBoolean1, boolean paramBoolean2) {
/*    */     super.ny(paramBoolean1, false);
/*    */   }
/*    */   
/*    */   public final void K9(boolean paramBoolean) {
/*    */     if (this.rM == null)
/*    */       return; 
/*    */     for (byte b1 = 0; b1 < this.RE.H3(); ) {
/*    */       hm0 hm0;
/*    */       if ((hm0 = this.RE.N0(b1, (byte)0)) != null) {
/*    */         boolean bool;
/*    */         wJ0.Ok.E1(hm0.fA());
/*    */         WJ0 wJ0;
/*    */         kn0 kn01;
/*    */         (wJ0 = this.rM[b1]).GA = (kn01 = hm0.Ui0).x80;
/*    */         short s1 = 1000;
/*    */         Ma0 ma0;
/*    */         short s = kn01.re;
/*    */         (this.rM[b1]).bZ.P4 = s1;
/*    */         (this.rM[b1]).bZ.S90 = false;
/*    */         if (!paramBoolean) {
/*    */           ma0.uH = s;
/*    */           ma0.Nu((s * 100 / s1) / 100.0F);
/*    */         } 
/*    */         coM8 coM82;
/*    */         kn0 kn02;
/*    */         (coM82 = wJ0.LPT2).H3 = s1 = (byte)((kn02 = hm0.Ui0).q70 / 10);
/*    */         long l = zm0.u20;
/*    */         if (!paramBoolean)
/*    */           coM82.pw = s1; 
/*    */         rN.xh = s1 = (byte)(kn02.dw / 10);
/*    */         RN rN;
/*    */         (rN = wJ0.p90).Pc0 = l;
/*    */         if (!paramBoolean)
/*    */           rN.lh = s1; 
/*    */         hp0 hp0 = wJ0.si;
/*    */         if (kn02.pg > 0) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         hp0.G1 = bool;
/*    */         wJ0.bZ.cZ();
/*    */         wJ0.Ok.VH(null);
/*    */         wJ0.Ok.z4 = hm0.I9();
/*    */         wJ0.Ok.zn();
/*    */         wJ0.Ok.jl = 0;
/*    */         byte b2;
/*    */         if ((b2 = hm0.Ui0.fh) < 0) {
/*    */           wJ0.X9.TS.H();
/*    */         } else {
/*    */           rH rH = wJ0.X9.TS;
/*    */           zh0[] arrayOfZh0 = new zh0[1];
/*    */           boolean bool1 = false;
/*    */           a80 a80 = a80.Oz0;
/*    */           if (b2 < 0 || b2 >= a80.CB.length)
/*    */             b2 = 0; 
/*    */           arrayOfZh0[bool1] = a80.CB[b2];
/*    */           rH.sm(arrayOfZh0);
/*    */         } 
/*    */         switch (hm0.Ui0.MK0) {
/*    */           default:
/*    */             wJ0.YO.E1("");
/*    */             break;
/*    */           case 4:
/*    */             wJ0.YO.E1("Next ??");
/*    */             break;
/*    */           case 0:
/*    */           case 1:
/*    */           case 2:
/*    */           case 3:
/*    */             wJ0.YO.E1(B40.df("Next #").append(hm0.Ui0.MK0 + 1).toString());
/*    */             break;
/*    */         } 
/*    */       } else {
/*    */         this.rM[b1].Se(false);
/*    */       } 
/*    */       b1 = (byte)(b1 + 1);
/*    */     } 
/*    */     coM8 coM81;
/*    */     byte b = this.RE.JH;
/*    */     this.d.Bl = zm0.u20;
/*    */     if (!paramBoolean)
/*    */       coM81.pw = b; 
/*    */   }
/*    */   
/*    */   public final boolean Eq0() {
/*    */     WJ0[] arrayOfWJ0;
/*    */     for (byte b = 0; b < (arrayOfWJ0 = this.rM).length; ) {
/*    */       WJ0 wJ0;
/*    */       coM8 coM81;
/*    */       if ((wJ0 = arrayOfWJ0[b]).hO.dP && (coM81 = wJ0.LPT2).dP) {
/*    */         boolean bool1;
/*    */         boolean bool3;
/*    */         boolean bool2;
/*    */         if (coM81.H3 == coM81.pw && zm0.u20 - coM81.Bl > 250L) {
/*    */           bool3 = true;
/*    */         } else {
/*    */           bool3 = false;
/*    */         } 
/*    */         if (!bool3)
/*    */           return false; 
/*    */         Ma0 ma0;
/*    */         if ((ma0 = wJ0.bZ).uH == ma0.Yc) {
/*    */           bool2 = true;
/*    */         } else {
/*    */           bool2 = false;
/*    */         } 
/*    */         if (!bool2)
/*    */           return false; 
/*    */         RN rN;
/*    */         if ((rN = wJ0.p90).xh == rN.lh && zm0.u20 - rN.Pc0 > 250L) {
/*    */           bool1 = true;
/*    */         } else {
/*    */           bool1 = false;
/*    */         } 
/*    */         if (!bool1)
/*    */           return false; 
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */     return true;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */