/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Computers extends Electronics
{

    double weight,cost,powerusage;
    String manufacturer;
  
Computers(double weight,double cost,double powerusage,String name)
{
    this.weight = weight;
    this.cost = cost;
    this.powerusage = powerusage;
    this.manufacturer = name;
}
  
public String toString()
{
return "Computer Weight : "+weight+"kg"+ " Cost : "+cost+"rs"+" Power Usage : "+powerusage+"MA"+" Manufacturer : "+manufacturer;
}
}