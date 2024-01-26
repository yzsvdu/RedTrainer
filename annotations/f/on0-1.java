/* 1 */ package f;public abstract class on0 extends EU { public final int vA(short paramShort) { int i = paramShort & Integer.MAX_VALUE; this.iO = false; int j; byte b; if ((b = this.JO[j = i % this.JO.length]) == 0) { this.iO = true; NP(j, paramShort); return j; }  if (b == 1 && this.x20[j] == paramShort) return -j - 1;  int k;
/* 2 */     i = Ck.Zf(k = this.x20.length, 2, i, 1); int m = -1, n = j; while (true) { if (b == 2 && m == -1) m = n;  int i1; if ((i1 = n - i) < 0) i1 += k; 
/* 3 */       if ((n = this.JO[i1]) == 0) { if (m != -1) NP(m, paramShort);  this.iO = true; NP(i1, paramShort); m = i1; } else if (n == 1 && this.x20[i1] == paramShort) { m = -i1 - 1; } else { if (i1 == j) { if (m == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");  } else { i1 = n = i1; continue; }  NP(m, paramShort); }  return m; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient short[] x20;
/*   */   public short N40 = 0;
/*   */   public byte bi = 0;
/*   */   public boolean iO;
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     this.x20 = new short[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public void Id(int paramInt) {
/*   */     this.x20[paramInt] = this.N40;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final void NP(int paramInt, short paramShort) {
/*   */     this.x20[paramInt] = paramShort;
/*   */     this.JO[paramInt] = 1;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeShort(this.N40);
/*   */     paramObjectOutput.writeByte(this.bi);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     this.N40 = paramObjectInput.readShort();
/*   */     this.bi = paramObjectInput.readByte();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/on0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */