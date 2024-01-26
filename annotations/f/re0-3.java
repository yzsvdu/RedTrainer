/*    */ package f;
/*  2 */ public final class re0 implements iq0 { public static final HashMap fg = new HashMap<>(); public final Com9 Dt0; public final EB0 rs0; public boolean N70; public final boolean qe0; public final eo HT; public re0(Com9 paramCom9, EB0 paramEB0, boolean paramBoolean) { this.N70 = true; this.HT = new eo(); this.Dt0 = paramCom9; this.rs0 = paramEB0; this.qe0 = paramBoolean; t2(UB0.Kg0, this); } public re0(boolean paramBoolean, int paramInt1, int paramInt2, lw0... paramVarArgs) { Ao ao; this.N70 = true; this.HT = new eo(); this(paramVarArgs); this.Dt0 = Jr(paramBoolean, paramInt1, ao); this.rs0 = new Lu(paramBoolean, paramInt2); this.qe0 = false; t2(UB0.Kg0, this); } public final lw0 Rb(int paramInt) { Ao ao; int i; byte b; for (i = (ao = this.Dt0.getAttributes()).rJ0.length, b = 0; b < i; )
/*  3 */     { lw0 lw0; if ((lw0 = this.rJ0[b])
/*  4 */         .s00 == paramInt) return lw0;  b++; }  return null; }
/*    */   public re0(boolean paramBoolean, int paramInt1, int paramInt2, Ao paramAo) { this.N70 = true; this.HT = new eo(); this.Dt0 = Jr(paramBoolean, paramInt1, paramAo); this.rs0 = new Lu(paramBoolean, paramInt2); this.qe0 = false; t2(UB0.Kg0, this); } public re0(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, Ao paramAo) { this.N70 = true; this.HT = new eo(); this.Dt0 = Jr(paramBoolean1, paramInt1, paramAo); this.rs0 = new Lu(paramBoolean2, paramInt2); this.qe0 = false; t2(UB0.Kg0, this); } public re0(yj paramyj, boolean paramBoolean, int paramInt1, int paramInt2, lw0... paramVarArgs) { this(paramVarArgs); Ao ao; this(paramyj, paramBoolean, paramInt1, paramInt2, this); } public re0(yj paramyj, boolean paramBoolean, int paramInt1, int paramInt2, Ao paramAo) { this.N70 = true; this.HT = new eo(); int i; if ((i = qf.us0[paramyj.ordinal()]) != 1) { if (i != 2) { if (i != 3) { tl tl; Qg qg; this(paramInt1, paramAo); this.Dt0 = tl; this(paramInt2); this.rs0 = qg; this.qe0 = true; } else { u20 u20; fy fy; this(paramBoolean, paramInt1, paramAo); this.Dt0 = u20; this(paramBoolean, paramInt2); this.rs0 = fy; this.qe0 = false; }  } else { Iu iu; fy fy; this(paramBoolean, paramInt1, paramAo); this.Dt0 = iu; this(paramBoolean, paramInt2); this.rs0 = fy; this.qe0 = false; }  } else { HH0 hH0; Lu lu; this(paramBoolean, paramInt1, paramAo); this.Dt0 = hH0; this(paramBoolean, paramInt2); this.rs0 = lu; this.qe0 = false; }  t2(UB0.Kg0, this); } public static Com9 Jr(boolean paramBoolean, int paramInt, Ao paramAo) { return (Com9)((UB0.Je != null) ? new u20(paramBoolean, paramInt, paramAo) : new HH0(paramBoolean, paramInt, paramAo)); } public static void t2(Q50 paramQ50, re0 paramre0) { HashMap<?, fQ> hashMap; fQ fQ; if ((fQ = (hashMap = fg).get(paramQ50)) == null) this();  fQ.Com3(paramre0); hashMap.put(paramQ50, fQ); } public final void Gi0(Rm0 paramRm0, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) { // Byte code:
/*    */     //   0: iload #4
/*    */     //   2: ifne -> 6
/*    */     //   5: return
/*    */     //   6: iload #5
/*    */     //   8: ifeq -> 47
/*    */     //   11: aload_0
/*    */     //   12: dup
/*    */     //   13: aconst_null
/*    */     //   14: astore #6
/*    */     //   16: getfield Dt0 : Lf/Com9;
/*    */     //   19: aload_1
/*    */     //   20: aload #6
/*    */     //   22: invokeinterface sm : (Lf/Rm0;[I)V
/*    */     //   27: getfield rs0 : Lf/EB0;
/*    */     //   30: invokeinterface pP : ()I
/*    */     //   35: ifle -> 47
/*    */     //   38: aload_0
/*    */     //   39: getfield rs0 : Lf/EB0;
/*    */     //   42: invokeinterface bind : ()V
/*    */     //   47: aload_0
/*    */     //   48: getfield qe0 : Z
/*    */     //   51: ifeq -> 119
/*    */     //   54: aload_0
/*    */     //   55: getfield rs0 : Lf/EB0;
/*    */     //   58: invokeinterface pP : ()I
/*    */     //   63: ifle -> 228
/*    */     //   66: aload_0
/*    */     //   67: getfield rs0 : Lf/EB0;
/*    */     //   70: invokeinterface w0 : ()Ljava/nio/ShortBuffer;
/*    */     //   75: dup
/*    */     //   76: dup
/*    */     //   77: astore #6
/*    */     //   79: iload_3
/*    */     //   80: aload #6
/*    */     //   82: dup
/*    */     //   83: invokevirtual position : ()I
/*    */     //   86: istore_3
/*    */     //   87: invokevirtual limit : ()I
/*    */     //   90: pop
/*    */     //   91: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   94: pop
/*    */     //   95: iload_3
/*    */     //   96: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   99: iload_2
/*    */     //   100: iload #4
/*    */     //   102: sipush #5123
/*    */     //   105: aload #6
/*    */     //   107: invokeinterface glDrawElements : (IIILjava/nio/Buffer;)V
/*    */     //   112: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   115: pop
/*    */     //   116: goto -> 240
/*    */     //   119: aload_0
/*    */     //   120: getfield rs0 : Lf/EB0;
/*    */     //   123: invokeinterface pP : ()I
/*    */     //   128: ifle -> 228
/*    */     //   131: iload #4
/*    */     //   133: iload_3
/*    */     //   134: iadd
/*    */     //   135: aload_0
/*    */     //   136: getfield rs0 : Lf/EB0;
/*    */     //   139: invokeinterface Bt : ()I
/*    */     //   144: if_icmpgt -> 169
/*    */     //   147: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   150: iload_2
/*    */     //   151: iload_3
/*    */     //   152: iconst_2
/*    */     //   153: imul
/*    */     //   154: istore_2
/*    */     //   155: iload #4
/*    */     //   157: sipush #5123
/*    */     //   160: iload_2
/*    */     //   161: invokeinterface glDrawElements : (IIII)V
/*    */     //   166: goto -> 240
/*    */     //   169: new f/JU
/*    */     //   172: dup
/*    */     //   173: new java/lang/StringBuilder
/*    */     //   176: dup
/*    */     //   177: invokespecial <init> : ()V
/*    */     //   180: ldc 'Mesh attempting to access memory outside of the index buffer (count: '
/*    */     //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   185: iload #4
/*    */     //   187: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   190: ldc ', offset: '
/*    */     //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   195: iload_3
/*    */     //   196: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   199: ldc ', max: '
/*    */     //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   204: aload_0
/*    */     //   205: getfield rs0 : Lf/EB0;
/*    */     //   208: invokeinterface Bt : ()I
/*    */     //   213: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   216: ldc ')'
/*    */     //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   221: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   227: athrow
/*    */     //   228: getstatic f/UB0.re0 : Lf/hj0;
/*    */     //   231: iload_2
/*    */     //   232: iload_3
/*    */     //   233: iload #4
/*    */     //   235: invokeinterface glDrawArrays : (III)V
/*    */     //   240: iload #5
/*    */     //   242: ifeq -> 279
/*    */     //   245: aload_0
/*    */     //   246: dup
/*    */     //   247: aconst_null
/*    */     //   248: astore_2
/*    */     //   249: getfield Dt0 : Lf/Com9;
/*    */     //   252: aload_1
/*    */     //   253: aload_2
/*    */     //   254: invokeinterface bD0 : (Lf/Rm0;[I)V
/*    */     //   259: getfield rs0 : Lf/EB0;
/*    */     //   262: invokeinterface pP : ()I
/*    */     //   267: ifle -> 279
/*    */     //   270: aload_0
/*    */     //   271: getfield rs0 : Lf/EB0;
/*    */     //   274: invokeinterface bj0 : ()V
/*    */     //   279: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 16
/*    */     //   #2	-> 48
/*    */     //   #3	-> 249 } public final void dispose() { HashMap<?, ?> hashMap; if ((hashMap = fg).get(UB0.Kg0) != null) ((fQ)hashMap.get(UB0.Kg0)).Ct(this, true);  this.Dt0.dispose(); this.rs0.dispose(); } public final Ao n8() { return this.Dt0.getAttributes(); } public final Eb kY(Eb paramEb, int paramInt1, int paramInt2, Matrix4 paramMatrix4) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield rs0 : Lf/EB0;
/*    */     //   4: invokeinterface pP : ()I
/*    */     //   9: dup
/*    */     //   10: istore #5
/*    */     //   12: aload_0
/*    */     //   13: getfield Dt0 : Lf/Com9;
/*    */     //   16: invokeinterface IH : ()I
/*    */     //   21: istore #6
/*    */     //   23: ifne -> 29
/*    */     //   26: goto -> 33
/*    */     //   29: iload #5
/*    */     //   31: istore #6
/*    */     //   33: iload_2
/*    */     //   34: iflt -> 609
/*    */     //   37: iload_3
/*    */     //   38: iconst_1
/*    */     //   39: if_icmplt -> 609
/*    */     //   42: iload_2
/*    */     //   43: iload_3
/*    */     //   44: iadd
/*    */     //   45: dup
/*    */     //   46: istore #7
/*    */     //   48: iload #6
/*    */     //   50: if_icmpgt -> 609
/*    */     //   53: aload_0
/*    */     //   54: dup
/*    */     //   55: dup
/*    */     //   56: getfield Dt0 : Lf/Com9;
/*    */     //   59: invokeinterface w0 : ()Ljava/nio/FloatBuffer;
/*    */     //   64: astore_3
/*    */     //   65: getfield rs0 : Lf/EB0;
/*    */     //   68: invokeinterface w0 : ()Ljava/nio/ShortBuffer;
/*    */     //   73: astore #6
/*    */     //   75: iconst_1
/*    */     //   76: invokevirtual Rb : (I)Lf/lw0;
/*    */     //   79: dup
/*    */     //   80: aload_0
/*    */     //   81: swap
/*    */     //   82: getfield TZ : I
/*    */     //   85: iconst_4
/*    */     //   86: idiv
/*    */     //   87: istore #8
/*    */     //   89: getfield Dt0 : Lf/Com9;
/*    */     //   92: invokeinterface getAttributes : ()Lf/Ao;
/*    */     //   97: getfield Nb : I
/*    */     //   100: iconst_4
/*    */     //   101: idiv
/*    */     //   102: istore #9
/*    */     //   104: getfield uj : I
/*    */     //   107: dup
/*    */     //   108: istore #10
/*    */     //   110: iconst_1
/*    */     //   111: if_icmpeq -> 473
/*    */     //   114: iload #10
/*    */     //   116: iconst_2
/*    */     //   117: if_icmpeq -> 315
/*    */     //   120: iload #10
/*    */     //   122: iconst_3
/*    */     //   123: if_icmpeq -> 129
/*    */     //   126: goto -> 607
/*    */     //   129: iload #5
/*    */     //   131: ifle -> 229
/*    */     //   134: iload_2
/*    */     //   135: iload #7
/*    */     //   137: if_icmpge -> 607
/*    */     //   140: aload #4
/*    */     //   142: aload_0
/*    */     //   143: aload #6
/*    */     //   145: iload_2
/*    */     //   146: invokevirtual get : (I)S
/*    */     //   149: ldc_w 65535
/*    */     //   152: iand
/*    */     //   153: iload #9
/*    */     //   155: imul
/*    */     //   156: iload #8
/*    */     //   158: iadd
/*    */     //   159: istore #5
/*    */     //   161: getfield HT : Lf/eo;
/*    */     //   164: aload_3
/*    */     //   165: iload #5
/*    */     //   167: aload_3
/*    */     //   168: iload #5
/*    */     //   170: aload_3
/*    */     //   171: iload #5
/*    */     //   173: invokevirtual get : (I)F
/*    */     //   176: fstore #5
/*    */     //   178: iconst_1
/*    */     //   179: iadd
/*    */     //   180: invokevirtual get : (I)F
/*    */     //   183: fstore #10
/*    */     //   185: iconst_2
/*    */     //   186: iadd
/*    */     //   187: invokevirtual get : (I)F
/*    */     //   190: fstore #11
/*    */     //   192: fload #5
/*    */     //   194: fload #10
/*    */     //   196: fload #11
/*    */     //   198: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   201: pop
/*    */     //   202: ifnull -> 215
/*    */     //   205: aload_0
/*    */     //   206: getfield HT : Lf/eo;
/*    */     //   209: aload #4
/*    */     //   211: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   214: pop
/*    */     //   215: aload_1
/*    */     //   216: aload_0
/*    */     //   217: getfield HT : Lf/eo;
/*    */     //   220: invokevirtual RO : (Lf/eo;)V
/*    */     //   223: iinc #2, 1
/*    */     //   226: goto -> 134
/*    */     //   229: iload_2
/*    */     //   230: iload #7
/*    */     //   232: if_icmpge -> 607
/*    */     //   235: aload #4
/*    */     //   237: aload_0
/*    */     //   238: iload_2
/*    */     //   239: iload #9
/*    */     //   241: imul
/*    */     //   242: iload #8
/*    */     //   244: iadd
/*    */     //   245: istore #5
/*    */     //   247: getfield HT : Lf/eo;
/*    */     //   250: aload_3
/*    */     //   251: iload #5
/*    */     //   253: aload_3
/*    */     //   254: iload #5
/*    */     //   256: aload_3
/*    */     //   257: iload #5
/*    */     //   259: invokevirtual get : (I)F
/*    */     //   262: fstore #5
/*    */     //   264: iconst_1
/*    */     //   265: iadd
/*    */     //   266: invokevirtual get : (I)F
/*    */     //   269: fstore #6
/*    */     //   271: iconst_2
/*    */     //   272: iadd
/*    */     //   273: invokevirtual get : (I)F
/*    */     //   276: fstore #10
/*    */     //   278: fload #5
/*    */     //   280: fload #6
/*    */     //   282: fload #10
/*    */     //   284: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   287: pop
/*    */     //   288: ifnull -> 301
/*    */     //   291: aload_0
/*    */     //   292: getfield HT : Lf/eo;
/*    */     //   295: aload #4
/*    */     //   297: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   300: pop
/*    */     //   301: aload_1
/*    */     //   302: aload_0
/*    */     //   303: getfield HT : Lf/eo;
/*    */     //   306: invokevirtual RO : (Lf/eo;)V
/*    */     //   309: iinc #2, 1
/*    */     //   312: goto -> 229
/*    */     //   315: iload #5
/*    */     //   317: ifle -> 401
/*    */     //   320: iload_2
/*    */     //   321: iload #7
/*    */     //   323: if_icmpge -> 607
/*    */     //   326: aload #4
/*    */     //   328: aload_0
/*    */     //   329: aload #6
/*    */     //   331: iload_2
/*    */     //   332: invokevirtual get : (I)S
/*    */     //   335: ldc_w 65535
/*    */     //   338: iand
/*    */     //   339: iload #9
/*    */     //   341: imul
/*    */     //   342: iload #8
/*    */     //   344: iadd
/*    */     //   345: istore #5
/*    */     //   347: getfield HT : Lf/eo;
/*    */     //   350: aload_3
/*    */     //   351: iload #5
/*    */     //   353: aload_3
/*    */     //   354: iload #5
/*    */     //   356: invokevirtual get : (I)F
/*    */     //   359: fstore #5
/*    */     //   361: iconst_1
/*    */     //   362: iadd
/*    */     //   363: invokevirtual get : (I)F
/*    */     //   366: fload #5
/*    */     //   368: swap
/*    */     //   369: fconst_0
/*    */     //   370: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   373: pop
/*    */     //   374: ifnull -> 387
/*    */     //   377: aload_0
/*    */     //   378: getfield HT : Lf/eo;
/*    */     //   381: aload #4
/*    */     //   383: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   386: pop
/*    */     //   387: aload_1
/*    */     //   388: aload_0
/*    */     //   389: getfield HT : Lf/eo;
/*    */     //   392: invokevirtual RO : (Lf/eo;)V
/*    */     //   395: iinc #2, 1
/*    */     //   398: goto -> 320
/*    */     //   401: iload_2
/*    */     //   402: iload #7
/*    */     //   404: if_icmpge -> 607
/*    */     //   407: aload #4
/*    */     //   409: aload_0
/*    */     //   410: iload_2
/*    */     //   411: iload #9
/*    */     //   413: imul
/*    */     //   414: iload #8
/*    */     //   416: iadd
/*    */     //   417: istore #5
/*    */     //   419: getfield HT : Lf/eo;
/*    */     //   422: aload_3
/*    */     //   423: iload #5
/*    */     //   425: aload_3
/*    */     //   426: iload #5
/*    */     //   428: invokevirtual get : (I)F
/*    */     //   431: fstore #5
/*    */     //   433: iconst_1
/*    */     //   434: iadd
/*    */     //   435: invokevirtual get : (I)F
/*    */     //   438: fload #5
/*    */     //   440: swap
/*    */     //   441: fconst_0
/*    */     //   442: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   445: pop
/*    */     //   446: ifnull -> 459
/*    */     //   449: aload_0
/*    */     //   450: getfield HT : Lf/eo;
/*    */     //   453: aload #4
/*    */     //   455: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   458: pop
/*    */     //   459: aload_1
/*    */     //   460: aload_0
/*    */     //   461: getfield HT : Lf/eo;
/*    */     //   464: invokevirtual RO : (Lf/eo;)V
/*    */     //   467: iinc #2, 1
/*    */     //   470: goto -> 401
/*    */     //   473: iload #5
/*    */     //   475: ifle -> 547
/*    */     //   478: iload_2
/*    */     //   479: iload #7
/*    */     //   481: if_icmpge -> 607
/*    */     //   484: aload #4
/*    */     //   486: aload_0
/*    */     //   487: aload #6
/*    */     //   489: iload_2
/*    */     //   490: invokevirtual get : (I)S
/*    */     //   493: ldc_w 65535
/*    */     //   496: iand
/*    */     //   497: iload #9
/*    */     //   499: imul
/*    */     //   500: iload #8
/*    */     //   502: iadd
/*    */     //   503: istore #5
/*    */     //   505: getfield HT : Lf/eo;
/*    */     //   508: aload_3
/*    */     //   509: iload #5
/*    */     //   511: invokevirtual get : (I)F
/*    */     //   514: fconst_0
/*    */     //   515: fconst_0
/*    */     //   516: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   519: pop
/*    */     //   520: ifnull -> 533
/*    */     //   523: aload_0
/*    */     //   524: getfield HT : Lf/eo;
/*    */     //   527: aload #4
/*    */     //   529: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   532: pop
/*    */     //   533: aload_1
/*    */     //   534: aload_0
/*    */     //   535: getfield HT : Lf/eo;
/*    */     //   538: invokevirtual RO : (Lf/eo;)V
/*    */     //   541: iinc #2, 1
/*    */     //   544: goto -> 478
/*    */     //   547: iload_2
/*    */     //   548: iload #7
/*    */     //   550: if_icmpge -> 607
/*    */     //   553: aload #4
/*    */     //   555: aload_0
/*    */     //   556: iload_2
/*    */     //   557: iload #9
/*    */     //   559: imul
/*    */     //   560: iload #8
/*    */     //   562: iadd
/*    */     //   563: istore #5
/*    */     //   565: getfield HT : Lf/eo;
/*    */     //   568: aload_3
/*    */     //   569: iload #5
/*    */     //   571: invokevirtual get : (I)F
/*    */     //   574: fconst_0
/*    */     //   575: fconst_0
/*    */     //   576: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   579: pop
/*    */     //   580: ifnull -> 593
/*    */     //   583: aload_0
/*    */     //   584: getfield HT : Lf/eo;
/*    */     //   587: aload #4
/*    */     //   589: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
/*    */     //   592: pop
/*    */     //   593: aload_1
/*    */     //   594: aload_0
/*    */     //   595: getfield HT : Lf/eo;
/*    */     //   598: invokevirtual RO : (Lf/eo;)V
/*    */     //   601: iinc #2, 1
/*    */     //   604: goto -> 547
/*    */     //   607: aload_1
/*    */     //   608: areturn
/*    */     //   609: new f/JU
/*    */     //   612: dup
/*    */     //   613: new java/lang/StringBuilder
/*    */     //   616: dup
/*    */     //   617: invokespecial <init> : ()V
/*    */     //   620: ldc_w 'Invalid part specified ( offset='
/*    */     //   623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   626: iload_2
/*    */     //   627: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   630: ldc_w ', count='
/*    */     //   633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   636: iload_3
/*    */     //   637: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   640: ldc_w ', max='
/*    */     //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   646: iload #6
/*    */     //   648: ldc_w ' )'
/*    */     //   651: invokestatic Gl0 : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
/*    */     //   654: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   657: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 13
/*    */     //   #3	-> 56
/*    */     //   #4	-> 648
/*  5 */     //   #5	-> 654 } public final float[] uk(int paramInt, float[] paramArrayOffloat) { byte b1 = 0, b2 = 0; int i = this.Dt0.IH(); i = (this.Dt0.getAttributes()).Nb * i / 4; if (paramInt == -1 && (paramInt = i - b1) > paramArrayOffloat.length - b2) paramInt = paramArrayOffloat.length - b2;  if (paramInt > 0 && b1 + paramInt <= i && paramArrayOffloat.length > 0) { if (paramArrayOffloat.length - b2 >= paramInt) { int j = this.Dt0.w0().position();
/*  6 */         this.Dt0.w0()
/*  7 */           .position(b1);
/*  8 */         this.Dt0.w0()
/*  9 */           .get(paramArrayOffloat, b2, paramInt);
/* 10 */         this.Dt0.w0()
/* 11 */           .position(j); return paramArrayOffloat; }  throw new IllegalArgumentException(
/* 12 */           B40.df("not enough room in vertices array, has ")
/* 13 */           .append(paramArrayOffloat.length).append(" floats, needs ").append(paramInt).toString()); }  throw new IndexOutOfBoundsException(); }
/*    */ 
/*    */   
/*    */   public final void cOM9(short[] paramArrayOfshort) {
/*    */     this.rs0.q10(paramArrayOfshort.length, paramArrayOfshort);
/*    */   }
/*    */   
/*    */   public final void x2(int paramInt, short[] paramArrayOfshort) {
/*    */     byte b1 = 0, b2 = 0;
/*    */     int i = this.rs0.pP();
/*    */     if (paramInt < 0)
/*    */       paramInt = i - b1; 
/*    */     if (i > 0 && paramInt + b1 <= i) {
/*    */       if (paramArrayOfshort.length - b2 >= paramInt) {
/*    */         int j = this.rs0.w0().position();
/*    */         this.rs0.w0().position(b1);
/*    */         this.rs0.w0().get(paramArrayOfshort, b2, paramInt);
/*    */         this.rs0.w0().position(j);
/*    */         return;
/*    */       } 
/*    */       throw new IllegalArgumentException(B40.df("not enough room in indices array, has ").append(paramArrayOfshort.length).append(" shorts, needs ").append(paramInt).toString());
/*    */     } 
/*    */     throw new IllegalArgumentException("Invalid range specified, offset: " + b1 + ", count: " + paramInt + ", max: " + i);
/*    */   }
/*    */   
/*    */   public final void wJ0() {
/*    */     this.N70 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/re0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */