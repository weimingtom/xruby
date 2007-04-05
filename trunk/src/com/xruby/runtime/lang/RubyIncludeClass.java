package com.xruby.runtime.lang;

public class RubyIncludeClass extends RubyClass {
    private RubyModule module;

    public RubyIncludeClass(RubyModule module, RubyClass superclass) {
        super(null, superclass, null);
        if (module instanceof RubyIncludeClass) {
            module = ((RubyIncludeClass)module).module;
        }
        this.module = module;
        this.methods_ = module.methods_;
        this.constants_ = module.constants_;
        this.class_varibles_ = module.class_varibles_;
    }

    public boolean isRealClass() {
        return false;
    }

    public RubyModule getIncludedModule() {
        return this.module;
    }
}
