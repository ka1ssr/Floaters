/*
 * Simple demonstration project to show how to define variables and use git
 */
package floaters;

/**
 *
 * @author ka1ssr
 */
public class Floaters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float pi = 3.14159F;
        float radius = 3.0F;
        float diameter = 0.0F;
        
        diameter = 2 * pi * (radius * radius);
        System.out.println("Diameter="+diameter);
        
    }
    
}
