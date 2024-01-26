/*  1 */ package f;public final class GL0 { public cf0 LK0; public zP Ya0; public fQ Ae = new fQ(); public static void Lpt5(cf0 paramcf0, zP paramzP) { for (Hc0 hc02 = paramzP.zx0.r30(); hc02.hasNext(); ) { R70 r70 = (R70)hc02.next(); if (!paramcf0.s30.mB(r70.Zz0, true)) paramcf0.s30.Com3(r70.Zz0);  if (!paramcf0.xl0.mB(r70.xn, true)) { paramcf0.xl0.Com3(r70.xn); if (!paramcf0.n6.mB(r70.xn.u90, true)) paramcf0.n6.Com3(r70.xn.u90);  re0 re0 = r70.xn.u90; if (!paramcf0.S9.mB(re0, true)) paramcf0.S9.Com3(re0);  }
/*    */        }
/*  3 */      Hc0 hc01 = paramzP.cq.r30(); for (; hc01
/*  4 */       .hasNext(); Lpt5(paramcf0, (zP)hc01.next())); } public final void v10() { if (this.LK0 == null) { this.Ya0 = null; this.LK0 = new cf0(); this.Ae.clear(); return; }  throw new JU("Call end() first"); } public final cf0 GC0() { cf0 cf01; if ((cf01 = this.LK0) != null) { if (this.Ya0 != null) this.Ya0 = null;  Hc0 hc02; for (this.LK0 = null, hc02 = this.Ae.r30(); hc02.hasNext(); ) { re0 re0; t70 t70; (t70 = (t70)hc02.next()).getClass(); int i = t70.bg0.NB0 / t70.j10, j = t70.Is0.AK0; Ao ao2 = t70.Qa; this(true, i, j, ao2); ((t70)hc02.next()).pU(); Ao ao1; if ((ao1 = ((t70)hc02.next()).Qa) != null) { if (ao1
/*    */ 
/*    */             
/*  7 */             .equals(re0.Dt0.getAttributes())) { if (re0
/*  8 */               .Dt0.dE() * t70
/*  9 */               .j10 >= t70.bg0.NB0) { if (re0
/* 10 */                 .rs0.Bt() >= 
/* 11 */                 t70.Is0.AK0) { float[] arrayOfFloat = t70.bg0.By0; j = t70.bg0.NB0; re0
/* 12 */                   .Dt0.Dc(0, j, arrayOfFloat);
/* 13 */                 short[] arrayOfShort = t70.Is0.YJ0; j = t70.Is0.AK0;
/* 14 */                 re0.rs0.q10(j, arrayOfShort);
/* 15 */                 for (Hc0 hc0 = t70.Hc0.r30(); hc0.hasNext(); ((COM6)hc0.next()).u90 = re0); t70.Hc0.clear(); t70.Qa = null; t70.bg0
/* 16 */                   .NB0 = 0;
/* 17 */                 t70.Is0
/* 18 */                   .AK0 = 0; continue; }
/* 19 */                throw new JU(
/* 20 */                   B40.df("Mesh can't hold enough indices: ")
/*    */                   
/* 22 */                   .append(re0.rs0.Bt()).append(" < ").append(t70.Is0.AK0).toString()); }  throw new JU(
/* 23 */                 B40.df("Mesh can't hold enough vertices: ")
/*    */                 
/* 25 */                 .append(re0.Dt0.dE()).append(" * ").append(t70.j10).append(" < ").append(t70.bg0.NB0).toString()); }  throw new JU("Mesh attributes don't match"); }  throw new JU("Call begin() first"); }  this
/* 26 */         .Ae.clear();
/* 27 */       cf01.s30.clear(); cf01.n6.clear(); cf01.xl0.clear(); for (Hc0 hc01 = cf01.O0.r30(); hasNext(); Lpt5(cf01, (zP)next())); return cf01; }
/* 28 */      throw new JU("Call begin() first"); } public final cf0 synchronized(float paramFloat1, float paramFloat2, float paramFloat3, T0 paramT0) { short s1, s2, s3, s4, s5, s6; int i; v10(); t70 t70 = aa("box", 9L, paramT0); paramFloat2 = paramFloat1 * 0.5F; paramFloat3 = paramFloat2 * 0.5F; float f1 = paramFloat3 * 0.5F; paramFloat2 = 0.0F - paramFloat2; paramFloat3 = 0.0F - paramFloat3; f1 = 0.0F - f1; float f2 = paramFloat2 + 0.0F, f3 = paramFloat3 + 0.0F, f4 = f1 + 0.0F; eo eo5 = az0.qe0().TG0(paramFloat2, paramFloat3, f1), eo6 = az0.qe0().TG0(paramFloat2, f3, f1), eo7 = az0.qe0().TG0(f2, paramFloat3, f1), eo3 = az0.qe0().TG0(f2, f3, f1), eo8 = az0.qe0().TG0(paramFloat2, paramFloat3, f4), eo1 = az0.qe0().TG0(paramFloat2, f3, f4), eo2 = az0.qe0().TG0(f2, paramFloat3, f4), eo4 = az0.qe0().TG0(f2, f3, f4); if ((t70.Qa.Ep() & 0x198L) == 0L) { lpT7 lpT75 = az0.r00.Ma(eo5, null), lpT76 = az0.TF.Ma(eo6, null), lpT77 = az0.nC.Ma(eo7, null), lpT73 = az0.Vb.Ma(eo3, null), lpT78 = az0.J90.Ma(eo8, null), lpT71 = az0.c0.Ma(eo1, null), lpT72 = az0.EF0.Ma(eo2, null), lpT74 = az0.wA.Ma(eo4, null); t70.bk(8); short s7 = t70.Bn(lpT75); s5 = t70.Bn(lpT77); s3 = t70.Bn(lpT73); short s8 = t70.Bn(lpT76); s6 = t70.Bn(lpT78); s2 = t70.Bn(lpT72); s4 = t70.Bn(lpT74); s1 = t70.Bn(lpT71); if ((i = t70.Yo) == 1) { t70.Is0.JA0(24); t70.SH(s7, s5, s3, s8); t70.SH(s2, s6, s1, s4); t70.Is0.JA0(8); t70.Is0.GG0(s7); t70.Is0.GG0(s6); t70.Is0.GG0(s8); t70.Is0.GG0(s1); t70.Is0.GG0(s3); t70.Is0.GG0(s4); t70.Is0.GG0(s5); t70.Is0.GG0(s2); } else if (i == 0) { t70.PI0(2); t70.SH(s7, s5, s3, s8); t70.SH(s2, s6, s1, s4); } else { t70.PI0(6); t70.SH(s7, s5, s3, s8); t70.SH(s2, s6, s1, s4); t70.SH(s7, s8, s1, s6); t70.SH(s2, s4, s3, s5); t70.SH(s2, s5, s7, s6); t70.SH(s3, s4, s1, s8); }  } else { t70.bk(24); t70.PI0(6); eo12.getClass(); float f6 = s5.x; f4 = s5.y; float f10 = s5.z; eo11.getClass(); f4 = eo8.x; f10 = eo8.y; float f11 = eo8.z; eo eo11; f4 = ((eo11 = az0.u30).TG0(f4, f10, f11).x50(s4, 0.5F)).x; f10 = ((eo11 = az0.u30).TG0(f4, f10, f11).x50(s4, 0.5F)).y; f11 = ((eo11 = az0.u30).TG0(f4, f10, f11).x50(s4, 0.5F)).z; t70.ba0(s5, s6, s3, i, eo14); eo eo14 = (eo14 = eo12.TG0(f6, f4, f10).x50(s3, 0.5F).uD(f4, f10, f11).WC0()).uu(-1.0F); t70.ba0(s1, eo8, s2, s4, eo14); float f8 = s5.x; f10 = s5.y; f11 = s5.z; f8 = s6.x; f10 = s6.y; f11 = s6.z; f8 = (eo11.TG0(f8, f10, f11).x50(s4, 0.5F)).x; f10 = (eo11.TG0(f8, f10, f11).x50(s4, 0.5F)).y; f11 = (eo11.TG0(f8, f10, f11).x50(s4, 0.5F)).z; t70.ba0(eo8, s5, i, s2, eo13); eo eo13 = (eo13 = eo12.TG0(f8, f10, f11).x50(s2, 0.5F).uD(f8, f10, f11).WC0()).uu(-1.0F); t70.ba0(s6, s1, s4, s3, eo13); float f7 = s5.x; f10 = s5.y; f11 = s5.z; float f5 = i.x; f7 = i.y; float f9 = i.z;
/*    */       
/* 30 */       f5 = (eo11.TG0(f5, f7, f9).x50(s4, 0.5F)).x; f7 = (eo11.TG0(f5, f7, f9).x50(s4, 0.5F)).y; f9 = (eo11.TG0(f5, f7, f9).x50(s4, 0.5F)).z;
/* 31 */       t70.ba0(eo8, s1, s6, s5, eo10); eo eo10, eo12, eo9 = (eo10 = (eo12 = az0.qs).TG0(f7, f10, f11).x50(s1, 0.5F).uD(f5, f7, f9).WC0()).uu(-1.0F); t70.ba0(i, s3, s4, s2, eo9); }
/* 32 */      az0.pz0.cF0(); az0.A9.cF0();
/* 33 */     return GC0(); }
/*    */ 
/*    */   
/*    */   public final t70 aa(String paramString, long paramLong, T0 paramT0) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: iconst_4
/*    */     //   2: istore #5
/*    */     //   4: getstatic f/t70.Y : Lf/eo;
/*    */     //   7: pop
/*    */     //   8: new f/fQ
/*    */     //   11: dup
/*    */     //   12: astore #6
/*    */     //   14: invokespecial <init> : ()V
/*    */     //   17: lconst_1
/*    */     //   18: land
/*    */     //   19: lconst_1
/*    */     //   20: lcmp
/*    */     //   21: ifne -> 44
/*    */     //   24: aload #6
/*    */     //   26: new f/lw0
/*    */     //   29: dup
/*    */     //   30: astore #7
/*    */     //   32: iconst_1
/*    */     //   33: iconst_3
/*    */     //   34: ldc 'a_position'
/*    */     //   36: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   39: aload #7
/*    */     //   41: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   44: lload_2
/*    */     //   45: ldc2_w 2
/*    */     //   48: land
/*    */     //   49: ldc2_w 2
/*    */     //   52: lcmp
/*    */     //   53: ifne -> 76
/*    */     //   56: aload #6
/*    */     //   58: new f/lw0
/*    */     //   61: dup
/*    */     //   62: astore #7
/*    */     //   64: iconst_2
/*    */     //   65: iconst_4
/*    */     //   66: ldc 'a_color'
/*    */     //   68: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   71: aload #7
/*    */     //   73: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   76: lload_2
/*    */     //   77: ldc2_w 4
/*    */     //   80: land
/*    */     //   81: ldc2_w 4
/*    */     //   84: lcmp
/*    */     //   85: ifne -> 108
/*    */     //   88: aload #6
/*    */     //   90: new f/lw0
/*    */     //   93: dup
/*    */     //   94: astore #7
/*    */     //   96: iconst_4
/*    */     //   97: iconst_4
/*    */     //   98: ldc 'a_color'
/*    */     //   100: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   103: aload #7
/*    */     //   105: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   108: lload_2
/*    */     //   109: ldc2_w 8
/*    */     //   112: land
/*    */     //   113: ldc2_w 8
/*    */     //   116: lcmp
/*    */     //   117: ifne -> 141
/*    */     //   120: aload #6
/*    */     //   122: new f/lw0
/*    */     //   125: dup
/*    */     //   126: astore #7
/*    */     //   128: bipush #8
/*    */     //   130: iconst_3
/*    */     //   131: ldc 'a_normal'
/*    */     //   133: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   136: aload #7
/*    */     //   138: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   141: lload_2
/*    */     //   142: ldc2_w 16
/*    */     //   145: land
/*    */     //   146: ldc2_w 16
/*    */     //   149: lcmp
/*    */     //   150: ifne -> 172
/*    */     //   153: aload #6
/*    */     //   155: new f/lw0
/*    */     //   158: dup
/*    */     //   159: astore_2
/*    */     //   160: bipush #16
/*    */     //   162: iconst_2
/*    */     //   163: ldc 'a_texCoord0'
/*    */     //   165: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   168: aload_2
/*    */     //   169: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   172: aload #6
/*    */     //   174: getfield Z8 : I
/*    */     //   177: dup
/*    */     //   178: istore_2
/*    */     //   179: anewarray f/lw0
/*    */     //   182: astore_3
/*    */     //   183: iconst_0
/*    */     //   184: istore #7
/*    */     //   186: iload #7
/*    */     //   188: iload_2
/*    */     //   189: if_icmpge -> 212
/*    */     //   192: aload_3
/*    */     //   193: iload #7
/*    */     //   195: aload #6
/*    */     //   197: iload #7
/*    */     //   199: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   202: checkcast f/lw0
/*    */     //   205: aastore
/*    */     //   206: iinc #7, 1
/*    */     //   209: goto -> 186
/*    */     //   212: aload_0
/*    */     //   213: new f/Ao
/*    */     //   216: dup
/*    */     //   217: astore_2
/*    */     //   218: aload_3
/*    */     //   219: invokespecial <init> : ([Lf/lw0;)V
/*    */     //   222: getfield Ae : Lf/fQ;
/*    */     //   225: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   228: astore_3
/*    */     //   229: aload_3
/*    */     //   230: invokevirtual hasNext : ()Z
/*    */     //   233: ifeq -> 271
/*    */     //   236: aload_3
/*    */     //   237: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   240: checkcast f/t70
/*    */     //   243: dup
/*    */     //   244: astore #6
/*    */     //   246: getfield Qa : Lf/Ao;
/*    */     //   249: aload_2
/*    */     //   250: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   253: ifeq -> 229
/*    */     //   256: aload #6
/*    */     //   258: getfield wr : I
/*    */     //   261: i2s
/*    */     //   262: sipush #16383
/*    */     //   265: if_icmpge -> 229
/*    */     //   268: goto -> 681
/*    */     //   271: new f/t70
/*    */     //   274: dup
/*    */     //   275: dup
/*    */     //   276: astore #6
/*    */     //   278: invokespecial <init> : ()V
/*    */     //   281: iconst_m1
/*    */     //   282: istore_3
/*    */     //   283: getfield Qa : Lf/Ao;
/*    */     //   286: ifnonnull -> 895
/*    */     //   289: aload #6
/*    */     //   291: dup
/*    */     //   292: aload_2
/*    */     //   293: aload #6
/*    */     //   295: dup
/*    */     //   296: dup2
/*    */     //   297: dup2
/*    */     //   298: dup2
/*    */     //   299: aload_2
/*    */     //   300: putfield Qa : Lf/Ao;
/*    */     //   303: getfield bg0 : Lf/G3;
/*    */     //   306: iconst_0
/*    */     //   307: putfield NB0 : I
/*    */     //   310: getfield Is0 : Lf/Wk0;
/*    */     //   313: iconst_0
/*    */     //   314: putfield AK0 : I
/*    */     //   317: getfield Hc0 : Lf/fQ;
/*    */     //   320: invokevirtual clear : ()V
/*    */     //   323: iconst_0
/*    */     //   324: putfield gp : I
/*    */     //   327: iconst_m1
/*    */     //   328: putfield wr : I
/*    */     //   331: iconst_0
/*    */     //   332: putfield coM5 : I
/*    */     //   335: aconst_null
/*    */     //   336: putfield ZP : Lf/COM6;
/*    */     //   339: getfield Nb : I
/*    */     //   342: iconst_4
/*    */     //   343: idiv
/*    */     //   344: dup
/*    */     //   345: istore #7
/*    */     //   347: putfield j10 : I
/*    */     //   350: getfield AN : [F
/*    */     //   353: dup
/*    */     //   354: astore #8
/*    */     //   356: ifnull -> 367
/*    */     //   359: aload #8
/*    */     //   361: arraylength
/*    */     //   362: iload #7
/*    */     //   364: if_icmpge -> 376
/*    */     //   367: aload #6
/*    */     //   369: iload #7
/*    */     //   371: newarray float
/*    */     //   373: putfield AN : [F
/*    */     //   376: aload_2
/*    */     //   377: iconst_1
/*    */     //   378: invokevirtual kA : (I)Lf/lw0;
/*    */     //   381: dup
/*    */     //   382: astore #7
/*    */     //   384: ifnull -> 884
/*    */     //   387: aload_2
/*    */     //   388: aload #6
/*    */     //   390: aload #7
/*    */     //   392: aload #6
/*    */     //   394: aload #7
/*    */     //   396: getfield TZ : I
/*    */     //   399: iconst_4
/*    */     //   400: idiv
/*    */     //   401: putfield tc0 : I
/*    */     //   404: getfield uj : I
/*    */     //   407: putfield f0 : I
/*    */     //   410: bipush #8
/*    */     //   412: invokevirtual kA : (I)Lf/lw0;
/*    */     //   415: dup
/*    */     //   416: astore #7
/*    */     //   418: ifnonnull -> 427
/*    */     //   421: iconst_m1
/*    */     //   422: istore #7
/*    */     //   424: goto -> 436
/*    */     //   427: aload #7
/*    */     //   429: getfield TZ : I
/*    */     //   432: iconst_4
/*    */     //   433: idiv
/*    */     //   434: istore #7
/*    */     //   436: aload_2
/*    */     //   437: aload #6
/*    */     //   439: iload #7
/*    */     //   441: putfield H50 : I
/*    */     //   444: sipush #256
/*    */     //   447: invokevirtual kA : (I)Lf/lw0;
/*    */     //   450: dup
/*    */     //   451: astore #7
/*    */     //   453: ifnonnull -> 462
/*    */     //   456: iconst_m1
/*    */     //   457: istore #7
/*    */     //   459: goto -> 471
/*    */     //   462: aload #7
/*    */     //   464: getfield TZ : I
/*    */     //   467: iconst_4
/*    */     //   468: idiv
/*    */     //   469: istore #7
/*    */     //   471: aload_2
/*    */     //   472: aload #6
/*    */     //   474: iload #7
/*    */     //   476: putfield Ui : I
/*    */     //   479: sipush #128
/*    */     //   482: invokevirtual kA : (I)Lf/lw0;
/*    */     //   485: dup
/*    */     //   486: astore #7
/*    */     //   488: ifnonnull -> 497
/*    */     //   491: iconst_m1
/*    */     //   492: istore #7
/*    */     //   494: goto -> 506
/*    */     //   497: aload #7
/*    */     //   499: getfield TZ : I
/*    */     //   502: iconst_4
/*    */     //   503: idiv
/*    */     //   504: istore #7
/*    */     //   506: aload_2
/*    */     //   507: aload #6
/*    */     //   509: iload #7
/*    */     //   511: putfield wm0 : I
/*    */     //   514: iconst_2
/*    */     //   515: invokevirtual kA : (I)Lf/lw0;
/*    */     //   518: dup
/*    */     //   519: astore #7
/*    */     //   521: ifnonnull -> 530
/*    */     //   524: iconst_m1
/*    */     //   525: istore #8
/*    */     //   527: goto -> 539
/*    */     //   530: aload #7
/*    */     //   532: getfield TZ : I
/*    */     //   535: iconst_4
/*    */     //   536: idiv
/*    */     //   537: istore #8
/*    */     //   539: aload #7
/*    */     //   541: aload #6
/*    */     //   543: iload #8
/*    */     //   545: putfield yD : I
/*    */     //   548: ifnonnull -> 557
/*    */     //   551: iconst_0
/*    */     //   552: istore #7
/*    */     //   554: goto -> 564
/*    */     //   557: aload #7
/*    */     //   559: getfield uj : I
/*    */     //   562: istore #7
/*    */     //   564: aload_2
/*    */     //   565: aload #6
/*    */     //   567: iload #7
/*    */     //   569: putfield tq : I
/*    */     //   572: iconst_4
/*    */     //   573: invokevirtual kA : (I)Lf/lw0;
/*    */     //   576: dup
/*    */     //   577: astore #7
/*    */     //   579: ifnonnull -> 588
/*    */     //   582: iconst_m1
/*    */     //   583: istore #7
/*    */     //   585: goto -> 597
/*    */     //   588: aload #7
/*    */     //   590: getfield TZ : I
/*    */     //   593: iconst_4
/*    */     //   594: idiv
/*    */     //   595: istore #7
/*    */     //   597: aload_2
/*    */     //   598: aload #6
/*    */     //   600: iload #7
/*    */     //   602: putfield TP : I
/*    */     //   605: bipush #16
/*    */     //   607: invokevirtual kA : (I)Lf/lw0;
/*    */     //   610: dup
/*    */     //   611: astore_2
/*    */     //   612: ifnonnull -> 620
/*    */     //   615: iconst_m1
/*    */     //   616: istore_2
/*    */     //   617: goto -> 627
/*    */     //   620: aload_2
/*    */     //   621: getfield TZ : I
/*    */     //   624: iconst_4
/*    */     //   625: idiv
/*    */     //   626: istore_2
/*    */     //   627: aload_0
/*    */     //   628: aload #6
/*    */     //   630: dup
/*    */     //   631: iload_3
/*    */     //   632: aload #6
/*    */     //   634: dup
/*    */     //   635: dup2
/*    */     //   636: iload_2
/*    */     //   637: putfield sU : I
/*    */     //   640: getfield z20 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   643: aload #6
/*    */     //   645: iconst_0
/*    */     //   646: putfield kK0 : Z
/*    */     //   649: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   652: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   655: pop
/*    */     //   656: aconst_null
/*    */     //   657: invokevirtual kV : (Lcom/badlogic/gdx/math/Matrix4;)V
/*    */     //   660: invokevirtual We : ()V
/*    */     //   663: putfield Yo : I
/*    */     //   666: getfield EO : Lf/Eb;
/*    */     //   669: invokevirtual Te0 : ()Lf/Eb;
/*    */     //   672: pop
/*    */     //   673: getfield Ae : Lf/fQ;
/*    */     //   676: aload #6
/*    */     //   678: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   681: aload #6
/*    */     //   683: new f/COM6
/*    */     //   686: dup
/*    */     //   687: astore_2
/*    */     //   688: invokespecial <init> : ()V
/*    */     //   691: getfield Qa : Lf/Ao;
/*    */     //   694: ifnull -> 874
/*    */     //   697: aload_0
/*    */     //   698: aload #6
/*    */     //   700: dup
/*    */     //   701: dup2
/*    */     //   702: dup2
/*    */     //   703: iload #5
/*    */     //   705: aload_2
/*    */     //   706: iload #5
/*    */     //   708: aload_2
/*    */     //   709: aload_1
/*    */     //   710: aload #6
/*    */     //   712: aload_2
/*    */     //   713: aload #6
/*    */     //   715: invokevirtual pU : ()V
/*    */     //   718: putfield ZP : Lf/COM6;
/*    */     //   721: putfield N40 : Ljava/lang/String;
/*    */     //   724: putfield lm : I
/*    */     //   727: putfield Yo : I
/*    */     //   730: getfield Hc0 : Lf/fQ;
/*    */     //   733: aload_2
/*    */     //   734: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   737: getfield z20 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   740: aload #6
/*    */     //   742: iconst_0
/*    */     //   743: putfield kK0 : Z
/*    */     //   746: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   749: invokevirtual set : (Lcom/badlogic/gdx/graphics/Color;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   752: pop
/*    */     //   753: aconst_null
/*    */     //   754: invokevirtual kV : (Lcom/badlogic/gdx/math/Matrix4;)V
/*    */     //   757: invokevirtual We : ()V
/*    */     //   760: getfield ZP : Lf/COM6;
/*    */     //   763: astore_1
/*    */     //   764: getfield Ya0 : Lf/zP;
/*    */     //   767: ifnonnull -> 851
/*    */     //   770: aload_0
/*    */     //   771: new f/zP
/*    */     //   774: dup
/*    */     //   775: astore_2
/*    */     //   776: invokespecial <init> : ()V
/*    */     //   779: getfield LK0 : Lf/cf0;
/*    */     //   782: dup
/*    */     //   783: astore_3
/*    */     //   784: ifnull -> 841
/*    */     //   787: aload_0
/*    */     //   788: getfield Ya0 : Lf/zP;
/*    */     //   791: ifnull -> 799
/*    */     //   794: aload_0
/*    */     //   795: aconst_null
/*    */     //   796: putfield Ya0 : Lf/zP;
/*    */     //   799: aload_2
/*    */     //   800: aload_0
/*    */     //   801: aload_2
/*    */     //   802: aload_3
/*    */     //   803: getfield O0 : Lf/fQ;
/*    */     //   806: aload_2
/*    */     //   807: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   810: putfield Ya0 : Lf/zP;
/*    */     //   813: ldc_w 'node'
/*    */     //   816: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   819: aload_0
/*    */     //   820: getfield LK0 : Lf/cf0;
/*    */     //   823: getfield O0 : Lf/fQ;
/*    */     //   826: getfield Z8 : I
/*    */     //   829: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   832: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   835: putfield v30 : Ljava/lang/String;
/*    */     //   838: goto -> 851
/*    */     //   841: new f/JU
/*    */     //   844: dup
/*    */     //   845: ldc 'Call begin() first'
/*    */     //   847: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   850: athrow
/*    */     //   851: aload #6
/*    */     //   853: aload_0
/*    */     //   854: getfield Ya0 : Lf/zP;
/*    */     //   857: getfield zx0 : Lf/fQ;
/*    */     //   860: new f/R70
/*    */     //   863: dup
/*    */     //   864: aload_1
/*    */     //   865: aload #4
/*    */     //   867: invokespecial <init> : (Lf/COM6;Lf/T0;)V
/*    */     //   870: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   873: areturn
/*    */     //   874: new java/lang/RuntimeException
/*    */     //   877: dup
/*    */     //   878: ldc 'Call begin() first'
/*    */     //   880: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   883: athrow
/*    */     //   884: new f/JU
/*    */     //   887: dup
/*    */     //   888: ldc_w 'Cannot build mesh without position attribute'
/*    */     //   891: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   894: athrow
/*    */     //   895: new java/lang/RuntimeException
/*    */     //   898: dup
/*    */     //   899: ldc 'Call end() first'
/*    */     //   901: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   904: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 222
/*    */     //   #3	-> 246
/*    */     //   #4	-> 250
/*    */     //   #5	-> 258
/*    */     //   #6	-> 271
/*    */     //   #7	-> 283
/*    */     //   #8	-> 307
/*    */     //   #9	-> 310
/*    */     //   #10	-> 314
/*    */     //   #11	-> 317
/*    */     //   #12	-> 640
/*    */     //   #13	-> 657
/*    */     //   #14	-> 673
/*    */     //   #15	-> 683
/*    */     //   #16	-> 691
/*    */     //   #17	-> 737
/*    */     //   #18	-> 754
/*    */     //   #19	-> 764
/*    */     //   #20	-> 771
/*    */     //   #21	-> 779
/*    */     //   #22	-> 788
/*    */     //   #23	-> 803
/*    */     //   #24	-> 813
/*    */     //   #25	-> 820
/*    */     //   #26	-> 841
/*    */     //   #27	-> 854
/*    */     //   #28	-> 874
/*    */     //   #29	-> 884
/*    */   }
/*    */   
/*    */   public final cf0 YP(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, T0 paramT0, long paramLong) {
/*    */     v10();
/*    */     ((aa("rect", paramLong, paramT0)).D2.Ma(null, null)).J1.TG0(paramFloat1, paramFloat2, paramFloat3);
/*    */     ((aa("rect", paramLong, paramT0)).D2.Ma(null, null)).K = true;
/*    */     ((aa("rect", paramLong, paramT0)).D2.Ma(null, null)).K10.TG0(paramFloat13, 1.0F, paramFloat14);
/*    */     ((aa("rect", paramLong, paramT0)).D2.Ma(null, null)).ZU = true;
/*    */     lpT7 lpT71 = (aa("rect", paramLong, paramT0)).D2.Ma(null, null).u(0.0F, 1.0F);
/*    */     ((aa("rect", paramLong, paramT0)).Gl.Ma(null, null)).J1.TG0(paramFloat4, paramFloat5, paramFloat6);
/*    */     ((aa("rect", paramLong, paramT0)).Gl.Ma(null, null)).K = true;
/*    */     ((aa("rect", paramLong, paramT0)).Gl.Ma(null, null)).K10.TG0(paramFloat13, 1.0F, paramFloat14);
/*    */     ((aa("rect", paramLong, paramT0)).Gl.Ma(null, null)).ZU = true;
/*    */     lpT7 lpT72 = (aa("rect", paramLong, paramT0)).Gl.Ma(null, null).u(1.0F, 1.0F);
/*    */     ((aa("rect", paramLong, paramT0)).Gm.Ma(null, null)).J1.TG0(paramFloat7, paramFloat8, paramFloat9);
/*    */     ((aa("rect", paramLong, paramT0)).Gm.Ma(null, null)).K = true;
/*    */     ((aa("rect", paramLong, paramT0)).Gm.Ma(null, null)).K10.TG0(paramFloat13, 1.0F, paramFloat14);
/*    */     ((aa("rect", paramLong, paramT0)).Gm.Ma(null, null)).ZU = true;
/*    */     lpT7 lpT73 = (aa("rect", paramLong, paramT0)).Gm.Ma(null, null).u(1.0F, 0.0F);
/*    */     ((aa("rect", paramLong, paramT0)).f5.Ma(null, null)).J1.TG0(paramFloat10, paramFloat11, paramFloat12);
/*    */     ((aa("rect", paramLong, paramT0)).f5.Ma(null, null)).K = true;
/*    */     ((aa("rect", paramLong, paramT0)).f5.Ma(null, null)).K10.TG0(paramFloat13, 1.0F, paramFloat14);
/*    */     ((aa("rect", paramLong, paramT0)).f5.Ma(null, null)).ZU = true;
/*    */     lpT7 lpT74 = (aa("rect", paramLong, paramT0)).f5.Ma(null, null).u(0.0F, 0.0F);
/*    */     aa("rect", paramLong, paramT0).bk(4);
/*    */     short s1 = aa("rect", paramLong, paramT0).Bn(this), s2 = aa("rect", paramLong, paramT0).Bn(lpT72), s3 = aa("rect", paramLong, paramT0).Bn(lpT73), s4 = aa("rect", paramLong, paramT0).Bn(lpT74);
/*    */     aa("rect", paramLong, paramT0).SH(s1, s2, s3, s4);
/*    */     return GC0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GL0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */