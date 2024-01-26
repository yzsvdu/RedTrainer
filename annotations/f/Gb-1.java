package f;

public final class Gb extends GS implements Np0 {
  public mJ hD;
  
  public byte KI0;
  
  public boolean eg0;
  
  public Gb(mJ parammJ, byte paramByte, boolean paramBoolean) {
    this.hD = parammJ;
    this.KI0 = paramByte;
    this.eg0 = paramBoolean;
  }
  
  public final byte YG0() {
    return 97;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload #7
    //   2: getfield AD : Lf/Gp0;
    //   5: dup
    //   6: astore_1
    //   7: aload_0
    //   8: getfield hD : Lf/mJ;
    //   11: dup
    //   12: getfield FI0 : B
    //   15: istore_2
    //   16: getfield md : B
    //   19: iload_2
    //   20: swap
    //   21: invokevirtual N0 : (BB)Lf/hm0;
    //   24: dup
    //   25: astore_2
    //   26: ifnull -> 238
    //   29: aload_2
    //   30: getfield K0 : Lf/jd0;
    //   33: invokevirtual AL : ()Z
    //   36: ifeq -> 42
    //   39: goto -> 238
    //   42: aload_0
    //   43: aload #7
    //   45: aload_1
    //   46: aload_0
    //   47: dup
    //   48: getfield hD : Lf/mJ;
    //   51: getfield FI0 : B
    //   54: istore_3
    //   55: getfield KI0 : B
    //   58: iload_3
    //   59: swap
    //   60: invokevirtual N0 : (BB)Lf/hm0;
    //   63: astore_3
    //   64: new f/gP
    //   67: dup
    //   68: astore #4
    //   70: aload_0
    //   71: aload #7
    //   73: aload_2
    //   74: aload_3
    //   75: invokespecial <init> : (Lf/Gb;Lf/kf;Lf/hm0;Lf/hm0;)V
    //   78: getfield YP : Ljava/util/LinkedList;
    //   81: aload #4
    //   83: invokevirtual add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: getfield eg0 : Z
    //   90: ifeq -> 237
    //   93: aload_1
    //   94: getfield rx : Lf/ky;
    //   97: getstatic f/ky.hI0 : Lf/ky;
    //   100: if_acmpne -> 164
    //   103: aload_0
    //   104: getfield KI0 : B
    //   107: iconst_1
    //   108: if_icmpne -> 164
    //   111: aload #7
    //   113: aload_1
    //   114: getstatic f/km.pm0 : Lf/VD0;
    //   117: iconst_2
    //   118: sipush #1403
    //   121: invokevirtual bL : (BS)V
    //   124: getstatic f/F40.ef0 : Lf/F40;
    //   127: astore_0
    //   128: sipush #231
    //   131: aload_2
    //   132: invokevirtual ex : (ILf/hm0;)I
    //   135: istore_1
    //   136: iconst_1
    //   137: anewarray java/lang/String
    //   140: dup
    //   141: astore_3
    //   142: aload_2
    //   143: invokevirtual I9 : ()Ljava/lang/String;
    //   146: iconst_0
    //   147: swap
    //   148: aastore
    //   149: iconst_2
    //   150: aload_0
    //   151: bipush #14
    //   153: iload_1
    //   154: aload_3
    //   155: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   158: invokevirtual Kq : (Ljava/lang/String;)V
    //   161: goto -> 237
    //   164: aload_3
    //   165: ifnull -> 222
    //   168: aload #7
    //   170: aload_1
    //   171: getstatic f/F40.ef0 : Lf/F40;
    //   174: astore_0
    //   175: sipush #1137
    //   178: aload_2
    //   179: invokevirtual ex : (ILf/hm0;)I
    //   182: istore_1
    //   183: iconst_2
    //   184: anewarray java/lang/String
    //   187: dup
    //   188: astore #4
    //   190: aload_3
    //   191: aload #4
    //   193: aload_2
    //   194: invokevirtual I9 : ()Ljava/lang/String;
    //   197: iconst_0
    //   198: swap
    //   199: aastore
    //   200: invokevirtual I9 : ()Ljava/lang/String;
    //   203: iconst_1
    //   204: swap
    //   205: aastore
    //   206: iconst_2
    //   207: aload_0
    //   208: bipush #14
    //   210: iload_1
    //   211: aload #4
    //   213: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   216: invokevirtual Kq : (Ljava/lang/String;)V
    //   219: goto -> 237
    //   222: aload #7
    //   224: aload_2
    //   225: invokevirtual I9 : ()Ljava/lang/String;
    //   228: ldc 200364
    //   230: swap
    //   231: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   234: invokevirtual Kq : (Ljava/lang/String;)V
    //   237: return
    //   238: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 2
    //   #2	-> 8
    //   #3	-> 12
    //   #4	-> 16
    //   #5	-> 21
    //   #6	-> 30
    //   #7	-> 48
    //   #8	-> 51
    //   #9	-> 55
    //   #10	-> 78
    //   #11	-> 87
    //   #12	-> 94
    //   #13	-> 97
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */