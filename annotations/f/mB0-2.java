package f;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface mB0 {
  String key();
  
  Class propertyTransformer() default D3.class;
  
  String defaultValue() default "DO_NOT_OVERWRITE_INITIALIZATION_VALUE";
  
  String min() default "";
  
  String max() default "";
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */