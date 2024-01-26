package f;

public final class TV extends YA0 {
  public TV(A paramA, Te paramTe, int paramInt) {}
  
  public final boolean i2(oa0 paramoa0) {
    // Byte code:
    //   0: aload_1
    //   1: getfield cz0 : I
    //   4: invokestatic Wm0 : (I)Z
    //   7: ifeq -> 285
    //   10: aload_1
    //   11: invokevirtual oO : ()Z
    //   14: ifeq -> 285
    //   17: aload_1
    //   18: aload_0
    //   19: getfield eE0 : Lf/A;
    //   22: getfield YD0 : [Lf/bh;
    //   25: aload_0
    //   26: getfield F6 : Lf/Te;
    //   29: getfield HC0 : B
    //   32: aaload
    //   33: astore_2
    //   34: getfield GG0 : I
    //   37: getstatic f/BM.Oq : Lf/BM;
    //   40: invokestatic J20 : (ILf/BM;)Z
    //   43: ifeq -> 62
    //   46: aload_2
    //   47: dup
    //   48: getfield hr0 : I
    //   51: aload_2
    //   52: getfield Wg0 : I
    //   55: iconst_1
    //   56: isub
    //   57: invokevirtual x10 : (II)V
    //   60: iconst_1
    //   61: ireturn
    //   62: aload_1
    //   63: getfield GG0 : I
    //   66: getstatic f/BM.M8 : Lf/BM;
    //   69: invokestatic J20 : (ILf/BM;)Z
    //   72: ifeq -> 91
    //   75: aload_2
    //   76: dup
    //   77: getfield hr0 : I
    //   80: aload_2
    //   81: getfield Wg0 : I
    //   84: iconst_1
    //   85: iadd
    //   86: invokevirtual x10 : (II)V
    //   89: iconst_1
    //   90: ireturn
    //   91: aload_1
    //   92: getfield GG0 : I
    //   95: getstatic f/BM.ni : Lf/BM;
    //   98: invokestatic J20 : (ILf/BM;)Z
    //   101: ifeq -> 138
    //   104: aload_2
    //   105: getfield hr0 : I
    //   108: dup
    //   109: istore_0
    //   110: ifgt -> 122
    //   113: aload_2
    //   114: getfield ur : Lf/p;
    //   117: invokevirtual Ev0 : ()V
    //   120: iconst_1
    //   121: ireturn
    //   122: aload_2
    //   123: dup
    //   124: iload_0
    //   125: iconst_1
    //   126: isub
    //   127: istore_0
    //   128: getfield Wg0 : I
    //   131: iload_0
    //   132: swap
    //   133: invokevirtual x10 : (II)V
    //   136: iconst_1
    //   137: ireturn
    //   138: aload_1
    //   139: getfield GG0 : I
    //   142: getstatic f/BM.N70 : Lf/BM;
    //   145: invokestatic J20 : (ILf/BM;)Z
    //   148: ifeq -> 170
    //   151: aload_2
    //   152: dup
    //   153: dup
    //   154: getfield hr0 : I
    //   157: iconst_1
    //   158: iadd
    //   159: istore_0
    //   160: getfield Wg0 : I
    //   163: iload_0
    //   164: swap
    //   165: invokevirtual x10 : (II)V
    //   168: iconst_1
    //   169: ireturn
    //   170: aload_1
    //   171: getfield GG0 : I
    //   174: getstatic f/BM.PW : Lf/BM;
    //   177: invokestatic J20 : (ILf/BM;)Z
    //   180: ifeq -> 213
    //   183: aload_2
    //   184: getfield Ag : S
    //   187: dup
    //   188: istore_1
    //   189: aload_0
    //   190: getfield GD : I
    //   193: bipush #10
    //   195: idiv
    //   196: if_icmplt -> 201
    //   199: iconst_1
    //   200: ireturn
    //   201: aload_2
    //   202: getfield oL0 : Lf/JA0;
    //   205: iload_1
    //   206: iconst_1
    //   207: iadd
    //   208: invokevirtual Vt0 : (I)V
    //   211: iconst_1
    //   212: ireturn
    //   213: aload_1
    //   214: getfield GG0 : I
    //   217: getstatic f/BM.fN : Lf/BM;
    //   220: invokestatic J20 : (ILf/BM;)Z
    //   223: ifeq -> 249
    //   226: aload_2
    //   227: getfield Ag : S
    //   230: dup
    //   231: istore_0
    //   232: ifgt -> 237
    //   235: iconst_1
    //   236: ireturn
    //   237: aload_2
    //   238: getfield oL0 : Lf/JA0;
    //   241: iload_0
    //   242: iconst_1
    //   243: isub
    //   244: invokevirtual Vt0 : (I)V
    //   247: iconst_1
    //   248: ireturn
    //   249: aload_1
    //   250: getfield GG0 : I
    //   253: getstatic f/BM.lc : Lf/BM;
    //   256: invokestatic J20 : (ILf/BM;)Z
    //   259: ifeq -> 285
    //   262: aload_0
    //   263: dup
    //   264: getfield eE0 : Lf/A;
    //   267: getfield sr : Lf/Vq0;
    //   270: invokevirtual xI0 : ()V
    //   273: getfield eE0 : Lf/A;
    //   276: getfield sr : Lf/Vq0;
    //   279: invokestatic c90 : (Lf/JG0;)Z
    //   282: pop
    //   283: iconst_1
    //   284: ireturn
    //   285: aload_0
    //   286: aload_1
    //   287: invokespecial i2 : (Lf/oa0;)Z
    //   290: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 4
    //   #3	-> 11
    //   #4	-> 29
    //   #5	-> 32
    //   #6	-> 34
    //   #7	-> 37
    //   #8	-> 48
    //   #9	-> 52
    //   #10	-> 57
    //   #11	-> 63
    //   #12	-> 66
    //   #13	-> 77
    //   #14	-> 81
    //   #15	-> 86
    //   #16	-> 92
    //   #17	-> 95
    //   #18	-> 105
    //   #19	-> 114
    //   #20	-> 128
    //   #21	-> 133
    //   #22	-> 139
    //   #23	-> 142
    //   #24	-> 154
    //   #25	-> 160
    //   #26	-> 165
    //   #27	-> 171
    //   #28	-> 174
    //   #29	-> 184
    //   #30	-> 190
    //   #31	-> 202
    //   #32	-> 208
    //   #33	-> 214
    //   #34	-> 217
    //   #35	-> 227
    //   #36	-> 238
    //   #37	-> 244
    //   #38	-> 250
    //   #39	-> 253
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */