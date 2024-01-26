/* 1 */ package f;public final class kJ extends Kl0 { public final void sM() { this
/* 2 */       .pn = this.Ws.get();
/*   */     
/* 4 */     this.TS = this.Ws.getShort();
/*   */     
/* 6 */     this.im = this.Ws.get(); }
/*   */ 
/*   */   
/*   */   public byte pn;
/*   */   public short TS;
/*   */   public byte im;
/*   */   
/*   */   public kJ(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual r8 : ()Lf/ro;
/*   */     //   4: ifnull -> 192
/*   */     //   7: aload_0
/*   */     //   8: invokevirtual r8 : ()Lf/ro;
/*   */     //   11: getfield OK : Lf/qc0;
/*   */     //   14: ifnull -> 192
/*   */     //   17: aload_0
/*   */     //   18: dup
/*   */     //   19: dup
/*   */     //   20: invokevirtual r8 : ()Lf/ro;
/*   */     //   23: getfield OK : Lf/qc0;
/*   */     //   26: astore_1
/*   */     //   27: getfield pn : B
/*   */     //   30: istore_2
/*   */     //   31: getfield TS : S
/*   */     //   34: dup
/*   */     //   35: istore_3
/*   */     //   36: sipush #1000
/*   */     //   39: if_icmplt -> 50
/*   */     //   42: aload_1
/*   */     //   43: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   46: pop
/*   */     //   47: goto -> 90
/*   */     //   50: aload_1
/*   */     //   51: dup
/*   */     //   52: getfield NH : Ljava/lang/Object;
/*   */     //   55: dup
/*   */     //   56: astore #4
/*   */     //   58: monitorenter
/*   */     //   59: getfield N10 : [Ljava/util/BitSet;
/*   */     //   62: iload_2
/*   */     //   63: aaload
/*   */     //   64: iload_3
/*   */     //   65: invokevirtual get : (I)Z
/*   */     //   68: ifeq -> 77
/*   */     //   71: aload #4
/*   */     //   73: monitorexit
/*   */     //   74: goto -> 90
/*   */     //   77: aload #4
/*   */     //   79: aload_1
/*   */     //   80: getfield N10 : [Ljava/util/BitSet;
/*   */     //   83: iload_2
/*   */     //   84: aaload
/*   */     //   85: iload_3
/*   */     //   86: invokevirtual set : (I)V
/*   */     //   89: monitorexit
/*   */     //   90: aload_0
/*   */     //   91: getfield im : B
/*   */     //   94: iflt -> 192
/*   */     //   97: aload_0
/*   */     //   98: invokevirtual r8 : ()Lf/ro;
/*   */     //   101: getfield OK : Lf/qc0;
/*   */     //   104: dup
/*   */     //   105: dup
/*   */     //   106: astore_1
/*   */     //   107: aload_0
/*   */     //   108: dup
/*   */     //   109: dup
/*   */     //   110: getfield pn : B
/*   */     //   113: istore_2
/*   */     //   114: getfield TS : S
/*   */     //   117: istore_3
/*   */     //   118: getfield im : B
/*   */     //   121: istore #4
/*   */     //   123: getfield NH : Ljava/lang/Object;
/*   */     //   126: dup
/*   */     //   127: astore #5
/*   */     //   129: monitorenter
/*   */     //   130: getfield AE : [Lf/Qr;
/*   */     //   133: iload_2
/*   */     //   134: aaload
/*   */     //   135: iload_3
/*   */     //   136: invokevirtual X60 : (S)I
/*   */     //   139: dup
/*   */     //   140: istore #6
/*   */     //   142: iconst_1
/*   */     //   143: iload #4
/*   */     //   145: ishl
/*   */     //   146: dup
/*   */     //   147: istore #4
/*   */     //   149: iand
/*   */     //   150: ifeq -> 159
/*   */     //   153: aload #5
/*   */     //   155: monitorexit
/*   */     //   156: goto -> 192
/*   */     //   159: aload #5
/*   */     //   161: aload_1
/*   */     //   162: getfield AE : [Lf/Qr;
/*   */     //   165: iload_2
/*   */     //   166: aaload
/*   */     //   167: iload #6
/*   */     //   169: iload #4
/*   */     //   171: ior
/*   */     //   172: iload_3
/*   */     //   173: invokevirtual RD : (IS)V
/*   */     //   176: monitorexit
/*   */     //   177: goto -> 192
/*   */     //   180: astore_0
/*   */     //   181: aload_0
/*   */     //   182: aload #5
/*   */     //   184: monitorexit
/*   */     //   185: athrow
/*   */     //   186: astore_0
/*   */     //   187: aload_0
/*   */     //   188: aload #4
/*   */     //   190: monitorexit
/*   */     //   191: athrow
/*   */     //   192: getstatic f/km.MR : Lf/Gp0;
/*   */     //   195: dup
/*   */     //   196: astore_1
/*   */     //   197: ifnull -> 214
/*   */     //   200: aload_1
/*   */     //   201: aload_0
/*   */     //   202: getfield TS : S
/*   */     //   205: istore_0
/*   */     //   206: getfield sH : Lf/Lw;
/*   */     //   209: iload_0
/*   */     //   210: invokevirtual Ye0 : (S)Z
/*   */     //   213: pop
/*   */     //   214: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 11
/*   */     //   #2	-> 20
/*   */     //   #3	-> 23
/*   */     //   #4	-> 27
/*   */     //   #5	-> 52
/*   */     //   #6	-> 58
/*   */     //   #7	-> 91
/*   */     //   #8	-> 101
/*   */     //   #9	-> 110
/*   */     //   #10	-> 123
/*   */     //   #11	-> 129
/*   */     //   #12	-> 190
/*   */     //   #13	-> 192
/*   */     //   #14	-> 206
/*   */     //   #15	-> 210
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   59	68	186	finally
/*   */     //   71	90	186	finally
/*   */     //   130	139	180	finally
/*   */     //   153	167	180	finally
/*   */     //   172	180	180	finally
/*   */     //   181	185	180	finally
/*   */     //   187	191	186	finally
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */