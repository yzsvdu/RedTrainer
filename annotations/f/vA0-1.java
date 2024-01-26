/* 1 */ package f;public final class vA0 implements Iterator, Iterable { public final void remove() { if (this.Du) { this.Vo = i; mf0 mf01 = this.M1; int i; if ((i = this.Vo - 1) >= 0) { if (i < this.bK)
/* 2 */         { Object[] arrayOfObject = this.public; i = this.JH0; int k = i + j; int j; if ((j = this.Ye0) < i) { arrayOfObject[k]; i = k + 1; j = i - k; System.arraycopy(arrayOfObject, i, arrayOfObject, k, j); arrayOfObject[i] = null; this.JH0--; } else if (k >= arrayOfObject.length) { arrayOfObject[i = k - arrayOfObject.length]; j = i + 1; k = i - i; System.arraycopy(arrayOfObject, j, arrayOfObject, i, k); this.JH0--; } else { arrayOfObject[k]; i = j + 1; j = k - j; System.arraycopy(arrayOfObject, j, arrayOfObject, i, j); arrayOfObject[j] = null; this.Ye0 = i; if ((i = this.Ye0 + 1) == arrayOfObject.length) this.Ye0 = 0;  }  this.bK--; return; }  throw new IndexOutOfBoundsException(
/* 3 */             HB0.DH0("index can't be >= size: ", i, " >= ")
/* 4 */             .append(this.bK).toString()); }
/* 5 */        getClass();
/* 6 */       throw new IndexOutOfBoundsException(
/* 7 */           XD0.SD0("index can't be < 0: ", i)); }
/*   */     
/* 9 */     throw new JU("Remove not allowed."); }
/*   */ 
/*   */   
/*   */   public final mf0 M1;
/*   */   public final boolean Du;
/*   */   public int Vo;
/*   */   public boolean Pr0 = true;
/*   */   
/*   */   public vA0(mf0 parammf0) {
/*   */     this(parammf0, true);
/*   */   }
/*   */   
/*   */   public vA0(mf0 parammf0, boolean paramBoolean) {
/*   */     this.M1 = parammf0;
/*   */     this.Du = paramBoolean;
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.Pr0)
/*   */       return (this.Vo < this.M1.bK); 
/*   */     throw new JU("#iterator() cannot be used nested.");
/*   */   }
/*   */   
/*   */   public final Object next() {
/*   */     int i;
/*   */     mf0 mf01;
/*   */     if ((i = this.Vo) < (mf01 = this.M1).bK) {
/*   */       if (this.Pr0) {
/*   */         this.Vo = i + 1;
/*   */         return mf01.get(i);
/*   */       } 
/*   */       throw new JU("#iterator() cannot be used nested.");
/*   */     } 
/*   */     throw new NoSuchElementException(String.valueOf(this.Vo));
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vA0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */