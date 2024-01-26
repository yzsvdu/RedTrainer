/* 1 */ package f;public final class Ui { public static byte[] Vn(InputStream paramInputStream, int paramInt) { this(Math.max(0, paramInt)); DE dE; byte[] arrayOfByte = new byte[4096]; int i;
/* 2 */     for (; (i = paramInputStream.read(arrayOfByte)) != -1; dE.write(arrayOfByte, 0, i));
/* 3 */     return dE.toByteArray(); }
/*   */ 
/*   */   
/*   */   public static String RK(InputStream paramInputStream, int paramInt) {
/*   */     String str = "UTF8";
/*   */     this(paramInputStream, str);
/*   */     StringWriter stringWriter;
/*   */     InputStreamReader inputStreamReader;
/*   */     this(Math.max(0, paramInt));
/*   */     int i;
/*   */     for (char[] arrayOfChar = new char[4096]; (i = inputStreamReader.read(arrayOfChar)) != -1; stringWriter.write(arrayOfChar, 0, i));
/*   */     return stringWriter.toString();
/*   */   }
/*   */   
/*   */   public static void JC0(Closeable paramCloseable) {
/*   */     if (paramCloseable != null)
/*   */       try {
/*   */         paramCloseable.close();
/*   */       } finally {} 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ui.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */