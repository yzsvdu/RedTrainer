/*  1 */ package f;public final class mk0 extends Kl0 { public byte XS; public short ZB0; public final void sM() { this
/*  2 */       .XS = this.Ws.get();
/*    */     
/*  4 */     this.ZB0 = this.Ws.getShort();
/*    */     
/*  6 */     this.I6 = this.Ws.getShort(); }
/*    */   public short I6; public mk0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { if (r8() != null) { BF bF = (r8()).fF0; short s1 = this.ZB0, s2 = this.I6; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/h30}, expression=ArrayExpression{FieldReferenceExpression{lastType=ObjectType{f/jM, dimension=1}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/BF}, name=null}, name=ng, descriptor=[Lf/jM;}[ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=byte}, name=null}]}, name=fG, descriptor=Lf/h30;}} */ byte b; if (Bh0.py(b = this.XS, s1)) { Exception exception; h30 h30; if (s2 == 0) { h30 h301; 
/*  8 */           try { s1 = h30.CB0; int i;
/*  9 */             if ((i = (h30 = (bF.ng[b]).fG).d80(s1)) >= 0) { s1 = h30.Qz0[i]; h30.Id(i); }
/*    */              }
/* 11 */           finally { exception = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} */ }  }
/* 12 */         else { jM jM; h30 h301; h30 h302; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/h30}, expression=BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/jM}, name=null} = ArrayExpression{FieldReferenceExpression{lastType=ObjectType{f/jM, dimension=1}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/BF}, name=null}, name=ng, descriptor=[Lf/jM;}[ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=byte}, name=null}]}}, name=fG, descriptor=Lf/h30;}} */ if (h30 == 
/*    */ 
/*    */ 
/*    */             
/* 16 */             null) { 
/*    */             try { /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/h30}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/jM}, name=null}, name=fG, descriptor=Lf/h30;}} */ 
/* 18 */               try { short s = (h301 = jM.fG).CB0; }
/*    */               finally
/* 20 */               { exception = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} */ }  } finally {} } else { ((jM)h301)
/* 21 */               .fG.st(exception, h30); }  /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} */ }  bF
/* 22 */           .Fk(b); }
/* 23 */       else { bF
/* 24 */           .getClass();
/* 25 */         throw new RuntimeException("Attempt to set non-client aware flag."); }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */