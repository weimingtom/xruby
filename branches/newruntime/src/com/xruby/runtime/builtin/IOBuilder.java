package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class IOBuilder implements ExtensionBuilder {
	private RubyClass ioError;
	private RubyClass eofError;
	private RubyClass ioClass;	
	
	public RubyClass getEofError() {
		return eofError;
	}

	public RubyClass getIoClass() {
		return ioClass;
	}

	public RubyClass getIoError() {
		return ioError;
	}

	public void initialize() {
		this.ioError = RubyUtil.defineClass("IOError", RubyRuntime.standardError);
		this.eofError = RubyUtil.defineClass("EOFError", this.ioError);		
	    
		this.ioClass = RubyUtil.defineClass("IO", RubyRuntime.objectClass);
		this.ioClass.includeModule(RubyRuntime.enumerableModule);
		this.ioClass.defineAllocMethod(IOMethod.alloc);
		
		/*
    rb_define_singleton_method(rb_cIO, "new", rb_io_s_new, -1);
    rb_define_singleton_method(rb_cIO, "open",  rb_io_s_open, -1);
    rb_define_singleton_method(rb_cIO, "sysopen",  rb_io_s_sysopen, -1);
    rb_define_singleton_method(rb_cIO, "for_fd", rb_io_s_for_fd, -1);
    rb_define_singleton_method(rb_cIO, "popen", rb_io_s_popen, -1);
    rb_define_singleton_method(rb_cIO, "foreach", rb_io_s_foreach, -1);
    rb_define_singleton_method(rb_cIO, "readlines", rb_io_s_readlines, -1);
    rb_define_singleton_method(rb_cIO, "read", rb_io_s_read, -1);
    rb_define_singleton_method(rb_cIO, "select", rb_f_select, -1);
    rb_define_singleton_method(rb_cIO, "pipe", rb_io_s_pipe, 0);

    rb_define_method(rb_cIO, "initialize", rb_io_initialize, -1);
    
    rb_define_method(rb_cIO, "initialize", rb_io_initialize, -1);

    rb_output_fs = Qnil;
    rb_define_hooked_variable("$,", &rb_output_fs, 0, rb_str_setter);

    rb_global_variable(&rb_default_rs);
    rb_rs = rb_default_rs = rb_str_new2("\n");
    rb_output_rs = Qnil;
    OBJ_FREEZE(rb_default_rs);	// avoid modifying RS_default
    rb_define_hooked_variable("$/", &rb_rs, 0, rb_str_setter);
    rb_define_hooked_variable("$-0", &rb_rs, 0, rb_str_setter);
    rb_define_hooked_variable("$\\", &rb_output_rs, 0, rb_str_setter);

    rb_define_hooked_variable("$.", &lineno, 0, lineno_setter);
    rb_define_virtual_variable("$_", rb_lastline_get, rb_lastline_set);

    rb_define_method(rb_cIO, "initialize_copy", rb_io_init_copy, 1);
    rb_define_method(rb_cIO, "reopen", rb_io_reopen, -1);

    rb_define_method(rb_cIO, "print", rb_io_print, -1);
    rb_define_method(rb_cIO, "putc", rb_io_putc, 1);
    rb_define_method(rb_cIO, "puts", rb_io_puts, -1);
    rb_define_method(rb_cIO, "printf", rb_io_printf, -1);

    rb_define_method(rb_cIO, "each",  rb_io_each_line, -1);
    rb_define_method(rb_cIO, "each_line",  rb_io_each_line, -1);
    rb_define_method(rb_cIO, "each_byte",  rb_io_each_byte, 0);

    rb_define_method(rb_cIO, "syswrite", rb_io_syswrite, 1);
    rb_define_method(rb_cIO, "sysread",  rb_io_sysread, -1);
*/
		this.ioClass.defineMethod("fileno", IOMethod.fileno, 0);
		this.ioClass.aliasMethod("to_i", "fileno");
		this.ioClass.defineMethod("to_io", IOMethod.toIO, 0);
		/*
    rb_define_method(rb_cIO, "fsync",   rb_io_fsync, 0);
    rb_define_method(rb_cIO, "sync",   rb_io_sync, 0);
    rb_define_method(rb_cIO, "sync=",  rb_io_set_sync, 1);

    rb_define_method(rb_cIO, "lineno",   rb_io_lineno, 0);
    rb_define_method(rb_cIO, "lineno=",  rb_io_set_lineno, 1);

    rb_define_method(rb_cIO, "readlines",  rb_io_readlines, -1);

    rb_define_method(rb_cIO, "read_nonblock",  io_read_nonblock, -1);
    rb_define_method(rb_cIO, "write_nonblock", rb_io_write_nonblock, 1);
    rb_define_method(rb_cIO, "readpartial",  io_readpartial, -1);
    rb_define_method(rb_cIO, "read",  io_read, -1);
    */
		this.ioClass.defineMethod("write", IOMethod.write, 1);
		
		/*

    rb_define_method(rb_cIO, "gets",  rb_io_gets_m, -1);
    rb_define_method(rb_cIO, "readline",  rb_io_readline, -1);
    rb_define_method(rb_cIO, "getc",  rb_io_getc, 0);
    rb_define_method(rb_cIO, "readchar",  rb_io_readchar, 0);
    rb_define_method(rb_cIO, "ungetc",rb_io_ungetc, 1);
    rb_define_method(rb_cIO, "<<",    rb_io_addstr, 1);
    rb_define_method(rb_cIO, "flush", rb_io_flush, 0);
    rb_define_method(rb_cIO, "tell", rb_io_tell, 0);
    rb_define_method(rb_cIO, "seek", rb_io_seek_m, -1);
    rb_define_const(rb_cIO, "SEEK_SET", INT2FIX(SEEK_SET));
    rb_define_const(rb_cIO, "SEEK_CUR", INT2FIX(SEEK_CUR));
    rb_define_const(rb_cIO, "SEEK_END", INT2FIX(SEEK_END));
    rb_define_method(rb_cIO, "rewind", rb_io_rewind, 0);
    rb_define_method(rb_cIO, "pos", rb_io_tell, 0);
    rb_define_method(rb_cIO, "pos=", rb_io_set_pos, 1);
    rb_define_method(rb_cIO, "eof", rb_io_eof, 0);
    rb_define_method(rb_cIO, "eof?", rb_io_eof, 0);

    rb_define_method(rb_cIO, "close", rb_io_close_m, 0);
    rb_define_method(rb_cIO, "closed?", rb_io_closed, 0);
    rb_define_method(rb_cIO, "close_read", rb_io_close_read, 0);
    rb_define_method(rb_cIO, "close_write", rb_io_close_write, 0);

    rb_define_method(rb_cIO, "isatty", rb_io_isatty, 0);
    rb_define_method(rb_cIO, "tty?", rb_io_isatty, 0);
    rb_define_method(rb_cIO, "binmode",  rb_io_binmode, 0);
    rb_define_method(rb_cIO, "sysseek", rb_io_sysseek, -1);

    rb_define_method(rb_cIO, "ioctl", rb_io_ioctl, -1);
    rb_define_method(rb_cIO, "fcntl", rb_io_fcntl, -1);
    rb_define_method(rb_cIO, "pid", rb_io_pid, 0);
    rb_define_method(rb_cIO, "inspect",  rb_io_inspect, 0);

    rb_define_variable("$stdin", &rb_stdin);
    rb_stdin = prep_stdio(stdin, FMODE_READABLE, rb_cIO);
    rb_define_hooked_variable("$stdout", &rb_stdout, 0, stdout_setter);
    rb_stdout = prep_stdio(stdout, FMODE_WRITABLE, rb_cIO);
    rb_define_hooked_variable("$stderr", &rb_stderr, 0, stdout_setter);
    rb_stderr = prep_stdio(stderr, FMODE_WRITABLE, rb_cIO);
    rb_define_hooked_variable("$>", &rb_stdout, 0, stdout_setter);
    orig_stdout = rb_stdout;
    rb_deferr = orig_stderr = rb_stderr;

    // variables to be removed in 1.8.1
    rb_define_hooked_variable("$defout", &rb_stdout, 0, defout_setter);
    rb_define_hooked_variable("$deferr", &rb_stderr, 0, deferr_setter);

    // constants to hold original stdin/stdout/stderr 
    rb_define_global_const("STDIN", rb_stdin);
    rb_define_global_const("STDOUT", rb_stdout);
    rb_define_global_const("STDERR", rb_stderr);

    rb_define_readonly_variable("$<", &argf);
    argf = rb_obj_alloc(rb_cObject);
    rb_extend_object(argf, rb_mEnumerable);
    rb_define_global_const("ARGF", argf);

    rb_define_singleton_method(argf, "to_s", argf_to_s, 0);

    rb_define_singleton_method(argf, "fileno", argf_fileno, 0);
    rb_define_singleton_method(argf, "to_i", argf_fileno, 0);
    rb_define_singleton_method(argf, "to_io", argf_to_io, 0);
    rb_define_singleton_method(argf, "each",  argf_each_line, -1);
    rb_define_singleton_method(argf, "each_line",  argf_each_line, -1);
    rb_define_singleton_method(argf, "each_byte",  argf_each_byte, 0);

    rb_define_singleton_method(argf, "read",  argf_read, -1);
    rb_define_singleton_method(argf, "readlines", rb_f_readlines, -1);
    rb_define_singleton_method(argf, "to_a", rb_f_readlines, -1);
    rb_define_singleton_method(argf, "gets", rb_f_gets, -1);
    rb_define_singleton_method(argf, "readline", rb_f_readline, -1);
    rb_define_singleton_method(argf, "getc", argf_getc, 0);
    rb_define_singleton_method(argf, "readchar", argf_readchar, 0);
    rb_define_singleton_method(argf, "tell", argf_tell, 0);
    rb_define_singleton_method(argf, "seek", argf_seek_m, -1);
    rb_define_singleton_method(argf, "rewind", argf_rewind, 0);
    rb_define_singleton_method(argf, "pos", argf_tell, 0);
    rb_define_singleton_method(argf, "pos=", argf_set_pos, 1);
    rb_define_singleton_method(argf, "eof", argf_eof, 0);
    rb_define_singleton_method(argf, "eof?", argf_eof, 0);
    rb_define_singleton_method(argf, "binmode", argf_binmode, 0);

    rb_define_singleton_method(argf, "filename", argf_filename, 0);
    rb_define_singleton_method(argf, "path", argf_filename, 0);
    rb_define_singleton_method(argf, "file", argf_file, 0);
    rb_define_singleton_method(argf, "skip", argf_skip, 0);
    rb_define_singleton_method(argf, "close", argf_close_m, 0);
    rb_define_singleton_method(argf, "closed?", argf_closed, 0);

    rb_define_singleton_method(argf, "lineno",   argf_lineno, 0);
    rb_define_singleton_method(argf, "lineno=",  argf_set_lineno, 1);

    rb_global_variable(&current_file);
    rb_define_readonly_variable("$FILENAME", &filename);
    filename = rb_str_new2("-");

    rb_define_virtual_variable("$-i", opt_i_get, opt_i_set);

#if defined (_WIN32) || defined(DJGPP) || defined(__CYGWIN__) || defined(__human68k__)
    atexit(pipe_atexit);
#endif

    Init_File();

    rb_define_method(rb_cFile, "initialize",  rb_file_initialize, -1);

    rb_file_const("RDONLY", INT2FIX(O_RDONLY));
    rb_file_const("WRONLY", INT2FIX(O_WRONLY));
    rb_file_const("RDWR", INT2FIX(O_RDWR));
    rb_file_const("APPEND", INT2FIX(O_APPEND));
    rb_file_const("CREAT", INT2FIX(O_CREAT));
    rb_file_const("EXCL", INT2FIX(O_EXCL));
#if defined(O_NDELAY) || defined(O_NONBLOCK)
#   ifdef O_NONBLOCK
    rb_file_const("NONBLOCK", INT2FIX(O_NONBLOCK));
#   else
    rb_file_const("NONBLOCK", INT2FIX(O_NDELAY));
#   endif
#endif
    rb_file_const("TRUNC", INT2FIX(O_TRUNC));
#ifdef O_NOCTTY
    rb_file_const("NOCTTY", INT2FIX(O_NOCTTY));
#endif
#ifdef O_BINARY
    rb_file_const("BINARY", INT2FIX(O_BINARY));
#endif
#ifdef O_SYNC
    rb_file_const("SYNC", INT2FIX(O_SYNC));
#endif
		 */
	}
}

class IOMethod {
	public static RubyMethod alloc = new RubyNoArgMethod() {		
		protected RubyValue run(RubyValue receiver) {
			return new RubyFile();
		}		
	};
	
	public static RubyMethod fileno = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return RubyFixnum.int2Fix(((RubyIO)receiver).getFileno());
		}
	};
	
	public static RubyMethod toIO = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return receiver;
		}
	};
	
	public static RubyMethod write = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyIO io = (RubyIO)receiver;
			int n = io.write(arg);
			return RubyFixnum.int2Fix(n);
		}		
	};
}
