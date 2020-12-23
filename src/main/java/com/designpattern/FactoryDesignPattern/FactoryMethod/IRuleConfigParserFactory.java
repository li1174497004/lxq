package com.designpattern.FactoryDesignPattern.FactoryMethod;

import com.designpattern.FactoryDesignPattern.SimpleFactory.ConfigParser.IRuleConfigParser;

/**
 * @Author: lxq
 * @Date: 2020/12/23 14:53
 */
public interface IRuleConfigParserFactory {
      IRuleConfigParser createConfigParser();
}
