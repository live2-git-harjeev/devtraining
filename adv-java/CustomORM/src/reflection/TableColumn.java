package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//RetentionPolicy.CLASS : Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time. This is the default behavior.
//RetentionPolicy.SOURCE : Annotations are to be discarded by the compiler.
//RetentionPolicy.RUNTIME : Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.
@Retention(RetentionPolicy.RUNTIME)
public @interface TableColumn {
    public String columnName();
}
