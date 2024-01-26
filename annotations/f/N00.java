/*  1 */ package f;public final class N00 { public final Object qC(Object... paramVarArgs) { try { return this.hx0.newInstance(paramVarArgs);
/*    */       
/*    */        }
/*    */     
/*    */     catch (IllegalArgumentException illegalArgumentException)
/*    */     
/*    */     { 
/*    */       
/*  9 */       throw new BC(
/* 10 */           B40.df("Illegal argument(s) supplied to constructor for class: ")
/*    */           
/* 12 */           .append(this.hx0.getDeclaringClass().getName()).toString(), illegalArgumentException); }
/*    */     catch (InstantiationException instantiationException)
/*    */     { throw new BC(B40.df("Could not instantiate instance of class: ").append(this.hx0.getDeclaringClass().getName()).toString(), instantiationException); }
/*    */     catch (IllegalAccessException illegalAccessException)
/*    */     { throw new BC(B40.df("Could not instantiate instance of class: ").append(this.hx0.getDeclaringClass().getName()).toString(), illegalAccessException); }
/*    */     catch (InvocationTargetException invocationTargetException)
/*    */     { throw new BC(B40.df("Exception occurred in constructor for class: ").append(this.hx0.getDeclaringClass().getName()).toString(), invocationTargetException); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Constructor hx0;
/*    */   
/*    */   public N00(Constructor paramConstructor) {
/*    */     this.hx0 = paramConstructor;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/N00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */