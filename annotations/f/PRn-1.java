/* 1 */ package f;public final class PRn extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { e6.Ti(this.cD, paramByteBuffer); e6.Ti(this.tb0, paramByteBuffer); e6.Ti(this.xl, paramByteBuffer); paramByteBuffer.put((byte)this.gI0.length); z0[] arrayOfZ0; int i; byte b;
/* 2 */     for (i = (arrayOfZ0 = this.gI0).length, b = 0; b < i; ) { z0 z01; paramByteBuffer
/* 3 */         .put((z01 = this[b]).LJ0);
/*   */       
/* 5 */       paramByteBuffer.putInt(z01.VG0);
/*   */       
/* 7 */       paramByteBuffer.putShort(z01.O4); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public String cD;
/*   */   public String tb0;
/*   */   public String xl;
/*   */   public z0[] gI0;
/*   */   
/*   */   public PRn(String paramString1, String paramString2, String paramString3, z0[] paramArrayOfz0) {
/*   */     super(149);
/*   */     this.cD = paramString1;
/*   */     this.tb0 = paramString2;
/*   */     this.xl = paramString3;
/*   */     this.gI0 = paramArrayOfz0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PRn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */