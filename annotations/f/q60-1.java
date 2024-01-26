/* 1 */ package f;public class q60 { public C30[] js; public ArrayList ss0; public int xe0; public int Mq; public int zf0; public int Kc0; public long rH; public long Gr; public boolean zn0; public int Com1; public final void v80() { if (this.Gr < this.DI0) return;  for (this.Gr = 0L; this.y0 < ((int)this.rH - this.xe0) / this
/* 2 */       .DI0 && Ih(); ) { T80(); this.y0++; }  for (Iterator<q60> iterator = this.ss0.iterator(); iterator.hasNext(); ((q60)iterator.next()).v80()); if (QF0()) T80();  if (QF0() && !Ih() && !this.zn0) w80();  } public int aS; public int TD; public int y0; public int DI0; public boolean uR; public int Js0; public boolean on0; public q60(C30[] paramArrayOfC30, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { ArrayList arrayList; this(); this.ss0 = this; this.Gr = 0L; this.zn0 = false; this.DI0 = 10; this.uR = false; this.Js0 = 1; this.on0 = false; this.js = paramArrayOfC30; this.xe0 = paramInt1; this.Mq = paramInt2; this.Kc0 = 0; this.zf0 = paramInt3; this.Com1 = paramInt4; this.aS = paramInt5; } public q60(C30 paramC30, int paramInt1, int paramInt2) { ArrayList arrayList; this(); this.ss0 = this; this.Gr = 0L; this.zn0 = false; this.DI0 = 10; this.uR = false; this.Js0 = 1; this.on0 = false; C30[] arrayOfC30; (arrayOfC30 = new C30[1])[0] = paramC30; this.js = this; this.xe0 = 0; this.Mq = 2000; this.Kc0 = -1; this.zf0 = 2000; this.Com1 = paramInt1; this.aS = paramInt2; } public final boolean QF0() { return (this.xe0 <= this.rH); } public final void ef0(long paramLong) { this.rH += paramLong; this.Gr += paramLong; Iterator iterator = this.ss0.iterator(); while (hasNext()) ((q60)next()).ef0(paramLong);  } public final boolean Ih() { return this.on0 ? true : ((this.rH < (this.xe0 + this.Mq))); } public final void w80() { if (this.on0) { this.rH = 0L; return; }  this.Mq = 0; this.zn0 = true; Iterator iterator = this.ss0.iterator(); while (hasNext()) ((q60)next()).w80();  } public final void we() { Iterator iterator = this.ss0.iterator(); while (hasNext()) ((q60)next()).we();  } public void T80() { if (!QF0()) return;  if (!this.uR) { this.uR = true; we(); }  int i; if ((i = this.Kc0) != -1) { i = (int)this.rH - this.xe0; int j; this.TD = (i * (j = this.zf0) + i) / j % this.js.length; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void nUL(long paramLong) {
/*   */     Iterator iterator = this.ss0.iterator();
/*   */     while (hasNext())
/*   */       ((q60)next()).nUL(paramLong); 
/*   */   }
/*   */   
/*   */   public int YS() {
/*   */     return this.Com1;
/*   */   }
/*   */   
/*   */   public int Jk0() {
/*   */     return this.aS;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */