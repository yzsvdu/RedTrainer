package f;

public final class ix {
  public byte[] Qj;
  
  public int dQ;
  
  public int com9;
  
  public int yP;
  
  public int Xm0;
  
  public int pc0;
  
  public int nc;
  
  public UC0 m20 = new UC0();
  
  public byte[] oA0 = new byte[4];
  
  public final int Gp0() {
    int i = 512;
    int j;
    if ((j = this.yP) != 0) {
      this.com9 = k;
      int k;
      if ((k = this.com9 - j) > 0)
        System.arraycopy(this.Qj, j, this.Qj, 0, k); 
      this.yP = 0;
    } 
    if (i > this.dQ - (j = this.com9)) {
      i = i + j + 4096;
      byte[] arrayOfByte;
      if ((arrayOfByte = this.Qj) != null) {
        arrayOfByte = new byte[i];
        int k = arrayOfByte.length;
        System.arraycopy(arrayOfByte, 0, arrayOfByte, 0, k);
        this.Qj = arrayOfByte;
      } else {
        this.Qj = new byte[i];
      } 
      this.dQ = i;
    } 
    return this.com9;
  }
  
  public final int XN(UC0 paramUC0) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup
    //   3: getfield yP : I
    //   6: istore_2
    //   7: getfield com9 : I
    //   10: iload_2
    //   11: isub
    //   12: istore_3
    //   13: getfield pc0 : I
    //   16: ifne -> 247
    //   19: iload_3
    //   20: bipush #27
    //   22: if_icmpge -> 28
    //   25: goto -> 260
    //   28: aload_0
    //   29: getfield Qj : [B
    //   32: dup
    //   33: astore #4
    //   35: iload_2
    //   36: baload
    //   37: bipush #79
    //   39: if_icmpne -> 165
    //   42: aload #4
    //   44: iload_2
    //   45: iconst_1
    //   46: iadd
    //   47: baload
    //   48: bipush #103
    //   50: if_icmpne -> 165
    //   53: aload #4
    //   55: iload_2
    //   56: iconst_2
    //   57: iadd
    //   58: baload
    //   59: bipush #103
    //   61: if_icmpne -> 165
    //   64: aload #4
    //   66: iload_2
    //   67: iconst_3
    //   68: iadd
    //   69: baload
    //   70: bipush #83
    //   72: if_icmpeq -> 78
    //   75: goto -> 165
    //   78: iload_3
    //   79: aload #4
    //   81: iload_2
    //   82: bipush #26
    //   84: iadd
    //   85: dup
    //   86: istore #4
    //   88: baload
    //   89: sipush #255
    //   92: iand
    //   93: bipush #27
    //   95: iadd
    //   96: dup
    //   97: istore #5
    //   99: if_icmpge -> 105
    //   102: goto -> 260
    //   105: iconst_0
    //   106: istore #6
    //   108: iload #6
    //   110: aload_0
    //   111: getfield Qj : [B
    //   114: dup
    //   115: astore #7
    //   117: iload #4
    //   119: baload
    //   120: sipush #255
    //   123: iand
    //   124: if_icmpge -> 156
    //   127: aload_0
    //   128: dup
    //   129: getfield nc : I
    //   132: aload #7
    //   134: iload_2
    //   135: bipush #27
    //   137: iadd
    //   138: iload #6
    //   140: iadd
    //   141: baload
    //   142: sipush #255
    //   145: iand
    //   146: iadd
    //   147: putfield nc : I
    //   150: iinc #6, 1
    //   153: goto -> 108
    //   156: aload_0
    //   157: iload #5
    //   159: putfield pc0 : I
    //   162: goto -> 247
    //   165: aload_0
    //   166: dup
    //   167: iconst_0
    //   168: putfield pc0 : I
    //   171: iconst_0
    //   172: putfield nc : I
    //   175: iconst_0
    //   176: istore #4
    //   178: iconst_0
    //   179: istore #5
    //   181: iload #5
    //   183: iload_3
    //   184: iconst_1
    //   185: isub
    //   186: if_icmpge -> 221
    //   189: aload_0
    //   190: getfield Qj : [B
    //   193: iload_2
    //   194: iconst_1
    //   195: iadd
    //   196: iload #5
    //   198: iadd
    //   199: dup
    //   200: istore #6
    //   202: baload
    //   203: bipush #79
    //   205: if_icmpne -> 215
    //   208: iload #6
    //   210: istore #4
    //   212: goto -> 221
    //   215: iinc #5, 1
    //   218: goto -> 181
    //   221: iload #4
    //   223: ifne -> 232
    //   226: aload_0
    //   227: getfield com9 : I
    //   230: istore #4
    //   232: iload #4
    //   234: iload_2
    //   235: aload_0
    //   236: iload #4
    //   238: putfield yP : I
    //   241: isub
    //   242: ineg
    //   243: istore_2
    //   244: goto -> 636
    //   247: aload_0
    //   248: getfield nc : I
    //   251: aload_0
    //   252: getfield pc0 : I
    //   255: iadd
    //   256: iload_3
    //   257: if_icmple -> 265
    //   260: iconst_0
    //   261: istore_2
    //   262: goto -> 636
    //   265: aload_0
    //   266: dup
    //   267: dup
    //   268: dup2
    //   269: getfield oA0 : [B
    //   272: dup
    //   273: astore #4
    //   275: monitorenter
    //   276: getfield Qj : [B
    //   279: aload_0
    //   280: iload_2
    //   281: bipush #22
    //   283: iadd
    //   284: istore #5
    //   286: getfield oA0 : [B
    //   289: iload #5
    //   291: swap
    //   292: iconst_0
    //   293: iconst_4
    //   294: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   297: getfield Qj : [B
    //   300: dup
    //   301: dup
    //   302: dup2
    //   303: astore #6
    //   305: iload #5
    //   307: iconst_0
    //   308: bastore
    //   309: iload_2
    //   310: bipush #23
    //   312: iadd
    //   313: dup
    //   314: istore #7
    //   316: iconst_0
    //   317: bastore
    //   318: iload_2
    //   319: bipush #24
    //   321: iadd
    //   322: dup
    //   323: istore #8
    //   325: iconst_0
    //   326: bastore
    //   327: iload_2
    //   328: bipush #25
    //   330: iadd
    //   331: dup
    //   332: istore #9
    //   334: iconst_0
    //   335: bastore
    //   336: getfield m20 : Lf/UC0;
    //   339: dup
    //   340: dup
    //   341: astore #10
    //   343: aload_0
    //   344: aload #10
    //   346: iload_2
    //   347: aload #10
    //   349: aload #6
    //   351: aload #10
    //   353: aload_0
    //   354: aload #10
    //   356: iload_2
    //   357: aload #10
    //   359: aload #6
    //   361: putfield nS : [B
    //   364: putfield ZC0 : I
    //   367: getfield pc0 : I
    //   370: dup
    //   371: istore #6
    //   373: putfield GB : I
    //   376: putfield qV : [B
    //   379: iload #6
    //   381: iadd
    //   382: putfield vt0 : I
    //   385: getfield nc : I
    //   388: putfield ej0 : I
    //   391: invokevirtual n50 : ()V
    //   394: getfield oA0 : [B
    //   397: dup
    //   398: astore #6
    //   400: iconst_0
    //   401: baload
    //   402: aload_0
    //   403: getfield Qj : [B
    //   406: dup
    //   407: astore #10
    //   409: iload #5
    //   411: baload
    //   412: if_icmpne -> 543
    //   415: aload #6
    //   417: iconst_1
    //   418: baload
    //   419: aload #10
    //   421: iload #7
    //   423: baload
    //   424: if_icmpne -> 543
    //   427: aload #6
    //   429: iconst_2
    //   430: baload
    //   431: aload #10
    //   433: iload #8
    //   435: baload
    //   436: if_icmpne -> 543
    //   439: aload #6
    //   441: iconst_3
    //   442: baload
    //   443: aload #10
    //   445: iload #9
    //   447: baload
    //   448: if_icmpeq -> 454
    //   451: goto -> 543
    //   454: aload_1
    //   455: aload_0
    //   456: aload #4
    //   458: monitorexit
    //   459: getfield yP : I
    //   462: istore_2
    //   463: ifnull -> 508
    //   466: aload_1
    //   467: aload_0
    //   468: aload_1
    //   469: iload_2
    //   470: aload_1
    //   471: aload #10
    //   473: aload_1
    //   474: aload_0
    //   475: aload_1
    //   476: iload_2
    //   477: aload_1
    //   478: aload #10
    //   480: putfield nS : [B
    //   483: putfield ZC0 : I
    //   486: getfield pc0 : I
    //   489: dup
    //   490: istore_3
    //   491: putfield GB : I
    //   494: putfield qV : [B
    //   497: iload_3
    //   498: iadd
    //   499: putfield vt0 : I
    //   502: getfield nc : I
    //   505: putfield ej0 : I
    //   508: aload_0
    //   509: dup
    //   510: dup
    //   511: iload_2
    //   512: aload_0
    //   513: dup
    //   514: iconst_0
    //   515: putfield Xm0 : I
    //   518: getfield pc0 : I
    //   521: aload_0
    //   522: getfield nc : I
    //   525: iadd
    //   526: dup
    //   527: istore_2
    //   528: iadd
    //   529: putfield yP : I
    //   532: iconst_0
    //   533: putfield pc0 : I
    //   536: iconst_0
    //   537: putfield nc : I
    //   540: goto -> 636
    //   543: aload_0
    //   544: dup
    //   545: aload #6
    //   547: iconst_0
    //   548: aload #10
    //   550: iload #5
    //   552: iconst_4
    //   553: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   556: iconst_0
    //   557: putfield pc0 : I
    //   560: iconst_0
    //   561: putfield nc : I
    //   564: iconst_0
    //   565: istore #5
    //   567: iconst_0
    //   568: istore #6
    //   570: iload #6
    //   572: iload_3
    //   573: iconst_1
    //   574: isub
    //   575: if_icmpge -> 610
    //   578: aload_0
    //   579: getfield Qj : [B
    //   582: iload_2
    //   583: iconst_1
    //   584: iadd
    //   585: iload #6
    //   587: iadd
    //   588: dup
    //   589: istore #7
    //   591: baload
    //   592: bipush #79
    //   594: if_icmpne -> 604
    //   597: iload #7
    //   599: istore #5
    //   601: goto -> 610
    //   604: iinc #6, 1
    //   607: goto -> 570
    //   610: iload #5
    //   612: ifne -> 621
    //   615: aload_0
    //   616: getfield com9 : I
    //   619: istore #5
    //   621: aload #4
    //   623: iload #5
    //   625: iload_2
    //   626: aload_0
    //   627: iload #5
    //   629: putfield yP : I
    //   632: isub
    //   633: ineg
    //   634: istore_2
    //   635: monitorexit
    //   636: iload_2
    //   637: ifle -> 642
    //   640: iconst_1
    //   641: ireturn
    //   642: iload_2
    //   643: ifne -> 648
    //   646: iconst_0
    //   647: ireturn
    //   648: aload_0
    //   649: getfield Xm0 : I
    //   652: ifne -> 0
    //   655: aload_0
    //   656: iconst_1
    //   657: putfield Xm0 : I
    //   660: iconst_m1
    //   661: ireturn
    //   662: astore_0
    //   663: aload_0
    //   664: aload #4
    //   666: monitorexit
    //   667: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 3
    //   #2	-> 649
    //   #3	-> 666
    // Exception table:
    //   from	to	target	type
    //   276	279	662	finally
    //   286	300	662	finally
    //   305	309	662	finally
    //   316	318	662	finally
    //   325	327	662	finally
    //   334	339	662	finally
    //   343	370	662	finally
    //   373	379	662	finally
    //   382	397	662	finally
    //   400	406	662	finally
    //   409	412	662	finally
    //   415	424	662	finally
    //   427	436	662	finally
    //   439	448	662	finally
    //   454	459	662	finally
    //   548	564	662	finally
    //   578	582	662	finally
    //   591	592	662	finally
    //   615	619	662	finally
    //   621	632	662	finally
    //   635	636	662	finally
    //   663	667	662	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */