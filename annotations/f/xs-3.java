/* 1 */ package f;public final class xs extends dQ { public final void J00(throws paramthrows) { this.mp = i; int i; if ((i = this.mp + 1) >= this.Rg0) { long l = System.nanoTime() - this.Q10; this.Q10 = System.nanoTime(); if (this.Kp)
/*   */       
/* 3 */       { g7(UB0.M60.YE * 100); } else { g7((int)((this.mp * this.Bx + (l >> 1L)) / l)); }  this.mp = 0; }
/*   */     
/* 5 */     Lp(this.O); }
/*   */ 
/*   */   
/*   */   public long Q10 = System.nanoTime();
/*   */   public int mp;
/*   */   public int Rg0 = 100;
/*   */   public final StringBuilder Xw0;
/*   */   public final int p80 = 4;
/*   */   public final long Bx;
/*   */   public boolean Kp = false;
/*   */   
/*   */   public xs(int paramInt) {
/*   */     this();
/*   */     this.Xw0 = stringBuilder;
/*   */     StringBuilder stringBuilder;
/*   */     (stringBuilder = new StringBuilder()).setLength(Integer.signum(paramInt) + 5);
/*   */     long l = 1000000000L;
/*   */     for (byte b = 0; b < paramInt; b++)
/*   */       l *= 10L; 
/*   */     this.Bx = l;
/*   */     g7(0);
/*   */   }
/*   */   
/*   */   public xs() {
/*   */     this(0);
/*   */   }
/*   */   
/*   */   public final String TI() {
/*   */     return "fpscounter";
/*   */   }
/*   */   
/*   */   public final void KB(boolean paramBoolean) {
/*   */     this.Kp = paramBoolean;
/*   */   }
/*   */   
/*   */   public final void g7(int paramInt) {
/*   */     StringBuilder stringBuilder;
/*   */     for (int i = (stringBuilder = this.Xw0).length();; i = paramInt) {
/*   */       paramInt = i + -1;
/*   */       stringBuilder.setCharAt(paramInt, (char)(paramInt % 10 + 48));
/*   */       i = paramInt / 10;
/*   */       if (this.p80 == paramInt)
/*   */         stringBuilder.setCharAt(--paramInt, '.'); 
/*   */       if (paramInt <= 0) {
/*   */         if (i > 0) {
/*   */           paramInt = stringBuilder.length();
/*   */           do {
/*   */             stringBuilder.setCharAt(--paramInt, '9');
/*   */             if (this.p80 != paramInt)
/*   */               continue; 
/*   */             paramInt--;
/*   */           } while (paramInt > 0);
/*   */         } 
/*   */         HC(stringBuilder);
/*   */         return;
/*   */       } 
/*   */       paramInt = i;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */