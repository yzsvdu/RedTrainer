/*  1 */ package f;public final class ga0 extends Wr { public static final ik h50 = C00.gd(ga0.class); public static eM l5 = new eM(); public static ArrayList a1 = new ArrayList(); public static boolean sG = true; public static boolean aG = false; public static boolean gD0 = false; public static boolean Ru0 = false; public static boolean zK0; public static int a2 = -1; public static It iy; public Wd gm0; public int ja0; public int Kx0; public Texture cP; public Texture HC0; public Texture pp; public Texture wn; public final void y9() { hZ hZ = UB0.vj0.N0("./config/palettes.presets");
/*  2 */     this(ud0(null)); wR wR; iy.oS(wR); iy.Qd(); eM eM1; if ((eM1 = l5)
/*  3 */       .ZD0 == null)
/*  4 */     { g3 g31; this(this); this.ZD0 = g31; this(this); this.Ss0 = g31; }  g3 g3; if (!(g3 = this.ZD0).E90) { g3.yp0 = 0; g3.E90 = true; this.Ss0.E90 = false; } else { (g3 = this.Ss0).yp0 = 0; this.Ss0.E90 = true; g3.E90 = false; }  while (g3
/*  5 */       .hasNext()) { String str = (String)g3.next(); iy
/*    */         
/*  7 */         .Vp0(this, l5.MF(this, null), ArrayList.class, xz.class); }  iy.cd0(); try { wR.close(); return; } catch (IOException iOException) { throw new RuntimeException(this); }  } public Fy0[] JT; public Fy0[] wB; public nJ0 aw; public nJ0 Ds; public ZH Bl; public YA0 cl0; public int[] Zn0; public int[] fa; public W1 SL0; public T0 xm; public fQ Hg0; public fQ Fp; public int V50; public int YY; public byte tE0; public boolean er; public boolean[] px0; public final YA0 UC0(dQ paramdQ, String paramString, int paramInt) { this(); YA0 yA0; sA.RT.Xj0(3.0F).sg(15.0F); sA.JP(0).Ig0(80.0F).fu(); sA.JP(1).Kw(); paramdQ.ra0(); (new dQ()).E1("Format: "); SA sA; (((sA = (new YA0()).Dv0).S7(new dQ())).Ox.S7(paramdQ).fu()).Ox.wP();
/*  8 */     (new dQ())
/*  9 */       .E1("Editing: ");
/* 10 */     nJ0 nJ01 = (new YA0()).Dv0.S7(new dQ()).fu().Kw();
/*    */     
/* 12 */     (nJ01.Ox.S7(P6.A(paramString)))
/* 13 */       .Ox.wP();
/* 14 */     if (Ru0) { dQ dQ1, dQ2; (new dQ())
/* 15 */         .E1("Tileset ID: ");
/* 16 */       String str3 = String.valueOf(this.V50);
/* 17 */       this(); (new dQ()).E1(str3);
/*    */       
/* 19 */       ((sA.S7(new dQ())).Ox.S7(dQ2).fu())
/* 20 */         .Ox.wP();
/* 21 */       (new dQ())
/* 22 */         .E1("Texture ID: ");
/* 23 */       str3 = String.valueOf(this.ja0);
/* 24 */       this(); (new dQ()).E1(str3);
/*    */       
/* 26 */       ((sA.S7(new dQ())).Ox.S7(dQ2).fu())
/* 27 */         .Ox.wP();
/* 28 */       (new dQ())
/* 29 */         .E1("Palette ID: ");
/* 30 */       String str1 = String.valueOf(this.Kx0);
/* 31 */       this(); (new dQ()).E1(this);
/*    */       
/* 33 */       ((sA.S7(new dQ())).Ox.S7(dQ2).fu())
/* 34 */         .Ox.wP();
/* 35 */       (new dQ())
/* 36 */         .E1("Offset: ");
/* 37 */       String str2 = String.valueOf(paramInt);
/* 38 */       this(); (new dQ()).E1(str2);
/*    */       
/* 40 */       ((sA.S7(new dQ())).Ox.S7(this).fu())
/* 41 */         .Ox.wP(); }  return yA0; }
/*    */ 
/*    */   
/*    */   public final YA0 Z6(lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0) {
/*    */     // Byte code:
/*    */     //   0: new f/YA0
/*    */     //   3: dup
/*    */     //   4: dup2
/*    */     //   5: astore #4
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: ldc 'section'
/*    */     //   12: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   15: getfield Dv0 : Lf/SA;
/*    */     //   18: dup
/*    */     //   19: astore #5
/*    */     //   21: ldc 10.0
/*    */     //   23: invokevirtual F : (F)Lf/ZP;
/*    */     //   26: checkcast f/SA
/*    */     //   29: ldc 10.0
/*    */     //   31: invokevirtual Ve0 : (F)V
/*    */     //   34: new f/OZ
/*    */     //   37: dup
/*    */     //   38: dup
/*    */     //   39: astore #6
/*    */     //   41: invokespecial <init> : ()V
/*    */     //   44: iconst_1
/*    */     //   45: anewarray java/lang/String
/*    */     //   48: dup
/*    */     //   49: aload #6
/*    */     //   51: swap
/*    */     //   52: iconst_0
/*    */     //   53: ldc_w 'None'
/*    */     //   56: aastore
/*    */     //   57: getfield Fj : Ljava/util/ArrayList;
/*    */     //   60: invokevirtual size : ()I
/*    */     //   63: istore #7
/*    */     //   65: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   68: dup
/*    */     //   69: astore #8
/*    */     //   71: aload #6
/*    */     //   73: getfield Fj : Ljava/util/ArrayList;
/*    */     //   76: iload #7
/*    */     //   78: aload #8
/*    */     //   80: invokevirtual addAll : (ILjava/util/Collection;)Z
/*    */     //   83: pop
/*    */     //   84: invokeinterface size : ()I
/*    */     //   89: iload #7
/*    */     //   91: iadd
/*    */     //   92: iconst_1
/*    */     //   93: isub
/*    */     //   94: istore #8
/*    */     //   96: getfield rw : [Lf/MQ;
/*    */     //   99: dup
/*    */     //   100: astore #9
/*    */     //   102: ifnull -> 140
/*    */     //   105: aload #9
/*    */     //   107: arraylength
/*    */     //   108: istore #10
/*    */     //   110: iconst_0
/*    */     //   111: istore #11
/*    */     //   113: iload #11
/*    */     //   115: iload #10
/*    */     //   117: if_icmpge -> 140
/*    */     //   120: aload #9
/*    */     //   122: iload #11
/*    */     //   124: aaload
/*    */     //   125: iload #7
/*    */     //   127: iload #8
/*    */     //   129: invokeinterface Ge : (II)V
/*    */     //   134: iinc #11, 1
/*    */     //   137: goto -> 113
/*    */     //   140: getstatic f/ga0.l5 : Lf/eM;
/*    */     //   143: dup
/*    */     //   144: astore #7
/*    */     //   146: getfield ZD0 : Lf/g3;
/*    */     //   149: ifnonnull -> 187
/*    */     //   152: aload #7
/*    */     //   154: dup
/*    */     //   155: new f/g3
/*    */     //   158: dup
/*    */     //   159: astore #8
/*    */     //   161: aload #7
/*    */     //   163: invokespecial <init> : (Lf/eM;)V
/*    */     //   166: aload #8
/*    */     //   168: putfield ZD0 : Lf/g3;
/*    */     //   171: new f/g3
/*    */     //   174: dup
/*    */     //   175: astore #8
/*    */     //   177: aload #7
/*    */     //   179: invokespecial <init> : (Lf/eM;)V
/*    */     //   182: aload #8
/*    */     //   184: putfield Ss0 : Lf/g3;
/*    */     //   187: aload #7
/*    */     //   189: getfield ZD0 : Lf/g3;
/*    */     //   192: dup
/*    */     //   193: astore #8
/*    */     //   195: getfield E90 : Z
/*    */     //   198: ifne -> 224
/*    */     //   201: aload #7
/*    */     //   203: aload #8
/*    */     //   205: dup
/*    */     //   206: iconst_0
/*    */     //   207: putfield yp0 : I
/*    */     //   210: iconst_1
/*    */     //   211: putfield E90 : Z
/*    */     //   214: getfield Ss0 : Lf/g3;
/*    */     //   217: iconst_0
/*    */     //   218: putfield E90 : Z
/*    */     //   221: goto -> 247
/*    */     //   224: aload #8
/*    */     //   226: aload #7
/*    */     //   228: getfield Ss0 : Lf/g3;
/*    */     //   231: dup
/*    */     //   232: dup
/*    */     //   233: astore #8
/*    */     //   235: iconst_0
/*    */     //   236: putfield yp0 : I
/*    */     //   239: iconst_1
/*    */     //   240: putfield E90 : Z
/*    */     //   243: iconst_0
/*    */     //   244: putfield E90 : Z
/*    */     //   247: aload #8
/*    */     //   249: invokevirtual hasNext : ()Z
/*    */     //   252: ifeq -> 271
/*    */     //   255: aload #6
/*    */     //   257: aload #8
/*    */     //   259: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   262: checkcast java/lang/String
/*    */     //   265: invokevirtual i3 : (Ljava/lang/Object;)V
/*    */     //   268: goto -> 247
/*    */     //   271: aload #5
/*    */     //   273: dup
/*    */     //   274: dup
/*    */     //   275: dup2
/*    */     //   276: new f/W1
/*    */     //   279: dup
/*    */     //   280: astore #7
/*    */     //   282: aload_0
/*    */     //   283: aload #7
/*    */     //   285: dup
/*    */     //   286: aload #6
/*    */     //   288: aload #7
/*    */     //   290: invokespecial <init> : ()V
/*    */     //   293: invokevirtual rk0 : (Lf/cQ;)V
/*    */     //   296: <illegal opcode> run : (Lf/ga0;Lf/W1;)Ljava/lang/Runnable;
/*    */     //   301: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   304: new f/Un
/*    */     //   307: dup
/*    */     //   308: astore #8
/*    */     //   310: aload_0
/*    */     //   311: aload #7
/*    */     //   313: aload #8
/*    */     //   315: dup
/*    */     //   316: dup
/*    */     //   317: ldc_w 'S'
/*    */     //   320: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   323: ldc_w 'Save'
/*    */     //   326: putfield z4 : Ljava/lang/Object;
/*    */     //   329: invokevirtual zn : ()V
/*    */     //   332: <illegal opcode> run : (Lf/ga0;Lf/W1;)Ljava/lang/Runnable;
/*    */     //   337: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   340: new f/Un
/*    */     //   343: dup
/*    */     //   344: astore #9
/*    */     //   346: aload_0
/*    */     //   347: aload #6
/*    */     //   349: aload #9
/*    */     //   351: ldc_w '+'
/*    */     //   354: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   357: aload #7
/*    */     //   359: <illegal opcode> run : (Lf/ga0;Lf/OZ;Lf/W1;)Ljava/lang/Runnable;
/*    */     //   364: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   367: new f/Un
/*    */     //   370: dup
/*    */     //   371: astore #10
/*    */     //   373: aload_0
/*    */     //   374: aload #7
/*    */     //   376: aload #10
/*    */     //   378: ldc_w '-'
/*    */     //   381: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   384: aload #6
/*    */     //   386: <illegal opcode> run : (Lf/ga0;Lf/W1;Lf/OZ;)Ljava/lang/Runnable;
/*    */     //   391: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   394: new f/ge0
/*    */     //   397: dup
/*    */     //   398: dup
/*    */     //   399: dup2
/*    */     //   400: astore #6
/*    */     //   402: invokespecial <init> : ()V
/*    */     //   405: getstatic f/ga0.sG : Z
/*    */     //   408: istore #11
/*    */     //   410: getfield TG0 : Lf/protected;
/*    */     //   413: iload #11
/*    */     //   415: invokevirtual Fx0 : (Z)V
/*    */     //   418: <illegal opcode> run : (Lf/ge0;)Ljava/lang/Runnable;
/*    */     //   423: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   426: new f/ge0
/*    */     //   429: dup
/*    */     //   430: dup
/*    */     //   431: dup2
/*    */     //   432: astore #11
/*    */     //   434: invokespecial <init> : ()V
/*    */     //   437: getstatic f/ga0.aG : Z
/*    */     //   440: istore #12
/*    */     //   442: getfield TG0 : Lf/protected;
/*    */     //   445: iload #12
/*    */     //   447: invokevirtual Fx0 : (Z)V
/*    */     //   450: <illegal opcode> run : (Lf/ge0;)Ljava/lang/Runnable;
/*    */     //   455: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   458: new f/Un
/*    */     //   461: dup
/*    */     //   462: astore #12
/*    */     //   464: aload_0
/*    */     //   465: aload #7
/*    */     //   467: aload #12
/*    */     //   469: ldc_w 'Clear'
/*    */     //   472: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   475: <illegal opcode> run : (Lf/ga0;Lf/W1;)Ljava/lang/Runnable;
/*    */     //   480: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   483: new f/Un
/*    */     //   486: dup
/*    */     //   487: astore #13
/*    */     //   489: aload_0
/*    */     //   490: aload #6
/*    */     //   492: aload #13
/*    */     //   494: ldc_w 'Copy'
/*    */     //   497: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   500: <illegal opcode> run : (Lf/ga0;Lf/ge0;)Ljava/lang/Runnable;
/*    */     //   505: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   508: new f/Un
/*    */     //   511: dup
/*    */     //   512: astore #14
/*    */     //   514: aload_0
/*    */     //   515: aload_1
/*    */     //   516: aload #14
/*    */     //   518: ldc_w 'Paste'
/*    */     //   521: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   524: aload_2
/*    */     //   525: aload_3
/*    */     //   526: <illegal opcode> run : (Lf/ga0;Lf/lpt1;Lf/fk0;Lf/ZA0;)Ljava/lang/Runnable;
/*    */     //   531: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   534: new f/YA0
/*    */     //   537: dup
/*    */     //   538: dup
/*    */     //   539: invokespecial <init> : ()V
/*    */     //   542: getfield Dv0 : Lf/SA;
/*    */     //   545: ldc_w 'Preset: '
/*    */     //   548: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   551: getfield Ox : Lf/ZP;
/*    */     //   554: aload #7
/*    */     //   556: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   559: dup
/*    */     //   560: dup
/*    */     //   561: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   564: pop
/*    */     //   565: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   568: pop
/*    */     //   569: getfield Ox : Lf/ZP;
/*    */     //   572: aload #8
/*    */     //   574: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   577: getfield Ox : Lf/ZP;
/*    */     //   580: aload #9
/*    */     //   582: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   585: getfield Ox : Lf/ZP;
/*    */     //   588: aload #10
/*    */     //   590: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   593: getfield Ox : Lf/ZP;
/*    */     //   596: invokevirtual wP : ()Lf/nJ0;
/*    */     //   599: pop
/*    */     //   600: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   603: dup
/*    */     //   604: dup2
/*    */     //   605: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   608: pop
/*    */     //   609: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   612: pop
/*    */     //   613: iconst_5
/*    */     //   614: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   617: putfield ss : Ljava/lang/Integer;
/*    */     //   620: getfield Ox : Lf/ZP;
/*    */     //   623: invokevirtual wP : ()Lf/nJ0;
/*    */     //   626: pop
/*    */     //   627: ldc_w 'Copy Unused: '
/*    */     //   630: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   633: invokevirtual ti0 : ()Lf/nJ0;
/*    */     //   636: getfield Ox : Lf/ZP;
/*    */     //   639: aload #6
/*    */     //   641: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   644: invokevirtual fu : ()Lf/nJ0;
/*    */     //   647: getfield Ox : Lf/ZP;
/*    */     //   650: aload #13
/*    */     //   652: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   655: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   658: getfield Ox : Lf/ZP;
/*    */     //   661: aload #12
/*    */     //   663: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   666: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   669: getfield Ox : Lf/ZP;
/*    */     //   672: aload #14
/*    */     //   674: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   677: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   680: getfield Ox : Lf/ZP;
/*    */     //   683: invokevirtual wP : ()Lf/nJ0;
/*    */     //   686: ldc_w 5.0
/*    */     //   689: invokevirtual fa0 : (F)Lf/nJ0;
/*    */     //   692: pop
/*    */     //   693: new f/ge0
/*    */     //   696: dup
/*    */     //   697: astore_1
/*    */     //   698: aload_0
/*    */     //   699: aload_1
/*    */     //   700: dup
/*    */     //   701: dup
/*    */     //   702: invokespecial <init> : ()V
/*    */     //   705: getstatic f/ga0.gD0 : Z
/*    */     //   708: istore_2
/*    */     //   709: getfield TG0 : Lf/protected;
/*    */     //   712: iload_2
/*    */     //   713: invokevirtual Fx0 : (Z)V
/*    */     //   716: <illegal opcode> run : (Lf/ga0;Lf/ge0;)Ljava/lang/Runnable;
/*    */     //   721: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   724: ldc_w 'Show Preview'
/*    */     //   727: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   730: invokevirtual ti0 : ()Lf/nJ0;
/*    */     //   733: getfield Ox : Lf/ZP;
/*    */     //   736: aload_1
/*    */     //   737: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   740: invokevirtual fu : ()Lf/nJ0;
/*    */     //   743: pop
/*    */     //   744: ldc_w 'Paste Compressed'
/*    */     //   747: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   750: dup
/*    */     //   751: iconst_2
/*    */     //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   755: putfield ss : Ljava/lang/Integer;
/*    */     //   758: invokevirtual ti0 : ()Lf/nJ0;
/*    */     //   761: getfield Ox : Lf/ZP;
/*    */     //   764: aload #11
/*    */     //   766: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   769: getfield Ox : Lf/ZP;
/*    */     //   772: invokevirtual wP : ()Lf/nJ0;
/*    */     //   775: pop
/*    */     //   776: new f/ge0
/*    */     //   779: dup
/*    */     //   780: dup
/*    */     //   781: dup2
/*    */     //   782: dup2
/*    */     //   783: astore_1
/*    */     //   784: invokespecial <init> : ()V
/*    */     //   787: getstatic f/ga0.zK0 : Z
/*    */     //   790: istore_2
/*    */     //   791: getfield TG0 : Lf/protected;
/*    */     //   794: iload_2
/*    */     //   795: invokevirtual Fx0 : (Z)V
/*    */     //   798: <illegal opcode> run : (Lf/ge0;)Ljava/lang/Runnable;
/*    */     //   803: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   806: ldc_w 'Allows overwriting of existing color swaps when copying'
/*    */     //   809: putfield z4 : Ljava/lang/Object;
/*    */     //   812: invokevirtual zn : ()V
/*    */     //   815: ldc_w 'Allow Overwrite'
/*    */     //   818: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   821: getfield Ox : Lf/ZP;
/*    */     //   824: aload_1
/*    */     //   825: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   828: invokevirtual fu : ()Lf/nJ0;
/*    */     //   831: dup
/*    */     //   832: iconst_4
/*    */     //   833: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   836: putfield ss : Ljava/lang/Integer;
/*    */     //   839: getfield Ox : Lf/ZP;
/*    */     //   842: invokevirtual wP : ()Lf/nJ0;
/*    */     //   845: pop
/*    */     //   846: getstatic f/ga0.gD0 : Z
/*    */     //   849: ifeq -> 860
/*    */     //   852: aload_0
/*    */     //   853: invokevirtual wi0 : ()Lf/YA0;
/*    */     //   856: astore_1
/*    */     //   857: goto -> 868
/*    */     //   860: new f/JG0
/*    */     //   863: dup
/*    */     //   864: astore_1
/*    */     //   865: invokespecial <init> : ()V
/*    */     //   868: aload #4
/*    */     //   870: aload #7
/*    */     //   872: aload #5
/*    */     //   874: aload_1
/*    */     //   875: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   878: dup
/*    */     //   879: dup
/*    */     //   880: aload_0
/*    */     //   881: swap
/*    */     //   882: putfield aw : Lf/nJ0;
/*    */     //   885: iconst_5
/*    */     //   886: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   889: putfield ss : Ljava/lang/Integer;
/*    */     //   892: getfield Ox : Lf/ZP;
/*    */     //   895: invokevirtual wP : ()Lf/nJ0;
/*    */     //   898: ldc 15.0
/*    */     //   900: invokevirtual fa0 : (F)Lf/nJ0;
/*    */     //   903: pop
/*    */     //   904: getstatic f/ga0.a2 : I
/*    */     //   907: invokevirtual Z30 : (I)V
/*    */     //   910: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 57
/*    */     //   #2	-> 65
/*    */     //   #3	-> 73
/*    */     //   #4	-> 96
/*    */     //   #5	-> 140
/*    */     //   #6	-> 146
/*    */     //   #7	-> 155
/*    */     //   #8	-> 249
/*    */     //   #9	-> 290
/*    */     //   #10	-> 296
/*    */     //   #11	-> 323
/*    */     //   #12	-> 332
/*    */     //   #13	-> 410
/*    */     //   #14	-> 415
/*    */     //   #15	-> 418
/*    */     //   #16	-> 442
/*    */     //   #17	-> 447
/*    */     //   #18	-> 450
/*    */     //   #19	-> 551
/*    */     //   #20	-> 561
/*    */     //   #21	-> 569
/*    */     //   #22	-> 593
/*    */     //   #23	-> 600
/*    */     //   #24	-> 605
/*    */     //   #25	-> 614
/*    */     //   #26	-> 617
/*    */     //   #27	-> 620
/*    */     //   #28	-> 627
/*    */     //   #29	-> 636
/*    */     //   #30	-> 644
/*    */     //   #31	-> 647
/*    */     //   #32	-> 655
/*    */     //   #33	-> 658
/*    */     //   #34	-> 666
/*    */     //   #35	-> 669
/*    */     //   #36	-> 677
/*    */     //   #37	-> 680
/*    */     //   #38	-> 689
/*    */     //   #39	-> 709
/*    */     //   #40	-> 713
/*    */     //   #41	-> 716
/*    */     //   #42	-> 733
/*    */     //   #43	-> 740
/*    */     //   #44	-> 755
/*    */     //   #45	-> 758
/*    */     //   #46	-> 761
/*    */     //   #47	-> 769
/*    */     //   #48	-> 776
/*    */     //   #49	-> 791
/*    */     //   #50	-> 795
/*    */     //   #51	-> 798
/*    */     //   #52	-> 806
/*    */     //   #53	-> 815
/*    */     //   #54	-> 821
/*    */     //   #55	-> 828
/*    */     //   #56	-> 836
/*    */     //   #57	-> 839
/*    */     //   #58	-> 846
/*    */     //   #59	-> 889
/*    */     //   #60	-> 892
/*    */     //   #61	-> 900
/*    */   }
/*    */   
/*    */   public final YA0 wi0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: new f/YA0
/*    */     //   4: dup
/*    */     //   5: dup
/*    */     //   6: astore_1
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: getfield Dv0 : Lf/SA;
/*    */     //   13: dup
/*    */     //   14: astore_2
/*    */     //   15: ldc_w 'Source'
/*    */     //   18: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   21: dup
/*    */     //   22: iconst_2
/*    */     //   23: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   26: putfield ss : Ljava/lang/Integer;
/*    */     //   29: getfield Ox : Lf/ZP;
/*    */     //   32: invokevirtual wP : ()Lf/nJ0;
/*    */     //   35: pop
/*    */     //   36: getstatic f/ga0.a1 : Ljava/util/ArrayList;
/*    */     //   39: invokevirtual size : ()I
/*    */     //   42: anewarray f/Fy0
/*    */     //   45: putfield wB : [Lf/Fy0;
/*    */     //   48: iconst_0
/*    */     //   49: istore_3
/*    */     //   50: iload_3
/*    */     //   51: iconst_2
/*    */     //   52: if_icmpge -> 304
/*    */     //   55: new f/ZJ0
/*    */     //   58: dup
/*    */     //   59: astore #4
/*    */     //   61: invokespecial <init> : ()V
/*    */     //   64: iconst_0
/*    */     //   65: istore #5
/*    */     //   67: getstatic f/ga0.a1 : Ljava/util/ArrayList;
/*    */     //   70: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   73: astore #6
/*    */     //   75: aload #6
/*    */     //   77: invokeinterface hasNext : ()Z
/*    */     //   82: ifeq -> 250
/*    */     //   85: iload_3
/*    */     //   86: aload #6
/*    */     //   88: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   93: checkcast f/xz
/*    */     //   96: astore #7
/*    */     //   98: new f/pe0
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: astore #8
/*    */     //   105: aload_0
/*    */     //   106: getfield wn : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   109: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   112: iconst_0
/*    */     //   113: iconst_0
/*    */     //   114: iconst_1
/*    */     //   115: iconst_1
/*    */     //   116: invokevirtual Y9 : (IIII)V
/*    */     //   119: new f/Fy0
/*    */     //   122: dup
/*    */     //   123: dup2
/*    */     //   124: dup2
/*    */     //   125: astore #9
/*    */     //   127: ldc_w ''
/*    */     //   130: bipush #24
/*    */     //   132: bipush #24
/*    */     //   134: invokespecial <init> : (Ljava/lang/String;II)V
/*    */     //   137: getfield As : Lf/rH;
/*    */     //   140: iconst_1
/*    */     //   141: anewarray f/pe0
/*    */     //   144: dup
/*    */     //   145: iconst_0
/*    */     //   146: aload #8
/*    */     //   148: aastore
/*    */     //   149: invokevirtual Pn : ([Lf/pe0;)Lf/JG0;
/*    */     //   152: pop
/*    */     //   153: getfield As : Lf/rH;
/*    */     //   156: bipush #24
/*    */     //   158: bipush #24
/*    */     //   160: invokevirtual tL : (II)V
/*    */     //   163: ldc_w 'color-button'
/*    */     //   166: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   169: getfield As : Lf/rH;
/*    */     //   172: astore #8
/*    */     //   174: new f/pRn
/*    */     //   177: astore #10
/*    */     //   179: ifne -> 192
/*    */     //   182: aload #7
/*    */     //   184: getfield argb : I
/*    */     //   187: istore #7
/*    */     //   189: goto -> 199
/*    */     //   192: aload #7
/*    */     //   194: getfield argb_swap : I
/*    */     //   197: istore #7
/*    */     //   199: aload #4
/*    */     //   201: aload #9
/*    */     //   203: aload_0
/*    */     //   204: aload #9
/*    */     //   206: aload_0
/*    */     //   207: iload #5
/*    */     //   209: aload #8
/*    */     //   211: aload #10
/*    */     //   213: dup
/*    */     //   214: iload #7
/*    */     //   216: invokespecial <init> : (I)V
/*    */     //   219: invokevirtual FB0 : (Lf/pRn;)V
/*    */     //   222: aload #9
/*    */     //   224: <illegal opcode> run : (Lf/ga0;ILf/Fy0;)Ljava/lang/Runnable;
/*    */     //   229: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   232: getfield wB : [Lf/Fy0;
/*    */     //   235: iload #5
/*    */     //   237: aload #9
/*    */     //   239: aastore
/*    */     //   240: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   243: pop
/*    */     //   244: iinc #5, 1
/*    */     //   247: goto -> 75
/*    */     //   250: iload_3
/*    */     //   251: iconst_1
/*    */     //   252: if_icmpne -> 277
/*    */     //   255: aload_2
/*    */     //   256: ldc_w 'Target'
/*    */     //   259: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   262: dup
/*    */     //   263: iconst_2
/*    */     //   264: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   267: putfield ss : Ljava/lang/Integer;
/*    */     //   270: getfield Ox : Lf/ZP;
/*    */     //   273: invokevirtual wP : ()Lf/nJ0;
/*    */     //   276: pop
/*    */     //   277: aload_2
/*    */     //   278: aload #4
/*    */     //   280: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   283: dup
/*    */     //   284: iconst_2
/*    */     //   285: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   288: putfield ss : Ljava/lang/Integer;
/*    */     //   291: getfield Ox : Lf/ZP;
/*    */     //   294: invokevirtual wP : ()Lf/nJ0;
/*    */     //   297: pop
/*    */     //   298: iinc #3, 1
/*    */     //   301: goto -> 50
/*    */     //   304: aload_1
/*    */     //   305: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 26
/*    */     //   #2	-> 29
/*    */     //   #3	-> 36
/*    */     //   #4	-> 127
/*    */     //   #5	-> 137
/*    */     //   #6	-> 141
/*    */     //   #7	-> 153
/*    */     //   #8	-> 160
/*    */     //   #9	-> 169
/*    */     //   #10	-> 174
/*    */     //   #11	-> 267
/*    */     //   #12	-> 270
/*    */     //   #13	-> 280
/*    */     //   #14	-> 288
/*    */     //   #15	-> 291
/*    */   }
/*    */   
/*    */   public final void Com3(lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: new f/YA0
/*    */     //   3: dup
/*    */     //   4: dup
/*    */     //   5: astore #5
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: getfield Dv0 : Lf/SA;
/*    */     //   13: astore #6
/*    */     //   15: new f/of
/*    */     //   18: dup
/*    */     //   19: dup
/*    */     //   20: astore #7
/*    */     //   22: aconst_null
/*    */     //   23: invokespecial <init> : (Lf/Sa0;)V
/*    */     //   26: iconst_1
/*    */     //   27: anewarray java/lang/Object
/*    */     //   30: dup
/*    */     //   31: astore #8
/*    */     //   33: aload_0
/*    */     //   34: getfield Zn0 : [I
/*    */     //   37: iload #4
/*    */     //   39: iaload
/*    */     //   40: invokestatic ta : (I)I
/*    */     //   43: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   46: iconst_0
/*    */     //   47: swap
/*    */     //   48: aastore
/*    */     //   49: ldc_w '%08X'
/*    */     //   52: aload #8
/*    */     //   54: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   57: iconst_0
/*    */     //   58: invokevirtual Be0 : (Ljava/lang/String;Z)V
/*    */     //   61: new f/dQ
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: astore #8
/*    */     //   68: invokespecial <init> : ()V
/*    */     //   71: ldc_w 'RGB565 Compressed Color: '
/*    */     //   74: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   77: new f/LPT6
/*    */     //   80: dup
/*    */     //   81: dup2
/*    */     //   82: astore #9
/*    */     //   84: new f/O7
/*    */     //   87: dup
/*    */     //   88: invokespecial <init> : ()V
/*    */     //   91: invokespecial <init> : (Lf/O7;)V
/*    */     //   94: new f/pRn
/*    */     //   97: dup
/*    */     //   98: aload_0
/*    */     //   99: getfield Zn0 : [I
/*    */     //   102: iload #4
/*    */     //   104: iaload
/*    */     //   105: invokespecial <init> : (I)V
/*    */     //   108: invokevirtual LpT2 : ()I
/*    */     //   111: invokevirtual Yy0 : (I)V
/*    */     //   114: iconst_1
/*    */     //   115: istore #10
/*    */     //   117: getfield Lc0 : Z
/*    */     //   120: iload #10
/*    */     //   122: if_icmpeq -> 141
/*    */     //   125: aload #9
/*    */     //   127: dup
/*    */     //   128: dup
/*    */     //   129: iload #10
/*    */     //   131: putfield Lc0 : Z
/*    */     //   134: iconst_1
/*    */     //   135: putfield dj : Z
/*    */     //   138: invokevirtual MJ0 : ()V
/*    */     //   141: aload #9
/*    */     //   143: iconst_1
/*    */     //   144: istore #10
/*    */     //   146: getfield cd : Z
/*    */     //   149: iload #10
/*    */     //   151: if_icmpeq -> 170
/*    */     //   154: aload #9
/*    */     //   156: dup
/*    */     //   157: dup
/*    */     //   158: iload #10
/*    */     //   160: putfield cd : Z
/*    */     //   163: iconst_1
/*    */     //   164: putfield dj : Z
/*    */     //   167: invokevirtual MJ0 : ()V
/*    */     //   170: aload #9
/*    */     //   172: iconst_1
/*    */     //   173: istore #10
/*    */     //   175: getfield k0 : Z
/*    */     //   178: iload #10
/*    */     //   180: if_icmpeq -> 199
/*    */     //   183: aload #9
/*    */     //   185: dup
/*    */     //   186: dup
/*    */     //   187: iload #10
/*    */     //   189: putfield k0 : Z
/*    */     //   192: iconst_1
/*    */     //   193: putfield dj : Z
/*    */     //   196: invokevirtual MJ0 : ()V
/*    */     //   199: aload #9
/*    */     //   201: iconst_1
/*    */     //   202: istore #10
/*    */     //   204: getfield OB : Z
/*    */     //   207: iload #10
/*    */     //   209: if_icmpeq -> 228
/*    */     //   212: aload #9
/*    */     //   214: dup
/*    */     //   215: dup
/*    */     //   216: iload #10
/*    */     //   218: putfield OB : Z
/*    */     //   221: iconst_1
/*    */     //   222: putfield dj : Z
/*    */     //   225: invokevirtual MJ0 : ()V
/*    */     //   228: aload #9
/*    */     //   230: iconst_1
/*    */     //   231: istore #10
/*    */     //   233: getfield wi : Z
/*    */     //   236: iload #10
/*    */     //   238: if_icmpeq -> 257
/*    */     //   241: aload #9
/*    */     //   243: dup
/*    */     //   244: dup
/*    */     //   245: iload #10
/*    */     //   247: putfield wi : Z
/*    */     //   250: iconst_1
/*    */     //   251: putfield dj : Z
/*    */     //   254: invokevirtual MJ0 : ()V
/*    */     //   257: aload #9
/*    */     //   259: iconst_1
/*    */     //   260: istore #10
/*    */     //   262: getfield hh : Z
/*    */     //   265: iload #10
/*    */     //   267: if_icmpeq -> 286
/*    */     //   270: aload #9
/*    */     //   272: dup
/*    */     //   273: dup
/*    */     //   274: iload #10
/*    */     //   276: putfield hh : Z
/*    */     //   279: iconst_1
/*    */     //   280: putfield dj : Z
/*    */     //   283: invokevirtual MJ0 : ()V
/*    */     //   286: aload #6
/*    */     //   288: aload #9
/*    */     //   290: aload #6
/*    */     //   292: dup
/*    */     //   293: aload #8
/*    */     //   295: aload #6
/*    */     //   297: dup
/*    */     //   298: aload #5
/*    */     //   300: aload #9
/*    */     //   302: dup
/*    */     //   303: aload_0
/*    */     //   304: aload #9
/*    */     //   306: new f/Un
/*    */     //   309: dup
/*    */     //   310: astore #6
/*    */     //   312: aload_0
/*    */     //   313: iload #4
/*    */     //   315: aload #6
/*    */     //   317: ldc_w 'Compress Current'
/*    */     //   320: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   323: aload #9
/*    */     //   325: <illegal opcode> run : (Lf/ga0;ILf/LPT6;)Ljava/lang/Runnable;
/*    */     //   330: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   333: new f/Un
/*    */     //   336: dup
/*    */     //   337: astore #8
/*    */     //   339: aload_0
/*    */     //   340: iload #4
/*    */     //   342: aload #8
/*    */     //   344: ldc_w 'Restore Preset'
/*    */     //   347: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   350: aload #9
/*    */     //   352: aload_1
/*    */     //   353: aload_2
/*    */     //   354: aload_3
/*    */     //   355: <illegal opcode> run : (Lf/ga0;ILf/LPT6;Lf/lpt1;Lf/fk0;Lf/ZA0;)Ljava/lang/Runnable;
/*    */     //   360: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   363: new f/Un
/*    */     //   366: dup
/*    */     //   367: astore #10
/*    */     //   369: aload_0
/*    */     //   370: iload #4
/*    */     //   372: aload #10
/*    */     //   374: ldc_w 'Restore Original'
/*    */     //   377: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   380: aload #9
/*    */     //   382: aload_1
/*    */     //   383: aload_2
/*    */     //   384: aload_3
/*    */     //   385: <illegal opcode> run : (Lf/ga0;ILf/LPT6;Lf/lpt1;Lf/fk0;Lf/ZA0;)Ljava/lang/Runnable;
/*    */     //   390: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   393: iload #4
/*    */     //   395: aload_1
/*    */     //   396: aload_2
/*    */     //   397: aload_3
/*    */     //   398: <illegal opcode> run : (Lf/ga0;Lf/LPT6;ILf/lpt1;Lf/fk0;Lf/ZA0;)Ljava/lang/Runnable;
/*    */     //   403: astore_0
/*    */     //   404: getfield mC : [Ljava/lang/Runnable;
/*    */     //   407: aload_0
/*    */     //   408: ldc_w java/lang/Runnable
/*    */     //   411: invokestatic LpT6 : ([Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
/*    */     //   414: checkcast [Ljava/lang/Runnable;
/*    */     //   417: putfield mC : [Ljava/lang/Runnable;
/*    */     //   420: ldc_w 'color-picker'
/*    */     //   423: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   426: ldc_w 5.0
/*    */     //   429: invokevirtual F : (F)Lf/ZP;
/*    */     //   432: pop
/*    */     //   433: getfield RT : Lf/nJ0;
/*    */     //   436: fconst_2
/*    */     //   437: invokevirtual Xj0 : (F)Lf/nJ0;
/*    */     //   440: pop
/*    */     //   441: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   444: getfield Ox : Lf/ZP;
/*    */     //   447: aload #7
/*    */     //   449: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   452: getfield Ox : Lf/ZP;
/*    */     //   455: invokevirtual wP : ()Lf/nJ0;
/*    */     //   458: pop
/*    */     //   459: new f/YA0
/*    */     //   462: dup
/*    */     //   463: dup
/*    */     //   464: invokespecial <init> : ()V
/*    */     //   467: getfield Dv0 : Lf/SA;
/*    */     //   470: aload #8
/*    */     //   472: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   475: getfield Ox : Lf/ZP;
/*    */     //   478: aload #10
/*    */     //   480: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   483: getfield Ox : Lf/ZP;
/*    */     //   486: aload #6
/*    */     //   488: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   491: dup
/*    */     //   492: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   495: pop
/*    */     //   496: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   499: pop
/*    */     //   500: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   503: dup
/*    */     //   504: iconst_2
/*    */     //   505: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   508: putfield ss : Ljava/lang/Integer;
/*    */     //   511: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   514: getfield Ox : Lf/ZP;
/*    */     //   517: invokevirtual wP : ()Lf/nJ0;
/*    */     //   520: pop
/*    */     //   521: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   524: iconst_2
/*    */     //   525: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   528: putfield ss : Ljava/lang/Integer;
/*    */     //   531: getstatic f/D.N2 : Lf/D;
/*    */     //   534: dup
/*    */     //   535: astore_0
/*    */     //   536: getfield ni : Lf/JG0;
/*    */     //   539: dup
/*    */     //   540: astore_1
/*    */     //   541: ifnull -> 554
/*    */     //   544: aload_0
/*    */     //   545: getfield hp : Lf/fQ;
/*    */     //   548: aload_1
/*    */     //   549: iconst_1
/*    */     //   550: invokevirtual Ct : (Ljava/lang/Object;Z)Z
/*    */     //   553: pop
/*    */     //   554: aload_0
/*    */     //   555: dup
/*    */     //   556: aload #5
/*    */     //   558: aload_0
/*    */     //   559: getfield hp : Lf/fQ;
/*    */     //   562: aload #5
/*    */     //   564: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   567: putfield ni : Lf/JG0;
/*    */     //   570: invokevirtual du0 : ()V
/*    */     //   573: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 23
/*    */     //   #2	-> 27
/*    */     //   #3	-> 58
/*    */     //   #4	-> 61
/*    */     //   #5	-> 68
/*    */     //   #6	-> 77
/*    */     //   #7	-> 108
/*    */     //   #8	-> 117
/*    */     //   #9	-> 146
/*    */     //   #10	-> 175
/*    */     //   #11	-> 204
/*    */     //   #12	-> 233
/*    */     //   #13	-> 262
/*    */     //   #14	-> 306
/*    */     //   #15	-> 404
/*    */     //   #16	-> 420
/*    */     //   #17	-> 433
/*    */     //   #18	-> 437
/*    */     //   #19	-> 444
/*    */     //   #20	-> 452
/*    */     //   #21	-> 459
/*    */     //   #22	-> 475
/*    */     //   #23	-> 492
/*    */     //   #24	-> 500
/*    */     //   #25	-> 508
/*    */     //   #26	-> 511
/*    */     //   #27	-> 514
/*    */     //   #28	-> 521
/*    */     //   #29	-> 528
/*    */     //   #30	-> 531
/*    */     //   #31	-> 536
/*    */     //   #32	-> 545
/*    */   }
/*    */   
/*    */   public final void QI0(int paramInt1, int paramInt2, boolean paramBoolean) {
/*    */     int[] arrayOfInt = this.Zn0;
/*    */     if (paramBoolean)
/*    */       paramInt2 = ta(paramInt2); 
/*    */     arrayOfInt[paramInt1] = paramInt2;
/*    */     this();
/*    */     Color color;
/*    */     Color.argb8888ToColor(color = new Color(), this.Zn0[paramInt1]);
/*    */     zH.getClass();
/*    */     float f1 = color.g, f2 = color.b, f3 = color.a;
/*    */     zH.coM6 = Color.rgba8888(color.r, f1, f2, f3);
/*    */     int i = paramInt1 % 8;
/*    */     ZH zH;
/*    */     (zH = this.HC0.getTextureData().Jw()).d40(i, paramInt1 / 8);
/*    */     this.HC0.load(this.HC0.getTextureData());
/*    */   }
/*    */   
/*    */   public final void A10(lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0, boolean paramBoolean) {
/*    */     int[] arrayOfInt = this.Zn0;
/*    */     this.gm0.getClass();
/*    */     this.cP.load(new AB(zH, null, false, false));
/*    */     ZH zH;
/*    */     (zH = Wd.IV(paramfk0, arrayOfInt)).dispose();
/*    */     long l;
/*    */     if (this.xm.gV(l = qo.A80) && paramBoolean)
/*    */       this.xm.Ng0(l); 
/*    */     for (Hc0 hc02 = this.Hg0.r30(); hc02.hasNext(); ) {
/*    */       Texture texture;
/*    */       T0 t0;
/*    */       if ((t0 = (T0)hc02.next()) == null)
/*    */         continue; 
/*    */       int i = paramlpt1.Cx0.Vv0(t0.Xy0);
/*    */       this(zH1);
/*    */       ZH zH1;
/*    */       (zH1 = Wd.IV((fk0)this.gm0.TE.yO(i), this.Zn0)).dispose();
/*    */       O80 o80 = (O80)t0.cOM1(O80.Jg0);
/*    */       if (paramBoolean)
/*    */         ((Texture)o80.cv0.ze).dispose(); 
/*    */       o80.cv0.ze = (zp)texture;
/*    */     } 
/*    */     for (Hc0 hc01 = km.wI0.iJ0.wN.r30(); hc01.hasNext(); ) {
/*    */       Hc0 hc03;
/*    */       Ah ah = (Ah)hc01.next();
/*    */       if (this.V50 >= 1000) {
/*    */         for (hc03 = ah.W7.r30(); hc03.hasNext(); ) {
/*    */           Ew ew1 = lpt11.Cx0;
/*    */           lpt1 lpt11;
/*    */           if ((lpt11 = (lpt1)hc03.next()).jx != this.V50 - 1000 || (fQ)ew1.NUl.pd0(Integer.valueOf(paramZA0.Vk)) == null)
/*    */             continue; 
/*    */           ew1 = lpt11.Cx0;
/*    */           for (Hc0 hc0 = ((fQ)ew1.NUl.pd0(Integer.valueOf(paramZA0.Vk))).r30(); hc0.hasNext(); ) {
/*    */             Texture texture;
/*    */             int i = lpt11.Cx0.Vv0(t0.Xy0);
/*    */             this(zH1);
/*    */             ZH zH1;
/*    */             (zH1 = Wd.IV((fk0)this.gm0.TE.yO(i), this.Zn0)).dispose();
/*    */             T0 t0;
/*    */             O80 o80 = (O80)(t0 = lpt11.else((String)hc0.next())).cOM1(O80.Jg0);
/*    */             if (paramBoolean)
/*    */               ((Texture)o80.cv0.ze).dispose(); 
/*    */             o80.cv0.ze = (zp)texture;
/*    */           } 
/*    */         } 
/*    */         continue;
/*    */       } 
/*    */       Ew ew = ((Ah)hc03).K9.Cx0;
/*    */       if ((fQ)ew.NUl.pd0(Integer.valueOf(paramZA0.Vk)) == null)
/*    */         continue; 
/*    */       ew = ((Ah)hc03).K9.Cx0;
/*    */       for (Hc0 hc04 = ((fQ)ew.NUl.pd0(Integer.valueOf(paramZA0.Vk))).r30(); hc04.hasNext(); ) {
/*    */         Texture texture;
/*    */         String str = (String)hc04.next();
/*    */         T0 t0;
/*    */         if ((t0 = ((Ah)hc03).K9.else(str)) == null)
/*    */           continue; 
/*    */         int i = ((Ah)hc03).K9.Cx0.Vv0(t0.Xy0);
/*    */         this(zH1);
/*    */         ZH zH1;
/*    */         (zH1 = Wd.IV((fk0)this.gm0.TE.yO(i), this.Zn0)).dispose();
/*    */         O80 o80;
/*    */         if ((o80 = (O80)t0.cOM1(O80.Jg0)) == null) {
/*    */           h50.info(B40.df("attr null = ").append(t0.Xy0).toString());
/*    */           continue;
/*    */         } 
/*    */         if (paramBoolean)
/*    */           ((Texture)o80.cv0.ze).dispose(); 
/*    */         o80.cv0.ze = (zp)texture;
/*    */         Ew ew1;
/*    */         if ((ew1 = ((Ah)hc03).K9.Cx0).Ro == null) {
/*    */           fQ fQ1;
/*    */           this();
/*    */           ew1.Ro = fQ1;
/*    */         } 
/*    */         ew1.Ro.Com3(texture);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final Ip c1(byte paramByte, f20 paramf20, ZA0 paramZA0, boolean[] paramArrayOfboolean, fQ paramfQ1, fQ paramfQ2, ge0 paramge01, ge0 paramge02) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: aload_3
/*    */     //   2: new f/fQ
/*    */     //   5: dup
/*    */     //   6: astore #9
/*    */     //   8: invokespecial <init> : ()V
/*    */     //   11: aload_2
/*    */     //   12: invokevirtual nH0 : (Lf/f20;)[I
/*    */     //   15: astore #10
/*    */     //   17: iconst_3
/*    */     //   18: if_icmpne -> 28
/*    */     //   21: bipush #74
/*    */     //   23: istore #11
/*    */     //   25: goto -> 32
/*    */     //   28: bipush #106
/*    */     //   30: istore #11
/*    */     //   32: aload_0
/*    */     //   33: getfield V50 : I
/*    */     //   36: sipush #1000
/*    */     //   39: if_icmplt -> 68
/*    */     //   42: iload_1
/*    */     //   43: iconst_3
/*    */     //   44: if_icmpeq -> 63
/*    */     //   47: iload_1
/*    */     //   48: iconst_4
/*    */     //   49: if_icmpeq -> 55
/*    */     //   52: goto -> 68
/*    */     //   55: sipush #339
/*    */     //   58: istore #11
/*    */     //   60: goto -> 68
/*    */     //   63: sipush #589
/*    */     //   66: istore #11
/*    */     //   68: iconst_0
/*    */     //   69: istore #12
/*    */     //   71: iload #12
/*    */     //   73: iload #11
/*    */     //   75: if_icmpge -> 928
/*    */     //   78: aload_0
/*    */     //   79: ldc_w ''
/*    */     //   82: astore #13
/*    */     //   84: getfield V50 : I
/*    */     //   87: sipush #1000
/*    */     //   90: if_icmplt -> 192
/*    */     //   93: iload_1
/*    */     //   94: iload #12
/*    */     //   96: sipush #1000
/*    */     //   99: iadd
/*    */     //   100: istore #13
/*    */     //   102: iconst_3
/*    */     //   103: if_icmpeq -> 139
/*    */     //   106: iload_1
/*    */     //   107: iconst_4
/*    */     //   108: if_icmpeq -> 119
/*    */     //   111: new f/Ip
/*    */     //   114: dup
/*    */     //   115: invokespecial <init> : ()V
/*    */     //   118: areturn
/*    */     //   119: getstatic f/km.mI0 : Lf/P1;
/*    */     //   122: getfield yE : Lf/BE;
/*    */     //   125: iconst_1
/*    */     //   126: invokevirtual sM : (Z)Lf/Jj;
/*    */     //   129: iload #12
/*    */     //   131: invokevirtual vn0 : (I)Lf/Q1;
/*    */     //   134: astore #14
/*    */     //   136: goto -> 155
/*    */     //   139: getstatic f/km.mI0 : Lf/P1;
/*    */     //   142: getfield MT : Lf/gD;
/*    */     //   145: getfield EI0 : Lf/Jj;
/*    */     //   148: iload #12
/*    */     //   150: invokevirtual vn0 : (I)Lf/Q1;
/*    */     //   153: astore #14
/*    */     //   155: aload #14
/*    */     //   157: getfield Qo0 : Lf/Wd;
/*    */     //   160: dup
/*    */     //   161: astore #15
/*    */     //   163: ifnonnull -> 169
/*    */     //   166: goto -> 922
/*    */     //   169: aload #14
/*    */     //   171: getfield Nt : [Lf/hC;
/*    */     //   174: iconst_0
/*    */     //   175: aaload
/*    */     //   176: getfield Ih : Ljava/lang/String;
/*    */     //   179: astore #14
/*    */     //   181: aload #14
/*    */     //   183: iload #13
/*    */     //   185: istore #14
/*    */     //   187: astore #13
/*    */     //   189: goto -> 253
/*    */     //   192: iload_1
/*    */     //   193: iconst_3
/*    */     //   194: if_icmpeq -> 233
/*    */     //   197: iload_1
/*    */     //   198: iconst_4
/*    */     //   199: if_icmpeq -> 210
/*    */     //   202: new f/Ip
/*    */     //   205: dup
/*    */     //   206: invokespecial <init> : ()V
/*    */     //   209: areturn
/*    */     //   210: getstatic f/km.mI0 : Lf/P1;
/*    */     //   213: getfield yE : Lf/BE;
/*    */     //   216: getstatic f/VV.Dv0 : Lf/VV;
/*    */     //   219: iload #12
/*    */     //   221: invokevirtual oB : (Lf/VV;I)Lf/Wd;
/*    */     //   224: astore #15
/*    */     //   226: iload #12
/*    */     //   228: istore #14
/*    */     //   230: goto -> 253
/*    */     //   233: getstatic f/km.mI0 : Lf/P1;
/*    */     //   236: getfield MT : Lf/gD;
/*    */     //   239: getstatic f/VV.Dv0 : Lf/VV;
/*    */     //   242: iload #12
/*    */     //   244: invokevirtual oB : (Lf/VV;I)Lf/Wd;
/*    */     //   247: astore #15
/*    */     //   249: iload #12
/*    */     //   251: istore #14
/*    */     //   253: aload #15
/*    */     //   255: getfield Va0 : Lf/Yy0;
/*    */     //   258: getfield ai0 : Lf/fQ;
/*    */     //   261: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   264: astore #15
/*    */     //   266: aload #15
/*    */     //   268: invokevirtual hasNext : ()Z
/*    */     //   271: ifeq -> 922
/*    */     //   274: aload #15
/*    */     //   276: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   279: checkcast f/ZA0
/*    */     //   282: dup
/*    */     //   283: astore #16
/*    */     //   285: aload_2
/*    */     //   286: invokevirtual nH0 : (Lf/f20;)[I
/*    */     //   289: dup
/*    */     //   290: astore #17
/*    */     //   292: arraylength
/*    */     //   293: aload #10
/*    */     //   295: arraylength
/*    */     //   296: if_icmpeq -> 302
/*    */     //   299: goto -> 266
/*    */     //   302: iconst_1
/*    */     //   303: istore #18
/*    */     //   305: iconst_0
/*    */     //   306: istore #19
/*    */     //   308: iconst_0
/*    */     //   309: istore #20
/*    */     //   311: iconst_0
/*    */     //   312: istore #21
/*    */     //   314: iload #21
/*    */     //   316: aload #10
/*    */     //   318: arraylength
/*    */     //   319: if_icmpge -> 347
/*    */     //   322: aload #10
/*    */     //   324: iload #21
/*    */     //   326: iaload
/*    */     //   327: aload #17
/*    */     //   329: iload #21
/*    */     //   331: iaload
/*    */     //   332: if_icmpeq -> 341
/*    */     //   335: iconst_0
/*    */     //   336: istore #18
/*    */     //   338: goto -> 347
/*    */     //   341: iinc #21, 1
/*    */     //   344: goto -> 314
/*    */     //   347: aload #8
/*    */     //   349: getfield TG0 : Lf/protected;
/*    */     //   352: invokevirtual nm0 : ()Z
/*    */     //   355: ifeq -> 451
/*    */     //   358: iload #18
/*    */     //   360: ifne -> 451
/*    */     //   363: iconst_1
/*    */     //   364: istore #18
/*    */     //   366: iconst_1
/*    */     //   367: istore #19
/*    */     //   369: iconst_0
/*    */     //   370: istore #21
/*    */     //   372: iload #21
/*    */     //   374: aload #10
/*    */     //   376: arraylength
/*    */     //   377: if_icmpge -> 451
/*    */     //   380: aload #4
/*    */     //   382: iload #21
/*    */     //   384: aload #10
/*    */     //   386: iload #21
/*    */     //   388: iaload
/*    */     //   389: istore #22
/*    */     //   391: baload
/*    */     //   392: ifne -> 398
/*    */     //   395: goto -> 445
/*    */     //   398: iconst_0
/*    */     //   399: istore #23
/*    */     //   401: iconst_0
/*    */     //   402: istore #24
/*    */     //   404: iload #24
/*    */     //   406: aload #10
/*    */     //   408: arraylength
/*    */     //   409: if_icmpge -> 431
/*    */     //   412: iload #22
/*    */     //   414: aload #17
/*    */     //   416: iload #24
/*    */     //   418: iaload
/*    */     //   419: if_icmpne -> 425
/*    */     //   422: iconst_1
/*    */     //   423: istore #23
/*    */     //   425: iinc #24, 1
/*    */     //   428: goto -> 404
/*    */     //   431: iload #23
/*    */     //   433: ifne -> 442
/*    */     //   436: iconst_0
/*    */     //   437: istore #18
/*    */     //   439: goto -> 451
/*    */     //   442: iinc #20, 1
/*    */     //   445: iinc #21, 1
/*    */     //   448: goto -> 372
/*    */     //   451: iload #18
/*    */     //   453: ifeq -> 266
/*    */     //   456: iconst_0
/*    */     //   457: istore #17
/*    */     //   459: iconst_0
/*    */     //   460: istore #18
/*    */     //   462: iload #18
/*    */     //   464: aload #5
/*    */     //   466: getfield Z8 : I
/*    */     //   469: if_icmpge -> 689
/*    */     //   472: aload #5
/*    */     //   474: iload #18
/*    */     //   476: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   479: checkcast f/F80
/*    */     //   482: dup
/*    */     //   483: astore #21
/*    */     //   485: getfield da : I
/*    */     //   488: aload #16
/*    */     //   490: getfield Vk : I
/*    */     //   493: if_icmpne -> 683
/*    */     //   496: aload #21
/*    */     //   498: getfield lq : I
/*    */     //   501: iload #14
/*    */     //   503: if_icmpne -> 683
/*    */     //   506: aload_0
/*    */     //   507: iconst_1
/*    */     //   508: istore #17
/*    */     //   510: getfield V50 : I
/*    */     //   513: sipush #1000
/*    */     //   516: if_icmplt -> 535
/*    */     //   519: ldc_w 'building ('
/*    */     //   522: aload #13
/*    */     //   524: ldc_w ') = '
/*    */     //   527: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   530: astore #21
/*    */     //   532: goto -> 540
/*    */     //   535: ldc_w 'tileset = '
/*    */     //   538: astore #21
/*    */     //   540: iload #19
/*    */     //   542: aload #9
/*    */     //   544: iload #18
/*    */     //   546: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   549: checkcast f/dQ
/*    */     //   552: astore #22
/*    */     //   554: new java/lang/StringBuilder
/*    */     //   557: dup
/*    */     //   558: astore #23
/*    */     //   560: aload #9
/*    */     //   562: iload #18
/*    */     //   564: aload #23
/*    */     //   566: invokespecial <init> : ()V
/*    */     //   569: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   572: checkcast f/dQ
/*    */     //   575: getfield wL : Ljava/lang/CharSequence;
/*    */     //   578: invokeinterface toString : ()Ljava/lang/String;
/*    */     //   583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   586: ldc_w '\\n'
/*    */     //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   592: astore #18
/*    */     //   594: ifeq -> 622
/*    */     //   597: ldc_w '[!Partial '
/*    */     //   600: iload #20
/*    */     //   602: ldc_w ' / '
/*    */     //   605: invokestatic DH0 : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   608: aload #10
/*    */     //   610: arraylength
/*    */     //   611: ldc_w ' ] '
/*    */     //   614: invokestatic Gl0 : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
/*    */     //   617: astore #23
/*    */     //   619: goto -> 627
/*    */     //   622: ldc_w ''
/*    */     //   625: astore #23
/*    */     //   627: aload #22
/*    */     //   629: aload #18
/*    */     //   631: aload #23
/*    */     //   633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   636: aload #21
/*    */     //   638: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   641: iload #12
/*    */     //   643: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   646: ldc_w ' name = '
/*    */     //   649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   652: aload #16
/*    */     //   654: getfield Ih : Ljava/lang/String;
/*    */     //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   660: ldc_w ' offset = '
/*    */     //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   666: aload #16
/*    */     //   668: getfield Vk : I
/*    */     //   671: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   674: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   677: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   680: goto -> 689
/*    */     //   683: iinc #18, 1
/*    */     //   686: goto -> 462
/*    */     //   689: iload #17
/*    */     //   691: ifne -> 266
/*    */     //   694: aload #16
/*    */     //   696: aload #5
/*    */     //   698: new f/F80
/*    */     //   701: dup
/*    */     //   702: iload #14
/*    */     //   704: aload #16
/*    */     //   706: getfield Vk : I
/*    */     //   709: invokespecial <init> : (II)V
/*    */     //   712: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   715: new f/ge0
/*    */     //   718: dup
/*    */     //   719: dup
/*    */     //   720: astore #17
/*    */     //   722: invokespecial <init> : ()V
/*    */     //   725: getfield TG0 : Lf/protected;
/*    */     //   728: iconst_1
/*    */     //   729: invokevirtual Fx0 : (Z)V
/*    */     //   732: getfield Ih : Ljava/lang/String;
/*    */     //   735: aload_3
/*    */     //   736: getfield Ih : Ljava/lang/String;
/*    */     //   739: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   742: ifne -> 765
/*    */     //   745: aload #8
/*    */     //   747: getfield TG0 : Lf/protected;
/*    */     //   750: invokevirtual nm0 : ()Z
/*    */     //   753: ifeq -> 765
/*    */     //   756: aload #17
/*    */     //   758: getfield TG0 : Lf/protected;
/*    */     //   761: iconst_0
/*    */     //   762: invokevirtual Fx0 : (Z)V
/*    */     //   765: aload_0
/*    */     //   766: getfield V50 : I
/*    */     //   769: sipush #1000
/*    */     //   772: if_icmplt -> 791
/*    */     //   775: ldc_w 'building ('
/*    */     //   778: aload #13
/*    */     //   780: ldc_w ') = '
/*    */     //   783: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   786: astore #18
/*    */     //   788: goto -> 796
/*    */     //   791: ldc_w 'tileset = '
/*    */     //   794: astore #18
/*    */     //   796: iload #19
/*    */     //   798: aload #6
/*    */     //   800: aload #17
/*    */     //   802: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   805: new f/dQ
/*    */     //   808: astore #17
/*    */     //   810: new java/lang/StringBuilder
/*    */     //   813: dup
/*    */     //   814: astore #19
/*    */     //   816: invokespecial <init> : ()V
/*    */     //   819: ifeq -> 847
/*    */     //   822: ldc_w '[!Partial '
/*    */     //   825: iload #20
/*    */     //   827: ldc_w ' / '
/*    */     //   830: invokestatic DH0 : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   833: aload #10
/*    */     //   835: arraylength
/*    */     //   836: ldc_w ' ] '
/*    */     //   839: invokestatic Gl0 : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
/*    */     //   842: astore #20
/*    */     //   844: goto -> 852
/*    */     //   847: ldc_w ''
/*    */     //   850: astore #20
/*    */     //   852: aload #9
/*    */     //   854: aload #17
/*    */     //   856: dup
/*    */     //   857: dup
/*    */     //   858: aload #19
/*    */     //   860: aload #20
/*    */     //   862: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   865: aload #18
/*    */     //   867: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   870: iload #12
/*    */     //   872: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   875: ldc_w ' name = '
/*    */     //   878: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   881: aload #16
/*    */     //   883: getfield Ih : Ljava/lang/String;
/*    */     //   886: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   889: ldc_w ' offset = '
/*    */     //   892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   895: aload #16
/*    */     //   897: getfield Vk : I
/*    */     //   900: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   903: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   906: astore #16
/*    */     //   908: invokespecial <init> : ()V
/*    */     //   911: aload #16
/*    */     //   913: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   916: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   919: goto -> 266
/*    */     //   922: iinc #12, 1
/*    */     //   925: goto -> 71
/*    */     //   928: new f/Ip
/*    */     //   931: dup
/*    */     //   932: astore_0
/*    */     //   933: invokespecial <init> : ()V
/*    */     //   936: new f/g0
/*    */     //   939: dup
/*    */     //   940: astore_1
/*    */     //   941: aload_0
/*    */     //   942: invokespecial <init> : (Lf/Ip;)V
/*    */     //   945: new f/cr0
/*    */     //   948: dup
/*    */     //   949: astore_2
/*    */     //   950: aload_0
/*    */     //   951: invokespecial <init> : (Lf/Ip;)V
/*    */     //   954: iconst_0
/*    */     //   955: istore_3
/*    */     //   956: iload_3
/*    */     //   957: aload #9
/*    */     //   959: getfield Z8 : I
/*    */     //   962: if_icmpge -> 1057
/*    */     //   965: aload_2
/*    */     //   966: aload_0
/*    */     //   967: aload_1
/*    */     //   968: aload_0
/*    */     //   969: iconst_2
/*    */     //   970: anewarray f/JG0
/*    */     //   973: dup
/*    */     //   974: dup
/*    */     //   975: astore #4
/*    */     //   977: aload #9
/*    */     //   979: iload_3
/*    */     //   980: aload #4
/*    */     //   982: aload #6
/*    */     //   984: iload_3
/*    */     //   985: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   988: checkcast f/JG0
/*    */     //   991: iconst_0
/*    */     //   992: swap
/*    */     //   993: aastore
/*    */     //   994: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   997: checkcast f/JG0
/*    */     //   1000: iconst_1
/*    */     //   1001: swap
/*    */     //   1002: aastore
/*    */     //   1003: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   1006: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   1009: pop
/*    */     //   1010: iconst_2
/*    */     //   1011: anewarray f/JG0
/*    */     //   1014: dup
/*    */     //   1015: dup
/*    */     //   1016: astore #4
/*    */     //   1018: aload #9
/*    */     //   1020: iload_3
/*    */     //   1021: aload #4
/*    */     //   1023: aload #6
/*    */     //   1025: iload_3
/*    */     //   1026: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1029: checkcast f/JG0
/*    */     //   1032: iconst_0
/*    */     //   1033: swap
/*    */     //   1034: aastore
/*    */     //   1035: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   1038: checkcast f/JG0
/*    */     //   1041: iconst_1
/*    */     //   1042: swap
/*    */     //   1043: aastore
/*    */     //   1044: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   1047: invokevirtual ee0 : (Lf/U90;)Lf/U90;
/*    */     //   1050: pop
/*    */     //   1051: iinc #3, 1
/*    */     //   1054: goto -> 956
/*    */     //   1057: aload_0
/*    */     //   1058: aload_2
/*    */     //   1059: aload_0
/*    */     //   1060: aload_1
/*    */     //   1061: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   1064: invokevirtual WN : (Lf/U90;)V
/*    */     //   1067: new f/rS
/*    */     //   1070: dup
/*    */     //   1071: astore_1
/*    */     //   1072: aload_0
/*    */     //   1073: invokespecial <init> : (Lf/JG0;)V
/*    */     //   1076: new f/Ip
/*    */     //   1079: dup
/*    */     //   1080: dup2
/*    */     //   1081: dup2
/*    */     //   1082: invokespecial <init> : ()V
/*    */     //   1085: new f/vy
/*    */     //   1088: dup
/*    */     //   1089: astore_0
/*    */     //   1090: iconst_2
/*    */     //   1091: anewarray f/JG0
/*    */     //   1094: dup
/*    */     //   1095: dup
/*    */     //   1096: iconst_0
/*    */     //   1097: aload #7
/*    */     //   1099: aastore
/*    */     //   1100: ldc_w 'All Seasons'
/*    */     //   1103: invokestatic A : (Ljava/lang/String;)Lf/dQ;
/*    */     //   1106: iconst_1
/*    */     //   1107: swap
/*    */     //   1108: aastore
/*    */     //   1109: invokespecial <init> : ([Lf/JG0;)V
/*    */     //   1112: iconst_2
/*    */     //   1113: anewarray f/JG0
/*    */     //   1116: dup
/*    */     //   1117: dup
/*    */     //   1118: iconst_0
/*    */     //   1119: aload_1
/*    */     //   1120: aastore
/*    */     //   1121: iconst_1
/*    */     //   1122: aload_0
/*    */     //   1123: aastore
/*    */     //   1124: invokevirtual vo0 : ([Lf/JG0;)Lf/U90;
/*    */     //   1127: invokevirtual WN : (Lf/U90;)V
/*    */     //   1130: iconst_2
/*    */     //   1131: anewarray f/JG0
/*    */     //   1134: dup
/*    */     //   1135: dup
/*    */     //   1136: iconst_0
/*    */     //   1137: aload_1
/*    */     //   1138: aastore
/*    */     //   1139: iconst_1
/*    */     //   1140: aload_0
/*    */     //   1141: aastore
/*    */     //   1142: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
/*    */     //   1145: invokevirtual rK0 : (Lf/U90;)V
/*    */     //   1148: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 12
/*    */     //   #2	-> 33
/*    */     //   #3	-> 145
/*    */     //   #4	-> 150
/*    */     //   #5	-> 258
/*    */     //   #6	-> 261
/*    */     //   #7	-> 268
/*    */     //   #8	-> 286
/*    */     //   #9	-> 292
/*    */     //   #10	-> 349
/*    */     //   #11	-> 352
/*    */     //   #12	-> 376
/*    */     //   #13	-> 519
/*    */     //   #14	-> 535
/*    */     //   #15	-> 575
/*    */     //   #16	-> 578
/*    */     //   #17	-> 583
/*    */     //   #18	-> 597
/*    */     //   #19	-> 610
/*    */     //   #20	-> 611
/*    */     //   #21	-> 622
/*    */     //   #22	-> 725
/*    */     //   #23	-> 729
/*    */     //   #24	-> 732
/*    */     //   #25	-> 747
/*    */     //   #26	-> 750
/*    */     //   #27	-> 758
/*    */     //   #28	-> 762
/*    */     //   #29	-> 766
/*    */     //   #30	-> 775
/*    */     //   #31	-> 791
/*    */     //   #32	-> 822
/*    */     //   #33	-> 835
/*    */     //   #34	-> 836
/*    */     //   #35	-> 847
/*    */     //   #36	-> 908
/*    */     //   #37	-> 916
/*    */     //   #38	-> 936
/*    */     //   #39	-> 945
/*    */     //   #40	-> 959
/*    */     //   #41	-> 1100
/*    */     //   #42	-> 1108
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     Hc0 hc0 = this.Fp.r30();
/*    */     while (hc0.hasNext())
/*    */       ((Texture)hc0.next()).dispose(); 
/*    */     Texture texture;
/*    */     if ((texture = this.wn) != null)
/*    */       texture.dispose(); 
/*    */     if ((texture = this.HC0) != null) {
/*    */       texture.dispose();
/*    */       this.HC0 = null;
/*    */     } 
/*    */     if ((texture = this.pp) != null) {
/*    */       texture.dispose();
/*    */       this.pp = null;
/*    */     } 
/*    */     if ((texture = this.cP) != null) {
/*    */       texture.dispose();
/*    */       this.cP = null;
/*    */     } 
/*    */     ZH zH;
/*    */     if ((zH = this.Bl) != null) {
/*    */       zH.dispose();
/*    */       this.Bl = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void vZ(byte paramByte, T0 paramT0, lpt1 paramlpt1, int paramInt1, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: aload_0
/*    */     //   2: dup
/*    */     //   3: dup
/*    */     //   4: dup2
/*    */     //   5: dup2
/*    */     //   6: dup2
/*    */     //   7: iload #4
/*    */     //   9: aload_0
/*    */     //   10: iload_1
/*    */     //   11: aload_0
/*    */     //   12: aload_2
/*    */     //   13: aload_0
/*    */     //   14: iload #6
/*    */     //   16: aload_0
/*    */     //   17: iload #5
/*    */     //   19: aload_0
/*    */     //   20: iload #4
/*    */     //   22: aload_0
/*    */     //   23: aload_3
/*    */     //   24: getfield Cx0 : Lf/Ew;
/*    */     //   27: getfield Ef : Lf/Wd;
/*    */     //   30: putfield gm0 : Lf/Wd;
/*    */     //   33: putfield V50 : I
/*    */     //   36: putfield ja0 : I
/*    */     //   39: putfield Kx0 : I
/*    */     //   42: putfield xm : Lf/T0;
/*    */     //   45: putfield tE0 : B
/*    */     //   48: i2b
/*    */     //   49: istore #7
/*    */     //   51: invokevirtual dispose : ()V
/*    */     //   54: getfield gm0 : Lf/Wd;
/*    */     //   57: getfield TE : Lf/Yy0;
/*    */     //   60: iload #5
/*    */     //   62: invokevirtual yO : (I)Lf/vO;
/*    */     //   65: checkcast f/fk0
/*    */     //   68: astore #8
/*    */     //   70: getfield gm0 : Lf/Wd;
/*    */     //   73: getfield TE : Lf/Yy0;
/*    */     //   76: iload #5
/*    */     //   78: invokevirtual yO : (I)Lf/vO;
/*    */     //   81: checkcast f/fk0
/*    */     //   84: getfield b70 : Lf/f20;
/*    */     //   87: dup
/*    */     //   88: astore #9
/*    */     //   90: getfield D2 : I
/*    */     //   93: dup
/*    */     //   94: iconst_2
/*    */     //   95: idiv
/*    */     //   96: istore #10
/*    */     //   98: i2d
/*    */     //   99: ldc2_w 2.0
/*    */     //   102: ddiv
/*    */     //   103: ldc2_w 8.0
/*    */     //   106: ddiv
/*    */     //   107: invokestatic ceil : (D)D
/*    */     //   110: d2i
/*    */     //   111: istore #11
/*    */     //   113: new f/ZH
/*    */     //   116: dup
/*    */     //   117: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   120: astore #12
/*    */     //   122: bipush #8
/*    */     //   124: iload #11
/*    */     //   126: aload #12
/*    */     //   128: invokespecial <init> : (IILf/Uc;)V
/*    */     //   131: putfield Bl : Lf/ZH;
/*    */     //   134: new f/ZH
/*    */     //   137: dup
/*    */     //   138: astore #13
/*    */     //   140: bipush #8
/*    */     //   142: iload #11
/*    */     //   144: aload #12
/*    */     //   146: invokespecial <init> : (IILf/Uc;)V
/*    */     //   149: getfield gm0 : Lf/Wd;
/*    */     //   152: getfield Va0 : Lf/Yy0;
/*    */     //   155: iload #6
/*    */     //   157: invokevirtual yO : (I)Lf/vO;
/*    */     //   160: checkcast f/ZA0
/*    */     //   163: dup
/*    */     //   164: astore #11
/*    */     //   166: aload #9
/*    */     //   168: invokevirtual nH0 : (Lf/f20;)[I
/*    */     //   171: putfield fa : [I
/*    */     //   174: getfield gm0 : Lf/Wd;
/*    */     //   177: getfield Va0 : Lf/Yy0;
/*    */     //   180: iload #6
/*    */     //   182: invokevirtual yO : (I)Lf/vO;
/*    */     //   185: checkcast f/ZA0
/*    */     //   188: getfield Vk : I
/*    */     //   191: dup
/*    */     //   192: istore #12
/*    */     //   194: putfield YY : I
/*    */     //   197: iconst_0
/*    */     //   198: istore #14
/*    */     //   200: getfield SL0 : Lf/W1;
/*    */     //   203: getfield Wa0 : Lf/A60;
/*    */     //   206: getfield go : I
/*    */     //   209: iload #4
/*    */     //   211: iload #12
/*    */     //   213: invokestatic jF : (BIII)Z
/*    */     //   216: ifeq -> 264
/*    */     //   219: aload_0
/*    */     //   220: iload_1
/*    */     //   221: aload_0
/*    */     //   222: dup
/*    */     //   223: dup
/*    */     //   224: getfield gm0 : Lf/Wd;
/*    */     //   227: astore #12
/*    */     //   229: getfield SL0 : Lf/W1;
/*    */     //   232: getfield Wa0 : Lf/A60;
/*    */     //   235: getfield go : I
/*    */     //   238: istore #15
/*    */     //   240: getfield YY : I
/*    */     //   243: istore #16
/*    */     //   245: aload #12
/*    */     //   247: iload #15
/*    */     //   249: iload #4
/*    */     //   251: iload #5
/*    */     //   253: iload #16
/*    */     //   255: invokestatic Ks0 : (BLf/Wd;IIII)[I
/*    */     //   258: putfield Zn0 : [I
/*    */     //   261: goto -> 372
/*    */     //   264: iload #4
/*    */     //   266: sipush #1000
/*    */     //   269: if_icmplt -> 359
/*    */     //   272: iload_1
/*    */     //   273: aload_0
/*    */     //   274: iload #7
/*    */     //   276: aload_0
/*    */     //   277: getfield SL0 : Lf/W1;
/*    */     //   280: getfield Wa0 : Lf/A60;
/*    */     //   283: getfield go : I
/*    */     //   286: istore #12
/*    */     //   288: sipush #255
/*    */     //   291: iand
/*    */     //   292: istore #15
/*    */     //   294: getfield YY : I
/*    */     //   297: istore #16
/*    */     //   299: iload #12
/*    */     //   301: iload #15
/*    */     //   303: iload #16
/*    */     //   305: invokestatic jF : (BIII)Z
/*    */     //   308: ifeq -> 359
/*    */     //   311: aload_0
/*    */     //   312: iload_1
/*    */     //   313: aload_0
/*    */     //   314: dup
/*    */     //   315: dup
/*    */     //   316: iconst_1
/*    */     //   317: istore #14
/*    */     //   319: getfield gm0 : Lf/Wd;
/*    */     //   322: astore #12
/*    */     //   324: getfield SL0 : Lf/W1;
/*    */     //   327: getfield Wa0 : Lf/A60;
/*    */     //   330: getfield go : I
/*    */     //   333: istore #16
/*    */     //   335: getfield YY : I
/*    */     //   338: istore #17
/*    */     //   340: aload #12
/*    */     //   342: iload #16
/*    */     //   344: iload #15
/*    */     //   346: iload #5
/*    */     //   348: iload #17
/*    */     //   350: invokestatic Ks0 : (BLf/Wd;IIII)[I
/*    */     //   353: putfield Zn0 : [I
/*    */     //   356: goto -> 372
/*    */     //   359: aload_0
/*    */     //   360: dup
/*    */     //   361: getfield fa : [I
/*    */     //   364: dup
/*    */     //   365: arraylength
/*    */     //   366: invokestatic copyOf : ([II)[I
/*    */     //   369: putfield Zn0 : [I
/*    */     //   372: iload #10
/*    */     //   374: aload_0
/*    */     //   375: getfield Zn0 : [I
/*    */     //   378: arraylength
/*    */     //   379: if_icmpeq -> 400
/*    */     //   382: aload_0
/*    */     //   383: getstatic f/ga0.h50 : Lf/ik;
/*    */     //   386: ldc_w 'Palette size != actual size'
/*    */     //   389: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   394: getfield Zn0 : [I
/*    */     //   397: arraylength
/*    */     //   398: istore #10
/*    */     //   400: aload #11
/*    */     //   402: aload_3
/*    */     //   403: aload_0
/*    */     //   404: getfield Hg0 : Lf/fQ;
/*    */     //   407: invokevirtual clear : ()V
/*    */     //   410: getfield Cx0 : Lf/Ew;
/*    */     //   413: astore #12
/*    */     //   415: getfield Vk : I
/*    */     //   418: aload #12
/*    */     //   420: getfield NUl : Lf/f7;
/*    */     //   423: swap
/*    */     //   424: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   427: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   430: checkcast f/fQ
/*    */     //   433: dup
/*    */     //   434: astore #12
/*    */     //   436: ldc_w ''
/*    */     //   439: astore #15
/*    */     //   441: ifnull -> 508
/*    */     //   444: aload #12
/*    */     //   446: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   449: astore #12
/*    */     //   451: aload #12
/*    */     //   453: invokevirtual hasNext : ()Z
/*    */     //   456: ifeq -> 508
/*    */     //   459: aload #12
/*    */     //   461: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   464: checkcast java/lang/String
/*    */     //   467: dup
/*    */     //   468: astore #16
/*    */     //   470: aload_2
/*    */     //   471: aload #15
/*    */     //   473: aload #16
/*    */     //   475: ldc_w ' '
/*    */     //   478: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   481: astore #15
/*    */     //   483: getfield Xy0 : Ljava/lang/String;
/*    */     //   486: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   489: ifne -> 451
/*    */     //   492: aload_0
/*    */     //   493: getfield Hg0 : Lf/fQ;
/*    */     //   496: aload_3
/*    */     //   497: aload #16
/*    */     //   499: invokevirtual else : (Ljava/lang/String;)Lf/T0;
/*    */     //   502: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   505: goto -> 451
/*    */     //   508: iconst_0
/*    */     //   509: istore #12
/*    */     //   511: iconst_0
/*    */     //   512: istore #16
/*    */     //   514: iconst_0
/*    */     //   515: istore #17
/*    */     //   517: iload #17
/*    */     //   519: aload_0
/*    */     //   520: getfield Zn0 : [I
/*    */     //   523: dup
/*    */     //   524: astore #18
/*    */     //   526: arraylength
/*    */     //   527: if_icmpge -> 724
/*    */     //   530: aload #13
/*    */     //   532: iload #12
/*    */     //   534: aload #13
/*    */     //   536: aload_0
/*    */     //   537: dup
/*    */     //   538: aload #18
/*    */     //   540: iload #17
/*    */     //   542: iaload
/*    */     //   543: dup
/*    */     //   544: istore #18
/*    */     //   546: bipush #8
/*    */     //   548: ishl
/*    */     //   549: iload #18
/*    */     //   551: bipush #24
/*    */     //   553: iushr
/*    */     //   554: ior
/*    */     //   555: istore #18
/*    */     //   557: new com/badlogic/gdx/graphics/Color
/*    */     //   560: dup
/*    */     //   561: astore #19
/*    */     //   563: iload #18
/*    */     //   565: invokespecial <init> : (I)V
/*    */     //   568: getfield fa : [I
/*    */     //   571: iload #17
/*    */     //   573: iaload
/*    */     //   574: dup
/*    */     //   575: istore #18
/*    */     //   577: bipush #8
/*    */     //   579: ishl
/*    */     //   580: iload #18
/*    */     //   582: bipush #24
/*    */     //   584: iushr
/*    */     //   585: ior
/*    */     //   586: istore #18
/*    */     //   588: new com/badlogic/gdx/graphics/Color
/*    */     //   591: dup
/*    */     //   592: astore #20
/*    */     //   594: iload #18
/*    */     //   596: invokespecial <init> : (I)V
/*    */     //   599: getfield Bl : Lf/ZH;
/*    */     //   602: astore #18
/*    */     //   604: aload #20
/*    */     //   606: aload_0
/*    */     //   607: aload #18
/*    */     //   609: aload #19
/*    */     //   611: aload #18
/*    */     //   613: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   616: pop
/*    */     //   617: getfield r : F
/*    */     //   620: aload #19
/*    */     //   622: dup
/*    */     //   623: dup
/*    */     //   624: getfield g : F
/*    */     //   627: fstore #18
/*    */     //   629: getfield b : F
/*    */     //   632: fstore #19
/*    */     //   634: getfield a : F
/*    */     //   637: fstore #21
/*    */     //   639: fload #18
/*    */     //   641: fload #19
/*    */     //   643: fload #21
/*    */     //   645: invokestatic rgba8888 : (FFFF)I
/*    */     //   648: putfield coM6 : I
/*    */     //   651: getfield Bl : Lf/ZH;
/*    */     //   654: iload #12
/*    */     //   656: iload #16
/*    */     //   658: invokevirtual d40 : (II)V
/*    */     //   661: getfield r : F
/*    */     //   664: aload #20
/*    */     //   666: dup
/*    */     //   667: dup
/*    */     //   668: getfield g : F
/*    */     //   671: fstore #18
/*    */     //   673: getfield b : F
/*    */     //   676: fstore #19
/*    */     //   678: getfield a : F
/*    */     //   681: fstore #20
/*    */     //   683: fload #18
/*    */     //   685: fload #19
/*    */     //   687: fload #20
/*    */     //   689: invokestatic rgba8888 : (FFFF)I
/*    */     //   692: putfield coM6 : I
/*    */     //   695: iload #16
/*    */     //   697: invokevirtual d40 : (II)V
/*    */     //   700: iload #12
/*    */     //   702: iconst_1
/*    */     //   703: iadd
/*    */     //   704: dup
/*    */     //   705: istore #12
/*    */     //   707: bipush #8
/*    */     //   709: if_icmplt -> 718
/*    */     //   712: iconst_0
/*    */     //   713: istore #12
/*    */     //   715: iinc #16, 1
/*    */     //   718: iinc #17, 1
/*    */     //   721: goto -> 517
/*    */     //   724: aload_0
/*    */     //   725: aload #13
/*    */     //   727: aload_0
/*    */     //   728: dup
/*    */     //   729: new f/ZH
/*    */     //   732: dup
/*    */     //   733: astore #17
/*    */     //   735: aload_0
/*    */     //   736: aload #17
/*    */     //   738: dup
/*    */     //   739: dup
/*    */     //   740: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   743: astore #18
/*    */     //   745: iconst_1
/*    */     //   746: iconst_1
/*    */     //   747: aload #18
/*    */     //   749: invokespecial <init> : (IILf/Uc;)V
/*    */     //   752: fconst_1
/*    */     //   753: fconst_1
/*    */     //   754: fconst_1
/*    */     //   755: fconst_1
/*    */     //   756: invokestatic rgba8888 : (FFFF)I
/*    */     //   759: putfield coM6 : I
/*    */     //   762: iconst_0
/*    */     //   763: iconst_0
/*    */     //   764: invokevirtual d40 : (II)V
/*    */     //   767: new com/badlogic/gdx/graphics/Texture
/*    */     //   770: dup
/*    */     //   771: aload #17
/*    */     //   773: invokespecial <init> : (Lf/ZH;)V
/*    */     //   776: putfield wn : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   779: invokevirtual dispose : ()V
/*    */     //   782: new com/badlogic/gdx/graphics/Texture
/*    */     //   785: dup
/*    */     //   786: new f/AB
/*    */     //   789: dup
/*    */     //   790: aload_0
/*    */     //   791: getfield Bl : Lf/ZH;
/*    */     //   794: aconst_null
/*    */     //   795: iconst_0
/*    */     //   796: iconst_0
/*    */     //   797: invokespecial <init> : (Lf/ZH;Lf/Uc;ZZ)V
/*    */     //   800: invokespecial <init> : (Lf/Bu0;)V
/*    */     //   803: putfield HC0 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   806: new com/badlogic/gdx/graphics/Texture
/*    */     //   809: dup
/*    */     //   810: new f/AB
/*    */     //   813: dup
/*    */     //   814: aload #13
/*    */     //   816: aconst_null
/*    */     //   817: iconst_0
/*    */     //   818: iconst_0
/*    */     //   819: invokespecial <init> : (Lf/ZH;Lf/Uc;ZZ)V
/*    */     //   822: invokespecial <init> : (Lf/Bu0;)V
/*    */     //   825: putfield pp : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   828: invokevirtual dispose : ()V
/*    */     //   831: getfield cl0 : Lf/YA0;
/*    */     //   834: dup
/*    */     //   835: astore #13
/*    */     //   837: ifnull -> 849
/*    */     //   840: aload_0
/*    */     //   841: aload #13
/*    */     //   843: invokevirtual gx : ()V
/*    */     //   846: invokevirtual gx : ()V
/*    */     //   849: aload #8
/*    */     //   851: dup
/*    */     //   852: aload_0
/*    */     //   853: new f/YA0
/*    */     //   856: dup
/*    */     //   857: dup2
/*    */     //   858: aload_0
/*    */     //   859: swap
/*    */     //   860: dup
/*    */     //   861: invokespecial <init> : ()V
/*    */     //   864: putfield cl0 : Lf/YA0;
/*    */     //   867: iconst_0
/*    */     //   868: putfield Ho0 : Z
/*    */     //   871: iconst_0
/*    */     //   872: putfield TG0 : Z
/*    */     //   875: getfield Dv0 : Lf/SA;
/*    */     //   878: dup
/*    */     //   879: astore #13
/*    */     //   881: aload_0
/*    */     //   882: getfield SL0 : Lf/W1;
/*    */     //   885: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   888: ldc_w 300.0
/*    */     //   891: invokevirtual Ig0 : (F)Lf/nJ0;
/*    */     //   894: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   897: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   900: dup
/*    */     //   901: dup2
/*    */     //   902: dup2
/*    */     //   903: new f/Ln
/*    */     //   906: dup
/*    */     //   907: fconst_0
/*    */     //   908: invokespecial <init> : (F)V
/*    */     //   911: putfield Et0 : Lf/Ir;
/*    */     //   914: new f/Ln
/*    */     //   917: dup
/*    */     //   918: fconst_0
/*    */     //   919: invokespecial <init> : (F)V
/*    */     //   922: putfield YX : Lf/Ir;
/*    */     //   925: new f/Ln
/*    */     //   928: dup
/*    */     //   929: ldc_w 5.0
/*    */     //   932: invokespecial <init> : (F)V
/*    */     //   935: putfield U30 : Lf/Ir;
/*    */     //   938: new f/Ln
/*    */     //   941: dup
/*    */     //   942: ldc 15.0
/*    */     //   944: invokespecial <init> : (F)V
/*    */     //   947: putfield Qj0 : Lf/Ir;
/*    */     //   950: iconst_2
/*    */     //   951: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   954: putfield ss : Ljava/lang/Integer;
/*    */     //   957: getfield Ox : Lf/ZP;
/*    */     //   960: invokevirtual wP : ()Lf/nJ0;
/*    */     //   963: pop
/*    */     //   964: getfield gm0 : Lf/Wd;
/*    */     //   967: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   970: pop
/*    */     //   971: getfield b70 : Lf/f20;
/*    */     //   974: getfield D2 : I
/*    */     //   977: iconst_2
/*    */     //   978: idiv
/*    */     //   979: dup
/*    */     //   980: istore #17
/*    */     //   982: newarray boolean
/*    */     //   984: astore #18
/*    */     //   986: invokevirtual gv : ()[B
/*    */     //   989: astore #19
/*    */     //   991: iconst_0
/*    */     //   992: istore #20
/*    */     //   994: iload #20
/*    */     //   996: iload #17
/*    */     //   998: if_icmpge -> 1278
/*    */     //   1001: aload #8
/*    */     //   1003: getfield b70 : Lf/f20;
/*    */     //   1006: invokevirtual ordinal : ()I
/*    */     //   1009: tableswitch default -> 1048, 0 -> 1213, 1 -> 1135, 2 -> 1135, 3 -> 1135, 4 -> 1048, 5 -> 1076
/*    */     //   1048: getstatic f/Wd.ua : Lf/ik;
/*    */     //   1051: ldc_w 'Unsupported format: '
/*    */     //   1054: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1057: aload #8
/*    */     //   1059: getfield b70 : Lf/f20;
/*    */     //   1062: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   1065: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1068: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   1073: goto -> 1272
/*    */     //   1076: iconst_0
/*    */     //   1077: istore #21
/*    */     //   1079: iload #21
/*    */     //   1081: aload #8
/*    */     //   1083: getfield fi0 : S
/*    */     //   1086: if_icmpge -> 1272
/*    */     //   1089: iconst_0
/*    */     //   1090: istore #22
/*    */     //   1092: iload #22
/*    */     //   1094: aload #8
/*    */     //   1096: getfield public : S
/*    */     //   1099: dup
/*    */     //   1100: istore #23
/*    */     //   1102: if_icmpge -> 1129
/*    */     //   1105: aload #18
/*    */     //   1107: aload #19
/*    */     //   1109: iload #21
/*    */     //   1111: iload #23
/*    */     //   1113: imul
/*    */     //   1114: iload #22
/*    */     //   1116: iadd
/*    */     //   1117: baload
/*    */     //   1118: bipush #7
/*    */     //   1120: iand
/*    */     //   1121: iconst_1
/*    */     //   1122: bastore
/*    */     //   1123: iinc #22, 1
/*    */     //   1126: goto -> 1092
/*    */     //   1129: iinc #21, 1
/*    */     //   1132: goto -> 1079
/*    */     //   1135: iconst_0
/*    */     //   1136: istore #21
/*    */     //   1138: iload #21
/*    */     //   1140: aload #8
/*    */     //   1142: getfield fi0 : S
/*    */     //   1145: if_icmpge -> 1272
/*    */     //   1148: iconst_0
/*    */     //   1149: istore #22
/*    */     //   1151: iload #22
/*    */     //   1153: aload #8
/*    */     //   1155: getfield public : S
/*    */     //   1158: dup
/*    */     //   1159: istore #23
/*    */     //   1161: if_icmpge -> 1207
/*    */     //   1164: aload #19
/*    */     //   1166: iload #21
/*    */     //   1168: iload #23
/*    */     //   1170: imul
/*    */     //   1171: iload #22
/*    */     //   1173: iadd
/*    */     //   1174: baload
/*    */     //   1175: sipush #255
/*    */     //   1178: iand
/*    */     //   1179: dup
/*    */     //   1180: istore #23
/*    */     //   1182: iflt -> 1201
/*    */     //   1185: iload #23
/*    */     //   1187: iload #17
/*    */     //   1189: if_icmplt -> 1195
/*    */     //   1192: goto -> 1201
/*    */     //   1195: aload #18
/*    */     //   1197: iload #23
/*    */     //   1199: iconst_1
/*    */     //   1200: bastore
/*    */     //   1201: iinc #22, 1
/*    */     //   1204: goto -> 1151
/*    */     //   1207: iinc #21, 1
/*    */     //   1210: goto -> 1138
/*    */     //   1213: iconst_0
/*    */     //   1214: istore #21
/*    */     //   1216: iload #21
/*    */     //   1218: aload #8
/*    */     //   1220: getfield fi0 : S
/*    */     //   1223: if_icmpge -> 1272
/*    */     //   1226: iconst_0
/*    */     //   1227: istore #22
/*    */     //   1229: iload #22
/*    */     //   1231: aload #8
/*    */     //   1233: getfield public : S
/*    */     //   1236: dup
/*    */     //   1237: istore #23
/*    */     //   1239: if_icmpge -> 1266
/*    */     //   1242: aload #18
/*    */     //   1244: aload #19
/*    */     //   1246: iload #21
/*    */     //   1248: iload #23
/*    */     //   1250: imul
/*    */     //   1251: iload #22
/*    */     //   1253: iadd
/*    */     //   1254: baload
/*    */     //   1255: bipush #31
/*    */     //   1257: iand
/*    */     //   1258: iconst_1
/*    */     //   1259: bastore
/*    */     //   1260: iinc #22, 1
/*    */     //   1263: goto -> 1229
/*    */     //   1266: iinc #21, 1
/*    */     //   1269: goto -> 1216
/*    */     //   1272: iinc #20, 1
/*    */     //   1275: goto -> 994
/*    */     //   1278: iload #14
/*    */     //   1280: aload_0
/*    */     //   1281: aload #18
/*    */     //   1283: putfield px0 : [Z
/*    */     //   1286: ifeq -> 1357
/*    */     //   1289: aload_0
/*    */     //   1290: ldc_w '!CORRUPTED ID RE-SAVE!'
/*    */     //   1293: invokestatic A : (Ljava/lang/String;)Lf/dQ;
/*    */     //   1296: dup
/*    */     //   1297: astore #17
/*    */     //   1299: new f/I
/*    */     //   1302: dup
/*    */     //   1303: getstatic f/pRn.RED : Lf/pRn;
/*    */     //   1306: astore #18
/*    */     //   1308: new f/Ja0
/*    */     //   1311: dup
/*    */     //   1312: aload #17
/*    */     //   1314: invokespecial <init> : (Lf/JG0;)V
/*    */     //   1317: aload #18
/*    */     //   1319: invokespecial <init> : (Lf/I7;Lf/pRn;)V
/*    */     //   1322: putfield db0 : Lf/I;
/*    */     //   1325: getfield cl0 : Lf/YA0;
/*    */     //   1328: getfield Dv0 : Lf/SA;
/*    */     //   1331: aload #17
/*    */     //   1333: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1336: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1339: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1342: dup
/*    */     //   1343: iconst_2
/*    */     //   1344: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1347: putfield ss : Ljava/lang/Integer;
/*    */     //   1350: getfield Ox : Lf/ZP;
/*    */     //   1353: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1356: pop
/*    */     //   1357: aload_0
/*    */     //   1358: aload #13
/*    */     //   1360: aload_0
/*    */     //   1361: dup
/*    */     //   1362: aload #13
/*    */     //   1364: dup
/*    */     //   1365: new f/dQ
/*    */     //   1368: dup
/*    */     //   1369: astore #17
/*    */     //   1371: invokespecial <init> : ()V
/*    */     //   1374: new f/ge0
/*    */     //   1377: dup
/*    */     //   1378: astore #18
/*    */     //   1380: aload_0
/*    */     //   1381: aload #18
/*    */     //   1383: aload #17
/*    */     //   1385: aload #18
/*    */     //   1387: dup
/*    */     //   1388: invokespecial <init> : ()V
/*    */     //   1391: getstatic f/ga0.Ru0 : Z
/*    */     //   1394: istore #19
/*    */     //   1396: getfield TG0 : Lf/protected;
/*    */     //   1399: iload #19
/*    */     //   1401: invokevirtual Fx0 : (Z)V
/*    */     //   1404: aload #15
/*    */     //   1406: <illegal opcode> run : (Lf/ga0;Lf/ge0;Lf/dQ;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   1411: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1414: ldc_w 'Show Extra Info'
/*    */     //   1417: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   1420: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1423: getfield Ox : Lf/ZP;
/*    */     //   1426: aload #18
/*    */     //   1428: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1431: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1434: getfield Ox : Lf/ZP;
/*    */     //   1437: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1440: pop
/*    */     //   1441: new f/ge0
/*    */     //   1444: dup
/*    */     //   1445: astore #18
/*    */     //   1447: aload_0
/*    */     //   1448: iload_1
/*    */     //   1449: aload_2
/*    */     //   1450: aload #18
/*    */     //   1452: aload_0
/*    */     //   1453: aload #18
/*    */     //   1455: invokespecial <init> : ()V
/*    */     //   1458: getfield er : Z
/*    */     //   1461: istore #19
/*    */     //   1463: getfield TG0 : Lf/protected;
/*    */     //   1466: iload #19
/*    */     //   1468: invokevirtual Fx0 : (Z)V
/*    */     //   1471: aload_3
/*    */     //   1472: iload #4
/*    */     //   1474: iload #5
/*    */     //   1476: iload #6
/*    */     //   1478: <illegal opcode> run : (Lf/ga0;BLf/T0;Lf/lpt1;III)Ljava/lang/Runnable;
/*    */     //   1483: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1486: new f/dQ
/*    */     //   1489: dup
/*    */     //   1490: dup
/*    */     //   1491: invokespecial <init> : ()V
/*    */     //   1494: ldc_w 'Hide unused palettes: '
/*    */     //   1497: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   1500: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1503: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1506: getfield Ox : Lf/ZP;
/*    */     //   1509: aload #18
/*    */     //   1511: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1514: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1517: getfield Ox : Lf/ZP;
/*    */     //   1520: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1523: pop
/*    */     //   1524: getfield YY : I
/*    */     //   1527: istore #18
/*    */     //   1529: aload #17
/*    */     //   1531: aload #15
/*    */     //   1533: iload #18
/*    */     //   1535: invokevirtual UC0 : (Lf/dQ;Ljava/lang/String;I)Lf/YA0;
/*    */     //   1538: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1541: dup
/*    */     //   1542: dup
/*    */     //   1543: aload_0
/*    */     //   1544: swap
/*    */     //   1545: putfield Ds : Lf/nJ0;
/*    */     //   1548: iconst_2
/*    */     //   1549: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1552: putfield ss : Ljava/lang/Integer;
/*    */     //   1555: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1558: getfield Ox : Lf/ZP;
/*    */     //   1561: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1564: pop
/*    */     //   1565: getfield cl0 : Lf/YA0;
/*    */     //   1568: ldc_w 'Original palette: '
/*    */     //   1571: invokestatic A : (Ljava/lang/String;)Lf/dQ;
/*    */     //   1574: astore #15
/*    */     //   1576: getfield Dv0 : Lf/SA;
/*    */     //   1579: aload #15
/*    */     //   1581: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1584: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1587: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1590: dup
/*    */     //   1591: iconst_2
/*    */     //   1592: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1595: putfield ss : Ljava/lang/Integer;
/*    */     //   1598: getfield Ox : Lf/ZP;
/*    */     //   1601: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1604: pop
/*    */     //   1605: iconst_0
/*    */     //   1606: istore #15
/*    */     //   1608: iload #15
/*    */     //   1610: iconst_2
/*    */     //   1611: if_icmpge -> 1930
/*    */     //   1614: iload #15
/*    */     //   1616: iconst_1
/*    */     //   1617: if_icmpne -> 1661
/*    */     //   1620: aload_0
/*    */     //   1621: getfield cl0 : Lf/YA0;
/*    */     //   1624: ldc_w 'Modified palette: '
/*    */     //   1627: invokestatic A : (Ljava/lang/String;)Lf/dQ;
/*    */     //   1630: astore #12
/*    */     //   1632: getfield Dv0 : Lf/SA;
/*    */     //   1635: aload #12
/*    */     //   1637: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1640: invokevirtual fu : ()Lf/nJ0;
/*    */     //   1643: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1646: dup
/*    */     //   1647: iconst_2
/*    */     //   1648: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1651: putfield ss : Ljava/lang/Integer;
/*    */     //   1654: getfield Ox : Lf/ZP;
/*    */     //   1657: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1660: pop
/*    */     //   1661: aload_0
/*    */     //   1662: iload #10
/*    */     //   1664: new f/ZJ0
/*    */     //   1667: dup
/*    */     //   1668: astore #12
/*    */     //   1670: invokespecial <init> : ()V
/*    */     //   1673: iconst_0
/*    */     //   1674: istore #16
/*    */     //   1676: iconst_0
/*    */     //   1677: istore #18
/*    */     //   1679: anewarray f/Fy0
/*    */     //   1682: putfield JT : [Lf/Fy0;
/*    */     //   1685: iconst_0
/*    */     //   1686: istore #19
/*    */     //   1688: iload #19
/*    */     //   1690: iload #10
/*    */     //   1692: if_icmpge -> 1877
/*    */     //   1695: iload #15
/*    */     //   1697: new f/pe0
/*    */     //   1700: astore #20
/*    */     //   1702: iconst_1
/*    */     //   1703: if_icmpne -> 1715
/*    */     //   1706: aload_0
/*    */     //   1707: getfield HC0 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1710: astore #21
/*    */     //   1712: goto -> 1721
/*    */     //   1715: aload_0
/*    */     //   1716: getfield pp : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1719: astore #21
/*    */     //   1721: iload #15
/*    */     //   1723: aload #20
/*    */     //   1725: iload #16
/*    */     //   1727: aload #20
/*    */     //   1729: aload #21
/*    */     //   1731: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   1734: iload #18
/*    */     //   1736: iconst_1
/*    */     //   1737: iconst_1
/*    */     //   1738: invokevirtual Y9 : (IIII)V
/*    */     //   1741: new f/Fy0
/*    */     //   1744: dup
/*    */     //   1745: dup
/*    */     //   1746: dup2
/*    */     //   1747: astore #21
/*    */     //   1749: ldc_w ''
/*    */     //   1752: bipush #24
/*    */     //   1754: bipush #24
/*    */     //   1756: invokespecial <init> : (Ljava/lang/String;II)V
/*    */     //   1759: getfield As : Lf/rH;
/*    */     //   1762: iconst_1
/*    */     //   1763: anewarray f/pe0
/*    */     //   1766: dup
/*    */     //   1767: iconst_0
/*    */     //   1768: aload #20
/*    */     //   1770: aastore
/*    */     //   1771: invokevirtual Pn : ([Lf/pe0;)Lf/JG0;
/*    */     //   1774: pop
/*    */     //   1775: getfield As : Lf/rH;
/*    */     //   1778: bipush #24
/*    */     //   1780: bipush #24
/*    */     //   1782: invokevirtual tL : (II)V
/*    */     //   1785: ldc_w 'color-button'
/*    */     //   1788: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   1791: iconst_1
/*    */     //   1792: if_icmpne -> 1813
/*    */     //   1795: aload #21
/*    */     //   1797: aload_0
/*    */     //   1798: aload_3
/*    */     //   1799: aload #8
/*    */     //   1801: aload #11
/*    */     //   1803: iload #19
/*    */     //   1805: <illegal opcode> run : (Lf/ga0;Lf/lpt1;Lf/fk0;Lf/ZA0;I)Ljava/lang/Runnable;
/*    */     //   1810: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   1813: aload_0
/*    */     //   1814: getfield er : Z
/*    */     //   1817: ifeq -> 1836
/*    */     //   1820: aload_0
/*    */     //   1821: getfield px0 : [Z
/*    */     //   1824: iload #19
/*    */     //   1826: baload
/*    */     //   1827: ifne -> 1836
/*    */     //   1830: aload #21
/*    */     //   1832: iconst_0
/*    */     //   1833: invokevirtual wI0 : (Z)V
/*    */     //   1836: aload #12
/*    */     //   1838: aload #21
/*    */     //   1840: aload_0
/*    */     //   1841: getfield JT : [Lf/Fy0;
/*    */     //   1844: iload #19
/*    */     //   1846: aload #21
/*    */     //   1848: aastore
/*    */     //   1849: invokevirtual try : (Lf/JG0;)Lf/nJ0;
/*    */     //   1852: pop
/*    */     //   1853: iload #16
/*    */     //   1855: iconst_1
/*    */     //   1856: iadd
/*    */     //   1857: dup
/*    */     //   1858: istore #16
/*    */     //   1860: bipush #8
/*    */     //   1862: if_icmplt -> 1871
/*    */     //   1865: iconst_0
/*    */     //   1866: istore #16
/*    */     //   1868: iinc #18, 1
/*    */     //   1871: iinc #19, 1
/*    */     //   1874: goto -> 1688
/*    */     //   1877: aload_0
/*    */     //   1878: getfield cl0 : Lf/YA0;
/*    */     //   1881: getfield Dv0 : Lf/SA;
/*    */     //   1884: aload #12
/*    */     //   1886: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   1889: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   1892: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   1895: dup
/*    */     //   1896: iconst_2
/*    */     //   1897: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1900: putfield ss : Ljava/lang/Integer;
/*    */     //   1903: getfield Ox : Lf/ZP;
/*    */     //   1906: invokevirtual wP : ()Lf/nJ0;
/*    */     //   1909: ldc_w 5.0
/*    */     //   1912: invokevirtual Xj0 : (F)Lf/nJ0;
/*    */     //   1915: pop
/*    */     //   1916: iinc #15, 1
/*    */     //   1919: iload #16
/*    */     //   1921: iload #18
/*    */     //   1923: istore #16
/*    */     //   1925: istore #12
/*    */     //   1927: goto -> 1608
/*    */     //   1930: aload_3
/*    */     //   1931: aload_0
/*    */     //   1932: dup
/*    */     //   1933: aload #8
/*    */     //   1935: aload_0
/*    */     //   1936: getfield gm0 : Lf/Wd;
/*    */     //   1939: aload_0
/*    */     //   1940: getfield Zn0 : [I
/*    */     //   1943: astore #10
/*    */     //   1945: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1948: pop
/*    */     //   1949: aload #10
/*    */     //   1951: invokestatic IV : (Lf/fk0;[I)Lf/ZH;
/*    */     //   1954: dup
/*    */     //   1955: astore #10
/*    */     //   1957: aload #17
/*    */     //   1959: aload_0
/*    */     //   1960: new com/badlogic/gdx/graphics/Texture
/*    */     //   1963: dup
/*    */     //   1964: aload #10
/*    */     //   1966: invokespecial <init> : (Lf/ZH;)V
/*    */     //   1969: putfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1972: new java/lang/StringBuilder
/*    */     //   1975: dup
/*    */     //   1976: aload #8
/*    */     //   1978: swap
/*    */     //   1979: invokespecial <init> : ()V
/*    */     //   1982: getfield b70 : Lf/f20;
/*    */     //   1985: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   1988: ldc_w '( '
/*    */     //   1991: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1994: aload #10
/*    */     //   1996: invokevirtual TU : ()Lf/Uc;
/*    */     //   1999: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   2002: ldc_w ' )'
/*    */     //   2005: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2008: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2011: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   2014: invokevirtual dispose : ()V
/*    */     //   2017: new f/pe0
/*    */     //   2020: dup
/*    */     //   2021: astore #10
/*    */     //   2023: iload #12
/*    */     //   2025: iload #16
/*    */     //   2027: aload #10
/*    */     //   2029: aload_0
/*    */     //   2030: getfield HC0 : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2033: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2036: iconst_1
/*    */     //   2037: iconst_1
/*    */     //   2038: invokevirtual Y9 : (IIII)V
/*    */     //   2041: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2044: invokevirtual getWidth : ()I
/*    */     //   2047: sipush #192
/*    */     //   2050: swap
/*    */     //   2051: idiv
/*    */     //   2052: istore #10
/*    */     //   2054: new f/ec
/*    */     //   2057: dup
/*    */     //   2058: dup
/*    */     //   2059: dup2
/*    */     //   2060: astore #12
/*    */     //   2062: aload_0
/*    */     //   2063: dup
/*    */     //   2064: dup
/*    */     //   2065: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2068: invokevirtual getWidth : ()I
/*    */     //   2071: iload #10
/*    */     //   2073: imul
/*    */     //   2074: istore #15
/*    */     //   2076: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2079: invokevirtual getHeight : ()I
/*    */     //   2082: iload #10
/*    */     //   2084: imul
/*    */     //   2085: iload #15
/*    */     //   2087: swap
/*    */     //   2088: iload #10
/*    */     //   2090: aload #8
/*    */     //   2092: aload_3
/*    */     //   2093: aload #11
/*    */     //   2095: invokespecial <init> : (Lf/ga0;IIILf/fk0;Lf/lpt1;Lf/ZA0;)V
/*    */     //   2098: ldc_w 'color-button'
/*    */     //   2101: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   2104: getfield As : Lf/rH;
/*    */     //   2107: iconst_1
/*    */     //   2108: anewarray com/badlogic/gdx/graphics/Texture
/*    */     //   2111: dup
/*    */     //   2112: aload_0
/*    */     //   2113: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2116: iconst_0
/*    */     //   2117: swap
/*    */     //   2118: aastore
/*    */     //   2119: invokevirtual Yo : ([Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2122: getfield As : Lf/rH;
/*    */     //   2125: aload_0
/*    */     //   2126: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2129: invokevirtual getWidth : ()I
/*    */     //   2132: iload #10
/*    */     //   2134: imul
/*    */     //   2135: aload_0
/*    */     //   2136: getfield cP : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2139: invokevirtual getHeight : ()I
/*    */     //   2142: iload #10
/*    */     //   2144: imul
/*    */     //   2145: invokevirtual tL : (II)V
/*    */     //   2148: getfield cl0 : Lf/YA0;
/*    */     //   2151: getfield Dv0 : Lf/SA;
/*    */     //   2154: aload #12
/*    */     //   2156: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2159: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2162: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2165: dup
/*    */     //   2166: iconst_2
/*    */     //   2167: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2170: putfield ss : Ljava/lang/Integer;
/*    */     //   2173: getfield Ox : Lf/ZP;
/*    */     //   2176: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2179: pop
/*    */     //   2180: new f/Un
/*    */     //   2183: dup
/*    */     //   2184: astore #10
/*    */     //   2186: ldc_w 'Save'
/*    */     //   2189: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   2192: new f/Un
/*    */     //   2195: dup
/*    */     //   2196: astore #12
/*    */     //   2198: ldc_w 'Restore'
/*    */     //   2201: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   2204: new f/Un
/*    */     //   2207: dup
/*    */     //   2208: astore #15
/*    */     //   2210: ldc_w 'Replace All'
/*    */     //   2213: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   2216: new f/Un
/*    */     //   2219: dup
/*    */     //   2220: astore #16
/*    */     //   2222: ldc_w 'Restore All'
/*    */     //   2225: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   2228: new f/Un
/*    */     //   2231: dup
/*    */     //   2232: astore #17
/*    */     //   2234: aload_0
/*    */     //   2235: aload #8
/*    */     //   2237: aload #17
/*    */     //   2239: ldc_w 'Export PNG'
/*    */     //   2242: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   2245: <illegal opcode> run : (Lf/ga0;Lf/fk0;)Ljava/lang/Runnable;
/*    */     //   2250: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   2253: getfield bv : Z
/*    */     //   2256: ifne -> 2283
/*    */     //   2259: aload #16
/*    */     //   2261: aload #15
/*    */     //   2263: aload #12
/*    */     //   2265: aload #10
/*    */     //   2267: iconst_0
/*    */     //   2268: invokevirtual sk0 : (Z)V
/*    */     //   2271: iconst_0
/*    */     //   2272: invokevirtual sk0 : (Z)V
/*    */     //   2275: iconst_0
/*    */     //   2276: invokevirtual sk0 : (Z)V
/*    */     //   2279: iconst_0
/*    */     //   2280: invokevirtual sk0 : (Z)V
/*    */     //   2283: aload #16
/*    */     //   2285: aload_0
/*    */     //   2286: iload_1
/*    */     //   2287: aload #15
/*    */     //   2289: aload_0
/*    */     //   2290: iload_1
/*    */     //   2291: aload #12
/*    */     //   2293: aload_0
/*    */     //   2294: iload #4
/*    */     //   2296: aload #10
/*    */     //   2298: aload_0
/*    */     //   2299: iload #4
/*    */     //   2301: new f/ge0
/*    */     //   2304: dup
/*    */     //   2305: astore #18
/*    */     //   2307: invokespecial <init> : ()V
/*    */     //   2310: iload #14
/*    */     //   2312: iload_1
/*    */     //   2313: iload #7
/*    */     //   2315: iload #6
/*    */     //   2317: aload #9
/*    */     //   2319: <illegal opcode> run : (Lf/ga0;IZBBILf/f20;)Ljava/lang/Runnable;
/*    */     //   2324: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   2327: iload_1
/*    */     //   2328: aload_2
/*    */     //   2329: aload_3
/*    */     //   2330: iload #5
/*    */     //   2332: iload #6
/*    */     //   2334: <illegal opcode> run : (Lf/ga0;IBLf/T0;Lf/lpt1;II)Ljava/lang/Runnable;
/*    */     //   2339: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   2342: iload #4
/*    */     //   2344: aload #9
/*    */     //   2346: iload #6
/*    */     //   2348: aload #18
/*    */     //   2350: iload #5
/*    */     //   2352: <illegal opcode> run : (Lf/ga0;BILf/f20;ILf/ge0;I)Ljava/lang/Runnable;
/*    */     //   2357: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   2360: iload #4
/*    */     //   2362: aload #9
/*    */     //   2364: iload #6
/*    */     //   2366: aload #18
/*    */     //   2368: aload_2
/*    */     //   2369: aload_3
/*    */     //   2370: iload #5
/*    */     //   2372: <illegal opcode> run : (Lf/ga0;BILf/f20;ILf/ge0;Lf/T0;Lf/lpt1;I)Ljava/lang/Runnable;
/*    */     //   2377: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   2380: getstatic f/km.a3 : Lf/vh0;
/*    */     //   2383: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   2386: getfield E10 : B
/*    */     //   2389: iconst_3
/*    */     //   2390: if_icmpne -> 2397
/*    */     //   2393: iconst_1
/*    */     //   2394: goto -> 2398
/*    */     //   2397: iconst_0
/*    */     //   2398: ifne -> 2422
/*    */     //   2401: getstatic f/km.a3 : Lf/vh0;
/*    */     //   2404: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   2407: getfield E10 : B
/*    */     //   2410: iconst_4
/*    */     //   2411: if_icmpne -> 2418
/*    */     //   2414: iconst_1
/*    */     //   2415: goto -> 2419
/*    */     //   2418: iconst_0
/*    */     //   2419: ifeq -> 2654
/*    */     //   2422: aload #13
/*    */     //   2424: aload_0
/*    */     //   2425: aload_3
/*    */     //   2426: aload #8
/*    */     //   2428: aload_0
/*    */     //   2429: dup
/*    */     //   2430: dup2
/*    */     //   2431: dup2
/*    */     //   2432: getfield cl0 : Lf/YA0;
/*    */     //   2435: getfield Dv0 : Lf/SA;
/*    */     //   2438: aload #10
/*    */     //   2440: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2443: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2446: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2449: pop
/*    */     //   2450: getfield cl0 : Lf/YA0;
/*    */     //   2453: getfield Dv0 : Lf/SA;
/*    */     //   2456: aload #12
/*    */     //   2458: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2461: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2464: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2467: getfield Ox : Lf/ZP;
/*    */     //   2470: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2473: pop
/*    */     //   2474: getfield cl0 : Lf/YA0;
/*    */     //   2477: new f/vy
/*    */     //   2480: dup
/*    */     //   2481: astore_1
/*    */     //   2482: iconst_2
/*    */     //   2483: anewarray f/JG0
/*    */     //   2486: dup
/*    */     //   2487: dup
/*    */     //   2488: iconst_0
/*    */     //   2489: aload #18
/*    */     //   2491: aastore
/*    */     //   2492: ldc_w 'Include Partial Results'
/*    */     //   2495: invokestatic A : (Ljava/lang/String;)Lf/dQ;
/*    */     //   2498: iconst_1
/*    */     //   2499: swap
/*    */     //   2500: aastore
/*    */     //   2501: invokespecial <init> : ([Lf/JG0;)V
/*    */     //   2504: getfield Dv0 : Lf/SA;
/*    */     //   2507: aload_1
/*    */     //   2508: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2511: invokevirtual fu : ()Lf/nJ0;
/*    */     //   2514: dup
/*    */     //   2515: iconst_2
/*    */     //   2516: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2519: putfield ss : Ljava/lang/Integer;
/*    */     //   2522: ldc_w 30.0
/*    */     //   2525: invokevirtual fJ : (F)Lf/nJ0;
/*    */     //   2528: dup
/*    */     //   2529: dup
/*    */     //   2530: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2533: pop
/*    */     //   2534: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2537: pop
/*    */     //   2538: getfield Ox : Lf/ZP;
/*    */     //   2541: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2544: pop
/*    */     //   2545: getfield cl0 : Lf/YA0;
/*    */     //   2548: getfield Dv0 : Lf/SA;
/*    */     //   2551: aload #15
/*    */     //   2553: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2556: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2559: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2562: pop
/*    */     //   2563: getfield cl0 : Lf/YA0;
/*    */     //   2566: getfield Dv0 : Lf/SA;
/*    */     //   2569: aload #16
/*    */     //   2571: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2574: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2577: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2580: getfield Ox : Lf/ZP;
/*    */     //   2583: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2586: pop
/*    */     //   2587: getfield cl0 : Lf/YA0;
/*    */     //   2590: getfield Dv0 : Lf/SA;
/*    */     //   2593: aload #17
/*    */     //   2595: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2598: dup
/*    */     //   2599: dup2
/*    */     //   2600: iconst_2
/*    */     //   2601: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2604: putfield ss : Ljava/lang/Integer;
/*    */     //   2607: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2610: pop
/*    */     //   2611: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2614: pop
/*    */     //   2615: getfield Ox : Lf/ZP;
/*    */     //   2618: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2621: pop
/*    */     //   2622: aload #11
/*    */     //   2624: invokevirtual Z6 : (Lf/lpt1;Lf/fk0;Lf/ZA0;)Lf/YA0;
/*    */     //   2627: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   2630: dup
/*    */     //   2631: dup2
/*    */     //   2632: iconst_2
/*    */     //   2633: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2636: putfield ss : Ljava/lang/Integer;
/*    */     //   2639: invokevirtual Kw : ()Lf/nJ0;
/*    */     //   2642: pop
/*    */     //   2643: invokevirtual x70 : ()Lf/nJ0;
/*    */     //   2646: pop
/*    */     //   2647: getfield Ox : Lf/ZP;
/*    */     //   2650: invokevirtual wP : ()Lf/nJ0;
/*    */     //   2653: pop
/*    */     //   2654: aload_0
/*    */     //   2655: dup
/*    */     //   2656: dup2
/*    */     //   2657: aload_3
/*    */     //   2658: aload #8
/*    */     //   2660: aload #11
/*    */     //   2662: iconst_0
/*    */     //   2663: invokevirtual A10 : (Lf/lpt1;Lf/fk0;Lf/ZA0;Z)V
/*    */     //   2666: getfield cl0 : Lf/YA0;
/*    */     //   2669: astore_0
/*    */     //   2670: invokevirtual Ub : ()I
/*    */     //   2673: aload_0
/*    */     //   2674: swap
/*    */     //   2675: invokevirtual si : (Lf/JG0;I)V
/*    */     //   2678: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 27
/*    */     //   #3	-> 30
/*    */     //   #4	-> 90
/*    */     //   #5	-> 95
/*    */     //   #6	-> 168
/*    */     //   #7	-> 171
/*    */     //   #8	-> 203
/*    */     //   #9	-> 206
/*    */     //   #10	-> 213
/*    */     //   #11	-> 232
/*    */     //   #12	-> 235
/*    */     //   #13	-> 240
/*    */     //   #14	-> 280
/*    */     //   #15	-> 283
/*    */     //   #16	-> 294
/*    */     //   #17	-> 327
/*    */     //   #18	-> 330
/*    */     //   #19	-> 335
/*    */     //   #20	-> 410
/*    */     //   #21	-> 415
/*    */     //   #22	-> 420
/*    */     //   #23	-> 424
/*    */     //   #24	-> 436
/*    */     //   #25	-> 475
/*    */     //   #26	-> 483
/*    */     //   #27	-> 617
/*    */     //   #28	-> 651
/*    */     //   #29	-> 661
/*    */     //   #30	-> 697
/*    */     //   #31	-> 756
/*    */     //   #32	-> 764
/*    */     //   #33	-> 868
/*    */     //   #34	-> 872
/*    */     //   #35	-> 875
/*    */     //   #36	-> 885
/*    */     //   #37	-> 891
/*    */     //   #38	-> 903
/*    */     //   #39	-> 951
/*    */     //   #40	-> 954
/*    */     //   #41	-> 957
/*    */     //   #42	-> 964
/*    */     //   #43	-> 971
/*    */     //   #44	-> 1051
/*    */     //   #45	-> 1059
/*    */     //   #46	-> 1283
/*    */     //   #47	-> 1290
/*    */     //   #48	-> 1299
/*    */     //   #49	-> 1308
/*    */     //   #50	-> 1322
/*    */     //   #51	-> 1325
/*    */     //   #52	-> 1328
/*    */     //   #53	-> 1333
/*    */     //   #54	-> 1336
/*    */     //   #55	-> 1347
/*    */     //   #56	-> 1350
/*    */     //   #57	-> 1365
/*    */     //   #58	-> 1396
/*    */     //   #59	-> 1401
/*    */     //   #60	-> 1406
/*    */     //   #61	-> 1423
/*    */     //   #62	-> 1431
/*    */     //   #63	-> 1434
/*    */     //   #64	-> 1441
/*    */     //   #65	-> 1463
/*    */     //   #66	-> 1468
/*    */     //   #67	-> 1478
/*    */     //   #68	-> 1491
/*    */     //   #69	-> 1500
/*    */     //   #70	-> 1506
/*    */     //   #71	-> 1514
/*    */     //   #72	-> 1517
/*    */     //   #73	-> 1524
/*    */     //   #74	-> 1552
/*    */     //   #75	-> 1555
/*    */     //   #76	-> 1558
/*    */     //   #77	-> 1565
/*    */     //   #78	-> 1568
/*    */     //   #79	-> 1576
/*    */     //   #80	-> 1581
/*    */     //   #81	-> 1584
/*    */     //   #82	-> 1595
/*    */     //   #83	-> 1598
/*    */     //   #84	-> 1621
/*    */     //   #85	-> 1624
/*    */     //   #86	-> 1632
/*    */     //   #87	-> 1637
/*    */     //   #88	-> 1640
/*    */     //   #89	-> 1651
/*    */     //   #90	-> 1654
/*    */     //   #91	-> 1664
/*    */     //   #92	-> 1749
/*    */     //   #93	-> 1759
/*    */     //   #94	-> 1763
/*    */     //   #95	-> 1775
/*    */     //   #96	-> 1782
/*    */     //   #97	-> 1881
/*    */     //   #98	-> 1886
/*    */     //   #99	-> 1889
/*    */     //   #100	-> 1900
/*    */     //   #101	-> 1903
/*    */     //   #102	-> 1912
/*    */     //   #103	-> 2104
/*    */     //   #104	-> 2108
/*    */     //   #105	-> 2122
/*    */     //   #106	-> 2126
/*    */     //   #107	-> 2151
/*    */     //   #108	-> 2156
/*    */     //   #109	-> 2159
/*    */     //   #110	-> 2170
/*    */     //   #111	-> 2173
/*    */     //   #112	-> 2180
/*    */     //   #113	-> 2386
/*    */     //   #114	-> 2401
/*    */     //   #115	-> 2407
/*    */     //   #116	-> 2432
/*    */     //   #117	-> 2435
/*    */     //   #118	-> 2440
/*    */     //   #119	-> 2443
/*    */     //   #120	-> 2453
/*    */     //   #121	-> 2458
/*    */     //   #122	-> 2461
/*    */     //   #123	-> 2467
/*    */     //   #124	-> 2474
/*    */     //   #125	-> 2492
/*    */     //   #126	-> 2500
/*    */     //   #127	-> 2504
/*    */     //   #128	-> 2508
/*    */     //   #129	-> 2511
/*    */     //   #130	-> 2519
/*    */     //   #131	-> 2525
/*    */     //   #132	-> 2530
/*    */     //   #133	-> 2538
/*    */     //   #134	-> 2545
/*    */     //   #135	-> 2548
/*    */     //   #136	-> 2553
/*    */     //   #137	-> 2556
/*    */     //   #138	-> 2566
/*    */     //   #139	-> 2571
/*    */     //   #140	-> 2574
/*    */     //   #141	-> 2580
/*    */     //   #142	-> 2587
/*    */     //   #143	-> 2590
/*    */     //   #144	-> 2595
/*    */     //   #145	-> 2601
/*    */     //   #146	-> 2604
/*    */     //   #147	-> 2607
/*    */     //   #148	-> 2615
/*    */     //   #149	-> 2624
/*    */     //   #150	-> 2636
/*    */     //   #151	-> 2639
/*    */     //   #152	-> 2647
/*    */     //   #153	-> 2663
/*    */     //   #154	-> 2670
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     B8.Pg(paramoa0.cz0);
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.cl0.mM();
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     super.R60(paramthrows);
/*    */   }
/*    */   
/*    */   public ga0(T0 paramT0, lpt1 paramlpt1, int paramInt1, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: dup2
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: new f/fQ
/*    */     //   10: dup
/*    */     //   11: invokespecial <init> : ()V
/*    */     //   14: putfield Hg0 : Lf/fQ;
/*    */     //   17: new f/fQ
/*    */     //   20: dup
/*    */     //   21: invokespecial <init> : ()V
/*    */     //   24: putfield Fp : Lf/fQ;
/*    */     //   27: iconst_1
/*    */     //   28: putfield er : Z
/*    */     //   31: ldc_w 'maptextureview'
/*    */     //   34: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   37: getstatic f/ga0.iy : Lf/It;
/*    */     //   40: ifnonnull -> 63
/*    */     //   43: new f/It
/*    */     //   46: dup
/*    */     //   47: dup
/*    */     //   48: invokespecial <init> : ()V
/*    */     //   51: putstatic f/ga0.iy : Lf/It;
/*    */     //   54: getstatic f/BB.NH0 : Lf/BB;
/*    */     //   57: invokevirtual C70 : (Lf/BB;)V
/*    */     //   60: invokestatic jC0 : ()V
/*    */     //   63: aload_0
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: new f/W1
/*    */     //   69: dup
/*    */     //   70: aload_0
/*    */     //   71: swap
/*    */     //   72: dup
/*    */     //   73: new f/OZ
/*    */     //   76: dup
/*    */     //   77: iconst_4
/*    */     //   78: anewarray java/lang/String
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: dup2
/*    */     //   84: iconst_0
/*    */     //   85: ldc_w 'Spring'
/*    */     //   88: aastore
/*    */     //   89: iconst_1
/*    */     //   90: ldc_w 'Summer'
/*    */     //   93: aastore
/*    */     //   94: iconst_2
/*    */     //   95: ldc_w 'Autumn'
/*    */     //   98: aastore
/*    */     //   99: iconst_3
/*    */     //   100: ldc_w 'Winter'
/*    */     //   103: aastore
/*    */     //   104: invokespecial <init> : ([Ljava/lang/Object;)V
/*    */     //   107: invokespecial <init> : (Lf/cQ;)V
/*    */     //   110: putfield SL0 : Lf/W1;
/*    */     //   113: invokestatic Oj0 : ()Lf/L70;
/*    */     //   116: invokevirtual fu : ()B
/*    */     //   119: invokevirtual Z30 : (I)V
/*    */     //   122: getfield SL0 : Lf/W1;
/*    */     //   125: aload_0
/*    */     //   126: aload_1
/*    */     //   127: aload_2
/*    */     //   128: iload_3
/*    */     //   129: iload #4
/*    */     //   131: iload #5
/*    */     //   133: <illegal opcode> run : (Lf/ga0;Lf/T0;Lf/lpt1;III)Ljava/lang/Runnable;
/*    */     //   138: invokevirtual D30 : (Ljava/lang/Runnable;)V
/*    */     //   141: getstatic f/km.a3 : Lf/vh0;
/*    */     //   144: invokevirtual ui0 : ()B
/*    */     //   147: aload_1
/*    */     //   148: aload_2
/*    */     //   149: iload_3
/*    */     //   150: iload #4
/*    */     //   152: iload #5
/*    */     //   154: invokevirtual vZ : (BLf/T0;Lf/lpt1;III)V
/*    */     //   157: iconst_1
/*    */     //   158: invokevirtual EP : (I)V
/*    */     //   161: return
/*    */   }
/*    */   
/*    */   public static void jC0() {
/*    */     hZ hZ;
/*    */     if ((hZ = UB0.vj0.N0("./config/palettes.presets")).L0()) {
/*    */       InputStream inputStream = hZ.Yc();
/*    */       try {
/*    */         InputStreamReader inputStreamReader;
/*    */         Jy0 jy0;
/*    */         this(inputStream, "UTF-8");
/*    */         bM0 bM0;
/*    */         (bM0 = (new nP()).lu(inputStreamReader)).getClass();
/*    */         this(bM0);
/*    */         while (jy0.hasNext()) {
/*    */           bM0 = (bM0)jy0.next();
/*    */           l5.Ed0(bM0.as0, iy.Uj0(ArrayList.class, xz.class, bM0));
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         throw new kN("Error reading stream.", exception);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int ta(int paramInt) {
/*    */     paramInt = (paramInt & 0xFF0000) >> 18 << 5 & 0x7E0;
/*    */     int i = (paramInt & 0xFF00) >> 11 & 0x1F;
/*    */     paramInt = ((((paramInt = paramInt << 8 | paramInt >>> 24) & 0xFF000000) >> 27 << 11 & 0xF800 | paramInt | i) & 0xF800) >>> 11;
/*    */     i = ((((paramInt = paramInt << 8 | paramInt >>> 24) & 0xFF000000) >> 27 << 11 & 0xF800 | paramInt | i) & 0x7E0) >>> 5;
/*    */     paramInt = (int)Math.floor(i * 255.0D / 63.0D + 0.5D);
/*    */     i = (int)Math.floor(((((paramInt = paramInt << 8 | paramInt >>> 24) & 0xFF000000) >> 27 << 11 & 0xF800 | paramInt | i) & 0x1F) * 255.0D / 31.0D + 0.5D);
/*    */     return ((int)Math.floor(paramInt * 255.0D / 31.0D + 0.5D) & 0xFF) << 16 | 0xFF000000 | (paramInt & 0xFF) << 8 | i & 0xFF;
/*    */   }
/*    */   
/*    */   private void hI(int paramInt, Fy0 paramFy0) {
/*    */     this();
/*    */     hu.mD("Remove", () -> {
/*    */           JG0 jG0;
/*    */           a1.remove(paramInt);
/*    */           nJ0 nJ01 = this.aw;
/*    */           if (gD0) {
/*    */             jG0 = wi0();
/*    */           } else {
/*    */             this();
/*    */           } 
/*    */           nJ01.cd(this);
/*    */         });
/*    */     int i = paramFy0.Kd;
/*    */     hu hu;
/*    */     F7.T1(hu = new hu(), paramFy0, i, paramFy0.er0 + paramFy0.HC);
/*    */   }
/*    */   
/*    */   public static void Wl0(ge0 paramge0) {
/*    */     zK0 = paramge0.TG0.nm0();
/*    */   }
/*    */   
/*    */   private void SS(ge0 paramge0) {
/*    */     JG0 jG0;
/*    */     gD0 = paramge0.TG0.nm0();
/*    */     nJ0 nJ01 = this.aw;
/*    */     if (paramge0.TG0.nm0()) {
/*    */       jG0 = wi0();
/*    */     } else {
/*    */       this();
/*    */     } 
/*    */     nJ01.cd(this);
/*    */   }
/*    */   
/*    */   private void YF0(ge0 paramge0) {
/*    */     JG0 jG0;
/*    */     for (byte b = 0; b < this.Zn0.length; ) {
/*    */       int i;
/*    */       boolean bool;
/*    */       Iterator<xz> iterator;
/*    */       for (i = this.fa[b], bool = false, iterator = a1.iterator(); iterator.hasNext();) {
/*    */         if ((xz = iterator.next()).argb == i) {
/*    */           bool = true;
/*    */           if (zK0)
/*    */             xz.argb_swap = this.Zn0[b]; 
/*    */           break;
/*    */         } 
/*    */       } 
/*    */       if (!bool && this.Zn0[b] != i && (paramge0.TG0.nm0() || this.px0[b])) {
/*    */         this();
/*    */         xz.argb = i;
/*    */         xz xz;
/*    */         (xz = new xz()).argb_swap = this.Zn0[b];
/*    */         a1.add(xz);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     nJ0 nJ01 = this.aw;
/*    */     if (gD0) {
/*    */       jG0 = wi0();
/*    */     } else {
/*    */       this();
/*    */     } 
/*    */     nJ01.cd(this);
/*    */   }
/*    */   
/*    */   public static void Iz(ge0 paramge0) {
/*    */     aG = paramge0.TG0.nm0();
/*    */   }
/*    */   
/*    */   public static void Tj(ge0 paramge0) {
/*    */     sG = paramge0.TG0.nm0();
/*    */   }
/*    */   
/*    */   private void t2(W1 paramW1, OZ paramOZ) {
/*    */     String str = (String)paramW1.WW();
/*    */     int i = paramW1.Wa0.go;
/*    */     paramOZ.Fj.remove(i);
/*    */     MQ[] arrayOfMQ;
/*    */     if ((arrayOfMQ = paramOZ.rw) != null) {
/*    */       int j;
/*    */       byte b;
/*    */       for (j = arrayOfMQ.length, b = 0; b < j; ) {
/*    */         arrayOfMQ[b].AE(i, i);
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     paramW1.Z30(-1);
/*    */     l5.Yj0(str);
/*    */     y9();
/*    */   }
/*    */   
/*    */   private void UC(OZ paramOZ, W1 paramW1) {
/*    */     // Byte code:
/*    */     //   0: new f/YA0
/*    */     //   3: dup
/*    */     //   4: dup
/*    */     //   5: astore_3
/*    */     //   6: invokespecial <init> : ()V
/*    */     //   9: getfield Dv0 : Lf/SA;
/*    */     //   12: dup
/*    */     //   13: new f/of
/*    */     //   16: dup
/*    */     //   17: astore #4
/*    */     //   19: aconst_null
/*    */     //   20: invokespecial <init> : (Lf/Sa0;)V
/*    */     //   23: ldc_w 'Preset Name: '
/*    */     //   26: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   29: getfield Ox : Lf/ZP;
/*    */     //   32: invokevirtual wP : ()Lf/nJ0;
/*    */     //   35: pop
/*    */     //   36: aload #4
/*    */     //   38: invokevirtual S7 : (Ljava/lang/Object;)Lf/nJ0;
/*    */     //   41: pop
/*    */     //   42: getstatic f/D.N2 : Lf/D;
/*    */     //   45: dup
/*    */     //   46: new f/h70
/*    */     //   49: dup
/*    */     //   50: astore #5
/*    */     //   52: aload_3
/*    */     //   53: aload_0
/*    */     //   54: aload #4
/*    */     //   56: aload_1
/*    */     //   57: aload_2
/*    */     //   58: <illegal opcode> run : (Lf/ga0;Lf/of;Lf/OZ;Lf/W1;)Ljava/lang/Runnable;
/*    */     //   63: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   66: invokevirtual Ub : ()I
/*    */     //   69: aload #5
/*    */     //   71: swap
/*    */     //   72: invokevirtual si : (Lf/JG0;I)V
/*    */     //   75: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 20
/*    */     //   #2	-> 23
/*    */     //   #3	-> 29
/*    */     //   #4	-> 38
/*    */     //   #5	-> 63
/*    */     //   #6	-> 66
/*    */     //   #7	-> 72
/*    */   }
/*    */   
/*    */   private void aO(of paramof, OZ paramOZ, W1 paramW1) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/ga0.l5 : Lf/eM;
/*    */     //   3: aload_1
/*    */     //   4: getfield F2 : Lf/ak0;
/*    */     //   7: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   10: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   13: invokevirtual uW : (Ljava/lang/Object;)Z
/*    */     //   16: ifeq -> 69
/*    */     //   19: new f/YA0
/*    */     //   22: dup
/*    */     //   23: dup
/*    */     //   24: astore_2
/*    */     //   25: invokespecial <init> : ()V
/*    */     //   28: getfield Dv0 : Lf/SA;
/*    */     //   31: ldc_w 'Preset already exists, overwrite?'
/*    */     //   34: invokevirtual IR : (Ljava/lang/String;)Lf/nJ0;
/*    */     //   37: pop
/*    */     //   38: getstatic f/js.vu0 : Lf/js;
/*    */     //   41: dup
/*    */     //   42: new f/h70
/*    */     //   45: dup
/*    */     //   46: astore_3
/*    */     //   47: aload_2
/*    */     //   48: aload_0
/*    */     //   49: aload_1
/*    */     //   50: <illegal opcode> run : (Lf/ga0;Lf/of;)Ljava/lang/Runnable;
/*    */     //   55: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   58: invokevirtual Ub : ()I
/*    */     //   61: aload_3
/*    */     //   62: swap
/*    */     //   63: invokevirtual si : (Lf/JG0;I)V
/*    */     //   66: goto -> 209
/*    */     //   69: aload_2
/*    */     //   70: getstatic f/ga0.l5 : Lf/eM;
/*    */     //   73: aload_1
/*    */     //   74: getfield F2 : Lf/ak0;
/*    */     //   77: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   80: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   83: getstatic f/ga0.a1 : Ljava/util/ArrayList;
/*    */     //   86: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   89: checkcast java/util/ArrayList
/*    */     //   92: invokevirtual Ed0 : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   95: iconst_1
/*    */     //   96: anewarray java/lang/String
/*    */     //   99: dup
/*    */     //   100: aload_2
/*    */     //   101: swap
/*    */     //   102: iconst_0
/*    */     //   103: aload_1
/*    */     //   104: getfield F2 : Lf/ak0;
/*    */     //   107: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   110: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   113: aastore
/*    */     //   114: getfield Fj : Ljava/util/ArrayList;
/*    */     //   117: invokevirtual size : ()I
/*    */     //   120: istore_1
/*    */     //   121: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   124: dup
/*    */     //   125: astore #4
/*    */     //   127: aload_2
/*    */     //   128: getfield Fj : Ljava/util/ArrayList;
/*    */     //   131: iload_1
/*    */     //   132: aload #4
/*    */     //   134: invokevirtual addAll : (ILjava/util/Collection;)Z
/*    */     //   137: pop
/*    */     //   138: invokeinterface size : ()I
/*    */     //   143: iload_1
/*    */     //   144: iadd
/*    */     //   145: iconst_1
/*    */     //   146: isub
/*    */     //   147: istore #4
/*    */     //   149: getfield rw : [Lf/MQ;
/*    */     //   152: dup
/*    */     //   153: astore #5
/*    */     //   155: ifnull -> 192
/*    */     //   158: aload #5
/*    */     //   160: arraylength
/*    */     //   161: istore #6
/*    */     //   163: iconst_0
/*    */     //   164: istore #7
/*    */     //   166: iload #7
/*    */     //   168: iload #6
/*    */     //   170: if_icmpge -> 192
/*    */     //   173: aload #5
/*    */     //   175: iload #7
/*    */     //   177: aaload
/*    */     //   178: iload_1
/*    */     //   179: iload #4
/*    */     //   181: invokeinterface Ge : (II)V
/*    */     //   186: iinc #7, 1
/*    */     //   189: goto -> 166
/*    */     //   192: aload_0
/*    */     //   193: aload_3
/*    */     //   194: aload_2
/*    */     //   195: getfield Fj : Ljava/util/ArrayList;
/*    */     //   198: invokevirtual size : ()I
/*    */     //   201: iconst_1
/*    */     //   202: isub
/*    */     //   203: invokevirtual Z30 : (I)V
/*    */     //   206: invokevirtual y9 : ()V
/*    */     //   209: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 4
/*    */     //   #2	-> 7
/*    */     //   #3	-> 10
/*    */     //   #4	-> 13
/*    */     //   #5	-> 38
/*    */     //   #6	-> 42
/*    */     //   #7	-> 55
/*    */     //   #8	-> 58
/*    */     //   #9	-> 63
/*    */     //   #10	-> 70
/*    */     //   #11	-> 74
/*    */     //   #12	-> 77
/*    */     //   #13	-> 80
/*    */     //   #14	-> 83
/*    */     //   #15	-> 104
/*    */     //   #16	-> 107
/*    */     //   #17	-> 110
/*    */     //   #18	-> 113
/*    */     //   #19	-> 114
/*    */     //   #20	-> 117
/*    */     //   #21	-> 121
/*    */     //   #22	-> 128
/*    */     //   #23	-> 149
/*    */     //   #24	-> 195
/*    */     //   #25	-> 203
/*    */   }
/*    */   
/*    */   private void KK0(of paramof) {
/*    */     l5.Ed0(paramof.F2.PH0.toString(), a1.clone());
/*    */     y9();
/*    */   }
/*    */   
/*    */   private void lPT7(W1 paramW1) {
/*    */     if (paramW1.Wa0.go > 0) {
/*    */       l5.Ed0(paramW1.WW(), a1.clone());
/*    */       y9();
/*    */     } 
/*    */   }
/*    */   
/*    */   private void SF(W1 paramW1) {
/*    */     JG0 jG0;
/*    */     if ((a2 = paramW1.Wa0.go) <= 0)
/*    */       return; 
/*    */     a1.clear();
/*    */     if (paramW1.Wa0.go > 0)
/*    */       a1.addAll((Collection)l5.MF(paramW1.WW(), null)); 
/*    */     nJ0 nJ01 = this.aw;
/*    */     if (gD0) {
/*    */       jG0 = wi0();
/*    */     } else {
/*    */       this();
/*    */     } 
/*    */     nJ01.cd(this);
/*    */   }
/*    */   
/*    */   private void uI(byte paramByte, int paramInt1, f20 paramf20, int paramInt2, ge0 paramge0, T0 paramT0, lpt1 paramlpt1, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: iload_1
/*    */     //   2: invokestatic strictfp : (IB)Lf/Wd;
/*    */     //   5: dup
/*    */     //   6: astore #9
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: aload_0
/*    */     //   13: iload_1
/*    */     //   14: aload_3
/*    */     //   15: aload_0
/*    */     //   16: aload #9
/*    */     //   18: new f/fQ
/*    */     //   21: dup
/*    */     //   22: astore_3
/*    */     //   23: invokespecial <init> : ()V
/*    */     //   26: new f/fQ
/*    */     //   29: dup
/*    */     //   30: astore #9
/*    */     //   32: invokespecial <init> : ()V
/*    */     //   35: new f/ge0
/*    */     //   38: dup
/*    */     //   39: astore #10
/*    */     //   41: invokespecial <init> : ()V
/*    */     //   44: getfield Va0 : Lf/Yy0;
/*    */     //   47: iload #4
/*    */     //   49: invokevirtual yO : (I)Lf/vO;
/*    */     //   52: checkcast f/ZA0
/*    */     //   55: astore #11
/*    */     //   57: getfield px0 : [Z
/*    */     //   60: aload #11
/*    */     //   62: swap
/*    */     //   63: aload_3
/*    */     //   64: aload #9
/*    */     //   66: aload #10
/*    */     //   68: aload #5
/*    */     //   70: invokevirtual c1 : (BLf/f20;Lf/ZA0;[ZLf/fQ;Lf/fQ;Lf/ge0;Lf/ge0;)Lf/Ip;
/*    */     //   73: dup
/*    */     //   74: astore #5
/*    */     //   76: getstatic f/js.vu0 : Lf/js;
/*    */     //   79: dup
/*    */     //   80: new f/h70
/*    */     //   83: dup
/*    */     //   84: astore #11
/*    */     //   86: aload #5
/*    */     //   88: aload_0
/*    */     //   89: aload #9
/*    */     //   91: aload_3
/*    */     //   92: aload #10
/*    */     //   94: iload_1
/*    */     //   95: aload #6
/*    */     //   97: aload #7
/*    */     //   99: iload_2
/*    */     //   100: iload #8
/*    */     //   102: iload #4
/*    */     //   104: <illegal opcode> run : (Lf/ga0;Lf/fQ;Lf/fQ;Lf/ge0;BLf/T0;Lf/lpt1;III)Ljava/lang/Runnable;
/*    */     //   109: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   112: invokevirtual Ub : ()I
/*    */     //   115: aload #11
/*    */     //   117: swap
/*    */     //   118: invokevirtual si : (Lf/JG0;I)V
/*    */     //   121: iconst_0
/*    */     //   122: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   125: sipush #400
/*    */     //   128: sipush #300
/*    */     //   131: invokevirtual uh0 : (II)V
/*    */     //   134: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 76
/*    */     //   #2	-> 80
/*    */     //   #3	-> 109
/*    */     //   #4	-> 112
/*    */     //   #5	-> 118
/*    */     //   #6	-> 122
/*    */   }
/*    */   
/*    */   private void Iv0(fQ paramfQ1, fQ paramfQ2, ge0 paramge0, byte paramByte, T0 paramT0, lpt1 paramlpt1, int paramInt1, int paramInt2, int paramInt3) {
/*    */     byte b;
/*    */     Hc0 hc0;
/*    */     for (b = 0, hc0 = paramfQ1.r30(); hc0.hasNext(); ) {
/*    */       if (((ge0)hc0.next()).TG0.nm0()) {
/*    */         F80 f80 = (F80)paramfQ2.get(b);
/*    */         if (paramge0.TG0.nm0()) {
/*    */           for (byte b1 = 0; b1 < 4; ) {
/*    */             int i = f80.lq, j = f80.da;
/*    */             IW.Og(paramByte, b1, i, j);
/*    */             b1++;
/*    */           } 
/*    */         } else {
/*    */           int i = this.SL0.Wa0.go;
/*    */           int j = f80.lq, k = f80.da;
/*    */           IW.Og(paramByte, i, j, k);
/*    */         } 
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     vZ(paramByte, paramT0, paramlpt1, paramInt1, paramInt2, paramInt3);
/*    */     IW.tv0();
/*    */   }
/*    */   
/*    */   private void C9(byte paramByte, int paramInt1, f20 paramf20, int paramInt2, ge0 paramge0, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: iload_1
/*    */     //   2: invokestatic strictfp : (IB)Lf/Wd;
/*    */     //   5: dup
/*    */     //   6: astore #7
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: aload_0
/*    */     //   13: iload_1
/*    */     //   14: aload_3
/*    */     //   15: aload_0
/*    */     //   16: aload #7
/*    */     //   18: new f/fQ
/*    */     //   21: dup
/*    */     //   22: astore #7
/*    */     //   24: invokespecial <init> : ()V
/*    */     //   27: new f/fQ
/*    */     //   30: dup
/*    */     //   31: astore #8
/*    */     //   33: invokespecial <init> : ()V
/*    */     //   36: new f/ge0
/*    */     //   39: dup
/*    */     //   40: astore #9
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: getfield Va0 : Lf/Yy0;
/*    */     //   48: iload #4
/*    */     //   50: invokevirtual yO : (I)Lf/vO;
/*    */     //   53: checkcast f/ZA0
/*    */     //   56: astore #4
/*    */     //   58: getfield px0 : [Z
/*    */     //   61: aload #4
/*    */     //   63: swap
/*    */     //   64: aload #7
/*    */     //   66: aload #8
/*    */     //   68: aload #9
/*    */     //   70: aload #5
/*    */     //   72: invokevirtual c1 : (BLf/f20;Lf/ZA0;[ZLf/fQ;Lf/fQ;Lf/ge0;Lf/ge0;)Lf/Ip;
/*    */     //   75: dup
/*    */     //   76: astore #4
/*    */     //   78: getstatic f/js.vu0 : Lf/js;
/*    */     //   81: dup
/*    */     //   82: new f/h70
/*    */     //   85: dup
/*    */     //   86: astore #5
/*    */     //   88: aload #4
/*    */     //   90: aload_0
/*    */     //   91: aload #8
/*    */     //   93: aload #7
/*    */     //   95: iload_1
/*    */     //   96: aload_3
/*    */     //   97: aload #9
/*    */     //   99: iload_2
/*    */     //   100: iload #6
/*    */     //   102: <illegal opcode> run : (Lf/ga0;Lf/fQ;Lf/fQ;BLf/f20;Lf/ge0;II)Ljava/lang/Runnable;
/*    */     //   107: invokespecial <init> : (Lf/JG0;Ljava/lang/Runnable;)V
/*    */     //   110: invokevirtual Ub : ()I
/*    */     //   113: aload #5
/*    */     //   115: swap
/*    */     //   116: invokevirtual si : (Lf/JG0;I)V
/*    */     //   119: iconst_0
/*    */     //   120: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   123: sipush #400
/*    */     //   126: sipush #300
/*    */     //   129: invokevirtual uh0 : (II)V
/*    */     //   132: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 78
/*    */     //   #2	-> 82
/*    */     //   #3	-> 107
/*    */     //   #4	-> 110
/*    */     //   #5	-> 116
/*    */     //   #6	-> 120
/*    */   }
/*    */   
/*    */   private void tn0(fQ paramfQ1, fQ paramfQ2, byte paramByte, f20 paramf20, ge0 paramge0, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: iconst_0
/*    */     //   2: istore_1
/*    */     //   3: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   6: astore #8
/*    */     //   8: aload #8
/*    */     //   10: invokevirtual hasNext : ()Z
/*    */     //   13: ifeq -> 317
/*    */     //   16: aload #8
/*    */     //   18: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   21: checkcast f/ge0
/*    */     //   24: getfield TG0 : Lf/protected;
/*    */     //   27: invokevirtual nm0 : ()Z
/*    */     //   30: ifeq -> 311
/*    */     //   33: aload_2
/*    */     //   34: iload_1
/*    */     //   35: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   38: checkcast f/F80
/*    */     //   41: dup
/*    */     //   42: astore #9
/*    */     //   44: getfield lq : I
/*    */     //   47: iload_3
/*    */     //   48: invokestatic strictfp : (IB)Lf/Wd;
/*    */     //   51: dup
/*    */     //   52: astore #10
/*    */     //   54: ifnonnull -> 58
/*    */     //   57: return
/*    */     //   58: aload #9
/*    */     //   60: aload #10
/*    */     //   62: getfield Va0 : Lf/Yy0;
/*    */     //   65: astore #10
/*    */     //   67: getfield da : I
/*    */     //   70: istore #11
/*    */     //   72: aload #10
/*    */     //   74: getfield ai0 : Lf/fQ;
/*    */     //   77: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   80: astore #10
/*    */     //   82: aload #10
/*    */     //   84: invokevirtual hasNext : ()Z
/*    */     //   87: ifeq -> 112
/*    */     //   90: aload #10
/*    */     //   92: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   95: checkcast f/vO
/*    */     //   98: dup
/*    */     //   99: astore #12
/*    */     //   101: getfield Vk : I
/*    */     //   104: iload #11
/*    */     //   106: if_icmpne -> 82
/*    */     //   109: goto -> 115
/*    */     //   112: aconst_null
/*    */     //   113: astore #12
/*    */     //   115: aload #12
/*    */     //   117: checkcast f/ZA0
/*    */     //   120: aload #4
/*    */     //   122: invokevirtual nH0 : (Lf/f20;)[I
/*    */     //   125: astore #10
/*    */     //   127: iconst_0
/*    */     //   128: istore #11
/*    */     //   130: iload #11
/*    */     //   132: aload #10
/*    */     //   134: arraylength
/*    */     //   135: if_icmpge -> 311
/*    */     //   138: aload #10
/*    */     //   140: iload #11
/*    */     //   142: iaload
/*    */     //   143: aload_0
/*    */     //   144: getfield Zn0 : [I
/*    */     //   147: iload #11
/*    */     //   149: iaload
/*    */     //   150: if_icmpeq -> 301
/*    */     //   153: aload #5
/*    */     //   155: getfield TG0 : Lf/protected;
/*    */     //   158: invokevirtual nm0 : ()Z
/*    */     //   161: ifeq -> 253
/*    */     //   164: iconst_0
/*    */     //   165: istore #12
/*    */     //   167: iload #12
/*    */     //   169: iconst_4
/*    */     //   170: if_icmpge -> 301
/*    */     //   173: iload_3
/*    */     //   174: iload #12
/*    */     //   176: aload_0
/*    */     //   177: getfield YY : I
/*    */     //   180: iload #6
/*    */     //   182: swap
/*    */     //   183: invokestatic jF : (BIII)Z
/*    */     //   186: ifeq -> 247
/*    */     //   189: iload_3
/*    */     //   190: iload #12
/*    */     //   192: iload_3
/*    */     //   193: aload_0
/*    */     //   194: dup
/*    */     //   195: getfield gm0 : Lf/Wd;
/*    */     //   198: astore #13
/*    */     //   200: getfield YY : I
/*    */     //   203: istore #14
/*    */     //   205: aload #13
/*    */     //   207: iload #12
/*    */     //   209: iload #6
/*    */     //   211: iload #7
/*    */     //   213: iload #14
/*    */     //   215: invokestatic Ks0 : (BLf/Wd;IIII)[I
/*    */     //   218: iload #11
/*    */     //   220: aload #9
/*    */     //   222: dup
/*    */     //   223: getfield lq : I
/*    */     //   226: istore #13
/*    */     //   228: getfield da : I
/*    */     //   231: istore #14
/*    */     //   233: iaload
/*    */     //   234: istore #15
/*    */     //   236: iload #13
/*    */     //   238: iload #14
/*    */     //   240: iload #11
/*    */     //   242: iload #15
/*    */     //   244: invokestatic Fr0 : (BIIIBI)V
/*    */     //   247: iinc #12, 1
/*    */     //   250: goto -> 167
/*    */     //   253: iload_3
/*    */     //   254: aload #9
/*    */     //   256: dup
/*    */     //   257: aload_0
/*    */     //   258: getfield SL0 : Lf/W1;
/*    */     //   261: getfield Wa0 : Lf/A60;
/*    */     //   264: getfield go : I
/*    */     //   267: istore #12
/*    */     //   269: getfield lq : I
/*    */     //   272: istore #13
/*    */     //   274: getfield da : I
/*    */     //   277: istore #14
/*    */     //   279: iload #12
/*    */     //   281: aload_0
/*    */     //   282: getfield Zn0 : [I
/*    */     //   285: iload #11
/*    */     //   287: iaload
/*    */     //   288: istore #12
/*    */     //   290: iload #13
/*    */     //   292: iload #14
/*    */     //   294: iload #11
/*    */     //   296: iload #12
/*    */     //   298: invokestatic Fr0 : (BIIIBI)V
/*    */     //   301: iload #11
/*    */     //   303: iconst_1
/*    */     //   304: iadd
/*    */     //   305: i2b
/*    */     //   306: istore #11
/*    */     //   308: goto -> 130
/*    */     //   311: iinc #1, 1
/*    */     //   314: goto -> 8
/*    */     //   317: invokestatic tv0 : ()V
/*    */     //   320: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 27
/*    */     //   #3	-> 35
/*    */     //   #4	-> 74
/*    */     //   #5	-> 77
/*    */     //   #6	-> 117
/*    */     //   #7	-> 122
/*    */     //   #8	-> 134
/*    */     //   #9	-> 155
/*    */     //   #10	-> 158
/*    */     //   #11	-> 177
/*    */     //   #12	-> 261
/*    */     //   #13	-> 264
/*    */     //   #14	-> 269
/*    */   }
/*    */   
/*    */   private void lpT1(int paramInt1, byte paramByte, T0 paramT0, lpt1 paramlpt1, int paramInt2, int paramInt3) {
/*    */     if (paramInt1 >= 0) {
/*    */       int i = this.SL0.Wa0.go;
/*    */       int j = this.YY;
/*    */       IW.Og(paramByte, i, paramInt1, j);
/*    */       vZ(paramByte, paramT0, paramlpt1, paramInt1, paramInt2, paramInt3);
/*    */       IW.tv0();
/*    */     } 
/*    */   }
/*    */   
/*    */   private void VT(int paramInt1, boolean paramBoolean, byte paramByte1, byte paramByte2, int paramInt2, f20 paramf20) {
/*    */     if (paramInt1 >= 0) {
/*    */       if (paramBoolean) {
/*    */         int i = this.SL0.Wa0.go, j = paramByte2 & 0xFF;
/*    */         int k = this.YY;
/*    */         IW.Og(paramByte1, i, j, k);
/*    */       } 
/*    */       ZA0 zA0;
/*    */       int[] arrayOfInt = (zA0 = (ZA0)this.gm0.Va0.yO(paramInt2)).nH0(paramf20);
/*    */       paramInt2 = 0;
/*    */       while (paramInt2 < arrayOfInt.length) {
/*    */         int i;
/*    */         if (arrayOfInt[paramInt2] != (i = this.Zn0[paramInt2])) {
/*    */           int j = this.SL0.Wa0.go;
/*    */           int k = zA0.Vk;
/*    */           IW.Fr0(paramByte1, j, paramInt1, k, paramInt2, i);
/*    */         } 
/*    */         paramInt2 = (byte)(paramInt2 + 1);
/*    */       } 
/*    */       IW.tv0();
/*    */     } 
/*    */   }
/*    */   
/*    */   private void CB0(fk0 paramfk0) {
/*    */     hZ hZ = UB0.vj0.N0(B40.df("./dump/textures/").append(paramfk0.Ih).append(".png").toString());
/*    */     int[] arrayOfInt = this.Zn0;
/*    */     this.gm0.getClass();
/*    */     pB.TJ0(hZ, Wd.IV(paramfk0, this));
/*    */     Wd.IV(paramfk0, this).dispose();
/*    */     js.vu0.Pu(-1, B40.df("Exported to ").append(hZ.rw()).toString());
/*    */   }
/*    */   
/*    */   private void Z8(ge0 paramge0, dQ paramdQ, String paramString) {
/*    */     Ru0 = paramge0.TG0.nm0();
/*    */     this.Ds.cd(UC0(paramdQ, paramString, this.YY));
/*    */   }
/*    */   
/*    */   private void rm0(T0 paramT0, lpt1 paramlpt1, int paramInt1, int paramInt2, int paramInt3) {
/*    */     vZ(km.a3.eA, paramT0, paramlpt1, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private void xp(LPT6 paramLPT6, int paramInt, lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0) {
/*    */     paramLPT6.getClass();
/*    */     this(paramLPT6.eT);
/*    */     pRn pRn;
/*    */     float f1 = (this.fk & 0xFF) / 255.0F, f2 = (this.Ff0 & 0xFF) / 255.0F, f3 = (this.ls & 0xFF) / 255.0F;
/*    */     QI0(paramInt, Color.argb8888(new Color((this.Ge & 0xFF) / 255.0F, f1, f2, f3)), false);
/*    */     A10(paramlpt1, paramfk0, paramZA0, true);
/*    */   }
/*    */   
/*    */   private void RU(int paramInt, LPT6 paramLPT6, lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0) {
/*    */     this.Zn0[paramInt] = this.fa[paramInt];
/*    */     this(this.Zn0[paramInt]);
/*    */     pRn pRn;
/*    */     paramLPT6.getClass();
/*    */     paramLPT6.Yy0(pRn.LpT2());
/*    */     QI0(paramInt, this.Zn0[paramInt], false);
/*    */     A10(paramlpt1, paramfk0, paramZA0, true);
/*    */   }
/*    */   
/*    */   private void W(int paramInt, LPT6 paramLPT6, lpt1 paramlpt1, fk0 paramfk0, ZA0 paramZA0) {
/*    */     int i = this.SL0.Wa0.go;
/*    */     int j = this.V50, k = this.YY;
/*    */     Wd wd = this.gm0;
/*    */     j = this.SL0.Wa0.go;
/*    */     k = this.V50;
/*    */     int m = this.ja0, n = this.YY;
/*    */     int[] arrayOfInt;
/*    */     if (IW.jF(this.tE0, i, j, k) && (arrayOfInt = IW.Ks0(this.tE0, wd, j, k, m, n)) != null) {
/*    */       pRn pRn;
/*    */       this.Zn0[paramInt] = arrayOfInt[paramInt];
/*    */       this(this.Zn0[paramInt]);
/*    */       paramLPT6.getClass();
/*    */       paramLPT6.Yy0(pRn.LpT2());
/*    */       QI0(paramInt, this.Zn0[paramInt], false);
/*    */       A10(paramlpt1, paramfk0, paramZA0, true);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void If0(int paramInt, LPT6 paramLPT6) {
/*    */     this.Zn0[paramInt] = ta(this.Zn0[paramInt]);
/*    */     paramLPT6.getClass();
/*    */     if ((new pRn(paramLPT6.eT)).LpT2() != this.Zn0[paramInt])
/*    */       paramLPT6.Yy0((new pRn(this.Zn0[paramInt])).LpT2()); 
/*    */   }
/*    */   
/*    */   public static Wd strictfp(int paramInt, byte paramByte) {
/*    */     if (paramByte != 4)
/*    */       return null; 
/*    */     if (paramByte != 4)
/*    */       return null; 
/*    */     return (paramInt >= 1000) ? ((paramByte != 3) ? (km.mI0.yE.sM(true).vn0(paramInt - 1000)).Qo0 : (km.mI0.MT.EI0.vn0(paramInt - 1000)).Qo0) : ((paramByte != 3) ? km.mI0.yE.oB(VV.Dv0, paramInt) : km.mI0.MT.oB(VV.Dv0, paramInt));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ga0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */