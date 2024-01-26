/*  1 */ package f;public final class W9 extends jp0 { public final void Ap0() { vh0 vh0; if ((vh0 = km.a3) == null || vh0.Ct == null || 
/*    */       
/*  3 */       !km.u4.sU || 
/*  4 */       !(km.a3.Jr0() instanceof xV)) return;  super.Ap0(); jG(); xV xV = (xV)km.a3.Jr0();
/*  5 */     Jo jo = km.a3.Ct;
/*  6 */     float f1 = this.lPT1.r, f2 = this.lPT1.g, f3 = this.lPT1.b, f4 = this.lPT1.a; UB0.go.glClearColor(f1, f2, f3, f4); UB0.go.glClear(16640); Sw0 sw0; if ((sw0 = this.qx) != null) { zf0();
/*    */       
/*    */       Color color;
/*  9 */       f3 = sw0.yp0.r * (color = sw0.wJ).r; f4 = sw0.yp0.g * color.g; float f6 = sw0.yp0.b * color.b, f9 = sw0.yp0.a; UB0.go.glClearColor(f3, f4, f6, f9); UB0.go.glClear(16640); sw0.xB0.wO(true); sw0.O60.UX(true); sw0.XI.d60(sw0.O60.VD0); sw0.XI.Tx();
/*    */       
/* 11 */       int i1 = (int)sw0.xB0.w00 / 2 - 30;
/*    */       
/* 13 */       int i2 = (int)sw0.xB0.ow / 2 - 140; (sw0.bc0[10])
/* 14 */         .G3
/* 15 */         .setWrap(A00.OW, A00.OW); sw0.bc0[10].Zk(3.0F); sw0.bc0[10].Hc0(0.0F, 60.0F); f4 = sw0.wJ.r; f9 = sw0.wJ.g; float f10 = sw0.wJ.b; sw0.bc0[10].fn0(f4, f9, f10); sw0.bc0[10].Ne(sw0.XI);
/*    */       byte b1;
/* 17 */       for (sw0.hI = UB0.M60.Qy * 4.0F + sw0.hI, b1 = 0; b1 < 4; ) { f9 = -sw0.hI * 10.0F % 360.0F; sw0.bc0[b1].Zk(4.0F); sw0.bc0[b1].yc(b1 * 90.0F + f9 - 90.0F); f9 = nx0.zN((b1 * 90.0F + f9) * 0.017453292F) * 550.0F; f10 = nx0.E70((b1 * 90.0F + f9) * 0.017453292F) * 550.0F; sw0.bc0[b1].Hc0(i1 + f9, i2 + f10); f9 = sw0.wJ.r; f10 = sw0.wJ.g; float f = sw0.wJ.b; sw0.bc0[b1].fn0(f9, f10, f); sw0.bc0[b1].Ne(sw0.XI); b1++; }  for (b1 = 4; b1 < 6; ) { f9 = -sw0.hI * 5.0F % 360.0F; sw0.bc0[b1].Zk(4.0F); sw0.bc0[b1].yc(b1 * 180.0F + f9 - 90.0F); f9 = nx0.zN((b1 * 180.0F + f9) * 0.017453292F) * 300.0F; f10 = nx0.E70((b1 * 180.0F + f9) * 0.017453292F) * 300.0F; sw0.bc0[b1].Hc0(i1 + f9, i2 + f10); f9 = sw0.wJ.r; f10 = sw0.wJ.g; float f = sw0.wJ.b; sw0.bc0[b1].fn0(f9, f10, f); sw0.bc0[b1].Ne(sw0.XI); b1++; }  for (b1 = 6; b1 < 8; ) { f9 = -sw0.hI * 2.5F % 360.0F; sw0.bc0[b1].Zk(4.0F); sw0.bc0[b1].yc(b1 * 180.0F + f9 - 90.0F); f9 = nx0.zN((b1 * 180.0F + f9) * 0.017453292F) * 150.0F; f10 = nx0.E70((b1 * 180.0F + f9) * 0.017453292F) * 150.0F; sw0.bc0[b1].Hc0(i1 + f9, i2 + f10); f9 = sw0.wJ.r; f10 = sw0.wJ.g; float f = sw0.wJ.b; sw0.bc0[b1].fn0(f9, f10, f); sw0.bc0[b1].Ne(sw0.XI); b1++; }  float f8 = -sw0.hI * 2.5F % 360.0F; sw0.bc0[8].Zk(4.0F); sw0.bc0[8].yc(f8); float f5 = i1; sw0.bc0[8].Hc0(f5, i2); f5 = sw0.wJ.r; float f7 = sw0.wJ.g; f8 = sw0.wJ.b; sw0.bc0[8].fn0(f5, f7, f8); sw0.bc0[8].Ne(sw0.XI); sw0.XI.end(); int m = UB0.M60.fG0(), n = UB0.M60.dL(); ou0.com8(0, 0, m, n); sw0.getClass(); }
/*    */     
/* 19 */     eo eo = jo.pm.cOm3; Cy cy;
/* 20 */     if ((cy = this.K60) == null || cy != xV || (cy
/* 21 */       .IY && 
/* 22 */       ud.Bp().yF() >= 255))
/*    */     
/* 24 */     { L70.gq.oh0
/* 25 */         .jn0 = 0L;
/* 26 */       if ((cy = this.K60) != null && cy
/* 27 */         .IY) { cy
/* 28 */           .IY = false; cy.t8(); }  this
/* 29 */         .K60 = xV;
/*    */       
/*    */       lF0 lF0;
/*    */       
/* 33 */       this.Iy = new Ah[(lF0 = xV.xk0).X7][lF0.cB0];
/* 34 */       Wx0.i4
/* 35 */         .TV(); for (Hc0 hc02 = this.wN.r30(); hc02.hasNext(); ((Ah)hc02.next()).dispose()); this.wN.clear(); this.l1
/* 36 */         .aB0
/* 37 */         .vO(); this.XT = -1; this.G50 = -1; if (km.MR == null && km.wI0
/* 38 */         .K00 == null) {
/*    */         
/* 40 */         byte b2 = xV.E10;
/* 41 */         km.pm0.Wk0(b2, xV.zu());
/*    */       } 
/*    */       
/* 44 */       Xi.WB = xV.UZ.vN; Ws0 ws0; byte b1;
/* 45 */       if ((b1 = (ws0 = xV.br0).d8) == 117 || b1 == 56 || ws0
/* 46 */         .Ga == 260 || b1 == 53) Xi.WB = true; 
/* 47 */       ((s20)this.l1.aB0)
/*    */         
/* 49 */         .HC0
/* 50 */         .t9(); qA0 qA0;
/* 51 */       (qA0 = h3.AZ.iC()).getClass(); for (; qA0.hasNext(); ((lpt1)qA0.next()).Ea0()); for (Hc0 hc01 = h3.jS.r30(); hc01.hasNext(); ((Iq)hc01.next()).dispose()); h3.jS.clear(); h3.AZ.clear();
/* 52 */       km.iE0.Hf0(); }  me me; if ((((me = this.oo0) == null) ? 0 : me.h20()) != 
/* 53 */       xV.br0
/* 54 */       .Ga || (
/* 55 */       km.D70(1) && 
/* 56 */       UB0.PU.Ak(129) && UB0.PU.j2(92))) { me me1; Sw0 sw01; Qd qd; hy hy; bs0 bs0; sx0 sx0; fM0 fM0; Cx cx; eC eC; aG0 aG0; if ((me = this.oo0) != null) { me.dispose(); this.oo0 = null; }  Sw0 sw02; if ((sw02 = this.qx) != null) { sw02.dispose(); this.qx = null; }
/* 57 */        switch (xV.br0
/* 58 */         .Ga) { default: this(xV); this.oo0 = me1; break;case 573: case 574: case 575: case 576: case 577: case 579: case 580: case 581: case 582: case 583: super(xV); this.oo0 = me1; this(); this.qx = sw01; break;case 504: case 505: case 506: case 507: case 508: case 509: this(xV); this.oo0 = qd; break;case 176: case 178: case 180: case 182: case 184: case 185: case 291: case 293: case 294: this(xV); this.oo0 = hy; break;case 156: this(xV); this.oo0 = bs0; break;case 155: this(xV); this.oo0 = bs0; break;case 154: this(xV); this.oo0 = bs0; break;case 133: this(xV); this.oo0 = sx0; break;case 122: this(xV); this.oo0 = fM0; break;case 89: case 90: this(xV, this.DE0); this.oo0 = cx; break;case 67: this(xV); this.oo0 = eC; break;case 35: this(xV); this.oo0 = aG0; break; }  }  int i = 0, j = 0; boolean bool1, bool2;
/* 59 */     if ((bool1 = xV.et0) > 0 && (
/* 60 */       bool2 = xV.ey) > 0)
/*    */     { lF0 lF0;
/*    */       
/* 63 */       i = (int)((eo.x - (lF0 = xV.xk0).ju) / bool1); j = (int)((eo.y - lF0.km0) / bool2); }  if (this.XT != i || this.G50 != j) { this.XT = i; this.G50 = j; }
/* 64 */      System.nanoTime(); bool1 = false; bool2 = false; byte b;
/* 65 */     for (int k = Math.max(0, i - (b = 1)); k <= i + b; ) { for (int m = Math.max(0, j - b); m <= j + b; ) { QJ qJ; if (k >= 0 && m >= 0 && (qJ = xV.C20(k, m)) != null && this.Iy[k][m] == null) { iy0 iy0 = xV.vP(k, m); this(iy0, (yU)qJ.gT()); Ah ah; (ah = new Ah()).ej0(this.Cc0); float f = 0.0F; switch (xV.Xg0()) { case 582: f = 0.0F; break;case 581: case 583: f = 16.0F; break;case 580: f = 28.5F; break;case 579: f = 32.0F; break;case 577: f = 40.0F; break;case 576: f = 48.0F; break;case 575: f = 56.0F; break;case 574: f = 64.0F; break;case 573: f = 72.0F; break; }  lF0 lF0; if ((lF0 = this.l1.Sk(iy0.F70)) != null) { if (lF0.B1()) f = lF0.Dk(k, m);  float f5 = (k * 8 + 4); f5 = lF0.ju * 0.25F + f5; float f6 = (m * 8 + 4); ah.w3.Tz(f5, f, lF0.km0 * 0.25F + f6); }  ah.hj0(); this.Iy[k][m] = ah; this.wN.Com3(ah); bool2 = true; ah.K9
/* 66 */             .OU = 1.0F;
/* 67 */           ah.K9.Zr0 = 1.0F; ah.K9.gE0 = 1.0F; bool1 = true; }  m++; }  k++; }
/* 68 */      D d; (d = D.N2)
/* 69 */       .vt
/* 70 */       .d();
/* 71 */     if (bool2 && D.hS() && D.N2.l00 != null)
/* 72 */     { JG0 jG0; if ((jG0 = d.ni) != null) d.hp.Ct(jG0, true);  d.ni = null; d.du0(); d
/* 73 */         .l00.dispose(); d.hp.Ct(d.l00, true); }  if (bool1 && 
/* 74 */       km.D70(1))
/*    */     
/* 76 */     { System.nanoTime();
/* 77 */       tk0.getClass(); }  this
/* 78 */       .E40.mx0(zf0()); PL0(); Pw.Zo("PSYS.draw"); this.Zg.begin(); this.Zg.iy(); this.Zg.ZK0(); this.Zg.end(); Pw.yy0("PSYS.draw"); this.E40.tx0(this.Zg);
/* 79 */     if ((xV.Cd == 
/* 80 */       yE0.RG || xV
/* 81 */       .lpT1) && 
/* 82 */       km.u4
/* 83 */       .Ta0 != 7) { this
/* 84 */         .fY.JL(this.To0.I70); this.fY.y += 0.25F; if (this.Bu0 < 1.0F) this.Bu0 = 1.0F;  if (this.Bu0 > 5.0F) this.Bu0 = 5.0F;  this.T60.mh.WU(); eo eo1 = this.To0.I70, eo2 = this.To0.H, eo3 = this.To0.nj0; this.T60.mh.Cj(eo1, eo2, eo3); this.T60.mh.b8(this.fY); this.T60.mh.N8(eo.X, 90.0F); this.T60.mh.GJ(this.Bu0 * 1.25F, this.Bu0 * 1.25F, this.Bu0 * 1.25F); this.E40.Ly0(); this.E40.tx0(this.T60); }  this.E40.end(); km.iE0.getClass(); }
/*    */ 
/*    */   
/*    */   public static final ik tk0 = C00.gd(W9.class);
/*    */   public Ah[][] Iy = null;
/*    */   public boolean kR;
/*    */   public Sw0 qx = null;
/*    */   
/*    */   public W9(gD paramgD) {
/*    */     super(paramgD);
/*    */   }
/*    */   
/*    */   public final void L00() {
/*    */     super.L00();
/*    */     this.wg = yE0.a0;
/*    */     this.DE0 = new wI0();
/*    */     String str1 = Lpt3.La0();
/*    */     String str2 = Lpt3.h40();
/*    */     wI0 wI0 = this.DE0;
/*    */     this(str1, str2, wI0);
/*    */     xh xh;
/*    */     (new xh()).Ug0 = 1;
/*    */     (new xh()).hX = 5;
/*    */     (new xh()).xu = 32;
/*    */     this.E40 = new K70(new Lpt3(xh, this.DE0), new lt());
/*    */   }
/*    */   
/*    */   public final boolean rS(byte paramByte, eo parameo, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield w6 : Z
/*    */     //   4: iconst_1
/*    */     //   5: ixor
/*    */     //   6: istore #7
/*    */     //   8: getstatic f/km.a3 : Lf/vh0;
/*    */     //   11: dup
/*    */     //   12: astore #8
/*    */     //   14: ifnonnull -> 20
/*    */     //   17: iconst_1
/*    */     //   18: istore #7
/*    */     //   20: iload #7
/*    */     //   22: aconst_null
/*    */     //   23: astore #9
/*    */     //   25: ifne -> 84
/*    */     //   28: aload #8
/*    */     //   30: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   33: dup
/*    */     //   34: astore #8
/*    */     //   36: instanceof f/Cy
/*    */     //   39: ifne -> 44
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: aload_0
/*    */     //   45: aload #8
/*    */     //   47: checkcast f/Cy
/*    */     //   50: astore #9
/*    */     //   52: getfield oo0 : Lf/me;
/*    */     //   55: dup
/*    */     //   56: astore #8
/*    */     //   58: ifnonnull -> 65
/*    */     //   61: iconst_0
/*    */     //   62: goto -> 70
/*    */     //   65: aload #8
/*    */     //   67: invokevirtual h20 : ()S
/*    */     //   70: aload #9
/*    */     //   72: getfield br0 : Lf/Ws0;
/*    */     //   75: getfield Ga : S
/*    */     //   78: if_icmpeq -> 84
/*    */     //   81: iconst_1
/*    */     //   82: istore #7
/*    */     //   84: iload #7
/*    */     //   86: ifeq -> 112
/*    */     //   89: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   92: aload_0
/*    */     //   93: iload_1
/*    */     //   94: aload_2
/*    */     //   95: iload_3
/*    */     //   96: iload #4
/*    */     //   98: iload #5
/*    */     //   100: iload #6
/*    */     //   102: <illegal opcode> run : (Lf/W9;BLf/eo;IZZZ)Ljava/lang/Runnable;
/*    */     //   107: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   110: iconst_1
/*    */     //   111: ireturn
/*    */     //   112: iload_1
/*    */     //   113: ldc 3.4028235E38
/*    */     //   115: fstore #7
/*    */     //   117: aconst_null
/*    */     //   118: astore #8
/*    */     //   120: iconst_4
/*    */     //   121: if_icmpeq -> 130
/*    */     //   124: iconst_1
/*    */     //   125: istore #10
/*    */     //   127: goto -> 133
/*    */     //   130: iconst_0
/*    */     //   131: istore #10
/*    */     //   133: aload_0
/*    */     //   134: getfield wN : Lf/fQ;
/*    */     //   137: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   140: astore #11
/*    */     //   142: aload #11
/*    */     //   144: invokevirtual hasNext : ()Z
/*    */     //   147: ifeq -> 600
/*    */     //   150: aload #11
/*    */     //   152: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   155: checkcast f/Ah
/*    */     //   158: getfield W7 : Lf/fQ;
/*    */     //   161: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   164: astore #12
/*    */     //   166: aload #12
/*    */     //   168: invokevirtual hasNext : ()Z
/*    */     //   171: ifeq -> 142
/*    */     //   174: iload #4
/*    */     //   176: aload #12
/*    */     //   178: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   181: checkcast f/lpt1
/*    */     //   184: astore #13
/*    */     //   186: ifeq -> 241
/*    */     //   189: aload #13
/*    */     //   191: getfield Zl0 : Ljava/lang/String;
/*    */     //   194: ldc 'door'
/*    */     //   196: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   199: ifne -> 241
/*    */     //   202: iload #5
/*    */     //   204: ifne -> 220
/*    */     //   207: aload #13
/*    */     //   209: getfield Zl0 : Ljava/lang/String;
/*    */     //   212: ldc 'badgegate'
/*    */     //   214: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   217: ifne -> 241
/*    */     //   220: iload #5
/*    */     //   222: ifne -> 166
/*    */     //   225: aload #13
/*    */     //   227: getfield Zl0 : Ljava/lang/String;
/*    */     //   230: ldc 'elevator'
/*    */     //   232: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   235: ifne -> 241
/*    */     //   238: goto -> 166
/*    */     //   241: iload #6
/*    */     //   243: ifeq -> 272
/*    */     //   246: iload #5
/*    */     //   248: ifne -> 272
/*    */     //   251: iload #4
/*    */     //   253: ifeq -> 272
/*    */     //   256: aload #13
/*    */     //   258: getfield Zl0 : Ljava/lang/String;
/*    */     //   261: ldc 'badgegate'
/*    */     //   263: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   266: ifeq -> 272
/*    */     //   269: goto -> 166
/*    */     //   272: aload #9
/*    */     //   274: invokevirtual Xg0 : ()S
/*    */     //   277: sipush #143
/*    */     //   280: if_icmpne -> 312
/*    */     //   283: aload #13
/*    */     //   285: getfield Zl0 : Ljava/lang/String;
/*    */     //   288: ldc 'warp0'
/*    */     //   290: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   293: ifne -> 166
/*    */     //   296: aload #13
/*    */     //   298: getfield Zl0 : Ljava/lang/String;
/*    */     //   301: ldc '_sta'
/*    */     //   303: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   306: ifeq -> 312
/*    */     //   309: goto -> 166
/*    */     //   312: aload #13
/*    */     //   314: aload_2
/*    */     //   315: aload #13
/*    */     //   317: getfield Of : Lf/Eb;
/*    */     //   320: dup
/*    */     //   321: astore #14
/*    */     //   323: getfield pp0 : Lf/eo;
/*    */     //   326: getfield y : F
/*    */     //   329: putfield y : F
/*    */     //   332: getfield Zl0 : Ljava/lang/String;
/*    */     //   335: ldc 'ele_door1'
/*    */     //   337: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   340: ifeq -> 385
/*    */     //   343: new f/Eb
/*    */     //   346: dup
/*    */     //   347: dup2
/*    */     //   348: astore #15
/*    */     //   350: aload #14
/*    */     //   352: invokespecial <init> : (Lf/Eb;)V
/*    */     //   355: getfield pp0 : Lf/eo;
/*    */     //   358: fconst_0
/*    */     //   359: fconst_0
/*    */     //   360: ldc 0.125
/*    */     //   362: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   365: aload #15
/*    */     //   367: getfield s60 : Lf/eo;
/*    */     //   370: fconst_0
/*    */     //   371: fconst_0
/*    */     //   372: ldc 0.125
/*    */     //   374: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   377: invokevirtual kX : (Lf/eo;Lf/eo;)Lf/Eb;
/*    */     //   380: pop
/*    */     //   381: aload #15
/*    */     //   383: astore #14
/*    */     //   385: aload #14
/*    */     //   387: aload_0
/*    */     //   388: dup
/*    */     //   389: dup2
/*    */     //   390: getfield dH0 : Lf/Eb;
/*    */     //   393: getfield pp0 : Lf/eo;
/*    */     //   396: dup
/*    */     //   397: astore #14
/*    */     //   399: aload_2
/*    */     //   400: dup
/*    */     //   401: dup
/*    */     //   402: aload #14
/*    */     //   404: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   407: pop
/*    */     //   408: getfield x : F
/*    */     //   411: fstore #14
/*    */     //   413: getfield y : F
/*    */     //   416: fstore #15
/*    */     //   418: getfield z : F
/*    */     //   421: fstore #16
/*    */     //   423: fload #14
/*    */     //   425: fload #15
/*    */     //   427: fload #16
/*    */     //   429: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   432: ldc 0.125
/*    */     //   434: invokevirtual ky0 : (F)V
/*    */     //   437: getfield dH0 : Lf/Eb;
/*    */     //   440: getfield s60 : Lf/eo;
/*    */     //   443: dup
/*    */     //   444: astore #14
/*    */     //   446: aload_2
/*    */     //   447: dup
/*    */     //   448: dup
/*    */     //   449: aload #14
/*    */     //   451: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   454: pop
/*    */     //   455: getfield x : F
/*    */     //   458: fstore #14
/*    */     //   460: getfield y : F
/*    */     //   463: fstore #15
/*    */     //   465: getfield z : F
/*    */     //   468: fstore #16
/*    */     //   470: fload #14
/*    */     //   472: fload #15
/*    */     //   474: fload #16
/*    */     //   476: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   479: ldc 0.125
/*    */     //   481: invokevirtual r9 : (F)V
/*    */     //   484: getfield dH0 : Lf/Eb;
/*    */     //   487: dup
/*    */     //   488: dup
/*    */     //   489: getfield pp0 : Lf/eo;
/*    */     //   492: astore #14
/*    */     //   494: getfield s60 : Lf/eo;
/*    */     //   497: aload #14
/*    */     //   499: swap
/*    */     //   500: invokevirtual kX : (Lf/eo;Lf/eo;)Lf/Eb;
/*    */     //   503: pop
/*    */     //   504: getfield dH0 : Lf/Eb;
/*    */     //   507: invokevirtual r10 : (Lf/Eb;)Z
/*    */     //   510: ifne -> 525
/*    */     //   513: aload_2
/*    */     //   514: invokevirtual Kw0 : ()Z
/*    */     //   517: ifne -> 525
/*    */     //   520: iload #4
/*    */     //   522: ifne -> 166
/*    */     //   525: iload #10
/*    */     //   527: ifeq -> 545
/*    */     //   530: iload_3
/*    */     //   531: aload #13
/*    */     //   533: getfield lz : Lf/fQ;
/*    */     //   536: getfield Z8 : I
/*    */     //   539: if_icmplt -> 545
/*    */     //   542: goto -> 166
/*    */     //   545: aload_2
/*    */     //   546: aload #13
/*    */     //   548: getfield Of : Lf/Eb;
/*    */     //   551: getfield sD : Lf/eo;
/*    */     //   554: dup
/*    */     //   555: dup
/*    */     //   556: getfield x : F
/*    */     //   559: fstore #14
/*    */     //   561: getfield y : F
/*    */     //   564: fstore #15
/*    */     //   566: getfield z : F
/*    */     //   569: fstore #16
/*    */     //   571: fload #14
/*    */     //   573: fload #15
/*    */     //   575: fload #16
/*    */     //   577: invokevirtual Cl0 : (FFF)F
/*    */     //   580: dup
/*    */     //   581: fstore #14
/*    */     //   583: fload #7
/*    */     //   585: fcmpg
/*    */     //   586: ifge -> 166
/*    */     //   589: aload #13
/*    */     //   591: fload #14
/*    */     //   593: fstore #7
/*    */     //   595: astore #8
/*    */     //   597: goto -> 166
/*    */     //   600: aload #8
/*    */     //   602: ifnull -> 1050
/*    */     //   605: iload_1
/*    */     //   606: tableswitch default -> 640, 0 -> 752, 1 -> 752, 2 -> 733, 3 -> 725, 4 -> 643
/*    */     //   640: goto -> 1048
/*    */     //   643: iload_3
/*    */     //   644: aload #8
/*    */     //   646: new f/eo
/*    */     //   649: dup
/*    */     //   650: astore_0
/*    */     //   651: invokespecial <init> : ()V
/*    */     //   654: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   657: aload_0
/*    */     //   658: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   661: pop
/*    */     //   662: iconst_1
/*    */     //   663: if_icmpne -> 691
/*    */     //   666: aload_0
/*    */     //   667: getfield y : F
/*    */     //   670: dup
/*    */     //   671: fstore_1
/*    */     //   672: ldc_w -90000.0
/*    */     //   675: fcmpg
/*    */     //   676: ifgt -> 713
/*    */     //   679: aload_0
/*    */     //   680: fload_1
/*    */     //   681: ldc_w 100000.0
/*    */     //   684: fadd
/*    */     //   685: putfield y : F
/*    */     //   688: goto -> 713
/*    */     //   691: aload_0
/*    */     //   692: getfield y : F
/*    */     //   695: dup
/*    */     //   696: fstore_1
/*    */     //   697: ldc_w -90000.0
/*    */     //   700: fcmpl
/*    */     //   701: ifle -> 713
/*    */     //   704: aload_0
/*    */     //   705: fload_1
/*    */     //   706: ldc_w 100000.0
/*    */     //   709: fsub
/*    */     //   710: putfield y : F
/*    */     //   713: aload #8
/*    */     //   715: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   718: aload_0
/*    */     //   719: invokevirtual b8 : (Lf/eo;)V
/*    */     //   722: goto -> 1048
/*    */     //   725: aload #8
/*    */     //   727: invokevirtual uq : ()V
/*    */     //   730: goto -> 1048
/*    */     //   733: aload #8
/*    */     //   735: dup
/*    */     //   736: ldc_w 1.0E8
/*    */     //   739: putfield k : F
/*    */     //   742: iload_3
/*    */     //   743: iconst_0
/*    */     //   744: aconst_null
/*    */     //   745: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   748: pop
/*    */     //   749: goto -> 1048
/*    */     //   752: iload #4
/*    */     //   754: ifeq -> 777
/*    */     //   757: iload #5
/*    */     //   759: ifeq -> 777
/*    */     //   762: iload_3
/*    */     //   763: ifne -> 777
/*    */     //   766: aload #8
/*    */     //   768: ldc_w 1.0E8
/*    */     //   771: putfield k : F
/*    */     //   774: goto -> 783
/*    */     //   777: aload #8
/*    */     //   779: fconst_1
/*    */     //   780: putfield k : F
/*    */     //   783: iload_1
/*    */     //   784: iconst_1
/*    */     //   785: if_icmpne -> 793
/*    */     //   788: iconst_1
/*    */     //   789: istore_1
/*    */     //   790: goto -> 795
/*    */     //   793: iconst_0
/*    */     //   794: istore_1
/*    */     //   795: iload_3
/*    */     //   796: aload #8
/*    */     //   798: iload_3
/*    */     //   799: iload_1
/*    */     //   800: aconst_null
/*    */     //   801: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   804: pop
/*    */     //   805: ifne -> 907
/*    */     //   808: iload #4
/*    */     //   810: ifeq -> 907
/*    */     //   813: iload #6
/*    */     //   815: ifeq -> 907
/*    */     //   818: aload_0
/*    */     //   819: invokestatic k60 : ()Lf/So;
/*    */     //   822: invokevirtual L5 : ()Lf/So;
/*    */     //   825: aload_0
/*    */     //   826: getfield To0 : Lf/Ih0;
/*    */     //   829: bipush #7
/*    */     //   831: ldc_w 1.5
/*    */     //   834: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   837: aload_0
/*    */     //   838: getfield To0 : Lf/Ih0;
/*    */     //   841: getfield el0 : F
/*    */     //   844: fconst_2
/*    */     //   845: fdiv
/*    */     //   846: invokevirtual a : (F)Lf/Wz0;
/*    */     //   849: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   852: aload_0
/*    */     //   853: getfield To0 : Lf/Ih0;
/*    */     //   856: bipush #6
/*    */     //   858: ldc_w 1.5
/*    */     //   861: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   864: aload_0
/*    */     //   865: getfield To0 : Lf/Ih0;
/*    */     //   868: getfield IG0 : F
/*    */     //   871: ldc_w 10.0
/*    */     //   874: fadd
/*    */     //   875: invokevirtual a : (F)Lf/Wz0;
/*    */     //   878: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   881: invokevirtual Kr : ()Lf/So;
/*    */     //   884: dup
/*    */     //   885: aload_0
/*    */     //   886: getfield RC : Lf/bf;
/*    */     //   889: putfield C00 : Lf/hk0;
/*    */     //   892: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   895: getfield pB0 : Lf/G30;
/*    */     //   898: invokevirtual mg : (Lf/G30;)Lf/sh;
/*    */     //   901: checkcast f/So
/*    */     //   904: putfield wI : Lf/So;
/*    */     //   907: iload #4
/*    */     //   909: ifeq -> 1048
/*    */     //   912: iload_3
/*    */     //   913: iconst_2
/*    */     //   914: istore_0
/*    */     //   915: ifne -> 923
/*    */     //   918: iconst_1
/*    */     //   919: istore_1
/*    */     //   920: goto -> 925
/*    */     //   923: iconst_0
/*    */     //   924: istore_1
/*    */     //   925: aload #8
/*    */     //   927: getfield jx : I
/*    */     //   930: lookupswitch default -> 996, 70 -> 1016, 75 -> 1016, 298 -> 1016, 427 -> 1016, 442 -> 1007, 456 -> 1016, 484 -> 1016
/*    */     //   996: iload_1
/*    */     //   997: ifeq -> 1023
/*    */     //   1000: sipush #1669
/*    */     //   1003: istore_2
/*    */     //   1004: goto -> 1027
/*    */     //   1007: iconst_3
/*    */     //   1008: istore_0
/*    */     //   1009: sipush #1544
/*    */     //   1012: istore_2
/*    */     //   1013: goto -> 1027
/*    */     //   1016: sipush #1671
/*    */     //   1019: istore_2
/*    */     //   1020: goto -> 1027
/*    */     //   1023: sipush #1670
/*    */     //   1026: istore_2
/*    */     //   1027: iload #5
/*    */     //   1029: ifeq -> 1038
/*    */     //   1032: iload_1
/*    */     //   1033: ifeq -> 1038
/*    */     //   1036: iconst_0
/*    */     //   1037: ireturn
/*    */     //   1038: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   1041: iconst_1
/*    */     //   1042: iload_0
/*    */     //   1043: iload_2
/*    */     //   1044: fconst_0
/*    */     //   1045: invokevirtual bA0 : (ZBSF)V
/*    */     //   1048: iconst_1
/*    */     //   1049: ireturn
/*    */     //   1050: iconst_0
/*    */     //   1051: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 72
/*    */     //   #2	-> 75
/*    */     //   #3	-> 408
/*    */     //   #4	-> 434
/*    */     //   #5	-> 455
/*    */     //   #6	-> 481
/*    */     //   #7	-> 551
/*    */     //   #8	-> 556
/*    */     //   #9	-> 561
/*    */     //   #10	-> 566
/*    */     //   #11	-> 577
/*    */     //   #12	-> 745
/*    */     //   #13	-> 771
/*    */     //   #14	-> 801
/*    */     //   #15	-> 819
/*    */     //   #16	-> 889
/*    */     //   #17	-> 892
/*    */     //   #18	-> 895
/*    */     //   #19	-> 898
/*    */     //   #20	-> 1045
/*    */   }
/*    */   
/*    */   public final void yB(yE0 paramyE0, boolean paramBoolean) {
/*    */     if ((!Bz.WZ && (Bz.fn || km.D70(8))) || !this.E4)
/*    */       paramyE0 = yE0.ne; 
/*    */     ParticleEffectExt particleEffectExt;
/*    */     if ((((particleEffectExt = this.j40) != null && paramBoolean) || paramyE0 == null || this.wg != paramyE0) && particleEffectExt != null)
/*    */       if (paramBoolean) {
/*    */         this.Zg.pf0();
/*    */         this.j40 = null;
/*    */       } else if (!particleEffectExt.isComplete()) {
/*    */         Hc0 hc0 = this.j40.getControllers().r30();
/*    */         while (hc0.hasNext())
/*    */           ((RegularEmitter)((ParticleController)hc0.next()).emitter).setEmissionMode(RegularEmitter.EmissionMode.EnabledUntilCycleEnd); 
/*    */       }  
/*    */     if (Bz.fn && UB0.PU.j2(93) && this.j40 != null) {
/*    */       this.Zg.pf0();
/*    */       this.j40 = null;
/*    */     } 
/*    */     this.Zg.iy();
/*    */     this.wg = paramyE0;
/*    */     if ((particleEffectExt = this.j40) != null && particleEffectExt.isComplete())
/*    */       this.j40 = null; 
/*    */     if (paramBoolean)
/*    */       return; 
/*    */     if (this.j40 == null && paramyE0 != null) {
/*    */       int i;
/*    */       if ((i = paramyE0.ordinal()) != 7 && i != 17)
/*    */         if (i != 41) {
/*    */           ParticleEffectExt particleEffectExt1;
/*    */           kg0 kg0;
/*    */           String str;
/*    */           if (i != 27) {
/*    */             if (i != 28) {
/*    */               switch (i) {
/*    */                 default:
/*    */                   switch (i) {
/*    */                     default:
/*    */                       return;
/*    */                     case 43:
/*    */                     case 44:
/*    */                       kg0 = this.Zg;
/*    */                       str = "weather/heavy_snow";
/*    */                       break;
/*    */                     case 45:
/*    */                       break;
/*    */                   } 
/*    */                 case 25:
/*    */                   kg0 = this.Zg;
/*    */                   str = "weather/hail";
/*    */                   break;
/*    */                 case 22:
/*    */                   (this.j40 = this.Zg.gi0("weather/heavy_rain")).start();
/*    */                   this.Zg.L40(this.j40);
/*    */                   this.YK = particleEffectExt1 = this.Zg.gi0("weather/thunder");
/*    */                   this.Zg.L40(this);
/*    */                 case 21:
/*    */                   kg0 = ((jp0)this).Zg;
/*    */                   str = "weather/heavy_rain";
/*    */                   break;
/*    */                 case 24:
/*    */                 
/*    */                 case 20:
/*    */                   kg0 = ((jp0)this).Zg;
/*    */                   str = "weather/rain";
/*    */                   break;
/*    */                 case 23:
/*    */                   kg0 = ((jp0)this).Zg;
/*    */                   str = "weather/snow";
/*    */                   break;
/*    */               } 
/*    */             } else {
/*    */               kg0 = ((jp0)this).Zg;
/*    */               str = "weather/sandstorm";
/*    */             } 
/*    */           } else {
/*    */             kg0 = ((jp0)this).Zg;
/*    */             str = "weather/ash";
/*    */           } 
/*    */           (((jp0)this).j40 = kg0.gi0(str)).start();
/*    */           ((jp0)this).Zg.L40(((jp0)this).j40);
/*    */         }  
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void YR(Cy paramCy) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: bipush #28
/*    */     //   3: istore_2
/*    */     //   4: getfield br0 : Lf/Ws0;
/*    */     //   7: invokevirtual kJ : ()Z
/*    */     //   10: ifeq -> 25
/*    */     //   13: aload_1
/*    */     //   14: getfield xk0 : Lf/lF0;
/*    */     //   17: getfield sa0 : S
/*    */     //   20: bipush #7
/*    */     //   22: if_icmpne -> 47
/*    */     //   25: aload_1
/*    */     //   26: getfield xk0 : Lf/lF0;
/*    */     //   29: getfield sa0 : S
/*    */     //   32: ifeq -> 47
/*    */     //   35: aload_1
/*    */     //   36: getfield br0 : Lf/Ws0;
/*    */     //   39: getfield d8 : B
/*    */     //   42: bipush #56
/*    */     //   44: if_icmpne -> 50
/*    */     //   47: bipush #39
/*    */     //   49: istore_2
/*    */     //   50: aload_0
/*    */     //   51: getfield w6 : Z
/*    */     //   54: ifne -> 116
/*    */     //   57: aload_0
/*    */     //   58: dup
/*    */     //   59: getstatic f/km.mI0 : Lf/P1;
/*    */     //   62: getfield AN : Lf/Wo;
/*    */     //   65: getfield r70 : Lf/FE0;
/*    */     //   68: getfield WE0 : [Lf/eA0;
/*    */     //   71: iload_2
/*    */     //   72: aaload
/*    */     //   73: dup
/*    */     //   74: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   77: pop
/*    */     //   78: getstatic f/L70.gq : Lf/L70;
/*    */     //   81: dup
/*    */     //   82: invokevirtual Rr0 : ()I
/*    */     //   85: bipush #60
/*    */     //   87: imul
/*    */     //   88: istore_2
/*    */     //   89: invokevirtual Zi0 : ()I
/*    */     //   92: sipush #3600
/*    */     //   95: irem
/*    */     //   96: bipush #60
/*    */     //   98: idiv
/*    */     //   99: iload_2
/*    */     //   100: iadd
/*    */     //   101: invokestatic W70 : (I)I
/*    */     //   104: istore_2
/*    */     //   105: getfield R10 : [Lf/lw;
/*    */     //   108: iload_2
/*    */     //   109: aaload
/*    */     //   110: putfield Cc0 : Lf/lw;
/*    */     //   113: invokevirtual tJ : ()V
/*    */     //   116: aload_0
/*    */     //   117: getfield E4 : Z
/*    */     //   120: ifeq -> 137
/*    */     //   123: aload_0
/*    */     //   124: aload_1
/*    */     //   125: getfield Cd : Lf/yE0;
/*    */     //   128: aload_0
/*    */     //   129: getfield w6 : Z
/*    */     //   132: iconst_1
/*    */     //   133: ixor
/*    */     //   134: invokevirtual yB : (Lf/yE0;Z)V
/*    */     //   137: aload_1
/*    */     //   138: getfield br0 : Lf/Ws0;
/*    */     //   141: dup
/*    */     //   142: astore_2
/*    */     //   143: getfield d8 : B
/*    */     //   146: dup
/*    */     //   147: istore_3
/*    */     //   148: bipush #62
/*    */     //   150: if_icmpne -> 166
/*    */     //   153: aload_0
/*    */     //   154: getfield wg : Lf/yE0;
/*    */     //   157: getstatic f/yE0.p3 : Lf/yE0;
/*    */     //   160: if_acmpne -> 166
/*    */     //   163: goto -> 238
/*    */     //   166: iload_3
/*    */     //   167: bipush #53
/*    */     //   169: if_icmpne -> 222
/*    */     //   172: aload_0
/*    */     //   173: dup
/*    */     //   174: dup
/*    */     //   175: getfield xd : Lf/qo;
/*    */     //   178: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   181: ldc_w 0.03
/*    */     //   184: ldc_w 0.05
/*    */     //   187: ldc_w 0.3
/*    */     //   190: fconst_0
/*    */     //   191: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   194: pop
/*    */     //   195: getfield MS : Lf/qo;
/*    */     //   198: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   201: fconst_1
/*    */     //   202: fconst_1
/*    */     //   203: fconst_1
/*    */     //   204: fconst_1
/*    */     //   205: invokevirtual set : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   208: pop
/*    */     //   209: getfield lPT1 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   212: getstatic com/badlogic/gdx/graphics/Color.BLACK : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   215: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   218: pop
/*    */     //   219: goto -> 450
/*    */     //   222: iload_3
/*    */     //   223: bipush #50
/*    */     //   225: if_icmpne -> 278
/*    */     //   228: aload_0
/*    */     //   229: getfield wg : Lf/yE0;
/*    */     //   232: getstatic f/yE0.p3 : Lf/yE0;
/*    */     //   235: if_acmpne -> 278
/*    */     //   238: aload_0
/*    */     //   239: dup
/*    */     //   240: dup
/*    */     //   241: getfield xd : Lf/qo;
/*    */     //   244: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   247: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   250: dup
/*    */     //   251: astore_1
/*    */     //   252: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   255: pop
/*    */     //   256: getfield MS : Lf/qo;
/*    */     //   259: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   262: aload_1
/*    */     //   263: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   266: pop
/*    */     //   267: getfield lPT1 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   270: aload_1
/*    */     //   271: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   274: pop
/*    */     //   275: goto -> 450
/*    */     //   278: iload_3
/*    */     //   279: bipush #70
/*    */     //   281: if_icmpne -> 297
/*    */     //   284: aload_0
/*    */     //   285: getfield wg : Lf/yE0;
/*    */     //   288: getstatic f/yE0.Ls0 : Lf/yE0;
/*    */     //   291: if_acmpne -> 297
/*    */     //   294: goto -> 400
/*    */     //   297: aload_2
/*    */     //   298: getfield Ga : S
/*    */     //   301: dup
/*    */     //   302: istore_2
/*    */     //   303: bipush #89
/*    */     //   305: if_icmpeq -> 424
/*    */     //   308: iload_2
/*    */     //   309: bipush #90
/*    */     //   311: if_icmpne -> 317
/*    */     //   314: goto -> 424
/*    */     //   317: aload_0
/*    */     //   318: getfield wg : Lf/yE0;
/*    */     //   321: dup
/*    */     //   322: astore_2
/*    */     //   323: getstatic f/yE0.Nw : Lf/yE0;
/*    */     //   326: if_acmpne -> 346
/*    */     //   329: aload_0
/*    */     //   330: getfield xd : Lf/qo;
/*    */     //   333: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   336: ldc_w 1546913279
/*    */     //   339: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   342: pop
/*    */     //   343: goto -> 450
/*    */     //   346: aload_2
/*    */     //   347: getstatic f/yE0.It0 : Lf/yE0;
/*    */     //   350: if_acmpne -> 381
/*    */     //   353: aload_0
/*    */     //   354: dup
/*    */     //   355: getfield xd : Lf/qo;
/*    */     //   358: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   361: ldc_w -1717986817
/*    */     //   364: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   367: pop
/*    */     //   368: getfield lPT1 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   371: ldc_w -1717986817
/*    */     //   374: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   377: pop
/*    */     //   378: goto -> 450
/*    */     //   381: aload_1
/*    */     //   382: getfield xk0 : Lf/lF0;
/*    */     //   385: getfield sa0 : S
/*    */     //   388: bipush #7
/*    */     //   390: if_icmpne -> 417
/*    */     //   393: aload_2
/*    */     //   394: getstatic f/yE0.lE0 : Lf/yE0;
/*    */     //   397: if_acmpne -> 417
/*    */     //   400: aload_0
/*    */     //   401: getfield xd : Lf/qo;
/*    */     //   404: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   407: ldc_w 1114367
/*    */     //   410: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   413: pop
/*    */     //   414: goto -> 450
/*    */     //   417: aload_0
/*    */     //   418: invokevirtual Hb0 : ()V
/*    */     //   421: goto -> 450
/*    */     //   424: aload_0
/*    */     //   425: dup
/*    */     //   426: getfield MS : Lf/qo;
/*    */     //   429: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   432: iconst_m1
/*    */     //   433: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   436: pop
/*    */     //   437: getfield xd : Lf/qo;
/*    */     //   440: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   443: sipush #255
/*    */     //   446: invokevirtual set : (I)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   449: pop
/*    */     //   450: aload_0
/*    */     //   451: getfield w6 : Z
/*    */     //   454: ifne -> 461
/*    */     //   457: aload_0
/*    */     //   458: invokevirtual tJ : ()V
/*    */     //   461: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 7
/*    */     //   #3	-> 14
/*    */     //   #4	-> 36
/*    */     //   #5	-> 51
/*    */     //   #6	-> 65
/*    */     //   #7	-> 68
/*    */     //   #8	-> 72
/*    */     //   #9	-> 74
/*    */     //   #10	-> 78
/*    */     //   #11	-> 82
/*    */     //   #12	-> 89
/*    */     //   #13	-> 101
/*    */     //   #14	-> 110
/*    */     //   #15	-> 125
/*    */     //   #16	-> 129
/*    */     //   #17	-> 138
/*    */     //   #18	-> 143
/*    */     //   #19	-> 382
/*    */     //   #20	-> 394
/*    */   }
/*    */   
/*    */   public final void rJ() {}
/*    */   
/*    */   public final void YB(Jo paramJo, Ih0 paramIh0, boolean paramBoolean) {
/*    */     int i;
/*    */     eo eo = paramJo.pm.cOm3;
/*    */     if (this.qK0) {
/*    */       if (this.sf0 == null)
/*    */         this.sf0 = eo; 
/*    */       eo = this.sf0;
/*    */     } 
/*    */     float f4 = eo.z * 0.25F + 0.1F;
/*    */     this.tM.TG0(eo.x * 0.25F, f4, eo.y * 0.25F + 0.1F);
/*    */     tr tr;
/*    */     if ((tr = tr.Jv).hn0 % 2 == 0) {
/*    */       i = tr.fm;
/*    */     } else {
/*    */       i = -i.fm;
/*    */     } 
/*    */     float f3 = i * 0.02F;
/*    */     this.tM.uD(f3, 0.0F, f3);
/*    */     f3 = wJ0.Nf0.tJ0();
/*    */     float f6 = wJ0.Nf0.yc0();
/*    */     this.tM.Tz(f3, 0.0F, f6);
/*    */     paramIh0.Ce0 = 0.5F;
/*    */     f3 = 100.0F;
/*    */     switch (this.wg.ordinal()) {
/*    */       case 35:
/*    */         f3 = paramIh0.el0 + 4.5F;
/*    */         break;
/*    */       case 28:
/*    */         f3 = paramIh0.el0 + 3.0F;
/*    */         break;
/*    */       case 27:
/*    */       case 37:
/*    */         f3 = paramIh0.el0 + 5.0F;
/*    */         break;
/*    */       case 25:
/*    */       case 32:
/*    */         f3 = paramIh0.el0 + 2.5F;
/*    */         break;
/*    */       case 21:
/*    */       case 24:
/*    */       case 43:
/*    */       case 44:
/*    */         f3 = paramIh0.el0 + 6.0F;
/*    */         break;
/*    */     } 
/*    */     Cy cy;
/*    */     if (!this.w6 || (cy = this.K60) == null) {
/*    */       paramIh0.l6 = f3;
/*    */     } else if (cy.br0.d8 == 53) {
/*    */       paramIh0.l6 = 19.0F;
/*    */     } 
/*    */     float f5;
/*    */     int j;
/*    */     if ((j = (f5 = paramIh0.l6) cmp f3) != 0)
/*    */       if (j > 0) {
/*    */         paramIh0.l6 = Math.max(f5 - UB0.M60.Qy * 15.0F, f3);
/*    */       } else {
/*    */         paramIh0.l6 = Math.min(UB0.M60.Qy * 15.0F + f5, f3);
/*    */       }  
/*    */     xV xV = (xV)km.a3.Jr0();
/*    */     G5 g5 = paramJo.HW;
/*    */     if (!this.kR)
/*    */       if (h1.hR && nx0.JC0(paramIh0.Bj, 15.0F)) {
/*    */         paramIh0.Bj = 10.5F;
/*    */       } else if (!h1.hR && !nx0.JC0(paramIh0.Bj, 15.0F)) {
/*    */         paramIh0.Bj = 15.0F;
/*    */       }  
/*    */     if (!this.w6) {
/*    */       if (!this.kR)
/*    */         paramIh0.Bj = 15.0F; 
/*    */       paramIh0.el0 = 12.5F;
/*    */       paramIh0.IG0 = -56.0F;
/*    */       paramIh0.Mp = 0.0F;
/*    */       if (xV != null && g5.LB0) {
/*    */         xr0 xr0;
/*    */         if ((xr0 = g5.CJ0()).Kn() > 90.0F && xr0.Kn() < 270.0F) {
/*    */           paramIh0.IG0 = 10.0F;
/*    */           paramIh0.Mp = -25.0F;
/*    */         } else if (xr0.Kn() > 0.0F && xr0.Kn() <= 90.0F) {
/*    */           paramIh0.Mp = -45.0F;
/*    */           paramIh0.IG0 = -15.0F;
/*    */         } else if (xr0.Kn() >= 270.0F) {
/*    */           paramIh0.Mp = 45.0F;
/*    */           paramIh0.IG0 = -25.0F;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     float f1 = this.tM.x, f2 = this.tM.y;
/*    */     f5 = this.tM.z;
/*    */     paramIh0.rE0(f1, f2, f5, 0.0F, 0.0F, 0.0F);
/*    */     paramIh0.abstract(true);
/*    */     if (this.wJ) {
/*    */       this.Z5.l6 = 1000.0F;
/*    */       this.Z5.Ce0 = 0.1F;
/*    */       this.Z5.Bj = paramIh0.Bj;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void xL() {
/*    */     super.xL();
/*    */     wJ0.Nf0.dz();
/*    */   }
/*    */   
/*    */   public final void QE(int paramInt1, int paramInt2) {
/*    */     super.QE(paramInt1, paramInt2);
/*    */     Sw0 sw0;
/*    */     if ((sw0 = this.qx) != null)
/*    */       this.xB0.cOM2(paramInt1, paramInt2); 
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.l1.aB0.vO();
/*    */     me me;
/*    */     if ((me = this.oo0) != null)
/*    */       me.dispose(); 
/*    */     Sw0 sw0;
/*    */     if ((sw0 = this.qx) != null)
/*    */       dispose(); 
/*    */   }
/*    */   
/*    */   public final void Kh() {
/*    */     super.Kh();
/*    */     if (km.a3 == null)
/*    */       return; 
/*    */     jG();
/*    */   }
/*    */   
/*    */   public final void ek() {
/*    */     BJ0(this.To0.Bj - 1.0F);
/*    */   }
/*    */   
/*    */   public final void k0() {
/*    */     BJ0(this.To0.Bj + 1.0F);
/*    */   }
/*    */   
/*    */   public final void CH(double paramDouble) {
/*    */     BJ0((float)(this.To0.Bj + paramDouble));
/*    */   }
/*    */   
/*    */   public final void BJ0(float paramFloat) {
/*    */     this.To0.Bj = paramFloat;
/*    */     this.kR = true;
/*    */   }
/*    */   
/*    */   public final float x0() {
/*    */     return 67.0F;
/*    */   }
/*    */   
/*    */   public final void Xv0() {
/*    */     this.To0.Bj = 67.0F;
/*    */     this.kR = false;
/*    */   }
/*    */   
/*    */   public final String XX() {
/*    */     String str = "\n\nMapHeader:";
/*    */     str = zw.vz(zw.vz(zw.vz(zw.vz(str, "\nID: ").append(this.K60.br0.Ga).toString(), "\nMatrix: ").append(this.K60.xk0.sa0).toString(), "\nTilesetID: ").append(this.K60.br0.COm4).toString(), "\nLight ID: ").append(this.K60.br0.P2.YI0).toString();
/*    */     if (this.K60 != null && this.Cc0 != null)
/*    */       str = zw.vz(str, "\nClearColor: ").append(this.Cc0.Jb0).toString(); 
/*    */     if (this.K60 != null)
/*    */       return zw.vz(str, "\n\nCameras:\nPosition: ").append(this.To0.Ah).append("\nTarget: ").append(this.To0.I70).append("\nDIST: ").append(this.To0.el0).append("\nYAW: ").append(this.To0.IG0).append("\nPITCH: ").append(this.To0.Mp).toString(); 
/*    */     return str;
/*    */   }
/*    */   
/*    */   public final void j00(short[] paramArrayOfshort) {
/*    */     super.j00(paramArrayOfshort);
/*    */     int i = this.w6 ^ true;
/*    */     Cy cy;
/*    */     me me2;
/*    */     if ((cy = (Cy)km.a3.Jr0()) == null || (((me2 = this.oo0) == null) ? 0 : me2.h20()) != cy.br0.Ga)
/*    */       i = 1; 
/*    */     if (i != 0) {
/*    */       UB0.Kg0.fN(() -> j00(paramArrayOfshort));
/*    */       return;
/*    */     } 
/*    */     me me1;
/*    */     if ((me1 = this.oo0) != null)
/*    */       Ad0(paramArrayOfshort); 
/*    */   }
/*    */   
/*    */   public final void Rx0(boolean paramBoolean) {
/*    */     this.B5.JL(km.a3.Ct.J.lpt8);
/*    */     for (Hc0 hc0 = this.wN.r30(); hc0.hasNext();) {
/*    */       for (Hc0 hc01 = ((Ah)hc0.next()).W7.r30(); hc01.hasNext(); ) {
/*    */         lpt1 lpt1 = (lpt1)hc01.next();
/*    */         this.dH0.pp0.JL(this.B5).ky0(0.125F);
/*    */         this.dH0.s60.JL(this.B5).r9(0.125F);
/*    */         eo eo = this.dH0.pp0;
/*    */         this.dH0.kX(eo, this.dH0.s60);
/*    */         if (lpt1.Zl0.equalsIgnoreCase("pc01") && lpt1.Of.r10(this.dH0)) {
/*    */           String str;
/*    */           if (paramBoolean) {
/*    */             str = "pc_moni_on";
/*    */           } else {
/*    */             str = "pc_moni_off";
/*    */           } 
/*    */           lpt1.co0(str, false, null);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Hk() {
/*    */     Sw0 sw0;
/*    */     if ((sw0 = this.qx) != null)
/*    */       So.k60().Wz0(0.5F).PL(Wz0.gq(this.wJ, 0, 1.0F).qY(new float[] { 0.5F, 0.5F, 0.5F, 1.0F })).mg(km.wI0.pB0); 
/*    */   }
/*    */   
/*    */   public final void jG() {
/*    */     Jo jo = km.a3.Ct;
/*    */     if (this.wI != null) {
/*    */       Xi.z6.JL(this.To0.H).zy0(this.To0.I70);
/*    */     } else if (jo != null) {
/*    */       tr.Jv.WR();
/*    */       /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/wJ0}, name=null}, name=FE0, descriptor=Ljava/util/LinkedList;}} */
/*    */       wJ0 wJ0;
/*    */       long l;
/*    */       if (((wJ0 = wJ0.Nf0).NuL <= (l = zm0.u20) && l - wJ0.rs > wJ0.Gb && l - wJ0.vM > 100L)) {
/*    */         LinkedList linkedList;
/*    */         try {
/*    */         
/*    */         } finally {
/*    */           this = null;
/*    */           /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */         } 
/*    */       } 
/*    */       YB(jo, this.To0, true);
/*    */       Xi.z6.JL(this.To0.H).zy0(this.To0.I70);
/*    */       if (this.wJ) {
/*    */         Xi.z6.JL(this.Z5.H).zy0(this.Z5.I70);
/*    */       } else {
/*    */         Xi.z6.JL(this.To0.H).zy0(this.To0.I70);
/*    */       } 
/*    */     } 
/*    */     if (!this.w6) {
/*    */       boolean bool;
/*    */       R8 r8;
/*    */       if ((r8 = km.u4).GG0) {
/*    */         this.GG0 = false;
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool) {
/*    */         km.a3.Ct.J.Jg0 = false;
/*    */         km.a3.Ct.pm.Kk(new nl[] { nl.Dn0 });
/*    */       } else {
/*    */         D80();
/*    */       } 
/*    */       ud.Bp().Xk(500, false);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */