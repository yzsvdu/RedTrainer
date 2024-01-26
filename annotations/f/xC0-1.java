/* 1 */ package f;public final class xC0 extends fQ { public int LG0; public o0 Y70; public int Sm; public xC0() { o0 o01; this(0); this.Y70 = this; } public xC0(fQ paramfQ) { super(paramfQ); o0 o01; this(0); this.Y70 = this; } public final void ms0() { int i; if ((i = this.LG0) != 0) { if ((this.LG0 = i - 1) == 0) { if ((i = this.Sm) > 0 && i == this.Z8) { this.Y70.mG0 = 0;
/* 2 */           clear(); } else { int j; for (i = 0, j = this.Y70.mG0; i < j; )
/*   */           
/* 4 */           { int k = o01.mG0 - 1; o0 o01; if ((k = (o01 = this.Y70).Ky[k]) >= this
/* 5 */               .Sm) Hc(k);  i++; }  for (i = this.Sm - 1; i >= 0; ) { Hc(i); i--; }  }  this.Sm = 0; }  return; }  throw new IllegalStateException("begin must be called before end."); } public xC0(boolean paramBoolean, int paramInt, Class paramClass) { super(paramBoolean, paramInt, paramClass); o0 o01; this(0); this.Y70 = this; } public xC0(boolean paramBoolean, int paramInt) { super(paramBoolean, paramInt); o0 o01; this(0); this.Y70 = this; } public xC0(boolean paramBoolean, Object[] paramArrayOfObject, int paramInt1, int paramInt2) { super(paramBoolean, paramArrayOfObject, paramInt1, paramInt2); o0 o01; this(0); this.Y70 = this; } public xC0(Class paramClass) { super(paramClass); o0 o01; this(0); this.Y70 = this; } public xC0(int paramInt) { super(paramInt); o0 o01; this(0); this.Y70 = this; } public xC0(Object[] paramArrayOfObject) { super(paramArrayOfObject); o0 o01; this(0); this.Y70 = this; } public final boolean Ct(Object paramObject, boolean paramBoolean) { int i; if (this.LG0 > 0) { if ((i = JF0(paramObject, paramBoolean)) == -1) return false;  K80(i); return true; }  return super.Ct(i, paramBoolean); } public final Object Hc(int paramInt) { if (this.LG0 > 0) { K80(paramInt); return get(paramInt); }  return super.Hc(paramInt); } public final void K80(int paramInt) { o0 o01; if (paramInt < this.Sm) return;  byte b; int i; for (b = 0, i = this.Y70.mG0; b < i; ) { int j; if (paramInt == (j = this.Y70.Vl(b))) return;  if (paramInt < j) { if (b <= (i = (o01 = this.Y70).mG0)) { int[] arrayOfInt; if (i == (arrayOfInt = this.Ky).length) arrayOfInt = YK0(Math.max(8, (int)(i * 1.75F)));  if (this.FF) { i = b + 1; int k = this.mG0 - b; System.arraycopy(arrayOfInt, b, arrayOfInt, i, k); } else { i = this.mG0; arrayOfInt[i] = arrayOfInt[b]; }  this.mG0++; arrayOfInt[b] = paramInt; return; }  throw new IndexOutOfBoundsException(HB0.DH0("index can't be > size: ", b, " > ").append(this.mG0).toString()); }  b++; }  ((xC0)super).Y70.oU(paramInt); }
/*   */ 
/*   */   
/*   */   public final void il(int paramInt) {
/*   */     if (this.LG0 > 0) {
/*   */       while (paramInt >= 0) {
/*   */         K80(paramInt);
/*   */         paramInt--;
/*   */       } 
/*   */     } else {
/*   */       super.il(paramInt);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void clear() {
/*   */     if (this.LG0 > 0) {
/*   */       this.Sm = this.Z8;
/*   */       return;
/*   */     } 
/*   */     super.clear();
/*   */   }
/*   */   
/*   */   public final void Bz0(int paramInt, Object paramObject) {
/*   */     if (this.LG0 <= 0) {
/*   */       super.Bz0(paramInt, paramObject);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   }
/*   */   
/*   */   public final void Tc(int paramInt, Object paramObject) {
/*   */     if (this.LG0 <= 0) {
/*   */       super.Tc(paramInt, paramObject);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   }
/*   */   
/*   */   public final Object pop() {
/*   */     if (this.LG0 <= 0)
/*   */       return super.pop(); 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   }
/*   */   
/*   */   public final void sort(Comparator paramComparator) {
/*   */     if (this.LG0 <= 0) {
/*   */       super.sort(paramComparator);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   }
/*   */   
/*   */   public final void OU() {
/*   */     if (this.LG0 <= 0) {
/*   */       super.OU();
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   }
/*   */   
/*   */   public final void pL0(int paramInt) {
/*   */     if (this.LG0 <= 0) {
/*   */       super.pL0(paramInt);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalStateException("Invalid between begin/end.");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xC0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */