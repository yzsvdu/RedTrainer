/* 1 */ package f;public final class EC0 extends Ar0 { public Pe0 cN; public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { (GK)paramwP; this.cN = null; return this.cN; } public EC0(Xt0 paramXt0) { super(paramXt0); } public final void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { Locale locale; Pe0 pe0; String str; this.cN = null; GK gK; if ((gK = (GK)paramwP) == null) { locale = Locale.getDefault(); paramString = null; } else { Locale locale1; if ((locale1 = ((GK)locale).fA) == null) locale1 = Locale.getDefault();  String str1 = ((GK)locale).W10; locale = locale1; str = str1; }  if (str == null)
/* 2 */     { pe0 = Pe0.Qr0(paramRD0, "UTF-8", locale); }
/* 3 */     else { pe0 = Pe0.Qr0(paramRD0, str, (Locale)pe0); }  this
/* 4 */       .cN = pe0; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EC0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */