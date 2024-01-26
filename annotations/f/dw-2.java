/*  1 */ package f;public abstract class dw implements iq0 { public void Yo0(JX paramJX) { long l1 = zm0.u20; if (this
/*  2 */       .Mv == -1L) this.Mv = l1;  long l2; if ((l2 = l1 - this.Mv) > 0L) { byte b; Iterator<q60> iterator1; for (this
/*  3 */         .BK += l2, b = 0, iterator1 = this.Ql.iterator(); iterator1.hasNext(); ) { q60 q60; if (!(q60 = iterator1.next()).Ih())
/*  4 */         { if (!q60.zn0) q60
/*  5 */               .w80();  b++; continue; }  q60.ef0(l2); q60.v80(); q60
/*    */           
/*  7 */           .nUL(zm0.u20); }  if (!this.v70 && b == this.Ql.size() && this.BK > this.AK0) { this.v70 = true; this.AK0 = 0; dispose(); }  this
/*  8 */         .Mv = l1; }  for (Iterator iterator = this.Ql.iterator(); hasNext(); ) {
/*  9 */       q60 q60; C30 c30; if (1 != (q60 = (q60)next()).Js0 || 
/* 10 */         !q60.QF0() || q60.js.length == 0 || !q60.Ih() || (c30 = q60.js[q60.TD]) == null) continue;  int i = q60.YS(), j = q60.Jk0(); c30.KT(paramJX, i, j);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public ArrayList Ql;
/*    */   public boolean v70;
/*    */   public long BK;
/*    */   public int AK0;
/*    */   public long Mv;
/*    */   
/*    */   public dw(int paramInt) {
/*    */     ArrayList arrayList;
/*    */     this();
/*    */     this.Ql = this;
/*    */     this.BK = 0L;
/*    */     this.AK0 = 200;
/*    */     this.Mv = -1L;
/*    */     this.v70 = false;
/*    */   }
/*    */   
/*    */   public dw() {
/*    */     ArrayList arrayList;
/*    */     this();
/*    */     this.Ql = this;
/*    */     this.BK = 0L;
/*    */     this.AK0 = 200;
/*    */     this.Mv = -1L;
/*    */     this.v70 = false;
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(dw.class);
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */   
/*    */   public boolean Dm0() {
/*    */     return (this.v70 && this.BK > this.AK0);
/*    */   }
/*    */   
/*    */   public final void n2() {
/*    */     this.AK0 = 1310;
/*    */   }
/*    */   
/*    */   public void Al(nf paramnf, Ih0 paramIh0) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */