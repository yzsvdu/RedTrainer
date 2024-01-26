/*    */ package f;public final class bx0 { private boolean zs0(Tl paramTl) { RD0[] arrayOfRD0; String str; int i;
/*    */     byte b;
/*  3 */     for (str = "", i = (arrayOfRD0 = (RD0[])paramTl.Zx0.values().toArray((Object[])new RD0[0])).length, b = 0; b < i; ) { RD0 rD0 = arrayOfRD0[b]; if (str.isEmpty()) { str = rD0.il0(); } else if (!rD0.il0().equalsIgnoreCase(str)) { aK
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 10 */           .error(B40.df("Error applying battlesprite mod ").append(this.a80.ml.getName()).append(" multiple file formats requested for ").append(paramTl.r90).toString()); fX
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 17 */           .error(B40.df("Error applying battlesprite mod ").append(this.a80.ml.getName()).append(" multiple file formats requested for ").append(paramTl.r90).toString()); return true; }  b++; }  if (str.equals("gif"))
/*    */     { gh gh;
/* 19 */       short s = paramTl.r90;
/* 20 */       boolean bool1 = paramTl.qn0;
/* 21 */       boolean bool2 = paramTl.Gq0;
/* 22 */       byte b1 = paramTl.xn0;
/*    */ 
/*    */       
/* 25 */       this(arrayOfRD0[0], (int[])this.KO.Z90(paramTl.r90)); um0.Kt0.AR(s, bool1, bool2, b1, gh); } else { dv0 dv0; boolean bool; if (arrayOfRD0.length == 1)
/*    */       
/* 27 */       { short s = paramTl.r90;
/* 28 */         bool = paramTl.qn0;
/* 29 */         boolean bool1 = paramTl.Gq0;
/* 30 */         i = paramTl.xn0;
/* 31 */         this(arrayOfRD0[0]); um0.Kt0.AR(s, bool, bool1, i, this); }
/*    */       else
/* 33 */       { gm0 gm0; short s = bool.r90;
/* 34 */         boolean bool1 = bool.qn0;
/* 35 */         boolean bool2 = bool.Gq0;
/* 36 */         byte b1 = bool.xn0;
/*    */ 
/*    */         
/* 39 */         this((dv0[])Stream.<RD0>of(arrayOfRD0).map(dv0::new).toArray(bx0::UD0), (int[])((bx0)super).KO.Z90(bool.r90)); um0.Kt0.AR(s, bool1, bool2, b1, gm0); }  }  return true; }
/*    */ 
/*    */   
/*    */   public static final ik aK = C00.gd(bx0.class);
/*    */   public static final ik fX = C00.R4("mod");
/*    */   public RD0 a80;
/*    */   public boolean jA;
/*    */   public boolean XH0;
/*    */   public ZipFile G20;
/*    */   public RD0 qe;
/*    */   public Xt0 Mc0;
/*    */   public boolean YE;
/*    */   public String aj;
/*    */   public String Xq0;
/*    */   public String Vu0;
/*    */   public String d10;
/*    */   public String Nq0;
/*    */   public U70 Gz0;
/*    */   public Ut0 V4;
/*    */   public qw0 KO;
/*    */   
/*    */   public bx0(RD0 paramRD0, boolean paramBoolean) {
/*    */     Ut0 ut0;
/*    */     qw0 qw01;
/*    */     this.jA = false;
/*    */     this.XH0 = false;
/*    */     this.G20 = null;
/*    */     this.Mc0 = null;
/*    */     this.aj = "";
/*    */     this.Xq0 = "";
/*    */     this.Vu0 = "";
/*    */     this.d10 = "";
/*    */     this.Nq0 = "";
/*    */     this.Gz0 = null;
/*    */     this();
/*    */     this.V4 = this;
/*    */     this();
/*    */     this.KO = this;
/*    */     this.a80 = paramRD0;
/*    */     this.YE = paramBoolean;
/*    */   }
/*    */   
/*    */   public static void oa(RD0 paramRD0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_0
/*    */     //   3: aconst_null
/*    */     //   4: invokevirtual QM : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   7: ldc_w '\\n'
/*    */     //   10: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   13: dup
/*    */     //   14: astore_1
/*    */     //   15: arraylength
/*    */     //   16: istore_2
/*    */     //   17: iconst_0
/*    */     //   18: istore_3
/*    */     //   19: iload_3
/*    */     //   20: iload_2
/*    */     //   21: if_icmpge -> 937
/*    */     //   24: aload_1
/*    */     //   25: iload_3
/*    */     //   26: aaload
/*    */     //   27: dup
/*    */     //   28: astore #4
/*    */     //   30: ldc_w ';'
/*    */     //   33: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   36: ifeq -> 42
/*    */     //   39: goto -> 931
/*    */     //   42: aload #4
/*    */     //   44: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   47: dup
/*    */     //   48: astore #4
/*    */     //   50: invokevirtual isEmpty : ()Z
/*    */     //   53: ifne -> 931
/*    */     //   56: aload #4
/*    */     //   58: ldc_w '='
/*    */     //   61: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   64: ifne -> 70
/*    */     //   67: goto -> 931
/*    */     //   70: aload #4
/*    */     //   72: ldc_w '='
/*    */     //   75: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   78: dup
/*    */     //   79: astore #4
/*    */     //   81: arraylength
/*    */     //   82: iconst_2
/*    */     //   83: if_icmpge -> 89
/*    */     //   86: goto -> 920
/*    */     //   89: aload #4
/*    */     //   91: iconst_0
/*    */     //   92: aaload
/*    */     //   93: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   96: dup
/*    */     //   97: astore #5
/*    */     //   99: ldc_w 'columns'
/*    */     //   102: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   105: ifeq -> 160
/*    */     //   108: aload #4
/*    */     //   110: iconst_1
/*    */     //   111: aaload
/*    */     //   112: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   115: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   118: istore #4
/*    */     //   120: getstatic f/switch.TK : Lf/switch;
/*    */     //   123: bipush #8
/*    */     //   125: iload #4
/*    */     //   127: invokestatic min : (II)I
/*    */     //   130: i2b
/*    */     //   131: putfield LPt4 : B
/*    */     //   134: goto -> 913
/*    */     //   137: pop
/*    */     //   138: getstatic f/bx0.fX : Lf/ik;
/*    */     //   141: astore #4
/*    */     //   143: new java/lang/StringBuilder
/*    */     //   146: dup
/*    */     //   147: astore #5
/*    */     //   149: invokespecial <init> : ()V
/*    */     //   152: ldc_w 'Invalid follow sprites table value at line '
/*    */     //   155: astore #6
/*    */     //   157: goto -> 735
/*    */     //   160: aload #5
/*    */     //   162: ldc_w 'rows'
/*    */     //   165: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   168: ifeq -> 223
/*    */     //   171: aload #4
/*    */     //   173: iconst_1
/*    */     //   174: aaload
/*    */     //   175: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   178: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   181: istore #4
/*    */     //   183: getstatic f/switch.TK : Lf/switch;
/*    */     //   186: bipush #8
/*    */     //   188: iload #4
/*    */     //   190: invokestatic min : (II)I
/*    */     //   193: i2b
/*    */     //   194: putfield Dy0 : B
/*    */     //   197: goto -> 913
/*    */     //   200: pop
/*    */     //   201: getstatic f/bx0.fX : Lf/ik;
/*    */     //   204: astore #4
/*    */     //   206: new java/lang/StringBuilder
/*    */     //   209: dup
/*    */     //   210: astore #5
/*    */     //   212: invokespecial <init> : ()V
/*    */     //   215: ldc_w 'Invalid follow sprites table value at line '
/*    */     //   218: astore #6
/*    */     //   220: goto -> 735
/*    */     //   223: aload #5
/*    */     //   225: ldc_w 'north'
/*    */     //   228: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   231: ifeq -> 355
/*    */     //   234: aload #4
/*    */     //   236: iconst_1
/*    */     //   237: aaload
/*    */     //   238: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   241: ldc_w ','
/*    */     //   244: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   247: dup
/*    */     //   248: astore #4
/*    */     //   250: arraylength
/*    */     //   251: iconst_2
/*    */     //   252: if_icmpge -> 277
/*    */     //   255: getstatic f/bx0.fX : Lf/ik;
/*    */     //   258: astore #4
/*    */     //   260: new java/lang/StringBuilder
/*    */     //   263: dup
/*    */     //   264: astore #5
/*    */     //   266: invokespecial <init> : ()V
/*    */     //   269: ldc_w 'Invalid follow sprite north value at line '
/*    */     //   272: astore #6
/*    */     //   274: goto -> 735
/*    */     //   277: aload #4
/*    */     //   279: arraylength
/*    */     //   280: dup
/*    */     //   281: istore #5
/*    */     //   283: newarray byte
/*    */     //   285: astore #6
/*    */     //   287: iconst_0
/*    */     //   288: istore #7
/*    */     //   290: iload #7
/*    */     //   292: iload #5
/*    */     //   294: if_icmpge -> 342
/*    */     //   297: aload #6
/*    */     //   299: iload #7
/*    */     //   301: aload #4
/*    */     //   303: iload #7
/*    */     //   305: aaload
/*    */     //   306: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   309: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   312: bastore
/*    */     //   313: iinc #7, 1
/*    */     //   316: goto -> 290
/*    */     //   319: pop
/*    */     //   320: getstatic f/bx0.fX : Lf/ik;
/*    */     //   323: astore #4
/*    */     //   325: new java/lang/StringBuilder
/*    */     //   328: dup
/*    */     //   329: astore #5
/*    */     //   331: invokespecial <init> : ()V
/*    */     //   334: ldc_w 'Invalid follow sprite north value at line '
/*    */     //   337: astore #6
/*    */     //   339: goto -> 735
/*    */     //   342: getstatic f/switch.TK : Lf/switch;
/*    */     //   345: getfield AG0 : [[B
/*    */     //   348: iconst_0
/*    */     //   349: aload #6
/*    */     //   351: aastore
/*    */     //   352: goto -> 913
/*    */     //   355: aload #5
/*    */     //   357: ldc_w 'south'
/*    */     //   360: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   363: ifeq -> 487
/*    */     //   366: aload #4
/*    */     //   368: iconst_1
/*    */     //   369: aaload
/*    */     //   370: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   373: ldc_w ','
/*    */     //   376: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   379: dup
/*    */     //   380: astore #4
/*    */     //   382: arraylength
/*    */     //   383: iconst_2
/*    */     //   384: if_icmpge -> 409
/*    */     //   387: getstatic f/bx0.fX : Lf/ik;
/*    */     //   390: astore #4
/*    */     //   392: new java/lang/StringBuilder
/*    */     //   395: dup
/*    */     //   396: astore #5
/*    */     //   398: invokespecial <init> : ()V
/*    */     //   401: ldc_w 'Invalid follow sprite south value at line '
/*    */     //   404: astore #6
/*    */     //   406: goto -> 735
/*    */     //   409: aload #4
/*    */     //   411: arraylength
/*    */     //   412: dup
/*    */     //   413: istore #5
/*    */     //   415: newarray byte
/*    */     //   417: astore #6
/*    */     //   419: iconst_0
/*    */     //   420: istore #7
/*    */     //   422: iload #7
/*    */     //   424: iload #5
/*    */     //   426: if_icmpge -> 474
/*    */     //   429: aload #6
/*    */     //   431: iload #7
/*    */     //   433: aload #4
/*    */     //   435: iload #7
/*    */     //   437: aaload
/*    */     //   438: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   441: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   444: bastore
/*    */     //   445: iinc #7, 1
/*    */     //   448: goto -> 422
/*    */     //   451: pop
/*    */     //   452: getstatic f/bx0.fX : Lf/ik;
/*    */     //   455: astore #4
/*    */     //   457: new java/lang/StringBuilder
/*    */     //   460: dup
/*    */     //   461: astore #5
/*    */     //   463: invokespecial <init> : ()V
/*    */     //   466: ldc_w 'Invalid follow sprite south value at line '
/*    */     //   469: astore #6
/*    */     //   471: goto -> 735
/*    */     //   474: getstatic f/switch.TK : Lf/switch;
/*    */     //   477: getfield AG0 : [[B
/*    */     //   480: iconst_1
/*    */     //   481: aload #6
/*    */     //   483: aastore
/*    */     //   484: goto -> 913
/*    */     //   487: aload #5
/*    */     //   489: ldc_w 'west'
/*    */     //   492: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   495: ifeq -> 619
/*    */     //   498: aload #4
/*    */     //   500: iconst_1
/*    */     //   501: aaload
/*    */     //   502: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   505: ldc_w ','
/*    */     //   508: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   511: dup
/*    */     //   512: astore #4
/*    */     //   514: arraylength
/*    */     //   515: iconst_2
/*    */     //   516: if_icmpge -> 541
/*    */     //   519: getstatic f/bx0.fX : Lf/ik;
/*    */     //   522: astore #4
/*    */     //   524: new java/lang/StringBuilder
/*    */     //   527: dup
/*    */     //   528: astore #5
/*    */     //   530: invokespecial <init> : ()V
/*    */     //   533: ldc_w 'Invalid follow sprite west value at line '
/*    */     //   536: astore #6
/*    */     //   538: goto -> 735
/*    */     //   541: aload #4
/*    */     //   543: arraylength
/*    */     //   544: dup
/*    */     //   545: istore #5
/*    */     //   547: newarray byte
/*    */     //   549: astore #6
/*    */     //   551: iconst_0
/*    */     //   552: istore #7
/*    */     //   554: iload #7
/*    */     //   556: iload #5
/*    */     //   558: if_icmpge -> 606
/*    */     //   561: aload #6
/*    */     //   563: iload #7
/*    */     //   565: aload #4
/*    */     //   567: iload #7
/*    */     //   569: aaload
/*    */     //   570: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   573: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   576: bastore
/*    */     //   577: iinc #7, 1
/*    */     //   580: goto -> 554
/*    */     //   583: pop
/*    */     //   584: getstatic f/bx0.fX : Lf/ik;
/*    */     //   587: astore #4
/*    */     //   589: new java/lang/StringBuilder
/*    */     //   592: dup
/*    */     //   593: astore #5
/*    */     //   595: invokespecial <init> : ()V
/*    */     //   598: ldc_w 'Invalid follow sprite west value at line '
/*    */     //   601: astore #6
/*    */     //   603: goto -> 735
/*    */     //   606: getstatic f/switch.TK : Lf/switch;
/*    */     //   609: getfield AG0 : [[B
/*    */     //   612: iconst_2
/*    */     //   613: aload #6
/*    */     //   615: aastore
/*    */     //   616: goto -> 913
/*    */     //   619: aload #5
/*    */     //   621: ldc_w 'east'
/*    */     //   624: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   627: ifeq -> 772
/*    */     //   630: aload #4
/*    */     //   632: iconst_1
/*    */     //   633: aaload
/*    */     //   634: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   637: ldc_w ','
/*    */     //   640: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   643: dup
/*    */     //   644: astore #4
/*    */     //   646: arraylength
/*    */     //   647: iconst_2
/*    */     //   648: if_icmpge -> 673
/*    */     //   651: getstatic f/bx0.fX : Lf/ik;
/*    */     //   654: astore #4
/*    */     //   656: new java/lang/StringBuilder
/*    */     //   659: dup
/*    */     //   660: astore #5
/*    */     //   662: invokespecial <init> : ()V
/*    */     //   665: ldc_w 'Invalid follow sprite east value at line '
/*    */     //   668: astore #6
/*    */     //   670: goto -> 735
/*    */     //   673: aload #4
/*    */     //   675: arraylength
/*    */     //   676: dup
/*    */     //   677: istore #5
/*    */     //   679: newarray byte
/*    */     //   681: astore #6
/*    */     //   683: iconst_0
/*    */     //   684: istore #7
/*    */     //   686: iload #7
/*    */     //   688: iload #5
/*    */     //   690: if_icmpge -> 759
/*    */     //   693: aload #6
/*    */     //   695: iload #7
/*    */     //   697: aload #4
/*    */     //   699: iload #7
/*    */     //   701: aaload
/*    */     //   702: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   705: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   708: bastore
/*    */     //   709: iinc #7, 1
/*    */     //   712: goto -> 686
/*    */     //   715: pop
/*    */     //   716: getstatic f/bx0.fX : Lf/ik;
/*    */     //   719: astore #4
/*    */     //   721: new java/lang/StringBuilder
/*    */     //   724: dup
/*    */     //   725: astore #5
/*    */     //   727: invokespecial <init> : ()V
/*    */     //   730: ldc_w 'Invalid follow sprite east value at line '
/*    */     //   733: astore #6
/*    */     //   735: aload #4
/*    */     //   737: aload #5
/*    */     //   739: aload #6
/*    */     //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   744: iload_0
/*    */     //   745: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   748: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   751: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   756: goto -> 931
/*    */     //   759: getstatic f/switch.TK : Lf/switch;
/*    */     //   762: getfield AG0 : [[B
/*    */     //   765: iconst_3
/*    */     //   766: aload #6
/*    */     //   768: aastore
/*    */     //   769: goto -> 913
/*    */     //   772: aload #4
/*    */     //   774: iconst_1
/*    */     //   775: aaload
/*    */     //   776: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   779: ldc_w ','
/*    */     //   782: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   785: dup
/*    */     //   786: astore #5
/*    */     //   788: iconst_4
/*    */     //   789: newarray float
/*    */     //   791: dup
/*    */     //   792: astore #6
/*    */     //   794: aload #5
/*    */     //   796: aload #4
/*    */     //   798: iconst_0
/*    */     //   799: aaload
/*    */     //   800: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   803: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   806: istore #4
/*    */     //   808: iconst_0
/*    */     //   809: istore #7
/*    */     //   811: iconst_0
/*    */     //   812: aaload
/*    */     //   813: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   816: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   819: iload #7
/*    */     //   821: swap
/*    */     //   822: fastore
/*    */     //   823: arraylength
/*    */     //   824: iconst_1
/*    */     //   825: if_icmple -> 847
/*    */     //   828: aload #6
/*    */     //   830: aload #5
/*    */     //   832: iconst_1
/*    */     //   833: istore #7
/*    */     //   835: iconst_1
/*    */     //   836: aaload
/*    */     //   837: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   840: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   843: iload #7
/*    */     //   845: swap
/*    */     //   846: fastore
/*    */     //   847: aload #5
/*    */     //   849: arraylength
/*    */     //   850: iconst_2
/*    */     //   851: if_icmple -> 873
/*    */     //   854: aload #6
/*    */     //   856: aload #5
/*    */     //   858: iconst_2
/*    */     //   859: istore #7
/*    */     //   861: iconst_2
/*    */     //   862: aaload
/*    */     //   863: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   866: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   869: iload #7
/*    */     //   871: swap
/*    */     //   872: fastore
/*    */     //   873: aload #5
/*    */     //   875: arraylength
/*    */     //   876: iconst_3
/*    */     //   877: if_icmple -> 899
/*    */     //   880: aload #6
/*    */     //   882: aload #5
/*    */     //   884: iconst_3
/*    */     //   885: istore #5
/*    */     //   887: iconst_3
/*    */     //   888: aaload
/*    */     //   889: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   892: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   895: iload #5
/*    */     //   897: swap
/*    */     //   898: fastore
/*    */     //   899: getstatic f/switch.TK : Lf/switch;
/*    */     //   902: getfield FK : Lf/qw0;
/*    */     //   905: iload #4
/*    */     //   907: aload #6
/*    */     //   909: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   912: pop
/*    */     //   913: iinc #0, 1
/*    */     //   916: goto -> 931
/*    */     //   919: pop
/*    */     //   920: getstatic f/bx0.fX : Lf/ik;
/*    */     //   923: ldc_w 'Invalid battle sprites scales table value.'
/*    */     //   926: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   931: iinc #3, 1
/*    */     //   934: goto -> 19
/*    */     //   937: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 7
/*    */     //   #3	-> 120
/*    */     //   #4	-> 127
/*    */     //   #5	-> 131
/*    */     //   #6	-> 138
/*    */     //   #7	-> 183
/*    */     //   #8	-> 190
/*    */     //   #9	-> 194
/*    */     //   #10	-> 201
/*    */     //   #11	-> 342
/*    */     //   #12	-> 345
/*    */     //   #13	-> 351
/*    */     //   #14	-> 357
/*    */     //   #15	-> 474
/*    */     //   #16	-> 477
/*    */     //   #17	-> 483
/*    */     //   #18	-> 489
/*    */     //   #19	-> 606
/*    */     //   #20	-> 609
/*    */     //   #21	-> 615
/*    */     //   #22	-> 621
/*    */     //   #23	-> 759
/*    */     //   #24	-> 762
/*    */     //   #25	-> 768
/*    */     //   #26	-> 775
/*    */     //   #27	-> 899
/*    */     //   #28	-> 902
/*    */     //   #29	-> 909
/*    */     //   #30	-> 920
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   108	118	137	java/lang/NumberFormatException
/*    */     //   171	181	200	java/lang/NumberFormatException
/*    */     //   297	313	319	java/lang/NumberFormatException
/*    */     //   429	445	451	java/lang/NumberFormatException
/*    */     //   561	577	583	java/lang/NumberFormatException
/*    */     //   693	709	715	java/lang/NumberFormatException
/*    */     //   794	806	919	java/lang/NumberFormatException
/*    */     //   811	824	919	java/lang/NumberFormatException
/*    */     //   835	850	919	java/lang/NumberFormatException
/*    */     //   861	876	919	java/lang/NumberFormatException
/*    */     //   887	899	919	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public static void Qt0(byte paramByte, RD0 paramRD0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aconst_null
/*    */     //   2: invokevirtual QM : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   5: ldc_w '\\n'
/*    */     //   8: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   11: dup
/*    */     //   12: astore_1
/*    */     //   13: arraylength
/*    */     //   14: istore_2
/*    */     //   15: iconst_0
/*    */     //   16: istore_3
/*    */     //   17: iload_3
/*    */     //   18: iload_2
/*    */     //   19: if_icmpge -> 240
/*    */     //   22: aload_1
/*    */     //   23: iload_3
/*    */     //   24: aaload
/*    */     //   25: dup
/*    */     //   26: astore #4
/*    */     //   28: ldc_w ';'
/*    */     //   31: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   34: ifeq -> 50
/*    */     //   37: aload #4
/*    */     //   39: dup
/*    */     //   40: bipush #59
/*    */     //   42: invokevirtual indexOf : (I)I
/*    */     //   45: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   55: dup
/*    */     //   56: astore #4
/*    */     //   58: invokevirtual isEmpty : ()Z
/*    */     //   61: ifne -> 234
/*    */     //   64: aload #4
/*    */     //   66: ldc_w '='
/*    */     //   69: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   72: ifne -> 78
/*    */     //   75: goto -> 234
/*    */     //   78: aload #4
/*    */     //   80: ldc_w '='
/*    */     //   83: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   86: dup
/*    */     //   87: astore #4
/*    */     //   89: arraylength
/*    */     //   90: iconst_2
/*    */     //   91: if_icmpge -> 97
/*    */     //   94: goto -> 223
/*    */     //   97: aload #4
/*    */     //   99: dup
/*    */     //   100: iconst_0
/*    */     //   101: aaload
/*    */     //   102: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   105: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   108: istore #4
/*    */     //   110: iconst_1
/*    */     //   111: aaload
/*    */     //   112: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   115: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   118: fstore #5
/*    */     //   120: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   123: dup
/*    */     //   124: astore #6
/*    */     //   126: getfield da : [Lf/Uf0;
/*    */     //   129: dup
/*    */     //   130: astore #7
/*    */     //   132: iload_0
/*    */     //   133: aaload
/*    */     //   134: ifnonnull -> 152
/*    */     //   137: aload #7
/*    */     //   139: new f/Uf0
/*    */     //   142: dup
/*    */     //   143: astore #7
/*    */     //   145: invokespecial <init> : ()V
/*    */     //   148: iload_0
/*    */     //   149: aload #7
/*    */     //   151: aastore
/*    */     //   152: aload #6
/*    */     //   154: getfield da : [Lf/Uf0;
/*    */     //   157: iload_0
/*    */     //   158: aaload
/*    */     //   159: dup
/*    */     //   160: astore #6
/*    */     //   162: iload #4
/*    */     //   164: invokevirtual QC0 : (S)I
/*    */     //   167: dup
/*    */     //   168: istore #4
/*    */     //   170: iconst_1
/*    */     //   171: istore #7
/*    */     //   173: ifge -> 195
/*    */     //   176: aload #6
/*    */     //   178: iload #4
/*    */     //   180: ineg
/*    */     //   181: iconst_1
/*    */     //   182: isub
/*    */     //   183: istore #4
/*    */     //   185: getfield rE0 : [F
/*    */     //   188: iload #4
/*    */     //   190: faload
/*    */     //   191: pop
/*    */     //   192: iconst_0
/*    */     //   193: istore #7
/*    */     //   195: iload #7
/*    */     //   197: aload #6
/*    */     //   199: getfield rE0 : [F
/*    */     //   202: iload #4
/*    */     //   204: fload #5
/*    */     //   206: fastore
/*    */     //   207: ifeq -> 234
/*    */     //   210: aload #6
/*    */     //   212: dup
/*    */     //   213: getfield Tb : Z
/*    */     //   216: invokevirtual xt0 : (Z)V
/*    */     //   219: goto -> 234
/*    */     //   222: pop
/*    */     //   223: getstatic f/bx0.fX : Lf/ik;
/*    */     //   226: ldc_w 'Invalid battle sprites scales table value.'
/*    */     //   229: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   234: iinc #3, 1
/*    */     //   237: goto -> 17
/*    */     //   240: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 2
/*    */     //   #2	-> 5
/*    */     //   #3	-> 120
/*    */     //   #4	-> 126
/*    */     //   #5	-> 133
/*    */     //   #6	-> 164
/*    */     //   #7	-> 185
/*    */     //   #8	-> 223
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   97	108	222	java/lang/NumberFormatException
/*    */     //   110	118	222	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public static void P4(RD0 paramRD0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aconst_null
/*    */     //   2: invokevirtual QM : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   5: ldc_w '\\n'
/*    */     //   8: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   11: dup
/*    */     //   12: astore_0
/*    */     //   13: arraylength
/*    */     //   14: istore_1
/*    */     //   15: iconst_0
/*    */     //   16: istore_2
/*    */     //   17: iload_2
/*    */     //   18: iload_1
/*    */     //   19: if_icmpge -> 312
/*    */     //   22: aload_0
/*    */     //   23: iload_2
/*    */     //   24: aaload
/*    */     //   25: dup
/*    */     //   26: astore_3
/*    */     //   27: ldc_w ';'
/*    */     //   30: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   33: ifeq -> 47
/*    */     //   36: aload_3
/*    */     //   37: dup
/*    */     //   38: bipush #59
/*    */     //   40: invokevirtual indexOf : (I)I
/*    */     //   43: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   46: astore_3
/*    */     //   47: aload_3
/*    */     //   48: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   51: dup
/*    */     //   52: astore_3
/*    */     //   53: invokevirtual isEmpty : ()Z
/*    */     //   56: ifne -> 306
/*    */     //   59: aload_3
/*    */     //   60: ldc_w '='
/*    */     //   63: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   66: ifne -> 72
/*    */     //   69: goto -> 306
/*    */     //   72: aload_3
/*    */     //   73: ldc_w '='
/*    */     //   76: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   79: dup
/*    */     //   80: astore #4
/*    */     //   82: arraylength
/*    */     //   83: iconst_2
/*    */     //   84: if_icmpge -> 104
/*    */     //   87: getstatic f/bx0.fX : Lf/ik;
/*    */     //   90: astore #4
/*    */     //   92: ldc_w 'Invalid battle sprite altitude table value. '
/*    */     //   95: aload_3
/*    */     //   96: aload #4
/*    */     //   98: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   101: goto -> 306
/*    */     //   104: aload #4
/*    */     //   106: iconst_0
/*    */     //   107: aaload
/*    */     //   108: ldc_w ','
/*    */     //   111: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   114: dup
/*    */     //   115: astore #5
/*    */     //   117: arraylength
/*    */     //   118: iconst_2
/*    */     //   119: if_icmpge -> 125
/*    */     //   122: goto -> 87
/*    */     //   125: aload #4
/*    */     //   127: iconst_1
/*    */     //   128: aaload
/*    */     //   129: ldc_w ','
/*    */     //   132: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   135: dup
/*    */     //   136: astore #4
/*    */     //   138: arraylength
/*    */     //   139: iconst_3
/*    */     //   140: if_icmpeq -> 160
/*    */     //   143: getstatic f/bx0.fX : Lf/ik;
/*    */     //   146: astore #4
/*    */     //   148: ldc_w 'Invalid battle sprite altitude table value. Coordinates must be defined as X,Y,Z '
/*    */     //   151: aload_3
/*    */     //   152: aload #4
/*    */     //   154: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   157: goto -> 306
/*    */     //   160: new f/eo
/*    */     //   163: dup
/*    */     //   164: astore #6
/*    */     //   166: aload #4
/*    */     //   168: aload #6
/*    */     //   170: aload #4
/*    */     //   172: aload #6
/*    */     //   174: aload #4
/*    */     //   176: aload #5
/*    */     //   178: dup
/*    */     //   179: aload #6
/*    */     //   181: invokespecial <init> : ()V
/*    */     //   184: iconst_0
/*    */     //   185: aaload
/*    */     //   186: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   189: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   192: istore #4
/*    */     //   194: iconst_1
/*    */     //   195: aaload
/*    */     //   196: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   199: ldc_w 'back'
/*    */     //   202: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   205: istore #5
/*    */     //   207: iconst_0
/*    */     //   208: aaload
/*    */     //   209: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   212: ldc_w -1.0
/*    */     //   215: fconst_1
/*    */     //   216: invokestatic SA0 : (FFF)F
/*    */     //   219: putfield x : F
/*    */     //   222: iconst_1
/*    */     //   223: aaload
/*    */     //   224: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   227: ldc_w -1.0
/*    */     //   230: fconst_1
/*    */     //   231: invokestatic SA0 : (FFF)F
/*    */     //   234: putfield y : F
/*    */     //   237: iconst_2
/*    */     //   238: aaload
/*    */     //   239: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   242: ldc_w -1.0
/*    */     //   245: fconst_1
/*    */     //   246: invokestatic SA0 : (FFF)F
/*    */     //   249: putfield z : F
/*    */     //   252: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   255: dup
/*    */     //   256: astore_3
/*    */     //   257: getfield MI : Lf/Ut0;
/*    */     //   260: ifnonnull -> 278
/*    */     //   263: aload_3
/*    */     //   264: new f/Ut0
/*    */     //   267: dup
/*    */     //   268: astore #7
/*    */     //   270: invokespecial <init> : ()V
/*    */     //   273: aload #7
/*    */     //   275: putfield MI : Lf/Ut0;
/*    */     //   278: aload_3
/*    */     //   279: getfield MI : Lf/Ut0;
/*    */     //   282: iload #4
/*    */     //   284: iload #5
/*    */     //   286: iconst_0
/*    */     //   287: iconst_0
/*    */     //   288: iconst_0
/*    */     //   289: iconst_0
/*    */     //   290: invokestatic EY : (SZZBZZ)I
/*    */     //   293: aload #6
/*    */     //   295: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   298: pop
/*    */     //   299: goto -> 306
/*    */     //   302: pop
/*    */     //   303: goto -> 87
/*    */     //   306: iinc #2, 1
/*    */     //   309: goto -> 17
/*    */     //   312: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 2
/*    */     //   #2	-> 5
/*    */     //   #3	-> 92
/*    */     //   #4	-> 107
/*    */     //   #5	-> 148
/*    */     //   #6	-> 160
/*    */     //   #7	-> 252
/*    */     //   #8	-> 257
/*    */     //   #9	-> 264
/*    */     //   #10	-> 290
/*    */     //   #11	-> 295
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   184	192	302	java/lang/NumberFormatException
/*    */     //   194	205	302	java/lang/NumberFormatException
/*    */     //   207	252	302	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public final void Iu0() {
/*    */     try {
/*    */       ZipFile zipFile;
/*    */       if ((zipFile = this.G20) != null) {
/*    */         for (Enumeration<? extends ZipEntry> enumeration = zipFile.entries(); enumeration.hasMoreElements(); ) {
/*    */           ZipEntry zipEntry = enumeration.nextElement();
/*    */           UN(this.qe.f0(zipEntry.getName()));
/*    */         } 
/*    */       } else {
/*    */         NS(this.qe);
/*    */       } 
/*    */       KB();
/*    */       if (this.XH0)
/*    */         this.jA = true; 
/*    */     } catch (Exception exception) {
/*    */       aK.error(B40.df("Error applying mod ").append(this.a80.ml.getName()).toString(), exception);
/*    */       fX.error(B40.df("Error applying mod ").append(this.a80.ml.getName()).toString(), exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean g00(InputStream paramInputStream) {
/*    */     try {
/*    */       DocumentBuilderFactory documentBuilderFactory;
/*    */       try {
/*    */         (documentBuilderFactory = DocumentBuilderFactory.newInstance()).setFeature("http://xml.org/sax/features/external-general-entities", false);
/*    */         DocumentBuilderFactory.newInstance().setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
/*    */       } catch (ParserConfigurationException parserConfigurationException) {}
/*    */       NodeList nodeList;
/*    */       if ((nodeList = documentBuilderFactory.newDocumentBuilder().parse(paramInputStream).getElementsByTagName("resource")).getLength() < 1)
/*    */         return false; 
/*    */       Element element;
/*    */       if ((element = (Element)nodeList.item(0)).hasAttribute("name"))
/*    */         this.aj = element.getAttribute("name"); 
/*    */       if (element.hasAttribute("version"))
/*    */         this.Xq0 = element.getAttribute("version"); 
/*    */       if (element.hasAttribute("description"))
/*    */         this.Vu0 = element.getAttribute("description"); 
/*    */       if (element.hasAttribute("author"))
/*    */         this.d10 = element.getAttribute("author"); 
/*    */       if (element.hasAttribute("weblink")) {
/*    */         String str = "https://forums.pokemmo.eu";
/*    */         byte b = 25;
/*    */         str = "https://pokemmo.eu";
/*    */         b = 18;
/*    */         str = "https://forums.pokemmo.com";
/*    */         b = 26;
/*    */         str = "https://pokemmo.com";
/*    */         b = 19;
/*    */         if (!(this.Nq0 = element.getAttribute("weblink")).regionMatches(true, 0, str, 0, b) && !this.Nq0.regionMatches(true, 0, str, 0, b) && !this.Nq0.regionMatches(true, 0, str, 0, b) && !this.Nq0.regionMatches(true, 0, str, 0, b)) {
/*    */           fX.info("weblink must start with https://forums.pokemmo.com; " + this.a80.ml.getName());
/*    */           this.Nq0 = "";
/*    */         } 
/*    */       } 
/*    */       this.XH0 = true;
/*    */       return true;
/*    */     } catch (Exception exception) {
/*    */       aK.error(B40.df("Error loading mod info.xml ").append(this.a80.ml.getName()).toString(), exception);
/*    */       fX.error(B40.df("Error loading mod info.xml ").append(this.a80.ml.getName()).toString(), exception);
/*    */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void KB() {
/*    */     Vd0 vd0 = this::zs0;
/*    */     byte[] arrayOfByte = this.V4.JO;
/*    */     Object[] arrayOfObject;
/*    */     int i = (arrayOfObject = this.V4.ND).length;
/*    */     do {
/*    */     
/*    */     } while (i-- > 0 && (arrayOfByte[i] != 1 || vd0.Hp(arrayOfObject[i])));
/*    */     this.V4.clear();
/*    */     this.KO.clear();
/*    */   }
/*    */   
/*    */   public final void NS(RD0 paramRD0) {
/*    */     RD0[] arrayOfRD0;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfRD0 = paramRD0.pn()).length, b = 0; b < i; ) {
/*    */       RD0 rD0;
/*    */       if (!(rD0 = arrayOfRD0[b]).ml.getName().contains(".") && rD0.Qg0()) {
/*    */         NS(rD0);
/*    */       } else {
/*    */         UN(rD0);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void UN(RD0 paramRD0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   5: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   13: astore_3
/*    */     //   14: getfield G20 : Ljava/util/zip/ZipFile;
/*    */     //   17: ifnonnull -> 58
/*    */     //   20: aload_3
/*    */     //   21: dup
/*    */     //   22: aload_0
/*    */     //   23: getfield a80 : Lf/RD0;
/*    */     //   26: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   29: invokevirtual length : ()I
/*    */     //   32: aload_0
/*    */     //   33: getfield a80 : Lf/RD0;
/*    */     //   36: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   39: ldc_w '/'
/*    */     //   42: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   45: iconst_1
/*    */     //   46: ixor
/*    */     //   47: iadd
/*    */     //   48: istore_3
/*    */     //   49: invokevirtual length : ()I
/*    */     //   52: iload_3
/*    */     //   53: swap
/*    */     //   54: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   57: astore_3
/*    */     //   58: aload_3
/*    */     //   59: ldc_w '\\|/'
/*    */     //   62: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   65: dup
/*    */     //   66: astore_3
/*    */     //   67: arraylength
/*    */     //   68: iconst_3
/*    */     //   69: if_icmpne -> 291
/*    */     //   72: aload_3
/*    */     //   73: iconst_0
/*    */     //   74: aaload
/*    */     //   75: ldc_w 'sprites'
/*    */     //   78: swap
/*    */     //   79: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   82: ifeq -> 291
/*    */     //   85: aload_3
/*    */     //   86: iconst_1
/*    */     //   87: aaload
/*    */     //   88: ldc_w 'itemicons'
/*    */     //   91: swap
/*    */     //   92: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   95: ifeq -> 291
/*    */     //   98: aload_3
/*    */     //   99: iconst_2
/*    */     //   100: aaload
/*    */     //   101: aload_2
/*    */     //   102: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   105: dup
/*    */     //   106: astore #4
/*    */     //   108: ldc_w '.png'
/*    */     //   111: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   114: ifne -> 129
/*    */     //   117: getstatic f/bx0.fX : Lf/ik;
/*    */     //   120: ldc_w 'Only .png files supported for /sprites/itemicons/'
/*    */     //   123: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   128: return
/*    */     //   129: aload #4
/*    */     //   131: dup
/*    */     //   132: iconst_0
/*    */     //   133: istore #5
/*    */     //   135: bipush #46
/*    */     //   137: invokevirtual indexOf : (I)I
/*    */     //   140: iload #5
/*    */     //   142: swap
/*    */     //   143: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   146: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   149: istore #4
/*    */     //   151: getstatic f/h1.zE : Z
/*    */     //   154: ifeq -> 197
/*    */     //   157: getstatic f/bx0.fX : Lf/ik;
/*    */     //   160: ldc_w 'Loaded '
/*    */     //   163: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   166: aload_1
/*    */     //   167: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   173: ldc_w ' from '
/*    */     //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   179: aload_0
/*    */     //   180: getfield a80 : Lf/RD0;
/*    */     //   183: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   189: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   192: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   197: getstatic f/wm0.y0 : Lf/wm0;
/*    */     //   200: dup
/*    */     //   201: dup
/*    */     //   202: new f/dv0
/*    */     //   205: dup
/*    */     //   206: astore #5
/*    */     //   208: aload_1
/*    */     //   209: invokespecial <init> : (Lf/RD0;)V
/*    */     //   212: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   215: pop
/*    */     //   216: new f/U70
/*    */     //   219: dup
/*    */     //   220: astore #6
/*    */     //   222: new f/abstract
/*    */     //   225: dup
/*    */     //   226: aload #5
/*    */     //   228: invokespecial <init> : (Lf/dv0;)V
/*    */     //   231: invokespecial <init> : (Lf/N50;)V
/*    */     //   234: getfield Rv0 : Lf/qw0;
/*    */     //   237: iload #4
/*    */     //   239: aload #6
/*    */     //   241: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   244: pop
/*    */     //   245: new f/U70
/*    */     //   248: dup
/*    */     //   249: astore #6
/*    */     //   251: new f/el0
/*    */     //   254: dup
/*    */     //   255: aload #5
/*    */     //   257: invokespecial <init> : (Lf/dv0;)V
/*    */     //   260: invokespecial <init> : (Lf/N50;)V
/*    */     //   263: getfield ii : Lf/qw0;
/*    */     //   266: iload #4
/*    */     //   268: aload #6
/*    */     //   270: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   273: pop
/*    */     //   274: goto -> 291
/*    */     //   277: pop
/*    */     //   278: aload #4
/*    */     //   280: getstatic f/bx0.fX : Lf/ik;
/*    */     //   283: ldc_w ' has an invalid item id.'
/*    */     //   286: swap
/*    */     //   287: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   290: return
/*    */     //   291: aload_3
/*    */     //   292: arraylength
/*    */     //   293: iconst_3
/*    */     //   294: if_icmpne -> 758
/*    */     //   297: aload_3
/*    */     //   298: iconst_0
/*    */     //   299: aaload
/*    */     //   300: ldc_w 'sprites'
/*    */     //   303: swap
/*    */     //   304: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   307: ifeq -> 758
/*    */     //   310: aload_3
/*    */     //   311: iconst_1
/*    */     //   312: aaload
/*    */     //   313: ldc_w 'followsprites'
/*    */     //   316: swap
/*    */     //   317: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   320: ifeq -> 758
/*    */     //   323: aload_3
/*    */     //   324: iconst_2
/*    */     //   325: aaload
/*    */     //   326: aload_2
/*    */     //   327: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   330: astore #4
/*    */     //   332: ldc_w 'atlasdata.txt'
/*    */     //   335: aload #4
/*    */     //   337: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   340: ifeq -> 348
/*    */     //   343: aload_1
/*    */     //   344: invokestatic oa : (Lf/RD0;)V
/*    */     //   347: return
/*    */     //   348: aload #4
/*    */     //   350: ldc_w '.png'
/*    */     //   353: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   356: ifne -> 371
/*    */     //   359: getstatic f/bx0.fX : Lf/ik;
/*    */     //   362: ldc_w 'Only .png files supported for /sprites/followsprites/'
/*    */     //   365: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   370: return
/*    */     //   371: aload #4
/*    */     //   373: dup
/*    */     //   374: bipush #46
/*    */     //   376: invokevirtual indexOf : (I)I
/*    */     //   379: iconst_0
/*    */     //   380: swap
/*    */     //   381: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   384: dup
/*    */     //   385: astore #4
/*    */     //   387: ldc_w '-'
/*    */     //   390: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   393: dup
/*    */     //   394: astore #5
/*    */     //   396: arraylength
/*    */     //   397: iconst_3
/*    */     //   398: if_icmpge -> 414
/*    */     //   401: aload #4
/*    */     //   403: getstatic f/bx0.fX : Lf/ik;
/*    */     //   406: ldc_w ' does not have enough fields. Expected name format is ID-X-Y-Z.png where X is 'm' male or 'f' female or 'b' both | Y is 's' shiny or 'n' normal. | Z(optional) is form_id'
/*    */     //   409: swap
/*    */     //   410: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   413: return
/*    */     //   414: aload #5
/*    */     //   416: dup
/*    */     //   417: iconst_0
/*    */     //   418: aaload
/*    */     //   419: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   422: istore #6
/*    */     //   424: iconst_0
/*    */     //   425: istore #7
/*    */     //   427: arraylength
/*    */     //   428: iconst_4
/*    */     //   429: if_icmpne -> 458
/*    */     //   432: aload #5
/*    */     //   434: iconst_3
/*    */     //   435: aaload
/*    */     //   436: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   439: istore #7
/*    */     //   441: goto -> 458
/*    */     //   444: pop
/*    */     //   445: aload #4
/*    */     //   447: getstatic f/bx0.fX : Lf/ik;
/*    */     //   450: ldc_w ' has an invalid monster id.'
/*    */     //   453: swap
/*    */     //   454: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   457: return
/*    */     //   458: aload #5
/*    */     //   460: dup
/*    */     //   461: dup
/*    */     //   462: iconst_1
/*    */     //   463: aaload
/*    */     //   464: ldc_w 'b'
/*    */     //   467: swap
/*    */     //   468: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   471: istore #4
/*    */     //   473: iconst_1
/*    */     //   474: aaload
/*    */     //   475: ldc_w 'f'
/*    */     //   478: swap
/*    */     //   479: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   482: istore #5
/*    */     //   484: iconst_2
/*    */     //   485: aaload
/*    */     //   486: ldc_w 's'
/*    */     //   489: swap
/*    */     //   490: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   493: istore #8
/*    */     //   495: getstatic f/h1.zE : Z
/*    */     //   498: ifeq -> 541
/*    */     //   501: getstatic f/bx0.fX : Lf/ik;
/*    */     //   504: ldc_w 'Loaded '
/*    */     //   507: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   510: aload_1
/*    */     //   511: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   517: ldc_w ' from '
/*    */     //   520: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   523: aload_0
/*    */     //   524: getfield a80 : Lf/RD0;
/*    */     //   527: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   533: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   536: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   541: iload #4
/*    */     //   543: getstatic f/switch.TK : Lf/switch;
/*    */     //   546: astore #4
/*    */     //   548: ifeq -> 557
/*    */     //   551: iconst_m1
/*    */     //   552: istore #5
/*    */     //   554: goto -> 571
/*    */     //   557: iload #5
/*    */     //   559: ifeq -> 568
/*    */     //   562: iconst_1
/*    */     //   563: istore #5
/*    */     //   565: goto -> 571
/*    */     //   568: iconst_0
/*    */     //   569: istore #5
/*    */     //   571: iload #5
/*    */     //   573: new f/LPT8
/*    */     //   576: dup
/*    */     //   577: astore #9
/*    */     //   579: aload_1
/*    */     //   580: invokespecial <init> : (Lf/RD0;)V
/*    */     //   583: iconst_1
/*    */     //   584: if_icmpne -> 595
/*    */     //   587: iload #7
/*    */     //   589: bipush #32
/*    */     //   591: ior
/*    */     //   592: i2b
/*    */     //   593: istore #7
/*    */     //   595: iload #8
/*    */     //   597: ifeq -> 608
/*    */     //   600: iload #7
/*    */     //   602: bipush #64
/*    */     //   604: ior
/*    */     //   605: i2b
/*    */     //   606: istore #7
/*    */     //   608: iload #5
/*    */     //   610: iconst_m1
/*    */     //   611: if_icmpeq -> 657
/*    */     //   614: aload #4
/*    */     //   616: dup
/*    */     //   617: getfield dA0 : Lf/Ut0;
/*    */     //   620: iload #6
/*    */     //   622: iload #7
/*    */     //   624: bipush #16
/*    */     //   626: ishl
/*    */     //   627: ior
/*    */     //   628: aload #9
/*    */     //   630: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   633: pop
/*    */     //   634: getfield dA0 : Lf/Ut0;
/*    */     //   637: iload #6
/*    */     //   639: iload #7
/*    */     //   641: bipush #-128
/*    */     //   643: ior
/*    */     //   644: bipush #16
/*    */     //   646: ishl
/*    */     //   647: ior
/*    */     //   648: aload #9
/*    */     //   650: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   653: pop
/*    */     //   654: goto -> 758
/*    */     //   657: aload #4
/*    */     //   659: dup
/*    */     //   660: dup2
/*    */     //   661: getfield dA0 : Lf/Ut0;
/*    */     //   664: iload #6
/*    */     //   666: iload #7
/*    */     //   668: bipush #16
/*    */     //   670: ishl
/*    */     //   671: ior
/*    */     //   672: aload #9
/*    */     //   674: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   677: pop
/*    */     //   678: getfield dA0 : Lf/Ut0;
/*    */     //   681: iload #6
/*    */     //   683: iload #7
/*    */     //   685: bipush #-128
/*    */     //   687: ior
/*    */     //   688: bipush #16
/*    */     //   690: ishl
/*    */     //   691: ior
/*    */     //   692: aload #9
/*    */     //   694: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   697: pop
/*    */     //   698: getfield dA0 : Lf/Ut0;
/*    */     //   701: iload #6
/*    */     //   703: iload #7
/*    */     //   705: bipush #32
/*    */     //   707: ior
/*    */     //   708: dup
/*    */     //   709: istore #4
/*    */     //   711: bipush #16
/*    */     //   713: ishl
/*    */     //   714: ior
/*    */     //   715: aload #9
/*    */     //   717: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   720: pop
/*    */     //   721: getfield dA0 : Lf/Ut0;
/*    */     //   724: iload #6
/*    */     //   726: iload #4
/*    */     //   728: bipush #-128
/*    */     //   730: ior
/*    */     //   731: bipush #16
/*    */     //   733: ishl
/*    */     //   734: ior
/*    */     //   735: aload #9
/*    */     //   737: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   740: pop
/*    */     //   741: goto -> 758
/*    */     //   744: pop
/*    */     //   745: aload #4
/*    */     //   747: getstatic f/bx0.fX : Lf/ik;
/*    */     //   750: ldc_w ' has an invalid monster id.'
/*    */     //   753: swap
/*    */     //   754: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   757: return
/*    */     //   758: aload_3
/*    */     //   759: arraylength
/*    */     //   760: iconst_3
/*    */     //   761: if_icmpne -> 1757
/*    */     //   764: aload_3
/*    */     //   765: iconst_0
/*    */     //   766: aaload
/*    */     //   767: ldc_w 'sprites'
/*    */     //   770: swap
/*    */     //   771: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   774: ifeq -> 1757
/*    */     //   777: aload_3
/*    */     //   778: iconst_1
/*    */     //   779: aaload
/*    */     //   780: ldc_w 'battlesprites'
/*    */     //   783: swap
/*    */     //   784: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   787: ifeq -> 1757
/*    */     //   790: aload_3
/*    */     //   791: iconst_2
/*    */     //   792: aaload
/*    */     //   793: aload_2
/*    */     //   794: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   797: astore #4
/*    */     //   799: ldc_w 'table-front-scale.txt'
/*    */     //   802: aload #4
/*    */     //   804: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   807: ifeq -> 816
/*    */     //   810: iconst_0
/*    */     //   811: aload_1
/*    */     //   812: invokestatic Qt0 : (BLf/RD0;)V
/*    */     //   815: return
/*    */     //   816: ldc_w 'table-back-scale.txt'
/*    */     //   819: aload #4
/*    */     //   821: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   824: ifeq -> 833
/*    */     //   827: iconst_1
/*    */     //   828: aload_1
/*    */     //   829: invokestatic Qt0 : (BLf/RD0;)V
/*    */     //   832: return
/*    */     //   833: ldc_w 'table-summary-scale.txt'
/*    */     //   836: aload #4
/*    */     //   838: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   841: ifeq -> 850
/*    */     //   844: iconst_2
/*    */     //   845: aload_1
/*    */     //   846: invokestatic Qt0 : (BLf/RD0;)V
/*    */     //   849: return
/*    */     //   850: ldc_w 'table-sprite-timings.txt'
/*    */     //   853: aload #4
/*    */     //   855: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   858: ifeq -> 1069
/*    */     //   861: aload_1
/*    */     //   862: aconst_null
/*    */     //   863: invokevirtual QM : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   866: ldc_w '\\n'
/*    */     //   869: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   872: dup
/*    */     //   873: astore_1
/*    */     //   874: arraylength
/*    */     //   875: istore_2
/*    */     //   876: iconst_0
/*    */     //   877: istore_3
/*    */     //   878: iload_3
/*    */     //   879: iload_2
/*    */     //   880: if_icmpge -> 1068
/*    */     //   883: aload_1
/*    */     //   884: iload_3
/*    */     //   885: aaload
/*    */     //   886: dup
/*    */     //   887: astore #4
/*    */     //   889: ldc_w ';'
/*    */     //   892: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   895: ifeq -> 901
/*    */     //   898: goto -> 1062
/*    */     //   901: aload #4
/*    */     //   903: ldc_w ';'
/*    */     //   906: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   909: ifeq -> 925
/*    */     //   912: aload #4
/*    */     //   914: dup
/*    */     //   915: bipush #59
/*    */     //   917: invokevirtual indexOf : (I)I
/*    */     //   920: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   923: astore #4
/*    */     //   925: aload #4
/*    */     //   927: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   930: dup
/*    */     //   931: astore #4
/*    */     //   933: ldc_w '='
/*    */     //   936: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   939: ifne -> 945
/*    */     //   942: goto -> 1062
/*    */     //   945: aload #4
/*    */     //   947: ldc_w '='
/*    */     //   950: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   953: dup
/*    */     //   954: astore #5
/*    */     //   956: arraylength
/*    */     //   957: iconst_2
/*    */     //   958: if_icmpge -> 979
/*    */     //   961: getstatic f/bx0.fX : Lf/ik;
/*    */     //   964: astore #5
/*    */     //   966: ldc_w 'Invalid battle sprite timings table value. '
/*    */     //   969: aload #4
/*    */     //   971: aload #5
/*    */     //   973: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   976: goto -> 1062
/*    */     //   979: aload #5
/*    */     //   981: dup
/*    */     //   982: iconst_0
/*    */     //   983: aaload
/*    */     //   984: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   987: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   990: istore #5
/*    */     //   992: iconst_1
/*    */     //   993: aaload
/*    */     //   994: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   997: ldc_w ','
/*    */     //   1000: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   1003: dup
/*    */     //   1004: astore #6
/*    */     //   1006: arraylength
/*    */     //   1007: dup
/*    */     //   1008: istore #7
/*    */     //   1010: newarray int
/*    */     //   1012: astore #8
/*    */     //   1014: iconst_0
/*    */     //   1015: istore #9
/*    */     //   1017: iload #9
/*    */     //   1019: iload #7
/*    */     //   1021: if_icmpge -> 1043
/*    */     //   1024: aload #8
/*    */     //   1026: iload #9
/*    */     //   1028: aload #6
/*    */     //   1030: iload #9
/*    */     //   1032: aaload
/*    */     //   1033: invokestatic parseInt : (Ljava/lang/String;)I
/*    */     //   1036: iastore
/*    */     //   1037: iinc #9, 1
/*    */     //   1040: goto -> 1017
/*    */     //   1043: aload_0
/*    */     //   1044: getfield KO : Lf/qw0;
/*    */     //   1047: iload #5
/*    */     //   1049: aload #8
/*    */     //   1051: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   1054: pop
/*    */     //   1055: goto -> 1062
/*    */     //   1058: pop
/*    */     //   1059: goto -> 961
/*    */     //   1062: iinc #3, 1
/*    */     //   1065: goto -> 878
/*    */     //   1068: return
/*    */     //   1069: ldc_w 'table-coordinate-mods.txt'
/*    */     //   1072: aload #4
/*    */     //   1074: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1077: ifeq -> 1085
/*    */     //   1080: aload_1
/*    */     //   1081: invokestatic P4 : (Lf/RD0;)V
/*    */     //   1084: return
/*    */     //   1085: ldc_w 'dummy.png'
/*    */     //   1088: aload #4
/*    */     //   1090: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1093: ifeq -> 1117
/*    */     //   1096: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   1099: new f/dv0
/*    */     //   1102: dup
/*    */     //   1103: astore_0
/*    */     //   1104: aload_1
/*    */     //   1105: invokespecial <init> : (Lf/RD0;)V
/*    */     //   1108: iconst_0
/*    */     //   1109: iconst_0
/*    */     //   1110: iconst_0
/*    */     //   1111: iconst_2
/*    */     //   1112: aload_0
/*    */     //   1113: invokevirtual AR : (SZZBLf/Sp0;)V
/*    */     //   1116: return
/*    */     //   1117: aload #4
/*    */     //   1119: ldc_w '.png'
/*    */     //   1122: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   1125: ifne -> 1151
/*    */     //   1128: aload #4
/*    */     //   1130: ldc_w '.gif'
/*    */     //   1133: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   1136: ifne -> 1151
/*    */     //   1139: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1142: ldc_w 'Only .png/.gif files supported for /sprites/battlesprites/'
/*    */     //   1145: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1150: return
/*    */     //   1151: aload #4
/*    */     //   1153: dup
/*    */     //   1154: bipush #46
/*    */     //   1156: invokevirtual indexOf : (I)I
/*    */     //   1159: iconst_0
/*    */     //   1160: swap
/*    */     //   1161: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   1164: dup
/*    */     //   1165: astore #4
/*    */     //   1167: ldc_w '-'
/*    */     //   1170: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   1173: dup
/*    */     //   1174: astore #5
/*    */     //   1176: arraylength
/*    */     //   1177: iconst_3
/*    */     //   1178: if_icmpge -> 1194
/*    */     //   1181: aload #4
/*    */     //   1183: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1186: ldc_w ' does not have enough fields. Expected name format is ID-back-s.png where 'back' is either 'back' or 'front', and 's' is 's' or 'n'.'
/*    */     //   1189: swap
/*    */     //   1190: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   1193: return
/*    */     //   1194: aload #5
/*    */     //   1196: arraylength
/*    */     //   1197: iconst_5
/*    */     //   1198: if_icmple -> 1267
/*    */     //   1201: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1204: dup
/*    */     //   1205: dup
/*    */     //   1206: dup2
/*    */     //   1207: new java/lang/StringBuilder
/*    */     //   1210: dup
/*    */     //   1211: aload #4
/*    */     //   1213: swap
/*    */     //   1214: invokespecial <init> : ()V
/*    */     //   1217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1220: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1226: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1229: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1234: ldc_w ''back' is either 'back' or 'front' (Ally/Enemy)'
/*    */     //   1237: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1242: ldc_w ''s' is 's' or 'n' (Shiny/Normal)'
/*    */     //   1245: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1250: ldc_w 'OPTIONAL: gender is 'm' or 'f''
/*    */     //   1253: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1258: ldc_w 'PNG ONLY/OPTIONAL: frame is '0' - '127''
/*    */     //   1261: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1266: return
/*    */     //   1267: aload #5
/*    */     //   1269: dup
/*    */     //   1270: dup2
/*    */     //   1271: iconst_0
/*    */     //   1272: istore #6
/*    */     //   1274: iconst_1
/*    */     //   1275: aaload
/*    */     //   1276: ldc_w 'back'
/*    */     //   1279: swap
/*    */     //   1280: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   1283: istore #7
/*    */     //   1285: iconst_2
/*    */     //   1286: aaload
/*    */     //   1287: ldc_w 's'
/*    */     //   1290: swap
/*    */     //   1291: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   1294: istore #8
/*    */     //   1296: iconst_2
/*    */     //   1297: istore #9
/*    */     //   1299: iconst_0
/*    */     //   1300: aaload
/*    */     //   1301: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   1304: istore #10
/*    */     //   1306: arraylength
/*    */     //   1307: iconst_4
/*    */     //   1308: if_icmpne -> 1437
/*    */     //   1311: aload #5
/*    */     //   1313: iconst_3
/*    */     //   1314: aaload
/*    */     //   1315: dup
/*    */     //   1316: astore #5
/*    */     //   1318: iconst_0
/*    */     //   1319: invokevirtual charAt : (I)C
/*    */     //   1322: invokestatic isDigit : (C)Z
/*    */     //   1325: ifeq -> 1363
/*    */     //   1328: aload #5
/*    */     //   1330: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   1333: istore #6
/*    */     //   1335: goto -> 1580
/*    */     //   1338: pop
/*    */     //   1339: aload #4
/*    */     //   1341: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1344: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1347: swap
/*    */     //   1348: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   1351: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1354: ldc_w 'frame is '0' - '127''
/*    */     //   1357: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1362: return
/*    */     //   1363: ldc_w 'm'
/*    */     //   1366: aload #5
/*    */     //   1368: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1371: ifeq -> 1380
/*    */     //   1374: iconst_0
/*    */     //   1375: istore #9
/*    */     //   1377: goto -> 1580
/*    */     //   1380: ldc_w 'f'
/*    */     //   1383: aload #5
/*    */     //   1385: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1388: ifeq -> 1397
/*    */     //   1391: iconst_1
/*    */     //   1392: istore #9
/*    */     //   1394: goto -> 1580
/*    */     //   1397: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1400: dup
/*    */     //   1401: new java/lang/StringBuilder
/*    */     //   1404: dup
/*    */     //   1405: aload #4
/*    */     //   1407: swap
/*    */     //   1408: invokespecial <init> : ()V
/*    */     //   1411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1414: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1420: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1423: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1428: ldc_w 'gender is 'm' or 'f''
/*    */     //   1431: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1436: return
/*    */     //   1437: aload #5
/*    */     //   1439: arraylength
/*    */     //   1440: iconst_5
/*    */     //   1441: if_icmpne -> 1580
/*    */     //   1444: aload #5
/*    */     //   1446: iconst_3
/*    */     //   1447: aaload
/*    */     //   1448: astore #6
/*    */     //   1450: ldc_w 'm'
/*    */     //   1453: aload #6
/*    */     //   1455: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1458: ifeq -> 1471
/*    */     //   1461: iconst_0
/*    */     //   1462: istore #6
/*    */     //   1464: iload #6
/*    */     //   1466: istore #9
/*    */     //   1468: goto -> 1489
/*    */     //   1471: ldc_w 'f'
/*    */     //   1474: aload #6
/*    */     //   1476: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1479: ifeq -> 1540
/*    */     //   1482: iconst_1
/*    */     //   1483: istore #6
/*    */     //   1485: iload #6
/*    */     //   1487: istore #9
/*    */     //   1489: aload #5
/*    */     //   1491: iconst_4
/*    */     //   1492: aaload
/*    */     //   1493: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   1496: goto -> 1333
/*    */     //   1499: pop
/*    */     //   1500: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1503: dup
/*    */     //   1504: new java/lang/StringBuilder
/*    */     //   1507: dup
/*    */     //   1508: aload #4
/*    */     //   1510: swap
/*    */     //   1511: invokespecial <init> : ()V
/*    */     //   1514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1517: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1520: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1523: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1526: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1531: ldc_w 'frame is '0' - '127''
/*    */     //   1534: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1539: return
/*    */     //   1540: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1543: dup
/*    */     //   1544: new java/lang/StringBuilder
/*    */     //   1547: dup
/*    */     //   1548: aload #4
/*    */     //   1550: swap
/*    */     //   1551: invokespecial <init> : ()V
/*    */     //   1554: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1557: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1563: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1566: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1571: ldc_w 'gender is 'm' or 'f''
/*    */     //   1574: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1579: return
/*    */     //   1580: iload #6
/*    */     //   1582: ifle -> 1610
/*    */     //   1585: aload_1
/*    */     //   1586: invokevirtual il0 : ()Ljava/lang/String;
/*    */     //   1589: ldc 'gif'
/*    */     //   1591: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   1594: ifeq -> 1610
/*    */     //   1597: aload #4
/*    */     //   1599: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1602: ldc_w ' error: GIF format does not support frame ids. Remove frame id'
/*    */     //   1605: swap
/*    */     //   1606: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   1609: return
/*    */     //   1610: aload_0
/*    */     //   1611: iload #10
/*    */     //   1613: iload #7
/*    */     //   1615: iconst_0
/*    */     //   1616: iload #9
/*    */     //   1618: iload #8
/*    */     //   1620: iconst_0
/*    */     //   1621: invokestatic EY : (SZZBZZ)I
/*    */     //   1624: istore #4
/*    */     //   1626: getfield V4 : Lf/Ut0;
/*    */     //   1629: iload #4
/*    */     //   1631: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   1634: checkcast f/Tl
/*    */     //   1637: dup
/*    */     //   1638: astore #5
/*    */     //   1640: ifnonnull -> 1672
/*    */     //   1643: aload_0
/*    */     //   1644: new f/Tl
/*    */     //   1647: dup
/*    */     //   1648: astore #5
/*    */     //   1650: iload #9
/*    */     //   1652: iload #10
/*    */     //   1654: iload #7
/*    */     //   1656: iload #8
/*    */     //   1658: invokespecial <init> : (BSZZ)V
/*    */     //   1661: getfield V4 : Lf/Ut0;
/*    */     //   1664: iload #4
/*    */     //   1666: aload #5
/*    */     //   1668: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   1671: pop
/*    */     //   1672: aload #5
/*    */     //   1674: getfield Zx0 : Ljava/util/TreeMap;
/*    */     //   1677: iload #6
/*    */     //   1679: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1682: aload_1
/*    */     //   1683: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1686: pop
/*    */     //   1687: goto -> 1757
/*    */     //   1690: pop
/*    */     //   1691: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1694: dup
/*    */     //   1695: dup
/*    */     //   1696: dup2
/*    */     //   1697: new java/lang/StringBuilder
/*    */     //   1700: dup
/*    */     //   1701: aload #4
/*    */     //   1703: swap
/*    */     //   1704: invokespecial <init> : ()V
/*    */     //   1707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1710: ldc_w ' invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:'
/*    */     //   1713: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1716: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1719: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1724: ldc_w ''back' is either 'back' or 'front' (Ally/Enemy)'
/*    */     //   1727: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1732: ldc_w ''s' is 's' or 'n' (Shiny/Normal)'
/*    */     //   1735: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1740: ldc_w 'OPTIONAL: gender is 'm' or 'f''
/*    */     //   1743: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1748: ldc_w 'PNG ONLY/OPTIONAL: frame is '0' - '127''
/*    */     //   1751: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1756: return
/*    */     //   1757: aload_3
/*    */     //   1758: arraylength
/*    */     //   1759: iconst_3
/*    */     //   1760: if_icmpne -> 2203
/*    */     //   1763: aload_3
/*    */     //   1764: iconst_0
/*    */     //   1765: aaload
/*    */     //   1766: ldc_w 'sprites'
/*    */     //   1769: swap
/*    */     //   1770: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   1773: ifeq -> 2203
/*    */     //   1776: aload_3
/*    */     //   1777: iconst_1
/*    */     //   1778: aaload
/*    */     //   1779: ldc_w 'monstericons'
/*    */     //   1782: swap
/*    */     //   1783: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   1786: ifeq -> 2203
/*    */     //   1789: aload_3
/*    */     //   1790: iconst_2
/*    */     //   1791: aaload
/*    */     //   1792: aload_2
/*    */     //   1793: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   1796: dup
/*    */     //   1797: astore #4
/*    */     //   1799: ldc_w '.png'
/*    */     //   1802: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   1805: ifne -> 1820
/*    */     //   1808: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1811: ldc_w 'Only .png files supported for /sprites/monstericons/'
/*    */     //   1814: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1819: return
/*    */     //   1820: aload #4
/*    */     //   1822: dup
/*    */     //   1823: bipush #46
/*    */     //   1825: invokevirtual indexOf : (I)I
/*    */     //   1828: iconst_0
/*    */     //   1829: swap
/*    */     //   1830: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   1833: dup
/*    */     //   1834: astore #4
/*    */     //   1836: ldc_w '-'
/*    */     //   1839: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   1842: dup
/*    */     //   1843: astore #5
/*    */     //   1845: arraylength
/*    */     //   1846: iconst_2
/*    */     //   1847: if_icmpge -> 1863
/*    */     //   1850: aload #4
/*    */     //   1852: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1855: ldc_w ' does not have enough fields. Expected name format is ID-F.png where 'F' is frame id.'
/*    */     //   1858: swap
/*    */     //   1859: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   1862: return
/*    */     //   1863: aload #5
/*    */     //   1865: dup
/*    */     //   1866: iconst_0
/*    */     //   1867: aaload
/*    */     //   1868: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   1871: istore #5
/*    */     //   1873: iconst_1
/*    */     //   1874: aaload
/*    */     //   1875: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   1878: istore #4
/*    */     //   1880: getstatic f/h1.zE : Z
/*    */     //   1883: ifeq -> 1926
/*    */     //   1886: getstatic f/bx0.fX : Lf/ik;
/*    */     //   1889: ldc_w 'Loaded '
/*    */     //   1892: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1895: aload_1
/*    */     //   1896: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   1899: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1902: ldc_w ' from '
/*    */     //   1905: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1908: aload_0
/*    */     //   1909: getfield a80 : Lf/RD0;
/*    */     //   1912: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   1915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1918: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1921: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1926: iload #4
/*    */     //   1928: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   1931: dup
/*    */     //   1932: astore #6
/*    */     //   1934: new f/dv0
/*    */     //   1937: dup
/*    */     //   1938: astore #7
/*    */     //   1940: aload_1
/*    */     //   1941: invokespecial <init> : (Lf/RD0;)V
/*    */     //   1944: iconst_0
/*    */     //   1945: istore #8
/*    */     //   1947: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1950: pop
/*    */     //   1951: iconst_0
/*    */     //   1952: istore #9
/*    */     //   1954: iflt -> 2059
/*    */     //   1957: iload #4
/*    */     //   1959: iconst_1
/*    */     //   1960: if_icmple -> 1966
/*    */     //   1963: goto -> 2059
/*    */     //   1966: aload #6
/*    */     //   1968: iload #5
/*    */     //   1970: iconst_0
/*    */     //   1971: iconst_1
/*    */     //   1972: iload #8
/*    */     //   1974: iload #9
/*    */     //   1976: iconst_0
/*    */     //   1977: invokestatic EY : (SZZBZZ)I
/*    */     //   1980: istore #8
/*    */     //   1982: getfield zW : Lf/Ut0;
/*    */     //   1985: iload #8
/*    */     //   1987: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   1990: checkcast f/Sp0
/*    */     //   1993: dup
/*    */     //   1994: astore #9
/*    */     //   1996: ifnonnull -> 2023
/*    */     //   1999: aload #6
/*    */     //   2001: new f/AA0
/*    */     //   2004: dup
/*    */     //   2005: astore #9
/*    */     //   2007: aload #7
/*    */     //   2009: invokespecial <init> : (Lf/dv0;)V
/*    */     //   2012: getfield zW : Lf/Ut0;
/*    */     //   2015: iload #8
/*    */     //   2017: aload #9
/*    */     //   2019: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   2022: pop
/*    */     //   2023: iload #4
/*    */     //   2025: aload #9
/*    */     //   2027: checkcast f/AA0
/*    */     //   2030: astore #8
/*    */     //   2032: iflt -> 2059
/*    */     //   2035: iload #4
/*    */     //   2037: aload #8
/*    */     //   2039: getfield Ro0 : [Lf/Sp0;
/*    */     //   2042: dup
/*    */     //   2043: astore #8
/*    */     //   2045: arraylength
/*    */     //   2046: if_icmple -> 2052
/*    */     //   2049: goto -> 2059
/*    */     //   2052: aload #8
/*    */     //   2054: iload #4
/*    */     //   2056: aload #7
/*    */     //   2058: aastore
/*    */     //   2059: iload #4
/*    */     //   2061: iconst_1
/*    */     //   2062: istore #8
/*    */     //   2064: iconst_0
/*    */     //   2065: istore #9
/*    */     //   2067: iflt -> 2203
/*    */     //   2070: iload #4
/*    */     //   2072: iconst_1
/*    */     //   2073: if_icmple -> 2079
/*    */     //   2076: goto -> 2203
/*    */     //   2079: aload #6
/*    */     //   2081: iload #5
/*    */     //   2083: iconst_0
/*    */     //   2084: iconst_1
/*    */     //   2085: iload #8
/*    */     //   2087: iload #9
/*    */     //   2089: iconst_0
/*    */     //   2090: invokestatic EY : (SZZBZZ)I
/*    */     //   2093: istore #5
/*    */     //   2095: getfield zW : Lf/Ut0;
/*    */     //   2098: iload #5
/*    */     //   2100: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   2103: checkcast f/Sp0
/*    */     //   2106: dup
/*    */     //   2107: astore #8
/*    */     //   2109: ifnonnull -> 2136
/*    */     //   2112: aload #6
/*    */     //   2114: new f/AA0
/*    */     //   2117: dup
/*    */     //   2118: astore #8
/*    */     //   2120: aload #7
/*    */     //   2122: invokespecial <init> : (Lf/dv0;)V
/*    */     //   2125: getfield zW : Lf/Ut0;
/*    */     //   2128: iload #5
/*    */     //   2130: aload #8
/*    */     //   2132: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   2135: pop
/*    */     //   2136: iload #4
/*    */     //   2138: aload #8
/*    */     //   2140: checkcast f/AA0
/*    */     //   2143: astore #5
/*    */     //   2145: iflt -> 2203
/*    */     //   2148: iload #4
/*    */     //   2150: aload #5
/*    */     //   2152: getfield Ro0 : [Lf/Sp0;
/*    */     //   2155: dup
/*    */     //   2156: astore #5
/*    */     //   2158: arraylength
/*    */     //   2159: if_icmple -> 2165
/*    */     //   2162: goto -> 2203
/*    */     //   2165: aload #5
/*    */     //   2167: iload #4
/*    */     //   2169: aload #7
/*    */     //   2171: aastore
/*    */     //   2172: goto -> 2203
/*    */     //   2175: pop
/*    */     //   2176: aload #4
/*    */     //   2178: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2181: ldc_w ' has an invalid frame id.'
/*    */     //   2184: swap
/*    */     //   2185: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   2188: return
/*    */     //   2189: pop
/*    */     //   2190: aload #4
/*    */     //   2192: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2195: ldc_w ' has an invalid monster id.'
/*    */     //   2198: swap
/*    */     //   2199: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   2202: return
/*    */     //   2203: aload_3
/*    */     //   2204: arraylength
/*    */     //   2205: iconst_4
/*    */     //   2206: if_icmpne -> 2790
/*    */     //   2209: aload_3
/*    */     //   2210: iconst_0
/*    */     //   2211: aaload
/*    */     //   2212: ldc_w 'sprites'
/*    */     //   2215: swap
/*    */     //   2216: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   2219: ifeq -> 2790
/*    */     //   2222: aload_3
/*    */     //   2223: iconst_1
/*    */     //   2224: aaload
/*    */     //   2225: ldc_w 'overworldsprites'
/*    */     //   2228: swap
/*    */     //   2229: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   2232: ifeq -> 2790
/*    */     //   2235: aload_3
/*    */     //   2236: iconst_3
/*    */     //   2237: aaload
/*    */     //   2238: aload_2
/*    */     //   2239: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   2242: dup
/*    */     //   2243: astore #4
/*    */     //   2245: ldc_w '.png'
/*    */     //   2248: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   2251: ifne -> 2266
/*    */     //   2254: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2257: ldc_w 'Only .png files supported for /sprites/overworldsprites/'
/*    */     //   2260: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2265: return
/*    */     //   2266: aload_3
/*    */     //   2267: aload #4
/*    */     //   2269: dup
/*    */     //   2270: bipush #46
/*    */     //   2272: invokevirtual indexOf : (I)I
/*    */     //   2275: iconst_0
/*    */     //   2276: swap
/*    */     //   2277: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   2280: astore #4
/*    */     //   2282: iconst_2
/*    */     //   2283: aaload
/*    */     //   2284: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   2287: dup
/*    */     //   2288: istore #5
/*    */     //   2290: iflt -> 2299
/*    */     //   2293: iload #5
/*    */     //   2295: iconst_5
/*    */     //   2296: if_icmple -> 2306
/*    */     //   2299: iload #5
/*    */     //   2301: bipush #10
/*    */     //   2303: if_icmpne -> 2310
/*    */     //   2306: iconst_1
/*    */     //   2307: goto -> 2311
/*    */     //   2310: iconst_0
/*    */     //   2311: ifne -> 2355
/*    */     //   2314: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2317: ldc_w 'Invalid file: overworldsprites/'
/*    */     //   2320: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2323: aload_3
/*    */     //   2324: iconst_2
/*    */     //   2325: aaload
/*    */     //   2326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2329: ldc_w '/'
/*    */     //   2332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2335: aload #4
/*    */     //   2337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2340: ldc_w ' has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10'
/*    */     //   2343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2346: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2349: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2354: return
/*    */     //   2355: aload #4
/*    */     //   2357: ldc_w '-'
/*    */     //   2360: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   2363: dup
/*    */     //   2364: astore #6
/*    */     //   2366: arraylength
/*    */     //   2367: iconst_2
/*    */     //   2368: if_icmpge -> 2418
/*    */     //   2371: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2374: new java/lang/StringBuilder
/*    */     //   2377: dup
/*    */     //   2378: invokespecial <init> : ()V
/*    */     //   2381: ldc_w 'overworldsprites/'
/*    */     //   2384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2387: iload #5
/*    */     //   2389: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   2392: ldc_w '/'
/*    */     //   2395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2398: aload #4
/*    */     //   2400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2403: ldc_w ' does not have enough fields. Expected name format is ID-F.png where 'F' is frame id.'
/*    */     //   2406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2409: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2412: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2417: return
/*    */     //   2418: aload #6
/*    */     //   2420: dup
/*    */     //   2421: dup
/*    */     //   2422: iconst_0
/*    */     //   2423: aaload
/*    */     //   2424: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   2427: istore #7
/*    */     //   2429: iconst_1
/*    */     //   2430: aaload
/*    */     //   2431: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   2434: istore #4
/*    */     //   2436: arraylength
/*    */     //   2437: iconst_2
/*    */     //   2438: if_icmple -> 2460
/*    */     //   2441: aload #6
/*    */     //   2443: iconst_2
/*    */     //   2444: aaload
/*    */     //   2445: ldc_w 'glowoverlay'
/*    */     //   2448: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   2451: ifeq -> 2460
/*    */     //   2454: iconst_1
/*    */     //   2455: istore #6
/*    */     //   2457: goto -> 2463
/*    */     //   2460: iconst_0
/*    */     //   2461: istore #6
/*    */     //   2463: getstatic f/h1.zE : Z
/*    */     //   2466: ifeq -> 2509
/*    */     //   2469: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2472: ldc_w 'Loaded '
/*    */     //   2475: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2478: aload_1
/*    */     //   2479: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   2482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2485: ldc_w ' from '
/*    */     //   2488: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2491: aload_0
/*    */     //   2492: getfield a80 : Lf/RD0;
/*    */     //   2495: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   2498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2501: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2504: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2509: new f/dv0
/*    */     //   2512: dup
/*    */     //   2513: astore #8
/*    */     //   2515: aload_1
/*    */     //   2516: invokespecial <init> : (Lf/RD0;)V
/*    */     //   2519: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   2522: iload #5
/*    */     //   2524: iload #7
/*    */     //   2526: iload #6
/*    */     //   2528: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   2531: dup
/*    */     //   2532: astore #5
/*    */     //   2534: ifnull -> 2553
/*    */     //   2537: aload #5
/*    */     //   2539: getstatic f/G00.f00 : Lf/Cs;
/*    */     //   2542: if_acmpeq -> 2553
/*    */     //   2545: aload #5
/*    */     //   2547: instanceof f/Yq0
/*    */     //   2550: ifne -> 2612
/*    */     //   2553: iload #6
/*    */     //   2555: new f/Yq0
/*    */     //   2558: dup
/*    */     //   2559: astore #5
/*    */     //   2561: invokespecial <init> : ()V
/*    */     //   2564: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   2567: getfield Sl : Lf/ak;
/*    */     //   2570: bipush #10
/*    */     //   2572: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   2575: checkcast f/Le0
/*    */     //   2578: astore #6
/*    */     //   2580: ifeq -> 2599
/*    */     //   2583: aload #6
/*    */     //   2585: getfield bO : Lf/Ut0;
/*    */     //   2588: iload #7
/*    */     //   2590: aload #5
/*    */     //   2592: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   2595: pop
/*    */     //   2596: goto -> 2612
/*    */     //   2599: aload #6
/*    */     //   2601: getfield Gi0 : Lf/Ut0;
/*    */     //   2604: iload #7
/*    */     //   2606: aload #5
/*    */     //   2608: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   2611: pop
/*    */     //   2612: aload #5
/*    */     //   2614: checkcast f/Yq0
/*    */     //   2617: iload #4
/*    */     //   2619: new f/U70
/*    */     //   2622: dup
/*    */     //   2623: astore #4
/*    */     //   2625: new f/wm
/*    */     //   2628: dup
/*    */     //   2629: aload #8
/*    */     //   2631: invokespecial <init> : (Lf/dv0;)V
/*    */     //   2634: invokespecial <init> : (Lf/N50;)V
/*    */     //   2637: aload #4
/*    */     //   2639: invokevirtual Y70 : (BLf/U70;)V
/*    */     //   2642: goto -> 2790
/*    */     //   2645: pop
/*    */     //   2646: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2649: new java/lang/StringBuilder
/*    */     //   2652: dup
/*    */     //   2653: invokespecial <init> : ()V
/*    */     //   2656: ldc_w 'overworldsprites/'
/*    */     //   2659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2662: iload #5
/*    */     //   2664: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   2667: ldc_w '/'
/*    */     //   2670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2673: aload #4
/*    */     //   2675: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2678: ldc_w ' has an invalid frame id: Failed to parse '
/*    */     //   2681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2684: aload #6
/*    */     //   2686: iconst_1
/*    */     //   2687: aaload
/*    */     //   2688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2691: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2694: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2699: return
/*    */     //   2700: pop
/*    */     //   2701: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2704: new java/lang/StringBuilder
/*    */     //   2707: dup
/*    */     //   2708: invokespecial <init> : ()V
/*    */     //   2711: ldc_w 'overworldsprites/'
/*    */     //   2714: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2717: iload #5
/*    */     //   2719: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   2722: ldc_w '/'
/*    */     //   2725: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2728: aload #4
/*    */     //   2730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2733: ldc_w ' has an invalid overworld sprite id.'
/*    */     //   2736: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2739: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2742: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2747: return
/*    */     //   2748: pop
/*    */     //   2749: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2752: ldc_w 'Invalid file: overworldsprites/'
/*    */     //   2755: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2758: aload_3
/*    */     //   2759: iconst_2
/*    */     //   2760: aaload
/*    */     //   2761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2764: ldc_w '/'
/*    */     //   2767: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2770: aload #4
/*    */     //   2772: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2775: ldc_w ' has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10'
/*    */     //   2778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2781: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2784: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2789: return
/*    */     //   2790: aload_3
/*    */     //   2791: arraylength
/*    */     //   2792: iconst_4
/*    */     //   2793: if_icmpne -> 3139
/*    */     //   2796: aload_3
/*    */     //   2797: iconst_0
/*    */     //   2798: aaload
/*    */     //   2799: ldc_w 'sprites'
/*    */     //   2802: swap
/*    */     //   2803: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   2806: ifeq -> 3139
/*    */     //   2809: aload_3
/*    */     //   2810: iconst_1
/*    */     //   2811: aaload
/*    */     //   2812: ldc_w 'trainersprites'
/*    */     //   2815: swap
/*    */     //   2816: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   2819: ifeq -> 3139
/*    */     //   2822: aload_3
/*    */     //   2823: iconst_3
/*    */     //   2824: aaload
/*    */     //   2825: aload_2
/*    */     //   2826: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   2829: dup
/*    */     //   2830: astore #4
/*    */     //   2832: ldc_w '.png'
/*    */     //   2835: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   2838: ifne -> 2853
/*    */     //   2841: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2844: ldc_w 'Only .png files supported for /sprites/trainersprites/'
/*    */     //   2847: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2852: return
/*    */     //   2853: aload_3
/*    */     //   2854: iconst_2
/*    */     //   2855: aaload
/*    */     //   2856: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   2859: dup
/*    */     //   2860: istore #5
/*    */     //   2862: iflt -> 2871
/*    */     //   2865: iload #5
/*    */     //   2867: iconst_5
/*    */     //   2868: if_icmple -> 2878
/*    */     //   2871: iload #5
/*    */     //   2873: bipush #10
/*    */     //   2875: if_icmpne -> 2882
/*    */     //   2878: iconst_1
/*    */     //   2879: goto -> 2883
/*    */     //   2882: iconst_0
/*    */     //   2883: ifne -> 2927
/*    */     //   2886: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2889: ldc_w 'Invalid file: trainersprites/'
/*    */     //   2892: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2895: aload_3
/*    */     //   2896: iconst_2
/*    */     //   2897: aaload
/*    */     //   2898: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2901: ldc_w '/'
/*    */     //   2904: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2907: aload #4
/*    */     //   2909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2912: ldc_w ' has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10'
/*    */     //   2915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2918: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2921: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2926: return
/*    */     //   2927: aload #4
/*    */     //   2929: dup
/*    */     //   2930: bipush #46
/*    */     //   2932: invokevirtual indexOf : (I)I
/*    */     //   2935: iconst_0
/*    */     //   2936: swap
/*    */     //   2937: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   2940: dup
/*    */     //   2941: astore #4
/*    */     //   2943: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   2946: istore #4
/*    */     //   2948: getstatic f/h1.zE : Z
/*    */     //   2951: ifeq -> 2994
/*    */     //   2954: getstatic f/bx0.fX : Lf/ik;
/*    */     //   2957: ldc_w 'Loaded '
/*    */     //   2960: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2963: aload_1
/*    */     //   2964: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   2967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2970: ldc_w ' from '
/*    */     //   2973: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2976: aload_0
/*    */     //   2977: getfield a80 : Lf/RD0;
/*    */     //   2980: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   2983: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2986: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2989: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   2994: new f/dv0
/*    */     //   2997: dup
/*    */     //   2998: astore #6
/*    */     //   3000: aload_1
/*    */     //   3001: invokespecial <init> : (Lf/RD0;)V
/*    */     //   3004: getstatic f/AD.case : Lf/AD;
/*    */     //   3007: dup
/*    */     //   3008: astore #7
/*    */     //   3010: new f/U70
/*    */     //   3013: dup
/*    */     //   3014: astore #8
/*    */     //   3016: new f/fs0
/*    */     //   3019: dup
/*    */     //   3020: aload #6
/*    */     //   3022: invokespecial <init> : (Lf/dv0;)V
/*    */     //   3025: invokespecial <init> : (Lf/N50;)V
/*    */     //   3028: getfield Hm : Lf/ak;
/*    */     //   3031: iload #5
/*    */     //   3033: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   3036: checkcast f/c9
/*    */     //   3039: dup
/*    */     //   3040: astore #6
/*    */     //   3042: ifnonnull -> 3067
/*    */     //   3045: aload #7
/*    */     //   3047: new f/c9
/*    */     //   3050: dup
/*    */     //   3051: astore #6
/*    */     //   3053: invokespecial <init> : ()V
/*    */     //   3056: getfield Hm : Lf/ak;
/*    */     //   3059: iload #5
/*    */     //   3061: aload #6
/*    */     //   3063: invokevirtual VF : (BLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3066: pop
/*    */     //   3067: aload #6
/*    */     //   3069: getfield CX : Lf/Ut0;
/*    */     //   3072: iload #4
/*    */     //   3074: aload #8
/*    */     //   3076: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3079: pop
/*    */     //   3080: goto -> 3139
/*    */     //   3083: pop
/*    */     //   3084: aload #4
/*    */     //   3086: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3089: ldc_w ' has an invalid trainer sprite id.'
/*    */     //   3092: swap
/*    */     //   3093: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   3096: return
/*    */     //   3097: pop
/*    */     //   3098: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3101: ldc_w 'Invalid file: trainersprites/'
/*    */     //   3104: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3107: aload_3
/*    */     //   3108: iconst_2
/*    */     //   3109: aaload
/*    */     //   3110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3113: ldc_w '/'
/*    */     //   3116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3119: aload #4
/*    */     //   3121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3124: ldc_w ' has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10'
/*    */     //   3127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3130: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   3133: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3138: return
/*    */     //   3139: aload_3
/*    */     //   3140: arraylength
/*    */     //   3141: iconst_2
/*    */     //   3142: if_icmpeq -> 3151
/*    */     //   3145: aload_3
/*    */     //   3146: arraylength
/*    */     //   3147: iconst_3
/*    */     //   3148: if_icmpne -> 3379
/*    */     //   3151: aload_3
/*    */     //   3152: iconst_0
/*    */     //   3153: aaload
/*    */     //   3154: ldc_w 'sounds'
/*    */     //   3157: swap
/*    */     //   3158: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   3161: ifeq -> 3379
/*    */     //   3164: aload_3
/*    */     //   3165: iconst_0
/*    */     //   3166: istore #4
/*    */     //   3168: arraylength
/*    */     //   3169: iconst_3
/*    */     //   3170: if_icmpne -> 3181
/*    */     //   3173: aload_3
/*    */     //   3174: iconst_1
/*    */     //   3175: aaload
/*    */     //   3176: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   3179: istore #4
/*    */     //   3181: aload_3
/*    */     //   3182: dup
/*    */     //   3183: arraylength
/*    */     //   3184: iconst_1
/*    */     //   3185: isub
/*    */     //   3186: aaload
/*    */     //   3187: aload_2
/*    */     //   3188: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   3191: dup
/*    */     //   3192: astore #5
/*    */     //   3194: ldc_w '.wav'
/*    */     //   3197: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3200: ifne -> 3237
/*    */     //   3203: aload #5
/*    */     //   3205: ldc_w '.mp3'
/*    */     //   3208: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3211: ifne -> 3237
/*    */     //   3214: aload #5
/*    */     //   3216: ldc_w '.ogg'
/*    */     //   3219: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3222: ifne -> 3237
/*    */     //   3225: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3228: ldc_w 'Only .wav/.mp3/.ogg files supported for /sounds/'
/*    */     //   3231: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3236: return
/*    */     //   3237: aload #5
/*    */     //   3239: dup
/*    */     //   3240: bipush #46
/*    */     //   3242: invokevirtual indexOf : (I)I
/*    */     //   3245: iconst_0
/*    */     //   3246: swap
/*    */     //   3247: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   3250: dup
/*    */     //   3251: dup
/*    */     //   3252: astore #5
/*    */     //   3254: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   3257: istore #5
/*    */     //   3259: ldc_w '.ogg'
/*    */     //   3262: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3265: ifeq -> 3296
/*    */     //   3268: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3271: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   3274: pop
/*    */     //   3275: getstatic f/Dp0.Ro0 : Lf/Dp0;
/*    */     //   3278: getstatic f/Dp0.QG : Lf/Dp0;
/*    */     //   3281: if_acmpne -> 3296
/*    */     //   3284: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3287: ldc_w 'ogg is not supported on iOS'
/*    */     //   3290: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3295: return
/*    */     //   3296: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   3299: getfield dJ : Lf/Ut0;
/*    */     //   3302: iload #4
/*    */     //   3304: ldc_w 65536
/*    */     //   3307: imul
/*    */     //   3308: iload #5
/*    */     //   3310: iadd
/*    */     //   3311: aload_1
/*    */     //   3312: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3315: pop
/*    */     //   3316: getstatic f/h1.zE : Z
/*    */     //   3319: ifeq -> 3379
/*    */     //   3322: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3325: ldc_w 'Loaded '
/*    */     //   3328: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3331: aload_1
/*    */     //   3332: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3338: ldc_w ' from '
/*    */     //   3341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3344: aload_0
/*    */     //   3345: getfield a80 : Lf/RD0;
/*    */     //   3348: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3354: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   3357: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3362: goto -> 3379
/*    */     //   3365: pop
/*    */     //   3366: aload #5
/*    */     //   3368: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3371: ldc_w ' has an invalid sound id.'
/*    */     //   3374: swap
/*    */     //   3375: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   3378: return
/*    */     //   3379: aload_3
/*    */     //   3380: arraylength
/*    */     //   3381: iconst_2
/*    */     //   3382: if_icmpne -> 3601
/*    */     //   3385: aload_3
/*    */     //   3386: iconst_0
/*    */     //   3387: aaload
/*    */     //   3388: ldc_w 'cries'
/*    */     //   3391: swap
/*    */     //   3392: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   3395: ifeq -> 3601
/*    */     //   3398: aload_3
/*    */     //   3399: iconst_1
/*    */     //   3400: aaload
/*    */     //   3401: aload_2
/*    */     //   3402: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   3405: dup
/*    */     //   3406: astore #4
/*    */     //   3408: ldc_w '.wav'
/*    */     //   3411: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3414: ifne -> 3429
/*    */     //   3417: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3420: ldc_w 'Only .wav files supported for /cries/'
/*    */     //   3423: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3428: return
/*    */     //   3429: aload_1
/*    */     //   3430: aload #4
/*    */     //   3432: dup
/*    */     //   3433: bipush #46
/*    */     //   3435: invokevirtual indexOf : (I)I
/*    */     //   3438: iconst_0
/*    */     //   3439: swap
/*    */     //   3440: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   3443: dup
/*    */     //   3444: astore #4
/*    */     //   3446: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   3449: istore #4
/*    */     //   3451: invokevirtual iy0 : ()[B
/*    */     //   3454: dup
/*    */     //   3455: astore #5
/*    */     //   3457: ifnull -> 3509
/*    */     //   3460: aload #5
/*    */     //   3462: arraylength
/*    */     //   3463: iconst_5
/*    */     //   3464: if_icmpge -> 3470
/*    */     //   3467: goto -> 3509
/*    */     //   3470: aload #5
/*    */     //   3472: iconst_0
/*    */     //   3473: baload
/*    */     //   3474: bipush #82
/*    */     //   3476: if_icmpne -> 3509
/*    */     //   3479: aload #5
/*    */     //   3481: iconst_1
/*    */     //   3482: baload
/*    */     //   3483: bipush #73
/*    */     //   3485: if_icmpne -> 3509
/*    */     //   3488: aload #5
/*    */     //   3490: iconst_2
/*    */     //   3491: baload
/*    */     //   3492: bipush #70
/*    */     //   3494: if_icmpne -> 3509
/*    */     //   3497: aload #5
/*    */     //   3499: iconst_3
/*    */     //   3500: baload
/*    */     //   3501: bipush #70
/*    */     //   3503: if_icmpne -> 3509
/*    */     //   3506: goto -> 3512
/*    */     //   3509: aconst_null
/*    */     //   3510: astore #5
/*    */     //   3512: aload #5
/*    */     //   3514: ifnull -> 3601
/*    */     //   3517: new f/rq
/*    */     //   3520: dup
/*    */     //   3521: astore #5
/*    */     //   3523: aload_1
/*    */     //   3524: invokespecial <init> : (Lf/RD0;)V
/*    */     //   3527: getstatic f/D0.nq0 : Lf/qw0;
/*    */     //   3530: iload #4
/*    */     //   3532: aload #5
/*    */     //   3534: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3537: pop
/*    */     //   3538: getstatic f/h1.zE : Z
/*    */     //   3541: ifeq -> 3601
/*    */     //   3544: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3547: ldc_w 'Loaded '
/*    */     //   3550: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3553: aload_1
/*    */     //   3554: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3560: ldc_w ' from '
/*    */     //   3563: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3566: aload_0
/*    */     //   3567: getfield a80 : Lf/RD0;
/*    */     //   3570: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3576: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   3579: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3584: goto -> 3601
/*    */     //   3587: pop
/*    */     //   3588: aload #4
/*    */     //   3590: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3593: ldc_w ' has an invalid cry id.'
/*    */     //   3596: swap
/*    */     //   3597: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   3600: return
/*    */     //   3601: aload_3
/*    */     //   3602: arraylength
/*    */     //   3603: iconst_2
/*    */     //   3604: if_icmpne -> 3828
/*    */     //   3607: aload_3
/*    */     //   3608: iconst_0
/*    */     //   3609: aaload
/*    */     //   3610: ldc_w 'world_map_footers'
/*    */     //   3613: swap
/*    */     //   3614: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   3617: ifeq -> 3828
/*    */     //   3620: aload_3
/*    */     //   3621: iconst_1
/*    */     //   3622: aaload
/*    */     //   3623: aload_2
/*    */     //   3624: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   3627: dup
/*    */     //   3628: astore #4
/*    */     //   3630: ldc_w '.bin'
/*    */     //   3633: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3636: ifne -> 3651
/*    */     //   3639: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3642: ldc_w 'Only .bin files supported for /world_map_footers/'
/*    */     //   3645: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3650: return
/*    */     //   3651: aload #4
/*    */     //   3653: dup
/*    */     //   3654: bipush #46
/*    */     //   3656: invokevirtual indexOf : (I)I
/*    */     //   3659: iconst_0
/*    */     //   3660: swap
/*    */     //   3661: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   3664: dup
/*    */     //   3665: astore #4
/*    */     //   3667: iconst_0
/*    */     //   3668: istore #5
/*    */     //   3670: ldc_w '-'
/*    */     //   3673: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   3676: dup
/*    */     //   3677: astore #6
/*    */     //   3679: arraylength
/*    */     //   3680: iconst_1
/*    */     //   3681: if_icmple -> 3701
/*    */     //   3684: aload #6
/*    */     //   3686: dup
/*    */     //   3687: iconst_0
/*    */     //   3688: aaload
/*    */     //   3689: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   3692: istore #5
/*    */     //   3694: iconst_1
/*    */     //   3695: aaload
/*    */     //   3696: astore #6
/*    */     //   3698: goto -> 3708
/*    */     //   3701: aload #6
/*    */     //   3703: iconst_0
/*    */     //   3704: aaload
/*    */     //   3705: goto -> 3696
/*    */     //   3708: aload_1
/*    */     //   3709: aload #6
/*    */     //   3711: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   3714: istore #4
/*    */     //   3716: invokevirtual iy0 : ()[B
/*    */     //   3719: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
/*    */     //   3722: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
/*    */     //   3725: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/*    */     //   3728: astore #6
/*    */     //   3730: new f/ot
/*    */     //   3733: dup
/*    */     //   3734: astore #7
/*    */     //   3736: iload #5
/*    */     //   3738: aload #6
/*    */     //   3740: iload #4
/*    */     //   3742: invokespecial <init> : (BLjava/nio/ByteBuffer;S)V
/*    */     //   3745: getstatic f/fV.Ca : Lf/fV;
/*    */     //   3748: getfield sw : [Lf/Pz;
/*    */     //   3751: iload #5
/*    */     //   3753: aaload
/*    */     //   3754: getfield ob : Lf/qw0;
/*    */     //   3757: iload #4
/*    */     //   3759: aload #7
/*    */     //   3761: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3764: pop
/*    */     //   3765: getstatic f/h1.zE : Z
/*    */     //   3768: ifeq -> 3828
/*    */     //   3771: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3774: ldc_w 'Loaded '
/*    */     //   3777: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3780: aload_1
/*    */     //   3781: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3787: ldc_w ' from '
/*    */     //   3790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3793: aload_0
/*    */     //   3794: getfield a80 : Lf/RD0;
/*    */     //   3797: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   3800: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3803: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   3806: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3811: goto -> 3828
/*    */     //   3814: pop
/*    */     //   3815: aload #4
/*    */     //   3817: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3820: ldc_w ' has an invalid footer id.'
/*    */     //   3823: swap
/*    */     //   3824: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   3827: return
/*    */     //   3828: aload_3
/*    */     //   3829: arraylength
/*    */     //   3830: iconst_2
/*    */     //   3831: if_icmpne -> 4083
/*    */     //   3834: aload_3
/*    */     //   3835: iconst_0
/*    */     //   3836: aaload
/*    */     //   3837: ldc_w 'world_map_headers'
/*    */     //   3840: swap
/*    */     //   3841: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   3844: ifeq -> 4083
/*    */     //   3847: aload_3
/*    */     //   3848: iconst_1
/*    */     //   3849: aaload
/*    */     //   3850: aload_2
/*    */     //   3851: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   3854: dup
/*    */     //   3855: astore #4
/*    */     //   3857: ldc_w '.bin'
/*    */     //   3860: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   3863: ifne -> 3878
/*    */     //   3866: getstatic f/bx0.fX : Lf/ik;
/*    */     //   3869: ldc_w 'Only .bin files supported for /world_map_footers/'
/*    */     //   3872: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   3877: return
/*    */     //   3878: aload_1
/*    */     //   3879: aload #4
/*    */     //   3881: ldc_w '\.'
/*    */     //   3884: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   3887: dup
/*    */     //   3888: iconst_0
/*    */     //   3889: aaload
/*    */     //   3890: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   3893: istore #5
/*    */     //   3895: iconst_1
/*    */     //   3896: aaload
/*    */     //   3897: invokestatic parseByte : (Ljava/lang/String;)B
/*    */     //   3900: istore #4
/*    */     //   3902: invokevirtual iy0 : ()[B
/*    */     //   3905: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
/*    */     //   3908: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
/*    */     //   3911: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/*    */     //   3914: astore #6
/*    */     //   3916: new f/MZ
/*    */     //   3919: dup
/*    */     //   3920: astore #7
/*    */     //   3922: iload #5
/*    */     //   3924: iload #4
/*    */     //   3926: aload #6
/*    */     //   3928: invokespecial <init> : (IILjava/nio/ByteBuffer;)V
/*    */     //   3931: getstatic f/fV.Ca : Lf/fV;
/*    */     //   3934: dup
/*    */     //   3935: astore #6
/*    */     //   3937: getfield i60 : [[Lf/MZ;
/*    */     //   3940: dup
/*    */     //   3941: astore #8
/*    */     //   3943: iload #5
/*    */     //   3945: aaload
/*    */     //   3946: ifnonnull -> 3959
/*    */     //   3949: aload #8
/*    */     //   3951: iconst_0
/*    */     //   3952: anewarray f/MZ
/*    */     //   3955: iload #5
/*    */     //   3957: swap
/*    */     //   3958: aastore
/*    */     //   3959: iload #4
/*    */     //   3961: aload #8
/*    */     //   3963: iload #5
/*    */     //   3965: aaload
/*    */     //   3966: dup
/*    */     //   3967: astore #8
/*    */     //   3969: arraylength
/*    */     //   3970: if_icmplt -> 4007
/*    */     //   3973: aload #6
/*    */     //   3975: aload #8
/*    */     //   3977: dup
/*    */     //   3978: iload #4
/*    */     //   3980: iconst_1
/*    */     //   3981: iadd
/*    */     //   3982: anewarray f/MZ
/*    */     //   3985: astore #8
/*    */     //   3987: arraylength
/*    */     //   3988: istore #9
/*    */     //   3990: iconst_0
/*    */     //   3991: aload #8
/*    */     //   3993: iconst_0
/*    */     //   3994: iload #9
/*    */     //   3996: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   3999: getfield i60 : [[Lf/MZ;
/*    */     //   4002: iload #5
/*    */     //   4004: aload #8
/*    */     //   4006: aastore
/*    */     //   4007: aload #6
/*    */     //   4009: getfield i60 : [[Lf/MZ;
/*    */     //   4012: iload #5
/*    */     //   4014: aaload
/*    */     //   4015: iload #4
/*    */     //   4017: aload #7
/*    */     //   4019: aastore
/*    */     //   4020: getstatic f/h1.zE : Z
/*    */     //   4023: ifeq -> 4083
/*    */     //   4026: getstatic f/bx0.fX : Lf/ik;
/*    */     //   4029: ldc_w 'Loaded '
/*    */     //   4032: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4035: aload_1
/*    */     //   4036: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   4039: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4042: ldc_w ' from '
/*    */     //   4045: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4048: aload_0
/*    */     //   4049: getfield a80 : Lf/RD0;
/*    */     //   4052: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   4055: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4058: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   4061: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   4066: goto -> 4083
/*    */     //   4069: pop
/*    */     //   4070: aload #4
/*    */     //   4072: getstatic f/bx0.fX : Lf/ik;
/*    */     //   4075: ldc_w ' has an invalid cry id.'
/*    */     //   4078: swap
/*    */     //   4079: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   4082: return
/*    */     //   4083: aload_3
/*    */     //   4084: arraylength
/*    */     //   4085: iconst_2
/*    */     //   4086: if_icmpne -> 4251
/*    */     //   4089: aload_3
/*    */     //   4090: iconst_0
/*    */     //   4091: aaload
/*    */     //   4092: ldc_w 'maps'
/*    */     //   4095: swap
/*    */     //   4096: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   4099: ifeq -> 4251
/*    */     //   4102: aload_3
/*    */     //   4103: iconst_1
/*    */     //   4104: aaload
/*    */     //   4105: aload_2
/*    */     //   4106: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   4109: dup
/*    */     //   4110: astore_2
/*    */     //   4111: ldc_w '.tmx'
/*    */     //   4114: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   4117: ifne -> 4132
/*    */     //   4120: getstatic f/bx0.fX : Lf/ik;
/*    */     //   4123: ldc_w 'Only .tmx files supported for /maps/'
/*    */     //   4126: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   4131: return
/*    */     //   4132: aload_0
/*    */     //   4133: aload_2
/*    */     //   4134: dup
/*    */     //   4135: iconst_0
/*    */     //   4136: istore_3
/*    */     //   4137: bipush #46
/*    */     //   4139: invokevirtual indexOf : (I)I
/*    */     //   4142: iload_3
/*    */     //   4143: swap
/*    */     //   4144: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   4147: dup
/*    */     //   4148: astore_2
/*    */     //   4149: invokestatic parseShort : (Ljava/lang/String;)S
/*    */     //   4152: istore_2
/*    */     //   4153: getstatic f/P50.Yi0 : Lf/P50;
/*    */     //   4156: astore_3
/*    */     //   4157: getfield Mc0 : Lf/Xt0;
/*    */     //   4160: astore #4
/*    */     //   4162: aload_3
/*    */     //   4163: dup
/*    */     //   4164: getfield VK0 : Ljava/util/HashMap;
/*    */     //   4167: iload_2
/*    */     //   4168: invokestatic valueOf : (S)Ljava/lang/Short;
/*    */     //   4171: aload_1
/*    */     //   4172: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   4175: pop
/*    */     //   4176: getfield Bz0 : Ljava/util/HashMap;
/*    */     //   4179: iload_2
/*    */     //   4180: invokestatic valueOf : (S)Ljava/lang/Short;
/*    */     //   4183: aload #4
/*    */     //   4185: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   4188: pop
/*    */     //   4189: getstatic f/h1.zE : Z
/*    */     //   4192: ifeq -> 4251
/*    */     //   4195: getstatic f/bx0.fX : Lf/ik;
/*    */     //   4198: ldc_w 'Loaded '
/*    */     //   4201: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4204: aload_1
/*    */     //   4205: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   4208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4211: ldc_w ' from '
/*    */     //   4214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4217: aload_0
/*    */     //   4218: getfield a80 : Lf/RD0;
/*    */     //   4221: invokevirtual rw : ()Ljava/lang/String;
/*    */     //   4224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4227: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   4230: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   4235: goto -> 4251
/*    */     //   4238: pop
/*    */     //   4239: aload_2
/*    */     //   4240: getstatic f/bx0.fX : Lf/ik;
/*    */     //   4243: ldc_w ' has an invalid map_footer_connectionlist_id.'
/*    */     //   4246: swap
/*    */     //   4247: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   4250: return
/*    */     //   4251: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 160
/*    */     //   #2	-> 167
/*    */     //   #3	-> 197
/*    */     //   #4	-> 202
/*    */     //   #5	-> 216
/*    */     //   #6	-> 280
/*    */     //   #7	-> 283
/*    */     //   #8	-> 292
/*    */     //   #9	-> 406
/*    */     //   #10	-> 418
/*    */     //   #11	-> 450
/*    */     //   #12	-> 463
/*    */     //   #13	-> 504
/*    */     //   #14	-> 511
/*    */     //   #15	-> 543
/*    */     //   #16	-> 573
/*    */     //   #17	-> 617
/*    */     //   #18	-> 630
/*    */     //   #19	-> 661
/*    */     //   #20	-> 674
/*    */     //   #21	-> 747
/*    */     //   #22	-> 750
/*    */     //   #23	-> 759
/*    */     //   #24	-> 863
/*    */     //   #25	-> 866
/*    */     //   #26	-> 966
/*    */     //   #27	-> 983
/*    */     //   #28	-> 1069
/*    */     //   #29	-> 1096
/*    */     //   #30	-> 1099
/*    */     //   #31	-> 1186
/*    */     //   #32	-> 1196
/*    */     //   #33	-> 1344
/*    */     //   #34	-> 1351
/*    */     //   #35	-> 1602
/*    */     //   #36	-> 1621
/*    */     //   #37	-> 1626
/*    */     //   #38	-> 1674
/*    */     //   #39	-> 1691
/*    */     //   #40	-> 1855
/*    */     //   #41	-> 1867
/*    */     //   #42	-> 1889
/*    */     //   #43	-> 1896
/*    */     //   #44	-> 1928
/*    */     //   #45	-> 1934
/*    */     //   #46	-> 1947
/*    */     //   #47	-> 1977
/*    */     //   #48	-> 1982
/*    */     //   #49	-> 2039
/*    */     //   #50	-> 2090
/*    */     //   #51	-> 2095
/*    */     //   #52	-> 2152
/*    */     //   #53	-> 2178
/*    */     //   #54	-> 2181
/*    */     //   #55	-> 2192
/*    */     //   #56	-> 2195
/*    */     //   #57	-> 2204
/*    */     //   #58	-> 2317
/*    */     //   #59	-> 2325
/*    */     //   #60	-> 2472
/*    */     //   #61	-> 2479
/*    */     //   #62	-> 2519
/*    */     //   #63	-> 2528
/*    */     //   #64	-> 2547
/*    */     //   #65	-> 2555
/*    */     //   #66	-> 2564
/*    */     //   #67	-> 2567
/*    */     //   #68	-> 2572
/*    */     //   #69	-> 2585
/*    */     //   #70	-> 2592
/*    */     //   #71	-> 2601
/*    */     //   #72	-> 2608
/*    */     //   #73	-> 2614
/*    */     //   #74	-> 2752
/*    */     //   #75	-> 2760
/*    */     //   #76	-> 2889
/*    */     //   #77	-> 2897
/*    */     //   #78	-> 2957
/*    */     //   #79	-> 2964
/*    */     //   #80	-> 3004
/*    */     //   #81	-> 3010
/*    */     //   #82	-> 3028
/*    */     //   #83	-> 3033
/*    */     //   #84	-> 3069
/*    */     //   #85	-> 3086
/*    */     //   #86	-> 3089
/*    */     //   #87	-> 3098
/*    */     //   #88	-> 3101
/*    */     //   #89	-> 3109
/*    */     //   #90	-> 3275
/*    */     //   #91	-> 3278
/*    */     //   #92	-> 3299
/*    */     //   #93	-> 3312
/*    */     //   #94	-> 3316
/*    */     //   #95	-> 3325
/*    */     //   #96	-> 3332
/*    */     //   #97	-> 3371
/*    */     //   #98	-> 3380
/*    */     //   #99	-> 3451
/*    */     //   #100	-> 3517
/*    */     //   #101	-> 3527
/*    */     //   #102	-> 3538
/*    */     //   #103	-> 3547
/*    */     //   #104	-> 3554
/*    */     //   #105	-> 3593
/*    */     //   #106	-> 3602
/*    */     //   #107	-> 3745
/*    */     //   #108	-> 3748
/*    */     //   #109	-> 3753
/*    */     //   #110	-> 3765
/*    */     //   #111	-> 3774
/*    */     //   #112	-> 3781
/*    */     //   #113	-> 3820
/*    */     //   #114	-> 3829
/*    */     //   #115	-> 3931
/*    */     //   #116	-> 3937
/*    */     //   #117	-> 3945
/*    */     //   #118	-> 4020
/*    */     //   #119	-> 4029
/*    */     //   #120	-> 4036
/*    */     //   #121	-> 4075
/*    */     //   #122	-> 4084
/*    */     //   #123	-> 4153
/*    */     //   #124	-> 4157
/*    */     //   #125	-> 4164
/*    */     //   #126	-> 4168
/*    */     //   #127	-> 4189
/*    */     //   #128	-> 4198
/*    */     //   #129	-> 4205
/*    */     //   #130	-> 4243
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   135	149	277	java/lang/NumberFormatException
/*    */     //   414	422	744	java/lang/NumberFormatException
/*    */     //   432	439	444	java/lang/NumberFormatException
/*    */     //   979	990	1058	java/lang/NumberFormatException
/*    */     //   992	1003	1058	java/lang/NumberFormatException
/*    */     //   1006	1007	1058	java/lang/NumberFormatException
/*    */     //   1010	1012	1058	java/lang/NumberFormatException
/*    */     //   1024	1037	1058	java/lang/NumberFormatException
/*    */     //   1299	1304	1690	java/lang/Exception
/*    */     //   1328	1333	1338	java/lang/NumberFormatException
/*    */     //   1489	1499	1499	java/lang/NumberFormatException
/*    */     //   1863	1871	2189	java/lang/NumberFormatException
/*    */     //   1873	1878	2175	java/lang/NumberFormatException
/*    */     //   2282	2287	2748	java/lang/NumberFormatException
/*    */     //   2418	2427	2700	java/lang/NumberFormatException
/*    */     //   2429	2434	2645	java/lang/NumberFormatException
/*    */     //   2853	2859	3097	java/lang/NumberFormatException
/*    */     //   2943	2946	3083	java/lang/NumberFormatException
/*    */     //   3254	3257	3365	java/lang/NumberFormatException
/*    */     //   3446	3449	3587	java/lang/NumberFormatException
/*    */     //   3679	3680	3814	java/lang/NumberFormatException
/*    */     //   3684	3692	3814	java/lang/NumberFormatException
/*    */     //   3694	3696	3814	java/lang/NumberFormatException
/*    */     //   3701	3714	3814	java/lang/NumberFormatException
/*    */     //   3887	3893	4069	java/lang/Exception
/*    */     //   3895	3900	4069	java/lang/Exception
/*    */     //   4137	4147	4238	java/lang/Exception
/*    */     //   4149	4152	4238	java/lang/Exception
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */