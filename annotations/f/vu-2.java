/* 1 */ package f;public final class vu { public final void cj0(boolean paramBoolean1, boolean paramBoolean2) { if (this.js0 == paramBoolean1) return;  for (lpt1 lpt1 : this.ks0) { float f1, f2; if (paramBoolean1) { f2 = 1.0F; } else { f2 = -1.0F; }  lpt1.k = f2; lpt1.rd(0, false, null); rf rf; KI0 kI0; if (!paramBoolean1 && (
/* 2 */         rf = lpt1.f2) != null && (kI0 = rf.hm) != null) kI0.lV = 2;  if (paramBoolean1) { f1 = 1.0F; } else { f1 = 0.0F; }  this.js0 = f1; }  if (paramBoolean2) { Iterator iterator; for (this.COm4 = this.js0, iterator = this.ks0.iterator(); iterator.hasNext();) for (Hc0 hc0 = ((lpt1)iterator.next()).xl0.r30(); hc0.hasNext(); ((T0)hc0.next()).Tz0(new zc(this.COm4)));  }
/*   */      }
/*   */ 
/*   */   
/*   */   public ArrayList ks0;
/*   */   public float COm4;
/*   */   public float js0;
/*   */   
/*   */   public vu() {
/*   */     ArrayList arrayList;
/*   */     this();
/*   */     this.ks0 = this;
/*   */     this.COm4 = 1.0F;
/*   */     this.js0 = 1.0F;
/*   */   }
/*   */   
/*   */   public final void mg0(lpt1 paramlpt1) {
/*   */     this.ks0.add(paramlpt1);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */