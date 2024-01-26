/*   */ package f;public final class HS { public static int nf(HS paramHS1, HS paramHS2) {
/*   */     int i;
/*   */     int j;
/* 4 */     return ((i = paramHS1.bA.Qu) == (j = paramHS2.bA.Qu)) ? 0 : ((i > j) ? 1 : -1);
/*   */   }
/*   */   
/*   */   public static final Comparator hp = HS::CX;
/*   */   
/*   */   public static final Comparator yr0 = HS::Q0;
/*   */   public static final Comparator d10 = HS::nf;
/*   */   public final int S90;
/*   */   public final int prn;
/*   */   public final FV[] pi;
/*   */   public final int gY;
/*   */   public final DK bA;
/*   */   
/*   */   public HS(int paramInt1, DK paramDK, int paramInt2, int paramInt3, FV[] paramArrayOfFV) {
/*   */     this.S90 = paramInt1;
/*   */     this.prn = paramInt2;
/*   */     this.gY = paramInt3;
/*   */     this.pi = paramArrayOfFV;
/*   */     this.bA = paramDK;
/*   */   }
/*   */   
/*   */   public static int Q0(HS paramHS1, HS paramHS2) {
/*   */     int i;
/*   */     int j;
/*   */     return ((i = paramHS1.prn) == (j = paramHS2.prn)) ? 0 : ((i > j) ? 1 : -1);
/*   */   }
/*   */   
/*   */   public static int CX(HS paramHS1, HS paramHS2) {
/*   */     int i;
/*   */     int j;
/*   */     return ((i = paramHS1.gY) == (j = paramHS2.gY)) ? 0 : ((i < j) ? 1 : -1);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */