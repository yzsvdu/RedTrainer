/* 1 */ package f;public final class bu0 extends Xk { public final String m20() { byte b; if ((b = this.lPt9.bO()) != 3) { if (b == 4) return Ml0.bM0(729, this.tK);  throw new UnsupportedOperationException(); }  short s = this.tK; char c = 'ɪ'; String[] arrayOfString = Ml0.EH0; return Ml0.tG((byte)3, F40.ef0, c, s, arrayOfString); }
/*   */ 
/*   */   
/*   */   public byte TS = 0;
/*   */   public byte Mk0 = 0;
/*   */   public K60[] TK0;
/*   */   public short[] de0 = new short[4];
/*   */   public HI lPt9;
/*   */   
/*   */   public bu0(short paramShort, HI paramHI, ByteBuffer paramByteBuffer) {
/*   */     super(paramHI.bO(), paramShort);
/*   */     this.lPt9 = paramHI;
/*   */     if (paramByteBuffer.remaining() < 20) {
/*   */       this.TK0 = new K60[0];
/*   */       return;
/*   */     } 
/*   */     this.TS = paramByteBuffer.get();
/*   */     this.Mk0 = paramByteBuffer.get();
/*   */     paramByteBuffer.get();
/*   */     this.TK0 = new K60[paramByteBuffer.get()];
/*   */     for (paramShort = 0; paramShort < this.de0.length; paramShort++) {
/*   */       short s;
/*   */       if ((s = paramByteBuffer.getShort()) > 112 && s < 135)
/*   */         s = 0; 
/*   */       this.de0[paramShort] = s;
/*   */     } 
/*   */     paramByteBuffer.getInt();
/*   */     if (paramByteBuffer.getInt() == 2);
/*   */   }
/*   */   
/*   */   public final byte YF() {
/*   */     return this.Mk0;
/*   */   }
/*   */   
/*   */   public final short NO() {
/*   */     return (short)this.Mk0;
/*   */   }
/*   */   
/*   */   public final boolean HF0() {
/*   */     return ((this.TS & 0x1) != 0);
/*   */   }
/*   */   
/*   */   public final boolean Aq() {
/*   */     return ((this.TS & 0x2) != 0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bu0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */