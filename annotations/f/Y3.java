/* 1 */ package f;public final class Y3 { public final void vs0() { byteBuffer.getShort(); byteBuffer.getShort(); byteBuffer.getInt(); byteBuffer.getShort(); byteBuffer.getShort(); ByteBuffer byteBuffer; byte b; int i; if ((b = (byteBuffer = this.si0.rb(false)).getInt()) == (i = 1313686354)) {
/* 2 */       byte[] arrayOfByte = new byte[4]; this.Sq.getClass(); byteBuffer.get(arrayOfByte); byteBuffer.getInt(); this.Sq.getClass(); this.Sq.Pj = byteBuffer.getShort(); byteBuffer.getShort(); this.Sq.getClass(); byteBuffer.getInt(); this.Sq.getClass(); byteBuffer.getInt(); this.Sq.getClass(); byteBuffer.getInt(); byteBuffer.getInt(); this.Sq.getClass(); for (this.VA = new Ji0[this.Sq.Pj], b = 0; b < this.Sq.Pj; ) { Ji0[] arrayOfJi0 = this.VA; this(); arrayOfJi0[b] = ji0; Ji0 ji0; (ji0 = new Ji0()).u4 = byteBuffer.getShort(); byteBuffer.getShort(); this.VA[b].getClass(); byteBuffer.getInt(); this.VA[b].getClass(); b++; }  for (b = 0; b < this.Sq.Pj; ) { byte b1; for ((this.VA[b]).lz0 = new v0[i = (this.VA[b]).u4], b1 = 0; b1 < i; ) { this(); v0.QK0 = byteBuffer.getShort(); v0.Br = byteBuffer.getShort(); v0 v0; (v0 = new v0()).s30 = byteBuffer.getShort(); byteBuffer.get(); byteBuffer.get(); (this.VA[b]).lz0[b1] = v0; b1++; }  b++; }  return;
/* 3 */     }  throw new RuntimeException(
/* 4 */         RH0.KK("Header magic mismatch = ", b, " vs expected ", i)); }
/*   */ 
/*   */   
/*   */   public T7 si0;
/*   */   public xT Sq;
/*   */   public Ji0[] VA;
/*   */   
/*   */   public Y3(T7 paramT7) {
/*   */     xT xT1;
/*   */     this();
/*   */     this.Sq = this;
/*   */     this.si0 = paramT7;
/*   */     vs0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Y3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */