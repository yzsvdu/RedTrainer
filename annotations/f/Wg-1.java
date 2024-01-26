/*  1 */ package f;public final class Wg extends Wr implements r60 { public rS s90; public Ip NH; public final void LM(throws paramthrows) { Un un; if (this.Fv0 >= this.J3.size()) this.Fv0 = this.J3.size() - 1;  if (this.Fv0 < 0) this.Fv0 = 0;  if (this.Fv0 >= this.J3.size()) { paramthrows = null; } else { un = this.J3.get(this.Fv0); }
/*  2 */      VA0.c90(un); rS rS1; if (un != null && (rS1 = this.s90) != null) ai(un);  } public int Fv0; public ArrayList J3; public Wg() { ArrayList<Ug0> arrayList; BB0 bB0; Un un; this.Fv0 = 0; this.J3 = new ArrayList(); Xu("base-frame-padded"); Lo(Ml0.OH0(8)); EP(1); (new Ip()).rK0((this.NH = new Ip()).mE0()); this.NH.WN(this.NH.d7()); (this.s90 = new rS(this.NH)).zG0(2); J8(this.s90); Iterator<wl> iterator1 = oo0.oQ().uX().values().iterator(); while (iterator1.hasNext()) { Un un1; byte b = wl.eT(); wl wl; if (((wl = iterator1.next()).bx() != -1 && !km.u4.vC().y5(b, wl.bx())) || (wl.lo0() != -1 && wl.lo0() != km.a3.wQ().lPt7())) continue;  short s = (short)wl.f90(); this(wl.qM() + " " + wl.Wu0()); (new Un()).tW(new Ew0(this, s)); this.NH.iJ0().Ya(un1); this.NH.xh().Ya(un1); this.J3.add(un1); }  this(); Iterator iterator2 = W6.bP().qm().iterator(); while (((DA0)iterator2).hasNext()) { Ug0 ug0 = (Ug0)((Ke)iterator2).next(); if (!km.u4.vC().Hj0(ug0.iI())) continue;  arrayList.add(ug0); }  this(); Collections.sort(arrayList, bB0); Iterator<Ug0> iterator = arrayList.iterator(); while (iterator.hasNext()) { Un un1; Ug0 ug0; short s = (ug0 = iterator.next()).iI(); this(ug0.Ve0() + " " + ug0.cs0()); (new Un()).tW(new SD(this, s)); this.NH.iJ0().Ya(un1); this.NH.xh().Ya(un1); this.J3.add(un1); }  this(Ml0.OH0(65)); (new Un()).tW(new bI(this)); this.NH.iJ0().Ya(un); this.NH.xh().Ya(un); this.J3.add(un); uh0(210, 250); Tm(210, 250); } public final void Ev0() { Un un; if (this.Fv0 >= this.J3.size()) this.Fv0 = this.J3.size() - 1;  if (this.Fv0 < 0) this.Fv0 = 0;  if (this.Fv0 >= this.J3.size()) { un = null; } else { un = this.J3.get(this.Fv0); }  VA0.c90(un); rS rS1; if (un != null && (rS1 = this.s90) != null) ai(un);  } public final boolean i2(oa0 paramoa0) { Un un1; Un un2; if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO()) {
/*    */       rS rS1; int i;
/*  5 */       if (h1.J20(i = paramoa0.GG0, BM.ni)) { this.Fv0 = j; int j; if ((j = this.Fv0 - 1) >= this
/*  6 */           .J3.size()) this.Fv0 = this.J3.size() - 1;  if (this.Fv0 < 0) this.Fv0 = 0;  if (this.Fv0 >= this.J3.size()) { un2 = null; } else { un2 = this.J3.get(this.Fv0); }
/*  7 */          VA0.c90(un2); if (un2 != null && (rS1 = this.s90) != null) ai(un2);  return true; }
/*  8 */        if (h1.J20(i, BM.N70)) { ((Wg)super).Fv0 = j; int j; if ((j = ((Wg)super).Fv0 + 1) >= ((Wg)super)
/*  9 */           .J3.size()) ((Wg)super).Fv0 = ((Wg)super).J3.size() - 1;  if (((Wg)super).Fv0 < 0) ((Wg)super).Fv0 = 0;  if (((Wg)super).Fv0 >= ((Wg)super).J3.size()) { un2 = null; } else { un2 = ((Wg)super).J3.get(((Wg)super).Fv0); }
/* 10 */          VA0.c90(un2); if (un2 != null && (rS1 = ((Wg)super).s90) != null) ai(un2);  return true; }
/* 11 */        if (h1.J20(i, BM.bC)) { if (((Wg)super)
/* 12 */           .Fv0 >= ((Wg)super).J3.size()) ((Wg)super).Fv0 = ((Wg)super).J3.size() - 1;  if (((Wg)super).Fv0 < 0) ((Wg)super).Fv0 = 0;  if (((Wg)super).Fv0 >= ((Wg)super).J3.size()) { rS1 = null; } else { un1 = ((Wg)super).J3.get(((Wg)super).Fv0); }
/*    */ 
/*    */         
/* 15 */         hm.Fz0(this.TG0.oh0); return true; }
/* 16 */        if (h1.J20(i, BM.lc))
/*    */       
/*    */       { 
/* 19 */         hm.Fz0(((Un)((Wg)super).J3.get(((Wg)super).J3.size() - 1)).TG0.oh0); return true; } 
/* 20 */     }  return super.i2((oa0)un2); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     this.NH.uh0(186, 10);
/*    */     this.NH.mM();
/*    */     this.s90.uh0(210, 250);
/*    */     this.s90.mM();
/*    */     this.s90.kN(7, 7, 7, 7);
/*    */     super.d40();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */