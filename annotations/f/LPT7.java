/* 1 */ package f;public final class LPT7 extends j60 { public final String j00() { this.ON.U
/* 2 */       .getClass(); return Ml0.la(143000 + (this.p20 & 0xFF), "???"); }
/*   */ 
/*   */   
/*   */   public short E20;
/*   */   public byte[] kB = new byte[4];
/*   */   public short p20;
/*   */   
/*   */   public LPT7(oD paramoD, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) {
/*   */     this.ka = 3;
/*   */     super.p20 = paramByteBuffer1.getShort();
/*   */     this.LK = paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     this.E20 = paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer1.getShort();
/*   */     paramByteBuffer2.get(this.kB);
/*   */     int i;
/*   */     if ((i = (oD.dT(paramoD).Sk(0)).H80[super.p20][this.LK]) > 0) {
/*   */       this.bQ = (short)i;
/*   */       this.p20 = (short)(oD.dT(paramoD).U40(i)).d8;
/*   */     } else if ((i = this.E20) == 120) {
/*   */       this.bQ = 207;
/*   */       this.p20 = (short)(oD.dT(paramoD).U40(207)).d8;
/*   */     } else if (i == 129) {
/*   */       this.bQ = 560;
/*   */       this.p20 = (short)(oD.dT(paramoD).U40(560)).d8;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */