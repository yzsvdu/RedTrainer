/* 1 */ package f;public final class mf0 implements Iterable { public Object[] public; public int Ye0 = 0; public int JH0 = 0; public int bK = 0; public final void addFirst(Object paramObject) { Object[] arrayOfObject = this.public; if (this.bK == arrayOfObject.length) { int j, k = arrayOfObject.length << 1;
/*   */       
/* 3 */       Object[] arrayOfObject1 = (Object[])Array.newInstance(arrayOfObject.getClass().getComponentType(), k); int m, n; if ((m = this.Ye0) < (n = this.JH0)) { j = n - m; System.arraycopy(arrayOfObject, m, arrayOfObject1, 0, j); } else if (this.bK > 0) { j = j.length - m; System.arraycopy(j, m, arrayOfObject1, 0, j); System.arraycopy(j, 0, arrayOfObject1, j, n); }  this.public = arrayOfObject1; this.Ye0 = 0; this.JH0 = this.bK; arrayOfObject = arrayOfObject1; }
/* 4 */      int i; if ((i = this.Ye0 + -1) == -1) i = arrayOfObject.length - 1;  arrayOfObject[i] = paramObject; this.Ye0 = i; this.bK++; } public transient Pv Nd; public mf0() { this(16); } public mf0(int paramInt) { this.public = new Object[paramInt]; } public mf0(int paramInt, Class paramClass) { this.public = (Object[])o7.JB0(paramClass, paramInt); } public final String toString() { if (this.bK == 0) return "[]";  Object[] arrayOfObject = this.public; int i = this.JH0; this(64); ag.yd0('['); Ag ag; (ag = new Ag()).Nn(arrayOfObject[j]); for (int j = ((j = this.Ye0) + 1) % arrayOfObject.length; j != i; ) { ag.V9(", "); ag.Nn(arrayOfObject[j]); j = (j + 1) % arrayOfObject.length; }  ag
/* 5 */       .yd0(']');
/* 6 */     return ag.toString(); }
/*   */ 
/*   */   
/*   */   public final Object removeLast() {
/*   */     int i;
/*   */     if ((i = this.bK) != 0) {
/*   */       Object[] arrayOfObject = this.public;
/*   */       int j;
/*   */       if ((j = this.JH0 + -1) == -1)
/*   */         j = arrayOfObject.length - 1; 
/*   */       arrayOfObject[j] = null;
/*   */       this.JH0 = j;
/*   */       this.bK = i - 1;
/*   */       return arrayOfObject[j];
/*   */     } 
/*   */     throw new NoSuchElementException("Queue is empty.");
/*   */   }
/*   */   
/*   */   public final Object get(int paramInt) {
/*   */     if (paramInt >= 0) {
/*   */       Object[] arrayOfObject;
/*   */       if (paramInt < this.bK) {
/*   */         arrayOfObject = this.public;
/*   */         if ((paramInt = this.Ye0 + paramInt) >= this.length)
/*   */           paramInt -= this.length; 
/*   */         return this[paramInt];
/*   */       } 
/*   */       throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ").append(super.bK).toString());
/*   */     } 
/*   */     throw new IndexOutOfBoundsException(XD0.SD0("index can't be < 0: ", paramInt));
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     if (this.Nd == null) {
/*   */       Pv pv;
/*   */       this(this);
/*   */       this.Nd = pv;
/*   */     } 
/*   */     return this.Nd.iterator();
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.bK;
/*   */     Object[] arrayOfObject;
/*   */     int j = (arrayOfObject = this.public).length;
/*   */     int k = this.Ye0;
/*   */     int m = i + 1;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       m *= 31;
/*   */       Object object;
/*   */       if ((object = arrayOfObject[k]) != null)
/*   */         m = object.hashCode() + m; 
/*   */       if (++k == j)
/*   */         k = 0; 
/*   */     } 
/*   */     return m;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null || !(paramObject instanceof mf0))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     int j = this.bK;
/*   */     if (((mf0)paramObject).bK != j)
/*   */       return false; 
/*   */     Object[] arrayOfObject1;
/*   */     int i = (arrayOfObject1 = this.public).length;
/*   */     Object[] arrayOfObject2;
/*   */     int k = (arrayOfObject2 = ((mf0)paramObject).public).length;
/*   */     int m = this.Ye0;
/*   */     int n = ((mf0)paramObject).Ye0;
/*   */     byte b = 0;
/*   */     while (b < j) {
/*   */       Object object2 = arrayOfObject2[n];
/*   */       Object object1;
/*   */       if (((object1 = this[m]) == null) ? (object2 == null) : object1.equals(object2)) {
/*   */         n++;
/*   */         if (++m == i)
/*   */           m = 0; 
/*   */         if (n == k)
/*   */           n = 0; 
/*   */         b++;
/*   */         continue;
/*   */       } 
/*   */       return false;
/*   */     } 
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mf0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */