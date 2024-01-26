/*    */ package f;public final class My extends JG0 { public static final eo mp = new eo(); public Ut0 qb; public Ut0 l3; public I zg; public int h; public My() { pRn pRn; this((byte)-1, (byte)-1, (byte)-1, (byte)-1); this.zg = new I(this, this); this.h = 255; Xu("nameplategui"); this.qb = new Ut0();
/*    */     this.l3 = new Ut0();
/*    */     Vo0(this.zg);
/*    */     km.si0 = this; }
/*  5 */   public static void bL(WX paramWX) { Oc0 oc0 = km.u4.E50; String str3;
/*    */     mG mG;
/*    */     String str1, str2;
/*  8 */     if ((paramWX.CON > 0) ? (str3 = "nameplate-staff").equals(paramWX.cl) : (oc0.tl0.return(paramWX.lj) ? (
/*  9 */       str2 = "nameplate-friend")
/* 10 */       .equals(paramWX.cl) : (
/*    */       
/* 12 */       ((mG = km.u4.Wn0) != null) ? (
/*    */       
/* 14 */       mG.FH0(paramWX.lj) ? (paramWX
/* 15 */       .lj == 
/* 16 */       km.a3
/* 17 */       .yD || (
/* 18 */       str1 = "nameplate-team")
/* 19 */       .equals(paramWX.cl)) : (
/* 20 */       str1 = "nameplate")
/* 21 */       .equals(paramWX.cl)) : (str1 = "nameplate").equals(paramWX.cl)))) { paramWX.Xu(str1); paramWX.cZ(); }  } public final void dz(Kr0 paramKr0) { int i = paramKr0.Jg; WX wX; if ((wX = (WX)this.qb.Z6(i)) != null) { FV fV; if ((fV = paramKr0.Wy0) != this.h9) { VP vP; this.h9 = fV; if (fV == null) { if ((vP = this.Wx0) != null)
/* 22 */             vP.ra0();  this.Xb0.H(); } else if (this.Wx0 == null) { VP vP2; this(48, 40, (FV)vP); this.Wx0 = new VP(); String str; if (!(str = "misc-nameplate-nobg").equals(vP2.cl)) { vP2.Xu(str); vP2.cZ(); }  this.Wx0.X70.Dd = 2; this.Wx0.mM(); this.Wx0.nx(-33, -35); this.Wx0.ME(this.Kd - 25, this.er0 + 45); VP vP1 = this.Wx0; si(vP1, Ub()); }  }  byte b = paramKr0.mn; short s; if ((s = paramKr0.Ks0) != this.yi) { vF0 vF0; this.yi = s; if (s == -1) { if ((vF0 = this.S10) != null) { jf0(vF0); this.S10.jA0(); this.S10 = null; }  this.Xb0.H(); } else { if (this.S10 == null) { this(70, 50, 0); this.S10 = new vF0(); String str; if (!(str = "misc-nameplate-nobg").equals(vF01.cl)) { vF01.Xu(str); vF01.cZ(); }  this
/* 23 */               .S10.mM(); this.S10
/*    */ 
/*    */               
/* 26 */               .ME(this.Kd - 25, this.er0 + 45);
/* 27 */             this.S10
/* 28 */               .TS
/* 29 */               .tL(72, 72);
/* 30 */             this.S10.TS
/* 31 */               .yE = 250;
/* 32 */             this.S10.TS.vU = true;
/* 33 */             this.S10.TS.zT(-2, -20); vF0 vF01 = this.S10;
/* 34 */             si(vF01, Ub()); }
/* 35 */            this.S10
/* 36 */             .TS
/*    */             
/* 38 */             .sm(um0.Kt0.lb(s, false, vF0)); }
/*    */          }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void NO(tc paramtc, int paramInt, String paramString, eo parameo, Z50 paramZ50) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   3: getfield fi0 : Lf/Ur0;
/*    */     //   6: astore #6
/*    */     //   8: getstatic f/My.mp : Lf/eo;
/*    */     //   11: dup
/*    */     //   12: astore #7
/*    */     //   14: aload #4
/*    */     //   16: dup
/*    */     //   17: dup
/*    */     //   18: aload #7
/*    */     //   20: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   23: pop
/*    */     //   24: getfield x : F
/*    */     //   27: fstore #4
/*    */     //   29: getfield y : F
/*    */     //   32: fstore #8
/*    */     //   34: getfield z : F
/*    */     //   37: fstore #9
/*    */     //   39: fload #4
/*    */     //   41: fload #8
/*    */     //   43: fload #9
/*    */     //   45: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   48: pop
/*    */     //   49: invokestatic hS : ()Z
/*    */     //   52: ifeq -> 104
/*    */     //   55: aload #6
/*    */     //   57: getfield Xe : Lf/ny;
/*    */     //   60: aload #7
/*    */     //   62: aload #6
/*    */     //   64: dup
/*    */     //   65: dup2
/*    */     //   66: getfield G80 : I
/*    */     //   69: i2f
/*    */     //   70: fstore #4
/*    */     //   72: getfield Cn0 : I
/*    */     //   75: i2f
/*    */     //   76: fstore #8
/*    */     //   78: getfield QQ : I
/*    */     //   81: i2f
/*    */     //   82: fstore #9
/*    */     //   84: getfield o6 : I
/*    */     //   87: i2f
/*    */     //   88: fstore #10
/*    */     //   90: fload #4
/*    */     //   92: fload #8
/*    */     //   94: fload #9
/*    */     //   96: fload #10
/*    */     //   98: invokevirtual jf0 : (Lf/eo;FFFF)V
/*    */     //   101: goto -> 150
/*    */     //   104: aload #6
/*    */     //   106: getfield Xe : Lf/ny;
/*    */     //   109: aload #7
/*    */     //   111: aload #6
/*    */     //   113: dup
/*    */     //   114: dup2
/*    */     //   115: getfield G80 : I
/*    */     //   118: i2f
/*    */     //   119: fstore #4
/*    */     //   121: getfield Cn0 : I
/*    */     //   124: i2f
/*    */     //   125: fstore #8
/*    */     //   127: getfield QQ : I
/*    */     //   130: i2f
/*    */     //   131: fstore #9
/*    */     //   133: getfield o6 : I
/*    */     //   136: i2f
/*    */     //   137: fstore #10
/*    */     //   139: fload #4
/*    */     //   141: fload #8
/*    */     //   143: fload #9
/*    */     //   145: fload #10
/*    */     //   147: invokevirtual Ix0 : (Lf/eo;FFFF)V
/*    */     //   150: aload #6
/*    */     //   152: aload #7
/*    */     //   154: getfield x : F
/*    */     //   157: f2i
/*    */     //   158: istore #4
/*    */     //   160: getfield ow : F
/*    */     //   163: f2i
/*    */     //   164: aload #7
/*    */     //   166: getfield y : F
/*    */     //   169: f2i
/*    */     //   170: isub
/*    */     //   171: istore #6
/*    */     //   173: invokestatic hS : ()Z
/*    */     //   176: ifeq -> 187
/*    */     //   179: aload #7
/*    */     //   181: getfield y : F
/*    */     //   184: f2i
/*    */     //   185: istore #6
/*    */     //   187: aload_0
/*    */     //   188: aload_1
/*    */     //   189: getfield Jg : I
/*    */     //   192: istore #7
/*    */     //   194: getfield qb : Lf/Ut0;
/*    */     //   197: iload #7
/*    */     //   199: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   202: checkcast f/WX
/*    */     //   205: dup
/*    */     //   206: astore #8
/*    */     //   208: ifnull -> 413
/*    */     //   211: iload_2
/*    */     //   212: aload #8
/*    */     //   214: iload_2
/*    */     //   215: aload #8
/*    */     //   217: aload #5
/*    */     //   219: aload #8
/*    */     //   221: iload #4
/*    */     //   223: aload #8
/*    */     //   225: dup
/*    */     //   226: aload_3
/*    */     //   227: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   230: invokevirtual Td0 : ()I
/*    */     //   233: iconst_2
/*    */     //   234: idiv
/*    */     //   235: isub
/*    */     //   236: iconst_1
/*    */     //   237: isub
/*    */     //   238: iload #6
/*    */     //   240: invokevirtual ME : (II)Z
/*    */     //   243: pop
/*    */     //   244: invokevirtual y00 : (Lf/Z50;)V
/*    */     //   247: invokevirtual ZU : (I)V
/*    */     //   250: ifle -> 296
/*    */     //   253: aload_0
/*    */     //   254: getfield Bo0 : Lf/throws;
/*    */     //   257: ifnonnull -> 263
/*    */     //   260: goto -> 296
/*    */     //   263: aload #8
/*    */     //   265: getfield fr0 : Lf/JG0;
/*    */     //   268: ifnull -> 296
/*    */     //   271: aload_0
/*    */     //   272: aload #8
/*    */     //   274: invokevirtual ID : (Lf/JG0;)I
/*    */     //   277: dup
/*    */     //   278: istore_1
/*    */     //   279: aload_0
/*    */     //   280: invokevirtual Ub : ()I
/*    */     //   283: iconst_1
/*    */     //   284: isub
/*    */     //   285: dup
/*    */     //   286: istore_3
/*    */     //   287: if_icmpge -> 296
/*    */     //   290: aload_0
/*    */     //   291: iload_1
/*    */     //   292: iload_3
/*    */     //   293: invokevirtual Tb0 : (II)V
/*    */     //   296: aload_0
/*    */     //   297: getfield l3 : Lf/Ut0;
/*    */     //   300: iload #7
/*    */     //   302: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   305: checkcast f/KK0
/*    */     //   308: dup
/*    */     //   309: astore_1
/*    */     //   310: ifnull -> 412
/*    */     //   313: iload_2
/*    */     //   314: ifle -> 358
/*    */     //   317: aload_0
/*    */     //   318: getfield Bo0 : Lf/throws;
/*    */     //   321: ifnonnull -> 327
/*    */     //   324: goto -> 358
/*    */     //   327: aload_1
/*    */     //   328: getfield fr0 : Lf/JG0;
/*    */     //   331: ifnull -> 358
/*    */     //   334: aload_0
/*    */     //   335: aload_1
/*    */     //   336: invokevirtual ID : (Lf/JG0;)I
/*    */     //   339: dup
/*    */     //   340: istore_2
/*    */     //   341: aload_0
/*    */     //   342: invokevirtual Ub : ()I
/*    */     //   345: iconst_1
/*    */     //   346: isub
/*    */     //   347: dup
/*    */     //   348: istore_3
/*    */     //   349: if_icmpge -> 358
/*    */     //   352: aload_0
/*    */     //   353: iload_2
/*    */     //   354: iload_3
/*    */     //   355: invokevirtual Tb0 : (II)V
/*    */     //   358: iload #6
/*    */     //   360: aload_1
/*    */     //   361: iload #4
/*    */     //   363: aload_1
/*    */     //   364: getfield xY : I
/*    */     //   367: iconst_2
/*    */     //   368: idiv
/*    */     //   369: isub
/*    */     //   370: istore_0
/*    */     //   371: getfield HC : I
/*    */     //   374: isub
/*    */     //   375: istore_2
/*    */     //   376: getstatic f/h1.QP : Z
/*    */     //   379: ifne -> 399
/*    */     //   382: iload #7
/*    */     //   384: getstatic f/km.a3 : Lf/vh0;
/*    */     //   387: getfield Ct : Lf/Jo;
/*    */     //   390: getfield Jg : I
/*    */     //   393: if_icmpne -> 399
/*    */     //   396: iinc #2, 16
/*    */     //   399: aload_1
/*    */     //   400: dup
/*    */     //   401: iload_0
/*    */     //   402: iload_2
/*    */     //   403: invokevirtual ME : (II)Z
/*    */     //   406: pop
/*    */     //   407: iconst_1
/*    */     //   408: invokevirtual wI0 : (Z)V
/*    */     //   411: return
/*    */     //   412: return
/*    */     //   413: aload_0
/*    */     //   414: dup
/*    */     //   415: dup
/*    */     //   416: new f/WX
/*    */     //   419: dup
/*    */     //   420: astore_0
/*    */     //   421: aload #5
/*    */     //   423: aload_0
/*    */     //   424: iload #4
/*    */     //   426: aload_0
/*    */     //   427: dup
/*    */     //   428: dup
/*    */     //   429: aload_3
/*    */     //   430: aload_1
/*    */     //   431: iload_2
/*    */     //   432: invokespecial <init> : (Ljava/lang/String;Lf/tc;I)V
/*    */     //   435: invokestatic bL : (Lf/WX;)V
/*    */     //   438: invokevirtual Td0 : ()I
/*    */     //   441: iconst_2
/*    */     //   442: idiv
/*    */     //   443: isub
/*    */     //   444: iconst_1
/*    */     //   445: isub
/*    */     //   446: iload #6
/*    */     //   448: invokevirtual ME : (II)Z
/*    */     //   451: pop
/*    */     //   452: invokevirtual y00 : (Lf/Z50;)V
/*    */     //   455: invokevirtual Ub : ()I
/*    */     //   458: aload_0
/*    */     //   459: swap
/*    */     //   460: invokevirtual si : (Lf/JG0;I)V
/*    */     //   463: getfield qb : Lf/Ut0;
/*    */     //   466: iload #7
/*    */     //   468: aload_0
/*    */     //   469: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   472: pop
/*    */     //   473: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 3
/*    */     //   #2	-> 8
/*    */     //   #3	-> 24
/*    */     //   #4	-> 49
/*    */     //   #5	-> 57
/*    */     //   #6	-> 66
/*    */     //   #7	-> 106
/*    */     //   #8	-> 115
/*    */     //   #9	-> 154
/*    */     //   #10	-> 160
/*    */     //   #11	-> 166
/*    */     //   #12	-> 189
/*    */     //   #13	-> 194
/*    */     //   #14	-> 240
/*    */     //   #15	-> 244
/*    */     //   #16	-> 254
/*    */     //   #17	-> 265
/*    */     //   #18	-> 274
/*    */     //   #19	-> 297
/*    */     //   #20	-> 318
/*    */     //   #21	-> 328
/*    */     //   #22	-> 336
/*    */     //   #23	-> 364
/*    */     //   #24	-> 368
/*    */     //   #25	-> 371
/*    */     //   #26	-> 376
/*    */     //   #27	-> 387
/*    */     //   #28	-> 390
/*    */     //   #29	-> 403
/*    */     //   #30	-> 408
/*    */     //   #31	-> 448
/*    */     //   #32	-> 452
/*    */     //   #33	-> 455
/*    */     //   #34	-> 463
/*    */   }
/*    */   
/*    */   public final void dy0(tc paramtc, eo parameo, Z50 paramZ50) {
/*    */     eo1.getClass();
/*    */     float f2 = parameo.x, f3 = parameo.y, f4 = parameo.z;
/*    */     eo eo1;
/*    */     (eo1 = mp).TG0(f2, f3, f4);
/*    */     float f1 = ur0.G80;
/*    */     f3 = ur0.Cn0;
/*    */     f4 = ur0.QQ;
/*    */     float f5 = ur0.o6;
/*    */     Ur0 ur0;
/*    */     (ur0 = km.wI0.fi0).Xe.Ix0(eo1, f1, f3, f4, f5);
/*    */     int i = (int)mp.x;
/*    */     int j = (int)km.wI0.fi0.ow - (int)eo1.y - 48;
/*    */     int k = paramtc.Jg;
/*    */     WX wX2;
/*    */     if ((wX2 = (WX)this.qb.Z6(k)) != null) {
/*    */       wX2.ME(i, j);
/*    */       wX2.y00(paramZ50);
/*    */       return;
/*    */     } 
/*    */     this("", paramtc, 0);
/*    */     ME(i, j);
/*    */     WX wX1;
/*    */     (wX1 = new WX()).y00(paramZ50);
/*    */     si(this, Ub());
/*    */     this.qb.A3(k, this);
/*    */   }
/*    */   
/*    */   public final void Bd(short paramShort, int paramInt1, int paramInt2) {
/*    */     WX wX;
/*    */     if ((wX = (WX)this.qb.Z6(paramInt1)) != null) {
/*    */       if (this.o7 != paramInt2) {
/*    */         this.o7 = paramInt2;
/*    */         if (this.nP == null) {
/*    */           JG0 jG0;
/*    */           this();
/*    */           this.nP = jG0;
/*    */           si(jG0, Ub());
/*    */         } 
/*    */         if (this.o7 != -1) {
/*    */           this.nP.jz0("moisture-level" + paramInt2);
/*    */         } else {
/*    */           JG0 jG0 = this.nP;
/*    */           String str;
/*    */           if (!(str = "widget").equals(jG0.cl)) {
/*    */             jG0.Xu(str);
/*    */             jG0.cZ();
/*    */           } 
/*    */         } 
/*    */         this.nP.mM();
/*    */       } 
/*    */       if (this.jo0 != paramShort) {
/*    */         this.jo0 = paramShort;
/*    */         if (paramShort > 0) {
/*    */           this.Xb0.qt(new U70[] { wm0.y0.SJ0(paramShort, false) });
/*    */           this.Xb0.tL(24, 24);
/*    */         } else {
/*    */           this.Xb0.H();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void uB(int paramInt, String paramString) {
/*    */     if (!h1.bf)
/*    */       return; 
/*    */     if (paramString.contains("{") && paramString.contains("}")) {
/*    */       StringBuilder stringBuilder;
/*    */       this();
/*    */       pA.Dg0.TF.Cd(null, paramString, 0, stringBuilder, false, true, false);
/*    */       paramString = (new StringBuilder()).toString();
/*    */     } 
/*    */     if (paramString.contains("%")) {
/*    */       StringBuilder stringBuilder;
/*    */       this();
/*    */       pA.Dg0.TF.Cd(null, paramString, 0, stringBuilder, false, true, false);
/*    */       paramString = (new StringBuilder()).toString();
/*    */     } 
/*    */     if (paramString.contains("[") && paramString.contains("]"))
/*    */       paramString = paramString.replaceAll("\\[#(.*?)\\](.*?)\\[#(.*?)\\]", "$2"); 
/*    */     int i = -500, j = -500;
/*    */     i = wX.Kd;
/*    */     j = wX.er0 - 32;
/*    */     WX wX;
/*    */     if ((wX = (WX)this.qb.Z6(paramInt)) != null && paramInt == km.a3.Ct.Jg)
/*    */       j += 16; 
/*    */     if (i > 0 && j > 0) {
/*    */       KK0 kK0;
/*    */       if ((kK0 = (KK0)this.l3.Z6(paramInt)) != null) {
/*    */         kK0.bY = System.currentTimeMillis() + 5000L;
/*    */         kK0.volatile.Oh(B40.df("<div style=\"display: inline; word-wrap: break-word;\">").append(dg.km0(paramString)).append("\n</div>").toString());
/*    */       } else {
/*    */         this(paramString, paramInt);
/*    */         (new KK0()).Xu("chat-bubble");
/*    */         si(kK0, Ub());
/*    */         this.l3.A3(paramInt, kK0);
/*    */       } 
/*    */       kK0.ME(i, j);
/*    */       kK0.wI0(false);
/*    */       kK0.mM();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void d40() {}
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     if (this.h != 255 - ud.Bp().yF()) {
/*    */       this.h = 255 - ud.Bp().yF();
/*    */       byte b = (byte)this.h;
/*    */       this.zg.Ix(new pRn((byte)-1, (byte)-1, (byte)-1, b));
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/My.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */