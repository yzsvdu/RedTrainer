package f;

public final class cB extends GS implements Np0 {
  public final byte jE;
  
  public cB(byte paramByte) {
    this.jE = paramByte;
  }
  
  public final byte YG0() {
    return 48;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield jE : B
    //   4: tableswitch default -> 40, 0 -> 255, 1 -> 208, 2 -> 161, 3 -> 114, 4 -> 43
    //   40: goto -> 302
    //   43: aload #7
    //   45: dup
    //   46: dup
    //   47: getstatic f/F40.ef0 : Lf/F40;
    //   50: astore_0
    //   51: bipush #14
    //   53: istore_1
    //   54: getfield AD : Lf/Gp0;
    //   57: sipush #706
    //   60: aload_2
    //   61: invokevirtual ex : (ILf/hm0;)I
    //   64: istore_3
    //   65: iconst_1
    //   66: anewarray java/lang/String
    //   69: dup
    //   70: astore #4
    //   72: aload_2
    //   73: invokevirtual fA : ()Ljava/lang/String;
    //   76: iconst_0
    //   77: swap
    //   78: aastore
    //   79: iconst_2
    //   80: aload_0
    //   81: iload_1
    //   82: iload_3
    //   83: aload #4
    //   85: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   88: invokevirtual Kq : (Ljava/lang/String;)V
    //   91: new f/rd
    //   94: dup
    //   95: astore_0
    //   96: aload #7
    //   98: aload_2
    //   99: iconst_0
    //   100: invokespecial <init> : (Lf/kf;Lf/hm0;B)V
    //   103: getfield YP : Ljava/util/LinkedList;
    //   106: aload_0
    //   107: invokevirtual add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 302
    //   114: aload #7
    //   116: dup
    //   117: getstatic f/F40.ef0 : Lf/F40;
    //   120: astore_0
    //   121: bipush #14
    //   123: istore_1
    //   124: getfield AD : Lf/Gp0;
    //   127: sipush #712
    //   130: aload_2
    //   131: invokevirtual ex : (ILf/hm0;)I
    //   134: istore_3
    //   135: iconst_1
    //   136: anewarray java/lang/String
    //   139: dup
    //   140: astore #4
    //   142: aload_2
    //   143: invokevirtual fA : ()Ljava/lang/String;
    //   146: iconst_0
    //   147: swap
    //   148: aastore
    //   149: iconst_2
    //   150: aload_0
    //   151: iload_1
    //   152: iload_3
    //   153: aload #4
    //   155: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   158: goto -> 299
    //   161: aload #7
    //   163: dup
    //   164: getstatic f/F40.ef0 : Lf/F40;
    //   167: astore_0
    //   168: bipush #14
    //   170: istore_2
    //   171: getfield AD : Lf/Gp0;
    //   174: sipush #718
    //   177: aload_1
    //   178: invokevirtual ex : (ILf/hm0;)I
    //   181: istore_3
    //   182: iconst_1
    //   183: anewarray java/lang/String
    //   186: dup
    //   187: astore #4
    //   189: aload_1
    //   190: invokevirtual fA : ()Ljava/lang/String;
    //   193: iconst_0
    //   194: swap
    //   195: aastore
    //   196: iconst_2
    //   197: aload_0
    //   198: iload_2
    //   199: iload_3
    //   200: aload #4
    //   202: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   205: goto -> 299
    //   208: aload #7
    //   210: dup
    //   211: getstatic f/F40.ef0 : Lf/F40;
    //   214: astore_0
    //   215: bipush #14
    //   217: istore_2
    //   218: getfield AD : Lf/Gp0;
    //   221: sipush #715
    //   224: aload_1
    //   225: invokevirtual ex : (ILf/hm0;)I
    //   228: istore_3
    //   229: iconst_1
    //   230: anewarray java/lang/String
    //   233: dup
    //   234: astore #4
    //   236: aload_1
    //   237: invokevirtual fA : ()Ljava/lang/String;
    //   240: iconst_0
    //   241: swap
    //   242: aastore
    //   243: iconst_2
    //   244: aload_0
    //   245: iload_2
    //   246: iload_3
    //   247: aload #4
    //   249: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   252: goto -> 299
    //   255: aload #7
    //   257: dup
    //   258: getstatic f/F40.ef0 : Lf/F40;
    //   261: astore_0
    //   262: bipush #14
    //   264: istore_2
    //   265: getfield AD : Lf/Gp0;
    //   268: sipush #703
    //   271: aload_1
    //   272: invokevirtual ex : (ILf/hm0;)I
    //   275: istore_3
    //   276: iconst_1
    //   277: anewarray java/lang/String
    //   280: dup
    //   281: astore #4
    //   283: aload_1
    //   284: invokevirtual fA : ()Ljava/lang/String;
    //   287: iconst_0
    //   288: swap
    //   289: aastore
    //   290: iconst_2
    //   291: aload_0
    //   292: iload_2
    //   293: iload_3
    //   294: aload #4
    //   296: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   299: invokevirtual Kq : (Ljava/lang/String;)V
    //   302: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 47
    //   #3	-> 54
    //   #4	-> 61
    //   #5	-> 85
    //   #6	-> 88
    //   #7	-> 103
    //   #8	-> 117
    //   #9	-> 124
    //   #10	-> 131
    //   #11	-> 155
    //   #12	-> 164
    //   #13	-> 171
    //   #14	-> 178
    //   #15	-> 202
    //   #16	-> 211
    //   #17	-> 218
    //   #18	-> 225
    //   #19	-> 249
    //   #20	-> 258
    //   #21	-> 265
    //   #22	-> 272
    //   #23	-> 296
    //   #24	-> 299
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */