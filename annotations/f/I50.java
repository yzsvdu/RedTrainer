/* 1 */ package f;public final class I50 extends IN { public int wg0 = 1; public int Vz0 = 1; public int j40 = 1; public final void V90(throws paramthrows) { byte b; super.V90(paramthrows); int i; if ((i = this.Vz0) < 1) { Nu(1.0F); return; }  int j, k; if ((j = this.j40) == (k = this.wg0)) return;  if (this.jC0)
/* 2 */     { long l; if ((b = (int)((zm0.u20 - (l = this.vy)) / 40L)) < 1) return;  this.vy = l + (b * 40); } else { this.jC0 = true; b = 1; this
/*   */         
/* 4 */         .vy = zm0.u20; }  double d1 = i * 0.05D; this.j40 = i; double d2 = i * 0.05D; this.j40 = i; if ((j > k) ? ((i = j - (int)Math.max(1.0D, d1) * b) < (i = this.wg0)) : ((i = (int)Math.max(1.0D, d2) * b + d1) > (i = this.wg0))) this.j40 = i;  uX(); } public dQ Xw0; public boolean jC0 = false; public long vy = 0L; public I50(dQ paramdQ) { this.Xw0 = paramdQ; uX(); } public final void uX() { double d; float f = (float)((d = LF.ri(this.j40, this.Vz0)) / 100.0D); dQ dQ1; if ((dQ1 = this.Xw0) != null) dQ1.E1(this.j40 + " / " + this.Vz0);  Nu(f); this.jl = 100; String str; if ((d > 50.0D) ? (str = "health-progressbar").equals(this.cl) : ((str > 25.0D) ? (str = "health-progressbar-orange")
/* 5 */       .equals(this.cl) : (
/* 6 */       str = "health-progressbar-red")
/* 7 */       .equals(this.cl))) { Xu(str); cZ(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final boolean i2(oa0 paramoa0) {
/*   */     cb(paramoa0);
/*   */     int i;
/*   */     return B8.Pg(i = paramoa0.cz0) ? ((i != 8)) : false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/I50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */