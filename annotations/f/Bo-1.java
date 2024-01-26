/* 1 */ package f;public final class Bo extends fZ { public final boolean i2() { return 
/* 2 */       (zm0.u20 - this.tH0 > (this.nG * 4 + this.nI0 + this.wh)); }
/*   */ 
/*   */   
/*   */   public final long tH0 = zm0.zg();
/*   */   
/*   */   public final int wh;
/*   */   public final int nI0;
/*   */   public final byte Mf0;
/*   */   public final int Zc0;
/*   */   public int nG = 100;
/*   */   
/*   */   public Bo(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.wh = paramInt1;
/*   */     this.nI0 = paramInt2;
/*   */     this.Mf0 = paramByte;
/*   */     this.Zc0 = paramInt3;
/*   */   }
/*   */   
/*   */   public final void tU(tH paramtH, int paramInt1, int paramInt2, int paramInt3) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: bipush #10
/*   */     //   3: if_icmpne -> 7
/*   */     //   6: return
/*   */     //   7: aload_0
/*   */     //   8: getstatic f/zm0.u20 : J
/*   */     //   11: aload_0
/*   */     //   12: getfield tH0 : J
/*   */     //   15: lsub
/*   */     //   16: lstore #5
/*   */     //   18: getfield wh : I
/*   */     //   21: dup
/*   */     //   22: istore #7
/*   */     //   24: i2l
/*   */     //   25: lload #5
/*   */     //   27: lcmp
/*   */     //   28: ifle -> 32
/*   */     //   31: return
/*   */     //   32: lload #5
/*   */     //   34: aload_0
/*   */     //   35: getfield nI0 : I
/*   */     //   38: iload #7
/*   */     //   40: iadd
/*   */     //   41: dup
/*   */     //   42: istore #7
/*   */     //   44: i2l
/*   */     //   45: lcmp
/*   */     //   46: ifle -> 160
/*   */     //   49: lload #5
/*   */     //   51: iload #7
/*   */     //   53: aload_0
/*   */     //   54: getfield nG : I
/*   */     //   57: dup
/*   */     //   58: istore #8
/*   */     //   60: iadd
/*   */     //   61: i2l
/*   */     //   62: lcmp
/*   */     //   63: ifge -> 73
/*   */     //   66: iload_2
/*   */     //   67: iconst_2
/*   */     //   68: istore_2
/*   */     //   69: ifne -> 117
/*   */     //   72: return
/*   */     //   73: lload #5
/*   */     //   75: iload #8
/*   */     //   77: iconst_2
/*   */     //   78: imul
/*   */     //   79: iload #7
/*   */     //   81: iadd
/*   */     //   82: i2l
/*   */     //   83: lcmp
/*   */     //   84: ifge -> 94
/*   */     //   87: iload_2
/*   */     //   88: iconst_3
/*   */     //   89: istore_2
/*   */     //   90: ifne -> 117
/*   */     //   93: return
/*   */     //   94: lload #5
/*   */     //   96: iload #8
/*   */     //   98: iconst_3
/*   */     //   99: imul
/*   */     //   100: iload #7
/*   */     //   102: iadd
/*   */     //   103: i2l
/*   */     //   104: lcmp
/*   */     //   105: ifge -> 115
/*   */     //   108: iload_2
/*   */     //   109: iconst_4
/*   */     //   110: istore_2
/*   */     //   111: ifne -> 117
/*   */     //   114: return
/*   */     //   115: iconst_0
/*   */     //   116: istore_2
/*   */     //   117: aload_1
/*   */     //   118: iload #4
/*   */     //   120: iload_3
/*   */     //   121: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   124: aload_0
/*   */     //   125: dup
/*   */     //   126: getfield Mf0 : B
/*   */     //   129: istore_0
/*   */     //   130: getfield Zc0 : I
/*   */     //   133: iload_0
/*   */     //   134: swap
/*   */     //   135: iconst_0
/*   */     //   136: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   139: iload_2
/*   */     //   140: invokevirtual LT : (I)Lf/U70;
/*   */     //   143: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   146: astore_0
/*   */     //   147: i2f
/*   */     //   148: fstore_1
/*   */     //   149: i2f
/*   */     //   150: fstore_2
/*   */     //   151: aload_0
/*   */     //   152: fload_1
/*   */     //   153: fload_2
/*   */     //   154: invokevirtual VI : (Lcom/badlogic/gdx/graphics/Texture;FF)V
/*   */     //   157: goto -> 204
/*   */     //   160: iload_2
/*   */     //   161: ifne -> 204
/*   */     //   164: aload_1
/*   */     //   165: iload #4
/*   */     //   167: iload_3
/*   */     //   168: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   171: aload_0
/*   */     //   172: dup
/*   */     //   173: getfield Mf0 : B
/*   */     //   176: istore_0
/*   */     //   177: getfield Zc0 : I
/*   */     //   180: iload_0
/*   */     //   181: swap
/*   */     //   182: iconst_0
/*   */     //   183: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   186: iconst_1
/*   */     //   187: invokevirtual LT : (I)Lf/U70;
/*   */     //   190: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   193: astore_0
/*   */     //   194: i2f
/*   */     //   195: fstore_1
/*   */     //   196: i2f
/*   */     //   197: fstore_2
/*   */     //   198: aload_0
/*   */     //   199: fload_1
/*   */     //   200: fload_2
/*   */     //   201: invokevirtual VI : (Lcom/badlogic/gdx/graphics/Texture;FF)V
/*   */     //   204: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 8
/*   */     //   #2	-> 12
/*   */     //   #3	-> 121
/*   */     //   #4	-> 126
/*   */     //   #5	-> 136
/*   */     //   #6	-> 140
/*   */     //   #7	-> 168
/*   */     //   #8	-> 173
/*   */     //   #9	-> 183
/*   */     //   #10	-> 187
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */