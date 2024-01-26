/* 1 */ package f;public final class W7 { public static Bu0 xi(RD0 paramRD0, Uc paramUc, boolean paramBoolean) { if (paramRD0 == null) return null;  if (paramRD0.ml.getName()
/* 2 */       .endsWith(".cim")) return new LPt6(paramRD0, pB.XH0(paramRD0), paramUc, paramBoolean);  if (paramRD0
/* 3 */       .ml.getName()
/* 4 */       .endsWith(".etc1")) return new oM(paramRD0, paramBoolean);  if (paramRD0
/* 5 */       .ml.getName()
/* 6 */       .endsWith(".ktx") || paramRD0
/* 7 */       .ml.getName()
/* 8 */       .endsWith(".zktx")) return new tQ(paramRD0, paramBoolean);  this(paramRD0); ZH zH; return new LPt6(paramRD0, zH, paramUc, paramBoolean); }
/*   */ 
/*   */   
/*   */   public static Bu0 Hw0(RD0 paramRD0, boolean paramBoolean) {
/*   */     return xi(paramRD0, null, paramBoolean);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */