package f;

public final class kh extends ZK0 {
  public final byte nG;
  
  public final byte xL0;
  
  public nl[] K9;
  
  public boolean cA0 = false;
  
  public nl f6;
  
  public kh(byte paramByte1, byte paramByte2, nl... paramVarArgs) {
    this.nG = paramByte1;
    this.xL0 = paramByte2;
    this.K9 = paramVarArgs;
  }
  
  public final kh Dn() {
    this.cA0 = true;
    return this;
  }
  
  public final kh ik0(nl paramnl) {
    this.f6 = paramnl;
    return this;
  }
  
  public final boolean kA0(xr0 paramxr0, tc paramtc, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield nG : B
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield xL0 : B
    //   13: dup
    //   14: istore #4
    //   16: iconst_m1
    //   17: if_icmpeq -> 31
    //   20: iload_3
    //   21: iload #4
    //   23: if_icmpne -> 29
    //   26: goto -> 31
    //   29: iconst_0
    //   30: ireturn
    //   31: aload_0
    //   32: getfield cA0 : Z
    //   35: ifeq -> 132
    //   38: aload_1
    //   39: invokevirtual Q4 : ()Lf/KI;
    //   42: invokevirtual rH0 : ()Lf/HV;
    //   45: dup
    //   46: astore_3
    //   47: ifnonnull -> 52
    //   50: iconst_0
    //   51: ireturn
    //   52: aload_3
    //   53: aload_1
    //   54: dup
    //   55: dup
    //   56: invokevirtual Ka : ()S
    //   59: istore_3
    //   60: invokevirtual hA0 : ()S
    //   63: istore #4
    //   65: invokevirtual i00 : ()F
    //   68: pop
    //   69: getfield et : [Lf/NI0;
    //   72: dup
    //   73: astore #5
    //   75: arraylength
    //   76: istore #6
    //   78: iconst_0
    //   79: istore #7
    //   81: iload #7
    //   83: iload #6
    //   85: if_icmpge -> 122
    //   88: iload_3
    //   89: aload #5
    //   91: iload #7
    //   93: aaload
    //   94: dup
    //   95: astore #8
    //   97: invokevirtual Sn0 : ()S
    //   100: if_icmpne -> 116
    //   103: iload #4
    //   105: aload #8
    //   107: invokevirtual Qq0 : ()S
    //   110: if_icmpne -> 116
    //   113: goto -> 125
    //   116: iinc #7, 1
    //   119: goto -> 81
    //   122: aconst_null
    //   123: astore #8
    //   125: aload #8
    //   127: ifnonnull -> 132
    //   130: iconst_0
    //   131: ireturn
    //   132: aload_2
    //   133: getfield pm : Lf/d7;
    //   136: aload_1
    //   137: aload_0
    //   138: getfield K9 : [Lf/nl;
    //   141: iconst_0
    //   142: swap
    //   143: invokevirtual Ci0 : (Lf/xr0;Z[Lf/nl;)Z
    //   146: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 69
    //   #2	-> 133
    //   #3	-> 138
  }
  
  public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield nG : B
    //   4: iconst_1
    //   5: if_icmpeq -> 13
    //   8: aload_0
    //   9: instanceof f/lk
    //   12: ireturn
    //   13: aload_0
    //   14: getfield xL0 : B
    //   17: dup
    //   18: istore #4
    //   20: iflt -> 34
    //   23: iload_3
    //   24: iload #4
    //   26: if_icmpne -> 32
    //   29: goto -> 34
    //   32: iconst_0
    //   33: ireturn
    //   34: aload_0
    //   35: getfield cA0 : Z
    //   38: ifeq -> 139
    //   41: aload_1
    //   42: invokevirtual Q4 : ()Lf/KI;
    //   45: invokevirtual rH0 : ()Lf/HV;
    //   48: dup
    //   49: astore #4
    //   51: ifnonnull -> 56
    //   54: iconst_0
    //   55: ireturn
    //   56: aload #4
    //   58: aload_1
    //   59: dup
    //   60: dup
    //   61: invokevirtual Ka : ()S
    //   64: istore #4
    //   66: invokevirtual hA0 : ()S
    //   69: istore #5
    //   71: invokevirtual i00 : ()F
    //   74: pop
    //   75: getfield et : [Lf/NI0;
    //   78: dup
    //   79: astore #6
    //   81: arraylength
    //   82: istore #7
    //   84: iconst_0
    //   85: istore #8
    //   87: iload #8
    //   89: iload #7
    //   91: if_icmpge -> 129
    //   94: iload #4
    //   96: aload #6
    //   98: iload #8
    //   100: aaload
    //   101: dup
    //   102: astore #9
    //   104: invokevirtual Sn0 : ()S
    //   107: if_icmpne -> 123
    //   110: iload #5
    //   112: aload #9
    //   114: invokevirtual Qq0 : ()S
    //   117: if_icmpne -> 123
    //   120: goto -> 132
    //   123: iinc #8, 1
    //   126: goto -> 87
    //   129: aconst_null
    //   130: astore #9
    //   132: aload #9
    //   134: ifnonnull -> 139
    //   137: iconst_1
    //   138: ireturn
    //   139: aload_0
    //   140: getfield K9 : [Lf/nl;
    //   143: dup
    //   144: astore_0
    //   145: ifnull -> 226
    //   148: aload_0
    //   149: arraylength
    //   150: ifle -> 226
    //   153: aload_0
    //   154: iconst_0
    //   155: aaload
    //   156: dup
    //   157: astore #4
    //   159: getstatic f/nl.ZC0 : Lf/nl;
    //   162: dup
    //   163: astore #5
    //   165: if_acmpeq -> 184
    //   168: aload #4
    //   170: getstatic f/nl.Zi0 : Lf/nl;
    //   173: if_acmpeq -> 184
    //   176: aload #4
    //   178: getstatic f/nl.Y8 : Lf/nl;
    //   181: if_acmpne -> 276
    //   184: iload_3
    //   185: iconst_3
    //   186: if_icmpne -> 211
    //   189: iconst_2
    //   190: anewarray f/nl
    //   193: dup
    //   194: dup2
    //   195: astore_0
    //   196: iconst_0
    //   197: aload #5
    //   199: aastore
    //   200: iconst_1
    //   201: aload #5
    //   203: aastore
    //   204: iconst_0
    //   205: aload #5
    //   207: aastore
    //   208: goto -> 276
    //   211: iconst_1
    //   212: anewarray f/nl
    //   215: dup
    //   216: astore_0
    //   217: getstatic f/nl.Y8 : Lf/nl;
    //   220: iconst_0
    //   221: swap
    //   222: aastore
    //   223: goto -> 276
    //   226: iload_3
    //   227: ifeq -> 261
    //   230: iload_3
    //   231: iconst_1
    //   232: if_icmpeq -> 254
    //   235: iload_3
    //   236: iconst_3
    //   237: if_icmpeq -> 247
    //   240: getstatic f/nl.Bn : Lf/nl;
    //   243: astore_0
    //   244: goto -> 265
    //   247: getstatic f/nl.Dz0 : Lf/nl;
    //   250: astore_0
    //   251: goto -> 265
    //   254: getstatic f/nl.Cl : Lf/nl;
    //   257: astore_0
    //   258: goto -> 265
    //   261: getstatic f/nl.jC0 : Lf/nl;
    //   264: astore_0
    //   265: iconst_1
    //   266: anewarray f/nl
    //   269: dup
    //   270: astore_3
    //   271: iconst_0
    //   272: aload_0
    //   273: aastore
    //   274: aload_3
    //   275: astore_0
    //   276: aload_2
    //   277: getfield pm : Lf/d7;
    //   280: aload_1
    //   281: iconst_0
    //   282: aload_0
    //   283: invokevirtual Ci0 : (Lf/xr0;Z[Lf/nl;)Z
    //   286: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 9
    //   #2	-> 14
    //   #3	-> 75
    //   #4	-> 140
    //   #5	-> 277
    //   #6	-> 283
  }
  
  public final nl V6() {
    return this.f6;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */