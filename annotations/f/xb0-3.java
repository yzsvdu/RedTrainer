/* 1 */ package f;public final class xb0 { public static byte[] HI0(String paramString) { int i = 0; byte[] arrayOfByte = Fl.Tx0; char[] arrayOfChar; int j; if ((j = (arrayOfChar = paramString.toCharArray()).length) % 4 == 
/* 2 */       0) { for (; j > 0 && arrayOfChar[i + j - 1] == '='; j--); byte[] arrayOfByte1; int k; int m; for (arrayOfByte1 = new byte[j = j * 3 / 4], k = i + j, m = 0; i < k; ) { int i2, i3, n = i + 1; i = arrayOfChar[i]; n = arrayOfChar[n]; int i1; if ((i1 = n + 1) < k) { i2 = i1 + 1; i1 = i2 = i1 = arrayOfChar[i1]; } else { i2 = 65; }  if (i1 < k) { i3 = i1 + 1; i1 = arrayOfChar[i1]; i3 = i1 = i3; } else { i3 = 65; }  if (i <= 127 && n <= 127 && i2 <= 127 && i3 <= 127) { n = arrayOfByte[n]; i2 = arrayOfByte[i2]; i3 = arrayOfByte[i3]; if ((i = arrayOfByte[i]) >= 0 && n >= 0 && i2 >= 0 && i3 >= 0) { i = i << 2 | n >>> 4; n = (n & 0xF) << 4 | i2 >>> 2; i2 = (i2 & 0x3) << 6 | i3; arrayOfByte1[m] = (byte)i; if ((i3 = m + 1) < j) { i = i3 + 1; arrayOfByte1[i3] = (byte)n; i3 = i; }  if (i3 < j) { i = i3 + 1; arrayOfByte1[i3] = (byte)i2; m = i; } else { m = i3; }  i = i1; continue; }  throw new IllegalArgumentException("Illegal character in Base64 encoded data."); }  throw new IllegalArgumentException("Illegal character in Base64 encoded data."); }  return arrayOfByte1; }  throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4."); }
/*   */ 
/*   */   
/*   */   public static final vy0 Fl = new vy0('+', '/'); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xb0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */