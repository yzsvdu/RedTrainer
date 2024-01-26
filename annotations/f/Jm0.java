/* 1 */ package f;public final class Jm0 extends J30 { public final int C0(s40 params40) { byte[] arrayOfByte; int i, j; if ((j = this.Mw0) != -1) return j;  ByteBuffer byteBuffer; if ((byteBuffer = params40.pr()).hasArray()) { arrayOfByte = byteBuffer.array(); } else { arrayOfByte.get(arrayOfByte = new byte[arrayOfByte.limit()]); O4.error("Slow search"); }  byte b; for (j = -1, b = 0; b <= this.fk0; ) { j++; byte[] arrayOfByte1 = this.rF0; boolean[] arrayOfBoolean = this.kl0; byte b1 = 0; while (true) { if (j < arrayOfByte.length) { if (b1 && !arrayOfBoolean[b1] && arrayOfByte1[b1] != arrayOfByte[j]) b1 = 0;  if (arrayOfBoolean[b1] || arrayOfByte1[b1] == arrayOfByte[j]) b1++;  if (b1 == arrayOfByte1.length) { j = j - arrayOfByte1.length + 1; break; }  j++; continue; }  j = -1; break; }  if (j >= 0) { b++; continue; }
/* 2 */        throw new RuntimeException("Invalid Offset"); }  if (this.OD0) { i = j - this.AJ; } else { i = j + this.rF0.length + this.AJ; }  this.Mw0 = i; return i; }
/*   */ 
/*   */   
/*   */   public static final ik O4 = C00.gd(Jm0.class);
/*   */   public byte[] rF0;
/*   */   public boolean[] kl0;
/*   */   public boolean OD0;
/*   */   public int AJ;
/*   */   public int fk0;
/*   */   public int Mw0 = -1;
/*   */   
/*   */   public Jm0(String paramString, int paramInt, boolean paramBoolean) {
/*   */     this(paramBoolean, paramString, paramInt, 0);
/*   */   }
/*   */   
/*   */   public Jm0(boolean paramBoolean, String paramString, int paramInt1, int paramInt2) {
/*   */     int i;
/*   */     this.kl0 = new boolean[i = paramString.length() / 2];
/*   */     this.rF0 = new byte[i];
/*   */     int j;
/*   */     for (j = 0; j < i; j = k) {
/*   */       int k;
/*   */       String str;
/*   */       if ((str = paramString.substring(j * 2, (k = j + 1) * 2)).equals("XX")) {
/*   */         this.kl0[j] = true;
/*   */       } else {
/*   */         this.rF0[j] = (byte)Integer.parseInt(str, 16);
/*   */       } 
/*   */     } 
/*   */     this.OD0 = paramBoolean;
/*   */     this.AJ = paramInt1;
/*   */     this.fk0 = paramInt2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */