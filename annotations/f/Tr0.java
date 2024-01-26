package f;

public final class Tr0 implements Runnable {
  public Tr0(wv paramwv) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield uV : Lf/wv;
    //   4: getfield V1 : Lf/mG;
    //   7: getstatic f/km.a3 : Lf/vh0;
    //   10: getfield Ct : Lf/Jo;
    //   13: getfield Jg : I
    //   16: iconst_4
    //   17: invokevirtual Ru : (IS)Z
    //   20: ifeq -> 279
    //   23: aload_0
    //   24: new f/Wr
    //   27: dup
    //   28: dup2
    //   29: astore_1
    //   30: invokespecial <init> : ()V
    //   33: sipush #2718
    //   36: invokestatic OH0 : (I)Ljava/lang/String;
    //   39: invokevirtual Lo : (Ljava/lang/String;)V
    //   42: ldc 'settings-frame'
    //   44: invokevirtual Xu : (Ljava/lang/String;)V
    //   47: new f/Ip
    //   50: dup
    //   51: dup
    //   52: astore_2
    //   53: aload_0
    //   54: aload_1
    //   55: aload_2
    //   56: aload_1
    //   57: aload_2
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: ldc 'changemotd'
    //   64: invokevirtual Xu : (Ljava/lang/String;)V
    //   67: invokevirtual Ub : ()I
    //   70: invokevirtual si : (Lf/JG0;I)V
    //   73: getfield uV : Lf/wv;
    //   76: dup
    //   77: astore_3
    //   78: getfield Nm0 : Lf/of;
    //   81: dup
    //   82: aload_3
    //   83: swap
    //   84: dup
    //   85: iconst_1
    //   86: putfield GE : Z
    //   89: sipush #500
    //   92: putfield mK0 : I
    //   95: getfield V1 : Lf/mG;
    //   98: getfield FH0 : Lf/yy;
    //   101: getfield Ku0 : Ljava/lang/String;
    //   104: iconst_0
    //   105: invokevirtual Be0 : (Ljava/lang/String;Z)V
    //   108: new f/rS
    //   111: dup
    //   112: dup
    //   113: astore_3
    //   114: aload_0
    //   115: getfield uV : Lf/wv;
    //   118: getfield Nm0 : Lf/of;
    //   121: invokespecial <init> : (Lf/JG0;)V
    //   124: invokevirtual xZ : ()V
    //   127: new f/Un
    //   130: dup
    //   131: dup
    //   132: astore #4
    //   134: bipush #54
    //   136: invokestatic OH0 : (I)Ljava/lang/String;
    //   139: invokespecial <init> : (Ljava/lang/String;)V
    //   142: new f/DB
    //   145: dup
    //   146: aload_0
    //   147: aload_1
    //   148: aload_3
    //   149: invokespecial <init> : (Lf/Tr0;Lf/Wr;Lf/rS;)V
    //   152: invokevirtual tW : (Ljava/lang/Runnable;)V
    //   155: new f/Un
    //   158: dup
    //   159: astore_0
    //   160: aload_1
    //   161: aload_3
    //   162: aload_0
    //   163: bipush #53
    //   165: invokestatic OH0 : (I)Ljava/lang/String;
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: <illegal opcode> run : (Lf/Wr;Lf/rS;)Ljava/lang/Runnable;
    //   176: invokevirtual tW : (Ljava/lang/Runnable;)V
    //   179: new f/cr0
    //   182: dup
    //   183: aload_3
    //   184: swap
    //   185: aload_2
    //   186: invokespecial <init> : (Lf/Ip;)V
    //   189: invokevirtual Ya : (Lf/JG0;)Lf/U90;
    //   192: invokevirtual Em0 : ()Lf/U90;
    //   195: aload_2
    //   196: iconst_2
    //   197: anewarray f/JG0
    //   200: dup
    //   201: dup
    //   202: iconst_0
    //   203: aload #4
    //   205: aastore
    //   206: iconst_1
    //   207: aload_0
    //   208: aastore
    //   209: invokevirtual AUX : ([Lf/JG0;)Lf/U90;
    //   212: invokevirtual ee0 : (Lf/U90;)Lf/U90;
    //   215: invokevirtual WN : (Lf/U90;)V
    //   218: new f/g0
    //   221: dup
    //   222: aload_3
    //   223: swap
    //   224: aload_2
    //   225: invokespecial <init> : (Lf/Ip;)V
    //   228: invokevirtual Ya : (Lf/JG0;)Lf/U90;
    //   231: new f/cr0
    //   234: dup
    //   235: aload_2
    //   236: invokespecial <init> : (Lf/Ip;)V
    //   239: invokevirtual Em0 : ()Lf/U90;
    //   242: iconst_2
    //   243: anewarray f/JG0
    //   246: dup
    //   247: dup
    //   248: iconst_0
    //   249: aload #4
    //   251: aastore
    //   252: iconst_1
    //   253: aload_0
    //   254: aastore
    //   255: invokevirtual Mg : ([Lf/JG0;)Lf/U90;
    //   258: invokevirtual Em0 : ()Lf/U90;
    //   261: invokevirtual ee0 : (Lf/U90;)Lf/U90;
    //   264: invokevirtual rK0 : (Lf/U90;)V
    //   267: getfield uV : Lf/wv;
    //   270: dup
    //   271: aload_1
    //   272: swap
    //   273: invokevirtual Ub : ()I
    //   276: invokevirtual si : (Lf/JG0;I)V
    //   279: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 13
    //   #3	-> 17
    //   #4	-> 67
    //   #5	-> 73
    //   #6	-> 86
    //   #7	-> 92
    //   #8	-> 95
    //   #9	-> 98
    //   #10	-> 101
    //   #11	-> 105
    //   #12	-> 108
    //   #13	-> 179
    //   #14	-> 189
    //   #15	-> 218
    //   #16	-> 228
    //   #17	-> 231
    //   #18	-> 239
    //   #19	-> 273
    //   #20	-> 276
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */