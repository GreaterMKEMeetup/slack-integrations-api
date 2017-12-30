package org.gmjm.slack.api.file;

public enum FileType {

	AUTO("auto","Auto Detect Type"),
	TEXT("text", "Plain Text"),
	APPLESCRIPT("applescript","AppleScript"),
	BOXNOTE("boxnote","BoxNote"),
	C("c","C"),
	CSHARP("csharp","C#"),
	CPP("cpp","C++"),
	CSS("css","CSS"),
	CSV("csv","CSV"),
	CLOJURE("clojure","Clojure"),
	COFFEESCRIPT("coffeescript","CoffeeScript"),
	CFM("cfm","ColdFusion"),
	D("d","D"),
	DART("dart","Dart"),
	DIFF("diff","Diff"),
	DOCKERFILE("dockerfile","Docker"),
	ERLANG("erlang","Erlang"),
	FSHARP("fsharp","F#"),
	FORTRAN("fortran","Fortran"),
	GO("go","Go"),
	GROOVY("groovy","Groovy"),
	HTML("html","HTML"),
	HANDLEBARS("handlebars","Handlebars"),
	HASKELL("haskell","Haskell"),
	HAXE("haxe","Haxe"),
	JAVA("java","Java"),
	JAVASCXRIPT("javascript","JavaScript/JSON"),
	KOTLIN("kotlin","Kotlin"),
	LATEXT("latex","LaTeX/sTeX"),
	LISP("lisp","Lisp"),
	LUA("lua","Lua"),
	MARKDOWN("markdown","Markdown (raw)"),
	MATLAB("matlab","MATLAB"),
	MUMPS("mumps","MUMPS"),
	OCAML("ocaml","OCaml"),
	OBJC("objc","Objective-C"),
	PHP("php","PHP"),
	PASCAL("pascal","Pascal"),
	PERL("perl","Perl"),
	PIG("pig","Pig"),
	POST("post","Slack Post"),
	POWERSHELL("powershell","PowerShell"),
	PUPPET("puppet","Puppet"),
	PYTHON("python","Python"),
	R("r","R"),
	RUBY("ruby","Ruby"),
	RUST("rust","Rust"),
	SQL("sql","SQL"),
	SASS("sass","Sass"),
	SCALA("scala","Scala"),
	SCHEME("scheme","Scheme"),
	SHELL("shell","Shell"),
	SMALLTALK("smalltalk","Smalltalk"),
	SWIFT("swift","Swift"),
	TSV("tsv","TSV"),
	VB("vb","VB.NET"),
	VBSCRIPT("vbscript","VBScript"),
	VELOCITY("velocity","Velocity"),
	VERILOG("verilog","Verilog"),
	XML("xml","XML"),
	YAML("yaml","YAML");

	public final String type;
	public final String description;

	FileType(String type, String description) {
		this.type = type;
		this.description = description;
	}
}
