package com.mundane.build.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House house = houseDirector.contructHouse();

        System.out.println("---------------------------------------------");

        HighBuildingBuilder highBuildingBuilder = new HighBuildingBuilder();
        houseDirector.setHouseBuilder(highBuildingBuilder);
        house = houseDirector.contructHouse();
    }
}
