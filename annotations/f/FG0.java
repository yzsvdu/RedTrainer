/*  1 */ package f;public final class FG0 extends Kl0 { public final void sM() { this
/*  2 */       .am = this.Ws.get();
/*  3 */     byte b = this.Ws.get();
/*  4 */     this.EW = km.mI0.s2(b); if (this.R6 == 1 && !km.mI0.s2((byte)0)) this.EW = false;  if (!this.EW) return;  this
/*    */       
/*  6 */       .n70 = this.Ws.get();
/*    */     
/*  8 */     this.NE0 = this.Ws.get();
/*    */     
/* 10 */     this.VD0 = this.Ws.get(); if (Mk0.sz0(this.R6)) { int i; byte b1; for (this
/*    */         
/* 12 */         .WO = this.Ws.getShort(), i = R00(), b1 = 0; b1 < i; ) { this.Dq
/*    */           
/* 14 */           .st(this.Ws.getShort(), this.Ws.getShort()); b1++; }  this
/*    */         
/* 16 */         .LA0 = xm.KR(this.Ws.get());
/*    */       
/* 18 */       this.iv = yE0.MB0(this.Ws.get());
/*    */       
/* 20 */       this.zG = vF.t40(this.Ws.get()); return; }  this
/*    */       
/* 22 */       .el = this.Ws.getInt();
/*    */     
/* 24 */     this.nr = this.Ws.getInt();
/*    */     
/* 26 */     this.lq0 = this.Ws.getInt();
/*    */     
/* 28 */     this.Zi0 = this.Ws.getInt();
/*    */     
/* 30 */     this.yT = this.Ws.get();
/*    */     
/* 32 */     this.UI = this.Ws.get();
/*    */     
/* 34 */     this.Ma0 = this.Ws.getShort();
/*    */     
/* 36 */     this.go0 = this.Ws.get();
/*    */     
/* 38 */     this.LA0 = xm.KR(this.Ws.get());
/*    */     
/* 40 */     this.iv = yE0.MB0(this.Ws.get());
/*    */     
/* 42 */     this.zG = vF.t40(this.Ws.get());
/*    */     
/* 44 */     Y80.io(this.Ws.get()); short[] arrayOfShort; for (this.Qg0 = new short[this.yT * this.UI], b = 0; b < (arrayOfShort = this.Qg0).length; ) { arrayOfShort[b] = this
/* 45 */         .Ws.getShort();
/* 46 */       b++; }  if (R00() == 1) { b = 1; } else { b = 0; }  this.Cd0 = b; if (b != 0) { byte[] arrayOfByte; byte b1; short[] arrayOfShort1; for (this
/*    */         
/* 48 */         .rr0 = new short[(arrayOfByte = nk0.HI0(ee0(this.Ws.getInt()))).length / 2], b1 = 0; b1 < (arrayOfShort1 = this.rr0).length; ) { int i; arrayOfShort1[b1] = (short)((arrayOfByte[i = b1 * 2] & 0xFF) + ((arrayOfByte[i + 1] & 0xFF) << 8)); b1++; }  }  Rw0[] arrayOfRw0; for (this.Lg = new Rw0[R00()], b = 0; b < (arrayOfRw0 = this.Lg).length; )
/*    */     { Rw0 rw0;
/* 50 */       c6 c6 = (c6)c6.tq0.Ha0(this.Ws.get());
/* 51 */       int i = this.Ws.getInt();
/* 52 */       byte b2 = this.R6;
/* 53 */       byte b1 = this.Ws.get(), b3 = this.Ws.get();
/* 54 */       this(c6, i, b2, b1, b3); arrayOfRw0[b] = rw0; b++; }  if (R00() == 1) { b = 1; } else { b = 0; }  this.oH0 = b; if (b != 0) { this
/* 55 */         .Ws.getInt();
/* 56 */       this.U5 = au(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte am;
/*    */   public byte R6;
/*    */   public byte n70;
/*    */   public byte NE0;
/*    */   public byte VD0;
/*    */   public int el;
/*    */   public int nr;
/*    */   public int lq0;
/*    */   public int Zi0;
/*    */   public byte yT;
/*    */   public byte UI;
/*    */   public short[] Qg0;
/*    */   public short[] rr0;
/*    */   public Rw0[] Lg;
/*    */   public pB0 bi;
/*    */   public short Ma0;
/*    */   public byte go0;
/*    */   public xm LA0;
/*    */   public yE0 iv;
/*    */   public vF zG;
/*    */   public boolean EW;
/*    */   public boolean oH0;
/*    */   public String U5;
/*    */   public boolean Cd0;
/*    */   public short WO;
/*    */   public h30 Dq;
/*    */   
/*    */   public FG0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */     h30 h301;
/*    */     this.bi = null;
/*    */     this.WO = -1;
/*    */     this();
/*    */     this.Dq = this;
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     boolean bool;
/*    */     if (!this.EW) {
/*    */       (r8()).uk = cG.KA;
/*    */       (r8()).XQ = true;
/*    */       return;
/*    */     } 
/*    */     ro ro = r8();
/*    */     (ro = ro).getClass();
/*    */     byte b;
/*    */     if (((b = this.am) | 0x1) == b) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (bool) {
/*    */       ro.tN = true;
/*    */       Xc0 xc0;
/*    */       if ((xc0 = km.xn) != null) {
/*    */         Ut0 ut0;
/*    */         (ut0 = xc0.U60).getClass();
/*    */         for (Iterator iterator = (new mt(ut0)).iterator(); ((DA0)iterator).hasNext(); ) {
/*    */           AC0 aC0;
/*    */           g g;
/*    */           if ((g = (aC0 = (AC0)((iF0)iterator).next()).p9) != null)
/*    */             g.dispose(); 
/*    */           aC0.p9 = null;
/*    */         } 
/*    */         xc0.U60.clear();
/*    */       } 
/*    */       xk0 xk0 = xk0.Sj0;
/*    */       byte b1 = 0;
/*    */       Lu0[] arrayOfLu0;
/*    */       while (b1 < (arrayOfLu0 = xk0.Pf0).length) {
/*    */         Lu0 lu0;
/*    */         for (Iterator iterator = (lu0 = arrayOfLu0[b1]).iC.values().iterator(); iterator.hasNext(); ) {
/*    */           ZH[][] arrayOfZH = ((zM)iterator.next()).Qs;
/*    */           byte b2 = 0;
/*    */           while (b2 < arrayOfZH.length) {
/*    */             ZH[] arrayOfZH1;
/*    */             for (byte b3 = 0; b3 < (arrayOfZH1 = arrayOfZH[b2]).length; ) {
/*    */               arrayOfZH1[b3].dispose();
/*    */               b3++;
/*    */             } 
/*    */             b2++;
/*    */           } 
/*    */         } 
/*    */         lu0.iC.clear();
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       km.a3.F4(K70(), bool);
/*    */       if ((b | 0x2) == b) {
/*    */         Xi xi;
/*    */         if ((xi = km.wI0.iJ0) != null)
/*    */           xi.xL(); 
/*    */         ro.e20.W3(new Ya());
/*    */         boolean bool1 = false;
/*    */         R2 r2 = null;
/*    */         pA pA1;
/*    */         if ((pA1 = ((R8)ro).YG0.MH0) != null)
/*    */           pA1.U10(bool1, r2); 
/*    */         ro.Wp();
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */       ro.b00(Ml0.la(89, "Possible rom corruption detected.\nPlease reimport a clean rom and try again.\nIf this persists, please contact support."));
/*    */       ro.fE0.error("Error loading map data, possible corrupt rom", exception);
/*    */     } 
/*    */     pA pA;
/*    */     js js;
/*    */     if ((js = ((R8)ro).YG0) != null && (pA = js.MH0) != null) {
/*    */       boolean bool1 = this.oH0;
/*    */       UB0.Kg0.fN(new yD0(pA, bool1));
/*    */     } 
/*    */   }
/*    */   
/*    */   public final KI K70() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield R6 : B
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: iconst_2
/*    */     //   7: if_icmpne -> 84
/*    */     //   10: new f/pI
/*    */     //   13: dup
/*    */     //   14: dup
/*    */     //   15: astore_1
/*    */     //   16: aload_0
/*    */     //   17: aload_1
/*    */     //   18: aload_0
/*    */     //   19: aload_1
/*    */     //   20: aload_0
/*    */     //   21: aload_1
/*    */     //   22: aload_0
/*    */     //   23: dup
/*    */     //   24: dup2
/*    */     //   25: getstatic f/km.mI0 : Lf/P1;
/*    */     //   28: getfield AN : Lf/Wo;
/*    */     //   31: astore_1
/*    */     //   32: getfield n70 : B
/*    */     //   35: aload_0
/*    */     //   36: getfield NE0 : B
/*    */     //   39: invokestatic mF : (BB)S
/*    */     //   42: istore_0
/*    */     //   43: getfield VD0 : B
/*    */     //   46: istore_2
/*    */     //   47: getfield WO : S
/*    */     //   50: istore_3
/*    */     //   51: getfield Dq : Lf/h30;
/*    */     //   54: astore #4
/*    */     //   56: aload_1
/*    */     //   57: iload_0
/*    */     //   58: iload_2
/*    */     //   59: iload_3
/*    */     //   60: aload #4
/*    */     //   62: invokespecial <init> : (Lf/Wo;SBSLf/h30;)V
/*    */     //   65: getfield zG : Lf/vF;
/*    */     //   68: putfield UZ : Lf/vF;
/*    */     //   71: getfield iv : Lf/yE0;
/*    */     //   74: putfield Cd : Lf/yE0;
/*    */     //   77: getfield LA0 : Lf/xm;
/*    */     //   80: putfield Eo : Lf/xm;
/*    */     //   83: areturn
/*    */     //   84: iload_1
/*    */     //   85: iconst_3
/*    */     //   86: if_icmpne -> 163
/*    */     //   89: new f/xV
/*    */     //   92: dup
/*    */     //   93: dup
/*    */     //   94: astore_1
/*    */     //   95: aload_0
/*    */     //   96: aload_1
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload_0
/*    */     //   100: aload_1
/*    */     //   101: aload_0
/*    */     //   102: dup
/*    */     //   103: dup2
/*    */     //   104: getstatic f/km.mI0 : Lf/P1;
/*    */     //   107: getfield MT : Lf/gD;
/*    */     //   110: astore_1
/*    */     //   111: getfield n70 : B
/*    */     //   114: aload_0
/*    */     //   115: getfield NE0 : B
/*    */     //   118: invokestatic mF : (BB)S
/*    */     //   121: istore_0
/*    */     //   122: getfield VD0 : B
/*    */     //   125: istore_2
/*    */     //   126: getfield WO : S
/*    */     //   129: istore_3
/*    */     //   130: getfield Dq : Lf/h30;
/*    */     //   133: astore #4
/*    */     //   135: aload_1
/*    */     //   136: iload_0
/*    */     //   137: iload_2
/*    */     //   138: iload_3
/*    */     //   139: aload #4
/*    */     //   141: invokespecial <init> : (Lf/gD;SBSLf/h30;)V
/*    */     //   144: getfield zG : Lf/vF;
/*    */     //   147: putfield UZ : Lf/vF;
/*    */     //   150: getfield iv : Lf/yE0;
/*    */     //   153: putfield Cd : Lf/yE0;
/*    */     //   156: getfield LA0 : Lf/xm;
/*    */     //   159: putfield Eo : Lf/xm;
/*    */     //   162: areturn
/*    */     //   163: iload_1
/*    */     //   164: iconst_4
/*    */     //   165: if_icmpne -> 242
/*    */     //   168: new f/hB0
/*    */     //   171: dup
/*    */     //   172: dup
/*    */     //   173: astore_1
/*    */     //   174: aload_0
/*    */     //   175: aload_1
/*    */     //   176: aload_0
/*    */     //   177: aload_1
/*    */     //   178: aload_0
/*    */     //   179: aload_1
/*    */     //   180: aload_0
/*    */     //   181: dup
/*    */     //   182: dup2
/*    */     //   183: getstatic f/km.mI0 : Lf/P1;
/*    */     //   186: getfield yE : Lf/BE;
/*    */     //   189: astore_1
/*    */     //   190: getfield n70 : B
/*    */     //   193: aload_0
/*    */     //   194: getfield NE0 : B
/*    */     //   197: invokestatic mF : (BB)S
/*    */     //   200: istore_0
/*    */     //   201: getfield VD0 : B
/*    */     //   204: istore_2
/*    */     //   205: getfield WO : S
/*    */     //   208: istore_3
/*    */     //   209: getfield Dq : Lf/h30;
/*    */     //   212: astore #4
/*    */     //   214: aload_1
/*    */     //   215: iload_0
/*    */     //   216: iload_2
/*    */     //   217: iload_3
/*    */     //   218: aload #4
/*    */     //   220: invokespecial <init> : (Lf/BE;SBSLf/h30;)V
/*    */     //   223: getfield zG : Lf/vF;
/*    */     //   226: putfield UZ : Lf/vF;
/*    */     //   229: getfield iv : Lf/yE0;
/*    */     //   232: putfield Cd : Lf/yE0;
/*    */     //   235: getfield LA0 : Lf/xm;
/*    */     //   238: putfield Eo : Lf/xm;
/*    */     //   241: areturn
/*    */     //   242: aload_0
/*    */     //   243: getfield Cd0 : Z
/*    */     //   246: ifne -> 616
/*    */     //   249: aload_0
/*    */     //   250: getstatic f/fV.Ca : Lf/fV;
/*    */     //   253: astore_2
/*    */     //   254: getfield n70 : B
/*    */     //   257: dup
/*    */     //   258: istore_3
/*    */     //   259: aload_2
/*    */     //   260: aload_0
/*    */     //   261: getfield NE0 : B
/*    */     //   264: istore #4
/*    */     //   266: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   269: pop
/*    */     //   270: bipush #99
/*    */     //   272: if_icmpne -> 277
/*    */     //   275: iconst_2
/*    */     //   276: istore_3
/*    */     //   277: iload_3
/*    */     //   278: bipush #50
/*    */     //   280: if_icmpne -> 293
/*    */     //   283: iload #4
/*    */     //   285: bipush #100
/*    */     //   287: if_icmpne -> 293
/*    */     //   290: iconst_1
/*    */     //   291: istore #4
/*    */     //   293: iload_3
/*    */     //   294: iconst_3
/*    */     //   295: if_icmpne -> 308
/*    */     //   298: iload #4
/*    */     //   300: bipush #100
/*    */     //   302: if_icmpne -> 308
/*    */     //   305: iconst_5
/*    */     //   306: istore #4
/*    */     //   308: iload_3
/*    */     //   309: aload_2
/*    */     //   310: getfield i60 : [[Lf/MZ;
/*    */     //   313: dup
/*    */     //   314: astore #5
/*    */     //   316: arraylength
/*    */     //   317: if_icmplt -> 323
/*    */     //   320: goto -> 377
/*    */     //   323: aload #5
/*    */     //   325: iload_3
/*    */     //   326: aaload
/*    */     //   327: dup
/*    */     //   328: astore_3
/*    */     //   329: ifnull -> 377
/*    */     //   332: iload #4
/*    */     //   334: aload_3
/*    */     //   335: arraylength
/*    */     //   336: if_icmplt -> 342
/*    */     //   339: goto -> 377
/*    */     //   342: aload_3
/*    */     //   343: iload #4
/*    */     //   345: aaload
/*    */     //   346: dup
/*    */     //   347: astore_3
/*    */     //   348: ifnonnull -> 354
/*    */     //   351: goto -> 377
/*    */     //   354: aload_2
/*    */     //   355: getfield sw : [Lf/Pz;
/*    */     //   358: iload_1
/*    */     //   359: aaload
/*    */     //   360: getfield ob : Lf/qw0;
/*    */     //   363: aload_3
/*    */     //   364: getfield y5 : S
/*    */     //   367: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   370: checkcast f/ot
/*    */     //   373: astore_1
/*    */     //   374: goto -> 379
/*    */     //   377: aconst_null
/*    */     //   378: astore_1
/*    */     //   379: aload_1
/*    */     //   380: ifnull -> 540
/*    */     //   383: aload_1
/*    */     //   384: aload_0
/*    */     //   385: aload_1
/*    */     //   386: getfield eR : [S
/*    */     //   389: putfield rr0 : [S
/*    */     //   392: getstatic f/P50.Yi0 : Lf/P50;
/*    */     //   395: astore_1
/*    */     //   396: getfield l80 : S
/*    */     //   399: istore_2
/*    */     //   400: aload_1
/*    */     //   401: getfield VK0 : Ljava/util/HashMap;
/*    */     //   404: iload_2
/*    */     //   405: invokestatic valueOf : (S)Ljava/lang/Short;
/*    */     //   408: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   411: checkcast f/RD0
/*    */     //   414: dup
/*    */     //   415: astore_3
/*    */     //   416: ifnonnull -> 422
/*    */     //   419: goto -> 441
/*    */     //   422: aload_1
/*    */     //   423: getfield Bz0 : Ljava/util/HashMap;
/*    */     //   426: iload_2
/*    */     //   427: invokestatic valueOf : (S)Ljava/lang/Short;
/*    */     //   430: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   433: checkcast f/Xt0
/*    */     //   436: dup
/*    */     //   437: astore_1
/*    */     //   438: ifnonnull -> 446
/*    */     //   441: aconst_null
/*    */     //   442: astore_1
/*    */     //   443: goto -> 532
/*    */     //   446: new f/Af
/*    */     //   449: dup
/*    */     //   450: aload_3
/*    */     //   451: swap
/*    */     //   452: aload_1
/*    */     //   453: invokespecial <init> : (Lf/Xt0;)V
/*    */     //   456: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   459: invokevirtual nk : (Ljava/lang/String;)Lf/pB0;
/*    */     //   462: astore_1
/*    */     //   463: getstatic f/P50.f00 : Lf/ik;
/*    */     //   466: new java/lang/StringBuilder
/*    */     //   469: dup
/*    */     //   470: invokespecial <init> : ()V
/*    */     //   473: ldc_w 'Loaded '
/*    */     //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   479: iload_2
/*    */     //   480: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   483: ldc_w ' from mod file.'
/*    */     //   486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   489: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   492: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   497: goto -> 532
/*    */     //   500: astore_1
/*    */     //   501: getstatic f/P50.f00 : Lf/ik;
/*    */     //   504: new java/lang/StringBuilder
/*    */     //   507: dup
/*    */     //   508: invokespecial <init> : ()V
/*    */     //   511: ldc_w 'Unable to load tmx for '
/*    */     //   514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   517: iload_2
/*    */     //   518: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   521: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   524: aload_1
/*    */     //   525: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   530: aconst_null
/*    */     //   531: astore_1
/*    */     //   532: aload_0
/*    */     //   533: aload_1
/*    */     //   534: putfield bi : Lf/pB0;
/*    */     //   537: goto -> 616
/*    */     //   540: new java/lang/RuntimeException
/*    */     //   543: dup
/*    */     //   544: new java/lang/StringBuilder
/*    */     //   547: dup
/*    */     //   548: invokespecial <init> : ()V
/*    */     //   551: ldc_w f/ot
/*    */     //   554: invokevirtual getSimpleName : ()Ljava/lang/String;
/*    */     //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   560: ldc_w ' '
/*    */     //   563: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   566: aconst_null
/*    */     //   567: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   570: ldc_w ' '
/*    */     //   573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   576: aload_0
/*    */     //   577: getfield R6 : B
/*    */     //   580: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   583: ldc_w ' '
/*    */     //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   589: aload_0
/*    */     //   590: getfield n70 : B
/*    */     //   593: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   596: ldc_w ' '
/*    */     //   599: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   602: aload_0
/*    */     //   603: getfield NE0 : B
/*    */     //   606: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   609: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   612: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   615: athrow
/*    */     //   616: getstatic f/km.xn : Lf/Xc0;
/*    */     //   619: ifnonnull -> 632
/*    */     //   622: new f/Xc0
/*    */     //   625: dup
/*    */     //   626: invokespecial <init> : ()V
/*    */     //   629: putstatic f/km.xn : Lf/Xc0;
/*    */     //   632: new f/IF0
/*    */     //   635: dup
/*    */     //   636: dup
/*    */     //   637: astore_1
/*    */     //   638: aload_0
/*    */     //   639: dup
/*    */     //   640: dup
/*    */     //   641: dup2
/*    */     //   642: aload_1
/*    */     //   643: aload_0
/*    */     //   644: aload_1
/*    */     //   645: aload_0
/*    */     //   646: dup
/*    */     //   647: dup2
/*    */     //   648: dup2
/*    */     //   649: dup2
/*    */     //   650: dup2
/*    */     //   651: getfield R6 : B
/*    */     //   654: istore_2
/*    */     //   655: getfield n70 : B
/*    */     //   658: istore_3
/*    */     //   659: getfield NE0 : B
/*    */     //   662: istore #4
/*    */     //   664: getfield VD0 : B
/*    */     //   667: istore #5
/*    */     //   669: getfield el : I
/*    */     //   672: istore #6
/*    */     //   674: getfield nr : I
/*    */     //   677: istore #7
/*    */     //   679: getfield lq0 : I
/*    */     //   682: istore #8
/*    */     //   684: getfield Zi0 : I
/*    */     //   687: istore #9
/*    */     //   689: getfield yT : B
/*    */     //   692: istore #10
/*    */     //   694: getfield UI : B
/*    */     //   697: istore #11
/*    */     //   699: iload_2
/*    */     //   700: iload_3
/*    */     //   701: iload #4
/*    */     //   703: iload #5
/*    */     //   705: iload #6
/*    */     //   707: iload #7
/*    */     //   709: iload #8
/*    */     //   711: iload #9
/*    */     //   713: iload #10
/*    */     //   715: iload #11
/*    */     //   717: invokespecial <init> : (BBBBIIIIBB)V
/*    */     //   720: getfield bi : Lf/pB0;
/*    */     //   723: putfield Lq0 : Lf/pB0;
/*    */     //   726: getfield Ma0 : S
/*    */     //   729: istore_2
/*    */     //   730: getfield go0 : B
/*    */     //   733: istore_3
/*    */     //   734: getfield LA0 : Lf/xm;
/*    */     //   737: astore #4
/*    */     //   739: getfield iv : Lf/yE0;
/*    */     //   742: astore #5
/*    */     //   744: getfield zG : Lf/vF;
/*    */     //   747: astore #6
/*    */     //   749: iload_2
/*    */     //   750: putfield ar : S
/*    */     //   753: getfield E10 : B
/*    */     //   756: dup
/*    */     //   757: istore_2
/*    */     //   758: ifne -> 783
/*    */     //   761: aload_1
/*    */     //   762: iload_3
/*    */     //   763: sipush #255
/*    */     //   766: iand
/*    */     //   767: bipush #88
/*    */     //   769: isub
/*    */     //   770: ldc_w 140000
/*    */     //   773: iadd
/*    */     //   774: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   777: putfield gz : Ljava/lang/String;
/*    */     //   780: goto -> 805
/*    */     //   783: aload_1
/*    */     //   784: iload_2
/*    */     //   785: sipush #1000
/*    */     //   788: imul
/*    */     //   789: ldc_w 140000
/*    */     //   792: iadd
/*    */     //   793: iload_3
/*    */     //   794: sipush #255
/*    */     //   797: iand
/*    */     //   798: iadd
/*    */     //   799: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   802: putfield gz : Ljava/lang/String;
/*    */     //   805: aload_1
/*    */     //   806: getfield E10 : B
/*    */     //   809: ifne -> 867
/*    */     //   812: iload_3
/*    */     //   813: sipush #255
/*    */     //   816: iand
/*    */     //   817: sipush #134
/*    */     //   820: if_icmpne -> 867
/*    */     //   823: aload_1
/*    */     //   824: new java/lang/StringBuilder
/*    */     //   827: dup
/*    */     //   828: aload_1
/*    */     //   829: swap
/*    */     //   830: invokespecial <init> : ()V
/*    */     //   833: getfield gz : Ljava/lang/String;
/*    */     //   836: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   839: ldc_w ' '
/*    */     //   842: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   845: aload_1
/*    */     //   846: getfield VZ : B
/*    */     //   849: bipush #46
/*    */     //   851: isub
/*    */     //   852: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   855: ldc_w 'F'
/*    */     //   858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   861: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   864: putfield gz : Ljava/lang/String;
/*    */     //   867: aload_0
/*    */     //   868: aload_1
/*    */     //   869: dup
/*    */     //   870: dup
/*    */     //   871: aload #4
/*    */     //   873: putfield Eo : Lf/xm;
/*    */     //   876: aload #5
/*    */     //   878: putfield Cd : Lf/yE0;
/*    */     //   881: aload #6
/*    */     //   883: putfield UZ : Lf/vF;
/*    */     //   886: getfield Qg0 : [S
/*    */     //   889: astore_2
/*    */     //   890: iconst_1
/*    */     //   891: istore_3
/*    */     //   892: iconst_1
/*    */     //   893: istore #4
/*    */     //   895: iload #4
/*    */     //   897: aload_2
/*    */     //   898: arraylength
/*    */     //   899: if_icmpge -> 920
/*    */     //   902: aload_2
/*    */     //   903: iload #4
/*    */     //   905: saload
/*    */     //   906: aload_2
/*    */     //   907: iconst_0
/*    */     //   908: saload
/*    */     //   909: if_icmpeq -> 914
/*    */     //   912: iconst_0
/*    */     //   913: istore_3
/*    */     //   914: iinc #4, 1
/*    */     //   917: goto -> 895
/*    */     //   920: iload_3
/*    */     //   921: ifeq -> 934
/*    */     //   924: aload_1
/*    */     //   925: dup
/*    */     //   926: iconst_1
/*    */     //   927: putfield kZ : I
/*    */     //   930: iconst_1
/*    */     //   931: putfield Jf : I
/*    */     //   934: aload_1
/*    */     //   935: dup
/*    */     //   936: getfield Jf : I
/*    */     //   939: aload_1
/*    */     //   940: getfield kZ : I
/*    */     //   943: multianewarray[[Lf/xW; 2
/*    */     //   947: putfield pM : [[Lf/xW;
/*    */     //   950: iconst_0
/*    */     //   951: istore_3
/*    */     //   952: iconst_0
/*    */     //   953: istore #4
/*    */     //   955: iload #4
/*    */     //   957: aload_1
/*    */     //   958: getfield kZ : I
/*    */     //   961: if_icmpge -> 1059
/*    */     //   964: iconst_0
/*    */     //   965: istore #5
/*    */     //   967: iload #5
/*    */     //   969: aload_1
/*    */     //   970: getfield Jf : I
/*    */     //   973: if_icmpge -> 1049
/*    */     //   976: iload #5
/*    */     //   978: aload_1
/*    */     //   979: dup
/*    */     //   980: getfield pM : [[Lf/xW;
/*    */     //   983: iload #5
/*    */     //   985: aaload
/*    */     //   986: iload #4
/*    */     //   988: new f/xW
/*    */     //   991: dup
/*    */     //   992: astore #6
/*    */     //   994: aload_2
/*    */     //   995: iload_3
/*    */     //   996: dup
/*    */     //   997: iconst_1
/*    */     //   998: iadd
/*    */     //   999: istore_3
/*    */     //   1000: saload
/*    */     //   1001: aload_1
/*    */     //   1002: iload #5
/*    */     //   1004: iload #4
/*    */     //   1006: invokespecial <init> : (SLf/IF0;SS)V
/*    */     //   1009: aload #6
/*    */     //   1011: aastore
/*    */     //   1012: getfield pM : [[Lf/xW;
/*    */     //   1015: iload #5
/*    */     //   1017: aaload
/*    */     //   1018: iload #4
/*    */     //   1020: aaload
/*    */     //   1021: dup
/*    */     //   1022: aload_1
/*    */     //   1023: getfield hz0 : Lf/AC0;
/*    */     //   1026: astore #5
/*    */     //   1028: getfield IF0 : S
/*    */     //   1031: aload #5
/*    */     //   1033: getfield KL : [Lf/a4;
/*    */     //   1036: swap
/*    */     //   1037: aaload
/*    */     //   1038: putfield lS : Lf/a4;
/*    */     //   1041: iconst_1
/*    */     //   1042: iadd
/*    */     //   1043: i2s
/*    */     //   1044: istore #5
/*    */     //   1046: goto -> 967
/*    */     //   1049: iload #4
/*    */     //   1051: iconst_1
/*    */     //   1052: iadd
/*    */     //   1053: i2s
/*    */     //   1054: istore #4
/*    */     //   1056: goto -> 955
/*    */     //   1059: aload_0
/*    */     //   1060: aload_1
/*    */     //   1061: aload_0
/*    */     //   1062: getfield rr0 : [S
/*    */     //   1065: invokevirtual f00 : ([S)V
/*    */     //   1068: getfield Lg : [Lf/Rw0;
/*    */     //   1071: dup
/*    */     //   1072: astore_2
/*    */     //   1073: aload_1
/*    */     //   1074: aload_2
/*    */     //   1075: putfield r4 : [Lf/Rw0;
/*    */     //   1078: arraylength
/*    */     //   1079: istore_3
/*    */     //   1080: iconst_0
/*    */     //   1081: istore #4
/*    */     //   1083: iload #4
/*    */     //   1085: iload_3
/*    */     //   1086: if_icmpge -> 1338
/*    */     //   1089: aload_2
/*    */     //   1090: iload #4
/*    */     //   1092: aaload
/*    */     //   1093: dup
/*    */     //   1094: astore #5
/*    */     //   1096: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1099: pop
/*    */     //   1100: getstatic f/km.a3 : Lf/vh0;
/*    */     //   1103: aload #5
/*    */     //   1105: dup
/*    */     //   1106: dup
/*    */     //   1107: getfield El0 : B
/*    */     //   1110: istore #6
/*    */     //   1112: getfield uj0 : B
/*    */     //   1115: istore #7
/*    */     //   1117: getfield Wy0 : B
/*    */     //   1120: istore #8
/*    */     //   1122: iload #6
/*    */     //   1124: iload #7
/*    */     //   1126: iload #8
/*    */     //   1128: invokevirtual COm8 : (BBB)Lf/KI;
/*    */     //   1131: checkcast f/IF0
/*    */     //   1134: dup
/*    */     //   1135: astore #6
/*    */     //   1137: ifnull -> 1332
/*    */     //   1140: aload #6
/*    */     //   1142: getfield tL : Z
/*    */     //   1145: ifne -> 1151
/*    */     //   1148: goto -> 1332
/*    */     //   1151: aload #5
/*    */     //   1153: getfield Ac : Lf/c6;
/*    */     //   1156: invokevirtual ordinal : ()I
/*    */     //   1159: tableswitch default -> 1188, 1 -> 1290, 2 -> 1250, 3 -> 1217, 4 -> 1191
/*    */     //   1188: goto -> 1338
/*    */     //   1191: aload #6
/*    */     //   1193: aload_1
/*    */     //   1194: aload #6
/*    */     //   1196: getfield Ew : I
/*    */     //   1199: aload_1
/*    */     //   1200: getfield Fk0 : I
/*    */     //   1203: bipush #16
/*    */     //   1205: imul
/*    */     //   1206: isub
/*    */     //   1207: putfield Ew : I
/*    */     //   1210: getfield n1 : I
/*    */     //   1213: istore_2
/*    */     //   1214: goto -> 1242
/*    */     //   1217: aload #6
/*    */     //   1219: aload_1
/*    */     //   1220: aload #6
/*    */     //   1222: dup
/*    */     //   1223: getfield Ew : I
/*    */     //   1226: istore_2
/*    */     //   1227: getfield Fk0 : I
/*    */     //   1230: bipush #16
/*    */     //   1232: imul
/*    */     //   1233: iload_2
/*    */     //   1234: iadd
/*    */     //   1235: putfield Ew : I
/*    */     //   1238: getfield n1 : I
/*    */     //   1241: istore_2
/*    */     //   1242: aload #5
/*    */     //   1244: getfield eO : I
/*    */     //   1247: goto -> 1318
/*    */     //   1250: aload_1
/*    */     //   1251: aload #6
/*    */     //   1253: dup
/*    */     //   1254: aload_1
/*    */     //   1255: aload #6
/*    */     //   1257: getfield Ew : I
/*    */     //   1260: aload #5
/*    */     //   1262: getfield eO : I
/*    */     //   1265: bipush #16
/*    */     //   1267: imul
/*    */     //   1268: isub
/*    */     //   1269: putfield Ew : I
/*    */     //   1272: getfield n1 : I
/*    */     //   1275: istore_2
/*    */     //   1276: getfield nT : I
/*    */     //   1279: bipush #16
/*    */     //   1281: imul
/*    */     //   1282: iload_2
/*    */     //   1283: iadd
/*    */     //   1284: putfield n1 : I
/*    */     //   1287: goto -> 1338
/*    */     //   1290: aload_1
/*    */     //   1291: aload #6
/*    */     //   1293: aload_1
/*    */     //   1294: aload #6
/*    */     //   1296: getfield Ew : I
/*    */     //   1299: aload #5
/*    */     //   1301: getfield eO : I
/*    */     //   1304: bipush #16
/*    */     //   1306: imul
/*    */     //   1307: isub
/*    */     //   1308: putfield Ew : I
/*    */     //   1311: getfield n1 : I
/*    */     //   1314: istore_2
/*    */     //   1315: getfield nT : I
/*    */     //   1318: bipush #16
/*    */     //   1320: imul
/*    */     //   1321: istore_3
/*    */     //   1322: aload_1
/*    */     //   1323: iload_2
/*    */     //   1324: iload_3
/*    */     //   1325: isub
/*    */     //   1326: putfield n1 : I
/*    */     //   1329: goto -> 1338
/*    */     //   1332: iinc #4, 1
/*    */     //   1335: goto -> 1083
/*    */     //   1338: aload_0
/*    */     //   1339: aload_1
/*    */     //   1340: iconst_1
/*    */     //   1341: putfield tL : Z
/*    */     //   1344: getfield oH0 : Z
/*    */     //   1347: ifeq -> 1365
/*    */     //   1350: aload_1
/*    */     //   1351: dup
/*    */     //   1352: aload_0
/*    */     //   1353: getfield U5 : Ljava/lang/String;
/*    */     //   1356: astore_0
/*    */     //   1357: iconst_1
/*    */     //   1358: putfield Pp0 : Z
/*    */     //   1361: aload_0
/*    */     //   1362: putfield f1 : Ljava/lang/String;
/*    */     //   1365: aload_1
/*    */     //   1366: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 68
/*    */     //   #2	-> 71
/*    */     //   #3	-> 74
/*    */     //   #4	-> 77
/*    */     //   #5	-> 80
/*    */     //   #6	-> 89
/*    */     //   #7	-> 147
/*    */     //   #8	-> 150
/*    */     //   #9	-> 153
/*    */     //   #10	-> 156
/*    */     //   #11	-> 159
/*    */     //   #12	-> 168
/*    */     //   #13	-> 226
/*    */     //   #14	-> 229
/*    */     //   #15	-> 232
/*    */     //   #16	-> 235
/*    */     //   #17	-> 238
/*    */     //   #18	-> 243
/*    */     //   #19	-> 250
/*    */     //   #20	-> 254
/*    */     //   #21	-> 310
/*    */     //   #22	-> 386
/*    */     //   #23	-> 389
/*    */     //   #24	-> 392
/*    */     //   #25	-> 396
/*    */     //   #26	-> 401
/*    */     //   #27	-> 405
/*    */     //   #28	-> 534
/*    */     //   #29	-> 723
/*    */     //   #30	-> 726
/*    */     //   #31	-> 750
/*    */     //   #32	-> 886
/*    */     //   #33	-> 898
/*    */     //   #34	-> 1028
/*    */     //   #35	-> 1033
/*    */     //   #36	-> 1037
/*    */     //   #37	-> 1038
/*    */     //   #38	-> 1062
/*    */     //   #39	-> 1075
/*    */     //   #40	-> 1100
/*    */     //   #41	-> 1142
/*    */     //   #42	-> 1153
/*    */     //   #43	-> 1156
/*    */     //   #44	-> 1200
/*    */     //   #45	-> 1207
/*    */     //   #46	-> 1227
/*    */     //   #47	-> 1235
/*    */     //   #48	-> 1244
/*    */     //   #49	-> 1257
/*    */     //   #50	-> 1262
/*    */     //   #51	-> 1269
/*    */     //   #52	-> 1276
/*    */     //   #53	-> 1284
/*    */     //   #54	-> 1301
/*    */     //   #55	-> 1308
/*    */     //   #56	-> 1315
/*    */     //   #57	-> 1326
/*    */     //   #58	-> 1344
/*    */     //   #59	-> 1358
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   446	449	500	java/lang/Exception
/*    */     //   450	462	500	java/lang/Exception
/*    */     //   463	500	500	java/lang/Exception
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */