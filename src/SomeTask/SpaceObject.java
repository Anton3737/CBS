package SomeTask;

public abstract class SpaceObject {


}

abstract class Planet extends SpaceObject {


}


class Mars extends Planet {


}

class Moon extends SpaceObject {

}

class PlanetTester {

    public String test(SpaceObject object) {

        if (object.equals(Mars.class)){
            return "planet";
        }
        if (object.equals(Moon.class)){
            return "Not planet";
        }
        return "err";
    }

    public static void main(String[] args) {

        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"

    }

}