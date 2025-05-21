import java.util.Scanner;

class PlanetWeight {
    public static final double G=6.67430e-11;

    enum Planet{
        MERCURY(3.303e23, 2.4397e6),
        VENUS(4.869e24,6.0518e6),
        EARTH(5.976e24,6.37814e6),
        MARS(6.421e23,3.3972e6),
        JUPITER(1.9e27,7.1492e7),
        SATURN(5.688e26,6.0268e7),
        URANUS(8.686e25,2.5559e7),
        NEPTUNE(1.024e26,2.4746e7);

        double mass;
        double radius;

        Planet(double mass, double radius){
            this.mass=mass;
            this.radius=radius;
        }

        public double calculateGravity(){
            return G*mass/(radius*radius);
        }
    }
    double mass,weight;

    public PlanetWeight(Scanner sc) {
        System.out.print("\nEnter your mass(in g): ");
        mass=sc.nextDouble();
        weight=0.0d;
    }
    public void calculateWeight(Scanner sc)
    {
        System.out.println("\nSelect a planet: ");
        for(Planet p: Planet.values())                                                                                                                                                                  
            System.out.println("- "+p.name());
        System.out.print("\nEnter planet name: ");
        sc.nextLine();
        String planet=sc.nextLine().toUpperCase(); 
        try {
            Planet chosenPlannet = Planet.valueOf(planet);
            weight=mass * chosenPlannet.calculateGravity();
            System.out.println("Weight on '"+chosenPlannet.name()+"' is: "+weight+" grams");
        } catch (Exception e) {
            System.out.println("Invalid planet name");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        PlanetWeight ob = new PlanetWeight(sc);
        ob.calculateWeight(sc);
    }    
}
