/*  1 */ package f;public final class xo0 extends dQ { public final void wI0(boolean paramBoolean) { if (paramBoolean) { I i; if (((i = this.db0) != null && i
/*  2 */         .mi) || 
/*  3 */         !this.dP)
/*  4 */       { pRn pRn = pRn.WHITE; int j = this.qs0;
/*    */ 
/*    */ 
/*    */         
/*  8 */         this(new KO(this.O, Wr.Ny), pRn);
/*  9 */         this.db0 = new I();
/* 10 */         if (i == null && !this.dP) i
/* 11 */             .oC0(0);  i
/* 12 */           .sz(pRn, j);
/* 13 */         if (!this.dP && pRn
/* 14 */           .cj() != 0) super
/* 15 */             .wI0(true);  }  } else if (this
/* 16 */       .dP)
/* 17 */     { int i = this.SD;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       this(new KO(this.O, Wr.Ny), pRn.WHITE);
/* 23 */       this.db0 = new I(); I i1;
/* 24 */       if ((i1 = this.db0) == null && !this.dP) i1
/* 25 */           .oC0(0);  i1
/* 26 */         .oC0(i); if (i <= 0) super
/* 27 */           .wI0(false);  }
/*    */      }
/*    */ 
/*    */   
/*    */   public int qs0;
/*    */   public int SD;
/*    */   
/*    */   public xo0() {
/*    */     Xu("label");
/*    */   }
/*    */   
/*    */   public xo0(String paramString) {
/*    */     super(paramString);
/*    */     Xu("label");
/*    */   }
/*    */   
/*    */   public final void Xw(nY paramnY) {
/*    */     super.Xw(paramnY);
/*    */     this.qs0 = ((q80)paramnY).Km(0, "fadeDurationShow");
/*    */     this.SD = ((q80)paramnY).Km(0, "fadeDurationHide");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */