/* 1 */ package f;public final class kN extends RuntimeException { public final String getMessage() { if (this.xe == null) return super.getMessage();  this(512); Ag ag2; (ag2 = new Ag()).V9(super.getMessage()); if ((new Ag())
/* 2 */       .Td0 > 0) ag2
/* 3 */         .yd0('\n');  ag2
/*   */       
/* 5 */       .V9("Serialization trace:"); Ag ag1;
/* 6 */     if ((ag1 = this.xe) == null) { ag2
/* 7 */         .xs(); } else { char[] arrayOfChar = this.bF0; int i = this.Td0; ag2.sG(this, 0, i); }
/* 8 */      return ag2.toString(); }
/*   */ 
/*   */   
/*   */   public Ag xe;
/*   */   
/*   */   public kN() {}
/*   */   
/*   */   public kN(String paramString, Throwable paramThrowable) {
/*   */     super(paramString, paramThrowable);
/*   */   }
/*   */   
/*   */   public kN(String paramString) {
/*   */     super(paramString);
/*   */   }
/*   */   
/*   */   public kN(Throwable paramThrowable) {
/*   */     super("", paramThrowable);
/*   */   }
/*   */   
/*   */   public final void K7(String paramString) {
/*   */     if (paramString != null) {
/*   */       if (this.xe == null) {
/*   */         Ag ag;
/*   */         this(512);
/*   */         this.xe = ag;
/*   */       } 
/*   */       this.xe.yd0('\n');
/*   */       this.xe.V9(paramString);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("info cannot be null.");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kN.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */