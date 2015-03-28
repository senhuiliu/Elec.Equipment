/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class ElecDemo {
public static void main(String[] args)
{

// initializing the all class's and call toString() to print the message


        Computers comp1 = new Computers(2.25,28000.00,10.00,"Lenovo");
        Computers comp2 = new Computers(1.5,35000.00,35.00,"Sony");

        CellPhones cell1 = new CellPhones(0.25,5000.00,10.00,"NOKIA");
        CellPhones cell2 = new CellPhones(0.5,16000.00,10.00,"Sony Xperia");

        Pagers pager1 = new Pagers(2,3000.00,15.00,"XXXXX");

        DigitalCameras cam1 = new DigitalCameras(1.5,8000.00,10.00,"Nickon");
        DigitalCameras cam2 = new DigitalCameras(1.5,3000.00,5,"Huda");

        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
        System.out.println(cell1.toString());
        System.out.println(cell2.toString());
        System.out.println(pager1.toString());
        System.out.println(cam1.toString());
        System.out.println(cam2.toString());
        }

        }
