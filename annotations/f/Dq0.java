package f;

public final class Dq0 {
  public final qw0 ph0;
  
  public Dq0() {
    qw0 qw01;
    this();
    this.ph0 = this;
  }
  
  public final void Fs0(int paramInt, String paramString, short paramShort) {
    // Byte code:
    //   0: getstatic f/Sg0.Tn : Lf/Sg0;
    //   3: getfield p90 : Lf/qw0;
    //   6: iload_3
    //   7: invokevirtual Z90 : (S)Ljava/lang/Object;
    //   10: checkcast f/rj
    //   13: dup
    //   14: astore #4
    //   16: ifnonnull -> 20
    //   19: return
    //   20: iload_1
    //   21: aload_0
    //   22: getfield ph0 : Lf/qw0;
    //   25: dup
    //   26: astore #5
    //   28: monitorenter
    //   29: ifeq -> 139
    //   32: aload_0
    //   33: getfield ph0 : Lf/qw0;
    //   36: iload_3
    //   37: invokevirtual Z90 : (S)Ljava/lang/Object;
    //   40: checkcast f/Lh0
    //   43: dup
    //   44: astore #6
    //   46: ifnonnull -> 72
    //   49: aload_0
    //   50: new f/Lh0
    //   53: dup
    //   54: astore #6
    //   56: aload #4
    //   58: aload_2
    //   59: invokespecial <init> : (Lf/rj;Ljava/lang/String;)V
    //   62: getfield ph0 : Lf/qw0;
    //   65: iload_3
    //   66: aload #6
    //   68: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
    //   71: pop
    //   72: aload #6
    //   74: dup
    //   75: iload_1
    //   76: putfield X4 : I
    //   79: invokestatic currentTimeMillis : ()J
    //   82: ldc2_w 1000
    //   85: ldiv
    //   86: l2i
    //   87: iload_1
    //   88: iadd
    //   89: putfield E50 : I
    //   92: getstatic f/P3.lF : Lf/P3;
    //   95: invokevirtual getClass : ()Ljava/lang/Class;
    //   98: pop
    //   99: ldc f/ug
    //   101: invokestatic XP : (Ljava/lang/Class;)Ljava/util/List;
    //   104: invokeinterface iterator : ()Ljava/util/Iterator;
    //   109: astore_1
    //   110: aload_1
    //   111: invokeinterface hasNext : ()Z
    //   116: ifeq -> 230
    //   119: aload_1
    //   120: invokeinterface next : ()Ljava/lang/Object;
    //   125: checkcast f/ug
    //   128: aload_0
    //   129: invokevirtual CM : (Lf/Dq0;)V
    //   132: goto -> 110
    //   135: astore_0
    //   136: goto -> 239
    //   139: aload_0
    //   140: dup
    //   141: getfield ph0 : Lf/qw0;
    //   144: dup
    //   145: astore_1
    //   146: monitorenter
    //   147: getfield ph0 : Lf/qw0;
    //   150: dup
    //   151: astore_2
    //   152: aconst_null
    //   153: astore #4
    //   155: iload_3
    //   156: invokevirtual kc0 : (S)I
    //   159: dup
    //   160: istore_3
    //   161: iflt -> 177
    //   164: aload_2
    //   165: iload_3
    //   166: aload_2
    //   167: getfield TH0 : [Ljava/lang/Object;
    //   170: iload_3
    //   171: aaload
    //   172: astore #4
    //   174: invokevirtual Id : (I)V
    //   177: aload #4
    //   179: ifnonnull -> 187
    //   182: aload_1
    //   183: monitorexit
    //   184: goto -> 230
    //   187: getstatic f/P3.lF : Lf/P3;
    //   190: invokevirtual getClass : ()Ljava/lang/Class;
    //   193: pop
    //   194: ldc f/ug
    //   196: invokestatic XP : (Ljava/lang/Class;)Ljava/util/List;
    //   199: invokeinterface iterator : ()Ljava/util/Iterator;
    //   204: astore_2
    //   205: aload_2
    //   206: invokeinterface hasNext : ()Z
    //   211: ifeq -> 182
    //   214: aload_2
    //   215: invokeinterface next : ()Ljava/lang/Object;
    //   220: checkcast f/ug
    //   223: aload_0
    //   224: invokevirtual CM : (Lf/Dq0;)V
    //   227: goto -> 205
    //   230: aload #5
    //   232: monitorexit
    //   233: return
    //   234: astore_0
    //   235: aload_0
    //   236: aload_1
    //   237: monitorexit
    //   238: athrow
    //   239: aload_0
    //   240: aload #5
    //   242: monitorexit
    //   243: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 0
    //   #2	-> 3
    //   #3	-> 7
    //   #4	-> 22
    //   #5	-> 76
    //   #6	-> 92
    //   #7	-> 141
    //   #8	-> 156
    //   #9	-> 167
    //   #10	-> 183
    //   #11	-> 187
    //   #12	-> 232
    //   #13	-> 237
    //   #14	-> 242
    // Exception table:
    //   from	to	target	type
    //   32	43	135	finally
    //   49	53	135	finally
    //   56	71	135	finally
    //   72	86	135	finally
    //   89	98	135	finally
    //   99	109	135	finally
    //   110	116	135	finally
    //   119	135	135	finally
    //   139	144	135	finally
    //   146	147	135	finally
    //   147	150	234	finally
    //   155	159	234	finally
    //   164	172	234	finally
    //   174	177	234	finally
    //   182	193	234	finally
    //   194	204	234	finally
    //   205	211	234	finally
    //   214	230	234	finally
    //   230	233	135	finally
    //   235	238	234	finally
    //   238	243	135	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */