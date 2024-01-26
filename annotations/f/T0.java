/*   */ package f;public final class T0 extends b70 { public T0() {
/* 2 */     this(B40.df("mtl").append(++VJ).toString());
/*   */   }
/*   */   
/*   */   public static int VJ = 0;
/*   */   public String Xy0;
/*   */   
/*   */   public T0(String paramString) {
/*   */     this.Xy0 = paramString;
/*   */   }
/*   */   
/*   */   public T0(dj... paramVarArgs) {
/*   */     this();
/*   */     nO(paramVarArgs);
/*   */   }
/*   */   
/*   */   public T0(String paramString, dj... paramVarArgs) {
/*   */     this(paramString);
/*   */     nO(paramVarArgs);
/*   */   }
/*   */   
/*   */   public T0(fQ paramfQ) {
/*   */     this();
/*   */     ir(paramfQ);
/*   */   }
/*   */   
/*   */   public T0(String paramString, fQ paramfQ) {
/*   */     this(paramString);
/*   */     ir(paramfQ);
/*   */   }
/*   */   
/*   */   public T0(T0 paramT0) {
/*   */     this(paramT0.Xy0, paramT0);
/*   */   }
/*   */   
/*   */   public T0(String paramString, T0 paramT0) {
/*   */     this(paramString);
/*   */     Iterator iterator = paramT0.iterator();
/*   */     Hc0 hc0;
/*   */     while ((hc0 = (Hc0)iterator).hasNext())
/*   */       Tz0(((dj)hc0.next()).Mi0()); 
/*   */   }
/*   */   
/*   */   public final T0 Be0() {
/*   */     return new T0(this);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = super.hashCode();
/*   */     return this.Xy0.hashCode() * 3 + i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     return (paramObject instanceof T0 && (paramObject == this || (((T0)paramObject).Xy0.equals(this.Xy0) && super.equals(paramObject))));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/T0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */