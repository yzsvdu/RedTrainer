/* 1 */ package f;public final class Jk implements Map.Entry { public final boolean equals(Object paramObject) { if (paramObject instanceof Map.Entry) { paramObject = paramObject; eJ0 eJ02 = this.d2;
/* 2 */       paramObject = paramObject.getKey();
/* 3 */       eJ02.getClass();
/* 4 */       eJ0 eJ01 = this.d2;
/*   */       
/* 6 */       getClass(); return (zb0.Dz0(this.Su0, paramObject) && zb0.Dz0(this.R0, this.R0)); }  return false; }
/*   */ 
/*   */   
/*   */   public Object Su0;
/*   */   public Object R0;
/*   */   public final int Ww;
/*   */   
/*   */   public Jk(eJ0 parameJ0, Object paramObject1, Object paramObject2, int paramInt) {
/*   */     this.Su0 = paramObject1;
/*   */     this.R0 = paramObject2;
/*   */     this.Ww = paramInt;
/*   */   }
/*   */   
/*   */   public final Object getKey() {
/*   */     return this.Su0;
/*   */   }
/*   */   
/*   */   public final Object getValue() {
/*   */     return this.R0;
/*   */   }
/*   */   
/*   */   public final Object setValue(Object paramObject) {
/*   */     Object[] arrayOfObject;
/*   */     int i;
/*   */     Object object;
/*   */     if ((arrayOfObject = this.d2.Con)[i = this.Ww] == (object = this.R0)) {
/*   */       arrayOfObject[i] = paramObject;
/*   */       this.R0 = paramObject;
/*   */       return object;
/*   */     } 
/*   */     throw new ConcurrentModificationException();
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Su0 : Ljava/lang/Object;
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: ifnonnull -> 14
/*   */     //   9: iconst_0
/*   */     //   10: istore_1
/*   */     //   11: goto -> 19
/*   */     //   14: aload_1
/*   */     //   15: invokevirtual hashCode : ()I
/*   */     //   18: istore_1
/*   */     //   19: aload_0
/*   */     //   20: getfield R0 : Ljava/lang/Object;
/*   */     //   23: dup
/*   */     //   24: astore_0
/*   */     //   25: ifnonnull -> 33
/*   */     //   28: iconst_0
/*   */     //   29: istore_0
/*   */     //   30: goto -> 38
/*   */     //   33: aload_0
/*   */     //   34: invokevirtual hashCode : ()I
/*   */     //   37: istore_0
/*   */     //   38: iload_1
/*   */     //   39: iload_0
/*   */     //   40: ixor
/*   */     //   41: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 15
/*   */     //   #3	-> 20
/*   */     //   #4	-> 34
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.Su0 + "=" + this.R0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */