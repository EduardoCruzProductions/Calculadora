package pricipal;

import util.StringCalcMaker;

public class Test {

    public static void main(String[] args) {

        try {

            StringCalcMaker scm = new StringCalcMaker();
            System.out.println(scm.singleOperation("20.3-12-41"));

        } catch (Exception e) {

            e.printStackTrace();
            System.err.println(e.getMessage());

        }

    }

}
