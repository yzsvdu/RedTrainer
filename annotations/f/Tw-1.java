/*  1 */ package f;public class Tw { public final ZH FY(dk paramdk, int paramInt1, int paramInt2) { ZH zH; Uc uc; byte[] arrayOfByte1, arrayOfByte2; if (this.jA == 2) { int i = this.m80, j = this.Gw; arrayOfByte1 = o40.LF0(this.v3, paramInt1, paramInt2, i, j); j = this.Gw; arrayOfByte2 = o40.LF0(this.yn0, paramInt1, paramInt2, 8, j); } else { arrayOfByte1 = this.v3; arrayOfByte2 = this.yn0; }  ao[][] arrayOfAo = paramdk.f0; I30 i30 = this.WF0; if (arrayOfByte1.length == 0) { uc = Uc.xi0; this(1, 1, uc); } else { ZH zH1; Uc uc1 = Uc.xi0; this(paramInt1, paramInt2, uc1); if (uc == I30.bW) { arrayOfByte1 = o40.TD0(arrayOfByte1); } else if (uc != I30.AH0)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 11 */         throw new RuntimeException("Unsupported " + uc); }
/*    */       
/*    */       if (zH1.TU() == uc1) {
/*    */         ByteBuffer byteBuffer;
/*    */         (byteBuffer = zH1.tp0()).position(0);
/*    */         Gdx2DPixmap gdx2DPixmap;
/*    */         int i = Math.min((gdx2DPixmap = zH1.Con).Og0 * gdx2DPixmap.ju, zH1.tp0().remaining() / 4);
/*    */         if ((this[0]).length == 16) {
/*    */           for (paramInt2 = 0; paramInt2 < i; ) {
/*    */             int j;
/*    */             byte b;
/*    */             byteBuffer.putInt((j = ((ao)this[arrayOfByte2[paramInt2] + ((b = arrayOfByte1[paramInt2]) >> 4)][b & 0xF]).O6) << 8 | j >>> 24);
/*    */             paramInt2++;
/*    */           } 
/*    */         } else {
/*    */           for (paramInt2 = 0; paramInt2 < i; ) {
/*    */             int j;
/*    */             byteBuffer.putInt((j = ((ao)this[arrayOfByte2[paramInt2]][arrayOfByte1[paramInt2] & 0xFF]).O6) << 8 | j >>> 24);
/*    */             paramInt2++;
/*    */           } 
/*    */         } 
/*    */         byteBuffer.position(0);
/*    */         zH = zH1;
/*    */         return this;
/*    */       } 
/*    */       throw new RuntimeException("Invalid format"); }
/*    */     
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public byte[] v3;
/*    */   public byte[] yn0;
/*    */   public int Sw0;
/*    */   public int ve0;
/*    */   public I30 WF0;
/*    */   public int jA;
/*    */   public int Gw;
/*    */   public int m80;
/*    */   
/*    */   public final ZH H4(dk paramdk) {
/*    */     int i = this.Sw0;
/*    */     return FY(paramdk, i, this.ve0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */