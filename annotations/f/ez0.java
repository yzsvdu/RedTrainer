/* 1 */ package f;public abstract class ez0 { public static String Pa(byte[] paramArrayOfbyte) { String str = new String(); if (paramArrayOfbyte != null) { i = paramArrayOfbyte.length; } else { i = 0; }  if (!i) { arrayOfChar = new char[0]; } else { int j; int k; int m; char[] arrayOfChar1; int n; int i1; for (j = i / 3 * 3, arrayOfChar1 = new char[m = ((k = i - 1) / 3 + 1 << 2) + 0], n = 0, i1 = 0; n < j; ) { int i2 = (arrayOfChar[n++] & 0xFF) << 16 | (arrayOfChar[n++] & 0xFF) << 8 | arrayOfChar[n++] & 0xFF, i3 = i1 + 1; arrayOfChar1[i1] = arrayOfChar2[i2 >>> 18 & 0x3F]; i1 = i3 + 1; arrayOfChar1[i3] = arrayOfChar2[i2 >>> 12 & 0x3F]; i2 = i1 + 1; arrayOfChar1[i1] = arrayOfChar2[i2 >>> 6 & 0x3F]; i1 = i2 + 1; char[] arrayOfChar2; arrayOfChar1[i2] = (arrayOfChar2 = Sj0)[i2 & 0x3F]; }  if ((i -= j) > 0) { j = (arrayOfChar[j] & 0xFF) << 10; if (i == 2) { i2 = (arrayOfChar[k] & 0xFF) << 2; } else { i2 = 0; }  int i2 = j | i2; i = m - 4; arrayOfChar1[i] = arrayOfChar2[i2 >> 12]; i = m - 3; char[] arrayOfChar2; arrayOfChar1[i] = (arrayOfChar2 = Sj0)[i2 >>> 6 & 0x3F]; i = m - 2; if (i == 2) { i2 = arrayOfChar2[i2 & 0x3F]; } else { i2 = 61; }  arrayOfChar1[i] = i2; arrayOfChar1[m - 1] = '='; }  arrayOfChar = arrayOfChar1; }
/* 2 */      this(arrayOfChar);
/*   */     char[] arrayOfChar;
/*   */     int i;
/*   */     return str; }
/*   */ 
/*   */   
/*   */   public static final char[] Sj0;
/*   */   public static final int[] Jh;
/*   */   
/*   */   public static byte[] H2(String paramString) {
/*   */     if (paramString != null) {
/*   */       i = paramString.length();
/*   */     } else {
/*   */       i = 0;
/*   */     } 
/*   */     if (!i)
/*   */       return new byte[0]; 
/*   */     int j = 0;
/*   */     int k;
/*   */     for (k = 0; k < i; k++) {
/*   */       if (Jh[paramString.charAt(k)] < 0)
/*   */         j++; 
/*   */     } 
/*   */     if ((j = i - j) % 4 != 0)
/*   */       return null; 
/*   */     k = 0;
/*   */     while (i > 1 && Jh[paramString.charAt(--i)] <= 0) {
/*   */       if (paramString.charAt(i) == '=')
/*   */         k++; 
/*   */     } 
/*   */     int i;
/*   */     byte[] arrayOfByte = new byte[i = (j * 6 >> 3) - k];
/*   */     k = 0;
/*   */     int m;
/*   */     for (m = 0; m < i; m = i1) {
/*   */       int n = 0;
/*   */       int i1;
/*   */       for (i1 = 0; i1 < 4; i1++) {
/*   */         int i2;
/*   */         if ((i2 = Jh[paramString.charAt(k++)]) >= 0) {
/*   */           n |= i2 << 18 - i1 * 6;
/*   */         } else {
/*   */           i1--;
/*   */         } 
/*   */       } 
/*   */       arrayOfByte[m] = (byte)(n >> 16);
/*   */       if ((i1 = m + 1) < i) {
/*   */         arrayOfByte[i1] = (byte)(n >> 8);
/*   */         if ((m = i1 + 1) < i) {
/*   */           n = m + 1;
/*   */           arrayOfByte[m] = (byte)n;
/*   */           m = n;
/*   */         } 
/*   */         continue;
/*   */       } 
/*   */     } 
/*   */     return arrayOfByte;
/*   */   }
/*   */   
/*   */   static {
/*   */     Arrays.fill(Jh = new int[256], -1);
/*   */     byte b = 0;
/*   */     int i = (Sj0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray()).length;
/*   */     while (b < i) {
/*   */       Jh[Sj0[b]] = b;
/*   */       b++;
/*   */     } 
/*   */     Jh[61] = 0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ez0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */