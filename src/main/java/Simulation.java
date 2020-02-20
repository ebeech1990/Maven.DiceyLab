import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Simulation {

    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());
public Integer numOfDie;
public Integer numOfRolls;
public Integer high;
public Integer low;
public Bins bin;

    public Simulation(Integer numOfDie, Integer numOfRolls){
        this.numOfDie = numOfDie;
        this.numOfRolls = numOfRolls;
        this.low = numOfDie;
        this.high = numOfDie*6;
        this.bin = new Bins(low, high);
    }

    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 5);

       sim.runSimulation();

        //sim.printResults();
    }

    public void runSimulation() {
        Dice d = new Dice(numOfDie);
        int i = 0;
        while(i<numOfRolls){
            bin.incrementBin(d.tossAndSum());
            i++;
        }


    }

//    private void printResults() {
//    }

}
