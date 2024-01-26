/* 1 */ package f;public final class pE0 { public final boolean G10(byte[] paramArrayOfbyte) { int i, arrayOfInt[] = new int[i = this.gW], j = 0; byte b1 = 0; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/security/MessageDigest}, name=null} */ while (j < i) { MessageDigest messageDigest; byte b2; try { ji0.update(b1); b1 = (byte)(b1 + 1); byte[] arrayOfByte = ji0.digest(paramArrayOfbyte); } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=maybe_byte}, name=null} */ }  }  for (byte b = 0; b < i; )
/* 2 */     { j = arrayOfInt[b]; if (!this.mG.get(Math.abs(j % this.WI0))) return false;  b++; }  return true; }
/*   */ 
/*   */   
/*   */   public static MessageDigest ji0;
/*   */   public BitSet mG;
/*   */   public int WI0;
/*   */   public int gW;
/*   */   
/*   */   public pE0(int paramInt1, int paramInt2, BitSet paramBitSet) {
/*   */     this.gW = paramInt2;
/*   */     this.WI0 = paramInt1;
/*   */     this.mG = paramBitSet;
/*   */   }
/*   */   
/*   */   public static BitSet Dm(byte[] paramArrayOfbyte) {
/*   */     this(paramArrayOfbyte.length * 8);
/*   */     BitSet bitSet;
/*   */     for (byte b = 0; b < paramArrayOfbyte.length * 8; b++) {
/*   */       if ((paramArrayOfbyte[b / 8] & 1 << b % 8) != 0)
/*   */         bitSet.set(b); 
/*   */     } 
/*   */     return bitSet;
/*   */   }
/*   */   
/*   */   static {
/*   */     MessageDigest messageDigest;
/*   */     try {
/*   */       messageDigest = MessageDigest.getInstance("MD5");
/*   */     } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*   */       messageDigest = null;
/*   */     } 
/*   */     ji0 = messageDigest;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */