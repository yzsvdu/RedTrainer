/* 1 */ package f;public abstract class Yk0 extends AbstractSet implements Iterable { public Yk0(eJ0 parameJ0) {} public abstract Iterator iterator(); public abstract boolean L70(Object paramObject); public abstract boolean an0(Object paramObject); public final int size() { return this.Eu0.ir0; }
/*   */   public final boolean contains(Object paramObject) { return an0(paramObject); }
/* 3 */   public final boolean remove(Object paramObject) { try { return L70(paramObject); } catch (ClassCastException classCastException) { return false; }  } public final void clear() { this.Eu0.clear(); } public final boolean add(Object paramObject) { throw new UnsupportedOperationException(); } public final Object[] toArray() { Object[] arrayOfObject; Iterator iterator; byte b; for (arrayOfObject = new Object[this.Eu0.ir0], iterator = iterator(), b = 0; iterator.hasNext(); ) { this[b] = iterator.next(); b++; }  return this; }
/*   */    public final Object[] toArray(Object[] paramArrayOfObject) {
/* 5 */     int i = this.Eu0.ir0;
/* 6 */     if (paramArrayOfObject.length < i) paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);  Iterator iterator; byte b; for (iterator = iterator(), b = 0; b < i; ) { paramArrayOfObject[b] = next(); b++; }  if (paramArrayOfObject.length > i) paramArrayOfObject[i] = null;  return paramArrayOfObject;
/*   */   }
/*   */   
/*   */   public final boolean isEmpty() {
/*   */     return this.Eu0.isEmpty();
/*   */   }
/*   */   
/*   */   public final boolean addAll(Collection paramCollection) {
/*   */     throw new UnsupportedOperationException();
/*   */   }
/*   */   
/*   */   public final boolean retainAll(Collection paramCollection) {
/*   */     boolean bool = false;
/*   */     Iterator iterator = iterator();
/*   */     while (iterator.hasNext()) {
/*   */       if (!paramCollection.contains(iterator.next())) {
/*   */         iterator.remove();
/*   */         bool = true;
/*   */       } 
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     Iterator<?> iterator;
/*   */     if (!(iterator = iterator()).hasNext())
/*   */       return "{}"; 
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append('{');
/*   */     while (true) {
/*   */       Object object;
/*   */       if ((object = iterator.next()) == this)
/*   */         object = "(this Collection)"; 
/*   */       stringBuilder.append(object);
/*   */       if (!iterator.hasNext())
/*   */         return stringBuilder.append('}').toString(); 
/*   */       stringBuilder.append(", ");
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yk0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */