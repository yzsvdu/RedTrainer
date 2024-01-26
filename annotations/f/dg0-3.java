/* 1 */ package f;public final class dg0 extends sK { public dg0(Lw paramLw) { super((byte)0); this.Au0 = paramLw; } public Lw Au0; public final void K10(ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.ak); paramByteBuffer
/*   */       
/* 3 */       .putShort((short)this.Au0.ir0); short[] arrayOfShort; int i; byte b; for (i = (arrayOfShort = this.Au0.YH()).length, b = 0; b < i; ) { paramByteBuffer.putShort(this[b]); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final boolean UW() {
/*   */     return this.Au0.isEmpty();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */