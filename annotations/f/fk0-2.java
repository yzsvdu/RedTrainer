/* 1 */ package f;public final class fk0 extends vO { public final byte[] gv() { this.oF0.position(this.Vk); int i; byte[] arrayOfByte = new byte[i = this.public * this.fi0 * this.b70.LPT4 / 8]; this.oF0.get(arrayOfByte); f20 f201; if ((f201 = this.b70) == f20.mY) { arrayOfByte = o40.TD0(arrayOfByte); } else if (f201 == f20.wy) { byte[] arrayOfByte1; int j; byte b; for (arrayOfByte1 = new byte[i * 4], j = 0, b = 0; b < i; ) { j++; arrayOfByte1[j] = (byte)(arrayOfByte[b] & 0x3); int k = j + 1; arrayOfByte1[j] = (byte)(arrayOfByte[b] >> 2 & 0x3); j = k + 1; arrayOfByte1[k] = (byte)(arrayOfByte[b] >> 4 & 0x3); k = j + 1; arrayOfByte1[j] = (byte)(arrayOfByte[b] >> 6 & 0x3); b++; j = k; }  arrayOfByte = arrayOfByte1; }  return arrayOfByte; }
/*   */ 
/*   */   
/*   */   public ByteBuffer oF0;
/*   */   public short rb;
/*   */   public byte Ls0;
/*   */   public short public;
/*   */   public short fi0;
/*   */   public f20 b70;
/*   */   public byte rW;
/*   */   
/*   */   public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: dup
/*   */     //   3: aload_0
/*   */     //   4: aload_1
/*   */     //   5: dup
/*   */     //   6: aload_0
/*   */     //   7: aload_1
/*   */     //   8: aload_0
/*   */     //   9: aload_1
/*   */     //   10: aload_0
/*   */     //   11: aload_1
/*   */     //   12: putfield oF0 : Ljava/nio/ByteBuffer;
/*   */     //   15: invokevirtual getShort : ()S
/*   */     //   18: bipush #8
/*   */     //   20: imul
/*   */     //   21: putfield Vk : I
/*   */     //   24: invokevirtual getShort : ()S
/*   */     //   27: putfield rb : S
/*   */     //   30: invokevirtual get : ()B
/*   */     //   33: pop
/*   */     //   34: invokevirtual get : ()B
/*   */     //   37: putfield Ls0 : B
/*   */     //   40: invokevirtual get : ()B
/*   */     //   43: pop
/*   */     //   44: invokevirtual get : ()B
/*   */     //   47: pop
/*   */     //   48: getfield rb : S
/*   */     //   51: dup
/*   */     //   52: aload_0
/*   */     //   53: swap
/*   */     //   54: bipush #13
/*   */     //   56: ishr
/*   */     //   57: iconst_1
/*   */     //   58: iand
/*   */     //   59: i2b
/*   */     //   60: putfield rW : B
/*   */     //   63: bipush #10
/*   */     //   65: ishr
/*   */     //   66: bipush #7
/*   */     //   68: iand
/*   */     //   69: i2b
/*   */     //   70: istore_1
/*   */     //   71: invokestatic values : ()[Lf/f20;
/*   */     //   74: dup
/*   */     //   75: astore_3
/*   */     //   76: arraylength
/*   */     //   77: istore #4
/*   */     //   79: iconst_0
/*   */     //   80: istore #5
/*   */     //   82: iload #5
/*   */     //   84: iload #4
/*   */     //   86: if_icmpge -> 112
/*   */     //   89: aload_3
/*   */     //   90: iload #5
/*   */     //   92: aaload
/*   */     //   93: dup
/*   */     //   94: astore #6
/*   */     //   96: getfield Io0 : B
/*   */     //   99: iload_1
/*   */     //   100: if_icmpne -> 106
/*   */     //   103: goto -> 117
/*   */     //   106: iinc #5, 1
/*   */     //   109: goto -> 82
/*   */     //   112: getstatic f/f20.yo : Lf/f20;
/*   */     //   115: astore #6
/*   */     //   117: aload_0
/*   */     //   118: dup
/*   */     //   119: dup2
/*   */     //   120: aload #6
/*   */     //   122: putfield b70 : Lf/f20;
/*   */     //   125: getfield rb : S
/*   */     //   128: bipush #7
/*   */     //   130: ishr
/*   */     //   131: bipush #7
/*   */     //   133: iand
/*   */     //   134: bipush #8
/*   */     //   136: swap
/*   */     //   137: ishl
/*   */     //   138: invokestatic abs : (I)I
/*   */     //   141: i2s
/*   */     //   142: putfield fi0 : S
/*   */     //   145: getfield rb : S
/*   */     //   148: iconst_4
/*   */     //   149: ishr
/*   */     //   150: bipush #7
/*   */     //   152: iand
/*   */     //   153: bipush #8
/*   */     //   155: swap
/*   */     //   156: ishl
/*   */     //   157: invokestatic abs : (I)I
/*   */     //   160: i2s
/*   */     //   161: dup
/*   */     //   162: aload_0
/*   */     //   163: swap
/*   */     //   164: putfield public : S
/*   */     //   167: ifne -> 197
/*   */     //   170: aload_0
/*   */     //   171: getfield Ls0 : B
/*   */     //   174: iconst_3
/*   */     //   175: iand
/*   */     //   176: iconst_2
/*   */     //   177: if_icmpeq -> 190
/*   */     //   180: aload_0
/*   */     //   181: sipush #256
/*   */     //   184: putfield public : S
/*   */     //   187: goto -> 197
/*   */     //   190: aload_0
/*   */     //   191: sipush #512
/*   */     //   194: putfield public : S
/*   */     //   197: aload_0
/*   */     //   198: getfield fi0 : S
/*   */     //   201: ifne -> 233
/*   */     //   204: aload_0
/*   */     //   205: getfield Ls0 : B
/*   */     //   208: iconst_4
/*   */     //   209: ishr
/*   */     //   210: iconst_3
/*   */     //   211: iand
/*   */     //   212: iconst_2
/*   */     //   213: if_icmpeq -> 226
/*   */     //   216: aload_0
/*   */     //   217: sipush #256
/*   */     //   220: putfield fi0 : S
/*   */     //   223: goto -> 233
/*   */     //   226: aload_0
/*   */     //   227: sipush #512
/*   */     //   230: putfield fi0 : S
/*   */     //   233: aload_0
/*   */     //   234: getfield b70 : Lf/f20;
/*   */     //   237: getstatic f/f20.Cr0 : Lf/f20;
/*   */     //   240: if_acmpne -> 258
/*   */     //   243: aload_0
/*   */     //   244: dup
/*   */     //   245: getfield Vk : I
/*   */     //   248: aload_2
/*   */     //   249: iconst_1
/*   */     //   250: iaload
/*   */     //   251: iadd
/*   */     //   252: putfield Vk : I
/*   */     //   255: goto -> 270
/*   */     //   258: aload_0
/*   */     //   259: dup
/*   */     //   260: getfield Vk : I
/*   */     //   263: aload_2
/*   */     //   264: iconst_0
/*   */     //   265: iaload
/*   */     //   266: iadd
/*   */     //   267: putfield Vk : I
/*   */     //   270: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 71
/*   */     //   #2	-> 122
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */