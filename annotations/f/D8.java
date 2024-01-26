package f;

public final class D8 extends ZK0 {
  public final q IN;
  
  public final byte Dy;
  
  public D8(sx0 paramsx0, q paramq, byte paramByte) {
    this.IN = paramq;
    this.Dy = paramByte;
  }
  
  public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield IN : Lf/q;
    //   4: dup
    //   5: astore_1
    //   6: getfield gT : B
    //   9: dup
    //   10: istore_2
    //   11: aload_0
    //   12: getfield Dy : B
    //   15: dup
    //   16: istore #4
    //   18: if_icmpeq -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: iload_3
    //   24: getstatic f/sx0.Sy0 : [[B
    //   27: aload_1
    //   28: getfield Sa0 : B
    //   31: aaload
    //   32: iload #4
    //   34: baload
    //   35: istore_3
    //   36: tableswitch default -> 68, 0 -> 201, 1 -> 153, 2 -> 103, 3 -> 71
    //   68: goto -> 246
    //   71: iload_3
    //   72: bipush #8
    //   74: iand
    //   75: ifeq -> 94
    //   78: iload_3
    //   79: aload_1
    //   80: ldc 'sandbag02_l'
    //   82: invokevirtual tG0 : (Ljava/lang/String;)V
    //   85: bipush #16
    //   87: iand
    //   88: ifeq -> 122
    //   91: goto -> 133
    //   94: aload_1
    //   95: ldc 'sandbag01_l'
    //   97: invokevirtual tG0 : (Ljava/lang/String;)V
    //   100: goto -> 246
    //   103: iload_3
    //   104: iconst_4
    //   105: iand
    //   106: ifeq -> 144
    //   109: iload_3
    //   110: bipush #16
    //   112: iand
    //   113: aload_1
    //   114: ldc 'sandbag02_r'
    //   116: invokevirtual tG0 : (Ljava/lang/String;)V
    //   119: ifeq -> 133
    //   122: aload_0
    //   123: getfield Dy : B
    //   126: iconst_1
    //   127: iadd
    //   128: i2b
    //   129: istore_2
    //   130: goto -> 246
    //   133: aload_0
    //   134: getfield Dy : B
    //   137: iconst_1
    //   138: isub
    //   139: i2b
    //   140: istore_2
    //   141: goto -> 246
    //   144: aload_1
    //   145: ldc 'sandbag01_r'
    //   147: invokevirtual tG0 : (Ljava/lang/String;)V
    //   150: goto -> 246
    //   153: iload_3
    //   154: iconst_1
    //   155: iand
    //   156: ifeq -> 192
    //   159: aload_0
    //   160: aload_1
    //   161: ldc 'sandbag02_d'
    //   163: invokevirtual tG0 : (Ljava/lang/String;)V
    //   166: getfield IN : Lf/q;
    //   169: getfield TA0 : B
    //   172: iconst_1
    //   173: if_icmpne -> 184
    //   176: iload_2
    //   177: iconst_2
    //   178: iadd
    //   179: i2b
    //   180: istore_2
    //   181: goto -> 246
    //   184: iload_2
    //   185: iconst_1
    //   186: iadd
    //   187: i2b
    //   188: istore_2
    //   189: goto -> 246
    //   192: aload_1
    //   193: ldc 'sandbag01_d'
    //   195: invokevirtual tG0 : (Ljava/lang/String;)V
    //   198: goto -> 246
    //   201: iload_3
    //   202: iconst_2
    //   203: iand
    //   204: ifeq -> 240
    //   207: aload_0
    //   208: aload_1
    //   209: ldc 'sandbag02_u'
    //   211: invokevirtual tG0 : (Ljava/lang/String;)V
    //   214: getfield IN : Lf/q;
    //   217: getfield TA0 : B
    //   220: iconst_1
    //   221: if_icmpne -> 232
    //   224: iload_2
    //   225: iconst_2
    //   226: isub
    //   227: i2b
    //   228: istore_2
    //   229: goto -> 246
    //   232: iload_2
    //   233: iconst_1
    //   234: isub
    //   235: i2b
    //   236: istore_2
    //   237: goto -> 246
    //   240: aload_1
    //   241: ldc 'sandbag01_u'
    //   243: invokevirtual tG0 : (Ljava/lang/String;)V
    //   246: aload_0
    //   247: getfield IN : Lf/q;
    //   250: dup
    //   251: astore_1
    //   252: getfield gT : B
    //   255: iload_2
    //   256: if_icmpeq -> 279
    //   259: aload_1
    //   260: iload_2
    //   261: iconst_1
    //   262: invokevirtual ng0 : (BZ)V
    //   265: getstatic f/km.u4 : Lf/R8;
    //   268: new f/S8
    //   271: dup
    //   272: aload_0
    //   273: invokespecial <init> : (Lf/D8;)V
    //   276: putfield hB0 : Lf/Ca;
    //   279: iconst_0
    //   280: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 276
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */