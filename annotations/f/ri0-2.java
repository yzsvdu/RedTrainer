/* 1 */ package f;public final class ri0 { public final void z10(a... paramVarArgs) { if (paramVarArgs != null) { byte b; int i; for (b = 0, i = paramVarArgs.length; b < i; ) { a a1; if ((a1 = paramVarArgs[b]) != null) { boolean bool; a1.qo0 = null; if (a1
/* 2 */             .Q1 || 
/* 3 */             this.wh.Z8 < this.Hd0) { bool = true; } else { bool = false; }  a1
/* 4 */             .rh0(false, a1.Jc0);
/* 5 */           a1.qo0 = this; this.wh.Com3(a1);
/* 6 */           a1.rh0(bool, a1.Jc0); b++; continue; }
/* 7 */          throw new IllegalArgumentException("button cannot be null."); }  return; }
/* 8 */      throw new IllegalArgumentException("buttons cannot be null."); }
/*   */ 
/*   */   
/*   */   public final fQ wh;
/*   */   public fQ nT;
/*   */   public int Hd0;
/*   */   public int mU;
/*   */   public boolean ba0;
/*   */   public a rq;
/*   */   
/*   */   public ri0() {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.wh = this;
/*   */     this(1);
/*   */     this.nT = this;
/*   */     this.mU = 1;
/*   */     this.ba0 = true;
/*   */     this.Hd0 = 1;
/*   */   }
/*   */   
/*   */   public ri0(a... paramVarArgs) {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.wh = this;
/*   */     this(1);
/*   */     this.nT = this;
/*   */     this.mU = 1;
/*   */     this.ba0 = true;
/*   */     this.Hd0 = 0;
/*   */     z10(paramVarArgs);
/*   */     this.Hd0 = 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ri0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */