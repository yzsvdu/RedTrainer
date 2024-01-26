/* 1 */ package f;public final class Lr extends Hx implements Serializable { private static final long serialVersionUID = 176844364689077340L; public final boolean accept(File paramFile) { String str; String[] arrayOfString; int i; byte b; for (str = paramFile.getName(), i = (arrayOfString = this.P20).length, b = 0; b < i; ) { String str1 = arrayOfString[b]; XV xV; (xV = this.pV).getClass(); if (str != null && str1 != null) { boolean bool; if (xV.eG0) { bool = str.equals(str1); } else { bool = str.equalsIgnoreCase(bool); }  if (bool) return true;  b++; continue; }  throw new NullPointerException("The strings must not be null"); }  return false; } public final String[] P20; public final XV pV; public final String toString() { this(); StringBuilder stringBuilder; (new StringBuilder())
/* 2 */       .append(Lr.class.getSimpleName()); (new StringBuilder()).append("("); if (this.P20 != null) for (byte b = 0; b < this.P20.length; ) { if (b > 0) stringBuilder.append(",");  stringBuilder.append(this.P20[b]); b++; }   stringBuilder.append(")"); return stringBuilder.toString(); } public final boolean accept(File paramFile, String paramString) { String[] arrayOfString; int i; byte b; for (i = (arrayOfString = this.P20).length, b = 0; b < i; ) { String str = arrayOfString[b]; XV xV; (xV = this.pV).getClass(); if (paramString != null && str != null) { boolean bool; if (xV.eG0) { bool = paramString.equals(str); } else { bool = paramString.equalsIgnoreCase(bool); }  if (bool) return true;  b++; continue; }  throw new NullPointerException("The strings must not be null"); }  return false; }
/*   */ 
/*   */   
/*   */   public Lr(String paramString) {
/*   */     this.P20 = new String[] { paramString };
/*   */     this.pV = XV.yq0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lr.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */