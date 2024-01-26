/* 1 */ package f;public final class lc0 extends Writer implements Serializable { private static final long serialVersionUID = -146927496096066153L; public final Appendable append(char paramChar) { this.d.append(paramChar); return this; } public final StringBuilder d; public final Appendable append(CharSequence paramCharSequence) {
/* 2 */     this.d.append(paramCharSequence); return this; } public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/* 3 */     this.d.append(paramCharSequence, paramInt1, paramInt2); return this;
/*   */   }
/*   */   
/*   */   public lc0() {
/*   */     StringBuilder stringBuilder;
/*   */     this(4);
/*   */     this.d = this;
/*   */   }
/*   */   
/*   */   public final Writer append(char paramChar) {
/*   */     this.d.append(paramChar);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Writer append(CharSequence paramCharSequence) {
/*   */     this.d.append(paramCharSequence);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*   */     this.d.append(paramCharSequence, paramInt1, paramInt2);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void close() {}
/*   */   
/*   */   public final void flush() {}
/*   */   
/*   */   public final void write(String paramString) {
/*   */     if (paramString != null)
/*   */       this.d.append(paramString); 
/*   */   }
/*   */   
/*   */   public final void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
/*   */     if (paramArrayOfchar != null)
/*   */       this.d.append(paramArrayOfchar, paramInt1, paramInt2); 
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.d.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lc0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */