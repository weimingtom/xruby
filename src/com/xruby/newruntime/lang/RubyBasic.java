package com.xruby.newruntime.lang;

public class RubyBasic extends RubyValue {
	private RubyClass klass;
    private long flags;
    
    public void setRubyClass(RubyClass klass) {
    	this.klass = klass;
    }
    
    public RubyClass getRubyClass() {
    	return this.klass;
    }
    
    public long getFlags() {
    	return this.flags;
    }
    
    // FIXME: Able Test
    public void setSingleton() {
    	this.flags |= RubyFlag.FL_SINGLETON.getMask();
    }
    
    public boolean isSingleton() {
    	return (this.flags & RubyFlag.FL_SINGLETON.getMask()) != 0; 
    }
}
