package f;

public abstract class gW {
  public Object[] Zk;
  
  public float P6;
  
  public int xF0;
  
  public float Yh0;
  
  public int gB = 1;
  
  public gW(float paramFloat, Object... paramVarArgs) {
    this.P6 = paramFloat;
    sh0(paramVarArgs);
  }
  
  public final Object ka(float paramFloat, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: aload_0
    //   2: getfield gB : I
    //   5: istore_3
    //   6: ifeq -> 44
    //   9: iload_3
    //   10: iconst_1
    //   11: dup
    //   12: istore #4
    //   14: if_icmpeq -> 22
    //   17: iload_3
    //   18: iconst_2
    //   19: if_icmpne -> 44
    //   22: iload_3
    //   23: iload #4
    //   25: if_icmpne -> 36
    //   28: aload_0
    //   29: iconst_3
    //   30: putfield gB : I
    //   33: goto -> 70
    //   36: aload_0
    //   37: iconst_4
    //   38: putfield gB : I
    //   41: goto -> 70
    //   44: iload_2
    //   45: ifne -> 70
    //   48: iload_3
    //   49: iconst_1
    //   50: if_icmpeq -> 70
    //   53: iload_3
    //   54: iconst_2
    //   55: dup
    //   56: istore_2
    //   57: if_icmpeq -> 70
    //   60: iload_3
    //   61: iconst_4
    //   62: if_icmpne -> 28
    //   65: aload_0
    //   66: iload_2
    //   67: putfield gB : I
    //   70: aload_0
    //   71: getfield Zk : [Ljava/lang/Object;
    //   74: arraylength
    //   75: iconst_1
    //   76: if_icmpne -> 84
    //   79: iconst_0
    //   80: istore_1
    //   81: goto -> 287
    //   84: aload_0
    //   85: fload_1
    //   86: aload_0
    //   87: getfield P6 : F
    //   90: fdiv
    //   91: f2i
    //   92: istore_2
    //   93: getfield gB : I
    //   96: invokestatic yE : (I)I
    //   99: tableswitch default -> 136, 0 -> 263, 1 -> 246, 2 -> 235, 3 -> 216, 4 -> 175, 5 -> 139
    //   136: goto -> 275
    //   139: aload_0
    //   140: getfield Yh0 : F
    //   143: aload_0
    //   144: getfield P6 : F
    //   147: fdiv
    //   148: f2i
    //   149: iload_2
    //   150: if_icmpeq -> 167
    //   153: aload_0
    //   154: getfield Zk : [Ljava/lang/Object;
    //   157: arraylength
    //   158: iconst_1
    //   159: isub
    //   160: invokestatic cOM9 : (I)I
    //   163: istore_2
    //   164: goto -> 275
    //   167: aload_0
    //   168: getfield xF0 : I
    //   171: istore_2
    //   172: goto -> 275
    //   175: iload_2
    //   176: aload_0
    //   177: getfield Zk : [Ljava/lang/Object;
    //   180: dup
    //   181: astore_2
    //   182: arraylength
    //   183: iconst_2
    //   184: imul
    //   185: iconst_2
    //   186: isub
    //   187: irem
    //   188: dup
    //   189: istore #4
    //   191: aload_2
    //   192: arraylength
    //   193: if_icmplt -> 210
    //   196: aload_2
    //   197: arraylength
    //   198: iconst_2
    //   199: isub
    //   200: iload #4
    //   202: aload_2
    //   203: arraylength
    //   204: isub
    //   205: isub
    //   206: istore_2
    //   207: goto -> 275
    //   210: iload #4
    //   212: istore_2
    //   213: goto -> 275
    //   216: iload_2
    //   217: aload_0
    //   218: getfield Zk : [Ljava/lang/Object;
    //   221: dup
    //   222: astore_2
    //   223: arraylength
    //   224: irem
    //   225: aload_2
    //   226: arraylength
    //   227: swap
    //   228: isub
    //   229: iconst_1
    //   230: isub
    //   231: istore_2
    //   232: goto -> 275
    //   235: iload_2
    //   236: aload_0
    //   237: getfield Zk : [Ljava/lang/Object;
    //   240: arraylength
    //   241: irem
    //   242: istore_2
    //   243: goto -> 275
    //   246: aload_0
    //   247: getfield Zk : [Ljava/lang/Object;
    //   250: arraylength
    //   251: iload_2
    //   252: isub
    //   253: iconst_1
    //   254: isub
    //   255: iconst_0
    //   256: invokestatic max : (II)I
    //   259: istore_2
    //   260: goto -> 275
    //   263: aload_0
    //   264: getfield Zk : [Ljava/lang/Object;
    //   267: arraylength
    //   268: iconst_1
    //   269: isub
    //   270: iload_2
    //   271: invokestatic min : (II)I
    //   274: istore_2
    //   275: aload_0
    //   276: dup
    //   277: iload_2
    //   278: putfield xF0 : I
    //   281: fload_1
    //   282: putfield Yh0 : F
    //   285: iload_2
    //   286: istore_1
    //   287: iload_1
    //   288: iflt -> 300
    //   291: iload_1
    //   292: aload_0
    //   293: getfield Zk : [Ljava/lang/Object;
    //   296: arraylength
    //   297: if_icmplt -> 302
    //   300: iconst_0
    //   301: istore_1
    //   302: aload_0
    //   303: getfield Zk : [Ljava/lang/Object;
    //   306: iload_1
    //   307: aaload
    //   308: aload_0
    //   309: iload_3
    //   310: putfield gB : I
    //   313: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 71
    //   #2	-> 293
    //   #3	-> 310
  }
  
  public final void sh0(Object... paramVarArgs) {
    this.Zk = paramVarArgs;
    paramVarArgs.length;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */