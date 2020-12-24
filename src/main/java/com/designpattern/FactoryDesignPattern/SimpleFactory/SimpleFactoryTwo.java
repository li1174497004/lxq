package com.designpattern.FactoryDesignPattern.SimpleFactory;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.JsonRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.PropertiesRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.XmlRuleConfigParser;
import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:24
 */
public class SimpleFactoryTwo {

    public static final Map<String, IRuleConfigParser> parserMap = new HashMap();


    static {
        parserMap.put("json", new JsonRuleConfigParser());
        parserMap.put("xml", new XmlRuleConfigParser());
        parserMap.put("yaml", new YamlRuleConfigParser());
        parserMap.put("properties", new PropertiesRuleConfigParser());

    }

    public static IRuleConfigParser createParser(String configFormat) {

        if (configFormat == null || configFormat.isEmpty()) {
            return null;
        }
        return parserMap.get(configFormat);

    }

}
