/*   */ package f;public abstract class RT implements ik, Serializable { private static final long serialVersionUID = -2529255052481744503L;
/* 2 */   public Object readResolve() { return C00.R4(((lpT2)this).d60); } public final void info(String paramString) { t60 t60 = t60.VM; Throwable throwable = null; m7(this, null, paramString, null, throwable); } public final void info(String paramString, Object paramObject) { t60 t60 = t60.VM; paramString = (String)paramObject; (paramObject = new Object[1])[0] = paramString; m7(this, null, "Created config folder {}.", (Object[])paramObject, null); } public final void warn(String paramString) { m7(t60.xz, null, paramString, null, null); } public final void error(tV paramtV, String paramString, Throwable paramThrowable) { m7(t60.pi, paramtV, paramString, null, paramThrowable); } public final void warn(String paramString, Throwable paramThrowable) { m7(t60.xz, null, paramString, null, paramThrowable); } public final void error(String paramString) { m7(t60.pi, null, paramString, null, null); }
/* 3 */   public final void info(String paramString, Throwable paramThrowable) { m7(t60.VM, null, paramString, null, paramThrowable); } public final void error(String paramString, Throwable paramThrowable) { m7(t60.pi, null, paramString, null, paramThrowable); }
/*   */ 
/*   */   
/*   */   public abstract void m7(t60 paramt60, tV paramtV, String paramString, Object[] paramArrayOfObject, Throwable paramThrowable); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */