public class Main {
    public static void main(String[] args) {
        final CoordinateManager manager = new CoordinateManager();
        ThreeDimensionalCoordinate one= new ThreeDimensionalCoordinate(1,2,3);
        ThreeDimensionalCoordinate two= new ThreeDimensionalCoordinate(2,3,3);
        ThreeDimensionalCoordinate three= new ThreeDimensionalCoordinate(5,4,7);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        System.out.println(manager.getThreeCoordinates());
        System.out.println(manager.cloner(manager.getThreeCoordinates()));
    }
}
