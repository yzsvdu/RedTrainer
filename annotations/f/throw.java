/* 1 */ package f;public final class throw extends fZ { public final boolean i2() { return 
/* 2 */       (zm0.u20 - this.MC > (this.J4 + 400 + this.dy0)); }
/*   */ 
/*   */   
/*   */   public final long MC = zm0.zg();
/*   */   public final int dy0;
/*   */   public final int J4;
/*   */   public final xr0 DI;
/*   */   
/*   */   public throw(int paramInt1, int paramInt2, xr0 paramxr0) {
/*   */     this.dy0 = paramInt1;
/*   */     this.J4 = paramInt2;
/*   */     this.DI = paramxr0;
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
/*   */     //   12: getfield MC : J
/*   */     //   15: lsub
/*   */     //   16: lstore #5
/*   */     //   18: getfield dy0 : I
/*   */     //   21: dup
/*   */     //   22: istore #7
/*   */     //   24: i2l
/*   */     //   25: lload #5
/*   */     //   27: lcmp
/*   */     //   28: ifle -> 32
/*   */     //   31: return
/*   */     //   32: lload #5
/*   */     //   34: aload_0
/*   */     //   35: getfield J4 : I
/*   */     //   38: iload #7
/*   */     //   40: iadd
/*   */     //   41: dup
/*   */     //   42: istore #7
/*   */     //   44: i2l
/*   */     //   45: lcmp
/*   */     //   46: ifle -> 216
/*   */     //   49: lload #5
/*   */     //   51: iload #7
/*   */     //   53: bipush #100
/*   */     //   55: iadd
/*   */     //   56: i2l
/*   */     //   57: lcmp
/*   */     //   58: ifge -> 68
/*   */     //   61: iload_2
/*   */     //   62: iconst_2
/*   */     //   63: istore_0
/*   */     //   64: ifne -> 180
/*   */     //   67: return
/*   */     //   68: lload #5
/*   */     //   70: iload #7
/*   */     //   72: sipush #200
/*   */     //   75: iadd
/*   */     //   76: i2l
/*   */     //   77: lcmp
/*   */     //   78: ifge -> 158
/*   */     //   81: iload_2
/*   */     //   82: iconst_3
/*   */     //   83: istore_2
/*   */     //   84: ifne -> 88
/*   */     //   87: return
/*   */     //   88: aload_0
/*   */     //   89: getfield DI : Lf/xr0;
/*   */     //   92: invokevirtual Ij : ()S
/*   */     //   95: sipush #519
/*   */     //   98: if_icmpeq -> 114
/*   */     //   101: aload_0
/*   */     //   102: getfield DI : Lf/xr0;
/*   */     //   105: invokevirtual Ij : ()S
/*   */     //   108: sipush #522
/*   */     //   111: if_icmpne -> 153
/*   */     //   114: aload_0
/*   */     //   115: getfield DI : Lf/xr0;
/*   */     //   118: invokevirtual Ij : ()S
/*   */     //   121: sipush #519
/*   */     //   124: if_icmpne -> 135
/*   */     //   127: sipush #518
/*   */     //   130: istore #5
/*   */     //   132: goto -> 140
/*   */     //   135: sipush #530
/*   */     //   138: istore #5
/*   */     //   140: aload_0
/*   */     //   141: getfield DI : Lf/xr0;
/*   */     //   144: dup
/*   */     //   145: invokevirtual F80 : ()B
/*   */     //   148: iload #5
/*   */     //   150: invokevirtual z0 : (BS)V
/*   */     //   153: iload_2
/*   */     //   154: istore_0
/*   */     //   155: goto -> 180
/*   */     //   158: lload #5
/*   */     //   160: iload #7
/*   */     //   162: sipush #300
/*   */     //   165: iadd
/*   */     //   166: i2l
/*   */     //   167: lcmp
/*   */     //   168: ifge -> 178
/*   */     //   171: iload_2
/*   */     //   172: iconst_4
/*   */     //   173: istore_0
/*   */     //   174: ifne -> 180
/*   */     //   177: return
/*   */     //   178: iconst_4
/*   */     //   179: istore_0
/*   */     //   180: aload_1
/*   */     //   181: iload #4
/*   */     //   183: iload_3
/*   */     //   184: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   187: iconst_1
/*   */     //   188: sipush #252
/*   */     //   191: iconst_0
/*   */     //   192: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   195: iload_0
/*   */     //   196: invokevirtual LT : (I)Lf/U70;
/*   */     //   199: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   202: astore_0
/*   */     //   203: i2f
/*   */     //   204: fstore_1
/*   */     //   205: i2f
/*   */     //   206: fstore_2
/*   */     //   207: aload_0
/*   */     //   208: fload_1
/*   */     //   209: fload_2
/*   */     //   210: invokevirtual VI : (Lcom/badlogic/gdx/graphics/Texture;FF)V
/*   */     //   213: goto -> 253
/*   */     //   216: iload_2
/*   */     //   217: ifne -> 253
/*   */     //   220: aload_1
/*   */     //   221: iload #4
/*   */     //   223: iload_3
/*   */     //   224: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   227: iconst_1
/*   */     //   228: sipush #252
/*   */     //   231: iconst_0
/*   */     //   232: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   235: iconst_1
/*   */     //   236: invokevirtual LT : (I)Lf/U70;
/*   */     //   239: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   242: astore_0
/*   */     //   243: i2f
/*   */     //   244: fstore_1
/*   */     //   245: i2f
/*   */     //   246: fstore_2
/*   */     //   247: aload_0
/*   */     //   248: fload_1
/*   */     //   249: fload_2
/*   */     //   250: invokevirtual VI : (Lcom/badlogic/gdx/graphics/Texture;FF)V
/*   */     //   253: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 8
/*   */     //   #2	-> 12
/*   */     //   #3	-> 184
/*   */     //   #4	-> 192
/*   */     //   #5	-> 196
/*   */     //   #6	-> 224
/*   */     //   #7	-> 232
/*   */     //   #8	-> 236
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/throw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */