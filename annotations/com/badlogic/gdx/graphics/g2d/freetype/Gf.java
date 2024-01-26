/*  1 */ package com.badlogic.gdx.graphics.g2d.freetype;public final class Gf implements iq0 { public final Me Ga0(G paramG, OZ paramOZ) { boolean bool; if (paramOZ.B0 == null && paramG.I30 != null) { bool = true; } else { bool = false; }  if (bool) { fQ fQ; this(); paramOZ.B0 = fQ; }  paramOZ.L7 = this.ZY + "-" + paramG.A; char[] arrayOfChar1; int i = (arrayOfChar1 = paramG.u5.toCharArray()).length; boolean bool1 = paramG.gJ; int j = 0;
/*  2 */     switch (TX.Ca0[paramG.Io.ordinal()]) { case 7: j = 131104; break;case 6: j = 32; break;case 5: j = 65568; break;case 4: j = 131072; break;case 3: j = 0; break;case 2: j = 65536; break;case 1: j = 2; break; }
/*  3 */      Qk0(paramG.A); FreeType.SizeMetrics sizeMetrics = this.x60.WV().lS(); paramOZ.wI = paramG.mV; paramOZ.nO = FreeType.Xx0(sizeMetrics.yr()); paramOZ.am = FreeType.Xx0(sizeMetrics.Lv()); float f1 = FreeType.Xx0(sizeMetrics.c9()), f2 = paramOZ.nO; if (this.Gq0 && f1 == 0.0F) for (byte b1 = 32; b1 < this.x60.s6() + 32; ) { if (this
/*  4 */           .x60.UD0(b1, j))
/*  5 */         { float f3; float f4; if ((f3 = FreeType.Xx0(this.x60.kT().MG().Qy0())) <= (f4 = paramOZ.p30)) f3 = f4;  paramOZ.p30 = f3; }  b1++; }   paramOZ.p30 += paramG.XJ; if (this
/*  6 */       .x60.UD0(32, j) || this.x60.UD0(108, j))
/*  7 */     { paramOZ.kw = FreeType.Xx0(this.x60.kT().MG().TI()); } else { paramOZ.kw = this.x60.s40(); }  char[] arrayOfChar2; int k; byte b; for (k = (arrayOfChar2 = paramOZ.Tu).length, b = 0; b < k; ) { char c = arrayOfChar2[b];
/*  8 */       if (!this.x60.UD0(c, j)) { b++; continue; }  paramOZ
/*  9 */         .j90 = FreeType.Xx0(this.x60.kT().MG().Qy0()); }  if (paramOZ.j90 != 0.0F) { for (k = (arrayOfChar2 = paramOZ.h8).length, b = 0; b < k; ) { char c = arrayOfChar2[b];
/* 10 */         if (!this.x60.UD0(c, j)) { b++; continue; }
/* 11 */          int m = FreeType.Xx0(this.x60.kT().MG().Qy0()); paramOZ.Y5 = (Math.abs(paramG.YA) + m); }  if (this.Gq0 || paramOZ.Y5 != 1.0F) { float f3 = paramOZ.nO - paramOZ.Y5; float f4, f5 = -(f4 = paramOZ.p30); if (paramG.mV) { paramOZ.nO = -f3; paramOZ.DD = -f5; }  boolean bool2 = false; oF0 oF0; if ((oF0 = paramG.I30) == null) { eV eV; bw0 bw0; if (bool1) { bool2 = true; this(); } else { bool2 = Math.min(nx0.fv((int)Math.sqrt(((int)Math.ceil(eV) * (int)Math.ceil(eV) * i))), 1024); this(); }  boolean bool3 = true; this(bool2, bool2, Uc.xi0, 1, false, (eB0)bw0); Color color = paramG.Wh; oF0 oF01; (oF01 = new oF0())
/* 12 */             .LS.set(color);
/* 13 */           (color = (new oF0()).LS)
/* 14 */             .a = 0.0F; if (paramG.hj > 0.0F) { color
/* 15 */               .set(paramG.eh);
/* 16 */             oF01.LS
/* 17 */               .a = 0.0F; }  bool2 = bool3; oF0 = oF01; }  if (bool1) paramOZ.IW = new fQ(i + 32);  FreeType.Stroker stroker = null; if (paramG.hj > 0.0F) { boolean bool3; stroker = this.Z1.f6(); int n = (int)(paramG.hj * 64.0F), i1 = paramG.qH0 ^ true; if (paramG.qH0) { bool3 = true; } else { bool3 = false; }  stroker.h5(n, i1, bool3); }  int arrayOfInt[], m; for (arrayOfInt = new int[i], m = 0; m < i; ) { boolean bool3; char c = arrayOfChar1[m]; if (this
/* 18 */             .x60.UD0(c, j))
/* 19 */           { bool3 = FreeType.Xx0(this.x60.kT().MG().Qy0()); } else { bool3 = false; }  arrayOfInt[m] = bool3; paramOZ.tD(0, jk01); paramOZ.OB0 = jk01; Jk0 jk01; if (c == '\000' && (jk01 = AJ0(false, paramOZ, paramG, stroker, f2, oF0)) != null && jk01.zq != 0 && jk01.h50 != 0 && bool1) paramOZ.IW.Com3(jk01);  m++; }  for (j = i; j > 0; ) { int n; char c; for (m = 0, n = arrayOfInt[0], c = '\001'; c < j; ) { int i1; if ((i1 = arrayOfInt[c]) > n) { n = i1; m = c; }  c++; }  paramOZ.tD(n, jk01); Jk0 jk01; if (paramOZ.LF(n = arrayOfChar1[m]) == null && (jk01 = AJ0(n, paramOZ, paramG, stroker, f2, oF0)) != null && bool1) paramOZ.IW.Com3(jk01);  arrayOfInt[m] = arrayOfInt[--j]; n = arrayOfChar1[m]; arrayOfChar1[m] = arrayOfChar1[j]; arrayOfChar1[j] = n; }  if (stroker != null && !bool1) stroker.dispose();  if (bool1) { paramOZ.rL0 = this; paramOZ.nP = paramG; paramOZ.yJ0 = stroker; paramOZ.dh0 = oF0; }  if ((paramG.Bd &= this.x60.QI()) != 0) for (bool1 = false; bool1 < i; ) { Jk0 jk01; if ((jk01 = paramOZ.LF(j = arrayOfChar1[bool1])) != null) { int n; boolean bool3; for (n = this.x60.HK0(j), bool3 = bool1; bool3 < i; ) { Jk0 jk02; if ((jk02 = paramOZ.LF(m = arrayOfChar1[bool3])) != null) { int i1 = this.x60.HK0(m); int i2; if ((i2 = this.x60.bk(n, i1)) != 0) jk01.Js0(m, FreeType.Xx0(i2));  if ((m = this.x60.bk(i1, n)) != 0) jk02.Js0(j, FreeType.Xx0(m));  }  bool3++; }  }  bool1++; }   if (bool2) { fQ fQ; this(); paramOZ.B0 = this; cu0 cu01 = paramG.uX, cu02 = paramG.IS; oF0.LK(this, cu01, cu02); }  Jk0 jk0; if ((jk0 = paramOZ.LF(' ')) == null) { this(); (jk0 = new Jk0()).Ek = (int)paramOZ.kw + paramG.Q60; (new Jk0()).xU = 32; paramOZ.tD(32, this); }  if (this.zq == 0) this.zq = (int)(this.Ek + paramOZ.of);  if (bool)
/* 20 */         { fQ fQ = paramOZ.B0; cu0 cu01 = paramG.uX, cu02 = paramG.IS; paramG.I30.LK(this, cu01, cu02); }  if (!paramOZ.B0.isEmpty()) { boolean bool3; Me me; fQ fQ = paramOZ.B0;
/* 21 */           this(paramOZ, this, true);
/* 22 */           if (paramG.I30 == null) { bool3 = true; } else { bool3 = false; }  me
/* 23 */             .Com4 = bool3; return me; }
/* 24 */          throw new JU("Unable to create a font with no texture regions."); }  throw new JU("No cap character found in font"); }
/* 25 */      throw new JU("No x-height character found in font"); }
/*    */ 
/*    */   
/*    */   public final FreeType.Library Z1;
/*    */   public final FreeType.Face x60;
/*    */   public final String ZY;
/*    */   public boolean Gq0 = false;
/*    */   
/*    */   public Gf(RD0 paramRD0) {
/*    */     this(paramRD0, 0);
/*    */   }
/*    */   
/*    */   public Gf(RD0 paramRD0, int paramInt) {
/*    */     this.ZY = paramRD0.k6();
/*    */     this.Z1 = library;
/*    */     FreeType.Library library;
/*    */     this.x60 = (library = FreeType.Hj0()).DP(paramRD0, paramInt);
/*    */     if (Nj0())
/*    */       return; 
/*    */     Qk0(15);
/*    */   }
/*    */   
/*    */   public final void Qk0(int paramInt) {
/*    */     if (this.Gq0 || this.x60.yb(paramInt))
/*    */       return; 
/*    */     throw new JU("Couldn't set size for font");
/*    */   }
/*    */   
/*    */   public final Jk0 AJ0(char paramChar, OZ paramOZ, G paramG, FreeType.Stroker paramStroker, float paramFloat, oF0 paramoF0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield x60 : Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Face;
/*    */     //   4: iload_1
/*    */     //   5: invokevirtual HK0 : (I)I
/*    */     //   8: ifne -> 19
/*    */     //   11: iload_1
/*    */     //   12: ifeq -> 19
/*    */     //   15: iconst_1
/*    */     //   16: goto -> 20
/*    */     //   19: iconst_0
/*    */     //   20: ifeq -> 25
/*    */     //   23: aconst_null
/*    */     //   24: areturn
/*    */     //   25: iconst_0
/*    */     //   26: istore #7
/*    */     //   28: getstatic f/TX.Ca0 : [I
/*    */     //   31: aload_3
/*    */     //   32: getfield Io : Lf/pD0;
/*    */     //   35: invokevirtual ordinal : ()I
/*    */     //   38: iaload
/*    */     //   39: tableswitch default -> 80, 1 -> 124, 2 -> 117, 3 -> 111, 4 -> 104, 5 -> 97, 6 -> 90, 7 -> 83
/*    */     //   80: goto -> 127
/*    */     //   83: ldc 131104
/*    */     //   85: istore #7
/*    */     //   87: goto -> 127
/*    */     //   90: bipush #32
/*    */     //   92: istore #7
/*    */     //   94: goto -> 127
/*    */     //   97: ldc 65568
/*    */     //   99: istore #7
/*    */     //   101: goto -> 127
/*    */     //   104: ldc 131072
/*    */     //   106: istore #7
/*    */     //   108: goto -> 127
/*    */     //   111: iconst_0
/*    */     //   112: istore #7
/*    */     //   114: goto -> 127
/*    */     //   117: ldc 65536
/*    */     //   119: istore #7
/*    */     //   121: goto -> 127
/*    */     //   124: iconst_2
/*    */     //   125: istore #7
/*    */     //   127: aload_0
/*    */     //   128: getfield x60 : Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Face;
/*    */     //   131: iload_1
/*    */     //   132: iload #7
/*    */     //   134: invokevirtual UD0 : (II)Z
/*    */     //   137: ifne -> 142
/*    */     //   140: aconst_null
/*    */     //   141: areturn
/*    */     //   142: aload_3
/*    */     //   143: aload_0
/*    */     //   144: getfield x60 : Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Face;
/*    */     //   147: invokevirtual kT : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$GlyphSlot;
/*    */     //   150: dup
/*    */     //   151: astore #7
/*    */     //   153: invokevirtual LpT5 : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Glyph;
/*    */     //   156: astore #8
/*    */     //   158: getfield Iz0 : Z
/*    */     //   161: ifeq -> 170
/*    */     //   164: iconst_2
/*    */     //   165: istore #9
/*    */     //   167: goto -> 173
/*    */     //   170: iconst_0
/*    */     //   171: istore #9
/*    */     //   173: aload #8
/*    */     //   175: dup
/*    */     //   176: iload #9
/*    */     //   178: invokevirtual coN : (I)V
/*    */     //   181: invokevirtual TR : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Bitmap;
/*    */     //   184: dup
/*    */     //   185: dup
/*    */     //   186: astore #9
/*    */     //   188: aload_3
/*    */     //   189: dup
/*    */     //   190: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   193: astore #10
/*    */     //   195: getfield Wh : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   198: astore #11
/*    */     //   200: getfield ic : F
/*    */     //   203: fstore #12
/*    */     //   205: aload #10
/*    */     //   207: aload #11
/*    */     //   209: fload #12
/*    */     //   211: invokevirtual hI0 : (Lf/Uc;Lcom/badlogic/gdx/graphics/Color;F)Lf/ZH;
/*    */     //   214: astore #11
/*    */     //   216: invokevirtual V3 : ()I
/*    */     //   219: ifeq -> 788
/*    */     //   222: aload #9
/*    */     //   224: invokevirtual qr0 : ()I
/*    */     //   227: ifeq -> 788
/*    */     //   230: aload_3
/*    */     //   231: getfield hj : F
/*    */     //   234: fconst_0
/*    */     //   235: fcmpl
/*    */     //   236: ifle -> 384
/*    */     //   239: aload_3
/*    */     //   240: aload #7
/*    */     //   242: aload #8
/*    */     //   244: dup
/*    */     //   245: invokevirtual qo0 : ()I
/*    */     //   248: istore #12
/*    */     //   250: invokevirtual zI : ()I
/*    */     //   253: istore #13
/*    */     //   255: invokevirtual LpT5 : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Glyph;
/*    */     //   258: dup
/*    */     //   259: astore #14
/*    */     //   261: aload #4
/*    */     //   263: invokevirtual W90 : (Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Stroker;)V
/*    */     //   266: getfield Iz0 : Z
/*    */     //   269: ifeq -> 278
/*    */     //   272: iconst_2
/*    */     //   273: istore #4
/*    */     //   275: goto -> 281
/*    */     //   278: iconst_0
/*    */     //   279: istore #4
/*    */     //   281: aload_3
/*    */     //   282: aload #14
/*    */     //   284: iload #12
/*    */     //   286: aload #14
/*    */     //   288: iload #13
/*    */     //   290: aload #14
/*    */     //   292: dup
/*    */     //   293: iload #4
/*    */     //   295: invokevirtual coN : (I)V
/*    */     //   298: invokevirtual zI : ()I
/*    */     //   301: isub
/*    */     //   302: istore #4
/*    */     //   304: invokevirtual qo0 : ()I
/*    */     //   307: isub
/*    */     //   308: ineg
/*    */     //   309: istore #12
/*    */     //   311: invokevirtual TR : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$Bitmap;
/*    */     //   314: aload #10
/*    */     //   316: aload_3
/*    */     //   317: dup
/*    */     //   318: getfield eh : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   321: astore #10
/*    */     //   323: getfield lx : F
/*    */     //   326: aload #10
/*    */     //   328: swap
/*    */     //   329: invokevirtual hI0 : (Lf/Uc;Lcom/badlogic/gdx/graphics/Color;F)Lf/ZH;
/*    */     //   332: astore #10
/*    */     //   334: iconst_0
/*    */     //   335: istore #13
/*    */     //   337: getfield Ma : I
/*    */     //   340: istore #15
/*    */     //   342: iload #13
/*    */     //   344: iload #15
/*    */     //   346: if_icmpge -> 366
/*    */     //   349: aload #10
/*    */     //   351: aload #11
/*    */     //   353: iload #4
/*    */     //   355: iload #12
/*    */     //   357: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   360: iinc #13, 1
/*    */     //   363: goto -> 342
/*    */     //   366: aload #8
/*    */     //   368: aload #11
/*    */     //   370: invokevirtual dispose : ()V
/*    */     //   373: invokevirtual dispose : ()V
/*    */     //   376: aload #10
/*    */     //   378: aload #14
/*    */     //   380: astore #8
/*    */     //   382: astore #11
/*    */     //   384: aload_3
/*    */     //   385: getfield Lp : I
/*    */     //   388: dup
/*    */     //   389: istore #4
/*    */     //   391: ifne -> 445
/*    */     //   394: aload_3
/*    */     //   395: getfield YA : I
/*    */     //   398: ifeq -> 404
/*    */     //   401: goto -> 445
/*    */     //   404: aload_3
/*    */     //   405: getfield hj : F
/*    */     //   408: fconst_0
/*    */     //   409: fcmpl
/*    */     //   410: ifne -> 788
/*    */     //   413: aload_3
/*    */     //   414: iconst_0
/*    */     //   415: istore #4
/*    */     //   417: getfield Ma : I
/*    */     //   420: iconst_1
/*    */     //   421: isub
/*    */     //   422: istore #10
/*    */     //   424: iload #4
/*    */     //   426: iload #10
/*    */     //   428: if_icmpge -> 788
/*    */     //   431: aload #11
/*    */     //   433: dup
/*    */     //   434: iconst_0
/*    */     //   435: iconst_0
/*    */     //   436: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   439: iinc #4, 1
/*    */     //   442: goto -> 424
/*    */     //   445: aload_3
/*    */     //   446: dup
/*    */     //   447: dup2
/*    */     //   448: iload #4
/*    */     //   450: aload #11
/*    */     //   452: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   455: dup
/*    */     //   456: getfield ju : I
/*    */     //   459: istore #4
/*    */     //   461: getfield Og0 : I
/*    */     //   464: istore #10
/*    */     //   466: iconst_0
/*    */     //   467: invokestatic max : (II)I
/*    */     //   470: istore #12
/*    */     //   472: getfield YA : I
/*    */     //   475: iconst_0
/*    */     //   476: invokestatic max : (II)I
/*    */     //   479: istore #13
/*    */     //   481: getfield Lp : I
/*    */     //   484: invokestatic abs : (I)I
/*    */     //   487: iload #4
/*    */     //   489: iadd
/*    */     //   490: istore #14
/*    */     //   492: getfield YA : I
/*    */     //   495: invokestatic abs : (I)I
/*    */     //   498: iload #10
/*    */     //   500: iadd
/*    */     //   501: istore #15
/*    */     //   503: new f/ZH
/*    */     //   506: dup
/*    */     //   507: astore #16
/*    */     //   509: iload #14
/*    */     //   511: aload #11
/*    */     //   513: invokevirtual TU : ()Lf/Uc;
/*    */     //   516: iload #15
/*    */     //   518: swap
/*    */     //   519: invokespecial <init> : (IILf/Uc;)V
/*    */     //   522: getfield m5 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   525: dup
/*    */     //   526: astore #15
/*    */     //   528: getfield a : F
/*    */     //   531: dup
/*    */     //   532: fstore #17
/*    */     //   534: fconst_0
/*    */     //   535: fcmpl
/*    */     //   536: ifeq -> 727
/*    */     //   539: aload #16
/*    */     //   541: aload #11
/*    */     //   543: aload #15
/*    */     //   545: dup
/*    */     //   546: dup
/*    */     //   547: getfield r : F
/*    */     //   550: ldc_w 255.0
/*    */     //   553: fmul
/*    */     //   554: f2i
/*    */     //   555: i2b
/*    */     //   556: istore #15
/*    */     //   558: getfield g : F
/*    */     //   561: ldc_w 255.0
/*    */     //   564: fmul
/*    */     //   565: f2i
/*    */     //   566: i2b
/*    */     //   567: istore #18
/*    */     //   569: getfield b : F
/*    */     //   572: ldc_w 255.0
/*    */     //   575: fmul
/*    */     //   576: f2i
/*    */     //   577: i2b
/*    */     //   578: istore #19
/*    */     //   580: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
/*    */     //   583: astore #20
/*    */     //   585: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
/*    */     //   588: astore #21
/*    */     //   590: iconst_0
/*    */     //   591: istore #22
/*    */     //   593: iload #22
/*    */     //   595: iload #10
/*    */     //   597: if_icmpge -> 727
/*    */     //   600: iload #22
/*    */     //   602: iload #13
/*    */     //   604: iadd
/*    */     //   605: iload #14
/*    */     //   607: imul
/*    */     //   608: iload #12
/*    */     //   610: iadd
/*    */     //   611: istore #23
/*    */     //   613: iconst_0
/*    */     //   614: istore #24
/*    */     //   616: iload #24
/*    */     //   618: iload #4
/*    */     //   620: if_icmpge -> 721
/*    */     //   623: aload #20
/*    */     //   625: iload #4
/*    */     //   627: iload #22
/*    */     //   629: imul
/*    */     //   630: iload #24
/*    */     //   632: iadd
/*    */     //   633: iconst_4
/*    */     //   634: imul
/*    */     //   635: iconst_3
/*    */     //   636: iadd
/*    */     //   637: invokevirtual get : (I)B
/*    */     //   640: dup
/*    */     //   641: istore #25
/*    */     //   643: ifne -> 649
/*    */     //   646: goto -> 715
/*    */     //   649: aload #21
/*    */     //   651: iload #25
/*    */     //   653: aload #21
/*    */     //   655: iload #23
/*    */     //   657: iload #24
/*    */     //   659: iadd
/*    */     //   660: iconst_4
/*    */     //   661: imul
/*    */     //   662: dup
/*    */     //   663: istore #25
/*    */     //   665: aload #21
/*    */     //   667: iload #25
/*    */     //   669: aload #21
/*    */     //   671: iload #25
/*    */     //   673: iload #15
/*    */     //   675: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
/*    */     //   678: pop
/*    */     //   679: iconst_1
/*    */     //   680: iadd
/*    */     //   681: iload #18
/*    */     //   683: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
/*    */     //   686: pop
/*    */     //   687: iconst_2
/*    */     //   688: iadd
/*    */     //   689: iload #19
/*    */     //   691: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
/*    */     //   694: pop
/*    */     //   695: iinc #25, 3
/*    */     //   698: sipush #255
/*    */     //   701: iand
/*    */     //   702: i2f
/*    */     //   703: fload #17
/*    */     //   705: fmul
/*    */     //   706: f2i
/*    */     //   707: i2b
/*    */     //   708: iload #25
/*    */     //   710: swap
/*    */     //   711: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
/*    */     //   714: pop
/*    */     //   715: iinc #24, 1
/*    */     //   718: goto -> 616
/*    */     //   721: iinc #22, 1
/*    */     //   724: goto -> 593
/*    */     //   727: aload_3
/*    */     //   728: iconst_0
/*    */     //   729: istore #4
/*    */     //   731: getfield Ma : I
/*    */     //   734: istore #10
/*    */     //   736: iload #4
/*    */     //   738: iload #10
/*    */     //   740: if_icmpge -> 779
/*    */     //   743: aload #16
/*    */     //   745: aload #11
/*    */     //   747: aload_3
/*    */     //   748: dup
/*    */     //   749: getfield Lp : I
/*    */     //   752: ineg
/*    */     //   753: iconst_0
/*    */     //   754: invokestatic max : (II)I
/*    */     //   757: istore #12
/*    */     //   759: getfield YA : I
/*    */     //   762: ineg
/*    */     //   763: iconst_0
/*    */     //   764: invokestatic max : (II)I
/*    */     //   767: iload #12
/*    */     //   769: swap
/*    */     //   770: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   773: iinc #4, 1
/*    */     //   776: goto -> 736
/*    */     //   779: aload #11
/*    */     //   781: invokevirtual dispose : ()V
/*    */     //   784: aload #16
/*    */     //   786: astore #11
/*    */     //   788: aload_3
/*    */     //   789: aload #7
/*    */     //   791: invokevirtual MG : ()Lcom/badlogic/gdx/graphics/g2d/freetype/FreeType$GlyphMetrics;
/*    */     //   794: astore #4
/*    */     //   796: new f/Jk0
/*    */     //   799: dup
/*    */     //   800: astore #7
/*    */     //   802: aload #8
/*    */     //   804: aload #7
/*    */     //   806: dup
/*    */     //   807: aload #11
/*    */     //   809: aload #7
/*    */     //   811: iload_1
/*    */     //   812: aload #7
/*    */     //   814: invokespecial <init> : ()V
/*    */     //   817: putfield xU : I
/*    */     //   820: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   823: dup
/*    */     //   824: astore_1
/*    */     //   825: getfield ju : I
/*    */     //   828: putfield zq : I
/*    */     //   831: aload_1
/*    */     //   832: getfield Og0 : I
/*    */     //   835: putfield h50 : I
/*    */     //   838: invokevirtual zI : ()I
/*    */     //   841: putfield eJ : I
/*    */     //   844: getfield mV : Z
/*    */     //   847: ifeq -> 868
/*    */     //   850: aload #7
/*    */     //   852: aload #8
/*    */     //   854: invokevirtual qo0 : ()I
/*    */     //   857: ineg
/*    */     //   858: fload #5
/*    */     //   860: f2i
/*    */     //   861: iadd
/*    */     //   862: putfield Sx0 : I
/*    */     //   865: goto -> 888
/*    */     //   868: aload #7
/*    */     //   870: dup
/*    */     //   871: getfield h50 : I
/*    */     //   874: aload #8
/*    */     //   876: invokevirtual qo0 : ()I
/*    */     //   879: isub
/*    */     //   880: ineg
/*    */     //   881: fload #5
/*    */     //   883: f2i
/*    */     //   884: isub
/*    */     //   885: putfield Sx0 : I
/*    */     //   888: aload_0
/*    */     //   889: aload #7
/*    */     //   891: aload #4
/*    */     //   893: invokevirtual TI : ()I
/*    */     //   896: invokestatic Xx0 : (I)I
/*    */     //   899: aload_3
/*    */     //   900: getfield hj : F
/*    */     //   903: f2i
/*    */     //   904: iadd
/*    */     //   905: aload_3
/*    */     //   906: getfield Q60 : I
/*    */     //   909: iadd
/*    */     //   910: putfield Ek : I
/*    */     //   913: getfield Gq0 : Z
/*    */     //   916: ifeq -> 1058
/*    */     //   919: getstatic com/badlogic/gdx/graphics/Color.CLEAR : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   922: dup
/*    */     //   923: astore_0
/*    */     //   924: aload #9
/*    */     //   926: aload #11
/*    */     //   928: dup
/*    */     //   929: aload_0
/*    */     //   930: invokevirtual Np : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   933: invokevirtual gc : ()V
/*    */     //   936: invokevirtual kz0 : ()Ljava/nio/ByteBuffer;
/*    */     //   939: astore_0
/*    */     //   940: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   943: invokevirtual toIntBits : ()I
/*    */     //   946: istore_1
/*    */     //   947: invokevirtual toIntBits : ()I
/*    */     //   950: istore #4
/*    */     //   952: iconst_0
/*    */     //   953: istore #5
/*    */     //   955: iload #5
/*    */     //   957: aload #7
/*    */     //   959: getfield h50 : I
/*    */     //   962: if_icmpge -> 1058
/*    */     //   965: aload #9
/*    */     //   967: invokevirtual Qe0 : ()I
/*    */     //   970: iload #5
/*    */     //   972: imul
/*    */     //   973: istore #10
/*    */     //   975: iconst_0
/*    */     //   976: istore #12
/*    */     //   978: iload #12
/*    */     //   980: aload #7
/*    */     //   982: getfield zq : I
/*    */     //   985: aload #7
/*    */     //   987: getfield eJ : I
/*    */     //   990: iadd
/*    */     //   991: if_icmpge -> 1052
/*    */     //   994: aload_0
/*    */     //   995: iload #12
/*    */     //   997: bipush #8
/*    */     //   999: idiv
/*    */     //   1000: iload #10
/*    */     //   1002: iadd
/*    */     //   1003: invokevirtual get : (I)B
/*    */     //   1006: iload #12
/*    */     //   1008: bipush #8
/*    */     //   1010: irem
/*    */     //   1011: bipush #7
/*    */     //   1013: swap
/*    */     //   1014: isub
/*    */     //   1015: iushr
/*    */     //   1016: iconst_1
/*    */     //   1017: iand
/*    */     //   1018: iconst_1
/*    */     //   1019: if_icmpne -> 1028
/*    */     //   1022: iload_1
/*    */     //   1023: istore #13
/*    */     //   1025: goto -> 1032
/*    */     //   1028: iload #4
/*    */     //   1030: istore #13
/*    */     //   1032: aload #11
/*    */     //   1034: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   1037: iload #12
/*    */     //   1039: iload #5
/*    */     //   1041: iload #13
/*    */     //   1043: invokevirtual YO : (III)V
/*    */     //   1046: iinc #12, 1
/*    */     //   1049: goto -> 978
/*    */     //   1052: iinc #5, 1
/*    */     //   1055: goto -> 955
/*    */     //   1058: aload_3
/*    */     //   1059: aload #7
/*    */     //   1061: dup
/*    */     //   1062: dup
/*    */     //   1063: aload #6
/*    */     //   1065: dup
/*    */     //   1066: dup2
/*    */     //   1067: monitorenter
/*    */     //   1068: aconst_null
/*    */     //   1069: aload #11
/*    */     //   1071: invokevirtual EI0 : (Ljava/lang/String;Lf/ZH;)Lf/cx0;
/*    */     //   1074: astore_0
/*    */     //   1075: monitorexit
/*    */     //   1076: getfield dA : Lf/fQ;
/*    */     //   1079: getfield Z8 : I
/*    */     //   1082: iconst_1
/*    */     //   1083: isub
/*    */     //   1084: dup
/*    */     //   1085: istore_1
/*    */     //   1086: putfield R80 : I
/*    */     //   1089: aload_0
/*    */     //   1090: getfield dA : F
/*    */     //   1093: f2i
/*    */     //   1094: putfield uR : I
/*    */     //   1097: aload_0
/*    */     //   1098: getfield zA0 : F
/*    */     //   1101: f2i
/*    */     //   1102: putfield YI : I
/*    */     //   1105: getfield gJ : Z
/*    */     //   1108: ifeq -> 1146
/*    */     //   1111: aload_2
/*    */     //   1112: getfield B0 : Lf/fQ;
/*    */     //   1115: dup
/*    */     //   1116: astore_0
/*    */     //   1117: ifnull -> 1146
/*    */     //   1120: aload_0
/*    */     //   1121: getfield Z8 : I
/*    */     //   1124: iload_1
/*    */     //   1125: if_icmpgt -> 1146
/*    */     //   1128: aload #6
/*    */     //   1130: aload_3
/*    */     //   1131: dup
/*    */     //   1132: getfield uX : Lf/cu0;
/*    */     //   1135: astore_1
/*    */     //   1136: getfield IS : Lf/cu0;
/*    */     //   1139: astore_2
/*    */     //   1140: aload_0
/*    */     //   1141: aload_1
/*    */     //   1142: aload_2
/*    */     //   1143: invokevirtual LK : (Lf/fQ;Lf/cu0;Lf/cu0;)V
/*    */     //   1146: aload #7
/*    */     //   1148: aload #8
/*    */     //   1150: aload #11
/*    */     //   1152: invokevirtual dispose : ()V
/*    */     //   1155: invokevirtual dispose : ()V
/*    */     //   1158: areturn
/*    */     //   1159: aload #6
/*    */     //   1161: monitorexit
/*    */     //   1162: athrow
/*    */     //   1163: pop
/*    */     //   1164: aload #8
/*    */     //   1166: invokevirtual dispose : ()V
/*    */     //   1169: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   1172: new java/lang/StringBuilder
/*    */     //   1175: dup
/*    */     //   1176: invokespecial <init> : ()V
/*    */     //   1179: ldc_w 'Couldn't render char: '
/*    */     //   1182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1185: iload_1
/*    */     //   1186: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   1189: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1192: ldc_w 'FreeTypeFontGenerator'
/*    */     //   1195: swap
/*    */     //   1196: invokevirtual HC : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   1199: aconst_null
/*    */     //   1200: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 28
/*    */     //   #2	-> 128
/*    */     //   #3	-> 144
/*    */     //   #4	-> 452
/*    */     //   #5	-> 456
/*    */     //   #6	-> 461
/*    */     //   #7	-> 467
/*    */     //   #8	-> 820
/*    */     //   #9	-> 825
/*    */     //   #10	-> 828
/*    */     //   #11	-> 832
/*    */     //   #12	-> 835
/*    */     //   #13	-> 1034
/*    */     //   #14	-> 1067
/*    */     //   #15	-> 1071
/*    */     //   #16	-> 1076
/*    */     //   #17	-> 1079
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   158	161	1163	f/JU
/*    */     //   173	181	1163	f/JU
/*    */     //   1069	1074	1159	finally
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     return this.ZY;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     this.x60.dispose();
/*    */     this.Z1.dispose();
/*    */   }
/*    */   
/*    */   public final boolean Nj0() {
/*    */     int i = 32;
/*    */     if (((i = this.x60.HB()) & 0x2) == 2 && (i & 0x10) == 16 && this.x60.UD0(i, 32) && this.x60.kT().uM() == 1651078259)
/*    */       this.Gq0 = true; 
/*    */     return this.Gq0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g2d/freetype/Gf.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */