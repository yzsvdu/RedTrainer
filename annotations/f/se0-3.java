package f;

import org.lwjgl.glfw.GLFWCursorPosCallback;

public final class se0 extends GLFWCursorPosCallback {
  public se0(aY paramaY) {}
  
  public final void invoke(long paramLong, double paramDouble1, double paramDouble2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield UB0 : Lf/aY;
    //   4: dup
    //   5: dup2
    //   6: astore_1
    //   7: dload #5
    //   9: aload_1
    //   10: dload_3
    //   11: d2i
    //   12: istore_1
    //   13: invokevirtual getClass : ()Ljava/lang/Class;
    //   16: pop
    //   17: d2i
    //   18: istore_2
    //   19: iload_1
    //   20: putfield XK0 : I
    //   23: iload_2
    //   24: putfield ol : I
    //   27: getfield jF0 : Lf/MJ0;
    //   30: dup
    //   31: astore_1
    //   32: getfield oA0 : Lf/fa;
    //   35: getfield rv0 : Lf/nQ;
    //   38: getstatic f/nQ.gh : Lf/nQ;
    //   41: if_acmpne -> 129
    //   44: aload_0
    //   45: dup
    //   46: aload_1
    //   47: getfield Ai : Lf/w70;
    //   50: getfield sL : I
    //   53: i2f
    //   54: aload_0
    //   55: getfield UB0 : Lf/aY;
    //   58: getfield jF0 : Lf/MJ0;
    //   61: getfield Ai : Lf/w70;
    //   64: getfield m : I
    //   67: i2f
    //   68: fdiv
    //   69: fstore_1
    //   70: getfield UB0 : Lf/aY;
    //   73: getfield jF0 : Lf/MJ0;
    //   76: getfield Ai : Lf/w70;
    //   79: getfield kL : I
    //   82: i2f
    //   83: aload_0
    //   84: getfield UB0 : Lf/aY;
    //   87: getfield jF0 : Lf/MJ0;
    //   90: getfield Ai : Lf/w70;
    //   93: getfield uD : I
    //   96: i2f
    //   97: fdiv
    //   98: fstore_2
    //   99: getfield UB0 : Lf/aY;
    //   102: dup
    //   103: dup
    //   104: dup2
    //   105: invokevirtual getClass : ()Ljava/lang/Class;
    //   108: pop
    //   109: getfield XK0 : I
    //   112: i2f
    //   113: fload_1
    //   114: fmul
    //   115: f2i
    //   116: putfield XK0 : I
    //   119: getfield ol : I
    //   122: i2f
    //   123: fload_2
    //   124: fmul
    //   125: f2i
    //   126: putfield ol : I
    //   129: aload_0
    //   130: dup
    //   131: getfield UB0 : Lf/aY;
    //   134: getfield jF0 : Lf/MJ0;
    //   137: getfield Ai : Lf/w70;
    //   140: getfield AW : Lf/MJ0;
    //   143: invokevirtual df0 : ()V
    //   146: invokestatic nanoTime : ()J
    //   149: lstore_0
    //   150: getfield UB0 : Lf/aY;
    //   153: dup
    //   154: astore_2
    //   155: getfield nh : I
    //   158: ifle -> 291
    //   161: aload_2
    //   162: getfield hl0 : Lf/Td0;
    //   165: dup
    //   166: dup
    //   167: astore_3
    //   168: aload_2
    //   169: dup
    //   170: getfield XK0 : I
    //   173: istore_2
    //   174: getfield ol : I
    //   177: istore #4
    //   179: iconst_0
    //   180: istore #5
    //   182: monitorenter
    //   183: iconst_5
    //   184: iconst_0
    //   185: swap
    //   186: swap
    //   187: invokevirtual Pg : (II)I
    //   190: istore #6
    //   192: iload #6
    //   194: iflt -> 247
    //   197: aload_3
    //   198: getfield Ou : Lf/o0;
    //   201: iload #6
    //   203: iconst_5
    //   204: iadd
    //   205: invokevirtual Vl : (I)I
    //   208: ifne -> 233
    //   211: aload_3
    //   212: dup
    //   213: getfield Ou : Lf/o0;
    //   216: iload #6
    //   218: iconst_m1
    //   219: invokevirtual X60 : (II)V
    //   222: getfield Ou : Lf/o0;
    //   225: iload #6
    //   227: iconst_3
    //   228: iadd
    //   229: iconst_3
    //   230: invokevirtual X60 : (II)V
    //   233: aload_3
    //   234: iload #6
    //   236: bipush #6
    //   238: iadd
    //   239: iconst_5
    //   240: swap
    //   241: invokevirtual Pg : (II)I
    //   244: goto -> 190
    //   247: aload_3
    //   248: dup
    //   249: dup2
    //   250: lload_0
    //   251: aload_3
    //   252: getfield Ou : Lf/o0;
    //   255: iconst_5
    //   256: invokevirtual oU : (I)V
    //   259: invokevirtual Jo0 : (J)V
    //   262: getfield Ou : Lf/o0;
    //   265: iload_2
    //   266: invokevirtual oU : (I)V
    //   269: getfield Ou : Lf/o0;
    //   272: iload #4
    //   274: invokevirtual oU : (I)V
    //   277: getfield Ou : Lf/o0;
    //   280: iload #5
    //   282: invokevirtual oU : (I)V
    //   285: goto -> 392
    //   288: aload_3
    //   289: monitorexit
    //   290: athrow
    //   291: aload_2
    //   292: getfield hl0 : Lf/Td0;
    //   295: dup
    //   296: dup
    //   297: astore_3
    //   298: aload_2
    //   299: dup
    //   300: getfield XK0 : I
    //   303: istore_2
    //   304: getfield ol : I
    //   307: istore #4
    //   309: monitorenter
    //   310: bipush #6
    //   312: iconst_0
    //   313: swap
    //   314: swap
    //   315: invokevirtual Pg : (II)I
    //   318: istore #5
    //   320: iload #5
    //   322: iflt -> 361
    //   325: aload_3
    //   326: dup
    //   327: dup
    //   328: getfield Ou : Lf/o0;
    //   331: iload #5
    //   333: iconst_m1
    //   334: invokevirtual X60 : (II)V
    //   337: getfield Ou : Lf/o0;
    //   340: iload #5
    //   342: iconst_3
    //   343: iadd
    //   344: iconst_2
    //   345: invokevirtual X60 : (II)V
    //   348: iload #5
    //   350: iconst_5
    //   351: iadd
    //   352: bipush #6
    //   354: swap
    //   355: invokevirtual Pg : (II)I
    //   358: goto -> 318
    //   361: aload_3
    //   362: dup
    //   363: dup
    //   364: lload_0
    //   365: aload_3
    //   366: getfield Ou : Lf/o0;
    //   369: bipush #6
    //   371: invokevirtual oU : (I)V
    //   374: invokevirtual Jo0 : (J)V
    //   377: getfield Ou : Lf/o0;
    //   380: iload_2
    //   381: invokevirtual oU : (I)V
    //   384: getfield Ou : Lf/o0;
    //   387: iload #4
    //   389: invokevirtual oU : (I)V
    //   392: aload_3
    //   393: monitorexit
    //   394: return
    //   395: aload_3
    //   396: monitorexit
    //   397: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 32
    //   #2	-> 35
    //   #3	-> 47
    //   #4	-> 50
    //   #5	-> 55
    //   #6	-> 61
    //   #7	-> 64
    //   #8	-> 70
    //   #9	-> 76
    //   #10	-> 79
    //   #11	-> 84
    //   #12	-> 90
    //   #13	-> 93
    //   #14	-> 99
    //   #15	-> 137
    //   #16	-> 140
    //   #17	-> 143
    //   #18	-> 146
    //   #19	-> 187
    //   #20	-> 292
    //   #21	-> 315
    //   #22	-> 393
    //   #23	-> 396
    // Exception table:
    //   from	to	target	type
    //   185	190	288	finally
    //   197	201	288	finally
    //   205	208	288	finally
    //   211	225	288	finally
    //   229	233	288	finally
    //   239	288	288	finally
    //   313	318	395	finally
    //   325	340	395	finally
    //   344	348	395	finally
    //   352	392	395	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/se0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */