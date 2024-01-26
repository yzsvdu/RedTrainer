/* 1 */ package f;public interface ik { default boolean isEnabledForLevel(t60 paramt60) { int i; if ((i = paramt60.dL) != 0) { if (i != 10) { if (i != 20) { if (i != 30) { if (i == 40)
/* 2 */               return isErrorEnabled();  throw new IllegalArgumentException("Level [" + paramt60 + "] not recognized."); }  return isWarnEnabled(); }  return isInfoEnabled(); }  return isDebugEnabled(); }  return isTraceEnabled(); }
/*   */ 
/*   */   
/*   */   String getName();
/*   */   
/*   */   default ey0 makeLoggingEventBuilder(t60 paramt60) {
/*   */     return new Un0();
/*   */   }
/*   */   
/*   */   boolean isTraceEnabled();
/*   */   
/*   */   boolean isDebugEnabled();
/*   */   
/*   */   boolean isInfoEnabled();
/*   */   
/*   */   void info(String paramString);
/*   */   
/*   */   void info(String paramString, Object paramObject);
/*   */   
/*   */   void info(String paramString, Throwable paramThrowable);
/*   */   
/*   */   boolean isWarnEnabled();
/*   */   
/*   */   void warn(String paramString);
/*   */   
/*   */   void warn(String paramString, Throwable paramThrowable);
/*   */   
/*   */   boolean isErrorEnabled();
/*   */   
/*   */   void error(String paramString);
/*   */   
/*   */   void error(String paramString, Throwable paramThrowable);
/*   */   
/*   */   void error(tV paramtV, String paramString, Throwable paramThrowable); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */