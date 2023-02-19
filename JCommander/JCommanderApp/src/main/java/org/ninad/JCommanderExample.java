package org.ninad;

import com.beust.jcommander.JCommander;

public class JCommanderExample
{
    public static void main( String[] args)
    {

        Arguments arguments = new Arguments();
        JCommander jc = new JCommander(arguments);

        try {
            jc.parse(args);

        } catch (Exception e) {
            jc.usage();
        }
        System.out.println("Hello World!");
        if (arguments.help) {
            jc.usage();
            System.exit(0);
        }
        System.out.format("The value of name is: %s%n", arguments.name);
        System.out.format("The value of verbose is: %d%n", arguments.verbose);
        System.out.format("The value of debug is: %b%n", arguments.debug);
        System.out.format("The value of profile is: %s%n", arguments.profile);
    }
}
