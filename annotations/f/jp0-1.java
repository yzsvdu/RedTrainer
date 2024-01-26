/*  1 */ package f;public abstract class jp0 extends Xi implements iq0 { public static final ik k60 = C00.gd(jp0.class); public final eo B5; public final eo fY; public final Eb dH0; public eo tM; public final Ih0 To0; public final Ih0 Z5; public boolean wJ; public boolean uI; public K70 E40; public kg0 Zg; public vm ff0; public fo0 cJ0; public wI0 DE0; public lw Cc0; public lw ez0; public qo xd; public qo MS; public Color lPT1; public eo YD0; public float W2; public fQ tm; public fQ hd0; public HV Lz0; public final void fi0(float paramFloat) { this(); Ih0 ih0; this.w6 = false;
/*  2 */     YB(km.a3.Ct, ih0, false); this.w6 = true; float f2 = ih0.I70.x, f3 = ih0.I70.y, f4 = ih0.I70.z; paramFloat = ih0.Ah.x; float f1 = ih0.Ah.y; f2 = ih0.Ah.z; (So.k60().L5().PL(Wz0.gq(this.To0, 7, paramFloat).a(ih0.el0)).PL(Wz0.gq(this.To0, 6, paramFloat).a(ih0.IG0)).PL(Wz0.gq(this.To0, 5, paramFloat).a(ih0.Mp % 360.0F)).PL(Wz0.gq(this.To0, 9, paramFloat).qw0(f2, f3, f4)).PL(Wz0.gq(this.To0, 4, paramFloat).qw0(paramFloat, f1, f2)).Kr())
/*  3 */       .C00 = this.RC;
/*    */ 
/*    */     
/*  6 */     this.wI = (So)So.k60().L5().PL(Wz0.gq(this.To0, 7, paramFloat).a(ih0.el0)).PL(Wz0.gq(this.To0, 6, paramFloat).a(ih0.IG0)).PL(Wz0.gq(this.To0, 5, paramFloat).a(ih0.Mp % 360.0F)).PL(Wz0.gq(this.To0, 9, paramFloat).qw0(f2, f3, f4)).PL(Wz0.gq(this.To0, 4, paramFloat).qw0(paramFloat, f1, f2)).Kr().mg(km.wI0.pB0); } public final GL0 RF0; public cf0 bL; public cf0 hE; public cf0 mD; public cf0 N8; public cf0 OD; public cf0 jn; public Tb T60; public me oo0; public Cy K60; public int XT; public int G50; public So wI; public So cB0; public yE0 wg; public ParticleEffectExt j40; public ParticleEffectExt YK; public e2 Z7; public boolean qK0; public eo sf0; public HI l1; public bf RC; public K1 Ze; public fQ AuX; public jp0(HI paramHI) { fQ fQ1; eo eo2; Eb eb; eo eo1; Ih0 ih0; fQ fQ2; GL0 gL0; e2 e21; bf bf1; this(); this.B5 = eo2; this(); this.fY = eo2; this(); this.dH0 = eb; this(); this.tM = eo1; this(); this.To0 = ih0; this(); this.Z5 = ih0; this.wJ = false; this.uI = false; this(); this.tm = fQ2; this(); this.hd0 = fQ2; this(); this.RF0 = gL0; this.oo0 = null; this.K60 = null; this.XT = 0; this.G50 = 0; this(30000); this.Z7 = e21; this.qK0 = false; this.sf0 = null; this(this); this.RC = bf1; this(); this.AuX = this; this.l1 = paramHI; L00(); } public final void Tw(tc paramtc) { // Byte code:
/*    */     //   0: getstatic f/vh0.H90 : I
/*    */     //   3: dup
/*    */     //   4: istore_2
/*    */     //   5: iconst_m1
/*    */     //   6: if_icmpeq -> 48
/*    */     //   9: aload_1
/*    */     //   10: iconst_0
/*    */     //   11: istore_3
/*    */     //   12: getfield Jg : I
/*    */     //   15: dup
/*    */     //   16: istore #4
/*    */     //   18: iload_2
/*    */     //   19: if_icmpne -> 24
/*    */     //   22: iconst_1
/*    */     //   23: istore_3
/*    */     //   24: getstatic f/km.a3 : Lf/vh0;
/*    */     //   27: dup
/*    */     //   28: astore_2
/*    */     //   29: ifnull -> 43
/*    */     //   32: aload_2
/*    */     //   33: getfield yD : I
/*    */     //   36: iload #4
/*    */     //   38: if_icmpne -> 43
/*    */     //   41: iconst_1
/*    */     //   42: istore_3
/*    */     //   43: iload_3
/*    */     //   44: ifne -> 48
/*    */     //   47: return
/*    */     //   48: aload_1
/*    */     //   49: invokevirtual default : ()Lf/static;
/*    */     //   52: dup
/*    */     //   53: dup
/*    */     //   54: astore_1
/*    */     //   55: aload_0
/*    */     //   56: dup
/*    */     //   57: dup
/*    */     //   58: getfield E40 : Lf/K70;
/*    */     //   61: astore_0
/*    */     //   62: getfield cJ0 : Lf/fo0;
/*    */     //   65: astore_2
/*    */     //   66: invokevirtual zf0 : ()Lf/Ih0;
/*    */     //   69: dup
/*    */     //   70: astore_3
/*    */     //   71: putfield K70 : Lf/ny;
/*    */     //   74: getstatic f/zm0.u20 : J
/*    */     //   77: lstore #4
/*    */     //   79: getfield zS : Lf/tc;
/*    */     //   82: getfield pm : Lf/d7;
/*    */     //   85: dup
/*    */     //   86: astore #6
/*    */     //   88: aload_1
/*    */     //   89: dup
/*    */     //   90: aload #6
/*    */     //   92: aload_1
/*    */     //   93: aload #6
/*    */     //   95: aload_1
/*    */     //   96: lload #4
/*    */     //   98: aload #6
/*    */     //   100: getfield HQ : J
/*    */     //   103: lsub
/*    */     //   104: putfield xu0 : J
/*    */     //   107: getfield J4 : Z
/*    */     //   110: putfield CK : Z
/*    */     //   113: getfield eF : Z
/*    */     //   116: putfield GQ : Z
/*    */     //   119: aconst_null
/*    */     //   120: putfield Su0 : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   123: getfield Mv : Lf/nl;
/*    */     //   126: dup
/*    */     //   127: astore #4
/*    */     //   129: ifnull -> 336
/*    */     //   132: aload #4
/*    */     //   134: invokevirtual ordinal : ()I
/*    */     //   137: lookupswitch default -> 204, 87 -> 253, 88 -> 238, 186 -> 253, 214 -> 253, 270 -> 238, 271 -> 226, 272 -> 214
/*    */     //   204: aload_1
/*    */     //   205: getfield YB : Lf/lpt1;
/*    */     //   208: ifnull -> 341
/*    */     //   211: goto -> 336
/*    */     //   214: aload_1
/*    */     //   215: invokestatic vY : ()Lf/zp0;
/*    */     //   218: getfield ka0 : [Lf/lpt1;
/*    */     //   221: iconst_3
/*    */     //   222: aaload
/*    */     //   223: goto -> 247
/*    */     //   226: aload_1
/*    */     //   227: invokestatic vY : ()Lf/zp0;
/*    */     //   230: getfield ka0 : [Lf/lpt1;
/*    */     //   233: iconst_2
/*    */     //   234: aaload
/*    */     //   235: goto -> 247
/*    */     //   238: aload_1
/*    */     //   239: invokestatic vY : ()Lf/zp0;
/*    */     //   242: getfield ka0 : [Lf/lpt1;
/*    */     //   245: iconst_1
/*    */     //   246: aaload
/*    */     //   247: putfield YB : Lf/lpt1;
/*    */     //   250: goto -> 341
/*    */     //   253: aload_1
/*    */     //   254: getfield YB : Lf/lpt1;
/*    */     //   257: ifnonnull -> 341
/*    */     //   260: aload_1
/*    */     //   261: dup
/*    */     //   262: invokestatic vY : ()Lf/zp0;
/*    */     //   265: getfield ka0 : [Lf/lpt1;
/*    */     //   268: iconst_0
/*    */     //   269: aaload
/*    */     //   270: putfield YB : Lf/lpt1;
/*    */     //   273: getfield zS : Lf/tc;
/*    */     //   276: dup
/*    */     //   277: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   280: pop
/*    */     //   281: instanceof f/Jo
/*    */     //   284: ifeq -> 297
/*    */     //   287: aload_1
/*    */     //   288: getfield zS : Lf/tc;
/*    */     //   291: invokevirtual Pf : ()Z
/*    */     //   294: ifeq -> 341
/*    */     //   297: aload_1
/*    */     //   298: getfield zS : Lf/tc;
/*    */     //   301: invokevirtual D4 : ()S
/*    */     //   304: sipush #4095
/*    */     //   307: if_icmplt -> 323
/*    */     //   310: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   313: iconst_2
/*    */     //   314: sipush #1646
/*    */     //   317: invokevirtual bL : (BS)V
/*    */     //   320: goto -> 341
/*    */     //   323: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   326: iconst_2
/*    */     //   327: sipush #1656
/*    */     //   330: invokevirtual bL : (BS)V
/*    */     //   333: goto -> 341
/*    */     //   336: aload_1
/*    */     //   337: aconst_null
/*    */     //   338: putfield YB : Lf/lpt1;
/*    */     //   341: aload_1
/*    */     //   342: getfield zS : Lf/tc;
/*    */     //   345: getfield kK0 : Lf/Z50;
/*    */     //   348: getstatic f/Z50.RE0 : Lf/Z50;
/*    */     //   351: if_acmpne -> 366
/*    */     //   354: aload_1
/*    */     //   355: invokestatic vY : ()Lf/zp0;
/*    */     //   358: getfield ka0 : [Lf/lpt1;
/*    */     //   361: iconst_3
/*    */     //   362: aaload
/*    */     //   363: putfield YB : Lf/lpt1;
/*    */     //   366: aload_1
/*    */     //   367: getfield zS : Lf/tc;
/*    */     //   370: dup
/*    */     //   371: astore #4
/*    */     //   373: getfield kK0 : Lf/Z50;
/*    */     //   376: getstatic f/Z50.xO : Lf/Z50;
/*    */     //   379: if_acmpne -> 390
/*    */     //   382: aload #4
/*    */     //   384: getstatic f/Z50.yx0 : Lf/Z50;
/*    */     //   387: invokevirtual q90 : (Lf/Z50;)V
/*    */     //   390: aload_1
/*    */     //   391: getfield zS : Lf/tc;
/*    */     //   394: getfield pm : Lf/d7;
/*    */     //   397: invokevirtual si0 : ()V
/*    */     //   400: getstatic f/km.a3 : Lf/vh0;
/*    */     //   403: aload_1
/*    */     //   404: getfield zS : Lf/tc;
/*    */     //   407: getfield HW : Lf/G5;
/*    */     //   410: dup
/*    */     //   411: dup
/*    */     //   412: getfield FB : B
/*    */     //   415: istore #4
/*    */     //   417: getfield kD0 : B
/*    */     //   420: istore #5
/*    */     //   422: getfield vu0 : B
/*    */     //   425: istore #6
/*    */     //   427: iload #4
/*    */     //   429: iload #5
/*    */     //   431: iload #6
/*    */     //   433: invokevirtual COm8 : (BBB)Lf/KI;
/*    */     //   436: ifnonnull -> 442
/*    */     //   439: goto -> 959
/*    */     //   442: aload_1
/*    */     //   443: getfield zS : Lf/tc;
/*    */     //   446: dup
/*    */     //   447: astore #4
/*    */     //   449: getfield HW : Lf/G5;
/*    */     //   452: dup
/*    */     //   453: astore #5
/*    */     //   455: getfield FB : B
/*    */     //   458: iconst_3
/*    */     //   459: if_icmpne -> 594
/*    */     //   462: aload #4
/*    */     //   464: instanceof f/Jo
/*    */     //   467: ifeq -> 594
/*    */     //   470: aload #5
/*    */     //   472: getfield LB0 : Z
/*    */     //   475: ifeq -> 559
/*    */     //   478: aload_1
/*    */     //   479: aload #4
/*    */     //   481: invokevirtual default : ()Lf/static;
/*    */     //   484: aload_1
/*    */     //   485: getfield zS : Lf/tc;
/*    */     //   488: getfield HW : Lf/G5;
/*    */     //   491: dup
/*    */     //   492: astore #4
/*    */     //   494: getfield g50 : B
/*    */     //   497: aload #4
/*    */     //   499: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   502: invokevirtual Kn : ()F
/*    */     //   505: invokestatic IS : (BF)B
/*    */     //   508: putfield G30 : B
/*    */     //   511: getfield zS : Lf/tc;
/*    */     //   514: getfield Ae : Lf/zk0;
/*    */     //   517: dup
/*    */     //   518: astore #4
/*    */     //   520: ifnull -> 594
/*    */     //   523: aload #4
/*    */     //   525: getfield Y1 : Lf/static;
/*    */     //   528: checkcast f/yF
/*    */     //   531: aload #4
/*    */     //   533: getfield HW : Lf/G5;
/*    */     //   536: dup
/*    */     //   537: astore #4
/*    */     //   539: getfield g50 : B
/*    */     //   542: aload #4
/*    */     //   544: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   547: invokevirtual Kn : ()F
/*    */     //   550: invokestatic IS : (BF)B
/*    */     //   553: putfield G30 : B
/*    */     //   556: goto -> 594
/*    */     //   559: aload #4
/*    */     //   561: getfield Ae : Lf/zk0;
/*    */     //   564: dup
/*    */     //   565: astore #4
/*    */     //   567: ifnull -> 594
/*    */     //   570: aload #4
/*    */     //   572: getfield Y1 : Lf/static;
/*    */     //   575: checkcast f/yF
/*    */     //   578: dup
/*    */     //   579: astore #4
/*    */     //   581: getfield G30 : B
/*    */     //   584: iconst_m1
/*    */     //   585: if_icmpeq -> 594
/*    */     //   588: aload #4
/*    */     //   590: iconst_m1
/*    */     //   591: putfield G30 : B
/*    */     //   594: aload_1
/*    */     //   595: dup
/*    */     //   596: dup2
/*    */     //   597: getfield lpt8 : Lf/eo;
/*    */     //   600: aload_1
/*    */     //   601: getfield zS : Lf/tc;
/*    */     //   604: getfield pm : Lf/d7;
/*    */     //   607: getfield cOm3 : Lf/eo;
/*    */     //   610: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   613: pop
/*    */     //   614: getfield lpt8 : Lf/eo;
/*    */     //   617: ldc_w 0.25
/*    */     //   620: invokevirtual uu : (F)Lf/eo;
/*    */     //   623: pop
/*    */     //   624: getfield lpt8 : Lf/eo;
/*    */     //   627: dup
/*    */     //   628: dup2
/*    */     //   629: getfield y : F
/*    */     //   632: fstore #4
/*    */     //   634: getfield z : F
/*    */     //   637: putfield y : F
/*    */     //   640: fload #4
/*    */     //   642: putfield z : F
/*    */     //   645: getfield zS : Lf/tc;
/*    */     //   648: dup
/*    */     //   649: astore #4
/*    */     //   651: getfield HW : Lf/G5;
/*    */     //   654: getfield FB : B
/*    */     //   657: iconst_4
/*    */     //   658: if_icmpne -> 835
/*    */     //   661: aload #4
/*    */     //   663: invokevirtual D4 : ()S
/*    */     //   666: sipush #251
/*    */     //   669: if_icmpeq -> 820
/*    */     //   672: aload_1
/*    */     //   673: getfield zS : Lf/tc;
/*    */     //   676: invokevirtual D4 : ()S
/*    */     //   679: sipush #252
/*    */     //   682: if_icmpeq -> 820
/*    */     //   685: aload_1
/*    */     //   686: getfield zS : Lf/tc;
/*    */     //   689: invokevirtual my : ()B
/*    */     //   692: bipush #10
/*    */     //   694: if_icmpne -> 713
/*    */     //   697: aload_1
/*    */     //   698: getfield zS : Lf/tc;
/*    */     //   701: invokevirtual D4 : ()S
/*    */     //   704: sipush #201
/*    */     //   707: if_icmpne -> 713
/*    */     //   710: goto -> 820
/*    */     //   713: aload_1
/*    */     //   714: dup
/*    */     //   715: getfield lpt8 : Lf/eo;
/*    */     //   718: dup
/*    */     //   719: dup2
/*    */     //   720: getfield y : F
/*    */     //   723: ldc_w 0.03
/*    */     //   726: fadd
/*    */     //   727: putfield y : F
/*    */     //   730: getfield z : F
/*    */     //   733: ldc_w 0.09
/*    */     //   736: fadd
/*    */     //   737: putfield z : F
/*    */     //   740: getfield zS : Lf/tc;
/*    */     //   743: invokevirtual zl : ()Z
/*    */     //   746: ifeq -> 835
/*    */     //   749: aload_1
/*    */     //   750: getfield zS : Lf/tc;
/*    */     //   753: invokevirtual D4 : ()S
/*    */     //   756: sipush #425
/*    */     //   759: if_icmpne -> 791
/*    */     //   762: aload_1
/*    */     //   763: getfield lpt8 : Lf/eo;
/*    */     //   766: dup
/*    */     //   767: dup2
/*    */     //   768: getfield y : F
/*    */     //   771: ldc_w 0.05
/*    */     //   774: fadd
/*    */     //   775: putfield y : F
/*    */     //   778: getfield z : F
/*    */     //   781: ldc_w 0.05
/*    */     //   784: fadd
/*    */     //   785: putfield z : F
/*    */     //   788: goto -> 835
/*    */     //   791: aload_1
/*    */     //   792: getfield lpt8 : Lf/eo;
/*    */     //   795: dup
/*    */     //   796: dup2
/*    */     //   797: getfield z : F
/*    */     //   800: ldc_w 0.05
/*    */     //   803: fsub
/*    */     //   804: putfield z : F
/*    */     //   807: getfield y : F
/*    */     //   810: ldc_w 0.075
/*    */     //   813: fsub
/*    */     //   814: putfield y : F
/*    */     //   817: goto -> 835
/*    */     //   820: aload_1
/*    */     //   821: getfield lpt8 : Lf/eo;
/*    */     //   824: dup
/*    */     //   825: getfield z : F
/*    */     //   828: ldc_w 0.05
/*    */     //   831: fadd
/*    */     //   832: putfield z : F
/*    */     //   835: aload_1
/*    */     //   836: dup
/*    */     //   837: dup
/*    */     //   838: getfield lpt8 : Lf/eo;
/*    */     //   841: fconst_0
/*    */     //   842: ldc_w 0.225
/*    */     //   845: ldc_w -0.05
/*    */     //   848: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   851: pop
/*    */     //   852: getfield zS : Lf/tc;
/*    */     //   855: getfield pm : Lf/d7;
/*    */     //   858: getfield Mv : Lf/nl;
/*    */     //   861: astore #4
/*    */     //   863: aconst_null
/*    */     //   864: aload_0
/*    */     //   865: aload_3
/*    */     //   866: aload_2
/*    */     //   867: aload #4
/*    */     //   869: invokevirtual Vn : (Lf/tH;Lf/K70;Lf/Ih0;Lf/fo0;Lf/nl;)Z
/*    */     //   872: ifeq -> 878
/*    */     //   875: goto -> 959
/*    */     //   878: aload_1
/*    */     //   879: getfield zS : Lf/tc;
/*    */     //   882: dup
/*    */     //   883: astore_3
/*    */     //   884: instanceof f/Kr0
/*    */     //   887: ifeq -> 906
/*    */     //   890: aload_3
/*    */     //   891: checkcast f/Kr0
/*    */     //   894: getfield Lq : Lf/V4;
/*    */     //   897: getfield L7 : Z
/*    */     //   900: ifeq -> 906
/*    */     //   903: goto -> 959
/*    */     //   906: aload_1
/*    */     //   907: aconst_null
/*    */     //   908: invokevirtual fY : (Lf/tH;)Z
/*    */     //   911: ifeq -> 917
/*    */     //   914: goto -> 959
/*    */     //   917: aload_1
/*    */     //   918: aconst_null
/*    */     //   919: aload_0
/*    */     //   920: aload_2
/*    */     //   921: invokevirtual kE0 : (Lf/tH;Lf/K70;Lf/fo0;)Z
/*    */     //   924: ifeq -> 930
/*    */     //   927: goto -> 959
/*    */     //   930: aload_1
/*    */     //   931: invokevirtual DE0 : ()B
/*    */     //   934: dup
/*    */     //   935: istore_3
/*    */     //   936: iconst_3
/*    */     //   937: if_icmpne -> 943
/*    */     //   940: iinc #3, -1
/*    */     //   943: aload_1
/*    */     //   944: aload_0
/*    */     //   945: aload_1
/*    */     //   946: getfield zS : Lf/tc;
/*    */     //   949: invokevirtual D4 : ()S
/*    */     //   952: pop
/*    */     //   953: aload_2
/*    */     //   954: iload_3
/*    */     //   955: iconst_0
/*    */     //   956: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   959: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 12
/*    */     //   #2	-> 24
/*    */     //   #3	-> 33
/*    */     //   #4	-> 49
/*    */     //   #5	-> 71
/*    */     //   #6	-> 74
/*    */     //   #7	-> 79
/*    */     //   #8	-> 82
/*    */     //   #9	-> 100
/*    */     //   #10	-> 104
/*    */     //   #11	-> 107
/*    */     //   #12	-> 110
/*    */     //   #13	-> 113
/*    */     //   #14	-> 116
/*    */     //   #15	-> 123
/*    */     //   #16	-> 134
/*    */     //   #17	-> 218
/*    */     //   #18	-> 222
/*    */     //   #19	-> 227
/*    */     //   #20	-> 230
/*    */     //   #21	-> 234
/*    */     //   #22	-> 239
/*    */     //   #23	-> 242
/*    */     //   #24	-> 246
/*    */     //   #25	-> 247
/*    */     //   #26	-> 265
/*    */     //   #27	-> 269
/*    */     //   #28	-> 270
/*    */     //   #29	-> 281
/*    */     //   #30	-> 288
/*    */     //   #31	-> 345
/*    */     //   #32	-> 348
/*    */     //   #33	-> 358
/*    */     //   #34	-> 362
/*    */     //   #35	-> 363
/*    */     //   #36	-> 373
/*    */     //   #37	-> 376
/*    */     //   #38	-> 394
/*    */     //   #39	-> 397
/*    */     //   #40	-> 407
/*    */     //   #41	-> 412
/*    */     //   #42	-> 417
/*    */     //   #43	-> 422
/*    */     //   #44	-> 433
/*    */     //   #45	-> 449
/*    */     //   #46	-> 455
/*    */     //   #47	-> 464
/*    */     //   #48	-> 472
/*    */     //   #49	-> 481
/*    */     //   #50	-> 488
/*    */     //   #51	-> 494
/*    */     //   #52	-> 499
/*    */     //   #53	-> 508
/*    */     //   #54	-> 511
/*    */     //   #55	-> 514
/*    */     //   #56	-> 525
/*    */     //   #57	-> 528
/*    */     //   #58	-> 533
/*    */     //   #59	-> 539
/*    */     //   #60	-> 544
/*    */     //   #61	-> 553
/*    */     //   #62	-> 561
/*    */     //   #63	-> 572
/*    */     //   #64	-> 575
/*    */     //   #65	-> 581
/*    */     //   #66	-> 591
/*    */     //   #67	-> 597
/*    */     //   #68	-> 604
/*    */     //   #69	-> 607
/*    */     //   #70	-> 610
/*    */     //   #71	-> 651
/*    */     //   #72	-> 654
/*    */     //   #73	-> 663
/*    */     //   #74	-> 855
/*    */     //   #75	-> 858
/*    */     //   #76	-> 869
/*    */     //   #77	-> 894
/*    */     //   #78	-> 897
/*    */     //   #79	-> 908 } public final boolean Wp0(KI paramKI) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokespecial Wp0 : (Lf/KI;)Z
/*    */     //   5: ifeq -> 985
/*    */     //   8: getstatic f/Bz.fn : Z
/*    */     //   11: ifeq -> 985
/*    */     //   14: getstatic f/UB0.PU : Lf/aY;
/*    */     //   17: bipush #46
/*    */     //   19: invokevirtual j2 : (I)Z
/*    */     //   22: ifeq -> 276
/*    */     //   25: getstatic f/UB0.PU : Lf/aY;
/*    */     //   28: sipush #129
/*    */     //   31: invokevirtual Ak : (I)Z
/*    */     //   34: ifeq -> 276
/*    */     //   37: getstatic f/UB0.PU : Lf/aY;
/*    */     //   40: bipush #59
/*    */     //   42: invokevirtual Ak : (I)Z
/*    */     //   45: ifeq -> 272
/*    */     //   48: getstatic f/jp0.k60 : Lf/ik;
/*    */     //   51: dup
/*    */     //   52: astore_2
/*    */     //   53: ldc_w 'Reloading shaders.'
/*    */     //   56: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   61: new f/xh
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: dup2
/*    */     //   67: astore_3
/*    */     //   68: aload_0
/*    */     //   69: invokestatic La0 : ()Ljava/lang/String;
/*    */     //   72: astore #4
/*    */     //   74: invokestatic h40 : ()Ljava/lang/String;
/*    */     //   77: astore #5
/*    */     //   79: getfield DE0 : Lf/wI0;
/*    */     //   82: astore #6
/*    */     //   84: aload #4
/*    */     //   86: aload #5
/*    */     //   88: aload #6
/*    */     //   90: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lf/wI0;)V
/*    */     //   93: iconst_1
/*    */     //   94: putfield Ug0 : I
/*    */     //   97: iconst_1
/*    */     //   98: putfield hX : I
/*    */     //   101: bipush #32
/*    */     //   103: putfield xu : I
/*    */     //   106: aconst_null
/*    */     //   107: astore #4
/*    */     //   109: new f/Rm0
/*    */     //   112: dup
/*    */     //   113: dup
/*    */     //   114: astore #5
/*    */     //   116: invokestatic La0 : ()Ljava/lang/String;
/*    */     //   119: invokestatic h40 : ()Ljava/lang/String;
/*    */     //   122: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   125: getfield Xu0 : Z
/*    */     //   128: ifeq -> 191
/*    */     //   131: aload #5
/*    */     //   133: invokevirtual ET : ()Ljava/lang/String;
/*    */     //   136: invokevirtual isEmpty : ()Z
/*    */     //   139: ifeq -> 191
/*    */     //   142: aload_0
/*    */     //   143: dup
/*    */     //   144: aload_2
/*    */     //   145: ldc_w 'Shader compiled successfully'
/*    */     //   148: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   153: getfield E40 : Lf/K70;
/*    */     //   156: invokevirtual dispose : ()V
/*    */     //   159: new f/K70
/*    */     //   162: dup
/*    */     //   163: new f/Lpt3
/*    */     //   166: dup
/*    */     //   167: aload_3
/*    */     //   168: aload_0
/*    */     //   169: getfield DE0 : Lf/wI0;
/*    */     //   172: invokespecial <init> : (Lf/xh;Lf/wI0;)V
/*    */     //   175: new f/lt
/*    */     //   178: dup
/*    */     //   179: invokespecial <init> : ()V
/*    */     //   182: invokespecial <init> : (Lf/synchronized;Lf/KG;)V
/*    */     //   185: putfield E40 : Lf/K70;
/*    */     //   188: goto -> 230
/*    */     //   191: aload #5
/*    */     //   193: getfield Xu0 : Z
/*    */     //   196: ifeq -> 210
/*    */     //   199: aload #5
/*    */     //   201: invokevirtual ET : ()Ljava/lang/String;
/*    */     //   204: invokevirtual isEmpty : ()Z
/*    */     //   207: ifne -> 230
/*    */     //   210: aload_2
/*    */     //   211: aload #5
/*    */     //   213: aload_2
/*    */     //   214: ldc_w 'Shader failed to compile:'
/*    */     //   217: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   222: invokevirtual ET : ()Ljava/lang/String;
/*    */     //   225: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   230: aload #5
/*    */     //   232: astore #4
/*    */     //   234: goto -> 246
/*    */     //   237: astore_0
/*    */     //   238: goto -> 270
/*    */     //   241: astore_2
/*    */     //   242: aload_2
/*    */     //   243: invokevirtual printStackTrace : ()V
/*    */     //   246: aload #4
/*    */     //   248: ifnull -> 263
/*    */     //   251: aload #4
/*    */     //   253: getfield Xu0 : Z
/*    */     //   256: ifeq -> 263
/*    */     //   259: iconst_1
/*    */     //   260: goto -> 264
/*    */     //   263: iconst_0
/*    */     //   264: ifeq -> 276
/*    */     //   267: goto -> 272
/*    */     //   270: aload_0
/*    */     //   271: athrow
/*    */     //   272: aload_0
/*    */     //   273: invokevirtual AP : ()V
/*    */     //   276: getstatic f/UB0.PU : Lf/aY;
/*    */     //   279: bipush #58
/*    */     //   281: invokevirtual j2 : (I)Z
/*    */     //   284: ifeq -> 303
/*    */     //   287: aload_0
/*    */     //   288: getfield Lz0 : Lf/HV;
/*    */     //   291: ifnull -> 303
/*    */     //   294: aload_0
/*    */     //   295: aload_1
/*    */     //   296: checkcast f/Cy
/*    */     //   299: pop
/*    */     //   300: invokevirtual rJ : ()V
/*    */     //   303: getstatic f/km.iE0 : Lf/r9;
/*    */     //   306: getstatic f/UB0.PU : Lf/aY;
/*    */     //   309: bipush #60
/*    */     //   311: invokevirtual Ak : (I)Z
/*    */     //   314: pop
/*    */     //   315: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   318: pop
/*    */     //   319: getstatic f/UB0.PU : Lf/aY;
/*    */     //   322: bipush #59
/*    */     //   324: invokevirtual Ak : (I)Z
/*    */     //   327: ifeq -> 505
/*    */     //   330: getstatic f/UB0.PU : Lf/aY;
/*    */     //   333: sipush #129
/*    */     //   336: invokevirtual Ak : (I)Z
/*    */     //   339: ifne -> 505
/*    */     //   342: getstatic f/UB0.PU : Lf/aY;
/*    */     //   345: bipush #45
/*    */     //   347: invokevirtual j2 : (I)Z
/*    */     //   350: ifeq -> 476
/*    */     //   353: aload_0
/*    */     //   354: getfield wJ : Z
/*    */     //   357: ifne -> 466
/*    */     //   360: aload_0
/*    */     //   361: dup
/*    */     //   362: dup2
/*    */     //   363: getfield Z5 : Lf/Ih0;
/*    */     //   366: getfield Ah : Lf/eo;
/*    */     //   369: aload_0
/*    */     //   370: getfield To0 : Lf/Ih0;
/*    */     //   373: getfield Ah : Lf/eo;
/*    */     //   376: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   379: pop
/*    */     //   380: getfield Z5 : Lf/Ih0;
/*    */     //   383: getfield I70 : Lf/eo;
/*    */     //   386: aload_0
/*    */     //   387: getfield To0 : Lf/Ih0;
/*    */     //   390: getfield I70 : Lf/eo;
/*    */     //   393: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   396: pop
/*    */     //   397: getfield Z5 : Lf/Ih0;
/*    */     //   400: dup
/*    */     //   401: astore_1
/*    */     //   402: aload_0
/*    */     //   403: getfield To0 : Lf/Ih0;
/*    */     //   406: dup
/*    */     //   407: astore_2
/*    */     //   408: aload_1
/*    */     //   409: aload_2
/*    */     //   410: aload_1
/*    */     //   411: aload_2
/*    */     //   412: aload_1
/*    */     //   413: aload_2
/*    */     //   414: getfield IG0 : F
/*    */     //   417: putfield IG0 : F
/*    */     //   420: getfield Mp : F
/*    */     //   423: putfield Mp : F
/*    */     //   426: getfield el0 : F
/*    */     //   429: ldc_w 10.0
/*    */     //   432: fadd
/*    */     //   433: putfield el0 : F
/*    */     //   436: getfield Ah : Lf/eo;
/*    */     //   439: dup
/*    */     //   440: dup
/*    */     //   441: getfield x : F
/*    */     //   444: fstore_1
/*    */     //   445: getfield y : F
/*    */     //   448: fstore_2
/*    */     //   449: getfield z : F
/*    */     //   452: fstore_3
/*    */     //   453: fload_1
/*    */     //   454: fload_2
/*    */     //   455: fload_3
/*    */     //   456: invokevirtual mP : (FFF)V
/*    */     //   459: getfield Z5 : Lf/Ih0;
/*    */     //   462: iconst_0
/*    */     //   463: invokevirtual abstract : (Z)V
/*    */     //   466: aload_0
/*    */     //   467: dup
/*    */     //   468: getfield wJ : Z
/*    */     //   471: iconst_1
/*    */     //   472: ixor
/*    */     //   473: putfield wJ : Z
/*    */     //   476: aload_0
/*    */     //   477: getfield wJ : Z
/*    */     //   480: ifeq -> 505
/*    */     //   483: getstatic f/UB0.PU : Lf/aY;
/*    */     //   486: sipush #131
/*    */     //   489: invokevirtual j2 : (I)Z
/*    */     //   492: ifeq -> 505
/*    */     //   495: aload_0
/*    */     //   496: dup
/*    */     //   497: getfield uI : Z
/*    */     //   500: iconst_1
/*    */     //   501: ixor
/*    */     //   502: putfield uI : Z
/*    */     //   505: getstatic f/UB0.PU : Lf/aY;
/*    */     //   508: bipush #59
/*    */     //   510: invokevirtual Ak : (I)Z
/*    */     //   513: ifeq -> 695
/*    */     //   516: getstatic f/UB0.PU : Lf/aY;
/*    */     //   519: sipush #129
/*    */     //   522: invokevirtual Ak : (I)Z
/*    */     //   525: ifeq -> 695
/*    */     //   528: getstatic f/UB0.PU : Lf/aY;
/*    */     //   531: bipush #112
/*    */     //   533: invokevirtual j2 : (I)Z
/*    */     //   536: ifeq -> 695
/*    */     //   539: getstatic f/km.a3 : Lf/vh0;
/*    */     //   542: dup
/*    */     //   543: astore_1
/*    */     //   544: getfield KO : Ljava/util/concurrent/ConcurrentHashMap;
/*    */     //   547: invokevirtual keys : ()Ljava/util/Enumeration;
/*    */     //   550: astore_2
/*    */     //   551: aload_2
/*    */     //   552: invokeinterface hasMoreElements : ()Z
/*    */     //   557: ifeq -> 695
/*    */     //   560: aload_1
/*    */     //   561: aload_2
/*    */     //   562: invokeinterface nextElement : ()Ljava/lang/Object;
/*    */     //   567: checkcast java/lang/Integer
/*    */     //   570: invokevirtual intValue : ()I
/*    */     //   573: istore_3
/*    */     //   574: getfield yD : I
/*    */     //   577: iload_3
/*    */     //   578: if_icmpne -> 589
/*    */     //   581: aload_1
/*    */     //   582: aconst_null
/*    */     //   583: putfield Ct : Lf/Jo;
/*    */     //   586: goto -> 551
/*    */     //   589: aload_1
/*    */     //   590: getfield Ct : Lf/Jo;
/*    */     //   593: dup
/*    */     //   594: astore #4
/*    */     //   596: ifnull -> 626
/*    */     //   599: aload #4
/*    */     //   601: getfield pJ : Lf/Kr0;
/*    */     //   604: dup
/*    */     //   605: astore #5
/*    */     //   607: ifnull -> 626
/*    */     //   610: aload #5
/*    */     //   612: getfield Jg : I
/*    */     //   615: iload_3
/*    */     //   616: if_icmpne -> 626
/*    */     //   619: aload #4
/*    */     //   621: aconst_null
/*    */     //   622: iconst_0
/*    */     //   623: invokevirtual mA0 : (Lf/Kr0;Z)V
/*    */     //   626: aload_1
/*    */     //   627: getfield KO : Ljava/util/concurrent/ConcurrentHashMap;
/*    */     //   630: iload_3
/*    */     //   631: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   634: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   637: pop
/*    */     //   638: getstatic f/km.si0 : Lf/My;
/*    */     //   641: dup
/*    */     //   642: astore #4
/*    */     //   644: getfield qb : Lf/Ut0;
/*    */     //   647: iload_3
/*    */     //   648: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   651: checkcast f/WX
/*    */     //   654: dup
/*    */     //   655: astore #5
/*    */     //   657: ifnull -> 668
/*    */     //   660: aload #4
/*    */     //   662: aload #5
/*    */     //   664: invokevirtual jf0 : (Lf/JG0;)Z
/*    */     //   667: pop
/*    */     //   668: aload #4
/*    */     //   670: getfield l3 : Lf/Ut0;
/*    */     //   673: iload_3
/*    */     //   674: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   677: checkcast f/JG0
/*    */     //   680: dup
/*    */     //   681: astore_3
/*    */     //   682: ifnull -> 551
/*    */     //   685: aload #4
/*    */     //   687: aload_3
/*    */     //   688: invokevirtual jf0 : (Lf/JG0;)Z
/*    */     //   691: pop
/*    */     //   692: goto -> 551
/*    */     //   695: getstatic f/UB0.PU : Lf/aY;
/*    */     //   698: sipush #136
/*    */     //   701: invokevirtual j2 : (I)Z
/*    */     //   704: ifeq -> 728
/*    */     //   707: aload_0
/*    */     //   708: dup
/*    */     //   709: getfield B5 : Lf/eo;
/*    */     //   712: invokevirtual gL : ()Lf/eo;
/*    */     //   715: iconst_0
/*    */     //   716: swap
/*    */     //   717: iconst_0
/*    */     //   718: iconst_0
/*    */     //   719: iconst_0
/*    */     //   720: iconst_0
/*    */     //   721: invokevirtual rS : (BLf/eo;IZZZ)Z
/*    */     //   724: pop
/*    */     //   725: goto -> 824
/*    */     //   728: getstatic f/UB0.PU : Lf/aY;
/*    */     //   731: sipush #137
/*    */     //   734: invokevirtual j2 : (I)Z
/*    */     //   737: ifeq -> 761
/*    */     //   740: aload_0
/*    */     //   741: dup
/*    */     //   742: getfield B5 : Lf/eo;
/*    */     //   745: invokevirtual gL : ()Lf/eo;
/*    */     //   748: iconst_0
/*    */     //   749: swap
/*    */     //   750: iconst_1
/*    */     //   751: iconst_0
/*    */     //   752: iconst_0
/*    */     //   753: iconst_0
/*    */     //   754: invokevirtual rS : (BLf/eo;IZZZ)Z
/*    */     //   757: pop
/*    */     //   758: goto -> 824
/*    */     //   761: getstatic f/UB0.PU : Lf/aY;
/*    */     //   764: sipush #138
/*    */     //   767: invokevirtual j2 : (I)Z
/*    */     //   770: ifeq -> 794
/*    */     //   773: aload_0
/*    */     //   774: dup
/*    */     //   775: getfield B5 : Lf/eo;
/*    */     //   778: invokevirtual gL : ()Lf/eo;
/*    */     //   781: iconst_0
/*    */     //   782: swap
/*    */     //   783: iconst_2
/*    */     //   784: iconst_0
/*    */     //   785: iconst_0
/*    */     //   786: iconst_0
/*    */     //   787: invokevirtual rS : (BLf/eo;IZZZ)Z
/*    */     //   790: pop
/*    */     //   791: goto -> 824
/*    */     //   794: getstatic f/UB0.PU : Lf/aY;
/*    */     //   797: sipush #139
/*    */     //   800: invokevirtual j2 : (I)Z
/*    */     //   803: ifeq -> 824
/*    */     //   806: aload_0
/*    */     //   807: dup
/*    */     //   808: getfield B5 : Lf/eo;
/*    */     //   811: invokevirtual gL : ()Lf/eo;
/*    */     //   814: iconst_0
/*    */     //   815: swap
/*    */     //   816: iconst_3
/*    */     //   817: iconst_0
/*    */     //   818: iconst_0
/*    */     //   819: iconst_0
/*    */     //   820: invokevirtual rS : (BLf/eo;IZZZ)Z
/*    */     //   823: pop
/*    */     //   824: getstatic f/UB0.PU : Lf/aY;
/*    */     //   827: astore_1
/*    */     //   828: iconst_1
/*    */     //   829: dup
/*    */     //   830: istore_2
/*    */     //   831: aload_1
/*    */     //   832: getfield Rw : [Z
/*    */     //   835: dup
/*    */     //   836: astore_1
/*    */     //   837: arraylength
/*    */     //   838: if_icmplt -> 846
/*    */     //   841: iconst_0
/*    */     //   842: istore_1
/*    */     //   843: goto -> 850
/*    */     //   846: aload_1
/*    */     //   847: iload_2
/*    */     //   848: baload
/*    */     //   849: istore_1
/*    */     //   850: iload_1
/*    */     //   851: ifeq -> 985
/*    */     //   854: aload_0
/*    */     //   855: dup
/*    */     //   856: new f/eo
/*    */     //   859: invokespecial <init> : ()V
/*    */     //   862: invokevirtual zf0 : ()Lf/Ih0;
/*    */     //   865: dup
/*    */     //   866: dup2
/*    */     //   867: dup2
/*    */     //   868: getstatic f/UB0.PU : Lf/aY;
/*    */     //   871: dup
/*    */     //   872: getfield XK0 : I
/*    */     //   875: i2f
/*    */     //   876: fstore_0
/*    */     //   877: getfield ol : I
/*    */     //   880: i2f
/*    */     //   881: fstore_1
/*    */     //   882: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   885: pop
/*    */     //   886: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   889: invokevirtual fG0 : ()I
/*    */     //   892: i2f
/*    */     //   893: fstore_2
/*    */     //   894: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   897: invokevirtual dL : ()I
/*    */     //   900: i2f
/*    */     //   901: fstore_3
/*    */     //   902: getfield H90 : Lf/p10;
/*    */     //   905: getfield xh : Lf/eo;
/*    */     //   908: fload_0
/*    */     //   909: fload_1
/*    */     //   910: fconst_0
/*    */     //   911: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   914: fconst_0
/*    */     //   915: fconst_0
/*    */     //   916: fload_2
/*    */     //   917: fload_3
/*    */     //   918: invokevirtual Ix0 : (Lf/eo;FFFF)V
/*    */     //   921: getfield H90 : Lf/p10;
/*    */     //   924: getfield N6 : Lf/eo;
/*    */     //   927: fload_0
/*    */     //   928: fload_1
/*    */     //   929: fconst_1
/*    */     //   930: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   933: fconst_0
/*    */     //   934: fconst_0
/*    */     //   935: fload_2
/*    */     //   936: fload_3
/*    */     //   937: invokevirtual Ix0 : (Lf/eo;FFFF)V
/*    */     //   940: getfield H90 : Lf/p10;
/*    */     //   943: dup
/*    */     //   944: astore_0
/*    */     //   945: getfield N6 : Lf/eo;
/*    */     //   948: aload_0
/*    */     //   949: getfield xh : Lf/eo;
/*    */     //   952: invokevirtual zy0 : (Lf/eo;)Lf/eo;
/*    */     //   955: invokevirtual WC0 : ()Lf/eo;
/*    */     //   958: pop
/*    */     //   959: iconst_0
/*    */     //   960: istore_0
/*    */     //   961: getfield tm : Lf/fQ;
/*    */     //   964: dup
/*    */     //   965: astore_1
/*    */     //   966: getfield Z8 : I
/*    */     //   969: ifgt -> 975
/*    */     //   972: goto -> 985
/*    */     //   975: aload_1
/*    */     //   976: iload_0
/*    */     //   977: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   980: invokestatic Av : (Ljava/lang/Object;)V
/*    */     //   983: aconst_null
/*    */     //   984: athrow
/*    */     //   985: iconst_1
/*    */     //   986: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 48
/*    */     //   #2	-> 125
/*    */     //   #3	-> 133
/*    */     //   #4	-> 193
/*    */     //   #5	-> 201
/*    */     //   #6	-> 253
/*    */     //   #7	-> 271
/*    */     //   #8	-> 273
/*    */     //   #9	-> 354
/*    */     //   #10	-> 477
/*    */     //   #11	-> 544
/*    */     //   #12	-> 547
/*    */     //   #13	-> 574
/*    */     //   #14	-> 601
/*    */     //   #15	-> 612
/*    */     //   #16	-> 623
/*    */     //   #17	-> 627
/*    */     //   #18	-> 644
/*    */     //   #19	-> 648
/*    */     //   #20	-> 695
/*    */     //   #21	-> 832
/*    */     //   #22	-> 837
/*    */     //   #23	-> 856
/*    */     //   #24	-> 872
/*    */     //   #25	-> 877
/*    */     //   #26	-> 882
/*    */     //   #27	-> 886
/*    */     //   #28	-> 902
/*    */     //   #29	-> 961
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   109	112	241	java/lang/Exception
/*    */     //   109	112	237	finally
/*    */     //   116	125	241	java/lang/Exception
/*    */     //   116	125	237	finally
/*  6 */     //   242	246	237	finally } public final void PL0() { Cy cy = (Cy)km.a3.Jr0(); Jo jo; vh0 vh0; if ((vh0 = km.a3) != null && (jo = vh0.Ct) != null) { Iterator<tc> iterator; int i; if ((i = h1.Ek()) < 1) { for (iterator = km.a3.iterator(); iterator.hasNext(); ) { tc tc; (tc = iterator.next()).getClass(); if ((tc)iterator.next() instanceof Jo) { Jo jo1; Tw(jo1 = (Jo)tc); if (Hk.Ki0) jo1.J
/*  7 */                 .fH(false, false);  }  if (tc.AJ0())
/*    */           {
/*  9 */             Tw(tc.Ae); }  }  if (Hk.Ki0) Hk.Ki0 = false;  for (iterator = km.a3.iterator(); iterator.hasNext(); ) { tc tc; (tc = iterator.next()).getClass();
/* 10 */           if (!((tc)iterator.next() instanceof Jo))
/* 11 */             Tw(tc);  }  } else { V6 v61, v62; Hk.Ki0 = true;
/*    */         
/* 13 */         float f1 = jo.HW.mm;
/* 14 */         float f2 = jo.HW.Yu0;
/* 15 */         float f3 = jo.HW.VI0();
/* 16 */         this.fY.TG0(f1, f2, f3); for (Iterator<tc> iterator1 = km.a3.iterator(); iterator1.hasNext(); ) { tc tc; (tc = iterator1.next()).getClass(); if ((tc)iterator1.next() instanceof Jo)
/*    */           
/*    */           { 
/*    */             
/* 20 */             f3 = tc.HW.mm;
/* 21 */             float f4 = tc.HW.Yu0;
/* 22 */             float f5 = tc.HW.VI0();
/*    */             
/* 24 */             ((Jo)(tc = tc)).xc = this.fY.Cl0(f3, f4, f5);
/* 25 */             this.AuX.Com3(tc); }  }  this.AuX.sort(Jo.of); this(); this(); byte b; int k; for (b = 0, k = this.AuX.Z8; b < k; )
/*    */         { Jo jo1; G5 g5; int m;
/* 27 */           if (!(jo1 = (Jo)this.AuX.get(b)).pm.n3 && 
/*    */ 
/*    */ 
/*    */             
/* 31 */             !v61.return(m = (g5 = jo1.HW).mm | g5.Yu0 << 16)) { v61.uX(m); v62
/*    */               
/* 33 */               .uX(jo1.Jg); }  b++; }  for (int j = 0; b < k; ) { boolean bool1 = false, bool2 = true;
/*    */           Jo jo1;
/* 35 */           if (!(jo1 = (Jo)this.AuX.get(k - b - 1)).pm.n3 && 
/*    */             
/* 37 */             !v62.return(jo1.Jg)) { bool1 = true; bool2 = false; } else if (++j > iterator) { bool1 = true; }  Tw(jo1); jo1
/* 38 */             .J
/* 39 */             .fH(bool1, bool2); if (jo1.AJ0())
/*    */           {
/* 41 */             Tw(jo1.Ae); }  b++; }  this.AuX.clear(); for (iterator = km.a3.iterator(); iterator.hasNext(); ) { tc tc; (tc = iterator.next()).getClass();
/*    */           
/* 43 */           Tw(tc); if (!((tc)iterator.next() instanceof Jo) && tc.AJ0())
/*    */           {
/* 45 */             Tw(tc.Ae); }  }  }  Tw(jo); if (jo.AJ0())
/*    */       {
/* 47 */         Tw(jo.Ae); }  }
/* 48 */      if (!km.D70(9) || !UB0.PU.Ak(130)) for (Hc0 hc01 = this.wN.r30(); hc01.hasNext(); ) { Ih0 ih0; Ah ah = (Ah)hc01.next(); K70 k70 = this.E40; if (this
/* 49 */           .wJ && !this.uI) { ih0 = this.Z5; } else { ih0 = this.To0; }
/* 50 */          fo0 fo01 = this.cJ0;
/* 51 */         if (ah.K9
/* 52 */           .Re(ih0)) { if (ah.a20 && 
/* 53 */             !Ah.ai0) for (Hc0 hc03 = ah.K9.vC0.r30(); hc03.hasNext(); ah.pRN((zP)hc03.next(), ih0));  k70
/* 54 */             .q10(ah.K9, fo01); for (Hc0 hc02 = ah.W7.r30(); hc02.hasNext(); ) { lpt1 lpt1 = (lpt1)hc02.next(); if (!ah.a20 || lpt1.Re(ih0)) k70.q10(lpt1, fo01);  }  k70.QJ0(ah.J90, fo01); }  }
/* 55 */         me me1; if ((me1 = this.oo0) != null) { Ih0 ih0; K70 k70 = this.E40; if (this
/* 56 */         .wJ && !this.uI) { ih0 = this.Z5; } else { ih0 = this.To0; }  me1
/* 57 */         .Gv0(this.cJ0, k70, ih0); }  fQ fQ1; if (cy != null && (
/* 58 */       fQ1 = cy.ke) != null)
/* 59 */       for (Hc0 hc01 = fQ1.r30(); hc01.hasNext(); ) { xr0 xr0; if ((xr0 = (xr0)hc01.next()).gc()) { xr0
/* 60 */             .gc();
/* 61 */           for (Hc0 hc02 = xr0.Gl.r30(); hc02.hasNext(); ) { K70 k70 = this.E40; fo0 fo01 = this.cJ0; Ih0 ih0 = zf0(); float f1 = xr0.Ka() * 0.25F + 0.125F, f2 = xr0.i00() * 0.25F, f3 = xr0.hA0() * 0.25F + 0.125F; ((xk)hc02.next()).tZ(k70, fo01, ih0, f1, f2, f3); }  continue; }  hc01.remove(); }   Hc0 hc0; if (!(hc0 = this.tm.r30()).hasNext()) { for (hc0 = this.hd0.r30(); hc0.hasNext(); ) { bo0.Av(hc0.next()); this.E40.tx0(null); }  return; }  bo0.Av(hc0.next()); throw null; }
/*    */ 
/*    */   
/*    */   public final void qb0() {
/*    */     super.qb0();
/*    */     K1 k1;
/*    */     (k1 = this.Ze).m30 = this.wJ;
/*    */     if (this.Ze.uq() && (k1.ig || k1.rR || k1.Tx || k1.F2 || k1.sI0 || k1.Y40)) {
/*    */       float f = UB0.M60.Qy;
/*    */       if (UB0.PU.Ak(59))
/*    */         f *= 3.0F; 
/*    */       k1.ri0.jy(k1.T70.JL(k1.ri0.yF).Nz(k1.ri0.nj0).WC0().uu(-f * k1.qk));
/*    */       if (k1.ig && k1.he) {
/*    */         k1.ri0.I70.zT(k1.T70);
/*    */         k1.XD0.zT(k1.T70);
/*    */       } 
/*    */       k1.ri0.jy(k1.T70.JL(k1.ri0.yF).Nz(k1.ri0.nj0).WC0().uu(f * k1.qk));
/*    */       if (k1.rR && k1.he) {
/*    */         k1.ri0.I70.zT(k1.T70);
/*    */         k1.XD0.zT(k1.T70);
/*    */       } 
/*    */       k1.T70.JL(k1.ri0.yF);
/*    */       eo1.y = 0.0F;
/*    */       eo eo1;
/*    */       (eo1 = k1.T70).uu(f * k1.qk);
/*    */       k1.ri0.jy(k1.T70);
/*    */       if (k1.Tx && k1.xE)
/*    */         k1.XD0.zT(k1.T70); 
/*    */       k1.T70.JL(k1.ri0.yF);
/*    */       k1.T70.y = 0.0F;
/*    */       k1.T70.uu(-f * k1.qk);
/*    */       k1.ri0.jy(k1.T70);
/*    */       if (k1.F2 && k1.xE)
/*    */         k1.XD0.zT(k1.T70); 
/*    */       k1.ri0.jy(k1.jy.JL(k1.ri0.nj0).uu(f * k1.qk));
/*    */       if (k1.sI0 && k1.he)
/*    */         k1.XD0.zT(k1.jy); 
/*    */       k1.ri0.jy(k1.jy.JL(k1.ri0.nj0).uu(-f * k1.qk));
/*    */       if (k1.Y40 && k1.he)
/*    */         k1.XD0.zT(k1.jy); 
/*    */       if (k1.P8)
/*    */         k1.ri0.abstract(true); 
/*    */     } 
/*    */     if ((this.W2 = this.W2 + UB0.M60.Qy) >= Float.MAX_VALUE)
/*    */       this.W2 = 0.0F; 
/*    */     for (Hc0 hc0 = this.wN.r30(); hc0.hasNext(); ) {
/*    */       Ah ah = (Ah)hc0.next();
/*    */       float f = this.W2;
/*    */       lw lw1;
/*    */       if ((lw1 = this.ez0) == null)
/*    */         lw1 = this.Cc0; 
/*    */       ah.K9.j10(f, lw1);
/*    */       for (Hc0 hc02 = ah.W7.r30(); hc02.hasNext(); ((lpt1)hc02.next()).j10(f, lw1));
/*    */       for (Hc0 hc01 = ah.J90.r30(); hc01.hasNext(); ((lpt1)hc01.next()).j10(f, lw1));
/*    */     } 
/*    */     me me1;
/*    */     if ((me1 = this.oo0) != null)
/*    */       me1.Ic0(this.W2); 
/*    */     So so1;
/*    */     if ((so1 = this.cB0) != null && so1.DD())
/*    */       this.cB0 = null; 
/*    */     KI kI = km.a3.Jr0();
/*    */     R8 r8;
/*    */     if (km.a3.Ct == null || !(r8 = km.u4).sU || !(kI instanceof Cy)) {
/*    */       this.w6 = false;
/*    */       return;
/*    */     } 
/*    */     this.w6 = r8.x00() ^ true;
/*    */     YR((Cy)(kI = kI));
/*    */     So so2;
/*    */     if (km.wI0.K7 != null && (so2 = this.wI) != null && so2.DD())
/*    */       fB0(true, (short)0, (short)0, 0.0F, 0.0F, 0.0F, 0.0F, (short)60); 
/*    */     dr0(kI);
/*    */     this.Zg.update();
/*    */     ParticleEffectExt particleEffectExt;
/*    */     if ((particleEffectExt = this.j40) != null)
/*    */       for (Hc0 hc01 = particleEffectExt.getControllers().r30(); hc01.hasNext(); ) {
/*    */         eo eo1;
/*    */         (eo1 = this.To0.I70).getClass();
/*    */         ((ParticleController)hc01.next()).transform.b8((new eo(eo1)).Tz(0.0F, 0.0F, 0.0F));
/*    */       }  
/*    */     if (this.YK != null) {
/*    */       boolean bool;
/*    */       e2 e21;
/*    */       (e21 = this.Z7).getClass();
/*    */       if (System.currentTimeMillis() < e21.jn0) {
/*    */         bool = false;
/*    */       } else {
/*    */         bool = true;
/*    */       } 
/*    */       if (bool) {
/*    */         this.Z7.qi0 = xi0.A90(25000, 45000);
/*    */         this.Z7.T30();
/*    */         this.YK.reset();
/*    */         this.YK.start();
/*    */       } 
/*    */       for (Hc0 hc01 = this.YK.getControllers().r30(); hc01.hasNext(); ) {
/*    */         eo eo1;
/*    */         (eo1 = this.To0.I70).getClass();
/*    */         ((ParticleController)hc01.next()).transform.b8((new eo(eo1)).Tz(0.0F, 0.0F, 0.0F));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public abstract void YR(Cy paramCy);
/*    */   
/*    */   public void QE(int paramInt1, int paramInt2) {
/*    */     float f1 = paramInt1;
/*    */     float f2 = paramInt2;
/*    */     this.Z5.gV = f1;
/*    */     this.Z5.oA = f2;
/*    */   }
/*    */   
/*    */   public void dispose() {
/*    */     this.E40.dispose();
/*    */     this.Zg.dispose();
/*    */     ((lpT4)UB0.PU.uJ0).Sh0(this.Ze);
/*    */     Wx0.i4.TV();
/*    */     zp0 zp0;
/*    */     for (Hc0 hc03 = (zp0 = zp0.vY()).DW.r30(); hc03.hasNext(); ((iq0)hc03.next()).dispose());
/*    */     zp0.DW.clear();
/*    */     (zp0.ik0 = new pe0[5][][])[3] = new pe0[15][];
/*    */     (new pe0[5][][])[2] = new pe0[47][];
/*    */     (new pe0[5][][])[4] = new pe0[28][];
/*    */     zp0.IH = null;
/*    */     zp0.Lt = null;
/*    */     zp0.cOM5 = null;
/*    */     zp0.l50 = null;
/*    */     zp0.eh0 = null;
/*    */     zp0.Z8.clear();
/*    */     zp0.zk = null;
/*    */     zp0.eq0 = new lpt1[17];
/*    */     zp0.Tr0 = new lpt1[6];
/*    */     zp0.OD0.clear();
/*    */     for (Hc0 hc02 = this.wN.r30(); hc02.hasNext(); ((Ah)hc02.next()).dispose());
/*    */     this.wN.clear();
/*    */     cf0 cf01;
/*    */     if ((cf01 = this.bL) != null)
/*    */       cf01.dispose(); 
/*    */     if ((cf01 = this.hE) != null)
/*    */       cf01.dispose(); 
/*    */     if ((cf01 = this.mD) != null)
/*    */       cf01.dispose(); 
/*    */     if ((cf01 = this.N8) != null)
/*    */       cf01.dispose(); 
/*    */     if ((cf01 = this.OD) != null)
/*    */       cf01.dispose(); 
/*    */     if ((cf01 = this.jn) != null)
/*    */       cf01.dispose(); 
/*    */     Hc0 hc01;
/*    */     if (!(hc01 = this.hd0.r30()).hasNext()) {
/*    */       this.hd0.clear();
/*    */       return;
/*    */     } 
/*    */     bo0.Av(hc01.next());
/*    */     throw null;
/*    */   }
/*    */   
/*    */   public final void fB0(boolean paramBoolean, short paramShort1, short paramShort2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, short paramShort3) {
/*    */     if (paramShort3 < 2)
/*    */       paramShort3 = 0; 
/*    */     float f4 = paramShort3 * 0.03333F;
/*    */     So so;
/*    */     if ((so = this.wI) != null) {
/*    */       so.C00 = null;
/*    */       so.fr0 = true;
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       fi0(f4);
/*    */       return;
/*    */     } 
/*    */     float f1 = paramFloat1 * 0.32F, f2 = Xu0.uo0(paramShort1), f3 = paramShort2 / 65536.0F * 360.0F;
/*    */     f1 = paramFloat2 * 0.25F;
/*    */     f2 = paramFloat3 * 0.25F;
/*    */     f3 = paramFloat4 * 0.25F;
/*    */     this.wI = (So)So.k60().L5().PL(Wz0.gq(this.To0, 7, f4).a(f1)).PL(Wz0.gq(this.To0, 6, f4).a(f2)).PL(Wz0.gq(this.To0, 5, f4).a(f3)).PL(Wz0.gq(this.To0, 9, f4).qw0(f1, f2, f3)).PL(Wz0.gq(this.To0, 4, f4).qw0(f1, f2, f3)).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void O00(boolean paramBoolean) {
/*    */     this.qK0 = paramBoolean;
/*    */     if (!paramBoolean)
/*    */       this.sf0 = null; 
/*    */   }
/*    */   
/*    */   public final boolean su() {
/*    */     return (this.wI != null);
/*    */   }
/*    */   
/*    */   public final Ih0 zf0() {
/*    */     return this.wJ ? this.Z5 : this.To0;
/*    */   }
/*    */   
/*    */   public final void tJ() {
/*    */     So so;
/*    */     if ((so = this.cB0) != null) {
/*    */       so.fr0 = true;
/*    */       this.cB0 = null;
/*    */     } 
/*    */     lw lw1;
/*    */     if ((lw1 = this.ez0) == null)
/*    */       lw1 = this.Cc0; 
/*    */     this.xd.vF0.set(lw1.vo0);
/*    */     this.MS.vF0.set(lw1.Mj);
/*    */     this.lPT1.set(lw1.Jb0);
/*    */     this.YD0.JL(lw1.hF0);
/*    */     for (Hc0 hc0 = this.wN.r30(); hasNext(); ((Ah)next()).ej0(lw1));
/*    */   }
/*    */   
/*    */   public final boolean we(xr0 paramxr0, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     this.B5.gL();
/*    */     if (paramxr0 != null) {
/*    */       if (paramxr0.Y00()) {
/*    */         this.B5.JL(paramxr0.j5());
/*    */       } else {
/*    */         float f1 = paramxr0.Ka(), f2 = paramxr0.i00();
/*    */         this.B5.TG0(f1, f2, paramxr0.hA0());
/*    */       } 
/*    */       this.B5.uu(0.25F);
/*    */     } 
/*    */     if (!paramBoolean1 && paramBoolean2) {
/*    */       if (rS((byte)0, this.B5, 0, true, paramBoolean2, false)) {
/*    */         eo eo2 = V1.w3(this.B5, this.B5);
/*    */         HC.k6().S(new LB0(this, eo2, paramBoolean2), 0.25F);
/*    */         return true;
/*    */       } 
/*    */       return false;
/*    */     } 
/*    */     eo eo1 = this.B5;
/*    */     int i = paramBoolean1 ^ true;
/*    */     return rS((byte)0, this, i, true, paramBoolean2, paramBoolean1);
/*    */   }
/*    */   
/*    */   public final void AP() {
/*    */     super.AP();
/*    */     this.K60 = null;
/*    */     me me1;
/*    */     if ((me1 = this.oo0) != null)
/*    */       me1.dispose(); 
/*    */     this.oo0 = null;
/*    */     k60.info("Reloading map.");
/*    */   }
/*    */   
/*    */   public void xL() {
/*    */     So so;
/*    */     if ((so = this.wI) != null) {
/*    */       so.fr0 = true;
/*    */       this.wI = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Iy(qo paramqo) {
/*    */     if (this.Cc0 == null)
/*    */       return; 
/*    */     paramqo.vF0.set(this.MS.vF0).add(0.15F, 0.15F, 0.15F, 0.0F);
/*    */   }
/*    */   
/*    */   public final kg0 eA0() {
/*    */     return this.Zg;
/*    */   }
/*    */   
/*    */   public final void LB0(boolean paramBoolean) {
/*    */     this.E4 = paramBoolean;
/*    */     if (!paramBoolean)
/*    */       yB(yE0.ne, true); 
/*    */   }
/*    */   
/*    */   public abstract void yB(yE0 paramyE0, boolean paramBoolean);
/*    */   
/*    */   public void L00() {
/*    */     this.Ze = new K1(this.Z5);
/*    */     aY aY;
/*    */     LpT8 lpT8;
/*    */     if (!(lpT8 = (aY = UB0.PU).uJ0 instanceof lpT4)) {
/*    */       lpT4 lpT4;
/*    */       LpT8[] arrayOfLpT8;
/*    */       (arrayOfLpT8 = new LpT8[1])[0] = lpT8;
/*    */       this(arrayOfLpT8);
/*    */       aY.uJ0 = lpT4;
/*    */     } 
/*    */     ((lpT4)UB0.PU.uJ0).K90(this.Ze);
/*    */     this.cJ0 = new fo0();
/*    */     this.MS = new qo(qo.iu0, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     this.xd = new qo(qo.Ml, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     this.lPT1 = new Color(0.0F, 0.0F, 0.0F, 1.0F);
/*    */     this.YD0 = new eo();
/*    */     this();
/*    */     T0 t01;
/*    */     vm vm1;
/*    */     T0 t03, t04;
/*    */     this.ff0 = new vm();
/*    */     vm1.sL0.set(new Color(0.3F, 0.3F, 0.3F, 1.0F));
/*    */     vm vm2 = this.ff0;
/*    */     fo0 fo01;
/*    */     (fo01 = this.cJ0).getClass();
/*    */     uu uu;
/*    */     if ((uu = (uu)this.cJ0.cOM1(uu.N1)) == null) {
/*    */       this();
/*    */       fo01.Tz0(uu);
/*    */     } 
/*    */     uu.GE.Com3(vm2);
/*    */     this.cJ0.Tz0(this.MS);
/*    */     this.cJ0.Tz0(this.xd);
/*    */     (this.Zg = new kg0(this.To0)).fA0(km.mI0.AN);
/*    */     cf0 cf02;
/*    */     if ((cf02 = this.bL) != null)
/*    */       cf02.dispose(); 
/*    */     if ((cf02 = this.hE) != null)
/*    */       cf02.dispose(); 
/*    */     if ((cf02 = this.mD) != null)
/*    */       cf02.dispose(); 
/*    */     if ((cf02 = this.N8) != null)
/*    */       cf02.dispose(); 
/*    */     if ((cf02 = this.OD) != null)
/*    */       cf02.dispose(); 
/*    */     if ((cf02 = this.jn) != null)
/*    */       cf02.dispose(); 
/*    */     this(new dj[] { qo.SI(Color.BLUE) });
/*    */     this.jn = this.RF0.YP(0.115F, 0.0F, -0.115F, -0.115F, 0.0F, -0.115F, -0.115F, 0.0F, 0.115F, 0.115F, 0.0F, 0.115F, 0.0F, 0.0F, t03, 9L);
/*    */     Color color;
/*    */     this(new dj[] { qo.SI(color = Color.GREEN) });
/*    */     this.bL = this.RF0.synchronized(0.25F, 0.25F, 0.25F, t03);
/*    */     this(new dj[] { qo.SI(color) });
/*    */     this.hE = this.RF0.synchronized(0.23F, 0.001F, 0.23F, t03);
/*    */     byte b1 = 15, b2 = 15;
/*    */     this(new dj[] { qo.SI(color) });
/*    */     GL0 gL0;
/*    */     (gL0 = this.RF0).v10();
/*    */     Matrix4 matrix4 = az0.hi.WU();
/*    */     boolean bool1 = nx0.JC0(0.0F, 0.0F), bool2 = nx0.JC0(180.0F, 180.0F);
/*    */     float f1 = 0.075F, f2 = 0.0F, f3 = b1, f4 = 6.2831855F / f3, f5 = 3.1415927F / f3;
/*    */     f3 = 1.0F / f3;
/*    */     lpT7 lpT7;
/*    */     (lpT7 = az0.nC.Ma(null, null)).ZU = true;
/*    */     (az0.nC.Ma(null, null)).K = true;
/*    */     (az0.nC.Ma(null, null)).nB0 = true;
/*    */     Xl0.fi0.M30(matrix4);
/*    */     byte b3 = 18;
/*    */     Xl0.jn0.AK0 = 0;
/*    */     Xl0.jn0.JA0(30);
/*    */     Xl0.jn0.AK0 = b3;
/*    */     int i = 0;
/*    */     byte b4 = 16;
/*    */     t70.bk(256);
/*    */     t70 t70;
/*    */     (t70 = this.RF0.aa("sphere", 9L, t04)).PI0(b1);
/*    */     for (byte b5 = 0; b5 <= b2; ) {
/*    */       float f6;
/*    */       float f7;
/*    */       float f8;
/*    */       byte b;
/*    */       for (f6 = f3 * f6, f7 = nx0.E70(f5 * (f6 = b5) + f2), f8 = nx0.zN(f5 * (f6 = b5) + f2) * f1, b = 0; b <= b1; ) {
/*    */         float f9, f10 = f4 * (f9 = b) + f2;
/*    */         if ((b5 == 0 && bool1) || (b5 == b2 && bool2)) {
/*    */           f9 = 1.0F - (f9 - 0.5F) * f3;
/*    */         } else {
/*    */           f9 = 1.0F - f3 * f9;
/*    */         } 
/*    */         lpT7.J1.TG0(nx0.zN(f10) * f1 * f7, f8, nx0.E70(f10) * f1 * f7);
/*    */         lpT7.K10.JL(lpT7.J1).DT(Xl0.fi0).WC0();
/*    */         lpT7.J1.eM(matrix4);
/*    */         lpT7.Oe0.x = f9;
/*    */         lpT7.Oe0.y = f6;
/*    */         Wk0 wk0 = Xl0.jn0;
/*    */         short s = t70.Bn(lpT7);
/*    */         if (i < wk0.AK0) {
/*    */           wk0.YJ0[i] = s;
/*    */           int j = i + b3;
/*    */           if (b5 > 0 && b > 0)
/*    */             if (b5 == 1 && bool1) {
/*    */               j = wk0.sD(i);
/*    */               short s1 = wk0.sD((j - 1) % b3), s2 = wk0.sD((j - b4) % b3);
/*    */               t70.C90(j, s1, s2);
/*    */             } else if (b5 == b2 && bool2) {
/*    */               j = wk0.sD(i);
/*    */               short s1 = wk0.sD((j - 17) % b3), s2 = wk0.sD((j - b4) % b3);
/*    */               t70.C90(j, s1, s2);
/*    */             } else {
/*    */               j = wk0.sD(i);
/*    */               short s1 = wk0.sD((j - 1) % b3), s2 = wk0.sD((j - 17) % b3), s3 = wk0.sD((j - b4) % b3);
/*    */               t70.SH(j, s1, s2, s3);
/*    */             }  
/*    */           i = (i + 1) % wk0.AK0;
/*    */           b++;
/*    */           continue;
/*    */         } 
/*    */         throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", i, " >= ").append(wk0.AK0).toString());
/*    */       } 
/*    */       b5++;
/*    */     } 
/*    */     this.mD = gL0.GC0();
/*    */     this(new dj[] { qo.SI(Color.GREEN) });
/*    */     this.RF0.v10();
/*    */     CoN.Qx0(this.RF0.aa("cylinder", 9L, this), 0.23F, 0.23F, 0.23F, 10);
/*    */     this.N8 = this.RF0.GC0();
/*    */     qo qo1 = qo.SI(Color.BLACK);
/*    */     this();
/*    */     t02.Tz0(new Xf0(Xf0.xZ, 1028));
/*    */     T0 t02;
/*    */     (t02 = new T0()).Tz0(this);
/*    */     (new T0()).Tz0(new zc(0.97F));
/*    */     this.RF0.v10();
/*    */     Ih.tk0(this.RF0.aa("cone", 1L, t02), 1.0F, 25.0F, 1.0F, 64, false);
/*    */     cf0 cf01 = this.RF0.GC0();
/*    */     this.T60 = new Tb(this);
/*    */   }
/*    */   
/*    */   public void Ap0() {
/*    */     this.Com2 = false;
/*    */     if (D.hS()) {
/*    */       this.To0.oA = (UB0.M60.dL() - D.N2.Mn.yR());
/*    */       this.To0.gV = (UB0.M60.fG0() - D.N2.vL0());
/*    */       this.To0.abstract(true);
/*    */       this.Z5.oA = (UB0.M60.dL() - D.N2.Mn.yR());
/*    */       this.Z5.gV = (UB0.M60.fG0() - D.N2.vL0());
/*    */       this.Z5.abstract(true);
/*    */     } 
/*    */   }
/*    */   
/*    */   public abstract void rJ();
/*    */   
/*    */   public abstract void YB(Jo paramJo, Ih0 paramIh0, boolean paramBoolean);
/*    */   
/*    */   public final void Zq0(boolean paramBoolean, int paramInt) {
/*    */     float f4 = 1.0F;
/*    */     So so2;
/*    */     if ((so2 = this.wI) != null) {
/*    */       so2.fr0 = true;
/*    */       so2.C00 = null;
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       fi0(f4);
/*    */       return;
/*    */     } 
/*    */     tc tc;
/*    */     if ((tc = km.a3.Xb(paramInt)) == null)
/*    */       return; 
/*    */     eo eo1 = (tc.default()).lpt8;
/*    */     So so1 = So.k60().L5();
/*    */     Wz0 wz0 = Wz0.gq(this.To0, 7, f4);
/*    */     if (tc.HW.FB == 2) {
/*    */       f6 = 3.0F;
/*    */     } else {
/*    */       f6 = 7.0F;
/*    */     } 
/*    */     float f3 = eo1.x, f5 = eo1.y, f6 = eo1.z, f1 = eo1.x, f2 = eo1.y;
/*    */     f3 = eo1.z;
/*    */     this.wI = (So)so1.PL(wz0.a(f6)).PL(Wz0.gq(this.To0, 9, f4).qw0(f3, f5, f6)).PL(Wz0.gq(this.To0, 4, f4).qw0(f1, f2, f3)).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void Hb0() {
/*    */     if (!this.w6)
/*    */       return; 
/*    */     if (this.ez0 != null)
/*    */       return; 
/*    */     So so;
/*    */     if (((so = this.cB0) == null || so.DD()) && L70.gq.oh0.By0()) {
/*    */       int j = this.Cc0.Mj.equals(this.MS.vF0) ^ true, k = this.Cc0.Jb0.equals(this.lPT1) ^ true, m = this.Cc0.hF0.equals(this.YD0) ^ true;
/*    */       int i;
/*    */       if ((i = this.Cc0.vo0.equals(this.xd.vF0) ^ true) != 0 || j != 0 || k != 0 || m != 0) {
/*    */         So so1 = So.k60().L5();
/*    */         if (i != 0) {
/*    */           arrayOfFloat[0] = color.r;
/*    */           arrayOfFloat[1] = color.g;
/*    */           arrayOfFloat[2] = color.b;
/*    */           float[] arrayOfFloat;
/*    */           Color color;
/*    */           (arrayOfFloat = new float[4])[3] = (color = this.Cc0.vo0).a;
/*    */           so1.PL(Wz0.gq(this.xd.vF0, 0, 30.0F).qY(new float[4]));
/*    */         } 
/*    */         if (j != 0) {
/*    */           arrayOfFloat[0] = color.r;
/*    */           arrayOfFloat[1] = color.g;
/*    */           arrayOfFloat[2] = color.b;
/*    */           float[] arrayOfFloat;
/*    */           Color color;
/*    */           (arrayOfFloat = new float[4])[3] = (color = this.Cc0.Mj).a;
/*    */           this.cB0.PL(Wz0.gq(this.MS.vF0, 0, 30.0F).qY(new float[4]));
/*    */         } 
/*    */         if (k != 0) {
/*    */           arrayOfFloat[0] = color.r;
/*    */           arrayOfFloat[1] = color.g;
/*    */           arrayOfFloat[2] = color.b;
/*    */           float[] arrayOfFloat;
/*    */           Color color;
/*    */           (arrayOfFloat = new float[4])[3] = (color = this.Cc0.Jb0).a;
/*    */           this.cB0.PL(Wz0.gq(this.lPT1, 0, 30.0F).qY(new float[4]));
/*    */         } 
/*    */         if (m != 0) {
/*    */           float f = this.Cc0.hF0.z;
/*    */           (Wz0.gq(this.YD0, 4, 30.0F).qw0(f, this.Cc0.hF0.y, f)).st = (i0)Quint.INOUT;
/*    */           this.cB0.PL(Wz0.gq(this.YD0, 4, 30.0F).qw0(f, this.Cc0.hF0.y, f));
/*    */         } 
/*    */         this.cB0.Kr().mg(km.wI0.pB0);
/*    */       } 
/*    */     } else {
/*    */       if ((so = this.cB0) != null) {
/*    */         if (!so.DD()) {
/*    */           this.ff0.wd.JL(this.YD0);
/*    */           return;
/*    */         } 
/*    */         this.cB0 = null;
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     this.ff0.wd.JL(this.YD0);
/*    */   }
/*    */   
/*    */   public final void LB(tc paramtc, p10 paramp10, ArrayList<tc> paramArrayList) {
/*    */     if (paramtc == null)
/*    */       return; 
/*    */     if (Y4.jJ0(paramp10, (paramtc.default()).lpt8, new eo(0.25F, 0.5F, 0.25F)))
/*    */       paramArrayList.add(paramtc); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */