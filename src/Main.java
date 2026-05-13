public class Main {
    public static void main(String[] args) {
        Graph small = Experiment.createGraph(10);
        Experiment.runTraversals(small, "Small (10 vertices)");

        Graph medium = Experiment.createGraph(30);
        Experiment.runTraversals(medium, "Medium (30 vertices)");

        Graph large = Experiment.createGraph(100);
        Experiment.runTraversals(large, "Large (100 vertices)");
    }
}