/* 1 */ package f;public final class vj0 extends GS implements Np0 { public static void NM(hm0 paramhm0, kf paramkf) { byte b = 0; byte[] arrayOfByte; while (b < (arrayOfByte = paramhm0.wt).length)
/* 2 */     { if (arrayOfByte[b] < 0) arrayOfByte[b] = 0;  b++; }  paramkf
/* 3 */       .oD(paramhm0).Eh(); }
/*   */ 
/*   */   
/*   */   public final short wc0;
/*   */   
/*   */   public vj0(short paramShort) {
/*   */     this.wc0 = paramShort;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 82;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload #7
/*   */     //   2: aload_2
/*   */     //   3: aload #7
/*   */     //   5: dup
/*   */     //   6: getstatic f/Of.eH : Lf/Of;
/*   */     //   9: aload_0
/*   */     //   10: getfield wc0 : S
/*   */     //   13: invokevirtual On0 : (S)Lf/LPT3;
/*   */     //   16: astore_0
/*   */     //   17: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   20: astore_1
/*   */     //   21: bipush #14
/*   */     //   23: istore_3
/*   */     //   24: getfield AD : Lf/Gp0;
/*   */     //   27: sipush #1010
/*   */     //   30: aload_2
/*   */     //   31: invokevirtual ex : (ILf/hm0;)I
/*   */     //   34: istore #4
/*   */     //   36: iconst_2
/*   */     //   37: anewarray java/lang/String
/*   */     //   40: dup
/*   */     //   41: dup
/*   */     //   42: astore #5
/*   */     //   44: aload_2
/*   */     //   45: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   48: iconst_0
/*   */     //   49: swap
/*   */     //   50: aastore
/*   */     //   51: iconst_1
/*   */     //   52: aload_0
/*   */     //   53: getfield Iu : I
/*   */     //   56: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   59: aastore
/*   */     //   60: iconst_2
/*   */     //   61: aload_1
/*   */     //   62: iload_3
/*   */     //   63: iload #4
/*   */     //   65: aload #5
/*   */     //   67: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   70: astore_0
/*   */     //   71: <illegal opcode> run : (Lf/hm0;Lf/kf;)Ljava/lang/Runnable;
/*   */     //   76: astore_1
/*   */     //   77: aload_0
/*   */     //   78: ldc ''
/*   */     //   80: aload_1
/*   */     //   81: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   84: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */     //   #2	-> 10
/*   */     //   #3	-> 13
/*   */     //   #4	-> 24
/*   */     //   #5	-> 31
/*   */     //   #6	-> 53
/*   */     //   #7	-> 59
/*   */     //   #8	-> 67
/*   */     //   #9	-> 71
/*   */     //   #10	-> 78
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */