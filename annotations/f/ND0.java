/* 1 */ package f;public final class ND0 extends eE { public final void vf0(float paramFloat) { this.Ft = paramFloat; long l;
/* 2 */     if ((l = this.iu) == 0L) return;  Agbplayj.setVolume(l, paramFloat); }
/*   */ 
/*   */   
/*   */   public ND0(byte paramByte, short paramShort, vR paramvR) {
/*   */     super(paramByte, paramShort, paramvR);
/*   */     this.iu = l;
/*   */     long l;
/*   */     if ((l = Agbplayj.newPlayer()) != 0L) {
/*   */       if (Agbplayj.loadSong(l, paramByte, paramShort) != 0)
/*   */         return; 
/*   */       throw new RuntimeException("Unable to load agbplayj");
/*   */     } 
/*   */     throw new RuntimeException("Unable to allocate player");
/*   */   }
/*   */   
/*   */   public final void Ch0(float paramFloat) {}
/*   */   
/*   */   public final int zk0(ByteBuffer paramByteBuffer, int paramInt) {
/*   */     long l;
/*   */     return ((l = this.iu) == 0L) ? 1 : Agbplayj.generateSamples(l, paramByteBuffer, paramInt);
/*   */   }
/*   */   
/*   */   public final boolean Kt() {
/*   */     long l;
/*   */     return ((l = this.iu) == 0L) ? true : Agbplayj.isStopped(l);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     long l;
/*   */     if ((l = this.iu) == 0L)
/*   */       return; 
/*   */     this.iu = 0L;
/*   */     Agbplayj.deletePlayer(l);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ND0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */