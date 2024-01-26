package f;

import java.nio.ByteBuffer;

public final class IB {
  public static final IB XB0 = new IB();
  
  public static final U70[] ef = new U70[0];
  
  public static int[] jr0 = new int[] { 0, 1, 0, 2 };
  
  public static int[] h60 = new int[] { 0, 2 };
  
  public static int[] Bo = new int[] { 0, 1, 3, 2, 3, 1 };
  
  public short yp;
  
  public byte TN;
  
  public byte LI0;
  
  public byte CV;
  
  public byte Tp0;
  
  public byte a30;
  
  public byte Ob0;
  
  public byte kT;
  
  public byte lPT6;
  
  public byte dg0;
  
  public byte pu;
  
  public short Ce;
  
  public U70[] w70 = ef;
  
  public IB(ByteBuffer paramByteBuffer) {
    this.yp = paramByteBuffer.getShort();
    this.TN = paramByteBuffer.get();
    this.LI0 = paramByteBuffer.get();
    this.CV = paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    this.Tp0 = paramByteBuffer.get();
    paramByteBuffer.get();
    this.a30 = paramByteBuffer.get();
    paramByteBuffer.get();
    this.Ob0 = paramByteBuffer.get();
    this.kT = paramByteBuffer.get();
    this.lPT6 = paramByteBuffer.get();
    this.dg0 = paramByteBuffer.get();
    this.pu = paramByteBuffer.get();
    this.Ce = paramByteBuffer.getShort();
    paramByteBuffer.position(paramByteBuffer.position() + 10);
    if (this.TN == 2 && this.Ce == 2)
      this.pu = -16; 
  }
  
  public IB(byte paramByte, short paramShort1, short paramShort2) {
    this.yp = paramShort1;
    this.Ce = paramShort2;
    this.Ob0 = 1;
    this.kT = 1;
    this.TN = paramByte;
    if (paramShort1 == 8202) {
      this.a30 = 8;
      this.dg0 = 16;
      this.pu = 0;
      this.CV = 2;
    } 
  }
  
  public IB() {
    this.a30 = 8;
    this.Ce = 196;
    this.Ob0 = 1;
    this.kT = 1;
  }
  
  public final U70 Pz(int paramInt, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield w70 : [Lf/U70;
    //   5: astore_0
    //   6: getfield a30 : B
    //   9: dup
    //   10: istore_3
    //   11: lookupswitch default -> 100, 5 -> 250, 8 -> 245, 12 -> 250, 13 -> 191, 14 -> 191, 18 -> 159, 19 -> 245, 21 -> 143, 22 -> 122, 29 -> 103
    //   100: goto -> 304
    //   103: getstatic f/zm0.u20 : J
    //   106: ldc2_w 240
    //   109: ldiv
    //   110: ldc2_w 5
    //   113: lrem
    //   114: l2i
    //   115: bipush #7
    //   117: iadd
    //   118: istore_1
    //   119: goto -> 369
    //   122: getstatic f/zm0.u20 : J
    //   125: ldc2_w 240
    //   128: ldiv
    //   129: ldc2_w 6
    //   132: lrem
    //   133: l2i
    //   134: getstatic f/IB.Bo : [I
    //   137: swap
    //   138: iaload
    //   139: istore_1
    //   140: goto -> 369
    //   143: getstatic f/zm0.u20 : J
    //   146: ldc2_w 120
    //   149: ldiv
    //   150: ldc2_w 20
    //   153: lrem
    //   154: l2i
    //   155: istore_1
    //   156: goto -> 369
    //   159: iload_2
    //   160: iconst_2
    //   161: if_icmpeq -> 185
    //   164: getstatic f/zm0.u20 : J
    //   167: ldc2_w 240
    //   170: ldiv
    //   171: ldc2_w 6
    //   174: lrem
    //   175: l2i
    //   176: getstatic f/IB.Bo : [I
    //   179: swap
    //   180: iaload
    //   181: istore_1
    //   182: goto -> 369
    //   185: bipush #12
    //   187: istore_1
    //   188: goto -> 369
    //   191: iload_2
    //   192: ifeq -> 227
    //   195: iload_2
    //   196: iconst_2
    //   197: if_icmpeq -> 223
    //   200: iload_2
    //   201: iconst_3
    //   202: if_icmpeq -> 209
    //   205: iconst_0
    //   206: goto -> 228
    //   209: iload_3
    //   210: bipush #13
    //   212: if_icmpne -> 218
    //   215: goto -> 223
    //   218: bipush #6
    //   220: goto -> 228
    //   223: iconst_4
    //   224: goto -> 228
    //   227: iconst_2
    //   228: getstatic f/zm0.u20 : J
    //   231: ldc2_w 333
    //   234: ldiv
    //   235: ldc2_w 2
    //   238: lrem
    //   239: l2i
    //   240: iadd
    //   241: istore_1
    //   242: goto -> 369
    //   245: iconst_0
    //   246: istore_1
    //   247: goto -> 369
    //   250: iload_2
    //   251: ifeq -> 295
    //   254: iload_2
    //   255: iconst_2
    //   256: if_icmpeq -> 286
    //   259: iload_2
    //   260: iconst_3
    //   261: if_icmpeq -> 273
    //   264: iload_1
    //   265: iconst_2
    //   266: irem
    //   267: iconst_0
    //   268: iadd
    //   269: istore_1
    //   270: goto -> 369
    //   273: getstatic f/IB.h60 : [I
    //   276: iload_1
    //   277: iconst_2
    //   278: irem
    //   279: iaload
    //   280: iconst_4
    //   281: iadd
    //   282: istore_1
    //   283: goto -> 369
    //   286: iload_1
    //   287: iconst_2
    //   288: irem
    //   289: iconst_4
    //   290: iadd
    //   291: istore_1
    //   292: goto -> 369
    //   295: iload_1
    //   296: iconst_2
    //   297: irem
    //   298: iconst_2
    //   299: iadd
    //   300: istore_1
    //   301: goto -> 369
    //   304: iload_2
    //   305: ifeq -> 359
    //   308: iload_2
    //   309: iconst_2
    //   310: if_icmpeq -> 345
    //   313: iload_2
    //   314: iconst_3
    //   315: if_icmpeq -> 331
    //   318: getstatic f/IB.jr0 : [I
    //   321: iload_1
    //   322: iconst_4
    //   323: irem
    //   324: iaload
    //   325: iconst_0
    //   326: iadd
    //   327: istore_1
    //   328: goto -> 369
    //   331: getstatic f/IB.jr0 : [I
    //   334: iload_1
    //   335: iconst_4
    //   336: irem
    //   337: iaload
    //   338: bipush #9
    //   340: iadd
    //   341: istore_1
    //   342: goto -> 369
    //   345: getstatic f/IB.jr0 : [I
    //   348: iload_1
    //   349: iconst_4
    //   350: irem
    //   351: iaload
    //   352: bipush #6
    //   354: iadd
    //   355: istore_1
    //   356: goto -> 369
    //   359: getstatic f/IB.jr0 : [I
    //   362: iload_1
    //   363: iconst_4
    //   364: irem
    //   365: iaload
    //   366: iconst_3
    //   367: iadd
    //   368: istore_1
    //   369: iload_1
    //   370: aload_0
    //   371: arraylength
    //   372: if_icmplt -> 377
    //   375: iconst_0
    //   376: istore_1
    //   377: aload_0
    //   378: iload_1
    //   379: aaload
    //   380: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 103
    //   #2	-> 109
    //   #3	-> 122
    //   #4	-> 128
    //   #5	-> 143
    //   #6	-> 149
    //   #7	-> 164
    //   #8	-> 170
    //   #9	-> 228
    //   #10	-> 234
    //   #11	-> 379
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */