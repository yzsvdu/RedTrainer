/* 1 */ package f;public final class ak0 implements CharSequence { public final int Qs(int paramInt1, int paramInt2, String paramString) { int i = this.PH0.length(); if (paramInt1 >= 0 && paramInt1 <= i) { if (paramInt2 >= 0 && paramInt2 <= i - paramInt1) {
/* 2 */         i = paramString.length(); if (paramInt2 > 0 || i > 0) this.PH0.replace(paramInt1, paramInt1 + paramInt2, paramString);  return i;
/* 3 */       }  throw new StringIndexOutOfBoundsException(); }  throw new StringIndexOutOfBoundsException(paramInt1); }
/*   */ 
/*   */   
/*   */   public final StringBuilder PH0;
/*   */   
/*   */   public ak0() {
/*   */     StringBuilder stringBuilder;
/*   */     this();
/*   */     this.PH0 = this;
/*   */   }
/*   */   
/*   */   public final int length() {
/*   */     return this.PH0.length();
/*   */   }
/*   */   
/*   */   public final char charAt(int paramInt) {
/*   */     return this.PH0.charAt(paramInt);
/*   */   }
/*   */   
/*   */   public final CharSequence subSequence(int paramInt1, int paramInt2) {
/*   */     return this.PH0.subSequence(paramInt1, paramInt2);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.PH0.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ak0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */