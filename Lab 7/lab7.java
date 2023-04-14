import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab7 {

    public static void main(String[] args) {
        double[][] data = readDataFromFile("Iris.csv");

        double[] sepalLength = getColumn(data, 1);
        double[] sepalWidth = getColumn(data, 2);
        double[] petalLength = getColumn(data, 3);
        double[] petalWidth = getColumn(data, 4);

        System.out.println("Overall Summary Statistics:");
        printSummaryStatistics(sepalLength, "SepalLengthCm");
        printSummaryStatistics(sepalWidth, "SepalWidthCm");
        printSummaryStatistics(petalLength, "PetalLengthCm");
        printSummaryStatistics(petalWidth, "PetalWidthCm");

        double[][] setosaData = filterBySpecies(data, "Iris-setosa");
        double[][] versicolorData = filterBySpecies(data, "Iris-versicolor");
        double[][] virginicaData = filterBySpecies(data, "Iris-virginica");

        System.out.println("\nSummary Statistics by Species:");
        printSpeciesSummaryStatistics(setosaData, "Iris-setosa");
        printSpeciesSummaryStatistics(versicolorData, "Iris-versicolor");
        printSpeciesSummaryStatistics(virginicaData, "Iris-virginica");
    }

    private static double[][] filterBySpecies(double[][] data, String string) {
        return null;
    }

    private static double[][] readDataFromFile(String fileName) {
        File file = new File(fileName);
        double[][] data = new double[150][4];

        try {
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < 150; i++) {
                String[] line = scanner.nextLine().split(",");
                for (int j = 0; j < 5; j++) {
                    data[i][j] = Double.parseDouble(line[j]);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return data;
    }

    private static double[] getColumn(double[][] data, int columnIndex) {
        double[] column = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            column[i] = data[i][columnIndex];
        }
        return column;
    }

    private static void printSummaryStatistics(double[] data, String attributeName) {
        System.out.println(attributeName + " - Mean: " + mean(data) );
    }

    private static void printSpeciesSummaryStatistics(double[][] data, String species) {
        double[] sepalLength = getColumn(data, 0);
        double[] sepalWidth = getColumn(data, 1);
        double[] petalLength = getColumn(data, 2);
        double[] petalWidth = getColumn(data, 3);

        System.out.println(species + ":");
        printSummaryStatistics(sepalLength, "SepalLengthCm");
        printSummaryStatistics(sepalWidth, "SepalWidthCm");
        printSummaryStatistics(petalLength, "PetalLengthCm");
        printSummaryStatistics(petalWidth, "PetalWidthCm");
    }

    private static double mean(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }
}
    
       
