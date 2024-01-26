/* 1 */ package f;public final class V6 extends R60 { public final boolean equals(Object paramObject) { if (!(paramObject instanceof V6)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     for (int i = this.JO.length; i-- > 0;) { if (this.JO[i] == 1 && !paramObject.return(this.n20[i])) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   
/*   */   public final boolean uX(int paramInt) {
/*   */     if (zv0(paramInt) < 0)
/*   */       return false; 
/*   */     xt0(this.ey);
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     int[] arrayOfInt;
/*   */     int i = (arrayOfInt = this.n20).length;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     this.n20 = new int[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte[i] == 1)
/*   */         zv0(arrayOfInt[i]); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     int j = this.JO.length;
/*   */     while (j-- > 0) {
/*   */       if (this.JO[j] == 1)
/*   */         i += this.n20[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this(this.ir0 * 2 + 2);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append("{");
/*   */     int i = this.JO.length;
/*   */     byte b = 1;
/*   */     while (i-- > 0) {
/*   */       stringBuilder.append(this.n20[i]);
/*   */       b++;
/*   */       if (this.JO[i] == 1 && b < this.ir0)
/*   */         stringBuilder.append(","); 
/*   */     } 
/*   */     stringBuilder.append("}");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(1);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeInt(this.ir0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeInt(this.yY);
/*   */     for (int i = this.JO.length; i-- > 0;) {
/*   */       if (this.JO[i] == 1)
/*   */         paramObjectOutput.writeInt(this.n20[i]); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     super.readExternal(paramObjectInput);
/*   */     int i = paramObjectInput.readInt();
/*   */     this.ri0 = paramObjectInput.readFloat();
/*   */     this.yY = j;
/*   */     int j;
/*   */     if (paramObjectInput.readByte() >= 1 && (j = paramObjectInput.readInt()) != 0)
/*   */       Arrays.fill(this.n20, j); 
/*   */     J00(i);
/*   */     while (i-- > 0)
/*   */       uX(paramObjectInput.readInt()); 
/*   */   }
/*   */   
/*   */   public final void E7(List paramList) {
/*   */     Iterator<Integer> iterator = paramList.iterator();
/*   */     while (iterator.hasNext())
/*   */       uX(((Integer)iterator.next()).intValue()); 
/*   */   }
/*   */   
/*   */   public final void Be(int[] paramArrayOfint) {
/*   */     int i = paramArrayOfint.length;
/*   */     while (i-- > 0)
/*   */       uX(paramArrayOfint[i]); 
/*   */   }
/*   */   
/*   */   public V6() {}
/*   */   
/*   */   public V6(int paramInt) {
/*   */     super(paramInt);
/*   */   }
/*   */   
/*   */   public V6(List paramList) {
/*   */     this(Math.max(paramList.size(), 10));
/*   */     E7(paramList);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/V6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */