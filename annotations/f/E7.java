package f;

public final class E7 {
  public static final int[] e2 = new int[] { 
      0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
      1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 
      1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 
      1073741823, Integer.MAX_VALUE, -1 };
  
  public int UG = 0;
  
  public byte[] qJ0 = null;
  
  public int SJ = 0;
  
  public int m60 = 0;
  
  public int zk = 0;
  
  public final int else(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_0
    //   3: getstatic f/E7.e2 : [I
    //   6: iload_1
    //   7: iaload
    //   8: istore_1
    //   9: getfield SJ : I
    //   12: dup
    //   13: istore_2
    //   14: iadd
    //   15: istore_3
    //   16: getfield m60 : I
    //   19: dup
    //   20: istore #4
    //   22: iconst_4
    //   23: iadd
    //   24: aload_0
    //   25: getfield zk : I
    //   28: dup
    //   29: istore #5
    //   31: if_icmplt -> 85
    //   34: iload_3
    //   35: iconst_m1
    //   36: istore #6
    //   38: iconst_1
    //   39: bipush #8
    //   41: iload #4
    //   43: invokestatic Se0 : (IIII)I
    //   46: iload #5
    //   48: if_icmplt -> 85
    //   51: iload #6
    //   53: aload_0
    //   54: iload_3
    //   55: aload_0
    //   56: iload #4
    //   58: aload_0
    //   59: dup
    //   60: getfield UG : I
    //   63: iload_3
    //   64: bipush #8
    //   66: idiv
    //   67: dup
    //   68: istore_0
    //   69: iadd
    //   70: putfield UG : I
    //   73: iload_0
    //   74: iadd
    //   75: putfield m60 : I
    //   78: bipush #7
    //   80: iand
    //   81: putfield SJ : I
    //   84: ireturn
    //   85: iload_3
    //   86: aload_0
    //   87: getfield qJ0 : [B
    //   90: dup
    //   91: astore #5
    //   93: aload_0
    //   94: getfield UG : I
    //   97: dup
    //   98: istore #6
    //   100: baload
    //   101: sipush #255
    //   104: iand
    //   105: iload_2
    //   106: iushr
    //   107: istore #7
    //   109: bipush #8
    //   111: if_icmple -> 220
    //   114: iload_3
    //   115: iload #7
    //   117: aload #5
    //   119: iload #6
    //   121: iconst_1
    //   122: iadd
    //   123: baload
    //   124: sipush #255
    //   127: iand
    //   128: bipush #8
    //   130: iload_2
    //   131: isub
    //   132: ishl
    //   133: ior
    //   134: istore #7
    //   136: bipush #16
    //   138: if_icmple -> 220
    //   141: iload_3
    //   142: iload #7
    //   144: aload #5
    //   146: iload #6
    //   148: iconst_2
    //   149: iadd
    //   150: baload
    //   151: sipush #255
    //   154: iand
    //   155: bipush #16
    //   157: iload_2
    //   158: isub
    //   159: ishl
    //   160: ior
    //   161: istore #7
    //   163: bipush #24
    //   165: if_icmple -> 220
    //   168: iload_3
    //   169: iload #7
    //   171: aload #5
    //   173: iload #6
    //   175: iconst_3
    //   176: iadd
    //   177: baload
    //   178: sipush #255
    //   181: iand
    //   182: bipush #24
    //   184: iload_2
    //   185: isub
    //   186: ishl
    //   187: ior
    //   188: istore #7
    //   190: bipush #32
    //   192: if_icmple -> 220
    //   195: iload_2
    //   196: ifeq -> 220
    //   199: iload #7
    //   201: aload #5
    //   203: iload #6
    //   205: iconst_4
    //   206: iadd
    //   207: baload
    //   208: sipush #255
    //   211: iand
    //   212: bipush #32
    //   214: iload_2
    //   215: isub
    //   216: ishl
    //   217: ior
    //   218: istore #7
    //   220: iload #7
    //   222: iload_1
    //   223: iand
    //   224: aload_0
    //   225: iload_3
    //   226: aload_0
    //   227: iload #4
    //   229: aload_0
    //   230: iload #6
    //   232: iload_3
    //   233: bipush #8
    //   235: idiv
    //   236: dup
    //   237: istore_0
    //   238: iadd
    //   239: putfield UG : I
    //   242: iload_0
    //   243: iadd
    //   244: putfield m60 : I
    //   247: bipush #7
    //   249: iand
    //   250: putfield SJ : I
    //   253: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 43
    //   #2	-> 60
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/E7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */