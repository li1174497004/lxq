package com.designpattern.FactoryDesignPattern.FactoryMethod;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.JsonRuleConfigParser;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:55
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createConfigParser() {
        return new JsonRuleConfigParser();
    }
}
