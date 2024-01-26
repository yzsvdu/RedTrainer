/* 1 */ package f;public final class gZ implements q5 { public static void y90(fv0 paramfv0, int paramInt) { R8 r8 = km.u4; paramInt = paramfv0.y60; short s = (short)paramInt; r8
/* 2 */       .e20
/* 3 */       .W3(new nS(paramInt, s)); }
/*   */ 
/*   */   
/*   */   public gZ(String paramString, fv0 paramfv0) {}
/*   */   
/*   */   public final void AB0(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: iload_1
/*   */     //   1: iconst_1
/*   */     //   2: if_icmple -> 94
/*   */     //   5: iconst_3
/*   */     //   6: anewarray java/lang/String
/*   */     //   9: dup
/*   */     //   10: dup
/*   */     //   11: astore_2
/*   */     //   12: aload_0
/*   */     //   13: aload_2
/*   */     //   14: iload_1
/*   */     //   15: invokestatic toString : (I)Ljava/lang/String;
/*   */     //   18: iconst_0
/*   */     //   19: swap
/*   */     //   20: aastore
/*   */     //   21: getfield Jk0 : Ljava/lang/String;
/*   */     //   24: iconst_1
/*   */     //   25: swap
/*   */     //   26: aastore
/*   */     //   27: ldc '$'
/*   */     //   29: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   32: invokestatic getInstance : ()Ljava/text/NumberFormat;
/*   */     //   35: aload_0
/*   */     //   36: getfield Br0 : Lf/fv0;
/*   */     //   39: getfield B90 : I
/*   */     //   42: i2l
/*   */     //   43: iload_1
/*   */     //   44: i2l
/*   */     //   45: lmul
/*   */     //   46: invokevirtual format : (J)Ljava/lang/String;
/*   */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   52: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   55: iconst_2
/*   */     //   56: swap
/*   */     //   57: aastore
/*   */     //   58: sipush #8039
/*   */     //   61: aload_2
/*   */     //   62: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   65: astore_2
/*   */     //   66: getstatic f/js.vu0 : Lf/js;
/*   */     //   69: new f/h70
/*   */     //   72: dup
/*   */     //   73: aload_2
/*   */     //   74: aload_0
/*   */     //   75: getfield Br0 : Lf/fv0;
/*   */     //   78: iload_1
/*   */     //   79: <illegal opcode> run : (Lf/fv0;I)Ljava/lang/Runnable;
/*   */     //   84: aconst_null
/*   */     //   85: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Lf/JG0;)V
/*   */     //   88: invokevirtual uh : (Lf/h70;)V
/*   */     //   91: goto -> 125
/*   */     //   94: iload_1
/*   */     //   95: aload_0
/*   */     //   96: getstatic f/km.u4 : Lf/R8;
/*   */     //   99: astore_0
/*   */     //   100: getfield Br0 : Lf/fv0;
/*   */     //   103: getfield y60 : I
/*   */     //   106: istore_1
/*   */     //   107: i2s
/*   */     //   108: istore_2
/*   */     //   109: aload_0
/*   */     //   110: getfield e20 : Lf/c4;
/*   */     //   113: new f/nS
/*   */     //   116: dup
/*   */     //   117: iload_1
/*   */     //   118: iload_2
/*   */     //   119: invokespecial <init> : (IS)V
/*   */     //   122: invokevirtual W3 : (Lf/Bi;)V
/*   */     //   125: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 27
/*   */     //   #2	-> 32
/*   */     //   #3	-> 39
/*   */     //   #4	-> 46
/*   */     //   #5	-> 66
/*   */     //   #6	-> 69
/*   */     //   #7	-> 103
/*   */     //   #8	-> 110
/*   */     //   #9	-> 113
/*   */   }
/*   */   
/*   */   public final void run() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */