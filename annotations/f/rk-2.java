/* 1 */ package f;public final class rk extends Uy { public final boolean Sb0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) { int i; if (paramInt2 < (i = this.Ye)) return false;  this
/* 2 */       .CU.update(paramArrayOfbyte, paramInt1, paramInt2 - i); this.Com2.position(0); this.A30 = (i = this.A30) + 1; this.CU.update(this.Com2.putInt(0, i)); byte[] arrayOfByte = this.CU.doFinal(); int j = 0; byte b = 0; int k; while (b < (
/* 3 */       k = this.Ye)) { j |= arrayOfByte[b] ^ 
/* 4 */         paramArrayOfbyte[paramInt1 + paramInt2 - k + b]; b++; }  return (j == 0); }
/*   */ 
/*   */   
/*   */   public static final ik hs = C00.gd(rk.class);
/*   */   public Mac wu;
/*   */   public Mac CU;
/*   */   public int vq0 = 0;
/*   */   public int A30 = 0;
/*   */   public ByteBuffer wa;
/*   */   public ByteBuffer Com2;
/*   */   public final int Ye;
/*   */   
/*   */   public rk(byte[] paramArrayOfbyte, int paramInt) {
/*   */     ByteOrder byteOrder;
/*   */     this.wa = ByteBuffer.allocate(4).order(byteOrder = ByteOrder.BIG_ENDIAN);
/*   */     this.Com2 = ByteBuffer.allocate(4).order(byteOrder);
/*   */     if (paramInt <= 32 && paramInt >= 4) {
/*   */       this.Ye = paramInt;
/*   */       try {
/*   */         SecretKeySpec secretKeySpec;
/*   */         this(paramArrayOfbyte, "HmacSHA256");
/*   */         this.wu = mac;
/*   */         Mac mac;
/*   */         (mac = Mac.getInstance("HmacSHA256")).init(secretKeySpec);
/*   */         this.CU = mac;
/*   */         (mac = Mac.getInstance("HmacSHA256")).init(secretKeySpec);
/*   */       } catch (Exception exception) {
/*   */         hs.error("", this);
/*   */       } 
/*   */       return;
/*   */     } 
/*   */     throw new RuntimeException();
/*   */   }
/*   */   
/*   */   public final int KB() {
/*   */     return this.Ye;
/*   */   }
/*   */   
/*   */   public final void on(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*   */     this.wu.update(paramArrayOfbyte, paramInt1, paramInt2);
/*   */     this.wa.position(0);
/*   */     int i;
/*   */     this.vq0 = (i = this.vq0) + 1;
/*   */     this.wu.update(this.wa.putInt(0, i));
/*   */     try {
/*   */       this.wu.doFinal(paramArrayOfbyte, paramInt1 + paramInt2);
/*   */     } catch (ShortBufferException shortBufferException) {
/*   */       hs.error("", this);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */