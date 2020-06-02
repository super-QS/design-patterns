package com.design.abstractfactory.factpry;

import com.design.abstractfactory.make.Pizza;

public interface AbsFactory {

    Pizza createPizza(String orderType);
}
