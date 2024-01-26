/* 1 */ package f;public final class h7 extends Kl0 { public final void sM() { this
/* 2 */       .AB = this.Ws.getInt();
/*   */     
/* 4 */     this.mq = this.Ws.get();
/*   */     
/* 6 */     this.R60 = this.Ws.getShort(); }
/*   */ 
/*   */   
/*   */   public int AB;
/*   */   public byte mq;
/*   */   public short R60;
/*   */   
/*   */   public h7(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     j40 j40;
/*   */     if ((j40 = r8().s40(aq0.LI).de0(this.AB)) == null)
/*   */       return; 
/*   */     if (km.MR == null)
/*   */       km.MR = Lj.f40(); 
/*   */     byte b = this.mq;
/*   */     this(j40, b, this.R60);
/*   */     Iterator iterator;
/*   */     f4 f4;
/*   */     Gp0 gp0;
/*   */     (gp0 = km.MR).getClass();
/*   */     try {
/*   */       for (iterator = km.MR.W.iterator(); hasNext();) {
/*   */         if (f4.equals(next()))
/*   */           return; 
/*   */       } 
/*   */     } catch (ConcurrentModificationException concurrentModificationException) {}
/*   */     gp0.W.add(f4);
/*   */     while (hasNext()) {
/*   */       if (f4.equals(next()))
/*   */         return; 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */