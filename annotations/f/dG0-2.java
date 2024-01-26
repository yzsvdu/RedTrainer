/*  1 */ package f;public final class dG0 extends JG0 implements r60 { public final Ip Hn0; public byte cB0; public final void LM(throws paramthrows) { if (d20() != null) VA0.c90(d20());  } public int q50; public ArrayList CI; public dG0(byte paramByte, boolean paramBoolean, String[] paramArrayOfString, int[] paramArrayOfint) { ArrayList arrayList; Un un1; Un un2; AtomicInteger atomicInteger; ArrayList<qY> arrayList1; this.q50 = 0; this(); this.CI = arrayList; this.cB0 = paramByte; Xu("channelwidget"); this(); this.Hn0 = ip; Ip ip; cr0 cr0 = (ip = new Ip()).d7(); g0 g0 = (new Ip()).mE0(); if (paramBoolean) { this(Ml0.Go(6751, km.a3.wQ().m())); } else { this(Ml0.OH0(6750)); }  un2.tW(new Fk(this)); this.CI.add(un2); this(2); this(); for (byte b = 0; b < paramArrayOfString.length; b++) { paramArrayOfint[b]; String str = paramArrayOfString[b]; arrayList1.add(new qY((byte)atomicInteger.getAndIncrement(), str)); }  Collections.sort(arrayList1); for (qY qY : arrayList1) { Un un; this(Ml0.Go(6751, qY.lW(qY))); (new Un()).tW(new FD0(this, qY)); this.CI.add(un); }  this(Ml0.OH0(53)); (new Un()).tW(new Al(this)); this.CI.add(un1); Iterator<Un> iterator = this.CI.iterator(); while (iterator.hasNext()) { Un un; cr0.Ya(un = iterator.next()); g0.Ya(un); }  this.Hn0.WN(cr0.Em0()); this.Hn0.rK0(g0); J8(this.Hn0); } public final void Ev0() { if (d20() != null) VA0.c90(d20());  }
/*  2 */   public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO()) {
/*    */       int i;
/*  5 */       if (h1.J20(i = paramoa0.GG0, BM.ni)) { this.q50--;
/*  6 */         if (d20() != null) VA0.c90(d20());  return true; }
/*  7 */        if (h1.J20(i, BM.N70)) { this.q50++;
/*  8 */         if (d20() != null) VA0.c90(d20());  return true; }
/*  9 */        if (h1.J20(i, BM.bC)) {
/*    */ 
/*    */         
/* 12 */         hm.Fz0((d20()).TG0.oh0); return true;
/* 13 */       }  if (h1.J20(i, BM.lc))
/*    */       
/*    */       { 
/* 16 */         hm.Fz0(((Un)this.CI.get(this.CI.size() - 1)).TG0.oh0); return true; } 
/* 17 */     }  return super.i2(paramoa0); } public final void d40() { for (Iterator<Un> iterator = this.CI.iterator(); iterator.hasNext();)
/*    */       ((Un)iterator.next()).uh0((iterator.next()).xY, 25);  this.Hn0.mM(); int i = this.fr0.RS(); i = this.fr0.e3();
/*    */     this.Hn0.ME(JO.Se0(this.fr0.qF(), this.Hn0.xY, 2, i), (this.fr0.Hy() - this.Hn0.HC) / 2 + i);
/*    */     Ip ip;
/* 21 */     Tm((ip = this.Hn0).Kd + this.xY, this.er0 + this.HC); }
/*    */ 
/*    */   
/*    */   public final Un d20() {
/*    */     if (this.q50 >= this.CI.size())
/*    */       this.q50 = this.CI.size() - 1; 
/*    */     if (this.q50 < 0)
/*    */       this.q50 = 0; 
/*    */     return (this.q50 >= this.CI.size()) ? null : this.CI.get(this.q50);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */