package com.company;

public class chek {
    public static void main(String [] args){


        Audi audi = new Audi();
        audi.start();

    }

    static class  s implements Phone{

        @Override
        public void isone() {

        }
    }

    static class  Audi extends Car{


        @Override
        void start() {
          System.out.println("Start");
        }
    }

  abstract  static class Car{

        void start(){

        }
    }

    interface  Phone{
        void isone();
    }
}

