package f;

public final class uw extends e90 {
  public final int tg(m6 paramm6, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: iload_0
    //   3: iload #5
    //   5: if_icmpge -> 24
    //   8: aload #4
    //   10: iload_0
    //   11: iaload
    //   12: ifeq -> 18
    //   15: goto -> 24
    //   18: iinc #0, 1
    //   21: goto -> 2
    //   24: iload_0
    //   25: iload #5
    //   27: if_icmpne -> 32
    //   30: iconst_0
    //   31: ireturn
    //   32: aload_2
    //   33: ldc f/e90
    //   35: dup
    //   36: astore_0
    //   37: monitorenter
    //   38: checkcast f/Wu
    //   41: dup
    //   42: astore_2
    //   43: getfield vT : Lf/bC;
    //   46: dup
    //   47: astore #4
    //   49: aload_2
    //   50: aload #4
    //   52: getfield bF : I
    //   55: istore #6
    //   57: getfield K00 : Lf/tF0;
    //   60: getfield PR : I
    //   63: istore #7
    //   65: getfield vK : I
    //   68: aload #4
    //   70: getfield Oi : I
    //   73: isub
    //   74: iload #6
    //   76: idiv
    //   77: dup
    //   78: istore #8
    //   80: iload #7
    //   82: iadd
    //   83: iconst_1
    //   84: isub
    //   85: iload #7
    //   87: idiv
    //   88: istore #9
    //   90: getstatic f/e90.pZ : [[I
    //   93: dup
    //   94: astore #10
    //   96: ifnull -> 107
    //   99: aload #10
    //   101: arraylength
    //   102: iload #9
    //   104: if_icmpge -> 115
    //   107: iload #9
    //   109: anewarray [I
    //   112: putstatic f/e90.pZ : [[I
    //   115: iconst_0
    //   116: istore #9
    //   118: iload #9
    //   120: aload_2
    //   121: getfield hv : I
    //   124: if_icmpge -> 427
    //   127: iconst_0
    //   128: istore #10
    //   130: iconst_0
    //   131: istore #11
    //   133: iload #10
    //   135: iload #8
    //   137: if_icmpge -> 421
    //   140: iload #9
    //   142: ifne -> 194
    //   145: aload_2
    //   146: getfield K00 : Lf/tF0;
    //   149: aload_1
    //   150: getfield Nh : Lf/E7;
    //   153: invokevirtual rB : (Lf/E7;)I
    //   156: dup
    //   157: istore #12
    //   159: iconst_m1
    //   160: if_icmpne -> 166
    //   163: goto -> 427
    //   166: aload_2
    //   167: getstatic f/e90.pZ : [[I
    //   170: astore #13
    //   172: getfield oa : [[I
    //   175: iload #12
    //   177: aaload
    //   178: dup
    //   179: astore #12
    //   181: aload #13
    //   183: iload #11
    //   185: aload #12
    //   187: aastore
    //   188: ifnonnull -> 194
    //   191: goto -> 427
    //   194: iconst_0
    //   195: istore #12
    //   197: iload #12
    //   199: iload #7
    //   201: if_icmpge -> 415
    //   204: iload #10
    //   206: iload #8
    //   208: if_icmpge -> 415
    //   211: aload #4
    //   213: iload #10
    //   215: iload #6
    //   217: aload #4
    //   219: getfield Oi : I
    //   222: istore #13
    //   224: imul
    //   225: iload #13
    //   227: iadd
    //   228: istore #13
    //   230: getstatic f/e90.pZ : [[I
    //   233: iload #11
    //   235: aaload
    //   236: iload #12
    //   238: iaload
    //   239: istore #14
    //   241: getfield k7 : [I
    //   244: iload #14
    //   246: iaload
    //   247: iconst_1
    //   248: iload #9
    //   250: ishl
    //   251: iand
    //   252: ifeq -> 406
    //   255: aload_2
    //   256: getfield hc : [Lf/tF0;
    //   259: aload_2
    //   260: getfield T50 : [[I
    //   263: iload #14
    //   265: aaload
    //   266: iload #9
    //   268: iaload
    //   269: aaload
    //   270: dup
    //   271: astore #14
    //   273: ifnull -> 406
    //   276: iload #13
    //   278: iload #5
    //   280: aload_1
    //   281: getfield Nh : Lf/E7;
    //   284: astore #15
    //   286: iconst_0
    //   287: istore #16
    //   289: idiv
    //   290: istore #17
    //   292: iload #17
    //   294: iload #13
    //   296: iload #6
    //   298: iadd
    //   299: iload #5
    //   301: idiv
    //   302: if_icmpge -> 398
    //   305: aload #14
    //   307: aload #15
    //   309: invokevirtual rB : (Lf/E7;)I
    //   312: dup
    //   313: istore #18
    //   315: iconst_m1
    //   316: if_icmpne -> 323
    //   319: iconst_m1
    //   320: goto -> 399
    //   323: iload #18
    //   325: aload #14
    //   327: getfield PR : I
    //   330: imul
    //   331: istore #18
    //   333: iconst_0
    //   334: istore #19
    //   336: iload #19
    //   338: aload #14
    //   340: getfield PR : I
    //   343: if_icmpge -> 292
    //   346: iload #16
    //   348: iconst_1
    //   349: iadd
    //   350: dup
    //   351: istore #20
    //   353: iload #5
    //   355: aload_3
    //   356: iload #16
    //   358: aaload
    //   359: dup
    //   360: iload #17
    //   362: swap
    //   363: iload #17
    //   365: faload
    //   366: aload #14
    //   368: getfield eS : [F
    //   371: iload #18
    //   373: iload #19
    //   375: iadd
    //   376: faload
    //   377: fadd
    //   378: fastore
    //   379: if_icmpne -> 388
    //   382: iconst_0
    //   383: istore #20
    //   385: iinc #17, 1
    //   388: iinc #19, 1
    //   391: iload #20
    //   393: istore #16
    //   395: goto -> 336
    //   398: iconst_0
    //   399: iconst_m1
    //   400: if_icmpne -> 406
    //   403: goto -> 427
    //   406: iinc #12, 1
    //   409: iinc #10, 1
    //   412: goto -> 197
    //   415: iinc #11, 1
    //   418: goto -> 133
    //   421: iinc #9, 1
    //   424: goto -> 118
    //   427: aload_0
    //   428: monitorexit
    //   429: iconst_0
    //   430: ireturn
    //   431: aload_0
    //   432: monitorexit
    //   433: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 38
    //   #2	-> 289
    // Exception table:
    //   from	to	target	type
    //   38	41	431	finally
    //   43	46	431	finally
    //   49	55	431	finally
    //   57	63	431	finally
    //   65	73	431	finally
    //   74	77	431	finally
    //   85	88	431	finally
    //   90	93	431	finally
    //   99	102	431	finally
    //   107	115	431	finally
    //   118	124	431	finally
    //   145	156	431	finally
    //   166	170	431	finally
    //   172	178	431	finally
    //   181	188	431	finally
    //   211	222	431	finally
    //   230	239	431	finally
    //   241	247	431	finally
    //   255	270	431	finally
    //   276	284	431	finally
    //   289	290	431	finally
    //   299	302	431	finally
    //   305	312	431	finally
    //   323	330	431	finally
    //   336	343	431	finally
    //   353	359	431	finally
    //   360	371	431	finally
    //   376	377	431	finally
    //   378	379	431	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */