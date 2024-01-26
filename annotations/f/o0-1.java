/* 1 */ package f;public final class o0 { public int[] Ky; public int mG0; public boolean FF; public o0() { this(true, 16); } public o0(int paramInt) { this(true, paramInt); } public final int Vl(int paramInt) { if (paramInt < this.mG0) return this.Ky[paramInt];  throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ")
/* 2 */         .append(this.mG0).toString()); } public o0(boolean paramBoolean, int paramInt) { this.FF = paramBoolean; this.Ky = new int[paramInt]; } public o0(o0 paramo0) { this.FF = paramo0.FF; this.mG0 = i; int i; int[] arrayOfInt = new int[i = paramo0.mG0]; System.arraycopy(paramo0.Ky, 0, this, 0, i); } public o0(int[] paramArrayOfint) { this(true, paramArrayOfint, 0, i); } public o0(boolean paramBoolean, int[] paramArrayOfint, int paramInt1, int paramInt2) { this(paramBoolean, paramInt2); this.mG0 = paramInt2; System.arraycopy(paramArrayOfint, paramInt1, this.Ky, 0, paramInt2); } public final void oU(int paramInt) { int[] arrayOfInt = this.Ky; int j; if ((j = this.mG0) == arrayOfInt.length) arrayOfInt = YK0(Math.max(8, (int)(j * 1.75F)));  int i; this.mG0 = (i = this.mG0) + 1; arrayOfInt[i] = paramInt; } public final void X60(int paramInt1, int paramInt2) { if (paramInt1 < this.mG0) { this.Ky[paramInt1] = paramInt2; return; }  throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt1, " >= ").append(this.mG0).toString()); } public final int[] YK0(int paramInt) { int i = Math.min(this.mG0, paramInt); System.arraycopy(this.Ky, 0, arrayOfInt, 0, i); this.Ky = arrayOfInt; int[] arrayOfInt; return arrayOfInt = new int[paramInt]; } public final int[] zt() { System.arraycopy(this.Ky, 0, arrayOfInt, 0, i); int i; int[] arrayOfInt; return arrayOfInt = new int[i = this.mG0]; } public final String toString() { if (this.mG0 == 0) return "[]";  int[] arrayOfInt = this.Ky; this(32); ag.yd0('['); Ag ag; (ag = new Ag()).Td(arrayOfInt[0]); for (byte b = 1; b < this.mG0; ) { ag
/* 3 */         .V9(", ");
/* 4 */       ag.Td(arrayOfInt[b]); b++; }  ag
/* 5 */       .yd0(']');
/* 6 */     return ag.toString(); }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     if (!this.FF)
/*   */       return super.hashCode(); 
/*   */     int[] arrayOfInt = this.Ky;
/*   */     int i = 1;
/*   */     byte b = 0;
/*   */     int j = this.mG0;
/*   */     while (b < j) {
/*   */       i = i * 31 + this[b];
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!this.FF)
/*   */       return false; 
/*   */     if (!(paramObject instanceof o0))
/*   */       return false; 
/*   */     if (!((o0)(paramObject = paramObject)).FF)
/*   */       return false; 
/*   */     int i;
/*   */     if ((i = this.mG0) != ((o0)paramObject).mG0)
/*   */       return false; 
/*   */     int[] arrayOfInt = this.Ky;
/*   */     paramObject = ((o0)paramObject).Ky;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (this[b] != paramObject[b])
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void Yv0(int paramInt) {
/*   */     int[] arrayOfInt;
/*   */     int i;
/*   */     if (paramInt < (i = this.mG0)) {
/*   */       (arrayOfInt = this.Ky)[paramInt];
/*   */       this.mG0 = --i;
/*   */       if (this.FF) {
/*   */         i = paramInt + 1;
/*   */         int j = i - paramInt;
/*   */         System.arraycopy(this, i, this, paramInt, j);
/*   */       } else {
/*   */         this[paramInt] = this[i];
/*   */       } 
/*   */       return;
/*   */     } 
/*   */     throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ").append(super.mG0).toString());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/o0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */