/* 1 */ package f;public abstract class cf { public static void IX(int paramInt, boolean paramBoolean) { if (paramInt < 0) { paramInt = 0; } else if (paramInt > 100) { paramInt = 100; }  int i = UB0.M60.fG0(), j = UB0.M60.dL(); float f2 = 1.0F; if (paramBoolean) f2 = km.wI0.vH0;  float f1 = paramInt * 0.4F / 100.0F + 0.3F; double d;
/* 2 */     hf0 = (int)(Math.max(Math.ceil((i * f1)), 760.0D) * (d = f2)); G30 = (int)(Math.max(Math.ceil((j * f1)), 400.0D) * d); }
/*   */ 
/*   */   
/*   */   public static int hf0 = 0;
/*   */   public static int G30 = 0; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */