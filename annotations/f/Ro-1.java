/* 1 */ package f;public abstract class Ro { public static void oJ0(Set<p50> paramSet, String paramString) { p50 p50 = new p50(); boolean bool = false; if (paramString.indexOf('/') >= 0) { str = paramString.substring(paramString.lastIndexOf('/') + 1); } else { str = paramString; }  if (str.indexOf('\\') >= 0) str = str.substring(str.lastIndexOf('\\') + 1); 
/* 2 */     this(bool, str.toLowerCase(Locale.ENGLISH), paramString); String str; paramSet.add(p50); }
/*   */ 
/*   */   
/*   */   public static HashSet yl0() {
/*   */     this();
/*   */     HashSet hashSet;
/*   */     ProcessHandle.allProcesses().filter(ProcessHandle::isAlive).forEach(hashSet::gH);
/*   */     if (q00.PG) {
/*   */       Us0.Tt0(hashSet);
/*   */       Us0.St(hashSet);
/*   */     } 
/*   */     return hashSet;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ro.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */