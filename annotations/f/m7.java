/* 1 */ package f;public class m7 extends dQ { public boolean mQ = false; public int wB0 = 150; public long Fe0 = 0L; public int tc0; public final void Gq0(Object paramObject) { if (Gq() != null && Gq().equals(paramObject)) return;  this.z4 = paramObject; zn(); } public I NK0; public int QH = 0; public int F = 0; public m7() { Xu("label"); MB0(); } public m7(String paramString) { super(paramString); Xu("label"); MB0(); } public final void R60(throws paramthrows) { if (!this.mQ) { super.R60(paramthrows); return; }  if (this.QH < this.F) { super.R60(paramthrows); this.db0 = null; return; }
/* 2 */      int i; long l; if ((l = System.currentTimeMillis() - this.Fe0) < (i = this.wB0)) { this.tc0 = 0; } else if (l < (i * 2)) { this.tc0 = 1; } else if (l > (i * 2)) { this.Fe0 = System.currentTimeMillis(); }  if ((i = this.tc0) == 1 && this
/* 3 */       .db0 == null) { this
/*   */         
/* 5 */         .db0 = this.NK0;
/* 6 */       this.F++; } else if (i == 0 && this
/* 7 */       .db0 != null) { this
/* 8 */         .db0 = null; }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/m7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */