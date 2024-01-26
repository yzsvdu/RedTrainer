/* 1 */ package f;public final class Me implements iq0 { public final void dispose() { if (this.Com4) { fQ fQ1; for (byte b = 0; b < (fQ1 = this.Eh0).Z8; ) { ((pe0)fQ1.get(b)).G3
/* 2 */           .dispose(); b++; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public final vQ XO;
/*   */   public fQ Eh0;
/*   */   public final GE Ca;
/*   */   public boolean Hr0;
/*   */   public boolean Com4;
/*   */   
/*   */   public Me() {
/*   */     this(UB0.vj0.cw("com/badlogic/gdx/utils/lsans-15.fnt"), UB0.vj0.cw("com/badlogic/gdx/utils/lsans-15.png"), false, true);
/*   */   }
/*   */   
/*   */   public Me(boolean paramBoolean) {
/*   */     this(UB0.vj0.cw("com/badlogic/gdx/utils/lsans-15.fnt"), UB0.vj0.cw("com/badlogic/gdx/utils/lsans-15.png"), paramBoolean, true);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD0, pe0 parampe0) {
/*   */     this(paramRD0, parampe0, false);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD0, pe0 parampe0, boolean paramBoolean) {
/*   */     this(paramRD0, paramBoolean);
/*   */     vQ vQ1;
/*   */     this(this, parampe0, true);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD0) {
/*   */     this(paramRD0, false);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD0, boolean paramBoolean) {
/*   */     this(paramRD0, paramBoolean);
/*   */     vQ vQ1;
/*   */     this(this, (pe0)null, true);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD01, RD0 paramRD02, boolean paramBoolean) {
/*   */     this(paramRD01, paramRD02, paramBoolean, true);
/*   */   }
/*   */   
/*   */   public Me(RD0 paramRD01, RD0 paramRD02, boolean paramBoolean1, boolean paramBoolean2) {
/*   */     this(paramRD01, paramBoolean1);
/*   */     vQ vQ1;
/*   */     pe0 pe0;
/*   */     Texture texture;
/*   */     this(paramRD02, false);
/*   */     this(texture);
/*   */     this(this, pe0, paramBoolean2);
/*   */     this.Com4 = true;
/*   */   }
/*   */   
/*   */   public Me(vQ paramvQ, pe0 parampe0, boolean paramBoolean) {
/*   */     this(paramvQ, (fQ)parampe0, paramBoolean);
/*   */   }
/*   */   
/*   */   public Me(vQ paramvQ, fQ paramfQ, boolean paramBoolean) {
/*   */     int i;
/*   */     this.XO = paramvQ;
/*   */     this.Hr0 = paramBoolean;
/*   */     if (paramfQ == null || paramfQ.Z8 == 0) {
/*   */       String[] arrayOfString;
/*   */       if ((arrayOfString = paramvQ.cI) != null) {
/*   */         fQ fQ1;
/*   */         i = arrayOfString.length;
/*   */         this(i);
/*   */         this.Eh0 = fQ1;
/*   */         for (byte b = 0; b < i; b++) {
/*   */           RD0 rD0;
/*   */           if ((rD0 = paramvQ.sB) == null) {
/*   */             rD0 = UB0.vj0.aP(paramvQ.cI[b]);
/*   */           } else {
/*   */             String str = paramvQ.cI[b];
/*   */             rD0 = UB0.vj0.VH(str, rD0.vW());
/*   */           } 
/*   */           this.Eh0.Com3(new pe0(new Texture(rD0, false)));
/*   */         } 
/*   */         this.Com4 = true;
/*   */       } else {
/*   */         throw new IllegalArgumentException("If no regions are specified, the font data must have an images path.");
/*   */       } 
/*   */     } else {
/*   */       this.Eh0 = i;
/*   */       this.Com4 = false;
/*   */     } 
/*   */     this.Ca = ag0();
/*   */     Xj(paramvQ);
/*   */   }
/*   */   
/*   */   public final void Xj(vQ paramvQ) {
/*   */     Jk0[][] arrayOfJk0;
/*   */     int i = (arrayOfJk0 = paramvQ.Jj0).length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       Jk0[] arrayOfJk01;
/*   */       if ((arrayOfJk01 = arrayOfJk0[b]) != null) {
/*   */         int j = arrayOfJk01.length;
/*   */         for (byte b1 = 0; b1 < j; b1++) {
/*   */           Jk0 jk01;
/*   */           if ((jk01 = arrayOfJk01[b1]) != null)
/*   */             paramvQ.KU(jk01, (pe0)this.Eh0.get(jk01.R80)); 
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     Jk0 jk0;
/*   */     if ((jk0 = paramvQ.OB0) != null)
/*   */       paramvQ.KU(jk0, (pe0)this.Eh0.get(jk0.R80)); 
/*   */   }
/*   */   
/*   */   public final boolean Ah() {
/*   */     return this.Hr0;
/*   */   }
/*   */   
/*   */   public final GE ag0() {
/*   */     return new GE(this, this.Hr0);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     String str;
/*   */     if ((str = this.XO.L7) == null)
/*   */       str = super.toString(); 
/*   */     return str;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Me.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */