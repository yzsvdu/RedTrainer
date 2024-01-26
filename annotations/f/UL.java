/*  1 */ package f;public final class UL implements Externalizable { public final String toString() { this("{"); StringBuilder stringBuilder; int i; for (i = this.Jh0.Mp0 - 1; i > 0; ) { wx0 wx02; if (i < 
/*  2 */         (wx02 = this.Jh0)
/*  3 */         .Mp0) { stringBuilder
/*    */           
/*  5 */           .append(wx02.d90[i]); stringBuilder.append(", "); i--; continue; }
/*  6 */        throw new ArrayIndexOutOfBoundsException(i); }
/*    */      wx0 wx01;
/*  8 */     if ((i = (wx01 = this.Jh0).Mp0) > 0) { i = 0; if (i > 0) { stringBuilder
/*    */           
/* 10 */           .append(this.d90[i]); }
/* 11 */       else { throw new ArrayIndexOutOfBoundsException(i); }  }  stringBuilder
/* 12 */       .append("}"); return stringBuilder.toString(); }
/*    */ 
/*    */   
/*    */   public static final long serialVersionUID = 1L;
/*    */   public wx0 Jh0;
/*    */   
/*    */   public UL() {
/*    */     this(0);
/*    */   }
/*    */   
/*    */   public UL(int paramInt) {
/*    */     wx0 wx01;
/*    */     this(10);
/*    */     this.Jh0 = this;
/*    */   }
/*    */   
/*    */   public final boolean equals(Object paramObject) {
/*    */     if (this == paramObject)
/*    */       return true; 
/*    */     if (paramObject == null || UL.class != paramObject.getClass())
/*    */       return false; 
/*    */     this = (UL)paramObject;
/*    */     return this.Jh0.equals(this.Jh0);
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    */     return this.Jh0.hashCode();
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(0);
/*    */     paramObjectOutput.writeObject(this.Jh0);
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     this.Jh0 = (wx0)paramObjectInput.readObject();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */