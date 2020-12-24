package com.designpattern.BuilderDesignPattern;



/**
 * @Author: lxq
 * @Date: 2020/12/24 9:56
 *
 */
public class ResourcePoolConfig {

    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;


    private ResourcePoolConfig(Builder builder) {

    }

    public static class Builder {

        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;
        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig builder() {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("...");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }
            return new ResourcePoolConfig(this);

        }


        public Builder setName(String name) throws IllegalAccessException {
            if (name.isEmpty()){
                throw new IllegalAccessException("...");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) throws IllegalAccessException {
            if (maxTotal<0){
                throw new IllegalAccessException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) throws IllegalAccessException{
            if (maxIdle<0||maxIdle>maxTotal){
                throw new IllegalAccessException("...");
            }
            this.maxIdle = maxIdle;
            return  this;
        }

        public Builder setMinIdle(int minIdle) throws IllegalAccessException{
            if (minIdle>maxTotal||minIdle<0||minIdle>maxTotal){
                throw new IllegalAccessException("....");
            }
            this.minIdle = minIdle;
            return this;
        }
    }

}
