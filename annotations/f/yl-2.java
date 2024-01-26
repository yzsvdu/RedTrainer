/* 1 */ package f;public abstract class yl { public static boolean fX() { UB0.Kg0.getClass();
/* 2 */     UB0.Kg0.getClass(); Dp0 dp0; if ((dp0 = Dp0.Ro0) == Dp0.uM || dp0 == Dp0.QG) return true;  }
/*   */ 
/*   */   
/*   */   public static IntPredicate rh0 = yl::ll0;
/*   */   public static IntPredicate gc0 = yl::H;
/*   */   public static IntPredicate Fa = yl::N1;
/*   */   public static IntPredicate AR = yl::wo;
/*   */   public static IntPredicate Oi0 = yl::Sv0;
/*   */   
/*   */   public static int dc0(int paramInt) {
/*   */     return rh0.test(paramInt) ? 66 : (gc0.test(paramInt) ? 19 : (Fa.test(paramInt) ? 20 : (AR.test(paramInt) ? 21 : (Oi0.test(paramInt) ? 22 : paramInt))));
/*   */   }
/*   */   
/*   */   public static int Nk(int paramInt) {
/*   */     return ((paramInt & 0x100) == 0) ? paramInt : dc0(paramInt);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */