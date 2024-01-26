/* 1 */ package f;public final class JK0 extends sK { public final boolean fy(Q90 paramQ90, UD0 paramUD0) { if (paramQ90 != null) {
/* 2 */       boolean bool1; short[] arrayOfShort; int i = (arrayOfShort = paramQ90.En0).length; byte b = 0; while (true) { if (b < i) { if (arrayOfShort[b] == this.Mk0) { boolean bool2 = true; break; }  b++; continue; }  bool1 = false; break; }  return bool1;
/*   */     } 
/*   */     boolean bool = false;
/*   */     break; }
/*   */ 
/*   */   
/*   */   public final short Mk0;
/*   */   
/*   */   public JK0(short paramShort) {
/*   */     super((byte)16);
/*   */     this.Mk0 = paramShort;
/*   */   }
/*   */   
/*   */   public final void K10(ByteBuffer paramByteBuffer) {
/*   */     paramByteBuffer.put(this.ak);
/*   */     paramByteBuffer.putShort(this.Mk0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */