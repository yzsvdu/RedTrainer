/*  1 */ package f;public final class lO extends Wr { private void QG(of paramof) { if (this.w.WW() == null) js.vu0
/*  2 */         .Pu(-1, "Select event type first"); 
/*  3 */     if (paramof.F2
/*  4 */       .PH0
/*  5 */       .toString()
/*  6 */       .isEmpty()) {
/*  7 */       js.vu0
/*  8 */         .Pu(-1, "Name can't be empty."); return;
/*  9 */     }  this(); BC0 bC0; bC0
/*    */ 
/*    */ 
/*    */       
/* 13 */       .Xo0 = paramof.F2.PH0.toString();
/*    */     int i;
/* 15 */     bC0.UG = (short)(i = this.Gg0.hk); bC0.hh = (short)i;
/*    */     
/* 17 */     bC0.Mn = (short)this.Ks.hk;
/*    */ 
/*    */     
/* 20 */     bC0.bs0 = C80[this.uL0.Wa0.go];
/*    */     
/* 22 */     bC0.dl = (byte)this.e10.hk;
/*    */     
/* 24 */     bC0.X7 = (byte)this.Q10.hk;
/*    */ 
/*    */     
/* 27 */     bC0.LJ = this.dg[this.v9.Wa0.go];
/*    */ 
/*    */     
/*    */     try { wR wR;
/* 31 */       bC0.jx0 = Integer.parseInt(this.PP.F2.PH0.toString());
/*    */ 
/*    */       
/* 34 */       (bC0 = new BC0()).WI = this.LH0.TG0.nm0();
/*    */ 
/*    */       
/* 37 */       byte[] arrayOfByte1 = new byte[this.Nh0.Fj.size()];
/*    */ 
/*    */       
/* 40 */       byte[] arrayOfByte2 = new byte[this.Nh0.Fj.size()]; byte b = 0; while (b < this.Nh0
/* 41 */         .Fj
/* 42 */         .size())
/*    */       
/*    */       { 
/*    */         
/* 46 */         arrayOfByte1[b] = w4.Ol0
/* 47 */           .kH0; W4 w4;
/* 48 */         arrayOfByte2[b] = (w4 = this.Nh0.Fj.get(b)).coM9; b++; }  bC0.Cd0 = arrayOfByte1; bC0.LK0 = arrayOfByte2; this.sC0.i3(bC0); ((ArrayList<BC0>)this.R2
/*    */ 
/*    */         
/* 51 */         .MF(Byte.valueOf(((Uj)this.w.WW()).D), null))
/* 52 */         .add(bC0); Ga ga;
/* 53 */       cQ cQ = (ga = this.XZ).my; b = 0; while (b < ga
/* 54 */         .nN) { if (cQ
/* 55 */           .c90(b).equals(bC0))
/* 56 */         { RJ rJ = RJ.QE0; ga.zy0(b, true, rJ); break; }  b++; }
/* 57 */        hZ hZ = UB0.vj0.N0("./cache/npc.presets");
/*    */       
/* 59 */       this(hZ.ud0(null)); this.zx0.oS(wR); this.zx0.Qd(); Uj[] arrayOfUj; for (int j = (arrayOfUj = Uj.j50).length; b < j; ) { Uj uj = arrayOfUj[b]; this.zx0
/*    */ 
/*    */ 
/*    */           
/* 63 */           .Vp0(uj.name(), this.R2.MF(Byte.valueOf(uj.D), null), ArrayList.class, BC0.class); b++; }  this.zx0.cd0(); try { wR.close(); return; } catch (IOException iOException) { throw new RuntimeException(this); }  }
/* 64 */     catch (NumberFormatException numberFormatException) { printStackTrace();
/* 65 */       js.vu0
/* 66 */         .Pu(-1, "Error on script number format.");
/*    */       return; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final U70[] OB = new U70[0];
/*    */   public static final byte[] C80 = new byte[] { 0, 1, 2, 3, 4, 10 };
/*    */   public It zx0;
/*    */   public final SA m5;
/*    */   public W1 uL0;
/*    */   public W1 K80;
/*    */   public W1 w;
/*    */   public zT Ks;
/*    */   public zT k10;
/*    */   public bc ZW;
/*    */   public rh wD;
/*    */   public of PP;
/*    */   public zT Gg0;
/*    */   public rh yJ;
/*    */   public zT Rg;
/*    */   public rh So;
/*    */   public ge0 sl;
/*    */   public ge0 LH0;
/*    */   public Lj0 oI;
/*    */   public ge0 oM;
/*    */   public zT e10;
/*    */   public zT Q10;
/*    */   public W1 v9;
/*    */   public Un zL0;
/*    */   public Un Ls;
/*    */   public vF0 Ug0;
/*    */   public lpt1 Op0;
/*    */   public byte mn;
/*    */   public byte Com8;
/*    */   public U70[] hH0;
/*    */   public OZ Nh0;
/*    */   public Ga ba;
/*    */   public eM R2;
/*    */   public OZ sC0;
/*    */   public Ga XZ;
/*    */   public byte[] dg;
/*    */   
/*    */   public lO() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup2
/*    */     //   3: dup2
/*    */     //   4: dup2
/*    */     //   5: dup2
/*    */     //   6: dup2
/*    */     //   7: dup2
/*    */     //   8: dup2
/*    */     //   9: invokespecial <init> : ()V
/*    */     //   12: iconst_m1
/*    */     //   13: putfield mn : B
/*    */     //   16: iconst_m1
/*    */     //   17: putfield Com8 : B
/*    */     //   20: getstatic f/lO.OB : [Lf/U70;
/*    */     //   23: putfield hH0 : [Lf/U70;
/*    */     //   26: new f/OZ
/*    */     //   29: dup
/*    */     //   30: invokespecial <init> : ()V
/*    */     //   33: putfield Nh0 : Lf/OZ;
/*    */     //   36: new f/eM
/*    */     //   39: dup
/*    */     //   40: invokespecial <init> : ()V
/*    */     //   43: putfield R2 : Lf/eM;
/*    */     //   46: new f/OZ
/*    */     //   49: dup
/*    */     //   50: invokespecial <init> : ()V
/*    */     //   53: putfield sC0 : Lf/OZ;
/*    */     //   56: new f/It
/*    */     //   59: dup
/*    */     //   60: aload_0
/*    */     //   61: swap
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: putfield zx0 : Lf/It;
/*    */     //   69: getstatic f/BB.NH0 : Lf/BB;
/*    */     //   72: invokevirtual C70 : (Lf/BB;)V
/*    */     //   75: invokevirtual nj0 : ()V
/*    */     //   78: new f/SA
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: astore_1
/*    */     //   84: invokespecial <init> : ()V
/*    */     //   87: putfield m5 : Lf/SA;
/*    */     //   90: aload_1
/*    */     //   91: new f/YA0
/*    */     //   94: dup
/*    */     //   95: dup
/*    */     //   96: astore_2
/*    */     //   97: aload_1
/*    */     //   98: invokespecial <init> : (Lf/SA;)V
/*    */     //   101: invokevirtual oU : ()V
/*    */     //   104: invokevirtual HI0 : ()Lf/ZP;
/*    */     //   107: checkcast f/SA
/*    */     //   110: invokevirtual yh0 : ()V
/*    */     //   113: iconst_1
/*    */     //   114: invokevirtual EP : (I)V
/*    */     //   117: ldc 'adminframe'
/*    */     //   119: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   122: ldc 'Event NPC Tool'
/*    */     //   124: invokevirtual Lo : (Ljava/lang/String;)V
/*    */     //   127: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   132: invokevirtual TG0 : (Ljava/lang/Runnable;)V
/*    */     //   135: new f/vF0
/*    */     //   138: dup
/*    */     //   139: aload_0
/*    */     //   140: swap
/*    */     //   141: dup
/*    */     //   142: invokespecial <init> : ()V
/*    */     //   145: putfield Ug0 : Lf/vF0;
/*    */     //   148: sipush #128
/*    */     //   151: sipush #128
/*    */     //   154: invokevirtual Tm : (II)Z
/*    */     //   157: pop
/*    */     //   158: getfield Ug0 : Lf/vF0;
/*    */     //   161: invokevirtual ZH0 : ()Lf/rH;
/*    */     //   164: ldc 3.0
/*    */     //   166: invokevirtual Ii0 : (F)V
/*    */     //   169: getfield Ug0 : Lf/vF0;
/*    */     //   172: invokevirtual ZH0 : ()Lf/rH;
/*    */     //   175: iconst_0
/*    */     //   176: bipush #32
/*    */     //   178: invokevirtual zT : (II)Lf/JG0;
/*    */     //   181: pop
/*    */     //   182: new f/OZ
/*    */     //   185: dup
/*    */     //   186: astore_1
/*    */     //   187: invokespecial <init> : ()V
/*    */     //   190: getstatic f/lO.C80 : [B
/*    */     //   193: astore_3
/*    */     //   194: bipush #6
/*    */     //   196: istore #4
/*    */     //   198: iconst_0
/*    */     //   199: istore #5
/*    */     //   201: iload #5
/*    */     //   203: iload #4
/*    */     //   205: if_icmpge -> 244
/*    */     //   208: aload_3
/*    */     //   209: iload #5
/*    */     //   211: baload
/*    */     //   212: dup
/*    */     //   213: istore #6
/*    */     //   215: bipush #10
/*    */     //   217: if_icmpne -> 229
/*    */     //   220: aload_1
/*    */     //   221: ldc 'Custom'
/*    */     //   223: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   226: goto -> 238
/*    */     //   229: aload_1
/*    */     //   230: iload #6
/*    */     //   232: invokestatic zd : (B)Ljava/lang/String;
/*    */     //   235: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   238: iinc #5, 1
/*    */     //   241: goto -> 201
/*    */     //   244: aload_0
/*    */     //   245: dup
/*    */     //   246: dup2
/*    */     //   247: dup2
/*    */     //   248: dup2
/*    */     //   249: dup2
/*    */     //   250: dup2
/*    */     //   251: dup2
/*    */     //   252: dup2
/*    */     //   253: dup2
/*    */     //   254: dup2
/*    */     //   255: dup2
/*    */     //   256: dup2
/*    */     //   257: dup2
/*    */     //   258: dup2
/*    */     //   259: dup2
/*    */     //   260: dup2
/*    */     //   261: dup2
/*    */     //   262: dup2
/*    */     //   263: dup2
/*    */     //   264: new f/W1
/*    */     //   267: dup
/*    */     //   268: aload_0
/*    */     //   269: swap
/*    */     //   270: dup
/*    */     //   271: aload_1
/*    */     //   272: invokespecial <init> : (Lf/cQ;)V
/*    */     //   275: putfield uL0 : Lf/W1;
/*    */     //   278: iconst_0
/*    */     //   279: invokevirtual Z30 : (I)V
/*    */     //   282: getfield uL0 : Lf/W1;
/*    */     //   285: aload_0
/*    */     //   286: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   291: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   294: new f/W1
/*    */     //   297: dup
/*    */     //   298: aload_0
/*    */     //   299: swap
/*    */     //   300: dup
/*    */     //   301: aload_1
/*    */     //   302: invokespecial <init> : (Lf/cQ;)V
/*    */     //   305: putfield K80 : Lf/W1;
/*    */     //   308: invokestatic fJ : ()B
/*    */     //   311: invokevirtual Z30 : (I)V
/*    */     //   314: getfield K80 : Lf/W1;
/*    */     //   317: iconst_0
/*    */     //   318: invokevirtual sk0 : (Z)V
/*    */     //   321: new f/OZ
/*    */     //   324: dup
/*    */     //   325: astore_1
/*    */     //   326: invokestatic values : ()[Lf/Uj;
/*    */     //   329: invokespecial <init> : ([Ljava/lang/Object;)V
/*    */     //   332: new f/W1
/*    */     //   335: dup
/*    */     //   336: astore_3
/*    */     //   337: aload_0
/*    */     //   338: dup
/*    */     //   339: aload_3
/*    */     //   340: dup
/*    */     //   341: aload_1
/*    */     //   342: invokespecial <init> : (Lf/cQ;)V
/*    */     //   345: putfield w : Lf/W1;
/*    */     //   348: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   353: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   356: new f/zT
/*    */     //   359: dup
/*    */     //   360: iconst_0
/*    */     //   361: sipush #10000
/*    */     //   364: iconst_0
/*    */     //   365: invokespecial <init> : (III)V
/*    */     //   368: putfield Ks : Lf/zT;
/*    */     //   371: new f/rh
/*    */     //   374: dup
/*    */     //   375: astore_1
/*    */     //   376: aload_0
/*    */     //   377: getfield Ks : Lf/zT;
/*    */     //   380: invokespecial <init> : (Lf/er;)V
/*    */     //   383: getfield Ks : Lf/zT;
/*    */     //   386: aload_0
/*    */     //   387: aload_1
/*    */     //   388: <illegal opcode> run : (Lf/lO;Lf/rh;)Ljava/lang/Runnable;
/*    */     //   393: invokevirtual Ac0 : (Ljava/lang/Runnable;)V
/*    */     //   396: new f/zT
/*    */     //   399: dup
/*    */     //   400: iconst_0
/*    */     //   401: iconst_4
/*    */     //   402: iconst_0
/*    */     //   403: invokespecial <init> : (III)V
/*    */     //   406: putfield e10 : Lf/zT;
/*    */     //   409: new f/rh
/*    */     //   412: dup
/*    */     //   413: astore_3
/*    */     //   414: aload_0
/*    */     //   415: getfield e10 : Lf/zT;
/*    */     //   418: invokespecial <init> : (Lf/er;)V
/*    */     //   421: new f/zT
/*    */     //   424: dup
/*    */     //   425: iconst_0
/*    */     //   426: iconst_4
/*    */     //   427: iconst_0
/*    */     //   428: invokespecial <init> : (III)V
/*    */     //   431: putfield Q10 : Lf/zT;
/*    */     //   434: new f/rh
/*    */     //   437: dup
/*    */     //   438: astore #4
/*    */     //   440: aload_0
/*    */     //   441: getfield Q10 : Lf/zT;
/*    */     //   444: invokespecial <init> : (Lf/er;)V
/*    */     //   447: new f/of
/*    */     //   450: dup
/*    */     //   451: aload_0
/*    */     //   452: swap
/*    */     //   453: dup
/*    */     //   454: invokespecial <init> : ()V
/*    */     //   457: putfield PP : Lf/of;
/*    */     //   460: ldc_w '0'
/*    */     //   463: invokevirtual Zh : (Ljava/lang/String;)V
/*    */     //   466: new f/zT
/*    */     //   469: dup
/*    */     //   470: iconst_m1
/*    */     //   471: ldc_w 65535
/*    */     //   474: iconst_m1
/*    */     //   475: invokespecial <init> : (III)V
/*    */     //   478: putfield Gg0 : Lf/zT;
/*    */     //   481: new f/rh
/*    */     //   484: dup
/*    */     //   485: aload_0
/*    */     //   486: getfield Gg0 : Lf/zT;
/*    */     //   489: invokespecial <init> : (Lf/er;)V
/*    */     //   492: putfield yJ : Lf/rh;
/*    */     //   495: new f/zT
/*    */     //   498: dup
/*    */     //   499: iconst_m1
/*    */     //   500: ldc_w 65535
/*    */     //   503: iconst_m1
/*    */     //   504: invokespecial <init> : (III)V
/*    */     //   507: putfield Rg : Lf/zT;
/*    */     //   510: new f/rh
/*    */     //   513: dup
/*    */     //   514: aload_0
/*    */     //   515: getfield Rg : Lf/zT;
/*    */     //   518: invokespecial <init> : (Lf/er;)V
/*    */     //   521: putfield So : Lf/rh;
/*    */     //   524: new f/zT
/*    */     //   527: dup
/*    */     //   528: iconst_0
/*    */     //   529: bipush #50
/*    */     //   531: iconst_0
/*    */     //   532: invokespecial <init> : (III)V
/*    */     //   535: putfield k10 : Lf/zT;
/*    */     //   538: new f/rh
/*    */     //   541: dup
/*    */     //   542: aload_0
/*    */     //   543: getfield k10 : Lf/zT;
/*    */     //   546: invokespecial <init> : (Lf/er;)V
/*    */     //   549: putfield wD : Lf/rh;
/*    */     //   552: getfield Ks : Lf/zT;
/*    */     //   555: aload_0
/*    */     //   556: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   561: invokevirtual Ac0 : (Ljava/lang/Runnable;)V
/*    */     //   564: getfield k10 : Lf/zT;
/*    */     //   567: aload_0
/*    */     //   568: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   573: invokevirtual Ac0 : (Ljava/lang/Runnable;)V
/*    */     //   576: new f/W1
/*    */     //   579: dup
/*    */     //   580: invokespecial <init> : ()V
/*    */     //   583: putfield v9 : Lf/W1;
/*    */     //   586: new f/ge0
/*    */     //   589: dup
/*    */     //   590: aload_0
/*    */     //   591: swap
/*    */     //   592: dup
/*    */     //   593: invokespecial <init> : ()V
/*    */     //   596: putfield sl : Lf/ge0;
/*    */     //   599: iconst_0
/*    */     //   600: invokevirtual zs : (Z)V
/*    */     //   603: new f/ge0
/*    */     //   606: dup
/*    */     //   607: aload_0
/*    */     //   608: swap
/*    */     //   609: dup
/*    */     //   610: invokespecial <init> : ()V
/*    */     //   613: putfield LH0 : Lf/ge0;
/*    */     //   616: iconst_0
/*    */     //   617: invokevirtual zs : (Z)V
/*    */     //   620: new f/bc
/*    */     //   623: dup
/*    */     //   624: invokespecial <init> : ()V
/*    */     //   627: putfield ZW : Lf/bc;
/*    */     //   630: new f/Lj0
/*    */     //   633: dup
/*    */     //   634: aload_0
/*    */     //   635: swap
/*    */     //   636: dup
/*    */     //   637: aload_0
/*    */     //   638: getfield ZW : Lf/bc;
/*    */     //   641: invokespecial <init> : (Lf/jg;)V
/*    */     //   644: putfield oI : Lf/Lj0;
/*    */     //   647: fconst_1
/*    */     //   648: invokevirtual MF0 : (F)V
/*    */     //   651: new f/ge0
/*    */     //   654: dup
/*    */     //   655: aload_0
/*    */     //   656: swap
/*    */     //   657: dup
/*    */     //   658: invokespecial <init> : ()V
/*    */     //   661: putfield oM : Lf/ge0;
/*    */     //   664: iconst_0
/*    */     //   665: invokevirtual zs : (Z)V
/*    */     //   668: getfield m5 : Lf/SA;
/*    */     //   671: iconst_0
/*    */     //   672: invokevirtual JP : (I)Lf/nJ0;
/*    */     //   675: invokevirtual fu : ()Lf/nJ0;
/*    */     //   678: pop
/*    */     //   679: getfield m5 : Lf/SA;
/*    */     //   682: iconst_1
/*    */     //   683: invokevirtual JP : (I)Lf/nJ0;
/*    */     //   686: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   689: pop
/*    */     //   690: getfield m5 : Lf/SA;
/*    */     //   693: new f/dQ
/*    */     //   696: dup
/*    */     //   697: ldc_w 'Current Region ID: '
/*    */     //   700: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   703: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   706: aload_0
/*    */     //   707: getfield K80 : Lf/W1;
/*    */     //   710: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   713: invokevirtual fu : ()Lf/nJ0;
/*    */     //   716: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   719: pop
/*    */     //   720: getfield m5 : Lf/SA;
/*    */     //   723: new f/dQ
/*    */     //   726: dup
/*    */     //   727: ldc_w 'EventID: '
/*    */     //   730: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   733: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   736: aload_0
/*    */     //   737: getfield w : Lf/W1;
/*    */     //   740: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   743: invokevirtual fu : ()Lf/nJ0;
/*    */     //   746: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   749: pop
/*    */     //   750: getfield m5 : Lf/SA;
/*    */     //   753: new f/dQ
/*    */     //   756: dup
/*    */     //   757: ldc_w 'Sprite Region ID: '
/*    */     //   760: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   763: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   766: aload_0
/*    */     //   767: getfield uL0 : Lf/W1;
/*    */     //   770: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   773: invokevirtual fu : ()Lf/nJ0;
/*    */     //   776: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   779: pop
/*    */     //   780: getfield m5 : Lf/SA;
/*    */     //   783: new f/dQ
/*    */     //   786: dup
/*    */     //   787: ldc_w 'Sprite ID: '
/*    */     //   790: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   793: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   796: aload_1
/*    */     //   797: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   800: invokevirtual fu : ()Lf/nJ0;
/*    */     //   803: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   806: pop
/*    */     //   807: getfield m5 : Lf/SA;
/*    */     //   810: new f/dQ
/*    */     //   813: dup
/*    */     //   814: ldc_w 'Frame ID (Preview Only): '
/*    */     //   817: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   820: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   823: aload_0
/*    */     //   824: getfield wD : Lf/rh;
/*    */     //   827: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   830: invokevirtual fu : ()Lf/nJ0;
/*    */     //   833: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   836: pop
/*    */     //   837: getfield m5 : Lf/SA;
/*    */     //   840: new f/dQ
/*    */     //   843: dup
/*    */     //   844: ldc_w 'Movement Type'
/*    */     //   847: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   850: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   853: aload_0
/*    */     //   854: getfield v9 : Lf/W1;
/*    */     //   857: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   860: ldc_w 300.0
/*    */     //   863: invokevirtual Ig0 : (F)Lf/nJ0;
/*    */     //   866: invokevirtual fu : ()Lf/nJ0;
/*    */     //   869: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   872: pop
/*    */     //   873: getfield m5 : Lf/SA;
/*    */     //   876: new f/dQ
/*    */     //   879: dup
/*    */     //   880: ldc_w 'Movement Leash X'
/*    */     //   883: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   886: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   889: aload_3
/*    */     //   890: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   893: invokevirtual fu : ()Lf/nJ0;
/*    */     //   896: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   899: pop
/*    */     //   900: getfield m5 : Lf/SA;
/*    */     //   903: new f/dQ
/*    */     //   906: dup
/*    */     //   907: ldc_w 'Movement Leash Y'
/*    */     //   910: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   913: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   916: aload #4
/*    */     //   918: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   921: invokevirtual fu : ()Lf/nJ0;
/*    */     //   924: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   927: pop
/*    */     //   928: getfield m5 : Lf/SA;
/*    */     //   931: new f/dQ
/*    */     //   934: dup
/*    */     //   935: ldc_w 'Script Offset'
/*    */     //   938: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   941: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   944: aload_0
/*    */     //   945: getfield PP : Lf/of;
/*    */     //   948: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   951: invokevirtual fu : ()Lf/nJ0;
/*    */     //   954: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   957: pop
/*    */     //   958: getfield m5 : Lf/SA;
/*    */     //   961: new f/dQ
/*    */     //   964: dup
/*    */     //   965: ldc_w 'Flag ID'
/*    */     //   968: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   971: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   974: aload_0
/*    */     //   975: getfield yJ : Lf/rh;
/*    */     //   978: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   981: invokevirtual fu : ()Lf/nJ0;
/*    */     //   984: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   987: pop
/*    */     //   988: getfield m5 : Lf/SA;
/*    */     //   991: new f/dQ
/*    */     //   994: dup
/*    */     //   995: ldc_w 'Flag Value'
/*    */     //   998: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1001: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1004: aload_0
/*    */     //   1005: getfield So : Lf/rh;
/*    */     //   1008: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1011: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1014: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1017: pop
/*    */     //   1018: getfield m5 : Lf/SA;
/*    */     //   1021: new f/dQ
/*    */     //   1024: dup
/*    */     //   1025: ldc_w 'Sparkles'
/*    */     //   1028: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1031: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1034: aload_0
/*    */     //   1035: getfield LH0 : Lf/ge0;
/*    */     //   1038: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1041: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1044: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1047: pop
/*    */     //   1048: getfield m5 : Lf/SA;
/*    */     //   1051: new f/dQ
/*    */     //   1054: dup
/*    */     //   1055: ldc_w 'Sprite Scale Override'
/*    */     //   1058: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1061: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1064: aload_0
/*    */     //   1065: getfield oI : Lf/Lj0;
/*    */     //   1068: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1071: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1074: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1077: pop
/*    */     //   1078: getfield m5 : Lf/SA;
/*    */     //   1081: new f/dQ
/*    */     //   1084: dup
/*    */     //   1085: ldc_w 'Update Existing NPC'
/*    */     //   1088: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1091: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1094: aload_0
/*    */     //   1095: getfield sl : Lf/ge0;
/*    */     //   1098: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1101: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1104: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1107: pop
/*    */     //   1108: getfield m5 : Lf/SA;
/*    */     //   1111: new f/dQ
/*    */     //   1114: dup
/*    */     //   1115: ldc_w 'Ignore Duplicate Check'
/*    */     //   1118: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1121: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1124: aload_0
/*    */     //   1125: getfield oM : Lf/ge0;
/*    */     //   1128: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1131: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1134: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1137: pop
/*    */     //   1138: new f/Ga
/*    */     //   1141: dup
/*    */     //   1142: aload_0
/*    */     //   1143: getfield Nh0 : Lf/OZ;
/*    */     //   1146: invokespecial <init> : (Lf/LK0;)V
/*    */     //   1149: putfield ba : Lf/Ga;
/*    */     //   1152: new f/YA0
/*    */     //   1155: dup
/*    */     //   1156: dup2
/*    */     //   1157: astore_1
/*    */     //   1158: invokespecial <init> : ()V
/*    */     //   1161: invokevirtual oU : ()V
/*    */     //   1164: getfield Dv0 : Lf/SA;
/*    */     //   1167: aload_0
/*    */     //   1168: new f/Un
/*    */     //   1171: dup
/*    */     //   1172: astore_3
/*    */     //   1173: aload_0
/*    */     //   1174: aload_3
/*    */     //   1175: ldc_w '+'
/*    */     //   1178: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1181: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   1186: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1189: new f/Un
/*    */     //   1192: dup
/*    */     //   1193: astore #4
/*    */     //   1195: aload_0
/*    */     //   1196: aload #4
/*    */     //   1198: ldc_w '-'
/*    */     //   1201: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1204: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   1209: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1212: getfield ba : Lf/Ga;
/*    */     //   1215: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1218: iconst_2
/*    */     //   1219: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1222: invokevirtual Yv : (Ljava/lang/Integer;)Lf/nJ0;
/*    */     //   1225: invokevirtual sV : ()Lf/nJ0;
/*    */     //   1228: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1231: aload #4
/*    */     //   1233: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1236: invokevirtual K4 : ()Lf/nJ0;
/*    */     //   1239: aload_3
/*    */     //   1240: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1243: invokevirtual K4 : ()Lf/nJ0;
/*    */     //   1246: pop
/*    */     //   1247: getfield m5 : Lf/SA;
/*    */     //   1250: new f/dQ
/*    */     //   1253: dup
/*    */     //   1254: ldc_w 'Conditions'
/*    */     //   1257: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1260: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1263: aload_1
/*    */     //   1264: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1267: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   1270: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1273: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1276: pop
/*    */     //   1277: new f/Ga
/*    */     //   1280: dup
/*    */     //   1281: astore_1
/*    */     //   1282: aload_0
/*    */     //   1283: dup
/*    */     //   1284: aload_1
/*    */     //   1285: dup
/*    */     //   1286: aload_0
/*    */     //   1287: getfield sC0 : Lf/OZ;
/*    */     //   1290: invokespecial <init> : (Lf/LK0;)V
/*    */     //   1293: putfield XZ : Lf/Ga;
/*    */     //   1296: <illegal opcode> yb0 : (Lf/lO;)Lf/tC0;
/*    */     //   1301: invokevirtual rS : (Lf/tC0;)V
/*    */     //   1304: new f/YA0
/*    */     //   1307: dup
/*    */     //   1308: dup2
/*    */     //   1309: astore_1
/*    */     //   1310: invokespecial <init> : ()V
/*    */     //   1313: invokevirtual oU : ()V
/*    */     //   1316: getfield Dv0 : Lf/SA;
/*    */     //   1319: aload_0
/*    */     //   1320: new f/Un
/*    */     //   1323: dup
/*    */     //   1324: astore_3
/*    */     //   1325: aload_0
/*    */     //   1326: aload_3
/*    */     //   1327: ldc_w '+'
/*    */     //   1330: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1333: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   1338: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1341: new f/Un
/*    */     //   1344: dup
/*    */     //   1345: astore #4
/*    */     //   1347: aload_0
/*    */     //   1348: aload #4
/*    */     //   1350: ldc_w '-'
/*    */     //   1353: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1356: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   1361: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1364: getfield XZ : Lf/Ga;
/*    */     //   1367: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1370: ldc_w 200.0
/*    */     //   1373: invokevirtual Ig0 : (F)Lf/nJ0;
/*    */     //   1376: iconst_2
/*    */     //   1377: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1380: invokevirtual Yv : (Ljava/lang/Integer;)Lf/nJ0;
/*    */     //   1383: invokevirtual sV : ()Lf/nJ0;
/*    */     //   1386: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1389: aload #4
/*    */     //   1391: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1394: invokevirtual K4 : ()Lf/nJ0;
/*    */     //   1397: aload_3
/*    */     //   1398: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1401: invokevirtual K4 : ()Lf/nJ0;
/*    */     //   1404: pop
/*    */     //   1405: new f/YA0
/*    */     //   1408: dup
/*    */     //   1409: dup2
/*    */     //   1410: astore_3
/*    */     //   1411: invokespecial <init> : ()V
/*    */     //   1414: invokevirtual oU : ()V
/*    */     //   1417: getfield Dv0 : Lf/SA;
/*    */     //   1420: aload_0
/*    */     //   1421: new f/Un
/*    */     //   1424: dup
/*    */     //   1425: aload_0
/*    */     //   1426: swap
/*    */     //   1427: dup
/*    */     //   1428: ldc_w 'Copy'
/*    */     //   1431: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1434: putfield zL0 : Lf/Un;
/*    */     //   1437: <illegal opcode> run : ()Ljava/lang/Runnable;
/*    */     //   1442: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1445: new f/Un
/*    */     //   1448: dup
/*    */     //   1449: astore #4
/*    */     //   1451: aload_0
/*    */     //   1452: dup
/*    */     //   1453: aload #4
/*    */     //   1455: dup
/*    */     //   1456: ldc_w 'Spawn'
/*    */     //   1459: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1462: putfield Ls : Lf/Un;
/*    */     //   1465: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   1470: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1473: new f/Un
/*    */     //   1476: dup
/*    */     //   1477: dup
/*    */     //   1478: astore #4
/*    */     //   1480: ldc_w 'Delete'
/*    */     //   1483: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1486: <illegal opcode> run : ()Ljava/lang/Runnable;
/*    */     //   1491: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1494: getfield zL0 : Lf/Un;
/*    */     //   1497: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1500: aload #4
/*    */     //   1502: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1505: aload_0
/*    */     //   1506: getfield Ls : Lf/Un;
/*    */     //   1509: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1512: invokevirtual K4 : ()Lf/nJ0;
/*    */     //   1515: pop
/*    */     //   1516: getfield m5 : Lf/SA;
/*    */     //   1519: aload_3
/*    */     //   1520: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1523: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1526: iconst_2
/*    */     //   1527: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1530: invokevirtual Yv : (Ljava/lang/Integer;)Lf/nJ0;
/*    */     //   1533: pop
/*    */     //   1534: new f/YA0
/*    */     //   1537: dup
/*    */     //   1538: dup
/*    */     //   1539: dup2
/*    */     //   1540: invokespecial <init> : ()V
/*    */     //   1543: invokevirtual oU : ()V
/*    */     //   1546: getfield Dv0 : Lf/SA;
/*    */     //   1549: aload_2
/*    */     //   1550: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1553: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   1556: iconst_2
/*    */     //   1557: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1560: invokevirtual Yv : (Ljava/lang/Integer;)Lf/nJ0;
/*    */     //   1563: invokevirtual zm0 : ()Lf/nJ0;
/*    */     //   1566: pop
/*    */     //   1567: getfield Dv0 : Lf/SA;
/*    */     //   1570: aload_1
/*    */     //   1571: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1574: invokevirtual LPT7 : ()Lf/nJ0;
/*    */     //   1577: invokevirtual Xs0 : ()Lf/nJ0;
/*    */     //   1580: aload_0
/*    */     //   1581: getfield Ug0 : Lf/vF0;
/*    */     //   1584: invokevirtual fA0 : (Lf/JG0;)Lf/nJ0;
/*    */     //   1587: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1590: invokevirtual R7 : ()Lf/nJ0;
/*    */     //   1593: invokevirtual cl0 : ()V
/*    */     //   1596: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   1599: invokevirtual update : ()V
/*    */     //   1602: return
/*    */   }
/*    */   
/*    */   private void Us0() {
/*    */     int i;
/*    */     if ((i = this.XZ.go) != -1) {
/*    */       this.sC0.Fj.remove(i);
/*    */       MQ[] arrayOfMQ;
/*    */       if ((arrayOfMQ = this.sC0.rw) != null) {
/*    */         int j;
/*    */         byte b;
/*    */         for (j = arrayOfMQ.length, b = 0; b < j; ) {
/*    */           arrayOfMQ[b].AE(i, i);
/*    */           b++;
/*    */         } 
/*    */       } 
/*    */       ((ArrayList)this.R2.MF(Byte.valueOf(((Uj)this.w.WW()).D), null)).remove(this.XZ.go);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void GA0(RJ paramRJ) {
/*    */     if (paramRJ == RJ.kf) {
/*    */       Ga ga;
/*    */       cQ cQ;
/*    */       BC0 bC0;
/*    */       int i;
/*    */       if ((bC0 = ((i = (ga = this.XZ).go) == -1 || (cQ = ga.my) == null) ? null : (BC0)cQ.c90(i)) != null) {
/*    */         i = -1;
/*    */         if (this.w.WW() != null)
/*    */           i = ((Uj)this.w.WW()).D; 
/*    */         short s1 = bC0.UG, s2 = bC0.hh, s3 = bC0.Mn;
/*    */         byte b1 = bC0.bs0;
/*    */         int j = bC0.jx0;
/*    */         boolean bool = bC0.WI;
/*    */         byte b2 = bC0.LJ, b3 = bC0.dl, b4 = bC0.X7, arrayOfByte1[] = bC0.Cd0, arrayOfByte2[] = bC0.LK0;
/*    */         HY(i, s1, s2, s3, b1, j, bool, false, b2, b3, b4, arrayOfByte1, arrayOfByte2);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void lp0() {
/*    */     int i = this.ba.go;
/*    */     this.Nh0.Fj.remove(i);
/*    */     MQ[] arrayOfMQ;
/*    */     if ((arrayOfMQ = this.Nh0.rw) != null) {
/*    */       int j;
/*    */       byte b;
/*    */       for (j = arrayOfMQ.length, b = 0; b < j; ) {
/*    */         arrayOfMQ[b].AE(i, i);
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void aA0() {
/*    */     // Byte code:
/*    */     //   0: new f/YA0
/*    */     //   3: dup
/*    */     //   4: dup
/*    */     //   5: astore_1
/*    */     //   6: invokespecial <init> : ()V
/*    */     //   9: getfield Dv0 : Lf/SA;
/*    */     //   12: dup
/*    */     //   13: dup
/*    */     //   14: new f/zT
/*    */     //   17: dup
/*    */     //   18: astore_2
/*    */     //   19: iconst_0
/*    */     //   20: sipush #255
/*    */     //   23: iconst_0
/*    */     //   24: invokespecial <init> : (III)V
/*    */     //   27: new f/rh
/*    */     //   30: dup
/*    */     //   31: dup2
/*    */     //   32: astore_3
/*    */     //   33: aload_2
/*    */     //   34: invokespecial <init> : (Lf/er;)V
/*    */     //   37: new f/W1
/*    */     //   40: dup
/*    */     //   41: astore_2
/*    */     //   42: aload_0
/*    */     //   43: aload_2
/*    */     //   44: dup
/*    */     //   45: dup
/*    */     //   46: new f/OZ
/*    */     //   49: dup
/*    */     //   50: astore #4
/*    */     //   52: invokestatic values : ()[Lf/oE;
/*    */     //   55: invokespecial <init> : ([Ljava/lang/Object;)V
/*    */     //   58: invokespecial <init> : ()V
/*    */     //   61: aload #4
/*    */     //   63: invokevirtual rk0 : (Lf/cQ;)V
/*    */     //   66: iconst_0
/*    */     //   67: invokevirtual Z30 : (I)V
/*    */     //   70: <illegal opcode> run : (Lf/lO;)Ljava/lang/Runnable;
/*    */     //   75: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   78: new f/dQ
/*    */     //   81: dup
/*    */     //   82: dup2
/*    */     //   83: astore #4
/*    */     //   85: invokespecial <init> : ()V
/*    */     //   88: ldc_w ''
/*    */     //   91: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   94: <illegal opcode> run : (Lf/rh;Lf/dQ;)Ljava/lang/Runnable;
/*    */     //   99: invokevirtual Te0 : (Ljava/lang/Runnable;)V
/*    */     //   102: new f/dQ
/*    */     //   105: dup
/*    */     //   106: dup
/*    */     //   107: invokespecial <init> : ()V
/*    */     //   110: ldc_w 'Condition'
/*    */     //   113: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   116: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   119: getfield Ox : Lf/ZP;
/*    */     //   122: aload_2
/*    */     //   123: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   126: ldc_w 200.0
/*    */     //   129: invokevirtual Ig0 : (F)Lf/nJ0;
/*    */     //   132: getfield Ox : Lf/ZP;
/*    */     //   135: invokevirtual wP : ()Lf/nJ0;
/*    */     //   138: pop
/*    */     //   139: new f/dQ
/*    */     //   142: dup
/*    */     //   143: dup
/*    */     //   144: invokespecial <init> : ()V
/*    */     //   147: ldc_w 'Value'
/*    */     //   150: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   153: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   156: getfield Ox : Lf/ZP;
/*    */     //   159: aload_3
/*    */     //   160: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   163: getfield Ox : Lf/ZP;
/*    */     //   166: invokevirtual wP : ()Lf/nJ0;
/*    */     //   169: pop
/*    */     //   170: aload #4
/*    */     //   172: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   175: ldc_w 30.0
/*    */     //   178: invokevirtual fJ : (F)Lf/nJ0;
/*    */     //   181: iconst_2
/*    */     //   182: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   185: putfield ss : Ljava/lang/Integer;
/*    */     //   188: getstatic f/js.vu0 : Lf/js;
/*    */     //   191: dup
/*    */     //   192: new f/h70
/*    */     //   195: dup
/*    */     //   196: astore #4
/*    */     //   198: aload_1
/*    */     //   199: aload_0
/*    */     //   200: aload_2
/*    */     //   201: aload_3
/*    */     //   202: <illegal opcode> run : (Lf/lO;Lf/W1;Lf/rh;)Ljava/lang/Runnable;
/*    */     //   207: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   210: invokevirtual Ub : ()I
/*    */     //   213: aload #4
/*    */     //   215: swap
/*    */     //   216: invokevirtual si : (Lf/JG0;I)V
/*    */     //   219: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 58
/*    */     //   #2	-> 67
/*    */     //   #3	-> 85
/*    */     //   #4	-> 94
/*    */     //   #5	-> 107
/*    */     //   #6	-> 116
/*    */     //   #7	-> 119
/*    */     //   #8	-> 129
/*    */     //   #9	-> 132
/*    */     //   #10	-> 139
/*    */     //   #11	-> 144
/*    */     //   #12	-> 153
/*    */     //   #13	-> 156
/*    */     //   #14	-> 163
/*    */     //   #15	-> 172
/*    */     //   #16	-> 185
/*    */     //   #17	-> 188
/*    */     //   #18	-> 192
/*    */     //   #19	-> 207
/*    */     //   #20	-> 210
/*    */     //   #21	-> 216
/*    */   }
/*    */   
/*    */   private void VK(W1 paramW1, rh paramrh) {
/*    */     this.Nh0.i3(new W4((oE)paramW1.WW(), (byte)paramrh.T8));
/*    */   }
/*    */   
/*    */   public static void cp(rh paramrh, dQ paramdQ) {
/*    */     try {
/*    */       paramdQ.E1("Value: " + v30.wL0((byte)paramrh.T8));
/*    */     } catch (Exception exception) {
/*    */       paramdQ.E1("Error parsing value");
/*    */     } 
/*    */   }
/*    */   
/*    */   private void vT(rh paramrh) {
/*    */     int i;
/*    */     if ((i = this.Ks.hk) >= 2000 && i < 4000) {
/*    */       i = 10;
/*    */     } else {
/*    */       i = 1;
/*    */     } 
/*    */     paramrh.AuX = i;
/*    */   }
/*    */   
/*    */   private void Qp() {
/*    */     this.sC0.Fj.clear();
/*    */     MQ[] arrayOfMQ1;
/*    */     if ((arrayOfMQ1 = this.sC0.rw) != null) {
/*    */       int k;
/*    */       byte b1;
/*    */       for (k = arrayOfMQ1.length, b1 = 0; b1 < k; ) {
/*    */         arrayOfMQ1[b1].kR();
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */     this.XZ.zy0(-1, true, RJ.QE0);
/*    */     byte b = ((Uj)this.w.WW()).D;
/*    */     if (this.R2.MF(Byte.valueOf(b), null) == null)
/*    */       this.R2.Ed0(Byte.valueOf(b), new ArrayList()); 
/*    */     int j = oZ.Fj.size();
/*    */     oZ.Fj.addAll(j, this);
/*    */     Collection<?> collection;
/*    */     int i = (collection = (Collection)this.R2.MF(Byte.valueOf(b), null)).size() + j - 1;
/*    */     MQ[] arrayOfMQ2;
/*    */     OZ oZ;
/*    */     if ((arrayOfMQ2 = (oZ = this.sC0).rw) != null) {
/*    */       int k;
/*    */       byte b1;
/*    */       for (k = arrayOfMQ2.length, b1 = 0; b1 < k; ) {
/*    */         arrayOfMQ2[b1].Ge(j, i);
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void i20() {
/*    */     this.fr0.jf0(this);
/*    */   }
/*    */   
/*    */   public static byte fJ() {
/*    */     byte b = km.a3.eA;
/*    */     byte b1 = 0;
/*    */     for (byte[] arrayOfByte = C80; b1 < 6; ) {
/*    */       if (arrayOfByte[b1] == b)
/*    */         return b1; 
/*    */       b1 = (byte)(b1 + 1);
/*    */     } 
/*    */     return -1;
/*    */   }
/*    */   
/*    */   public final void yV(throws paramthrows) {
/*    */     super.yV(paramthrows);
/*    */     if (this.Op0 != null) {
/*    */       cx0 cx01;
/*    */       Ur0 ur0 = pw.fi0;
/*    */       Pw pw;
/*    */       JX jX;
/*    */       (jX = (pw = km.wI0).C50).end();
/*    */       vg0 vg0 = km.wI0.vF;
/*    */       float f1 = vF01.er0;
/*    */       float f2 = vF01.xY;
/*    */       float f3 = vF01.HC;
/*    */       vF0 vF01;
/*    */       this((vF01 = this.Ug0).Kd, f1, f2, f3);
/*    */       Ih0 ih0;
/*    */       (ih0 = km.wI0.cF).Ce0 = 0.1F;
/*    */       km.wI0.cF.IG0 = -20.0F;
/*    */       km.wI0.cF.Mp = 0.0F;
/*    */       km.wI0.cF.gV = cx01.af;
/*    */       km.wI0.cF.oA = cx01.sf0;
/*    */       km.wI0.cF.el0 = 1.0F;
/*    */       km.wI0.cF.rE0(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*    */       this();
/*    */       ur0.DR(jX.q0, cx01, cx02);
/*    */       cx0 cx02;
/*    */       Ye0.lf0(cx02 = new cx0());
/*    */       if (km.Nr()) {
/*    */         float f = pw1.k1() - cx01.zA0;
/*    */         int k = (int)((f - cx01.sf0) / (f = km.wI0.vH0));
/*    */         int i = (int)(cx01.af / f), j = (int)(cx01.sf0 / f);
/*    */         Pw pw1;
/*    */         ou0.com8((int)(cx01.dA / (pw1 = km.wI0).vH0), k, i, j);
/*    */       } 
/*    */       ih0.abstract(true);
/*    */       vg0.mx0(ih0);
/*    */       this.Op0.Ud0(0.0F, UB0.M60.Qy);
/*    */       vg0.tx0(this.Op0);
/*    */       vg0.end();
/*    */       jX.Tx();
/*    */       Ye0.Kw0();
/*    */       ((tw)this.Bo0.IB0).P9.wO(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void HY(byte paramByte1, short paramShort1, short paramShort2, short paramShort3, byte paramByte2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, byte paramByte3, byte paramByte4, byte paramByte5, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
/*    */     if (paramByte1 >= 0)
/*    */       this.w.COm6(Uj.sD(paramByte1)); 
/*    */     this.Gg0.Hr0(paramShort1);
/*    */     this.Rg.Hr0(paramShort2);
/*    */     byte[] arrayOfByte;
/*    */     for (paramByte1 = 0, arrayOfByte = C80; paramByte1 < 6; ) {
/*    */       if (arrayOfByte[paramByte1] == paramByte2)
/*    */         this.uL0.Z30(paramByte1); 
/*    */       paramByte1++;
/*    */     } 
/*    */     this.Ks.Hr0(paramShort3);
/*    */     this.PP.Be0(paramInt + "", false);
/*    */     this.LH0.TG0.Fx0(paramBoolean1);
/*    */     this.oM.TG0.Fx0(paramBoolean2);
/*    */     paramByte1 = 0;
/*    */     while (paramByte1 < (arrayOfByte = this.dg).length) {
/*    */       if (arrayOfByte[paramByte1] == paramByte3)
/*    */         this.v9.Z30(paramByte1); 
/*    */       paramByte1++;
/*    */     } 
/*    */     this.e10.Hr0(paramByte4);
/*    */     this.Q10.Hr0(paramByte5);
/*    */     this.Nh0.Fj.clear();
/*    */     MQ[] arrayOfMQ;
/*    */     if ((arrayOfMQ = this.Nh0.rw) != null)
/*    */       for (int i = arrayOfMQ.length; paramShort2 < i; ) {
/*    */         arrayOfMQ[paramShort2].kR();
/*    */         paramShort2++;
/*    */       }  
/*    */     byte b = 0;
/*    */     while (b < paramArrayOfbyte1.length) {
/*    */       oE oE = (oE)oE.q3.Ha0(paramArrayOfbyte1[b]);
/*    */       this.Nh0.i3(new W4(oE, paramArrayOfbyte2[b]));
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void xn0() {
/*    */     // Byte code:
/*    */     //   0: new f/YA0
/*    */     //   3: dup
/*    */     //   4: dup
/*    */     //   5: astore_1
/*    */     //   6: invokespecial <init> : ()V
/*    */     //   9: getfield Dv0 : Lf/SA;
/*    */     //   12: new f/of
/*    */     //   15: dup
/*    */     //   16: astore_2
/*    */     //   17: aconst_null
/*    */     //   18: invokespecial <init> : (Lf/Sa0;)V
/*    */     //   21: new f/dQ
/*    */     //   24: dup
/*    */     //   25: dup
/*    */     //   26: invokespecial <init> : ()V
/*    */     //   29: ldc_w 'Name'
/*    */     //   32: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   35: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   38: getfield Ox : Lf/ZP;
/*    */     //   41: aload_2
/*    */     //   42: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   45: ldc_w 200.0
/*    */     //   48: invokevirtual Ig0 : (F)Lf/nJ0;
/*    */     //   51: getfield Ox : Lf/ZP;
/*    */     //   54: invokevirtual wP : ()Lf/nJ0;
/*    */     //   57: pop
/*    */     //   58: getstatic f/js.vu0 : Lf/js;
/*    */     //   61: dup
/*    */     //   62: new f/h70
/*    */     //   65: dup
/*    */     //   66: astore_3
/*    */     //   67: aload_1
/*    */     //   68: aload_0
/*    */     //   69: aload_2
/*    */     //   70: <illegal opcode> run : (Lf/lO;Lf/of;)Ljava/lang/Runnable;
/*    */     //   75: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   78: invokevirtual Ub : ()I
/*    */     //   81: aload_3
/*    */     //   82: swap
/*    */     //   83: invokevirtual si : (Lf/JG0;I)V
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 18
/*    */     //   #2	-> 21
/*    */     //   #3	-> 26
/*    */     //   #4	-> 35
/*    */     //   #5	-> 38
/*    */     //   #6	-> 48
/*    */     //   #7	-> 51
/*    */     //   #8	-> 58
/*    */     //   #9	-> 62
/*    */     //   #10	-> 75
/*    */     //   #11	-> 78
/*    */     //   #12	-> 83
/*    */   }
/*    */   
/*    */   public final void ZI0() {
/*    */     if (this.w.Wa0.go < 0) {
/*    */       js.vu0.Pu(-1, "No event selected");
/*    */       return;
/*    */     } 
/*    */     this();
/*    */     stringBuilder.append("//eventspawnnpc ");
/*    */     stringBuilder.append(((Uj)this.w.WW()).D).append(" ");
/*    */     stringBuilder.append(this.Ks.hk).append(" ");
/*    */     stringBuilder.append(C80[this.uL0.Wa0.go]).append(" ");
/*    */     stringBuilder.append(this.dg[this.v9.Wa0.go]).append(" ");
/*    */     stringBuilder.append(this.e10.hk).append(" ");
/*    */     stringBuilder.append(this.Q10.hk).append(" ");
/*    */     stringBuilder.append(this.PP.F2.PH0.toString()).append(" ");
/*    */     stringBuilder.append(this.Gg0.hk).append(" ");
/*    */     stringBuilder.append(this.Rg.hk).append(" ");
/*    */     stringBuilder.append(this.sl.TG0.nm0()).append(" ");
/*    */     stringBuilder.append(this.LH0.TG0.nm0()).append(" ");
/*    */     stringBuilder.append(this.oM.TG0.nm0()).append(" ");
/*    */     stringBuilder.append(this.oI.Z60).append(" ");
/*    */     StringBuilder stringBuilder;
/*    */     (stringBuilder = new StringBuilder()).append(this.Nh0.Fj.size());
/*    */     byte b = 0;
/*    */     while (b < this.Nh0.Fj.size()) {
/*    */       W4 w4 = this.Nh0.Fj.get(b);
/*    */       stringBuilder.append(" ").append(w4.Ol0.kH0).append(" ").append(w4.coM9);
/*    */       b++;
/*    */     } 
/*    */     km.u4.lF(stringBuilder.toString());
/*    */   }
/*    */   
/*    */   public final void nj0() {
/*    */     hZ hZ;
/*    */     if ((hZ = UB0.vj0.N0("./cache/npc.presets")).L0()) {
/*    */       InputStream inputStream = hZ.Yc();
/*    */       try {
/*    */         InputStreamReader inputStreamReader;
/*    */         eM eM1;
/*    */         this(inputStream, "UTF-8");
/*    */         bM0 bM0 = (new nP()).lu(inputStreamReader);
/*    */         this();
/*    */         Uj[] arrayOfUj;
/*    */         int i;
/*    */         byte b;
/*    */         for (this.R2 = eM1, i = (arrayOfUj = Uj.j50).length, b = 0; b < i; ) {
/*    */           Uj uj;
/*    */           bM0 bM01 = bM0.Jb((uj = arrayOfUj[b]).name());
/*    */           this.R2.Ed0(Byte.valueOf(uj.D), this.zx0.Uj0(ArrayList.class, BC0.class, bM01));
/*    */           b++;
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         throw new kN("Error reading stream.", this);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void update() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield mn : B
/*    */     //   4: getstatic f/km.a3 : Lf/vh0;
/*    */     //   7: getfield eA : B
/*    */     //   10: dup
/*    */     //   11: istore_1
/*    */     //   12: if_icmpeq -> 632
/*    */     //   15: aload_0
/*    */     //   16: dup
/*    */     //   17: iload_1
/*    */     //   18: putfield mn : B
/*    */     //   21: new f/OZ
/*    */     //   24: dup
/*    */     //   25: astore_1
/*    */     //   26: invokespecial <init> : ()V
/*    */     //   29: getfield mn : B
/*    */     //   32: invokestatic n80 : (B)Z
/*    */     //   35: ifeq -> 283
/*    */     //   38: aload_1
/*    */     //   39: dup
/*    */     //   40: dup2
/*    */     //   41: dup2
/*    */     //   42: dup2
/*    */     //   43: dup2
/*    */     //   44: dup2
/*    */     //   45: dup2
/*    */     //   46: dup2
/*    */     //   47: dup2
/*    */     //   48: dup2
/*    */     //   49: aload_0
/*    */     //   50: bipush #20
/*    */     //   52: newarray byte
/*    */     //   54: dup
/*    */     //   55: dup
/*    */     //   56: dup2
/*    */     //   57: dup2
/*    */     //   58: dup2
/*    */     //   59: dup2
/*    */     //   60: dup2
/*    */     //   61: dup2
/*    */     //   62: dup2
/*    */     //   63: dup2
/*    */     //   64: dup2
/*    */     //   65: astore_2
/*    */     //   66: iconst_0
/*    */     //   67: iconst_0
/*    */     //   68: bastore
/*    */     //   69: iconst_1
/*    */     //   70: iconst_1
/*    */     //   71: bastore
/*    */     //   72: iconst_2
/*    */     //   73: iconst_2
/*    */     //   74: bastore
/*    */     //   75: iconst_3
/*    */     //   76: iconst_3
/*    */     //   77: bastore
/*    */     //   78: iconst_4
/*    */     //   79: bipush #6
/*    */     //   81: bastore
/*    */     //   82: iconst_5
/*    */     //   83: bipush #8
/*    */     //   85: bastore
/*    */     //   86: bipush #6
/*    */     //   88: bipush #13
/*    */     //   90: bastore
/*    */     //   91: bipush #7
/*    */     //   93: bipush #14
/*    */     //   95: bastore
/*    */     //   96: bipush #8
/*    */     //   98: bipush #15
/*    */     //   100: bastore
/*    */     //   101: bipush #9
/*    */     //   103: bipush #16
/*    */     //   105: bastore
/*    */     //   106: bipush #10
/*    */     //   108: bipush #17
/*    */     //   110: bastore
/*    */     //   111: bipush #11
/*    */     //   113: bipush #18
/*    */     //   115: bastore
/*    */     //   116: bipush #12
/*    */     //   118: bipush #19
/*    */     //   120: bastore
/*    */     //   121: bipush #13
/*    */     //   123: bipush #20
/*    */     //   125: bastore
/*    */     //   126: bipush #14
/*    */     //   128: bipush #21
/*    */     //   130: bastore
/*    */     //   131: bipush #15
/*    */     //   133: bipush #22
/*    */     //   135: bastore
/*    */     //   136: bipush #16
/*    */     //   138: bipush #23
/*    */     //   140: bastore
/*    */     //   141: bipush #17
/*    */     //   143: bipush #24
/*    */     //   145: bastore
/*    */     //   146: bipush #18
/*    */     //   148: bipush #98
/*    */     //   150: bastore
/*    */     //   151: bipush #19
/*    */     //   153: bipush #99
/*    */     //   155: bastore
/*    */     //   156: aload_2
/*    */     //   157: putfield dg : [B
/*    */     //   160: ldc_w 'None'
/*    */     //   163: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   166: ldc_w 'Look around'
/*    */     //   169: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   172: ldc_w 'Walk around'
/*    */     //   175: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   178: ldc_w 'Walk Up and Down'
/*    */     //   181: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   184: ldc_w 'Walk left and right'
/*    */     //   187: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   190: ldc_w 'Look south'
/*    */     //   193: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   196: ldc_w 'Look Up and Down'
/*    */     //   199: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   202: ldc_w 'Look Left and Right'
/*    */     //   205: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   208: ldc_w 'Look Up and Left'
/*    */     //   211: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   214: ldc_w 'Look Up and Right'
/*    */     //   217: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   220: ldc_w 'Look Down and Left'
/*    */     //   223: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   226: ldc_w 'Look Down and Right'
/*    */     //   229: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   232: ldc_w 'Look Up, Down and Left'
/*    */     //   235: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   238: ldc_w 'Look Up, Down and Right'
/*    */     //   241: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   244: ldc_w 'Look Up, Left and Right'
/*    */     //   247: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   250: ldc_w 'Look Down, Left and Right'
/*    */     //   253: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   256: ldc_w 'Look Around Counterlockwise'
/*    */     //   259: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   262: ldc_w 'Look Around Clockwise'
/*    */     //   265: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   268: ldc_w 'Custom Pumpking'
/*    */     //   271: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   274: ldc_w 'Custom Hitodama'
/*    */     //   277: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   280: goto -> 584
/*    */     //   283: aload_1
/*    */     //   284: dup
/*    */     //   285: dup
/*    */     //   286: dup2
/*    */     //   287: dup2
/*    */     //   288: dup2
/*    */     //   289: dup2
/*    */     //   290: dup2
/*    */     //   291: dup2
/*    */     //   292: dup2
/*    */     //   293: dup2
/*    */     //   294: dup2
/*    */     //   295: dup2
/*    */     //   296: dup2
/*    */     //   297: aload_0
/*    */     //   298: bipush #25
/*    */     //   300: newarray byte
/*    */     //   302: dup
/*    */     //   303: dup2
/*    */     //   304: dup2
/*    */     //   305: dup2
/*    */     //   306: dup2
/*    */     //   307: dup2
/*    */     //   308: dup2
/*    */     //   309: dup2
/*    */     //   310: dup2
/*    */     //   311: dup2
/*    */     //   312: dup2
/*    */     //   313: dup2
/*    */     //   314: dup2
/*    */     //   315: astore_2
/*    */     //   316: iconst_0
/*    */     //   317: iconst_0
/*    */     //   318: bastore
/*    */     //   319: iconst_1
/*    */     //   320: iconst_2
/*    */     //   321: bastore
/*    */     //   322: iconst_2
/*    */     //   323: iconst_3
/*    */     //   324: bastore
/*    */     //   325: iconst_3
/*    */     //   326: iconst_4
/*    */     //   327: bastore
/*    */     //   328: iconst_4
/*    */     //   329: iconst_5
/*    */     //   330: bastore
/*    */     //   331: iconst_5
/*    */     //   332: bipush #6
/*    */     //   334: bastore
/*    */     //   335: bipush #6
/*    */     //   337: bipush #7
/*    */     //   339: bastore
/*    */     //   340: bipush #7
/*    */     //   342: bipush #8
/*    */     //   344: bastore
/*    */     //   345: bipush #8
/*    */     //   347: bipush #9
/*    */     //   349: bastore
/*    */     //   350: bipush #9
/*    */     //   352: bipush #10
/*    */     //   354: bastore
/*    */     //   355: bipush #10
/*    */     //   357: bipush #11
/*    */     //   359: bastore
/*    */     //   360: bipush #11
/*    */     //   362: bipush #12
/*    */     //   364: bastore
/*    */     //   365: bipush #12
/*    */     //   367: bipush #13
/*    */     //   369: bastore
/*    */     //   370: bipush #13
/*    */     //   372: bipush #14
/*    */     //   374: bastore
/*    */     //   375: bipush #14
/*    */     //   377: bipush #15
/*    */     //   379: bastore
/*    */     //   380: bipush #15
/*    */     //   382: bipush #16
/*    */     //   384: bastore
/*    */     //   385: bipush #16
/*    */     //   387: bipush #17
/*    */     //   389: bastore
/*    */     //   390: bipush #17
/*    */     //   392: bipush #18
/*    */     //   394: bastore
/*    */     //   395: bipush #18
/*    */     //   397: bipush #19
/*    */     //   399: bastore
/*    */     //   400: bipush #19
/*    */     //   402: bipush #20
/*    */     //   404: bastore
/*    */     //   405: bipush #20
/*    */     //   407: bipush #123
/*    */     //   409: bastore
/*    */     //   410: bipush #21
/*    */     //   412: bipush #124
/*    */     //   414: bastore
/*    */     //   415: bipush #22
/*    */     //   417: bipush #125
/*    */     //   419: bastore
/*    */     //   420: bipush #23
/*    */     //   422: bipush #126
/*    */     //   424: bastore
/*    */     //   425: bipush #24
/*    */     //   427: bipush #127
/*    */     //   429: bastore
/*    */     //   430: aload_2
/*    */     //   431: putfield dg : [B
/*    */     //   434: ldc_w 'None'
/*    */     //   437: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   440: ldc_w 'Looking AROUND (rand)'
/*    */     //   443: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   446: ldc_w 'Walking AROUND randomly till max'
/*    */     //   449: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   452: ldc_w 'Walking UP and DOWN (rand)'
/*    */     //   455: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   458: ldc_w 'Walking LEFT and RIGHT (rand)'
/*    */     //   461: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   464: ldc_w 'Looking UP and LEFT'
/*    */     //   467: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   470: ldc_w 'Looking UP and RIGHT'
/*    */     //   473: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   476: ldc_w 'Looking LEFT and DOWN'
/*    */     //   479: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   482: ldc_w 'Looking RIGHT and DOWN'
/*    */     //   485: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   488: ldc_w 'Looking UP, DOWN and LEFT (rand)'
/*    */     //   491: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   494: ldc_w 'Looking UP, DOWN and RIGHT (rand)'
/*    */     //   497: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   500: ldc_w 'Looking UP, LEFT and RIGHT (rand)'
/*    */     //   503: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   506: ldc_w 'Looking DOWN, LEFT and RIGHT (rand)'
/*    */     //   509: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   512: ldc_w 'Looking UP'
/*    */     //   515: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   518: ldc_w 'Looking DOWN'
/*    */     //   521: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   524: ldc_w 'Looking LEFT'
/*    */     //   527: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   530: ldc_w 'Looking RIGHT'
/*    */     //   533: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   536: ldc_w 'Looking Counter-Clockwise'
/*    */     //   539: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   542: ldc_w 'Looking Clockwise'
/*    */     //   545: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   548: ldc_w 'Walks in dir to leash range, then returns'
/*    */     //   551: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   554: ldc_w 'Custom 0x7B'
/*    */     //   557: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   560: ldc_w 'Custom 0x7C'
/*    */     //   563: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   566: ldc_w 'Custom 0x7D'
/*    */     //   569: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   572: ldc_w 'Custom 0x7E'
/*    */     //   575: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   578: ldc_w 'Custom Pumpking'
/*    */     //   581: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   584: aload_0
/*    */     //   585: dup
/*    */     //   586: getfield v9 : Lf/W1;
/*    */     //   589: aload_1
/*    */     //   590: invokevirtual rk0 : (Lf/cQ;)V
/*    */     //   593: getfield mn : B
/*    */     //   596: invokestatic n80 : (B)Z
/*    */     //   599: ifeq -> 613
/*    */     //   602: aload_0
/*    */     //   603: getfield v9 : Lf/W1;
/*    */     //   606: iconst_0
/*    */     //   607: invokevirtual Z30 : (I)V
/*    */     //   610: goto -> 622
/*    */     //   613: aload_0
/*    */     //   614: getfield v9 : Lf/W1;
/*    */     //   617: bipush #14
/*    */     //   619: invokevirtual Z30 : (I)V
/*    */     //   622: aload_0
/*    */     //   623: getfield K80 : Lf/W1;
/*    */     //   626: invokestatic fJ : ()B
/*    */     //   629: invokevirtual Z30 : (I)V
/*    */     //   632: aload_0
/*    */     //   633: getstatic f/lO.C80 : [B
/*    */     //   636: aload_0
/*    */     //   637: getfield uL0 : Lf/W1;
/*    */     //   640: getfield Wa0 : Lf/A60;
/*    */     //   643: getfield go : I
/*    */     //   646: baload
/*    */     //   647: istore_1
/*    */     //   648: getfield Ks : Lf/zT;
/*    */     //   651: getfield hk : I
/*    */     //   654: i2s
/*    */     //   655: dup
/*    */     //   656: dup
/*    */     //   657: istore_2
/*    */     //   658: iload_1
/*    */     //   659: invokestatic IV : ()Lf/hX;
/*    */     //   662: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   665: pop
/*    */     //   666: invokestatic aR : (IB)Z
/*    */     //   669: istore_3
/*    */     //   670: sipush #2000
/*    */     //   673: if_icmplt -> 686
/*    */     //   676: iload_3
/*    */     //   677: ifne -> 686
/*    */     //   680: iload_2
/*    */     //   681: bipush #10
/*    */     //   683: idiv
/*    */     //   684: i2s
/*    */     //   685: istore_2
/*    */     //   686: iload_1
/*    */     //   687: ifeq -> 876
/*    */     //   690: iload_1
/*    */     //   691: iconst_1
/*    */     //   692: if_icmpeq -> 876
/*    */     //   695: iload_1
/*    */     //   696: bipush #10
/*    */     //   698: if_icmpne -> 704
/*    */     //   701: goto -> 876
/*    */     //   704: iload_1
/*    */     //   705: iconst_2
/*    */     //   706: if_icmpne -> 743
/*    */     //   709: aload_0
/*    */     //   710: dup
/*    */     //   711: getstatic f/km.mI0 : Lf/P1;
/*    */     //   714: getfield AN : Lf/Wo;
/*    */     //   717: iload_2
/*    */     //   718: invokevirtual AuX : (S)Lf/IB;
/*    */     //   721: getfield w70 : [Lf/U70;
/*    */     //   724: dup
/*    */     //   725: astore_3
/*    */     //   726: putfield hH0 : [Lf/U70;
/*    */     //   729: getfield Ug0 : Lf/vF0;
/*    */     //   732: getfield TS : Lf/rH;
/*    */     //   735: aload_3
/*    */     //   736: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   739: pop
/*    */     //   740: goto -> 906
/*    */     //   743: iload_1
/*    */     //   744: iconst_4
/*    */     //   745: if_icmpne -> 810
/*    */     //   748: getstatic f/km.mI0 : Lf/P1;
/*    */     //   751: getfield yE : Lf/BE;
/*    */     //   754: dup
/*    */     //   755: astore_3
/*    */     //   756: getfield xb : Lf/h30;
/*    */     //   759: iload_2
/*    */     //   760: invokevirtual Fb : (S)Z
/*    */     //   763: ifne -> 771
/*    */     //   766: aconst_null
/*    */     //   767: astore_3
/*    */     //   768: goto -> 790
/*    */     //   771: aload_3
/*    */     //   772: getfield Vl0 : Lf/qw0;
/*    */     //   775: aload_3
/*    */     //   776: getfield xb : Lf/h30;
/*    */     //   779: iload_2
/*    */     //   780: invokevirtual Z90 : (S)S
/*    */     //   783: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   786: checkcast [Lf/U70;
/*    */     //   789: astore_3
/*    */     //   790: aload_0
/*    */     //   791: dup
/*    */     //   792: aload_3
/*    */     //   793: putfield hH0 : [Lf/U70;
/*    */     //   796: getfield Ug0 : Lf/vF0;
/*    */     //   799: getfield TS : Lf/rH;
/*    */     //   802: aload_3
/*    */     //   803: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   806: pop
/*    */     //   807: goto -> 906
/*    */     //   810: getstatic f/km.mI0 : Lf/P1;
/*    */     //   813: getfield MT : Lf/gD;
/*    */     //   816: dup
/*    */     //   817: astore_3
/*    */     //   818: ifnull -> 906
/*    */     //   821: aload_3
/*    */     //   822: getfield fm : Lf/h30;
/*    */     //   825: iload_2
/*    */     //   826: invokevirtual Fb : (S)Z
/*    */     //   829: ifne -> 837
/*    */     //   832: aconst_null
/*    */     //   833: astore_3
/*    */     //   834: goto -> 856
/*    */     //   837: aload_3
/*    */     //   838: getfield sk : Lf/qw0;
/*    */     //   841: aload_3
/*    */     //   842: getfield fm : Lf/h30;
/*    */     //   845: iload_2
/*    */     //   846: invokevirtual Z90 : (S)S
/*    */     //   849: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   852: checkcast [Lf/U70;
/*    */     //   855: astore_3
/*    */     //   856: aload_0
/*    */     //   857: dup
/*    */     //   858: aload_3
/*    */     //   859: putfield hH0 : [Lf/U70;
/*    */     //   862: getfield Ug0 : Lf/vF0;
/*    */     //   865: getfield TS : Lf/rH;
/*    */     //   868: aload_3
/*    */     //   869: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   872: pop
/*    */     //   873: goto -> 906
/*    */     //   876: aload_0
/*    */     //   877: dup
/*    */     //   878: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   881: iload_1
/*    */     //   882: iload_2
/*    */     //   883: iconst_0
/*    */     //   884: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   887: invokevirtual Uu : ()[Lf/U70;
/*    */     //   890: dup
/*    */     //   891: astore_3
/*    */     //   892: putfield hH0 : [Lf/U70;
/*    */     //   895: getfield Ug0 : Lf/vF0;
/*    */     //   898: getfield TS : Lf/rH;
/*    */     //   901: aload_3
/*    */     //   902: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   905: pop
/*    */     //   906: iload_1
/*    */     //   907: bipush #10
/*    */     //   909: if_icmpne -> 960
/*    */     //   912: iload_2
/*    */     //   913: sipush #2000
/*    */     //   916: if_icmplt -> 960
/*    */     //   919: iload_2
/*    */     //   920: iload_1
/*    */     //   921: invokestatic IV : ()Lf/hX;
/*    */     //   924: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   927: pop
/*    */     //   928: invokestatic aR : (IB)Z
/*    */     //   931: ifeq -> 948
/*    */     //   934: aload_0
/*    */     //   935: invokestatic IV : ()Lf/hX;
/*    */     //   938: iload_2
/*    */     //   939: invokevirtual eg : (I)Lf/lpt1;
/*    */     //   942: putfield Op0 : Lf/lpt1;
/*    */     //   945: goto -> 978
/*    */     //   948: aload_0
/*    */     //   949: getfield Op0 : Lf/lpt1;
/*    */     //   952: dup
/*    */     //   953: astore_2
/*    */     //   954: ifnull -> 978
/*    */     //   957: goto -> 969
/*    */     //   960: aload_0
/*    */     //   961: getfield Op0 : Lf/lpt1;
/*    */     //   964: dup
/*    */     //   965: astore_2
/*    */     //   966: ifnull -> 978
/*    */     //   969: aload_0
/*    */     //   970: aload_2
/*    */     //   971: invokevirtual Ea0 : ()V
/*    */     //   974: aconst_null
/*    */     //   975: putfield Op0 : Lf/lpt1;
/*    */     //   978: iload_1
/*    */     //   979: aload_0
/*    */     //   980: getfield Com8 : B
/*    */     //   983: if_icmpeq -> 1082
/*    */     //   986: iload_1
/*    */     //   987: aload_0
/*    */     //   988: iload_1
/*    */     //   989: putfield Com8 : B
/*    */     //   992: ifeq -> 1074
/*    */     //   995: iload_1
/*    */     //   996: iconst_1
/*    */     //   997: if_icmpne -> 1003
/*    */     //   1000: goto -> 1074
/*    */     //   1003: iload_1
/*    */     //   1004: iconst_3
/*    */     //   1005: if_icmpeq -> 1062
/*    */     //   1008: iload_1
/*    */     //   1009: iconst_4
/*    */     //   1010: if_icmpne -> 1016
/*    */     //   1013: goto -> 1062
/*    */     //   1016: iload_1
/*    */     //   1017: iconst_2
/*    */     //   1018: if_icmpne -> 1024
/*    */     //   1021: goto -> 1051
/*    */     //   1024: iload_1
/*    */     //   1025: bipush #10
/*    */     //   1027: if_icmpne -> 1051
/*    */     //   1030: aload_0
/*    */     //   1031: dup
/*    */     //   1032: getfield Ks : Lf/zT;
/*    */     //   1035: sipush #201
/*    */     //   1038: invokevirtual Hr0 : (I)V
/*    */     //   1041: getfield k10 : Lf/zT;
/*    */     //   1044: iconst_0
/*    */     //   1045: invokevirtual Hr0 : (I)V
/*    */     //   1048: goto -> 1082
/*    */     //   1051: aload_0
/*    */     //   1052: getfield k10 : Lf/zT;
/*    */     //   1055: iconst_3
/*    */     //   1056: invokevirtual Hr0 : (I)V
/*    */     //   1059: goto -> 1082
/*    */     //   1062: aload_0
/*    */     //   1063: getfield k10 : Lf/zT;
/*    */     //   1066: bipush #11
/*    */     //   1068: invokevirtual Hr0 : (I)V
/*    */     //   1071: goto -> 1082
/*    */     //   1074: aload_0
/*    */     //   1075: getfield k10 : Lf/zT;
/*    */     //   1078: iconst_0
/*    */     //   1079: invokevirtual Hr0 : (I)V
/*    */     //   1082: aload_0
/*    */     //   1083: dup
/*    */     //   1084: dup
/*    */     //   1085: invokevirtual PI : ()V
/*    */     //   1088: getfield wD : Lf/rh;
/*    */     //   1091: astore_0
/*    */     //   1092: getfield hH0 : [Lf/U70;
/*    */     //   1095: dup
/*    */     //   1096: astore_1
/*    */     //   1097: ifnull -> 1110
/*    */     //   1100: aload_1
/*    */     //   1101: arraylength
/*    */     //   1102: ifle -> 1110
/*    */     //   1105: iconst_1
/*    */     //   1106: istore_1
/*    */     //   1107: goto -> 1112
/*    */     //   1110: iconst_0
/*    */     //   1111: istore_1
/*    */     //   1112: aload_0
/*    */     //   1113: iload_1
/*    */     //   1114: invokevirtual sk0 : (Z)V
/*    */     //   1117: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 7
/*    */     //   #2	-> 18
/*    */     //   #3	-> 21
/*    */     //   #4	-> 623
/*    */     //   #5	-> 640
/*    */     //   #6	-> 643
/*    */     //   #7	-> 646
/*    */     //   #8	-> 651
/*    */     //   #9	-> 659
/*    */     //   #10	-> 721
/*    */     //   #11	-> 726
/*    */     //   #12	-> 732
/*    */     //   #13	-> 736
/*    */     //   #14	-> 756
/*    */     //   #15	-> 760
/*    */     //   #16	-> 772
/*    */     //   #17	-> 793
/*    */     //   #18	-> 799
/*    */     //   #19	-> 803
/*    */     //   #20	-> 822
/*    */     //   #21	-> 826
/*    */     //   #22	-> 838
/*    */     //   #23	-> 859
/*    */     //   #24	-> 865
/*    */     //   #25	-> 869
/*    */     //   #26	-> 878
/*    */     //   #27	-> 884
/*    */     //   #28	-> 898
/*    */     //   #29	-> 902
/*    */   }
/*    */   
/*    */   public final void PI() {
/*    */     U70[] arrayOfU70;
/*    */     if ((arrayOfU70 = this.hH0) == null)
/*    */       return; 
/*    */     zT zT1;
/*    */     int i;
/*    */     if ((i = (zT1 = this.k10).hk) >= arrayOfU70.length) {
/*    */       if (arrayOfU70.length > 0) {
/*    */         zT1.Hr0(arrayOfU70.length - 1);
/*    */       } else {
/*    */         zT1.Hr0(0);
/*    */       } 
/*    */       i = this.k10.hk;
/*    */     } 
/*    */     if ((arrayOfU70 = this.hH0) != null && arrayOfU70.length > 0) {
/*    */       this.Ug0.TS.qt(new U70[] { arrayOfU70[i] });
/*    */     } else {
/*    */       this.Ug0.TS.H();
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */