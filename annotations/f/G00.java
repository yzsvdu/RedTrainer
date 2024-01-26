/* 1 */ package f;public final class G00 { public final LJ Cx0(byte paramByte, int paramInt, boolean paramBoolean) { LJ lJ; Le0 le0; if ((le0 = (Le0)this.Sl.Ha0(paramByte)) == null) return f00;  if (paramBoolean) { lJ = (LJ)this.bO.Z6(paramInt); } else { lJ = (LJ)((Le0)this).Gi0.Z6(paramInt); }  if (this == null)
/* 2 */       return f00;  return this; }
/*   */ 
/*   */   
/*   */   public static final Cs f00 = new Cs();
/*   */   public static G00 Av0 = new G00();
/*   */   public ak Sl;
/*   */   public ak ib0;
/*   */   
/*   */   public G00() {
/*   */     Le0 le0;
/*   */     ak ak1;
/*   */     this();
/*   */     this.Sl = ak1;
/*   */     this();
/*   */     this.ib0 = ak1;
/*   */     for (byte b = 0; b < 5; b = (byte)(b + 1)) {
/*   */       this.ib0.VF(b, new f1[46]);
/*   */       this.Sl.VF(b, new Le0());
/*   */     } 
/*   */     this.ib0.VF((byte)10, new f1[46]);
/*   */     this();
/*   */     this.Sl.VF((byte)10, this);
/*   */   }
/*   */   
/*   */   public static G00 Yj0() {
/*   */     return Av0;
/*   */   }
/*   */   
/*   */   public final void CoM9(s40 params40) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: ifnonnull -> 5
/*   */     //   4: return
/*   */     //   5: aload_0
/*   */     //   6: aload_1
/*   */     //   7: dup
/*   */     //   8: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*   */     //   11: dup
/*   */     //   12: astore_2
/*   */     //   13: aload_1
/*   */     //   14: getfield wJ : Lf/uq;
/*   */     //   17: getstatic f/uq.Qm : I
/*   */     //   20: invokevirtual nz : (I)I
/*   */     //   23: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   26: pop
/*   */     //   27: invokevirtual in : ()B
/*   */     //   30: istore_3
/*   */     //   31: getfield ib0 : Lf/ak;
/*   */     //   34: iload_3
/*   */     //   35: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*   */     //   38: checkcast [Lf/f1;
/*   */     //   41: astore #4
/*   */     //   43: iconst_0
/*   */     //   44: istore #5
/*   */     //   46: iload #5
/*   */     //   48: aload #4
/*   */     //   50: arraylength
/*   */     //   51: iconst_2
/*   */     //   52: isub
/*   */     //   53: if_icmpge -> 135
/*   */     //   56: aload_2
/*   */     //   57: invokevirtual getInt : ()I
/*   */     //   60: invokestatic tx0 : (I)I
/*   */     //   63: dup
/*   */     //   64: istore #6
/*   */     //   66: iconst_1
/*   */     //   67: if_icmpge -> 73
/*   */     //   70: goto -> 135
/*   */     //   73: aload #4
/*   */     //   75: aload_2
/*   */     //   76: dup
/*   */     //   77: dup
/*   */     //   78: invokevirtual get : ()B
/*   */     //   81: istore #7
/*   */     //   83: invokevirtual getShort : ()S
/*   */     //   86: pop
/*   */     //   87: invokevirtual get : ()B
/*   */     //   90: pop
/*   */     //   91: getstatic f/aM0.Ij0 : Lf/aM0;
/*   */     //   94: dup
/*   */     //   95: astore #8
/*   */     //   97: aload_1
/*   */     //   98: dup
/*   */     //   99: aload #8
/*   */     //   101: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   104: pop
/*   */     //   105: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*   */     //   108: astore #8
/*   */     //   110: invokevirtual in : ()B
/*   */     //   113: istore #9
/*   */     //   115: iconst_1
/*   */     //   116: iload #6
/*   */     //   118: aload #8
/*   */     //   120: iload #9
/*   */     //   122: invokevirtual LY : (IILjava/nio/ByteBuffer;B)Lf/f1;
/*   */     //   125: iload #7
/*   */     //   127: swap
/*   */     //   128: aastore
/*   */     //   129: iinc #5, 1
/*   */     //   132: goto -> 46
/*   */     //   135: aload_2
/*   */     //   136: aload_1
/*   */     //   137: getfield wJ : Lf/uq;
/*   */     //   140: getstatic f/uq.Jb : I
/*   */     //   143: invokevirtual nz : (I)I
/*   */     //   146: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   149: pop
/*   */     //   150: aload_2
/*   */     //   151: invokevirtual getInt : ()I
/*   */     //   154: invokestatic tx0 : (I)I
/*   */     //   157: dup
/*   */     //   158: istore #5
/*   */     //   160: iconst_1
/*   */     //   161: if_icmpge -> 638
/*   */     //   164: iconst_0
/*   */     //   165: istore #5
/*   */     //   167: iload #5
/*   */     //   169: aload #4
/*   */     //   171: arraylength
/*   */     //   172: if_icmpge -> 198
/*   */     //   175: aload #4
/*   */     //   177: iload #5
/*   */     //   179: aaload
/*   */     //   180: ifnonnull -> 192
/*   */     //   183: aload #4
/*   */     //   185: dup
/*   */     //   186: iconst_0
/*   */     //   187: aaload
/*   */     //   188: iload #5
/*   */     //   190: swap
/*   */     //   191: aastore
/*   */     //   192: iinc #5, 1
/*   */     //   195: goto -> 167
/*   */     //   198: aload_2
/*   */     //   199: aload_1
/*   */     //   200: getfield wJ : Lf/uq;
/*   */     //   203: getstatic f/uq.Wb0 : I
/*   */     //   206: invokevirtual nz : (I)I
/*   */     //   209: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   212: pop
/*   */     //   213: new java/util/ArrayList
/*   */     //   216: dup
/*   */     //   217: astore #6
/*   */     //   219: invokespecial <init> : ()V
/*   */     //   222: new java/util/ArrayList
/*   */     //   225: dup
/*   */     //   226: astore #7
/*   */     //   228: invokespecial <init> : ()V
/*   */     //   231: iconst_0
/*   */     //   232: istore #4
/*   */     //   234: iconst_0
/*   */     //   235: istore #5
/*   */     //   237: aload_2
/*   */     //   238: invokevirtual getInt : ()I
/*   */     //   241: invokestatic tx0 : (I)I
/*   */     //   244: dup
/*   */     //   245: istore #8
/*   */     //   247: iconst_1
/*   */     //   248: if_icmpge -> 570
/*   */     //   251: iload #4
/*   */     //   253: ifeq -> 564
/*   */     //   256: aload #7
/*   */     //   258: aload_0
/*   */     //   259: getfield Sl : Lf/ak;
/*   */     //   262: iload_3
/*   */     //   263: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*   */     //   266: checkcast f/Le0
/*   */     //   269: astore_1
/*   */     //   270: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   273: astore_2
/*   */     //   274: aload_2
/*   */     //   275: invokeinterface hasNext : ()Z
/*   */     //   280: ifeq -> 563
/*   */     //   283: aload #6
/*   */     //   285: aload_2
/*   */     //   286: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   291: checkcast f/Cs
/*   */     //   294: dup
/*   */     //   295: astore_3
/*   */     //   296: getfield UB : I
/*   */     //   299: istore #4
/*   */     //   301: iconst_0
/*   */     //   302: istore #5
/*   */     //   304: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   307: astore #7
/*   */     //   309: aload #7
/*   */     //   311: invokeinterface hasNext : ()Z
/*   */     //   316: ifeq -> 360
/*   */     //   319: iload #5
/*   */     //   321: aload #7
/*   */     //   323: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   328: checkcast java/lang/Integer
/*   */     //   331: invokevirtual intValue : ()I
/*   */     //   334: istore #8
/*   */     //   336: ifeq -> 346
/*   */     //   339: iload #8
/*   */     //   341: iload #5
/*   */     //   343: if_icmpge -> 309
/*   */     //   346: iload #8
/*   */     //   348: iload #4
/*   */     //   350: if_icmple -> 309
/*   */     //   353: iload #8
/*   */     //   355: istore #5
/*   */     //   357: goto -> 309
/*   */     //   360: aload_3
/*   */     //   361: dup
/*   */     //   362: dup
/*   */     //   363: aload_0
/*   */     //   364: aload_3
/*   */     //   365: dup
/*   */     //   366: dup
/*   */     //   367: iload #5
/*   */     //   369: putfield m90 : I
/*   */     //   372: getfield s20 : Lf/s40;
/*   */     //   375: invokevirtual in : ()B
/*   */     //   378: istore #4
/*   */     //   380: getfield LH : B
/*   */     //   383: istore #7
/*   */     //   385: getfield ib0 : Lf/ak;
/*   */     //   388: iload #4
/*   */     //   390: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*   */     //   393: checkcast [Lf/f1;
/*   */     //   396: iload #7
/*   */     //   398: aaload
/*   */     //   399: putfield kB0 : Lf/f1;
/*   */     //   402: getfield s20 : Lf/s40;
/*   */     //   405: invokevirtual in : ()B
/*   */     //   408: istore #4
/*   */     //   410: getfield LH : B
/*   */     //   413: istore #7
/*   */     //   415: iconst_0
/*   */     //   416: istore #8
/*   */     //   418: iload #8
/*   */     //   420: iconst_4
/*   */     //   421: if_icmpge -> 455
/*   */     //   424: getstatic f/YO.break : Lf/qw0;
/*   */     //   427: iload #4
/*   */     //   429: iload #8
/*   */     //   431: iload #7
/*   */     //   433: iconst_0
/*   */     //   434: invokestatic JK0 : (IIII)S
/*   */     //   437: invokevirtual Fb : (S)Z
/*   */     //   440: ifeq -> 449
/*   */     //   443: iconst_1
/*   */     //   444: istore #4
/*   */     //   446: goto -> 462
/*   */     //   449: iinc #8, 1
/*   */     //   452: goto -> 418
/*   */     //   455: getstatic f/YO.hF0 : Lf/qw0;
/*   */     //   458: pop
/*   */     //   459: iconst_0
/*   */     //   460: istore #4
/*   */     //   462: aload_3
/*   */     //   463: dup
/*   */     //   464: dup
/*   */     //   465: iload #4
/*   */     //   467: putfield Vr : Z
/*   */     //   470: getfield s20 : Lf/s40;
/*   */     //   473: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*   */     //   476: dup
/*   */     //   477: astore #4
/*   */     //   479: aload_3
/*   */     //   480: getfield UB : I
/*   */     //   483: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   486: pop
/*   */     //   487: iconst_0
/*   */     //   488: putfield DJ0 : I
/*   */     //   491: iload #5
/*   */     //   493: iconst_1
/*   */     //   494: if_icmplt -> 507
/*   */     //   497: aload #4
/*   */     //   499: invokevirtual position : ()I
/*   */     //   502: iload #5
/*   */     //   504: if_icmpge -> 519
/*   */     //   507: aload #4
/*   */     //   509: invokevirtual getInt : ()I
/*   */     //   512: invokestatic tx0 : (I)I
/*   */     //   515: iconst_1
/*   */     //   516: if_icmpge -> 539
/*   */     //   519: aload_1
/*   */     //   520: aload_3
/*   */     //   521: getfield ZR : I
/*   */     //   524: istore #4
/*   */     //   526: getfield Gi0 : Lf/Ut0;
/*   */     //   529: iload #4
/*   */     //   531: aload_3
/*   */     //   532: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*   */     //   535: pop
/*   */     //   536: goto -> 274
/*   */     //   539: aload_3
/*   */     //   540: dup
/*   */     //   541: aload #4
/*   */     //   543: dup
/*   */     //   544: invokevirtual getShort : ()S
/*   */     //   547: pop
/*   */     //   548: invokevirtual getShort : ()S
/*   */     //   551: pop
/*   */     //   552: getfield DJ0 : I
/*   */     //   555: iconst_1
/*   */     //   556: iadd
/*   */     //   557: putfield DJ0 : I
/*   */     //   560: goto -> 491
/*   */     //   563: return
/*   */     //   564: iconst_1
/*   */     //   565: istore #4
/*   */     //   567: goto -> 632
/*   */     //   570: new f/Cs
/*   */     //   573: dup
/*   */     //   574: dup
/*   */     //   575: astore #9
/*   */     //   577: iload #5
/*   */     //   579: iload #8
/*   */     //   581: aload_1
/*   */     //   582: invokespecial <init> : (IILf/s40;)V
/*   */     //   585: getfield BI : Z
/*   */     //   588: ifeq -> 603
/*   */     //   591: aload #9
/*   */     //   593: getfield LH : B
/*   */     //   596: iflt -> 603
/*   */     //   599: iconst_1
/*   */     //   600: goto -> 604
/*   */     //   603: iconst_0
/*   */     //   604: ifne -> 610
/*   */     //   607: goto -> 632
/*   */     //   610: aload #6
/*   */     //   612: aload #9
/*   */     //   614: aload #7
/*   */     //   616: aload #9
/*   */     //   618: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   621: pop
/*   */     //   622: getfield UB : I
/*   */     //   625: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   628: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   631: pop
/*   */     //   632: iinc #5, 1
/*   */     //   635: goto -> 237
/*   */     //   638: aload_2
/*   */     //   639: invokevirtual get : ()B
/*   */     //   642: bipush #26
/*   */     //   644: iadd
/*   */     //   645: dup
/*   */     //   646: istore #6
/*   */     //   648: aload #4
/*   */     //   650: aload_2
/*   */     //   651: dup
/*   */     //   652: invokevirtual getShort : ()S
/*   */     //   655: pop
/*   */     //   656: invokevirtual get : ()B
/*   */     //   659: pop
/*   */     //   660: arraylength
/*   */     //   661: if_icmpge -> 150
/*   */     //   664: iload #6
/*   */     //   666: ifge -> 672
/*   */     //   669: goto -> 150
/*   */     //   672: aload #4
/*   */     //   674: getstatic f/aM0.Ij0 : Lf/aM0;
/*   */     //   677: dup
/*   */     //   678: astore #7
/*   */     //   680: aload_1
/*   */     //   681: dup
/*   */     //   682: aload #7
/*   */     //   684: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   687: pop
/*   */     //   688: invokevirtual pr : ()Ljava/nio/ByteBuffer;
/*   */     //   691: astore #7
/*   */     //   693: invokevirtual in : ()B
/*   */     //   696: istore #8
/*   */     //   698: iconst_1
/*   */     //   699: iload #5
/*   */     //   701: aload #7
/*   */     //   703: iload #8
/*   */     //   705: invokevirtual LY : (IILjava/nio/ByteBuffer;B)Lf/f1;
/*   */     //   708: iload #6
/*   */     //   710: swap
/*   */     //   711: aastore
/*   */     //   712: goto -> 150
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 14
/*   */     //   #2	-> 17
/*   */     //   #3	-> 91
/*   */     //   #4	-> 101
/*   */     //   #5	-> 105
/*   */     //   #6	-> 128
/*   */     //   #7	-> 137
/*   */     //   #8	-> 140
/*   */     //   #9	-> 200
/*   */     //   #10	-> 203
/*   */     //   #11	-> 296
/*   */     //   #12	-> 304
/*   */     //   #13	-> 369
/*   */     //   #14	-> 385
/*   */     //   #15	-> 399
/*   */     //   #16	-> 424
/*   */     //   #17	-> 437
/*   */     //   #18	-> 455
/*   */     //   #19	-> 521
/*   */     //   #20	-> 526
/*   */     //   #21	-> 532
/*   */     //   #22	-> 544
/*   */     //   #23	-> 570
/*   */     //   #24	-> 585
/*   */     //   #25	-> 618
/*   */     //   #26	-> 622
/*   */     //   #27	-> 625
/*   */     //   #28	-> 674
/*   */     //   #29	-> 684
/*   */     //   #30	-> 688
/*   */     //   #31	-> 711
/*   */   }
/*   */   
/*   */   public final LJ zp(int paramInt, byte paramByte) {
/*   */     return Cx0(paramByte, paramInt, false);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */