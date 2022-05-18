import java.util.LinkedList;

public class CoordinateManager {
    private final LinkedList<ThreeDimensionalCoordinate> threeCoordinates=new LinkedList<>();
    public void add(ThreeDimensionalCoordinate threeDimensionalCoordinate){
        threeCoordinates.add(threeDimensionalCoordinate);
    }
    public LinkedList<ThreeDimensionalCoordinate> cloner(LinkedList<ThreeDimensionalCoordinate> list){
        LinkedList<ThreeDimensionalCoordinate> temp=new LinkedList<>(list);
        return temp;
    }

    public LinkedList<ThreeDimensionalCoordinate> getThreeCoordinates() {
        return threeCoordinates;
    }
}
