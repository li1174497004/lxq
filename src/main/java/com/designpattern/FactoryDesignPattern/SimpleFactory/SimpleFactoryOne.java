package com.designpattern.FactoryDesignPattern.SimpleFactory;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.JsonRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.PropertiesRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.XmlRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.YamlRuleConfigParser;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:24
 */
public class SimpleFactoryOne {

        public static IRuleConfigParser createParser(String configFormat) {
            IRuleConfigParser parser = null;
            if ("json".equalsIgnoreCase(configFormat)) {
                parser = new JsonRuleConfigParser();
            } else if ("xml".equalsIgnoreCase(configFormat)) {
                parser = new XmlRuleConfigParser();
            } else if ("yaml".equalsIgnoreCase(configFormat)) {
                parser = new YamlRuleConfigParser();
            } else if ("properties".equalsIgnoreCase(configFormat)) {
                parser = new PropertiesRuleConfigParser();
            }
            return parser;

    }

}
