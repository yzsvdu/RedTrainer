/* 1 */ package f;public final class So0 extends me { public static final eo UV = new eo(); public static final eo PH = new eo(); public Ac PI0; public AI Xq; public fC0[] Oy0; public HashMap go0; public fQ DJ; public final void XA0(gD paramgD) { ByteBuffer byteBuffer2 = do0.aF0(); Do0 do0; ByteBuffer byteBuffer1; LF.Db(byteBuffer1 = (do0 = paramgD.Gc0(9)).aF0(), 1117022236, -1122971147, 573); (do0 = paramgD.Gc0(9)).aF0().position((do0 = paramgD.Gc0(9)).aF0().getInt() - do0.h90); while (true) { int i = byteBuffer1.getInt(), j = byteBuffer1.getInt(); if (593 == i || j < 1) break;  if (i == 579 && h20() == 577) { s = 1; } else { s = 0; }  if (i != h20() && !s) continue;  byteBuffer2.position(j - do0.h90); byteBuffer2.getInt(); short s; short s1, s2, s3; for (j = byteBuffer2.getShort(), s = byteBuffer2.getShort(), s1 = byteBuffer2.getShort(), s2 = byteBuffer2.getShort(), s3 = byteBuffer2.getShort(); (i = byteBuffer2.getShort()) != 25; ) { Mu0(i, lpt11, j, s1, s); lpt1 lpt11; (lpt11 = zp0.vY().O4(i)).rd(0, true, null); zp0.vY().O4(i)
/* 2 */           .C50(); this.UH.Com3(lpt11); if (s2 == 5 && s3 == 14) this
/* 3 */             .f7 = lpt11;  }  }  } public fQ o10; public fQ R90; public boolean[] m10; public lpt1 f7; public So0(xV paramxV) { super(paramxV); ig ig; this.Oy0 = new fC0[0]; this.go0 = new HashMap<>(); this.DJ = new fQ(); this.o10 = new fQ(); this.R90 = new fQ(); this.f7 = null; gD gD = km.mI0.MT; this(gD.Vz().B8("/fielddata/tornworld/tw_arc.narc")); B5 b5 = (new sl(ig.Em0(0).l2())).Td(paramxV.Xg0()); this.PI0 = new Ac(ig.Em0(b5.HX + 1)); this.Xq = (new oz0(gD)).K40(paramxV.Xg0()); Ll0[] arrayOfLl0; int j = (arrayOfLl0 = this.PI0.l50).length; short s; for (s = 0; s < j; s++) { lpt1 lpt11 = zp0.vY().O4(ll0.b50); short s1 = ll0.tf; short s2 = ll0.SB; short s3 = ll0.B90; Ll0 ll0; Mu0((ll0 = arrayOfLl0[s]).b50, lpt11, s1, s2, s3); if ((s1 = (arrayOfLl0[s]).b50) == 24 || s1 == 21) { lpt11.ml0(0, true); } else { lpt11.k = 1.0E8F; lpt11.ml0(0, false); }  if ((s1 = ll0.b50) == 1 || s1 == 0) { this.DJ.Com3(lpt11); this(); this.o10.Com3(eo1); eo eo1; (eo1 = new eo()).y = lpt11.mh.Z0[13]; (new eo()).z = xi0.qX(99) / 100.0F; if (ll0.b50 == 0) { float f = ll0.SB; this.R90.Com3(paramxV.hd(ll0.tf, f, ll0.B90, null)); eo1.x = paramxV.hd(ll0.tf, f, ll0.B90, null).i00(); } else { this.R90.Com3(null); }  }  kc(lpt11); vu vu; if ((vu = (vu)this.go0.get(Integer.valueOf(ll0.Dl0))) == null) { this(); this.go0.put(Integer.valueOf(ll0.Dl0), vu); }  vu.mg0(lpt11); }  this.m10 = new boolean[this.DJ.Z8]; XA0(gD); AI aI; if ((aI = this.Xq) != null) { this.Oy0 = new fC0[aI.jp0().size()]; for (p70 p70 : this.Xq.jp0()) { s = p70.fi; short s1 = p70.f; short s2 = p70.rg; Mu0(p70.Nw, lpt11, s, s1, s2); lpt1 lpt11; kc(lpt11 = zp0.vY().O4(p70.Nw)); this.Oy0[p70.dM] = new fC0(this, p70, lpt11); }  fC0[] arrayOfFC0; int k = (arrayOfFC0 = this.Oy0).length; for (j = 0; j < k; j++) { fC0 fC01; p70 p70; if ((p70 = (fC01 = arrayOfFC0[j]).wV).RU == 2) { fC0 fC02; byte b; switch (p70.dM) { case 17: fC02 = this.Oy0[6]; b = 1; fC01.wi(b, fC02); break;case 16: fC02 = this.Oy0[1]; b = 3; fC01.wi(b, fC02); break;case 13: fC02 = this.Oy0[14]; b = 2; fC01.wi(b, fC02); break;case 12: fC02 = this.Oy0[15]; b = 2; fC01.wi(b, fC02); break;case 11: fC02 = this.Oy0[12]; b = 0; fC01.wi(b, fC02); break;case 10: fC02 = this.Oy0[11]; b = 3; fC01.wi(b, fC02); break;case 9: fC02 = this.Oy0[10]; b = 3; fC01.wi(b, fC02); break;case 6: fC02 = this.Oy0[7]; b = 3; fC01.wi(b, fC02); break;case 5: fC02 = this.Oy0[8]; b = 0; fC01.wi(b, fC02); break;case 4: fC02 = this.Oy0[4]; b = 3; fC01.wi(b, fC02); break;case 2: fC02 = this.Oy0[3]; b = 1; fC01.wi(b, fC02); break;case 1: fC02 = this.Oy0[2]; b = 1; fC01.wi(b, fC02); break; }  }  }  }  W3[] arrayOfW3; int i = (arrayOfW3 = this.PI0.f00).length; for (j = 0; j < i; j++) { W3 w3 = arrayOfW3[j]; for (byte b = 0; b < w3.Mc + 1; b++) { for (byte b1 = 0; b1 < w3.hi0 + 1; b1++) { xr0 xr0; if ((xr0 = paramxV.G1(w3.D7 + b, w3.oh + b1)) != null) { if (xr0.hz() == Qm.A3) { t10 t10; this(this); xr0.wu0(t10); }  if (xr0.hz() instanceof t10) { ((t10)xr0.hz()).Er0(w3); } else { throw new RuntimeException(); }  }  }  }  }  if (h20() == 580) { paramxV.G1(96, 69).lk0(113.0F); paramxV.G1(100, 69).lk0(113.0F); paramxV.G1(105, 69).lk0(113.0F); paramxV.G1(84, 60).lk0(113.0F); paramxV.G1(84, 56).lk0(113.0F); paramxV.G1(84, 52).lk0(113.0F); paramxV.G1(68, 66).lk0(113.0F); paramxV.G1(75, 66).lk0(113.0F); paramxV.G1(79, 66).lk0(113.0F); }  GK(); } public static void Mu0(int paramInt, lpt1 paramlpt1, short paramShort1, short paramShort2, short paramShort3) { float f1 = 0.125F; float f2 = 0.125F; float f3 = -0.25F; switch (paramInt) { default: f1 = 0.125F; f2 = 0.125F; break;case 24: f2 = 0.25F; f3 = 0.0F; break;case 21: f3 = -0.5F; break;case 18: f1 = 0.0F; f2 = 0.25F; break;case 14: case 15: f1 = 0.25F; f2 = -0.125F; break;case 8: case 16: f1 = 0.0F; break;case 2: case 3: case 4: case 5: case 6: case 9: case 12: case 13: case 19: f2 = 0.0F; break; }  f1 = paramShort3 * 0.25F + f3; paramlpt1.mh.g7(paramShort1 * 0.25F + f1, f1, paramShort2 * 0.25F + f2); } public final void Ic0(float paramFloat) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Oy0 : [Lf/fC0;
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: arraylength
/*   */     //   7: istore_2
/*   */     //   8: iconst_0
/*   */     //   9: istore_3
/*   */     //   10: iload_3
/*   */     //   11: iload_2
/*   */     //   12: if_icmpge -> 1319
/*   */     //   15: aload_1
/*   */     //   16: iload_3
/*   */     //   17: aaload
/*   */     //   18: dup
/*   */     //   19: astore #4
/*   */     //   21: getfield do0 : Lf/lpt1;
/*   */     //   24: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   27: astore #5
/*   */     //   29: getstatic f/So0.UV : Lf/eo;
/*   */     //   32: dup
/*   */     //   33: astore #6
/*   */     //   35: aload #5
/*   */     //   37: aload #6
/*   */     //   39: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*   */     //   42: pop
/*   */     //   43: getfield y : F
/*   */     //   46: dup
/*   */     //   47: fstore #5
/*   */     //   49: aload #4
/*   */     //   51: getfield CoM2 : Lf/eo;
/*   */     //   54: dup
/*   */     //   55: astore #7
/*   */     //   57: getfield y : F
/*   */     //   60: dup
/*   */     //   61: fstore #8
/*   */     //   63: fcmpg
/*   */     //   64: ifge -> 105
/*   */     //   67: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   70: getfield Qy : F
/*   */     //   73: ldc_w 1.5
/*   */     //   76: fmul
/*   */     //   77: fload #5
/*   */     //   79: fadd
/*   */     //   80: dup
/*   */     //   81: fstore #5
/*   */     //   83: aload #7
/*   */     //   85: aload #6
/*   */     //   87: fload #5
/*   */     //   89: putfield y : F
/*   */     //   92: getfield y : F
/*   */     //   95: dup
/*   */     //   96: fstore #5
/*   */     //   98: fcmpl
/*   */     //   99: iflt -> 377
/*   */     //   102: goto -> 148
/*   */     //   105: fload #5
/*   */     //   107: fload #8
/*   */     //   109: fcmpl
/*   */     //   110: ifle -> 158
/*   */     //   113: fload #5
/*   */     //   115: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   118: getfield Qy : F
/*   */     //   121: ldc_w 1.5
/*   */     //   124: fmul
/*   */     //   125: fsub
/*   */     //   126: dup
/*   */     //   127: fstore #5
/*   */     //   129: aload #7
/*   */     //   131: aload #6
/*   */     //   133: fload #5
/*   */     //   135: putfield y : F
/*   */     //   138: getfield y : F
/*   */     //   141: dup
/*   */     //   142: fstore #5
/*   */     //   144: fcmpg
/*   */     //   145: ifgt -> 377
/*   */     //   148: aload #6
/*   */     //   150: fload #5
/*   */     //   152: putfield y : F
/*   */     //   155: goto -> 377
/*   */     //   158: aload #6
/*   */     //   160: getfield z : F
/*   */     //   163: dup
/*   */     //   164: fstore #5
/*   */     //   166: aload #7
/*   */     //   168: getfield z : F
/*   */     //   171: dup
/*   */     //   172: fstore #8
/*   */     //   174: fcmpg
/*   */     //   175: ifge -> 216
/*   */     //   178: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   181: getfield Qy : F
/*   */     //   184: ldc_w 1.5
/*   */     //   187: fmul
/*   */     //   188: fload #5
/*   */     //   190: fadd
/*   */     //   191: dup
/*   */     //   192: fstore #5
/*   */     //   194: aload #7
/*   */     //   196: aload #6
/*   */     //   198: fload #5
/*   */     //   200: putfield z : F
/*   */     //   203: getfield z : F
/*   */     //   206: dup
/*   */     //   207: fstore #5
/*   */     //   209: fcmpl
/*   */     //   210: iflt -> 377
/*   */     //   213: goto -> 259
/*   */     //   216: fload #5
/*   */     //   218: fload #8
/*   */     //   220: fcmpl
/*   */     //   221: ifle -> 269
/*   */     //   224: fload #5
/*   */     //   226: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   229: getfield Qy : F
/*   */     //   232: ldc_w 1.5
/*   */     //   235: fmul
/*   */     //   236: fsub
/*   */     //   237: dup
/*   */     //   238: fstore #5
/*   */     //   240: aload #7
/*   */     //   242: aload #6
/*   */     //   244: fload #5
/*   */     //   246: putfield z : F
/*   */     //   249: getfield z : F
/*   */     //   252: dup
/*   */     //   253: fstore #5
/*   */     //   255: fcmpg
/*   */     //   256: ifgt -> 377
/*   */     //   259: aload #6
/*   */     //   261: fload #5
/*   */     //   263: putfield z : F
/*   */     //   266: goto -> 377
/*   */     //   269: aload #6
/*   */     //   271: getfield x : F
/*   */     //   274: dup
/*   */     //   275: fstore #5
/*   */     //   277: aload #7
/*   */     //   279: getfield x : F
/*   */     //   282: dup
/*   */     //   283: fstore #8
/*   */     //   285: fcmpg
/*   */     //   286: ifge -> 327
/*   */     //   289: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   292: getfield Qy : F
/*   */     //   295: ldc_w 1.5
/*   */     //   298: fmul
/*   */     //   299: fload #5
/*   */     //   301: fadd
/*   */     //   302: dup
/*   */     //   303: fstore #5
/*   */     //   305: aload #7
/*   */     //   307: aload #6
/*   */     //   309: fload #5
/*   */     //   311: putfield x : F
/*   */     //   314: getfield x : F
/*   */     //   317: dup
/*   */     //   318: fstore #5
/*   */     //   320: fcmpl
/*   */     //   321: iflt -> 377
/*   */     //   324: goto -> 370
/*   */     //   327: fload #5
/*   */     //   329: fload #8
/*   */     //   331: fcmpl
/*   */     //   332: ifle -> 388
/*   */     //   335: fload #5
/*   */     //   337: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   340: getfield Qy : F
/*   */     //   343: ldc_w 1.5
/*   */     //   346: fmul
/*   */     //   347: fsub
/*   */     //   348: dup
/*   */     //   349: fstore #5
/*   */     //   351: aload #7
/*   */     //   353: aload #6
/*   */     //   355: fload #5
/*   */     //   357: putfield x : F
/*   */     //   360: getfield x : F
/*   */     //   363: dup
/*   */     //   364: fstore #5
/*   */     //   366: fcmpg
/*   */     //   367: ifgt -> 377
/*   */     //   370: aload #6
/*   */     //   372: fload #5
/*   */     //   374: putfield x : F
/*   */     //   377: aload #4
/*   */     //   379: getfield do0 : Lf/lpt1;
/*   */     //   382: invokevirtual C50 : ()V
/*   */     //   385: goto -> 1300
/*   */     //   388: aload #4
/*   */     //   390: getfield SD : B
/*   */     //   393: tableswitch default -> 424, 1 -> 1119, 2 -> 673, 3 -> 571, 4 -> 427
/*   */     //   424: goto -> 1300
/*   */     //   427: aload #4
/*   */     //   429: dup
/*   */     //   430: iconst_0
/*   */     //   431: putfield SD : B
/*   */     //   434: getfield EF : Lf/tc;
/*   */     //   437: dup
/*   */     //   438: astore #5
/*   */     //   440: ifnull -> 1300
/*   */     //   443: aload #4
/*   */     //   445: getfield Wq : Z
/*   */     //   448: ifne -> 538
/*   */     //   451: aload #4
/*   */     //   453: aload #5
/*   */     //   455: aload #4
/*   */     //   457: getfield x5 : [Lf/xr0;
/*   */     //   460: aload #4
/*   */     //   462: getfield qU : B
/*   */     //   465: aaload
/*   */     //   466: astore #5
/*   */     //   468: getfield HW : Lf/G5;
/*   */     //   471: aload #5
/*   */     //   473: dup
/*   */     //   474: dup2
/*   */     //   475: invokevirtual Y00 : ()Z
/*   */     //   478: istore #5
/*   */     //   480: invokevirtual Ka : ()S
/*   */     //   483: istore #7
/*   */     //   485: invokevirtual hA0 : ()S
/*   */     //   488: istore #8
/*   */     //   490: invokevirtual bl0 : ()B
/*   */     //   493: istore #9
/*   */     //   495: iload #5
/*   */     //   497: aload #4
/*   */     //   499: getfield EF : Lf/tc;
/*   */     //   502: getfield HW : Lf/G5;
/*   */     //   505: getfield g50 : B
/*   */     //   508: istore #5
/*   */     //   510: iload #7
/*   */     //   512: iload #8
/*   */     //   514: iload #9
/*   */     //   516: iload #5
/*   */     //   518: invokevirtual Zh : (ZSSBB)V
/*   */     //   521: getfield EF : Lf/tc;
/*   */     //   524: dup
/*   */     //   525: astore #5
/*   */     //   527: getfield pm : Lf/d7;
/*   */     //   530: aload #5
/*   */     //   532: getfield HW : Lf/G5;
/*   */     //   535: invokevirtual Cb0 : (Lf/G5;)V
/*   */     //   538: aload #4
/*   */     //   540: dup
/*   */     //   541: getfield EF : Lf/tc;
/*   */     //   544: getfield pm : Lf/d7;
/*   */     //   547: dup
/*   */     //   548: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   551: pop
/*   */     //   552: getstatic f/eo.Zero : Lf/eo;
/*   */     //   555: astore #5
/*   */     //   557: aconst_null
/*   */     //   558: iconst_0
/*   */     //   559: aload #5
/*   */     //   561: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*   */     //   564: aconst_null
/*   */     //   565: putfield EF : Lf/tc;
/*   */     //   568: goto -> 1300
/*   */     //   571: aload #4
/*   */     //   573: getfield KB : F
/*   */     //   576: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   579: getfield Qy : F
/*   */     //   582: fsub
/*   */     //   583: dup
/*   */     //   584: aload #4
/*   */     //   586: swap
/*   */     //   587: putfield KB : F
/*   */     //   590: fconst_0
/*   */     //   591: fcmpg
/*   */     //   592: ifge -> 1300
/*   */     //   595: aload #4
/*   */     //   597: dup
/*   */     //   598: iconst_4
/*   */     //   599: putfield SD : B
/*   */     //   602: getfield Wq : Z
/*   */     //   605: ifne -> 613
/*   */     //   608: aload #4
/*   */     //   610: invokevirtual Ug0 : ()V
/*   */     //   613: aload #4
/*   */     //   615: getfield CoM2 : Lf/eo;
/*   */     //   618: aload #4
/*   */     //   620: getfield wV : Lf/p70;
/*   */     //   623: dup
/*   */     //   624: astore #5
/*   */     //   626: getfield fi : S
/*   */     //   629: i2f
/*   */     //   630: ldc_w 0.25
/*   */     //   633: fmul
/*   */     //   634: ldc_w 0.125
/*   */     //   637: fadd
/*   */     //   638: aload #5
/*   */     //   640: dup
/*   */     //   641: getfield rg : S
/*   */     //   644: i2f
/*   */     //   645: ldc_w 0.25
/*   */     //   648: fmul
/*   */     //   649: ldc_w 0.25
/*   */     //   652: fsub
/*   */     //   653: fstore #5
/*   */     //   655: getfield f : S
/*   */     //   658: i2f
/*   */     //   659: ldc_w 0.25
/*   */     //   662: fmul
/*   */     //   663: fload #5
/*   */     //   665: swap
/*   */     //   666: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   669: pop
/*   */     //   670: goto -> 1300
/*   */     //   673: aload #4
/*   */     //   675: dup
/*   */     //   676: dup
/*   */     //   677: iconst_3
/*   */     //   678: putfield SD : B
/*   */     //   681: fconst_1
/*   */     //   682: putfield KB : F
/*   */     //   685: getfield Wq : Z
/*   */     //   688: ifeq -> 979
/*   */     //   691: aload #4
/*   */     //   693: dup
/*   */     //   694: dup2
/*   */     //   695: dup2
/*   */     //   696: getfield EF : Lf/tc;
/*   */     //   699: getfield pm : Lf/d7;
/*   */     //   702: getfield cOm3 : Lf/eo;
/*   */     //   705: astore #5
/*   */     //   707: getfield Cl0 : Lf/So0;
/*   */     //   710: getfield im0 : Lf/Cy;
/*   */     //   713: checkcast f/xV
/*   */     //   716: aload #5
/*   */     //   718: dup
/*   */     //   719: dup
/*   */     //   720: getfield x : F
/*   */     //   723: fstore #5
/*   */     //   725: getfield y : F
/*   */     //   728: fstore #7
/*   */     //   730: getfield z : F
/*   */     //   733: fstore #8
/*   */     //   735: fload #5
/*   */     //   737: fload #7
/*   */     //   739: fload #8
/*   */     //   741: aconst_null
/*   */     //   742: invokevirtual hd : (FFFLf/Rc;)Lf/il;
/*   */     //   745: astore #5
/*   */     //   747: getfield EF : Lf/tc;
/*   */     //   750: getfield HW : Lf/G5;
/*   */     //   753: aload #5
/*   */     //   755: dup
/*   */     //   756: dup2
/*   */     //   757: invokevirtual Y00 : ()Z
/*   */     //   760: istore #5
/*   */     //   762: invokevirtual Ka : ()S
/*   */     //   765: istore #7
/*   */     //   767: invokevirtual hA0 : ()S
/*   */     //   770: istore #8
/*   */     //   772: getfield pu : B
/*   */     //   775: istore #9
/*   */     //   777: iload #5
/*   */     //   779: aload #4
/*   */     //   781: getfield EF : Lf/tc;
/*   */     //   784: getfield HW : Lf/G5;
/*   */     //   787: getfield g50 : B
/*   */     //   790: istore #5
/*   */     //   792: iload #7
/*   */     //   794: iload #8
/*   */     //   796: iload #9
/*   */     //   798: iload #5
/*   */     //   800: invokevirtual Zh : (ZSSBB)V
/*   */     //   803: getfield EF : Lf/tc;
/*   */     //   806: dup
/*   */     //   807: astore #5
/*   */     //   809: getfield pm : Lf/d7;
/*   */     //   812: aload #5
/*   */     //   814: getfield HW : Lf/G5;
/*   */     //   817: invokevirtual Cb0 : (Lf/G5;)V
/*   */     //   820: getfield EF : Lf/tc;
/*   */     //   823: getfield pm : Lf/d7;
/*   */     //   826: dup
/*   */     //   827: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   830: pop
/*   */     //   831: getstatic f/eo.Zero : Lf/eo;
/*   */     //   834: astore #5
/*   */     //   836: aconst_null
/*   */     //   837: iconst_0
/*   */     //   838: aload #5
/*   */     //   840: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*   */     //   843: getfield qU : B
/*   */     //   846: tableswitch default -> 876, 0 -> 954, 1 -> 929, 2 -> 904, 3 -> 879
/*   */     //   876: goto -> 1300
/*   */     //   879: aload #4
/*   */     //   881: getfield EF : Lf/tc;
/*   */     //   884: getfield pm : Lf/d7;
/*   */     //   887: iconst_1
/*   */     //   888: anewarray f/nl
/*   */     //   891: dup
/*   */     //   892: getstatic f/nl.tb : Lf/nl;
/*   */     //   895: iconst_0
/*   */     //   896: swap
/*   */     //   897: aastore
/*   */     //   898: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   901: goto -> 1300
/*   */     //   904: aload #4
/*   */     //   906: getfield EF : Lf/tc;
/*   */     //   909: getfield pm : Lf/d7;
/*   */     //   912: iconst_1
/*   */     //   913: anewarray f/nl
/*   */     //   916: dup
/*   */     //   917: getstatic f/nl.Iv : Lf/nl;
/*   */     //   920: iconst_0
/*   */     //   921: swap
/*   */     //   922: aastore
/*   */     //   923: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   926: goto -> 1300
/*   */     //   929: aload #4
/*   */     //   931: getfield EF : Lf/tc;
/*   */     //   934: getfield pm : Lf/d7;
/*   */     //   937: iconst_1
/*   */     //   938: anewarray f/nl
/*   */     //   941: dup
/*   */     //   942: getstatic f/nl.z5 : Lf/nl;
/*   */     //   945: iconst_0
/*   */     //   946: swap
/*   */     //   947: aastore
/*   */     //   948: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   951: goto -> 1300
/*   */     //   954: aload #4
/*   */     //   956: getfield EF : Lf/tc;
/*   */     //   959: getfield pm : Lf/d7;
/*   */     //   962: iconst_1
/*   */     //   963: anewarray f/nl
/*   */     //   966: dup
/*   */     //   967: getstatic f/nl.qB0 : Lf/nl;
/*   */     //   970: iconst_0
/*   */     //   971: swap
/*   */     //   972: aastore
/*   */     //   973: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   976: goto -> 1300
/*   */     //   979: aload #4
/*   */     //   981: getfield qU : B
/*   */     //   984: invokestatic rD : (B)B
/*   */     //   987: tableswitch default -> 1016, 0 -> 1094, 1 -> 1069, 2 -> 1044, 3 -> 1019
/*   */     //   1016: goto -> 1300
/*   */     //   1019: aload #4
/*   */     //   1021: getfield EF : Lf/tc;
/*   */     //   1024: getfield pm : Lf/d7;
/*   */     //   1027: iconst_1
/*   */     //   1028: anewarray f/nl
/*   */     //   1031: dup
/*   */     //   1032: getstatic f/nl.tb : Lf/nl;
/*   */     //   1035: iconst_0
/*   */     //   1036: swap
/*   */     //   1037: aastore
/*   */     //   1038: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   1041: goto -> 1300
/*   */     //   1044: aload #4
/*   */     //   1046: getfield EF : Lf/tc;
/*   */     //   1049: getfield pm : Lf/d7;
/*   */     //   1052: iconst_1
/*   */     //   1053: anewarray f/nl
/*   */     //   1056: dup
/*   */     //   1057: getstatic f/nl.Iv : Lf/nl;
/*   */     //   1060: iconst_0
/*   */     //   1061: swap
/*   */     //   1062: aastore
/*   */     //   1063: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   1066: goto -> 1300
/*   */     //   1069: aload #4
/*   */     //   1071: getfield EF : Lf/tc;
/*   */     //   1074: getfield pm : Lf/d7;
/*   */     //   1077: iconst_1
/*   */     //   1078: anewarray f/nl
/*   */     //   1081: dup
/*   */     //   1082: getstatic f/nl.z5 : Lf/nl;
/*   */     //   1085: iconst_0
/*   */     //   1086: swap
/*   */     //   1087: aastore
/*   */     //   1088: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   1091: goto -> 1300
/*   */     //   1094: aload #4
/*   */     //   1096: getfield EF : Lf/tc;
/*   */     //   1099: getfield pm : Lf/d7;
/*   */     //   1102: iconst_1
/*   */     //   1103: anewarray f/nl
/*   */     //   1106: dup
/*   */     //   1107: getstatic f/nl.qB0 : Lf/nl;
/*   */     //   1110: iconst_0
/*   */     //   1111: swap
/*   */     //   1112: aastore
/*   */     //   1113: invokevirtual Kk : ([Lf/nl;)V
/*   */     //   1116: goto -> 1300
/*   */     //   1119: aload #4
/*   */     //   1121: getfield KB : F
/*   */     //   1124: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   1127: getfield Qy : F
/*   */     //   1130: fsub
/*   */     //   1131: dup
/*   */     //   1132: aload #4
/*   */     //   1134: swap
/*   */     //   1135: putfield KB : F
/*   */     //   1138: fconst_0
/*   */     //   1139: fcmpg
/*   */     //   1140: ifge -> 1300
/*   */     //   1143: aload #4
/*   */     //   1145: ldc_w 0.125
/*   */     //   1148: fstore #5
/*   */     //   1150: fconst_0
/*   */     //   1151: fstore #8
/*   */     //   1153: ldc_w -0.25
/*   */     //   1156: fstore #9
/*   */     //   1158: getfield qU : B
/*   */     //   1161: tableswitch default -> 1192, 0 -> 1219, 1 -> 1211, 2 -> 1203, 3 -> 1195
/*   */     //   1192: goto -> 1224
/*   */     //   1195: ldc_w -1.625
/*   */     //   1198: fstore #5
/*   */     //   1200: goto -> 1224
/*   */     //   1203: ldc_w 1.875
/*   */     //   1206: fstore #5
/*   */     //   1208: goto -> 1224
/*   */     //   1211: ldc_w 1.75
/*   */     //   1214: fstore #8
/*   */     //   1216: goto -> 1224
/*   */     //   1219: ldc_w -1.75
/*   */     //   1222: fstore #8
/*   */     //   1224: aload #4
/*   */     //   1226: dup
/*   */     //   1227: aload #7
/*   */     //   1229: aload #4
/*   */     //   1231: getfield Ek0 : Lf/fC0;
/*   */     //   1234: getfield wV : Lf/p70;
/*   */     //   1237: dup
/*   */     //   1238: astore #7
/*   */     //   1240: getfield fi : S
/*   */     //   1243: i2f
/*   */     //   1244: ldc_w 0.25
/*   */     //   1247: fmul
/*   */     //   1248: fload #5
/*   */     //   1250: fadd
/*   */     //   1251: aload #7
/*   */     //   1253: dup
/*   */     //   1254: getfield rg : S
/*   */     //   1257: i2f
/*   */     //   1258: ldc_w 0.25
/*   */     //   1261: fmul
/*   */     //   1262: fload #9
/*   */     //   1264: fadd
/*   */     //   1265: fstore #5
/*   */     //   1267: getfield f : S
/*   */     //   1270: i2f
/*   */     //   1271: ldc_w 0.25
/*   */     //   1274: fmul
/*   */     //   1275: fload #8
/*   */     //   1277: fadd
/*   */     //   1278: fload #5
/*   */     //   1280: swap
/*   */     //   1281: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   1284: pop
/*   */     //   1285: iconst_2
/*   */     //   1286: putfield SD : B
/*   */     //   1289: getfield Wq : Z
/*   */     //   1292: ifeq -> 1300
/*   */     //   1295: aload #4
/*   */     //   1297: invokevirtual Ug0 : ()V
/*   */     //   1300: aload #4
/*   */     //   1302: getfield do0 : Lf/lpt1;
/*   */     //   1305: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   1308: aload #6
/*   */     //   1310: invokevirtual b8 : (Lf/eo;)V
/*   */     //   1313: iinc #3, 1
/*   */     //   1316: goto -> 10
/*   */     //   1319: aload_0
/*   */     //   1320: getfield go0 : Ljava/util/HashMap;
/*   */     //   1323: invokevirtual values : ()Ljava/util/Collection;
/*   */     //   1326: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   1331: astore_1
/*   */     //   1332: aload_1
/*   */     //   1333: invokeinterface hasNext : ()Z
/*   */     //   1338: ifeq -> 1512
/*   */     //   1341: aload_1
/*   */     //   1342: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   1347: checkcast f/vu
/*   */     //   1350: dup
/*   */     //   1351: astore_2
/*   */     //   1352: getfield COm4 : F
/*   */     //   1355: aload_2
/*   */     //   1356: getfield js0 : F
/*   */     //   1359: invokestatic JC0 : (FF)Z
/*   */     //   1362: ifeq -> 1368
/*   */     //   1365: goto -> 1332
/*   */     //   1368: aload_2
/*   */     //   1369: getfield COm4 : F
/*   */     //   1372: dup
/*   */     //   1373: fstore_3
/*   */     //   1374: aload_2
/*   */     //   1375: getfield js0 : F
/*   */     //   1378: fcmpl
/*   */     //   1379: ifle -> 1401
/*   */     //   1382: aload_2
/*   */     //   1383: fload_3
/*   */     //   1384: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   1387: getfield Qy : F
/*   */     //   1390: ldc_w 1.25
/*   */     //   1393: fmul
/*   */     //   1394: fsub
/*   */     //   1395: putfield COm4 : F
/*   */     //   1398: goto -> 1417
/*   */     //   1401: aload_2
/*   */     //   1402: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   1405: getfield Qy : F
/*   */     //   1408: ldc_w 1.25
/*   */     //   1411: fmul
/*   */     //   1412: fload_3
/*   */     //   1413: fadd
/*   */     //   1414: putfield COm4 : F
/*   */     //   1417: aload_2
/*   */     //   1418: dup
/*   */     //   1419: dup
/*   */     //   1420: getfield COm4 : F
/*   */     //   1423: fconst_0
/*   */     //   1424: fconst_1
/*   */     //   1425: invokestatic SA0 : (FFF)F
/*   */     //   1428: putfield COm4 : F
/*   */     //   1431: getfield ks0 : Ljava/util/ArrayList;
/*   */     //   1434: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   1437: astore_3
/*   */     //   1438: aload_3
/*   */     //   1439: invokeinterface hasNext : ()Z
/*   */     //   1444: ifeq -> 1332
/*   */     //   1447: aload_3
/*   */     //   1448: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   1453: checkcast f/lpt1
/*   */     //   1456: dup
/*   */     //   1457: astore #4
/*   */     //   1459: getfield xl0 : Lf/fQ;
/*   */     //   1462: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   1465: astore #5
/*   */     //   1467: aload #5
/*   */     //   1469: invokevirtual hasNext : ()Z
/*   */     //   1472: ifeq -> 1500
/*   */     //   1475: aload #5
/*   */     //   1477: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   1480: checkcast f/T0
/*   */     //   1483: new f/zc
/*   */     //   1486: dup
/*   */     //   1487: aload_2
/*   */     //   1488: getfield COm4 : F
/*   */     //   1491: invokespecial <init> : (F)V
/*   */     //   1494: invokevirtual Tz0 : (Lf/dj;)V
/*   */     //   1497: goto -> 1467
/*   */     //   1500: aload #4
/*   */     //   1502: dup
/*   */     //   1503: invokevirtual kg0 : ()V
/*   */     //   1506: invokevirtual C50 : ()V
/*   */     //   1509: goto -> 1438
/*   */     //   1512: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   1515: getfield Qy : F
/*   */     //   1518: ldc_w 1.25
/*   */     //   1521: fmul
/*   */     //   1522: fstore_1
/*   */     //   1523: iconst_0
/*   */     //   1524: istore_2
/*   */     //   1525: iload_2
/*   */     //   1526: aload_0
/*   */     //   1527: getfield DJ : Lf/fQ;
/*   */     //   1530: getfield Z8 : I
/*   */     //   1533: if_icmpge -> 1755
/*   */     //   1536: aload_0
/*   */     //   1537: getfield o10 : Lf/fQ;
/*   */     //   1540: iload_2
/*   */     //   1541: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   1544: checkcast f/eo
/*   */     //   1547: dup
/*   */     //   1548: astore_3
/*   */     //   1549: getfield z : F
/*   */     //   1552: dup
/*   */     //   1553: fstore #4
/*   */     //   1555: fconst_1
/*   */     //   1556: fcmpl
/*   */     //   1557: iflt -> 1588
/*   */     //   1560: aload_0
/*   */     //   1561: getfield m10 : [Z
/*   */     //   1564: dup
/*   */     //   1565: astore #5
/*   */     //   1567: iload_2
/*   */     //   1568: baload
/*   */     //   1569: ifeq -> 1588
/*   */     //   1572: aload #5
/*   */     //   1574: iload_2
/*   */     //   1575: aload_3
/*   */     //   1576: fload #4
/*   */     //   1578: fload_1
/*   */     //   1579: fsub
/*   */     //   1580: putfield z : F
/*   */     //   1583: iconst_0
/*   */     //   1584: bastore
/*   */     //   1585: goto -> 1658
/*   */     //   1588: fload #4
/*   */     //   1590: fconst_0
/*   */     //   1591: fcmpl
/*   */     //   1592: ifle -> 1615
/*   */     //   1595: aload_0
/*   */     //   1596: getfield m10 : [Z
/*   */     //   1599: iload_2
/*   */     //   1600: baload
/*   */     //   1601: ifne -> 1615
/*   */     //   1604: aload_3
/*   */     //   1605: fload #4
/*   */     //   1607: fload_1
/*   */     //   1608: fsub
/*   */     //   1609: putfield z : F
/*   */     //   1612: goto -> 1658
/*   */     //   1615: fload #4
/*   */     //   1617: fconst_0
/*   */     //   1618: fcmpg
/*   */     //   1619: ifgt -> 1650
/*   */     //   1622: aload_0
/*   */     //   1623: getfield m10 : [Z
/*   */     //   1626: dup
/*   */     //   1627: astore #5
/*   */     //   1629: iload_2
/*   */     //   1630: baload
/*   */     //   1631: ifne -> 1650
/*   */     //   1634: aload #5
/*   */     //   1636: iload_2
/*   */     //   1637: aload_3
/*   */     //   1638: fload #4
/*   */     //   1640: fload_1
/*   */     //   1641: fadd
/*   */     //   1642: putfield z : F
/*   */     //   1645: iconst_1
/*   */     //   1646: bastore
/*   */     //   1647: goto -> 1658
/*   */     //   1650: aload_3
/*   */     //   1651: fload #4
/*   */     //   1653: fload_1
/*   */     //   1654: fadd
/*   */     //   1655: putfield z : F
/*   */     //   1658: aload_0
/*   */     //   1659: dup
/*   */     //   1660: aload_3
/*   */     //   1661: getfield z : F
/*   */     //   1664: fconst_0
/*   */     //   1665: swap
/*   */     //   1666: invokestatic max : (FF)F
/*   */     //   1669: fconst_1
/*   */     //   1670: swap
/*   */     //   1671: invokestatic min : (FF)F
/*   */     //   1674: fstore #4
/*   */     //   1676: getfield DJ : Lf/fQ;
/*   */     //   1679: iload_2
/*   */     //   1680: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   1683: checkcast f/lpt1
/*   */     //   1686: getstatic f/W2.Mn : Lf/aI;
/*   */     //   1689: fload #4
/*   */     //   1691: invokevirtual kb : (F)F
/*   */     //   1694: ldc_w 0.05
/*   */     //   1697: fmul
/*   */     //   1698: fstore #4
/*   */     //   1700: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   1703: getfield Z0 : [F
/*   */     //   1706: aload_3
/*   */     //   1707: getfield y : F
/*   */     //   1710: fload #4
/*   */     //   1712: fsub
/*   */     //   1713: bipush #13
/*   */     //   1715: swap
/*   */     //   1716: fastore
/*   */     //   1717: getfield R90 : Lf/fQ;
/*   */     //   1720: iload_2
/*   */     //   1721: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   1724: checkcast f/xr0
/*   */     //   1727: dup
/*   */     //   1728: astore #5
/*   */     //   1730: ifnull -> 1749
/*   */     //   1733: aload #5
/*   */     //   1735: aload_3
/*   */     //   1736: getfield x : F
/*   */     //   1739: fload #4
/*   */     //   1741: ldc_w 4.0
/*   */     //   1744: fmul
/*   */     //   1745: fsub
/*   */     //   1746: invokevirtual lk0 : (F)V
/*   */     //   1749: iinc #2, 1
/*   */     //   1752: goto -> 1525
/*   */     //   1755: aload_0
/*   */     //   1756: getfield f7 : Lf/lpt1;
/*   */     //   1759: ifnull -> 1849
/*   */     //   1762: getstatic f/km.u4 : Lf/R8;
/*   */     //   1765: getfield fF0 : Lf/BF;
/*   */     //   1768: iconst_3
/*   */     //   1769: sipush #16469
/*   */     //   1772: invokevirtual eb : (BS)S
/*   */     //   1775: bipush #14
/*   */     //   1777: if_icmplt -> 1785
/*   */     //   1780: iconst_1
/*   */     //   1781: istore_2
/*   */     //   1782: goto -> 1787
/*   */     //   1785: iconst_0
/*   */     //   1786: istore_2
/*   */     //   1787: aload_0
/*   */     //   1788: getfield f7 : Lf/lpt1;
/*   */     //   1791: getfield xl0 : Lf/fQ;
/*   */     //   1794: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   1797: astore_3
/*   */     //   1798: aload_3
/*   */     //   1799: invokevirtual hasNext : ()Z
/*   */     //   1802: ifeq -> 1849
/*   */     //   1805: iload_2
/*   */     //   1806: aload_3
/*   */     //   1807: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   1810: checkcast f/T0
/*   */     //   1813: astore #4
/*   */     //   1815: new f/zc
/*   */     //   1818: astore #5
/*   */     //   1820: ifeq -> 1829
/*   */     //   1823: fconst_1
/*   */     //   1824: fstore #6
/*   */     //   1826: goto -> 1832
/*   */     //   1829: fconst_0
/*   */     //   1830: fstore #6
/*   */     //   1832: aload #4
/*   */     //   1834: aload #5
/*   */     //   1836: fload #6
/*   */     //   1838: invokespecial <init> : (F)V
/*   */     //   1841: aload #5
/*   */     //   1843: invokevirtual Tz0 : (Lf/dj;)V
/*   */     //   1846: goto -> 1798
/*   */     //   1849: aload_0
/*   */     //   1850: fload_1
/*   */     //   1851: invokespecial Ic0 : (F)V
/*   */     //   1854: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 21
/*   */     //   #2	-> 24
/*   */     //   #3	-> 70
/*   */     //   #4	-> 89
/*   */     //   #5	-> 118
/*   */     //   #6	-> 135
/*   */     //   #7	-> 181
/*   */     //   #8	-> 200
/*   */     //   #9	-> 229
/*   */     //   #10	-> 246
/*   */     //   #11	-> 292
/*   */     //   #12	-> 311
/*   */     //   #13	-> 340
/*   */     //   #14	-> 357
/*   */     //   #15	-> 431
/*   */     //   #16	-> 468
/*   */     //   #17	-> 475
/*   */     //   #18	-> 502
/*   */     //   #19	-> 505
/*   */     //   #20	-> 518
/*   */     //   #21	-> 527
/*   */     //   #22	-> 532
/*   */     //   #23	-> 535
/*   */     //   #24	-> 544
/*   */     //   #25	-> 548
/*   */     //   #26	-> 552
/*   */     //   #27	-> 565
/*   */     //   #28	-> 573
/*   */     //   #29	-> 579
/*   */     //   #30	-> 587
/*   */     //   #31	-> 678
/*   */     //   #32	-> 699
/*   */     //   #33	-> 702
/*   */     //   #34	-> 707
/*   */     //   #35	-> 710
/*   */     //   #36	-> 713
/*   */     //   #37	-> 750
/*   */     //   #38	-> 757
/*   */     //   #39	-> 772
/*   */     //   #40	-> 781
/*   */     //   #41	-> 784
/*   */     //   #42	-> 787
/*   */     //   #43	-> 800
/*   */     //   #44	-> 809
/*   */     //   #45	-> 814
/*   */     //   #46	-> 817
/*   */     //   #47	-> 823
/*   */     //   #48	-> 827
/*   */     //   #49	-> 831
/*   */     //   #50	-> 843
/*   */     //   #51	-> 884
/*   */     //   #52	-> 888
/*   */     //   #53	-> 909
/*   */     //   #54	-> 913
/*   */     //   #55	-> 934
/*   */     //   #56	-> 938
/*   */     //   #57	-> 959
/*   */     //   #58	-> 963
/*   */     //   #59	-> 1024
/*   */     //   #60	-> 1028
/*   */     //   #61	-> 1049
/*   */     //   #62	-> 1053
/*   */     //   #63	-> 1074
/*   */     //   #64	-> 1078
/*   */     //   #65	-> 1099
/*   */     //   #66	-> 1103
/*   */     //   #67	-> 1121
/*   */     //   #68	-> 1127
/*   */     //   #69	-> 1135
/*   */     //   #70	-> 1158
/*   */     //   #71	-> 1302
/*   */     //   #72	-> 1320
/*   */     //   #73	-> 1352
/*   */     //   #74	-> 1356
/*   */     //   #75	-> 1387
/*   */     //   #76	-> 1395
/*   */     //   #77	-> 1405
/*   */     //   #78	-> 1414
/*   */     //   #79	-> 1512
/*   */     //   #80	-> 1515
/*   */     //   #81	-> 1527
/*   */     //   #82	-> 1765
/* 3 */     //   #83	-> 1772 } public final void GK() { Jo jo; if ((jo = km.a3.Ct) == null) return;  short s1 = jo.HW.mm;
/* 4 */     short s2 = jo.HW.Yu0;
/* 5 */     byte b = jo.HW.Qf0;
/* 6 */     boolean bool = jo.HW.LB0;
/* 7 */     if (h20() == 576) { boolean bool1; byte b1 = 0; if (s1 >= 63 && s1 <= 67 && s2 >= 32 && s2 <= 42) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 1; if ((s1 >= 72 && s1 <= 78 && s2 >= 33 && s2 <= 35) || (s1 == 72 && s2 >= 36 && s2 <= 37)) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 2; if (s1 >= 70 && s1 <= 74 && s2 >= 55 && s2 <= 61) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 3; if (s1 >= 70 && s1 <= 72 && s2 >= 63 && s2 <= 72) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 4; if (s1 >= 76 && s1 <= 85 && s2 >= 71 && s2 <= 73) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 5; if (s1 == 85 && s2 >= 57 && s2 <= 67) { bool1 = true; } else { bool1 = false; }  tH0(b1, bool1); b1 = 6; if ((s1 == 87 && s2 == 46) || (s1 == 82 && s2 == 49)) { bool1 = false; } else { bool1 = true; }  tH0(b1, bool1); b1 = 7; if (s1 < 58 || (b == 0 && bool)) { b = 1; } else { b = 0; }  tH0(b1, b); b = 8; if ((s1 == 72 && s2 == 49) || (s1 == 77 && s2 == 46)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 9; if (s1 == 80 && s2 == 29) { bool = false; } else { bool = true; }  tH0(b, bool); b = 10; if (s1 >= 82 && s1 <= 87 && s2 >= 39 && s2 <= 43) { bool = true; } else { bool = false; }  tH0(b, bool); b = 11; if (s1 == 99 && s2 == 30) { bool = false; } else { bool = true; }  tH0(b, bool); b = 12; if ((s1 == 66 && s2 == 64) || (s1 == 66 && s2 == 72)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 13; if ((s1 == 60 && s2 == 67) || (s1 == 63 && s2 == 72)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 14; if (s1 == 100 && s2 == 58) { bool = false; } else { bool = true; }  tH0(b, bool); b = 15; if (s1 == 95 && s2 == 60) { bool = false; } else { bool = true; }  tH0(b, bool); b = 16; if ((s1 == 71 && s2 == 55) || (s1 == 74 && s2 == 55)) { bool = false; } else { bool = true; }  tH0(b, bool); s1 = 17; if (s1 == 62 && s2 == 56) { s2 = 0; } else { s2 = 1; }  tH0(s1, s2); } else if (h20() == 577) { b = 1; if (s1 >= 73 && s1 <= 82 && s2 >= 48 && s2 <= 56) { bool = true; } else { bool = false; }  tH0(b, bool); b = 2; if (s1 >= 79 && s1 <= 83 && s2 >= 47 && s2 <= 56) { bool = false; } else { bool = true; }  tH0(b, bool); b = 4; if ((s1 >= 82 && s1 <= 86 && s2 >= 42 && s2 <= 48) || (s1 >= 73 && s1 <= 81 && s2 >= 42 && s2 <= 45)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 5; if (s1 >= 72 && s1 <= 79 && s2 >= 42 && s2 <= 49) { bool = true; } else { bool = false; }  tH0(b, bool); b = 7; if ((s1 >= 79 && s1 <= 86 && s2 >= 42 && s2 <= 53) || (s1 >= 77 && s1 <= 82 && s2 >= 56 && s2 <= 68)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 8; if (s1 >= 69 && s1 <= 74 && s2 >= 64 && s2 <= 69) { bool = false; } else { bool = true; }  tH0(b, bool); b = 10; if ((s1 >= 65 && s1 <= 74 && s2 >= 42 && s2 <= 53) || (s1 >= 69 && s1 <= 72 && s2 >= 54 && s2 <= 58)) { bool = false; } else { bool = true; }  tH0(b, bool); b = 11; if (s1 >= 65 && s1 <= 69 && s2 >= 59 && s2 <= 67) { bool = false; } else { bool = true; }  tH0(b, bool); b = 12; if (s1 >= 65 && s1 <= 74 && s2 >= 63 && s2 <= 68) { bool = true; } else { bool = false; }  tH0(b, bool); b = 13; if ((s1 >= 71 && s1 <= 80 && s2 >= 75 && s2 <= 80) || (s1 >= 70 && s1 <= 72 && s2 >= 81 && s2 <= 82)) { s1 = 1; } else { s1 = 0; }  tH0(b, s1); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void tH0(int paramInt, boolean paramBoolean) {
/*   */     vu vu;
/*   */     if ((vu = (vu)this.go0.get(Integer.valueOf(paramInt))) != null)
/*   */       cj0(paramBoolean, true); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/So0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */