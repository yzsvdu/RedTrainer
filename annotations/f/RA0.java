/* 1 */ package f;public final class RA0 extends sO { public final Jp Mq0(bM0 parambM0) { this(); Jp jp; String str; if ((str = parambM0.Bh0("id", null)) != null) { jp.Qk0 = str; bM0 bM01; if ((bM01 = parambM0.Jb("translation")) == null || bM01.LG == 3) { eo eo; if (bM01 == null) { bM01 = null; } else { eo eo1; float f1 = bM01.s20(0), f2 = bM01.s20(1), f3 = bM01.s20(2); this(f1, f2, f3); eo = eo1; }  jp.XD0 = eo; bM0 bM02; if ((bM02 = parambM0.Jb("rotation")) == null || bM02.LG == 4) { TG0 tG0; if (bM02 == null) { bM02 = null; } else { TG0 tG01; float f1 = bM02.s20(0), f2 = bM02.s20(1), f3 = bM02.s20(2), f4 = bM02.s20(3); this(f1, f2, f3, f4); tG0 = tG01; }  jp.Ea0 = tG0; bM0 bM03; if ((bM03 = parambM0.Jb("scale")) == null || bM03.LG == 3) { eo eo1; if (bM03 == null) { bM03 = null; } else { eo eo2; float f1 = bM03.s20(0), f2 = bM03.s20(1), f3 = bM03.s20(2); this(f1, f2, f3); eo1 = eo2; }  jp.pB = eo1; parambM0.Bh0("mesh", null); bM0 bM04; if ((bM04 = parambM0.Jb("parts")) != null) { byte b; bM0 bM05; for (jp.Sz = new bj0[bM04.LG], b = 0, bM05 = bM04.Rr0; bM05 != null; ) { bj0 bj0; this(); String str2 = bM05.Bh0("materialid", null); String str1; if ((str1 = bM05.Bh0("meshpartid", null)) != null && str2 != null) { bj0.const = str2; bj0.E00 = str1; bM0 bM06; if ((bM06 = bM05.Jb("bones")) != null) { eM eM; this(true, bM06.LG, String.class, Matrix4.class); for (bj0.fu = eM, bM06 = bM06.Rr0; bM06 != null; ) { String str3; if ((str3 = bM06.Bh0("node", null)) != null) { Matrix4 matrix4; this(); bM0 bM07; if ((bM07 = bM06.Jb("translation")) != null && bM07.LG >= 3) { float f1 = bM07.s20(0), f2 = bM07.s20(1), f3 = bM07.s20(2); matrix4.g7(f1, f2, f3); }  if ((bM07 = bM06.Jb("rotation")) != null && bM07.LG >= 4) { float f1 = bM07.s20(0), f2 = bM07.s20(1), f3 = bM07.s20(2), f4 = bM07.s20(3); matrix4.SD(this.ti0.vp0(f1, f2, f3, f4)); }  if ((bM07 = bM06.Jb("scale")) != null && bM07.LG >= 3) { float f1 = bM07.s20(0), f2 = bM07.s20(1), f3 = bM07.s20(2); matrix4.GJ(f1, f2, f3); }  bj0.fu.Ed0(str3, matrix4); bM06 = bM06.H7; continue; }  throw new JU("Bone node ID missing"); }  }  jp.Sz[b] = bj0; bM05 = bM05.H7; b++; continue; }  throw new JU(De0.AT("Node ", str, " part is missing meshPartId or materialId")); }  }
/* 2 */              if ((parambM0 = parambM0.Jb("children")) != null) { byte b; bM0 bM05; for (jp.JX = new Jp[parambM0.LG], b = 0, bM05 = parambM0.Rr0; bM05 != null; ) { jp.JX[b] = Mq0(bM05); bM05 = bM05.H7; b++; }  }  return jp; }  throw new JU("Node scale incomplete"); }  throw new JU("Node rotation incomplete"); }  throw new JU("Node translation incomplete"); }  throw new JU("Node id missing."); }
/*   */ 
/*   */   
/*   */   public final Hm Ru;
/*   */   public final TG0 ti0;
/*   */   
/*   */   public RA0(Hm paramHm) {
/*   */     this(paramHm, null);
/*   */   }
/*   */   
/*   */   public RA0(Hm paramHm, Xt0 paramXt0) {
/*   */     super(paramXt0);
/*   */     TG0 tG0;
/*   */     this();
/*   */     this.ti0 = this;
/*   */     this.Ru = paramHm;
/*   */   }
/*   */   
/*   */   public static Color p6(bM0 parambM0) {
/*   */     if (parambM0.LG >= 3) {
/*   */       float f1 = parambM0.s20(0);
/*   */       float f2 = parambM0.s20(1);
/*   */       float f3 = parambM0.s20(2);
/*   */       return new Color(f1, f2, f3, 1.0F);
/*   */     } 
/*   */     throw new JU("Expected Color values <> than three.");
/*   */   }
/*   */   
/*   */   public final YW KY(RD0 paramRD0, oI paramoI) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Ru : Lf/Hm;
/*   */     //   4: aload_1
/*   */     //   5: invokeinterface PL0 : (Lf/RD0;)Lf/bM0;
/*   */     //   10: dup
/*   */     //   11: astore_2
/*   */     //   12: new f/YW
/*   */     //   15: dup
/*   */     //   16: astore_3
/*   */     //   17: invokespecial <init> : ()V
/*   */     //   20: ldc 'version'
/*   */     //   22: invokevirtual Cp : (Ljava/lang/String;)Lf/bM0;
/*   */     //   25: dup
/*   */     //   26: astore #4
/*   */     //   28: aload_3
/*   */     //   29: getfield lpT1 : [S
/*   */     //   32: astore #5
/*   */     //   34: getfield Rr0 : Lf/bM0;
/*   */     //   37: dup
/*   */     //   38: astore #6
/*   */     //   40: ifnull -> 3297
/*   */     //   43: aload #4
/*   */     //   45: aload_3
/*   */     //   46: aload #5
/*   */     //   48: aload #6
/*   */     //   50: invokevirtual B9 : ()S
/*   */     //   53: iconst_0
/*   */     //   54: swap
/*   */     //   55: sastore
/*   */     //   56: getfield lpT1 : [S
/*   */     //   59: astore #5
/*   */     //   61: iconst_1
/*   */     //   62: istore #6
/*   */     //   64: getfield Rr0 : Lf/bM0;
/*   */     //   67: astore #7
/*   */     //   69: aload #7
/*   */     //   71: ifnull -> 92
/*   */     //   74: iload #6
/*   */     //   76: ifle -> 92
/*   */     //   79: aload #7
/*   */     //   81: iinc #6, -1
/*   */     //   84: getfield H7 : Lf/bM0;
/*   */     //   87: astore #7
/*   */     //   89: goto -> 69
/*   */     //   92: aload #7
/*   */     //   94: ifnull -> 3272
/*   */     //   97: aload_3
/*   */     //   98: aload #5
/*   */     //   100: aload #7
/*   */     //   102: invokevirtual B9 : ()S
/*   */     //   105: iconst_1
/*   */     //   106: swap
/*   */     //   107: sastore
/*   */     //   108: getfield lpT1 : [S
/*   */     //   111: dup
/*   */     //   112: astore #4
/*   */     //   114: iconst_0
/*   */     //   115: saload
/*   */     //   116: ifne -> 3261
/*   */     //   119: aload #4
/*   */     //   121: iconst_1
/*   */     //   122: saload
/*   */     //   123: iconst_1
/*   */     //   124: if_icmpne -> 3261
/*   */     //   127: aload_2
/*   */     //   128: dup
/*   */     //   129: ldc 'id'
/*   */     //   131: ldc ''
/*   */     //   133: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   136: pop
/*   */     //   137: ldc 'meshes'
/*   */     //   139: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   142: dup
/*   */     //   143: astore #4
/*   */     //   145: ifnull -> 1311
/*   */     //   148: aload #4
/*   */     //   150: aload_3
/*   */     //   151: getfield Lg : Lf/fQ;
/*   */     //   154: aload #4
/*   */     //   156: getfield LG : I
/*   */     //   159: invokevirtual ZY : (I)V
/*   */     //   162: getfield Rr0 : Lf/bM0;
/*   */     //   165: astore #4
/*   */     //   167: aload #4
/*   */     //   169: ifnull -> 1311
/*   */     //   172: aload #4
/*   */     //   174: dup
/*   */     //   175: new f/mZ
/*   */     //   178: dup
/*   */     //   179: astore #5
/*   */     //   181: invokespecial <init> : ()V
/*   */     //   184: ldc 'id'
/*   */     //   186: ldc ''
/*   */     //   188: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   191: pop
/*   */     //   192: ldc 'attributes'
/*   */     //   194: invokevirtual Cp : (Ljava/lang/String;)Lf/bM0;
/*   */     //   197: new f/fQ
/*   */     //   200: dup
/*   */     //   201: astore #6
/*   */     //   203: invokespecial <init> : ()V
/*   */     //   206: iconst_0
/*   */     //   207: istore #7
/*   */     //   209: iconst_0
/*   */     //   210: istore #8
/*   */     //   212: getfield Rr0 : Lf/bM0;
/*   */     //   215: astore #9
/*   */     //   217: aload #9
/*   */     //   219: ifnull -> 545
/*   */     //   222: aload #9
/*   */     //   224: invokevirtual DX : ()Ljava/lang/String;
/*   */     //   227: dup
/*   */     //   228: astore #10
/*   */     //   230: ldc 'POSITION'
/*   */     //   232: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   235: ifeq -> 254
/*   */     //   238: new f/lw0
/*   */     //   241: dup
/*   */     //   242: astore #10
/*   */     //   244: iconst_1
/*   */     //   245: iconst_3
/*   */     //   246: ldc 'a_position'
/*   */     //   248: invokespecial <init> : (IILjava/lang/String;)V
/*   */     //   251: goto -> 308
/*   */     //   254: aload #10
/*   */     //   256: ldc 'NORMAL'
/*   */     //   258: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   261: ifeq -> 281
/*   */     //   264: new f/lw0
/*   */     //   267: dup
/*   */     //   268: astore #10
/*   */     //   270: bipush #8
/*   */     //   272: iconst_3
/*   */     //   273: ldc 'a_normal'
/*   */     //   275: invokespecial <init> : (IILjava/lang/String;)V
/*   */     //   278: goto -> 308
/*   */     //   281: aload #10
/*   */     //   283: ldc 'COLOR'
/*   */     //   285: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   288: ifeq -> 318
/*   */     //   291: new f/lw0
/*   */     //   294: dup
/*   */     //   295: astore #10
/*   */     //   297: iconst_2
/*   */     //   298: iconst_4
/*   */     //   299: sipush #5126
/*   */     //   302: iconst_0
/*   */     //   303: ldc 'a_color'
/*   */     //   305: invokespecial <init> : (IIIZLjava/lang/String;)V
/*   */     //   308: aload #6
/*   */     //   310: aload #10
/*   */     //   312: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   315: goto -> 518
/*   */     //   318: aload #10
/*   */     //   320: ldc 'COLORPACKED'
/*   */     //   322: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   325: ifeq -> 348
/*   */     //   328: new f/lw0
/*   */     //   331: dup
/*   */     //   332: astore #10
/*   */     //   334: iconst_4
/*   */     //   335: iconst_4
/*   */     //   336: sipush #5121
/*   */     //   339: iconst_1
/*   */     //   340: ldc 'a_color'
/*   */     //   342: invokespecial <init> : (IIIZLjava/lang/String;)V
/*   */     //   345: goto -> 401
/*   */     //   348: aload #10
/*   */     //   350: ldc 'TANGENT'
/*   */     //   352: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   355: ifeq -> 376
/*   */     //   358: new f/lw0
/*   */     //   361: dup
/*   */     //   362: astore #10
/*   */     //   364: sipush #128
/*   */     //   367: iconst_3
/*   */     //   368: ldc 'a_tangent'
/*   */     //   370: invokespecial <init> : (IILjava/lang/String;)V
/*   */     //   373: goto -> 401
/*   */     //   376: aload #10
/*   */     //   378: ldc 'BINORMAL'
/*   */     //   380: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   383: ifeq -> 411
/*   */     //   386: new f/lw0
/*   */     //   389: dup
/*   */     //   390: astore #10
/*   */     //   392: sipush #256
/*   */     //   395: iconst_3
/*   */     //   396: ldc 'a_binormal'
/*   */     //   398: invokespecial <init> : (IILjava/lang/String;)V
/*   */     //   401: aload #6
/*   */     //   403: aload #10
/*   */     //   405: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   408: goto -> 518
/*   */     //   411: aload #10
/*   */     //   413: ldc 'TEXCOORD'
/*   */     //   415: invokevirtual startsWith : (Ljava/lang/String;)Z
/*   */     //   418: ifeq -> 466
/*   */     //   421: aload #6
/*   */     //   423: iload #7
/*   */     //   425: iconst_1
/*   */     //   426: iadd
/*   */     //   427: istore #10
/*   */     //   429: new f/lw0
/*   */     //   432: dup
/*   */     //   433: astore #11
/*   */     //   435: ldc 'a_texCoord'
/*   */     //   437: iload #7
/*   */     //   439: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*   */     //   442: astore #12
/*   */     //   444: bipush #16
/*   */     //   446: iconst_2
/*   */     //   447: aload #12
/*   */     //   449: iload #7
/*   */     //   451: invokespecial <init> : (IILjava/lang/String;I)V
/*   */     //   454: aload #11
/*   */     //   456: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   459: iload #10
/*   */     //   461: istore #7
/*   */     //   463: goto -> 518
/*   */     //   466: aload #10
/*   */     //   468: ldc 'BLENDWEIGHT'
/*   */     //   470: invokevirtual startsWith : (Ljava/lang/String;)Z
/*   */     //   473: ifeq -> 528
/*   */     //   476: aload #6
/*   */     //   478: iload #8
/*   */     //   480: iconst_1
/*   */     //   481: iadd
/*   */     //   482: istore #10
/*   */     //   484: new f/lw0
/*   */     //   487: dup
/*   */     //   488: astore #11
/*   */     //   490: ldc 'a_boneWeight'
/*   */     //   492: iload #8
/*   */     //   494: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*   */     //   497: astore #12
/*   */     //   499: bipush #64
/*   */     //   501: iconst_2
/*   */     //   502: aload #12
/*   */     //   504: iload #8
/*   */     //   506: invokespecial <init> : (IILjava/lang/String;I)V
/*   */     //   509: aload #11
/*   */     //   511: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   514: iload #10
/*   */     //   516: istore #8
/*   */     //   518: aload #9
/*   */     //   520: getfield H7 : Lf/bM0;
/*   */     //   523: astore #9
/*   */     //   525: goto -> 217
/*   */     //   528: new f/JU
/*   */     //   531: dup
/*   */     //   532: ldc 'Unknown vertex attribute ''
/*   */     //   534: aload #10
/*   */     //   536: ldc '', should be one of position, normal, uv, tangent or binormal'
/*   */     //   538: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   541: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   544: athrow
/*   */     //   545: aload #4
/*   */     //   547: aload #5
/*   */     //   549: aload #6
/*   */     //   551: ldc f/lw0
/*   */     //   553: invokevirtual Ib : (Ljava/lang/Class;)[Ljava/lang/Object;
/*   */     //   556: checkcast [Lf/lw0;
/*   */     //   559: putfield e7 : [Lf/lw0;
/*   */     //   562: ldc 'vertices'
/*   */     //   564: invokevirtual Cp : (Ljava/lang/String;)Lf/bM0;
/*   */     //   567: dup
/*   */     //   568: astore #6
/*   */     //   570: getfield eR : Lf/nc;
/*   */     //   573: getstatic f/nc.implements : Lf/nc;
/*   */     //   576: if_acmpne -> 1286
/*   */     //   579: aload #6
/*   */     //   581: dup
/*   */     //   582: getfield LG : I
/*   */     //   585: newarray float
/*   */     //   587: astore #6
/*   */     //   589: iconst_0
/*   */     //   590: istore #7
/*   */     //   592: getfield Rr0 : Lf/bM0;
/*   */     //   595: astore #8
/*   */     //   597: aload #8
/*   */     //   599: ifnull -> 742
/*   */     //   602: getstatic f/YU.Ae : [I
/*   */     //   605: aload #8
/*   */     //   607: getfield eR : Lf/nc;
/*   */     //   610: invokevirtual ordinal : ()I
/*   */     //   613: iaload
/*   */     //   614: tableswitch default -> 644, 1 -> 712, 2 -> 701, 3 -> 690, 4 -> 668
/*   */     //   644: new java/lang/IllegalStateException
/*   */     //   647: dup
/*   */     //   648: ldc 'Value cannot be converted to float: '
/*   */     //   650: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   653: aload #8
/*   */     //   655: getfield eR : Lf/nc;
/*   */     //   658: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   661: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   664: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   667: athrow
/*   */     //   668: aload #8
/*   */     //   670: getfield yi0 : J
/*   */     //   673: lconst_0
/*   */     //   674: lcmp
/*   */     //   675: ifeq -> 684
/*   */     //   678: fconst_1
/*   */     //   679: fstore #9
/*   */     //   681: goto -> 722
/*   */     //   684: fconst_0
/*   */     //   685: fstore #9
/*   */     //   687: goto -> 722
/*   */     //   690: aload #8
/*   */     //   692: getfield yi0 : J
/*   */     //   695: l2f
/*   */     //   696: fstore #9
/*   */     //   698: goto -> 722
/*   */     //   701: aload #8
/*   */     //   703: getfield v3 : D
/*   */     //   706: d2f
/*   */     //   707: fstore #9
/*   */     //   709: goto -> 722
/*   */     //   712: aload #8
/*   */     //   714: getfield U8 : Ljava/lang/String;
/*   */     //   717: invokestatic parseFloat : (Ljava/lang/String;)F
/*   */     //   720: fstore #9
/*   */     //   722: aload #8
/*   */     //   724: aload #6
/*   */     //   726: iload #7
/*   */     //   728: fload #9
/*   */     //   730: fastore
/*   */     //   731: getfield H7 : Lf/bM0;
/*   */     //   734: astore #8
/*   */     //   736: iinc #7, 1
/*   */     //   739: goto -> 597
/*   */     //   742: aload #4
/*   */     //   744: aload #5
/*   */     //   746: aload #6
/*   */     //   748: putfield qL0 : [F
/*   */     //   751: ldc_w 'parts'
/*   */     //   754: invokevirtual Cp : (Ljava/lang/String;)Lf/bM0;
/*   */     //   757: new f/fQ
/*   */     //   760: dup
/*   */     //   761: astore #6
/*   */     //   763: invokespecial <init> : ()V
/*   */     //   766: getfield Rr0 : Lf/bM0;
/*   */     //   769: astore #7
/*   */     //   771: aload #7
/*   */     //   773: ifnull -> 1251
/*   */     //   776: aload #7
/*   */     //   778: new f/ow0
/*   */     //   781: dup
/*   */     //   782: astore #8
/*   */     //   784: invokespecial <init> : ()V
/*   */     //   787: ldc 'id'
/*   */     //   789: aconst_null
/*   */     //   790: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   793: dup
/*   */     //   794: astore #9
/*   */     //   796: ifnull -> 1240
/*   */     //   799: aload #6
/*   */     //   801: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   804: astore #10
/*   */     //   806: aload #10
/*   */     //   808: invokevirtual hasNext : ()Z
/*   */     //   811: ifeq -> 855
/*   */     //   814: aload #10
/*   */     //   816: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   819: checkcast f/ow0
/*   */     //   822: getfield Qp0 : Ljava/lang/String;
/*   */     //   825: aload #9
/*   */     //   827: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   830: ifne -> 836
/*   */     //   833: goto -> 806
/*   */     //   836: new f/JU
/*   */     //   839: dup
/*   */     //   840: ldc_w 'Mesh part with id ''
/*   */     //   843: aload #9
/*   */     //   845: ldc_w '' already in defined'
/*   */     //   848: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   851: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   854: athrow
/*   */     //   855: aload #7
/*   */     //   857: aload #8
/*   */     //   859: aload #9
/*   */     //   861: putfield Qp0 : Ljava/lang/String;
/*   */     //   864: ldc_w 'type'
/*   */     //   867: aconst_null
/*   */     //   868: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   871: dup
/*   */     //   872: astore #10
/*   */     //   874: ifnull -> 1221
/*   */     //   877: aload #10
/*   */     //   879: ldc_w 'TRIANGLES'
/*   */     //   882: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   885: ifeq -> 894
/*   */     //   888: iconst_4
/*   */     //   889: istore #9
/*   */     //   891: goto -> 959
/*   */     //   894: aload #10
/*   */     //   896: ldc_w 'LINES'
/*   */     //   899: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   902: ifeq -> 911
/*   */     //   905: iconst_1
/*   */     //   906: istore #9
/*   */     //   908: goto -> 959
/*   */     //   911: aload #10
/*   */     //   913: ldc_w 'POINTS'
/*   */     //   916: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   919: ifeq -> 928
/*   */     //   922: iconst_0
/*   */     //   923: istore #9
/*   */     //   925: goto -> 959
/*   */     //   928: aload #10
/*   */     //   930: ldc_w 'TRIANGLE_STRIP'
/*   */     //   933: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   936: ifeq -> 945
/*   */     //   939: iconst_5
/*   */     //   940: istore #9
/*   */     //   942: goto -> 959
/*   */     //   945: aload #10
/*   */     //   947: ldc_w 'LINE_STRIP'
/*   */     //   950: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   953: ifeq -> 1202
/*   */     //   956: iconst_3
/*   */     //   957: istore #9
/*   */     //   959: aload #7
/*   */     //   961: aload #8
/*   */     //   963: iload #9
/*   */     //   965: putfield Ff0 : I
/*   */     //   968: ldc_w 'indices'
/*   */     //   971: invokevirtual Cp : (Ljava/lang/String;)Lf/bM0;
/*   */     //   974: dup
/*   */     //   975: astore #9
/*   */     //   977: getfield eR : Lf/nc;
/*   */     //   980: getstatic f/nc.implements : Lf/nc;
/*   */     //   983: if_acmpne -> 1177
/*   */     //   986: aload #9
/*   */     //   988: dup
/*   */     //   989: getfield LG : I
/*   */     //   992: newarray short
/*   */     //   994: astore #9
/*   */     //   996: iconst_0
/*   */     //   997: istore #10
/*   */     //   999: getfield Rr0 : Lf/bM0;
/*   */     //   1002: astore #11
/*   */     //   1004: aload #11
/*   */     //   1006: ifnull -> 1153
/*   */     //   1009: getstatic f/YU.Ae : [I
/*   */     //   1012: aload #11
/*   */     //   1014: getfield eR : Lf/nc;
/*   */     //   1017: invokevirtual ordinal : ()I
/*   */     //   1020: iaload
/*   */     //   1021: tableswitch default -> 1052, 1 -> 1123, 2 -> 1111, 3 -> 1099, 4 -> 1077
/*   */     //   1052: new java/lang/IllegalStateException
/*   */     //   1055: dup
/*   */     //   1056: ldc_w 'Value cannot be converted to short: '
/*   */     //   1059: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   1062: aload #11
/*   */     //   1064: getfield eR : Lf/nc;
/*   */     //   1067: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   1070: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   1073: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1076: athrow
/*   */     //   1077: aload #11
/*   */     //   1079: getfield yi0 : J
/*   */     //   1082: lconst_0
/*   */     //   1083: lcmp
/*   */     //   1084: ifeq -> 1093
/*   */     //   1087: iconst_1
/*   */     //   1088: istore #12
/*   */     //   1090: goto -> 1133
/*   */     //   1093: iconst_0
/*   */     //   1094: istore #12
/*   */     //   1096: goto -> 1133
/*   */     //   1099: aload #11
/*   */     //   1101: getfield yi0 : J
/*   */     //   1104: l2i
/*   */     //   1105: i2s
/*   */     //   1106: istore #12
/*   */     //   1108: goto -> 1133
/*   */     //   1111: aload #11
/*   */     //   1113: getfield v3 : D
/*   */     //   1116: d2i
/*   */     //   1117: i2s
/*   */     //   1118: istore #12
/*   */     //   1120: goto -> 1133
/*   */     //   1123: aload #11
/*   */     //   1125: getfield U8 : Ljava/lang/String;
/*   */     //   1128: invokestatic parseShort : (Ljava/lang/String;)S
/*   */     //   1131: istore #12
/*   */     //   1133: aload #11
/*   */     //   1135: aload #9
/*   */     //   1137: iload #10
/*   */     //   1139: iload #12
/*   */     //   1141: sastore
/*   */     //   1142: getfield H7 : Lf/bM0;
/*   */     //   1145: astore #11
/*   */     //   1147: iinc #10, 1
/*   */     //   1150: goto -> 1004
/*   */     //   1153: aload #7
/*   */     //   1155: aload #6
/*   */     //   1157: aload #8
/*   */     //   1159: aload #9
/*   */     //   1161: putfield xj : [S
/*   */     //   1164: aload #8
/*   */     //   1166: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   1169: getfield H7 : Lf/bM0;
/*   */     //   1172: astore #7
/*   */     //   1174: goto -> 771
/*   */     //   1177: new java/lang/IllegalStateException
/*   */     //   1180: dup
/*   */     //   1181: ldc_w 'Value is not an array: '
/*   */     //   1184: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   1187: aload #9
/*   */     //   1189: getfield eR : Lf/nc;
/*   */     //   1192: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   1195: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   1198: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1201: athrow
/*   */     //   1202: new f/JU
/*   */     //   1205: dup
/*   */     //   1206: ldc_w 'Unknown primitive type ''
/*   */     //   1209: aload #10
/*   */     //   1211: ldc_w '', should be one of triangle, trianglestrip, line, linestrip, lineloop or point'
/*   */     //   1214: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1217: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1220: athrow
/*   */     //   1221: new f/JU
/*   */     //   1224: dup
/*   */     //   1225: ldc_w 'No primitive type given for mesh part ''
/*   */     //   1228: aload #9
/*   */     //   1230: ldc_w '''
/*   */     //   1233: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1236: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1239: athrow
/*   */     //   1240: new f/JU
/*   */     //   1243: dup
/*   */     //   1244: ldc_w 'Not id given for mesh part'
/*   */     //   1247: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1250: athrow
/*   */     //   1251: aload #4
/*   */     //   1253: aload_3
/*   */     //   1254: aload #5
/*   */     //   1256: aload #6
/*   */     //   1258: ldc_w f/ow0
/*   */     //   1261: invokevirtual Ib : (Ljava/lang/Class;)[Ljava/lang/Object;
/*   */     //   1264: checkcast [Lf/ow0;
/*   */     //   1267: putfield i2 : [Lf/ow0;
/*   */     //   1270: getfield Lg : Lf/fQ;
/*   */     //   1273: aload #5
/*   */     //   1275: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   1278: getfield H7 : Lf/bM0;
/*   */     //   1281: astore #4
/*   */     //   1283: goto -> 167
/*   */     //   1286: new java/lang/IllegalStateException
/*   */     //   1289: dup
/*   */     //   1290: ldc_w 'Value is not an array: '
/*   */     //   1293: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   1296: aload #6
/*   */     //   1298: getfield eR : Lf/nc;
/*   */     //   1301: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   1304: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   1307: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1310: athrow
/*   */     //   1311: aload_2
/*   */     //   1312: aload_1
/*   */     //   1313: invokevirtual wT : ()Lf/RD0;
/*   */     //   1316: invokevirtual rw : ()Ljava/lang/String;
/*   */     //   1319: astore_1
/*   */     //   1320: ldc_w 'materials'
/*   */     //   1323: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1326: dup
/*   */     //   1327: astore #4
/*   */     //   1329: ifnonnull -> 1335
/*   */     //   1332: goto -> 2140
/*   */     //   1335: aload #4
/*   */     //   1337: aload_3
/*   */     //   1338: getfield ID : Lf/fQ;
/*   */     //   1341: aload #4
/*   */     //   1343: getfield LG : I
/*   */     //   1346: invokevirtual ZY : (I)V
/*   */     //   1349: getfield Rr0 : Lf/bM0;
/*   */     //   1352: astore #4
/*   */     //   1354: aload #4
/*   */     //   1356: ifnull -> 2140
/*   */     //   1359: aload #4
/*   */     //   1361: new f/QD
/*   */     //   1364: dup
/*   */     //   1365: astore #5
/*   */     //   1367: invokespecial <init> : ()V
/*   */     //   1370: ldc 'id'
/*   */     //   1372: aconst_null
/*   */     //   1373: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1376: dup
/*   */     //   1377: astore #6
/*   */     //   1379: ifnull -> 2129
/*   */     //   1382: aload #4
/*   */     //   1384: aload #5
/*   */     //   1386: aload #6
/*   */     //   1388: putfield KJ0 : Ljava/lang/String;
/*   */     //   1391: ldc_w 'diffuse'
/*   */     //   1394: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1397: dup
/*   */     //   1398: astore #6
/*   */     //   1400: ifnull -> 1413
/*   */     //   1403: aload #5
/*   */     //   1405: aload #6
/*   */     //   1407: invokestatic p6 : (Lf/bM0;)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1410: putfield sK : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1413: aload #4
/*   */     //   1415: ldc_w 'ambient'
/*   */     //   1418: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1421: dup
/*   */     //   1422: astore #6
/*   */     //   1424: ifnull -> 1437
/*   */     //   1427: aload #5
/*   */     //   1429: aload #6
/*   */     //   1431: invokestatic p6 : (Lf/bM0;)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1434: putfield W4 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1437: aload #4
/*   */     //   1439: ldc_w 'emissive'
/*   */     //   1442: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1445: dup
/*   */     //   1446: astore #6
/*   */     //   1448: ifnull -> 1461
/*   */     //   1451: aload #5
/*   */     //   1453: aload #6
/*   */     //   1455: invokestatic p6 : (Lf/bM0;)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1458: putfield PC0 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1461: aload #4
/*   */     //   1463: ldc_w 'specular'
/*   */     //   1466: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1469: dup
/*   */     //   1470: astore #6
/*   */     //   1472: ifnull -> 1485
/*   */     //   1475: aload #5
/*   */     //   1477: aload #6
/*   */     //   1479: invokestatic p6 : (Lf/bM0;)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1482: putfield yF0 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1485: aload #4
/*   */     //   1487: ldc_w 'reflection'
/*   */     //   1490: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1493: dup
/*   */     //   1494: astore #6
/*   */     //   1496: ifnull -> 1509
/*   */     //   1499: aload #5
/*   */     //   1501: aload #6
/*   */     //   1503: invokestatic p6 : (Lf/bM0;)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1506: putfield vI : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   1509: aload #4
/*   */     //   1511: aload #5
/*   */     //   1513: aload #4
/*   */     //   1515: aload #5
/*   */     //   1517: aload #4
/*   */     //   1519: ldc_w 'shininess'
/*   */     //   1522: fconst_0
/*   */     //   1523: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   1526: putfield Tu : F
/*   */     //   1529: ldc_w 'opacity'
/*   */     //   1532: fconst_1
/*   */     //   1533: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   1536: putfield wC : F
/*   */     //   1539: ldc_w 'textures'
/*   */     //   1542: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1545: dup
/*   */     //   1546: astore #6
/*   */     //   1548: ifnull -> 2110
/*   */     //   1551: aload #6
/*   */     //   1553: getfield Rr0 : Lf/bM0;
/*   */     //   1556: astore #6
/*   */     //   1558: aload #6
/*   */     //   1560: ifnull -> 2110
/*   */     //   1563: aload #6
/*   */     //   1565: new f/Ri0
/*   */     //   1568: dup
/*   */     //   1569: astore #7
/*   */     //   1571: invokespecial <init> : ()V
/*   */     //   1574: ldc 'id'
/*   */     //   1576: aconst_null
/*   */     //   1577: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1580: ifnull -> 2099
/*   */     //   1583: aload #6
/*   */     //   1585: ldc_w 'filename'
/*   */     //   1588: aconst_null
/*   */     //   1589: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1592: dup
/*   */     //   1593: astore #8
/*   */     //   1595: ifnull -> 2088
/*   */     //   1598: aload_1
/*   */     //   1599: dup
/*   */     //   1600: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   1603: astore #9
/*   */     //   1605: invokevirtual length : ()I
/*   */     //   1608: ifeq -> 1632
/*   */     //   1611: aload_1
/*   */     //   1612: ldc_w '/'
/*   */     //   1615: invokevirtual endsWith : (Ljava/lang/String;)Z
/*   */     //   1618: ifeq -> 1624
/*   */     //   1621: goto -> 1632
/*   */     //   1624: ldc_w '/'
/*   */     //   1627: astore #10
/*   */     //   1629: goto -> 1636
/*   */     //   1632: ldc ''
/*   */     //   1634: astore #10
/*   */     //   1636: aload #6
/*   */     //   1638: aload #7
/*   */     //   1640: aload #9
/*   */     //   1642: aload #10
/*   */     //   1644: aload #8
/*   */     //   1646: invokestatic Vr0 : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1649: putfield i0 : Ljava/lang/String;
/*   */     //   1652: ldc_w 'uvTranslation'
/*   */     //   1655: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1658: dup
/*   */     //   1659: astore #8
/*   */     //   1661: fconst_0
/*   */     //   1662: fstore #9
/*   */     //   1664: fconst_0
/*   */     //   1665: fstore #10
/*   */     //   1667: ifnonnull -> 1686
/*   */     //   1670: new f/NC0
/*   */     //   1673: dup
/*   */     //   1674: astore #8
/*   */     //   1676: fload #9
/*   */     //   1678: fload #10
/*   */     //   1680: invokespecial <init> : (FF)V
/*   */     //   1683: goto -> 1724
/*   */     //   1686: aload #8
/*   */     //   1688: getfield LG : I
/*   */     //   1691: iconst_2
/*   */     //   1692: if_icmpne -> 2077
/*   */     //   1695: new f/NC0
/*   */     //   1698: dup
/*   */     //   1699: astore #9
/*   */     //   1701: aload #8
/*   */     //   1703: dup
/*   */     //   1704: iconst_0
/*   */     //   1705: invokevirtual s20 : (I)F
/*   */     //   1708: fstore #8
/*   */     //   1710: iconst_1
/*   */     //   1711: invokevirtual s20 : (I)F
/*   */     //   1714: fload #8
/*   */     //   1716: swap
/*   */     //   1717: invokespecial <init> : (FF)V
/*   */     //   1720: aload #9
/*   */     //   1722: astore #8
/*   */     //   1724: aload #6
/*   */     //   1726: aload #7
/*   */     //   1728: aload #8
/*   */     //   1730: putfield jO : Lf/NC0;
/*   */     //   1733: ldc_w 'uvScaling'
/*   */     //   1736: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   1739: dup
/*   */     //   1740: astore #8
/*   */     //   1742: fconst_1
/*   */     //   1743: fstore #9
/*   */     //   1745: fconst_1
/*   */     //   1746: fstore #10
/*   */     //   1748: ifnonnull -> 1767
/*   */     //   1751: new f/NC0
/*   */     //   1754: dup
/*   */     //   1755: astore #8
/*   */     //   1757: fload #9
/*   */     //   1759: fload #10
/*   */     //   1761: invokespecial <init> : (FF)V
/*   */     //   1764: goto -> 1805
/*   */     //   1767: aload #8
/*   */     //   1769: getfield LG : I
/*   */     //   1772: iconst_2
/*   */     //   1773: if_icmpne -> 2066
/*   */     //   1776: new f/NC0
/*   */     //   1779: dup
/*   */     //   1780: astore #9
/*   */     //   1782: aload #8
/*   */     //   1784: dup
/*   */     //   1785: iconst_0
/*   */     //   1786: invokevirtual s20 : (I)F
/*   */     //   1789: fstore #8
/*   */     //   1791: iconst_1
/*   */     //   1792: invokevirtual s20 : (I)F
/*   */     //   1795: fload #8
/*   */     //   1797: swap
/*   */     //   1798: invokespecial <init> : (FF)V
/*   */     //   1801: aload #9
/*   */     //   1803: astore #8
/*   */     //   1805: aload #6
/*   */     //   1807: aload #7
/*   */     //   1809: aload #8
/*   */     //   1811: putfield ne0 : Lf/NC0;
/*   */     //   1814: ldc_w 'type'
/*   */     //   1817: aconst_null
/*   */     //   1818: invokevirtual Bh0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   1821: dup
/*   */     //   1822: astore #8
/*   */     //   1824: ifnull -> 2055
/*   */     //   1827: aload #8
/*   */     //   1829: ldc_w 'AMBIENT'
/*   */     //   1832: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1835: ifeq -> 1844
/*   */     //   1838: iconst_4
/*   */     //   1839: istore #8
/*   */     //   1841: goto -> 2004
/*   */     //   1844: aload #8
/*   */     //   1846: ldc_w 'BUMP'
/*   */     //   1849: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1852: ifeq -> 1862
/*   */     //   1855: bipush #8
/*   */     //   1857: istore #8
/*   */     //   1859: goto -> 2004
/*   */     //   1862: aload #8
/*   */     //   1864: ldc_w 'DIFFUSE'
/*   */     //   1867: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1870: ifeq -> 1879
/*   */     //   1873: iconst_2
/*   */     //   1874: istore #8
/*   */     //   1876: goto -> 2004
/*   */     //   1879: aload #8
/*   */     //   1881: ldc_w 'EMISSIVE'
/*   */     //   1884: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1887: ifeq -> 1896
/*   */     //   1890: iconst_3
/*   */     //   1891: istore #8
/*   */     //   1893: goto -> 2004
/*   */     //   1896: aload #8
/*   */     //   1898: ldc_w 'NONE'
/*   */     //   1901: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1904: ifeq -> 1913
/*   */     //   1907: iconst_1
/*   */     //   1908: istore #8
/*   */     //   1910: goto -> 2004
/*   */     //   1913: aload #8
/*   */     //   1915: ldc 'NORMAL'
/*   */     //   1917: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1920: ifeq -> 1930
/*   */     //   1923: bipush #7
/*   */     //   1925: istore #8
/*   */     //   1927: goto -> 2004
/*   */     //   1930: aload #8
/*   */     //   1932: ldc_w 'REFLECTION'
/*   */     //   1935: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1938: ifeq -> 1948
/*   */     //   1941: bipush #10
/*   */     //   1943: istore #8
/*   */     //   1945: goto -> 2004
/*   */     //   1948: aload #8
/*   */     //   1950: ldc_w 'SHININESS'
/*   */     //   1953: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1956: ifeq -> 1966
/*   */     //   1959: bipush #6
/*   */     //   1961: istore #8
/*   */     //   1963: goto -> 2004
/*   */     //   1966: aload #8
/*   */     //   1968: ldc_w 'SPECULAR'
/*   */     //   1971: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1974: ifeq -> 1983
/*   */     //   1977: iconst_5
/*   */     //   1978: istore #8
/*   */     //   1980: goto -> 2004
/*   */     //   1983: aload #8
/*   */     //   1985: ldc_w 'TRANSPARENCY'
/*   */     //   1988: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*   */     //   1991: ifeq -> 2001
/*   */     //   1994: bipush #9
/*   */     //   1996: istore #8
/*   */     //   1998: goto -> 2004
/*   */     //   2001: iconst_0
/*   */     //   2002: istore #8
/*   */     //   2004: aload #5
/*   */     //   2006: aload #7
/*   */     //   2008: iload #8
/*   */     //   2010: putfield kH : I
/*   */     //   2013: getfield Oi0 : Lf/fQ;
/*   */     //   2016: ifnonnull -> 2035
/*   */     //   2019: aload #5
/*   */     //   2021: new f/fQ
/*   */     //   2024: dup
/*   */     //   2025: astore #8
/*   */     //   2027: invokespecial <init> : ()V
/*   */     //   2030: aload #8
/*   */     //   2032: putfield Oi0 : Lf/fQ;
/*   */     //   2035: aload #6
/*   */     //   2037: aload #5
/*   */     //   2039: getfield Oi0 : Lf/fQ;
/*   */     //   2042: aload #7
/*   */     //   2044: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2047: getfield H7 : Lf/bM0;
/*   */     //   2050: astore #6
/*   */     //   2052: goto -> 1558
/*   */     //   2055: new f/JU
/*   */     //   2058: dup
/*   */     //   2059: ldc_w 'Texture needs type.'
/*   */     //   2062: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2065: athrow
/*   */     //   2066: new f/JU
/*   */     //   2069: dup
/*   */     //   2070: ldc_w 'Expected Vector2 values <> than two.'
/*   */     //   2073: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2076: athrow
/*   */     //   2077: new f/JU
/*   */     //   2080: dup
/*   */     //   2081: ldc_w 'Expected Vector2 values <> than two.'
/*   */     //   2084: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2087: athrow
/*   */     //   2088: new f/JU
/*   */     //   2091: dup
/*   */     //   2092: ldc_w 'Texture needs filename.'
/*   */     //   2095: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2098: athrow
/*   */     //   2099: new f/JU
/*   */     //   2102: dup
/*   */     //   2103: ldc_w 'Texture has no id.'
/*   */     //   2106: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2109: athrow
/*   */     //   2110: aload #4
/*   */     //   2112: aload_3
/*   */     //   2113: getfield ID : Lf/fQ;
/*   */     //   2116: aload #5
/*   */     //   2118: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2121: getfield H7 : Lf/bM0;
/*   */     //   2124: astore #4
/*   */     //   2126: goto -> 1354
/*   */     //   2129: new f/JU
/*   */     //   2132: dup
/*   */     //   2133: ldc_w 'Material needs an id.'
/*   */     //   2136: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   2139: athrow
/*   */     //   2140: aload_2
/*   */     //   2141: ldc_w 'nodes'
/*   */     //   2144: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2147: dup
/*   */     //   2148: astore_1
/*   */     //   2149: ifnull -> 2192
/*   */     //   2152: aload_1
/*   */     //   2153: aload_3
/*   */     //   2154: getfield nG0 : Lf/fQ;
/*   */     //   2157: aload_1
/*   */     //   2158: getfield LG : I
/*   */     //   2161: invokevirtual ZY : (I)V
/*   */     //   2164: getfield Rr0 : Lf/bM0;
/*   */     //   2167: astore_1
/*   */     //   2168: aload_1
/*   */     //   2169: ifnull -> 2192
/*   */     //   2172: aload_1
/*   */     //   2173: aload_3
/*   */     //   2174: getfield nG0 : Lf/fQ;
/*   */     //   2177: aload_0
/*   */     //   2178: aload_1
/*   */     //   2179: invokevirtual Mq0 : (Lf/bM0;)Lf/Jp;
/*   */     //   2182: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2185: getfield H7 : Lf/bM0;
/*   */     //   2188: astore_1
/*   */     //   2189: goto -> 2168
/*   */     //   2192: aload_2
/*   */     //   2193: ldc_w 'animations'
/*   */     //   2196: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2199: dup
/*   */     //   2200: astore_0
/*   */     //   2201: ifnonnull -> 2207
/*   */     //   2204: goto -> 3259
/*   */     //   2207: aload_0
/*   */     //   2208: aload_3
/*   */     //   2209: getfield If0 : Lf/fQ;
/*   */     //   2212: aload_0
/*   */     //   2213: getfield LG : I
/*   */     //   2216: invokevirtual ZY : (I)V
/*   */     //   2219: getfield Rr0 : Lf/bM0;
/*   */     //   2222: astore_0
/*   */     //   2223: aload_0
/*   */     //   2224: ifnull -> 3259
/*   */     //   2227: aload_0
/*   */     //   2228: ldc_w 'bones'
/*   */     //   2231: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2234: dup
/*   */     //   2235: astore_1
/*   */     //   2236: ifnonnull -> 2242
/*   */     //   2239: goto -> 3251
/*   */     //   2242: aload_1
/*   */     //   2243: new f/mn
/*   */     //   2246: dup
/*   */     //   2247: astore_2
/*   */     //   2248: aload_0
/*   */     //   2249: aload_2
/*   */     //   2250: aload_3
/*   */     //   2251: aload_2
/*   */     //   2252: invokespecial <init> : ()V
/*   */     //   2255: getfield If0 : Lf/fQ;
/*   */     //   2258: aload_2
/*   */     //   2259: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2262: getfield Nn : Lf/fQ;
/*   */     //   2265: aload_1
/*   */     //   2266: getfield LG : I
/*   */     //   2269: invokevirtual ZY : (I)V
/*   */     //   2272: ldc 'id'
/*   */     //   2274: invokevirtual ty : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   2277: putfield qi : Ljava/lang/String;
/*   */     //   2280: getfield Rr0 : Lf/bM0;
/*   */     //   2283: astore_1
/*   */     //   2284: aload_1
/*   */     //   2285: ifnull -> 3251
/*   */     //   2288: aload_1
/*   */     //   2289: new f/tD
/*   */     //   2292: dup
/*   */     //   2293: astore #4
/*   */     //   2295: aload_1
/*   */     //   2296: aload_2
/*   */     //   2297: aload #4
/*   */     //   2299: invokespecial <init> : ()V
/*   */     //   2302: getfield Nn : Lf/fQ;
/*   */     //   2305: aload #4
/*   */     //   2307: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2310: ldc_w 'boneId'
/*   */     //   2313: invokevirtual ty : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   2316: putfield o20 : Ljava/lang/String;
/*   */     //   2319: ldc_w 'keyframes'
/*   */     //   2322: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2325: dup
/*   */     //   2326: astore #5
/*   */     //   2328: ifnull -> 2719
/*   */     //   2331: aload #5
/*   */     //   2333: invokevirtual OA0 : ()Z
/*   */     //   2336: ifeq -> 2719
/*   */     //   2339: aload #5
/*   */     //   2341: getfield Rr0 : Lf/bM0;
/*   */     //   2344: astore #5
/*   */     //   2346: aload #5
/*   */     //   2348: ifnull -> 3243
/*   */     //   2351: aload #5
/*   */     //   2353: dup
/*   */     //   2354: ldc_w 'keytime'
/*   */     //   2357: fconst_0
/*   */     //   2358: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   2361: ldc_w 1000.0
/*   */     //   2364: fdiv
/*   */     //   2365: fstore #6
/*   */     //   2367: ldc_w 'translation'
/*   */     //   2370: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2373: dup
/*   */     //   2374: astore #7
/*   */     //   2376: ifnull -> 2477
/*   */     //   2379: aload #7
/*   */     //   2381: getfield LG : I
/*   */     //   2384: iconst_3
/*   */     //   2385: if_icmpne -> 2477
/*   */     //   2388: aload #4
/*   */     //   2390: getfield iu : Lf/fQ;
/*   */     //   2393: ifnonnull -> 2412
/*   */     //   2396: aload #4
/*   */     //   2398: new f/fQ
/*   */     //   2401: dup
/*   */     //   2402: astore #8
/*   */     //   2404: invokespecial <init> : ()V
/*   */     //   2407: aload #8
/*   */     //   2409: putfield iu : Lf/fQ;
/*   */     //   2412: aload #4
/*   */     //   2414: new f/xj
/*   */     //   2417: dup
/*   */     //   2418: dup
/*   */     //   2419: astore #8
/*   */     //   2421: fload #6
/*   */     //   2423: aload #8
/*   */     //   2425: invokespecial <init> : ()V
/*   */     //   2428: putfield qo : F
/*   */     //   2431: new f/eo
/*   */     //   2434: dup
/*   */     //   2435: aload #7
/*   */     //   2437: dup
/*   */     //   2438: dup
/*   */     //   2439: iconst_0
/*   */     //   2440: invokevirtual s20 : (I)F
/*   */     //   2443: fstore #7
/*   */     //   2445: iconst_1
/*   */     //   2446: invokevirtual s20 : (I)F
/*   */     //   2449: fstore #9
/*   */     //   2451: iconst_2
/*   */     //   2452: invokevirtual s20 : (I)F
/*   */     //   2455: fstore #10
/*   */     //   2457: fload #7
/*   */     //   2459: fload #9
/*   */     //   2461: fload #10
/*   */     //   2463: invokespecial <init> : (FFF)V
/*   */     //   2466: putfield KG0 : Ljava/io/Serializable;
/*   */     //   2469: getfield iu : Lf/fQ;
/*   */     //   2472: aload #8
/*   */     //   2474: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2477: aload #5
/*   */     //   2479: ldc_w 'rotation'
/*   */     //   2482: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2485: dup
/*   */     //   2486: astore #7
/*   */     //   2488: ifnull -> 2597
/*   */     //   2491: aload #7
/*   */     //   2493: getfield LG : I
/*   */     //   2496: iconst_4
/*   */     //   2497: if_icmpne -> 2597
/*   */     //   2500: aload #4
/*   */     //   2502: getfield CH0 : Lf/fQ;
/*   */     //   2505: ifnonnull -> 2524
/*   */     //   2508: aload #4
/*   */     //   2510: new f/fQ
/*   */     //   2513: dup
/*   */     //   2514: astore #8
/*   */     //   2516: invokespecial <init> : ()V
/*   */     //   2519: aload #8
/*   */     //   2521: putfield CH0 : Lf/fQ;
/*   */     //   2524: aload #4
/*   */     //   2526: new f/xj
/*   */     //   2529: dup
/*   */     //   2530: dup
/*   */     //   2531: astore #8
/*   */     //   2533: fload #6
/*   */     //   2535: aload #8
/*   */     //   2537: invokespecial <init> : ()V
/*   */     //   2540: putfield qo : F
/*   */     //   2543: new f/TG0
/*   */     //   2546: dup
/*   */     //   2547: aload #7
/*   */     //   2549: dup
/*   */     //   2550: dup2
/*   */     //   2551: iconst_0
/*   */     //   2552: invokevirtual s20 : (I)F
/*   */     //   2555: fstore #7
/*   */     //   2557: iconst_1
/*   */     //   2558: invokevirtual s20 : (I)F
/*   */     //   2561: fstore #9
/*   */     //   2563: iconst_2
/*   */     //   2564: invokevirtual s20 : (I)F
/*   */     //   2567: fstore #10
/*   */     //   2569: iconst_3
/*   */     //   2570: invokevirtual s20 : (I)F
/*   */     //   2573: fstore #11
/*   */     //   2575: fload #7
/*   */     //   2577: fload #9
/*   */     //   2579: fload #10
/*   */     //   2581: fload #11
/*   */     //   2583: invokespecial <init> : (FFFF)V
/*   */     //   2586: putfield KG0 : Ljava/io/Serializable;
/*   */     //   2589: getfield CH0 : Lf/fQ;
/*   */     //   2592: aload #8
/*   */     //   2594: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2597: aload #5
/*   */     //   2599: ldc_w 'scale'
/*   */     //   2602: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2605: dup
/*   */     //   2606: astore #7
/*   */     //   2608: ifnull -> 2709
/*   */     //   2611: aload #7
/*   */     //   2613: getfield LG : I
/*   */     //   2616: iconst_3
/*   */     //   2617: if_icmpne -> 2709
/*   */     //   2620: aload #4
/*   */     //   2622: getfield Ha : Lf/fQ;
/*   */     //   2625: ifnonnull -> 2644
/*   */     //   2628: aload #4
/*   */     //   2630: new f/fQ
/*   */     //   2633: dup
/*   */     //   2634: astore #8
/*   */     //   2636: invokespecial <init> : ()V
/*   */     //   2639: aload #8
/*   */     //   2641: putfield Ha : Lf/fQ;
/*   */     //   2644: aload #4
/*   */     //   2646: new f/xj
/*   */     //   2649: dup
/*   */     //   2650: dup
/*   */     //   2651: astore #8
/*   */     //   2653: fload #6
/*   */     //   2655: aload #8
/*   */     //   2657: invokespecial <init> : ()V
/*   */     //   2660: putfield qo : F
/*   */     //   2663: new f/eo
/*   */     //   2666: dup
/*   */     //   2667: aload #7
/*   */     //   2669: dup
/*   */     //   2670: dup
/*   */     //   2671: iconst_0
/*   */     //   2672: invokevirtual s20 : (I)F
/*   */     //   2675: fstore #6
/*   */     //   2677: iconst_1
/*   */     //   2678: invokevirtual s20 : (I)F
/*   */     //   2681: fstore #7
/*   */     //   2683: iconst_2
/*   */     //   2684: invokevirtual s20 : (I)F
/*   */     //   2687: fstore #9
/*   */     //   2689: fload #6
/*   */     //   2691: fload #7
/*   */     //   2693: fload #9
/*   */     //   2695: invokespecial <init> : (FFF)V
/*   */     //   2698: putfield KG0 : Ljava/io/Serializable;
/*   */     //   2701: getfield Ha : Lf/fQ;
/*   */     //   2704: aload #8
/*   */     //   2706: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2709: aload #5
/*   */     //   2711: getfield H7 : Lf/bM0;
/*   */     //   2714: astore #5
/*   */     //   2716: goto -> 2346
/*   */     //   2719: aload_1
/*   */     //   2720: ldc_w 'translation'
/*   */     //   2723: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2726: dup
/*   */     //   2727: astore #5
/*   */     //   2729: ifnull -> 2891
/*   */     //   2732: aload #5
/*   */     //   2734: invokevirtual OA0 : ()Z
/*   */     //   2737: ifeq -> 2891
/*   */     //   2740: aload #5
/*   */     //   2742: new f/fQ
/*   */     //   2745: dup
/*   */     //   2746: astore #6
/*   */     //   2748: aload #5
/*   */     //   2750: aload #4
/*   */     //   2752: aload #6
/*   */     //   2754: dup
/*   */     //   2755: invokespecial <init> : ()V
/*   */     //   2758: putfield iu : Lf/fQ;
/*   */     //   2761: getfield LG : I
/*   */     //   2764: invokevirtual ZY : (I)V
/*   */     //   2767: getfield Rr0 : Lf/bM0;
/*   */     //   2770: astore #5
/*   */     //   2772: aload #5
/*   */     //   2774: ifnull -> 2891
/*   */     //   2777: aload #5
/*   */     //   2779: new f/xj
/*   */     //   2782: dup
/*   */     //   2783: astore #6
/*   */     //   2785: aload #5
/*   */     //   2787: aload #4
/*   */     //   2789: aload #6
/*   */     //   2791: invokespecial <init> : ()V
/*   */     //   2794: getfield iu : Lf/fQ;
/*   */     //   2797: aload #6
/*   */     //   2799: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2802: ldc_w 'keytime'
/*   */     //   2805: fconst_0
/*   */     //   2806: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   2809: ldc_w 1000.0
/*   */     //   2812: fdiv
/*   */     //   2813: putfield qo : F
/*   */     //   2816: ldc_w 'value'
/*   */     //   2819: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2822: dup
/*   */     //   2823: astore #7
/*   */     //   2825: ifnull -> 2881
/*   */     //   2828: aload #7
/*   */     //   2830: getfield LG : I
/*   */     //   2833: iconst_3
/*   */     //   2834: if_icmplt -> 2881
/*   */     //   2837: aload #6
/*   */     //   2839: new f/eo
/*   */     //   2842: dup
/*   */     //   2843: astore #6
/*   */     //   2845: aload #7
/*   */     //   2847: dup
/*   */     //   2848: dup
/*   */     //   2849: iconst_0
/*   */     //   2850: invokevirtual s20 : (I)F
/*   */     //   2853: fstore #7
/*   */     //   2855: iconst_1
/*   */     //   2856: invokevirtual s20 : (I)F
/*   */     //   2859: fstore #8
/*   */     //   2861: iconst_2
/*   */     //   2862: invokevirtual s20 : (I)F
/*   */     //   2865: fstore #9
/*   */     //   2867: fload #7
/*   */     //   2869: fload #8
/*   */     //   2871: fload #9
/*   */     //   2873: invokespecial <init> : (FFF)V
/*   */     //   2876: aload #6
/*   */     //   2878: putfield KG0 : Ljava/io/Serializable;
/*   */     //   2881: aload #5
/*   */     //   2883: getfield H7 : Lf/bM0;
/*   */     //   2886: astore #5
/*   */     //   2888: goto -> 2772
/*   */     //   2891: aload_1
/*   */     //   2892: ldc_w 'rotation'
/*   */     //   2895: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2898: dup
/*   */     //   2899: astore #5
/*   */     //   2901: ifnull -> 3071
/*   */     //   2904: aload #5
/*   */     //   2906: invokevirtual OA0 : ()Z
/*   */     //   2909: ifeq -> 3071
/*   */     //   2912: aload #5
/*   */     //   2914: new f/fQ
/*   */     //   2917: dup
/*   */     //   2918: astore #6
/*   */     //   2920: aload #5
/*   */     //   2922: aload #4
/*   */     //   2924: aload #6
/*   */     //   2926: dup
/*   */     //   2927: invokespecial <init> : ()V
/*   */     //   2930: putfield CH0 : Lf/fQ;
/*   */     //   2933: getfield LG : I
/*   */     //   2936: invokevirtual ZY : (I)V
/*   */     //   2939: getfield Rr0 : Lf/bM0;
/*   */     //   2942: astore #5
/*   */     //   2944: aload #5
/*   */     //   2946: ifnull -> 3071
/*   */     //   2949: aload #5
/*   */     //   2951: new f/xj
/*   */     //   2954: dup
/*   */     //   2955: astore #6
/*   */     //   2957: aload #5
/*   */     //   2959: aload #4
/*   */     //   2961: aload #6
/*   */     //   2963: invokespecial <init> : ()V
/*   */     //   2966: getfield CH0 : Lf/fQ;
/*   */     //   2969: aload #6
/*   */     //   2971: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   2974: ldc_w 'keytime'
/*   */     //   2977: fconst_0
/*   */     //   2978: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   2981: ldc_w 1000.0
/*   */     //   2984: fdiv
/*   */     //   2985: putfield qo : F
/*   */     //   2988: ldc_w 'value'
/*   */     //   2991: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   2994: dup
/*   */     //   2995: astore #7
/*   */     //   2997: ifnull -> 3061
/*   */     //   3000: aload #7
/*   */     //   3002: getfield LG : I
/*   */     //   3005: iconst_4
/*   */     //   3006: if_icmplt -> 3061
/*   */     //   3009: aload #6
/*   */     //   3011: new f/TG0
/*   */     //   3014: dup
/*   */     //   3015: astore #6
/*   */     //   3017: aload #7
/*   */     //   3019: dup
/*   */     //   3020: dup2
/*   */     //   3021: iconst_0
/*   */     //   3022: invokevirtual s20 : (I)F
/*   */     //   3025: fstore #7
/*   */     //   3027: iconst_1
/*   */     //   3028: invokevirtual s20 : (I)F
/*   */     //   3031: fstore #8
/*   */     //   3033: iconst_2
/*   */     //   3034: invokevirtual s20 : (I)F
/*   */     //   3037: fstore #9
/*   */     //   3039: iconst_3
/*   */     //   3040: invokevirtual s20 : (I)F
/*   */     //   3043: fstore #10
/*   */     //   3045: fload #7
/*   */     //   3047: fload #8
/*   */     //   3049: fload #9
/*   */     //   3051: fload #10
/*   */     //   3053: invokespecial <init> : (FFFF)V
/*   */     //   3056: aload #6
/*   */     //   3058: putfield KG0 : Ljava/io/Serializable;
/*   */     //   3061: aload #5
/*   */     //   3063: getfield H7 : Lf/bM0;
/*   */     //   3066: astore #5
/*   */     //   3068: goto -> 2944
/*   */     //   3071: aload_1
/*   */     //   3072: ldc_w 'scaling'
/*   */     //   3075: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   3078: dup
/*   */     //   3079: astore #5
/*   */     //   3081: ifnull -> 3243
/*   */     //   3084: aload #5
/*   */     //   3086: invokevirtual OA0 : ()Z
/*   */     //   3089: ifeq -> 3243
/*   */     //   3092: aload #5
/*   */     //   3094: new f/fQ
/*   */     //   3097: dup
/*   */     //   3098: astore #6
/*   */     //   3100: aload #5
/*   */     //   3102: aload #4
/*   */     //   3104: aload #6
/*   */     //   3106: dup
/*   */     //   3107: invokespecial <init> : ()V
/*   */     //   3110: putfield Ha : Lf/fQ;
/*   */     //   3113: getfield LG : I
/*   */     //   3116: invokevirtual ZY : (I)V
/*   */     //   3119: getfield Rr0 : Lf/bM0;
/*   */     //   3122: astore #5
/*   */     //   3124: aload #5
/*   */     //   3126: ifnull -> 3243
/*   */     //   3129: aload #5
/*   */     //   3131: new f/xj
/*   */     //   3134: dup
/*   */     //   3135: astore #6
/*   */     //   3137: aload #5
/*   */     //   3139: aload #4
/*   */     //   3141: aload #6
/*   */     //   3143: invokespecial <init> : ()V
/*   */     //   3146: getfield Ha : Lf/fQ;
/*   */     //   3149: aload #6
/*   */     //   3151: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   3154: ldc_w 'keytime'
/*   */     //   3157: fconst_0
/*   */     //   3158: invokevirtual Lv0 : (Ljava/lang/String;F)F
/*   */     //   3161: ldc_w 1000.0
/*   */     //   3164: fdiv
/*   */     //   3165: putfield qo : F
/*   */     //   3168: ldc_w 'value'
/*   */     //   3171: invokevirtual Jb : (Ljava/lang/String;)Lf/bM0;
/*   */     //   3174: dup
/*   */     //   3175: astore #7
/*   */     //   3177: ifnull -> 3233
/*   */     //   3180: aload #7
/*   */     //   3182: getfield LG : I
/*   */     //   3185: iconst_3
/*   */     //   3186: if_icmplt -> 3233
/*   */     //   3189: aload #6
/*   */     //   3191: new f/eo
/*   */     //   3194: dup
/*   */     //   3195: astore #6
/*   */     //   3197: aload #7
/*   */     //   3199: dup
/*   */     //   3200: dup
/*   */     //   3201: iconst_0
/*   */     //   3202: invokevirtual s20 : (I)F
/*   */     //   3205: fstore #7
/*   */     //   3207: iconst_1
/*   */     //   3208: invokevirtual s20 : (I)F
/*   */     //   3211: fstore #8
/*   */     //   3213: iconst_2
/*   */     //   3214: invokevirtual s20 : (I)F
/*   */     //   3217: fstore #9
/*   */     //   3219: fload #7
/*   */     //   3221: fload #8
/*   */     //   3223: fload #9
/*   */     //   3225: invokespecial <init> : (FFF)V
/*   */     //   3228: aload #6
/*   */     //   3230: putfield KG0 : Ljava/io/Serializable;
/*   */     //   3233: aload #5
/*   */     //   3235: getfield H7 : Lf/bM0;
/*   */     //   3238: astore #5
/*   */     //   3240: goto -> 3124
/*   */     //   3243: aload_1
/*   */     //   3244: getfield H7 : Lf/bM0;
/*   */     //   3247: astore_1
/*   */     //   3248: goto -> 2284
/*   */     //   3251: aload_0
/*   */     //   3252: getfield H7 : Lf/bM0;
/*   */     //   3255: astore_0
/*   */     //   3256: goto -> 2223
/*   */     //   3259: aload_3
/*   */     //   3260: areturn
/*   */     //   3261: new f/JU
/*   */     //   3264: dup
/*   */     //   3265: ldc_w 'Model version not supported'
/*   */     //   3268: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   3271: athrow
/*   */     //   3272: new java/lang/IllegalArgumentException
/*   */     //   3275: dup
/*   */     //   3276: ldc_w 'Indexed value not found: '
/*   */     //   3279: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   3282: aload #4
/*   */     //   3284: getfield as0 : Ljava/lang/String;
/*   */     //   3287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   3290: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   3293: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   3296: athrow
/*   */     //   3297: new java/lang/IllegalArgumentException
/*   */     //   3300: dup
/*   */     //   3301: ldc_w 'Indexed value not found: '
/*   */     //   3304: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   3307: aload #4
/*   */     //   3309: getfield as0 : Ljava/lang/String;
/*   */     //   3312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   3315: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   3318: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   3321: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 34
/*   */     //   #3	-> 50
/*   */     //   #4	-> 55
/*   */     //   #5	-> 64
/*   */     //   #6	-> 102
/*   */     //   #7	-> 107
/*   */     //   #8	-> 137
/*   */     //   #9	-> 197
/*   */     //   #10	-> 238
/*   */     //   #11	-> 256
/*   */     //   #12	-> 264
/*   */     //   #13	-> 283
/*   */     //   #14	-> 291
/*   */     //   #15	-> 312
/*   */     //   #16	-> 328
/*   */     //   #17	-> 350
/*   */     //   #18	-> 358
/*   */     //   #19	-> 378
/*   */     //   #20	-> 386
/*   */     //   #21	-> 405
/*   */     //   #22	-> 429
/*   */     //   #23	-> 435
/*   */     //   #24	-> 451
/*   */     //   #25	-> 456
/*   */     //   #26	-> 484
/*   */     //   #27	-> 490
/*   */     //   #28	-> 506
/*   */     //   #29	-> 511
/*   */     //   #30	-> 532
/*   */     //   #31	-> 541
/*   */     //   #32	-> 559
/*   */     //   #33	-> 570
/*   */     //   #34	-> 648
/*   */     //   #35	-> 655
/*   */     //   #36	-> 748
/*   */     //   #37	-> 840
/*   */     //   #38	-> 851
/*   */     //   #39	-> 879
/*   */     //   #40	-> 965
/*   */     //   #41	-> 977
/*   */     //   #42	-> 1056
/*   */     //   #43	-> 1064
/*   */     //   #44	-> 1161
/*   */     //   #45	-> 1177
/*   */     //   #46	-> 1181
/*   */     //   #47	-> 1189
/*   */     //   #48	-> 1202
/*   */     //   #49	-> 1206
/*   */     //   #50	-> 1217
/*   */     //   #51	-> 1221
/*   */     //   #52	-> 1225
/*   */     //   #53	-> 1236
/*   */     //   #54	-> 1286
/*   */     //   #55	-> 1290
/*   */     //   #56	-> 1298
/*   */     //   #57	-> 1313
/*   */     //   #58	-> 1320
/*   */     //   #59	-> 1600
/*   */     //   #60	-> 1605
/*   */     //   #61	-> 1646
/*   */     //   #62	-> 1649
/*   */     //   #63	-> 1670
/*   */     //   #64	-> 1730
/*   */     //   #65	-> 1751
/*   */     //   #66	-> 1811
/*   */     //   #67	-> 1829
/*   */     //   #68	-> 2010
/*   */     //   #69	-> 2066
/*   */     //   #70	-> 2088
/*   */     //   #71	-> 2141
/*   */     //   #72	-> 2193
/*   */     //   #73	-> 3261
/*   */     //   #74	-> 3272
/*   */     //   #75	-> 3276
/*   */     //   #76	-> 3284
/*   */     //   #77	-> 3301
/*   */     //   #78	-> 3309
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RA0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */