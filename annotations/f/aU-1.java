package f;

public final class aU extends IN {
  public Hj Dy0;
  
  public float Th;
  
  public float Ih0;
  
  public long kK;
  
  public boolean NUl = false;
  
  public aU(Hj paramHj) {
    this.Dy0 = paramHj;
    this.Th = 0.0F;
    this.Ih0 = 0.0F;
  }
  
  public final void ED0(throws paramthrows) {
    if (this.NUl)
      km.pm0.RO((byte)2, (short)1389); 
  }
  
  public final void V90(throws paramthrows) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: aload_1
    //   3: invokespecial V90 : (Lf/throws;)V
    //   6: getfield Ih0 : F
    //   9: aload_0
    //   10: getfield Th : F
    //   13: invokestatic JC0 : (FF)Z
    //   16: ifne -> 342
    //   19: invokestatic currentTimeMillis : ()J
    //   22: dup2
    //   23: lstore_2
    //   24: aload_0
    //   25: getfield kK : J
    //   28: lsub
    //   29: ldc2_w 20
    //   32: lcmp
    //   33: ifge -> 37
    //   36: return
    //   37: aload_0
    //   38: getfield NUl : Z
    //   41: ifne -> 61
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield NUl : Z
    //   49: getstatic f/km.pm0 : Lf/VD0;
    //   52: iconst_0
    //   53: iconst_2
    //   54: sipush #1389
    //   57: fconst_0
    //   58: invokevirtual bA0 : (ZBSF)V
    //   61: aload_0
    //   62: dup
    //   63: lload_2
    //   64: aload_0
    //   65: getfield kK : J
    //   68: lsub
    //   69: ldc2_w 20
    //   72: ldiv
    //   73: l2i
    //   74: istore_1
    //   75: invokestatic currentTimeMillis : ()J
    //   78: lload_2
    //   79: aload_0
    //   80: getfield kK : J
    //   83: lsub
    //   84: ldc2_w 20
    //   87: lrem
    //   88: lsub
    //   89: putfield kK : J
    //   92: getfield Ih0 : F
    //   95: fconst_1
    //   96: fcmpl
    //   97: iflt -> 259
    //   100: aload_0
    //   101: getfield Th : F
    //   104: dup
    //   105: fstore_2
    //   106: fconst_1
    //   107: fcmpl
    //   108: iflt -> 259
    //   111: aload_0
    //   112: dup
    //   113: dup2
    //   114: fload_2
    //   115: aload_0
    //   116: fconst_0
    //   117: putfield Ih0 : F
    //   120: fconst_1
    //   121: fsub
    //   122: putfield Th : F
    //   125: getstatic f/km.pm0 : Lf/VD0;
    //   128: iconst_2
    //   129: sipush #1389
    //   132: invokevirtual RO : (BS)V
    //   135: iconst_0
    //   136: putfield NUl : Z
    //   139: getstatic f/km.pm0 : Lf/VD0;
    //   142: iconst_2
    //   143: sipush #1390
    //   146: invokevirtual bL : (BS)V
    //   149: invokestatic currentTimeMillis : ()J
    //   152: ldc2_w 250
    //   155: ladd
    //   156: putfield kK : J
    //   159: getfield Dy0 : Lf/Hj;
    //   162: dup
    //   163: dup
    //   164: dup2
    //   165: astore_2
    //   166: getfield LG0 : I
    //   169: iconst_1
    //   170: iadd
    //   171: putfield LG0 : I
    //   174: getfield aJ : Lf/dQ;
    //   177: astore_3
    //   178: getfield oN : Lf/hm0;
    //   181: ifnonnull -> 190
    //   184: ldc ''
    //   186: astore_2
    //   187: goto -> 254
    //   190: aload_2
    //   191: new java/lang/StringBuilder
    //   194: dup
    //   195: aload_2
    //   196: swap
    //   197: invokespecial <init> : ()V
    //   200: getfield oN : Lf/hm0;
    //   203: invokevirtual fA : ()Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: ldc '  '
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: bipush #59
    //   216: swap
    //   217: ldc ' '
    //   219: invokestatic X9 : (ILjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: astore #4
    //   224: getfield oN : Lf/hm0;
    //   227: ifnonnull -> 236
    //   230: ldc '--'
    //   232: astore_2
    //   233: goto -> 244
    //   236: aload_2
    //   237: getfield LG0 : I
    //   240: invokestatic toString : (I)Ljava/lang/String;
    //   243: astore_2
    //   244: aload #4
    //   246: aload_2
    //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: invokevirtual toString : ()Ljava/lang/String;
    //   253: astore_2
    //   254: aload_3
    //   255: aload_2
    //   256: invokevirtual E1 : (Ljava/lang/String;)V
    //   259: aload_0
    //   260: getfield Ih0 : F
    //   263: aload_0
    //   264: getfield Th : F
    //   267: invokestatic JC0 : (FF)Z
    //   270: ifne -> 311
    //   273: aload_0
    //   274: getfield Ih0 : F
    //   277: dup
    //   278: fstore_2
    //   279: aload_0
    //   280: getfield Th : F
    //   283: fcmpl
    //   284: ifle -> 290
    //   287: goto -> 311
    //   290: aload_0
    //   291: dup
    //   292: iload_1
    //   293: i2f
    //   294: ldc 0.01
    //   296: fmul
    //   297: fload_2
    //   298: fadd
    //   299: dup
    //   300: fstore_0
    //   301: putfield Ih0 : F
    //   304: fload_0
    //   305: invokevirtual Nu : (F)V
    //   308: goto -> 347
    //   311: aload_0
    //   312: dup
    //   313: dup
    //   314: dup2
    //   315: getfield Th : F
    //   318: invokevirtual Nu : (F)V
    //   321: getfield Ih0 : F
    //   324: putfield Th : F
    //   327: getstatic f/km.pm0 : Lf/VD0;
    //   330: iconst_2
    //   331: sipush #1389
    //   334: invokevirtual RO : (BS)V
    //   337: iconst_0
    //   338: putfield NUl : Z
    //   341: return
    //   342: aload_0
    //   343: iconst_0
    //   344: putfield NUl : Z
    //   347: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 58
    //   #2	-> 65
    //   #3	-> 166
    //   #4	-> 171
    //   #5	-> 217
    //   #6	-> 224
    //   #7	-> 260
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */