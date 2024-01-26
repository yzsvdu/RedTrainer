/* 1 */ package f;public final class xg implements Iterable { public final ArrayList com9; public final String toString() { try { synchronized ((new StringWriter()).getBuffer()) { /* monitor exit ThisExpression{ObjectType{java/lang/StringBuffer}} */ return UD(new StringWriter(), 0).toString(); }  } catch (Exception exception) { return null; }  } public final Iterator iterator() { return this.com9.iterator(); } public final xg iF0(Object paramObject) { Sl0.Hg0(paramObject); this.com9.add(paramObject); return this; } public final Writer UD(StringWriter paramStringWriter, int paramInt) { int i = 0; boolean bool = false; try { paramStringWriter
/* 2 */         .write(91); int j; if ((j = this.com9.size()) == 1) { try { Sl0.IJ(paramStringWriter, this.com9.get(0), paramInt); } catch (Exception exception) { throw new m8("Unable to write JSONArray value at index: 0", this); }  } else if (j != 0) { byte b; for (i = paramInt + i, b = 0; b < j; ) { if (bool) paramStringWriter.write(44);  Sl0.av0(paramStringWriter, i); try { Sl0.IJ(paramStringWriter, ((xg)super).com9.get(b), i); bool = true; b++; } catch (Exception exception1) { throw new m8("Unable to write JSONArray value at index: " + b, this); }  }  Sl0.av0(paramStringWriter, paramInt); }  paramStringWriter.write(93); return paramStringWriter; } catch (IOException iOException) { throw new m8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public xg() {
/*   */     ArrayList arrayList;
/*   */     this();
/*   */     this.com9 = this;
/*   */   }
/*   */   
/*   */   public xg(Collection paramCollection) {
/*   */     ArrayList arrayList;
/*   */     if (paramCollection == null) {
/*   */       this();
/*   */       this.com9 = this;
/*   */     } else {
/*   */       ((xg)super).com9 = new ArrayList(paramCollection.size());
/*   */       for (Object object : paramCollection)
/*   */         ((xg)super).com9.add(Sl0.bA(object)); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public xg(Object paramObject) {
/*   */     this();
/*   */     if (paramObject.getClass().isArray()) {
/*   */       int i = Array.getLength(paramObject);
/*   */       this.com9.ensureCapacity(i);
/*   */       for (byte b = 0; b < i; b++)
/*   */         iF0(Sl0.bA(Array.get(paramObject, b))); 
/*   */       return;
/*   */     } 
/*   */     throw new m8("JSONArray initial value should be a string or collection or array.");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */