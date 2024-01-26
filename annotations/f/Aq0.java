/* 1 */ package f;public abstract class Aq0 { public static String Qu0(short paramShort, boolean paramBoolean) { String str; if ((str = Integer.toHexString(paramShort).toUpperCase()).length() == 8 && str.startsWith("FFFF")) str = str.substring(4);  for (; str.length() < 4; str = m0.tF0("0", str)); if (paramBoolean)
/* 2 */       return m0.tF0("(short)0x", str); 
/* 3 */     return m0.tF0("0x", str); }
/*   */ 
/*   */   
/*   */   public static final char[] od0 = new char[] { 
/*   */       '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
/*   */       'a', 'b', 'c', 'd', 'e', 'f' };
/*   */   
/*   */   public static String A20(byte[] paramArrayOfbyte) {
/*   */     this(paramArrayOfbyte.length * 2);
/*   */     StringBuilder stringBuilder;
/*   */     int i = paramArrayOfbyte.length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       byte b1 = paramArrayOfbyte[b];
/*   */       stringBuilder.append(arrayOfChar[b1 >> 4 & 0xF]);
/*   */       char[] arrayOfChar;
/*   */       stringBuilder.append((arrayOfChar = od0)[b1 & 0xF]);
/*   */     } 
/*   */     return stringBuilder.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Aq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */