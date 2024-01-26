/* 1 */ package com.badlogic.gdx.controllers.desktop;public class JamepadControllerManager extends Z6 implements iq0 { public static XE0 jamepadConfiguration; private static boolean nativeLibInitialized = false; private static ControllerManager controllerManager; public void addListener(tx paramtx) { this.compositeListener.JK0
/* 2 */       .add(paramtx); } private final BL compositeListener; public JamepadControllerManager() { this(); this.compositeListener = bL; BL bL; (bL = new BL()).ty(new UV(this, 0)); if (!nativeLibInitialized) { if (jamepadConfiguration == null) jamepadConfiguration = new XE0();  (controllerManager = new ControllerManager(jamepadConfiguration)).KK0(); (new wF0(controllerManager, (tx)bL)).run(); UB0.Kg0.QS((lu)new HR(controllerManager)); nativeLibInitialized = true; }  } public static void addMappingsFromFile(String paramString) { controllerManager.ot(paramString); } public static void logLastNativeGamepadError() { UB0.Kg0.O70("Jamepad", controllerManager.getLastNativeError()); } public void removeListener(tx paramtx) { this.compositeListener.JK0.remove(paramtx); } public fQ getListeners() { (new fQ()).Com3(this.compositeListener); return new fQ(); } public void clearListeners() { this.compositeListener.JK0.clear();
/*   */     
/* 4 */     this(this); UV uV;
/* 5 */     this.compositeListener.JK0
/* 6 */       .add(uV); }
/*   */ 
/*   */   
/*   */   public void dispose() {
/*   */     controllerManager.Ar0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/controllers/desktop/JamepadControllerManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */