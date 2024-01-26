/* 1 */ package f;public abstract class D5 { public static void Rd(String paramString1, String paramString2, boolean paramBoolean) { WY wY; int i; byte[] arrayOfByte; byte b; for (wY = new WY(), arrayOfByte = new byte[(i = paramString1.length()) / 2], b = 0; b < i; ) { int j = b / 2, k = Character.digit(paramString1.charAt(b), 16) << 4; arrayOfByte[j] = (byte)(Character.digit(paramString1.charAt(b + 1), 16) + k); b += 2; }
/* 2 */      this(arrayOfByte, paramString2, paramBoolean); rk.add(wY); }
/*   */ 
/*   */   
/*   */   public static ArrayList rk = new ArrayList();
/*   */   
/*   */   static {
/*   */     Rd("425A68", "Bzip2", false);
/*   */     Rd("4C5A4950", "lzip", false);
/*   */     Rd("504B0304", "Zip", true);
/*   */     Rd("504B0506", "Zip", false);
/*   */     Rd("504B0708", "Zip", true);
/*   */     Rd("526172211A0700", "RAR", true);
/*   */     Rd("526172211A070100", "RAR", true);
/*   */     Rd("6B6F6C79", "DMG", false);
/*   */     Rd("78617221", "XAR", false);
/*   */     Rd("7573746172003030", "TAR", true);
/*   */     Rd("7573746172202000", "TAR", true);
/*   */     Rd("377ABCAF271C", "7-Zip", true);
/*   */     Rd("1F8B", "GZIP", true);
/*   */     Rd("FD377A585A00", "XZ", false);
/*   */     Rd("28B52FFD", "Zstandard", false);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */