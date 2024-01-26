/* 1 */ package f;public abstract class zX { public final void NR(boolean paramBoolean) { boolean bool = this.WU; this.WU = paramBoolean; String str = "enabled"; PropertyChangeSupport propertyChangeSupport; if ((propertyChangeSupport = this.A80) != null) propertyChangeSupport.firePropertyChange(str, bool, paramBoolean);  }
/*   */ 
/*   */   
/*   */   public String e0;
/*   */   public String kn0;
/*   */   public boolean WU = true;
/*   */   public PropertyChangeSupport A80;
/*   */   
/*   */   public zX() {}
/*   */   
/*   */   public zX(String paramString) {
/*   */     this.e0 = paramString;
/*   */   }
/*   */   
/*   */   public final String QJ() {
/*   */     return this.e0;
/*   */   }
/*   */   
/*   */   public abstract JG0 X9(io paramio, int paramInt);
/*   */   
/*   */   public final void DL0(PropertyChangeListener paramPropertyChangeListener) {
/*   */     if (this.A80 == null) {
/*   */       PropertyChangeSupport propertyChangeSupport;
/*   */       this(this);
/*   */       this.A80 = propertyChangeSupport;
/*   */     } 
/*   */     this.A80.addPropertyChangeListener(paramPropertyChangeListener);
/*   */   }
/*   */   
/*   */   public final void Ey0(PropertyChangeListener paramPropertyChangeListener) {
/*   */     PropertyChangeSupport propertyChangeSupport;
/*   */     if ((propertyChangeSupport = this.A80) != null)
/*   */       removePropertyChangeListener(paramPropertyChangeListener); 
/*   */   }
/*   */   
/*   */   public final void l8(String paramString1, String paramString2, String paramString3) {
/*   */     PropertyChangeSupport propertyChangeSupport;
/*   */     if ((propertyChangeSupport = this.A80) != null)
/*   */       firePropertyChange(paramString1, paramString2, paramString3); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */