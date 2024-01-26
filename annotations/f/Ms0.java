/*  1 */ package f;public final class Ms0 extends hO { public final Ip ZM; public vT[] h50; public p30 LpT5; public final boolean RW(int paramInt) { vT vT1; if (h1.J20(paramInt, BM.M8)) { int j; if (((j = this.Mt0) + 1) % this.rZ != 0) this.Mt0 = j + 1;  } else if (h1.J20(paramInt, BM.Oq)) { int j; if (((j = this.Mt0) + 1) % this.rZ != 1) this.Mt0 = j - 1;  } else if (h1.J20(paramInt, BM.ni)) { int j; int k; if ((j = this.Mt0) - (k = this.rZ) >= 0) this.Mt0 = j - k;  } else { int j; int k; if (h1.J20(paramInt, BM.N70) && (j = this.Mt0) + (k = this.rZ) < this.h50.length) this.Mt0 = j + k;  }  int i; vT[] arrayOfVT; if ((i = this.Mt0) >= 0 && i < (arrayOfVT = this.h50).length) VA0.c90(arrayOfVT[i]);  if (h1.J20(paramInt, BM.bC) && p3()) { if ((vT1 = this.h50[this.Mt0]).kN)
/*    */       {
/*    */         
/*  4 */         hm.Fz0(this.TG0.oh0); }  return true; }
/*  5 */      if (h1.J20(paramInt, BM.lc)) C40((byte)-1);  return true; } public int Mt0; public int rZ; public Ms0(byte paramByte, Aq paramAq, Uc0 paramUc0, short[] paramArrayOfshort) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup2
/*    */     //   3: iload_1
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (BLf/Aq;)V
/*    */     //   8: iconst_3
/*    */     //   9: putfield rZ : I
/*    */     //   12: ldc 'messagebox'
/*    */     //   14: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   17: new f/Ip
/*    */     //   20: dup
/*    */     //   21: dup
/*    */     //   22: aload_0
/*    */     //   23: swap
/*    */     //   24: dup
/*    */     //   25: invokespecial <init> : ()V
/*    */     //   28: putfield ZM : Lf/Ip;
/*    */     //   31: ldc 'npc-interaction-panel'
/*    */     //   33: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   36: iconst_1
/*    */     //   37: invokevirtual Zf0 : (Z)V
/*    */     //   40: bipush #6
/*    */     //   42: anewarray f/vT
/*    */     //   45: putfield h50 : [Lf/vT;
/*    */     //   48: iconst_0
/*    */     //   49: istore_1
/*    */     //   50: iload_1
/*    */     //   51: aload_0
/*    */     //   52: getfield h50 : [Lf/vT;
/*    */     //   55: dup
/*    */     //   56: astore_2
/*    */     //   57: arraylength
/*    */     //   58: if_icmpge -> 296
/*    */     //   61: new f/vT
/*    */     //   64: astore #5
/*    */     //   66: ldc ''
/*    */     //   68: astore #6
/*    */     //   70: invokestatic XU : ()Z
/*    */     //   73: ifeq -> 84
/*    */     //   76: sipush #300
/*    */     //   79: istore #7
/*    */     //   81: goto -> 89
/*    */     //   84: sipush #209
/*    */     //   87: istore #7
/*    */     //   89: invokestatic XU : ()Z
/*    */     //   92: ifeq -> 102
/*    */     //   95: bipush #80
/*    */     //   97: istore #8
/*    */     //   99: goto -> 106
/*    */     //   102: bipush #52
/*    */     //   104: istore #8
/*    */     //   106: iload_1
/*    */     //   107: aload #4
/*    */     //   109: aload_0
/*    */     //   110: aload_2
/*    */     //   111: iload_1
/*    */     //   112: aload #5
/*    */     //   114: aload #6
/*    */     //   116: iload #7
/*    */     //   118: iload #8
/*    */     //   120: invokespecial <init> : (Ljava/lang/String;II)V
/*    */     //   123: aload #5
/*    */     //   125: aastore
/*    */     //   126: getfield h50 : [Lf/vT;
/*    */     //   129: iload_1
/*    */     //   130: aaload
/*    */     //   131: ldc '/battle-button-ui'
/*    */     //   133: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   136: arraylength
/*    */     //   137: if_icmplt -> 145
/*    */     //   140: aconst_null
/*    */     //   141: astore_2
/*    */     //   142: goto -> 154
/*    */     //   145: aload_3
/*    */     //   146: aload #4
/*    */     //   148: iload_1
/*    */     //   149: saload
/*    */     //   150: invokevirtual ky : (S)Lf/j40;
/*    */     //   153: astore_2
/*    */     //   154: aload_2
/*    */     //   155: ifnonnull -> 171
/*    */     //   158: aload_0
/*    */     //   159: getfield h50 : [Lf/vT;
/*    */     //   162: iload_1
/*    */     //   163: aaload
/*    */     //   164: aload_2
/*    */     //   165: invokevirtual EG0 : (Lf/j40;)V
/*    */     //   168: goto -> 242
/*    */     //   171: aload_2
/*    */     //   172: aload_0
/*    */     //   173: dup
/*    */     //   174: getfield h50 : [Lf/vT;
/*    */     //   177: iload_1
/*    */     //   178: aaload
/*    */     //   179: aload_2
/*    */     //   180: invokevirtual EG0 : (Lf/j40;)V
/*    */     //   183: getfield h50 : [Lf/vT;
/*    */     //   186: iload_1
/*    */     //   187: aaload
/*    */     //   188: astore #5
/*    */     //   190: invokevirtual Q00 : ()Z
/*    */     //   193: ifeq -> 201
/*    */     //   196: iconst_m1
/*    */     //   197: istore_2
/*    */     //   198: goto -> 206
/*    */     //   201: aload_2
/*    */     //   202: invokevirtual s5 : ()B
/*    */     //   205: istore_2
/*    */     //   206: aload_3
/*    */     //   207: aload #5
/*    */     //   209: iload_2
/*    */     //   210: invokevirtual Nc : (B)V
/*    */     //   213: invokevirtual s20 : ()Lf/aq0;
/*    */     //   216: getstatic f/aq0.ss : Lf/aq0;
/*    */     //   219: if_acmpne -> 242
/*    */     //   222: aload_0
/*    */     //   223: dup
/*    */     //   224: getfield h50 : [Lf/vT;
/*    */     //   227: iload_1
/*    */     //   228: aaload
/*    */     //   229: iconst_0
/*    */     //   230: iconst_0
/*    */     //   231: invokevirtual o3 : (II)V
/*    */     //   234: getfield h50 : [Lf/vT;
/*    */     //   237: iload_1
/*    */     //   238: aaload
/*    */     //   239: invokevirtual Zq0 : ()V
/*    */     //   242: iload_1
/*    */     //   243: aload #4
/*    */     //   245: arraylength
/*    */     //   246: if_icmplt -> 254
/*    */     //   249: iconst_m1
/*    */     //   250: istore_2
/*    */     //   251: goto -> 260
/*    */     //   254: aload #4
/*    */     //   256: iload_1
/*    */     //   257: saload
/*    */     //   258: i2b
/*    */     //   259: istore_2
/*    */     //   260: iload_1
/*    */     //   261: aload_0
/*    */     //   262: dup
/*    */     //   263: getfield h50 : [Lf/vT;
/*    */     //   266: iload_1
/*    */     //   267: aaload
/*    */     //   268: getstatic f/et.COM2 : Lf/et;
/*    */     //   271: invokevirtual C70 : (Lf/et;)V
/*    */     //   274: getfield h50 : [Lf/vT;
/*    */     //   277: iload_1
/*    */     //   278: aaload
/*    */     //   279: aload_0
/*    */     //   280: iload_2
/*    */     //   281: <illegal opcode> run : (Lf/Ms0;B)Ljava/lang/Runnable;
/*    */     //   286: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   289: iconst_1
/*    */     //   290: iadd
/*    */     //   291: i2b
/*    */     //   292: istore_1
/*    */     //   293: goto -> 50
/*    */     //   296: new f/p30
/*    */     //   299: astore_1
/*    */     //   300: bipush #53
/*    */     //   302: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   305: invokevirtual toUpperCase : ()Ljava/lang/String;
/*    */     //   308: astore_2
/*    */     //   309: invokestatic XU : ()Z
/*    */     //   312: ifeq -> 322
/*    */     //   315: sipush #133
/*    */     //   318: istore_3
/*    */     //   319: goto -> 325
/*    */     //   322: bipush #96
/*    */     //   324: istore_3
/*    */     //   325: invokestatic XU : ()Z
/*    */     //   328: ifeq -> 339
/*    */     //   331: sipush #129
/*    */     //   334: istore #4
/*    */     //   336: goto -> 343
/*    */     //   339: bipush #30
/*    */     //   341: istore #4
/*    */     //   343: aload_0
/*    */     //   344: dup
/*    */     //   345: dup
/*    */     //   346: dup2
/*    */     //   347: dup2
/*    */     //   348: aload_1
/*    */     //   349: aload_0
/*    */     //   350: aload_1
/*    */     //   351: dup
/*    */     //   352: aload_2
/*    */     //   353: iload_3
/*    */     //   354: iload #4
/*    */     //   356: invokespecial <init> : (Ljava/lang/String;II)V
/*    */     //   359: putfield LpT5 : Lf/p30;
/*    */     //   362: ldc 'battle-button-return'
/*    */     //   364: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   367: getfield LpT5 : Lf/p30;
/*    */     //   370: aload_0
/*    */     //   371: <illegal opcode> run : (Lf/Ms0;)Ljava/lang/Runnable;
/*    */     //   376: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   379: getfield ZM : Lf/Ip;
/*    */     //   382: dup
/*    */     //   383: invokevirtual d7 : ()Lf/cr0;
/*    */     //   386: iconst_2
/*    */     //   387: anewarray f/U90
/*    */     //   390: dup
/*    */     //   391: dup
/*    */     //   392: aload_0
/*    */     //   393: swap
/*    */     //   394: aload_0
/*    */     //   395: getfield ZM : Lf/Ip;
/*    */     //   398: invokevirtual mE0 : ()Lf/g0;
/*    */     //   401: iconst_3
/*    */     //   402: anewarray f/JG0
/*    */     //   405: dup
/*    */     //   406: dup
/*    */     //   407: astore_1
/*    */     //   408: aload_0
/*    */     //   409: getfield h50 : [Lf/vT;
/*    */     //   412: dup
/*    */     //   413: astore_2
/*    */     //   414: aload_1
/*    */     //   415: aload_2
/*    */     //   416: aload_1
/*    */     //   417: aload_2
/*    */     //   418: iconst_0
/*    */     //   419: aaload
/*    */     //   420: iconst_0
/*    */     //   421: swap
/*    */     //   422: aastore
/*    */     //   423: iconst_1
/*    */     //   424: aaload
/*    */     //   425: iconst_1
/*    */     //   426: swap
/*    */     //   427: aastore
/*    */     //   428: iconst_2
/*    */     //   429: aaload
/*    */     //   430: iconst_2
/*    */     //   431: swap
/*    */     //   432: aastore
/*    */     //   433: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   436: iconst_0
/*    */     //   437: swap
/*    */     //   438: aastore
/*    */     //   439: getfield ZM : Lf/Ip;
/*    */     //   442: invokevirtual mE0 : ()Lf/g0;
/*    */     //   445: iconst_3
/*    */     //   446: anewarray f/JG0
/*    */     //   449: dup
/*    */     //   450: dup
/*    */     //   451: astore_1
/*    */     //   452: aload_0
/*    */     //   453: getfield h50 : [Lf/vT;
/*    */     //   456: dup
/*    */     //   457: astore_2
/*    */     //   458: aload_1
/*    */     //   459: aload_2
/*    */     //   460: aload_1
/*    */     //   461: aload_2
/*    */     //   462: iconst_3
/*    */     //   463: aaload
/*    */     //   464: iconst_0
/*    */     //   465: swap
/*    */     //   466: aastore
/*    */     //   467: iconst_4
/*    */     //   468: aaload
/*    */     //   469: iconst_1
/*    */     //   470: swap
/*    */     //   471: aastore
/*    */     //   472: iconst_5
/*    */     //   473: aaload
/*    */     //   474: iconst_2
/*    */     //   475: swap
/*    */     //   476: aastore
/*    */     //   477: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   480: iconst_1
/*    */     //   481: swap
/*    */     //   482: aastore
/*    */     //   483: invokevirtual cOM8 : ([Lf/U90;)Lf/U90;
/*    */     //   486: invokevirtual WN : (Lf/U90;)V
/*    */     //   489: getfield ZM : Lf/Ip;
/*    */     //   492: dup
/*    */     //   493: invokevirtual d7 : ()Lf/cr0;
/*    */     //   496: iconst_3
/*    */     //   497: anewarray f/U90
/*    */     //   500: dup
/*    */     //   501: dup
/*    */     //   502: astore_1
/*    */     //   503: aload_0
/*    */     //   504: aload_1
/*    */     //   505: aload_0
/*    */     //   506: aload_1
/*    */     //   507: aload_0
/*    */     //   508: getfield ZM : Lf/Ip;
/*    */     //   511: invokevirtual mE0 : ()Lf/g0;
/*    */     //   514: iconst_2
/*    */     //   515: anewarray f/JG0
/*    */     //   518: dup
/*    */     //   519: dup
/*    */     //   520: astore_1
/*    */     //   521: aload_0
/*    */     //   522: getfield h50 : [Lf/vT;
/*    */     //   525: dup
/*    */     //   526: aload_1
/*    */     //   527: swap
/*    */     //   528: iconst_0
/*    */     //   529: aaload
/*    */     //   530: iconst_0
/*    */     //   531: swap
/*    */     //   532: aastore
/*    */     //   533: iconst_3
/*    */     //   534: aaload
/*    */     //   535: iconst_1
/*    */     //   536: swap
/*    */     //   537: aastore
/*    */     //   538: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   541: iconst_0
/*    */     //   542: swap
/*    */     //   543: aastore
/*    */     //   544: getfield ZM : Lf/Ip;
/*    */     //   547: invokevirtual mE0 : ()Lf/g0;
/*    */     //   550: iconst_2
/*    */     //   551: anewarray f/JG0
/*    */     //   554: dup
/*    */     //   555: dup
/*    */     //   556: astore_1
/*    */     //   557: aload_0
/*    */     //   558: getfield h50 : [Lf/vT;
/*    */     //   561: dup
/*    */     //   562: aload_1
/*    */     //   563: swap
/*    */     //   564: iconst_1
/*    */     //   565: aaload
/*    */     //   566: iconst_0
/*    */     //   567: swap
/*    */     //   568: aastore
/*    */     //   569: iconst_4
/*    */     //   570: aaload
/*    */     //   571: iconst_1
/*    */     //   572: swap
/*    */     //   573: aastore
/*    */     //   574: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   577: iconst_1
/*    */     //   578: swap
/*    */     //   579: aastore
/*    */     //   580: getfield ZM : Lf/Ip;
/*    */     //   583: invokevirtual mE0 : ()Lf/g0;
/*    */     //   586: iconst_2
/*    */     //   587: anewarray f/JG0
/*    */     //   590: dup
/*    */     //   591: dup
/*    */     //   592: astore_1
/*    */     //   593: aload_0
/*    */     //   594: getfield h50 : [Lf/vT;
/*    */     //   597: dup
/*    */     //   598: aload_1
/*    */     //   599: swap
/*    */     //   600: iconst_2
/*    */     //   601: aaload
/*    */     //   602: iconst_0
/*    */     //   603: swap
/*    */     //   604: aastore
/*    */     //   605: iconst_5
/*    */     //   606: aaload
/*    */     //   607: iconst_1
/*    */     //   608: swap
/*    */     //   609: aastore
/*    */     //   610: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
/*    */     //   613: iconst_2
/*    */     //   614: swap
/*    */     //   615: aastore
/*    */     //   616: invokevirtual cOM8 : ([Lf/U90;)Lf/U90;
/*    */     //   619: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   622: getfield ZM : Lf/Ip;
/*    */     //   625: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   628: getfield LpT5 : Lf/p30;
/*    */     //   631: invokevirtual J8 : (Lf/JG0;)V
/*  5 */     //   634: return } public final void LM(throws paramthrows) { UB0.Kg0.fN(() -> VA0.c90(this.h50[this.Mt0])); } public final boolean Cs0() { return false; } public final void EX(nY paramnY) { this.ZM.Tm(km.wI0.dG(), 240); } public final void d40() { p30 p301; int i, j; if (km.XU()) { this.ZM.mM(); this.ZM.ME(km.wI0.dG() / 2 - this.ZM.xY / 2, km.wI0.k1() / 2 - this.ZM.HC / 2);
/*  6 */       this.LpT5.mM(); p301 = this.LpT5;
/*    */       
/*  8 */       i = km.wI0.dG() / 2 - this.LpT5.xY / 2; j = this.ZM.yR(); } else { int k = (km.wI0.k1() - 500) / 4; this.ZM.Tm(800, 115); k = km.wI0.dG() / 2 - 400; this.ZM
/*  9 */         .ME(k, k + 350); vT[] arrayOfVT;
/* 10 */       for (i = (arrayOfVT = this.h50).length, j = 0; j < i; ) { arrayOfVT[j].uh0(200, 48); j++; }  this.LpT5.mM(); this.LpT5.uh0(128, 24); p301 = this.LpT5;
/* 11 */       i = this.ZM.m40() - this.LpT5.xY;
/*    */       
/* 13 */       j = this.ZM.mD() - this.LpT5.HC; }  p301
/* 14 */       .ME(i, j);
/* 15 */     mM(); }
/*    */ 
/*    */   
/*    */   public final boolean Eq() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void SB0(int paramInt1, int paramInt2) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ms0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */