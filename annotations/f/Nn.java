/* 1 */ package f;public final class Nn extends f7 { public final String FS() { String str = ", "; if (this
/* 2 */       .Cx0 == 0) return "{}";  this(32); StringBuilder stringBuilder; (new StringBuilder()).append('{'); fQ fQ1; byte b; int i; for (b = 0, i = (fQ1 = this.CO).Z8; b < i; ) { Object object2, object1 = fQ1.get(b); if (b > 0) stringBuilder.append(str);  if (object1 == this) { object2 = "(this)"; } else { object2 = object1; }  stringBuilder.append(object2); stringBuilder.append('='); if ((object1 = pd0(object1)) == this) object1 = "(this)";  stringBuilder.append(object1); b++; }  stringBuilder.append('}'); return stringBuilder.toString(); }
/*   */ 
/*   */   
/*   */   public final fQ CO;
/*   */   
/*   */   public Nn() {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.CO = this;
/*   */   }
/*   */   
/*   */   public Nn(int paramInt) {
/*   */     super(paramInt);
/*   */     fQ fQ1;
/*   */     this(paramInt);
/*   */     this.CO = this;
/*   */   }
/*   */   
/*   */   public Nn(int paramInt, float paramFloat) {
/*   */     super(paramInt, paramFloat);
/*   */     fQ fQ1;
/*   */     this(paramInt);
/*   */     this.CO = this;
/*   */   }
/*   */   
/*   */   public Nn(Nn paramNn) {
/*   */     super(paramNn);
/*   */     this.CO = new fQ(paramNn.CO);
/*   */   }
/*   */   
/*   */   public final Object X00(Object paramObject1, Object paramObject2) {
/*   */     Object[] arrayOfObject;
/*   */     int j;
/*   */     if ((j = gP(paramObject1)) >= 0) {
/*   */       this[j] = paramObject2;
/*   */       return (arrayOfObject = this.RG)[j];
/*   */     } 
/*   */     j = -(j + 1);
/*   */     ((f7)this).g00[j] = paramObject1;
/*   */     ((f7)this).RG[j] = paramObject2;
/*   */     ((Nn)super).CO.Com3(paramObject1);
/*   */     ((f7)this).Cx0 = i;
/*   */     int i;
/*   */     if ((i = ((f7)this).Cx0 + 1) >= ((f7)this).aZ)
/*   */       lE(((f7)this).g00.length << 1); 
/*   */     return null;
/*   */   }
/*   */   
/*   */   public final Object HH(Object paramObject) {
/*   */     this.CO.Ct(paramObject, false);
/*   */     return super.HH(paramObject);
/*   */   }
/*   */   
/*   */   public final void NL0(int paramInt) {
/*   */     super.HH(this.CO.Hc(paramInt));
/*   */   }
/*   */   
/*   */   public final void t9() {
/*   */     this.CO.clear();
/*   */     super.t9();
/*   */   }
/*   */   
/*   */   public final fQ Mr() {
/*   */     return this.CO;
/*   */   }
/*   */   
/*   */   public final oc COM7() {
/*   */     return sh();
/*   */   }
/*   */   
/*   */   public final oc sh() {
/*   */     if (this.jQ == null) {
/*   */       rm0 rm0;
/*   */       this(this);
/*   */       this.jQ = rm0;
/*   */       this(this);
/*   */       this.yh0 = rm0;
/*   */     } 
/*   */     oc oc;
/*   */     if (!(oc = this.jQ).IO) {
/*   */       oc.kk0();
/*   */       this.jQ.IO = true;
/*   */       this.yh0.IO = false;
/*   */       return this.jQ;
/*   */     } 
/*   */     this.yh0.kk0();
/*   */     this.yh0.IO = true;
/*   */     this.jQ.IO = false;
/*   */     return this.yh0;
/*   */   }
/*   */   
/*   */   public final TA mw0() {
/*   */     if (this.gE0 == null) {
/*   */       Ub0 ub0;
/*   */       this(this);
/*   */       this.gE0 = ub0;
/*   */       this(this);
/*   */       this.Jw = ub0;
/*   */     } 
/*   */     TA tA;
/*   */     if (!(tA = this.gE0).IO) {
/*   */       tA.kk0();
/*   */       this.gE0.IO = true;
/*   */       this.Jw.IO = false;
/*   */       return this.gE0;
/*   */     } 
/*   */     this.Jw.kk0();
/*   */     this.Jw.IO = true;
/*   */     this.gE0.IO = false;
/*   */     return this.Jw;
/*   */   }
/*   */   
/*   */   public final Q70 W5() {
/*   */     if (this.Yz == null) {
/*   */       CM cM;
/*   */       this(this);
/*   */       this.Yz = cM;
/*   */       this(this);
/*   */       this.E90 = cM;
/*   */     } 
/*   */     Q70 q70;
/*   */     if (!(q70 = this.Yz).IO) {
/*   */       q70.kk0();
/*   */       this.Yz.IO = true;
/*   */       this.E90.IO = false;
/*   */       return this.Yz;
/*   */     } 
/*   */     this.E90.kk0();
/*   */     this.E90.IO = true;
/*   */     this.Yz.IO = false;
/*   */     return this.E90;
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return sh();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nn.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */