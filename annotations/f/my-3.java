/*  1 */ package f;public final class my extends Ip { public final void update() { if (this.Is0) return;  this.Is0 = true; A60 a60; if (this.rf != (a60 = this.Fe0.Wa0)
/*  2 */       .my
/*    */       
/*  4 */       .c90(a60.go)) { ArrayList<String> arrayList; this
/*    */ 
/*    */ 
/*    */         
/*  8 */         .rf = (DK)(a60 = this.Fe0.Wa0).my.c90(a60.go); this.Lq0.clear(); this(); for (byte b1 = 0; b1 <= this.Bl; )
/*    */       { pr pr1;
/* 10 */         if ((pr1 = km.u4.wG.kr(b1, this.rf))
/* 11 */           .Xr0 > 0 || pr1.Gm > 0 || pr1.A30 != 500.0F) { c = '\001'; } else { c = Character.MIN_VALUE; }  if (c || pr1
/* 12 */           .xZ == this
/* 13 */           .Bl) { String str; if (b1 == 0) { str = Ml0.OH0(5495); } else { str = Ml0.Go(5496, Integer.toString(b1)); }  arrayList.add(str); this.Lq0.add(Byte.valueOf(b1)); }  b1 = (byte)(b1 + 1); }  this.Xx0.rk0(new OZ(arrayList)); this.Xx0.Z30(arrayList.size() - 1); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     pr pr = km.u4.wG.kr(b, this.rf); this(); String str1; StringBuilder stringBuilder; char c; byte b; if ((b = ((Byte)this.Lq0.get(this.Xx0.Wa0.go)).byteValue()) == this.Bl) { c = 'ᘕ'; } else { c = 'ᘐ'; }  stringBuilder
/*    */       
/* 20 */       .append(Ml0.Go(c, tv0.format(pr.A30))); stringBuilder.append("\n\n"); if (b == this.Bl) { c = 'ᘖ'; } else { c = 'ᘑ'; }  stringBuilder
/*    */       
/* 22 */       .append(Ml0.Go(c, pr.dy().Ni0(pr.G20))); this.k80.E1(stringBuilder.toString()); if ((pr.dy())
/* 23 */       .Xz0 >= 0)
/* 24 */     { this.k80
/* 25 */         .TS
/*    */ 
/*    */         
/* 28 */         .qt(new U70[] { h90.Kw0().Hl(0, (pr.dy()).Xz0) }); this.k80
/* 29 */         .TS
/* 30 */         .FB0(null); } else { this.k80
/* 31 */         .TS
/* 32 */         .qt(new U70[] { h90.Kw0().Hl(0, 30) }); this.k80
/* 33 */         .TS
/* 34 */         .FB0(of0); }  if (km.XU()) { this.k80
/* 35 */         .TS
/* 36 */         .tL(96, 96); this.k80
/* 37 */         .TS
/* 38 */         .zT(100, 35); } else { this.k80
/* 39 */         .TS
/* 40 */         .tL(64, 64); this.k80
/* 41 */         .TS
/* 42 */         .zT(16, 35); }  this.eh
/*    */ 
/*    */ 
/*    */       
/* 46 */       .E1(pr.Xr0 + " / " + pr.Gm); String str2 = "0%";
/* 47 */     if (pr.Xr0 > 0)
/*    */     { int i;
/*    */ 
/*    */       
/* 51 */       str2 = tv0.format((i = pr.Xr0) / (i + pr.Gm) * 100.0D) + "%"; }  this.HV.E1(str2); dQ dQ1 = this.MK0; if (pr
/* 52 */       .COM7 > 0)
/*    */     
/*    */     { 
/* 55 */       str1 = NumberFormat.getInstance().format(pr.COM7); } else { str1 = "--"; }  dQ1.E1(str1); if (b == this.Bl) { Ad ad; Ad[] arrayOfAd; int i; for (ad = null, i = (arrayOfAd = this.R80).length, c = Character.MIN_VALUE; c < i; ) { Ad ad1; if ((ad1 = arrayOfAd[c])
/* 56 */           .EK0 == this
/* 57 */           .rf) { ad = ad1; break; }  c++; }  this.kU.wI0(true); this.Rc.wI0(true); this.Uy0.wI0(true); VS(ad); } else { this.kU.wI0(false); this.Rc.wI0(false); this.Uy0.wI0(false); vF0[] arrayOfVF0; for (b = 0; b < (arrayOfVF0 = this.t10).length; ) { arrayOfVF0[b].wI0(false); b++; }  }  this.Is0 = false; }
/*    */ 
/*    */   
/*    */   public static DecimalFormat tv0 = new DecimalFormat("#0.00");
/*    */   public static final pRn of0 = new pRn((byte)0, (byte)0, (byte)0, 127);
/*    */   public byte Bl;
/*    */   public DK rf;
/*    */   public final W1 Fe0;
/*    */   public final W1 Xx0;
/*    */   public final ArrayList Lq0;
/*    */   public final vF0 k80;
/*    */   public final dQ eh;
/*    */   public final dQ HV;
/*    */   public final dQ gl;
/*    */   public final dQ Uy0;
/*    */   public final dQ MK0;
/*    */   public final dQ nul;
/*    */   public vF0[] t10;
/*    */   public U90[] y20;
/*    */   public U90[] DH0;
/*    */   public cr0 gc0;
/*    */   public cr0 Mg0;
/*    */   public final dQ kU;
/*    */   public final dQ Rc;
/*    */   public final Ad[] R80;
/*    */   public boolean Is0;
/*    */   
/*    */   public my(Ad[] paramArrayOfAd, int paramInt) {
/*    */     ArrayList<DK> arrayList;
/*    */     Ad ad;
/*    */     OZ oZ;
/*    */     this.Bl = km.u4.W6();
/*    */     this.rf = null;
/*    */     this.Lq0 = new ArrayList();
/*    */     this.Is0 = false;
/*    */     this.R80 = paramArrayOfAd;
/*    */     this();
/*    */     DK[] arrayOfDK;
/*    */     int i = (arrayOfDK = DK.gw).length;
/*    */     byte b3;
/*    */     for (b3 = 0; b3 < i; b3++) {
/*    */       DK dK1;
/*    */       if ((dK1 = arrayOfDK[b3]).GH0() && dK1.uy())
/*    */         arrayList.add(dK1); 
/*    */     } 
/*    */     this(arrayList);
/*    */     this(oZ);
/*    */     this.Fe0 = w11;
/*    */     w11.Z30(0);
/*    */     W1 w11;
/*    */     (w11 = new W1()).D30(this::update);
/*    */     this(new OZ());
/*    */     this.Xx0 = w12;
/*    */     W1 w12;
/*    */     (w12 = new W1()).D30(this::update);
/*    */     (this.Uy0 = new dQ(Ml0.Go(5690, LF.da0((int)(paramInt - System.currentTimeMillis() / 1000L), true)))).Xu("/label-time");
/*    */     (this.k80 = new vF0()).Xu("label-mmr");
/*    */     this();
/*    */     this.eh = new dQ();
/*    */     this();
/*    */     this.HV = dQ3;
/*    */     (this.gl = new dQ(Ml0.OH0(5664))).Xu("label-title");
/*    */     dQ2.Xu("label-stats");
/*    */     dQ dQ3;
/*    */     (dQ3 = new dQ()).Xu("label-stats");
/*    */     this();
/*    */     this.MK0 = new dQ();
/*    */     this(Ml0.OH0(5647));
/*    */     this.nul = dQ1;
/*    */     dQ2.Xu("label-stats");
/*    */     dQ dQ1;
/*    */     (dQ1 = new dQ()).Xu("label-title");
/*    */     (this.kU = new dQ(Ml0.OH0(5646))).Xu("label-title");
/*    */     (this.Rc = new dQ(Ml0.OH0(5645))).Xu("label-title");
/*    */     DK dK = arrayList.get(w11.Yq());
/*    */     dQ dQ2 = null;
/*    */     Ad[] arrayOfAd;
/*    */     i = (arrayOfAd = this.R80).length;
/*    */     for (b3 = 0; b3 < i; b3++) {
/*    */       Ad ad1;
/*    */       if ((ad1 = arrayOfAd[b3]).aN() == dK) {
/*    */         ad = ad1;
/*    */         break;
/*    */       } 
/*    */     } 
/*    */     if (ad == null)
/*    */       return; 
/*    */     Za0[] arrayOfZa01 = ad.zt();
/*    */     Za0[] arrayOfZa02 = ad.N3();
/*    */     this.t10 = new vF0[arrayOfZa01.length + arrayOfZa02.length];
/*    */     for (i = 0; i < this.t10.length; i++) {
/*    */       if (km.XU()) {
/*    */         vF0 vF01;
/*    */         this(100, 100);
/*    */         this.t10[i] = vF01;
/*    */         this.t10[i].ZH0().Ii0(2.0F);
/*    */       } else {
/*    */         vF0 vF01;
/*    */         this(48, 48);
/*    */         this.t10[i] = vF01;
/*    */       } 
/*    */       this.t10[i].Pb0(0);
/*    */       this.t10[i].Xu("reward-slot");
/*    */     } 
/*    */     VS(ad);
/*    */     vF0[] arrayOfVF0;
/*    */     this.y20 = new U90[(arrayOfVF0 = this.t10).length / 5 + 1];
/*    */     this.DH0 = new U90[arrayOfVF0.length / 5 + 1];
/*    */     this.gc0 = d7();
/*    */     this.Mg0 = d7();
/*    */     byte b2;
/*    */     for (b2 = 0; b2 < this.y20.length; b2++) {
/*    */       this.DH0[b2] = d7();
/*    */       this.y20[b2] = mE0();
/*    */     } 
/*    */     b2 = 0;
/*    */     i = 0;
/*    */     for (b3 = 0; b3 < arrayOfZa01.length; b3++) {
/*    */       if (b3 % 5 == 0 && b2 < this.y20.length - 1)
/*    */         b2++; 
/*    */       this.DH0[b2].Ya(this.t10[b3]);
/*    */       this.y20[b2].Ya(this.t10[b3]);
/*    */       i++;
/*    */     } 
/*    */     this.Mg0.Em0();
/*    */     this.gc0.Aq(7);
/*    */     for (byte b1 = 0; b1 < arrayOfZa02.length; b1++) {
/*    */       this.Mg0.Ya(this.t10[i]);
/*    */       this.gc0.Ya(this.t10[i]);
/*    */       i++;
/*    */     } 
/*    */     this.Mg0.Em0();
/*    */     Xu("stats-layout");
/*    */     arrayOfU902[0] = vo0(new JG0[] { this.Fe0 });
/*    */     arrayOfU902[1] = vo0(new JG0[] { this.Xx0 });
/*    */     arrayOfJG02[0] = this.gl;
/*    */     arrayOfJG02[1] = this.eh;
/*    */     JG0[] arrayOfJG02;
/*    */     (arrayOfJG02 = new JG0[3])[2] = this.HV;
/*    */     arrayOfU902[2] = vo0(new JG0[3]);
/*    */     arrayOfU902[3] = vo0(new JG0[] { this.nul, this.MK0 });
/*    */     arrayOfU902[4] = vo0(new JG0[] { this.kU });
/*    */     U90[] arrayOfU902;
/*    */     (arrayOfU902 = new U90[6])[5] = Yw0(this.DH0);
/*    */     rK0(d7().cOM8(new U90[] { mE0().cOM8(new U90[6]), AUX(new JG0[] { this.k80 }).cOM8(new U90[] { vo0(new JG0[] { this.Rc }), this.Mg0 }).Ya(this.Uy0) }));
/*    */     arrayOfU901[0] = AUX(new JG0[] { this.Fe0 });
/*    */     arrayOfU901[1] = AUX(new JG0[] { this.Xx0 });
/*    */     arrayOfJG01[0] = this.gl;
/*    */     arrayOfJG01[1] = this.eh;
/*    */     JG0[] arrayOfJG01;
/*    */     (arrayOfJG01 = new JG0[3])[2] = this.HV;
/*    */     arrayOfU901[2] = AUX(new JG0[3]);
/*    */     arrayOfU901[3] = AUX(new JG0[] { this.nul, this.MK0 });
/*    */     arrayOfU901[4] = AUX(new JG0[] { this.kU });
/*    */     U90[] arrayOfU901;
/*    */     (arrayOfU901 = new U90[6])[5] = Gs(this.y20);
/*    */     WN(mE0().cOM8(new U90[] { d7().cOM8(new U90[6]), vo0(new JG0[] { this.k80 }).cOM8(new U90[] { AUX(new JG0[] { this.Rc }), this.gc0 }).Em0().Ya(this.Uy0) }));
/*    */     update();
/*    */   }
/*    */   
/*    */   public static void eB0(Za0 paramZa0, vF0 paramvF0, short paramShort) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: ldc 'reward-slot'
/*    */     //   4: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   7: ifnonnull -> 40
/*    */     //   10: aload_1
/*    */     //   11: dup
/*    */     //   12: dup
/*    */     //   13: dup2
/*    */     //   14: getfield TS : Lf/rH;
/*    */     //   17: invokevirtual H : ()V
/*    */     //   20: ldc_w ''
/*    */     //   23: putfield z4 : Ljava/lang/Object;
/*    */     //   26: invokevirtual zn : ()V
/*    */     //   29: ldc_w ''
/*    */     //   32: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   35: iconst_0
/*    */     //   36: invokevirtual wI0 : (Z)V
/*    */     //   39: return
/*    */     //   40: aload_0
/*    */     //   41: getfield cA0 : B
/*    */     //   44: dup
/*    */     //   45: istore_3
/*    */     //   46: ifne -> 264
/*    */     //   49: aload_0
/*    */     //   50: getfield eq : S
/*    */     //   53: istore_3
/*    */     //   54: getstatic f/Of.eH : Lf/Of;
/*    */     //   57: dup
/*    */     //   58: astore #4
/*    */     //   60: iload_3
/*    */     //   61: invokevirtual On0 : (S)Lf/LPT3;
/*    */     //   64: dup
/*    */     //   65: astore #5
/*    */     //   67: getfield c3 : Lf/wc;
/*    */     //   70: ifnull -> 118
/*    */     //   73: aload_1
/*    */     //   74: dup
/*    */     //   75: new f/pQ
/*    */     //   78: dup
/*    */     //   79: aload #5
/*    */     //   81: ldc_w '\\n'
/*    */     //   84: iload_2
/*    */     //   85: ldc_w ' / '
/*    */     //   88: invokestatic DH0 : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   91: aload_0
/*    */     //   92: getfield zo : S
/*    */     //   95: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   98: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   101: astore_2
/*    */     //   102: iconst_0
/*    */     //   103: iconst_1
/*    */     //   104: iconst_1
/*    */     //   105: aload_2
/*    */     //   106: invokespecial <init> : (Lf/LPT3;BZZLjava/lang/String;)V
/*    */     //   109: putfield z4 : Ljava/lang/Object;
/*    */     //   112: invokevirtual zn : ()V
/*    */     //   115: goto -> 186
/*    */     //   118: aload_1
/*    */     //   119: dup
/*    */     //   120: ldc_w 'x'
/*    */     //   123: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: aload_0
/*    */     //   127: getfield W7 : S
/*    */     //   130: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   133: ldc_w ' '
/*    */     //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   139: aload #4
/*    */     //   141: iload_3
/*    */     //   142: invokevirtual On0 : (S)Lf/LPT3;
/*    */     //   145: getfield Iu : I
/*    */     //   148: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: ldc_w '\\n\\n'
/*    */     //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   160: iload_2
/*    */     //   161: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   164: ldc_w ' / '
/*    */     //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   170: aload_0
/*    */     //   171: getfield zo : S
/*    */     //   174: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   180: putfield z4 : Ljava/lang/Object;
/*    */     //   183: invokevirtual zn : ()V
/*    */     //   186: aload_1
/*    */     //   187: dup
/*    */     //   188: getfield TS : Lf/rH;
/*    */     //   191: iconst_1
/*    */     //   192: anewarray f/U70
/*    */     //   195: dup
/*    */     //   196: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   199: aload #5
/*    */     //   201: invokevirtual Iv0 : ()S
/*    */     //   204: iconst_0
/*    */     //   205: invokevirtual ep : (SZ)Lf/U70;
/*    */     //   208: iconst_0
/*    */     //   209: swap
/*    */     //   210: aastore
/*    */     //   211: invokevirtual qt : ([Lf/U70;)Lf/JG0;
/*    */     //   214: pop
/*    */     //   215: new java/lang/StringBuilder
/*    */     //   218: dup
/*    */     //   219: invokespecial <init> : ()V
/*    */     //   222: ldc_w 'x'
/*    */     //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   228: aload_0
/*    */     //   229: getfield W7 : S
/*    */     //   232: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   235: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   238: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   241: invokestatic XU : ()Z
/*    */     //   244: ifeq -> 250
/*    */     //   247: goto -> 742
/*    */     //   250: aload_1
/*    */     //   251: getfield TS : Lf/rH;
/*    */     //   254: bipush #12
/*    */     //   256: iconst_4
/*    */     //   257: invokevirtual zT : (II)Lf/JG0;
/*    */     //   260: pop
/*    */     //   261: goto -> 768
/*    */     //   264: iload_3
/*    */     //   265: iconst_1
/*    */     //   266: if_icmpne -> 626
/*    */     //   269: aload_0
/*    */     //   270: aload_1
/*    */     //   271: aload_0
/*    */     //   272: getfield eq : S
/*    */     //   275: istore_3
/*    */     //   276: getfield TS : Lf/rH;
/*    */     //   279: iconst_1
/*    */     //   280: anewarray f/zh0
/*    */     //   283: dup
/*    */     //   284: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   287: iconst_0
/*    */     //   288: iload_3
/*    */     //   289: invokestatic HZ : (BS)S
/*    */     //   292: iconst_0
/*    */     //   293: iconst_0
/*    */     //   294: invokevirtual lb : (SZB)[Lf/zh0;
/*    */     //   297: iconst_0
/*    */     //   298: aaload
/*    */     //   299: iconst_0
/*    */     //   300: swap
/*    */     //   301: aastore
/*    */     //   302: invokevirtual sm : ([Lf/zh0;)V
/*    */     //   305: new java/lang/StringBuilder
/*    */     //   308: dup
/*    */     //   309: astore_3
/*    */     //   310: invokespecial <init> : ()V
/*    */     //   313: getstatic f/rG0.J2 : Ljava/text/DecimalFormat;
/*    */     //   316: pop
/*    */     //   317: new java/lang/StringBuilder
/*    */     //   320: dup
/*    */     //   321: astore #4
/*    */     //   323: invokespecial <init> : ()V
/*    */     //   326: getfield cA0 : B
/*    */     //   329: aload_0
/*    */     //   330: getfield eq : S
/*    */     //   333: istore #5
/*    */     //   335: iconst_1
/*    */     //   336: if_icmpne -> 533
/*    */     //   339: aload_0
/*    */     //   340: aload #4
/*    */     //   342: dup
/*    */     //   343: dup
/*    */     //   344: aload_0
/*    */     //   345: getfield q1 : B
/*    */     //   348: istore #6
/*    */     //   350: sipush #5615
/*    */     //   353: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   356: astore #7
/*    */     //   358: iconst_2
/*    */     //   359: anewarray java/lang/String
/*    */     //   362: dup
/*    */     //   363: astore #8
/*    */     //   365: iload #5
/*    */     //   367: aload #8
/*    */     //   369: iconst_0
/*    */     //   370: aload #7
/*    */     //   372: aastore
/*    */     //   373: ldc_w 150000
/*    */     //   376: iadd
/*    */     //   377: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   380: iconst_1
/*    */     //   381: swap
/*    */     //   382: aastore
/*    */     //   383: sipush #5583
/*    */     //   386: aload #8
/*    */     //   388: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   394: pop
/*    */     //   395: ldc_w '\\n'
/*    */     //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   401: pop
/*    */     //   402: sipush #5584
/*    */     //   405: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   411: pop
/*    */     //   412: getfield EW : Z
/*    */     //   415: ifeq -> 438
/*    */     //   418: aload #4
/*    */     //   420: dup
/*    */     //   421: ldc_w '\\n'
/*    */     //   424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   427: pop
/*    */     //   428: sipush #5585
/*    */     //   431: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   437: pop
/*    */     //   438: aload_0
/*    */     //   439: getfield BK : Z
/*    */     //   442: ifeq -> 465
/*    */     //   445: aload #4
/*    */     //   447: dup
/*    */     //   448: ldc_w '\\n'
/*    */     //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   454: pop
/*    */     //   455: sipush #8100
/*    */     //   458: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   464: pop
/*    */     //   465: aload_0
/*    */     //   466: getfield mw : B
/*    */     //   469: ifle -> 501
/*    */     //   472: aload #4
/*    */     //   474: aload_0
/*    */     //   475: aload #4
/*    */     //   477: ldc_w '\\n'
/*    */     //   480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   483: pop
/*    */     //   484: getfield mw : B
/*    */     //   487: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   490: sipush #5686
/*    */     //   493: swap
/*    */     //   494: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   500: pop
/*    */     //   501: iload #6
/*    */     //   503: ifle -> 533
/*    */     //   506: aload #4
/*    */     //   508: iload #6
/*    */     //   510: aload #4
/*    */     //   512: ldc_w '\\n'
/*    */     //   515: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   518: pop
/*    */     //   519: invokestatic toString : (I)Ljava/lang/String;
/*    */     //   522: sipush #9110
/*    */     //   525: swap
/*    */     //   526: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   532: pop
/*    */     //   533: aload_1
/*    */     //   534: dup
/*    */     //   535: dup
/*    */     //   536: aload_3
/*    */     //   537: aload #4
/*    */     //   539: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   542: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   545: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   548: ldc_w '\\n\\n'
/*    */     //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   554: iload_2
/*    */     //   555: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   558: ldc_w ' / '
/*    */     //   561: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   564: aload_0
/*    */     //   565: getfield zo : S
/*    */     //   568: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   571: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   574: putfield z4 : Ljava/lang/Object;
/*    */     //   577: invokevirtual zn : ()V
/*    */     //   580: sipush #1731
/*    */     //   583: ldc_w '50'
/*    */     //   586: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   589: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   592: invokestatic XU : ()Z
/*    */     //   595: ifeq -> 612
/*    */     //   598: aload_1
/*    */     //   599: getfield TS : Lf/rH;
/*    */     //   602: bipush #14
/*    */     //   604: iconst_0
/*    */     //   605: invokevirtual zT : (II)Lf/JG0;
/*    */     //   608: pop
/*    */     //   609: goto -> 768
/*    */     //   612: aload_1
/*    */     //   613: getfield TS : Lf/rH;
/*    */     //   616: iconst_5
/*    */     //   617: bipush #-5
/*    */     //   619: invokevirtual zT : (II)Lf/JG0;
/*    */     //   622: pop
/*    */     //   623: goto -> 768
/*    */     //   626: iload_3
/*    */     //   627: iconst_2
/*    */     //   628: if_icmpne -> 773
/*    */     //   631: aload_1
/*    */     //   632: dup
/*    */     //   633: dup2
/*    */     //   634: aload_0
/*    */     //   635: getfield Ic0 : S
/*    */     //   638: istore_3
/*    */     //   639: getfield TS : Lf/rH;
/*    */     //   642: iconst_1
/*    */     //   643: anewarray f/pe0
/*    */     //   646: dup
/*    */     //   647: invokestatic ZZ : ()Lf/interface;
/*    */     //   650: getfield nZ : Lf/pe0;
/*    */     //   653: iconst_0
/*    */     //   654: swap
/*    */     //   655: aastore
/*    */     //   656: invokevirtual Pn : ([Lf/pe0;)Lf/JG0;
/*    */     //   659: pop
/*    */     //   660: new java/lang/StringBuilder
/*    */     //   663: dup
/*    */     //   664: invokespecial <init> : ()V
/*    */     //   667: invokestatic getInstance : ()Ljava/text/NumberFormat;
/*    */     //   670: iload_3
/*    */     //   671: i2l
/*    */     //   672: dup2
/*    */     //   673: lstore_3
/*    */     //   674: invokevirtual format : (J)Ljava/lang/String;
/*    */     //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   680: ldc_w ' '
/*    */     //   683: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   686: bipush #121
/*    */     //   688: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   691: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   694: ldc_w '\\n\\n'
/*    */     //   697: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   700: iload_2
/*    */     //   701: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   704: ldc_w ' / '
/*    */     //   707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   710: aload_0
/*    */     //   711: getfield zo : S
/*    */     //   714: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   717: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   720: putfield z4 : Ljava/lang/Object;
/*    */     //   723: invokevirtual zn : ()V
/*    */     //   726: invokestatic getInstance : ()Ljava/text/NumberFormat;
/*    */     //   729: lload_3
/*    */     //   730: invokevirtual format : (J)Ljava/lang/String;
/*    */     //   733: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   736: invokestatic XU : ()Z
/*    */     //   739: ifeq -> 757
/*    */     //   742: aload_1
/*    */     //   743: getfield TS : Lf/rH;
/*    */     //   746: bipush #28
/*    */     //   748: bipush #15
/*    */     //   750: invokevirtual zT : (II)Lf/JG0;
/*    */     //   753: pop
/*    */     //   754: goto -> 768
/*    */     //   757: aload_1
/*    */     //   758: getfield TS : Lf/rH;
/*    */     //   761: bipush #12
/*    */     //   763: iconst_5
/*    */     //   764: invokevirtual zT : (II)Lf/JG0;
/*    */     //   767: pop
/*    */     //   768: aload_1
/*    */     //   769: iconst_1
/*    */     //   770: invokevirtual wI0 : (Z)V
/*    */     //   773: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 14
/*    */     //   #2	-> 17
/*    */     //   #3	-> 20
/*    */     //   #4	-> 29
/*    */     //   #5	-> 41
/*    */     //   #6	-> 50
/*    */     //   #7	-> 54
/*    */     //   #8	-> 61
/*    */     //   #9	-> 67
/*    */     //   #10	-> 75
/*    */     //   #11	-> 81
/*    */     //   #12	-> 92
/*    */     //   #13	-> 95
/*    */     //   #14	-> 109
/*    */     //   #15	-> 120
/*    */     //   #16	-> 127
/*    */     //   #17	-> 130
/*    */     //   #18	-> 145
/*    */     //   #19	-> 151
/*    */     //   #20	-> 171
/*    */     //   #21	-> 174
/*    */     //   #22	-> 180
/*    */     //   #23	-> 188
/*    */     //   #24	-> 192
/*    */     //   #25	-> 196
/*    */     //   #26	-> 201
/*    */     //   #27	-> 205
/*    */     //   #28	-> 210
/*    */     //   #29	-> 229
/*    */     //   #30	-> 232
/*    */     //   #31	-> 251
/*    */     //   #32	-> 257
/*    */     //   #33	-> 272
/*    */     //   #34	-> 276
/*    */     //   #35	-> 280
/*    */     //   #36	-> 284
/*    */     //   #37	-> 289
/*    */     //   #38	-> 317
/*    */     //   #39	-> 326
/*    */     //   #40	-> 330
/*    */     //   #41	-> 345
/*    */     //   #42	-> 353
/*    */     //   #43	-> 412
/*    */     //   #44	-> 421
/*    */     //   #45	-> 439
/*    */     //   #46	-> 448
/*    */     //   #47	-> 466
/*    */     //   #48	-> 477
/*    */     //   #49	-> 484
/*    */     //   #50	-> 487
/*    */     //   #51	-> 545
/*    */     //   #52	-> 565
/*    */     //   #53	-> 568
/*    */     //   #54	-> 574
/*    */     //   #55	-> 583
/*    */     //   #56	-> 599
/*    */     //   #57	-> 605
/*    */     //   #58	-> 613
/*    */     //   #59	-> 619
/*    */     //   #60	-> 635
/*    */     //   #61	-> 639
/*    */     //   #62	-> 643
/*    */     //   #63	-> 650
/*    */     //   #64	-> 655
/*    */     //   #65	-> 711
/*    */     //   #66	-> 714
/*    */     //   #67	-> 720
/*    */     //   #68	-> 726
/*    */     //   #69	-> 743
/*    */     //   #70	-> 750
/*    */     //   #71	-> 758
/*    */     //   #72	-> 764
/*    */   }
/*    */   
/*    */   public final void VS(Ad paramAd) {
/*    */     if (paramAd == null)
/*    */       return; 
/*    */     Za0[] arrayOfZa01 = paramAd.Zt;
/*    */     boolean bool = false;
/*    */     byte b1 = 0;
/*    */     while (b1 < arrayOfZa01.length) {
/*    */       short s = paramAd.iY;
/*    */       Za0 za0;
/*    */       vF0 vF01;
/*    */       eB0(za0 = arrayOfZa01[b1], vF01 = this.t10[b1], s);
/*    */       if (arrayOfZa01[b1] != null)
/*    */         if (s >= za0.zo) {
/*    */           vF01.Xu("reward-slot-complete");
/*    */           vF01.cZ();
/*    */         } else if (!bool && s > 0) {
/*    */           vF01.Xu("reward-slot-inprogress");
/*    */           vF01.cZ();
/*    */           bool = true;
/*    */         } else {
/*    */           vF01.Xu("reward-slot");
/*    */           vF01.cZ();
/*    */         }  
/*    */       b1++;
/*    */     } 
/*    */     Za0[] arrayOfZa02 = paramAd.cM0;
/*    */     byte b2 = 0;
/*    */     while (b2 < arrayOfZa02.length) {
/*    */       short s = paramAd.AA0;
/*    */       Za0 za0;
/*    */       vF0 vF01;
/*    */       eB0(za0 = arrayOfZa02[b2], vF01 = this.t10[arrayOfZa01.length + b2], s);
/*    */       if (arrayOfZa02[b2] != null)
/*    */         if (s >= za0.zo) {
/*    */           vF01.Xu("reward-slot-complete");
/*    */           vF01.cZ();
/*    */         } else if (!bool && s > 0) {
/*    */           vF01.Xu("reward-slot-inprogress");
/*    */           vF01.cZ();
/*    */           bool = true;
/*    */         } else {
/*    */           vF01.Xu("reward-slot");
/*    */           vF01.cZ();
/*    */         }  
/*    */       b2++;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/my.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */