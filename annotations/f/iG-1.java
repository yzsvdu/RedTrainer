/* 1 */ package f;public final class iG extends vO { public final void rf0(ByteBuffer paramByteBuffer) { byte[] arrayOfByte; if (paramByteBuffer.getInt() != 1414529101) { paramByteBuffer.position(paramByteBuffer.position() - 4); paramByteBuffer.get(arrayOfByte = new byte[4]); System.out
/* 2 */         .println(B40.df("NOT MPT header: ").append((new String(this)).trim()).toString()); return; }  ((iG)super).oO = paramByteBuffer.getShort() & 0xFFFF; ((iG)super).kl = paramByteBuffer.get(); ((iG)super).lpt8 = paramByteBuffer.get(); ((iG)super).o80 = paramByteBuffer.getShort() & 0xFFFF; ((iG)super).jv0 = paramByteBuffer.getShort() & 0xFFFF; Supplier supplier = Sh::new; ((iG)super)
/*   */       
/* 4 */       .Uj0 = (new Yy0(paramByteBuffer, supplier, ((vO)this).Vk)).ai0; paramByteBuffer.position(((vO)this).Vk + ((iG)super).o80); byte b; for (((iG)super).Ba0 = new fQ(((iG)super).kl), b = 0; b < ((iG)super).kl; ) { byte[] arrayOfByte1; paramByteBuffer
/* 5 */         .get(arrayOfByte1 = new byte[16]);
/* 6 */       ((iG)super).Ba0.Com3((new String(arrayOfByte1)).trim()); b++; }  paramByteBuffer.position(((vO)this).Vk + ((iG)super).jv0); for (((iG)super).rn = new fQ(((iG)super).lpt8), b = 0; b < ((iG)super).lpt8; ) { byte[] arrayOfByte1; paramByteBuffer
/* 7 */         .get(arrayOfByte1 = new byte[16]);
/* 8 */       ((iG)super).rn.Com3((new String(arrayOfByte1)).trim()); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int oO;
/*   */   public byte kl;
/*   */   public byte lpt8;
/*   */   public int o80;
/*   */   public int jv0;
/*   */   public fQ Ba0;
/*   */   public fQ rn;
/*   */   public fQ Uj0;
/*   */   
/*   */   public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
/*   */     this.Vk = paramByteBuffer.getInt();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */