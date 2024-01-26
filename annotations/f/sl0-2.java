/* 1 */ package f;public final class sl0 implements ik { public final ik I10() { if (this.tr0 != null) return this.tr0;  if (this.xT) return F0.pn0;  if (this.rp == null) { lpT2 lpT21; this(this, this.NU); this.rp = lpT21; }  return this.rp; }
/*   */ 
/*   */   
/*   */   public final String EY;
/*   */   public volatile ik tr0;
/*   */   public Boolean PT;
/*   */   public Method S40;
/*   */   public lpT2 rp;
/*   */   public final Queue NU;
/*   */   public final boolean xT;
/*   */   
/*   */   public sl0(String paramString, LinkedBlockingQueue paramLinkedBlockingQueue, boolean paramBoolean) {
/*   */     this.EY = paramString;
/*   */     this.NU = paramLinkedBlockingQueue;
/*   */     this.xT = paramBoolean;
/*   */   }
/*   */   
/*   */   public final String getName() {
/*   */     return this.EY;
/*   */   }
/*   */   
/*   */   public final ey0 makeLoggingEventBuilder(t60 paramt60) {
/*   */     return I10().makeLoggingEventBuilder(paramt60);
/*   */   }
/*   */   
/*   */   public final boolean isEnabledForLevel(t60 paramt60) {
/*   */     return I10().isEnabledForLevel(paramt60);
/*   */   }
/*   */   
/*   */   public final boolean isTraceEnabled() {
/*   */     return I10().isTraceEnabled();
/*   */   }
/*   */   
/*   */   public final boolean isDebugEnabled() {
/*   */     return I10().isDebugEnabled();
/*   */   }
/*   */   
/*   */   public final boolean isInfoEnabled() {
/*   */     return I10().isInfoEnabled();
/*   */   }
/*   */   
/*   */   public final void info(String paramString) {
/*   */     I10().info(paramString);
/*   */   }
/*   */   
/*   */   public final void info(String paramString, Object paramObject) {
/*   */     I10().info("Created config folder {}.", paramObject);
/*   */   }
/*   */   
/*   */   public final void info(String paramString, Throwable paramThrowable) {
/*   */     I10().info(paramString, paramThrowable);
/*   */   }
/*   */   
/*   */   public final boolean isWarnEnabled() {
/*   */     return I10().isWarnEnabled();
/*   */   }
/*   */   
/*   */   public final void warn(String paramString) {
/*   */     I10().warn(paramString);
/*   */   }
/*   */   
/*   */   public final void warn(String paramString, Throwable paramThrowable) {
/*   */     I10().warn(paramString, paramThrowable);
/*   */   }
/*   */   
/*   */   public final boolean isErrorEnabled() {
/*   */     return I10().isErrorEnabled();
/*   */   }
/*   */   
/*   */   public final void error(String paramString) {
/*   */     I10().error(paramString);
/*   */   }
/*   */   
/*   */   public final void error(String paramString, Throwable paramThrowable) {
/*   */     I10().error(paramString, paramThrowable);
/*   */   }
/*   */   
/*   */   public final void error(tV paramtV, String paramString, Throwable paramThrowable) {
/*   */     I10().error(paramtV, paramString, paramThrowable);
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null || sl0.class != paramObject.getClass())
/*   */       return false; 
/*   */     this = (sl0)paramObject;
/*   */     return !!this.EY.equals(this.EY);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     return this.EY.hashCode();
/*   */   }
/*   */   
/*   */   public final boolean jN() {
/*   */     Boolean bool;
/*   */     if ((bool = this.PT) != null)
/*   */       return bool.booleanValue(); 
/*   */     try {
/*   */       this.S40 = this.tr0.getClass().getMethod("log", new Class[] { tq.class });
/*   */       this.PT = Boolean.TRUE;
/*   */     } catch (NoSuchMethodException noSuchMethodException) {
/*   */       this.PT = Boolean.FALSE;
/*   */     } 
/*   */     return this.PT.booleanValue();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */