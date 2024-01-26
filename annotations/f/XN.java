/* 1 */ package f;public final class XN implements Runnable { public final void run() { try { String str1 = fl0.Xa(this.CH0.QM("UTF-8")), str2 = null; Matcher matcher; if ((matcher = Pattern.compile("([A-Za-z]+ frames: .*?)---------", 32).matcher(str1)).find()) str2 = matcher.group(1);  if (str2 == null) str2 = "ERROR_EXTRACTING_STACKTRACE_FROM_HS_ERR";  fl0.Kf(fl0.Ph(str2.trim(), str1), false); } catch (Exception exception) {} this
/* 2 */       .CH0.La0(); }
/*   */ 
/*   */   
/*   */   public XN(RD0 paramRD0) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */