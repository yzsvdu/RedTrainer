/* 1 */ package f;public final class Ig0 extends ZA0 { public final int[] nH0(f20 paramf20) { byte[] arrayOfByte; int[] arrayOfInt; byte b; for (arrayOfInt = new int[(arrayOfByte = Ax0(paramf20)).length / 2], b = 0; b < this.length / 2; ) { int i; arrayOfInt[b] = ZA0.Ui((short)(this[i = b * 2] & 0xFF | (this[i + 1] & 0xFF) << 8)); b++; }  return arrayOfInt; }
/*   */ 
/*   */   
/*   */   public Ig0(byte[] paramArrayOfbyte) {}
/*   */   
/*   */   public final byte[] Ax0(f20 paramf20) {
/*   */     if (paramf20 == f20.mY)
/*   */       return this.XG; 
/*   */     throw new RuntimeException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ig0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */