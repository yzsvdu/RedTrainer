/*  1 */ package f;public final class pC { private void pH(DK paramDK) { if (!paramDK.Ss0 || (
/*    */ 
/*    */       
/*  4 */       !this.ar.TG0.nm0() && 
/*    */ 
/*    */       
/*  7 */       !this.Wf.TG0.nm0()))
/*  8 */     { this.BD0.wI0(false); iB[] arrayOfIB; for (byte b1 = 0; b1 < (arrayOfIB = this.ht0).length; ) { arrayOfIB[b1].wI0(false); b1 = (byte)(b1 + 1); }  } else { this.BD0.wI0(true); iB[] arrayOfIB; for (byte b1 = 0; b1 < (arrayOfIB = this.ht0).length; ) { arrayOfIB[b1].wI0(true); b1 = (byte)(b1 + 1); }  }  R8 r8 = km.u4;
/*  9 */     byte b = paramDK.tl0;
/*    */ 
/*    */     
/* 12 */     boolean bool = this.ar.TG0.nm0();
/* 13 */     r8.k20
/* 14 */       .B3(b, bool); EC.ny0(r8.k20); }
/*    */ 
/*    */   
/*    */   public final CC0[] fK;
/*    */   public final DK a8;
/*    */   public final DK ct;
/*    */   public ge0 ar;
/*    */   public ge0 Wf;
/*    */   public dQ WJ;
/*    */   public dQ ZT;
/*    */   public W1 BD0;
/*    */   public iB[] ht0;
/*    */   public final ve RH0;
/*    */   public boolean pz0;
/*    */   public boolean ai0;
/*    */   
/*    */   public pC(ve paramve, DK paramDK1, DK paramDK2, CC0[] paramArrayOfCC0, List paramList) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload #4
/*    */     //   3: aload_0
/*    */     //   4: aload_3
/*    */     //   5: aload_0
/*    */     //   6: aload_2
/*    */     //   7: aload_0
/*    */     //   8: aload_1
/*    */     //   9: aload_0
/*    */     //   10: dup
/*    */     //   11: dup2
/*    */     //   12: dup2
/*    */     //   13: invokespecial <init> : ()V
/*    */     //   16: new f/dQ
/*    */     //   19: dup
/*    */     //   20: ldc ''
/*    */     //   22: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   25: putfield WJ : Lf/dQ;
/*    */     //   28: new f/dQ
/*    */     //   31: dup
/*    */     //   32: ldc ''
/*    */     //   34: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   37: putfield ZT : Lf/dQ;
/*    */     //   40: bipush #6
/*    */     //   42: anewarray f/iB
/*    */     //   45: putfield ht0 : [Lf/iB;
/*    */     //   48: iconst_0
/*    */     //   49: putfield pz0 : Z
/*    */     //   52: iconst_0
/*    */     //   53: putfield ai0 : Z
/*    */     //   56: putfield RH0 : Lf/ve;
/*    */     //   59: putfield a8 : Lf/DK;
/*    */     //   62: putfield ct : Lf/DK;
/*    */     //   65: putfield fK : [Lf/CC0;
/*    */     //   68: getstatic f/km.u4 : Lf/R8;
/*    */     //   71: invokevirtual vC : ()Lf/BF;
/*    */     //   74: invokevirtual K70 : ()B
/*    */     //   77: dup
/*    */     //   78: istore_1
/*    */     //   79: aload_3
/*    */     //   80: invokevirtual eI : ()B
/*    */     //   83: if_icmplt -> 92
/*    */     //   86: iconst_1
/*    */     //   87: istore #4
/*    */     //   89: goto -> 95
/*    */     //   92: iconst_0
/*    */     //   93: istore #4
/*    */     //   95: iload_1
/*    */     //   96: aload_2
/*    */     //   97: aload_0
/*    */     //   98: dup
/*    */     //   99: dup
/*    */     //   100: iload #4
/*    */     //   102: putfield ai0 : Z
/*    */     //   105: new f/ge0
/*    */     //   108: dup
/*    */     //   109: astore #4
/*    */     //   111: aload_2
/*    */     //   112: aload_0
/*    */     //   113: aload #4
/*    */     //   115: dup
/*    */     //   116: invokespecial <init> : ()V
/*    */     //   119: putfield ar : Lf/ge0;
/*    */     //   122: invokevirtual GH0 : ()Z
/*    */     //   125: invokevirtual sk0 : (Z)V
/*    */     //   128: getfield ar : Lf/ge0;
/*    */     //   131: getstatic f/km.u4 : Lf/R8;
/*    */     //   134: aload_2
/*    */     //   135: invokevirtual oa : ()B
/*    */     //   138: invokevirtual VF0 : (I)Z
/*    */     //   141: invokevirtual zs : (Z)V
/*    */     //   144: getfield ar : Lf/ge0;
/*    */     //   147: aload_0
/*    */     //   148: aload_2
/*    */     //   149: <illegal opcode> run : (Lf/pC;Lf/DK;)Ljava/lang/Runnable;
/*    */     //   154: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   157: invokevirtual eI : ()B
/*    */     //   160: if_icmpge -> 233
/*    */     //   163: aload_2
/*    */     //   164: aload_0
/*    */     //   165: dup
/*    */     //   166: getfield ar : Lf/ge0;
/*    */     //   169: iconst_0
/*    */     //   170: invokevirtual zs : (Z)V
/*    */     //   173: getfield ar : Lf/ge0;
/*    */     //   176: iconst_0
/*    */     //   177: invokevirtual sk0 : (Z)V
/*    */     //   180: invokevirtual eI : ()B
/*    */     //   183: bipush #9
/*    */     //   185: if_icmpne -> 204
/*    */     //   188: aload_0
/*    */     //   189: getfield ar : Lf/ge0;
/*    */     //   192: sipush #5610
/*    */     //   195: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   198: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*    */     //   201: goto -> 225
/*    */     //   204: aload_0
/*    */     //   205: getfield ar : Lf/ge0;
/*    */     //   208: aload_2
/*    */     //   209: invokevirtual eI : ()B
/*    */     //   212: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   215: sipush #5624
/*    */     //   218: swap
/*    */     //   219: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   222: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*    */     //   225: aload_0
/*    */     //   226: getfield ar : Lf/ge0;
/*    */     //   229: iconst_0
/*    */     //   230: invokevirtual Pb0 : (I)V
/*    */     //   233: iload_1
/*    */     //   234: aload_3
/*    */     //   235: aload_0
/*    */     //   236: dup
/*    */     //   237: dup2
/*    */     //   238: getfield WJ : Lf/dQ;
/*    */     //   241: sipush #7100
/*    */     //   244: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   247: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   250: getfield WJ : Lf/dQ;
/*    */     //   253: ldc 'label-time'
/*    */     //   255: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   258: new f/ge0
/*    */     //   261: dup
/*    */     //   262: astore_1
/*    */     //   263: aload_3
/*    */     //   264: aload_0
/*    */     //   265: aload_1
/*    */     //   266: dup
/*    */     //   267: invokespecial <init> : ()V
/*    */     //   270: putfield Wf : Lf/ge0;
/*    */     //   273: invokevirtual GH0 : ()Z
/*    */     //   276: invokevirtual sk0 : (Z)V
/*    */     //   279: getfield Wf : Lf/ge0;
/*    */     //   282: getstatic f/km.u4 : Lf/R8;
/*    */     //   285: aload_3
/*    */     //   286: invokevirtual oa : ()B
/*    */     //   289: invokevirtual VF0 : (I)Z
/*    */     //   292: invokevirtual zs : (Z)V
/*    */     //   295: getfield Wf : Lf/ge0;
/*    */     //   298: new f/E90
/*    */     //   301: dup
/*    */     //   302: aload_0
/*    */     //   303: aload_3
/*    */     //   304: invokespecial <init> : (Lf/pC;Lf/DK;)V
/*    */     //   307: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   310: invokevirtual eI : ()B
/*    */     //   313: if_icmpge -> 386
/*    */     //   316: aload_3
/*    */     //   317: aload_0
/*    */     //   318: dup
/*    */     //   319: getfield Wf : Lf/ge0;
/*    */     //   322: iconst_0
/*    */     //   323: invokevirtual zs : (Z)V
/*    */     //   326: getfield Wf : Lf/ge0;
/*    */     //   329: iconst_0
/*    */     //   330: invokevirtual sk0 : (Z)V
/*    */     //   333: invokevirtual eI : ()B
/*    */     //   336: bipush #9
/*    */     //   338: if_icmpne -> 357
/*    */     //   341: aload_0
/*    */     //   342: getfield Wf : Lf/ge0;
/*    */     //   345: sipush #5610
/*    */     //   348: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   351: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*    */     //   354: goto -> 378
/*    */     //   357: aload_0
/*    */     //   358: getfield Wf : Lf/ge0;
/*    */     //   361: aload_2
/*    */     //   362: invokevirtual eI : ()B
/*    */     //   365: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   368: sipush #5624
/*    */     //   371: swap
/*    */     //   372: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   375: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*    */     //   378: aload_0
/*    */     //   379: getfield Wf : Lf/ge0;
/*    */     //   382: iconst_0
/*    */     //   383: invokevirtual Pb0 : (I)V
/*    */     //   386: aload #5
/*    */     //   388: aload_0
/*    */     //   389: dup
/*    */     //   390: getfield ZT : Lf/dQ;
/*    */     //   393: sipush #7101
/*    */     //   396: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   399: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   402: getfield ZT : Lf/dQ;
/*    */     //   405: ldc 'label-time'
/*    */     //   407: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   410: new f/OZ
/*    */     //   413: dup
/*    */     //   414: astore_1
/*    */     //   415: aload #5
/*    */     //   417: invokespecial <init> : (Ljava/util/Collection;)V
/*    */     //   420: new f/W1
/*    */     //   423: dup
/*    */     //   424: aload_0
/*    */     //   425: swap
/*    */     //   426: dup
/*    */     //   427: aload_1
/*    */     //   428: invokespecial <init> : (Lf/cQ;)V
/*    */     //   431: putfield BD0 : Lf/W1;
/*    */     //   434: ldc 'signup-combobox'
/*    */     //   436: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   439: invokeinterface size : ()I
/*    */     //   444: iconst_1
/*    */     //   445: if_icmpgt -> 456
/*    */     //   448: aload_0
/*    */     //   449: getfield BD0 : Lf/W1;
/*    */     //   452: iconst_0
/*    */     //   453: invokevirtual sk0 : (Z)V
/*    */     //   456: getstatic f/km.u4 : Lf/R8;
/*    */     //   459: aload_2
/*    */     //   460: invokevirtual nr : ()I
/*    */     //   463: invokevirtual s3 : (I)I
/*    */     //   466: dup
/*    */     //   467: istore #4
/*    */     //   469: iflt -> 481
/*    */     //   472: iload #4
/*    */     //   474: aload_1
/*    */     //   475: invokevirtual pu : ()I
/*    */     //   478: if_icmplt -> 484
/*    */     //   481: iconst_0
/*    */     //   482: istore #4
/*    */     //   484: aload_0
/*    */     //   485: dup
/*    */     //   486: getfield BD0 : Lf/W1;
/*    */     //   489: iload #4
/*    */     //   491: invokevirtual Z30 : (I)V
/*    */     //   494: getfield BD0 : Lf/W1;
/*    */     //   497: aload_0
/*    */     //   498: <illegal opcode> run : (Lf/pC;)Ljava/lang/Runnable;
/*    */     //   503: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   506: iconst_0
/*    */     //   507: istore_1
/*    */     //   508: iload_1
/*    */     //   509: aload_0
/*    */     //   510: getfield ht0 : [Lf/iB;
/*    */     //   513: dup
/*    */     //   514: astore #4
/*    */     //   516: arraylength
/*    */     //   517: if_icmpge -> 541
/*    */     //   520: iload_1
/*    */     //   521: aload #4
/*    */     //   523: iload_1
/*    */     //   524: new f/iB
/*    */     //   527: dup
/*    */     //   528: astore_1
/*    */     //   529: invokespecial <init> : ()V
/*    */     //   532: aload_1
/*    */     //   533: aastore
/*    */     //   534: iconst_1
/*    */     //   535: iadd
/*    */     //   536: i2b
/*    */     //   537: istore_1
/*    */     //   538: goto -> 508
/*    */     //   541: aload_2
/*    */     //   542: invokevirtual t : ()Z
/*    */     //   545: ifeq -> 575
/*    */     //   548: aload_3
/*    */     //   549: invokevirtual t : ()Z
/*    */     //   552: ifeq -> 575
/*    */     //   555: aload_0
/*    */     //   556: getfield ar : Lf/ge0;
/*    */     //   559: invokevirtual EE : ()Z
/*    */     //   562: ifne -> 611
/*    */     //   565: aload_0
/*    */     //   566: getfield Wf : Lf/ge0;
/*    */     //   569: invokevirtual EE : ()Z
/*    */     //   572: ifne -> 611
/*    */     //   575: aload_0
/*    */     //   576: getfield BD0 : Lf/W1;
/*    */     //   579: iconst_0
/*    */     //   580: invokevirtual wI0 : (Z)V
/*    */     //   583: iconst_0
/*    */     //   584: istore_1
/*    */     //   585: iload_1
/*    */     //   586: aload_0
/*    */     //   587: getfield ht0 : [Lf/iB;
/*    */     //   590: dup
/*    */     //   591: astore_2
/*    */     //   592: arraylength
/*    */     //   593: if_icmpge -> 611
/*    */     //   596: iload_1
/*    */     //   597: aload_2
/*    */     //   598: iload_1
/*    */     //   599: aaload
/*    */     //   600: iconst_0
/*    */     //   601: invokevirtual wI0 : (Z)V
/*    */     //   604: iconst_1
/*    */     //   605: iadd
/*    */     //   606: i2b
/*    */     //   607: istore_1
/*    */     //   608: goto -> 585
/*    */     //   611: aload_0
/*    */     //   612: invokevirtual nM : ()V
/*    */     //   615: return
/*    */   }
/*    */   
/*    */   public final void DG() {
/*    */     boolean bool1, bool2;
/*    */     ge0 ge01 = this.ar;
/*    */     if (this.ai0 && !this.pz0 && this.a8.yg0) {
/*    */       bool2 = true;
/*    */     } else {
/*    */       bool2 = false;
/*    */     } 
/*    */     ge01.sk0(bool2);
/*    */     ge01 = this.Wf;
/*    */     if (this.ai0 && !this.pz0 && this.ct.yg0) {
/*    */       bool1 = true;
/*    */     } else {
/*    */       bool1 = false;
/*    */     } 
/*    */     ge01.sk0(bool1);
/*    */   }
/*    */   
/*    */   public final void nM() {
/*    */     byte b = 0;
/*    */     Uh0 uh0 = null;
/*    */     W1 w1;
/*    */     if ((w1 = this.BD0) != null && (uh0 = (Uh0)w1.WW()) != null)
/*    */       b = uh0.aj0; 
/*    */     int i = this.a8.Qu;
/*    */     km.u4.cOm3.B3(i, b);
/*    */     EC.Qm(km.u4.cOm3);
/*    */     iB[] arrayOfIB = this.ht0;
/*    */     CC0[] arrayOfCC0 = this.fK;
/*    */     DO[] arrayOfDO = this.a8.lf;
/*    */     this.RH0.XT(uh0, (Qv0[])this, arrayOfCC0, arrayOfDO);
/*    */     DG();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */