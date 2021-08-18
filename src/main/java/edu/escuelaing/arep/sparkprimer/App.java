package edu.escuelaing.arep.sparkprimer;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       get("/hello", (req, res) -> "Hello World");
    }
}
