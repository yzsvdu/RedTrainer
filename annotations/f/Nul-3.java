/* 1 */ package f;public final class Nul extends Kl0 { public final void sM() { this
/* 2 */       .EL = this.Ws.getInt();
/* 3 */     if ((this
/* 4 */       .bi0 = this.Ws.get()) != -1) { this
/*   */         
/* 6 */         .Da0 = this.Ws.getShort();
/* 7 */       this.Ws.get(); this.Ws.get(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public int EL;
/*   */   public byte bi0;
/*   */   public short Da0 = -1;
/*   */   
/*   */   public Nul(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     int i = this.EL;
/*   */     byte b = this.bi0;
/*   */     short s = this.Da0;
/*   */     vh0 vh0;
/*   */     Jo jo;
/*   */     if ((jo = (vh0 = (r8()).Qa).Ct) != null && vh0.yD == i) {
/*   */       jo.DU(b, s);
/*   */     } else {
/*   */       tc tc;
/*   */       if (tc = (tc)vh0.KO.get(Integer.valueOf(i)) instanceof Jo)
/*   */         ((Jo)this).DU(b, s); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */