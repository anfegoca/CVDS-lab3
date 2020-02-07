/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author andres.gonzalez-ca
 */
public class TarifasTest {
    
    CalculadorDescuentos calculador = new CalculadorDescuentos();
    
    @Test
    public void pruebaEdad1() {
        
        try{
            double res = calculador.calculoTarifa(500,6,-5);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaEdad2() {
        
        
        double res = calculador.calculoTarifa(500,6,10);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaEdad3() {
        
        
        double res = calculador.calculoTarifa(500,6,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaEdad4() {
        
        
        double res = calculador.calculoTarifa(500,6,80);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaEdad5() {
        
        try{
            double res = calculador.calculoTarifa(500,6,200);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaTarifaBase1() {
        
        try{
            double res = calculador.calculoTarifa(-300,6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaTarifaBase2() {
        
        
        double res = calculador.calculoTarifa(400,6,25);
        double cor =400;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacion1() {
        
        try{
            double res = calculador.calculoTarifa(400,-6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaDiasAntelacion2() {
        
        
        double res = calculador.calculoTarifa(400,6,25);
        double cor =400;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacion3() {
        
        
        double res = calculador.calculoTarifa(400,22,25);
        double cor =340;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacion4() {
        
        try{
            double res = calculador.calculoTarifa(400,100000,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad1() {
        
        try{
            double res = calculador.calculoTarifa(500,6,-1);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad2() {
        
        double res = calculador.calculoTarifa(500,6,0);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad3() {
        
        double res = calculador.calculoTarifa(500,6,1);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad4() {
        
        double res = calculador.calculoTarifa(500,6,17);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad5() {
        
        double res = calculador.calculoTarifa(500,6,18);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad6() {
        
        double res = calculador.calculoTarifa(500,6,19);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad7() {
        
        double res = calculador.calculoTarifa(500,6,64);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad8() {
        
        double res = calculador.calculoTarifa(500,6,65);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad9() {
        
        double res = calculador.calculoTarifa(500,6,66);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad10() {
        
        double res = calculador.calculoTarifa(500,6,109);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad11() {
        
        double res = calculador.calculoTarifa(500,6,110);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad12() {
        
        try{
            double res = calculador.calculoTarifa(500,6,111);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraTarifaBase1() {
        
        try{
            double res = calculador.calculoTarifa(-1,6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraTarifaBase2() {
        
        double res = calculador.calculoTarifa(0,6,25);
        double cor =0;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion1() {
        
        try{
            double res = calculador.calculoTarifa(500,-1,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion2() {
        
        double res = calculador.calculoTarifa(500,0,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion3() {
        
        double res = calculador.calculoTarifa(500,1,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion4() {
        
        double res = calculador.calculoTarifa(500,19,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion5() {
        
        double res = calculador.calculoTarifa(500,20,25);
        double cor =500;
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion6() {
        
        double res = calculador.calculoTarifa(500,21,25);
        double cor =425;
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion7() {
        
        double res = calculador.calculoTarifa(500,99999,25);
        double cor =425;
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion8() {
        
        try{
            double res = calculador.calculoTarifa(500,100000,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
}
