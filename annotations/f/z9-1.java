package f;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class z9 implements jt, Serializable {
  private static final long serialVersionUID = 1978198479659022715L;
  
  public final jt zs0;
  
  public final z9 o90;
  
  public z9(ak paramak) {
    this.zs0 = paramak;
    this.o90 = this;
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o90 : Lf/z9;
    //   4: dup
    //   5: astore_0
    //   6: aload_1
    //   7: aload_0
    //   8: monitorenter
    //   9: invokevirtual defaultWriteObject : ()V
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: monitorexit
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   9	13	14	finally
    //   15	18	14	finally
  }
  
  public final int size() {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.size();
    } 
  }
  
  public final boolean Vs0(byte paramByte) {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.Vs0(paramByte);
    } 
  }
  
  public final Object Ha0(byte paramByte) {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.Ha0(paramByte);
    } 
  }
  
  public final Object VF(byte paramByte, Object paramObject) {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.VF(paramByte, paramObject);
    } 
  }
  
  public final Object Lt(byte paramByte) {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.Lt(paramByte);
    } 
  }
  
  public final void clear() {
    z9 z91;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/z9}, name=null} */
    try {
      return;
    } finally {
      this = null;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/z9}, name=null} */
    } 
  }
  
  public final boolean equals(Object paramObject) {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.equals(paramObject);
    } 
  }
  
  public final int hashCode() {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.hashCode();
    } 
  }
  
  public final String toString() {
    synchronized (this.o90) {
      /* monitor exit ThisExpression{ObjectType{f/z9}} */
      return this.zs0.toString();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/z9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */