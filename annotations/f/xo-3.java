/* 1 */ package f;public final class xo extends protected { public qs le0; public jx0 w8; public boolean DJ; public boolean Dm; public final void Fx0(boolean paramBoolean) { qs qs1; if ((qs1 = this.le0) != null) { qs1.vu(paramBoolean ^ this.DJ); } else if (paramBoolean != nm0()) { Bv(256, paramBoolean);
/* 2 */       hm.Fz0(this.JK0); }  } public xo() {} public xo(qs paramqs) { this(paramqs, 0); } public xo(qs paramqs, int paramInt) { BK(paramqs); } public final boolean nm0() { return ((this.hm0 & 0x100) != 0); } public final void Xi0() { Fx0(nm0() ^ true); hm.Fz0(this.oh0); } public final void BK(qs paramqs) { this.DJ = false; qs qs1; if ((qs1 = this.le0) != paramqs) { jx0 jx01; if (qs1 != null && (jx01 = this.w8) != null) qs1.nq0(jx01);  this.le0 = paramqs; if (paramqs != null && this
/* 3 */         .Dm) { if (this.w8 == null) { jx0 jx02; this(this); this.w8 = jx02; }  paramqs.Ac0(this.w8); int j;
/* 4 */         if ((j = this.le0.getValue() ^ this.DJ) != 
/* 5 */           nm0()) { Bv(256, j);
/* 6 */           hm.Fz0(this.JK0); }  }  }  int i; if (paramqs != null && (
/* 7 */       i = this.le0.getValue() ^ this.DJ) != 
/* 8 */       nm0()) { Bv(256, i);
/* 9 */       hm.Fz0(this.JK0); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void xz0() {
/*   */     this.Dm = true;
/*   */     qs qs1;
/*   */     if ((qs1 = this.le0) != null) {
/*   */       if (this.w8 == null) {
/*   */         jx0 jx01;
/*   */         this(this);
/*   */         this.w8 = jx01;
/*   */       } 
/*   */       qs1.Ac0(this.w8);
/*   */       int i;
/*   */       if ((i = this.le0.getValue() ^ this.DJ) != nm0()) {
/*   */         Bv(256, i);
/*   */         hm.Fz0(this.JK0);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Oy() {
/*   */     this.Dm = false;
/*   */     jx0 jx01;
/*   */     qs qs1;
/*   */     if ((qs1 = this.le0) != null && (jx01 = this.w8) != null)
/*   */       qs1.nq0(this); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */