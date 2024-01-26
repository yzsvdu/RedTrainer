/*  1 */
package f;

public class fQ implements Iterable {
    public Object[] Uq0;
    public int Z8;
    public boolean Ru;
    public cD0 dc;

    public fQ() {
        this(true, 16);
    }

    public fQ(int paramInt) {
        this(true, paramInt);
    }

    public fQ(boolean paramBoolean, int paramInt) {
        this.Ru = paramBoolean;
        this.Uq0 = new Object[paramInt];
    }

    public fQ(boolean paramBoolean, int paramInt, Class paramClass) {
        this.Ru = paramBoolean;
        this.Uq0 = (Object[]) o7.JB0(paramClass, paramInt);
    }

    public fQ(Class paramClass) {
        this(true, 16, paramClass);
    }

    public final Object get(int paramInt) {
        if (paramInt < this.Z8) return this.Uq0[paramInt];
        throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ")
/*  2 */.append(this.Z8).toString());
    }

    public fQ(fQ paramfQ) {
        this(bool, j, paramfQ.Uq0.getClass().getComponentType());
        int i = paramfQ.Z8;
        System.arraycopy(paramfQ.Uq0, 0, this.Uq0, 0, i);
    }

    public fQ(Object[] paramArrayOfObject) {
        this(true, paramArrayOfObject, 0, i);
    }

    public fQ(boolean paramBoolean, Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
        this(paramBoolean, paramInt2, paramArrayOfObject.getClass().getComponentType());
        this.Z8 = paramInt2;
        System.arraycopy(paramArrayOfObject, paramInt1, this.Uq0, 0, paramInt2);
    }

    public static fQ Q8(Object... paramVarArgs) {
        return new fQ(paramVarArgs);
    }

    public final void Com3(Object paramObject) {
        Object[] arrayOfObject = this.Uq0;
        int j;
        if ((j = this.Z8) == arrayOfObject.length) arrayOfObject = mt(Math.max(8, (int) (j * 1.75F)));
        int i;
        this.Z8 = (i = this.Z8) + 1;
        arrayOfObject[i] = paramObject;
    }

    public final void OG0(fQ paramfQ) {
        Object[] arrayOfObject = paramfQ.Uq0;
        int i = paramfQ.Z8;
        tu0(this, 0, i);
    }

    public final void wV(fQ paramfQ, int paramInt1, int paramInt2) {
        if (paramInt1 + paramInt2 <= paramfQ.Z8) {
            tu0(paramfQ.Uq0, paramInt1, paramInt2);
            return;
        }
        throw new IllegalArgumentException("start + count must be <= size: " + paramInt1 + " + " + paramInt2 + " <= " + paramfQ.Z8);
    }

    public final void Nv(Object... paramVarArgs) {
        int i = paramVarArgs.length;
        tu0(paramVarArgs, 0, i);
    }

    public final void tu0(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
        Object[] arrayOfObject = this.Uq0;
        int j;
        if ((j = this.Z8 + paramInt2) > arrayOfObject.length)
            arrayOfObject = mt(Math.max(Math.max(8, j), (int) (this.Z8 * 1.75F)));
        int i = this.Z8;
        System.arraycopy(paramArrayOfObject, paramInt1, arrayOfObject, i, paramInt2);
        this.Z8 = j;
    }

    public void Bz0(int paramInt, Object paramObject) {
        if (paramInt < this.Z8) {
            this.Uq0[paramInt] = paramObject;
            return;
        }
        throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ").append(this.Z8).toString());
    }

    public void Tc(int paramInt, Object paramObject) {
        int i;
        if (paramInt <= (i = this.Z8)) {
            Object[] arrayOfObject;
            if (i == (arrayOfObject = this.Uq0).length) arrayOfObject = mt(Math.max(8, (int) (i * 1.75F)));
            if (this.Ru) {
                i = paramInt + 1;
                int j = this.Z8 - paramInt;
                System.arraycopy(arrayOfObject, paramInt, arrayOfObject, i, j);
            } else {
                i = this.Z8;
                arrayOfObject[i] = arrayOfObject[paramInt];
            }
            this.Z8++;
            arrayOfObject[paramInt] = paramObject;
            return;
        }
        throw new IndexOutOfBoundsException(HB0.DH0("index can't be > size: ", paramInt, " > ").append(this.Z8).toString());
    }

    public final boolean mB(Object paramObject, boolean paramBoolean) {
        Object[] arrayOfObject = this.Uq0;
        int i = this.Z8 - 1;
        if (paramBoolean || paramObject == null) {
            while (i >= 0) {
                if (this[i--] == paramObject) return true;
            }
            return false;
        }
        while (i >= 0) {
            if (paramObject.equals(this[i--])) return true;
        }
        return false;
    }

    public final int JF0(Object paramObject, boolean paramBoolean) { // Byte code:
        /*    */     //   0: iload_2
        /*    */     //   1: aload_0
        /*    */     //   2: getfield Uq0 : [Ljava/lang/Object;
        /*    */     //   5: astore_2
        /*    */     //   6: ifne -> 46
        /*    */     //   9: aload_1
        /*    */     //   10: ifnonnull -> 16
        /*    */     //   13: goto -> 46
        /*    */     //   16: aload_0
        /*    */     //   17: iconst_0
        /*    */     //   18: istore_0
        /*    */     //   19: getfield Z8 : I
        /*    */     //   22: istore_3
        /*    */     //   23: iload_0
        /*    */     //   24: iload_3
        /*    */     //   25: if_icmpge -> 73
        /*    */     //   28: aload_1
        /*    */     //   29: aload_2
        /*    */     //   30: iload_0
        /*    */     //   31: aaload
        /*    */     //   32: invokevirtual equals : (Ljava/lang/Object;)Z
        /*    */     //   35: ifeq -> 40
        /*    */     //   38: iload_0
        /*    */     //   39: ireturn
        /*    */     //   40: iinc #0, 1
        /*    */     //   43: goto -> 23
        /*    */     //   46: aload_0
        /*    */     //   47: iconst_0
        /*    */     //   48: istore_0
        /*    */     //   49: getfield Z8 : I
        /*    */     //   52: istore_3
        /*    */     //   53: iload_0
        /*    */     //   54: iload_3
        /*    */     //   55: if_icmpge -> 73
        /*    */     //   58: aload_2
        /*    */     //   59: iload_0
        /*    */     //   60: aaload
        /*    */     //   61: aload_1
        /*    */     //   62: if_acmpne -> 67
        /*    */     //   65: iload_0
        /*    */     //   66: ireturn
        /*    */     //   67: iinc #0, 1
        /*    */     //   70: goto -> 53
        /*    */     //   73: iconst_m1
        /*  2 */     //   74: ireturn } public boolean Ct(Object paramObject, boolean paramBoolean) { Object[] arrayOfObject = this.Uq0; if (paramBoolean || paramObject == null) { byte b1 = 0; int j = this.Z8; while (b1 < j) { if (arrayOfObject[b1] == paramObject) { Hc(b1); return true; }  b1++; }  return false; }  byte b = 0; int i = this.Z8; while (b < i) { if (paramObject.equals(arrayOfObject[b])) { Hc(b); return true; }  b++; }  return false; } public Object Hc(int paramInt) { int i; if (paramInt < (i = this.Z8)) { Object arrayOfObject[], object = (arrayOfObject = this.Uq0)[paramInt]; int j = i - 1; if (this.Ru) { j = paramInt + 1; int k = j - paramInt; System.arraycopy(arrayOfObject, j, arrayOfObject, paramInt, k); } else { arrayOfObject[paramInt] = arrayOfObject[j]; }  arrayOfObject[this.Z8] = null; return object; }  throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", paramInt, " >= ").append(this.Z8).toString()); } public boolean tF(fQ paramfQ, boolean paramBoolean) { int j; int i = this.Z8; Object[] arrayOfObject = this.Uq0; if (paramBoolean) { byte b = 0; int k = paramfQ.Z8; j = i; while (b < k) { Object object = paramfQ.get(b); for (byte b1 = 0; b1 < j; b1++) { if (object == arrayOfObject[b1]) { Hc(b1); j--; break; }  }  b++; }  } else { byte b = 0; int k = paramfQ.Z8; j = i; while (b < k) { Object object = paramfQ.get(b); for (byte b1 = 0; b1 < j; b1++) { if (object.equals(arrayOfObject[b1])) { Hc(b1); j--; break; }  }  b++; }  }  return (j != i); } public Object pop() { int i; if ((i = this.Z8) != 0) { int j = i - 1; arrayOfObject[j] = null; Object[] arrayOfObject; return (arrayOfObject = this.Uq0)[j]; }  throw new IllegalStateException("Array is empty."); } public final Object peek() { int i; if ((i = this.Z8) != 0) return this.Uq0[i - 1];  throw new IllegalStateException("Array is empty."); } public final Object first() { if (this.Z8 != 0) return this.Uq0[0];  throw new IllegalStateException("Array is empty."); } public final boolean isEmpty() { return (this.Z8 == 0); } public void clear() { Arrays.fill(this.Uq0, 0, this.Z8, (Object)null); this.Z8 = 0; } public final Object[] mt(int paramInt) { int i = Math.min(this.Z8, arrayOfObject1.length); System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, i); this.Uq0 = arrayOfObject1; Object[] arrayOfObject1, arrayOfObject2; return arrayOfObject1 = (Object[])Array.newInstance((arrayOfObject2 = this.Uq0).getClass().getComponentType(), paramInt); } public void sort(Comparator paramComparator) { if (Js0.kL0 == null) Js0.kL0 = new Js0();  Js0 js0 = Js0.kL0; Object[] arrayOfObject = this.Uq0; int i = 0, j = this.Z8; if (this
        /*  3 */       .BK == null)
        /*  4 */
        {
            UI0 uI01;
            this();
            this.BK = uI01;
        }
        UI0 uI0;
        (uI0 = this.BK)
                /*  5 */.sj = 0;
        /*  6 */
        int k = arrayOfObject.length;
        if (j >= 0) {
            if (j <= k) {
                if ((k = j - i) >= 2) if (k < 32) {
                    UI0.BJ(arrayOfObject, i, j, UI0.ve0(i, j, paramComparator, arrayOfObject) + i, paramComparator);
                } else {
                    int i1, i2;
                    for (this.ie0 = arrayOfObject, this.g9 = paramComparator, this.LPT2 = 0, i1 = 0, i2 = k; i2 >= 32; ) {
                        i1 |= i2 & 0x1;
                        i2 >>= 1;
                    }
                    i1 = i2 + i1;
                    do {
                        if ((i2 = UI0.ve0(i, j, paramComparator, arrayOfObject)) < i1) {
                            int i5;
                            if (k <= i1) {
                                i5 = k;
                            } else {
                                i5 = i1;
                            }
                            int i6 = i + i5;
                            i2 = i + i2;
                            UI0.BJ(arrayOfObject, i, i6, i2, paramComparator);
                            i2 = i5;
                        }
                        /*  7 */
                        int[] arrayOfInt = this.Sf0;
                        arrayOfInt[i4] = i;
                        this.EQ[i4] = i2;
                        int i4;
                        this.sj = (i4 = this.sj) + 1;
                        int i3;
                        /*  8 */
                        while ((i3 = this.sj) > 1) {
                            int[] arrayOfInt1;
                            if (((i3 -= 2) >= 1 && (arrayOfInt1 = this.EQ)[i3 - 1] <= arrayOfInt1[i3] + arrayOfInt1[i3 + 1]) || (i3 >= 2 && (arrayOfInt1 = this.EQ)[i3 - 2] <= arrayOfInt1[i3] + arrayOfInt1[i3 - 1])) {
                                if ((arrayOfInt1 = this.EQ)[i3 - 1] < arrayOfInt1[i3 + 1]) i3--;
                            } else if ((arrayOfInt1 = this.EQ)[i3] > arrayOfInt1[i3 + 1]) {
                                break;
                            }
                            jd0(i3);
                        }
                        i += i2;
                    } while ((k -= i2) != 0);
                    int m;
                    /*  9 */
                    while ((m = this.sj) > 1) {
                        int[] arrayOfInt;
                        if ((m -= 2) > 0 && (arrayOfInt = this.EQ)[m - 1] < arrayOfInt[m + 1]) m--;
                        jd0(m);
                    }
                    Object[] arrayOfObject1;
                    int n;
                    for (this
                                 /* 10 */.ie0 = null, this.g9 = null, arrayOfObject1 = this.Jf0, m = 0, n = this.LPT2; m < n; ) {
                        this[m] = null;
                        m++;
                    }
                }
                return;
            }
            /* 11 */
            throw new ArrayIndexOutOfBoundsException(j);
        }
        throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + j + ")");
    }

    /*    */
    /*    */
    /*    */
    public void OU() {
        /*    */
        Object[] arrayOfObject = this.Uq0;
        /*    */
        byte b = 0;
        /*    */
        int i = this.Z8 - 1;
        /*    */
        int j = this.Z8 / 2;
        /*    */
        while (b < j) {
            /*    */
            int k = i - b;
            /*    */
            Object object = this[b];
            /*    */
            this[b] = this[k];
            /*    */
            this[k] = object;
            /*    */
            b++;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final Hc0 r30() {
        /*    */
        if (this.dc == null) {
            /*    */
            cD0 cD01;
            /*    */
            this(this);
            /*    */
            this.dc = cD01;
            /*    */
        }
        /*    */
        return this.dc.aN();
        /*    */
    }

    /*    */
    /*    */
    public void pL0(int paramInt) {
        /*    */
        if (paramInt >= 0) {
            /*    */
            if (this.Z8 <= paramInt)
                /*    */ return;
            /*    */
            for (int i = paramInt; i < this.Z8; ) {
                /*    */
                this.Uq0[i] = null;
                /*    */
                i++;
                /*    */
            }
            /*    */
            this.Z8 = paramInt;
            /*    */
            return;
            /*    */
        }
        /*    */
        throw new IllegalArgumentException(XD0.SD0("newSize must be >= 0: ", paramInt));
        /*    */
    }

    /*    */
    /*    */
    public final Object[] toArray() {
        /*    */
        return Ib(this.Uq0.getClass().getComponentType());
        /*    */
    }

    /*    */
    /*    */
    public final Object[] Ib(Class<?> paramClass) {
        /*    */
        int i = this.Z8;
        /*    */
        System.arraycopy(this.Uq0, 0, arrayOfObject, 0, i);
        /*    */
        Object[] arrayOfObject;
        /*    */
        return arrayOfObject = (Object[]) Array.newInstance(paramClass, this.Z8);
        /*    */
    }

    /*    */
    /*    */
    public final int hashCode() {
        /*    */
        if (!this.Ru)
            /*    */ return super.hashCode();
        /*    */
        Object[] arrayOfObject = this.Uq0;
        /*    */
        int i = 1;
        /*    */
        byte b = 0;
        /*    */
        int j = this.Z8;
        /*    */
        while (b < j) {
            /*    */
            i *= 31;
            /*    */
            Object object;
            /*    */
            if ((object = this[b]) != null)
                /*    */ i = object.hashCode() + i;
            /*    */
            b++;
            /*    */
        }
        /*    */
        return i;
        /*    */
    }

    /*    */
    /*    */
    public final boolean equals(Object paramObject) {
        /*    */
        if (paramObject == this)
            /*    */ return true;
        /*    */
        if (!this.Ru)
            /*    */ return false;
        /*    */
        if (!(paramObject instanceof fQ))
            /*    */ return false;
        /*    */
        if (!((fQ) (paramObject = paramObject)).Ru)
            /*    */ return false;
        /*    */
        int i;
        /*    */
        if ((i = this.Z8) != ((fQ) paramObject).Z8)
            /*    */ return false;
        /*    */
        Object[] arrayOfObject = this.Uq0;
        /*    */
        paramObject = ((fQ) paramObject).Uq0;
        /*    */
        byte b = 0;
        /*    */
        while (b < i) {
            /*    */
            Object object2 = paramObject[b];
            /*    */
            Object object1;
            /*    */
            if (((object1 = this[b]) == null) ? (object2 == null) : object1.equals(object2)) {
                /*    */
                b++;
                /*    */
                continue;
                /*    */
            }
            /*    */
            return false;
            /*    */
        }
        /*    */
        return true;
        /*    */
    }

    /*    */
    /*    */
    public final String toString() {
        /*    */
        if (this.Z8 == 0)
            /*    */ return "[]";
        /*    */
        Object[] arrayOfObject = this.Uq0;
        /*    */
        this(32);
        /*    */
        ag.yd0('[');
        /*    */
        Ag ag;
        /*    */
        (ag = new Ag()).Nn(arrayOfObject[0]);
        /*    */
        for (byte b = 1; b < this.Z8; ) {
            /*    */
            ag.V9(", ");
            /*    */
            ag.Nn(arrayOfObject[b]);
            /*    */
            b++;
            /*    */
        }
        /*    */
        ag.yd0(']');
        /*    */
        return ag.toString();
        /*    */
    }

    /*    */
    /*    */
    public void il(int paramInt) {
        /*    */
        byte b = 0;
        /*    */
        int i;
        /*    */
        if (paramInt < (i = this.Z8)) {
            /*    */
            if (paramInt >= 0) {
                /*    */
                Object[] arrayOfObject = this.Uq0;
                /*    */
                int j, k = i - (j = paramInt - b + 1);
                /*    */
                if (this.Ru) {
                    /*    */
                    j = i - (paramInt = j + b);
                    /*    */
                    System.arraycopy(arrayOfObject, paramInt, arrayOfObject, b, j);
                    /*    */
                } else {
                    /*    */
                    j = i - (paramInt = Math.max(k, paramInt + 1));
                    /*    */
                    System.arraycopy(arrayOfObject, paramInt, arrayOfObject, b, j);
                    /*    */
                }
                /*    */
                for (paramInt = k; paramInt < i; ) {
                    /*    */
                    arrayOfObject[paramInt] = null;
                    /*    */
                    paramInt++;
                    /*    */
                }
                /*    */
                this.Z8 = k;
                /*    */
                return;
                /*    */
            }
            /*    */
            throw new IndexOutOfBoundsException(RH0.KK("start can't be > end: ", b, " > ", paramInt));
            /*    */
        }
        /*    */
        throw new IndexOutOfBoundsException(HB0.DH0("end can't be >= size: ", paramInt, " >= ").append(this.Z8).toString());
        /*    */
    }

    /*    */
    /*    */
    public final void ZY(int paramInt) {
        /*    */
        if (paramInt >= 0) {
            /*    */
            if ((paramInt = this.Z8 + paramInt) > this.Uq0.length)
                /*    */ mt(Math.max(Math.max(8, paramInt), (int) (this.Z8 * 1.75F)));
            /*    */
            return;
            /*    */
        }
        /*    */
        throw new IllegalArgumentException(XD0.SD0("additionalCapacity must be >= 0: ", paramInt));
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fQ.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */