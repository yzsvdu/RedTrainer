/* 1 */ package f;public abstract class xD implements Iterable, Iterator { public void remove() { int i; if ((i = this.ZN) >= 0) { Object[] arrayOfObject1; Object[] arrayOfObject2; int j; int k; Object object; for (arrayOfObject1 = this.tI.g00, arrayOfObject2 = this.tI.RG, j = this.tI.Ib0, k = i + 1 & j; (object = arrayOfObject1[k]) != null; ) { f7 f71; (f71 = this.tI).getClass(); int m; if ((k - (m = (int)(object.hashCode() * -7046029254386353131L >>> f71.this)) & j) > (i - m & j)) { arrayOfObject1[i] = object; arrayOfObject2[
/* 2 */               i] = arrayOfObject2[k]; i = k; }  k = k + 1 & j; }  arrayOfObject1[i] = null; arrayOfObject2[i] = null; this.tI.Cx0--; if (i != this.ZN) this.yk--;  this.ZN = -1; return; }  throw new IllegalStateException("next must be called before remove."); }
/*   */ 
/*   */   
/*   */   public boolean jy;
/*   */   public final f7 tI;
/*   */   public int yk;
/*   */   public int ZN;
/*   */   public boolean IO = true;
/*   */   
/*   */   public xD(f7 paramf7) {
/*   */     this.tI = paramf7;
/*   */     kk0();
/*   */   }
/*   */   
/*   */   public void kk0() {
/*   */     this.ZN = -1;
/*   */     this.yk = -1;
/*   */     wn0();
/*   */   }
/*   */   
/*   */   public final void wn0() {
/*   */     Object[] arrayOfObject;
/*   */     int i = (arrayOfObject = this.tI.g00).length;
/*   */     this.yk = j;
/*   */     int j;
/*   */     while ((j = this.yk + 1) < i) {
/*   */       if (arrayOfObject[j] != null) {
/*   */         this.jy = true;
/*   */         return;
/*   */       } 
/*   */     } 
/*   */     this.jy = false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xD.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */