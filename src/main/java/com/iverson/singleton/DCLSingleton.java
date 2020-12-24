    package com.iverson.singleton;

    public class DCLSingleton {

        private static volatile DCLSingleton singleton = null;

        public DCLSingleton() {
        }

        public static DCLSingleton getInstance() {
            //第一次校验singleton是否为空
            if (singleton == null) {
                //第二次校验singleton是否为空
                synchronized (DCLSingleton.class) {
                    if (singleton == null) {
                        singleton = new DCLSingleton();
                    }
                }
            }
            return singleton;
        }

        public static void main(String[] args) {
            for (int i = 0;i <100;i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + "" +DCLSingleton.getInstance().hashCode());
                    }
                }).start();
            }
        }
    }
