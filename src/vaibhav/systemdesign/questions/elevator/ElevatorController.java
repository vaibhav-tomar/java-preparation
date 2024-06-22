package vaibhav.systemdesign.questions.elevator;

import java.util.PriorityQueue;

public class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (direction == Direction.DOWN) {
            downMaxPQ.add(floor);
        } else {
            upMinPQ.add(floor);
        }
    }

    public void submitInternalRequest() {

    }

    public void controlElevator() {
        while (true) {
            if (elevatorCar.elevatorDirection == Direction.UP) {

            }
        }
    }
}
