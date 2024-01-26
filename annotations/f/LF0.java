/* 1 */ package f;public final class LF0 implements Iterable { public final void dG0(long paramLong, Object paramObject) { if (paramLong == 0L) { this.uv = paramObject; if (!this.B6) { this.B6 = true; this.hm++; }  return; }  int m; if ((m = Pw0(paramLong)) >= 0) { this.L8[m]; this.L8[m] = paramObject; return; }  m = -(m + 1); long[] arrayOfLong2; (arrayOfLong2 = this.j3)[m] = paramLong; this.L8[m] = paramObject; this.hm = i; int j = arrayOfLong2.length; this.JV = (int)(i * this.np); int i, k = (i = arrayOfLong2.length << 1) - 1; this.Vk0 = Long.numberOfLeadingZeros(k); long[] arrayOfLong1 = this.j3; Object[] arrayOfObject = this.L8; this.j3 = new long[i]; this.L8 = new Object[i]; if ((i = this.hm + 1) >= this.JV && this.hm > 0) for (i = 0; i < j; ) { long l; if ((l = arrayOfLong1[i]) != 0L) { Object object = arrayOfObject[i];
/* 2 */           long[] arrayOfLong = this.j3;
/* 3 */           int n = (int)((l ^ l >>> 32L) * -7046029254386353131L >>> this.Vk0); while (true) { if (arrayOfLong[n] == 
/* 4 */               0L) { arrayOfLong[n] = l; this.L8[n] = object; break; }  n = n + 1 & this.mc0; }  }  i++; }
/*   */         }
/*   */ 
/*   */   
/*   */   public int hm;
/*   */   public long[] j3;
/*   */   public Object[] L8;
/*   */   public Object uv;
/*   */   public boolean B6;
/*   */   public final float np;
/*   */   public int JV;
/*   */   public int Vk0;
/*   */   public int mc0;
/*   */   public transient lM Up;
/*   */   public transient lM uH;
/*   */   public transient NT lS;
/*   */   public transient NT P00;
/*   */   
/*   */   public LF0() {
/*   */     this(51, 0.8F);
/*   */   }
/*   */   
/*   */   public LF0(int paramInt) {
/*   */     this(paramInt, 0.8F);
/*   */   }
/*   */   
/*   */   public LF0(int paramInt, float paramFloat) {
/*   */     if (paramFloat > 0.0F && paramFloat < 1.0F) {
/*   */       this.np = paramFloat;
/*   */       this.JV = (int)(paramInt * paramFloat);
/*   */       int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1;
/*   */       this.Vk0 = Long.numberOfLeadingZeros(i);
/*   */       this.j3 = new long[paramInt];
/*   */       this.L8 = new Object[paramInt];
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat);
/*   */   }
/*   */   
/*   */   public LF0(LF0 paramLF0) {
/*   */     this((int)(paramLF0.j3.length * (f = paramLF0.np)), f);
/*   */     long[] arrayOfLong = this.j3;
/*   */     int j = paramLF0.j3.length;
/*   */     System.arraycopy(paramLF0.j3, 0, arrayOfLong, 0, j);
/*   */     Object[] arrayOfObject = this.L8;
/*   */     int i = paramLF0.L8.length;
/*   */     System.arraycopy(paramLF0.L8, 0, this, 0, i);
/*   */     this.hm = paramLF0.hm;
/*   */     this.uv = paramLF0.uv;
/*   */     this.B6 = paramLF0.B6;
/*   */   }
/*   */   
/*   */   public final Object Ie(long paramLong) {
/*   */     int i;
/*   */     return (paramLong == 0L) ? (this.B6 ? this.uv : null) : (((i = Pw0(paramLong)) >= 0) ? this.L8[i] : null);
/*   */   }
/*   */   
/*   */   public final void sH(long paramLong) {
/*   */     if (paramLong == 0L) {
/*   */       if (!this.B6)
/*   */         return; 
/*   */       this.B6 = false;
/*   */       this.uv = null;
/*   */       this.hm--;
/*   */       return;
/*   */     } 
/*   */     int i;
/*   */     if ((i = Pw0(paramLong)) < 0)
/*   */       return; 
/*   */     long[] arrayOfLong = this.j3;
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = this.L8)[i];
/*   */     int k;
/*   */     long l;
/*   */     for (int j = this.mc0; (l = arrayOfLong[k]) != 0L; ) {
/*   */       int m;
/*   */       if ((k - (m = (int)((l ^ l >>> 32L) * -7046029254386353131L >>> this.Vk0)) & j) > (i - m & j)) {
/*   */         arrayOfLong[i] = l;
/*   */         arrayOfObject[i] = arrayOfObject[k];
/*   */         i = k;
/*   */       } 
/*   */       k = k + 1 & j;
/*   */     } 
/*   */     arrayOfLong[i] = 0L;
/*   */     arrayOfObject[i] = null;
/*   */     this.hm--;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: getfield hm : I
/*   */     //   5: istore_1
/*   */     //   6: getfield B6 : Z
/*   */     //   9: ifeq -> 28
/*   */     //   12: aload_0
/*   */     //   13: getfield uv : Ljava/lang/Object;
/*   */     //   16: dup
/*   */     //   17: astore_2
/*   */     //   18: ifnull -> 28
/*   */     //   21: aload_2
/*   */     //   22: invokevirtual hashCode : ()I
/*   */     //   25: iload_1
/*   */     //   26: iadd
/*   */     //   27: istore_1
/*   */     //   28: aload_0
/*   */     //   29: getfield j3 : [J
/*   */     //   32: dup
/*   */     //   33: astore_2
/*   */     //   34: aload_0
/*   */     //   35: getfield L8 : [Ljava/lang/Object;
/*   */     //   38: astore_0
/*   */     //   39: iconst_0
/*   */     //   40: istore_3
/*   */     //   41: arraylength
/*   */     //   42: istore #4
/*   */     //   44: iload_3
/*   */     //   45: iload #4
/*   */     //   47: if_icmpge -> 99
/*   */     //   50: aload_2
/*   */     //   51: iload_3
/*   */     //   52: laload
/*   */     //   53: dup2
/*   */     //   54: lstore #5
/*   */     //   56: lconst_0
/*   */     //   57: lcmp
/*   */     //   58: ifeq -> 93
/*   */     //   61: aload_0
/*   */     //   62: iload_3
/*   */     //   63: lload #5
/*   */     //   65: iload_1
/*   */     //   66: i2l
/*   */     //   67: lstore #5
/*   */     //   69: ldc2_w 31
/*   */     //   72: lmul
/*   */     //   73: lload #5
/*   */     //   75: ladd
/*   */     //   76: l2i
/*   */     //   77: istore_1
/*   */     //   78: aaload
/*   */     //   79: dup
/*   */     //   80: astore #5
/*   */     //   82: ifnull -> 93
/*   */     //   85: aload #5
/*   */     //   87: invokevirtual hashCode : ()I
/*   */     //   90: iload_1
/*   */     //   91: iadd
/*   */     //   92: istore_1
/*   */     //   93: iinc #3, 1
/*   */     //   96: goto -> 44
/*   */     //   99: iload_1
/*   */     //   100: ireturn
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!(paramObject instanceof LF0))
/*   */       return false; 
/*   */     if (((LF0)(paramObject = paramObject)).hm != this.hm)
/*   */       return false; 
/*   */     boolean bool;
/*   */     if (((LF0)paramObject).B6 != (bool = this.B6))
/*   */       return false; 
/*   */     if (bool) {
/*   */       Object object;
/*   */       if ((object = ((LF0)paramObject).uv) == null) {
/*   */         if (this.uv != null)
/*   */           return false; 
/*   */       } else if (!object.equals(this.uv)) {
/*   */         return false;
/*   */       } 
/*   */     } 
/*   */     Object[] arrayOfObject;
/*   */     long[] arrayOfLong;
/*   */     byte b;
/*   */     int i;
/*   */     for (arrayOfObject = this.L8, b = 0, i = (arrayOfLong = this.j3).length; b < i; ) {
/*   */       long l;
/*   */       int j;
/*   */       if ((j = (l = arrayOfLong[b]) cmp 0L) != 0) {
/*   */         int k;
/*   */         Object object;
/*   */         if ((object = this[b]) == null) {
/*   */           Object object1 = f7.mv0;
/*   */           if (j == 0) {
/*   */             if (((LF0)paramObject).B6)
/*   */               object1 = ((LF0)paramObject).uv; 
/*   */           } else if ((k = paramObject.Pw0(l)) >= 0) {
/*   */             object1 = ((LF0)paramObject).L8[k];
/*   */           } 
/*   */           if (object1 != null)
/*   */             return false; 
/*   */         } else if (!object.equals(paramObject.Ie(k))) {
/*   */           return false;
/*   */         } 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     if (this.hm == 0)
/*   */       return "[]"; 
/*   */     this(32);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append('[');
/*   */     Object[] arrayOfObject = this.L8;
/*   */     long[] arrayOfLong;
/*   */     int i = (arrayOfLong = this.j3).length;
/*   */     if (this.B6) {
/*   */       stringBuilder.append("0=");
/*   */       stringBuilder.append(this.uv);
/*   */     } else {
/*   */       while (i-- > 0) {
/*   */         long l;
/*   */         if ((l = arrayOfLong[i]) == 0L)
/*   */           continue; 
/*   */         stringBuilder.append(l);
/*   */         stringBuilder.append('=');
/*   */         stringBuilder.append(arrayOfObject[i]);
/*   */       } 
/*   */     } 
/*   */     while (i-- > 0) {
/*   */       long l;
/*   */       if ((l = arrayOfLong[i]) == 0L)
/*   */         continue; 
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append(l);
/*   */       stringBuilder.append('=');
/*   */       stringBuilder.append(arrayOfObject[i]);
/*   */     } 
/*   */     stringBuilder.append(']');
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     lM lM1;
/*   */     if (this.Up == null) {
/*   */       lM lM3;
/*   */       this(this);
/*   */       this.Up = lM3;
/*   */       this(this);
/*   */       this.uH = lM3;
/*   */     } 
/*   */     lM lM2;
/*   */     if (!(lM2 = this.Up).SJ) {
/*   */       lM2.We0();
/*   */       (lM1 = this.Up).SJ = true;
/*   */       this.uH.SJ = false;
/*   */     } else {
/*   */       ((LF0)super).uH.We0();
/*   */       (lM1 = ((LF0)super).uH).SJ = true;
/*   */       ((LF0)super).Up.SJ = false;
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final int Pw0(long paramLong) {
/*   */     long[] arrayOfLong = this.j3;
/*   */     int i = (int)((paramLong ^ paramLong >>> 32L) * -7046029254386353131L >>> this.Vk0);
/*   */     while (true) {
/*   */       long l;
/*   */       if ((l = arrayOfLong[i]) == 0L)
/*   */         return -(i + 1); 
/*   */       if (l == paramLong)
/*   */         return i; 
/*   */       i = i + 1 & this.mc0;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LF0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */