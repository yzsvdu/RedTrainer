/* 1 */ package f;public final class ov extends eE { public final void vf0(float paramFloat) { this.Ft = paramFloat; long l;
/* 2 */     if ((l = this.iu) == 0L) return;  Sseqj.setVolume(l, paramFloat); }
/*   */ 
/*   */   
/*   */   public static byte Ia0 = -1;
/*   */   
/*   */   public ov(byte paramByte, short paramShort1, short paramShort2, vR paramvR) {
/*   */     super(paramByte, paramShort1, paramvR);
/*   */     this.iu = l;
/*   */     long l;
/*   */     if ((l = Sseqj.newPlayer(eE.iU)) != 0L) {
/*   */       if (Sseqj.loadSSEQ(l, paramByte, paramShort1, paramShort2) != 0) {
/*   */         if (paramByte == 2)
/*   */           if (paramShort1 != 1055) {
/*   */             if (paramShort1 != 1057) {
/*   */               if (paramShort1 == 1063)
/*   */                 Sseqj.setTrackMuted(this.iu, 8, true); 
/*   */             } else {
/*   */               Sseqj.setTrackMuted(this.iu, 7, true);
/*   */               Sseqj.setTrackMuted(this.iu, 8, true);
/*   */             } 
/*   */           } else {
/*   */             Sseqj.setTrackMuted(this.iu, 6, true);
/*   */             Sseqj.setTrackMuted(this.iu, 7, true);
/*   */             Sseqj.setTrackMuted(this.iu, 8, true);
/*   */             Sseqj.setTrackMuted(this.iu, 9, true);
/*   */           }  
/*   */         if (Ia0 != -1)
/*   */           for (paramByte = 0; paramByte < 16; paramByte++) {
/*   */             boolean bool;
/*   */             long l1 = this.iu;
/*   */             if ((Ia0 & 1 << paramByte) == 0) {
/*   */               bool = true;
/*   */             } else {
/*   */               bool = false;
/*   */             } 
/*   */             Sseqj.setTrackMuted(l1, paramByte, bool);
/*   */           }  
/*   */         return;
/*   */       } 
/*   */       throw new RuntimeException("Unable to load sseq");
/*   */     } 
/*   */     throw new RuntimeException("Unable to allocate player");
/*   */   }
/*   */   
/*   */   public final void Ch0(float paramFloat) {
/*   */     long l;
/*   */     if ((l = this.iu) == 0L)
/*   */       return; 
/*   */     Sseqj.setPan(l, paramFloat);
/*   */   }
/*   */   
/*   */   public final int zk0(ByteBuffer paramByteBuffer, int paramInt) {
/*   */     long l;
/*   */     return ((l = this.iu) == 0L) ? 1 : Sseqj.generateSamples(l, paramByteBuffer, paramInt);
/*   */   }
/*   */   
/*   */   public final void vx0(float paramFloat) {
/*   */     long l;
/*   */     if ((l = this.iu) == 0L)
/*   */       return; 
/*   */     Sseqj.setPitchShift(l, paramFloat);
/*   */   }
/*   */   
/*   */   public final boolean Kt() {
/*   */     long l;
/*   */     return ((l = this.iu) == 0L) ? true : Sseqj.isStopped(l);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     long l;
/*   */     if ((l = this.iu) == 0L)
/*   */       return; 
/*   */     this.iu = 0L;
/*   */     Sseqj.deletePlayer(l);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */