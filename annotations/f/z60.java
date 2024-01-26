/*   */ package f;public final class z60 extends Ib { public static String b0(int paramInt) {
/* 2 */     return B40.df("Bitstream errorcode ").append(Integer.toHexString(paramInt)).toString();
/*   */   }
/*   */   
/*   */   public int n60 = 256;
/*   */   
/*   */   public z60(String paramString, Exception paramException) {
/*   */     super(paramString, paramException);
/*   */   }
/*   */   
/*   */   public z60(int paramInt, Exception paramException) {
/*   */     this(b0(paramInt), paramException);
/*   */     this.n60 = paramInt;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/z60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */