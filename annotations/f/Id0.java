/*  1 */ package f;public final class Id0 extends JG0 implements r60 { public final Ip Pv0; public int Fa0; public final void LM(throws paramthrows) { if (q90() != null) VA0.c90(q90());  } public ArrayList a8; public Id0() { Un un; this.Fa0 = 0; this.a8 = new ArrayList(); Xu("channelwidget"); cr0 cr0 = (this.Pv0 = new Ip()).d7(); g0 g0 = (new Ip()).mE0(); this(Ml0.OH0(240361)); (new Un()).tW(new A3(this)); this.a8.add(un); if (km.u4.vC().y5((byte)1, (short)303)) { this(Ml0.OH0(8)); (new Un()).tW(new gN(this)); this.a8.add(un); }  this(Ml0.OH0(65)); (new Un()).tW(new kY(this)); this.a8.add(un); Iterator<Un> iterator = this.a8.iterator(); while (iterator.hasNext()) { Un un1; cr0.Ya(un1 = iterator.next()); g0.Ya(un1); }  this.Pv0.WN(cr0.Em0()); this.Pv0.rK0(g0); J8(this.Pv0); } public final void Ev0() { if (q90() != null) VA0.c90(q90());  } public final boolean i2(oa0 paramoa0) {
/*  2 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO()) {
/*    */       int i;
/*  5 */       if (h1.J20(i = paramoa0.GG0, BM.ni)) { this.Fa0--;
/*  6 */         if (q90() != null) VA0.c90(q90());  return true; }
/*  7 */        if (h1.J20(i, BM.N70)) { this.Fa0++;
/*  8 */         if (q90() != null) VA0.c90(q90());  return true; }
/*  9 */        if (h1.J20(i, BM.bC)) {
/*    */ 
/*    */         
/* 12 */         hm.Fz0((q90()).TG0.oh0); return true;
/* 13 */       }  if (h1.J20(i, BM.lc))
/*    */       
/*    */       { 
/* 16 */         hm.Fz0(((Un)this.a8.get(this.a8.size() - 1)).TG0.oh0); return true; } 
/* 17 */     }  return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     this.Pv0.mM();
/*    */     mM();
/*    */     qB0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final Un q90() {
/*    */     if (this.Fa0 >= this.a8.size())
/*    */       this.Fa0 = this.a8.size() - 1; 
/*    */     if (this.Fa0 < 0)
/*    */       this.Fa0 = 0; 
/*    */     return (this.Fa0 >= this.a8.size()) ? null : this.a8.get(this.Fa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Id0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */