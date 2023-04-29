enum Planets {
    Sun(1,0 , 0, 705323,null,"Mercury"),
    Mercury(2,1, calculate(1,Planets.Sun), 2430,Planets.Sun,"Venus"),
    Venus(3,2,calculate(2,Planets.Mercury), 4612,Planets.Mercury,"Earth"),
    Earth(4,3, calculate(3,Planets.Venus),6378,Planets.Venus,"Earth"),
    Mars(5,4,calculate(4,Planets.Earth),9773,Planets.Earth,"Mars"),
    Jupiter(6,5,calculate(5,Planets.Mars),33169,Planets.Mars,"Jupiter"),
    Saturn(7,6,calculate(6,Planets.Jupiter),58410,Planets.Jupiter,"Saturn"),
    Uranus(8,7,calculate(7,Planets.Saturn),122330,Planets.Saturn,"Uranus"),
    Neptune(9,8,calculate(8,Planets.Uranus),191340,Planets.Uranus,"none");

    private  final int number;
    private  final int distance;
    private  final int distanceFromSun;
    private  final int radius;
    private  final Planets previousPlanet;
    private  final String nextPlanet;

    Planets(int number, int distance, int distanceFromSun, int radius, Planets previousPlanet, String nextPlanet) {
        this.number = number;
        this.distance = distance;
        this.distanceFromSun = calculate(distance, previousPlanet);
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    private static int calculate(int distance, Planets previousPlanet){
        if(previousPlanet == null){
            return distance;
        }else {
            return previousPlanet.getDistanceFromSun() + distance;
        }
    }

    public int getNumber() {
        return number;
    }

    public int getDistance() {
        return distance;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }


}
