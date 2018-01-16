package com.ctg.itrdc.mf.bool.abstractfactory;

/**
 * @author wangzq
 * @date 2017/12/14 12:01
 */
public class SportCarFactory extends AbstractFactory {
    @Override
    public BenzCar createBenzCar() {
        return new BenzSportCar();
    }
    public class test(){
    }
    public void tetee22222(){}
    public void tetee(){}
    public void tetee111(){}
    @Override
    public BmwCar createBmwCar() {
        return new BmwBusiCar();
    }
}
