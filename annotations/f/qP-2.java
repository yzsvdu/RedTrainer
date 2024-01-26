/* 1 */ package f;public abstract class qP extends EU { public final int tw(long paramLong) { int i = Yr0.H50(paramLong) & Integer.MAX_VALUE; this.kO = false; int j; byte b; if ((b = this.JO[j = i % this.JO.length]) == 0) { this.kO = true; k1(j, paramLong); return j; }  if (b == 1 && this.hh[j] == paramLong) return -j - 1;  int k;
/* 2 */     i = Ck.Zf(k = this.hh.length, 2, i, 1); int m = -1, n = j; while (true) { if (b == 2 && m == -1) m = n;  int i1; if ((i1 = n - i) < 0) i1 += k; 
/* 3 */       if ((n = this.JO[i1]) == 0) { if (m != -1) k1(m, paramLong);  this.kO = true; k1(i1, paramLong); m = i1; } else if (n == 1 && this.hh[i1] == paramLong) { m = -i1 - 1; } else { if (i1 == j) { if (m == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");  } else { i1 = n = i1; continue; }  k1(m, paramLong); }  return m; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient long[] hh;
/*   */   public long ny = 0L;
/*   */   public int Ux = 0;
/*   */   public boolean kO;
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     this.hh = new long[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public void Id(int paramInt) {
/*   */     this.hh[paramInt] = this.ny;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int wI(long paramLong) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield JO : [B
/*   */     //   4: dup
/*   */     //   5: astore_3
/*   */     //   6: lload_1
/*   */     //   7: aload_3
/*   */     //   8: aload_0
/*   */     //   9: getfield hh : [J
/*   */     //   12: astore_3
/*   */     //   13: arraylength
/*   */     //   14: istore #4
/*   */     //   16: invokestatic H50 : (J)I
/*   */     //   19: ldc 2147483647
/*   */     //   21: iand
/*   */     //   22: dup
/*   */     //   23: istore #5
/*   */     //   25: iload #4
/*   */     //   27: irem
/*   */     //   28: dup
/*   */     //   29: istore #4
/*   */     //   31: baload
/*   */     //   32: dup
/*   */     //   33: istore #6
/*   */     //   35: ifne -> 40
/*   */     //   38: iconst_m1
/*   */     //   39: ireturn
/*   */     //   40: iload #6
/*   */     //   42: iconst_1
/*   */     //   43: if_icmpne -> 58
/*   */     //   46: aload_3
/*   */     //   47: iload #4
/*   */     //   49: laload
/*   */     //   50: lload_1
/*   */     //   51: lcmp
/*   */     //   52: ifne -> 58
/*   */     //   55: iload #4
/*   */     //   57: ireturn
/*   */     //   58: aload_0
/*   */     //   59: getfield hh : [J
/*   */     //   62: arraylength
/*   */     //   63: dup
/*   */     //   64: istore_3
/*   */     //   65: iconst_2
/*   */     //   66: iload #5
/*   */     //   68: iconst_1
/*   */     //   69: invokestatic Zf : (IIII)I
/*   */     //   72: istore #5
/*   */     //   74: iload #4
/*   */     //   76: istore #6
/*   */     //   78: iload #6
/*   */     //   80: iload #5
/*   */     //   82: isub
/*   */     //   83: dup
/*   */     //   84: istore #6
/*   */     //   86: ifge -> 95
/*   */     //   89: iload #6
/*   */     //   91: iload_3
/*   */     //   92: iadd
/*   */     //   93: istore #6
/*   */     //   95: aload_0
/*   */     //   96: getfield JO : [B
/*   */     //   99: iload #6
/*   */     //   101: baload
/*   */     //   102: dup
/*   */     //   103: istore #7
/*   */     //   105: ifne -> 111
/*   */     //   108: goto -> 139
/*   */     //   111: lload_1
/*   */     //   112: aload_0
/*   */     //   113: getfield hh : [J
/*   */     //   116: iload #6
/*   */     //   118: laload
/*   */     //   119: lcmp
/*   */     //   120: ifne -> 132
/*   */     //   123: iload #7
/*   */     //   125: iconst_2
/*   */     //   126: if_icmpeq -> 132
/*   */     //   129: goto -> 142
/*   */     //   132: iload #6
/*   */     //   134: iload #4
/*   */     //   136: if_icmpne -> 78
/*   */     //   139: iconst_m1
/*   */     //   140: istore #6
/*   */     //   142: iload #6
/*   */     //   144: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 59
/*   */     //   #2	-> 69
/*   */     //   #3	-> 96
/*   */   }
/*   */   
/*   */   public final void k1(int paramInt, long paramLong) {
/*   */     this.hh[paramInt] = paramLong;
/*   */     this.JO[paramInt] = 1;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeLong(this.ny);
/*   */     paramObjectOutput.writeInt(this.Ux);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     this.ny = paramObjectInput.readLong();
/*   */     this.Ux = paramObjectInput.readInt();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qP.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */