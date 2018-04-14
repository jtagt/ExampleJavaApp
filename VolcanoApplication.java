class VolcanoApplication {
    public static void main(String[] arguments) {
        VolcanoRobot lemon = new VolcanoRobot();
                lemon.status = "exploring the world.";
                lemon.speed = 2;
                lemon.temperature = 510;

                lemon.showAttributes();
                System.out.println("Increasing speed to 3.");
                lemon.speed = 3;
                lemon.showAttributes();
                System.out.println("Raising temperature to 670.");
                lemon.temperature = 670;
                lemon.showAttributes();
                System.out.println("Checking the temperature.");
                lemon.checkTemperature();
                lemon.showAttributes();
    }
} 