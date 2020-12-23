package com.designpattern.FactoryDesignPattern.FactoryMethod;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.JsonRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.YamlRuleConfigParser;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:55
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createConfigParser() {
        return new YamlRuleConfigParser();
    }
}
