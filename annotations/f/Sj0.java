/*   */ package f;public final class Sj0 extends ox0 { public final void WG0() { 
/* 2 */     try { byte[] arrayOfByte1; IvParameterSpec ivParameterSpec; F20 f20; rk rk; byte[] arrayOfByte2; this(QL(this.LL, arrayOfByte2 = Kr)); (this.gp0 = Cipher.getInstance("AES/CTR/NoPadding")).init(1, new SecretKeySpec(this.LL, "AES"), ivParameterSpec);
/*   */       
/* 4 */       this(QL(this.U7, arrayOfByte2)); (this.eb = Cipher.getInstance("AES/CTR/NoPadding")).init(2, new SecretKeySpec(this.U7, "AES"), ivParameterSpec); byte b; if ((b = this.vu0) == 0) { this.kt = f20 = F20.y6; } else if (f20 == 2) { Fh0 fh0 = Fh0.JC; } else { arrayOfByte2 = this.LL; this(arrayOfByte2, this.vu0); this.kt = rk; arrayOfByte1 = this.U7; this(this, this.vu0); this.pu = rk; return; }  ((Sj0)super).pu = rk; } catch (Exception exception) { AN.error("", this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final ik AN = C00.gd(Sj0.class);
/*   */   public static final byte[] Kr = new byte[] { 73, 86, 68, 69, 82, 73, 86 };
/*   */   public static final byte[] wa0 = new byte[] { 75, 101, 121, 83, 97, 108, 116, 1 };
/*   */   public static final byte[] cJ = new byte[] { 75, 101, 121, 83, 97, 108, 116, 2 };
/*   */   public byte[] LL;
/*   */   public byte[] U7;
/*   */   public boolean qj;
/*   */   public Uy kt;
/*   */   public Uy pu;
/*   */   public Cipher gp0;
/*   */   public Cipher eb;
/*   */   public byte vu0;
/*   */   
/*   */   public Sj0(byte paramByte) {
/*   */     byte[] arrayOfByte1;
/*   */     (arrayOfByte1 = new byte[16])[0] = 31;
/*   */     (new byte[16])[1] = -102;
/*   */     (new byte[16])[2] = Byte.MIN_VALUE;
/*   */     (new byte[16])[3] = 60;
/*   */     (new byte[16])[4] = -103;
/*   */     (new byte[16])[5] = 38;
/*   */     (new byte[16])[6] = 10;
/*   */     (new byte[16])[7] = -117;
/*   */     (new byte[16])[8] = -105;
/*   */     (new byte[16])[9] = -50;
/*   */     (new byte[16])[10] = 2;
/*   */     (new byte[16])[11] = 116;
/*   */     (new byte[16])[12] = -83;
/*   */     (new byte[16])[13] = 57;
/*   */     (new byte[16])[14] = 39;
/*   */     (new byte[16])[15] = -76;
/*   */     byte[] arrayOfByte2;
/*   */     (arrayOfByte2 = new byte[16])[0] = 63;
/*   */     (new byte[16])[1] = 24;
/*   */     (new byte[16])[2] = -15;
/*   */     (new byte[16])[3] = 98;
/*   */     (new byte[16])[4] = 114;
/*   */     (new byte[16])[5] = 7;
/*   */     (new byte[16])[6] = 68;
/*   */     (new byte[16])[7] = 24;
/*   */     (new byte[16])[8] = -12;
/*   */     (new byte[16])[9] = 109;
/*   */     (new byte[16])[10] = -111;
/*   */     (new byte[16])[11] = -105;
/*   */     (new byte[16])[12] = 66;
/*   */     (new byte[16])[13] = -96;
/*   */     (new byte[16])[14] = -2;
/*   */     (new byte[16])[15] = -55;
/*   */     this.qj = false;
/*   */     this.vu0 = paramByte;
/*   */     this.LL = arrayOfByte2;
/*   */     this.U7 = this;
/*   */     WG0();
/*   */   }
/*   */   
/*   */   public static byte[] QL(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
/*   */     try {
/*   */       messageDigest.update(paramArrayOfbyte2);
/*   */       messageDigest.update(paramArrayOfbyte1);
/*   */       MessageDigest messageDigest;
/*   */       (messageDigest = MessageDigest.getInstance("SHA-256")).update(paramArrayOfbyte2);
/*   */       return Arrays.copyOfRange(MessageDigest.getInstance("SHA-256").digest(), 0, 16);
/*   */     } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*   */       null.printStackTrace();
/*   */       return null;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */