/* 1 */ package f;public abstract class xc0 extends EU { public final int QC0(short paramShort) { int i = paramShort & Integer.MAX_VALUE; this.Tb = false; int j; byte b; if ((b = this.JO[j = i % this.JO.length]) == 0) { this.Tb = true; JV(j, paramShort); return j; }  if (b == 1 && this.native[j] == paramShort) return -j - 1;  int k;
/* 2 */     i = Ck.Zf(k = this.native.length, 2, i, 1); int m = -1, n = j; while (true) { if (b == 2 && m == -1) m = n;  int i1; if ((i1 = n - i) < 0) i1 += k; 
/* 3 */       if ((n = this.JO[i1]) == 0) { if (m != -1) JV(m, paramShort);  this.Tb = true; JV(i1, paramShort); m = i1; } else if (n == 1 && this.native[i1] == paramShort) { m = -i1 - 1; } else { if (i1 == j) { if (m == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");  } else { i1 = n = i1; continue; }  JV(m, paramShort); }  return m; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient short[] native;
/*   */   public short wM = 0;
/*   */   public float lJ0 = 0.0F;
/*   */   public boolean Tb;
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     this.native = new short[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public void Id(int paramInt) {
/*   */     this.native[paramInt] = this.wM;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final void JV(int paramInt, short paramShort) {
/*   */     this.native[paramInt] = paramShort;
/*   */     this.JO[paramInt] = 1;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeShort(this.wM);
/*   */     paramObjectOutput.writeFloat(this.lJ0);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     this.wM = paramObjectInput.readShort();
/*   */     this.lJ0 = paramObjectInput.readFloat();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xc0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */