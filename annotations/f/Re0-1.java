/* 1 */ package f;public final class Re0 extends fZ { public final boolean i2() { return 
/* 2 */       (zm0.u20 - this.Cg0 > 750L); }
/*   */ 
/*   */   
/*   */   public final long Cg0 = zm0.zg();
/*   */   public final byte JK0;
/*   */   public final byte JT;
/*   */   public final boolean Aw0;
/*   */   
/*   */   public Re0(byte paramByte1, byte paramByte2, boolean paramBoolean) {
/*   */     this.JK0 = paramByte1;
/*   */     this.JT = paramByte2;
/*   */     this.Aw0 = paramBoolean;
/*   */   }
/*   */   
/*   */   public final void tU(tH paramtH, int paramInt1, int paramInt2, int paramInt3) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: ifeq -> 5
/*   */     //   4: return
/*   */     //   5: aload_0
/*   */     //   6: getfield Aw0 : Z
/*   */     //   9: ifeq -> 223
/*   */     //   12: aload_0
/*   */     //   13: iconst_0
/*   */     //   14: istore_2
/*   */     //   15: iconst_0
/*   */     //   16: istore #5
/*   */     //   18: getfield JT : B
/*   */     //   21: dup
/*   */     //   22: istore #6
/*   */     //   24: aload_0
/*   */     //   25: getfield JK0 : B
/*   */     //   28: dup
/*   */     //   29: istore_0
/*   */     //   30: if_icmpne -> 55
/*   */     //   33: iload_0
/*   */     //   34: iconst_1
/*   */     //   35: if_icmpeq -> 50
/*   */     //   38: iload_0
/*   */     //   39: ifne -> 45
/*   */     //   42: goto -> 50
/*   */     //   45: iconst_1
/*   */     //   46: istore_2
/*   */     //   47: goto -> 157
/*   */     //   50: iconst_2
/*   */     //   51: istore_2
/*   */     //   52: goto -> 157
/*   */     //   55: iload #6
/*   */     //   57: tableswitch default -> 88, 0 -> 137, 1 -> 114, 2 -> 106, 3 -> 91
/*   */     //   88: goto -> 157
/*   */     //   91: iload_0
/*   */     //   92: iconst_1
/*   */     //   93: if_icmpne -> 99
/*   */     //   96: goto -> 152
/*   */     //   99: iload_0
/*   */     //   100: ifne -> 157
/*   */     //   103: goto -> 129
/*   */     //   106: iload_0
/*   */     //   107: iconst_1
/*   */     //   108: if_icmpne -> 119
/*   */     //   111: goto -> 142
/*   */     //   114: iload_0
/*   */     //   115: iconst_3
/*   */     //   116: if_icmpne -> 124
/*   */     //   119: iconst_0
/*   */     //   120: istore_2
/*   */     //   121: goto -> 157
/*   */     //   124: iload_0
/*   */     //   125: iconst_2
/*   */     //   126: if_icmpne -> 157
/*   */     //   129: iconst_0
/*   */     //   130: istore_2
/*   */     //   131: iconst_1
/*   */     //   132: istore #5
/*   */     //   134: goto -> 157
/*   */     //   137: iload_0
/*   */     //   138: iconst_3
/*   */     //   139: if_icmpne -> 147
/*   */     //   142: iconst_3
/*   */     //   143: istore_2
/*   */     //   144: goto -> 157
/*   */     //   147: iload_0
/*   */     //   148: iconst_2
/*   */     //   149: if_icmpne -> 157
/*   */     //   152: iconst_3
/*   */     //   153: istore_2
/*   */     //   154: iconst_1
/*   */     //   155: istore #5
/*   */     //   157: aload_1
/*   */     //   158: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   161: iconst_0
/*   */     //   162: sipush #179
/*   */     //   165: iconst_0
/*   */     //   166: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   169: iload_2
/*   */     //   170: invokevirtual LT : (I)Lf/U70;
/*   */     //   173: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   176: dup
/*   */     //   177: dup
/*   */     //   178: dup2
/*   */     //   179: iload #4
/*   */     //   181: iload_3
/*   */     //   182: i2f
/*   */     //   183: fstore_0
/*   */     //   184: i2f
/*   */     //   185: fstore_1
/*   */     //   186: invokevirtual getWidth : ()I
/*   */     //   189: i2f
/*   */     //   190: fstore_2
/*   */     //   191: invokevirtual getHeight : ()I
/*   */     //   194: i2f
/*   */     //   195: fstore_3
/*   */     //   196: invokevirtual getWidth : ()I
/*   */     //   199: istore #4
/*   */     //   201: invokevirtual getHeight : ()I
/*   */     //   204: istore #6
/*   */     //   206: fload_0
/*   */     //   207: fload_1
/*   */     //   208: fload_2
/*   */     //   209: fload_3
/*   */     //   210: iload #4
/*   */     //   212: iload #6
/*   */     //   214: iload #5
/*   */     //   216: iconst_0
/*   */     //   217: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*   */     //   220: goto -> 340
/*   */     //   223: aload_0
/*   */     //   224: getstatic f/G00.Av0 : Lf/G00;
/*   */     //   227: iconst_0
/*   */     //   228: sipush #163
/*   */     //   231: iconst_0
/*   */     //   232: invokevirtual Cx0 : (BIZ)Lf/LJ;
/*   */     //   235: astore_2
/*   */     //   236: getfield JK0 : B
/*   */     //   239: dup
/*   */     //   240: istore #5
/*   */     //   242: iconst_1
/*   */     //   243: if_icmpeq -> 260
/*   */     //   246: iload #5
/*   */     //   248: ifne -> 254
/*   */     //   251: goto -> 260
/*   */     //   254: iconst_1
/*   */     //   255: istore #5
/*   */     //   257: goto -> 263
/*   */     //   260: iconst_0
/*   */     //   261: istore #5
/*   */     //   263: aload_0
/*   */     //   264: aload_2
/*   */     //   265: iload #5
/*   */     //   267: invokevirtual LT : (I)Lf/U70;
/*   */     //   270: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   273: dup
/*   */     //   274: dup
/*   */     //   275: dup2
/*   */     //   276: astore_0
/*   */     //   277: iload #4
/*   */     //   279: iload_3
/*   */     //   280: i2f
/*   */     //   281: fstore_2
/*   */     //   282: i2f
/*   */     //   283: fstore_3
/*   */     //   284: invokevirtual getWidth : ()I
/*   */     //   287: i2f
/*   */     //   288: fstore #4
/*   */     //   290: invokevirtual getHeight : ()I
/*   */     //   293: i2f
/*   */     //   294: fstore #5
/*   */     //   296: invokevirtual getWidth : ()I
/*   */     //   299: istore #6
/*   */     //   301: invokevirtual getHeight : ()I
/*   */     //   304: istore #7
/*   */     //   306: getfield JK0 : B
/*   */     //   309: iconst_3
/*   */     //   310: if_icmpne -> 319
/*   */     //   313: iconst_1
/*   */     //   314: istore #8
/*   */     //   316: goto -> 322
/*   */     //   319: iconst_0
/*   */     //   320: istore #8
/*   */     //   322: aload_1
/*   */     //   323: aload_0
/*   */     //   324: fload_2
/*   */     //   325: fload_3
/*   */     //   326: fload #4
/*   */     //   328: fload #5
/*   */     //   330: iload #6
/*   */     //   332: iload #7
/*   */     //   334: iload #8
/*   */     //   336: iconst_0
/*   */     //   337: invokevirtual P10 : (Lcom/badlogic/gdx/graphics/Texture;FFFFIIZZ)V
/*   */     //   340: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 158
/*   */     //   #2	-> 166
/*   */     //   #3	-> 170
/*   */     //   #4	-> 224
/*   */     //   #5	-> 232
/*   */     //   #6	-> 236
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Re0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */