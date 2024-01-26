package f;

public final class WK0 extends GS implements Np0 {
  public final byte lf;
  
  public WK0(byte paramByte) {
    this.lf = paramByte;
  }
  
  public final byte YG0() {
    return 32;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield lf : B
    //   4: tableswitch default -> 36, 0 -> 226, 1 -> 179, 2 -> 86, 3 -> 39
    //   36: goto -> 273
    //   39: aload #7
    //   41: dup
    //   42: getstatic f/F40.ef0 : Lf/F40;
    //   45: astore_0
    //   46: bipush #14
    //   48: istore_1
    //   49: getfield AD : Lf/Gp0;
    //   52: sipush #339
    //   55: aload_2
    //   56: invokevirtual ex : (ILf/hm0;)I
    //   59: istore_3
    //   60: iconst_1
    //   61: anewarray java/lang/String
    //   64: dup
    //   65: astore #4
    //   67: aload_2
    //   68: invokevirtual fA : ()Ljava/lang/String;
    //   71: iconst_0
    //   72: swap
    //   73: aastore
    //   74: iconst_2
    //   75: aload_0
    //   76: iload_1
    //   77: iload_3
    //   78: aload #4
    //   80: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   83: goto -> 270
    //   86: aload #7
    //   88: dup
    //   89: dup
    //   90: getstatic f/F40.ef0 : Lf/F40;
    //   93: astore_0
    //   94: bipush #14
    //   96: istore_3
    //   97: getfield AD : Lf/Gp0;
    //   100: sipush #333
    //   103: aload_2
    //   104: invokevirtual ex : (ILf/hm0;)I
    //   107: istore #4
    //   109: iconst_2
    //   110: anewarray java/lang/String
    //   113: dup
    //   114: astore #5
    //   116: aload_1
    //   117: aload #5
    //   119: aload_2
    //   120: invokevirtual fA : ()Ljava/lang/String;
    //   123: iconst_0
    //   124: swap
    //   125: aastore
    //   126: invokevirtual fA : ()Ljava/lang/String;
    //   129: iconst_1
    //   130: swap
    //   131: aastore
    //   132: iconst_2
    //   133: aload_0
    //   134: iload_3
    //   135: iload #4
    //   137: aload #5
    //   139: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   142: invokevirtual cr : (Ljava/lang/String;)V
    //   145: new f/LV
    //   148: dup
    //   149: astore_0
    //   150: new f/lF
    //   153: dup
    //   154: aload_2
    //   155: swap
    //   156: aload_2
    //   157: invokespecial <init> : (Lf/hm0;)V
    //   160: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   163: iconst_0
    //   164: swap
    //   165: invokespecial <init> : (BLf/wb;)V
    //   168: getfield YP : Ljava/util/LinkedList;
    //   171: aload_0
    //   172: invokevirtual add : (Ljava/lang/Object;)Z
    //   175: pop
    //   176: goto -> 273
    //   179: aload #7
    //   181: dup
    //   182: getstatic f/F40.ef0 : Lf/F40;
    //   185: astore_0
    //   186: bipush #14
    //   188: istore_1
    //   189: getfield AD : Lf/Gp0;
    //   192: sipush #336
    //   195: aload_2
    //   196: invokevirtual ex : (ILf/hm0;)I
    //   199: istore_3
    //   200: iconst_1
    //   201: anewarray java/lang/String
    //   204: dup
    //   205: astore #4
    //   207: aload_2
    //   208: invokevirtual fA : ()Ljava/lang/String;
    //   211: iconst_0
    //   212: swap
    //   213: aastore
    //   214: iconst_2
    //   215: aload_0
    //   216: iload_1
    //   217: iload_3
    //   218: aload #4
    //   220: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   223: goto -> 270
    //   226: aload #7
    //   228: dup
    //   229: getstatic f/F40.ef0 : Lf/F40;
    //   232: astore_0
    //   233: bipush #14
    //   235: istore_1
    //   236: getfield AD : Lf/Gp0;
    //   239: sipush #327
    //   242: aload_2
    //   243: invokevirtual ex : (ILf/hm0;)I
    //   246: istore_3
    //   247: iconst_1
    //   248: anewarray java/lang/String
    //   251: dup
    //   252: astore #4
    //   254: aload_2
    //   255: invokevirtual fA : ()Ljava/lang/String;
    //   258: iconst_0
    //   259: swap
    //   260: aastore
    //   261: iconst_2
    //   262: aload_0
    //   263: iload_1
    //   264: iload_3
    //   265: aload #4
    //   267: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   270: invokevirtual cr : (Ljava/lang/String;)V
    //   273: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 42
    //   #3	-> 49
    //   #4	-> 56
    //   #5	-> 80
    //   #6	-> 90
    //   #7	-> 97
    //   #8	-> 104
    //   #9	-> 139
    //   #10	-> 142
    //   #11	-> 168
    //   #12	-> 182
    //   #13	-> 189
    //   #14	-> 196
    //   #15	-> 220
    //   #16	-> 229
    //   #17	-> 236
    //   #18	-> 243
    //   #19	-> 267
    //   #20	-> 270
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */