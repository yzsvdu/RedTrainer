/* 1 */ package f;public abstract class Uc0 { public aq0 Nul; public HashMap Lg0; public j40[] Jm; public final void xC0(j40 paramj40) { HashMap hashMap; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ try { this.Lg0
/* 2 */         .put(Integer.valueOf(paramj40.Jg), paramj40); /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/HashMap}, expression=ThisExpression{ObjectType{f/Uc0}}, name=Lg0, descriptor=Ljava/util/HashMap;}} */ return; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ }  } public boolean ID0; public boolean bX; public Uc0(aq0 paramaq0) { HashMap<Object, Object> hashMap; this.ID0 = true; this.bX = false; this.Nul = paramaq0; this(); this.Lg0 = this; } public final void ao(j40 paramj40) { HashMap hashMap; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ try { this.Lg0.put(Integer.valueOf(paramj40.Jg), paramj40); /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/HashMap}, expression=ThisExpression{ObjectType{f/Uc0}}, name=Lg0, descriptor=Ljava/util/HashMap;}} */ return; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ }  } public final j40[] zc0() { HashMap hashMap; int i = oq(); j40[] arrayOfJ40; if ((arrayOfJ40 = this.Jm) == null || arrayOfJ40.length != i) { this.bX = false; this.Jm = new j40[i]; }  if (this.bX)
/* 3 */       return this.Jm;  /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/HashMap}, expression=ThisExpression{ObjectType{f/Uc0}}, name=Lg0, descriptor=Ljava/util/HashMap;}} */ short s = 0; while (true) { if (s < i) { try {  } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ }  continue; }  for (Iterator<j40> iterator = this.Lg0.values().iterator(); iterator.hasNext(); ) { j40 j401; short s1; if ((s1 = (j401 = iterator.next()).Zs.Tl0) >= i) continue;  this.Jm[s1] = j401; }  this.bX = true; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */ return this.Jm; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void eW(int paramInt) {
/*   */     HashMap hashMap;
/*   */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     try {
/*   */       this.Lg0.remove(Integer.valueOf(paramInt));
/*   */       /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/HashMap}, expression=ThisExpression{ObjectType{f/Uc0}}, name=Lg0, descriptor=Ljava/util/HashMap;}} */
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final j40[] lPt3() {
/*   */     synchronized (this.Lg0) {
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return (j40[])this.Lg0.values().toArray((Object[])new j40[0]);
/*   */     } 
/*   */   }
/*   */   
/*   */   public int oq() {
/*   */     return this.Nul.PR;
/*   */   }
/*   */   
/*   */   public final j40 ky(short paramShort) {
/*   */     return (paramShort < 0 || paramShort >= oq()) ? null : zc0()[paramShort];
/*   */   }
/*   */   
/*   */   public final j40 de0(int paramInt) {
/*   */     synchronized (this.Lg0) {
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return (j40)this.Lg0.get(Integer.valueOf(paramInt));
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Ix0() {
/*   */     this.ID0 = true;
/*   */     this.bX = false;
/*   */   }
/*   */   
/*   */   public final aq0 s20() {
/*   */     return this.Nul;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uc0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */