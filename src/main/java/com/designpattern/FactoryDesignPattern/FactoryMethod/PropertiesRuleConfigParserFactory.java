package com.designpattern.FactoryDesignPattern.FactoryMethod;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.JsonRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.PropertiesRuleConfigParser;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:55
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createConfigParser() {
        return new PropertiesRuleConfigParser();
    }
}
