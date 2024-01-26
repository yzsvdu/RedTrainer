/* 1 */ package f;public class Dy extends J30 { public int C0(s40 params40) { byte[] arrayOfByte; int j, k; if ((k = this.bc0) != -1) return k;  ByteBuffer byteBuffer; if ((byteBuffer = params40.pr()).hasArray()) { arrayOfByte = byteBuffer.array(); } else { RuntimeException runtimeException; byteBuffer.get(arrayOfByte = new byte[byteBuffer.limit()]); this(); F1.error("Slow search", runtimeException); }  int m; byte b; for (m = -1, b = 0; b <= this.PO; ) { m++; byte[] arrayOfByte1 = this.Z20; boolean[] arrayOfBoolean = this.f90; byte b1 = 0; while (true) { if (m < arrayOfByte.length) { if (b1 && !arrayOfBoolean[b1] && arrayOfByte1[b1] != arrayOfByte[m]) b1 = 0;  if (arrayOfBoolean[b1] || arrayOfByte1[b1] == arrayOfByte[m]) b1++;  if (b1 == arrayOfByte1.length) { m = m - arrayOfByte1.length + 1; break; }  m++; continue; }  m = -1; break; }  if (m >= 0) { b++; continue; }
/* 2 */        throw new RuntimeException("Invalid Offset"); }  if (this.f8) { j = m - this.H80 - 4; } else { j = m + this.Z20.length + this.H80; }  byteBuffer.position(j); int i; if (pN.pk0(i = byteBuffer.getInt())) return this.bc0 = pN.tx0(i);  throw new RuntimeException("Invalid Offset"); }
/*   */ 
/*   */   
/*   */   public static final ik F1 = C00.gd(Dy.class);
/*   */   public byte[] Z20;
/*   */   public boolean[] f90;
/*   */   public boolean f8;
/*   */   public int H80;
/*   */   public int PO;
/*   */   public int bc0 = -1;
/*   */   
/*   */   public Dy(String paramString, int paramInt, boolean paramBoolean) {
/*   */     this(paramBoolean, paramString, paramInt, 0);
/*   */   }
/*   */   
/*   */   public Dy(boolean paramBoolean, String paramString, int paramInt1, int paramInt2) {
/*   */     int i;
/*   */     this.f90 = new boolean[i = paramString.length() / 2];
/*   */     this.Z20 = new byte[i];
/*   */     int j;
/*   */     for (j = 0; j < i; j = k) {
/*   */       int k;
/*   */       String str;
/*   */       if ((str = paramString.substring(j * 2, (k = j + 1) * 2)).equals("XX")) {
/*   */         this.f90[j] = true;
/*   */       } else {
/*   */         this.Z20[j] = (byte)Integer.parseInt(str, 16);
/*   */       } 
/*   */     } 
/*   */     this.f8 = paramBoolean;
/*   */     this.H80 = paramInt1;
/*   */     this.PO = paramInt2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */