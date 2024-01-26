/*  1 */ package f;public final class A4 extends UA { public final void Vt(String[] paramArrayOfString) { String str = ">setconfig <CONFIG_NAME> [value]"; if (paramArrayOfString.length < 2) { int j; byte b1; for (j = (arrayOfField = Bz.class.getDeclaredFields()).length, b1 = 0; b1 < j; ) { Field field; if ((field = arrayOfField[b1]).isAnnotationPresent((Class)mB0.class) && !Modifier.isFinal(field.getModifiers())) { mB0 mB0 = field.<mB0>getAnnotation(mB0.class); cOM9.kG(field.getType(), mB0.propertyTransformer()); boolean bool = field.isAccessible(); field.setAccessible(true); try { String str1 = "blue"; mk.vx
/*  2 */               .r10("∙ " + field.getName() + " = " + field.get(new Object()), str1); } catch (Exception exception)
/*    */           
/*    */           { 
/*  5 */             mk.vx
/*  6 */               .r10(B40.df("Error: ").append(exception.getMessage()).toString(), "red"); }  field
/*  7 */             .setAccessible(bool); }  b1++; }  UA.Ue(this); return; }  Field field1 = arrayOfField[1], field2 = null; if (arrayOfField.length > 2) field2 = arrayOfField[2];  Field[] arrayOfField; int i; byte b; for (i = (arrayOfField = Bz.class.getDeclaredFields()).length, b = 0; b < i; ) { boolean bool; Field field; if ((field = arrayOfField[b]).isAnnotationPresent((Class)mB0.class) && !Modifier.isFinal(field.getModifiers()) && field.getName().equals(this)) { mB0 mB0 = field.<mB0>getAnnotation(mB0.class); D3 d3 = cOM9.kG(field.getType(), mB0.propertyTransformer()); bool = field.isAccessible(); field.setAccessible(true); if (field2 == null) { try { String str1 = "blue";
/*  8 */             mk.vx
/*  9 */               .r10(this + " = " + field.get(new Object()), str1);
/*    */             
/*    */             return; }
/* 12 */           catch (Exception exception)
/*    */           
/* 14 */           { mk.vx
/* 15 */               .r10("Error changing field " + this + " to value " + field2, "red");
/* 16 */             UA.Ue("Error: " + exception.getMessage()); }  } else { String str1 = exception.min(), str2 = exception.max(); Object object = d3.xr((String)field2, field, str1, str2); field.set(null, object); object = "green"; mk.vx.r10("Changed field " + this + " to value " + object, (String)object); }  field.setAccessible(bool); return; }  bool++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public A4() {
/*    */     super("setconfig");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */