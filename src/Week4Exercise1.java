public class Week4Exercise1 {
    private static int numInstances = 0;
    //Starts at numInstances = 0, this gets referenced back to to add instances
    protected static int getCount() {
        return numInstances;
        // This states how many instances have been made by referencing back to numInstances
    }
    private static void addInstance() {
        numInstances++;
    }
    // This line of code adds 1 instance to the method numInstances
    Week4Exercise1() {
        Week4Exercise1.addInstance();
    }
    /*This method declaration starts at the top and references the method addInstance
    which adds 1 instance to the method numInstances which is keeping track of the
    total number of instances
     */
    public static void main(String[] args){
        System.out.println("Starting with " + Week4Exercise1.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {
            new Week4Exercise1();
        }
        System.out.println("Created " + Week4Exercise1.getCount() + " instances");
        /* This loops the code between 1 and 500 instances until it reaches 500 adding
        1 instance every loop. The code >new Week4Exercise1() starts the loop from the top
         */
    }
}
