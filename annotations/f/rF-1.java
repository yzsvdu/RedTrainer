/* 1 */ package f;public final class rF extends Bw { public final boolean G50() { for (Iterator<Bw> iterator = this.LPt9.iterator(); iterator.hasNext(); ) { Bw bw; HashSet hashSet; if ((hashSet = (bw = iterator.next()).nw) != null && 
/* 2 */         !hashSet.isEmpty()) try { for (Iterator<rF> iterator1 = bw.nw.iterator(); iterator1.hasNext();) { if (iterator1.next() != this); }  } catch (ConcurrentModificationException concurrentModificationException) {}  if (false) return true;  }
/* 3 */      return super.G50(); }
/*   */ 
/*   */   
/*   */   public List LPt9;
/*   */   public boolean DA = false;
/*   */   
/*   */   public rF(ArrayList paramArrayList) {
/*   */     this.LPt9 = paramArrayList;
/*   */     Iterator<Bw> iterator = paramArrayList.iterator();
/*   */     while (iterator.hasNext())
/*   */       ((Bw)iterator.next()).lu(this); 
/*   */     CH();
/*   */     Bb0.DL0(this);
/*   */   }
/*   */   
/*   */   public final long cB0() {
/*   */     long l = this.mk;
/*   */     for (Iterator iterator = this.LPt9.iterator(); hasNext();) {
/*   */       if ((bw = (Bw)next()).cB0() > l)
/*   */         l = bw.cB0(); 
/*   */     } 
/*   */     return l;
/*   */   }
/*   */   
/*   */   public final void yM() {
/*   */     HashSet<?> hashSet;
/*   */     Iterator<Bw> iterator;
/*   */     if (this.DA)
/*   */       return; 
/*   */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} */
/*   */     try {
/*   */       (hashSet = Bb0.fA).remove(this);
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Iterator<ObjectType{f/Bw}>}, name=null} */
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */