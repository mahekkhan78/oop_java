public class PracticalNo3
 {

    // Method to calculate the volume of a cube
    public double calculateVolume(Double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    // Method to calculate the volume of a cylinder
    public Double calculateVolume(Double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the volume of a box
    public Double calculateVolume(Double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Example usage
        Double cubeVolume = calculator.calculateVolume(4.0);
        Double cylinderVolume = calculator.calculateVolume(3.0, 4.0);
        Double boxVolume = calculator.calculateVolume(3.5, 3.0, 4.0);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Box: " + boxVolume);
    }
}


