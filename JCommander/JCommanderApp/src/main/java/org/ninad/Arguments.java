package org.ninad;

import com.beust.jcommander.Parameter;

public class Arguments {
    @Parameter(names = "-help", help = true)
    public boolean help;

    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    public Integer verbose = 1;

    @Parameter(names = "-name", description = "name of instance")
    public String name;

    @Parameter(names = "-debug", description = "Debug mode")
    public boolean debug = false;

    @Parameter(names = "-profile", description = "Profile Environment")
    public String profile;

}