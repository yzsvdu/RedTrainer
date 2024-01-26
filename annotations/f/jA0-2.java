/*  1 */ package f;public final class jA0 extends cj { public gd Bf0; public nf o50; public kg0 wv0; public lpt1 s60; public fQ ge = new fQ(); public oq[] Ce = new oq[2]; public UA0[] su = new UA0[2]; public zh0[][] bF = new zh0[2][]; public final boolean ng() { if (this.az * 2.0F > 35.0F || this.F50.MI0) return true;  } public ParticleEffectExt cOm6; public ParticleEffectExt a60; public uX F50; public j40 Pc0; public short SD0 = 0; public short Com7 = 0; public jA0(j40 paramj40, uX paramuX) { super(false); this.Pc0 = paramj40; this.F50 = paramuX; this.SD0 = paramj40.qI0(); this.Com7 = paramj40.K20(); } public final void Wy() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: dup2
/*    */     //   4: dup2
/*    */     //   5: dup2
/*    */     //   6: dup2
/*    */     //   7: dup2
/*    */     //   8: dup2
/*    */     //   9: invokespecial Wy : ()V
/*    */     //   12: getfield YL : Lf/Ih0;
/*    */     //   15: dup
/*    */     //   16: dup
/*    */     //   17: fconst_0
/*    */     //   18: putfield IG0 : F
/*    */     //   21: ldc 0.75
/*    */     //   23: putfield el0 : F
/*    */     //   26: getfield I70 : Lf/eo;
/*    */     //   29: fconst_0
/*    */     //   30: fconst_0
/*    */     //   31: ldc -1.0
/*    */     //   33: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   36: pop
/*    */     //   37: getfield YL : Lf/Ih0;
/*    */     //   40: fconst_0
/*    */     //   41: fconst_0
/*    */     //   42: fconst_0
/*    */     //   43: invokevirtual mP : (FFF)V
/*    */     //   46: new f/nf
/*    */     //   49: dup
/*    */     //   50: aload_0
/*    */     //   51: new f/gd
/*    */     //   54: dup
/*    */     //   55: dup
/*    */     //   56: astore_1
/*    */     //   57: aload_0
/*    */     //   58: getfield YL : Lf/Ih0;
/*    */     //   61: invokespecial <init> : (Lf/ny;)V
/*    */     //   64: putfield Bf0 : Lf/gd;
/*    */     //   67: sipush #1000
/*    */     //   70: aload_1
/*    */     //   71: invokespecial <init> : (ILf/gd;)V
/*    */     //   74: putfield o50 : Lf/nf;
/*    */     //   77: new f/kg0
/*    */     //   80: dup
/*    */     //   81: aload_0
/*    */     //   82: swap
/*    */     //   83: dup
/*    */     //   84: aload_0
/*    */     //   85: getfield YL : Lf/Ih0;
/*    */     //   88: invokespecial <init> : (Lf/Ih0;)V
/*    */     //   91: putfield wv0 : Lf/kg0;
/*    */     //   94: new f/ig
/*    */     //   97: dup
/*    */     //   98: getstatic f/km.mI0 : Lf/P1;
/*    */     //   101: getfield AN : Lf/Wo;
/*    */     //   104: getfield TI : Lf/RD;
/*    */     //   107: ldc '/a/1/8/2'
/*    */     //   109: invokevirtual B8 : (Ljava/lang/String;)Lf/T7;
/*    */     //   112: invokespecial <init> : (Lf/T7;)V
/*    */     //   115: putfield vF : Lf/S;
/*    */     //   118: getfield wv0 : Lf/kg0;
/*    */     //   121: getfield SJ0 : Lf/sz0;
/*    */     //   124: invokevirtual B9 : ()V
/*    */     //   127: getfield RK0 : Lf/fQ;
/*    */     //   130: aload_0
/*    */     //   131: getfield o50 : Lf/nf;
/*    */     //   134: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   137: getfield RK0 : Lf/fQ;
/*    */     //   140: aload_0
/*    */     //   141: getfield Bf0 : Lf/gd;
/*    */     //   144: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   147: getfield RK0 : Lf/fQ;
/*    */     //   150: aload_0
/*    */     //   151: getfield wv0 : Lf/kg0;
/*    */     //   154: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   157: getstatic f/q10.Rs : Lf/eo;
/*    */     //   160: fconst_0
/*    */     //   161: fconst_0
/*    */     //   162: ldc -1.0
/*    */     //   164: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   167: pop
/*    */     //   168: getstatic f/q10.HF : Lf/eo;
/*    */     //   171: fconst_0
/*    */     //   172: fconst_0
/*    */     //   173: ldc -1.0
/*    */     //   175: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   178: pop
/*    */     //   179: getfield wv0 : Lf/kg0;
/*    */     //   182: ldc 'special/spinme'
/*    */     //   184: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   187: dup
/*    */     //   188: astore_1
/*    */     //   189: putfield cOm6 : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   192: getfield wv0 : Lf/kg0;
/*    */     //   195: aload_1
/*    */     //   196: invokevirtual L40 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;)V
/*    */     //   199: getfield cOm6 : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   202: invokevirtual start : ()V
/*    */     //   205: getfield RK0 : Lf/fQ;
/*    */     //   208: aload_0
/*    */     //   209: getfield cOm6 : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   212: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   215: getstatic f/km.mI0 : Lf/P1;
/*    */     //   218: getfield AN : Lf/Wo;
/*    */     //   221: astore_1
/*    */     //   222: invokestatic Lj : ()Lf/eI;
/*    */     //   225: astore_2
/*    */     //   226: new f/ig
/*    */     //   229: dup
/*    */     //   230: aload_2
/*    */     //   231: swap
/*    */     //   232: aload_1
/*    */     //   233: getfield TI : Lf/RD;
/*    */     //   236: ldc '/a/1/8/2'
/*    */     //   238: invokevirtual B8 : (Ljava/lang/String;)Lf/T7;
/*    */     //   241: invokespecial <init> : (Lf/T7;)V
/*    */     //   244: iconst_4
/*    */     //   245: newarray int
/*    */     //   247: dup
/*    */     //   248: dup
/*    */     //   249: dup2
/*    */     //   250: astore_1
/*    */     //   251: iconst_0
/*    */     //   252: bipush #6
/*    */     //   254: iastore
/*    */     //   255: iconst_1
/*    */     //   256: bipush #9
/*    */     //   258: iastore
/*    */     //   259: iconst_2
/*    */     //   260: iconst_m1
/*    */     //   261: iastore
/*    */     //   262: iconst_3
/*    */     //   263: bipush #7
/*    */     //   265: iastore
/*    */     //   266: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   269: pop
/*    */     //   270: bipush #8
/*    */     //   272: aload_1
/*    */     //   273: invokestatic L4 : (Lf/S;I[I)Lf/lpt1;
/*    */     //   276: dup
/*    */     //   277: dup
/*    */     //   278: aload_0
/*    */     //   279: swap
/*    */     //   280: putfield s60 : Lf/lpt1;
/*    */     //   283: getfield lz : Lf/fQ;
/*    */     //   286: iconst_0
/*    */     //   287: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   290: checkcast java/lang/String
/*    */     //   293: iconst_1
/*    */     //   294: invokevirtual nl : (Ljava/lang/String;Z)V
/*    */     //   297: getfield s60 : Lf/lpt1;
/*    */     //   300: fconst_2
/*    */     //   301: putfield k : F
/*    */     //   304: getfield RK0 : Lf/fQ;
/*    */     //   307: aload_0
/*    */     //   308: getfield cOm6 : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   311: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   314: iconst_2
/*    */     //   315: anewarray f/pe0
/*    */     //   318: astore_1
/*    */     //   319: iconst_2
/*    */     //   320: newarray boolean
/*    */     //   322: dup
/*    */     //   323: dup
/*    */     //   324: astore_2
/*    */     //   325: iconst_0
/*    */     //   326: iconst_0
/*    */     //   327: bastore
/*    */     //   328: iconst_1
/*    */     //   329: iconst_0
/*    */     //   330: bastore
/*    */     //   331: iconst_1
/*    */     //   332: istore_3
/*    */     //   333: iconst_0
/*    */     //   334: istore #4
/*    */     //   336: iload #4
/*    */     //   338: iconst_2
/*    */     //   339: if_icmpge -> 734
/*    */     //   342: iload #4
/*    */     //   344: ifne -> 362
/*    */     //   347: aload_0
/*    */     //   348: getfield Pc0 : Lf/j40;
/*    */     //   351: getfield Zs : Lf/Q90;
/*    */     //   354: invokevirtual Vf0 : ()S
/*    */     //   357: istore #5
/*    */     //   359: goto -> 385
/*    */     //   362: aload_0
/*    */     //   363: getfield Pc0 : Lf/j40;
/*    */     //   366: dup
/*    */     //   367: getfield cY : S
/*    */     //   370: istore #5
/*    */     //   372: getfield Zs : Lf/Q90;
/*    */     //   375: getfield Vp : B
/*    */     //   378: iload #5
/*    */     //   380: invokestatic HZ : (BS)S
/*    */     //   383: istore #5
/*    */     //   385: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   388: aload_0
/*    */     //   389: getfield Pc0 : Lf/j40;
/*    */     //   392: invokevirtual s5 : ()B
/*    */     //   395: iload #5
/*    */     //   397: aload_0
/*    */     //   398: getfield Pc0 : Lf/j40;
/*    */     //   401: getfield Zs : Lf/Q90;
/*    */     //   404: invokevirtual tm0 : ()Z
/*    */     //   407: iconst_0
/*    */     //   408: swap
/*    */     //   409: invokevirtual rE0 : (BSZZ)Z
/*    */     //   412: ifeq -> 527
/*    */     //   415: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   418: aload_0
/*    */     //   419: getfield Pc0 : Lf/j40;
/*    */     //   422: invokevirtual s5 : ()B
/*    */     //   425: iload #5
/*    */     //   427: aload_0
/*    */     //   428: getfield Pc0 : Lf/j40;
/*    */     //   431: getfield Zs : Lf/Q90;
/*    */     //   434: invokevirtual tm0 : ()Z
/*    */     //   437: iconst_0
/*    */     //   438: swap
/*    */     //   439: invokevirtual H9 : (BSZZ)[Lf/zh0;
/*    */     //   442: dup
/*    */     //   443: astore #5
/*    */     //   445: aload_0
/*    */     //   446: getfield bF : [[Lf/zh0;
/*    */     //   449: iload #4
/*    */     //   451: aload #5
/*    */     //   453: aastore
/*    */     //   454: arraylength
/*    */     //   455: dup
/*    */     //   456: istore #6
/*    */     //   458: anewarray f/pe0
/*    */     //   461: astore #7
/*    */     //   463: iconst_0
/*    */     //   464: istore #8
/*    */     //   466: iload #8
/*    */     //   468: iload #6
/*    */     //   470: if_icmpge -> 501
/*    */     //   473: aload #5
/*    */     //   475: iload #8
/*    */     //   477: aload #7
/*    */     //   479: iload #8
/*    */     //   481: aload #5
/*    */     //   483: iload #8
/*    */     //   485: aaload
/*    */     //   486: invokevirtual Uu0 : ()Lf/pe0;
/*    */     //   489: aastore
/*    */     //   490: aaload
/*    */     //   491: aload_0
/*    */     //   492: invokevirtual lu : (Ljava/lang/Object;)V
/*    */     //   495: iinc #8, 1
/*    */     //   498: goto -> 466
/*    */     //   501: aload_0
/*    */     //   502: aload_1
/*    */     //   503: iload #4
/*    */     //   505: aload #7
/*    */     //   507: iconst_0
/*    */     //   508: aaload
/*    */     //   509: dup
/*    */     //   510: astore #5
/*    */     //   512: aastore
/*    */     //   513: getfield Ce : [Lf/oq;
/*    */     //   516: iload #4
/*    */     //   518: aload #5
/*    */     //   520: invokestatic wU : (Lf/pe0;)Lf/oq;
/*    */     //   523: aastore
/*    */     //   524: goto -> 623
/*    */     //   527: aload_0
/*    */     //   528: dup
/*    */     //   529: aload_1
/*    */     //   530: iload #4
/*    */     //   532: aload_0
/*    */     //   533: aload_2
/*    */     //   534: iload #4
/*    */     //   536: aload_0
/*    */     //   537: dup
/*    */     //   538: iconst_2
/*    */     //   539: istore_3
/*    */     //   540: getfield su : [Lf/UA0;
/*    */     //   543: iload #4
/*    */     //   545: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   548: aload_0
/*    */     //   549: getfield Pc0 : Lf/j40;
/*    */     //   552: invokevirtual s5 : ()B
/*    */     //   555: iload #5
/*    */     //   557: aload_0
/*    */     //   558: getfield Pc0 : Lf/j40;
/*    */     //   561: getfield Zs : Lf/Q90;
/*    */     //   564: invokevirtual tm0 : ()Z
/*    */     //   567: iconst_0
/*    */     //   568: swap
/*    */     //   569: invokevirtual vt : (BSZZ)Lf/UA0;
/*    */     //   572: aastore
/*    */     //   573: getfield su : [Lf/UA0;
/*    */     //   576: iload #4
/*    */     //   578: aaload
/*    */     //   579: iload_3
/*    */     //   580: i2f
/*    */     //   581: invokevirtual Zz : (F)V
/*    */     //   584: iconst_1
/*    */     //   585: bastore
/*    */     //   586: getfield su : [Lf/UA0;
/*    */     //   589: iload #4
/*    */     //   591: aaload
/*    */     //   592: invokevirtual OB0 : ()Lf/pe0;
/*    */     //   595: dup
/*    */     //   596: astore #5
/*    */     //   598: aastore
/*    */     //   599: getfield Ce : [Lf/oq;
/*    */     //   602: iload #4
/*    */     //   604: aload #5
/*    */     //   606: invokestatic wU : (Lf/pe0;)Lf/oq;
/*    */     //   609: aastore
/*    */     //   610: getfield RK0 : Lf/fQ;
/*    */     //   613: aload_0
/*    */     //   614: getfield su : [Lf/UA0;
/*    */     //   617: iload #4
/*    */     //   619: aaload
/*    */     //   620: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   623: aload_0
/*    */     //   624: dup
/*    */     //   625: getfield Ce : [Lf/oq;
/*    */     //   628: iload #4
/*    */     //   630: aaload
/*    */     //   631: dup
/*    */     //   632: aload_0
/*    */     //   633: getfield YL : Lf/Ih0;
/*    */     //   636: getfield I70 : Lf/eo;
/*    */     //   639: dup
/*    */     //   640: astore #5
/*    */     //   642: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   645: pop
/*    */     //   646: new f/eo
/*    */     //   649: dup
/*    */     //   650: aload #5
/*    */     //   652: invokespecial <init> : (Lf/eo;)V
/*    */     //   655: ldc_w -0.07
/*    */     //   658: ldc_w 0.225
/*    */     //   661: fconst_0
/*    */     //   662: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   665: astore #5
/*    */     //   667: getfield PL : Lf/eo;
/*    */     //   670: dup
/*    */     //   671: astore #6
/*    */     //   673: aload #5
/*    */     //   675: dup
/*    */     //   676: dup
/*    */     //   677: aload #6
/*    */     //   679: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   682: pop
/*    */     //   683: getfield x : F
/*    */     //   686: fstore #5
/*    */     //   688: getfield y : F
/*    */     //   691: fstore #6
/*    */     //   693: getfield z : F
/*    */     //   696: fstore #7
/*    */     //   698: fload #5
/*    */     //   700: fload #6
/*    */     //   702: fload #7
/*    */     //   704: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   707: pop
/*    */     //   708: iconst_0
/*    */     //   709: putfield Ka0 : Z
/*    */     //   712: getfield Ce : [Lf/oq;
/*    */     //   715: iload #4
/*    */     //   717: aaload
/*    */     //   718: iload_3
/*    */     //   719: i2f
/*    */     //   720: ldc_w 0.0125
/*    */     //   723: swap
/*    */     //   724: fdiv
/*    */     //   725: invokevirtual m20 : (F)V
/*    */     //   728: iinc #4, 1
/*    */     //   731: goto -> 336
/*    */     //   734: iload_3
/*    */     //   735: dup
/*    */     //   736: dup2
/*    */     //   737: aload_0
/*    */     //   738: dup
/*    */     //   739: getfield ge : Lf/fQ;
/*    */     //   742: invokevirtual clear : ()V
/*    */     //   745: fconst_0
/*    */     //   746: putfield az : F
/*    */     //   749: iconst_0
/*    */     //   750: istore #4
/*    */     //   752: bipush #8
/*    */     //   754: imul
/*    */     //   755: istore #5
/*    */     //   757: iconst_4
/*    */     //   758: imul
/*    */     //   759: istore #6
/*    */     //   761: sipush #192
/*    */     //   764: imul
/*    */     //   765: istore #7
/*    */     //   767: sipush #128
/*    */     //   770: imul
/*    */     //   771: istore #8
/*    */     //   773: iconst_0
/*    */     //   774: istore #9
/*    */     //   776: iload #9
/*    */     //   778: iload #8
/*    */     //   780: if_icmpge -> 1291
/*    */     //   783: iconst_0
/*    */     //   784: istore #10
/*    */     //   786: iload #10
/*    */     //   788: iload #7
/*    */     //   790: if_icmpge -> 1281
/*    */     //   793: aconst_null
/*    */     //   794: astore #11
/*    */     //   796: aconst_null
/*    */     //   797: astore #12
/*    */     //   799: iconst_0
/*    */     //   800: istore #13
/*    */     //   802: iload #13
/*    */     //   804: iconst_2
/*    */     //   805: if_icmpge -> 1186
/*    */     //   808: aload_2
/*    */     //   809: iload #13
/*    */     //   811: baload
/*    */     //   812: ifeq -> 858
/*    */     //   815: new f/pe0
/*    */     //   818: dup
/*    */     //   819: astore #14
/*    */     //   821: iload #5
/*    */     //   823: iload #7
/*    */     //   825: iload #10
/*    */     //   827: aload_1
/*    */     //   828: iload #13
/*    */     //   830: aaload
/*    */     //   831: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   834: astore #15
/*    */     //   836: isub
/*    */     //   837: istore #16
/*    */     //   839: ineg
/*    */     //   840: istore #17
/*    */     //   842: aload #15
/*    */     //   844: iload #16
/*    */     //   846: iload #9
/*    */     //   848: iload #17
/*    */     //   850: iload #6
/*    */     //   852: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;IIII)V
/*    */     //   855: goto -> 1032
/*    */     //   858: aload_1
/*    */     //   859: iload #13
/*    */     //   861: aaload
/*    */     //   862: dup
/*    */     //   863: astore #14
/*    */     //   865: getfield H0 : I
/*    */     //   868: dup
/*    */     //   869: istore #15
/*    */     //   871: sipush #192
/*    */     //   874: if_icmpne -> 926
/*    */     //   877: aload #14
/*    */     //   879: getfield Vn0 : I
/*    */     //   882: sipush #128
/*    */     //   885: if_icmpeq -> 891
/*    */     //   888: goto -> 926
/*    */     //   891: new f/pe0
/*    */     //   894: dup
/*    */     //   895: astore #15
/*    */     //   897: aload #14
/*    */     //   899: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   902: aload #14
/*    */     //   904: invokevirtual jg : ()I
/*    */     //   907: iload #10
/*    */     //   909: iadd
/*    */     //   910: iload #9
/*    */     //   912: iload #5
/*    */     //   914: iload #6
/*    */     //   916: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;IIII)V
/*    */     //   919: aload #15
/*    */     //   921: astore #14
/*    */     //   923: goto -> 1032
/*    */     //   926: iload #10
/*    */     //   928: aload #14
/*    */     //   930: iload #15
/*    */     //   932: iconst_2
/*    */     //   933: idiv
/*    */     //   934: bipush #96
/*    */     //   936: swap
/*    */     //   937: isub
/*    */     //   938: istore #16
/*    */     //   940: getfield Vn0 : I
/*    */     //   943: dup
/*    */     //   944: istore #17
/*    */     //   946: iconst_2
/*    */     //   947: idiv
/*    */     //   948: bipush #64
/*    */     //   950: swap
/*    */     //   951: isub
/*    */     //   952: istore #18
/*    */     //   954: iload #16
/*    */     //   956: isub
/*    */     //   957: dup
/*    */     //   958: istore #16
/*    */     //   960: ifge -> 966
/*    */     //   963: goto -> 1180
/*    */     //   966: iload #9
/*    */     //   968: iload #18
/*    */     //   970: isub
/*    */     //   971: dup
/*    */     //   972: istore #18
/*    */     //   974: ifge -> 980
/*    */     //   977: goto -> 1180
/*    */     //   980: iload #16
/*    */     //   982: iload #15
/*    */     //   984: if_icmplt -> 990
/*    */     //   987: goto -> 1180
/*    */     //   990: iload #18
/*    */     //   992: iload #17
/*    */     //   994: if_icmplt -> 1000
/*    */     //   997: goto -> 1180
/*    */     //   1000: new f/pe0
/*    */     //   1003: dup
/*    */     //   1004: astore #15
/*    */     //   1006: aload #14
/*    */     //   1008: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1011: aload #14
/*    */     //   1013: invokevirtual jg : ()I
/*    */     //   1016: iload #16
/*    */     //   1018: iadd
/*    */     //   1019: iload #18
/*    */     //   1021: iload #5
/*    */     //   1023: iload #6
/*    */     //   1025: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;IIII)V
/*    */     //   1028: aload #15
/*    */     //   1030: astore #14
/*    */     //   1032: iload #13
/*    */     //   1034: aload #14
/*    */     //   1036: invokestatic wU : (Lf/pe0;)Lf/oq;
/*    */     //   1039: dup
/*    */     //   1040: astore #14
/*    */     //   1042: iload_3
/*    */     //   1043: aload #14
/*    */     //   1045: dup
/*    */     //   1046: aload_0
/*    */     //   1047: getfield YL : Lf/Ih0;
/*    */     //   1050: getfield I70 : Lf/eo;
/*    */     //   1053: dup
/*    */     //   1054: astore #15
/*    */     //   1056: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1059: pop
/*    */     //   1060: new f/eo
/*    */     //   1063: dup
/*    */     //   1064: astore #16
/*    */     //   1066: iload #9
/*    */     //   1068: iload #6
/*    */     //   1070: iload #10
/*    */     //   1072: aload #16
/*    */     //   1074: dup
/*    */     //   1075: aload #15
/*    */     //   1077: invokespecial <init> : (Lf/eo;)V
/*    */     //   1080: fconst_0
/*    */     //   1081: fconst_1
/*    */     //   1082: fconst_0
/*    */     //   1083: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1086: pop
/*    */     //   1087: ineg
/*    */     //   1088: iload #5
/*    */     //   1090: idiv
/*    */     //   1091: i2f
/*    */     //   1092: ldc_w 0.1
/*    */     //   1095: fmul
/*    */     //   1096: fstore #15
/*    */     //   1098: idiv
/*    */     //   1099: i2f
/*    */     //   1100: ldc_w 0.05
/*    */     //   1103: fmul
/*    */     //   1104: fload #15
/*    */     //   1106: swap
/*    */     //   1107: fconst_0
/*    */     //   1108: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   1111: pop
/*    */     //   1112: getfield PL : Lf/eo;
/*    */     //   1115: dup
/*    */     //   1116: astore #15
/*    */     //   1118: aload #16
/*    */     //   1120: dup
/*    */     //   1121: dup
/*    */     //   1122: aload #15
/*    */     //   1124: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1127: pop
/*    */     //   1128: getfield x : F
/*    */     //   1131: fstore #15
/*    */     //   1133: getfield y : F
/*    */     //   1136: fstore #16
/*    */     //   1138: getfield z : F
/*    */     //   1141: fstore #17
/*    */     //   1143: fload #15
/*    */     //   1145: fload #16
/*    */     //   1147: fload #17
/*    */     //   1149: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1152: pop
/*    */     //   1153: iconst_0
/*    */     //   1154: putfield Ka0 : Z
/*    */     //   1157: i2f
/*    */     //   1158: ldc_w 0.0125
/*    */     //   1161: swap
/*    */     //   1162: fdiv
/*    */     //   1163: invokevirtual m20 : (F)V
/*    */     //   1166: ifne -> 1176
/*    */     //   1169: aload #14
/*    */     //   1171: astore #11
/*    */     //   1173: goto -> 1180
/*    */     //   1176: aload #14
/*    */     //   1178: astore #12
/*    */     //   1180: iinc #13, 1
/*    */     //   1183: goto -> 802
/*    */     //   1186: aload #11
/*    */     //   1188: iload #4
/*    */     //   1190: dup
/*    */     //   1191: iconst_1
/*    */     //   1192: iadd
/*    */     //   1193: istore #4
/*    */     //   1195: i2f
/*    */     //   1196: ldc_w 0.0125
/*    */     //   1199: fmul
/*    */     //   1200: fstore #13
/*    */     //   1202: ifnonnull -> 1213
/*    */     //   1205: aload #12
/*    */     //   1207: ifnonnull -> 1213
/*    */     //   1210: goto -> 1271
/*    */     //   1213: aload_0
/*    */     //   1214: getfield ge : Lf/fQ;
/*    */     //   1217: new f/Nc
/*    */     //   1220: dup
/*    */     //   1221: aload #11
/*    */     //   1223: new f/eo
/*    */     //   1226: dup
/*    */     //   1227: astore #11
/*    */     //   1229: iload #9
/*    */     //   1231: iload #6
/*    */     //   1233: iload #10
/*    */     //   1235: ineg
/*    */     //   1236: iload #5
/*    */     //   1238: idiv
/*    */     //   1239: i2f
/*    */     //   1240: ldc_w 0.1
/*    */     //   1243: fmul
/*    */     //   1244: fstore #14
/*    */     //   1246: idiv
/*    */     //   1247: i2f
/*    */     //   1248: ldc_w 0.05
/*    */     //   1251: fmul
/*    */     //   1252: fload #14
/*    */     //   1254: swap
/*    */     //   1255: fconst_0
/*    */     //   1256: invokespecial <init> : (FFF)V
/*    */     //   1259: aload #12
/*    */     //   1261: aload #11
/*    */     //   1263: fload #13
/*    */     //   1265: invokespecial <init> : (Lf/oq;Lf/oq;Lf/eo;F)V
/*    */     //   1268: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   1271: iload #10
/*    */     //   1273: iload #5
/*    */     //   1275: iadd
/*    */     //   1276: istore #10
/*    */     //   1278: goto -> 786
/*    */     //   1281: iload #9
/*    */     //   1283: iload #6
/*    */     //   1285: iadd
/*    */     //   1286: istore #9
/*    */     //   1288: goto -> 776
/*    */     //   1291: aload_0
/*    */     //   1292: dup
/*    */     //   1293: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   1296: invokevirtual fG0 : ()I
/*    */     //   1299: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   1302: invokevirtual dL : ()I
/*    */     //   1305: invokevirtual nW : (II)V
/*    */     //   1308: getfield F50 : Lf/uX;
/*    */     //   1311: getstatic f/F40.ef0 : Lf/F40;
/*    */     //   1314: iconst_1
/*    */     //   1315: anewarray java/lang/String
/*    */     //   1318: dup
/*    */     //   1319: astore_1
/*    */     //   1320: aload_0
/*    */     //   1321: getfield Pc0 : Lf/j40;
/*    */     //   1324: invokevirtual m : ()Ljava/lang/String;
/*    */     //   1327: iconst_0
/*    */     //   1328: swap
/*    */     //   1329: aastore
/*    */     //   1330: iconst_2
/*    */     //   1331: swap
/*    */     //   1332: sipush #172
/*    */     //   1335: iconst_0
/*    */     //   1336: aload_1
/*    */     //   1337: invokestatic tG : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*    */     //   1340: invokevirtual jq : (Ljava/lang/String;)V
/*    */     //   1343: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   1346: iconst_2
/*    */     //   1347: sipush #1010
/*    */     //   1350: invokevirtual bL : (BS)V
/*    */     //   1353: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   1356: iconst_2
/*    */     //   1357: sipush #1011
/*    */     //   1360: invokevirtual Wk0 : (BS)V
/*    */     //   1363: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1366: iconst_0
/*    */     //   1367: istore_0
/*    */     //   1368: getfield js0 : Lf/js;
/*    */     //   1371: getfield BA : Lf/kf;
/*    */     //   1374: dup
/*    */     //   1375: astore_1
/*    */     //   1376: ifnull -> 1384
/*    */     //   1379: aload_1
/*    */     //   1380: iload_0
/*    */     //   1381: invokevirtual wI0 : (Z)V
/*    */     //   1384: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 104
/*    */     //   #2	-> 107
/*    */     //   #3	-> 115
/*    */     //   #4	-> 118
/*    */     //   #5	-> 121
/*    */     //   #6	-> 124
/*    */     //   #7	-> 127
/*    */     //   #8	-> 233
/*    */     //   #9	-> 236
/*    */     //   #10	-> 351
/*    */     //   #11	-> 354
/*    */     //   #12	-> 367
/*    */     //   #13	-> 372
/*    */     //   #14	-> 375
/*    */     //   #15	-> 380
/*    */     //   #16	-> 385
/*    */     //   #17	-> 389
/*    */     //   #18	-> 401
/*    */     //   #19	-> 404
/*    */     //   #20	-> 415
/*    */     //   #21	-> 419
/*    */     //   #22	-> 431
/*    */     //   #23	-> 434
/*    */     //   #24	-> 545
/*    */     //   #25	-> 549
/*    */     //   #26	-> 561
/*    */     //   #27	-> 564
/*    */     //   #28	-> 646
/*    */     //   #29	-> 662
/*    */     //   #30	-> 667
/*    */     //   #31	-> 679
/*    */     //   #32	-> 683
/*    */     //   #33	-> 709
/*    */     //   #34	-> 712
/*    */     //   #35	-> 831
/*    */     //   #36	-> 852
/*    */     //   #37	-> 865
/*    */     //   #38	-> 879
/*    */     //   #39	-> 891
/*    */     //   #40	-> 899
/*    */     //   #41	-> 904
/*    */     //   #42	-> 940
/*    */     //   #43	-> 947
/*    */     //   #44	-> 1008
/*    */     //   #45	-> 1013
/*    */     //   #46	-> 1060
/*    */     //   #47	-> 1083
/*    */     //   #48	-> 1112
/*    */     //   #49	-> 1128
/*    */     //   #50	-> 1154
/*    */     //   #51	-> 1163
/*    */     //   #52	-> 1337
/*    */     //   #53	-> 1340
/*    */     //   #54	-> 1368
/*    */     //   #55	-> 1371
/*  1 */     //   #56	-> 1381 } public final void tc0() { lpt1 lpt11; if ((lpt11 = this.s60) != null) { lpt11.j10(this.az, null); this
/*  2 */         .pK.tx0(this.s60); }  float f1 = this.az * 14.0F + 100.0F; float f2; int i; short s1; if ((i = (f2 = this.az * 2.0F) cmp 2.0F) >= 0 && (s1 = this.SD0) > 0) { D0.MJ0(s1); this.SD0 = 0; }  int j; short s2; if ((j = f2 cmp 25.0F) >= 0 && (s2 = this.Com7) > 0) { D0.MJ0(s2); this.Com7 = 0; }  if (f2 >= 24.0F && this.a60 == null)
/*    */     
/*  4 */     { UD0 uD0 = On.v30().lpT3(this.Pc0.cY); arrayOfString[0] = this.Pc0.m(); String[] arrayOfString; (arrayOfString = new String[2])[
/*  5 */           1] = uD0.o60(false);
/*    */ 
/*    */       
/*  8 */       this.F50.jq(Ml0.tG((byte)2, F40.ef0, 172, 2, arrayOfString)); this.Pc0.If0(uD0);
/*  9 */       this.Pc0.Zs
/*    */         
/* 11 */         .Cw0 = uD0.AP;
/* 12 */       ParticleEffectExt particleEffectExt = this.wv0.gi0("special/evolution_stars"); this.wv0.L40(particleEffectExt); this.a60.init(); this.a60.start(); this.RK0.Com3(this.a60); String str = (String)this.s60.lz.get(0); float f = 16.0F; rf rf;
/* 13 */       if ((rf = this.s60.f2) != null) { float f3 = 0.0F;
/* 14 */         KI0 kI01 = rf.lY(str, 1, f, null); KI0 kI02;
/* 15 */         if ((kI02 = rf.hm) == null || kI02.lV == 0) { rf.zm0(kI01, f3); } else { if ((kI02 = rf.Ys0) != null) rf.EI0.free(kI02);  rf.Ys0 = kI01; rf.Nul = f3; if ((kI01 = rf.hm).lV < 0) kI01.lV = 1;  }  }
/* 16 */        str = (String)this.s60.lz.get(0); f = -4.0F;
/* 17 */       if ((rf = this.s60.f2) != null) { float f3 = 0.0F;
/* 18 */         KI0 kI01 = rf.lY(str, 1, f, null); KI0 kI02;
/* 19 */         if ((kI02 = rf.hm) == null || kI02.lV == 0) { rf.zm0(kI01, f3); } else { if ((kI02 = rf.Ys0) != null) rf.EI0.free(kI02);  rf.Ys0 = kI01; rf.Nul = f3; if ((kI01 = rf.hm).lV < 0) kI01.lV = 1;  }  }
/* 20 */        R8 r8; if ((r8 = km.u4) != null) {
/* 21 */         int k = this.Pc0.Jg;
/* 22 */         r8.e20.W3(new L3(k, true));
/* 23 */       }  Gp0 gp0; hm0 hm0; if ((gp0 = km.MR) != null && (
/*    */         
/* 25 */         hm0 = gp0.fa(this.Pc0.Jg)) != null)
/*    */       
/* 27 */       { short s3 = uD0.AP;
/* 28 */         byte b1 = hm0.Hk();
/*    */         
/* 30 */         String str1 = this.Pc0.Zs.nr;
/*    */ 
/*    */         
/* 33 */         byte b2 = hm0.K0.ta.eH;
/* 34 */         byte b3 = hm0.hE(), b4 = hm0.iQ();
/*    */         
/* 36 */         short s4 = hm0.K0.y6;
/* 37 */         byte b5 = hm0.oi();
/*    */         
/* 39 */         mA mA = hm0.K0.M6;
/* 40 */         short s5 = hm0.XW();
/*    */         
/* 42 */         s3 = hm0.K0.hp0;
/* 43 */         byte b6 = hm0.K0.K();
/* 44 */         hm0.K0.nH(s3, b1, str1, b2, b3, b4, s4, b5, mA, s5, s3, b6);
/*    */         
/* 46 */         hm0.bh0 = s3 = uD0.AP; hm0.hU = On.v30().lpT3(s3);
/* 47 */         hm0.t30(); }  this.F50.r6(false); }  for (Hc0 hc0 = this.ge.r30(); hc0.hasNext(); ) { f1 += nc.p6; Nc nc;
/* 48 */       eo eo = V1.w3((nc = (Nc)hc0.next()).Dx, (nc = (Nc)hc0.next()).Dx);
/* 49 */       oq oq1 = ((Nc)hc0.next()).ZK0; float f3 = 0.0F, f4 = this.az * 2.0F - nc.p6; if (f2 >= 18.0F) oq1 = nc.TA0;  if (oq1 == null) continue;  if (j > 0) { oq1.Yv0(1.0F, 1.0F, 1.0F, 0.0F); } else if (f2 > 10.0F) { float f = Math.min(1.0F, f2 - 10.0F); oq1.Yv0(1.0F, 1.0F, 1.0F, f); }  if (f4 >= 15.0F || f4 < 1.0F) { eo.x = -1.22F; f4 = 0.0F; f3 = f4 = f3; } else { f4 = nx0.E70(f1); if ((f3 = nx0.zN(f1)) == 0.0F) f3 = nx0.pq0(1.0F);  if (f4 == 0.0F) f4 = nx0.pq0(1.0F);  f3 *= 0.33F; f4 *= 0.33F; }  float f5 = 0.0F; oq oq2; if ((oq2 = nc.ZK0) != null) { float f = eo1.y + f5; eo eo1; oq2.qf0((eo1 = nc.v80).x + f3 + eo.x, f, eo1.z + f4); }  if ((oq2 = nc.TA0) != null) { float f = eo1.y + f5; eo eo1; oq2.qf0((eo1 = nc.v80).x + f3 + eo.x, f, eo1.z + f4); }  if (i > 0 && f2 < 25.0F) this.o50.Zx(oq1);  }  if (f2 < 2.0F) { this.Ce[0].Yv0(0.0F, 0.0F, 0.0F, 0.0F); this.Ce[0].m40(); this.o50.Zx(this.Ce[0]); } else if (j >= 0) { this.Ce[1].Yv0(0.0F, 0.0F, 0.0F, 0.0F); this.Ce[1].m40(); this.o50.Zx(this.Ce[1]); }  this.o50.Js0(); this.wv0.update(); this.wv0.begin(); this.wv0.ZK0(); this.wv0.end(); this.pK.tx0(this.wv0); UA0 uA02; if ((uA02 = this.su[0]) != null) UB0.Kg0.fN(uA02);  UA0 uA01; if ((uA01 = this.su[1]) != null) UB0.Kg0.fN(this);  }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.F50.ra0();
/*    */     boolean bool = true;
/*    */     kf kf;
/*    */     if ((kf = km.wI0.js0.BA) != null)
/*    */       kf.wI0(bool); 
/*    */     R8 r8;
/*    */     if (this.F50.MI0 && (r8 = km.u4) != null) {
/*    */       int i = this.Pc0.Jg;
/*    */       boolean bool1 = false;
/*    */       r8.e20.W3(new L3(i, bool1));
/*    */     } 
/*    */     km.pm0.Wk0((byte)0, (short)0);
/*    */     this.s60.Ea0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */