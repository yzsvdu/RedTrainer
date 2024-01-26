package f;

public final class vJ extends dk {
  public int Vg0;
  
  public T7 gB0;
  
  public FA0 Bx;
  
  public yy0 Ro = new yy0();
  
  public D80 QL0 = new D80();
  
  public vJ(T7 paramT7) {
    this.gB0 = paramT7;
    this.Vg0 = paramT7.zu0;
    st0();
  }
  
  public final void st0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield gB0 : Lf/T7;
    //   4: iconst_0
    //   5: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
    //   8: dup
    //   9: astore_1
    //   10: aload_0
    //   11: dup
    //   12: aload_1
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual position : ()I
    //   18: istore_2
    //   19: new f/FA0
    //   22: dup
    //   23: aload_0
    //   24: swap
    //   25: dup
    //   26: aload_1
    //   27: invokespecial <init> : (Ljava/nio/ByteBuffer;)V
    //   30: putfield Bx : Lf/FA0;
    //   33: ldc 1313033298
    //   35: invokevirtual sV : (I)V
    //   38: getfield Ro : Lf/yy0;
    //   41: iconst_4
    //   42: newarray byte
    //   44: astore_3
    //   45: invokevirtual getClass : ()Ljava/lang/Class;
    //   48: pop
    //   49: aload_3
    //   50: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
    //   53: pop
    //   54: getfield Ro : Lf/yy0;
    //   57: aload_1
    //   58: invokevirtual getInt : ()I
    //   61: putfield T80 : I
    //   64: getfield Ro : Lf/yy0;
    //   67: astore_3
    //   68: invokevirtual getShort : ()S
    //   71: istore #4
    //   73: getstatic f/I30.Dc : [Lf/I30;
    //   76: dup
    //   77: astore #5
    //   79: arraylength
    //   80: istore #6
    //   82: iconst_0
    //   83: istore #7
    //   85: iload #7
    //   87: iload #6
    //   89: if_icmpge -> 117
    //   92: aload #5
    //   94: iload #7
    //   96: aaload
    //   97: dup
    //   98: astore #8
    //   100: getfield bG0 : I
    //   103: iload #4
    //   105: if_icmpne -> 111
    //   108: goto -> 120
    //   111: iinc #7, 1
    //   114: goto -> 85
    //   117: aconst_null
    //   118: astore #8
    //   120: aload_0
    //   121: dup
    //   122: dup2
    //   123: aload_3
    //   124: aload #8
    //   126: putfield Uu0 : Lf/I30;
    //   129: getfield Ro : Lf/yy0;
    //   132: aload_1
    //   133: invokevirtual getShort : ()S
    //   136: pop
    //   137: invokevirtual getClass : ()Ljava/lang/Class;
    //   140: pop
    //   141: getfield Ro : Lf/yy0;
    //   144: aload_1
    //   145: invokevirtual getInt : ()I
    //   148: pop
    //   149: invokevirtual getClass : ()Ljava/lang/Class;
    //   152: pop
    //   153: getfield Ro : Lf/yy0;
    //   156: aload_1
    //   157: invokevirtual getInt : ()I
    //   160: putfield RK0 : I
    //   163: getfield Ro : Lf/yy0;
    //   166: dup
    //   167: astore_3
    //   168: getfield RK0 : I
    //   171: dup
    //   172: istore #4
    //   174: ifeq -> 186
    //   177: iload #4
    //   179: aload_3
    //   180: getfield T80 : I
    //   183: if_icmple -> 197
    //   186: aload_3
    //   187: dup
    //   188: getfield T80 : I
    //   191: bipush #24
    //   193: isub
    //   194: putfield RK0 : I
    //   197: aload_0
    //   198: aload_1
    //   199: invokevirtual getInt : ()I
    //   202: istore_3
    //   203: getfield Ro : Lf/yy0;
    //   206: dup
    //   207: astore #4
    //   209: getfield Uu0 : Lf/I30;
    //   212: getstatic f/I30.bW : Lf/I30;
    //   215: if_acmpne -> 225
    //   218: bipush #16
    //   220: istore #5
    //   222: goto -> 230
    //   225: sipush #256
    //   228: istore #5
    //   230: aload #4
    //   232: dup
    //   233: iload #5
    //   235: putfield E2 : I
    //   238: getfield RK0 : I
    //   241: dup
    //   242: istore #6
    //   244: iconst_2
    //   245: idiv
    //   246: dup
    //   247: istore #7
    //   249: iload #5
    //   251: if_icmpge -> 261
    //   254: aload #4
    //   256: iload #7
    //   258: putfield E2 : I
    //   261: aload_1
    //   262: iload_2
    //   263: aload #4
    //   265: iload #6
    //   267: aload #4
    //   269: getfield E2 : I
    //   272: iconst_2
    //   273: imul
    //   274: idiv
    //   275: anewarray [Lf/ao;
    //   278: putfield nY : [[Lf/ao;
    //   281: bipush #24
    //   283: iadd
    //   284: iload_3
    //   285: iadd
    //   286: invokevirtual position : (I)Ljava/nio/Buffer;
    //   289: pop
    //   290: iconst_0
    //   291: istore_3
    //   292: iload_3
    //   293: aload_0
    //   294: getfield Ro : Lf/yy0;
    //   297: dup
    //   298: astore #4
    //   300: getfield nY : [[Lf/ao;
    //   303: dup
    //   304: astore #5
    //   306: arraylength
    //   307: if_icmpge -> 549
    //   310: aload #4
    //   312: getfield Uu0 : Lf/I30;
    //   315: getstatic f/I30.bW : Lf/I30;
    //   318: if_acmpne -> 328
    //   321: bipush #16
    //   323: istore #4
    //   325: goto -> 333
    //   328: sipush #256
    //   331: istore #4
    //   333: iload #4
    //   335: aload_1
    //   336: iload #4
    //   338: anewarray f/ao
    //   341: astore #4
    //   343: invokevirtual remaining : ()I
    //   346: iconst_2
    //   347: idiv
    //   348: invokestatic min : (II)I
    //   351: istore #6
    //   353: iconst_0
    //   354: istore #7
    //   356: iload #7
    //   358: iload #6
    //   360: if_icmpge -> 537
    //   363: aload_1
    //   364: invokevirtual getShort : ()S
    //   367: ldc 65535
    //   369: iand
    //   370: dup
    //   371: sipush #1024
    //   374: idiv
    //   375: i2b
    //   376: dup
    //   377: istore #8
    //   379: sipush #1024
    //   382: imul
    //   383: isub
    //   384: dup
    //   385: bipush #32
    //   387: idiv
    //   388: i2b
    //   389: dup
    //   390: istore #9
    //   392: bipush #32
    //   394: imul
    //   395: isub
    //   396: iconst_1
    //   397: idiv
    //   398: i2b
    //   399: dup
    //   400: istore #10
    //   402: bipush #31
    //   404: if_icmple -> 411
    //   407: bipush #31
    //   409: istore #10
    //   411: iload #9
    //   413: bipush #31
    //   415: if_icmple -> 422
    //   418: bipush #31
    //   420: istore #9
    //   422: iload #8
    //   424: bipush #31
    //   426: if_icmple -> 433
    //   429: bipush #31
    //   431: istore #8
    //   433: iload #7
    //   435: ifne -> 485
    //   438: aload #4
    //   440: new f/ao
    //   443: dup
    //   444: astore #11
    //   446: iload #8
    //   448: iload #9
    //   450: iload #10
    //   452: bipush #8
    //   454: imul
    //   455: istore #8
    //   457: bipush #8
    //   459: imul
    //   460: istore #9
    //   462: bipush #8
    //   464: imul
    //   465: istore #10
    //   467: iload #8
    //   469: iload #9
    //   471: iload #10
    //   473: iconst_0
    //   474: invokespecial <init> : (IIII)V
    //   477: iload #7
    //   479: aload #11
    //   481: aastore
    //   482: goto -> 531
    //   485: aload #4
    //   487: new f/ao
    //   490: dup
    //   491: astore #11
    //   493: iload #8
    //   495: iload #9
    //   497: iload #10
    //   499: bipush #8
    //   501: imul
    //   502: istore #8
    //   504: bipush #8
    //   506: imul
    //   507: istore #9
    //   509: bipush #8
    //   511: imul
    //   512: istore #10
    //   514: iload #8
    //   516: iload #9
    //   518: iload #10
    //   520: sipush #255
    //   523: invokespecial <init> : (IIII)V
    //   526: iload #7
    //   528: aload #11
    //   530: aastore
    //   531: iinc #7, 1
    //   534: goto -> 356
    //   537: aload #5
    //   539: iload_3
    //   540: aload #4
    //   542: aastore
    //   543: iinc #3, 1
    //   546: goto -> 292
    //   549: aload_0
    //   550: getfield Bx : Lf/FA0;
    //   553: getfield ua0 : S
    //   556: iconst_1
    //   557: if_icmpeq -> 769
    //   560: aload_1
    //   561: invokevirtual position : ()I
    //   564: iload_2
    //   565: isub
    //   566: aload_0
    //   567: getfield Vg0 : I
    //   570: if_icmplt -> 576
    //   573: goto -> 769
    //   576: aload_0
    //   577: dup
    //   578: dup
    //   579: dup2
    //   580: dup2
    //   581: aload_1
    //   582: aload_0
    //   583: getfield QL0 : Lf/D80;
    //   586: iconst_4
    //   587: newarray byte
    //   589: astore_2
    //   590: invokevirtual getClass : ()Ljava/lang/Class;
    //   593: pop
    //   594: aload_2
    //   595: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
    //   598: pop
    //   599: getfield QL0 : Lf/D80;
    //   602: aload_1
    //   603: invokevirtual getInt : ()I
    //   606: pop
    //   607: invokevirtual getClass : ()Ljava/lang/Class;
    //   610: pop
    //   611: getfield QL0 : Lf/D80;
    //   614: aload_1
    //   615: invokevirtual getShort : ()S
    //   618: pop
    //   619: invokevirtual getClass : ()Ljava/lang/Class;
    //   622: pop
    //   623: getfield QL0 : Lf/D80;
    //   626: aload_1
    //   627: invokevirtual getShort : ()S
    //   630: pop
    //   631: invokevirtual getClass : ()Ljava/lang/Class;
    //   634: pop
    //   635: getfield QL0 : Lf/D80;
    //   638: aload_1
    //   639: invokevirtual getInt : ()I
    //   642: pop
    //   643: invokevirtual getClass : ()Ljava/lang/Class;
    //   646: pop
    //   647: getfield QL0 : Lf/D80;
    //   650: aload_1
    //   651: invokevirtual getShort : ()S
    //   654: putfield Zw : S
    //   657: getfield QL0 : Lf/D80;
    //   660: getfield Zw : S
    //   663: istore_1
    //   664: getfield Ro : Lf/yy0;
    //   667: getfield nY : [[Lf/ao;
    //   670: dup
    //   671: astore_2
    //   672: iload_1
    //   673: aload_2
    //   674: arraylength
    //   675: iadd
    //   676: anewarray [Lf/ao;
    //   679: astore_1
    //   680: iconst_0
    //   681: istore_3
    //   682: arraylength
    //   683: istore #4
    //   685: iconst_0
    //   686: istore #5
    //   688: iload #5
    //   690: iload #4
    //   692: if_icmpge -> 724
    //   695: aload_1
    //   696: aload_0
    //   697: aload_2
    //   698: iload #5
    //   700: aaload
    //   701: astore #6
    //   703: getfield QL0 : Lf/D80;
    //   706: getfield Zw : S
    //   709: iload_3
    //   710: dup
    //   711: iconst_1
    //   712: iadd
    //   713: istore_3
    //   714: iadd
    //   715: aload #6
    //   717: aastore
    //   718: iinc #5, 1
    //   721: goto -> 688
    //   724: iconst_0
    //   725: istore_2
    //   726: iload_2
    //   727: aload_0
    //   728: getfield QL0 : Lf/D80;
    //   731: getfield Zw : S
    //   734: if_icmpge -> 755
    //   737: aload_1
    //   738: iload_2
    //   739: aload_0
    //   740: getfield Ro : Lf/yy0;
    //   743: getfield nY : [[Lf/ao;
    //   746: iconst_0
    //   747: aaload
    //   748: aastore
    //   749: iinc #2, 1
    //   752: goto -> 726
    //   755: aload_0
    //   756: aload_1
    //   757: aload_0
    //   758: getfield Ro : Lf/yy0;
    //   761: aload_1
    //   762: putfield nY : [[Lf/ao;
    //   765: putfield f0 : [[Lf/ao;
    //   768: return
    //   769: aload_0
    //   770: dup
    //   771: getfield Ro : Lf/yy0;
    //   774: getfield nY : [[Lf/ao;
    //   777: putfield f0 : [[Lf/ao;
    //   780: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 5
    //   #2	-> 15
    //   #3	-> 73
    //   #4	-> 100
    //   #5	-> 126
    //   #6	-> 315
    //   #7	-> 523
    //   #8	-> 530
    //   #9	-> 542
    //   #10	-> 765
    //   #11	-> 771
    //   #12	-> 777
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */