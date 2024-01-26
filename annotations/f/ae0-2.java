package f;

import org.lwjgl.glfw.GLFWMouseButtonCallback;

public final class ae0 extends GLFWMouseButtonCallback {
  public ae0(aY paramaY) {}
  
  public final void invoke(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 9
    //   4: iconst_0
    //   5: istore_1
    //   6: goto -> 51
    //   9: iload_3
    //   10: iconst_1
    //   11: if_icmpne -> 19
    //   14: iconst_1
    //   15: istore_1
    //   16: goto -> 51
    //   19: iload_3
    //   20: iconst_2
    //   21: if_icmpne -> 29
    //   24: iconst_2
    //   25: istore_1
    //   26: goto -> 51
    //   29: iload_3
    //   30: iconst_3
    //   31: if_icmpne -> 39
    //   34: iconst_3
    //   35: istore_1
    //   36: goto -> 51
    //   39: iload_3
    //   40: iconst_4
    //   41: if_icmpne -> 49
    //   44: iconst_4
    //   45: istore_1
    //   46: goto -> 51
    //   49: iconst_m1
    //   50: istore_1
    //   51: iload_3
    //   52: iconst_m1
    //   53: if_icmpeq -> 62
    //   56: iload_1
    //   57: iconst_m1
    //   58: if_icmpne -> 62
    //   61: return
    //   62: iload #4
    //   64: invokestatic nanoTime : ()J
    //   67: lstore_2
    //   68: iconst_1
    //   69: if_icmpne -> 187
    //   72: aload_0
    //   73: dup
    //   74: getfield Wd : Lf/aY;
    //   77: dup
    //   78: dup
    //   79: dup2
    //   80: getfield nh : I
    //   83: iconst_1
    //   84: iadd
    //   85: putfield nh : I
    //   88: iconst_1
    //   89: putfield in : Z
    //   92: getfield Rw : [Z
    //   95: iload_1
    //   96: iconst_1
    //   97: bastore
    //   98: getfield jF0 : Lf/MJ0;
    //   101: getfield Ai : Lf/w70;
    //   104: getfield AW : Lf/MJ0;
    //   107: invokevirtual df0 : ()V
    //   110: getfield Wd : Lf/aY;
    //   113: dup
    //   114: astore_0
    //   115: getfield hl0 : Lf/Td0;
    //   118: dup
    //   119: dup
    //   120: dup2
    //   121: dup2
    //   122: astore #4
    //   124: lload_2
    //   125: aload #4
    //   127: dup
    //   128: aload_0
    //   129: dup
    //   130: getfield XK0 : I
    //   133: istore_0
    //   134: getfield ol : I
    //   137: istore_2
    //   138: iconst_0
    //   139: istore_3
    //   140: monitorenter
    //   141: getfield Ou : Lf/o0;
    //   144: iconst_3
    //   145: invokevirtual oU : (I)V
    //   148: invokevirtual Jo0 : (J)V
    //   151: getfield Ou : Lf/o0;
    //   154: iload_0
    //   155: invokevirtual oU : (I)V
    //   158: getfield Ou : Lf/o0;
    //   161: iload_2
    //   162: invokevirtual oU : (I)V
    //   165: getfield Ou : Lf/o0;
    //   168: iload_3
    //   169: invokevirtual oU : (I)V
    //   172: getfield Ou : Lf/o0;
    //   175: iload_1
    //   176: invokevirtual oU : (I)V
    //   179: monitorexit
    //   180: goto -> 294
    //   183: aload #4
    //   185: monitorexit
    //   186: athrow
    //   187: aload_0
    //   188: dup
    //   189: dup
    //   190: getfield Wd : Lf/aY;
    //   193: dup
    //   194: getfield nh : I
    //   197: iconst_1
    //   198: isub
    //   199: iconst_0
    //   200: swap
    //   201: invokestatic max : (II)I
    //   204: putfield nh : I
    //   207: getfield Wd : Lf/aY;
    //   210: getfield jF0 : Lf/MJ0;
    //   213: getfield Ai : Lf/w70;
    //   216: getfield AW : Lf/MJ0;
    //   219: invokevirtual df0 : ()V
    //   222: getfield Wd : Lf/aY;
    //   225: dup
    //   226: astore_0
    //   227: getfield hl0 : Lf/Td0;
    //   230: dup
    //   231: dup
    //   232: dup2
    //   233: dup2
    //   234: astore #4
    //   236: lload_2
    //   237: aload #4
    //   239: dup
    //   240: aload_0
    //   241: dup
    //   242: getfield XK0 : I
    //   245: istore_0
    //   246: getfield ol : I
    //   249: istore_2
    //   250: iconst_0
    //   251: istore_3
    //   252: monitorenter
    //   253: getfield Ou : Lf/o0;
    //   256: iconst_4
    //   257: invokevirtual oU : (I)V
    //   260: invokevirtual Jo0 : (J)V
    //   263: getfield Ou : Lf/o0;
    //   266: iload_0
    //   267: invokevirtual oU : (I)V
    //   270: getfield Ou : Lf/o0;
    //   273: iload_2
    //   274: invokevirtual oU : (I)V
    //   277: getfield Ou : Lf/o0;
    //   280: iload_3
    //   281: invokevirtual oU : (I)V
    //   284: getfield Ou : Lf/o0;
    //   287: iload_1
    //   288: invokevirtual oU : (I)V
    //   291: goto -> 179
    //   294: return
    //   295: aload #4
    //   297: monitorexit
    //   298: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 101
    //   #2	-> 104
    //   #3	-> 107
    //   #4	-> 110
    //   #5	-> 141
    //   #6	-> 190
    //   #7	-> 213
    //   #8	-> 216
    //   #9	-> 219
    //   #10	-> 222
    //   #11	-> 253
    // Exception table:
    //   from	to	target	type
    //   141	179	183	finally
    //   253	294	295	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ae0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */