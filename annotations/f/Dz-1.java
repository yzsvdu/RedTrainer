/* 1 */ package f;public final class Dz extends sK { public final boolean fy(Q90 paramQ90, UD0 paramUD0) { boolean bool; int i; if (paramQ90 != null && (i = paramQ90.Ck) > this
/* 2 */       .B0 && i < this.xj0) { bool = true; } else { bool = false; }  return bool; }
/*   */ 
/*   */   
/*   */   public final int B0;
/*   */   public final int xj0;
/*   */   
/*   */   public Dz(int paramInt) {
/*   */     super((byte)15);
/*   */     calendar.set(paramInt, 0, 0, 0, 0, 0);
/*   */     this.B0 = (int)(calendar.getTimeInMillis() / 1000L);
/*   */     Calendar calendar;
/*   */     (calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).set(paramInt, 11, 31, 23, 59, 59);
/*   */     this.xj0 = (int)(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() / 1000L);
/*   */   }
/*   */   
/*   */   public final void K10(ByteBuffer paramByteBuffer) {
/*   */     paramByteBuffer.put(this.ak);
/*   */     paramByteBuffer.putInt(this.B0);
/*   */     paramByteBuffer.putInt(this.xj0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */