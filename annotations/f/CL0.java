/* 1 */ package f;public final class CL0 { public final Field Lh; public final Class L9(int paramInt) { Type[] arrayOfType; Type type; if (type = this.Lh.getGenericType() instanceof ParameterizedType && (arrayOfType = ((ParameterizedType)this).getActualTypeArguments()).length - 1 >= paramInt) { Type type1; if (type1 = this[paramInt] instanceof Class) return (Class)this;  if (this instanceof ParameterizedType) return (Class)((ParameterizedType)this).getRawType();  if (this instanceof GenericArrayType && type1 = ((GenericArrayType)this).getGenericComponentType() instanceof Class)
/* 2 */         return Array.newInstance((Class)this, 0).getClass();  }  return null; }
/* 3 */   public CL0(Field paramField) { this.Lh = paramField; } public final Class Zu() { return this.Lh.getType(); } public final boolean gv0(Class<? extends Annotation> paramClass) { return this.Lh.isAnnotationPresent(paramClass); } public final Object Op(Object paramObject) { try { return this.Lh.get(paramObject); } catch (IllegalArgumentException illegalArgumentException) { throw new BC(
/* 4 */           B40.df("Object is not an instance of ")
/*   */           
/* 6 */           .append(this.Lh.getDeclaringClass()).toString(), illegalArgumentException); }
/*   */     catch (IllegalAccessException illegalAccessException)
/*   */     { throw new BC(B40.df("Illegal access to field: ").append(this.Lh.getName()).toString(), illegalAccessException); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CL0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */