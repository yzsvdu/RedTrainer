/* 1 */ package f;public final class hf0 implements vU { public hf0(ry paramry, List paramList) { this
/* 2 */       .uk = false; this.NuL = 1.0F; this.aUX = 1.0F; this.import = 1.0F; this.s3 = 0; this.Mz = false; this.IV = 0; this.xf0 = paramList; OL oL; if ((oL = UB0.L90) == null) { gk.y2.error("Gdx audio is null, check configuration."); this.mS = null; this.Mz = true; return; }  try { this.mS = oL.V2(paramry); } catch (Exception exception) { R8 r8; if ((r8 = km.u4) != null) r8.Pq(Ml0.Go(1231, paramry.toString()));  gk.y2.error("Error loading sound " + paramry + ". Please check any mods for errors.", exception); this.mS = null; this.Mz = true; }  this.IV = (int)(System.currentTimeMillis() / 1000L); }
/*   */ 
/*   */   
/*   */   public cF mS;
/*   */   public boolean uk;
/*   */   public float NuL;
/*   */   public float aUX;
/*   */   public float import;
/*   */   public short s3;
/*   */   public boolean Mz;
/*   */   public final List xf0;
/*   */   public int IV;
/*   */   
/*   */   public final void Ch0(float paramFloat) {
/*   */     if (this.Mz)
/*   */       return; 
/*   */     this.aUX = paramFloat;
/*   */   }
/*   */   
/*   */   public final boolean isDone() {
/*   */     if (this.Mz)
/*   */       return true; 
/*   */     if ((int)(System.currentTimeMillis() / 1000L) - this.IV < 15)
/*   */       return false; 
/*   */     this.Mz = true;
/*   */     this.mS.dispose();
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void finalize() {
/*   */     try {
/*   */       if (!this.Mz) {
/*   */         this.mS.stop();
/*   */         this.Mz = true;
/*   */         this.mS.dispose();
/*   */       } 
/*   */     } catch (Exception exception) {}
/*   */     super.finalize();
/*   */   }
/*   */   
/*   */   public final void Ix0() {
/*   */     if (this.Mz)
/*   */       return; 
/*   */     this.IV = (int)(System.currentTimeMillis() / 1000L);
/*   */     float f1 = this.import;
/*   */     float f2 = this.NuL;
/*   */     float f3 = this.aUX;
/*   */     long l = this.mS.coM7(f1, f2, f3);
/*   */     this.mS.fE0(l, this.uk);
/*   */     this.xf0.add(this);
/*   */   }
/*   */   
/*   */   public final void oC0() {
/*   */     if (this.Mz)
/*   */       return; 
/*   */     this.mS.oC0();
/*   */   }
/*   */   
/*   */   public final void resume() {
/*   */     if (this.Mz)
/*   */       return; 
/*   */     this.mS.Ix0();
/*   */   }
/*   */   
/*   */   public final void Wi0(boolean paramBoolean) {
/*   */     if (this.Mz)
/*   */       return; 
/*   */     this.mS.stop();
/*   */   }
/*   */   
/*   */   public final boolean Vh() {
/*   */     return this.Mz;
/*   */   }
/*   */   
/*   */   public final byte jA() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final short LE() {
/*   */     return this.s3;
/*   */   }
/*   */   
/*   */   public final void vf0(float paramFloat) {
/*   */     this.import = paramFloat;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */