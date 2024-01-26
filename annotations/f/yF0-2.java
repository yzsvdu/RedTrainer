/* 1 */ package f;public abstract class yF0 extends EU { public final int IR(int paramInt) { int i = paramInt & Integer.MAX_VALUE; this.PI = false; int j; byte b; if ((b = this.JO[j = i % this.JO.length]) == 0) { this.PI = true; H30(j, paramInt); return j; }  if (b == 1 && this.bG[j] == paramInt) return -j - 1;  int k;
/* 2 */     i = Ck.Zf(k = this.bG.length, 2, i, 1); int m = -1, n = j; while (true) { if (b == 2 && m == -1) m = n;  int i1; if ((i1 = n - i) < 0) i1 += k; 
/* 3 */       if ((n = this.JO[i1]) == 0) { if (m != -1) H30(m, paramInt);  this.PI = true; H30(i1, paramInt); m = i1; } else if (n == 1 && this.bG[i1] == paramInt) { m = -i1 - 1; } else { if (i1 == j) { if (m == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");  } else { i1 = n = i1; continue; }  H30(m, paramInt); }  return m; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient int[] bG;
/*   */   public int Cq0 = 0;
/*   */   public short Oc0 = 0;
/*   */   public boolean PI;
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     this.bG = new int[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public void Id(int paramInt) {
/*   */     this.bG[paramInt] = this.Cq0;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int ls(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield JO : [B
/*   */     //   4: dup
/*   */     //   5: iload_1
/*   */     //   6: swap
/*   */     //   7: aload_0
/*   */     //   8: getfield bG : [I
/*   */     //   11: astore_2
/*   */     //   12: arraylength
/*   */     //   13: istore_3
/*   */     //   14: ldc 2147483647
/*   */     //   16: iand
/*   */     //   17: dup
/*   */     //   18: istore #4
/*   */     //   20: iload_3
/*   */     //   21: irem
/*   */     //   22: dup
/*   */     //   23: istore_3
/*   */     //   24: baload
/*   */     //   25: dup
/*   */     //   26: istore #5
/*   */     //   28: ifne -> 33
/*   */     //   31: iconst_m1
/*   */     //   32: ireturn
/*   */     //   33: iload #5
/*   */     //   35: iconst_1
/*   */     //   36: if_icmpne -> 48
/*   */     //   39: aload_2
/*   */     //   40: iload_3
/*   */     //   41: iaload
/*   */     //   42: iload_1
/*   */     //   43: if_icmpne -> 48
/*   */     //   46: iload_3
/*   */     //   47: ireturn
/*   */     //   48: aload_2
/*   */     //   49: arraylength
/*   */     //   50: dup
/*   */     //   51: istore_2
/*   */     //   52: iconst_2
/*   */     //   53: iload #4
/*   */     //   55: iconst_1
/*   */     //   56: invokestatic Zf : (IIII)I
/*   */     //   59: istore #4
/*   */     //   61: iload_3
/*   */     //   62: istore #5
/*   */     //   64: iload #5
/*   */     //   66: iload #4
/*   */     //   68: isub
/*   */     //   69: dup
/*   */     //   70: istore #5
/*   */     //   72: ifge -> 81
/*   */     //   75: iload #5
/*   */     //   77: iload_2
/*   */     //   78: iadd
/*   */     //   79: istore #5
/*   */     //   81: aload_0
/*   */     //   82: getfield JO : [B
/*   */     //   85: iload #5
/*   */     //   87: baload
/*   */     //   88: dup
/*   */     //   89: istore #6
/*   */     //   91: ifne -> 97
/*   */     //   94: goto -> 123
/*   */     //   97: iload_1
/*   */     //   98: aload_0
/*   */     //   99: getfield bG : [I
/*   */     //   102: iload #5
/*   */     //   104: iaload
/*   */     //   105: if_icmpne -> 117
/*   */     //   108: iload #6
/*   */     //   110: iconst_2
/*   */     //   111: if_icmpeq -> 117
/*   */     //   114: goto -> 126
/*   */     //   117: iload #5
/*   */     //   119: iload_3
/*   */     //   120: if_icmpne -> 64
/*   */     //   123: iconst_m1
/*   */     //   124: istore #5
/*   */     //   126: iload #5
/*   */     //   128: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 49
/*   */     //   #2	-> 56
/*   */     //   #3	-> 82
/*   */   }
/*   */   
/*   */   public final void H30(int paramInt1, int paramInt2) {
/*   */     this.bG[paramInt1] = paramInt2;
/*   */     this.JO[paramInt1] = 1;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeInt(this.Cq0);
/*   */     paramObjectOutput.writeShort(this.Oc0);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     this.Cq0 = paramObjectInput.readInt();
/*   */     this.Oc0 = paramObjectInput.readShort();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yF0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */