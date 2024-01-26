/* 1 */ package f;public final class G3 { public float[] By0; public int NB0; public boolean bK0; public G3() { this(true, 16); } public G3(int paramInt) { this(true, paramInt); } public final float cON(int paramInt) { if (paramInt < this.NB0) return this.By0[paramInt];  throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ")
/* 2 */         .append(this.NB0).toString()); }
/* 3 */   public G3(boolean paramBoolean, int paramInt) { this.bK0 = paramBoolean; this.By0 = new float[paramInt]; } public G3(G3 paramG3) { this.bK0 = paramG3.bK0; this.NB0 = i; int i; float[] arrayOfFloat = new float[i = paramG3.NB0]; System.arraycopy(paramG3.By0, 0, this, 0, i); } public G3(float[] paramArrayOffloat) { this(true, paramArrayOffloat, 0, i); } public G3(boolean paramBoolean, float[] paramArrayOffloat, int paramInt1, int paramInt2) { this(paramBoolean, paramInt2); this.NB0 = paramInt2; System.arraycopy(paramArrayOffloat, paramInt1, this.By0, 0, paramInt2); } public final void ZB0(float paramFloat) { float[] arrayOfFloat = this.By0; int j; if ((j = this.NB0) == arrayOfFloat.length) arrayOfFloat = Jd0(Math.max(8, (int)(j * 1.75F)));  int i; this.NB0 = (i = this.NB0) + 1; arrayOfFloat[i] = paramFloat; } public final float[] Jd0(int paramInt) { int i = Math.min(this.NB0, paramInt); System.arraycopy(this.By0, 0, arrayOfFloat, 0, i); this.By0 = arrayOfFloat; float[] arrayOfFloat; return arrayOfFloat = new float[paramInt]; } public final String toString() { if (this.NB0 == 0) return "[]";  float[] arrayOfFloat = this.By0; this(32); ag.yd0('['); Ag ag; (ag = new Ag()).V9(Float.toString(arrayOfFloat[0])); byte b = 1; while (b < this
/* 4 */       .NB0) { ag
/* 5 */         .V9(", ");
/*   */       
/* 7 */       ag.V9(Float.toString(arrayOfFloat[b])); b++; }  ag
/* 8 */       .yd0(']');
/* 9 */     return ag.toString(); }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     if (!this.bK0)
/*   */       return super.hashCode(); 
/*   */     float[] arrayOfFloat;
/*   */     int i;
/*   */     byte b;
/*   */     int j;
/*   */     for (arrayOfFloat = this.By0, i = 1, b = 0, j = this.NB0; b < j; ) {
/*   */       i *= 31;
/*   */       i = Float.floatToRawIntBits(this[b]) + i;
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!this.bK0)
/*   */       return false; 
/*   */     if (!(paramObject instanceof G3))
/*   */       return false; 
/*   */     if (!((G3)(paramObject = paramObject)).bK0)
/*   */       return false; 
/*   */     int i;
/*   */     if ((i = this.NB0) != ((G3)paramObject).NB0)
/*   */       return false; 
/*   */     float[] arrayOfFloat = this.By0;
/*   */     paramObject = ((G3)paramObject).By0;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (this[b] != paramObject[b])
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void p(int paramInt1, int paramInt2, float[] paramArrayOffloat) {
/*   */     float[] arrayOfFloat = this.By0;
/*   */     int i;
/*   */     if ((i = this.NB0 + paramInt2) > arrayOfFloat.length)
/*   */       arrayOfFloat = Jd0(Math.max(Math.max(8, i), (int)(this.NB0 * 1.75F))); 
/*   */     System.arraycopy(paramArrayOffloat, paramInt1, arrayOfFloat, this.NB0, paramInt2);
/*   */     this.NB0 += paramInt2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */