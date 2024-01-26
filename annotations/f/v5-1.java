/* 1 */ package f;public abstract class v5 { public static ECPublicKey Kf(byte[] paramArrayOfbyte) { if (xh == null) aW();  ECParameterSpec eCParameterSpec = xh; int i = 1; if (paramArrayOfbyte[0] == 4) { int j = (eCParameterSpec.getOrder().bitLength() + 8 - 1) / 8; if (paramArrayOfbyte.length == j * 2 + 1) { ECPoint eCPoint; ECPublicKeySpec eCPublicKeySpec; BigInteger bigInteger1, bigInteger2; this(1, Arrays.copyOfRange(paramArrayOfbyte, i, i = j + i)); this(1, Arrays.copyOfRange(paramArrayOfbyte, i, i + j)); this(bigInteger1, bigInteger2); this(eCPoint, eCParameterSpec); return (ECPublicKey)KeyFactory.getInstance("EC").generatePublic(eCPublicKeySpec); }  throw new GeneralSecurityException("Invalid uncompressedPoint encoding, not the correct size"); }  throw new GeneralSecurityException("Invalid uncompressedPoint encoding, no uncompressed point indicator"); }
/*   */ 
/*   */   
/*   */   public static ECParameterSpec xh;
/*   */   
/*   */   public static void aW() {
/*   */     if (xh == null) {
/*   */       try {
/*   */         AlgorithmParameters.getInstance("EC").init(new ECGenParameterSpec("secp256r1"));
/*   */         xh = AlgorithmParameters.getInstance("EC").<ECParameterSpec>getParameterSpec(ECParameterSpec.class);
/*   */       } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*   */         KeyPairGenerator.getInstance("EC").initialize(new ECGenParameterSpec("secp256r1"));
/*   */         xh = ((ECPublicKey)KeyPairGenerator.getInstance("EC").generateKeyPair().getPublic()).getParams();
/*   */       } 
/*   */       if (KeyAgreement.getInstance("ECDH") == null)
/*   */         throw new RuntimeException(); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public static byte[] ya(ECPublicKey paramECPublicKey) {
/*   */     int k;
/*   */     byte b = 1;
/*   */     int j;
/*   */     byte[] arrayOfByte1;
/*   */     (arrayOfByte1 = new byte[(j = (paramECPublicKey.getParams().getOrder().bitLength() + 8 - 1) / 8) * 2 + 1])[0] = 4;
/*   */     byte[] arrayOfByte3;
/*   */     if ((arrayOfByte3 = paramECPublicKey.getW().getAffineX().toByteArray()).length <= j) {
/*   */       k = b + j - arrayOfByte3.length;
/*   */       int m = arrayOfByte3.length;
/*   */       System.arraycopy(arrayOfByte3, 0, arrayOfByte1, k, m);
/*   */     } else if (k.length == j + 1 && k[0] == 0) {
/*   */       System.arraycopy(k, 1, arrayOfByte1, b, j);
/*   */     } else {
/*   */       throw new IllegalStateException("x value is too large");
/*   */     } 
/*   */     int i = b + j;
/*   */     byte[] arrayOfByte2;
/*   */     if ((arrayOfByte2 = paramECPublicKey.getW().getAffineY().toByteArray()).length <= j) {
/*   */       i = i + j - arrayOfByte2.length;
/*   */       j = arrayOfByte2.length;
/*   */       System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, j);
/*   */     } else {
/*   */       if (arrayOfByte2.length == j + 1 && arrayOfByte2[0] == 0) {
/*   */         System.arraycopy(arrayOfByte2, 1, arrayOfByte1, i, j);
/*   */         return arrayOfByte1;
/*   */       } 
/*   */       throw new IllegalStateException("y value is too large");
/*   */     } 
/*   */     return arrayOfByte1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/v5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */