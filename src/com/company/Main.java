package com.company;

public class Main  {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setLife(100);
        boss.setAtaka(30);
        boss.setZashita("защита от магий");

        System.out.println("Атака "+ boss.getAtaka()+ " жизнь " + boss.getLife()+ "\n"+ boss.getZashita());
    }


}
