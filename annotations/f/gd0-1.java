/* 1 */ package f;public abstract class gd0 { public static int[] dB0(String paramString) { byte b1; int i; for (b1 = 0, i = 0; i < paramString.length(); ) { b1++;
/* 2 */       if ((i = paramString.indexOf(',', i)) < 0) i = paramString.length();  i++; }
/* 3 */      int[] arrayOfInt; byte b2; int j; for (arrayOfInt = new int[b1], b2 = 0, j = 0; b2 < b1; )
/* 4 */     { int k; if ((k = paramString.indexOf(',', j)) < 0) k = paramString.length();  arrayOfInt[b2] = 
/* 5 */         Integer.parseInt(paramString.substring(j, k)); j = k + 1; b2++; }  return arrayOfInt; }
/*   */ 
/*   */   
/*   */   public static String It0(String paramString) {
/*   */     return (paramString == null) ? "" : paramString;
/*   */   }
/*   */   
/*   */   public static int rB(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*   */     while (paramInt1 < paramInt2 && Character.isWhitespace(paramCharSequence.charAt(paramInt1)))
/*   */       paramInt1++; 
/*   */     return paramInt1;
/*   */   }
/*   */   
/*   */   public static String PJ0(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*   */     paramInt1 = rB(paramCharSequence, paramInt1, paramInt2);
/*   */     while (paramInt2 > paramInt1 && Character.isWhitespace(paramCharSequence.charAt(paramInt2 - 1)))
/*   */       paramInt2--; 
/*   */     return (paramCharSequence instanceof String) ? ((String)paramCharSequence).substring(paramInt1, paramInt2) : ((paramCharSequence instanceof StringBuilder) ? ((StringBuilder)paramCharSequence).substring(paramInt1, paramInt2) : paramCharSequence.subSequence(paramInt1, paramInt2).toString());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gd0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */