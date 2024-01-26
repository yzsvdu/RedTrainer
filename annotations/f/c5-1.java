/*  1 */ package f;public final class c5 extends Qa0 { public final Vq0 IF0; private void ny(uM paramuM) { this.fj0.remove(paramuM); y2(false); z6(); } public ArrayList fj0; public c5(pA parampA) { super(km.XU()); Ip ip; Q20 q20; zT zT; o2 o2; this.fj0 = h1.wL0(); TG0(parampA::e30); Xu("chat-tab-settings"); Lo(Ml0.OH0(1532)); EP(1); jJ0(true); this(); this.IF0 = vq0; Vq0 vq0; (vq0 = new Vq0()).T1(true); this(); int i = h1.iF0; this(0, 100, i); this(zT); if (!km.XU()) { (new dQ(Ml0.OH0(1550))).Xu("label-chat-settings-transparency"); q20.J8(new dQ(Ml0.OH0(1550))); q20.J8(o2); }  this(); (new Ip()).rK0((new Ip()).mE0().cOM8(new U90[] { mE0().Aq(10).Mg(new JG0[] { vq0, q20 }) })); (new Ip()).WN((new Ip()).d7().cOM8(new U90[] { d7().Mg(new JG0[] { vq0, q20 }) })); J8(new Ip()); y2(false); } private void fs0(of paramof, ZY[] paramArrayOfZY, ge0[] paramArrayOfge0, uM paramuM) { if (paramof.F2
/*  2 */       .PH0
/*  3 */       .toString()
/*  4 */       .isEmpty() || 
/*  5 */       paramof.F2
/*  6 */       .PH0
/*  7 */       .toString()
/*  8 */       .contains(";")) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 23 */       js.vu0
/*    */         
/* 25 */         .Pu(-1, Ml0.OH0(1539));
/*    */       return;
/*    */     } 
/*    */     this();
/*    */     uM uM1;
/*    */     HashSet<ZY> hashSet;
/*    */     for (byte b = 0; b < paramArrayOfZY.length; ) {
/*    */       if (!(paramArrayOfge0[b]).TG0.nm0())
/*    */         hashSet.add(paramArrayOfZY[b]); 
/*    */       b++;
/*    */     } 
/*    */     if (hashSet.size() == ZY.R70.length)
/*    */       return; 
/*    */     if (paramuM == null) {
/*    */       this(paramof.F2.PH0.toString(), hashSet);
/*    */       this.fj0.add(this);
/*    */       y2(true);
/*    */       z6();
/*    */     } else {
/*    */       paramuM.Fg = paramof.F2.PH0.toString();
/*    */       paramuM.ul.clear();
/*    */       paramuM.ul.addAll(hashSet);
/*    */       super.y2(false);
/*    */       super.z6();
/*    */     }  }
/*    */ 
/*    */   
/*    */   private void Uf(boolean paramBoolean) {
/*    */     this.IF0.d00.gx();
/*    */     this.IF0.PRN.gx();
/*    */     this.IF0.Us0.clear();
/*    */     this.IF0.zO = null;
/*    */     for (uM uM : this.fj0) {
/*    */       String str1 = uM.Fg;
/*    */       this.IF0.WS(kd(uM), str1);
/*    */     } 
/*    */     if (paramBoolean)
/*    */       this.IF0.dA0(this.IF0.Hf(this.IF0.Us0.size() - 1)); 
/*    */     String str = Ml0.OH0(1533);
/*    */     this.IF0.WS(kd(null), this);
/*    */   }
/*    */   
/*    */   public final void y2(boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: <illegal opcode> run : (Lf/c5;Z)Ljava/lang/Runnable;
/*    */     //   10: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   13: return
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU())
/*    */       QI(); 
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final Ip kd(uM paramuM) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: new f/Ip
/*    */     //   4: dup
/*    */     //   5: dup
/*    */     //   6: astore_2
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: ldc_w 'chat-settings-area'
/*    */     //   13: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   16: new f/rS
/*    */     //   19: dup
/*    */     //   20: aconst_null
/*    */     //   21: invokespecial <init> : (Lf/JG0;)V
/*    */     //   24: iconst_2
/*    */     //   25: invokevirtual zG0 : (I)V
/*    */     //   28: new f/dQ
/*    */     //   31: dup
/*    */     //   32: dup2
/*    */     //   33: astore_3
/*    */     //   34: sipush #1534
/*    */     //   37: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   40: astore #4
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: aload #4
/*    */     //   47: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   50: ldc_w 'label-chat-settings-title'
/*    */     //   53: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   56: new f/of
/*    */     //   59: dup
/*    */     //   60: astore #4
/*    */     //   62: aload_3
/*    */     //   63: aload #4
/*    */     //   65: aconst_null
/*    */     //   66: invokespecial <init> : (Lf/Sa0;)V
/*    */     //   69: getfield wL : Ljava/lang/CharSequence;
/*    */     //   72: invokeinterface toString : ()Ljava/lang/String;
/*    */     //   77: pop
/*    */     //   78: new f/JG0
/*    */     //   81: dup
/*    */     //   82: astore #5
/*    */     //   84: aload #4
/*    */     //   86: aload #5
/*    */     //   88: dup
/*    */     //   89: dup
/*    */     //   90: invokespecial <init> : ()V
/*    */     //   93: ldc_w 'label-chat-settings-button'
/*    */     //   96: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   99: invokevirtual Ub : ()I
/*    */     //   102: invokevirtual si : (Lf/JG0;I)V
/*    */     //   105: sipush #261
/*    */     //   108: bipush #20
/*    */     //   110: invokevirtual Tm : (II)Z
/*    */     //   113: pop
/*    */     //   114: ifnonnull -> 125
/*    */     //   117: ldc_w ''
/*    */     //   120: astore #6
/*    */     //   122: goto -> 131
/*    */     //   125: aload_1
/*    */     //   126: getfield Fg : Ljava/lang/String;
/*    */     //   129: astore #6
/*    */     //   131: aload #4
/*    */     //   133: dup
/*    */     //   134: aload #6
/*    */     //   136: iconst_0
/*    */     //   137: invokevirtual Be0 : (Ljava/lang/String;Z)V
/*    */     //   140: bipush #16
/*    */     //   142: putfield mK0 : I
/*    */     //   145: new f/dQ
/*    */     //   148: dup
/*    */     //   149: dup2
/*    */     //   150: astore #6
/*    */     //   152: sipush #1535
/*    */     //   155: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   158: astore #7
/*    */     //   160: invokespecial <init> : ()V
/*    */     //   163: aload #7
/*    */     //   165: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   168: ldc_w 'label-chat-settings-special'
/*    */     //   171: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   174: new f/Ip
/*    */     //   177: dup
/*    */     //   178: astore #7
/*    */     //   180: invokespecial <init> : ()V
/*    */     //   183: new f/cr0
/*    */     //   186: dup
/*    */     //   187: aload #7
/*    */     //   189: swap
/*    */     //   190: aload #7
/*    */     //   192: invokespecial <init> : (Lf/Ip;)V
/*    */     //   195: iconst_2
/*    */     //   196: anewarray f/JG0
/*    */     //   199: dup
/*    */     //   200: dup
/*    */     //   201: iconst_0
/*    */     //   202: aload_3
/*    */     //   203: aastore
/*    */     //   204: iconst_1
/*    */     //   205: aload #5
/*    */     //   207: aastore
/*    */     //   208: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   211: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   214: iconst_5
/*    */     //   215: invokevirtual Aq : (I)Lf/U90;
/*    */     //   218: aload #6
/*    */     //   220: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   223: astore #8
/*    */     //   225: new f/g0
/*    */     //   228: dup
/*    */     //   229: aload #7
/*    */     //   231: swap
/*    */     //   232: aload #7
/*    */     //   234: invokespecial <init> : (Lf/Ip;)V
/*    */     //   237: iconst_2
/*    */     //   238: anewarray f/JG0
/*    */     //   241: dup
/*    */     //   242: dup
/*    */     //   243: iconst_0
/*    */     //   244: aload_3
/*    */     //   245: aastore
/*    */     //   246: iconst_1
/*    */     //   247: aload #5
/*    */     //   249: aastore
/*    */     //   250: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   253: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   256: aload #6
/*    */     //   258: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   261: astore_3
/*    */     //   262: getstatic f/ZY.R70 : [Lf/ZY;
/*    */     //   265: dup
/*    */     //   266: astore #5
/*    */     //   268: arraylength
/*    */     //   269: anewarray f/ge0
/*    */     //   272: astore #6
/*    */     //   274: iconst_0
/*    */     //   275: istore #9
/*    */     //   277: iload #9
/*    */     //   279: aload #5
/*    */     //   281: arraylength
/*    */     //   282: if_icmpge -> 776
/*    */     //   285: aload_1
/*    */     //   286: aload #6
/*    */     //   288: iload #9
/*    */     //   290: new f/ge0
/*    */     //   293: dup
/*    */     //   294: astore #10
/*    */     //   296: invokespecial <init> : ()V
/*    */     //   299: aload #10
/*    */     //   301: aastore
/*    */     //   302: new f/dQ
/*    */     //   305: dup
/*    */     //   306: dup
/*    */     //   307: astore #10
/*    */     //   309: aload #5
/*    */     //   311: iload #9
/*    */     //   313: aaload
/*    */     //   314: getfield UR : I
/*    */     //   317: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   320: astore #11
/*    */     //   322: invokespecial <init> : ()V
/*    */     //   325: aload #11
/*    */     //   327: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   330: ifnull -> 372
/*    */     //   333: aload #5
/*    */     //   335: iload #9
/*    */     //   337: aload #6
/*    */     //   339: iload #9
/*    */     //   341: aaload
/*    */     //   342: astore #11
/*    */     //   344: aaload
/*    */     //   345: astore #12
/*    */     //   347: aload #11
/*    */     //   349: aload_1
/*    */     //   350: getfield ul : Ljava/util/Set;
/*    */     //   353: aload #12
/*    */     //   355: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   360: iconst_1
/*    */     //   361: ixor
/*    */     //   362: istore #11
/*    */     //   364: getfield TG0 : Lf/protected;
/*    */     //   367: iload #11
/*    */     //   369: invokevirtual Fx0 : (Z)V
/*    */     //   372: iload #9
/*    */     //   374: iconst_1
/*    */     //   375: iadd
/*    */     //   376: dup
/*    */     //   377: istore #11
/*    */     //   379: aload #5
/*    */     //   381: arraylength
/*    */     //   382: if_icmpge -> 665
/*    */     //   385: aload_1
/*    */     //   386: aload #6
/*    */     //   388: iload #11
/*    */     //   390: new f/ge0
/*    */     //   393: dup
/*    */     //   394: astore #12
/*    */     //   396: invokespecial <init> : ()V
/*    */     //   399: aload #12
/*    */     //   401: aastore
/*    */     //   402: new f/dQ
/*    */     //   405: dup
/*    */     //   406: dup
/*    */     //   407: astore #12
/*    */     //   409: aload #5
/*    */     //   411: iload #11
/*    */     //   413: aaload
/*    */     //   414: getfield UR : I
/*    */     //   417: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   420: astore #13
/*    */     //   422: invokespecial <init> : ()V
/*    */     //   425: aload #13
/*    */     //   427: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   430: ifnull -> 472
/*    */     //   433: aload #5
/*    */     //   435: iload #11
/*    */     //   437: aload #6
/*    */     //   439: iload #11
/*    */     //   441: aaload
/*    */     //   442: astore #13
/*    */     //   444: aaload
/*    */     //   445: astore #14
/*    */     //   447: aload #13
/*    */     //   449: aload_1
/*    */     //   450: getfield ul : Ljava/util/Set;
/*    */     //   453: aload #14
/*    */     //   455: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   460: iconst_1
/*    */     //   461: ixor
/*    */     //   462: istore #13
/*    */     //   464: getfield TG0 : Lf/protected;
/*    */     //   467: iload #13
/*    */     //   469: invokevirtual Fx0 : (Z)V
/*    */     //   472: aload_3
/*    */     //   473: aload #7
/*    */     //   475: aload #8
/*    */     //   477: aload #7
/*    */     //   479: aload #6
/*    */     //   481: iload #11
/*    */     //   483: aload #6
/*    */     //   485: iload #9
/*    */     //   487: aload #12
/*    */     //   489: aload #10
/*    */     //   491: ldc_w 'label-chat-settings-title'
/*    */     //   494: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   497: ldc_w 'label-chat-settings-title'
/*    */     //   500: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   503: new f/JG0
/*    */     //   506: dup
/*    */     //   507: dup
/*    */     //   508: astore #13
/*    */     //   510: aload #6
/*    */     //   512: iload #9
/*    */     //   514: aload #13
/*    */     //   516: dup
/*    */     //   517: invokespecial <init> : ()V
/*    */     //   520: ldc_w 'label-chat-settings-button'
/*    */     //   523: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   526: aaload
/*    */     //   527: astore #14
/*    */     //   529: invokevirtual Ub : ()I
/*    */     //   532: aload #14
/*    */     //   534: swap
/*    */     //   535: invokevirtual si : (Lf/JG0;I)V
/*    */     //   538: aaload
/*    */     //   539: bipush #30
/*    */     //   541: bipush #30
/*    */     //   543: invokevirtual Tm : (II)Z
/*    */     //   546: pop
/*    */     //   547: new f/JG0
/*    */     //   550: dup
/*    */     //   551: dup
/*    */     //   552: astore #14
/*    */     //   554: aload #6
/*    */     //   556: iload #11
/*    */     //   558: aload #14
/*    */     //   560: dup
/*    */     //   561: invokespecial <init> : ()V
/*    */     //   564: ldc_w 'label-chat-settings-button'
/*    */     //   567: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   570: aaload
/*    */     //   571: astore #11
/*    */     //   573: invokevirtual Ub : ()I
/*    */     //   576: aload #11
/*    */     //   578: swap
/*    */     //   579: invokevirtual si : (Lf/JG0;I)V
/*    */     //   582: aaload
/*    */     //   583: bipush #30
/*    */     //   585: bipush #30
/*    */     //   587: invokevirtual Tm : (II)Z
/*    */     //   590: pop
/*    */     //   591: iconst_4
/*    */     //   592: anewarray f/JG0
/*    */     //   595: dup
/*    */     //   596: dup
/*    */     //   597: dup2
/*    */     //   598: iconst_0
/*    */     //   599: aload #10
/*    */     //   601: aastore
/*    */     //   602: iconst_1
/*    */     //   603: aload #13
/*    */     //   605: aastore
/*    */     //   606: iconst_2
/*    */     //   607: aload #12
/*    */     //   609: aastore
/*    */     //   610: iconst_3
/*    */     //   611: aload #14
/*    */     //   613: aastore
/*    */     //   614: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   617: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   620: pop
/*    */     //   621: iconst_2
/*    */     //   622: anewarray f/JG0
/*    */     //   625: dup
/*    */     //   626: dup
/*    */     //   627: iconst_0
/*    */     //   628: aload #10
/*    */     //   630: aastore
/*    */     //   631: iconst_1
/*    */     //   632: aload #13
/*    */     //   634: aastore
/*    */     //   635: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   638: invokevirtual Em0 : ()Lf/U90;
/*    */     //   641: iconst_2
/*    */     //   642: anewarray f/JG0
/*    */     //   645: dup
/*    */     //   646: dup
/*    */     //   647: iconst_0
/*    */     //   648: aload #12
/*    */     //   650: aastore
/*    */     //   651: iconst_1
/*    */     //   652: aload #14
/*    */     //   654: aastore
/*    */     //   655: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   658: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   661: pop
/*    */     //   662: goto -> 770
/*    */     //   665: aload_3
/*    */     //   666: aload #7
/*    */     //   668: aload #8
/*    */     //   670: aload #7
/*    */     //   672: aload #6
/*    */     //   674: iload #9
/*    */     //   676: aload #10
/*    */     //   678: ldc_w 'label-chat-settings-title'
/*    */     //   681: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   684: new f/JG0
/*    */     //   687: dup
/*    */     //   688: dup
/*    */     //   689: astore #11
/*    */     //   691: aload #6
/*    */     //   693: iload #9
/*    */     //   695: aload #11
/*    */     //   697: dup
/*    */     //   698: invokespecial <init> : ()V
/*    */     //   701: ldc_w 'label-chat-settings-button'
/*    */     //   704: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   707: aaload
/*    */     //   708: astore #12
/*    */     //   710: invokevirtual Ub : ()I
/*    */     //   713: aload #12
/*    */     //   715: swap
/*    */     //   716: invokevirtual si : (Lf/JG0;I)V
/*    */     //   719: aaload
/*    */     //   720: bipush #30
/*    */     //   722: bipush #30
/*    */     //   724: invokevirtual Tm : (II)Z
/*    */     //   727: pop
/*    */     //   728: iconst_2
/*    */     //   729: anewarray f/JG0
/*    */     //   732: dup
/*    */     //   733: dup
/*    */     //   734: iconst_0
/*    */     //   735: aload #10
/*    */     //   737: aastore
/*    */     //   738: iconst_1
/*    */     //   739: aload #11
/*    */     //   741: aastore
/*    */     //   742: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   745: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   748: pop
/*    */     //   749: iconst_2
/*    */     //   750: anewarray f/JG0
/*    */     //   753: dup
/*    */     //   754: dup
/*    */     //   755: iconst_0
/*    */     //   756: aload #10
/*    */     //   758: aastore
/*    */     //   759: iconst_1
/*    */     //   760: aload #11
/*    */     //   762: aastore
/*    */     //   763: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   766: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   769: pop
/*    */     //   770: iinc #9, 2
/*    */     //   773: goto -> 277
/*    */     //   776: aload_1
/*    */     //   777: new f/Un
/*    */     //   780: astore #9
/*    */     //   782: ifnonnull -> 796
/*    */     //   785: sipush #1536
/*    */     //   788: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   791: astore #10
/*    */     //   793: goto -> 804
/*    */     //   796: sipush #1537
/*    */     //   799: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   802: astore #10
/*    */     //   804: aload_1
/*    */     //   805: aload_3
/*    */     //   806: aload #9
/*    */     //   808: aload #8
/*    */     //   810: aload #9
/*    */     //   812: dup
/*    */     //   813: aload_0
/*    */     //   814: aload #4
/*    */     //   816: aload #9
/*    */     //   818: aload #10
/*    */     //   820: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   823: aload #5
/*    */     //   825: aload #6
/*    */     //   827: aload_1
/*    */     //   828: <illegal opcode> run : (Lf/c5;Lf/of;[Lf/ZY;[Lf/ge0;Lf/uM;)Ljava/lang/Runnable;
/*    */     //   833: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   836: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   839: pop
/*    */     //   840: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   843: pop
/*    */     //   844: ifnull -> 888
/*    */     //   847: aload_3
/*    */     //   848: aload #8
/*    */     //   850: new f/Un
/*    */     //   853: dup
/*    */     //   854: dup
/*    */     //   855: astore #4
/*    */     //   857: aload_0
/*    */     //   858: aload_1
/*    */     //   859: aload #4
/*    */     //   861: sipush #1538
/*    */     //   864: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   867: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   870: <illegal opcode> run : (Lf/c5;Lf/uM;)Ljava/lang/Runnable;
/*    */     //   875: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   878: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   881: pop
/*    */     //   882: aload #4
/*    */     //   884: invokevirtual Ya : (Lf/JG0;)Lf/U90;
/*    */     //   887: pop
/*    */     //   888: aload_2
/*    */     //   889: dup
/*    */     //   890: dup
/*    */     //   891: dup2
/*    */     //   892: aload #7
/*    */     //   894: aload_3
/*    */     //   895: aload #7
/*    */     //   897: aload #8
/*    */     //   899: invokevirtual WN : (Lf/U90;)V
/*    */     //   902: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   905: iconst_1
/*    */     //   906: anewarray f/JG0
/*    */     //   909: dup
/*    */     //   910: iconst_0
/*    */     //   911: aload #7
/*    */     //   913: aastore
/*    */     //   914: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   917: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   920: iconst_1
/*    */     //   921: anewarray f/JG0
/*    */     //   924: dup
/*    */     //   925: iconst_0
/*    */     //   926: aload #7
/*    */     //   928: aastore
/*    */     //   929: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   932: invokevirtual WN : (Lf/U90;)V
/*    */     //   935: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 21
/*    */     //   #2	-> 25
/*    */     //   #3	-> 42
/*    */     //   #4	-> 50
/*    */     //   #5	-> 66
/*    */     //   #6	-> 69
/*    */     //   #7	-> 72
/*    */     //   #8	-> 78
/*    */     //   #9	-> 99
/*    */     //   #10	-> 110
/*    */     //   #11	-> 126
/*    */     //   #12	-> 137
/*    */     //   #13	-> 142
/*    */     //   #14	-> 145
/*    */     //   #15	-> 160
/*    */     //   #16	-> 168
/*    */     //   #17	-> 183
/*    */     //   #18	-> 196
/*    */     //   #19	-> 225
/*    */     //   #20	-> 238
/*    */     //   #21	-> 314
/*    */     //   #22	-> 317
/*    */     //   #23	-> 322
/*    */     //   #24	-> 341
/*    */     //   #25	-> 350
/*    */     //   #26	-> 364
/*    */     //   #27	-> 369
/*    */     //   #28	-> 381
/*    */     //   #29	-> 414
/*    */     //   #30	-> 417
/*    */     //   #31	-> 422
/*    */     //   #32	-> 441
/*    */     //   #33	-> 450
/*    */     //   #34	-> 464
/*    */     //   #35	-> 469
/*    */     //   #36	-> 491
/*    */     //   #37	-> 529
/*    */     //   #38	-> 538
/*    */     //   #39	-> 573
/*    */     //   #40	-> 582
/*    */     //   #41	-> 710
/*    */     //   #42	-> 719
/*    */   }
/*    */   
/*    */   public final void z6() {
/*    */     ArrayList<uM> arrayList = this.fj0;
/*    */     this();
/*    */     StringBuilder stringBuilder1, stringBuilder2;
/*    */     this();
/*    */     for (byte b = 0; b < arrayList.size(); ) {
/*    */       if (b > 0) {
/*    */         stringBuilder1.append(";");
/*    */         stringBuilder2.append(";");
/*    */       } 
/*    */       uM uM;
/*    */       stringBuilder1.append((uM = arrayList.get(b)).Fg);
/*    */       boolean bool = true;
/*    */       for (ZY zY : uM.ul) {
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder2.append(",");
/*    */         } 
/*    */         stringBuilder2.append(zY.oZ);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     h1.pB = stringBuilder1.toString();
/*    */     h1.Rw0 = stringBuilder2.toString();
/*    */     h1.Td();
/*    */     pA pA;
/*    */     wu wu;
/*    */     if ((pA = pA.Dg0) != null && (wu = pA.TF) != null) {
/*    */       ArrayList arrayList1 = this.fj0;
/*    */       wu.j6.clear();
/*    */       wu.j6.addAll(this);
/*    */       wu.jw();
/*    */       wu.Pa0 = true;
/*    */       wu.mp0 = null;
/*    */       wu.zY = null;
/*    */     } 
/*    */     R8 r8;
/*    */     if ((r8 = km.u4) != null) {
/*    */       this.a = 0;
/*    */       this.bn = 0;
/*    */       Ha0(null, true);
/*    */       km.u4.Dn();
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */