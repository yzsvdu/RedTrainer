/* 1 */ package f;public abstract class S30 extends EU { public final int KD0(int paramInt) { int i = paramInt & Integer.MAX_VALUE; this.z70 = false; int j; byte b; if ((b = this.JO[j = i % this.JO.length]) == 0) { this.z70 = true; JH0(j, paramInt); return j; }  if (b == 1 && this.P6[j] == paramInt) return -j - 1;  int k;
/* 2 */     i = Ck.Zf(k = this.P6.length, 2, i, 1); int m = -1, n = j; while (true) { if (b == 2 && m == -1) m = n;  int i1; if ((i1 = n - i) < 0) i1 += k; 
/* 3 */       if ((n = this.JO[i1]) == 0) { if (m != -1) JH0(m, paramInt);  this.z70 = true; JH0(i1, paramInt); m = i1; } else if (n == 1 && this.P6[i1] == paramInt) { m = -i1 - 1; } else { if (i1 == j) { if (m == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");  } else { i1 = n = i1; continue; }  JH0(m, paramInt); }  return m; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient int[] P6;
/*   */   public int gs = 0;
/*   */   public long jD0 = 0L;
/*   */   public boolean z70;
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     this.P6 = new int[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public void Id(int paramInt) {
/*   */     this.P6[paramInt] = this.gs;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final void JH0(int paramInt1, int paramInt2) {
/*   */     this.P6[paramInt1] = paramInt2;
/*   */     this.JO[paramInt1] = 1;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeInt(this.gs);
/*   */     paramObjectOutput.writeLong(this.jD0);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     this.gs = paramObjectInput.readInt();
/*   */     this.jD0 = paramObjectInput.readLong();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */