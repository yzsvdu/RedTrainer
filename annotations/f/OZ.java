/*   */ package f;public final class OZ extends LK0 { public final void i3(Object paramObject) {
/* 2 */     CR(this.Fj.size(), paramObject);
/*   */   }
/*   */   
/*   */   public final ArrayList Fj;
/*   */   
/*   */   public OZ() {
/*   */     ArrayList arrayList;
/*   */     this();
/*   */     this.Fj = this;
/*   */   }
/*   */   
/*   */   public OZ(Collection<? extends E> paramCollection) {
/*   */     ArrayList arrayList;
/*   */     this(paramCollection);
/*   */     this.Fj = this;
/*   */   }
/*   */   
/*   */   public OZ(Object... paramVarArgs) {
/*   */     this.Fj = new ArrayList(Arrays.asList(paramVarArgs));
/*   */   }
/*   */   
/*   */   public final Object c90(int paramInt) {
/*   */     return this.Fj.get(paramInt);
/*   */   }
/*   */   
/*   */   public final int pu() {
/*   */     return this.Fj.size();
/*   */   }
/*   */   
/*   */   public final void CR(int paramInt, Object paramObject) {
/*   */     this.Fj.add(paramInt, paramObject);
/*   */     MQ[] arrayOfMQ;
/*   */     if ((arrayOfMQ = this.rw) != null) {
/*   */       int i;
/*   */       byte b;
/*   */       for (i = this.length, b = 0; b < i; ) {
/*   */         this[b].Ge(paramInt, paramInt);
/*   */         b++;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int on0(String paramString) {
/*   */     return this.Fj.indexOf(paramString);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */