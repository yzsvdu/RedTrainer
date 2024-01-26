/*    */ package f;public class Or extends yF { public static final int[][] vd; public static final int[][] p30; public static final int[][] r20; public static final int[][] ps; public Color Pl0; public Color Ht; public final void Mv() { Kr0 kr0; byte b;
/*  2 */     if ((b = (kr0 = this.QH0).HW.FB) == 0) { this
/*    */ 
/*    */ 
/*    */         
/*  6 */         .Gj0 = G00.Av0.Cx0(b, kr0.zH0, false).V(11); } else if (b == 1) { this
/*    */ 
/*    */ 
/*    */         
/* 10 */         .Gj0 = G00.Av0.Cx0(b, kr0.zH0, false).V(12); }
/*    */     else
/* 12 */     { this.Bm0.y = 2.0F; Xi xi;
/* 13 */       if (b == 3 && kr0.zH0 == 230 && (xi = km.wI0.iJ0) != null)
/* 14 */         Hk();  }  } public Kr0 QH0; public uT Xk0; public uT WC; public float Oi; public lpt1 COm5; public Or(Kr0 paramKr0) { super(paramKr0); this.QH0 = paramKr0; } static { int[] arrayOfInt; (arrayOfInt = new int[4])[0] = 11; (new int[4])[1] = 12; (new int[4])[2] = 13; (new int[4])[3] = 14; (new int[4][])[0] = arrayOfInt; (arrayOfInt = new int[4])[0] = 0; (new int[4])[1] = 8; (new int[4])[2] = 9; (new int[4])[3] = 10; (new int[4][])[1] = arrayOfInt; (arrayOfInt = new int[4])[0] = 15; (new int[4])[1] = 1; (new int[4])[2] = 2; (new int[4])[3] = 3; (new int[4][])[2] = arrayOfInt; (arrayOfInt = new int[4])[0] = 4; (new int[4])[1] = 5; (new int[4])[2] = 6; (new int[4])[3] = 7; vd = new int[][] { null, null, null, arrayOfInt }; (arrayOfInt = new int[4])[0] = 2; (new int[4])[1] = 3; (new int[4])[2] = 2; (new int[4])[3] = 3; (new int[4][])[0] = arrayOfInt; (arrayOfInt = new int[4])[0] = 0; (new int[4])[1] = 1; (new int[4])[2] = 0; (new int[4])[3] = 1; (new int[4][])[1] = arrayOfInt; (arrayOfInt = new int[4])[0] = 4; (new int[4])[1] = 5; (new int[4])[2] = 4; (new int[4])[3] = 5; (new int[4][])[2] = arrayOfInt; (arrayOfInt = new int[4])[0] = 6; (new int[4])[1] = 7; (new int[4])[2] = 6; (new int[4])[3] = 7; p30 = new int[][] { null, null, null, arrayOfInt }; (arrayOfInt = new int[4])[0] = 12; (new int[4])[1] = 13; (new int[4])[2] = 14; (new int[4])[3] = 15; (new int[4][])[0] = arrayOfInt; (arrayOfInt = new int[4])[0] = 0; (new int[4])[1] = 9; (new int[4])[2] = 10; (new int[4])[3] = 11; (new int[4][])[1] = arrayOfInt; (arrayOfInt = new int[4])[0] = 16; (new int[4])[1] = 1; (new int[4])[2] = 2; (new int[4])[3] = 3; (new int[4][])[2] = arrayOfInt; (arrayOfInt = new int[4])[0] = 4; (new int[4])[1] = 5; (new int[4])[2] = 6; (new int[4])[3] = 7; r20 = new int[][] { null, null, null, arrayOfInt }; (arrayOfInt = new int[4])[0] = 27; (new int[4])[1] = 28; (new int[4])[2] = 29; (new int[4])[3] = 30; (new int[4][])[0] = arrayOfInt; (arrayOfInt = new int[4])[0] = 0; (new int[4])[1] = 11; (new int[4])[2] = 0; (new int[4])[3] = 26; (new int[4][])[1] = arrayOfInt; (arrayOfInt = new int[4])[0] = 2; (new int[4])[1] = 1; (new int[4])[2] = 2; (new int[4])[3] = 3; (new int[4][])[2] = arrayOfInt; (arrayOfInt = new int[4])[0] = 4; (new int[4])[1] = 5; (new int[4])[2] = 6; (new int[4])[3] = 7; ps = new int[][] { null, null, null, arrayOfInt }; } public boolean t0(tH paramtH, int paramInt, boolean paramBoolean) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield QH0 : Lf/Kr0;
/*    */     //   4: dup
/*    */     //   5: dup
/*    */     //   6: getfield pm : Lf/d7;
/*    */     //   9: getfield Mv : Lf/nl;
/*    */     //   12: astore #4
/*    */     //   14: getfield zH0 : S
/*    */     //   17: istore #5
/*    */     //   19: getfield hG0 : B
/*    */     //   22: dup
/*    */     //   23: istore #6
/*    */     //   25: iconst_1
/*    */     //   26: if_icmpne -> 85
/*    */     //   29: iload #5
/*    */     //   31: sipush #207
/*    */     //   34: if_icmpne -> 76
/*    */     //   37: aload_0
/*    */     //   38: iconst_0
/*    */     //   39: istore_3
/*    */     //   40: invokevirtual DE0 : ()B
/*    */     //   43: iconst_3
/*    */     //   44: if_icmpne -> 50
/*    */     //   47: iinc #2, 1
/*    */     //   50: aload #4
/*    */     //   52: ifnull -> 63
/*    */     //   55: aload #4
/*    */     //   57: getfield fv0 : Z
/*    */     //   60: ifne -> 71
/*    */     //   63: aload #4
/*    */     //   65: getstatic f/nl.Com8 : Lf/nl;
/*    */     //   68: if_acmpne -> 85
/*    */     //   71: iconst_4
/*    */     //   72: istore_2
/*    */     //   73: goto -> 85
/*    */     //   76: iload #5
/*    */     //   78: bipush #94
/*    */     //   80: if_icmpne -> 85
/*    */     //   83: iconst_0
/*    */     //   84: istore_3
/*    */     //   85: iload #5
/*    */     //   87: ifne -> 92
/*    */     //   90: iconst_1
/*    */     //   91: ireturn
/*    */     //   92: aload_0
/*    */     //   93: getstatic f/km.si0 : Lf/My;
/*    */     //   96: aload_0
/*    */     //   97: getfield QH0 : Lf/Kr0;
/*    */     //   100: invokevirtual dz : (Lf/Kr0;)V
/*    */     //   103: getfield QH0 : Lf/Kr0;
/*    */     //   106: dup
/*    */     //   107: astore #4
/*    */     //   109: getfield Y50 : S
/*    */     //   112: ifle -> 123
/*    */     //   115: aload_0
/*    */     //   116: aload_1
/*    */     //   117: iload_2
/*    */     //   118: iload_3
/*    */     //   119: invokespecial t0 : (Lf/tH;IZ)Z
/*    */     //   122: ireturn
/*    */     //   123: iload #6
/*    */     //   125: aconst_null
/*    */     //   126: astore #7
/*    */     //   128: iconst_0
/*    */     //   129: istore #8
/*    */     //   131: aconst_null
/*    */     //   132: astore #9
/*    */     //   134: bipush #10
/*    */     //   136: if_icmpne -> 145
/*    */     //   139: iconst_1
/*    */     //   140: istore #10
/*    */     //   142: goto -> 148
/*    */     //   145: iconst_0
/*    */     //   146: istore #10
/*    */     //   148: iload #10
/*    */     //   150: aload #4
/*    */     //   152: getfield Ku : F
/*    */     //   155: fstore #4
/*    */     //   157: ifne -> 228
/*    */     //   160: getstatic f/h1.X2 : Z
/*    */     //   163: ifeq -> 228
/*    */     //   166: getstatic f/km.mI0 : Lf/P1;
/*    */     //   169: getfield yE : Lf/BE;
/*    */     //   172: ifnull -> 228
/*    */     //   175: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   178: iload #6
/*    */     //   180: iload #5
/*    */     //   182: iconst_0
/*    */     //   183: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   186: dup
/*    */     //   187: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   190: pop
/*    */     //   191: instanceof f/Yq0
/*    */     //   194: ifne -> 228
/*    */     //   197: getstatic f/km.mI0 : Lf/P1;
/*    */     //   200: getfield yE : Lf/BE;
/*    */     //   203: iload #6
/*    */     //   205: iload_2
/*    */     //   206: i2s
/*    */     //   207: iload #5
/*    */     //   209: swap
/*    */     //   210: invokevirtual JA0 : (BSS)Lf/U70;
/*    */     //   213: dup
/*    */     //   214: astore #9
/*    */     //   216: ifnull -> 225
/*    */     //   219: iconst_1
/*    */     //   220: istore #8
/*    */     //   222: goto -> 228
/*    */     //   225: iconst_0
/*    */     //   226: istore #8
/*    */     //   228: aload #9
/*    */     //   230: ifnonnull -> 253
/*    */     //   233: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   236: iload #6
/*    */     //   238: iload #5
/*    */     //   240: iconst_0
/*    */     //   241: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   244: dup
/*    */     //   245: astore #7
/*    */     //   247: iload_2
/*    */     //   248: invokevirtual LT : (I)Lf/U70;
/*    */     //   251: astore #9
/*    */     //   253: aload #9
/*    */     //   255: aload_0
/*    */     //   256: getfield ao : Lf/eo;
/*    */     //   259: dup
/*    */     //   260: getfield x : F
/*    */     //   263: f2i
/*    */     //   264: istore #11
/*    */     //   266: getfield y : F
/*    */     //   269: f2i
/*    */     //   270: istore #12
/*    */     //   272: ifnonnull -> 277
/*    */     //   275: iconst_1
/*    */     //   276: ireturn
/*    */     //   277: iload #8
/*    */     //   279: ifne -> 512
/*    */     //   282: iload #10
/*    */     //   284: ifeq -> 290
/*    */     //   287: goto -> 512
/*    */     //   290: aload #7
/*    */     //   292: invokevirtual cOM3 : ()B
/*    */     //   295: iconst_m1
/*    */     //   296: if_icmpeq -> 383
/*    */     //   299: aload_1
/*    */     //   300: aload #9
/*    */     //   302: aload_0
/*    */     //   303: sipush #255
/*    */     //   306: aload_1
/*    */     //   307: invokevirtual xS : (ILf/tH;)V
/*    */     //   310: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   313: dup
/*    */     //   314: dup2
/*    */     //   315: dup2
/*    */     //   316: astore_2
/*    */     //   317: iload #12
/*    */     //   319: aload_2
/*    */     //   320: iload #11
/*    */     //   322: i2f
/*    */     //   323: aload_2
/*    */     //   324: invokevirtual getWidth : ()I
/*    */     //   327: bipush #16
/*    */     //   329: isub
/*    */     //   330: i2f
/*    */     //   331: fconst_2
/*    */     //   332: fdiv
/*    */     //   333: fsub
/*    */     //   334: fstore_2
/*    */     //   335: invokevirtual getHeight : ()I
/*    */     //   338: bipush #16
/*    */     //   340: isub
/*    */     //   341: isub
/*    */     //   342: i2f
/*    */     //   343: fstore #4
/*    */     //   345: invokevirtual getWidth : ()I
/*    */     //   348: i2f
/*    */     //   349: fstore #5
/*    */     //   351: invokevirtual getHeight : ()I
/*    */     //   354: i2f
/*    */     //   355: fstore #6
/*    */     //   357: invokevirtual getWidth : ()I
/*    */     //   360: istore #7
/*    */     //   362: invokevirtual getHeight : ()I
/*    */     //   365: istore #8
/*    */     //   367: fload_2
/*    */     //   368: fload #4
/*    */     //   370: fload #5
/*    */     //   372: fload #6
/*    */     //   374: iload #7
/*    */     //   376: iload #8
/*    */     //   378: iload_3
/*    */     //   379: iconst_0
/*    */     //   380: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   383: aload_0
/*    */     //   384: getfield QH0 : Lf/Kr0;
/*    */     //   387: getfield b50 : Z
/*    */     //   390: ifeq -> 1313
/*    */     //   393: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   396: bipush #10
/*    */     //   398: sipush #298
/*    */     //   401: iconst_1
/*    */     //   402: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   405: getstatic f/zm0.u20 : J
/*    */     //   408: ldc2_w 200
/*    */     //   411: ldiv
/*    */     //   412: l2i
/*    */     //   413: bipush #9
/*    */     //   415: irem
/*    */     //   416: invokevirtual LT : (I)Lf/U70;
/*    */     //   419: dup
/*    */     //   420: astore_0
/*    */     //   421: ifnull -> 1313
/*    */     //   424: aload_1
/*    */     //   425: dup
/*    */     //   426: aload_0
/*    */     //   427: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   430: dup
/*    */     //   431: dup2
/*    */     //   432: dup2
/*    */     //   433: astore_0
/*    */     //   434: iload #12
/*    */     //   436: aload_0
/*    */     //   437: iload #11
/*    */     //   439: aload_1
/*    */     //   440: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   443: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   446: i2f
/*    */     //   447: aload_0
/*    */     //   448: invokevirtual getWidth : ()I
/*    */     //   451: bipush #16
/*    */     //   453: isub
/*    */     //   454: i2f
/*    */     //   455: fconst_2
/*    */     //   456: fdiv
/*    */     //   457: fsub
/*    */     //   458: fstore_0
/*    */     //   459: invokevirtual getHeight : ()I
/*    */     //   462: bipush #16
/*    */     //   464: isub
/*    */     //   465: isub
/*    */     //   466: i2f
/*    */     //   467: fstore_1
/*    */     //   468: invokevirtual getWidth : ()I
/*    */     //   471: i2f
/*    */     //   472: fstore_2
/*    */     //   473: invokevirtual getHeight : ()I
/*    */     //   476: i2f
/*    */     //   477: fstore #4
/*    */     //   479: invokevirtual getWidth : ()I
/*    */     //   482: istore #5
/*    */     //   484: invokevirtual getHeight : ()I
/*    */     //   487: istore #6
/*    */     //   489: fload_0
/*    */     //   490: fload_1
/*    */     //   491: fload_2
/*    */     //   492: fload #4
/*    */     //   494: iload #5
/*    */     //   496: iload #6
/*    */     //   498: iload_3
/*    */     //   499: iconst_0
/*    */     //   500: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   503: getstatic f/Xc0.Nn0 : F
/*    */     //   506: invokevirtual og0 : (F)V
/*    */     //   509: goto -> 1313
/*    */     //   512: iload #5
/*    */     //   514: ldc 0.5
/*    */     //   516: fstore #7
/*    */     //   518: getstatic f/G00.f00 : Lf/Cs;
/*    */     //   521: pop
/*    */     //   522: lookupswitch default -> 676, 201 -> 682, 240 -> 682, 241 -> 682, 280 -> 682, 281 -> 682, 282 -> 682, 286 -> 682, 287 -> 682, 288 -> 682, 289 -> 682, 290 -> 682, 291 -> 682, 294 -> 682, 295 -> 682, 296 -> 682, 299 -> 682, 301 -> 682, 302 -> 682
/*    */     //   676: iconst_1
/*    */     //   677: istore #8
/*    */     //   679: goto -> 685
/*    */     //   682: iconst_0
/*    */     //   683: istore #8
/*    */     //   685: iload #10
/*    */     //   687: ifeq -> 737
/*    */     //   690: iload #5
/*    */     //   692: sipush #240
/*    */     //   695: if_icmpeq -> 732
/*    */     //   698: iload #5
/*    */     //   700: sipush #288
/*    */     //   703: if_icmpne -> 709
/*    */     //   706: goto -> 732
/*    */     //   709: iload #5
/*    */     //   711: sipush #241
/*    */     //   714: if_icmpeq -> 725
/*    */     //   717: iload #5
/*    */     //   719: sipush #289
/*    */     //   722: if_icmpne -> 737
/*    */     //   725: ldc 32.0
/*    */     //   727: fstore #7
/*    */     //   729: goto -> 737
/*    */     //   732: ldc_w 24.0
/*    */     //   735: fstore #7
/*    */     //   737: iload #8
/*    */     //   739: ifeq -> 750
/*    */     //   742: aload_0
/*    */     //   743: sipush #255
/*    */     //   746: aload_1
/*    */     //   747: invokevirtual xS : (ILf/tH;)V
/*    */     //   750: iload #5
/*    */     //   752: aload #9
/*    */     //   754: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   757: dup
/*    */     //   758: dup
/*    */     //   759: astore #8
/*    */     //   761: invokevirtual getWidth : ()I
/*    */     //   764: i2f
/*    */     //   765: fload #4
/*    */     //   767: fmul
/*    */     //   768: f2i
/*    */     //   769: istore #9
/*    */     //   771: invokevirtual getHeight : ()I
/*    */     //   774: i2f
/*    */     //   775: fload #4
/*    */     //   777: fmul
/*    */     //   778: f2i
/*    */     //   779: istore #4
/*    */     //   781: tableswitch default -> 808, 294 -> 814, 295 -> 814, 296 -> 814
/*    */     //   808: iconst_0
/*    */     //   809: istore #13
/*    */     //   811: goto -> 817
/*    */     //   814: iconst_1
/*    */     //   815: istore #13
/*    */     //   817: iload #13
/*    */     //   819: ifeq -> 843
/*    */     //   822: aload_0
/*    */     //   823: dup
/*    */     //   824: getfield QH0 : Lf/Kr0;
/*    */     //   827: getfield HW : Lf/G5;
/*    */     //   830: getfield FB : B
/*    */     //   833: iload #5
/*    */     //   835: invokevirtual De0 : (BS)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   838: astore #13
/*    */     //   840: goto -> 899
/*    */     //   843: iload #5
/*    */     //   845: sipush #301
/*    */     //   848: if_icmpne -> 857
/*    */     //   851: iconst_1
/*    */     //   852: istore #13
/*    */     //   854: goto -> 860
/*    */     //   857: iconst_0
/*    */     //   858: istore #13
/*    */     //   860: iload #13
/*    */     //   862: ifeq -> 992
/*    */     //   865: aload_0
/*    */     //   866: getfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   869: ifnonnull -> 893
/*    */     //   872: aload_0
/*    */     //   873: new com/badlogic/gdx/graphics/Color
/*    */     //   876: dup
/*    */     //   877: astore #13
/*    */     //   879: fconst_1
/*    */     //   880: fconst_1
/*    */     //   881: fconst_1
/*    */     //   882: ldc_w 0.8
/*    */     //   885: invokespecial <init> : (FFFF)V
/*    */     //   888: aload #13
/*    */     //   890: putfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   893: aload_0
/*    */     //   894: getfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   897: astore #13
/*    */     //   899: aload_1
/*    */     //   900: dup
/*    */     //   901: aload #8
/*    */     //   903: dup
/*    */     //   904: dup
/*    */     //   905: iload #12
/*    */     //   907: iload #11
/*    */     //   909: aload_1
/*    */     //   910: aload #13
/*    */     //   912: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   915: i2f
/*    */     //   916: fload #7
/*    */     //   918: fadd
/*    */     //   919: iload #9
/*    */     //   921: i2f
/*    */     //   922: ldc_w 0.751
/*    */     //   925: fmul
/*    */     //   926: dup
/*    */     //   927: fstore #8
/*    */     //   929: ldc_w 16.0
/*    */     //   932: fsub
/*    */     //   933: fconst_2
/*    */     //   934: fdiv
/*    */     //   935: fsub
/*    */     //   936: fstore #13
/*    */     //   938: i2f
/*    */     //   939: iload #4
/*    */     //   941: i2f
/*    */     //   942: ldc_w 0.751
/*    */     //   945: fmul
/*    */     //   946: dup
/*    */     //   947: fstore #14
/*    */     //   949: ldc_w 16.0
/*    */     //   952: fsub
/*    */     //   953: fsub
/*    */     //   954: fstore #15
/*    */     //   956: invokevirtual getWidth : ()I
/*    */     //   959: istore #16
/*    */     //   961: invokevirtual getHeight : ()I
/*    */     //   964: istore #17
/*    */     //   966: fload #13
/*    */     //   968: fload #15
/*    */     //   970: fload #8
/*    */     //   972: fload #14
/*    */     //   974: iload #16
/*    */     //   976: iload #17
/*    */     //   978: iload_3
/*    */     //   979: iconst_0
/*    */     //   980: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   983: getstatic f/Xc0.Nn0 : F
/*    */     //   986: invokevirtual og0 : (F)V
/*    */     //   989: goto -> 1069
/*    */     //   992: aload_1
/*    */     //   993: aload #8
/*    */     //   995: dup
/*    */     //   996: dup
/*    */     //   997: iload #12
/*    */     //   999: iload #11
/*    */     //   1001: i2f
/*    */     //   1002: fload #7
/*    */     //   1004: fadd
/*    */     //   1005: iload #9
/*    */     //   1007: i2f
/*    */     //   1008: ldc_w 0.751
/*    */     //   1011: fmul
/*    */     //   1012: dup
/*    */     //   1013: fstore #8
/*    */     //   1015: ldc_w 16.0
/*    */     //   1018: fsub
/*    */     //   1019: fconst_2
/*    */     //   1020: fdiv
/*    */     //   1021: fsub
/*    */     //   1022: fstore #13
/*    */     //   1024: i2f
/*    */     //   1025: iload #4
/*    */     //   1027: i2f
/*    */     //   1028: ldc_w 0.751
/*    */     //   1031: fmul
/*    */     //   1032: dup
/*    */     //   1033: fstore #14
/*    */     //   1035: ldc_w 16.0
/*    */     //   1038: fsub
/*    */     //   1039: fsub
/*    */     //   1040: fstore #15
/*    */     //   1042: invokevirtual getWidth : ()I
/*    */     //   1045: istore #16
/*    */     //   1047: invokevirtual getHeight : ()I
/*    */     //   1050: istore #17
/*    */     //   1052: fload #13
/*    */     //   1054: fload #15
/*    */     //   1056: fload #8
/*    */     //   1058: fload #14
/*    */     //   1060: iload #16
/*    */     //   1062: iload #17
/*    */     //   1064: iload_3
/*    */     //   1065: iconst_0
/*    */     //   1066: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   1069: iload #10
/*    */     //   1071: ifeq -> 1185
/*    */     //   1074: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   1077: iload #6
/*    */     //   1079: iload #5
/*    */     //   1081: iconst_1
/*    */     //   1082: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   1085: iload_2
/*    */     //   1086: invokevirtual LT : (I)Lf/U70;
/*    */     //   1089: dup
/*    */     //   1090: astore_2
/*    */     //   1091: ifnull -> 1185
/*    */     //   1094: aload_1
/*    */     //   1095: dup
/*    */     //   1096: aload_2
/*    */     //   1097: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1100: dup
/*    */     //   1101: dup
/*    */     //   1102: iload #12
/*    */     //   1104: iload #11
/*    */     //   1106: aload_1
/*    */     //   1107: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1110: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   1113: i2f
/*    */     //   1114: fload #7
/*    */     //   1116: fadd
/*    */     //   1117: iload #9
/*    */     //   1119: i2f
/*    */     //   1120: ldc_w 0.751
/*    */     //   1123: fmul
/*    */     //   1124: dup
/*    */     //   1125: fstore_2
/*    */     //   1126: ldc_w 16.0
/*    */     //   1129: fsub
/*    */     //   1130: fconst_2
/*    */     //   1131: fdiv
/*    */     //   1132: fsub
/*    */     //   1133: fstore #5
/*    */     //   1135: i2f
/*    */     //   1136: iload #4
/*    */     //   1138: i2f
/*    */     //   1139: ldc_w 0.751
/*    */     //   1142: fmul
/*    */     //   1143: dup
/*    */     //   1144: fstore #6
/*    */     //   1146: ldc_w 16.0
/*    */     //   1149: fsub
/*    */     //   1150: fsub
/*    */     //   1151: fstore #8
/*    */     //   1153: invokevirtual getWidth : ()I
/*    */     //   1156: istore #10
/*    */     //   1158: invokevirtual getHeight : ()I
/*    */     //   1161: istore #13
/*    */     //   1163: fload #5
/*    */     //   1165: fload #8
/*    */     //   1167: fload_2
/*    */     //   1168: fload #6
/*    */     //   1170: iload #10
/*    */     //   1172: iload #13
/*    */     //   1174: iload_3
/*    */     //   1175: iconst_0
/*    */     //   1176: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   1179: getstatic f/Xc0.Nn0 : F
/*    */     //   1182: invokevirtual og0 : (F)V
/*    */     //   1185: aload_0
/*    */     //   1186: getfield QH0 : Lf/Kr0;
/*    */     //   1189: getfield b50 : Z
/*    */     //   1192: ifeq -> 1313
/*    */     //   1195: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   1198: bipush #10
/*    */     //   1200: sipush #298
/*    */     //   1203: iconst_1
/*    */     //   1204: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   1207: getstatic f/zm0.u20 : J
/*    */     //   1210: ldc2_w 200
/*    */     //   1213: ldiv
/*    */     //   1214: l2i
/*    */     //   1215: bipush #9
/*    */     //   1217: irem
/*    */     //   1218: invokevirtual LT : (I)Lf/U70;
/*    */     //   1221: dup
/*    */     //   1222: astore_0
/*    */     //   1223: ifnull -> 1313
/*    */     //   1226: aload_1
/*    */     //   1227: dup
/*    */     //   1228: aload_0
/*    */     //   1229: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1232: dup
/*    */     //   1233: dup
/*    */     //   1234: iload #12
/*    */     //   1236: iload #11
/*    */     //   1238: aload_1
/*    */     //   1239: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1242: invokevirtual HK0 : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   1245: i2f
/*    */     //   1246: fload #7
/*    */     //   1248: fadd
/*    */     //   1249: iload #9
/*    */     //   1251: i2f
/*    */     //   1252: ldc_w 0.751
/*    */     //   1255: fmul
/*    */     //   1256: dup
/*    */     //   1257: fstore_0
/*    */     //   1258: ldc_w 16.0
/*    */     //   1261: fsub
/*    */     //   1262: fconst_2
/*    */     //   1263: fdiv
/*    */     //   1264: fsub
/*    */     //   1265: fstore_1
/*    */     //   1266: i2f
/*    */     //   1267: iload #4
/*    */     //   1269: i2f
/*    */     //   1270: ldc_w 0.751
/*    */     //   1273: fmul
/*    */     //   1274: dup
/*    */     //   1275: fstore_2
/*    */     //   1276: ldc_w 16.0
/*    */     //   1279: fsub
/*    */     //   1280: fsub
/*    */     //   1281: fstore #4
/*    */     //   1283: invokevirtual getWidth : ()I
/*    */     //   1286: istore #5
/*    */     //   1288: invokevirtual getHeight : ()I
/*    */     //   1291: istore #6
/*    */     //   1293: fload_1
/*    */     //   1294: fload #4
/*    */     //   1296: fload_0
/*    */     //   1297: fload_2
/*    */     //   1298: iload #5
/*    */     //   1300: iload #6
/*    */     //   1302: iload_3
/*    */     //   1303: iconst_0
/*    */     //   1304: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   1307: getstatic f/Xc0.Nn0 : F
/*    */     //   1310: invokevirtual og0 : (F)V
/*    */     //   1313: iconst_1
/*    */     //   1314: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 9
/*    */     //   #3	-> 14
/*    */     //   #4	-> 19
/*    */     //   #5	-> 40
/*    */     //   #6	-> 57
/*    */     //   #7	-> 65
/*    */     //   #8	-> 109
/*    */     //   #9	-> 119
/*    */     //   #10	-> 152
/*    */     //   #11	-> 160
/*    */     //   #12	-> 175
/*    */     //   #13	-> 183
/*    */     //   #14	-> 187
/*    */     //   #15	-> 191
/*    */     //   #16	-> 197
/*    */     //   #17	-> 233
/*    */     //   #18	-> 241
/*    */     //   #19	-> 248
/*    */     //   #20	-> 387
/*    */     //   #21	-> 393
/*    */     //   #22	-> 402
/*    */     //   #23	-> 405
/*    */     //   #24	-> 411
/*    */     //   #25	-> 827
/*    */     //   #26	-> 830
/*    */     //   #27	-> 835
/*    */     //   #28	-> 866
/*    */     //   #29	-> 912
/*    */     //   #30	-> 1074
/*    */     //   #31	-> 1082
/*    */     //   #32	-> 1189
/*    */     //   #33	-> 1195
/*    */     //   #34	-> 1204
/*    */     //   #35	-> 1207
/*    */     //   #36	-> 1213 } public boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield QH0 : Lf/Kr0;
/*    */     //   4: dup
/*    */     //   5: dup
/*    */     //   6: astore #6
/*    */     //   8: getfield zH0 : S
/*    */     //   11: istore #7
/*    */     //   13: getfield hG0 : B
/*    */     //   16: istore #8
/*    */     //   18: getstatic f/km.mI0 : Lf/P1;
/*    */     //   21: getfield AN : Lf/Wo;
/*    */     //   24: ifnonnull -> 29
/*    */     //   27: iconst_1
/*    */     //   28: ireturn
/*    */     //   29: iload #7
/*    */     //   31: ifne -> 48
/*    */     //   34: iload #8
/*    */     //   36: iconst_3
/*    */     //   37: if_icmpeq -> 48
/*    */     //   40: iload #8
/*    */     //   42: iconst_4
/*    */     //   43: if_icmpeq -> 48
/*    */     //   46: iconst_1
/*    */     //   47: ireturn
/*    */     //   48: aload_0
/*    */     //   49: getstatic f/km.si0 : Lf/My;
/*    */     //   52: aload #6
/*    */     //   54: invokevirtual dz : (Lf/Kr0;)V
/*    */     //   57: getfield QH0 : Lf/Kr0;
/*    */     //   60: getfield Y50 : S
/*    */     //   63: ifle -> 78
/*    */     //   66: aload_0
/*    */     //   67: aload_1
/*    */     //   68: aload_2
/*    */     //   69: aload_3
/*    */     //   70: iload #4
/*    */     //   72: iload #5
/*    */     //   74: invokespecial II0 : (Lf/Ih0;Lf/K70;Lf/fo0;IZ)Z
/*    */     //   77: ireturn
/*    */     //   78: iload #7
/*    */     //   80: invokestatic IV : ()Lf/hX;
/*    */     //   83: aload_0
/*    */     //   84: getfield QH0 : Lf/Kr0;
/*    */     //   87: getfield HW : Lf/G5;
/*    */     //   90: getfield FB : B
/*    */     //   93: istore #5
/*    */     //   95: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   98: pop
/*    */     //   99: iload #5
/*    */     //   101: invokestatic aR : (IB)Z
/*    */     //   104: ifeq -> 454
/*    */     //   107: getstatic f/hX.q2 : Z
/*    */     //   110: ifne -> 116
/*    */     //   113: goto -> 157
/*    */     //   116: aload_0
/*    */     //   117: getfield COm5 : Lf/lpt1;
/*    */     //   120: ifnull -> 157
/*    */     //   123: getstatic f/UB0.PU : Lf/aY;
/*    */     //   126: bipush #59
/*    */     //   128: invokevirtual Ak : (I)Z
/*    */     //   131: ifeq -> 157
/*    */     //   134: getstatic f/UB0.PU : Lf/aY;
/*    */     //   137: bipush #46
/*    */     //   139: invokevirtual j2 : (I)Z
/*    */     //   142: ifeq -> 157
/*    */     //   145: aload_0
/*    */     //   146: dup
/*    */     //   147: getfield COm5 : Lf/lpt1;
/*    */     //   150: invokevirtual Ea0 : ()V
/*    */     //   153: aconst_null
/*    */     //   154: putfield COm5 : Lf/lpt1;
/*    */     //   157: aload_0
/*    */     //   158: getfield QH0 : Lf/Kr0;
/*    */     //   161: getfield jF : Z
/*    */     //   164: ifeq -> 195
/*    */     //   167: aload_0
/*    */     //   168: getfield COm5 : Lf/lpt1;
/*    */     //   171: dup
/*    */     //   172: astore #4
/*    */     //   174: ifnull -> 187
/*    */     //   177: aload_0
/*    */     //   178: aload #4
/*    */     //   180: invokevirtual Ea0 : ()V
/*    */     //   183: aconst_null
/*    */     //   184: putfield COm5 : Lf/lpt1;
/*    */     //   187: aload_0
/*    */     //   188: getfield QH0 : Lf/Kr0;
/*    */     //   191: iconst_0
/*    */     //   192: putfield jF : Z
/*    */     //   195: aload_0
/*    */     //   196: getfield COm5 : Lf/lpt1;
/*    */     //   199: ifnonnull -> 214
/*    */     //   202: aload_0
/*    */     //   203: invokestatic IV : ()Lf/hX;
/*    */     //   206: iload #7
/*    */     //   208: invokevirtual eg : (I)Lf/lpt1;
/*    */     //   211: putfield COm5 : Lf/lpt1;
/*    */     //   214: aload_0
/*    */     //   215: getfield COm5 : Lf/lpt1;
/*    */     //   218: dup
/*    */     //   219: astore #4
/*    */     //   221: ifnonnull -> 226
/*    */     //   224: iconst_1
/*    */     //   225: ireturn
/*    */     //   226: iload #7
/*    */     //   228: sipush #2800
/*    */     //   231: if_icmpne -> 263
/*    */     //   234: aload_0
/*    */     //   235: getfield ao : Lf/eo;
/*    */     //   238: dup
/*    */     //   239: dup2
/*    */     //   240: getfield y : F
/*    */     //   243: ldc_w 0.04
/*    */     //   246: fsub
/*    */     //   247: putfield y : F
/*    */     //   250: getfield z : F
/*    */     //   253: ldc_w 0.12
/*    */     //   256: fadd
/*    */     //   257: putfield z : F
/*    */     //   260: goto -> 308
/*    */     //   263: iload #7
/*    */     //   265: sipush #2810
/*    */     //   268: if_icmpne -> 308
/*    */     //   271: aload_0
/*    */     //   272: getfield ao : Lf/eo;
/*    */     //   275: dup
/*    */     //   276: dup2
/*    */     //   277: dup2
/*    */     //   278: getfield y : F
/*    */     //   281: ldc_w 0.02
/*    */     //   284: fsub
/*    */     //   285: putfield y : F
/*    */     //   288: getfield z : F
/*    */     //   291: ldc_w 0.29
/*    */     //   294: fsub
/*    */     //   295: putfield z : F
/*    */     //   298: getfield x : F
/*    */     //   301: ldc_w 0.01
/*    */     //   304: fsub
/*    */     //   305: putfield x : F
/*    */     //   308: iload #7
/*    */     //   310: aload_2
/*    */     //   311: aload_0
/*    */     //   312: dup
/*    */     //   313: aload #4
/*    */     //   315: aload_0
/*    */     //   316: getfield ao : Lf/eo;
/*    */     //   319: invokevirtual M70 : (Lf/eo;)V
/*    */     //   322: getfield COm5 : Lf/lpt1;
/*    */     //   325: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   328: getfield Qy : F
/*    */     //   331: fconst_0
/*    */     //   332: swap
/*    */     //   333: invokevirtual Ud0 : (FF)V
/*    */     //   336: getfield COm5 : Lf/lpt1;
/*    */     //   339: aload_3
/*    */     //   340: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   343: lookupswitch default -> 416, 2010 -> 425, 2050 -> 425, 2400 -> 423, 2800 -> 423, 2810 -> 423, 2820 -> 423, 2860 -> 423, 2890 -> 423
/*    */     //   416: aload_0
/*    */     //   417: aload_1
/*    */     //   418: iconst_0
/*    */     //   419: istore_0
/*    */     //   420: goto -> 445
/*    */     //   423: iconst_1
/*    */     //   424: ireturn
/*    */     //   425: aload_0
/*    */     //   426: getfield COm5 : Lf/lpt1;
/*    */     //   429: getfield ky : Lf/lpt1;
/*    */     //   432: dup
/*    */     //   433: astore_0
/*    */     //   434: ifnull -> 443
/*    */     //   437: aload_2
/*    */     //   438: aload_0
/*    */     //   439: aload_3
/*    */     //   440: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   443: iconst_1
/*    */     //   444: ireturn
/*    */     //   445: aload_2
/*    */     //   446: aload_3
/*    */     //   447: iconst_0
/*    */     //   448: iload_0
/*    */     //   449: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   452: iconst_1
/*    */     //   453: ireturn
/*    */     //   454: iload #8
/*    */     //   456: bipush #10
/*    */     //   458: if_icmpne -> 465
/*    */     //   461: iconst_1
/*    */     //   462: goto -> 466
/*    */     //   465: iconst_0
/*    */     //   466: ifeq -> 1465
/*    */     //   469: iload #7
/*    */     //   471: sipush #2000
/*    */     //   474: if_icmplt -> 485
/*    */     //   477: iload #7
/*    */     //   479: bipush #10
/*    */     //   481: idiv
/*    */     //   482: i2s
/*    */     //   483: istore #7
/*    */     //   485: iload #7
/*    */     //   487: getstatic f/G00.f00 : Lf/Cs;
/*    */     //   490: pop
/*    */     //   491: sipush #201
/*    */     //   494: if_icmpne -> 504
/*    */     //   497: bipush #64
/*    */     //   499: istore #5
/*    */     //   501: goto -> 508
/*    */     //   504: bipush #32
/*    */     //   506: istore #5
/*    */     //   508: iload #7
/*    */     //   510: sipush #201
/*    */     //   513: if_icmpeq -> 546
/*    */     //   516: iload #7
/*    */     //   518: sipush #211
/*    */     //   521: if_icmpeq -> 539
/*    */     //   524: iload #7
/*    */     //   526: sipush #301
/*    */     //   529: if_icmpeq -> 539
/*    */     //   532: bipush #32
/*    */     //   534: istore #6
/*    */     //   536: goto -> 550
/*    */     //   539: bipush #48
/*    */     //   541: istore #6
/*    */     //   543: goto -> 550
/*    */     //   546: bipush #64
/*    */     //   548: istore #6
/*    */     //   550: iload #7
/*    */     //   552: lookupswitch default -> 708, 201 -> 714, 240 -> 714, 241 -> 714, 280 -> 714, 281 -> 714, 282 -> 714, 286 -> 714, 287 -> 714, 288 -> 714, 289 -> 714, 290 -> 714, 291 -> 714, 294 -> 714, 295 -> 714, 296 -> 714, 299 -> 714, 301 -> 714, 302 -> 714
/*    */     //   708: iconst_1
/*    */     //   709: istore #9
/*    */     //   711: goto -> 717
/*    */     //   714: iconst_0
/*    */     //   715: istore #9
/*    */     //   717: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   720: iload #8
/*    */     //   722: iload #7
/*    */     //   724: iconst_0
/*    */     //   725: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   728: dup
/*    */     //   729: astore #10
/*    */     //   731: getstatic f/G00.f00 : Lf/Cs;
/*    */     //   734: dup
/*    */     //   735: astore #11
/*    */     //   737: if_acmpne -> 742
/*    */     //   740: iconst_1
/*    */     //   741: ireturn
/*    */     //   742: aload #10
/*    */     //   744: iload #4
/*    */     //   746: invokevirtual LT : (I)Lf/U70;
/*    */     //   749: dup
/*    */     //   750: astore #10
/*    */     //   752: ifnonnull -> 771
/*    */     //   755: iload #9
/*    */     //   757: ifeq -> 769
/*    */     //   760: aload_0
/*    */     //   761: aload_1
/*    */     //   762: aload_2
/*    */     //   763: aload_3
/*    */     //   764: iconst_0
/*    */     //   765: iconst_0
/*    */     //   766: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   769: iconst_1
/*    */     //   770: ireturn
/*    */     //   771: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   774: iload #8
/*    */     //   776: iload #7
/*    */     //   778: iconst_1
/*    */     //   779: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   782: dup
/*    */     //   783: astore #8
/*    */     //   785: aload #11
/*    */     //   787: aconst_null
/*    */     //   788: astore #11
/*    */     //   790: if_acmpeq -> 802
/*    */     //   793: aload #8
/*    */     //   795: iload #4
/*    */     //   797: invokevirtual LT : (I)Lf/U70;
/*    */     //   800: astore #11
/*    */     //   802: aload_0
/*    */     //   803: getfield Xk0 : Lf/uT;
/*    */     //   806: dup
/*    */     //   807: astore #4
/*    */     //   809: ifnull -> 832
/*    */     //   812: aload #4
/*    */     //   814: getfield Dx0 : I
/*    */     //   817: iload #5
/*    */     //   819: if_icmpne -> 832
/*    */     //   822: aload #4
/*    */     //   824: getfield ex0 : I
/*    */     //   827: iload #6
/*    */     //   829: if_icmpeq -> 935
/*    */     //   832: iload #7
/*    */     //   834: aload_0
/*    */     //   835: iload #5
/*    */     //   837: iload #6
/*    */     //   839: new f/pe0
/*    */     //   842: dup
/*    */     //   843: astore #4
/*    */     //   845: aload #10
/*    */     //   847: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   850: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   853: aload #4
/*    */     //   855: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   858: dup
/*    */     //   859: aload_0
/*    */     //   860: swap
/*    */     //   861: putfield Xk0 : Lf/uT;
/*    */     //   864: getstatic f/Xi.WB : Z
/*    */     //   867: invokevirtual lM : (Z)V
/*    */     //   870: getfield Xk0 : Lf/uT;
/*    */     //   873: astore #4
/*    */     //   875: sipush #284
/*    */     //   878: if_icmpeq -> 916
/*    */     //   881: iload #7
/*    */     //   883: tableswitch default -> 908, 277 -> 916, 278 -> 916, 279 -> 916
/*    */     //   908: ldc_w 0.0115
/*    */     //   911: fstore #8
/*    */     //   913: goto -> 921
/*    */     //   916: ldc_w 0.0173
/*    */     //   919: fstore #8
/*    */     //   921: aload_0
/*    */     //   922: aload #4
/*    */     //   924: fload #8
/*    */     //   926: invokevirtual zO : (F)V
/*    */     //   929: getfield Xk0 : Lf/uT;
/*    */     //   932: invokevirtual Gz : ()V
/*    */     //   935: aload_0
/*    */     //   936: getfield WC : Lf/uT;
/*    */     //   939: dup
/*    */     //   940: astore #4
/*    */     //   942: ifnonnull -> 1054
/*    */     //   945: aload #11
/*    */     //   947: ifnull -> 1054
/*    */     //   950: iload #7
/*    */     //   952: aload_0
/*    */     //   953: iload #5
/*    */     //   955: iload #6
/*    */     //   957: new f/pe0
/*    */     //   960: dup
/*    */     //   961: astore #4
/*    */     //   963: aload #11
/*    */     //   965: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   968: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   971: aload #4
/*    */     //   973: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   976: dup
/*    */     //   977: aload_0
/*    */     //   978: swap
/*    */     //   979: putfield WC : Lf/uT;
/*    */     //   982: iconst_0
/*    */     //   983: invokevirtual lM : (Z)V
/*    */     //   986: getfield WC : Lf/uT;
/*    */     //   989: astore #4
/*    */     //   991: sipush #284
/*    */     //   994: if_icmpeq -> 1032
/*    */     //   997: iload #7
/*    */     //   999: tableswitch default -> 1024, 277 -> 1032, 278 -> 1032, 279 -> 1032
/*    */     //   1024: ldc_w 0.0115
/*    */     //   1027: fstore #5
/*    */     //   1029: goto -> 1037
/*    */     //   1032: ldc_w 0.0173
/*    */     //   1035: fstore #5
/*    */     //   1037: aload_0
/*    */     //   1038: aload #4
/*    */     //   1040: fload #5
/*    */     //   1042: invokevirtual zO : (F)V
/*    */     //   1045: getfield WC : Lf/uT;
/*    */     //   1048: invokevirtual Gz : ()V
/*    */     //   1051: goto -> 1069
/*    */     //   1054: aload #4
/*    */     //   1056: ifnull -> 1069
/*    */     //   1059: aload #11
/*    */     //   1061: ifnonnull -> 1069
/*    */     //   1064: aload_0
/*    */     //   1065: aconst_null
/*    */     //   1066: putfield WC : Lf/uT;
/*    */     //   1069: iload #6
/*    */     //   1071: aload_0
/*    */     //   1072: aload #10
/*    */     //   1074: invokevirtual CH : ()V
/*    */     //   1077: getfield Xk0 : Lf/uT;
/*    */     //   1080: aload_0
/*    */     //   1081: getfield ao : Lf/eo;
/*    */     //   1084: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   1087: bipush #48
/*    */     //   1089: if_icmpne -> 1108
/*    */     //   1092: aload_0
/*    */     //   1093: getfield Xk0 : Lf/uT;
/*    */     //   1096: invokevirtual UK0 : ()Lf/eo;
/*    */     //   1099: fconst_0
/*    */     //   1100: fconst_0
/*    */     //   1101: ldc_w -0.1
/*    */     //   1104: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1107: pop
/*    */     //   1108: aload_0
/*    */     //   1109: dup
/*    */     //   1110: dup2
/*    */     //   1111: getfield Xk0 : Lf/uT;
/*    */     //   1114: aload_0
/*    */     //   1115: getfield Yk0 : Lf/eo;
/*    */     //   1118: aload_0
/*    */     //   1119: getfield K70 : Lf/ny;
/*    */     //   1122: getfield nj0 : Lf/eo;
/*    */     //   1125: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   1128: getfield Xk0 : Lf/uT;
/*    */     //   1131: aload #10
/*    */     //   1133: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1136: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   1139: getfield Xk0 : Lf/uT;
/*    */     //   1142: astore #4
/*    */     //   1144: invokevirtual DE0 : ()B
/*    */     //   1147: iconst_3
/*    */     //   1148: if_icmpne -> 1157
/*    */     //   1151: iconst_1
/*    */     //   1152: istore #5
/*    */     //   1154: goto -> 1160
/*    */     //   1157: iconst_0
/*    */     //   1158: istore #5
/*    */     //   1160: aload #11
/*    */     //   1162: aload #4
/*    */     //   1164: iload #5
/*    */     //   1166: invokevirtual Sn0 : (Z)V
/*    */     //   1169: ifnull -> 1271
/*    */     //   1172: aload_0
/*    */     //   1173: dup
/*    */     //   1174: dup
/*    */     //   1175: aload #11
/*    */     //   1177: invokevirtual CH : ()V
/*    */     //   1180: getfield WC : Lf/uT;
/*    */     //   1183: aload #11
/*    */     //   1185: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1188: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   1191: getfield WC : Lf/uT;
/*    */     //   1194: astore #4
/*    */     //   1196: invokevirtual DE0 : ()B
/*    */     //   1199: iconst_3
/*    */     //   1200: if_icmpne -> 1209
/*    */     //   1203: iconst_1
/*    */     //   1204: istore #5
/*    */     //   1206: goto -> 1212
/*    */     //   1209: iconst_0
/*    */     //   1210: istore #5
/*    */     //   1212: iload #6
/*    */     //   1214: aload_0
/*    */     //   1215: aload #4
/*    */     //   1217: iload #5
/*    */     //   1219: invokevirtual Sn0 : (Z)V
/*    */     //   1222: getfield WC : Lf/uT;
/*    */     //   1225: aload_0
/*    */     //   1226: getfield ao : Lf/eo;
/*    */     //   1229: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   1232: bipush #48
/*    */     //   1234: if_icmpne -> 1253
/*    */     //   1237: aload_0
/*    */     //   1238: getfield WC : Lf/uT;
/*    */     //   1241: invokevirtual UK0 : ()Lf/eo;
/*    */     //   1244: fconst_0
/*    */     //   1245: fconst_0
/*    */     //   1246: ldc_w -0.1
/*    */     //   1249: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1252: pop
/*    */     //   1253: aload_0
/*    */     //   1254: getfield WC : Lf/uT;
/*    */     //   1257: aload_0
/*    */     //   1258: getfield Yk0 : Lf/eo;
/*    */     //   1261: aload_0
/*    */     //   1262: getfield K70 : Lf/ny;
/*    */     //   1265: getfield nj0 : Lf/eo;
/*    */     //   1268: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   1271: iload #7
/*    */     //   1273: tableswitch default -> 1300, 294 -> 1306, 295 -> 1306, 296 -> 1306
/*    */     //   1300: iconst_0
/*    */     //   1301: istore #4
/*    */     //   1303: goto -> 1309
/*    */     //   1306: iconst_1
/*    */     //   1307: istore #4
/*    */     //   1309: iload #4
/*    */     //   1311: ifeq -> 1346
/*    */     //   1314: aload_2
/*    */     //   1315: aload_0
/*    */     //   1316: dup
/*    */     //   1317: getfield Xk0 : Lf/uT;
/*    */     //   1320: aload_0
/*    */     //   1321: dup
/*    */     //   1322: getfield QH0 : Lf/Kr0;
/*    */     //   1325: invokevirtual tY : ()B
/*    */     //   1328: iload #7
/*    */     //   1330: invokevirtual De0 : (BS)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1333: invokevirtual DD : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   1336: getfield Xk0 : Lf/uT;
/*    */     //   1339: aconst_null
/*    */     //   1340: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1343: goto -> 1432
/*    */     //   1346: iload #7
/*    */     //   1348: sipush #301
/*    */     //   1351: if_icmpne -> 1360
/*    */     //   1354: iconst_1
/*    */     //   1355: istore #4
/*    */     //   1357: goto -> 1363
/*    */     //   1360: iconst_0
/*    */     //   1361: istore #4
/*    */     //   1363: iload #4
/*    */     //   1365: ifeq -> 1423
/*    */     //   1368: aload_0
/*    */     //   1369: dup
/*    */     //   1370: getfield Xk0 : Lf/uT;
/*    */     //   1373: astore #4
/*    */     //   1375: getfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1378: ifnonnull -> 1402
/*    */     //   1381: aload_0
/*    */     //   1382: new com/badlogic/gdx/graphics/Color
/*    */     //   1385: dup
/*    */     //   1386: astore #5
/*    */     //   1388: fconst_1
/*    */     //   1389: fconst_1
/*    */     //   1390: fconst_1
/*    */     //   1391: ldc_w 0.8
/*    */     //   1394: invokespecial <init> : (FFFF)V
/*    */     //   1397: aload #5
/*    */     //   1399: putfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1402: aload_2
/*    */     //   1403: aload_0
/*    */     //   1404: aload #4
/*    */     //   1406: aload_0
/*    */     //   1407: getfield Ht : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1410: invokevirtual DD : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   1413: getfield Xk0 : Lf/uT;
/*    */     //   1416: aconst_null
/*    */     //   1417: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1420: goto -> 1432
/*    */     //   1423: aload_2
/*    */     //   1424: aload_0
/*    */     //   1425: getfield Xk0 : Lf/uT;
/*    */     //   1428: aload_3
/*    */     //   1429: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1432: aload_0
/*    */     //   1433: getfield WC : Lf/uT;
/*    */     //   1436: dup
/*    */     //   1437: astore #4
/*    */     //   1439: ifnull -> 1449
/*    */     //   1442: aload_2
/*    */     //   1443: aload #4
/*    */     //   1445: aload_3
/*    */     //   1446: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1449: iload #9
/*    */     //   1451: ifeq -> 1463
/*    */     //   1454: aload_0
/*    */     //   1455: aload_1
/*    */     //   1456: aload_2
/*    */     //   1457: aload_3
/*    */     //   1458: iconst_0
/*    */     //   1459: iconst_0
/*    */     //   1460: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   1463: iconst_1
/*    */     //   1464: ireturn
/*    */     //   1465: iload #8
/*    */     //   1467: iconst_2
/*    */     //   1468: if_icmpne -> 2195
/*    */     //   1471: aload_0
/*    */     //   1472: ldc_w 0.011
/*    */     //   1475: fstore #4
/*    */     //   1477: getfield QH0 : Lf/Kr0;
/*    */     //   1480: getfield Ku : F
/*    */     //   1483: fconst_1
/*    */     //   1484: fmul
/*    */     //   1485: fstore #5
/*    */     //   1487: getstatic f/km.mI0 : Lf/P1;
/*    */     //   1490: getfield AN : Lf/Wo;
/*    */     //   1493: iload #7
/*    */     //   1495: invokevirtual AuX : (S)Lf/IB;
/*    */     //   1498: dup
/*    */     //   1499: astore #6
/*    */     //   1501: getfield CV : B
/*    */     //   1504: ifeq -> 1513
/*    */     //   1507: iconst_1
/*    */     //   1508: istore #7
/*    */     //   1510: goto -> 1516
/*    */     //   1513: iconst_0
/*    */     //   1514: istore #7
/*    */     //   1516: iload #7
/*    */     //   1518: ifeq -> 1530
/*    */     //   1521: aload_0
/*    */     //   1522: aload_1
/*    */     //   1523: aload_2
/*    */     //   1524: aload_3
/*    */     //   1525: iconst_0
/*    */     //   1526: iconst_0
/*    */     //   1527: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   1530: aload #6
/*    */     //   1532: getfield TN : B
/*    */     //   1535: dup
/*    */     //   1536: istore_1
/*    */     //   1537: iconst_1
/*    */     //   1538: if_icmpeq -> 1689
/*    */     //   1541: iload_1
/*    */     //   1542: iconst_2
/*    */     //   1543: if_icmpeq -> 1549
/*    */     //   1546: goto -> 5102
/*    */     //   1549: aload_0
/*    */     //   1550: getfield COm5 : Lf/lpt1;
/*    */     //   1553: ifnonnull -> 1571
/*    */     //   1556: aload_0
/*    */     //   1557: invokestatic vY : ()Lf/zp0;
/*    */     //   1560: aload #6
/*    */     //   1562: getfield Ce : S
/*    */     //   1565: invokevirtual B70 : (I)Lf/lpt1;
/*    */     //   1568: putfield COm5 : Lf/lpt1;
/*    */     //   1571: aload_0
/*    */     //   1572: getfield COm5 : Lf/lpt1;
/*    */     //   1575: dup
/*    */     //   1576: astore_1
/*    */     //   1577: ifnull -> 5102
/*    */     //   1580: aload_2
/*    */     //   1581: aload_0
/*    */     //   1582: dup
/*    */     //   1583: dup
/*    */     //   1584: aload_1
/*    */     //   1585: aload_0
/*    */     //   1586: dup
/*    */     //   1587: getfield Oi : F
/*    */     //   1590: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   1593: getfield Qy : F
/*    */     //   1596: fadd
/*    */     //   1597: putfield Oi : F
/*    */     //   1600: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1603: aload_0
/*    */     //   1604: dup
/*    */     //   1605: getfield ao : Lf/eo;
/*    */     //   1608: astore_1
/*    */     //   1609: getfield V4 : Lf/TG0;
/*    */     //   1612: aload_1
/*    */     //   1613: swap
/*    */     //   1614: getstatic f/static.fO : Lf/eo;
/*    */     //   1617: fconst_1
/*    */     //   1618: fconst_1
/*    */     //   1619: fconst_1
/*    */     //   1620: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1623: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1626: pop
/*    */     //   1627: getfield COm5 : Lf/lpt1;
/*    */     //   1630: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1633: aload #6
/*    */     //   1635: getfield lPT6 : B
/*    */     //   1638: i2f
/*    */     //   1639: ldc_w 64.0
/*    */     //   1642: fdiv
/*    */     //   1643: aload #6
/*    */     //   1645: dup
/*    */     //   1646: getfield pu : B
/*    */     //   1649: i2f
/*    */     //   1650: ldc_w 64.0
/*    */     //   1653: fdiv
/*    */     //   1654: fstore_1
/*    */     //   1655: getfield dg0 : B
/*    */     //   1658: i2f
/*    */     //   1659: ldc_w 64.0
/*    */     //   1662: fdiv
/*    */     //   1663: fload_1
/*    */     //   1664: swap
/*    */     //   1665: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1668: pop
/*    */     //   1669: getfield COm5 : Lf/lpt1;
/*    */     //   1672: aload_0
/*    */     //   1673: getfield Oi : F
/*    */     //   1676: invokevirtual wP : (F)V
/*    */     //   1679: getfield COm5 : Lf/lpt1;
/*    */     //   1682: aload_3
/*    */     //   1683: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1686: goto -> 5102
/*    */     //   1689: aload #6
/*    */     //   1691: aload_0
/*    */     //   1692: dup
/*    */     //   1693: invokevirtual DE0 : ()B
/*    */     //   1696: istore_1
/*    */     //   1697: getfield R90 : I
/*    */     //   1700: iload_1
/*    */     //   1701: invokevirtual Pz : (IB)Lf/U70;
/*    */     //   1704: dup
/*    */     //   1705: astore_1
/*    */     //   1706: ifnonnull -> 1711
/*    */     //   1709: iconst_1
/*    */     //   1710: ireturn
/*    */     //   1711: aload_0
/*    */     //   1712: getfield Xk0 : Lf/uT;
/*    */     //   1715: dup
/*    */     //   1716: astore #7
/*    */     //   1718: ifnull -> 1741
/*    */     //   1721: aload #7
/*    */     //   1723: getfield Dx0 : I
/*    */     //   1726: bipush #32
/*    */     //   1728: if_icmpne -> 1741
/*    */     //   1731: aload #7
/*    */     //   1733: getfield ex0 : I
/*    */     //   1736: bipush #32
/*    */     //   1738: if_icmpeq -> 1767
/*    */     //   1741: aload_0
/*    */     //   1742: new f/pe0
/*    */     //   1745: dup
/*    */     //   1746: astore #7
/*    */     //   1748: aload_1
/*    */     //   1749: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1752: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   1755: bipush #32
/*    */     //   1757: bipush #32
/*    */     //   1759: aload #7
/*    */     //   1761: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   1764: putfield Xk0 : Lf/uT;
/*    */     //   1767: aload #6
/*    */     //   1769: aload_0
/*    */     //   1770: aload_1
/*    */     //   1771: getstatic f/zm0.u20 : J
/*    */     //   1774: putfield mk : J
/*    */     //   1777: getfield Xk0 : Lf/uT;
/*    */     //   1780: getstatic f/Xi.WB : Z
/*    */     //   1783: invokevirtual lM : (Z)V
/*    */     //   1786: getfield Tp0 : B
/*    */     //   1789: iconst_2
/*    */     //   1790: if_icmpeq -> 1815
/*    */     //   1793: aload_0
/*    */     //   1794: dup
/*    */     //   1795: getfield Xk0 : Lf/uT;
/*    */     //   1798: fload #4
/*    */     //   1800: fload #5
/*    */     //   1802: fmul
/*    */     //   1803: invokevirtual zO : (F)V
/*    */     //   1806: getfield Xk0 : Lf/uT;
/*    */     //   1809: invokevirtual Gz : ()V
/*    */     //   1812: goto -> 1851
/*    */     //   1815: aload_0
/*    */     //   1816: dup
/*    */     //   1817: dup
/*    */     //   1818: getfield Xk0 : Lf/uT;
/*    */     //   1821: fload #4
/*    */     //   1823: fload #5
/*    */     //   1825: fmul
/*    */     //   1826: fconst_2
/*    */     //   1827: fmul
/*    */     //   1828: invokevirtual zO : (F)V
/*    */     //   1831: getfield Xk0 : Lf/uT;
/*    */     //   1834: invokevirtual Gz : ()V
/*    */     //   1837: getfield ao : Lf/eo;
/*    */     //   1840: dup
/*    */     //   1841: getfield y : F
/*    */     //   1844: ldc_w 0.16
/*    */     //   1847: fadd
/*    */     //   1848: putfield y : F
/*    */     //   1851: fload #5
/*    */     //   1853: aload_0
/*    */     //   1854: getfield Xk0 : Lf/uT;
/*    */     //   1857: aload_1
/*    */     //   1858: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   1861: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   1864: fconst_1
/*    */     //   1865: fcmpl
/*    */     //   1866: ifle -> 1932
/*    */     //   1869: aload_0
/*    */     //   1870: getfield ao : Lf/eo;
/*    */     //   1873: dup
/*    */     //   1874: dup2
/*    */     //   1875: aload_0
/*    */     //   1876: swap
/*    */     //   1877: getfield y : F
/*    */     //   1880: fstore_1
/*    */     //   1881: getfield Xk0 : Lf/uT;
/*    */     //   1884: getfield ex0 : I
/*    */     //   1887: dup
/*    */     //   1888: istore #7
/*    */     //   1890: i2f
/*    */     //   1891: fload #5
/*    */     //   1893: fmul
/*    */     //   1894: ldc 32.0
/*    */     //   1896: fsub
/*    */     //   1897: ldc 32.0
/*    */     //   1899: fdiv
/*    */     //   1900: ldc_w 0.08
/*    */     //   1903: fmul
/*    */     //   1904: fload_1
/*    */     //   1905: fadd
/*    */     //   1906: putfield y : F
/*    */     //   1909: getfield z : F
/*    */     //   1912: iload #7
/*    */     //   1914: i2f
/*    */     //   1915: fload #5
/*    */     //   1917: fmul
/*    */     //   1918: ldc 32.0
/*    */     //   1920: fsub
/*    */     //   1921: ldc 32.0
/*    */     //   1923: fdiv
/*    */     //   1924: ldc_w 0.16
/*    */     //   1927: fmul
/*    */     //   1928: fsub
/*    */     //   1929: putfield z : F
/*    */     //   1932: aload #6
/*    */     //   1934: aload_0
/*    */     //   1935: getfield Xk0 : Lf/uT;
/*    */     //   1938: astore_1
/*    */     //   1939: getfield a30 : B
/*    */     //   1942: dup
/*    */     //   1943: istore #6
/*    */     //   1945: iconst_5
/*    */     //   1946: if_icmpeq -> 1969
/*    */     //   1949: iload #6
/*    */     //   1951: bipush #12
/*    */     //   1953: if_icmpeq -> 1969
/*    */     //   1956: iload #6
/*    */     //   1958: bipush #13
/*    */     //   1960: if_icmpeq -> 1969
/*    */     //   1963: iconst_1
/*    */     //   1964: istore #6
/*    */     //   1966: goto -> 1972
/*    */     //   1969: iconst_0
/*    */     //   1970: istore #6
/*    */     //   1972: iload #6
/*    */     //   1974: ifne -> 1991
/*    */     //   1977: aload_0
/*    */     //   1978: invokevirtual DE0 : ()B
/*    */     //   1981: iconst_3
/*    */     //   1982: if_icmpne -> 1991
/*    */     //   1985: iconst_1
/*    */     //   1986: istore #6
/*    */     //   1988: goto -> 1994
/*    */     //   1991: iconst_0
/*    */     //   1992: istore #6
/*    */     //   1994: aload_0
/*    */     //   1995: aload_2
/*    */     //   1996: aload_0
/*    */     //   1997: dup
/*    */     //   1998: dup
/*    */     //   1999: aload_1
/*    */     //   2000: iload #6
/*    */     //   2002: invokevirtual Sn0 : (Z)V
/*    */     //   2005: getfield Xk0 : Lf/uT;
/*    */     //   2008: aload_0
/*    */     //   2009: getfield ao : Lf/eo;
/*    */     //   2012: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   2015: getfield Xk0 : Lf/uT;
/*    */     //   2018: aload_0
/*    */     //   2019: getfield Yk0 : Lf/eo;
/*    */     //   2022: aload_0
/*    */     //   2023: getfield K70 : Lf/ny;
/*    */     //   2026: getfield nj0 : Lf/eo;
/*    */     //   2029: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   2032: getfield Xk0 : Lf/uT;
/*    */     //   2035: aload_3
/*    */     //   2036: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   2039: getfield QH0 : Lf/Kr0;
/*    */     //   2042: getfield b50 : Z
/*    */     //   2045: ifeq -> 5102
/*    */     //   2048: invokestatic Yj0 : ()Lf/G00;
/*    */     //   2051: bipush #10
/*    */     //   2053: sipush #299
/*    */     //   2056: iconst_1
/*    */     //   2057: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   2060: invokestatic zg : ()J
/*    */     //   2063: ldc2_w 200
/*    */     //   2066: ldiv
/*    */     //   2067: l2i
/*    */     //   2068: bipush #9
/*    */     //   2070: irem
/*    */     //   2071: invokevirtual LT : (I)Lf/U70;
/*    */     //   2074: dup
/*    */     //   2075: astore_1
/*    */     //   2076: ifnull -> 5102
/*    */     //   2079: aload_0
/*    */     //   2080: getfield WC : Lf/uT;
/*    */     //   2083: ifnonnull -> 2136
/*    */     //   2086: aload_0
/*    */     //   2087: aload_1
/*    */     //   2088: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2091: astore #6
/*    */     //   2093: new f/pe0
/*    */     //   2096: dup
/*    */     //   2097: astore #7
/*    */     //   2099: aload #6
/*    */     //   2101: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2104: bipush #32
/*    */     //   2106: bipush #32
/*    */     //   2108: aload #7
/*    */     //   2110: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   2113: dup
/*    */     //   2114: astore #6
/*    */     //   2116: fload #5
/*    */     //   2118: fload #4
/*    */     //   2120: aload_0
/*    */     //   2121: aload #6
/*    */     //   2123: putfield WC : Lf/uT;
/*    */     //   2126: fmul
/*    */     //   2127: invokevirtual zO : (F)V
/*    */     //   2130: getfield WC : Lf/uT;
/*    */     //   2133: invokevirtual Gz : ()V
/*    */     //   2136: aload_2
/*    */     //   2137: aload_0
/*    */     //   2138: dup
/*    */     //   2139: dup
/*    */     //   2140: dup2
/*    */     //   2141: getfield WC : Lf/uT;
/*    */     //   2144: iconst_0
/*    */     //   2145: invokevirtual lM : (Z)V
/*    */     //   2148: getfield WC : Lf/uT;
/*    */     //   2151: aload_1
/*    */     //   2152: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2155: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2158: getfield WC : Lf/uT;
/*    */     //   2161: aload_0
/*    */     //   2162: getfield ao : Lf/eo;
/*    */     //   2165: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   2168: getfield WC : Lf/uT;
/*    */     //   2171: aload_0
/*    */     //   2172: getfield Yk0 : Lf/eo;
/*    */     //   2175: aload_0
/*    */     //   2176: getfield K70 : Lf/ny;
/*    */     //   2179: getfield nj0 : Lf/eo;
/*    */     //   2182: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   2185: getfield WC : Lf/uT;
/*    */     //   2188: aload_3
/*    */     //   2189: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   2192: goto -> 5102
/*    */     //   2195: iload #8
/*    */     //   2197: iconst_3
/*    */     //   2198: if_icmpne -> 3814
/*    */     //   2201: iload #7
/*    */     //   2203: sipush #8192
/*    */     //   2206: if_icmpne -> 2211
/*    */     //   2209: iconst_1
/*    */     //   2210: ireturn
/*    */     //   2211: iload #7
/*    */     //   2213: bipush #101
/*    */     //   2215: if_icmpne -> 2251
/*    */     //   2218: getstatic f/km.a3 : Lf/vh0;
/*    */     //   2221: getfield Ct : Lf/Jo;
/*    */     //   2224: dup
/*    */     //   2225: astore #4
/*    */     //   2227: ifnull -> 2247
/*    */     //   2230: aload #4
/*    */     //   2232: getfield Eh0 : B
/*    */     //   2235: ifne -> 2241
/*    */     //   2238: goto -> 2247
/*    */     //   2241: iconst_0
/*    */     //   2242: istore #7
/*    */     //   2244: goto -> 2251
/*    */     //   2247: bipush #97
/*    */     //   2249: istore #7
/*    */     //   2251: iload #7
/*    */     //   2253: getstatic f/km.mI0 : Lf/P1;
/*    */     //   2256: getfield MT : Lf/gD;
/*    */     //   2259: dup
/*    */     //   2260: astore #4
/*    */     //   2262: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   2265: pop
/*    */     //   2266: sipush #4095
/*    */     //   2269: if_icmplt -> 2283
/*    */     //   2272: iload #7
/*    */     //   2274: sipush #5094
/*    */     //   2277: if_icmpgt -> 2283
/*    */     //   2280: goto -> 2311
/*    */     //   2283: iload #7
/*    */     //   2285: sipush #8192
/*    */     //   2288: if_icmpne -> 2294
/*    */     //   2291: goto -> 2311
/*    */     //   2294: aload #4
/*    */     //   2296: getfield fm : Lf/h30;
/*    */     //   2299: iload #7
/*    */     //   2301: invokevirtual Fb : (S)Z
/*    */     //   2304: ifne -> 2311
/*    */     //   2307: iconst_1
/*    */     //   2308: goto -> 2312
/*    */     //   2311: iconst_0
/*    */     //   2312: ifne -> 3147
/*    */     //   2315: getstatic f/km.mI0 : Lf/P1;
/*    */     //   2318: getfield MT : Lf/gD;
/*    */     //   2321: dup
/*    */     //   2322: astore #4
/*    */     //   2324: getfield fm : Lf/h30;
/*    */     //   2327: iload #7
/*    */     //   2329: invokevirtual Fb : (S)Z
/*    */     //   2332: ifne -> 2341
/*    */     //   2335: aconst_null
/*    */     //   2336: astore #4
/*    */     //   2338: goto -> 2364
/*    */     //   2341: aload #4
/*    */     //   2343: getfield sk : Lf/qw0;
/*    */     //   2346: aload #4
/*    */     //   2348: getfield fm : Lf/h30;
/*    */     //   2351: iload #7
/*    */     //   2353: invokevirtual Z90 : (S)S
/*    */     //   2356: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   2359: checkcast [Lf/U70;
/*    */     //   2362: astore #4
/*    */     //   2364: aload #4
/*    */     //   2366: iconst_0
/*    */     //   2367: istore #5
/*    */     //   2369: ifnull -> 2507
/*    */     //   2372: aload #4
/*    */     //   2374: arraylength
/*    */     //   2375: iconst_1
/*    */     //   2376: if_icmpne -> 2382
/*    */     //   2379: goto -> 2389
/*    */     //   2382: aload #4
/*    */     //   2384: arraylength
/*    */     //   2385: iconst_2
/*    */     //   2386: if_icmpne -> 2395
/*    */     //   2389: iconst_0
/*    */     //   2390: istore #5
/*    */     //   2392: goto -> 2507
/*    */     //   2395: aload #4
/*    */     //   2397: arraylength
/*    */     //   2398: bipush #16
/*    */     //   2400: if_icmpne -> 2421
/*    */     //   2403: getstatic f/Or.vd : [[I
/*    */     //   2406: aload_0
/*    */     //   2407: invokevirtual DE0 : ()B
/*    */     //   2410: aaload
/*    */     //   2411: aload_0
/*    */     //   2412: getfield R90 : I
/*    */     //   2415: iaload
/*    */     //   2416: istore #5
/*    */     //   2418: goto -> 2507
/*    */     //   2421: aload #4
/*    */     //   2423: arraylength
/*    */     //   2424: bipush #17
/*    */     //   2426: if_icmpne -> 2447
/*    */     //   2429: getstatic f/Or.r20 : [[I
/*    */     //   2432: aload_0
/*    */     //   2433: invokevirtual DE0 : ()B
/*    */     //   2436: aaload
/*    */     //   2437: aload_0
/*    */     //   2438: getfield R90 : I
/*    */     //   2441: iaload
/*    */     //   2442: istore #5
/*    */     //   2444: goto -> 2507
/*    */     //   2447: aload #4
/*    */     //   2449: arraylength
/*    */     //   2450: bipush #32
/*    */     //   2452: if_icmpne -> 2473
/*    */     //   2455: getstatic f/Or.ps : [[I
/*    */     //   2458: aload_0
/*    */     //   2459: invokevirtual DE0 : ()B
/*    */     //   2462: aaload
/*    */     //   2463: aload_0
/*    */     //   2464: getfield R90 : I
/*    */     //   2467: iaload
/*    */     //   2468: istore #5
/*    */     //   2470: goto -> 2507
/*    */     //   2473: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   2476: new java/lang/StringBuilder
/*    */     //   2479: dup
/*    */     //   2480: iload #7
/*    */     //   2482: swap
/*    */     //   2483: invokespecial <init> : ()V
/*    */     //   2486: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   2489: ldc_w ' UNK sprite tex len = '
/*    */     //   2492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   2495: aload #4
/*    */     //   2497: arraylength
/*    */     //   2498: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   2501: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2504: invokevirtual println : (Ljava/lang/String;)V
/*    */     //   2507: iload #7
/*    */     //   2509: sipush #230
/*    */     //   2512: if_icmpne -> 2686
/*    */     //   2515: aload_0
/*    */     //   2516: dup
/*    */     //   2517: getstatic f/zm0.u20 : J
/*    */     //   2520: ldc2_w 500
/*    */     //   2523: ldiv
/*    */     //   2524: ldc2_w 2
/*    */     //   2527: lrem
/*    */     //   2528: l2i
/*    */     //   2529: istore #5
/*    */     //   2531: getfield ao : Lf/eo;
/*    */     //   2534: dup
/*    */     //   2535: dup2
/*    */     //   2536: getfield y : F
/*    */     //   2539: ldc_w 0.08
/*    */     //   2542: fadd
/*    */     //   2543: putfield y : F
/*    */     //   2546: getfield z : F
/*    */     //   2549: ldc_w 0.25
/*    */     //   2552: fsub
/*    */     //   2553: putfield z : F
/*    */     //   2556: getfield Bm0 : Lf/eo;
/*    */     //   2559: getfield y : F
/*    */     //   2562: fconst_0
/*    */     //   2563: fcmpl
/*    */     //   2564: ifle -> 2610
/*    */     //   2567: aload_0
/*    */     //   2568: getfield Xk0 : Lf/uT;
/*    */     //   2571: dup
/*    */     //   2572: astore #6
/*    */     //   2574: ifnull -> 2586
/*    */     //   2577: aload #6
/*    */     //   2579: fconst_0
/*    */     //   2580: fconst_0
/*    */     //   2581: fconst_0
/*    */     //   2582: fconst_1
/*    */     //   2583: invokevirtual Bp : (FFFF)V
/*    */     //   2586: aload_0
/*    */     //   2587: getfield Bm0 : Lf/eo;
/*    */     //   2590: dup
/*    */     //   2591: getfield y : F
/*    */     //   2594: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   2597: invokevirtual Sh0 : ()F
/*    */     //   2600: ldc 0.5
/*    */     //   2602: fmul
/*    */     //   2603: fsub
/*    */     //   2604: putfield y : F
/*    */     //   2607: goto -> 2686
/*    */     //   2610: aload_0
/*    */     //   2611: getfield Xk0 : Lf/uT;
/*    */     //   2614: invokevirtual G10 : ()Lcom/badlogic/gdx/graphics/Color;
/*    */     //   2617: dup
/*    */     //   2618: astore #6
/*    */     //   2620: getfield r : F
/*    */     //   2623: fconst_1
/*    */     //   2624: fcmpg
/*    */     //   2625: ifge -> 2686
/*    */     //   2628: aload #6
/*    */     //   2630: dup
/*    */     //   2631: dup2
/*    */     //   2632: dup2
/*    */     //   2633: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   2636: invokevirtual Sh0 : ()F
/*    */     //   2639: ldc 0.5
/*    */     //   2641: fmul
/*    */     //   2642: fstore #6
/*    */     //   2644: getfield r : F
/*    */     //   2647: fconst_1
/*    */     //   2648: fload #6
/*    */     //   2650: invokestatic min : (FF)F
/*    */     //   2653: swap
/*    */     //   2654: fadd
/*    */     //   2655: putfield r : F
/*    */     //   2658: getfield g : F
/*    */     //   2661: fconst_1
/*    */     //   2662: fload #6
/*    */     //   2664: invokestatic min : (FF)F
/*    */     //   2667: swap
/*    */     //   2668: fadd
/*    */     //   2669: putfield g : F
/*    */     //   2672: getfield b : F
/*    */     //   2675: fconst_1
/*    */     //   2676: fload #6
/*    */     //   2678: invokestatic min : (FF)F
/*    */     //   2681: swap
/*    */     //   2682: fadd
/*    */     //   2683: putfield b : F
/*    */     //   2686: aload #4
/*    */     //   2688: aconst_null
/*    */     //   2689: astore #6
/*    */     //   2691: ifnull -> 2701
/*    */     //   2694: aload #4
/*    */     //   2696: iload #5
/*    */     //   2698: aaload
/*    */     //   2699: astore #6
/*    */     //   2701: aload #6
/*    */     //   2703: ifnonnull -> 2708
/*    */     //   2706: iconst_1
/*    */     //   2707: ireturn
/*    */     //   2708: aload_0
/*    */     //   2709: getfield Xk0 : Lf/uT;
/*    */     //   2712: ifnonnull -> 2747
/*    */     //   2715: aload_0
/*    */     //   2716: aload #6
/*    */     //   2718: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2721: dup
/*    */     //   2722: astore #4
/*    */     //   2724: invokevirtual getWidth : ()I
/*    */     //   2727: aload #4
/*    */     //   2729: invokevirtual getHeight : ()I
/*    */     //   2732: new f/pe0
/*    */     //   2735: dup
/*    */     //   2736: aload #4
/*    */     //   2738: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2741: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   2744: putfield Xk0 : Lf/uT;
/*    */     //   2747: aload #6
/*    */     //   2749: aload_0
/*    */     //   2750: dup
/*    */     //   2751: dup
/*    */     //   2752: aload #6
/*    */     //   2754: invokevirtual CH : ()V
/*    */     //   2757: getfield Xk0 : Lf/uT;
/*    */     //   2760: getstatic f/Xi.WB : Z
/*    */     //   2763: invokevirtual lM : (Z)V
/*    */     //   2766: getfield Xk0 : Lf/uT;
/*    */     //   2769: aload_0
/*    */     //   2770: getfield QH0 : Lf/Kr0;
/*    */     //   2773: invokevirtual ub0 : ()F
/*    */     //   2776: ldc_w 0.01171875
/*    */     //   2779: fmul
/*    */     //   2780: invokevirtual zO : (F)V
/*    */     //   2783: getfield ao : Lf/eo;
/*    */     //   2786: dup
/*    */     //   2787: dup2
/*    */     //   2788: getfield y : F
/*    */     //   2791: ldc_w 0.03125
/*    */     //   2794: fadd
/*    */     //   2795: putfield y : F
/*    */     //   2798: getfield z : F
/*    */     //   2801: ldc_w 0.03125
/*    */     //   2804: fadd
/*    */     //   2805: putfield z : F
/*    */     //   2808: invokevirtual Zz : ()I
/*    */     //   2811: bipush #16
/*    */     //   2813: if_icmpne -> 2864
/*    */     //   2816: aload #6
/*    */     //   2818: invokevirtual eh0 : ()I
/*    */     //   2821: bipush #16
/*    */     //   2823: if_icmpne -> 2864
/*    */     //   2826: aload_0
/*    */     //   2827: aload_1
/*    */     //   2828: aload_0
/*    */     //   2829: getfield ao : Lf/eo;
/*    */     //   2832: dup
/*    */     //   2833: dup2
/*    */     //   2834: getfield y : F
/*    */     //   2837: ldc_w 0.08
/*    */     //   2840: fsub
/*    */     //   2841: putfield y : F
/*    */     //   2844: getfield z : F
/*    */     //   2847: ldc_w 0.03125
/*    */     //   2850: fadd
/*    */     //   2851: putfield z : F
/*    */     //   2854: aload_2
/*    */     //   2855: aload_3
/*    */     //   2856: iconst_1
/*    */     //   2857: iconst_0
/*    */     //   2858: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   2861: goto -> 2889
/*    */     //   2864: iload #7
/*    */     //   2866: sipush #202
/*    */     //   2869: if_icmpeq -> 2889
/*    */     //   2872: iload #7
/*    */     //   2874: sipush #230
/*    */     //   2877: if_icmpeq -> 2889
/*    */     //   2880: aload_0
/*    */     //   2881: aload_1
/*    */     //   2882: aload_2
/*    */     //   2883: aload_3
/*    */     //   2884: iconst_0
/*    */     //   2885: iconst_0
/*    */     //   2886: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   2889: iload #7
/*    */     //   2891: sipush #202
/*    */     //   2894: if_icmpeq -> 2952
/*    */     //   2897: iload #7
/*    */     //   2899: sipush #248
/*    */     //   2902: if_icmpeq -> 2934
/*    */     //   2905: iload #7
/*    */     //   2907: sipush #249
/*    */     //   2910: if_icmpeq -> 2916
/*    */     //   2913: goto -> 2962
/*    */     //   2916: aload_0
/*    */     //   2917: getfield ao : Lf/eo;
/*    */     //   2920: dup
/*    */     //   2921: getfield x : F
/*    */     //   2924: ldc_w 0.65
/*    */     //   2927: fadd
/*    */     //   2928: putfield x : F
/*    */     //   2931: goto -> 2962
/*    */     //   2934: aload_0
/*    */     //   2935: getfield ao : Lf/eo;
/*    */     //   2938: dup
/*    */     //   2939: getfield x : F
/*    */     //   2942: ldc_w 0.025
/*    */     //   2945: fadd
/*    */     //   2946: putfield x : F
/*    */     //   2949: goto -> 2962
/*    */     //   2952: aload_0
/*    */     //   2953: getfield Xk0 : Lf/uT;
/*    */     //   2956: ldc_w 0.015625
/*    */     //   2959: invokevirtual zO : (F)V
/*    */     //   2962: aload_0
/*    */     //   2963: dup
/*    */     //   2964: dup
/*    */     //   2965: getfield Xk0 : Lf/uT;
/*    */     //   2968: invokevirtual Gz : ()V
/*    */     //   2971: getfield Xk0 : Lf/uT;
/*    */     //   2974: aload #6
/*    */     //   2976: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   2979: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   2982: fconst_0
/*    */     //   2983: fstore_1
/*    */     //   2984: getfield QH0 : Lf/Kr0;
/*    */     //   2987: invokevirtual zm : ()Lf/G5;
/*    */     //   2990: invokevirtual bV : ()Z
/*    */     //   2993: ifeq -> 3078
/*    */     //   2996: aload_0
/*    */     //   2997: getfield QH0 : Lf/Kr0;
/*    */     //   3000: invokevirtual zm : ()Lf/G5;
/*    */     //   3003: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   3006: dup
/*    */     //   3007: astore #4
/*    */     //   3009: invokevirtual Kn : ()F
/*    */     //   3012: fconst_0
/*    */     //   3013: fcmpl
/*    */     //   3014: ifeq -> 3078
/*    */     //   3017: aload #4
/*    */     //   3019: invokevirtual Kn : ()F
/*    */     //   3022: fstore_1
/*    */     //   3023: ldc_w 90.0
/*    */     //   3026: fload_1
/*    */     //   3027: invokestatic JC0 : (FF)Z
/*    */     //   3030: ifeq -> 3053
/*    */     //   3033: aload_0
/*    */     //   3034: getfield ao : Lf/eo;
/*    */     //   3037: ldc_w 0.2
/*    */     //   3040: ldc_w 0.25
/*    */     //   3043: ldc_w -0.05
/*    */     //   3046: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   3049: pop
/*    */     //   3050: goto -> 3078
/*    */     //   3053: ldc_w 270.0
/*    */     //   3056: fload_1
/*    */     //   3057: invokestatic JC0 : (FF)Z
/*    */     //   3060: ifeq -> 3078
/*    */     //   3063: aload_0
/*    */     //   3064: getfield ao : Lf/eo;
/*    */     //   3067: ldc_w -0.15
/*    */     //   3070: ldc_w 0.2
/*    */     //   3073: fconst_0
/*    */     //   3074: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   3077: pop
/*    */     //   3078: iload #7
/*    */     //   3080: aload_0
/*    */     //   3081: getfield Xk0 : Lf/uT;
/*    */     //   3084: aload_0
/*    */     //   3085: getfield ao : Lf/eo;
/*    */     //   3088: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   3091: sipush #202
/*    */     //   3094: if_icmpne -> 3118
/*    */     //   3097: aload_0
/*    */     //   3098: getfield Xk0 : Lf/uT;
/*    */     //   3101: aload_0
/*    */     //   3102: getfield ao : Lf/eo;
/*    */     //   3105: aload_0
/*    */     //   3106: getfield K70 : Lf/ny;
/*    */     //   3109: getfield nj0 : Lf/eo;
/*    */     //   3112: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   3115: goto -> 3136
/*    */     //   3118: aload_0
/*    */     //   3119: getfield Xk0 : Lf/uT;
/*    */     //   3122: aload_0
/*    */     //   3123: getfield Yk0 : Lf/eo;
/*    */     //   3126: aload_0
/*    */     //   3127: getfield K70 : Lf/ny;
/*    */     //   3130: getfield nj0 : Lf/eo;
/*    */     //   3133: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   3136: fload_1
/*    */     //   3137: fconst_0
/*    */     //   3138: invokestatic JC0 : (FF)Z
/*    */     //   3141: ifne -> 4605
/*    */     //   3144: goto -> 4590
/*    */     //   3147: aload_0
/*    */     //   3148: getfield COm5 : Lf/lpt1;
/*    */     //   3151: ifnonnull -> 3721
/*    */     //   3154: iload #7
/*    */     //   3156: invokestatic vY : ()Lf/zp0;
/*    */     //   3159: dup
/*    */     //   3160: astore_1
/*    */     //   3161: iconst_0
/*    */     //   3162: istore #4
/*    */     //   3164: getfield Dr : Lf/ig;
/*    */     //   3167: astore #5
/*    */     //   3169: bipush #100
/*    */     //   3171: if_icmpeq -> 3425
/*    */     //   3174: iload #7
/*    */     //   3176: bipush #101
/*    */     //   3178: if_icmpeq -> 3420
/*    */     //   3181: iload #7
/*    */     //   3183: tableswitch default -> 3228, 91 -> 3365, 92 -> 3357, 93 -> 3349, 94 -> 3341, 95 -> 3333, 96 -> 3325, 97 -> 3420, 98 -> 3420
/*    */     //   3228: iload #7
/*    */     //   3230: lookupswitch default -> 3288, 105 -> 3425, 118 -> 3412, 183 -> 3404, 209 -> 3389, 262 -> 3373, 8192 -> 3425
/*    */     //   3288: sipush #435
/*    */     //   3291: istore #4
/*    */     //   3293: getstatic f/zp0.OG : Lf/ik;
/*    */     //   3296: new java/lang/StringBuilder
/*    */     //   3299: dup
/*    */     //   3300: invokespecial <init> : ()V
/*    */     //   3303: ldc_w 'unknown bmd for sprite_id '
/*    */     //   3306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   3309: iload #7
/*    */     //   3311: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   3314: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   3317: invokeinterface error : (Ljava/lang/String;)V
/*    */     //   3322: goto -> 3425
/*    */     //   3325: sipush #434
/*    */     //   3328: istore #4
/*    */     //   3330: goto -> 3425
/*    */     //   3333: sipush #433
/*    */     //   3336: istore #4
/*    */     //   3338: goto -> 3425
/*    */     //   3341: sipush #432
/*    */     //   3344: istore #4
/*    */     //   3346: goto -> 3425
/*    */     //   3349: sipush #431
/*    */     //   3352: istore #4
/*    */     //   3354: goto -> 3425
/*    */     //   3357: sipush #430
/*    */     //   3360: istore #4
/*    */     //   3362: goto -> 3425
/*    */     //   3365: sipush #429
/*    */     //   3368: istore #4
/*    */     //   3370: goto -> 3425
/*    */     //   3373: aload_1
/*    */     //   3374: getfield A6 : [Lf/S;
/*    */     //   3377: iconst_3
/*    */     //   3378: aaload
/*    */     //   3379: astore #5
/*    */     //   3381: sipush #149
/*    */     //   3384: istore #4
/*    */     //   3386: goto -> 3425
/*    */     //   3389: aload_1
/*    */     //   3390: getfield A6 : [Lf/S;
/*    */     //   3393: iconst_3
/*    */     //   3394: aaload
/*    */     //   3395: astore #5
/*    */     //   3397: bipush #110
/*    */     //   3399: istore #4
/*    */     //   3401: goto -> 3425
/*    */     //   3404: sipush #427
/*    */     //   3407: istore #4
/*    */     //   3409: goto -> 3425
/*    */     //   3412: sipush #426
/*    */     //   3415: istore #4
/*    */     //   3417: goto -> 3425
/*    */     //   3420: sipush #438
/*    */     //   3423: istore #4
/*    */     //   3425: iload #4
/*    */     //   3427: ifne -> 3435
/*    */     //   3430: aconst_null
/*    */     //   3431: astore_1
/*    */     //   3432: goto -> 3716
/*    */     //   3435: aload_1
/*    */     //   3436: getfield Z8 : Lf/qw0;
/*    */     //   3439: iload #4
/*    */     //   3441: invokevirtual Fb : (S)Z
/*    */     //   3444: ifeq -> 3466
/*    */     //   3447: aload_1
/*    */     //   3448: getfield Z8 : Lf/qw0;
/*    */     //   3451: iload #4
/*    */     //   3453: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   3456: checkcast f/lpt1
/*    */     //   3459: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   3462: astore_1
/*    */     //   3463: goto -> 3716
/*    */     //   3466: iload #4
/*    */     //   3468: aload #5
/*    */     //   3470: iload #4
/*    */     //   3472: invokevirtual Em0 : (I)Lf/T7;
/*    */     //   3475: iconst_0
/*    */     //   3476: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*    */     //   3479: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*    */     //   3482: dup
/*    */     //   3483: astore #5
/*    */     //   3485: invokestatic Lj : ()Lf/eI;
/*    */     //   3488: astore #6
/*    */     //   3490: getfield Nt : [Lf/hC;
/*    */     //   3493: iconst_0
/*    */     //   3494: aaload
/*    */     //   3495: aload #6
/*    */     //   3497: aload #5
/*    */     //   3499: getfield Qo0 : Lf/Wd;
/*    */     //   3502: astore #6
/*    */     //   3504: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   3507: pop
/*    */     //   3508: aload #6
/*    */     //   3510: aconst_null
/*    */     //   3511: fconst_1
/*    */     //   3512: iconst_1
/*    */     //   3513: iconst_0
/*    */     //   3514: iconst_0
/*    */     //   3515: invokestatic Gy : (Lf/hC;Lf/Wd;Lf/fQ;FZZZ)Lf/lpt1;
/*    */     //   3518: astore #6
/*    */     //   3520: sipush #426
/*    */     //   3523: if_icmpne -> 3674
/*    */     //   3526: aload #6
/*    */     //   3528: aload #5
/*    */     //   3530: aload #6
/*    */     //   3532: ldc_w 'animation'
/*    */     //   3535: astore #5
/*    */     //   3537: getfield xl0 : Lf/fQ;
/*    */     //   3540: iconst_0
/*    */     //   3541: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   3544: checkcast f/T0
/*    */     //   3547: getfield Xy0 : Ljava/lang/String;
/*    */     //   3550: astore #7
/*    */     //   3552: ldc_w 0.05
/*    */     //   3555: fstore #8
/*    */     //   3557: getfield Qo0 : Lf/Wd;
/*    */     //   3560: astore #9
/*    */     //   3562: iconst_4
/*    */     //   3563: istore #10
/*    */     //   3565: getfield Cx0 : Lf/Ew;
/*    */     //   3568: astore #11
/*    */     //   3570: new f/fQ
/*    */     //   3573: dup
/*    */     //   3574: astore #12
/*    */     //   3576: invokespecial <init> : ()V
/*    */     //   3579: iconst_0
/*    */     //   3580: istore #13
/*    */     //   3582: iload #13
/*    */     //   3584: iload #10
/*    */     //   3586: if_icmpge -> 3635
/*    */     //   3589: aload #12
/*    */     //   3591: new f/Gc0
/*    */     //   3594: dup
/*    */     //   3595: dup
/*    */     //   3596: astore #14
/*    */     //   3598: iload #13
/*    */     //   3600: aload #14
/*    */     //   3602: dup
/*    */     //   3603: iload #13
/*    */     //   3605: aload #14
/*    */     //   3607: invokespecial <init> : ()V
/*    */     //   3610: i2b
/*    */     //   3611: dup
/*    */     //   3612: istore #14
/*    */     //   3614: putfield oz0 : B
/*    */     //   3617: iload #14
/*    */     //   3619: putfield Wq : B
/*    */     //   3622: i2s
/*    */     //   3623: putfield LB : S
/*    */     //   3626: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   3629: iinc #13, 1
/*    */     //   3632: goto -> 3582
/*    */     //   3635: aload #6
/*    */     //   3637: aload #5
/*    */     //   3639: aload #7
/*    */     //   3641: aload #9
/*    */     //   3643: dup
/*    */     //   3644: getfield K5 : Lf/Nn;
/*    */     //   3647: getfield CO : Lf/fQ;
/*    */     //   3650: aload #9
/*    */     //   3652: getfield zg0 : Lf/Nn;
/*    */     //   3655: getfield CO : Lf/fQ;
/*    */     //   3658: aconst_null
/*    */     //   3659: aload #12
/*    */     //   3661: aload #11
/*    */     //   3663: iconst_0
/*    */     //   3664: invokestatic qY : (Lf/Wd;Lf/fQ;Lf/fQ;Lf/fQ;Lf/fQ;Lf/Ew;Z)[Lf/pe0;
/*    */     //   3667: fload #8
/*    */     //   3669: swap
/*    */     //   3670: iconst_0
/*    */     //   3671: invokevirtual rq : (Ljava/lang/String;Ljava/lang/String;F[Lf/pe0;Z)V
/*    */     //   3674: aload #6
/*    */     //   3676: aload_1
/*    */     //   3677: dup
/*    */     //   3678: dup
/*    */     //   3679: getfield DW : Lf/fQ;
/*    */     //   3682: aload #6
/*    */     //   3684: getfield qY : Lf/cf0;
/*    */     //   3687: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   3690: getfield DW : Lf/fQ;
/*    */     //   3693: aload #6
/*    */     //   3695: getfield Cx0 : Lf/Ew;
/*    */     //   3698: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   3701: getfield Z8 : Lf/qw0;
/*    */     //   3704: iload #4
/*    */     //   3706: aload #6
/*    */     //   3708: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   3711: pop
/*    */     //   3712: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   3715: astore_1
/*    */     //   3716: aload_0
/*    */     //   3717: aload_1
/*    */     //   3718: putfield COm5 : Lf/lpt1;
/*    */     //   3721: aload_0
/*    */     //   3722: getfield COm5 : Lf/lpt1;
/*    */     //   3725: dup
/*    */     //   3726: astore_1
/*    */     //   3727: ifnull -> 5102
/*    */     //   3730: aload_2
/*    */     //   3731: aload_0
/*    */     //   3732: dup
/*    */     //   3733: dup
/*    */     //   3734: aload_1
/*    */     //   3735: aload_0
/*    */     //   3736: dup
/*    */     //   3737: getfield Oi : F
/*    */     //   3740: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   3743: getfield Qy : F
/*    */     //   3746: fadd
/*    */     //   3747: putfield Oi : F
/*    */     //   3750: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   3753: aload_0
/*    */     //   3754: dup
/*    */     //   3755: getfield ao : Lf/eo;
/*    */     //   3758: astore_1
/*    */     //   3759: getfield V4 : Lf/TG0;
/*    */     //   3762: astore_2
/*    */     //   3763: aload_1
/*    */     //   3764: getstatic f/static.fO : Lf/eo;
/*    */     //   3767: fconst_1
/*    */     //   3768: fconst_1
/*    */     //   3769: fconst_1
/*    */     //   3770: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   3773: aload_2
/*    */     //   3774: swap
/*    */     //   3775: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   3778: pop
/*    */     //   3779: getfield COm5 : Lf/lpt1;
/*    */     //   3782: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   3785: fconst_0
/*    */     //   3786: ldc_w -0.22
/*    */     //   3789: fconst_0
/*    */     //   3790: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   3793: pop
/*    */     //   3794: getfield COm5 : Lf/lpt1;
/*    */     //   3797: aload_0
/*    */     //   3798: getfield Oi : F
/*    */     //   3801: invokevirtual wP : (F)V
/*    */     //   3804: getfield COm5 : Lf/lpt1;
/*    */     //   3807: aload_3
/*    */     //   3808: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   3811: goto -> 5102
/*    */     //   3814: iload #8
/*    */     //   3816: iconst_4
/*    */     //   3817: if_icmpne -> 5102
/*    */     //   3820: iload #7
/*    */     //   3822: sipush #8192
/*    */     //   3825: if_icmpne -> 3830
/*    */     //   3828: iconst_1
/*    */     //   3829: ireturn
/*    */     //   3830: iload #7
/*    */     //   3832: sipush #349
/*    */     //   3835: if_icmpne -> 3840
/*    */     //   3838: iconst_1
/*    */     //   3839: ireturn
/*    */     //   3840: iload #7
/*    */     //   3842: bipush #101
/*    */     //   3844: if_icmpne -> 3880
/*    */     //   3847: getstatic f/km.a3 : Lf/vh0;
/*    */     //   3850: getfield Ct : Lf/Jo;
/*    */     //   3853: dup
/*    */     //   3854: astore #4
/*    */     //   3856: ifnull -> 3876
/*    */     //   3859: aload #4
/*    */     //   3861: getfield Eh0 : B
/*    */     //   3864: ifne -> 3870
/*    */     //   3867: goto -> 3876
/*    */     //   3870: iconst_0
/*    */     //   3871: istore #7
/*    */     //   3873: goto -> 3880
/*    */     //   3876: bipush #97
/*    */     //   3878: istore #7
/*    */     //   3880: iload #7
/*    */     //   3882: getstatic f/km.mI0 : Lf/P1;
/*    */     //   3885: getfield yE : Lf/BE;
/*    */     //   3888: dup
/*    */     //   3889: astore #4
/*    */     //   3891: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   3894: pop
/*    */     //   3895: sipush #4095
/*    */     //   3898: if_icmplt -> 3912
/*    */     //   3901: iload #7
/*    */     //   3903: sipush #5094
/*    */     //   3906: if_icmpgt -> 3912
/*    */     //   3909: goto -> 3945
/*    */     //   3912: iload #7
/*    */     //   3914: sipush #8192
/*    */     //   3917: if_icmpne -> 3923
/*    */     //   3920: goto -> 3945
/*    */     //   3923: aload #4
/*    */     //   3925: getfield xb : Lf/h30;
/*    */     //   3928: iload #7
/*    */     //   3930: invokevirtual Z90 : (S)S
/*    */     //   3933: ifeq -> 3939
/*    */     //   3936: goto -> 3945
/*    */     //   3939: iload #7
/*    */     //   3941: iconst_1
/*    */     //   3942: if_icmpne -> 3949
/*    */     //   3945: iconst_0
/*    */     //   3946: goto -> 3950
/*    */     //   3949: iconst_1
/*    */     //   3950: ifne -> 4623
/*    */     //   3953: getstatic f/km.mI0 : Lf/P1;
/*    */     //   3956: getfield yE : Lf/BE;
/*    */     //   3959: dup
/*    */     //   3960: astore #4
/*    */     //   3962: getfield xb : Lf/h30;
/*    */     //   3965: iload #7
/*    */     //   3967: invokevirtual Fb : (S)Z
/*    */     //   3970: ifne -> 3979
/*    */     //   3973: aconst_null
/*    */     //   3974: astore #4
/*    */     //   3976: goto -> 4002
/*    */     //   3979: aload #4
/*    */     //   3981: getfield Vl0 : Lf/qw0;
/*    */     //   3984: aload #4
/*    */     //   3986: getfield xb : Lf/h30;
/*    */     //   3989: iload #7
/*    */     //   3991: invokevirtual Z90 : (S)S
/*    */     //   3994: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   3997: checkcast [Lf/U70;
/*    */     //   4000: astore #4
/*    */     //   4002: aload #4
/*    */     //   4004: iconst_0
/*    */     //   4005: istore #5
/*    */     //   4007: ifnull -> 4226
/*    */     //   4010: aload #4
/*    */     //   4012: arraylength
/*    */     //   4013: iconst_1
/*    */     //   4014: if_icmpne -> 4020
/*    */     //   4017: goto -> 4057
/*    */     //   4020: aload #4
/*    */     //   4022: arraylength
/*    */     //   4023: iconst_2
/*    */     //   4024: if_icmpne -> 4030
/*    */     //   4027: goto -> 4057
/*    */     //   4030: iload #7
/*    */     //   4032: sipush #262
/*    */     //   4035: if_icmpne -> 4041
/*    */     //   4038: goto -> 4057
/*    */     //   4041: iload #7
/*    */     //   4043: sipush #263
/*    */     //   4046: if_icmplt -> 4063
/*    */     //   4049: iload #7
/*    */     //   4051: sipush #269
/*    */     //   4054: if_icmpgt -> 4063
/*    */     //   4057: iconst_0
/*    */     //   4058: istore #5
/*    */     //   4060: goto -> 4226
/*    */     //   4063: aload #4
/*    */     //   4065: arraylength
/*    */     //   4066: bipush #7
/*    */     //   4068: if_icmpne -> 4088
/*    */     //   4071: invokestatic zg : ()J
/*    */     //   4074: ldc2_w 150
/*    */     //   4077: ldiv
/*    */     //   4078: ldc2_w 5
/*    */     //   4081: lrem
/*    */     //   4082: l2i
/*    */     //   4083: istore #5
/*    */     //   4085: goto -> 4226
/*    */     //   4088: aload #4
/*    */     //   4090: arraylength
/*    */     //   4091: bipush #8
/*    */     //   4093: if_icmpne -> 4114
/*    */     //   4096: getstatic f/Or.p30 : [[I
/*    */     //   4099: aload_0
/*    */     //   4100: invokevirtual DE0 : ()B
/*    */     //   4103: aaload
/*    */     //   4104: aload_0
/*    */     //   4105: getfield R90 : I
/*    */     //   4108: iaload
/*    */     //   4109: istore #5
/*    */     //   4111: goto -> 4226
/*    */     //   4114: aload #4
/*    */     //   4116: arraylength
/*    */     //   4117: bipush #16
/*    */     //   4119: if_icmpne -> 4140
/*    */     //   4122: getstatic f/Or.vd : [[I
/*    */     //   4125: aload_0
/*    */     //   4126: invokevirtual DE0 : ()B
/*    */     //   4129: aaload
/*    */     //   4130: aload_0
/*    */     //   4131: getfield R90 : I
/*    */     //   4134: iaload
/*    */     //   4135: istore #5
/*    */     //   4137: goto -> 4226
/*    */     //   4140: aload #4
/*    */     //   4142: arraylength
/*    */     //   4143: bipush #17
/*    */     //   4145: if_icmpne -> 4166
/*    */     //   4148: getstatic f/Or.r20 : [[I
/*    */     //   4151: aload_0
/*    */     //   4152: invokevirtual DE0 : ()B
/*    */     //   4155: aaload
/*    */     //   4156: aload_0
/*    */     //   4157: getfield R90 : I
/*    */     //   4160: iaload
/*    */     //   4161: istore #5
/*    */     //   4163: goto -> 4226
/*    */     //   4166: aload #4
/*    */     //   4168: arraylength
/*    */     //   4169: bipush #32
/*    */     //   4171: if_icmpne -> 4192
/*    */     //   4174: getstatic f/Or.ps : [[I
/*    */     //   4177: aload_0
/*    */     //   4178: invokevirtual DE0 : ()B
/*    */     //   4181: aaload
/*    */     //   4182: aload_0
/*    */     //   4183: getfield R90 : I
/*    */     //   4186: iaload
/*    */     //   4187: istore #5
/*    */     //   4189: goto -> 4226
/*    */     //   4192: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   4195: new java/lang/StringBuilder
/*    */     //   4198: dup
/*    */     //   4199: iload #7
/*    */     //   4201: swap
/*    */     //   4202: invokespecial <init> : ()V
/*    */     //   4205: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   4208: ldc_w ' UNK sprite tex len = '
/*    */     //   4211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4214: aload #4
/*    */     //   4216: arraylength
/*    */     //   4217: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   4220: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   4223: invokevirtual println : (Ljava/lang/String;)V
/*    */     //   4226: aload #4
/*    */     //   4228: aconst_null
/*    */     //   4229: astore #6
/*    */     //   4231: ifnull -> 4241
/*    */     //   4234: aload #4
/*    */     //   4236: iload #5
/*    */     //   4238: aaload
/*    */     //   4239: astore #6
/*    */     //   4241: aload #6
/*    */     //   4243: ifnonnull -> 4248
/*    */     //   4246: iconst_1
/*    */     //   4247: ireturn
/*    */     //   4248: aload_0
/*    */     //   4249: getfield Xk0 : Lf/uT;
/*    */     //   4252: ifnonnull -> 4287
/*    */     //   4255: aload_0
/*    */     //   4256: aload #6
/*    */     //   4258: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   4261: dup
/*    */     //   4262: astore #4
/*    */     //   4264: invokevirtual getWidth : ()I
/*    */     //   4267: aload #4
/*    */     //   4269: invokevirtual getHeight : ()I
/*    */     //   4272: new f/pe0
/*    */     //   4275: dup
/*    */     //   4276: aload #4
/*    */     //   4278: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   4281: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   4284: putfield Xk0 : Lf/uT;
/*    */     //   4287: aload #6
/*    */     //   4289: aload_0
/*    */     //   4290: dup
/*    */     //   4291: dup
/*    */     //   4292: aload #6
/*    */     //   4294: invokevirtual CH : ()V
/*    */     //   4297: getfield Xk0 : Lf/uT;
/*    */     //   4300: getstatic f/Xi.WB : Z
/*    */     //   4303: invokevirtual lM : (Z)V
/*    */     //   4306: getfield Xk0 : Lf/uT;
/*    */     //   4309: aload_0
/*    */     //   4310: getfield QH0 : Lf/Kr0;
/*    */     //   4313: invokevirtual ub0 : ()F
/*    */     //   4316: ldc_w 0.01171875
/*    */     //   4319: fmul
/*    */     //   4320: invokevirtual zO : (F)V
/*    */     //   4323: getfield ao : Lf/eo;
/*    */     //   4326: dup
/*    */     //   4327: dup2
/*    */     //   4328: getfield y : F
/*    */     //   4331: ldc_w 0.03125
/*    */     //   4334: fadd
/*    */     //   4335: putfield y : F
/*    */     //   4338: getfield z : F
/*    */     //   4341: ldc_w 0.03125
/*    */     //   4344: fadd
/*    */     //   4345: putfield z : F
/*    */     //   4348: invokevirtual Zz : ()I
/*    */     //   4351: bipush #16
/*    */     //   4353: if_icmpne -> 4404
/*    */     //   4356: aload #6
/*    */     //   4358: invokevirtual eh0 : ()I
/*    */     //   4361: bipush #16
/*    */     //   4363: if_icmpne -> 4404
/*    */     //   4366: aload_0
/*    */     //   4367: aload_1
/*    */     //   4368: aload_0
/*    */     //   4369: getfield ao : Lf/eo;
/*    */     //   4372: dup
/*    */     //   4373: dup2
/*    */     //   4374: getfield y : F
/*    */     //   4377: ldc_w 0.08
/*    */     //   4380: fsub
/*    */     //   4381: putfield y : F
/*    */     //   4384: getfield z : F
/*    */     //   4387: ldc_w 0.03125
/*    */     //   4390: fadd
/*    */     //   4391: putfield z : F
/*    */     //   4394: aload_2
/*    */     //   4395: aload_3
/*    */     //   4396: iconst_1
/*    */     //   4397: iconst_0
/*    */     //   4398: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   4401: goto -> 4437
/*    */     //   4404: iload #7
/*    */     //   4406: sipush #202
/*    */     //   4409: if_icmpeq -> 4437
/*    */     //   4412: iload #7
/*    */     //   4414: sipush #230
/*    */     //   4417: if_icmpeq -> 4437
/*    */     //   4420: iload #7
/*    */     //   4422: sipush #425
/*    */     //   4425: if_icmpeq -> 4437
/*    */     //   4428: aload_0
/*    */     //   4429: aload_1
/*    */     //   4430: aload_2
/*    */     //   4431: aload_3
/*    */     //   4432: iconst_0
/*    */     //   4433: iconst_0
/*    */     //   4434: invokevirtual lpt6 : (Lf/Ih0;Lf/K70;Lf/fo0;ZZ)V
/*    */     //   4437: aload_0
/*    */     //   4438: dup
/*    */     //   4439: dup
/*    */     //   4440: getfield Xk0 : Lf/uT;
/*    */     //   4443: invokevirtual Gz : ()V
/*    */     //   4446: getfield Xk0 : Lf/uT;
/*    */     //   4449: aload #6
/*    */     //   4451: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   4454: invokevirtual Bo : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   4457: fconst_0
/*    */     //   4458: fstore_1
/*    */     //   4459: getfield QH0 : Lf/Kr0;
/*    */     //   4462: invokevirtual zm : ()Lf/G5;
/*    */     //   4465: invokevirtual bV : ()Z
/*    */     //   4468: ifeq -> 4553
/*    */     //   4471: aload_0
/*    */     //   4472: getfield QH0 : Lf/Kr0;
/*    */     //   4475: invokevirtual zm : ()Lf/G5;
/*    */     //   4478: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   4481: dup
/*    */     //   4482: astore #4
/*    */     //   4484: invokevirtual Kn : ()F
/*    */     //   4487: fconst_0
/*    */     //   4488: fcmpl
/*    */     //   4489: ifeq -> 4553
/*    */     //   4492: aload #4
/*    */     //   4494: invokevirtual Kn : ()F
/*    */     //   4497: fstore_1
/*    */     //   4498: ldc_w 90.0
/*    */     //   4501: fload_1
/*    */     //   4502: invokestatic JC0 : (FF)Z
/*    */     //   4505: ifeq -> 4528
/*    */     //   4508: aload_0
/*    */     //   4509: getfield ao : Lf/eo;
/*    */     //   4512: ldc_w 0.2
/*    */     //   4515: ldc_w 0.25
/*    */     //   4518: ldc_w -0.05
/*    */     //   4521: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   4524: pop
/*    */     //   4525: goto -> 4553
/*    */     //   4528: ldc_w 270.0
/*    */     //   4531: fload_1
/*    */     //   4532: invokestatic JC0 : (FF)Z
/*    */     //   4535: ifeq -> 4553
/*    */     //   4538: aload_0
/*    */     //   4539: getfield ao : Lf/eo;
/*    */     //   4542: ldc_w -0.15
/*    */     //   4545: ldc_w 0.2
/*    */     //   4548: fconst_0
/*    */     //   4549: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   4552: pop
/*    */     //   4553: fload_1
/*    */     //   4554: aload_0
/*    */     //   4555: dup
/*    */     //   4556: getfield Xk0 : Lf/uT;
/*    */     //   4559: aload_0
/*    */     //   4560: getfield ao : Lf/eo;
/*    */     //   4563: invokevirtual WI0 : (Lf/eo;)V
/*    */     //   4566: getfield Xk0 : Lf/uT;
/*    */     //   4569: aload_0
/*    */     //   4570: getfield Yk0 : Lf/eo;
/*    */     //   4573: aload_0
/*    */     //   4574: getfield K70 : Lf/ny;
/*    */     //   4577: getfield nj0 : Lf/eo;
/*    */     //   4580: invokevirtual si : (Lf/eo;Lf/eo;)V
/*    */     //   4583: fconst_0
/*    */     //   4584: invokestatic JC0 : (FF)Z
/*    */     //   4587: ifne -> 4605
/*    */     //   4590: aload_0
/*    */     //   4591: getfield Xk0 : Lf/uT;
/*    */     //   4594: getfield Jb : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   4597: getstatic f/eo.Z : Lf/eo;
/*    */     //   4600: fload_1
/*    */     //   4601: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   4604: pop
/*    */     //   4605: aload_0
/*    */     //   4606: aload_2
/*    */     //   4607: dup
/*    */     //   4608: aload_0
/*    */     //   4609: getfield Xk0 : Lf/uT;
/*    */     //   4612: aload_3
/*    */     //   4613: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   4616: aload_3
/*    */     //   4617: invokevirtual o0 : (Lf/K70;Lf/fo0;)V
/*    */     //   4620: goto -> 5102
/*    */     //   4623: aload_0
/*    */     //   4624: getfield COm5 : Lf/lpt1;
/*    */     //   4627: ifnonnull -> 5010
/*    */     //   4630: iload #7
/*    */     //   4632: invokestatic vY : ()Lf/zp0;
/*    */     //   4635: dup
/*    */     //   4636: astore_1
/*    */     //   4637: iconst_0
/*    */     //   4638: istore #4
/*    */     //   4640: getfield A6 : [Lf/S;
/*    */     //   4643: iconst_4
/*    */     //   4644: aaload
/*    */     //   4645: astore #5
/*    */     //   4647: sipush #183
/*    */     //   4650: if_icmpeq -> 4867
/*    */     //   4653: iload #7
/*    */     //   4655: sipush #8192
/*    */     //   4658: if_icmpeq -> 4871
/*    */     //   4661: iload #7
/*    */     //   4663: tableswitch default -> 4704, 251 -> 4818, 252 -> 4811, 253 -> 4804, 254 -> 4797, 255 -> 4790, 256 -> 4783, 257 -> 4776
/*    */     //   4704: iload #7
/*    */     //   4706: tableswitch default -> 4740, 288 -> 4860, 289 -> 4853, 290 -> 4839, 291 -> 4832, 292 -> 4825
/*    */     //   4740: bipush #125
/*    */     //   4742: istore #4
/*    */     //   4744: getstatic f/zp0.OG : Lf/ik;
/*    */     //   4747: new java/lang/StringBuilder
/*    */     //   4750: dup
/*    */     //   4751: invokespecial <init> : ()V
/*    */     //   4754: ldc_w 'unknown bmd for sprite_id '
/*    */     //   4757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   4760: iload #7
/*    */     //   4762: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   4765: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   4768: invokeinterface error : (Ljava/lang/String;)V
/*    */     //   4773: goto -> 4871
/*    */     //   4776: bipush #108
/*    */     //   4778: istore #4
/*    */     //   4780: goto -> 4871
/*    */     //   4783: bipush #107
/*    */     //   4785: istore #4
/*    */     //   4787: goto -> 4871
/*    */     //   4790: bipush #113
/*    */     //   4792: istore #4
/*    */     //   4794: goto -> 4871
/*    */     //   4797: bipush #112
/*    */     //   4799: istore #4
/*    */     //   4801: goto -> 4871
/*    */     //   4804: bipush #109
/*    */     //   4806: istore #4
/*    */     //   4808: goto -> 4871
/*    */     //   4811: bipush #111
/*    */     //   4813: istore #4
/*    */     //   4815: goto -> 4871
/*    */     //   4818: bipush #110
/*    */     //   4820: istore #4
/*    */     //   4822: goto -> 4871
/*    */     //   4825: bipush #115
/*    */     //   4827: istore #4
/*    */     //   4829: goto -> 4871
/*    */     //   4832: bipush #116
/*    */     //   4834: istore #4
/*    */     //   4836: goto -> 4871
/*    */     //   4839: aload_1
/*    */     //   4840: getfield Oh0 : Lf/ig;
/*    */     //   4843: astore #5
/*    */     //   4845: sipush #279
/*    */     //   4848: istore #4
/*    */     //   4850: goto -> 4871
/*    */     //   4853: bipush #117
/*    */     //   4855: istore #4
/*    */     //   4857: goto -> 4871
/*    */     //   4860: bipush #114
/*    */     //   4862: istore #4
/*    */     //   4864: goto -> 4871
/*    */     //   4867: bipush #84
/*    */     //   4869: istore #4
/*    */     //   4871: iload #4
/*    */     //   4873: ifne -> 4881
/*    */     //   4876: aconst_null
/*    */     //   4877: astore_1
/*    */     //   4878: goto -> 5005
/*    */     //   4881: aload_1
/*    */     //   4882: getfield OD0 : Lf/qw0;
/*    */     //   4885: iload #4
/*    */     //   4887: invokevirtual Fb : (S)Z
/*    */     //   4890: ifeq -> 4912
/*    */     //   4893: aload_1
/*    */     //   4894: getfield OD0 : Lf/qw0;
/*    */     //   4897: iload #4
/*    */     //   4899: invokevirtual Z90 : (S)Ljava/lang/Object;
/*    */     //   4902: checkcast f/lpt1
/*    */     //   4905: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   4908: astore_1
/*    */     //   4909: goto -> 5005
/*    */     //   4912: aload #5
/*    */     //   4914: iload #4
/*    */     //   4916: invokevirtual Em0 : (I)Lf/T7;
/*    */     //   4919: iconst_0
/*    */     //   4920: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*    */     //   4923: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*    */     //   4926: dup
/*    */     //   4927: astore #5
/*    */     //   4929: invokestatic Lj : ()Lf/eI;
/*    */     //   4932: astore #6
/*    */     //   4934: getfield Nt : [Lf/hC;
/*    */     //   4937: iconst_0
/*    */     //   4938: aaload
/*    */     //   4939: aload #6
/*    */     //   4941: aload #5
/*    */     //   4943: getfield Qo0 : Lf/Wd;
/*    */     //   4946: astore #5
/*    */     //   4948: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   4951: pop
/*    */     //   4952: aload #5
/*    */     //   4954: aconst_null
/*    */     //   4955: fconst_1
/*    */     //   4956: iconst_1
/*    */     //   4957: iconst_0
/*    */     //   4958: iconst_0
/*    */     //   4959: invokestatic Gy : (Lf/hC;Lf/Wd;Lf/fQ;FZZZ)Lf/lpt1;
/*    */     //   4962: dup
/*    */     //   4963: astore #5
/*    */     //   4965: aload_1
/*    */     //   4966: dup
/*    */     //   4967: dup
/*    */     //   4968: getfield DW : Lf/fQ;
/*    */     //   4971: aload #5
/*    */     //   4973: getfield qY : Lf/cf0;
/*    */     //   4976: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   4979: getfield DW : Lf/fQ;
/*    */     //   4982: aload #5
/*    */     //   4984: getfield Cx0 : Lf/Ew;
/*    */     //   4987: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   4990: getfield OD0 : Lf/qw0;
/*    */     //   4993: iload #4
/*    */     //   4995: aload #5
/*    */     //   4997: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
/*    */     //   5000: pop
/*    */     //   5001: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   5004: astore_1
/*    */     //   5005: aload_0
/*    */     //   5006: aload_1
/*    */     //   5007: putfield COm5 : Lf/lpt1;
/*    */     //   5010: aload_0
/*    */     //   5011: getfield COm5 : Lf/lpt1;
/*    */     //   5014: ifnull -> 5102
/*    */     //   5017: aload_2
/*    */     //   5018: aload_0
/*    */     //   5019: dup
/*    */     //   5020: dup2
/*    */     //   5021: dup2
/*    */     //   5022: getfield Oi : F
/*    */     //   5025: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   5028: invokevirtual Sh0 : ()F
/*    */     //   5031: swap
/*    */     //   5032: fadd
/*    */     //   5033: putfield Oi : F
/*    */     //   5036: getfield COm5 : Lf/lpt1;
/*    */     //   5039: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   5042: aload_0
/*    */     //   5043: dup
/*    */     //   5044: getfield ao : Lf/eo;
/*    */     //   5047: astore_1
/*    */     //   5048: getfield V4 : Lf/TG0;
/*    */     //   5051: astore_2
/*    */     //   5052: aload_1
/*    */     //   5053: getstatic f/static.fO : Lf/eo;
/*    */     //   5056: fconst_1
/*    */     //   5057: fconst_1
/*    */     //   5058: fconst_1
/*    */     //   5059: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   5062: aload_2
/*    */     //   5063: swap
/*    */     //   5064: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   5067: pop
/*    */     //   5068: getfield COm5 : Lf/lpt1;
/*    */     //   5071: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   5074: fconst_0
/*    */     //   5075: ldc_w -0.2
/*    */     //   5078: ldc_w 0.05
/*    */     //   5081: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   5084: pop
/*    */     //   5085: getfield COm5 : Lf/lpt1;
/*    */     //   5088: aload_0
/*    */     //   5089: getfield Oi : F
/*    */     //   5092: invokevirtual wP : (F)V
/*    */     //   5095: getfield COm5 : Lf/lpt1;
/*    */     //   5098: aload_3
/*    */     //   5099: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   5102: iconst_1
/*    */     //   5103: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 13
/*    */     //   #3	-> 18
/*    */     //   #4	-> 60
/*    */     //   #5	-> 74
/*    */     //   #6	-> 87
/*    */     //   #7	-> 90
/*    */     //   #8	-> 95
/*    */     //   #9	-> 161
/*    */     //   #10	-> 168
/*    */     //   #11	-> 192
/*    */     //   #12	-> 196
/*    */     //   #13	-> 328
/*    */     //   #14	-> 333
/*    */     //   #15	-> 429
/*    */     //   #16	-> 440
/*    */     //   #17	-> 449
/*    */     //   #18	-> 481
/*    */     //   #19	-> 717
/*    */     //   #20	-> 725
/*    */     //   #21	-> 766
/*    */     //   #22	-> 771
/*    */     //   #23	-> 779
/*    */     //   #24	-> 814
/*    */     //   #25	-> 824
/*    */     //   #26	-> 839
/*    */     //   #27	-> 1375
/*    */     //   #28	-> 1410
/*    */     //   #29	-> 1460
/*    */     //   #30	-> 1477
/*    */     //   #31	-> 1480
/*    */     //   #32	-> 1487
/*    */     //   #33	-> 1501
/*    */     //   #34	-> 1527
/*    */     //   #35	-> 1532
/*    */     //   #36	-> 1550
/*    */     //   #37	-> 1562
/*    */     //   #38	-> 1565
/*    */     //   #39	-> 1593
/*    */     //   #40	-> 1597
/*    */     //   #41	-> 1635
/*    */     //   #42	-> 1646
/*    */     //   #43	-> 1655
/*    */     //   #44	-> 1665
/*    */     //   #45	-> 1723
/*    */     //   #46	-> 1733
/*    */     //   #47	-> 1742
/*    */     //   #48	-> 1771
/*    */     //   #49	-> 1774
/*    */     //   #50	-> 1777
/*    */     //   #51	-> 1786
/*    */     //   #52	-> 1795
/*    */     //   #53	-> 1884
/*    */     //   #54	-> 1906
/*    */     //   #55	-> 1939
/*    */     //   #56	-> 1978
/*    */     //   #57	-> 2042
/*    */     //   #58	-> 2048
/*    */     //   #59	-> 2221
/*    */     //   #60	-> 2232
/*    */     //   #61	-> 2253
/*    */     //   #62	-> 2296
/*    */     //   #63	-> 2301
/*    */     //   #64	-> 2315
/*    */     //   #65	-> 2324
/*    */     //   #66	-> 2329
/*    */     //   #67	-> 2343
/*    */     //   #68	-> 2374
/*    */     //   #69	-> 2517
/*    */     //   #70	-> 2523
/*    */     //   #71	-> 2886
/*    */     //   #72	-> 2917
/*    */     //   #73	-> 3164
/*    */     //   #74	-> 3293
/*    */     //   #75	-> 3441
/*    */     //   #76	-> 3448
/*    */     //   #77	-> 3476
/*    */     //   #78	-> 3479
/*    */     //   #79	-> 3504
/*    */     //   #80	-> 3515
/*    */     //   #81	-> 3532
/*    */     //   #82	-> 3565
/*    */     //   #83	-> 3570
/*    */     //   #84	-> 3647
/*    */     //   #85	-> 3652
/*    */     //   #86	-> 3655
/*    */     //   #87	-> 3664
/*    */     //   #88	-> 3671
/*    */     //   #89	-> 3695
/*    */     //   #90	-> 3698
/*    */     //   #91	-> 3718
/*    */     //   #92	-> 3743
/*    */     //   #93	-> 3747
/*    */     //   #94	-> 3850
/*    */     //   #95	-> 3861
/*    */     //   #96	-> 3882
/*    */     //   #97	-> 3925
/*    */     //   #98	-> 3953
/*    */     //   #99	-> 3962
/*    */     //   #100	-> 3967
/*    */     //   #101	-> 3981
/*    */     //   #102	-> 4012
/*    */     //   #103	-> 4434
/*    */     //   #104	-> 4440
/*    */     //   #105	-> 4640
/*    */     //   #106	-> 4644
/*    */     //   #107	-> 4887
/*    */     //   #108	-> 4894
/*    */     //   #109	-> 4920
/*    */     //   #110	-> 4923
/*    */     //   #111	-> 4948
/*    */     //   #112	-> 4959
/*    */     //   #113	-> 4968
/*    */     //   #114	-> 4984
/*    */     //   #115	-> 4987
/* 14 */     //   #116	-> 5007 } public final void o0(K70 paramK70, fo0 paramfo0) { U70 u70; if (this.QH0.b50 && (u70 = G00.Av0.Cx0((byte)10, 298, true).LT((int)(zm0.u20 / 200L) % 9)) != null) { if (this.WC == null) { this.WC = uT1; uT uT1; Texture texture; (uT1 = uT.xz((texture = u70.HA0()).getWidth(), texture.getHeight(), new pe0(texture))).zO(this.QH0.Ku * 0.01171875F); this.WC.Gz(); }  this.WC.lM(false); this.WC.Bo(u70.HA0()); this.WC.WI0(this.ao); this.WC.si(this.Yk0, this.K70.nj0); paramK70.q10(this.WC, paramfo0); }  } public final Color De0(byte paramByte, short paramShort) { float f1; if (this.Pl0 == null) { Color color; this(1.0F, 1.0F, 1.0F, 1.0F); this.Pl0 = color; }  short s1 = km.a3.Ct.HW.mm; short s2 = km.a3.Ct.HW.Yu0; short s3 = this.QH0.HW.mm; long l = (s3 - s1); l *= l; double d; if ((d = Math.sqrt(((this.QH0.HW.Yu0 - s2) * (this.QH0.HW.Yu0 - s2) + l))) > 10.0D) d = 10.0D;  if (paramShort != 295) { if (paramShort != 296) { f1 = 0.9F; } else if (Mk0.sz0(f1)) { f1 = 0.25F; } else { f1 = 0.2F; }  } else { f1 = 0.5F; }  if (f1 < 0.9F) { float f = 0.9F - f1; int i; if ((i = L70.gq.Zi0() % 86400) >= 82800 || i <= 18000) { f1 = 0.9F; } else if (i <= 25200) { f1 = 0.9F - f / 7200.0F * (i - 18000); } else if (i >= 75600) { f1 = f / 7200.0F * (i - 75600) + f1; }  }  d = d / 10.0D * 1.0D; float f2; if ((f2 = (float)(1.0D - d)) >= f1) f1 = f2;  this
/* 15 */       .Pl0.set(1.0F, 1.0F, 1.0F, f1); return this.Pl0; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Or.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */