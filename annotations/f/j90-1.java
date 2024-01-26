/* 1 */ package f;public final class j90 extends JG0 implements iq0 { public final Gp0 dG0; public UA0 Vf; public j90(Gp0 paramGp0, jd0 paramjd0) { YA0 yA01; vF0 vF01; dQ dQ1; YA0 yA02; vF0 vF02; YA0 yA03; int k; vF0 vF03; dQ dQ2; short[] arrayOfShort1, arrayOfShort2; this.Vf = null; this.Vr = new YA0(); this.p80 = new ArrayList(); Xu("monster-preview-panel"); this.dG0 = paramGp0; Ht0 ht0; int j = interface.ZZ().Ev0(ht0 = Ht0.Ku).hW(), i = interface.ZZ().Ev0(ht0).qY(); hm0 hm0 = paramGp0.fa(paramjd0.Wc0()); this(); this(j, i); if (km.XU()) vF01.ZH0().Ii0(2.0F);  if (paramjd0.Xi() != -1) { byte b; pe0 pe0 = interface.ZZ().X(paramjd0.Xi()); vF01.ZH0().Pn(new pe0[] { pe0 }); rH rH = vF01.ZH0(); k = vF01.a40(); int m = vF01.kG0() + k - pe0.hW(); if (km.XU()) { k = 10; } else { k = 0; }  m -= k; k = vF01.CB(); if (km.XU()) { b = 9; } else { b = 0; }  rH.zT(m, k - b); }  this(); (new dQ())
/* 2 */       .E1(pv.X9(59, (new StringBuilder()).append(Ml0.OH0(paramjd0.Kp() + 150000)).append(" "), " ").append(paramjd0.w70().Y20()).toString()); if (paramjd0.AL()) { dQ1.Xu("/monster-preview-panel-label-red"); } else { dQ1.Xu("/monster-preview-panel-label"); }  yA01.J8(vF01); yA01.J8(dQ1); yA01.Dv0.F(5.0F); this(); this(j, i); if (hm0 != null) { k = hm0.D90(); } else { k = paramjd0.yw(); }  this(Ml0.OH0(k + 210000)); if (paramjd0.yw() != k) { dQ2.Xu("/monster-preview-panel-label-teal"); } else if (paramjd0.w70().M7() == 2) { pe0 pe0; byte b; dQ2.Xu("/monster-preview-panel-label-yellow"); if (km.XU()) { pe0 = interface.ZZ().x30(); } else { pe0 = interface.ZZ().iF(); }  vF02.ZH0().Pn(new pe0[] { pe0 }); rH rH = vF02.ZH0(); int n = vF02.a40(), m = vF02.kG0() + n - pe0.hW(); n = vF02.CB() - 1; if (km.XU()) { b = 4; } else { b = 0; }  rH.zT(m, n - b); } else { dQ2.Xu("/monster-preview-panel-label"); }  yA02.J8(vF02); yA02.J8(dQ2); this(); this(j, i); this(); (new dQ()).Xu("/monster-preview-panel-label"); short s; if ((s = dx.l90(paramjd0.w70().p10())) > 0) { aF aF = wm0.y8().ip0(lPT3).jt0(); vF03.ZH0().Pn(new pe0[] { aF }); int m = vF03.a40(); vF03.ZH0().zT(vF03.kG0() + m - aF.hW(), vF01.CB() - 4); LPT3 lPT3; dQ2.E1((lPT3 = Of.b20().On0(s)).getName()); } else { vF03.ZH0().H(); dQ2.E1(Ml0.OH0(61)); }  yA03.J8(vF03); yA03.J8(dQ2); byte b1; YA0[] arrayOfYA0 = new YA0[b1 = 4]; boolean bool = false; if (hm0 != null) { int m = Arrays.equals(arrayOfShort1 = hm0.vZ(), paramjd0.w70().RU()) ^ true; } else { arrayOfShort2 = paramjd0.w70().RU(); arrayOfShort1 = arrayOfShort2 = arrayOfShort1; }  for (byte b2 = 0; b2 < b1; ) { YA0 yA0; vF0 vF0; dQ dQ; this(); this(j, i); this(); WD wD; if ((wD = yk0.cw().mP(arrayOfShort1[b2])) != null) { if (wD.xF0() > 0) vF0.ZH0().Pn(new pe0[] { interface.ZZ().Ev0(wD.Fn(paramjd0.w70())) });  dQ.E1(wD.cW()); } else { dQ.E1("-----"); }  yA0.J8(vF0); yA0.J8(dQ); if (((hm0 != null) ? hm0.k70()[b2] : paramjd0.w70().vC((byte)b2)) < 1 && wD != null && wD.xF0() > 0) { dQ.Xu("/monster-preview-panel-label-red"); } else if (arrayOfShort2 != null) { dQ.Xu("/monster-preview-panel-label-teal"); } else { dQ.Xu("/monster-preview-panel-label"); }  arrayOfYA0[b2] = yA0; if (b2 == 3) yA0.Dv0.Ve0(3.0F);  b2++; }  this.Vr.Xu("/monster-preview-panel-boxlayout"); this.Vr.J8(Su0(paramjd0)); this.Vr.ZE(); this.Vr.ZE().fA0(yA01); this.Vr.ZE().fA0(yA02); this.Vr.ZE().fA0(yA03); this.Vr.Dv0.to(7.0F); this.Vr.Dv0.Ty0(7.0F); for (i = 0; i < b1; ) { YA0 yA0 = arrayOfYA0[i]; this.Vr.ZE().fA0(yA0); i++; }  J8(this.Vr); mM(); }
/*   */    public final YA0 Vr; public final ArrayList p80; private void Om(jd0 paramjd0, bv parambv) {
/*   */     if (parambv == bv.Gg) {
/*   */       j40 j40;
/* 6 */       if ((j40 = (this.dG0.Vg() ? km.u4.s40(this.dG0.Q3) : km.u4.z2).de0(paramjd0.ta.q10)) != null) {
/* 7 */         pA pA = pA.Dg0;
/* 8 */         if (!km.XU()) this = null;  pA.u30(this, j40);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     this.Vr.mM();
/*   */     mM();
/*   */   }
/*   */   
/*   */   public final void yV(throws paramthrows) {
/*   */     super.yV(paramthrows);
/*   */     UA0 uA0;
/*   */     if ((uA0 = this.Vf) != null)
/*   */       UB0.Kg0.fN(this); 
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     Iterator iterator = this.p80.iterator();
/*   */     while (hasNext())
/*   */       ((iq0)next()).dispose(); 
/*   */   }
/*   */   
/*   */   public final vF0 Su0(jd0 paramjd0) {
/*   */     // Byte code:
/*   */     //   0: new f/vF0
/*   */     //   3: dup
/*   */     //   4: astore_2
/*   */     //   5: aload_0
/*   */     //   6: aload_1
/*   */     //   7: aload_2
/*   */     //   8: invokespecial <init> : ()V
/*   */     //   11: <illegal opcode> yb0 : (Lf/j90;Lf/jd0;)Lf/tC0;
/*   */     //   16: invokevirtual lPt3 : (Lf/tC0;)V
/*   */     //   19: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   22: aload_1
/*   */     //   23: getfield ta : Lf/Q90;
/*   */     //   26: getfield Cw0 : S
/*   */     //   29: istore_3
/*   */     //   30: iconst_2
/*   */     //   31: istore #4
/*   */     //   33: getfield da : [Lf/Uf0;
/*   */     //   36: iload #4
/*   */     //   38: aaload
/*   */     //   39: dup
/*   */     //   40: astore #4
/*   */     //   42: ifnonnull -> 50
/*   */     //   45: fconst_0
/*   */     //   46: fstore_3
/*   */     //   47: goto -> 57
/*   */     //   50: aload #4
/*   */     //   52: iload_3
/*   */     //   53: invokevirtual Sp : (S)F
/*   */     //   56: fstore_3
/*   */     //   57: fload_3
/*   */     //   58: fconst_0
/*   */     //   59: fcmpl
/*   */     //   60: ifne -> 78
/*   */     //   63: invokestatic XU : ()Z
/*   */     //   66: ifeq -> 76
/*   */     //   69: ldc_w 3.0
/*   */     //   72: fstore_3
/*   */     //   73: goto -> 78
/*   */     //   76: fconst_2
/*   */     //   77: fstore_3
/*   */     //   78: aload_1
/*   */     //   79: dup
/*   */     //   80: dup
/*   */     //   81: getfield ta : Lf/Q90;
/*   */     //   84: invokevirtual Vf0 : ()S
/*   */     //   87: istore #4
/*   */     //   89: iconst_0
/*   */     //   90: istore #5
/*   */     //   92: getfield Ih0 : B
/*   */     //   95: istore #6
/*   */     //   97: getfield ta : Lf/Q90;
/*   */     //   100: invokevirtual tm0 : ()Z
/*   */     //   103: istore #7
/*   */     //   105: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   108: iload #6
/*   */     //   110: iload #4
/*   */     //   112: iload #5
/*   */     //   114: iload #7
/*   */     //   116: invokevirtual H9 : (BSZZ)[Lf/zh0;
/*   */     //   119: dup
/*   */     //   120: astore #8
/*   */     //   122: iconst_0
/*   */     //   123: aaload
/*   */     //   124: astore #9
/*   */     //   126: aconst_null
/*   */     //   127: astore #10
/*   */     //   129: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   132: iload #6
/*   */     //   134: iload #4
/*   */     //   136: iload #5
/*   */     //   138: iload #7
/*   */     //   140: invokevirtual rE0 : (BSZZ)Z
/*   */     //   143: ifeq -> 216
/*   */     //   146: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   149: aload_1
/*   */     //   150: dup
/*   */     //   151: getfield ta : Lf/Q90;
/*   */     //   154: invokevirtual Vf0 : ()S
/*   */     //   157: istore #4
/*   */     //   159: getfield Ih0 : B
/*   */     //   162: iload #4
/*   */     //   164: aload_1
/*   */     //   165: getfield ta : Lf/Q90;
/*   */     //   168: invokevirtual tm0 : ()Z
/*   */     //   171: iload #5
/*   */     //   173: swap
/*   */     //   174: invokevirtual F7 : (BSZZ)Z
/*   */     //   177: ifeq -> 275
/*   */     //   180: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   183: aload_1
/*   */     //   184: dup
/*   */     //   185: getfield ta : Lf/Q90;
/*   */     //   188: invokevirtual Vf0 : ()S
/*   */     //   191: istore #4
/*   */     //   193: getfield Ih0 : B
/*   */     //   196: iload #4
/*   */     //   198: aload_1
/*   */     //   199: getfield ta : Lf/Q90;
/*   */     //   202: invokevirtual tm0 : ()Z
/*   */     //   205: iload #5
/*   */     //   207: swap
/*   */     //   208: invokevirtual Hr : (BSZZ)[I
/*   */     //   211: astore #10
/*   */     //   213: goto -> 275
/*   */     //   216: aload_0
/*   */     //   217: dup
/*   */     //   218: getstatic f/um0.Kt0 : Lf/um0;
/*   */     //   221: aload_1
/*   */     //   222: dup
/*   */     //   223: getfield ta : Lf/Q90;
/*   */     //   226: invokevirtual Vf0 : ()S
/*   */     //   229: istore_3
/*   */     //   230: getfield Ih0 : B
/*   */     //   233: iload_3
/*   */     //   234: aload_1
/*   */     //   235: getfield ta : Lf/Q90;
/*   */     //   238: invokevirtual tm0 : ()Z
/*   */     //   241: iload #5
/*   */     //   243: swap
/*   */     //   244: invokevirtual vt : (BSZZ)Lf/UA0;
/*   */     //   247: dup
/*   */     //   248: astore_1
/*   */     //   249: putfield Vf : Lf/UA0;
/*   */     //   252: getfield p80 : Ljava/util/ArrayList;
/*   */     //   255: aload_1
/*   */     //   256: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   259: pop
/*   */     //   260: invokestatic XU : ()Z
/*   */     //   263: ifeq -> 273
/*   */     //   266: ldc_w 4.0
/*   */     //   269: fstore_3
/*   */     //   270: goto -> 275
/*   */     //   273: fconst_2
/*   */     //   274: fstore_3
/*   */     //   275: aload #8
/*   */     //   277: arraylength
/*   */     //   278: iconst_1
/*   */     //   279: if_icmple -> 316
/*   */     //   282: aload #10
/*   */     //   284: ifnull -> 316
/*   */     //   287: aload_2
/*   */     //   288: dup
/*   */     //   289: dup
/*   */     //   290: getfield TS : Lf/rH;
/*   */     //   293: aload #8
/*   */     //   295: invokevirtual sm : ([Lf/zh0;)V
/*   */     //   298: getfield TS : Lf/rH;
/*   */     //   301: aload #10
/*   */     //   303: invokevirtual s8 : ([I)V
/*   */     //   306: getfield TS : Lf/rH;
/*   */     //   309: iconst_1
/*   */     //   310: putfield vU : Z
/*   */     //   313: goto -> 450
/*   */     //   316: aload_0
/*   */     //   317: getfield Vf : Lf/UA0;
/*   */     //   320: dup
/*   */     //   321: astore_1
/*   */     //   322: ifnull -> 434
/*   */     //   325: aload_2
/*   */     //   326: aload_0
/*   */     //   327: aload_1
/*   */     //   328: fload_3
/*   */     //   329: invokestatic round : (F)I
/*   */     //   332: i2f
/*   */     //   333: invokevirtual Zz : (F)V
/*   */     //   336: getfield Vf : Lf/UA0;
/*   */     //   339: invokevirtual run : ()V
/*   */     //   342: getfield TS : Lf/rH;
/*   */     //   345: iconst_1
/*   */     //   346: anewarray f/pe0
/*   */     //   349: dup
/*   */     //   350: aload_0
/*   */     //   351: getfield Vf : Lf/UA0;
/*   */     //   354: invokevirtual OB0 : ()Lf/pe0;
/*   */     //   357: iconst_0
/*   */     //   358: swap
/*   */     //   359: aastore
/*   */     //   360: invokevirtual Pn : ([Lf/pe0;)Lf/JG0;
/*   */     //   363: pop
/*   */     //   364: invokestatic XU : ()Z
/*   */     //   367: ifeq -> 397
/*   */     //   370: aload_2
/*   */     //   371: getfield TS : Lf/rH;
/*   */     //   374: dup
/*   */     //   375: dup
/*   */     //   376: astore_0
/*   */     //   377: getfield Cf0 : I
/*   */     //   380: bipush #100
/*   */     //   382: isub
/*   */     //   383: aload_0
/*   */     //   384: getfield Tn : I
/*   */     //   387: bipush #50
/*   */     //   389: isub
/*   */     //   390: invokevirtual zT : (II)Lf/JG0;
/*   */     //   393: pop
/*   */     //   394: goto -> 421
/*   */     //   397: aload_2
/*   */     //   398: getfield TS : Lf/rH;
/*   */     //   401: dup
/*   */     //   402: dup
/*   */     //   403: astore_0
/*   */     //   404: getfield Cf0 : I
/*   */     //   407: bipush #50
/*   */     //   409: isub
/*   */     //   410: aload_0
/*   */     //   411: getfield Tn : I
/*   */     //   414: bipush #15
/*   */     //   416: isub
/*   */     //   417: invokevirtual zT : (II)Lf/JG0;
/*   */     //   420: pop
/*   */     //   421: aload_2
/*   */     //   422: getfield TS : Lf/rH;
/*   */     //   425: ldc_w 0.5
/*   */     //   428: putfield V1 : F
/*   */     //   431: goto -> 450
/*   */     //   434: aload_2
/*   */     //   435: getfield TS : Lf/rH;
/*   */     //   438: iconst_1
/*   */     //   439: anewarray f/zh0
/*   */     //   442: dup
/*   */     //   443: iconst_0
/*   */     //   444: aload #9
/*   */     //   446: aastore
/*   */     //   447: invokevirtual sm : ([Lf/zh0;)V
/*   */     //   450: invokestatic XU : ()Z
/*   */     //   453: ifeq -> 483
/*   */     //   456: aload_2
/*   */     //   457: aload #9
/*   */     //   459: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   462: getfield H0 : I
/*   */     //   465: iconst_2
/*   */     //   466: imul
/*   */     //   467: aload #9
/*   */     //   469: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   472: getfield Vn0 : I
/*   */     //   475: iconst_2
/*   */     //   476: imul
/*   */     //   477: invokevirtual Cu0 : (II)V
/*   */     //   480: goto -> 503
/*   */     //   483: aload_2
/*   */     //   484: aload #9
/*   */     //   486: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   489: getfield H0 : I
/*   */     //   492: aload #9
/*   */     //   494: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   497: getfield Vn0 : I
/*   */     //   500: invokevirtual Cu0 : (II)V
/*   */     //   503: aload_2
/*   */     //   504: dup
/*   */     //   505: dup
/*   */     //   506: invokevirtual MJ0 : ()V
/*   */     //   509: invokevirtual mM : ()V
/*   */     //   512: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 19
/*   */     //   #2	-> 23
/*   */     //   #3	-> 26
/*   */     //   #4	-> 33
/*   */     //   #5	-> 38
/*   */     //   #6	-> 63
/*   */     //   #7	-> 81
/*   */     //   #8	-> 84
/*   */     //   #9	-> 92
/*   */     //   #10	-> 97
/*   */     //   #11	-> 100
/*   */     //   #12	-> 105
/*   */     //   #13	-> 116
/*   */     //   #14	-> 129
/*   */     //   #15	-> 140
/*   */     //   #16	-> 146
/*   */     //   #17	-> 151
/*   */     //   #18	-> 154
/*   */     //   #19	-> 159
/*   */     //   #20	-> 165
/*   */     //   #21	-> 168
/*   */     //   #22	-> 180
/*   */     //   #23	-> 185
/*   */     //   #24	-> 188
/*   */     //   #25	-> 193
/*   */     //   #26	-> 199
/*   */     //   #27	-> 202
/*   */     //   #28	-> 218
/*   */     //   #29	-> 223
/*   */     //   #30	-> 226
/*   */     //   #31	-> 230
/*   */     //   #32	-> 235
/*   */     //   #33	-> 238
/*   */     //   #34	-> 290
/*   */     //   #35	-> 295
/*   */     //   #36	-> 298
/*   */     //   #37	-> 303
/*   */     //   #38	-> 306
/*   */     //   #39	-> 310
/*   */     //   #40	-> 317
/*   */     //   #41	-> 342
/*   */     //   #42	-> 346
/*   */     //   #43	-> 371
/*   */     //   #44	-> 377
/*   */     //   #45	-> 384
/*   */     //   #46	-> 390
/*   */     //   #47	-> 398
/*   */     //   #48	-> 404
/*   */     //   #49	-> 411
/*   */     //   #50	-> 417
/*   */     //   #51	-> 422
/*   */     //   #52	-> 428
/*   */     //   #53	-> 435
/*   */     //   #54	-> 439
/*   */     //   #55	-> 462
/*   */     //   #56	-> 469
/*   */     //   #57	-> 472
/*   */     //   #58	-> 477
/*   */     //   #59	-> 489
/*   */     //   #60	-> 494
/*   */     //   #61	-> 497
/*   */     //   #62	-> 500
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */