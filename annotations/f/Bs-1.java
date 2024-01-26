/* 1 */ package f;public abstract class Bs { public final ByteBuffer qq() { s(); ByteBuffer byteBuffer; (byteBuffer = this.wX.rb(false))
/* 2 */       .position(this.L8); if (this.rM.bO() == 3 && this.MV == 571) { byteBuffer.position(this.L8 + 25401); byteBuffer.position(byteBuffer.position() + 7); byte b1 = byteBuffer.get(); byteBuffer.position(byteBuffer.position() + 7); byte b2 = byteBuffer.get(); byteBuffer.position(byteBuffer.position() + 7); byte b3 = byteBuffer.get(); if (byteBuffer.get() == -120 && b1 == 0 && b2 == Byte.MIN_VALUE && b3 == 16) { byteBuffer.position(0); byteBuffer1.put(byteBuffer); ByteBuffer byteBuffer1; (byteBuffer1 = ByteBuffer.allocate(byteBuffer.limit()).order(byteBuffer.order())).position(this.L8 + 25401); byte b; byte[] arrayOfByte; for (b = 0, arrayOfByte = y50; b < ''; ) { byteBuffer1.put((byte)(byteBuffer1.get(byteBuffer1.position()) ^ arrayOfByte[b])); byteBuffer1.position(byteBuffer1.position() + 7); b++; }  byteBuffer = byteBuffer1; }  byteBuffer.position(this.L8); }  return byteBuffer; }
/*   */ 
/*   */   
/*   */   public static final byte[] y50 = new byte[] { 
/*   */       -83, 8, -120, 17, -124, 51, -126, 17, -116, -40, 
/*   */       -86, 1, -120, -40, 100, 34, -118, 1, 100, 2, 
/*   */       46, -4, -16, 0, 9, 38, -8, -20, 8, 0, 
/*   */       -12, 37, -8, -16, 9, 1, -91, 24, Byte.MIN_VALUE, 1, 
/*   */       -116, 34, -118, 1, -116, -20, -86, 1, -120, -20, 
/*   */       -86, 0, 120, 37, -4, -12, 8, 0, 45, -16, 
/*   */       -8, 0, 8, 37, -16, -8, 8, 1, -83, -4, 
/*   */       100, 1, -120, 0, 116, 37, 112, -8, -120, 0, 
/*   */       -83, -32, 104, 0, -120, 52, -116, 28, -120, 0, 
/*   */       -91, 12, -124, 0, -120, 37, 124, -12, -120, 0, 
/*   */       -83, 20, -124, 0, -120, 37, 100, -20, -120, 0, 
/*   */       8, -4, -83, -36, 84, 0, -119, 53, 116, -4, 
/*   */       -119, 16, -83, -16, 120, 0, -120, 37, -44, -36, 
/*   */       8, 1 };
/*   */   public HI rM;
/*   */   public short MV;
/*   */   public T7 wX;
/*   */   public int ar0 = 0;
/*   */   public int Rc0 = 0;
/*   */   public int kT;
/*   */   public int L8;
/*   */   public int[] Ul0;
/*   */   public int dd0;
/*   */   
/*   */   public Bs(HI paramHI, short paramShort, T7 paramT7) {
/*   */     this.rM = paramHI;
/*   */     this.MV = paramShort;
/*   */     this.wX = paramT7;
/*   */   }
/*   */   
/*   */   public Bs(Bs paramBs) {
/*   */     this.rM = paramBs.rM;
/*   */     this.MV = paramBs.MV;
/*   */     this.wX = paramBs.wX;
/*   */     this.ar0 = paramBs.ar0;
/*   */     this.Rc0 = paramBs.Rc0;
/*   */     this.kT = paramBs.kT;
/*   */     this.L8 = paramBs.L8;
/*   */     this.Ul0 = paramBs.Ul0;
/*   */     this.dd0 = paramBs.dd0;
/*   */   }
/*   */   
/*   */   public abstract void s();
/*   */   
/*   */   public final short lc0() {
/*   */     return this.MV;
/*   */   }
/*   */   
/*   */   public final T7 ZJ() {
/*   */     return this.wX;
/*   */   }
/*   */   
/*   */   public final int nG() {
/*   */     return this.dd0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */