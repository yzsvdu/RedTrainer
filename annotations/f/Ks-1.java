/* 1 */ package f;public final class Ks extends GS implements Np0 { public static void JK0(kf paramkf, hm0 paramhm0) { this(paramhm0); LV lV; ly0 ly0; this((byte)0, ly0); paramkf.YP
/* 2 */       .add(lV); byte[] arrayOfByte;
/*   */     byte b;
/* 4 */     for (arrayOfByte = Arrays.copyOf(paramhm0.wt, paramhm0.wt.length), b = 0; b < arrayOfByte.length; ) { arrayOfByte[b] = (byte)(arrayOfByte[b] * -1); b++; }  paramhm0
/* 5 */       .wt = arrayOfByte;
/* 6 */     paramkf.oD(paramhm0).Eh(); }
/*   */ 
/*   */   
/*   */   public final byte YG0() {
/*   */     return -28;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload #7
/*   */     //   2: dup
/*   */     //   3: aload_2
/*   */     //   4: invokevirtual coM1 : ()Ljava/lang/String;
/*   */     //   7: ldc 200522
/*   */     //   9: swap
/*   */     //   10: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   13: astore_0
/*   */     //   14: aload_2
/*   */     //   15: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   20: astore_1
/*   */     //   21: aload_0
/*   */     //   22: ldc ''
/*   */     //   24: aload_1
/*   */     //   25: invokevirtual r00 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   28: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 22
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */