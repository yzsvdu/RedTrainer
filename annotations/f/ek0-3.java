/* 1 */ package f;public final class ek0 extends Tw { public final boolean Pm0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) { int i; if ((i = this.D30.LPt1.ordinal()) != 2) { if (i != 3) { System.err
/* 2 */           .println(B40.df("Unknown bit depth: ").append(this.D30.LPt1).toString()); return false; }  for (paramInt1 = 0; paramInt1 < paramInt2; ) { paramArrayOfbyte[paramInt3 + paramInt1] = this.D30.h1[paramInt1]; paramInt1++; }  } else { for (i = 0; i < paramInt2 / 2; ) { int j; byte[] arrayOfByte; if ((j = paramInt1 / 2 + i) < (arrayOfByte = this.D30.h1).length) { j = i * 2 + paramInt3; paramArrayOfbyte[j] = (byte)(arrayOfByte[j] & 0xF); paramArrayOfbyte[++j] = (byte)(arrayOfByte[j] >> 4 & 0xF); }  i++; }  }  return true; }
/*   */ 
/*   */   
/*   */   public T7 Tj0;
/*   */   public int km;
/*   */   public boolean sG0 = false;
/*   */   public FA0 UO;
/*   */   public pJ0 D30 = new pJ0();
/*   */   public BW F40 = new BW();
/*   */   public int Ax0;
/*   */   
/*   */   public ek0(T7 paramT7) {
/*   */     this(paramT7, false);
/*   */   }
/*   */   
/*   */   public ek0(T7 paramT7, boolean paramBoolean) {
/*   */     this.Tj0 = paramT7;
/*   */     this.km = paramT7.zu0;
/*   */     this.sG0 = paramBoolean;
/*   */     M0();
/*   */   }
/*   */   
/*   */   public final void M0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Tj0 : Lf/T7;
/*   */     //   4: aload_0
/*   */     //   5: getfield sG0 : Z
/*   */     //   8: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
/*   */     //   11: dup
/*   */     //   12: astore_1
/*   */     //   13: aload_0
/*   */     //   14: dup
/*   */     //   15: dup2
/*   */     //   16: aload_1
/*   */     //   17: aload_0
/*   */     //   18: new f/FA0
/*   */     //   21: dup
/*   */     //   22: aload_0
/*   */     //   23: swap
/*   */     //   24: dup
/*   */     //   25: aload_1
/*   */     //   26: invokespecial <init> : (Ljava/nio/ByteBuffer;)V
/*   */     //   29: putfield UO : Lf/FA0;
/*   */     //   32: ldc 1313032018
/*   */     //   34: invokevirtual sV : (I)V
/*   */     //   37: getfield D30 : Lf/pJ0;
/*   */     //   40: iconst_4
/*   */     //   41: newarray byte
/*   */     //   43: astore_2
/*   */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   47: pop
/*   */     //   48: aload_2
/*   */     //   49: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
/*   */     //   52: pop
/*   */     //   53: getfield D30 : Lf/pJ0;
/*   */     //   56: aload_1
/*   */     //   57: invokevirtual getInt : ()I
/*   */     //   60: pop
/*   */     //   61: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   64: pop
/*   */     //   65: getfield D30 : Lf/pJ0;
/*   */     //   68: aload_1
/*   */     //   69: invokevirtual getShort : ()S
/*   */     //   72: putfield zf : S
/*   */     //   75: getfield D30 : Lf/pJ0;
/*   */     //   78: aload_1
/*   */     //   79: invokevirtual getShort : ()S
/*   */     //   82: putfield tK0 : S
/*   */     //   85: getfield D30 : Lf/pJ0;
/*   */     //   88: astore_2
/*   */     //   89: invokevirtual getInt : ()I
/*   */     //   92: istore_3
/*   */     //   93: getstatic f/I30.Dc : [Lf/I30;
/*   */     //   96: dup
/*   */     //   97: astore #4
/*   */     //   99: arraylength
/*   */     //   100: istore #5
/*   */     //   102: iconst_0
/*   */     //   103: istore #6
/*   */     //   105: iload #6
/*   */     //   107: iload #5
/*   */     //   109: if_icmpge -> 136
/*   */     //   112: aload #4
/*   */     //   114: iload #6
/*   */     //   116: aaload
/*   */     //   117: dup
/*   */     //   118: astore #7
/*   */     //   120: getfield bG0 : I
/*   */     //   123: iload_3
/*   */     //   124: if_icmpne -> 130
/*   */     //   127: goto -> 139
/*   */     //   130: iinc #6, 1
/*   */     //   133: goto -> 105
/*   */     //   136: aconst_null
/*   */     //   137: astore #7
/*   */     //   139: aload_0
/*   */     //   140: dup
/*   */     //   141: dup
/*   */     //   142: aload_2
/*   */     //   143: aload #7
/*   */     //   145: putfield LPt1 : Lf/I30;
/*   */     //   148: getfield D30 : Lf/pJ0;
/*   */     //   151: aload_1
/*   */     //   152: invokevirtual getInt : ()I
/*   */     //   155: putfield qu : I
/*   */     //   158: getfield D30 : Lf/pJ0;
/*   */     //   161: aload_1
/*   */     //   162: invokevirtual getInt : ()I
/*   */     //   165: putfield Vl0 : I
/*   */     //   168: getfield D30 : Lf/pJ0;
/*   */     //   171: dup
/*   */     //   172: astore_2
/*   */     //   173: getfield Vl0 : I
/*   */     //   176: sipush #255
/*   */     //   179: iand
/*   */     //   180: ifne -> 191
/*   */     //   183: aload_0
/*   */     //   184: iconst_2
/*   */     //   185: putfield Ax0 : I
/*   */     //   188: goto -> 196
/*   */     //   191: aload_0
/*   */     //   192: iconst_1
/*   */     //   193: putfield Ax0 : I
/*   */     //   196: aload_0
/*   */     //   197: aload_1
/*   */     //   198: aload_0
/*   */     //   199: dup
/*   */     //   200: aload_2
/*   */     //   201: aload_1
/*   */     //   202: invokevirtual getInt : ()I
/*   */     //   205: putfield UV : I
/*   */     //   208: getfield D30 : Lf/pJ0;
/*   */     //   211: aload_1
/*   */     //   212: invokevirtual getInt : ()I
/*   */     //   215: pop
/*   */     //   216: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   219: pop
/*   */     //   220: getfield D30 : Lf/pJ0;
/*   */     //   223: dup
/*   */     //   224: getfield UV : I
/*   */     //   227: newarray byte
/*   */     //   229: dup
/*   */     //   230: astore_2
/*   */     //   231: putfield h1 : [B
/*   */     //   234: aload_2
/*   */     //   235: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
/*   */     //   238: pop
/*   */     //   239: getfield D30 : Lf/pJ0;
/*   */     //   242: dup
/*   */     //   243: astore_2
/*   */     //   244: getfield tK0 : S
/*   */     //   247: dup
/*   */     //   248: istore_3
/*   */     //   249: iconst_m1
/*   */     //   250: if_icmpeq -> 275
/*   */     //   253: aload_0
/*   */     //   254: aload_2
/*   */     //   255: aload_0
/*   */     //   256: iload_3
/*   */     //   257: bipush #8
/*   */     //   259: imul
/*   */     //   260: putfield Sw0 : I
/*   */     //   263: getfield zf : S
/*   */     //   266: bipush #8
/*   */     //   268: imul
/*   */     //   269: putfield ve0 : I
/*   */     //   272: goto -> 293
/*   */     //   275: aload_0
/*   */     //   276: aload_2
/*   */     //   277: aload_0
/*   */     //   278: bipush #64
/*   */     //   280: putfield Sw0 : I
/*   */     //   283: getfield UV : I
/*   */     //   286: bipush #64
/*   */     //   288: idiv
/*   */     //   289: i2s
/*   */     //   290: putfield ve0 : I
/*   */     //   293: aload_0
/*   */     //   294: getfield UO : Lf/FA0;
/*   */     //   297: getfield ua0 : S
/*   */     //   300: iconst_2
/*   */     //   301: if_icmpne -> 384
/*   */     //   304: aload_1
/*   */     //   305: invokevirtual position : ()I
/*   */     //   308: aload_0
/*   */     //   309: getfield km : I
/*   */     //   312: if_icmpge -> 384
/*   */     //   315: aload_0
/*   */     //   316: dup
/*   */     //   317: dup2
/*   */     //   318: aload_1
/*   */     //   319: aload_0
/*   */     //   320: getfield F40 : Lf/BW;
/*   */     //   323: iconst_4
/*   */     //   324: newarray byte
/*   */     //   326: astore_2
/*   */     //   327: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   330: pop
/*   */     //   331: aload_2
/*   */     //   332: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
/*   */     //   335: pop
/*   */     //   336: getfield F40 : Lf/BW;
/*   */     //   339: aload_1
/*   */     //   340: invokevirtual getInt : ()I
/*   */     //   343: pop
/*   */     //   344: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   347: pop
/*   */     //   348: getfield F40 : Lf/BW;
/*   */     //   351: aload_1
/*   */     //   352: invokevirtual getInt : ()I
/*   */     //   355: pop
/*   */     //   356: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   359: pop
/*   */     //   360: getfield F40 : Lf/BW;
/*   */     //   363: aload_1
/*   */     //   364: invokevirtual getShort : ()S
/*   */     //   367: pop
/*   */     //   368: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   371: pop
/*   */     //   372: getfield F40 : Lf/BW;
/*   */     //   375: aload_1
/*   */     //   376: invokevirtual getShort : ()S
/*   */     //   379: pop
/*   */     //   380: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   383: pop
/*   */     //   384: aload_0
/*   */     //   385: dup
/*   */     //   386: getfield D30 : Lf/pJ0;
/*   */     //   389: dup
/*   */     //   390: astore_1
/*   */     //   391: aload_0
/*   */     //   392: dup
/*   */     //   393: aload_1
/*   */     //   394: getfield h1 : [B
/*   */     //   397: astore_1
/*   */     //   398: getfield Sw0 : I
/*   */     //   401: istore_2
/*   */     //   402: getfield ve0 : I
/*   */     //   405: istore_3
/*   */     //   406: getfield LPt1 : Lf/I30;
/*   */     //   409: astore #4
/*   */     //   411: getfield Ax0 : I
/*   */     //   414: dup
/*   */     //   415: istore #5
/*   */     //   417: aload_0
/*   */     //   418: dup
/*   */     //   419: dup2
/*   */     //   420: aload_1
/*   */     //   421: putfield v3 : [B
/*   */     //   424: aload #4
/*   */     //   426: putfield WF0 : Lf/I30;
/*   */     //   429: iload #5
/*   */     //   431: putfield jA : I
/*   */     //   434: iload_2
/*   */     //   435: putfield Sw0 : I
/*   */     //   438: iconst_2
/*   */     //   439: if_icmpeq -> 448
/*   */     //   442: iload #5
/*   */     //   444: iconst_3
/*   */     //   445: if_icmpne -> 463
/*   */     //   448: iload_2
/*   */     //   449: aload_0
/*   */     //   450: getfield Gw : I
/*   */     //   453: dup
/*   */     //   454: istore_2
/*   */     //   455: if_icmpge -> 463
/*   */     //   458: aload_0
/*   */     //   459: iload_2
/*   */     //   460: putfield Sw0 : I
/*   */     //   463: iload #5
/*   */     //   465: aload_0
/*   */     //   466: iload_3
/*   */     //   467: putfield ve0 : I
/*   */     //   470: iconst_2
/*   */     //   471: if_icmpeq -> 480
/*   */     //   474: iload #5
/*   */     //   476: iconst_3
/*   */     //   477: if_icmpne -> 495
/*   */     //   480: iload_3
/*   */     //   481: aload_0
/*   */     //   482: getfield Gw : I
/*   */     //   485: dup
/*   */     //   486: istore_2
/*   */     //   487: if_icmpge -> 495
/*   */     //   490: aload_0
/*   */     //   491: iload_2
/*   */     //   492: putfield ve0 : I
/*   */     //   495: iload #5
/*   */     //   497: aload_0
/*   */     //   498: bipush #8
/*   */     //   500: dup
/*   */     //   501: istore_2
/*   */     //   502: putfield Gw : I
/*   */     //   505: iconst_2
/*   */     //   506: if_icmpeq -> 515
/*   */     //   509: iload #5
/*   */     //   511: iconst_3
/*   */     //   512: if_icmpne -> 541
/*   */     //   515: aload_0
/*   */     //   516: getfield Sw0 : I
/*   */     //   519: iload_2
/*   */     //   520: if_icmpge -> 528
/*   */     //   523: aload_0
/*   */     //   524: iload_2
/*   */     //   525: putfield Sw0 : I
/*   */     //   528: aload_0
/*   */     //   529: getfield ve0 : I
/*   */     //   532: iload_2
/*   */     //   533: if_icmpge -> 541
/*   */     //   536: aload_0
/*   */     //   537: iload_2
/*   */     //   538: putfield ve0 : I
/*   */     //   541: aload_0
/*   */     //   542: iload_2
/*   */     //   543: aload_1
/*   */     //   544: aload_0
/*   */     //   545: aload #4
/*   */     //   547: getfield mX : I
/*   */     //   550: dup
/*   */     //   551: istore_0
/*   */     //   552: putfield m80 : I
/*   */     //   555: arraylength
/*   */     //   556: istore_1
/*   */     //   557: iload_0
/*   */     //   558: idiv
/*   */     //   559: iload_1
/*   */     //   560: imul
/*   */     //   561: newarray byte
/*   */     //   563: putfield yn0 : [B
/*   */     //   566: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 93
/*   */     //   #2	-> 120
/*   */     //   #3	-> 145
/*   */     //   #4	-> 421
/*   */     //   #5	-> 435
/*   */     //   #6	-> 467
/*   */     //   #7	-> 502
/*   */     //   #8	-> 547
/*   */     //   #9	-> 552
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ek0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */