package com.drewsovsky;

import VMOperation.*;

public class Main {

    public static void main(String[] args) {

        Vector myVector = new Vector(3, 2, -4);
        Vector myVector1 = new Vector (2,-4);
        Vector myVector2 = new Vector(3,4, 3);


        System.out.println(VMOperation.sumOfVectors(2,4,3,5, 3.2, 1).toString());
        System.out.println(VMOperation.sumOfVectors(myVector, myVector2).toString());
        System.out.println(VMOperation.sumOfVectors(myVector1, myVector1).toString());


        System.out.println(VMOperation.vectorModule(myVector1));
        System.out.println(VMOperation.vectorModule(myVector));


    }
}
