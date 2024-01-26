/*  1 */ package f;public abstract class static { public static final eo fO = new eo(); public static final eo my = new eo(); public static final eo id0 = new eo(); public static final eo BC = new eo(); public static final eo jl = new eo(); public static final eo Af = new eo(); public final tc zS; public eo lpt8 = new eo(); public eo Bm0 = new eo(); public eo ao = new eo(); public eo vC = new eo(); public eo Yk0 = new eo(); public Matrix4 Su0 = null; public boolean v = true; public long xu0; public boolean CK = false; public boolean GQ = false; public byte G30 = -1; public ny K70 = null; public int R90 = 0; public final Pn0 XH = new Pn0(2, 300); public final Pn0 Sc0 = new Pn0(50, 25); public final Pn0 z4 = (new Pn0(4, 180)).WJ(); public E8 GO; public boolean Jg0 = true; public final byte DE0() { byte b; if ((b = this.G30) != -1) return b; 
/*  2 */     return this.zS.HW.g50; }
/*    */   public boolean Gj0 = true; public long Ni; public lpt1 e5; public lpt1 bX; public lpt1 qp; public lpt1 kA0; public lpt1 z30; public lpt1 GU; public lpt1 nU; public lpt1 YT; public k90 c5; public k90 i70; public boolean wg = false; public lpt1 YB = null; public byte UB; public float wz0 = 0.0F; public eo Wy0 = new eo(); public TG0 eg0 = new TG0(); public TG0 V4 = new TG0(); public nl Eq0 = null; public static(tc paramtc) { this.zS = paramtc; } public final int JD0() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual DE0 : ()B
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: iconst_3
/*    */     //   7: if_icmpne -> 13
/*    */     //   10: iinc #1, -1
/*    */     //   13: aload_0
/*    */     //   14: getfield zS : Lf/tc;
/*    */     //   17: invokevirtual z80 : ()Z
/*    */     //   20: ifeq -> 105
/*    */     //   23: aload_0
/*    */     //   24: getfield Gj0 : Z
/*    */     //   27: ifeq -> 105
/*    */     //   30: aload_0
/*    */     //   31: getfield zS : Lf/tc;
/*    */     //   34: invokevirtual XC : ()Z
/*    */     //   37: ifne -> 105
/*    */     //   40: aload_0
/*    */     //   41: getfield zS : Lf/tc;
/*    */     //   44: invokevirtual UG : ()Z
/*    */     //   47: ifne -> 105
/*    */     //   50: aload_0
/*    */     //   51: getfield zS : Lf/tc;
/*    */     //   54: invokevirtual VO : ()Z
/*    */     //   57: ifne -> 105
/*    */     //   60: aload_0
/*    */     //   61: iload_1
/*    */     //   62: iconst_2
/*    */     //   63: imul
/*    */     //   64: bipush #9
/*    */     //   66: iadd
/*    */     //   67: iload_1
/*    */     //   68: iadd
/*    */     //   69: istore_0
/*    */     //   70: getfield R90 : I
/*    */     //   73: dup
/*    */     //   74: istore_1
/*    */     //   75: iconst_1
/*    */     //   76: if_icmpeq -> 97
/*    */     //   79: iload_1
/*    */     //   80: iconst_3
/*    */     //   81: if_icmpeq -> 89
/*    */     //   84: iload_0
/*    */     //   85: istore_1
/*    */     //   86: goto -> 191
/*    */     //   89: iinc #0, 2
/*    */     //   92: iload_0
/*    */     //   93: istore_1
/*    */     //   94: goto -> 191
/*    */     //   97: iinc #0, 1
/*    */     //   100: iload_0
/*    */     //   101: istore_1
/*    */     //   102: goto -> 191
/*    */     //   105: aload_0
/*    */     //   106: getfield zS : Lf/tc;
/*    */     //   109: invokevirtual UG : ()Z
/*    */     //   112: ifne -> 164
/*    */     //   115: aload_0
/*    */     //   116: getfield zS : Lf/tc;
/*    */     //   119: invokevirtual VO : ()Z
/*    */     //   122: ifeq -> 128
/*    */     //   125: goto -> 164
/*    */     //   128: aload_0
/*    */     //   129: getfield R90 : I
/*    */     //   132: dup
/*    */     //   133: istore_0
/*    */     //   134: iconst_1
/*    */     //   135: if_icmpeq -> 155
/*    */     //   138: iload_0
/*    */     //   139: iconst_3
/*    */     //   140: if_icmpeq -> 146
/*    */     //   143: goto -> 191
/*    */     //   146: iload_1
/*    */     //   147: iconst_2
/*    */     //   148: imul
/*    */     //   149: iconst_4
/*    */     //   150: iadd
/*    */     //   151: istore_1
/*    */     //   152: goto -> 191
/*    */     //   155: iload_1
/*    */     //   156: iconst_2
/*    */     //   157: imul
/*    */     //   158: iconst_3
/*    */     //   159: iadd
/*    */     //   160: istore_1
/*    */     //   161: goto -> 191
/*    */     //   164: aload_0
/*    */     //   165: getfield R90 : I
/*    */     //   168: dup
/*    */     //   169: istore_0
/*    */     //   170: iconst_1
/*    */     //   171: if_icmpeq -> 188
/*    */     //   174: iload_0
/*    */     //   175: iconst_3
/*    */     //   176: if_icmpeq -> 182
/*    */     //   179: goto -> 191
/*    */     //   182: iinc #1, 6
/*    */     //   185: goto -> 191
/*    */     //   188: iinc #1, 3
/*    */     //   191: iload_1
/*    */     //   192: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*  3 */     //   #2	-> 31 } public tc ns0() { return this.zS; } public abstract boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean); public int zv() { throw new RuntimeException(); } public int e60() { throw new RuntimeException(); } public void fH(boolean paramBoolean1, boolean paramBoolean2) { throw new RuntimeException(); } public boolean nc0() { return false; } public final void wS() { long l = zm0.u20; this
/*    */       
/*  5 */       .xu0 = l - d7.HQ;
/*    */     
/*  7 */     this.CK = d7.J4;
/*    */     
/*  9 */     this.GQ = d7.eF; d7 d7; (d7 = this.zS.pm).si0(); } public final boolean kE0(tH paramtH, K70 paramK70, fo0 paramfo0) { if (this.zS.z80() && !this.zS.XC()) { i = 140; } else { this.zS.getClass(); i = 160; }  if (this.xu0 > (i * 2)) { this.Ni = 0L; this.R90 = 0; return false; }  this.Ni = l; long l; if ((l = this.Ni + zm0.O20) > (i * 4)) this.Ni = 0L;  this.R90 = (int)(this.Ni / i) % 4; int i = JD0(); if (paramK70 != null) { this.zS.D4(); Le0(paramK70, paramfo0, i, false); } else { HY(paramtH, this.zS.D4(), i, false); }  return true; } public final boolean Vn(tH paramtH, K70 paramK70, Ih0 paramIh0, fo0 paramfo0, nl paramnl) { // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: ifnonnull -> 7
/*    */     //   5: iconst_0
/*    */     //   6: ireturn
/*    */     //   7: aload #5
/*    */     //   9: aload_0
/*    */     //   10: iconst_0
/*    */     //   11: istore #6
/*    */     //   13: getfield zS : Lf/tc;
/*    */     //   16: invokevirtual D4 : ()S
/*    */     //   19: istore #7
/*    */     //   21: invokevirtual ordinal : ()I
/*    */     //   24: dup
/*    */     //   25: istore #8
/*    */     //   27: bipush #85
/*    */     //   29: if_icmpeq -> 2491
/*    */     //   32: iload #8
/*    */     //   34: bipush #86
/*    */     //   36: if_icmpeq -> 2373
/*    */     //   39: iload #8
/*    */     //   41: bipush #92
/*    */     //   43: if_icmpeq -> 2317
/*    */     //   46: iload #8
/*    */     //   48: bipush #93
/*    */     //   50: if_icmpeq -> 2317
/*    */     //   53: iload #8
/*    */     //   55: bipush #98
/*    */     //   57: if_icmpeq -> 2064
/*    */     //   60: iload #8
/*    */     //   62: bipush #99
/*    */     //   64: if_icmpeq -> 1784
/*    */     //   67: iload #8
/*    */     //   69: bipush #101
/*    */     //   71: if_icmpeq -> 1702
/*    */     //   74: iload #8
/*    */     //   76: sipush #180
/*    */     //   79: if_icmpeq -> 2491
/*    */     //   82: iload #8
/*    */     //   84: sipush #181
/*    */     //   87: if_icmpeq -> 1694
/*    */     //   90: iload #8
/*    */     //   92: tableswitch default -> 168, 299 -> 1394, 300 -> 1096, 301 -> 868, 302 -> 868, 303 -> 868, 304 -> 868, 305 -> 814, 306 -> 797, 307 -> 785, 308 -> 723, 309 -> 360, 310 -> 360, 311 -> 360, 312 -> 360, 313 -> 175
/*    */     //   168: aload_0
/*    */     //   169: aconst_null
/*    */     //   170: putfield Eq0 : Lf/nl;
/*    */     //   173: iconst_0
/*    */     //   174: ireturn
/*    */     //   175: aload_2
/*    */     //   176: aload_0
/*    */     //   177: invokevirtual JD0 : ()I
/*    */     //   180: istore #6
/*    */     //   182: ifnull -> 2505
/*    */     //   185: aload_0
/*    */     //   186: getfield GU : Lf/lpt1;
/*    */     //   189: ifnonnull -> 205
/*    */     //   192: aload_0
/*    */     //   193: invokestatic vY : ()Lf/zp0;
/*    */     //   196: getfield BK0 : Lf/lpt1;
/*    */     //   199: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   202: putfield GU : Lf/lpt1;
/*    */     //   205: getstatic f/zm0.u20 : J
/*    */     //   208: aload_0
/*    */     //   209: invokevirtual ns0 : ()Lf/tc;
/*    */     //   212: getfield pm : Lf/d7;
/*    */     //   215: getfield rl0 : J
/*    */     //   218: lsub
/*    */     //   219: ldc2_w 100
/*    */     //   222: lcmp
/*    */     //   223: ifge -> 237
/*    */     //   226: aload_0
/*    */     //   227: getfield GU : Lf/lpt1;
/*    */     //   230: iconst_0
/*    */     //   231: iconst_0
/*    */     //   232: aconst_null
/*    */     //   233: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   236: pop
/*    */     //   237: aload_2
/*    */     //   238: aload_0
/*    */     //   239: dup
/*    */     //   240: dup
/*    */     //   241: dup2
/*    */     //   242: dup2
/*    */     //   243: getfield eg0 : Lf/TG0;
/*    */     //   246: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   249: pop
/*    */     //   250: getfield eg0 : Lf/TG0;
/*    */     //   253: getstatic f/eo.Y : Lf/eo;
/*    */     //   256: fconst_0
/*    */     //   257: invokevirtual eY : (Lf/eo;F)V
/*    */     //   260: getfield GU : Lf/lpt1;
/*    */     //   263: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   266: aload_0
/*    */     //   267: dup
/*    */     //   268: getfield ao : Lf/eo;
/*    */     //   271: astore_3
/*    */     //   272: getfield eg0 : Lf/TG0;
/*    */     //   275: aload_3
/*    */     //   276: swap
/*    */     //   277: getstatic f/static.fO : Lf/eo;
/*    */     //   280: fconst_1
/*    */     //   281: fconst_1
/*    */     //   282: fconst_1
/*    */     //   283: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   286: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   289: pop
/*    */     //   290: getfield zS : Lf/tc;
/*    */     //   293: getfield HW : Lf/G5;
/*    */     //   296: getfield g50 : B
/*    */     //   299: invokestatic h0 : (B)Lf/eo;
/*    */     //   302: ldc_w 0.25
/*    */     //   305: fconst_0
/*    */     //   306: ldc_w 0.25
/*    */     //   309: invokevirtual Qh0 : (FFF)Lf/eo;
/*    */     //   312: astore_3
/*    */     //   313: getfield GU : Lf/lpt1;
/*    */     //   316: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   319: aload_3
/*    */     //   320: getfield x : F
/*    */     //   323: aload_3
/*    */     //   324: getfield z : F
/*    */     //   327: ldc_w 0.1
/*    */     //   330: fadd
/*    */     //   331: ldc_w -0.15
/*    */     //   334: swap
/*    */     //   335: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   338: pop
/*    */     //   339: getfield GU : Lf/lpt1;
/*    */     //   342: aload_0
/*    */     //   343: getfield wz0 : F
/*    */     //   346: invokevirtual wP : (F)V
/*    */     //   349: getfield GU : Lf/lpt1;
/*    */     //   352: aload #4
/*    */     //   354: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   357: goto -> 2505
/*    */     //   360: aload_0
/*    */     //   361: invokevirtual ns0 : ()Lf/tc;
/*    */     //   364: getfield pm : Lf/d7;
/*    */     //   367: aconst_null
/*    */     //   368: putfield Mv : Lf/nl;
/*    */     //   371: getstatic f/km.a3 : Lf/vh0;
/*    */     //   374: dup
/*    */     //   375: astore_3
/*    */     //   376: ifnonnull -> 382
/*    */     //   379: goto -> 2505
/*    */     //   382: aload_3
/*    */     //   383: getfield Ct : Lf/Jo;
/*    */     //   386: dup
/*    */     //   387: astore_3
/*    */     //   388: ifnonnull -> 394
/*    */     //   391: goto -> 2505
/*    */     //   394: aload_0
/*    */     //   395: getfield zS : Lf/tc;
/*    */     //   398: getfield Jg : I
/*    */     //   401: aload_3
/*    */     //   402: getfield Jg : I
/*    */     //   405: if_icmpeq -> 417
/*    */     //   408: getstatic f/h1.Vy : Z
/*    */     //   411: ifeq -> 417
/*    */     //   414: goto -> 2505
/*    */     //   417: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   420: getfield iJ0 : Lf/Xi;
/*    */     //   423: invokevirtual eA0 : ()Lf/kg0;
/*    */     //   426: dup
/*    */     //   427: astore_3
/*    */     //   428: ifnull -> 2505
/*    */     //   431: aload_0
/*    */     //   432: aload_3
/*    */     //   433: dup
/*    */     //   434: aload #5
/*    */     //   436: getfield SB : B
/*    */     //   439: getstatic f/nl.yp : Lf/nl;
/*    */     //   442: getfield SB : B
/*    */     //   445: isub
/*    */     //   446: iconst_1
/*    */     //   447: iadd
/*    */     //   448: istore_3
/*    */     //   449: getstatic f/q10.Rs : Lf/eo;
/*    */     //   452: aload_0
/*    */     //   453: getfield lpt8 : Lf/eo;
/*    */     //   456: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   459: fconst_0
/*    */     //   460: fconst_0
/*    */     //   461: ldc_w 0.25
/*    */     //   464: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   467: pop
/*    */     //   468: getstatic f/q10.HF : Lf/eo;
/*    */     //   471: aload_0
/*    */     //   472: getfield lpt8 : Lf/eo;
/*    */     //   475: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   478: fconst_0
/*    */     //   479: fconst_0
/*    */     //   480: ldc_w 0.25
/*    */     //   483: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   486: pop
/*    */     //   487: new java/lang/StringBuilder
/*    */     //   490: dup
/*    */     //   491: invokespecial <init> : ()V
/*    */     //   494: ldc_w 'custom/firework_0'
/*    */     //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   500: iload_3
/*    */     //   501: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   504: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   507: invokevirtual gi0 : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;
/*    */     //   510: dup
/*    */     //   511: invokevirtual start : ()V
/*    */     //   514: invokevirtual L40 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt;)V
/*    */     //   517: iconst_0
/*    */     //   518: iconst_2
/*    */     //   519: invokestatic A90 : (II)I
/*    */     //   522: istore #8
/*    */     //   524: iconst_5
/*    */     //   525: newarray short
/*    */     //   527: dup
/*    */     //   528: dup2
/*    */     //   529: dup2
/*    */     //   530: astore #9
/*    */     //   532: iconst_0
/*    */     //   533: sipush #1475
/*    */     //   536: sastore
/*    */     //   537: iconst_1
/*    */     //   538: sipush #1682
/*    */     //   541: sastore
/*    */     //   542: iconst_2
/*    */     //   543: sipush #1683
/*    */     //   546: sastore
/*    */     //   547: iconst_3
/*    */     //   548: sipush #1746
/*    */     //   551: sastore
/*    */     //   552: iconst_4
/*    */     //   553: sipush #1816
/*    */     //   556: sastore
/*    */     //   557: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   560: astore #10
/*    */     //   562: getfield zS : Lf/tc;
/*    */     //   565: aload #10
/*    */     //   567: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   570: pop
/*    */     //   571: invokestatic xz0 : (Lf/tc;)F
/*    */     //   574: dup
/*    */     //   575: fstore #10
/*    */     //   577: fconst_0
/*    */     //   578: fcmpl
/*    */     //   579: ifle -> 2505
/*    */     //   582: iconst_3
/*    */     //   583: iconst_4
/*    */     //   584: invokestatic A90 : (II)I
/*    */     //   587: aload #9
/*    */     //   589: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   592: astore #11
/*    */     //   594: iconst_2
/*    */     //   595: istore #12
/*    */     //   597: iconst_3
/*    */     //   598: iconst_4
/*    */     //   599: invokestatic A90 : (II)I
/*    */     //   602: saload
/*    */     //   603: istore #13
/*    */     //   605: iconst_1
/*    */     //   606: istore #14
/*    */     //   608: fconst_0
/*    */     //   609: fstore #15
/*    */     //   611: iconst_4
/*    */     //   612: if_icmpne -> 623
/*    */     //   615: sipush #500
/*    */     //   618: istore #16
/*    */     //   620: goto -> 627
/*    */     //   623: bipush #50
/*    */     //   625: istore #16
/*    */     //   627: iload_3
/*    */     //   628: aload #11
/*    */     //   630: iload #12
/*    */     //   632: iload #13
/*    */     //   634: iload #14
/*    */     //   636: fload #15
/*    */     //   638: fload #10
/*    */     //   640: iload #16
/*    */     //   642: invokevirtual dv : (BSZFFI)V
/*    */     //   645: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   648: aload #9
/*    */     //   650: iload #8
/*    */     //   652: saload
/*    */     //   653: iconst_2
/*    */     //   654: swap
/*    */     //   655: iconst_1
/*    */     //   656: fconst_0
/*    */     //   657: fload #10
/*    */     //   659: sipush #800
/*    */     //   662: invokevirtual dv : (BSZFFI)V
/*    */     //   665: iconst_1
/*    */     //   666: if_icmpeq -> 674
/*    */     //   669: iload_3
/*    */     //   670: iconst_3
/*    */     //   671: if_icmpne -> 697
/*    */     //   674: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   677: fload #10
/*    */     //   679: ldc_w 0.5
/*    */     //   682: fmul
/*    */     //   683: fstore_3
/*    */     //   684: iconst_2
/*    */     //   685: sipush #1475
/*    */     //   688: iconst_1
/*    */     //   689: fconst_0
/*    */     //   690: fload_3
/*    */     //   691: sipush #1200
/*    */     //   694: invokevirtual dv : (BSZFFI)V
/*    */     //   697: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   700: fload #10
/*    */     //   702: ldc_w 0.25
/*    */     //   705: fmul
/*    */     //   706: fstore_3
/*    */     //   707: iconst_2
/*    */     //   708: sipush #1825
/*    */     //   711: iconst_1
/*    */     //   712: fconst_0
/*    */     //   713: fload_3
/*    */     //   714: sipush #1000
/*    */     //   717: invokevirtual dv : (BSZFFI)V
/*    */     //   720: goto -> 2505
/*    */     //   723: aload_0
/*    */     //   724: invokevirtual ns0 : ()Lf/tc;
/*    */     //   727: invokevirtual D4 : ()S
/*    */     //   730: dup
/*    */     //   731: istore_3
/*    */     //   732: sipush #203
/*    */     //   735: if_icmpeq -> 771
/*    */     //   738: iload_3
/*    */     //   739: sipush #2030
/*    */     //   742: if_icmpne -> 748
/*    */     //   745: goto -> 771
/*    */     //   748: getstatic f/zm0.u20 : J
/*    */     //   751: aload_0
/*    */     //   752: invokevirtual ns0 : ()Lf/tc;
/*    */     //   755: getfield pm : Lf/d7;
/*    */     //   758: getfield rl0 : J
/*    */     //   761: lsub
/*    */     //   762: ldc2_w 150
/*    */     //   765: ldiv
/*    */     //   766: l2i
/*    */     //   767: istore_3
/*    */     //   768: goto -> 773
/*    */     //   771: iconst_0
/*    */     //   772: istore_3
/*    */     //   773: iload_3
/*    */     //   774: bipush #8
/*    */     //   776: if_icmpge -> 2505
/*    */     //   779: iload_3
/*    */     //   780: istore #6
/*    */     //   782: goto -> 2505
/*    */     //   785: aload_0
/*    */     //   786: getfield z4 : Lf/Pn0;
/*    */     //   789: invokevirtual Nn0 : ()I
/*    */     //   792: istore #6
/*    */     //   794: goto -> 2505
/*    */     //   797: getstatic f/zm0.u20 : J
/*    */     //   800: ldc2_w 150
/*    */     //   803: ldiv
/*    */     //   804: ldc2_w 8
/*    */     //   807: lrem
/*    */     //   808: l2i
/*    */     //   809: istore #6
/*    */     //   811: goto -> 2505
/*    */     //   814: getstatic f/zm0.u20 : J
/*    */     //   817: aload_0
/*    */     //   818: invokevirtual ns0 : ()Lf/tc;
/*    */     //   821: getfield pm : Lf/d7;
/*    */     //   824: getfield rl0 : J
/*    */     //   827: lsub
/*    */     //   828: ldc2_w 60
/*    */     //   831: ldiv
/*    */     //   832: l2i
/*    */     //   833: dup
/*    */     //   834: istore_3
/*    */     //   835: iconst_3
/*    */     //   836: if_icmple -> 841
/*    */     //   839: iconst_1
/*    */     //   840: ireturn
/*    */     //   841: aload_2
/*    */     //   842: ifnull -> 857
/*    */     //   845: aload_0
/*    */     //   846: aload_2
/*    */     //   847: aload #4
/*    */     //   849: iload_3
/*    */     //   850: iconst_1
/*    */     //   851: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   854: goto -> 866
/*    */     //   857: aload_0
/*    */     //   858: aload_1
/*    */     //   859: iload #7
/*    */     //   861: iload_3
/*    */     //   862: iconst_1
/*    */     //   863: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   866: iconst_1
/*    */     //   867: ireturn
/*    */     //   868: aload_0
/*    */     //   869: aload #5
/*    */     //   871: getfield rb : B
/*    */     //   874: istore_3
/*    */     //   875: getfield YT : Lf/lpt1;
/*    */     //   878: ifnonnull -> 894
/*    */     //   881: aload_0
/*    */     //   882: invokestatic vY : ()Lf/zp0;
/*    */     //   885: getfield Qj : Lf/lpt1;
/*    */     //   888: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   891: putfield YT : Lf/lpt1;
/*    */     //   894: iload_3
/*    */     //   895: aload_0
/*    */     //   896: getfield YT : Lf/lpt1;
/*    */     //   899: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   902: aload_0
/*    */     //   903: getfield ao : Lf/eo;
/*    */     //   906: aload_0
/*    */     //   907: getfield eg0 : Lf/TG0;
/*    */     //   910: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   913: getstatic f/static.fO : Lf/eo;
/*    */     //   916: fconst_1
/*    */     //   917: fconst_1
/*    */     //   918: fconst_1
/*    */     //   919: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   922: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   925: pop
/*    */     //   926: iconst_1
/*    */     //   927: if_icmpne -> 966
/*    */     //   930: aload_0
/*    */     //   931: dup
/*    */     //   932: getfield YT : Lf/lpt1;
/*    */     //   935: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   938: getstatic f/eo.Y : Lf/eo;
/*    */     //   941: ldc_w 180.0
/*    */     //   944: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   947: pop
/*    */     //   948: getfield YT : Lf/lpt1;
/*    */     //   951: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   954: fconst_0
/*    */     //   955: ldc_w -0.22
/*    */     //   958: fconst_0
/*    */     //   959: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   962: pop
/*    */     //   963: goto -> 1080
/*    */     //   966: iload_3
/*    */     //   967: iconst_3
/*    */     //   968: if_icmpne -> 1017
/*    */     //   971: aload_0
/*    */     //   972: dup
/*    */     //   973: getfield YT : Lf/lpt1;
/*    */     //   976: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   979: getstatic f/eo.Y : Lf/eo;
/*    */     //   982: ldc_w 90.0
/*    */     //   985: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   988: pop
/*    */     //   989: getfield YT : Lf/lpt1;
/*    */     //   992: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   995: ldc_w -0.1
/*    */     //   998: ldc_w -0.2
/*    */     //   1001: ldc_w 0.15
/*    */     //   1004: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1007: pop
/*    */     //   1008: iinc #3, -1
/*    */     //   1011: iload_3
/*    */     //   1012: istore #6
/*    */     //   1014: goto -> 1083
/*    */     //   1017: iload_3
/*    */     //   1018: iconst_2
/*    */     //   1019: if_icmpne -> 1062
/*    */     //   1022: aload_0
/*    */     //   1023: dup
/*    */     //   1024: getfield YT : Lf/lpt1;
/*    */     //   1027: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1030: getstatic f/eo.Y : Lf/eo;
/*    */     //   1033: ldc_w -90.0
/*    */     //   1036: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1039: pop
/*    */     //   1040: getfield YT : Lf/lpt1;
/*    */     //   1043: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1046: ldc_w 0.1
/*    */     //   1049: ldc_w -0.2
/*    */     //   1052: ldc_w 0.15
/*    */     //   1055: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1058: pop
/*    */     //   1059: goto -> 1080
/*    */     //   1062: aload_0
/*    */     //   1063: getfield YT : Lf/lpt1;
/*    */     //   1066: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1069: fconst_0
/*    */     //   1070: ldc_w -0.22
/*    */     //   1073: ldc_w 0.225
/*    */     //   1076: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1079: pop
/*    */     //   1080: iload_3
/*    */     //   1081: istore #6
/*    */     //   1083: aload_2
/*    */     //   1084: aload_0
/*    */     //   1085: getfield YT : Lf/lpt1;
/*    */     //   1088: aload #4
/*    */     //   1090: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1093: goto -> 2505
/*    */     //   1096: getstatic f/zm0.u20 : J
/*    */     //   1099: aload_0
/*    */     //   1100: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1103: getfield pm : Lf/d7;
/*    */     //   1106: getfield rl0 : J
/*    */     //   1109: lsub
/*    */     //   1110: ldc2_w 140
/*    */     //   1113: ldiv
/*    */     //   1114: l2i
/*    */     //   1115: dup
/*    */     //   1116: istore #8
/*    */     //   1118: iconst_5
/*    */     //   1119: if_icmpge -> 1154
/*    */     //   1122: aload_0
/*    */     //   1123: getfield zS : Lf/tc;
/*    */     //   1126: invokevirtual UG : ()Z
/*    */     //   1129: ifne -> 1154
/*    */     //   1132: aload_0
/*    */     //   1133: getfield zS : Lf/tc;
/*    */     //   1136: invokevirtual XC : ()Z
/*    */     //   1139: ifne -> 1154
/*    */     //   1142: iload #8
/*    */     //   1144: bipush #36
/*    */     //   1146: iadd
/*    */     //   1147: bipush #38
/*    */     //   1149: invokestatic min : (II)I
/*    */     //   1152: istore #6
/*    */     //   1154: aload_2
/*    */     //   1155: ifnull -> 2505
/*    */     //   1158: aload_0
/*    */     //   1159: getfield zS : Lf/tc;
/*    */     //   1162: invokevirtual Pf : ()Z
/*    */     //   1165: ifeq -> 2505
/*    */     //   1168: aload_0
/*    */     //   1169: getfield i70 : Lf/k90;
/*    */     //   1172: ifnonnull -> 1253
/*    */     //   1175: getstatic f/zm0.u20 : J
/*    */     //   1178: aload_0
/*    */     //   1179: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1182: getfield pm : Lf/d7;
/*    */     //   1185: getfield rl0 : J
/*    */     //   1188: lsub
/*    */     //   1189: ldc2_w 100
/*    */     //   1192: lcmp
/*    */     //   1193: ifge -> 1253
/*    */     //   1196: getstatic f/km.u4 : Lf/R8;
/*    */     //   1199: iconst_1
/*    */     //   1200: putfield GG0 : Z
/*    */     //   1203: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1206: new f/sA0
/*    */     //   1209: dup
/*    */     //   1210: invokespecial <init> : ()V
/*    */     //   1213: invokevirtual PH0 : (Lf/sA0;)V
/*    */     //   1216: new f/k90
/*    */     //   1219: dup
/*    */     //   1220: aload_0
/*    */     //   1221: swap
/*    */     //   1222: dup
/*    */     //   1223: invokestatic vY : ()Lf/zp0;
/*    */     //   1226: getfield uC0 : Lf/lpt1;
/*    */     //   1229: invokespecial <init> : (Lf/lpt1;)V
/*    */     //   1232: putfield i70 : Lf/k90;
/*    */     //   1235: new f/Ex
/*    */     //   1238: dup
/*    */     //   1239: astore #8
/*    */     //   1241: aload_0
/*    */     //   1242: invokespecial <init> : (Lf/static;)V
/*    */     //   1245: iconst_0
/*    */     //   1246: iconst_0
/*    */     //   1247: aload #8
/*    */     //   1249: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   1252: pop
/*    */     //   1253: aload_0
/*    */     //   1254: getfield i70 : Lf/k90;
/*    */     //   1257: ifnull -> 2505
/*    */     //   1260: aload_0
/*    */     //   1261: dup
/*    */     //   1262: dup
/*    */     //   1263: dup2
/*    */     //   1264: dup2
/*    */     //   1265: getfield eg0 : Lf/TG0;
/*    */     //   1268: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   1271: pop
/*    */     //   1272: getfield i70 : Lf/k90;
/*    */     //   1275: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1278: aload_0
/*    */     //   1279: dup
/*    */     //   1280: getfield ao : Lf/eo;
/*    */     //   1283: astore_1
/*    */     //   1284: getfield eg0 : Lf/TG0;
/*    */     //   1287: astore_2
/*    */     //   1288: aload_1
/*    */     //   1289: getstatic f/static.fO : Lf/eo;
/*    */     //   1292: fconst_1
/*    */     //   1293: fconst_1
/*    */     //   1294: fconst_1
/*    */     //   1295: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1298: aload_2
/*    */     //   1299: swap
/*    */     //   1300: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1303: pop
/*    */     //   1304: getfield i70 : Lf/k90;
/*    */     //   1307: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1310: ldc_w -0.05
/*    */     //   1313: ldc_w -0.25
/*    */     //   1316: ldc_w 0.1
/*    */     //   1319: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1322: pop
/*    */     //   1323: getfield i70 : Lf/k90;
/*    */     //   1326: aload_0
/*    */     //   1327: dup
/*    */     //   1328: getfield lpt8 : Lf/eo;
/*    */     //   1331: astore_1
/*    */     //   1332: getfield Yk0 : Lf/eo;
/*    */     //   1335: aload_1
/*    */     //   1336: swap
/*    */     //   1337: aload_3
/*    */     //   1338: invokevirtual pl : (Lf/eo;Lf/eo;Lf/Ih0;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1341: putfield Su0 : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1344: getfield i70 : Lf/k90;
/*    */     //   1347: dup
/*    */     //   1348: aload_0
/*    */     //   1349: swap
/*    */     //   1350: ldc_w 1.25
/*    */     //   1353: putfield k : F
/*    */     //   1356: getfield wz0 : F
/*    */     //   1359: aconst_null
/*    */     //   1360: invokevirtual j10 : (FLf/lw;)V
/*    */     //   1363: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1366: getfield vF : Lf/vg0;
/*    */     //   1369: aload_0
/*    */     //   1370: getfield i70 : Lf/k90;
/*    */     //   1373: aload #4
/*    */     //   1375: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1378: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1381: getfield vF : Lf/vg0;
/*    */     //   1384: aload #4
/*    */     //   1386: iload #6
/*    */     //   1388: iconst_0
/*    */     //   1389: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   1392: iconst_1
/*    */     //   1393: ireturn
/*    */     //   1394: getstatic f/zm0.u20 : J
/*    */     //   1397: aload_0
/*    */     //   1398: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1401: getfield pm : Lf/d7;
/*    */     //   1404: getfield rl0 : J
/*    */     //   1407: lsub
/*    */     //   1408: ldc2_w 140
/*    */     //   1411: ldiv
/*    */     //   1412: l2i
/*    */     //   1413: dup
/*    */     //   1414: istore #8
/*    */     //   1416: bipush #8
/*    */     //   1418: if_icmplt -> 1463
/*    */     //   1421: iload #8
/*    */     //   1423: bipush #15
/*    */     //   1425: if_icmpge -> 1463
/*    */     //   1428: aload_0
/*    */     //   1429: getfield zS : Lf/tc;
/*    */     //   1432: invokevirtual UG : ()Z
/*    */     //   1435: ifne -> 1463
/*    */     //   1438: aload_0
/*    */     //   1439: getfield zS : Lf/tc;
/*    */     //   1442: invokevirtual XC : ()Z
/*    */     //   1445: ifne -> 1463
/*    */     //   1448: iload #8
/*    */     //   1450: bipush #36
/*    */     //   1452: iadd
/*    */     //   1453: bipush #8
/*    */     //   1455: isub
/*    */     //   1456: bipush #38
/*    */     //   1458: invokestatic min : (II)I
/*    */     //   1461: istore #6
/*    */     //   1463: aload_2
/*    */     //   1464: ifnull -> 2505
/*    */     //   1467: aload_0
/*    */     //   1468: getfield zS : Lf/tc;
/*    */     //   1471: invokevirtual Pf : ()Z
/*    */     //   1474: ifeq -> 2505
/*    */     //   1477: aload_0
/*    */     //   1478: getstatic f/zm0.u20 : J
/*    */     //   1481: aload_0
/*    */     //   1482: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1485: getfield pm : Lf/d7;
/*    */     //   1488: getfield rl0 : J
/*    */     //   1491: lsub
/*    */     //   1492: lstore #8
/*    */     //   1494: getfield c5 : Lf/k90;
/*    */     //   1497: ifnonnull -> 1551
/*    */     //   1500: lload #8
/*    */     //   1502: ldc2_w 500
/*    */     //   1505: lcmp
/*    */     //   1506: ifge -> 1551
/*    */     //   1509: aload_0
/*    */     //   1510: iconst_0
/*    */     //   1511: putfield Jg0 : Z
/*    */     //   1514: new f/k90
/*    */     //   1517: dup
/*    */     //   1518: aload_0
/*    */     //   1519: swap
/*    */     //   1520: dup
/*    */     //   1521: invokestatic vY : ()Lf/zp0;
/*    */     //   1524: getfield pv : Lf/lpt1;
/*    */     //   1527: invokespecial <init> : (Lf/lpt1;)V
/*    */     //   1530: putfield c5 : Lf/k90;
/*    */     //   1533: new f/Kb
/*    */     //   1536: dup
/*    */     //   1537: astore #8
/*    */     //   1539: aload_0
/*    */     //   1540: invokespecial <init> : (Lf/static;)V
/*    */     //   1543: iconst_0
/*    */     //   1544: iconst_0
/*    */     //   1545: aload #8
/*    */     //   1547: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   1550: pop
/*    */     //   1551: aload_0
/*    */     //   1552: getfield c5 : Lf/k90;
/*    */     //   1555: ifnull -> 2505
/*    */     //   1558: aload_0
/*    */     //   1559: dup
/*    */     //   1560: dup2
/*    */     //   1561: dup2
/*    */     //   1562: dup2
/*    */     //   1563: getfield eg0 : Lf/TG0;
/*    */     //   1566: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   1569: pop
/*    */     //   1570: getfield c5 : Lf/k90;
/*    */     //   1573: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1576: aload_0
/*    */     //   1577: dup
/*    */     //   1578: getfield ao : Lf/eo;
/*    */     //   1581: astore_1
/*    */     //   1582: getfield eg0 : Lf/TG0;
/*    */     //   1585: astore_2
/*    */     //   1586: aload_1
/*    */     //   1587: getstatic f/static.fO : Lf/eo;
/*    */     //   1590: fconst_1
/*    */     //   1591: fconst_1
/*    */     //   1592: fconst_1
/*    */     //   1593: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1596: aload_2
/*    */     //   1597: swap
/*    */     //   1598: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1601: pop
/*    */     //   1602: getfield c5 : Lf/k90;
/*    */     //   1605: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1608: ldc_w -0.05
/*    */     //   1611: ldc_w -0.25
/*    */     //   1614: ldc_w 0.1
/*    */     //   1617: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1620: pop
/*    */     //   1621: getfield c5 : Lf/k90;
/*    */     //   1624: aload_0
/*    */     //   1625: dup
/*    */     //   1626: getfield lpt8 : Lf/eo;
/*    */     //   1629: astore_1
/*    */     //   1630: getfield Yk0 : Lf/eo;
/*    */     //   1633: aload_1
/*    */     //   1634: swap
/*    */     //   1635: aload_3
/*    */     //   1636: invokevirtual pl : (Lf/eo;Lf/eo;Lf/Ih0;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1639: putfield Su0 : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1642: getfield c5 : Lf/k90;
/*    */     //   1645: dup
/*    */     //   1646: aload_0
/*    */     //   1647: swap
/*    */     //   1648: fconst_1
/*    */     //   1649: putfield k : F
/*    */     //   1652: getfield wz0 : F
/*    */     //   1655: aconst_null
/*    */     //   1656: invokevirtual j10 : (FLf/lw;)V
/*    */     //   1659: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1662: getfield vF : Lf/vg0;
/*    */     //   1665: aload_0
/*    */     //   1666: getfield c5 : Lf/k90;
/*    */     //   1669: aload #4
/*    */     //   1671: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1674: iconst_1
/*    */     //   1675: putfield Jg0 : Z
/*    */     //   1678: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1681: getfield vF : Lf/vg0;
/*    */     //   1684: aload #4
/*    */     //   1686: iload #6
/*    */     //   1688: iconst_0
/*    */     //   1689: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   1692: iconst_1
/*    */     //   1693: ireturn
/*    */     //   1694: aload_0
/*    */     //   1695: iconst_1
/*    */     //   1696: putfield Jg0 : Z
/*    */     //   1699: goto -> 2505
/*    */     //   1702: getstatic f/zm0.u20 : J
/*    */     //   1705: aload_0
/*    */     //   1706: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1709: getfield pm : Lf/d7;
/*    */     //   1712: getfield rl0 : J
/*    */     //   1715: lsub
/*    */     //   1716: ldc2_w 140
/*    */     //   1719: ldiv
/*    */     //   1720: l2i
/*    */     //   1721: dup
/*    */     //   1722: istore_3
/*    */     //   1723: iconst_5
/*    */     //   1724: if_icmpge -> 2505
/*    */     //   1727: aload_0
/*    */     //   1728: getfield zS : Lf/tc;
/*    */     //   1731: invokevirtual UG : ()Z
/*    */     //   1734: ifne -> 2505
/*    */     //   1737: aload_0
/*    */     //   1738: getfield zS : Lf/tc;
/*    */     //   1741: invokevirtual XC : ()Z
/*    */     //   1744: ifne -> 2505
/*    */     //   1747: aload_2
/*    */     //   1748: iload_3
/*    */     //   1749: bipush #36
/*    */     //   1751: iadd
/*    */     //   1752: bipush #38
/*    */     //   1754: invokestatic min : (II)I
/*    */     //   1757: istore_3
/*    */     //   1758: ifnull -> 1773
/*    */     //   1761: aload_0
/*    */     //   1762: aload_2
/*    */     //   1763: aload #4
/*    */     //   1765: iload_3
/*    */     //   1766: iconst_1
/*    */     //   1767: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   1770: goto -> 1782
/*    */     //   1773: aload_0
/*    */     //   1774: aload_1
/*    */     //   1775: iload #7
/*    */     //   1777: iload_3
/*    */     //   1778: iconst_1
/*    */     //   1779: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   1782: iconst_1
/*    */     //   1783: ireturn
/*    */     //   1784: aload_0
/*    */     //   1785: invokevirtual DE0 : ()B
/*    */     //   1788: tableswitch default -> 1820, 0 -> 1837, 1 -> 1830, 2 -> 1823, 3 -> 1823
/*    */     //   1820: goto -> 1841
/*    */     //   1823: bipush #39
/*    */     //   1825: istore #6
/*    */     //   1827: goto -> 1841
/*    */     //   1830: bipush #43
/*    */     //   1832: istore #6
/*    */     //   1834: goto -> 1841
/*    */     //   1837: bipush #47
/*    */     //   1839: istore #6
/*    */     //   1841: aload_0
/*    */     //   1842: iconst_0
/*    */     //   1843: istore_3
/*    */     //   1844: getfield xu0 : J
/*    */     //   1847: ldc2_w 750
/*    */     //   1850: lrem
/*    */     //   1851: dup2
/*    */     //   1852: lstore #8
/*    */     //   1854: ldc2_w 100
/*    */     //   1857: lcmp
/*    */     //   1858: iflt -> 1888
/*    */     //   1861: lload #8
/*    */     //   1863: ldc2_w 200
/*    */     //   1866: lcmp
/*    */     //   1867: ifle -> 1882
/*    */     //   1870: lload #8
/*    */     //   1872: ldc2_w 300
/*    */     //   1875: lcmp
/*    */     //   1876: ifge -> 1882
/*    */     //   1879: goto -> 1888
/*    */     //   1882: iinc #6, 3
/*    */     //   1885: goto -> 1893
/*    */     //   1888: iconst_1
/*    */     //   1889: istore_3
/*    */     //   1890: iinc #6, 2
/*    */     //   1893: aload_2
/*    */     //   1894: ifnull -> 2505
/*    */     //   1897: aload_0
/*    */     //   1898: getfield z30 : Lf/lpt1;
/*    */     //   1901: ifnonnull -> 1926
/*    */     //   1904: invokestatic vY : ()Lf/zp0;
/*    */     //   1907: getfield PH : Lf/lpt1;
/*    */     //   1910: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   1913: dup
/*    */     //   1914: aload_0
/*    */     //   1915: swap
/*    */     //   1916: putfield z30 : Lf/lpt1;
/*    */     //   1919: iconst_0
/*    */     //   1920: iconst_1
/*    */     //   1921: aconst_null
/*    */     //   1922: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   1925: pop
/*    */     //   1926: aload_2
/*    */     //   1927: aload_0
/*    */     //   1928: dup
/*    */     //   1929: dup
/*    */     //   1930: dup2
/*    */     //   1931: dup2
/*    */     //   1932: getfield eg0 : Lf/TG0;
/*    */     //   1935: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   1938: pop
/*    */     //   1939: getfield eg0 : Lf/TG0;
/*    */     //   1942: getstatic f/eo.Y : Lf/eo;
/*    */     //   1945: fconst_0
/*    */     //   1946: invokevirtual eY : (Lf/eo;F)V
/*    */     //   1949: getfield z30 : Lf/lpt1;
/*    */     //   1952: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1955: aload_0
/*    */     //   1956: dup
/*    */     //   1957: getfield ao : Lf/eo;
/*    */     //   1960: astore #8
/*    */     //   1962: getfield eg0 : Lf/TG0;
/*    */     //   1965: aload #8
/*    */     //   1967: swap
/*    */     //   1968: getstatic f/static.fO : Lf/eo;
/*    */     //   1971: fconst_1
/*    */     //   1972: fconst_1
/*    */     //   1973: fconst_1
/*    */     //   1974: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1977: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1980: pop
/*    */     //   1981: getfield zS : Lf/tc;
/*    */     //   1984: getfield HW : Lf/G5;
/*    */     //   1987: getfield g50 : B
/*    */     //   1990: invokestatic h0 : (B)Lf/eo;
/*    */     //   1993: ldc_w 0.25
/*    */     //   1996: fconst_0
/*    */     //   1997: ldc_w 0.25
/*    */     //   2000: invokevirtual Qh0 : (FFF)Lf/eo;
/*    */     //   2003: astore #8
/*    */     //   2005: getfield z30 : Lf/lpt1;
/*    */     //   2008: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2011: aload #8
/*    */     //   2013: getfield x : F
/*    */     //   2016: aload #8
/*    */     //   2018: iload_3
/*    */     //   2019: i2f
/*    */     //   2020: ldc_w 0.025
/*    */     //   2023: fmul
/*    */     //   2024: ldc_w -0.15
/*    */     //   2027: swap
/*    */     //   2028: fsub
/*    */     //   2029: fstore_3
/*    */     //   2030: getfield z : F
/*    */     //   2033: ldc_w 0.1
/*    */     //   2036: fadd
/*    */     //   2037: fload_3
/*    */     //   2038: swap
/*    */     //   2039: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2042: pop
/*    */     //   2043: getfield z30 : Lf/lpt1;
/*    */     //   2046: aload_0
/*    */     //   2047: getfield wz0 : F
/*    */     //   2050: invokevirtual wP : (F)V
/*    */     //   2053: getfield z30 : Lf/lpt1;
/*    */     //   2056: aload #4
/*    */     //   2058: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   2061: goto -> 2505
/*    */     //   2064: aload_0
/*    */     //   2065: invokevirtual DE0 : ()B
/*    */     //   2068: tableswitch default -> 2100, 0 -> 2117, 1 -> 2110, 2 -> 2103, 3 -> 2103
/*    */     //   2100: goto -> 2121
/*    */     //   2103: bipush #39
/*    */     //   2105: istore #6
/*    */     //   2107: goto -> 2121
/*    */     //   2110: bipush #43
/*    */     //   2112: istore #6
/*    */     //   2114: goto -> 2121
/*    */     //   2117: bipush #47
/*    */     //   2119: istore #6
/*    */     //   2121: aload_2
/*    */     //   2122: getstatic f/zm0.u20 : J
/*    */     //   2125: aload_0
/*    */     //   2126: invokevirtual ns0 : ()Lf/tc;
/*    */     //   2129: getfield pm : Lf/d7;
/*    */     //   2132: getfield rl0 : J
/*    */     //   2135: lsub
/*    */     //   2136: ldc2_w 100
/*    */     //   2139: ldiv
/*    */     //   2140: l2i
/*    */     //   2141: iconst_3
/*    */     //   2142: swap
/*    */     //   2143: invokestatic min : (II)I
/*    */     //   2146: iload #6
/*    */     //   2148: iadd
/*    */     //   2149: istore #6
/*    */     //   2151: ifnull -> 2505
/*    */     //   2154: aload_0
/*    */     //   2155: getfield xu0 : J
/*    */     //   2158: ldc2_w 300
/*    */     //   2161: lcmp
/*    */     //   2162: ifle -> 2505
/*    */     //   2165: aload_0
/*    */     //   2166: getfield z30 : Lf/lpt1;
/*    */     //   2169: ifnonnull -> 2194
/*    */     //   2172: invokestatic vY : ()Lf/zp0;
/*    */     //   2175: getfield PH : Lf/lpt1;
/*    */     //   2178: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   2181: dup
/*    */     //   2182: aload_0
/*    */     //   2183: swap
/*    */     //   2184: putfield z30 : Lf/lpt1;
/*    */     //   2187: iconst_0
/*    */     //   2188: iconst_1
/*    */     //   2189: aconst_null
/*    */     //   2190: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   2193: pop
/*    */     //   2194: aload_2
/*    */     //   2195: aload_0
/*    */     //   2196: dup
/*    */     //   2197: dup
/*    */     //   2198: dup2
/*    */     //   2199: dup2
/*    */     //   2200: getfield eg0 : Lf/TG0;
/*    */     //   2203: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   2206: pop
/*    */     //   2207: getfield eg0 : Lf/TG0;
/*    */     //   2210: getstatic f/eo.Y : Lf/eo;
/*    */     //   2213: fconst_0
/*    */     //   2214: invokevirtual eY : (Lf/eo;F)V
/*    */     //   2217: getfield z30 : Lf/lpt1;
/*    */     //   2220: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2223: aload_0
/*    */     //   2224: dup
/*    */     //   2225: getfield ao : Lf/eo;
/*    */     //   2228: astore_3
/*    */     //   2229: getfield eg0 : Lf/TG0;
/*    */     //   2232: aload_3
/*    */     //   2233: swap
/*    */     //   2234: getstatic f/static.fO : Lf/eo;
/*    */     //   2237: fconst_1
/*    */     //   2238: fconst_1
/*    */     //   2239: fconst_1
/*    */     //   2240: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   2243: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2246: pop
/*    */     //   2247: getfield zS : Lf/tc;
/*    */     //   2250: getfield HW : Lf/G5;
/*    */     //   2253: getfield g50 : B
/*    */     //   2256: invokestatic h0 : (B)Lf/eo;
/*    */     //   2259: ldc_w 0.25
/*    */     //   2262: fconst_0
/*    */     //   2263: ldc_w 0.25
/*    */     //   2266: invokevirtual Qh0 : (FFF)Lf/eo;
/*    */     //   2269: astore_3
/*    */     //   2270: getfield z30 : Lf/lpt1;
/*    */     //   2273: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2276: aload_3
/*    */     //   2277: getfield x : F
/*    */     //   2280: aload_3
/*    */     //   2281: getfield z : F
/*    */     //   2284: ldc_w 0.1
/*    */     //   2287: fadd
/*    */     //   2288: ldc_w -0.15
/*    */     //   2291: swap
/*    */     //   2292: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2295: pop
/*    */     //   2296: getfield z30 : Lf/lpt1;
/*    */     //   2299: aload_0
/*    */     //   2300: getfield wz0 : F
/*    */     //   2303: invokevirtual wP : (F)V
/*    */     //   2306: getfield z30 : Lf/lpt1;
/*    */     //   2309: aload #4
/*    */     //   2311: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   2314: goto -> 2505
/*    */     //   2317: aload_2
/*    */     //   2318: getstatic f/zm0.u20 : J
/*    */     //   2321: aload_0
/*    */     //   2322: invokevirtual ns0 : ()Lf/tc;
/*    */     //   2325: getfield pm : Lf/d7;
/*    */     //   2328: getfield rl0 : J
/*    */     //   2331: lsub
/*    */     //   2332: ldc2_w 120
/*    */     //   2335: ldiv
/*    */     //   2336: l2i
/*    */     //   2337: iconst_3
/*    */     //   2338: swap
/*    */     //   2339: invokestatic min : (II)I
/*    */     //   2342: istore #6
/*    */     //   2344: ifnull -> 2360
/*    */     //   2347: aload_0
/*    */     //   2348: aload_2
/*    */     //   2349: aload #4
/*    */     //   2351: iload #6
/*    */     //   2353: iconst_1
/*    */     //   2354: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   2357: goto -> 2505
/*    */     //   2360: aload_0
/*    */     //   2361: aload_1
/*    */     //   2362: iload #7
/*    */     //   2364: iload #6
/*    */     //   2366: iconst_1
/*    */     //   2367: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   2370: goto -> 2505
/*    */     //   2373: aload_0
/*    */     //   2374: dup
/*    */     //   2375: iconst_1
/*    */     //   2376: putfield Jg0 : Z
/*    */     //   2379: getfield zS : Lf/tc;
/*    */     //   2382: dup
/*    */     //   2383: astore_3
/*    */     //   2384: instanceof f/Kr0
/*    */     //   2387: ifeq -> 2505
/*    */     //   2390: aload_3
/*    */     //   2391: checkcast f/Kr0
/*    */     //   2394: getfield Lq : Lf/V4;
/*    */     //   2397: getfield L7 : Z
/*    */     //   2400: ifeq -> 2505
/*    */     //   2403: aload_3
/*    */     //   2404: getfield HW : Lf/G5;
/*    */     //   2407: getfield g50 : B
/*    */     //   2410: tableswitch default -> 2440, 0 -> 2479, 1 -> 2467, 2 -> 2455, 3 -> 2443
/*    */     //   2440: goto -> 2505
/*    */     //   2443: aload_3
/*    */     //   2444: checkcast f/Kr0
/*    */     //   2447: bipush #10
/*    */     //   2449: invokevirtual iV : (B)V
/*    */     //   2452: goto -> 2505
/*    */     //   2455: aload_3
/*    */     //   2456: checkcast f/Kr0
/*    */     //   2459: bipush #9
/*    */     //   2461: invokevirtual iV : (B)V
/*    */     //   2464: goto -> 2505
/*    */     //   2467: aload_3
/*    */     //   2468: checkcast f/Kr0
/*    */     //   2471: bipush #7
/*    */     //   2473: invokevirtual iV : (B)V
/*    */     //   2476: goto -> 2505
/*    */     //   2479: aload_3
/*    */     //   2480: checkcast f/Kr0
/*    */     //   2483: bipush #8
/*    */     //   2485: invokevirtual iV : (B)V
/*    */     //   2488: goto -> 2505
/*    */     //   2491: aload #5
/*    */     //   2493: aload_0
/*    */     //   2494: getfield Eq0 : Lf/nl;
/*    */     //   2497: if_acmpeq -> 2505
/*    */     //   2500: aload_0
/*    */     //   2501: iconst_0
/*    */     //   2502: putfield Jg0 : Z
/*    */     //   2505: aload_2
/*    */     //   2506: aload_0
/*    */     //   2507: aload #5
/*    */     //   2509: putfield Eq0 : Lf/nl;
/*    */     //   2512: ifnull -> 2528
/*    */     //   2515: aload_0
/*    */     //   2516: aload_2
/*    */     //   2517: aload #4
/*    */     //   2519: iload #6
/*    */     //   2521: iconst_0
/*    */     //   2522: invokevirtual Le0 : (Lf/K70;Lf/fo0;IZ)V
/*    */     //   2525: goto -> 2538
/*    */     //   2528: aload_0
/*    */     //   2529: aload_1
/*    */     //   2530: iload #7
/*    */     //   2532: iload #6
/*    */     //   2534: iconst_0
/*    */     //   2535: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   2538: iconst_1
/*    */     //   2539: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 196
/*    */     //   #2	-> 199
/*    */     //   #3	-> 202
/*    */     //   #4	-> 205
/*    */     //   #5	-> 209
/*    */     //   #6	-> 212
/*    */     //   #7	-> 215
/*    */     //   #8	-> 227
/*    */     //   #9	-> 233
/*    */     //   #10	-> 243
/*    */     //   #11	-> 293
/*    */     //   #12	-> 296
/*    */     //   #13	-> 299
/*    */     //   #14	-> 364
/*    */     //   #15	-> 368
/*    */     //   #16	-> 371
/*    */     //   #17	-> 383
/*    */     //   #18	-> 395
/*    */     //   #19	-> 398
/*    */     //   #20	-> 402
/*    */     //   #21	-> 408
/*    */     //   #22	-> 420
/*    */     //   #23	-> 423
/*    */     //   #24	-> 436
/*    */     //   #25	-> 439
/*    */     //   #26	-> 442
/*    */     //   #27	-> 449
/*    */     //   #28	-> 453
/*    */     //   #29	-> 456
/*    */     //   #30	-> 472
/*    */     //   #31	-> 475
/*    */     //   #32	-> 748
/*    */     //   #33	-> 752
/*    */     //   #34	-> 755
/*    */     //   #35	-> 758
/*    */     //   #36	-> 765
/*    */     //   #37	-> 797
/*    */     //   #38	-> 803
/*    */     //   #39	-> 814
/*    */     //   #40	-> 818
/*    */     //   #41	-> 821
/*    */     //   #42	-> 824
/*    */     //   #43	-> 831
/*    */     //   #44	-> 871
/*    */     //   #45	-> 875
/*    */     //   #46	-> 885
/*    */     //   #47	-> 888
/*    */     //   #48	-> 891
/*    */     //   #49	-> 1096
/*    */     //   #50	-> 1100
/*    */     //   #51	-> 1103
/*    */     //   #52	-> 1106
/*    */     //   #53	-> 1113
/*    */     //   #54	-> 1175
/*    */     //   #55	-> 1179
/*    */     //   #56	-> 1182
/*    */     //   #57	-> 1185
/*    */     //   #58	-> 1196
/*    */     //   #59	-> 1200
/*    */     //   #60	-> 1203
/*    */     //   #61	-> 1226
/*    */     //   #62	-> 1229
/*    */     //   #63	-> 1360
/*    */     //   #64	-> 1363
/*    */     //   #65	-> 1394
/*    */     //   #66	-> 1398
/*    */     //   #67	-> 1401
/*    */     //   #68	-> 1404
/*    */     //   #69	-> 1411
/*    */     //   #70	-> 1478
/*    */     //   #71	-> 1482
/*    */     //   #72	-> 1485
/*    */     //   #73	-> 1488
/*    */     //   #74	-> 1494
/*    */     //   #75	-> 1524
/*    */     //   #76	-> 1527
/*    */     //   #77	-> 1656
/*    */     //   #78	-> 1659
/*    */     //   #79	-> 1702
/*    */     //   #80	-> 1706
/*    */     //   #81	-> 1709
/*    */     //   #82	-> 1712
/*    */     //   #83	-> 1719
/*    */     //   #84	-> 1907
/*    */     //   #85	-> 1910
/*    */     //   #86	-> 1916
/*    */     //   #87	-> 1922
/*    */     //   #88	-> 1932
/*    */     //   #89	-> 1984
/*    */     //   #90	-> 1987
/*    */     //   #91	-> 1990
/*    */     //   #92	-> 2122
/*    */     //   #93	-> 2126
/*    */     //   #94	-> 2129
/*    */     //   #95	-> 2132
/*    */     //   #96	-> 2139
/*    */     //   #97	-> 2175
/*    */     //   #98	-> 2178
/*    */     //   #99	-> 2184
/*    */     //   #100	-> 2190
/*    */     //   #101	-> 2200
/*    */     //   #102	-> 2250
/*    */     //   #103	-> 2253
/*    */     //   #104	-> 2256
/*    */     //   #105	-> 2318
/*    */     //   #106	-> 2322
/*    */     //   #107	-> 2325
/*    */     //   #108	-> 2328
/*    */     //   #109	-> 2335
/*    */     //   #110	-> 2394
/*    */     //   #111	-> 2397
/*    */     //   #112	-> 2404
/*    */     //   #113	-> 2407
/*    */     //   #114	-> 2444 } public final boolean fY(tH paramtH) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual DE0 : ()B
/*    */     //   4: dup
/*    */     //   5: istore_2
/*    */     //   6: aload_0
/*    */     //   7: getfield zS : Lf/tc;
/*    */     //   10: invokevirtual D4 : ()S
/*    */     //   13: istore_3
/*    */     //   14: iconst_3
/*    */     //   15: if_icmpne -> 21
/*    */     //   18: iinc #2, -1
/*    */     //   21: aload_0
/*    */     //   22: getfield GQ : Z
/*    */     //   25: ifeq -> 250
/*    */     //   28: aload_0
/*    */     //   29: getfield xu0 : J
/*    */     //   32: ldc2_w 300
/*    */     //   35: lcmp
/*    */     //   36: ifge -> 250
/*    */     //   39: aload_0
/*    */     //   40: getfield GO : Lf/E8;
/*    */     //   43: ifnonnull -> 81
/*    */     //   46: aload_0
/*    */     //   47: new f/E8
/*    */     //   50: dup
/*    */     //   51: aload_0
/*    */     //   52: getfield lpt8 : Lf/eo;
/*    */     //   55: dup
/*    */     //   56: astore #4
/*    */     //   58: getfield x : F
/*    */     //   61: f2i
/*    */     //   62: aload #4
/*    */     //   64: getfield y : F
/*    */     //   67: f2i
/*    */     //   68: iconst_0
/*    */     //   69: invokespecial <init> : (III)V
/*    */     //   72: invokevirtual cL : ()Lf/dw;
/*    */     //   75: checkcast f/E8
/*    */     //   78: putfield GO : Lf/E8;
/*    */     //   81: aload_1
/*    */     //   82: aload_0
/*    */     //   83: getfield xu0 : J
/*    */     //   86: ldc2_w 30
/*    */     //   89: ldiv
/*    */     //   90: l2i
/*    */     //   91: istore #4
/*    */     //   93: ifnonnull -> 170
/*    */     //   96: iload #4
/*    */     //   98: iconst_5
/*    */     //   99: if_icmpgt -> 134
/*    */     //   102: aload_0
/*    */     //   103: dup
/*    */     //   104: getfield lpt8 : Lf/eo;
/*    */     //   107: dup
/*    */     //   108: getfield y : F
/*    */     //   111: iload #4
/*    */     //   113: i2f
/*    */     //   114: ldc_w 0.02
/*    */     //   117: fmul
/*    */     //   118: dup
/*    */     //   119: fstore_0
/*    */     //   120: fadd
/*    */     //   121: putfield y : F
/*    */     //   124: getfield vC : Lf/eo;
/*    */     //   127: fload_0
/*    */     //   128: putfield y : F
/*    */     //   131: goto -> 168
/*    */     //   134: aload_0
/*    */     //   135: dup
/*    */     //   136: bipush #12
/*    */     //   138: iload #4
/*    */     //   140: isub
/*    */     //   141: istore_0
/*    */     //   142: getfield lpt8 : Lf/eo;
/*    */     //   145: dup
/*    */     //   146: getfield y : F
/*    */     //   149: iload_0
/*    */     //   150: i2f
/*    */     //   151: ldc_w 0.02
/*    */     //   154: fmul
/*    */     //   155: dup
/*    */     //   156: fstore_0
/*    */     //   157: fadd
/*    */     //   158: putfield y : F
/*    */     //   161: getfield vC : Lf/eo;
/*    */     //   164: fload_0
/*    */     //   165: putfield y : F
/*    */     //   168: iconst_0
/*    */     //   169: ireturn
/*    */     //   170: iload #4
/*    */     //   172: iconst_5
/*    */     //   173: if_icmpgt -> 206
/*    */     //   176: aload_0
/*    */     //   177: dup
/*    */     //   178: getfield lpt8 : Lf/eo;
/*    */     //   181: dup
/*    */     //   182: getfield y : F
/*    */     //   185: iload #4
/*    */     //   187: i2f
/*    */     //   188: dup
/*    */     //   189: fstore #4
/*    */     //   191: fsub
/*    */     //   192: putfield y : F
/*    */     //   195: getfield vC : Lf/eo;
/*    */     //   198: fload #4
/*    */     //   200: putfield y : F
/*    */     //   203: goto -> 240
/*    */     //   206: aload_0
/*    */     //   207: dup
/*    */     //   208: bipush #12
/*    */     //   210: iload #4
/*    */     //   212: isub
/*    */     //   213: istore #4
/*    */     //   215: getfield lpt8 : Lf/eo;
/*    */     //   218: dup
/*    */     //   219: getfield y : F
/*    */     //   222: iload #4
/*    */     //   224: i2f
/*    */     //   225: dup
/*    */     //   226: fstore #4
/*    */     //   228: fsub
/*    */     //   229: putfield y : F
/*    */     //   232: getfield vC : Lf/eo;
/*    */     //   235: fload #4
/*    */     //   237: putfield y : F
/*    */     //   240: aload_0
/*    */     //   241: aload_1
/*    */     //   242: iload_3
/*    */     //   243: iload_2
/*    */     //   244: iconst_0
/*    */     //   245: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   248: iconst_1
/*    */     //   249: ireturn
/*    */     //   250: aload_0
/*    */     //   251: getfield CK : Z
/*    */     //   254: ifeq -> 670
/*    */     //   257: aload_0
/*    */     //   258: getfield xu0 : J
/*    */     //   261: ldc2_w 700
/*    */     //   264: lcmp
/*    */     //   265: ifge -> 670
/*    */     //   268: aload_0
/*    */     //   269: getfield zS : Lf/tc;
/*    */     //   272: dup
/*    */     //   273: astore #4
/*    */     //   275: instanceof f/zk0
/*    */     //   278: ifeq -> 297
/*    */     //   281: aload #4
/*    */     //   283: checkcast f/zk0
/*    */     //   286: getfield jU : Lf/tc;
/*    */     //   289: invokevirtual nX : ()S
/*    */     //   292: ifne -> 297
/*    */     //   295: iconst_1
/*    */     //   296: ireturn
/*    */     //   297: aload_1
/*    */     //   298: aload_0
/*    */     //   299: getfield xu0 : J
/*    */     //   302: ldc2_w 15
/*    */     //   305: ldiv
/*    */     //   306: l2i
/*    */     //   307: istore #4
/*    */     //   309: ifnonnull -> 499
/*    */     //   312: aload_0
/*    */     //   313: getfield nU : Lf/lpt1;
/*    */     //   316: ifnonnull -> 332
/*    */     //   319: aload_0
/*    */     //   320: invokestatic vY : ()Lf/zp0;
/*    */     //   323: getfield sm : Lf/lpt1;
/*    */     //   326: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   329: putfield nU : Lf/lpt1;
/*    */     //   332: iload #4
/*    */     //   334: ldc_w 0.0125
/*    */     //   337: fstore_1
/*    */     //   338: bipush #20
/*    */     //   340: if_icmpge -> 378
/*    */     //   343: aload_0
/*    */     //   344: dup
/*    */     //   345: dup
/*    */     //   346: iconst_1
/*    */     //   347: putfield wg : Z
/*    */     //   350: getfield lpt8 : Lf/eo;
/*    */     //   353: dup
/*    */     //   354: getfield y : F
/*    */     //   357: iload #4
/*    */     //   359: i2f
/*    */     //   360: fload_1
/*    */     //   361: fmul
/*    */     //   362: dup
/*    */     //   363: fstore_1
/*    */     //   364: fadd
/*    */     //   365: putfield y : F
/*    */     //   368: getfield vC : Lf/eo;
/*    */     //   371: fload_1
/*    */     //   372: putfield y : F
/*    */     //   375: goto -> 447
/*    */     //   378: iload #4
/*    */     //   380: bipush #24
/*    */     //   382: if_icmpge -> 415
/*    */     //   385: aload_0
/*    */     //   386: dup
/*    */     //   387: getfield lpt8 : Lf/eo;
/*    */     //   390: dup
/*    */     //   391: getfield y : F
/*    */     //   394: iload #4
/*    */     //   396: i2f
/*    */     //   397: fload_1
/*    */     //   398: fmul
/*    */     //   399: dup
/*    */     //   400: fstore_1
/*    */     //   401: fadd
/*    */     //   402: putfield y : F
/*    */     //   405: getfield vC : Lf/eo;
/*    */     //   408: fload_1
/*    */     //   409: putfield y : F
/*    */     //   412: goto -> 447
/*    */     //   415: aload_0
/*    */     //   416: dup
/*    */     //   417: bipush #44
/*    */     //   419: iload #4
/*    */     //   421: isub
/*    */     //   422: istore_2
/*    */     //   423: getfield lpt8 : Lf/eo;
/*    */     //   426: dup
/*    */     //   427: getfield y : F
/*    */     //   430: iload_2
/*    */     //   431: i2f
/*    */     //   432: fload_1
/*    */     //   433: fmul
/*    */     //   434: dup
/*    */     //   435: fstore_1
/*    */     //   436: fadd
/*    */     //   437: putfield y : F
/*    */     //   440: getfield vC : Lf/eo;
/*    */     //   443: fload_1
/*    */     //   444: putfield y : F
/*    */     //   447: aload_0
/*    */     //   448: getfield xu0 : J
/*    */     //   451: ldc2_w 600
/*    */     //   454: lcmp
/*    */     //   455: ifle -> 497
/*    */     //   458: aload_0
/*    */     //   459: getfield wg : Z
/*    */     //   462: ifeq -> 497
/*    */     //   465: aload_0
/*    */     //   466: dup
/*    */     //   467: getfield zS : Lf/tc;
/*    */     //   470: getfield HW : Lf/G5;
/*    */     //   473: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   476: dup
/*    */     //   477: astore_1
/*    */     //   478: new f/Le
/*    */     //   481: dup
/*    */     //   482: aload_1
/*    */     //   483: aload_0
/*    */     //   484: getfield nU : Lf/lpt1;
/*    */     //   487: invokespecial <init> : (Lf/xr0;Lf/lpt1;)V
/*    */     //   490: invokevirtual TL0 : (Lf/fZ;)V
/*    */     //   493: iconst_0
/*    */     //   494: putfield wg : Z
/*    */     //   497: iconst_0
/*    */     //   498: ireturn
/*    */     //   499: aload_0
/*    */     //   500: getfield GO : Lf/E8;
/*    */     //   503: ifnonnull -> 540
/*    */     //   506: aload_0
/*    */     //   507: new f/E8
/*    */     //   510: dup
/*    */     //   511: aload_0
/*    */     //   512: getfield lpt8 : Lf/eo;
/*    */     //   515: dup
/*    */     //   516: astore #5
/*    */     //   518: getfield x : F
/*    */     //   521: f2i
/*    */     //   522: aload #5
/*    */     //   524: getfield y : F
/*    */     //   527: f2i
/*    */     //   528: invokespecial <init> : (II)V
/*    */     //   531: invokevirtual cL : ()Lf/dw;
/*    */     //   534: checkcast f/E8
/*    */     //   537: putfield GO : Lf/E8;
/*    */     //   540: iload #4
/*    */     //   542: bipush #20
/*    */     //   544: if_icmpge -> 583
/*    */     //   547: aload_0
/*    */     //   548: dup
/*    */     //   549: iload_2
/*    */     //   550: iconst_2
/*    */     //   551: imul
/*    */     //   552: iconst_3
/*    */     //   553: iadd
/*    */     //   554: istore_2
/*    */     //   555: getfield lpt8 : Lf/eo;
/*    */     //   558: dup
/*    */     //   559: getfield y : F
/*    */     //   562: iload #4
/*    */     //   564: i2f
/*    */     //   565: dup
/*    */     //   566: fstore #4
/*    */     //   568: fsub
/*    */     //   569: putfield y : F
/*    */     //   572: getfield vC : Lf/eo;
/*    */     //   575: fload #4
/*    */     //   577: putfield y : F
/*    */     //   580: goto -> 660
/*    */     //   583: iload #4
/*    */     //   585: bipush #24
/*    */     //   587: if_icmpge -> 620
/*    */     //   590: aload_0
/*    */     //   591: dup
/*    */     //   592: getfield lpt8 : Lf/eo;
/*    */     //   595: dup
/*    */     //   596: getfield y : F
/*    */     //   599: iload #4
/*    */     //   601: i2f
/*    */     //   602: dup
/*    */     //   603: fstore #4
/*    */     //   605: fsub
/*    */     //   606: putfield y : F
/*    */     //   609: getfield vC : Lf/eo;
/*    */     //   612: fload #4
/*    */     //   614: putfield y : F
/*    */     //   617: goto -> 660
/*    */     //   620: aload_0
/*    */     //   621: dup
/*    */     //   622: iload_2
/*    */     //   623: iconst_2
/*    */     //   624: imul
/*    */     //   625: iconst_4
/*    */     //   626: iadd
/*    */     //   627: istore_2
/*    */     //   628: bipush #44
/*    */     //   630: iload #4
/*    */     //   632: isub
/*    */     //   633: istore #4
/*    */     //   635: getfield lpt8 : Lf/eo;
/*    */     //   638: dup
/*    */     //   639: getfield y : F
/*    */     //   642: iload #4
/*    */     //   644: i2f
/*    */     //   645: dup
/*    */     //   646: fstore #4
/*    */     //   648: fsub
/*    */     //   649: putfield y : F
/*    */     //   652: getfield vC : Lf/eo;
/*    */     //   655: fload #4
/*    */     //   657: putfield y : F
/*    */     //   660: aload_0
/*    */     //   661: aload_1
/*    */     //   662: iload_3
/*    */     //   663: iload_2
/*    */     //   664: iconst_0
/*    */     //   665: invokevirtual HY : (Lf/tH;IIZ)V
/*    */     //   668: iconst_1
/*    */     //   669: ireturn
/*    */     //   670: aload_0
/*    */     //   671: getfield vC : Lf/eo;
/*    */     //   674: invokevirtual gL : ()Lf/eo;
/*    */     //   677: pop
/*    */     //   678: iconst_0
/*    */     //   679: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 286
/*    */     //   #2	-> 289
/*    */     //   #3	-> 323
/*    */     //   #4	-> 326
/*    */     //   #5	-> 329
/*    */     //   #6	-> 470
/*    */     //   #7	-> 473 } public final void HY(tH paramtH, int paramInt1, int paramInt2, boolean paramBoolean) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Jg0 : Z
/*    */     //   4: ifeq -> 635
/*    */     //   7: aload_1
/*    */     //   8: ifnull -> 635
/*    */     //   11: aload_0
/*    */     //   12: getfield v : Z
/*    */     //   15: ifne -> 21
/*    */     //   18: goto -> 635
/*    */     //   21: getstatic f/km.mI0 : Lf/P1;
/*    */     //   24: getfield yE : Lf/BE;
/*    */     //   27: ifnull -> 45
/*    */     //   30: iload_2
/*    */     //   31: bipush #97
/*    */     //   33: if_icmpeq -> 42
/*    */     //   36: iload_2
/*    */     //   37: bipush #109
/*    */     //   39: if_icmpne -> 45
/*    */     //   42: iconst_1
/*    */     //   43: istore #4
/*    */     //   45: iload_2
/*    */     //   46: bipush #92
/*    */     //   48: if_icmpeq -> 83
/*    */     //   51: iload_2
/*    */     //   52: sipush #1094
/*    */     //   55: if_icmpeq -> 75
/*    */     //   58: iload_2
/*    */     //   59: sipush #1140
/*    */     //   62: if_icmpeq -> 83
/*    */     //   65: iload_2
/*    */     //   66: sipush #1199
/*    */     //   69: if_icmpeq -> 83
/*    */     //   72: goto -> 86
/*    */     //   75: iconst_0
/*    */     //   76: istore_3
/*    */     //   77: iconst_1
/*    */     //   78: istore #4
/*    */     //   80: goto -> 86
/*    */     //   83: iconst_1
/*    */     //   84: istore #4
/*    */     //   86: aload_0
/*    */     //   87: dup
/*    */     //   88: getfield zS : Lf/tc;
/*    */     //   91: getfield HW : Lf/G5;
/*    */     //   94: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   97: astore_2
/*    */     //   98: getfield zS : Lf/tc;
/*    */     //   101: invokevirtual UG : ()Z
/*    */     //   104: ifne -> 117
/*    */     //   107: aload_0
/*    */     //   108: getfield zS : Lf/tc;
/*    */     //   111: invokevirtual VO : ()Z
/*    */     //   114: ifeq -> 377
/*    */     //   117: aload_0
/*    */     //   118: iconst_0
/*    */     //   119: istore #5
/*    */     //   121: invokevirtual DE0 : ()B
/*    */     //   124: tableswitch default -> 156, 0 -> 171, 1 -> 165, 2 -> 159, 3 -> 159
/*    */     //   156: goto -> 174
/*    */     //   159: iconst_4
/*    */     //   160: istore #5
/*    */     //   162: goto -> 174
/*    */     //   165: iconst_2
/*    */     //   166: istore #5
/*    */     //   168: goto -> 174
/*    */     //   171: iconst_0
/*    */     //   172: istore #5
/*    */     //   174: aload_0
/*    */     //   175: dup
/*    */     //   176: iload #5
/*    */     //   178: aload_0
/*    */     //   179: getfield XH : Lf/Pn0;
/*    */     //   182: invokevirtual Nn0 : ()I
/*    */     //   185: dup
/*    */     //   186: istore #5
/*    */     //   188: iadd
/*    */     //   189: istore #6
/*    */     //   191: getfield lpt8 : Lf/eo;
/*    */     //   194: dup
/*    */     //   195: getfield y : F
/*    */     //   198: iload #5
/*    */     //   200: i2f
/*    */     //   201: fadd
/*    */     //   202: putfield y : F
/*    */     //   205: getstatic f/G00.Av0 : Lf/G00;
/*    */     //   208: iconst_0
/*    */     //   209: sipush #159
/*    */     //   212: iconst_0
/*    */     //   213: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*    */     //   216: iload #6
/*    */     //   218: invokevirtual LT : (I)Lf/U70;
/*    */     //   221: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   224: astore #5
/*    */     //   226: invokevirtual DE0 : ()B
/*    */     //   229: iconst_3
/*    */     //   230: if_icmpne -> 309
/*    */     //   233: iload #4
/*    */     //   235: ifne -> 309
/*    */     //   238: aload_1
/*    */     //   239: aload #5
/*    */     //   241: dup
/*    */     //   242: dup
/*    */     //   243: dup2
/*    */     //   244: aload_0
/*    */     //   245: getfield lpt8 : Lf/eo;
/*    */     //   248: dup
/*    */     //   249: getfield x : F
/*    */     //   252: ldc_w 8.0
/*    */     //   255: fsub
/*    */     //   256: fstore #5
/*    */     //   258: getfield y : F
/*    */     //   261: ldc_w 8.0
/*    */     //   264: fsub
/*    */     //   265: fstore #6
/*    */     //   267: invokevirtual getWidth : ()I
/*    */     //   270: i2f
/*    */     //   271: fstore #7
/*    */     //   273: invokevirtual getHeight : ()I
/*    */     //   276: i2f
/*    */     //   277: fstore #8
/*    */     //   279: invokevirtual getWidth : ()I
/*    */     //   282: istore #9
/*    */     //   284: invokevirtual getHeight : ()I
/*    */     //   287: istore #10
/*    */     //   289: fload #5
/*    */     //   291: fload #6
/*    */     //   293: fload #7
/*    */     //   295: fload #8
/*    */     //   297: iload #9
/*    */     //   299: iload #10
/*    */     //   301: iconst_1
/*    */     //   302: iconst_0
/*    */     //   303: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   306: goto -> 377
/*    */     //   309: aload_1
/*    */     //   310: aload #5
/*    */     //   312: dup
/*    */     //   313: dup
/*    */     //   314: dup2
/*    */     //   315: aload_0
/*    */     //   316: getfield lpt8 : Lf/eo;
/*    */     //   319: dup
/*    */     //   320: getfield x : F
/*    */     //   323: ldc_w 8.0
/*    */     //   326: fsub
/*    */     //   327: fstore #5
/*    */     //   329: getfield y : F
/*    */     //   332: ldc_w 8.0
/*    */     //   335: fsub
/*    */     //   336: fstore #6
/*    */     //   338: invokevirtual getWidth : ()I
/*    */     //   341: i2f
/*    */     //   342: fstore #7
/*    */     //   344: invokevirtual getHeight : ()I
/*    */     //   347: i2f
/*    */     //   348: fstore #8
/*    */     //   350: invokevirtual getWidth : ()I
/*    */     //   353: istore #9
/*    */     //   355: invokevirtual getHeight : ()I
/*    */     //   358: istore #10
/*    */     //   360: fload #5
/*    */     //   362: fload #6
/*    */     //   364: fload #7
/*    */     //   366: fload #8
/*    */     //   368: iload #9
/*    */     //   370: iload #10
/*    */     //   372: iconst_0
/*    */     //   373: iconst_0
/*    */     //   374: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*    */     //   377: aload_0
/*    */     //   378: getfield zS : Lf/tc;
/*    */     //   381: getfield pm : Lf/d7;
/*    */     //   384: getfield Mv : Lf/nl;
/*    */     //   387: dup
/*    */     //   388: astore #5
/*    */     //   390: iconst_0
/*    */     //   391: istore #6
/*    */     //   393: ifnull -> 448
/*    */     //   396: aload #5
/*    */     //   398: getfield SB : B
/*    */     //   401: dup
/*    */     //   402: istore #5
/*    */     //   404: getstatic f/nl.jw : Lf/nl;
/*    */     //   407: getfield SB : B
/*    */     //   410: if_icmplt -> 448
/*    */     //   413: iload #5
/*    */     //   415: getstatic f/nl.uB0 : Lf/nl;
/*    */     //   418: getfield SB : B
/*    */     //   421: if_icmpgt -> 448
/*    */     //   424: getstatic f/zm0.u20 : J
/*    */     //   427: ldc2_w 35
/*    */     //   430: ldiv
/*    */     //   431: ldc2_w 4
/*    */     //   434: lrem
/*    */     //   435: l2i
/*    */     //   436: dup
/*    */     //   437: istore_3
/*    */     //   438: iconst_3
/*    */     //   439: if_icmpne -> 448
/*    */     //   442: iconst_1
/*    */     //   443: istore #6
/*    */     //   445: iinc #3, -1
/*    */     //   448: aload_0
/*    */     //   449: invokevirtual DE0 : ()B
/*    */     //   452: iconst_3
/*    */     //   453: if_icmpeq -> 461
/*    */     //   456: iload #6
/*    */     //   458: ifeq -> 472
/*    */     //   461: iload #4
/*    */     //   463: ifne -> 472
/*    */     //   466: iconst_1
/*    */     //   467: istore #4
/*    */     //   469: goto -> 475
/*    */     //   472: iconst_0
/*    */     //   473: istore #4
/*    */     //   475: aload_2
/*    */     //   476: aload_0
/*    */     //   477: aload_1
/*    */     //   478: aload_0
/*    */     //   479: getfield ao : Lf/eo;
/*    */     //   482: aload_0
/*    */     //   483: getfield lpt8 : Lf/eo;
/*    */     //   486: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   489: aload_0
/*    */     //   490: getfield Bm0 : Lf/eo;
/*    */     //   493: invokevirtual zT : (Lf/eo;)Lf/eo;
/*    */     //   496: pop
/*    */     //   497: iload_3
/*    */     //   498: iload #4
/*    */     //   500: invokevirtual t0 : (Lf/tH;IZ)Z
/*    */     //   503: pop
/*    */     //   504: ifnull -> 597
/*    */     //   507: aload_2
/*    */     //   508: invokevirtual hz : ()Lf/ZK0;
/*    */     //   511: aload_2
/*    */     //   512: aload_0
/*    */     //   513: dup
/*    */     //   514: aload_2
/*    */     //   515: aload_0
/*    */     //   516: aload_2
/*    */     //   517: aload_0
/*    */     //   518: getfield zS : Lf/tc;
/*    */     //   521: astore_2
/*    */     //   522: invokevirtual Q4 : ()Lf/KI;
/*    */     //   525: invokevirtual cp0 : ()I
/*    */     //   528: istore_3
/*    */     //   529: getfield zS : Lf/tc;
/*    */     //   532: getfield HW : Lf/G5;
/*    */     //   535: getfield mm : S
/*    */     //   538: bipush #16
/*    */     //   540: imul
/*    */     //   541: iload_3
/*    */     //   542: iadd
/*    */     //   543: istore_3
/*    */     //   544: invokevirtual Q4 : ()Lf/KI;
/*    */     //   547: invokevirtual kf0 : ()I
/*    */     //   550: istore #4
/*    */     //   552: getfield zS : Lf/tc;
/*    */     //   555: getfield HW : Lf/G5;
/*    */     //   558: getfield Yu0 : S
/*    */     //   561: bipush #16
/*    */     //   563: imul
/*    */     //   564: iload #4
/*    */     //   566: iadd
/*    */     //   567: istore #4
/*    */     //   569: getfield lpt8 : Lf/eo;
/*    */     //   572: dup
/*    */     //   573: getfield x : F
/*    */     //   576: f2i
/*    */     //   577: istore #5
/*    */     //   579: getfield y : F
/*    */     //   582: f2i
/*    */     //   583: istore #6
/*    */     //   585: aload_2
/*    */     //   586: aload_1
/*    */     //   587: iload_3
/*    */     //   588: iload #4
/*    */     //   590: iload #5
/*    */     //   592: iload #6
/*    */     //   594: invokevirtual lPT8 : (Lf/xr0;Lf/tc;Lf/tH;IIII)V
/*    */     //   597: aload_0
/*    */     //   598: getfield GO : Lf/E8;
/*    */     //   601: dup
/*    */     //   602: astore_2
/*    */     //   603: ifnull -> 634
/*    */     //   606: aload_0
/*    */     //   607: aload_2
/*    */     //   608: aload_1
/*    */     //   609: invokevirtual Yo0 : (Lf/JX;)V
/*    */     //   612: getfield GO : Lf/E8;
/*    */     //   615: invokevirtual Dm0 : ()Z
/*    */     //   618: ifeq -> 634
/*    */     //   621: aload_0
/*    */     //   622: dup
/*    */     //   623: getfield GO : Lf/E8;
/*    */     //   626: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   629: pop
/*    */     //   630: aconst_null
/*    */     //   631: putfield GO : Lf/E8;
/*    */     //   634: return
/*    */     //   635: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 91
/*    */     //   #2	-> 94
/*    */     //   #3	-> 205
/*    */     //   #4	-> 213
/*    */     //   #5	-> 218
/*    */     //   #6	-> 381
/*    */     //   #7	-> 384
/*    */     //   #8	-> 398
/*    */     //   #9	-> 404
/*    */     //   #10	-> 407
/*    */     //   #11	-> 415
/*    */     //   #12	-> 418
/*    */     //   #13	-> 424
/*    */     //   #14	-> 430
/*    */     //   #15	-> 532
/*    */     //   #16	-> 535
/*    */     //   #17	-> 544
/*    */     //   #18	-> 555
/*    */     //   #19	-> 558
/*  9 */     //   #20	-> 569 } public abstract boolean t0(tH paramtH, int paramInt, boolean paramBoolean); public final void lpt6(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, boolean paramBoolean1, boolean paramBoolean2) { eo eo1; xr0 xr0; if ((xr0 = this.zS.HW.CJ0()) == null) return;  if (!xr0.hz().Ud()) return;  G5 g5; if (this.zS.UG() || this.zS.VO() || ((g5 = this.zS.HW).LB0 && g5.FB == 3)) return;  lpt1 lpt11 = (zp0.vY()).dw.ro0(); if (this.qp == null && paramBoolean2) { ((zP)lpt11.vC0.get(0)).nH.uu(3.0F); this.qp.o6(); }  this.eg0.Gl0(); eo eo2 = eo.Y; this.eg0.eY(eo2, paramIh0.Mp);
/*    */     byte b;
/* 11 */     if ((b = this.zS.HW.FB) == 2)
/* 12 */     { (eo1 = fO).JL(this.ao).zy0(paramIh0.H); eo eo3; (eo3 = my).JL(this.ao);
/*    */       
/* 14 */       if (!this.zS.HW.LB0) eo3
/* 15 */           .Tz(eo1.x * 0.02F, 0.0F, eo1.z * 0.0075F);  TG0 tG0 = this.eg0; this.qp.mh.mT(eo3, tG0, eo1.TG0(1.0F, 1.0F, 1.0F)); this.qp.mh.g7(0.0F, -0.22F, 0.075F); } else if (b == 3 || b == 4) { float f3; eo eo3 = this.ao; TG0 tG0 = this.eg0; this.qp.mh.mT(eo3, tG0, fO.TG0(1.0F, 1.0F, 1.0F)); Matrix4 matrix4 = this.qp.mh; float f1 = 0.0F, f2 = 0.0F; if (eo1 != null) { f3 = 0.04F; } else { f3 = 0.08F; }  matrix4.g7(f1, f2, f3); if (this.zS.zl()) { matrix4 = this.qp.mh; float f = -0.005F; if (eo1 != null) { f1 = -0.1F; } else { f1 = -0.15F; }  matrix4.g7(f, f1, 0.02F); } else { this.qp.mh.g7(0.0F, -0.2F, 0.0F); }  }  if (paramBoolean2) this.qp.mh.g7(0.25F, -0.1F, -0.25F);  paramK70.q10(this.qp, paramfo0); }
/*    */ 
/*    */   
/*    */   public final void Le0(K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   5: getfield iJ0 : Lf/Xi;
/*    */     //   8: invokevirtual UB0 : ()Lf/ny;
/*    */     //   11: checkcast f/Ih0
/*    */     //   14: astore #5
/*    */     //   16: getfield ao : Lf/eo;
/*    */     //   19: aload_0
/*    */     //   20: getfield lpt8 : Lf/eo;
/*    */     //   23: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   26: aload_0
/*    */     //   27: getfield Bm0 : Lf/eo;
/*    */     //   30: invokevirtual zT : (Lf/eo;)Lf/eo;
/*    */     //   33: pop
/*    */     //   34: getstatic f/static.fO : Lf/eo;
/*    */     //   37: dup
/*    */     //   38: astore #6
/*    */     //   40: aload_0
/*    */     //   41: getfield ao : Lf/eo;
/*    */     //   44: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   47: pop
/*    */     //   48: getfield zS : Lf/tc;
/*    */     //   51: invokevirtual zl : ()Z
/*    */     //   54: ifeq -> 94
/*    */     //   57: aload_0
/*    */     //   58: getfield zS : Lf/tc;
/*    */     //   61: invokevirtual D4 : ()S
/*    */     //   64: sipush #2010
/*    */     //   67: if_icmpne -> 94
/*    */     //   70: aload #6
/*    */     //   72: dup
/*    */     //   73: dup2
/*    */     //   74: getfield x : F
/*    */     //   77: ldc_w 0.25
/*    */     //   80: fadd
/*    */     //   81: putfield x : F
/*    */     //   84: getfield z : F
/*    */     //   87: ldc_w 0.35
/*    */     //   90: fsub
/*    */     //   91: putfield z : F
/*    */     //   94: aload #6
/*    */     //   96: dup
/*    */     //   97: dup2
/*    */     //   98: getfield z : F
/*    */     //   101: ldc_w 0.125
/*    */     //   104: fsub
/*    */     //   105: putfield z : F
/*    */     //   108: getfield y : F
/*    */     //   111: ldc_w 0.125
/*    */     //   114: fadd
/*    */     //   115: putfield y : F
/*    */     //   118: invokestatic hS : ()Z
/*    */     //   121: ifeq -> 175
/*    */     //   124: aload #5
/*    */     //   126: aload #6
/*    */     //   128: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   131: getfield fi0 : Lf/Ur0;
/*    */     //   134: dup
/*    */     //   135: dup2
/*    */     //   136: getfield G80 : I
/*    */     //   139: ineg
/*    */     //   140: i2f
/*    */     //   141: fstore #6
/*    */     //   143: getfield Cn0 : I
/*    */     //   146: i2f
/*    */     //   147: fstore #7
/*    */     //   149: getfield QQ : I
/*    */     //   152: i2f
/*    */     //   153: fstore #8
/*    */     //   155: getfield o6 : I
/*    */     //   158: i2f
/*    */     //   159: fstore #9
/*    */     //   161: fload #6
/*    */     //   163: fload #7
/*    */     //   165: fload #8
/*    */     //   167: fload #9
/*    */     //   169: invokevirtual jf0 : (Lf/eo;FFFF)V
/*    */     //   172: goto -> 183
/*    */     //   175: aload #5
/*    */     //   177: aload #6
/*    */     //   179: invokevirtual w8 : (Lf/eo;)Lf/eo;
/*    */     //   182: pop
/*    */     //   183: aload_0
/*    */     //   184: invokevirtual ns0 : ()Lf/tc;
/*    */     //   187: getstatic f/km.a3 : Lf/vh0;
/*    */     //   190: getfield Ct : Lf/Jo;
/*    */     //   193: if_acmpeq -> 316
/*    */     //   196: aload_0
/*    */     //   197: aload #5
/*    */     //   199: getfield dR : Lf/ZQ;
/*    */     //   202: astore #6
/*    */     //   204: getfield lpt8 : Lf/eo;
/*    */     //   207: astore #7
/*    */     //   209: iconst_2
/*    */     //   210: istore #8
/*    */     //   212: iload #8
/*    */     //   214: bipush #6
/*    */     //   216: if_icmpge -> 298
/*    */     //   219: aload #6
/*    */     //   221: getfield LF : [Lf/Q0;
/*    */     //   224: iload #8
/*    */     //   226: aaload
/*    */     //   227: dup
/*    */     //   228: astore #9
/*    */     //   230: getfield YB0 : Lf/eo;
/*    */     //   233: dup
/*    */     //   234: dup
/*    */     //   235: getfield x : F
/*    */     //   238: aload #7
/*    */     //   240: getfield x : F
/*    */     //   243: fmul
/*    */     //   244: fstore #10
/*    */     //   246: getfield y : F
/*    */     //   249: aload #7
/*    */     //   251: getfield y : F
/*    */     //   254: fmul
/*    */     //   255: fload #10
/*    */     //   257: fadd
/*    */     //   258: fstore #10
/*    */     //   260: getfield z : F
/*    */     //   263: aload #7
/*    */     //   265: getfield z : F
/*    */     //   268: fmul
/*    */     //   269: fload #10
/*    */     //   271: fadd
/*    */     //   272: aload #9
/*    */     //   274: getfield e00 : F
/*    */     //   277: ldc_w -0.5
/*    */     //   280: swap
/*    */     //   281: fsub
/*    */     //   282: fcmpg
/*    */     //   283: ifge -> 292
/*    */     //   286: iconst_0
/*    */     //   287: istore #6
/*    */     //   289: goto -> 307
/*    */     //   292: iinc #8, 1
/*    */     //   295: goto -> 212
/*    */     //   298: aload #6
/*    */     //   300: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   303: pop
/*    */     //   304: iconst_1
/*    */     //   305: istore #6
/*    */     //   307: aload_0
/*    */     //   308: iload #6
/*    */     //   310: putfield v : Z
/*    */     //   313: goto -> 321
/*    */     //   316: aload_0
/*    */     //   317: iconst_1
/*    */     //   318: putfield v : Z
/*    */     //   321: aload_0
/*    */     //   322: getfield v : Z
/*    */     //   325: ifeq -> 473
/*    */     //   328: aload_0
/*    */     //   329: getfield zS : Lf/tc;
/*    */     //   332: invokevirtual yO : ()Z
/*    */     //   335: ifeq -> 407
/*    */     //   338: aload_0
/*    */     //   339: iconst_0
/*    */     //   340: istore #6
/*    */     //   342: getfield zS : Lf/tc;
/*    */     //   345: dup
/*    */     //   346: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   349: pop
/*    */     //   350: instanceof f/Jo
/*    */     //   353: ifeq -> 368
/*    */     //   356: aload_0
/*    */     //   357: getfield zS : Lf/tc;
/*    */     //   360: checkcast f/Jo
/*    */     //   363: getfield CC : B
/*    */     //   366: istore #6
/*    */     //   368: getstatic f/km.si0 : Lf/My;
/*    */     //   371: aload_0
/*    */     //   372: getfield zS : Lf/tc;
/*    */     //   375: dup
/*    */     //   376: aload_0
/*    */     //   377: swap
/*    */     //   378: invokevirtual a : ()Ljava/lang/String;
/*    */     //   381: astore #7
/*    */     //   383: getstatic f/static.fO : Lf/eo;
/*    */     //   386: astore #8
/*    */     //   388: getfield zS : Lf/tc;
/*    */     //   391: getfield kK0 : Lf/Z50;
/*    */     //   394: astore #9
/*    */     //   396: iload #6
/*    */     //   398: aload #7
/*    */     //   400: aload #8
/*    */     //   402: aload #9
/*    */     //   404: invokevirtual NO : (Lf/tc;ILjava/lang/String;Lf/eo;Lf/Z50;)V
/*    */     //   407: aload_0
/*    */     //   408: getfield zS : Lf/tc;
/*    */     //   411: invokevirtual zl : ()Z
/*    */     //   414: ifeq -> 439
/*    */     //   417: getstatic f/km.si0 : Lf/My;
/*    */     //   420: aload_0
/*    */     //   421: getfield zS : Lf/tc;
/*    */     //   424: dup
/*    */     //   425: getstatic f/static.fO : Lf/eo;
/*    */     //   428: astore #6
/*    */     //   430: getfield kK0 : Lf/Z50;
/*    */     //   433: aload #6
/*    */     //   435: swap
/*    */     //   436: invokevirtual dy0 : (Lf/tc;Lf/eo;Lf/Z50;)V
/*    */     //   439: aload_0
/*    */     //   440: getfield zS : Lf/tc;
/*    */     //   443: dup
/*    */     //   444: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   447: pop
/*    */     //   448: instanceof f/zk0
/*    */     //   451: ifne -> 540
/*    */     //   454: getstatic f/km.kH0 : Lf/Qz0;
/*    */     //   457: aload_0
/*    */     //   458: getfield zS : Lf/tc;
/*    */     //   461: getfield Jg : I
/*    */     //   464: getstatic f/static.fO : Lf/eo;
/*    */     //   467: invokevirtual w8 : (ILf/eo;)V
/*    */     //   470: goto -> 540
/*    */     //   473: getstatic f/km.si0 : Lf/My;
/*    */     //   476: dup
/*    */     //   477: astore #6
/*    */     //   479: aload_0
/*    */     //   480: getfield zS : Lf/tc;
/*    */     //   483: getfield Jg : I
/*    */     //   486: istore #7
/*    */     //   488: getfield qb : Lf/Ut0;
/*    */     //   491: iload #7
/*    */     //   493: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   496: checkcast f/WX
/*    */     //   499: dup
/*    */     //   500: astore #8
/*    */     //   502: ifnull -> 513
/*    */     //   505: aload #6
/*    */     //   507: aload #8
/*    */     //   509: invokevirtual jf0 : (Lf/JG0;)Z
/*    */     //   512: pop
/*    */     //   513: aload #6
/*    */     //   515: getfield l3 : Lf/Ut0;
/*    */     //   518: iload #7
/*    */     //   520: invokevirtual remove : (I)Ljava/lang/Object;
/*    */     //   523: checkcast f/JG0
/*    */     //   526: dup
/*    */     //   527: astore #7
/*    */     //   529: ifnull -> 540
/*    */     //   532: aload #6
/*    */     //   534: aload #7
/*    */     //   536: invokevirtual jf0 : (Lf/JG0;)Z
/*    */     //   539: pop
/*    */     //   540: aload_0
/*    */     //   541: getfield Jg0 : Z
/*    */     //   544: ifeq -> 2407
/*    */     //   547: aload_1
/*    */     //   548: ifnull -> 2407
/*    */     //   551: aload_0
/*    */     //   552: getfield v : Z
/*    */     //   555: ifne -> 561
/*    */     //   558: goto -> 2407
/*    */     //   561: aload_0
/*    */     //   562: dup
/*    */     //   563: dup2
/*    */     //   564: getfield wz0 : F
/*    */     //   567: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   570: getfield Qy : F
/*    */     //   573: fadd
/*    */     //   574: putfield wz0 : F
/*    */     //   577: getfield Yk0 : Lf/eo;
/*    */     //   580: aload_0
/*    */     //   581: getfield lpt8 : Lf/eo;
/*    */     //   584: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   587: getstatic f/Xi.z6 : Lf/eo;
/*    */     //   590: invokevirtual zT : (Lf/eo;)Lf/eo;
/*    */     //   593: pop
/*    */     //   594: getfield zS : Lf/tc;
/*    */     //   597: getfield HW : Lf/G5;
/*    */     //   600: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   603: dup
/*    */     //   604: astore #6
/*    */     //   606: ifnull -> 666
/*    */     //   609: aload_0
/*    */     //   610: getfield zS : Lf/tc;
/*    */     //   613: invokevirtual zl : ()Z
/*    */     //   616: ifeq -> 646
/*    */     //   619: aload_0
/*    */     //   620: getfield lpt8 : Lf/eo;
/*    */     //   623: dup
/*    */     //   624: getfield y : F
/*    */     //   627: aload #6
/*    */     //   629: invokevirtual hz : ()Lf/ZK0;
/*    */     //   632: invokevirtual X6 : ()F
/*    */     //   635: ldc_w 1.33
/*    */     //   638: fdiv
/*    */     //   639: fsub
/*    */     //   640: putfield y : F
/*    */     //   643: goto -> 666
/*    */     //   646: aload_0
/*    */     //   647: getfield lpt8 : Lf/eo;
/*    */     //   650: dup
/*    */     //   651: getfield y : F
/*    */     //   654: aload #6
/*    */     //   656: invokevirtual hz : ()Lf/ZK0;
/*    */     //   659: invokevirtual X6 : ()F
/*    */     //   662: fsub
/*    */     //   663: putfield y : F
/*    */     //   666: aload_0
/*    */     //   667: getfield zS : Lf/tc;
/*    */     //   670: dup
/*    */     //   671: getfield pm : Lf/d7;
/*    */     //   674: getfield Mv : Lf/nl;
/*    */     //   677: astore #7
/*    */     //   679: invokevirtual UG : ()Z
/*    */     //   682: ifne -> 695
/*    */     //   685: aload_0
/*    */     //   686: getfield zS : Lf/tc;
/*    */     //   689: invokevirtual VO : ()Z
/*    */     //   692: ifeq -> 1964
/*    */     //   695: aload_0
/*    */     //   696: dup
/*    */     //   697: getfield Sc0 : Lf/Pn0;
/*    */     //   700: invokevirtual Nn0 : ()I
/*    */     //   703: bipush #25
/*    */     //   705: swap
/*    */     //   706: isub
/*    */     //   707: invokestatic abs : (I)I
/*    */     //   710: i2f
/*    */     //   711: ldc_w 0.001
/*    */     //   714: fmul
/*    */     //   715: ldc_w 0.1
/*    */     //   718: fsub
/*    */     //   719: fstore #8
/*    */     //   721: getstatic f/static.fO : Lf/eo;
/*    */     //   724: dup
/*    */     //   725: astore #9
/*    */     //   727: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   730: pop
/*    */     //   731: new f/eo
/*    */     //   734: dup
/*    */     //   735: aload #9
/*    */     //   737: invokespecial <init> : (Lf/eo;)V
/*    */     //   740: invokevirtual gL : ()Lf/eo;
/*    */     //   743: astore #10
/*    */     //   745: new f/eo
/*    */     //   748: dup
/*    */     //   749: aload #9
/*    */     //   751: invokespecial <init> : (Lf/eo;)V
/*    */     //   754: invokevirtual gL : ()Lf/eo;
/*    */     //   757: astore #11
/*    */     //   759: iconst_1
/*    */     //   760: istore #12
/*    */     //   762: getfield zS : Lf/tc;
/*    */     //   765: invokevirtual VO : ()Z
/*    */     //   768: ifne -> 784
/*    */     //   771: aload #6
/*    */     //   773: ifnull -> 787
/*    */     //   776: aload #6
/*    */     //   778: invokevirtual Y00 : ()Z
/*    */     //   781: ifeq -> 787
/*    */     //   784: iconst_0
/*    */     //   785: istore #12
/*    */     //   787: aload_0
/*    */     //   788: getfield zS : Lf/tc;
/*    */     //   791: invokevirtual VO : ()Z
/*    */     //   794: ifeq -> 854
/*    */     //   797: aload #6
/*    */     //   799: ifnull -> 854
/*    */     //   802: aload #6
/*    */     //   804: invokevirtual Y00 : ()Z
/*    */     //   807: ifne -> 854
/*    */     //   810: aload #11
/*    */     //   812: dup
/*    */     //   813: aload #10
/*    */     //   815: dup
/*    */     //   816: aload_0
/*    */     //   817: getfield lpt8 : Lf/eo;
/*    */     //   820: dup
/*    */     //   821: getfield z : F
/*    */     //   824: ldc_w 0.075
/*    */     //   827: fsub
/*    */     //   828: putfield z : F
/*    */     //   831: getfield y : F
/*    */     //   834: ldc_w 0.125
/*    */     //   837: fsub
/*    */     //   838: putfield y : F
/*    */     //   841: getfield y : F
/*    */     //   844: ldc_w 0.226
/*    */     //   847: fsub
/*    */     //   848: putfield y : F
/*    */     //   851: goto -> 903
/*    */     //   854: aload_0
/*    */     //   855: getfield zS : Lf/tc;
/*    */     //   858: invokevirtual UG : ()Z
/*    */     //   861: ifne -> 877
/*    */     //   864: aload #6
/*    */     //   866: ifnull -> 903
/*    */     //   869: aload #6
/*    */     //   871: invokevirtual Y00 : ()Z
/*    */     //   874: ifeq -> 903
/*    */     //   877: aload #11
/*    */     //   879: dup
/*    */     //   880: aload #10
/*    */     //   882: dup
/*    */     //   883: getfield y : F
/*    */     //   886: ldc_w 0.251
/*    */     //   889: fsub
/*    */     //   890: putfield y : F
/*    */     //   893: getfield y : F
/*    */     //   896: ldc_w 0.278
/*    */     //   899: fsub
/*    */     //   900: putfield y : F
/*    */     //   903: aload_0
/*    */     //   904: dup
/*    */     //   905: getfield lpt8 : Lf/eo;
/*    */     //   908: dup
/*    */     //   909: getfield y : F
/*    */     //   912: fload #8
/*    */     //   914: fsub
/*    */     //   915: putfield y : F
/*    */     //   918: getfield e5 : Lf/lpt1;
/*    */     //   921: ifnonnull -> 961
/*    */     //   924: aload_0
/*    */     //   925: invokestatic vY : ()Lf/zp0;
/*    */     //   928: getfield Sx : Lf/lpt1;
/*    */     //   931: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   934: putfield e5 : Lf/lpt1;
/*    */     //   937: invokestatic vY : ()Lf/zp0;
/*    */     //   940: getfield zB : Lf/lpt1;
/*    */     //   943: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   946: dup
/*    */     //   947: aload_0
/*    */     //   948: swap
/*    */     //   949: putfield bX : Lf/lpt1;
/*    */     //   952: ldc_w 'shibuki01'
/*    */     //   955: iconst_1
/*    */     //   956: aconst_null
/*    */     //   957: invokevirtual co0 : (Ljava/lang/String;ZLf/J3;)Lf/KI0;
/*    */     //   960: pop
/*    */     //   961: aload_0
/*    */     //   962: dup
/*    */     //   963: dup
/*    */     //   964: getfield eg0 : Lf/TG0;
/*    */     //   967: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   970: pop
/*    */     //   971: getfield V4 : Lf/TG0;
/*    */     //   974: invokevirtual Gl0 : ()Lf/TG0;
/*    */     //   977: pop
/*    */     //   978: getfield zS : Lf/tc;
/*    */     //   981: getfield HW : Lf/G5;
/*    */     //   984: getfield g50 : B
/*    */     //   987: tableswitch default -> 1016, 0 -> 1306, 1 -> 1213, 2 -> 1116, 3 -> 1019
/*    */     //   1016: goto -> 1398
/*    */     //   1019: aload #11
/*    */     //   1021: dup
/*    */     //   1022: aload_0
/*    */     //   1023: dup
/*    */     //   1024: getfield V4 : Lf/TG0;
/*    */     //   1027: getstatic f/eo.Y : Lf/eo;
/*    */     //   1030: dup
/*    */     //   1031: astore #13
/*    */     //   1033: aload #5
/*    */     //   1035: getfield Mp : F
/*    */     //   1038: ldc_w 90.0
/*    */     //   1041: fadd
/*    */     //   1042: invokevirtual eY : (Lf/eo;F)V
/*    */     //   1045: getfield eg0 : Lf/TG0;
/*    */     //   1048: dup
/*    */     //   1049: astore #14
/*    */     //   1051: aload #5
/*    */     //   1053: getfield Mp : F
/*    */     //   1056: ldc_w 90.0
/*    */     //   1059: fsub
/*    */     //   1060: aload #13
/*    */     //   1062: dup
/*    */     //   1063: dup
/*    */     //   1064: aload #14
/*    */     //   1066: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1069: pop
/*    */     //   1070: getfield x : F
/*    */     //   1073: fstore #13
/*    */     //   1075: getfield y : F
/*    */     //   1078: fstore #14
/*    */     //   1080: getfield z : F
/*    */     //   1083: fstore #15
/*    */     //   1085: ldc_w 0.017453292
/*    */     //   1088: fmul
/*    */     //   1089: fstore #16
/*    */     //   1091: fload #13
/*    */     //   1093: fload #14
/*    */     //   1095: fload #15
/*    */     //   1097: fload #16
/*    */     //   1099: invokevirtual qj0 : (FFFF)Lf/TG0;
/*    */     //   1102: pop
/*    */     //   1103: getfield x : F
/*    */     //   1106: ldc_w 0.18
/*    */     //   1109: fsub
/*    */     //   1110: putfield x : F
/*    */     //   1113: goto -> 1398
/*    */     //   1116: aload #11
/*    */     //   1118: dup
/*    */     //   1119: aload_0
/*    */     //   1120: dup
/*    */     //   1121: getfield V4 : Lf/TG0;
/*    */     //   1124: getstatic f/eo.Y : Lf/eo;
/*    */     //   1127: dup
/*    */     //   1128: astore #13
/*    */     //   1130: aload #5
/*    */     //   1132: getfield Mp : F
/*    */     //   1135: ldc_w 90.0
/*    */     //   1138: fsub
/*    */     //   1139: invokevirtual eY : (Lf/eo;F)V
/*    */     //   1142: getfield eg0 : Lf/TG0;
/*    */     //   1145: dup
/*    */     //   1146: astore #14
/*    */     //   1148: aload #5
/*    */     //   1150: getfield Mp : F
/*    */     //   1153: ldc_w 90.0
/*    */     //   1156: fadd
/*    */     //   1157: aload #13
/*    */     //   1159: dup
/*    */     //   1160: dup
/*    */     //   1161: aload #14
/*    */     //   1163: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1166: pop
/*    */     //   1167: getfield x : F
/*    */     //   1170: fstore #13
/*    */     //   1172: getfield y : F
/*    */     //   1175: fstore #14
/*    */     //   1177: getfield z : F
/*    */     //   1180: fstore #15
/*    */     //   1182: ldc_w 0.017453292
/*    */     //   1185: fmul
/*    */     //   1186: fstore #16
/*    */     //   1188: fload #13
/*    */     //   1190: fload #14
/*    */     //   1192: fload #15
/*    */     //   1194: fload #16
/*    */     //   1196: invokevirtual qj0 : (FFFF)Lf/TG0;
/*    */     //   1199: pop
/*    */     //   1200: getfield x : F
/*    */     //   1203: ldc_w 0.18
/*    */     //   1206: fadd
/*    */     //   1207: putfield x : F
/*    */     //   1210: goto -> 1398
/*    */     //   1213: aload #11
/*    */     //   1215: dup
/*    */     //   1216: aload_0
/*    */     //   1217: dup
/*    */     //   1218: getfield V4 : Lf/TG0;
/*    */     //   1221: getstatic f/eo.Y : Lf/eo;
/*    */     //   1224: dup
/*    */     //   1225: astore #13
/*    */     //   1227: aload #5
/*    */     //   1229: getfield Mp : F
/*    */     //   1232: ldc_w 180.0
/*    */     //   1235: fadd
/*    */     //   1236: invokevirtual eY : (Lf/eo;F)V
/*    */     //   1239: getfield eg0 : Lf/TG0;
/*    */     //   1242: dup
/*    */     //   1243: astore #14
/*    */     //   1245: aload #5
/*    */     //   1247: getfield Mp : F
/*    */     //   1250: aload #13
/*    */     //   1252: dup
/*    */     //   1253: dup
/*    */     //   1254: aload #14
/*    */     //   1256: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1259: pop
/*    */     //   1260: getfield x : F
/*    */     //   1263: fstore #13
/*    */     //   1265: getfield y : F
/*    */     //   1268: fstore #14
/*    */     //   1270: getfield z : F
/*    */     //   1273: fstore #15
/*    */     //   1275: ldc_w 0.017453292
/*    */     //   1278: fmul
/*    */     //   1279: fstore #16
/*    */     //   1281: fload #13
/*    */     //   1283: fload #14
/*    */     //   1285: fload #15
/*    */     //   1287: fload #16
/*    */     //   1289: invokevirtual qj0 : (FFFF)Lf/TG0;
/*    */     //   1292: pop
/*    */     //   1293: getfield z : F
/*    */     //   1296: ldc_w 0.18
/*    */     //   1299: fadd
/*    */     //   1300: putfield z : F
/*    */     //   1303: goto -> 1398
/*    */     //   1306: aload #11
/*    */     //   1308: dup
/*    */     //   1309: aload_0
/*    */     //   1310: dup
/*    */     //   1311: getfield V4 : Lf/TG0;
/*    */     //   1314: aload #5
/*    */     //   1316: getstatic f/eo.Y : Lf/eo;
/*    */     //   1319: astore #13
/*    */     //   1321: getfield Mp : F
/*    */     //   1324: aload #13
/*    */     //   1326: swap
/*    */     //   1327: invokevirtual eY : (Lf/eo;F)V
/*    */     //   1330: getfield eg0 : Lf/TG0;
/*    */     //   1333: dup
/*    */     //   1334: astore #14
/*    */     //   1336: aload #5
/*    */     //   1338: getfield Mp : F
/*    */     //   1341: ldc_w 180.0
/*    */     //   1344: fadd
/*    */     //   1345: aload #13
/*    */     //   1347: dup
/*    */     //   1348: dup
/*    */     //   1349: aload #14
/*    */     //   1351: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1354: pop
/*    */     //   1355: getfield x : F
/*    */     //   1358: fstore #13
/*    */     //   1360: getfield y : F
/*    */     //   1363: fstore #14
/*    */     //   1365: getfield z : F
/*    */     //   1368: fstore #15
/*    */     //   1370: ldc_w 0.017453292
/*    */     //   1373: fmul
/*    */     //   1374: fstore #16
/*    */     //   1376: fload #13
/*    */     //   1378: fload #14
/*    */     //   1380: fload #15
/*    */     //   1382: fload #16
/*    */     //   1384: invokevirtual qj0 : (FFFF)Lf/TG0;
/*    */     //   1387: pop
/*    */     //   1388: getfield z : F
/*    */     //   1391: ldc_w 0.18
/*    */     //   1394: fsub
/*    */     //   1395: putfield z : F
/*    */     //   1398: aload_0
/*    */     //   1399: getfield xu0 : J
/*    */     //   1402: ldc2_w 250
/*    */     //   1405: lcmp
/*    */     //   1406: dup
/*    */     //   1407: istore #13
/*    */     //   1409: ifge -> 1472
/*    */     //   1412: aload_0
/*    */     //   1413: getfield Wy0 : Lf/eo;
/*    */     //   1416: dup
/*    */     //   1417: astore #14
/*    */     //   1419: getfield x : F
/*    */     //   1422: ldc_w 0.8
/*    */     //   1425: fcmpg
/*    */     //   1426: ifge -> 1472
/*    */     //   1429: aload_0
/*    */     //   1430: aload #14
/*    */     //   1432: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   1435: getfield Qy : F
/*    */     //   1438: fconst_2
/*    */     //   1439: fmul
/*    */     //   1440: invokevirtual r9 : (F)V
/*    */     //   1443: getfield UB : B
/*    */     //   1446: aload_0
/*    */     //   1447: invokevirtual DE0 : ()B
/*    */     //   1450: if_icmpeq -> 1539
/*    */     //   1453: aload_0
/*    */     //   1454: dup
/*    */     //   1455: dup
/*    */     //   1456: getfield Wy0 : Lf/eo;
/*    */     //   1459: invokevirtual gL : ()Lf/eo;
/*    */     //   1462: pop
/*    */     //   1463: invokevirtual DE0 : ()B
/*    */     //   1466: putfield UB : B
/*    */     //   1469: goto -> 1539
/*    */     //   1472: aload_0
/*    */     //   1473: getfield Wy0 : Lf/eo;
/*    */     //   1476: dup
/*    */     //   1477: astore #14
/*    */     //   1479: getfield x : F
/*    */     //   1482: dup
/*    */     //   1483: fstore #15
/*    */     //   1485: fconst_0
/*    */     //   1486: fcmpl
/*    */     //   1487: ifle -> 1506
/*    */     //   1490: aload #14
/*    */     //   1492: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   1495: getfield Qy : F
/*    */     //   1498: fconst_2
/*    */     //   1499: fmul
/*    */     //   1500: invokevirtual ky0 : (F)V
/*    */     //   1503: goto -> 1539
/*    */     //   1506: iload #13
/*    */     //   1508: ifge -> 1539
/*    */     //   1511: fload #15
/*    */     //   1513: ldc_w 0.8
/*    */     //   1516: fcmpl
/*    */     //   1517: ifle -> 1539
/*    */     //   1520: aload_0
/*    */     //   1521: getfield UB : B
/*    */     //   1524: aload_0
/*    */     //   1525: invokevirtual DE0 : ()B
/*    */     //   1528: if_icmpeq -> 1539
/*    */     //   1531: aload_0
/*    */     //   1532: getfield Wy0 : Lf/eo;
/*    */     //   1535: invokevirtual gL : ()Lf/eo;
/*    */     //   1538: pop
/*    */     //   1539: aload_0
/*    */     //   1540: dup
/*    */     //   1541: dup
/*    */     //   1542: getfield bX : Lf/lpt1;
/*    */     //   1545: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1548: aload_0
/*    */     //   1549: dup
/*    */     //   1550: dup
/*    */     //   1551: getfield ao : Lf/eo;
/*    */     //   1554: dup
/*    */     //   1555: invokestatic w3 : (Lf/eo;Lf/eo;)Lf/eo;
/*    */     //   1558: aload #11
/*    */     //   1560: dup
/*    */     //   1561: dup
/*    */     //   1562: getfield x : F
/*    */     //   1565: fstore #13
/*    */     //   1567: getfield y : F
/*    */     //   1570: fstore #14
/*    */     //   1572: getfield z : F
/*    */     //   1575: fstore #15
/*    */     //   1577: fload #13
/*    */     //   1579: fload #14
/*    */     //   1581: fload #15
/*    */     //   1583: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1586: astore #13
/*    */     //   1588: getfield eg0 : Lf/TG0;
/*    */     //   1591: astore #14
/*    */     //   1593: getfield Wy0 : Lf/eo;
/*    */     //   1596: astore #15
/*    */     //   1598: aload #13
/*    */     //   1600: aload #14
/*    */     //   1602: aload #15
/*    */     //   1604: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1607: pop
/*    */     //   1608: getfield e5 : Lf/lpt1;
/*    */     //   1611: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1614: aload #9
/*    */     //   1616: aload_0
/*    */     //   1617: dup
/*    */     //   1618: getfield ao : Lf/eo;
/*    */     //   1621: astore #9
/*    */     //   1623: getfield V4 : Lf/TG0;
/*    */     //   1626: astore #13
/*    */     //   1628: ldc_w 0.8
/*    */     //   1631: ldc_w 0.8
/*    */     //   1634: ldc_w 0.8
/*    */     //   1637: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1640: astore #14
/*    */     //   1642: aload #9
/*    */     //   1644: aload #13
/*    */     //   1646: aload #14
/*    */     //   1648: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1651: pop
/*    */     //   1652: getfield zS : Lf/tc;
/*    */     //   1655: getfield HW : Lf/G5;
/*    */     //   1658: getfield FB : B
/*    */     //   1661: iconst_3
/*    */     //   1662: if_icmpne -> 1754
/*    */     //   1665: aload #6
/*    */     //   1667: ifnull -> 1754
/*    */     //   1670: aload #6
/*    */     //   1672: invokevirtual Kn : ()F
/*    */     //   1675: fconst_0
/*    */     //   1676: fcmpl
/*    */     //   1677: ifeq -> 1754
/*    */     //   1680: aload_0
/*    */     //   1681: dup
/*    */     //   1682: dup2
/*    */     //   1683: getfield bX : Lf/lpt1;
/*    */     //   1686: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1689: aload #6
/*    */     //   1691: getstatic f/eo.Z : Lf/eo;
/*    */     //   1694: astore #9
/*    */     //   1696: invokevirtual Kn : ()F
/*    */     //   1699: aload #9
/*    */     //   1701: swap
/*    */     //   1702: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1705: pop
/*    */     //   1706: getfield e5 : Lf/lpt1;
/*    */     //   1709: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1712: aload #9
/*    */     //   1714: aload #6
/*    */     //   1716: invokevirtual Kn : ()F
/*    */     //   1719: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1722: pop
/*    */     //   1723: getfield e5 : Lf/lpt1;
/*    */     //   1726: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1729: fconst_0
/*    */     //   1730: fload #8
/*    */     //   1732: fconst_0
/*    */     //   1733: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1736: pop
/*    */     //   1737: getfield bX : Lf/lpt1;
/*    */     //   1740: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1743: fconst_0
/*    */     //   1744: fload #8
/*    */     //   1746: fconst_0
/*    */     //   1747: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1750: pop
/*    */     //   1751: goto -> 1789
/*    */     //   1754: aload_0
/*    */     //   1755: dup
/*    */     //   1756: getfield e5 : Lf/lpt1;
/*    */     //   1759: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1762: fload #8
/*    */     //   1764: fneg
/*    */     //   1765: fstore #6
/*    */     //   1767: fconst_0
/*    */     //   1768: fload #6
/*    */     //   1770: fconst_0
/*    */     //   1771: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1774: pop
/*    */     //   1775: getfield bX : Lf/lpt1;
/*    */     //   1778: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1781: fconst_0
/*    */     //   1782: fload #6
/*    */     //   1784: fconst_0
/*    */     //   1785: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1788: pop
/*    */     //   1789: aload #7
/*    */     //   1791: aload_0
/*    */     //   1792: dup
/*    */     //   1793: dup
/*    */     //   1794: getfield bX : Lf/lpt1;
/*    */     //   1797: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1800: dup
/*    */     //   1801: astore #6
/*    */     //   1803: aload #11
/*    */     //   1805: ldc_w 0.05
/*    */     //   1808: invokevirtual uu : (F)Lf/eo;
/*    */     //   1811: dup
/*    */     //   1812: dup
/*    */     //   1813: aload #6
/*    */     //   1815: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1818: pop
/*    */     //   1819: getfield x : F
/*    */     //   1822: fstore #6
/*    */     //   1824: getfield y : F
/*    */     //   1827: fstore #8
/*    */     //   1829: getfield z : F
/*    */     //   1832: fstore #9
/*    */     //   1834: fload #6
/*    */     //   1836: fload #8
/*    */     //   1838: fload #9
/*    */     //   1840: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1843: pop
/*    */     //   1844: getfield e5 : Lf/lpt1;
/*    */     //   1847: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1850: dup
/*    */     //   1851: astore #6
/*    */     //   1853: aload #10
/*    */     //   1855: dup
/*    */     //   1856: dup
/*    */     //   1857: aload #6
/*    */     //   1859: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1862: pop
/*    */     //   1863: getfield x : F
/*    */     //   1866: fstore #6
/*    */     //   1868: getfield y : F
/*    */     //   1871: fstore #8
/*    */     //   1873: getfield z : F
/*    */     //   1876: fstore #9
/*    */     //   1878: fload #6
/*    */     //   1880: fload #8
/*    */     //   1882: fload #9
/*    */     //   1884: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1887: pop
/*    */     //   1888: getfield bX : Lf/lpt1;
/*    */     //   1891: aload_0
/*    */     //   1892: getfield wz0 : F
/*    */     //   1895: invokevirtual wP : (F)V
/*    */     //   1898: getstatic f/zm0.u20 : J
/*    */     //   1901: aload_0
/*    */     //   1902: invokevirtual ns0 : ()Lf/tc;
/*    */     //   1905: getfield pm : Lf/d7;
/*    */     //   1908: getfield rl0 : J
/*    */     //   1911: lsub
/*    */     //   1912: lstore #8
/*    */     //   1914: getstatic f/nl.WM : Lf/nl;
/*    */     //   1917: if_acmpne -> 1929
/*    */     //   1920: lload #8
/*    */     //   1922: ldc2_w 500
/*    */     //   1925: lcmp
/*    */     //   1926: ifge -> 1964
/*    */     //   1929: aload_0
/*    */     //   1930: aload_1
/*    */     //   1931: aload_0
/*    */     //   1932: getfield e5 : Lf/lpt1;
/*    */     //   1935: aload_2
/*    */     //   1936: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1939: getfield Wy0 : Lf/eo;
/*    */     //   1942: getfield x : F
/*    */     //   1945: fconst_0
/*    */     //   1946: fcmpl
/*    */     //   1947: ifle -> 1964
/*    */     //   1950: iload #12
/*    */     //   1952: ifeq -> 1964
/*    */     //   1955: aload_1
/*    */     //   1956: aload_0
/*    */     //   1957: getfield bX : Lf/lpt1;
/*    */     //   1960: aload_2
/*    */     //   1961: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   1964: aload #7
/*    */     //   1966: iconst_0
/*    */     //   1967: istore #6
/*    */     //   1969: ifnull -> 2024
/*    */     //   1972: aload #7
/*    */     //   1974: getfield SB : B
/*    */     //   1977: dup
/*    */     //   1978: istore #7
/*    */     //   1980: getstatic f/nl.jw : Lf/nl;
/*    */     //   1983: getfield SB : B
/*    */     //   1986: if_icmplt -> 2024
/*    */     //   1989: iload #7
/*    */     //   1991: getstatic f/nl.uB0 : Lf/nl;
/*    */     //   1994: getfield SB : B
/*    */     //   1997: if_icmpgt -> 2024
/*    */     //   2000: getstatic f/zm0.u20 : J
/*    */     //   2003: ldc2_w 35
/*    */     //   2006: ldiv
/*    */     //   2007: ldc2_w 4
/*    */     //   2010: lrem
/*    */     //   2011: l2i
/*    */     //   2012: dup
/*    */     //   2013: istore_3
/*    */     //   2014: iconst_3
/*    */     //   2015: if_icmpne -> 2024
/*    */     //   2018: iconst_1
/*    */     //   2019: istore #6
/*    */     //   2021: iinc #3, -1
/*    */     //   2024: aload_0
/*    */     //   2025: invokevirtual DE0 : ()B
/*    */     //   2028: iconst_3
/*    */     //   2029: if_icmpeq -> 2037
/*    */     //   2032: iload #6
/*    */     //   2034: ifeq -> 2048
/*    */     //   2037: iload #4
/*    */     //   2039: ifne -> 2048
/*    */     //   2042: iconst_1
/*    */     //   2043: istore #4
/*    */     //   2045: goto -> 2051
/*    */     //   2048: iconst_0
/*    */     //   2049: istore #4
/*    */     //   2051: aload_0
/*    */     //   2052: dup
/*    */     //   2053: aload #5
/*    */     //   2055: aload_0
/*    */     //   2056: getfield ao : Lf/eo;
/*    */     //   2059: aload_0
/*    */     //   2060: getfield lpt8 : Lf/eo;
/*    */     //   2063: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   2066: aload_0
/*    */     //   2067: getfield Bm0 : Lf/eo;
/*    */     //   2070: invokevirtual zT : (Lf/eo;)Lf/eo;
/*    */     //   2073: pop
/*    */     //   2074: aload_1
/*    */     //   2075: aload_2
/*    */     //   2076: iload_3
/*    */     //   2077: iload #4
/*    */     //   2079: invokevirtual II0 : (Lf/Ih0;Lf/K70;Lf/fo0;IZ)Z
/*    */     //   2082: pop
/*    */     //   2083: getfield YB : Lf/lpt1;
/*    */     //   2086: ifnull -> 2348
/*    */     //   2089: aload_1
/*    */     //   2090: aload_0
/*    */     //   2091: dup
/*    */     //   2092: dup
/*    */     //   2093: getstatic f/static.id0 : Lf/eo;
/*    */     //   2096: aload_0
/*    */     //   2097: getfield ao : Lf/eo;
/*    */     //   2100: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   2103: fconst_0
/*    */     //   2104: ldc_w -0.1
/*    */     //   2107: fconst_0
/*    */     //   2108: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   2111: astore_3
/*    */     //   2112: getstatic f/static.BC : Lf/eo;
/*    */     //   2115: aload #5
/*    */     //   2117: getfield H : Lf/eo;
/*    */     //   2120: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   2123: aload_3
/*    */     //   2124: dup
/*    */     //   2125: dup
/*    */     //   2126: getfield x : F
/*    */     //   2129: fstore #4
/*    */     //   2131: getfield y : F
/*    */     //   2134: fstore #6
/*    */     //   2136: getfield z : F
/*    */     //   2139: fstore #7
/*    */     //   2141: fload #4
/*    */     //   2143: fload #6
/*    */     //   2145: fload #7
/*    */     //   2147: invokevirtual uD : (FFF)Lf/eo;
/*    */     //   2150: invokevirtual WC0 : ()Lf/eo;
/*    */     //   2153: astore #4
/*    */     //   2155: getstatic f/static.jl : Lf/eo;
/*    */     //   2158: aload #5
/*    */     //   2160: getfield nj0 : Lf/eo;
/*    */     //   2163: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   2166: aload #4
/*    */     //   2168: invokevirtual Nz : (Lf/eo;)Lf/eo;
/*    */     //   2171: invokevirtual WC0 : ()Lf/eo;
/*    */     //   2174: astore #6
/*    */     //   2176: getstatic f/static.Af : Lf/eo;
/*    */     //   2179: dup
/*    */     //   2180: astore #7
/*    */     //   2182: aload #4
/*    */     //   2184: dup
/*    */     //   2185: dup
/*    */     //   2186: aload #7
/*    */     //   2188: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   2191: pop
/*    */     //   2192: getfield x : F
/*    */     //   2195: fstore #7
/*    */     //   2197: getfield y : F
/*    */     //   2200: fstore #8
/*    */     //   2202: getfield z : F
/*    */     //   2205: fstore #9
/*    */     //   2207: fload #7
/*    */     //   2209: fload #8
/*    */     //   2211: fload #9
/*    */     //   2213: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   2216: aload #6
/*    */     //   2218: invokevirtual Nz : (Lf/eo;)Lf/eo;
/*    */     //   2221: invokevirtual WC0 : ()Lf/eo;
/*    */     //   2224: astore #7
/*    */     //   2226: getfield V4 : Lf/TG0;
/*    */     //   2229: aload #4
/*    */     //   2231: aload #7
/*    */     //   2233: aload #6
/*    */     //   2235: aload #4
/*    */     //   2237: aload #7
/*    */     //   2239: aload #6
/*    */     //   2241: aload #4
/*    */     //   2243: aload #7
/*    */     //   2245: aload #6
/*    */     //   2247: getfield x : F
/*    */     //   2250: fstore #4
/*    */     //   2252: getfield x : F
/*    */     //   2255: fstore #6
/*    */     //   2257: getfield x : F
/*    */     //   2260: fstore #7
/*    */     //   2262: getfield y : F
/*    */     //   2265: fstore #8
/*    */     //   2267: getfield y : F
/*    */     //   2270: fstore #9
/*    */     //   2272: getfield y : F
/*    */     //   2275: fstore #10
/*    */     //   2277: getfield z : F
/*    */     //   2280: fstore #11
/*    */     //   2282: getfield z : F
/*    */     //   2285: fstore #12
/*    */     //   2287: getfield z : F
/*    */     //   2290: fstore #13
/*    */     //   2292: iconst_0
/*    */     //   2293: fload #4
/*    */     //   2295: fload #6
/*    */     //   2297: fload #7
/*    */     //   2299: fload #8
/*    */     //   2301: fload #9
/*    */     //   2303: fload #10
/*    */     //   2305: fload #11
/*    */     //   2307: fload #12
/*    */     //   2309: fload #13
/*    */     //   2311: invokevirtual hE0 : (ZFFFFFFFFF)Lf/TG0;
/*    */     //   2314: pop
/*    */     //   2315: getfield YB : Lf/lpt1;
/*    */     //   2318: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2321: aload_3
/*    */     //   2322: aload_0
/*    */     //   2323: getfield V4 : Lf/TG0;
/*    */     //   2326: getstatic f/static.fO : Lf/eo;
/*    */     //   2329: fconst_1
/*    */     //   2330: fconst_1
/*    */     //   2331: fconst_1
/*    */     //   2332: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   2335: swap
/*    */     //   2336: swap
/*    */     //   2337: invokevirtual mT : (Lf/eo;Lf/TG0;Lf/eo;)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   2340: pop
/*    */     //   2341: getfield YB : Lf/lpt1;
/*    */     //   2344: aload_2
/*    */     //   2345: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   2348: aload_0
/*    */     //   2349: getfield zS : Lf/tc;
/*    */     //   2352: getfield HW : Lf/G5;
/*    */     //   2355: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   2358: dup
/*    */     //   2359: astore_3
/*    */     //   2360: ifnull -> 2406
/*    */     //   2363: aload_3
/*    */     //   2364: invokevirtual hz : ()Lf/ZK0;
/*    */     //   2367: aload_3
/*    */     //   2368: aload_0
/*    */     //   2369: dup
/*    */     //   2370: getfield zS : Lf/tc;
/*    */     //   2373: astore_0
/*    */     //   2374: getfield ao : Lf/eo;
/*    */     //   2377: dup
/*    */     //   2378: dup
/*    */     //   2379: getfield x : F
/*    */     //   2382: fstore_3
/*    */     //   2383: getfield y : F
/*    */     //   2386: fstore #4
/*    */     //   2388: getfield z : F
/*    */     //   2391: fstore #6
/*    */     //   2393: aload_0
/*    */     //   2394: aload_1
/*    */     //   2395: aload_2
/*    */     //   2396: aload #5
/*    */     //   2398: fload_3
/*    */     //   2399: fload #4
/*    */     //   2401: fload #6
/*    */     //   2403: invokevirtual NF0 : (Lf/xr0;Lf/tc;Lf/K70;Lf/fo0;Lf/Ih0;FFF)V
/*    */     //   2406: return
/*    */     //   2407: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 8
/*    */     //   #3	-> 131
/*    */     //   #4	-> 136
/*    */     //   #5	-> 143
/*    */     //   #6	-> 149
/*    */     //   #7	-> 155
/*    */     //   #8	-> 169
/*    */     //   #9	-> 190
/*    */     //   #10	-> 199
/*    */     //   #11	-> 221
/*    */     //   #12	-> 226
/*    */     //   #13	-> 300
/*    */     //   #14	-> 350
/*    */     //   #15	-> 357
/*    */     //   #16	-> 363
/*    */     //   #17	-> 368
/*    */     //   #18	-> 391
/*    */     //   #19	-> 404
/*    */     //   #20	-> 430
/*    */     //   #21	-> 436
/*    */     //   #22	-> 448
/*    */     //   #23	-> 454
/*    */     //   #24	-> 461
/*    */     //   #25	-> 464
/*    */     //   #26	-> 483
/*    */     //   #27	-> 488
/*    */     //   #28	-> 493
/*    */     //   #29	-> 541
/*    */     //   #30	-> 570
/*    */     //   #31	-> 574
/*    */     //   #32	-> 597
/*    */     //   #33	-> 600
/*    */     //   #34	-> 671
/*    */     //   #35	-> 674
/*    */     //   #36	-> 679
/*    */     //   #37	-> 731
/*    */     //   #38	-> 740
/*    */     //   #39	-> 745
/*    */     //   #40	-> 754
/*    */     //   #41	-> 928
/*    */     //   #42	-> 931
/*    */     //   #43	-> 934
/*    */     //   #44	-> 940
/*    */     //   #45	-> 943
/*    */     //   #46	-> 949
/*    */     //   #47	-> 952
/*    */     //   #48	-> 964
/*    */     //   #49	-> 981
/*    */     //   #50	-> 984
/*    */     //   #51	-> 1024
/*    */     //   #52	-> 1070
/*    */     //   #53	-> 1099
/*    */     //   #54	-> 1103
/*    */     //   #55	-> 1167
/*    */     //   #56	-> 1196
/*    */     //   #57	-> 1200
/*    */     //   #58	-> 1260
/*    */     //   #59	-> 1289
/*    */     //   #60	-> 1293
/*    */     //   #61	-> 1355
/*    */     //   #62	-> 1384
/*    */     //   #63	-> 1388
/*    */     //   #64	-> 1435
/*    */     //   #65	-> 1440
/*    */     //   #66	-> 1495
/*    */     //   #67	-> 1500
/*    */     //   #68	-> 1555
/*    */     //   #69	-> 1562
/*    */     //   #70	-> 1588
/*    */     //   #71	-> 1655
/*    */     //   #72	-> 1658
/*    */     //   #73	-> 1672
/*    */     //   #74	-> 1819
/*    */     //   #75	-> 1844
/*    */     //   #76	-> 1863
/*    */     //   #77	-> 1888
/*    */     //   #78	-> 1898
/*    */     //   #79	-> 1902
/*    */     //   #80	-> 1905
/*    */     //   #81	-> 1908
/*    */     //   #82	-> 1914
/*    */     //   #83	-> 1974
/*    */     //   #84	-> 1980
/*    */     //   #85	-> 1983
/*    */     //   #86	-> 1991
/*    */     //   #87	-> 1994
/*    */     //   #88	-> 2000
/*    */     //   #89	-> 2006
/*    */     //   #90	-> 2126
/*    */     //   #91	-> 2150
/*    */     //   #92	-> 2192
/*    */     //   #93	-> 2218
/*    */     //   #94	-> 2311
/*    */     //   #95	-> 2315
/*    */     //   #96	-> 2352
/*    */     //   #97	-> 2355
/*    */   }
/*    */   
/*    */   public final void xS(int paramInt, tH paramtH) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_3
/*    */     //   3: getfield zS : Lf/tc;
/*    */     //   6: getfield HW : Lf/G5;
/*    */     //   9: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   12: dup
/*    */     //   13: astore #4
/*    */     //   15: ifnonnull -> 19
/*    */     //   18: return
/*    */     //   19: aload #4
/*    */     //   21: invokevirtual hz : ()Lf/ZK0;
/*    */     //   24: invokevirtual Ud : ()Z
/*    */     //   27: ifne -> 31
/*    */     //   30: return
/*    */     //   31: aload_0
/*    */     //   32: getfield zS : Lf/tc;
/*    */     //   35: invokevirtual UG : ()Z
/*    */     //   38: ifne -> 354
/*    */     //   41: aload_0
/*    */     //   42: getfield zS : Lf/tc;
/*    */     //   45: invokevirtual VO : ()Z
/*    */     //   48: ifeq -> 54
/*    */     //   51: goto -> 354
/*    */     //   54: aload_0
/*    */     //   55: dup
/*    */     //   56: getfield zS : Lf/tc;
/*    */     //   59: invokevirtual D4 : ()S
/*    */     //   62: istore #4
/*    */     //   64: getfield zS : Lf/tc;
/*    */     //   67: getfield HW : Lf/G5;
/*    */     //   70: getfield FB : B
/*    */     //   73: dup
/*    */     //   74: istore #5
/*    */     //   76: ifne -> 96
/*    */     //   79: iload #4
/*    */     //   81: bipush #92
/*    */     //   83: if_icmpeq -> 175
/*    */     //   86: iload #4
/*    */     //   88: bipush #96
/*    */     //   90: if_icmpne -> 182
/*    */     //   93: goto -> 175
/*    */     //   96: iload #5
/*    */     //   98: iconst_1
/*    */     //   99: if_icmpne -> 182
/*    */     //   102: iload #4
/*    */     //   104: lookupswitch default -> 172, 41 -> 181, 59 -> 175, 94 -> 181, 114 -> 181, 139 -> 181, 140 -> 181, 207 -> 181
/*    */     //   172: goto -> 182
/*    */     //   175: bipush #-2
/*    */     //   177: istore_3
/*    */     //   178: goto -> 182
/*    */     //   181: return
/*    */     //   182: aload_0
/*    */     //   183: ldc_w -0.5
/*    */     //   186: fstore #4
/*    */     //   188: getfield vC : Lf/eo;
/*    */     //   191: getfield y : F
/*    */     //   194: f2d
/*    */     //   195: ldc2_w 0.001
/*    */     //   198: dcmpg
/*    */     //   199: ifgt -> 217
/*    */     //   202: invokestatic ZZ : ()Lf/interface;
/*    */     //   205: getfield ax0 : Lf/Ui0;
/*    */     //   208: ldc_w 0.75
/*    */     //   211: invokevirtual Zk : (F)V
/*    */     //   214: goto -> 250
/*    */     //   217: invokestatic ZZ : ()Lf/interface;
/*    */     //   220: getfield ax0 : Lf/Ui0;
/*    */     //   223: aload_0
/*    */     //   224: getfield vC : Lf/eo;
/*    */     //   227: getfield y : F
/*    */     //   230: ldc_w 5.0
/*    */     //   233: fadd
/*    */     //   234: ldc_w 15.0
/*    */     //   237: fdiv
/*    */     //   238: ldc_w 0.25
/*    */     //   241: fmul
/*    */     //   242: ldc_w 0.75
/*    */     //   245: swap
/*    */     //   246: fsub
/*    */     //   247: invokevirtual Zk : (F)V
/*    */     //   250: invokestatic ZZ : ()Lf/interface;
/*    */     //   253: getfield ax0 : Lf/Ui0;
/*    */     //   256: iload_1
/*    */     //   257: i2f
/*    */     //   258: ldc_w 255.0
/*    */     //   261: fdiv
/*    */     //   262: invokevirtual t : (F)V
/*    */     //   265: invokestatic ZZ : ()Lf/interface;
/*    */     //   268: getfield ax0 : Lf/Ui0;
/*    */     //   271: aload_0
/*    */     //   272: getfield lpt8 : Lf/eo;
/*    */     //   275: getfield x : F
/*    */     //   278: ldc_w 4.0
/*    */     //   281: fsub
/*    */     //   282: aload_0
/*    */     //   283: getfield Bm0 : Lf/eo;
/*    */     //   286: getfield x : F
/*    */     //   289: fadd
/*    */     //   290: aload_0
/*    */     //   291: getfield vC : Lf/eo;
/*    */     //   294: getfield x : F
/*    */     //   297: fadd
/*    */     //   298: fload #4
/*    */     //   300: fadd
/*    */     //   301: invokevirtual aR : (F)V
/*    */     //   304: invokestatic ZZ : ()Lf/interface;
/*    */     //   307: getfield ax0 : Lf/Ui0;
/*    */     //   310: aload_0
/*    */     //   311: getfield lpt8 : Lf/eo;
/*    */     //   314: getfield y : F
/*    */     //   317: ldc_w 3.0
/*    */     //   320: fsub
/*    */     //   321: aload_0
/*    */     //   322: getfield Bm0 : Lf/eo;
/*    */     //   325: getfield y : F
/*    */     //   328: fadd
/*    */     //   329: aload_0
/*    */     //   330: getfield vC : Lf/eo;
/*    */     //   333: getfield y : F
/*    */     //   336: fadd
/*    */     //   337: iload_3
/*    */     //   338: i2f
/*    */     //   339: fadd
/*    */     //   340: invokevirtual Zq0 : (F)V
/*    */     //   343: invokestatic ZZ : ()Lf/interface;
/*    */     //   346: getfield ax0 : Lf/Ui0;
/*    */     //   349: aload_2
/*    */     //   350: invokevirtual Ne : (Lf/JX;)V
/*    */     //   353: return
/*    */     //   354: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 9
/*    */     //   #3	-> 67
/*    */     //   #4	-> 70
/*    */     //   #5	-> 188
/*    */     //   #6	-> 205
/*    */     //   #7	-> 211
/*    */     //   #8	-> 220
/*    */     //   #9	-> 224
/*    */     //   #10	-> 253
/*    */     //   #11	-> 262
/*    */     //   #12	-> 268
/*    */     //   #13	-> 272
/*    */     //   #14	-> 307
/*    */     //   #15	-> 311
/*    */     //   #16	-> 346
/*    */     //   #17	-> 350
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/static.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */