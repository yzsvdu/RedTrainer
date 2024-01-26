/* 1 */ package f;public final class Wk0 { public short[] YJ0; public int AK0; public boolean Zv; public Wk0() { this(true, 16); } public final void X3(int paramInt) { short[] arrayOfShort = this.YJ0; int j; if ((j = this.AK0) == arrayOfShort.length) { int k = Math.min(this.AK0, k); System.arraycopy(this.YJ0, 0, arrayOfShort1, 0, k); short[] arrayOfShort1 = new short[k = Math.max(8, (int)(j * 1.75F))]; arrayOfShort = arrayOfShort1; }  int i; this
/* 2 */       .AK0 = (i = this.AK0) + 1; arrayOfShort[i] = (short)paramInt; } public Wk0(int paramInt) { this(true, paramInt); } public Wk0(boolean paramBoolean, int paramInt) { this.Zv = paramBoolean; this.YJ0 = new short[paramInt]; } public Wk0(Wk0 paramWk0) { this.Zv = paramWk0.Zv; this.AK0 = i; int i; short[] arrayOfShort = new short[i = paramWk0.AK0]; System.arraycopy(paramWk0.YJ0, 0, this, 0, i); } public Wk0(short[] paramArrayOfshort) { this(true, paramArrayOfshort, 0, i); } public Wk0(boolean paramBoolean, short[] paramArrayOfshort, int paramInt1, int paramInt2) { this(paramBoolean, paramInt2); this.AK0 = paramInt2; System.arraycopy(paramArrayOfshort, paramInt1, this.YJ0, 0, paramInt2); } public final void GG0(short paramShort) { short[] arrayOfShort = this.YJ0; int j; if ((j = this.AK0) == arrayOfShort.length) { int k = Math.min(this.AK0, k); System.arraycopy(this.YJ0, 0, arrayOfShort1, 0, k); short[] arrayOfShort1 = new short[k = Math.max(8, (int)(j * 1.75F))]; arrayOfShort = arrayOfShort1; }  int i; this.AK0 = (i = this.AK0) + 1; arrayOfShort[i] = paramShort; } public final short sD(int paramInt) { if (paramInt < this.AK0) return this.YJ0[paramInt];  throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ").append(this.AK0).toString()); } public final int hashCode() { if (!this.Zv) return super.hashCode();  short[] arrayOfShort = this.YJ0; int i = 1; byte b = 0; int j = this.AK0; while (b < j) { i = i * 31 + this[b]; b++; }  return i; } public final String toString() { if (this.AK0 == 0) return "[]";  short[] arrayOfShort = this.YJ0; this(32); ag.yd0('['); Ag ag; (ag = new Ag()).Td(arrayOfShort[0]); for (byte b = 1; b < this.AK0; ) { ag
/* 3 */         .V9(", ");
/* 4 */       ag.Td(arrayOfShort[b]); b++; }  ag
/* 5 */       .yd0(']');
/* 6 */     return ag.toString(); }
/*   */ 
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!this.Zv)
/*   */       return false; 
/*   */     if (!(paramObject instanceof Wk0))
/*   */       return false; 
/*   */     if (!((Wk0)(paramObject = paramObject)).Zv)
/*   */       return false; 
/*   */     int i;
/*   */     if ((i = this.AK0) != ((Wk0)paramObject).AK0)
/*   */       return false; 
/*   */     short[] arrayOfShort = this.YJ0;
/*   */     paramObject = ((Wk0)paramObject).YJ0;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (this[b] != paramObject[b])
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void JA0(int paramInt) {
/*   */     if (paramInt >= 0) {
/*   */       if ((paramInt = this.AK0 + paramInt) > this.YJ0.length) {
/*   */         int i = Math.min(this.AK0, paramInt);
/*   */         System.arraycopy(this.YJ0, 0, arrayOfShort, 0, i);
/*   */         short[] arrayOfShort = new short[paramInt = Math.max(Math.max(8, paramInt), (int)(this.AK0 * 1.75F))];
/*   */       } 
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException(XD0.SD0("additionalCapacity must be >= 0: ", paramInt));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wk0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */