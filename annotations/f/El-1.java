/* 1 */ package f;public abstract class El { public static void Uy0(String paramString, Exception paramException) { js js; if ((js = js.vu0) != null)
/* 2 */     { xE xE; this(); js.DJ(paramString, xE); }  lu0.error(paramString, paramException); }
/*   */ 
/*   */   
/*   */   public static final ik lu0 = C00.gd(El.class);
/*   */   
/*   */   public static boolean Bf() {
/*   */     if (!jX.J40) {
/*   */       if (!Bz.ab0.isEmpty())
/*   */         jX.yr = "true"; 
/*   */       jX.es();
/*   */     } 
/*   */     if (!jX.kc) {
/*   */       Uy0(Ml0.OH0(901), new RuntimeException());
/*   */       return false;
/*   */     } 
/*   */     if (jX.tJ.length < 1 || jX.G10.isEmpty()) {
/*   */       RuntimeException runtimeException;
/*   */       this();
/*   */       Uy0("Updater location/hash missing. Please report this on the forums.", runtimeException);
/*   */       return false;
/*   */     } 
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/El.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */