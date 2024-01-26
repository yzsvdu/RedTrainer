/* 1 */ package f;public abstract class dg { public static String km0(String paramString) { this(paramString); StringBuilder stringBuilder; for (int i = 0; i < stringBuilder.length(); ) { char c; Iterator<String> iterator; String str1; boolean bool; String str2; for (c = stringBuilder.charAt(i), str1 = (iterator = B2.keySet().iterator()).next(), bool = false, str2 = null; iterator.hasNext() && !bool; ) { if (((Character)B2.get(str1)).charValue() == c) { bool = true; str2 = str1; }  str1 = iterator.next(); }  if (str2 != null) { stringBuilder
/* 2 */           .replace(i, i + 1, str2); i = str2.length() + i; continue; }  i++; }  return stringBuilder.toString(); }
/*   */ 
/*   */   
/*   */   public static LinkedHashMap B2;
/*   */   
/*   */   static {
/*   */     (B2 = new LinkedHashMap<>()).put("&quot;", Character.valueOf('"'));
/*   */     B2.put("&amp;", Character.valueOf('&'));
/*   */     B2.put("&lt;", Character.valueOf('<'));
/*   */     B2.put("&gt;", Character.valueOf('>'));
/*   */     B2.put("&nbsp;", Character.valueOf(' '));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */