package f;

public final class hA0 extends SI0 {
  public final mJ Zm0;
  
  public final hm0 Ub;
  
  public hA0(hm0 paramhm0, mJ parammJ) {
    this.Zm0 = parammJ;
    this.Ub = paramhm0;
  }
  
  public final void p4(kf paramkf) {
    // Byte code:
    //   0: getstatic f/km.MR : Lf/Gp0;
    //   3: ifnonnull -> 7
    //   6: return
    //   7: aload_1
    //   8: aload_0
    //   9: getfield Zm0 : Lf/mJ;
    //   12: dup
    //   13: getfield FI0 : B
    //   16: istore_2
    //   17: getfield md : B
    //   20: istore_3
    //   21: getfield AD : Lf/Gp0;
    //   24: iload_2
    //   25: iload_3
    //   26: invokevirtual N0 : (BB)Lf/hm0;
    //   29: dup
    //   30: astore #4
    //   32: getstatic f/km.MR : Lf/Gp0;
    //   35: iload_2
    //   36: invokevirtual wB : (B)Lf/QZ;
    //   39: invokevirtual PN : ()Lf/ET;
    //   42: astore #5
    //   44: ifnull -> 309
    //   47: aload #4
    //   49: getfield K0 : Lf/jd0;
    //   52: invokevirtual AL : ()Z
    //   55: ifne -> 309
    //   58: aload #5
    //   60: aload_1
    //   61: aload #4
    //   63: dup
    //   64: invokevirtual K00 : ()V
    //   67: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   70: invokevirtual Eh : ()V
    //   73: getstatic f/ET.gX : Lf/ET;
    //   76: if_acmpne -> 131
    //   79: aload_1
    //   80: dup
    //   81: aload #4
    //   83: invokevirtual I9 : ()Ljava/lang/String;
    //   86: ldc 16807031
    //   88: swap
    //   89: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   92: invokevirtual cr : (Ljava/lang/String;)V
    //   95: new f/LV
    //   98: dup
    //   99: astore_2
    //   100: new f/ky0
    //   103: dup
    //   104: aload #4
    //   106: swap
    //   107: aload #4
    //   109: invokespecial <init> : (Lf/hm0;)V
    //   112: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   115: iconst_0
    //   116: swap
    //   117: invokespecial <init> : (BLf/wb;)V
    //   120: getfield YP : Ljava/util/LinkedList;
    //   123: aload_2
    //   124: invokevirtual add : (Ljava/lang/Object;)Z
    //   127: pop
    //   128: goto -> 309
    //   131: iload_2
    //   132: aload_1
    //   133: getfield AD : Lf/Gp0;
    //   136: invokevirtual hG0 : ()B
    //   139: if_icmpne -> 146
    //   142: iconst_1
    //   143: goto -> 147
    //   146: iconst_0
    //   147: ifeq -> 188
    //   150: getstatic f/F40.ef0 : Lf/F40;
    //   153: bipush #25
    //   155: bipush #29
    //   157: invokestatic A90 : (II)I
    //   160: istore_2
    //   161: iconst_1
    //   162: anewarray java/lang/String
    //   165: dup
    //   166: astore_3
    //   167: aload #4
    //   169: invokevirtual fA : ()Ljava/lang/String;
    //   172: iconst_0
    //   173: swap
    //   174: aastore
    //   175: iconst_2
    //   176: swap
    //   177: bipush #15
    //   179: iload_2
    //   180: aload_3
    //   181: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   184: astore_2
    //   185: goto -> 289
    //   188: iload_2
    //   189: aload_1
    //   190: getstatic f/F40.ef0 : Lf/F40;
    //   193: astore #6
    //   195: bipush #15
    //   197: istore #7
    //   199: bipush #31
    //   201: istore #8
    //   203: iconst_2
    //   204: anewarray java/lang/String
    //   207: astore #9
    //   209: iconst_0
    //   210: istore #10
    //   212: getfield AD : Lf/Gp0;
    //   215: astore #11
    //   217: iflt -> 248
    //   220: iload_2
    //   221: aload #11
    //   223: getfield ta0 : [Lf/QZ;
    //   226: dup
    //   227: astore #11
    //   229: arraylength
    //   230: if_icmple -> 236
    //   233: goto -> 254
    //   236: aload #11
    //   238: iload_2
    //   239: aaload
    //   240: iload_3
    //   241: invokevirtual cP : (B)Lf/QZ;
    //   244: astore_2
    //   245: goto -> 256
    //   248: aload #11
    //   250: invokevirtual getClass : ()Ljava/lang/Class;
    //   253: pop
    //   254: aconst_null
    //   255: astore_2
    //   256: aload #9
    //   258: aload #4
    //   260: aload #9
    //   262: aload_2
    //   263: invokevirtual dy : ()Ljava/lang/String;
    //   266: iload #10
    //   268: swap
    //   269: aastore
    //   270: invokevirtual I9 : ()Ljava/lang/String;
    //   273: iconst_1
    //   274: swap
    //   275: aastore
    //   276: iconst_2
    //   277: aload #6
    //   279: iload #7
    //   281: iload #8
    //   283: aload #9
    //   285: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   288: astore_2
    //   289: aload_1
    //   290: dup
    //   291: aload_2
    //   292: invokevirtual cr : (Ljava/lang/String;)V
    //   295: new f/fq0
    //   298: dup
    //   299: astore_2
    //   300: aload #4
    //   302: invokespecial <init> : (Lf/hm0;)V
    //   305: aload_2
    //   306: invokevirtual t80 : (Lf/wb;)V
    //   309: aload_1
    //   310: aload_0
    //   311: dup
    //   312: getfield Ub : Lf/hm0;
    //   315: astore_0
    //   316: getfield Zm0 : Lf/mJ;
    //   319: astore_1
    //   320: getfield YP : Ljava/util/LinkedList;
    //   323: new f/U3
    //   326: dup
    //   327: aload_0
    //   328: aload_1
    //   329: aload #5
    //   331: invokespecial <init> : (Lf/hm0;Lf/mJ;Lf/ET;)V
    //   334: invokevirtual add : (Ljava/lang/Object;)Z
    //   337: pop
    //   338: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 9
    //   #2	-> 13
    //   #3	-> 17
    //   #4	-> 21
    //   #5	-> 26
    //   #6	-> 49
    //   #7	-> 64
    //   #8	-> 120
    //   #9	-> 133
    //   #10	-> 136
    //   #11	-> 181
    //   #12	-> 190
    //   #13	-> 212
    //   #14	-> 223
    //   #15	-> 229
    //   #16	-> 250
    //   #17	-> 285
    //   #18	-> 292
    //   #19	-> 312
    //   #20	-> 316
    //   #21	-> 320
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */