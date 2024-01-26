/*  1 */ package f;public final class Jd { public final void vo(Mv0 paramMv0) { ArrayList arrayList; int i; if ((i = h1.f0) != 1) { if (i != 2) { if (i != 3) { i = 100; } else { i = 2500; }  } else { i = 1000; }  } else { i = 250; }  int j; if ((j = Bz.z00) > 0) i = j;  /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/ArrayList}, expression=ThisExpression{ObjectType{f/Jd}}, name=BE, descriptor=Ljava/util/ArrayList;}} */ try { this.BE.add(paramMv0); for (; this.BE.size() >= i; this.BE.remove(0)); vh0 vh0; if (paramMv0.interface == 
/*  2 */         ZY.Nd0 && paramMv0
/*  3 */         .r6 > 0 && 
/*    */         
/*  5 */         !paramMv0.mq.isEmpty() && (vh0 = km.a3) != null && paramMv0
/*  6 */         .r6 != vh0
/*  7 */         .yD) { this
/*  8 */           .yE0
/*    */           
/* 10 */           .remove(paramMv0.mq); boolean bool = false; this.yE0
/*    */           
/* 12 */           .add(bool, paramMv0.mq); for (; this.yE0.size() >= 10; this.yE0.remove(this.yE0.size() - 1)); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       return; }
/*    */     finally
/* 31 */     { this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */ }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final Jd qp0 = new Jd();
/*    */   public ArrayList BE;
/*    */   public ArrayList yE0;
/*    */   public int rq0;
/*    */   
/*    */   public Jd() {
/*    */     ArrayList arrayList;
/*    */     this();
/*    */     this.BE = this;
/*    */     this();
/*    */     this.yE0 = this;
/*    */   }
/*    */   
/*    */   public static Jd NM() {
/*    */     return qp0;
/*    */   }
/*    */   
/*    */   public final String m10(String paramString) {
/*    */     ArrayList arrayList;
/*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/ArrayList}, expression=ThisExpression{ObjectType{f/Jd}}, name=BE, descriptor=Ljava/util/ArrayList;}} */
/*    */     try {
/*    */       if (this.yE0.isEmpty())
/*    */         return null; 
/*    */       if (paramString == null || paramString.trim().isEmpty())
/*    */         return this.yE0.get(0); 
/*    */       return this.yE0.get(0);
/*    */     } finally {
/*    */       this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
/*    */     } 
/*    */   }
/*    */   
/*    */   public final synchronized void rf0(int paramInt) {
/*    */     if (paramInt == this.rq0)
/*    */       return; 
/*    */     this.rq0 = paramInt;
/*    */     this.yE0.clear();
/*    */     this.BE.clear();
/*    */   }
/*    */   
/*    */   public final boolean qK0(int paramInt) {
/*    */     ArrayList arrayList;
/*    */     boolean bool = false;
/*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/ArrayList}, expression=ThisExpression{ObjectType{f/Jd}}, name=BE, descriptor=Ljava/util/ArrayList;}} */
/*    */     try {
/*    */       return bool;
/*    */     } finally {
/*    */       Exception exception = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */