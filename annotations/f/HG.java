/*   */ package f;public final class HG { public final boolean Lh0() { String str; 
/* 2 */     try { InetAddress[] arrayOfInetAddress; byte b; for (arrayOfInetAddress = InetAddress.getAllByName(str = "pool.ntp.org"), b = 0; b < arrayOfInetAddress.length; ) { if (vy0(arrayOfInetAddress[b])) return true;  b++; }  } catch (UnknownHostException unknownHostException) { W50.warn("Unknown host: " + str); }  W50.getClass(); return false; }
/*   */ 
/*   */   
/*   */   public static final ik W50 = C00.gd(HG.class);
/*   */   public long fn;
/*   */   public long C70;
/*   */   
/*   */   public static void mJ0(byte paramByte1, byte paramByte2, int paramInt, long paramLong1, long paramLong2) {
/*   */     if (paramByte1 != 3) {
/*   */       if (paramByte2 == 4 || paramByte2 == 5) {
/*   */         if (paramInt != 0 && paramInt <= 15) {
/*   */           if (paramLong1 != 0L) {
/*   */             if (paramLong2 != 0L)
/*   */               return; 
/*   */             throw new lk0("zero reference timestamp");
/*   */           } 
/*   */           throw new lk0("zero transmitTime");
/*   */         } 
/*   */         throw new lk0("untrusted stratum: " + paramInt);
/*   */       } 
/*   */       throw new lk0("untrusted mode: " + paramByte2);
/*   */     } 
/*   */     throw new lk0("unsynchronized server");
/*   */   }
/*   */   
/*   */   public static long L60(byte[] paramArrayOfbyte, int paramInt) {
/*   */     int i = paramArrayOfbyte[paramInt + 1];
/*   */     paramInt = paramArrayOfbyte[paramInt + 2];
/*   */     int k = paramArrayOfbyte[paramInt + 3];
/*   */     int j;
/*   */     if (((j = paramArrayOfbyte[paramInt]) & 0x80) == 128)
/*   */       j = (j & 0x7F) + 128; 
/*   */     if ((i & 0x80) == 128)
/*   */       i = (i & 0x7F) + 128; 
/*   */     if ((paramInt & 0x80) == 128)
/*   */       paramInt = (paramInt & 0x7F) + 128; 
/*   */     if ((k & 0x80) == 128)
/*   */       k = (k & 0x7F) + 128; 
/*   */     return (j << 24L) + (i << 16L) + (paramInt << 8L) + k;
/*   */   }
/*   */   
/*   */   public static long Hi(byte[] paramArrayOfbyte, int paramInt) {
/*   */     long l1 = L60(paramArrayOfbyte, paramInt + 4);
/*   */     long l2;
/*   */     if ((l2 = L60(paramArrayOfbyte, paramInt)) == 0L && l1 == 0L)
/*   */       return 0L; 
/*   */     l1 = (l2 - 2208988800L) * 1000L;
/*   */     return l1 * 1000L / 4294967296L + l1;
/*   */   }
/*   */   
/*   */   public static void bz0(byte[] paramArrayOfbyte, long paramLong) {
/*   */     byte b = 40;
/*   */     if (paramLong == 0L) {
/*   */       Arrays.fill(paramArrayOfbyte, b, 48, (byte)0);
/*   */       return;
/*   */     } 
/*   */     paramArrayOfbyte[b] = (byte)(int)(paramLong >> 24L);
/*   */     paramArrayOfbyte[41] = (byte)(int)(paramLong >> 16L);
/*   */     paramArrayOfbyte[42] = (byte)(int)(paramLong >> 8L);
/*   */     paramArrayOfbyte[43] = (byte)(int)((paramLong += 2208988800L) >> 0L);
/*   */     paramArrayOfbyte[44] = (byte)(int)(paramLong >> 24L);
/*   */     paramArrayOfbyte[45] = (byte)(int)(paramLong >> 16L);
/*   */     paramArrayOfbyte[46] = (byte)(int)((paramLong = (paramLong - (paramLong /= 1000L) * 1000L) * 4294967296L / 1000L) >> 8L);
/*   */     paramArrayOfbyte[47] = (byte)(int)(Math.random() * 255.0D);
/*   */   }
/*   */   
/*   */   public final boolean vy0(InetAddress paramInetAddress) {
/*   */     DatagramSocket datagramSocket;
/*   */     byte b = 123;
/*   */     char c = 'Ϩ';
/*   */     DatagramPacket datagramPacket = null;
/*   */     try {
/*   */       DatagramSocket datagramSocket1;
/*   */       this();
/*   */     } catch (Exception exception) {
/*   */     
/*   */     } finally {
/*   */       DatagramSocket datagramSocket1;
/*   */       this = null;
/*   */     } 
/*   */     "request time failed: " + this;
/*   */     W50.getClass();
/*   */     boolean bool = false;
/*   */     if (datagramSocket != null)
/*   */       datagramSocket.close(); 
/*   */     return bool;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HG.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */