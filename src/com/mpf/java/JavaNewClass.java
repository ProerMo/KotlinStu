package com.mpf.java;

import com.mpf.kotlin.KotlinClass;
import org.jetbrains.annotations.NotNull;

public class JavaNewClass extends KotlinClass {
    public String getString() {
        getLongerStringStatic("oiii", "");
        return this.getLongerString("iiiii", "[[[[[[");
    }

    @NotNull
    @Override
    public String getLongerString(@NotNull String string, @NotNull String string1) {
        return super.getLongerString(string, string1);
    }
    //    @Override

}
