/* 1 */ package f;public final class I { public final void oC0(int paramInt) { if (paramInt <= 0) { this.transient[3] = 0.0F; this.en = false; this.Qr0 = 0; this.mi = true; } else { boolean bool; System.arraycopy(this.transient, 0, this.transient, 4, 8); this.transient[11] = 0.0F; if (this.transient[3] <= 0.001F) { bool = true; } else { bool = false; }  this
/* 2 */         .en = bool ^ true; this.Qr0 = paramInt; this.mi = true; this.Ny.PI0(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final I7 Ny;
/*   */   public final float[] transient;
/*   */   public int Qr0;
/*   */   public boolean en;
/*   */   public boolean mi;
/*   */   public Runnable[] Su0;
/*   */   
/*   */   public I(I7 paramI7, pRn parampRn) {
/*   */     if (parampRn != null) {
/*   */       this.Ny = paramI7;
/*   */       this.transient = new float[12];
/*   */       Ix(parampRn);
/*   */       return;
/*   */     } 
/*   */     throw new NullPointerException("color");
/*   */   }
/*   */   
/*   */   public I(JG0 paramJG0, pRn parampRn) {
/*   */     this(paramJG0);
/*   */     Ja0 ja0;
/*   */     this(this, parampRn);
/*   */   }
/*   */   
/*   */   public I(Ja0 paramJa0) {
/*   */     this(paramJa0, pRn.WHITE);
/*   */   }
/*   */   
/*   */   public I(JG0 paramJG0) {
/*   */     this(paramJG0);
/*   */     Ja0 ja0;
/*   */     this(this);
/*   */   }
/*   */   
/*   */   public final void Ix(pRn parampRn) {
/*   */     parampRn.gz0(0, this.transient);
/*   */     parampRn.gz0(4, this.transient);
/*   */     this.mi = pRn.WHITE.equals(parampRn) ^ true;
/*   */     this.en = false;
/*   */     this.Qr0 = 0;
/*   */     this.Ny.PI0();
/*   */   }
/*   */   
/*   */   public final void md(Runnable paramRunnable) {
/*   */     this.Su0 = (Runnable[])hm.LpT6((Object[])this.Su0, paramRunnable, Runnable.class);
/*   */   }
/*   */   
/*   */   public final void sz(pRn parampRn, int paramInt) {
/*   */     if (paramInt <= 0) {
/*   */       Ix(parampRn);
/*   */     } else {
/*   */       parampRn.gz0(8, this.transient);
/*   */       System.arraycopy(this.transient, 0, this.transient, 4, 4);
/*   */       this.en = true;
/*   */       this.Qr0 = paramInt;
/*   */       this.mi = true;
/*   */       this.Ny.PI0();
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void s90() {
/*   */     if (this.en) {
/*   */       int i;
/*   */       float f1 = Math.min(i = this.Ny.lh0(), this.Qr0) / this.Qr0;
/*   */       float f2 = 1.0F - f1;
/*   */       float[] arrayOfFloat = this.transient;
/*   */       for (byte b = 0; b < 4; b++) {
/*   */         float f = f2 * arrayOfFloat[b + 4];
/*   */         arrayOfFloat[b] = f1 * arrayOfFloat[b + 8] + f;
/*   */       } 
/*   */       if (i >= this.Qr0) {
/*   */         boolean bool;
/*   */         this.en = false;
/*   */         float[] arrayOfFloat1;
/*   */         if ((arrayOfFloat1 = this.transient)[0] < 0.999F || arrayOfFloat1[1] < 0.999F || arrayOfFloat1[2] < 0.999F || arrayOfFloat1[3] < 0.999F) {
/*   */           bool = true;
/*   */         } else {
/*   */           bool = false;
/*   */         } 
/*   */         this.mi = bool;
/*   */         hm.Fz0(this.Su0);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean X60() {
/*   */     return this.en;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */