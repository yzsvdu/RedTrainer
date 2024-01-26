/* 1 */ package f;public final class ZB implements Comparator { public final int compare(Object paramObject1, Object paramObject2) { CD0 cD0 = (CD0)paramObject1; paramObject1 = paramObject2;
/* 2 */     int i = (wN()).Wf0;
/*   */     
/* 4 */     int j = (paramObject1.wN()).Wf0;
/* 5 */     if (this.aT)
/* 6 */       i = (int)(System.currentTimeMillis() / 1000.0D);  if (((CD0)paramObject1)
/* 7 */       .aT)
/* 8 */       j = (int)(System.currentTimeMillis() / 1000.0D);  return i - j; }
/*   */ 
/*   */   
/*   */   public static final ZB sa0 = new ZB(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */